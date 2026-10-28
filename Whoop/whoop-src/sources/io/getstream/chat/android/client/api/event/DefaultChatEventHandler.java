package io.getstream.chat.android.client.api.event;

import androidx.core.app.NotificationCompat;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.events.CidEvent;
import io.getstream.chat.android.client.events.HasChannel;
import io.getstream.chat.android.client.events.MemberAddedEvent;
import io.getstream.chat.android.client.events.MemberRemovedEvent;
import io.getstream.chat.android.client.events.MemberUpdatedEvent;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.events.NotificationAddedToChannelEvent;
import io.getstream.chat.android.client.events.NotificationMessageNewEvent;
import io.getstream.chat.android.client.events.NotificationRemovedFromChannelEvent;
import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001,B+\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0004¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b#\u0010\u0015J\u0019\u0010$\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0004¢\u0006\u0004\b$\u0010%R.\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;", "Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;", "Lec3/f2;", "", "", "Lio/getstream/chat/android/models/Channel;", "channels", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lec3/f2;Lio/getstream/chat/android/client/setup/state/ClientState;)V", "Lio/getstream/chat/android/client/events/NewMessageEvent;", NotificationCompat.CATEGORY_EVENT, "cachedChannel", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "handleNewMessageEvent", "(Lio/getstream/chat/android/client/events/NewMessageEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "channel", "Lio/getstream/chat/android/models/Member;", "member", "addIfMembershipUpdated", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "cid", "removeIfCurrentUserLeftChannel", "(Ljava/lang/String;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "handleCidEvent", "(Lio/getstream/chat/android/client/events/CidEvent;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "Lio/getstream/chat/android/client/events/HasChannel;", "handleChannelEvent", "(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "removeIfChannelExists", "(Ljava/lang/String;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "addIfCurrentUserJoinedChannel", "addIfChannelIsAbsent", "(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "Lec3/f2;", "getChannels", "()Lec3/f2;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "getClientState", "()Lio/getstream/chat/android/client/setup/state/ClientState;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultChatEventHandler extends BaseChatEventHandler {
    private static final Companion Companion = new Companion();
    private static final String SYSTEM_MESSAGE = "system";
    private final InterfaceC13037f2 channels;
    private final ClientState clientState;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler$Companion;", "", "<init>", "()V", "SYSTEM_MESSAGE", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DefaultChatEventHandler(InterfaceC13037f2 channels, ClientState clientState) {
        AbstractC22676k.m65750j(channels, "channels");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.channels = channels;
        this.clientState = clientState;
    }

    private final EventHandlingResult addIfMembershipUpdated(Channel channel, Member member) {
        Member membership;
        return AbstractC22676k.m65745e((channel == null || (membership = channel.getMembership()) == null) ? null : membership.getUserId(), member.getUserId()) ? new EventHandlingResult.Add(ChannelKt.updateMember(ChannelKt.updateMembership(channel, member), member)) : EventHandlingResult.Skip.INSTANCE;
    }

    private final EventHandlingResult handleNewMessageEvent(NewMessageEvent event, Channel cachedChannel) {
        return AbstractC22676k.m65745e(event.getMessage().getType(), "system") ? EventHandlingResult.Skip.INSTANCE : addIfChannelIsAbsent(cachedChannel);
    }

    private final EventHandlingResult removeIfCurrentUserLeftChannel(String cid, Member member) {
        String userId = member.getUserId();
        User user = (User) ((C13045h2) this.clientState.getUser()).getValue();
        return !AbstractC22676k.m65745e(userId, user != null ? user.getId() : null) ? EventHandlingResult.Skip.INSTANCE : removeIfChannelExists(cid);
    }

    public final EventHandlingResult addIfChannelIsAbsent(Channel channel) {
        Map map = (Map) this.channels.getValue();
        if (map == null || channel == null) {
            return EventHandlingResult.Skip.INSTANCE;
        }
        return map.containsKey(channel.getCid()) ? EventHandlingResult.Skip.INSTANCE : new EventHandlingResult.Add(channel);
    }

    public final EventHandlingResult addIfCurrentUserJoinedChannel(Channel channel, Member member) {
        AbstractC22676k.m65750j(member, "member");
        User user = (User) ((C13045h2) this.clientState.getUser()).getValue();
        return AbstractC22676k.m65745e(user != null ? user.getId() : null, member.getUserId()) ? addIfChannelIsAbsent(channel) : EventHandlingResult.Skip.INSTANCE;
    }

    public final InterfaceC13037f2 getChannels() {
        return this.channels;
    }

    public final ClientState getClientState() {
        return this.clientState;
    }

    @Override // io.getstream.chat.android.client.api.event.BaseChatEventHandler
    public final EventHandlingResult handleChannelEvent(HasChannel event, FilterObject filter) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(filter, "filter");
        if (event instanceof NotificationMessageNewEvent) {
            return new EventHandlingResult.WatchAndAdd(((NotificationMessageNewEvent) event).getCid());
        }
        if (event instanceof NotificationAddedToChannelEvent) {
            return new EventHandlingResult.WatchAndAdd(((NotificationAddedToChannelEvent) event).getCid());
        }
        if (!(event instanceof NotificationRemovedFromChannelEvent)) {
            return super.handleChannelEvent(event, filter);
        }
        NotificationRemovedFromChannelEvent notificationRemovedFromChannelEvent = (NotificationRemovedFromChannelEvent) event;
        return removeIfCurrentUserLeftChannel(notificationRemovedFromChannelEvent.getCid(), notificationRemovedFromChannelEvent.getMember());
    }

    @Override // io.getstream.chat.android.client.api.event.BaseChatEventHandler
    public final EventHandlingResult handleCidEvent(CidEvent event, FilterObject filter, Channel cachedChannel) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(filter, "filter");
        if (event instanceof NewMessageEvent) {
            return handleNewMessageEvent((NewMessageEvent) event, cachedChannel);
        }
        if (event instanceof MemberRemovedEvent) {
            MemberRemovedEvent memberRemovedEvent = (MemberRemovedEvent) event;
            return removeIfCurrentUserLeftChannel(memberRemovedEvent.getCid(), memberRemovedEvent.getMember());
        }
        if (event instanceof MemberAddedEvent) {
            return addIfCurrentUserJoinedChannel(cachedChannel, ((MemberAddedEvent) event).getMember());
        }
        return event instanceof MemberUpdatedEvent ? addIfMembershipUpdated(cachedChannel, ((MemberUpdatedEvent) event).getMember()) : super.handleCidEvent(event, filter, cachedChannel);
    }

    public final EventHandlingResult removeIfChannelExists(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        Map map = (Map) this.channels.getValue();
        if (map != null && map.containsKey(cid)) {
            return new EventHandlingResult.Remove(cid);
        }
        return EventHandlingResult.Skip.INSTANCE;
    }
}
