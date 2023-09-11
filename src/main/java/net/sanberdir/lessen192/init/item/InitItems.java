package net.sanberdir.lessen192.init.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.lessen192.Lessen192;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lessen192.MOD_ID);

    public static final RegistryObject<Item> BOX = ITEMS.register("box",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS_LESSEN)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
