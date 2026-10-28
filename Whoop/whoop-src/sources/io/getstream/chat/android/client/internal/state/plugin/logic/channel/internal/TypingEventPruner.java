package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.events.TypingStartEvent;
import io.getstream.chat.android.models.TypingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012$\u0010\r\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR2\u0010\r\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;", "", "", "channelId", "Lbc3/c0;", "coroutineScope", "", "delayTimeMs", "Lkotlin/Function2;", "", "Lio/getstream/chat/android/client/events/TypingStartEvent;", "Lio/getstream/chat/android/models/TypingEvent;", "Ll83/a0;", "onUpdated", "<init>", "(Ljava/lang/String;Lbc3/c0;JLc93/m;)V", "userId", "typingStartEvent", "addTypingEvent", "(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V", "removeTypingEvent", "(Ljava/lang/String;)V", "getRawTyping", "()Ljava/util/Map;", "getTypingEvent", "()Lio/getstream/chat/android/models/TypingEvent;", "clear", "()V", "processEvent", "Ljava/lang/String;", "Lbc3/c0;", "J", "Lc93/m;", "", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;", "typingEvents", "Ljava/util/Map;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TypingEventPruner {
    public static final long DEFAULT_DELAY_TIME_MS = 7000;
    private final String channelId;
    private final InterfaceC2994c0 coroutineScope;
    private final long delayTimeMs;
    private final InterfaceC4351m onUpdated;
    private final Map<String, TimedTypingStartEvent> typingEvents;

    public TypingEventPruner(String channelId, InterfaceC2994c0 coroutineScope, long j7, InterfaceC4351m onUpdated) {
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(onUpdated, "onUpdated");
        this.channelId = channelId;
        this.coroutineScope = coroutineScope;
        this.delayTimeMs = j7;
        this.onUpdated = onUpdated;
        this.typingEvents = new LinkedHashMap();
    }

    private final void addTypingEvent(String userId, TypingStartEvent typingStartEvent) {
        TimedTypingStartEvent timedTypingStartEvent = new TimedTypingStartEvent(this.coroutineScope, typingStartEvent, userId, DEFAULT_DELAY_TIME_MS, new C17095c(this, 19));
        TimedTypingStartEvent timedTypingStartEvent2 = this.typingEvents.get(userId);
        if (timedTypingStartEvent2 != null) {
            timedTypingStartEvent2.cancelJob();
        }
        this.typingEvents.put(userId, timedTypingStartEvent);
        this.onUpdated.invoke(getRawTyping(), getTypingEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 addTypingEvent$lambda$0(TypingEventPruner typingEventPruner, String it) {
        AbstractC22676k.m65750j(it, "it");
        typingEventPruner.removeTypingEvent(it);
        return C23454a0.f92919a;
    }

    private final void clear() {
        Iterator<Map.Entry<String, TimedTypingStartEvent>> it = this.typingEvents.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancelJob();
        }
        this.typingEvents.clear();
        this.onUpdated.invoke(getRawTyping(), getTypingEvent());
    }

    private final Map<String, TypingStartEvent> getRawTyping() {
        Map<String, TimedTypingStartEvent> map = this.typingEvents;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((TimedTypingStartEvent) entry.getValue()).getTypingStartEvent$stream_chat_android_client_release());
        }
        return linkedHashMap;
    }

    private final TypingEvent getTypingEvent() {
        Collection<TimedTypingStartEvent> collectionValues = this.typingEvents.values();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((TimedTypingStartEvent) it.next()).getTypingStartEvent$stream_chat_android_client_release());
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList, new TypingEventPruner$getTypingEvent$$inlined$sortedBy$1());
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
        Iterator it3 = listM74152u1.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((TypingStartEvent) it3.next()).getUser());
        }
        return new TypingEvent(this.channelId, arrayList2);
    }

    private final void removeTypingEvent(String userId) {
        TimedTypingStartEvent timedTypingStartEvent = this.typingEvents.get(userId);
        if (timedTypingStartEvent != null) {
            timedTypingStartEvent.cancelJob();
        }
        this.typingEvents.remove(userId);
        this.onUpdated.invoke(getRawTyping(), getTypingEvent());
    }

    public final void processEvent(String userId, TypingStartEvent typingStartEvent) {
        AbstractC22676k.m65750j(userId, "userId");
        if (typingStartEvent == null) {
            removeTypingEvent(userId);
        } else {
            addTypingEvent(userId, typingStartEvent);
        }
    }

    public /* synthetic */ TypingEventPruner(String str, InterfaceC2994c0 interfaceC2994c0, long j7, InterfaceC4351m interfaceC4351m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC2994c0, (i13 & 4) != 0 ? DEFAULT_DELAY_TIME_MS : j7, interfaceC4351m);
    }
}
