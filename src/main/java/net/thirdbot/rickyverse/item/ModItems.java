package net.thirdbot.rickyverse.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thirdbot.rickyverse.RickyverseMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, RickyverseMod.MODID);

    public static final RegistryObject<Item> RICK_PORTALGUN_MAIN_NEW = ITEMS.register("rick_portal_gun",
            ()-> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
