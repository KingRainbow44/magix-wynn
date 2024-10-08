package moe.seikimo.wynn.utils;

import com.wynntils.utils.mc.type.Location;
import moe.seikimo.wynn.SyncProto;
import net.minecraft.util.math.Vec3d;

public final class CastingExtensions {
    private CastingExtensions() {
        // No-op.
    }

    /**
     * Converts a Vec3d to a Location.
     *
     * @param position The position to convert.
     * @return The converted location.
     */
    public static Location asLoc(Vec3d position) {
        return Location.containing(
                position.x, position.y, position.z);
    }

    /**
     * Converts a serialized location to a Location.
     * @param position The position to convert.
     * @return The converted location.
     */
    public static Location asLoc(SyncProto.Location position) {
        return Location.containing(
                position.getX(), position.getY(), position.getZ());
    }
}
