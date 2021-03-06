package com.mystic.anywhichway;

import com.mystic.anywhichway.util.reference;
import com.mystic.anywhichway.proxy.CommonProxy;
import com.mystic.anywhichway.util.handler.RegistryHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.logging.Logger;

@Mod(modid = reference.MODID, name = reference.NAME, version = reference.VERSION)
public class Main {

    @Mod.Instance(reference.MODID)
    public static Main INSTANCE;

    public static Logger logger;

    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.preInitRegistries(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries(event);
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries(event);
    }
}