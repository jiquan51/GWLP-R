/**
 * For copyright information see the LICENSE document.
 */

package gwlpr.loginshard;

import gwlpr.loginshard.controllers.*;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import java.util.Map;
import realityshard.container.gameapp.GameAppContext;
import realityshard.container.gameapp.GameAppFactory;
import realityshard.container.gameapp.GameAppManager;


/**
 * Produces login shards.
 * 
 * @author _rusty
 */
public class LoginShardFactory implements GameAppFactory
{

    @Override
    public String getName() 
    {
        return "LoginShard";
    }

    
    @Override
    public boolean isStartup() 
    {
        return true;
    }

    
    @Override
    public Channel getServerChannel(ServerBootstrap bootstrap) throws InterruptedException 
    {
        // set the attributes for new channels
        bootstrap.attr(ChannelAttachment.KEY, new ChannelAttachment());
        
        // create the pipeline-factory
        bootstrap.handler(new LoginShardChannelInitializer());
        
        // finally, bind and sync
        return bootstrap.bind(8112).sync().channel();
    }

    
    @Override
    public GameAppContext.Remote produceGameApp(GameAppManager manager, GameAppContext.Remote parent, Map<String, String> additionalParams) 
    {
        // create the actual context
        GameAppContext.Default context = new GameAppContext.Default(getName(), manager, parent);
        
        // TODO: create db stuff
        
        // register the controllers
        context.getEventAggregator()
                .register(new StartUp())
                .register(new Login())
                .register(new MapShardManagement())
                .register(new StaticReply()); 
        
        return context;
    }
}
