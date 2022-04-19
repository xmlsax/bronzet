
package io.gtihub.xmlsax.mcmods.forge.bronzet.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModFluids;

public class MeltedinvarBlock extends LiquidBlock {
	public MeltedinvarBlock() {
		super(() -> (FlowingFluid) BronzetModFluids.MELTEDINVAR.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
