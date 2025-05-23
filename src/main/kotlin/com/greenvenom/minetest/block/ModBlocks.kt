package com.greenvenom.minetest.block

import com.greenvenom.minetest.MineTest
import net.minecraft.world.level.block.state.BlockBehaviour
import net.neoforged.neoforge.registries.DeferredRegister

// THIS LINE IS REQUIRED FOR USING PROPERTY DELEGATES
import thedarkcolour.kotlinforforge.neoforge.forge.getValue

object ModBlocks {
    val REGISTRY = DeferredRegister.createBlocks(MineTest.ID)

    // If you get an "overload resolution ambiguity" error, include the arrow at the start of the closure.
    val EXAMPLE_BLOCK by REGISTRY.registerSimpleBlock(
        "example_block",
        BlockBehaviour.Properties.of().lightLevel { 15 }.strength(3.0f)
    )
}
