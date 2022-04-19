
package io.gtihub.xmlsax.mcmods.forge.bronzet.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModItems;
import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModFluids;
import io.gtihub.xmlsax.mcmods.forge.bronzet.init.BronzetModBlocks;

public abstract class MeltedbronzeFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BronzetModFluids.MELTEDBRONZE,
			BronzetModFluids.FLOWING_MELTEDBRONZE,
			FluidAttributes.builder(new ResourceLocation("bronzet:blocks/meltedbronze"), new ResourceLocation("bronzet:blocks/meltedbronze"))

	).explosionResistance(90f)

			.tickRate(30).levelDecreasePerBlock(2)

			.bucket(BronzetModItems.MELTEDBRONZE_BUCKET).block(() -> (LiquidBlock) BronzetModBlocks.MELTEDBRONZE.get());

	private MeltedbronzeFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MeltedbronzeFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MeltedbronzeFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
