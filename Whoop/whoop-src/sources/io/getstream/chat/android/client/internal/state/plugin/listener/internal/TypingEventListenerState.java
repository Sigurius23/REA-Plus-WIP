package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.plugin.listeners.TypingEventListener;
import io.getstream.chat.android.models.EventType;
import java.util.Date;
import java.util.Map;
import l83.C23454a0;
import live.hms.video.utils.HMSConstantsKt;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;", "channelLogic", "Ln23/h;", "Ll83/a0;", "onTypingStopPrecondition", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;)Ln23/h;", "Ljava/util/Date;", "eventTime", "onTypingStartPrecondition", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;Ljava/util/Date;)Ln23/h;", "", "eventType", "channelType", "channelId", "", "", "extraData", "onTypingEventPrecondition", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;", "onTypingEventRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "result", "onTypingEventResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TypingEventListenerState implements TypingEventListener {
    private static final String ARG_TYPING_PARENT_ID = "parent_id";
    private static final Companion Companion = new Companion();
    private static final int MILLI_SEC = 1000;
    private static final int TYPING_DELAY = 3000;
    private static final int TYPING_DELAY_SECS = 3;
    private final LogicRegistry logic;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState$Companion;", "", "<init>", "()V", "ARG_TYPING_PARENT_ID", "", "MILLI_SEC", "", "TYPING_DELAY_SECS", "TYPING_DELAY", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TypingEventListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    private final AbstractC26205h onTypingStartPrecondition(ChannelLogic channelLogic, Date eventTime) {
        if (!channelLogic.typingEventsEnabled()) {
            return new C26203f(new C26198a("Typing events are not enabled"));
        }
        if (channelLogic.getLastStartTypingEvent() != null) {
            long time = eventTime.getTime();
            Date lastStartTypingEvent = channelLogic.getLastStartTypingEvent();
            AbstractC22676k.m65747g(lastStartTypingEvent);
            if (time - lastStartTypingEvent.getTime() < HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS) {
                return new C26203f(new C26198a("Last typing event was sent at " + channelLogic.getLastStartTypingEvent() + ". There must be a delay of 3 seconds before sending new event"));
            }
        }
        return new C26204g(C23454a0.f92919a);
    }

    private final AbstractC26205h onTypingStopPrecondition(ChannelLogic channelLogic) {
        if (channelLogic.typingEventsEnabled()) {
            return channelLogic.getLastStartTypingEvent() == null ? new C26203f(new C26198a("lastStartTypingEvent is null. Make sure to send Event.TYPING_START before sending Event.TYPING_STOP")) : new C26204g(C23454a0.f92919a);
        }
        return new C26203f(new C26198a("Typing events are not enabled"));
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.TypingEventListener
    public final AbstractC26205h onTypingEventPrecondition(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
        ChannelLogic channelLogicChannel = this.logic.channel(channelType, channelId);
        if (eventType.equals(EventType.TYPING_START)) {
            return onTypingStartPrecondition(channelLogicChannel, eventTime);
        }
        return eventType.equals(EventType.TYPING_STOP) ? onTypingStopPrecondition(channelLogicChannel) : new C26204g(C23454a0.f92919a);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.TypingEventListener
    public final void onTypingEventRequest(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
        ChannelLogic channelLogicChannel = this.logic.channel(channelType, channelId);
        if (eventType.equals(EventType.TYPING_START)) {
            channelLogicChannel.setLastStartTypingEvent(eventTime);
        } else if (eventType.equals(EventType.TYPING_STOP)) {
            channelLogicChannel.setLastStartTypingEvent(null);
        }
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.TypingEventListener
    public final void onTypingEventResult(AbstractC26205h result, String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
        if (result instanceof C26204g) {
            ChannelLogic channelLogicChannel = this.logic.channel(channelType, channelId);
            if (eventType.equals(EventType.TYPING_START)) {
                Object obj = extraData.get(ARG_TYPING_PARENT_ID);
                channelLogicChannel.setKeystrokeParentMessageId(obj instanceof String ? (String) obj : null);
            } else if (eventType.equals(EventType.TYPING_STOP)) {
                channelLogicChannel.setKeystrokeParentMessageId(null);
            }
        }
    }
}
