package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import io.getstream.chat.android.models.ChannelConfig;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.Config;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, m65681d2 = {"toEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;", "Lio/getstream/chat/android/models/ChannelConfig;", "toModel", "Lio/getstream/chat/android/models/Command;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;", "channelType", "", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelConfigMapperKt {
    public static final ChannelConfigEntity toEntity(ChannelConfig channelConfig) {
        AbstractC22676k.m65750j(channelConfig, "<this>");
        Config config = channelConfig.getConfig();
        ChannelConfigInnerEntity channelConfigInnerEntity = new ChannelConfigInnerEntity(channelConfig.getType(), config.getCreatedAt(), config.getUpdatedAt(), config.getName(), config.getTypingEventsEnabled(), config.getReadEventsEnabled(), config.getDeliveryEventsEnabled(), config.getConnectEventsEnabled(), config.getSearchEnabled(), config.isReactionsEnabled(), config.isThreadEnabled(), config.getMuteEnabled(), config.getUploadsEnabled(), config.getUrlEnrichmentEnabled(), config.getCustomEventsEnabled(), config.getPushNotificationsEnabled(), config.getMessageRetention(), config.getMaxMessageLength(), config.getAutomod(), config.getAutomodBehavior(), config.getBlocklistBehavior(), config.getMessageRemindersEnabled(), config.getMarkMessagesPending());
        List<Command> commands = channelConfig.getConfig().getCommands();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(commands, 10));
        Iterator<T> it = commands.iterator();
        while (it.hasNext()) {
            arrayList.add(toEntity((Command) it.next(), channelConfig.getType()));
        }
        return new ChannelConfigEntity(channelConfigInnerEntity, arrayList);
    }

    public static final ChannelConfig toModel(ChannelConfigEntity channelConfigEntity) {
        AbstractC22676k.m65750j(channelConfigEntity, "<this>");
        String channelType = channelConfigEntity.getChannelConfigInnerEntity().getChannelType();
        ChannelConfigInnerEntity channelConfigInnerEntity = channelConfigEntity.getChannelConfigInnerEntity();
        Date createdAt = channelConfigInnerEntity.getCreatedAt();
        Date updatedAt = channelConfigInnerEntity.getUpdatedAt();
        String name = channelConfigInnerEntity.getName();
        boolean zIsTypingEvents = channelConfigInnerEntity.isTypingEvents();
        boolean zIsReadEvents = channelConfigInnerEntity.isReadEvents();
        boolean deliveryEventsEnabled = channelConfigInnerEntity.getDeliveryEventsEnabled();
        boolean zIsConnectEvents = channelConfigInnerEntity.isConnectEvents();
        boolean zIsSearch = channelConfigInnerEntity.isSearch();
        boolean zIsReactionsEnabled = channelConfigInnerEntity.isReactionsEnabled();
        boolean zIsThreadEnabled = channelConfigInnerEntity.isThreadEnabled();
        boolean zIsMutes = channelConfigInnerEntity.isMutes();
        boolean uploadsEnabled = channelConfigInnerEntity.getUploadsEnabled();
        boolean urlEnrichmentEnabled = channelConfigInnerEntity.getUrlEnrichmentEnabled();
        boolean customEventsEnabled = channelConfigInnerEntity.getCustomEventsEnabled();
        boolean pushNotificationsEnabled = channelConfigInnerEntity.getPushNotificationsEnabled();
        String messageRetention = channelConfigInnerEntity.getMessageRetention();
        int maxMessageLength = channelConfigInnerEntity.getMaxMessageLength();
        String automod = channelConfigInnerEntity.getAutomod();
        String automodBehavior = channelConfigInnerEntity.getAutomodBehavior();
        String blocklistBehavior = channelConfigInnerEntity.getBlocklistBehavior();
        List<CommandInnerEntity> commands = channelConfigEntity.getCommands();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(commands, 10));
        Iterator<T> it = commands.iterator();
        while (it.hasNext()) {
            arrayList.add(toModel((CommandInnerEntity) it.next()));
        }
        return new ChannelConfig(channelType, new Config(createdAt, updatedAt, name, zIsTypingEvents, zIsReadEvents, deliveryEventsEnabled, zIsConnectEvents, zIsSearch, zIsReactionsEnabled, zIsThreadEnabled, zIsMutes, uploadsEnabled, urlEnrichmentEnabled, customEventsEnabled, pushNotificationsEnabled, false, false, messageRetention, maxMessageLength, automod, automodBehavior, blocklistBehavior, arrayList, channelConfigInnerEntity.getMessageRemindersEnabled(), false, channelConfigInnerEntity.getMarkMessagesPending(), 16875520, null));
    }

    private static final Command toModel(CommandInnerEntity commandInnerEntity) {
        return new Command(commandInnerEntity.getName(), commandInnerEntity.getDescription(), commandInnerEntity.getArgs(), commandInnerEntity.getSet());
    }

    private static final CommandInnerEntity toEntity(Command command, String str) {
        return new CommandInnerEntity(command.getName(), command.getDescription(), command.getArgs(), command.getSet(), str);
    }
}
