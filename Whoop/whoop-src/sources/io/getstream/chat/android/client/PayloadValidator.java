package io.getstream.chat.android.client;

import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\u001e\u0010\u001a\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002J\u001c\u0010\u001c\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\u001c\u0010\u001d\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\u001e\u0010\u001e\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002J\u001e\u0010\u001f\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002J\u001e\u0010 \u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002J\u001e\u0010!\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002J\u001e\u0010\"\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002J\u001e\u0010#\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/PayloadValidator;", "", "<init>", "()V", "KEY_SENDER_V1", "", "KEY_SENDER", "KEY_VERSION", "KEY_TYPE", "KEY_CHANNEL_ID", "KEY_CHANNEL_TYPE", "KEY_CID", "KEY_MESSAGE_ID", "VALUE_STREAM_SENDER", "VALUE_MESSAGE_NEW", "VALUE_MESSAGE_UPDATED", "VALUE_REACTION_NEW", "VALUE_NOTIFICATION_REMINDER_DUE", "VALUE_V1", "VALUE_V2", "supportedNotificationTypes", "", "isFromStreamServer", "", "payload", "", "isFromStreamServerV1", "isFromStreamServerV2", "isValidNewMessage", "isValidPayload", "isValidNewMessageV1", "isValidNewMessageV2", "isValidTypeV2", "isValidType", "hasMessageId", "hasCid", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PayloadValidator {
    private static final String KEY_CHANNEL_ID = "channel_id";
    private static final String KEY_CHANNEL_TYPE = "channel_type";
    private static final String KEY_CID = "cid";
    private static final String KEY_MESSAGE_ID = "message_id";
    private static final String KEY_SENDER = "sender";
    private static final String KEY_SENDER_V1 = "sender_server";
    private static final String KEY_TYPE = "type";
    private static final String KEY_VERSION = "version";
    private static final String VALUE_MESSAGE_NEW = "message.new";
    private static final String VALUE_MESSAGE_UPDATED = "message.updated";
    private static final String VALUE_NOTIFICATION_REMINDER_DUE = "notification.reminder_due";
    private static final String VALUE_REACTION_NEW = "reaction.new";
    private static final String VALUE_STREAM_SENDER = "stream.chat";
    private static final String VALUE_V1 = "v1";
    private static final String VALUE_V2 = "v2";
    public static final PayloadValidator INSTANCE = new PayloadValidator();
    private static final List<String> supportedNotificationTypes = AbstractC37056f.m118959K("message.new", "message.updated", "reaction.new", "notification.reminder_due");

    private PayloadValidator() {
    }

    private final boolean hasCid(Map<String, ? extends Object> payload) {
        Object obj = payload.get(KEY_CHANNEL_ID);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && !AbstractC39414r.m125890i0(str)) {
            Object obj2 = payload.get(KEY_CHANNEL_TYPE);
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null && !AbstractC39414r.m125890i0(str2)) {
                return true;
            }
        }
        Object obj3 = payload.get(KEY_CID);
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        return (str3 == null || AbstractC39414r.m125890i0(str3)) ? false : true;
    }

    private final boolean hasMessageId(Map<String, ? extends Object> payload) {
        Object obj = payload.get(KEY_MESSAGE_ID);
        String str = obj instanceof String ? (String) obj : null;
        return !(str == null || AbstractC39414r.m125890i0(str));
    }

    private final boolean isFromStreamServerV1(Map<String, ? extends Object> payload) {
        return AbstractC22676k.m65745e(payload.get(KEY_SENDER_V1), VALUE_STREAM_SENDER);
    }

    private final boolean isFromStreamServerV2(Map<String, ? extends Object> payload) {
        return AbstractC22676k.m65745e(payload.get(KEY_SENDER), VALUE_STREAM_SENDER);
    }

    private final boolean isValidNewMessageV1(Map<String, ? extends Object> payload) {
        Object obj = payload.get(KEY_CHANNEL_ID);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return false;
        }
        Object obj2 = payload.get(KEY_MESSAGE_ID);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
            return false;
        }
        Object obj3 = payload.get(KEY_CHANNEL_TYPE);
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        return (str3 == null || AbstractC39414r.m125890i0(str3)) ? false : true;
    }

    private final boolean isValidNewMessageV2(Map<String, ? extends Object> payload) {
        if (!AbstractC22676k.m65745e(payload.get(KEY_TYPE), "message.new")) {
            return false;
        }
        Object obj = payload.get(KEY_CHANNEL_ID);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return false;
        }
        Object obj2 = payload.get(KEY_MESSAGE_ID);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
            return false;
        }
        Object obj3 = payload.get(KEY_CHANNEL_TYPE);
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        return (str3 == null || AbstractC39414r.m125890i0(str3)) ? false : true;
    }

    private final boolean isValidType(Map<String, ? extends Object> payload) {
        Object obj = payload.get(KEY_TYPE);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return false;
        }
        return supportedNotificationTypes.contains(str);
    }

    private final boolean isValidTypeV2(Map<String, ? extends Object> payload) {
        return isValidType(payload) && hasCid(payload) && hasMessageId(payload);
    }

    public final boolean isFromStreamServer(Map<String, ? extends Object> payload) {
        AbstractC22676k.m65750j(payload, "payload");
        Object obj = payload.get(KEY_VERSION);
        if (AbstractC22676k.m65745e(obj, "v1")) {
            return isFromStreamServerV1(payload);
        }
        if (AbstractC22676k.m65745e(obj, "v2")) {
            return isFromStreamServerV2(payload);
        }
        return false;
    }

    public final boolean isValidNewMessage(Map<String, ? extends Object> payload) {
        AbstractC22676k.m65750j(payload, "payload");
        Object obj = payload.get(KEY_VERSION);
        if (AbstractC22676k.m65745e(obj, "v1")) {
            return isValidNewMessageV1(payload);
        }
        if (AbstractC22676k.m65745e(obj, "v2")) {
            return isValidNewMessageV2(payload);
        }
        return false;
    }

    public final boolean isValidPayload(Map<String, ? extends Object> payload) {
        AbstractC22676k.m65750j(payload, "payload");
        Object obj = payload.get(KEY_VERSION);
        if (AbstractC22676k.m65745e(obj, "v1")) {
            return isValidNewMessageV1(payload);
        }
        if (AbstractC22676k.m65745e(obj, "v2")) {
            return isValidTypeV2(payload);
        }
        return false;
    }
}
