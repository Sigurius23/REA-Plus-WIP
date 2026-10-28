package io.getstream.chat.android.client.notifications;

import c93.InterfaceC4339a;
import io.getstream.android.push.delegate.PushDelegate;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.PayloadValidator;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.notifications.parser.StreamPayloadParser;
import io.getstream.chat.android.models.PushMessage;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import p098dt.AbstractC12350b;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y03.AbstractC39026a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ;\u0010\u0012\u001a\u00020\n2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0018j\b\u0012\u0004\u0012\u00020\u0005`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/ChatPushDelegate;", "Lio/getstream/android/push/delegate/PushDelegate;", "<init>", "()V", "", "", "", "Lkotlin/Function0;", "Ll83/a0;", "effect", "", "ifValid", "(Ljava/util/Map;Lc93/a;)Z", "payload", "extractChannelType", "(Ljava/util/Map;)Ljava/lang/String;", "extractChannelId", "metadata", "handlePushMessage", "(Ljava/util/Map;Ljava/util/Map;)Z", "Ly03/a;", "pushDevice", "registerPushDevice", "(Ly03/a;)V", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "expectedKeys", "Ljava/util/HashSet;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatPushDelegate extends PushDelegate {
    private static final Companion Companion = new Companion();
    private static final String KEY_CHANNEL_ID = "channel_id";
    private static final String KEY_CHANNEL_TYPE = "channel_type";
    private static final String KEY_CID = "cid";
    private static final String KEY_GETSTREAM = "getstream";
    private static final String KEY_MESSAGE_ID = "message_id";
    private final HashSet<String> expectedKeys = AbstractC12350b.m34602w(KEY_CHANNEL_ID, KEY_MESSAGE_ID, KEY_CHANNEL_TYPE, KEY_GETSTREAM);

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/ChatPushDelegate$Companion;", "", "<init>", "()V", "KEY_CHANNEL_ID", "", "KEY_MESSAGE_ID", "KEY_CHANNEL_TYPE", "KEY_CID", "KEY_GETSTREAM", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final String extractChannelId(Map<String, ? extends Object> payload) {
        Object obj = payload.get(KEY_CID);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return (String) StringExtensionsKt.cidToTypeAndId(str).f92938x;
        }
        Object obj2 = payload.get(KEY_CHANNEL_ID);
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
        return (String) obj2;
    }

    private final String extractChannelType(Map<String, ? extends Object> payload) {
        Object obj = payload.get(KEY_CID);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return (String) StringExtensionsKt.cidToTypeAndId(str).f92937w;
        }
        Object obj2 = payload.get(KEY_CHANNEL_TYPE);
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
        return (String) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 handlePushMessage$lambda$1(ChatPushDelegate chatPushDelegate, Map map, Map map2) {
        ChatClient.Companion companion = ChatClient.INSTANCE;
        String strExtractChannelType = chatPushDelegate.extractChannelType(map);
        String strExtractChannelId = chatPushDelegate.extractChannelId(map);
        Object objM73986U = AbstractC25247g0.m73986U(KEY_MESSAGE_ID, map);
        AbstractC22676k.m65748h(objM73986U, "null cannot be cast to non-null type kotlin.String");
        String str = (String) objM73986U;
        StreamPayloadParser streamPayloadParser = StreamPayloadParser.INSTANCE;
        Object obj = map.get(KEY_GETSTREAM);
        Map<String, Object> map3 = streamPayloadParser.parse(obj instanceof String ? (String) obj : null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!chatPushDelegate.expectedKeys.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        companion.handlePushMessage(new PushMessage(str, strExtractChannelId, strExtractChannelType, map3, linkedHashMap, map2));
        return C23454a0.f92919a;
    }

    private final boolean ifValid(Map<String, ? extends Object> map, InterfaceC4339a interfaceC4339a) {
        PayloadValidator payloadValidator = PayloadValidator.INSTANCE;
        boolean z4 = payloadValidator.isFromStreamServer(map) && payloadValidator.isValidPayload(map);
        if (!z4) {
            interfaceC4339a = null;
        }
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
        return z4;
    }

    @Override // io.getstream.android.push.delegate.PushDelegate
    public boolean handlePushMessage(Map<String, ? extends Object> metadata, Map<String, ? extends Object> payload) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(payload, "payload");
        return ifValid(payload, new C18656a0(this, payload, metadata, 4));
    }

    @Override // io.getstream.android.push.delegate.PushDelegate
    public void registerPushDevice(AbstractC39026a pushDevice) {
        AbstractC22676k.m65750j(pushDevice, "pushDevice");
        throw null;
    }
}
