
package net.icefighter.shortsmod.block;

import net.icefighter.shortsmod.procedures.BridgeBlockIsPlacedByProcedure;

import java.util.List;
import java.util.Collections;

public class BridgeBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public BridgeBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(14.5, 0.5, 1.5, 15.5, 15, 2.5), box(14.5, 0.5, 5.5, 15.5, 15, 6.5), box(14.5, 0.5, 9.5, 15.5, 15, 10.5), box(14.5, 0.5, 13.5, 15.5, 15, 14.5), box(1.5, 0.5, 1.5, 2.5, 15, 2.5), box(1.5, 0.5, 5.5, 2.5, 15, 6.5),
					box(1.5, 0.5, 9.5, 2.5, 15, 10.5), box(1.5, 0.5, 13.5, 2.5, 15, 14.5), box(14.5, 15, 0.5, 15.5, 16, 16.5), box(1.5, 15, 0.5, 2.5, 16, 16.5), box(0.5, 0, 0.5, 16.5, 0.5, 3.5), box(0.5, 0, 4.5, 16.5, 0.5, 7.5),
					box(0.5, 0, 8.5, 16.5, 0.5, 11.5), box(0.5, 0, 12.5, 16.5, 0.5, 15.5));
			case NORTH -> Shapes.or(box(0.5, 0.5, 13.5, 1.5, 15, 14.5), box(0.5, 0.5, 9.5, 1.5, 15, 10.5), box(0.5, 0.5, 5.5, 1.5, 15, 6.5), box(0.5, 0.5, 1.5, 1.5, 15, 2.5), box(13.5, 0.5, 13.5, 14.5, 15, 14.5), box(13.5, 0.5, 9.5, 14.5, 15, 10.5),
					box(13.5, 0.5, 5.5, 14.5, 15, 6.5), box(13.5, 0.5, 1.5, 14.5, 15, 2.5), box(0.5, 15, -0.5, 1.5, 16, 15.5), box(13.5, 15, -0.5, 14.5, 16, 15.5), box(-0.5, 0, 12.5, 15.5, 0.5, 15.5), box(-0.5, 0, 8.5, 15.5, 0.5, 11.5),
					box(-0.5, 0, 4.5, 15.5, 0.5, 7.5), box(-0.5, 0, 0.5, 15.5, 0.5, 3.5));
			case EAST -> Shapes.or(box(1.5, 0.5, 0.5, 2.5, 15, 1.5), box(5.5, 0.5, 0.5, 6.5, 15, 1.5), box(9.5, 0.5, 0.5, 10.5, 15, 1.5), box(13.5, 0.5, 0.5, 14.5, 15, 1.5), box(1.5, 0.5, 13.5, 2.5, 15, 14.5), box(5.5, 0.5, 13.5, 6.5, 15, 14.5),
					box(9.5, 0.5, 13.5, 10.5, 15, 14.5), box(13.5, 0.5, 13.5, 14.5, 15, 14.5), box(0.5, 15, 0.5, 16.5, 16, 1.5), box(0.5, 15, 13.5, 16.5, 16, 14.5), box(0.5, 0, -0.5, 3.5, 0.5, 15.5), box(4.5, 0, -0.5, 7.5, 0.5, 15.5),
					box(8.5, 0, -0.5, 11.5, 0.5, 15.5), box(12.5, 0, -0.5, 15.5, 0.5, 15.5));
			case WEST -> Shapes.or(box(13.5, 0.5, 14.5, 14.5, 15, 15.5), box(9.5, 0.5, 14.5, 10.5, 15, 15.5), box(5.5, 0.5, 14.5, 6.5, 15, 15.5), box(1.5, 0.5, 14.5, 2.5, 15, 15.5), box(13.5, 0.5, 1.5, 14.5, 15, 2.5),
					box(9.5, 0.5, 1.5, 10.5, 15, 2.5), box(5.5, 0.5, 1.5, 6.5, 15, 2.5), box(1.5, 0.5, 1.5, 2.5, 15, 2.5), box(-0.5, 15, 14.5, 15.5, 16, 15.5), box(-0.5, 15, 1.5, 15.5, 16, 2.5), box(12.5, 0, 0.5, 15.5, 0.5, 16.5),
					box(8.5, 0, 0.5, 11.5, 0.5, 16.5), box(4.5, 0, 0.5, 7.5, 0.5, 16.5), box(0.5, 0, 0.5, 3.5, 0.5, 16.5));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		BridgeBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
	}
}
