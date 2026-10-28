package io.getstream.video.android.core.notifications.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import h43.C16854c;
import io.getstream.android.push.delegate.PushDelegate;
import io.getstream.video.android.model.StreamCallId;
import java.util.Map;
import l83.InterfaceC23462h;
import p005a3.C0271z0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33366b4;
import t23.C33403i3;
import t23.InterfaceC33408j3;
import y03.AbstractC39026a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\r\u0010\fJ-\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\fJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0014*\u000e\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0002\b\u00030\u00062\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010 \u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b \u0010\u001eJ!\u0010!\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b!\u0010\u001eJ!\u0010\"\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\"\u0010\u001eJ!\u0010#\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b#\u0010\u001eJ!\u0010$\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b$\u0010\u001eJ!\u0010%\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b%\u0010\u001eJ!\u0010&\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b&\u0010\u001eJ;\u0010(\u001a\u00020\u001a2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u00020\u00072\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, m65681d2 = {"Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;", "Lio/getstream/android/push/delegate/PushDelegate;", "<init>", "()V", "Lio/getstream/video/android/model/StreamCallId;", "callId", "", "", "", "payload", "Ll83/a0;", "handleRingType", "(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V", "handleMissedType", "handleNotificationType", "handleLiveStartedType", "requestReason", "Lt23/j3;", "getStreamVideo", "(Ljava/lang/String;)Lt23/j3;", "K", "key", "getStringValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/Function0;", "effect", "", "ifValid", "(Ljava/util/Map;Lc93/a;)Z", "isValid", "(Ljava/util/Map;)Z", "containsCallId", "containsKnownType", "isValidRingType", "isValidMissedType", "isValidNotificationType", "isValidLiveStarted", "isFromStreamServer", "isValidIncomingCall", "metadata", "handlePushMessage", "(Ljava/util/Map;Ljava/util/Map;)Z", "getCallDisplayName$stream_video_android_core_release", "(Ljava/util/Map;)Ljava/lang/String;", "getCallDisplayName", "Ly03/a;", "pushDevice", "registerPushDevice", "(Ly03/a;)V", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "h43/c", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class VideoPushDelegate extends PushDelegate {
    public static final C16854c Companion = new C16854c();
    private static final String DEFAULT_CALL_TEXT = "Unknown caller";
    private static final String KEY_CALL_CID = "call_cid";
    public static final String KEY_CALL_DISPLAY_NAME = "call_display_name";
    public static final String KEY_CREATED_BY_DISPLAY_NAME = "created_by_display_name";
    private static final String KEY_SENDER = "sender";
    private static final String KEY_TYPE = "type";
    private static final String KEY_TYPE_LIVE_STARTED = "call.live_started";
    private static final String KEY_TYPE_MISSED = "call.missed";
    private static final String KEY_TYPE_NOTIFICATION = "call.notification";
    private static final String KEY_TYPE_RING = "call.ring";
    private static final String VALUE_STREAM_SENDER = "stream.video";

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "Call:PushDelegate");

    private final boolean containsCallId(Map<String, ? extends Object> map) {
        Object obj = map.get(KEY_CALL_CID);
        String str = obj instanceof String ? (String) obj : null;
        return !(str == null || AbstractC39414r.m125890i0(str));
    }

    private final boolean containsKnownType(Map<String, ? extends Object> map) {
        Object obj = map.get(KEY_TYPE);
        if (AbstractC22676k.m65745e(obj, KEY_TYPE_RING)) {
            return isValidRingType(map);
        }
        if (AbstractC22676k.m65745e(obj, KEY_TYPE_MISSED)) {
            return isValidMissedType(map);
        }
        if (AbstractC22676k.m65745e(obj, KEY_TYPE_NOTIFICATION)) {
            return isValidNotificationType(map);
        }
        if (AbstractC22676k.m65745e(obj, KEY_TYPE_LIVE_STARTED)) {
            return isValidLiveStarted(map);
        }
        return false;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC33408j3 getStreamVideo(String requestReason) {
        InterfaceC33408j3.f139483t.getClass();
        InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
        if (interfaceC33408j3 == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, logger.f9273a)) {
                logger.f9274b.log(enumC2341g, logger.f9273a, AbstractC11895b.m31996o("Ignoring a push notification (", requestReason, ") StreamVideo is not initialised. Handling notifications requires to initialise StreamVideo in Application.onCreate"), null);
            }
        }
        return interfaceC33408j3;
    }

    private final <K> String getStringValue(Map<? extends K, ?> map, K k5) {
        AbstractC22676k.m65748h(map, "null cannot be cast to non-null type kotlin.collections.Map<K of io.getstream.video.android.core.notifications.internal.VideoPushDelegate.getStringValue, *>");
        if (map.containsKey(k5) && map.get(k5) != null) {
            Object obj = map.get(k5);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLiveStartedType(StreamCallId callId, Map<String, ? extends Object> payload) {
        String callDisplayName$stream_video_android_core_release = getCallDisplayName$stream_video_android_core_release(payload);
        InterfaceC33408j3 streamVideo = getStreamVideo("live-started-notification");
        if (streamVideo != null) {
            ((C33366b4) streamVideo).mo43671b(callId, callDisplayName$stream_video_android_core_release, payload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMissedType(StreamCallId callId, Map<String, ? extends Object> payload) {
        String callDisplayName$stream_video_android_core_release = getCallDisplayName$stream_video_android_core_release(payload);
        InterfaceC33408j3 streamVideo = getStreamVideo("missed-type-notification");
        if (streamVideo != null) {
            ((C33366b4) streamVideo).mo43673f(callId, callDisplayName$stream_video_android_core_release, payload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNotificationType(StreamCallId callId, Map<String, ? extends Object> payload) {
        String callDisplayName$stream_video_android_core_release = getCallDisplayName$stream_video_android_core_release(payload);
        InterfaceC33408j3 streamVideo = getStreamVideo("generic-notification");
        if (streamVideo != null) {
            ((C33366b4) streamVideo).mo43675h(callId, callDisplayName$stream_video_android_core_release, payload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRingType(StreamCallId callId, Map<String, ? extends Object> payload) {
        String callDisplayName$stream_video_android_core_release = getCallDisplayName$stream_video_android_core_release(payload);
        InterfaceC33408j3 streamVideo = getStreamVideo("ring-type-notification");
        if (streamVideo != null) {
            ((C33366b4) streamVideo).mo43676i(callId, callDisplayName$stream_video_android_core_release, payload);
        }
    }

    private final boolean ifValid(Map<String, ? extends Object> map, InterfaceC4339a interfaceC4339a) {
        boolean zIsValid = isValid(map);
        if (!zIsValid) {
            interfaceC4339a = null;
        }
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
        return zIsValid;
    }

    private final boolean isFromStreamServer(Map<String, ? extends Object> map) {
        return AbstractC22676k.m65745e(map.get(KEY_SENDER), VALUE_STREAM_SENDER);
    }

    private final boolean isValid(Map<String, ? extends Object> map) {
        return isFromStreamServer(map) && containsCallId(map) && containsKnownType(map);
    }

    private final boolean isValidIncomingCall(Map<String, ? extends Object> map) {
        Object obj = map.get(KEY_TYPE);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return false;
        }
        Object obj2 = map.get(KEY_CALL_CID);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        return (str2 == null || AbstractC39414r.m125890i0(str2)) ? false : true;
    }

    private final boolean isValidLiveStarted(Map<String, ? extends Object> map) {
        return true;
    }

    private final boolean isValidMissedType(Map<String, ? extends Object> map) {
        return true;
    }

    private final boolean isValidNotificationType(Map<String, ? extends Object> map) {
        return true;
    }

    private final boolean isValidRingType(Map<String, ? extends Object> map) {
        return true;
    }

    public final String getCallDisplayName$stream_video_android_core_release(Map<String, ? extends Object> payload) {
        AbstractC22676k.m65750j(payload, "payload");
        String stringValue = getStringValue(payload, KEY_CALL_DISPLAY_NAME);
        String str = null;
        if (stringValue != null) {
            if (AbstractC39414r.m125890i0(stringValue)) {
                stringValue = null;
            }
            if (stringValue != null) {
                return stringValue;
            }
        }
        String stringValue2 = getStringValue(payload, KEY_CREATED_BY_DISPLAY_NAME);
        if (stringValue2 != null && !AbstractC39414r.m125890i0(stringValue2)) {
            str = stringValue2;
        }
        return str == null ? DEFAULT_CALL_TEXT : str;
    }

    @Override // io.getstream.android.push.delegate.PushDelegate
    public boolean handlePushMessage(Map<String, ? extends Object> metadata, Map<String, ? extends Object> payload) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(payload, "payload");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[handlePushMessage] payload: " + payload + ", metadata: " + metadata, null);
        }
        return ifValid(payload, new C0271z0(11, payload, this));
    }

    @Override // io.getstream.android.push.delegate.PushDelegate
    public void registerPushDevice(AbstractC39026a pushDevice) {
        AbstractC22676k.m65750j(pushDevice, "pushDevice");
        throw null;
    }
}
