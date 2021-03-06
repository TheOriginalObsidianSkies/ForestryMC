/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.climate;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Nonnull;

import forestry.api.core.INbtReadable;
import forestry.api.core.INbtWritable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IClimateRegion extends INbtReadable, INbtWritable {
	
	@Nonnull
	World getWorld();
	
	/**
	 * Update the climate in a region.
	 */
	void updateClimate(int ticks);
	
	int getTicksPerUpdate();
	
	@Nonnull
	Map<BlockPos, IClimatePosition> getPositions();
	
	void addSource(IClimateSource source);
	
	void removeSource(IClimateSource source);
	
	Collection<IClimateSource> getSources();
	
	Collection<BlockPos> getOtherPositions();
	
	float getTemperature();
	
	float getHumidity();
	
}
