package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;", "", "channelConfigInnerEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;", "commands", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;)V", "getChannelConfigInnerEntity", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;", "getCommands", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelConfigEntity {
    private final ChannelConfigInnerEntity channelConfigInnerEntity;
    private final List<CommandInnerEntity> commands;

    public ChannelConfigEntity(ChannelConfigInnerEntity channelConfigInnerEntity, List<CommandInnerEntity> commands) {
        AbstractC22676k.m65750j(channelConfigInnerEntity, "channelConfigInnerEntity");
        AbstractC22676k.m65750j(commands, "commands");
        this.channelConfigInnerEntity = channelConfigInnerEntity;
        this.commands = commands;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelConfigEntity copy$default(ChannelConfigEntity channelConfigEntity, ChannelConfigInnerEntity channelConfigInnerEntity, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            channelConfigInnerEntity = channelConfigEntity.channelConfigInnerEntity;
        }
        if ((i13 & 2) != 0) {
            list = channelConfigEntity.commands;
        }
        return channelConfigEntity.copy(channelConfigInnerEntity, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChannelConfigInnerEntity getChannelConfigInnerEntity() {
        return this.channelConfigInnerEntity;
    }

    public final List<CommandInnerEntity> component2() {
        return this.commands;
    }

    public final ChannelConfigEntity copy(ChannelConfigInnerEntity channelConfigInnerEntity, List<CommandInnerEntity> commands) {
        AbstractC22676k.m65750j(channelConfigInnerEntity, "channelConfigInnerEntity");
        AbstractC22676k.m65750j(commands, "commands");
        return new ChannelConfigEntity(channelConfigInnerEntity, commands);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelConfigEntity)) {
            return false;
        }
        ChannelConfigEntity channelConfigEntity = (ChannelConfigEntity) other;
        return AbstractC22676k.m65745e(this.channelConfigInnerEntity, channelConfigEntity.channelConfigInnerEntity) && AbstractC22676k.m65745e(this.commands, channelConfigEntity.commands);
    }

    public final ChannelConfigInnerEntity getChannelConfigInnerEntity() {
        return this.channelConfigInnerEntity;
    }

    public final List<CommandInnerEntity> getCommands() {
        return this.commands;
    }

    public final int hashCode() {
        return this.commands.hashCode() + (this.channelConfigInnerEntity.hashCode() * 31);
    }

    public final String toString() {
        return "ChannelConfigEntity(channelConfigInnerEntity=" + this.channelConfigInnerEntity + ", commands=" + this.commands + ")";
    }
}
