package net.glowstone.net.message.play.entity;

import com.flowpowered.networking.Message;
import lombok.Data;

import java.util.List;

@Data
public final class DestroyEntitiesMessage implements Message {

    public final List<Integer> ids;

}
