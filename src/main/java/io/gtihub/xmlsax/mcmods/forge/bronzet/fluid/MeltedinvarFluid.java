
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

public abstract class MeltedinvarFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BronzetModFluids.MELTEDINVAR,
			BronzetModFluids.FLOWING_MELTEDINVAR,
			FluidAttributes.builder(new ResourceLocation("bronzet:blocks/meltedinvar"), new ResourceLocation("bronzet:blocks/meltedinvar"))

	).explosionResistance(100f)

			.tickRate(30).levelDecreasePerBlock(2)

			.bucket(BronzetModItems.MELTEDINVAR_BUCKET).block(() -> (LiquidBlock) BronzetModBlocks.MELTEDINVAR.get());

	private MeltedinvarFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MeltedinvarFluid {
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

	public static class Flowing extends MeltedinvarFluid {
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
