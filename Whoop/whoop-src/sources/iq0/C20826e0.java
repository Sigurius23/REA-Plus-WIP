package iq0;

import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.TypingStartEvent;
import io.getstream.chat.android.client.events.TypingStopEvent;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iq0.e0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Liq0/e0;", "", "<init>", "()V", "", "", "currentlyTyping", "Lio/getstream/chat/android/client/events/ChatEvent;", "chatEvent", "userId", "a", "(Ljava/util/Set;Lio/getstream/chat/android/client/events/ChatEvent;Ljava/lang/String;)Ljava/util/Set;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20826e0 {

    /* JADX INFO: renamed from: a */
    public static final C20826e0 f78205a = new C20826e0();

    private C20826e0() {
    }

    /* JADX INFO: renamed from: a */
    public final Set<String> m57444a(Set<String> currentlyTyping, ChatEvent chatEvent, String userId) {
        AbstractC22676k.m65750j(currentlyTyping, "currentlyTyping");
        AbstractC22676k.m65750j(chatEvent, "chatEvent");
        AbstractC22676k.m65750j(userId, "userId");
        if (chatEvent instanceof TypingStartEvent) {
            TypingStartEvent typingStartEvent = (TypingStartEvent) chatEvent;
            if (!AbstractC22676k.m65745e(typingStartEvent.getUser().getId(), userId)) {
                currentlyTyping.add(typingStartEvent.getUser().getName());
                return currentlyTyping;
            }
        } else if (chatEvent instanceof TypingStopEvent) {
            currentlyTyping.remove(((TypingStopEvent) chatEvent).getUser().getName());
        }
        return currentlyTyping;
    }
}
