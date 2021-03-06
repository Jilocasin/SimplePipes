package alexiil.mc.mod.pipes.blocks;

import net.minecraft.util.math.Direction;

import alexiil.mc.lib.attributes.fluid.GroupedFluidInvView;
import alexiil.mc.lib.attributes.fluid.filter.ConstantFluidFilter;
import alexiil.mc.lib.attributes.fluid.impl.EmptyGroupedFluidInv;

public class TileTriggerFluidEmpty extends TileTrigger {
    public TileTriggerFluidEmpty() {
        super(SimplePipeBlocks.TRIGGER_FLUID_INV_EMPTY_TILE);
    }

    @Override
    protected EnumTriggerState getTriggerState(Direction dir) {
        GroupedFluidInvView invStats = getNeighbourFluidStats(dir);
        if (invStats == EmptyGroupedFluidInv.INSTANCE) {
            return EnumTriggerState.NO_TARGET;
        }
        return EnumTriggerState.of(invStats.getStatistics(ConstantFluidFilter.ANYTHING).amount == 0);
    }
}
