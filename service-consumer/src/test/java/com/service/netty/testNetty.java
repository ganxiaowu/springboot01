package com.service.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author: admin_gan
 * @Date: 2019/6/4.
 * @version: 1.0
 */
public class testNetty {
    public static void main(String[] args) throws InterruptedException {
        //工作组 boss 接收连接并发送给 work处理请求
        EventLoopGroup workGroup = new NioEventLoopGroup();
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        try {
            //快捷启动类
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            //定义通道和子处理器
            serverBootstrap.group(bossGroup, workGroup).channel(NioServerSocketChannel.class).childHandler(new TestServerInitializer());
            ChannelFuture channelFuture = serverBootstrap.bind(8879).sync();
            channelFuture.channel().closeFuture().sync();
        }finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }





    }


}
