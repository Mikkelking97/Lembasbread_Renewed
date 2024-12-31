package net.creator.lembasbreadmod.item;

import net.creator.lembasbreadmod.lembasbreadmod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems 
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, lembasbreadmod.MOD_ID); 


    //public static final RegistryObject<Item> LEMBASBREAD = ITEMS.register("lembas", () -> new Item(new Item.Properties().food(null)));

    public static final RegistryObject<Item> LEMBASBREAD = ITEMS.register("lembas", 
    () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
        .nutrition(200)                  
        .saturationMod(50.5f)            
        .build())));

    public static void registrer(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
