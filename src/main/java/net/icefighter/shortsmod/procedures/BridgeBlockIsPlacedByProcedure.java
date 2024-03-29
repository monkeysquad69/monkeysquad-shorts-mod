package net.icefighter.shortsmod.procedures;

import net.icefighter.shortsmod.init.ShortsModModBlocks;

public class BridgeBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		double xoffset = 0;
		double zoffset = 0;
		double xp = 0;
		double zp = 0;
		xoffset = (entity.getDirection()).getStepX();
		zoffset = (entity.getDirection()).getStepZ();
		xp = x;
		zp = z;
		for (int index0 = 0; index0 < 30; index0++) {
			if ((world.getBlockState(BlockPos.containing(xp + xoffset, y, zp + zoffset))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(xp + xoffset, y, zp + zoffset), ShortsModModBlocks.BRIDGE.get().defaultBlockState(), 3);
				{
					Direction _dir = (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate));
					BlockPos _pos = BlockPos.containing(xp + xoffset, y, zp + zoffset);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
				xp = xp + xoffset;
				zp = zp + zoffset;
			} else {
				break;
			}
		}
	}
}
