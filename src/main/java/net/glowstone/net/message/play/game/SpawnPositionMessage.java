package net.glowstone.net.message.play.game;

import com.flowpowered.networking.Message;
import lombok.Data;

@Data
public final class SpawnPositionMessage implements Message {

    public final int x, y, z;

}
