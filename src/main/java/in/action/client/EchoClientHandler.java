package in.action.client;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

import java.nio.ByteBuffer;

/**
 * Created by spark on 17-8-7.
 *
 */
@ChannelHandler.Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuffer> {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks", CharsetUtil.UTF_8));

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

    public void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuffer in) throws Exception {
        System.out.println("Client received: " + in.toString());
    }
}
