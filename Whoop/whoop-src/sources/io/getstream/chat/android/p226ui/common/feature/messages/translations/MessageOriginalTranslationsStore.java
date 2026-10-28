package io.getstream.chat.android.p226ui.common.feature.messages.translations;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0003R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;", "", "<init>", "()V", "", "messageId", "", "shouldShowOriginalText", "(Ljava/lang/String;)Z", "Ll83/a0;", "showOriginalText", "(Ljava/lang/String;)V", "hideOriginalText", "toggleOriginalText", "clear", "Lec3/p1;", "", "_originalTextMessageIds", "Lec3/p1;", "Lec3/f2;", "originalTextMessageIds", "Lec3/f2;", "getOriginalTextMessageIds", "()Lec3/f2;", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageOriginalTranslationsStore {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Map<String, MessageOriginalTranslationsStore> stores = new LinkedHashMap();
    private final InterfaceC13075p1 _originalTextMessageIds;
    private final InterfaceC13037f2 originalTextMessageIds;

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore$Companion;", "", "<init>", "()V", "stores", "", "", "Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;", "forChannel", "channelId", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final MessageOriginalTranslationsStore forChannel(String channelId) {
            AbstractC22676k.m65750j(channelId, "channelId");
            Map map = MessageOriginalTranslationsStore.stores;
            Object messageOriginalTranslationsStore = map.get(channelId);
            if (messageOriginalTranslationsStore == null) {
                messageOriginalTranslationsStore = new MessageOriginalTranslationsStore(null);
                map.put(channelId, messageOriginalTranslationsStore);
            }
            return (MessageOriginalTranslationsStore) messageOriginalTranslationsStore;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ MessageOriginalTranslationsStore(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void clear() {
        C13045h2 c13045h2 = (C13045h2) this._originalTextMessageIds;
        c13045h2.getClass();
        c13045h2.m36571k(null, C25235a0.f99113w);
    }

    public final InterfaceC13037f2 getOriginalTextMessageIds() {
        return this.originalTextMessageIds;
    }

    public final void hideOriginalText(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        C13045h2 c13045h2 = (C13045h2) this._originalTextMessageIds;
        LinkedHashSet linkedHashSetM34604y = AbstractC12350b.m34604y(messageId, (Set) c13045h2.getValue());
        c13045h2.getClass();
        c13045h2.m36571k(null, linkedHashSetM34604y);
    }

    public final boolean shouldShowOriginalText(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return ((Set) ((C13045h2) this._originalTextMessageIds).getValue()).contains(messageId);
    }

    public final void showOriginalText(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        C13045h2 c13045h2 = (C13045h2) this._originalTextMessageIds;
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(messageId, (Set) c13045h2.getValue());
        c13045h2.getClass();
        c13045h2.m36571k(null, linkedHashSetM34555D);
    }

    public final void toggleOriginalText(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        if (shouldShowOriginalText(messageId)) {
            hideOriginalText(messageId);
        } else {
            showOriginalText(messageId);
        }
    }

    private MessageOriginalTranslationsStore() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25235a0.f99113w);
        this._originalTextMessageIds = c13045h2M36593c;
        this.originalTextMessageIds = c13045h2M36593c;
    }
}
