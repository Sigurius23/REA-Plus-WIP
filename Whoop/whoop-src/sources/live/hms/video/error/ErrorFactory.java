package live.hms.video.error;

import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.HashMap;
import live.hms.video.audio.BluetoothErrorType;
import live.hms.video.factories.noisecancellation.AvailabilityStatus;
import live.hms.video.media.streams.models.PreferStateResponseError;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\t\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory;", "", "<init>", "()V", "ReadPhoneStateError", "Llive/hms/video/error/HMSException;", "BluetoothError", "bluetoothErrorType", "Llive/hms/video/audio/BluetoothErrorType;", "MediaProjectionPermissionError", "ImageCaptureException", "throwable", "", "NoiseCancellationNotAvailable", "availabilityStatus", "Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;", "NoiseCancellationToggleFailed", "expected", "", "actual", "Action", "WebSocketConnectionErrors", "APIErrors", "TracksErrors", "WebrtcErrors", "WebsocketMethodErrors", "GenericErrors", "MediaPluginErrors", "AudioOutputErrors", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ErrorFactory {
    public static final ErrorFactory INSTANCE = new ErrorFactory();

    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJW\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0014JO\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000f¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$APIErrors;", "", "<init>", "()V", "ServerErrors", "Llive/hms/video/error/HMSException;", "action", "Llive/hms/video/error/ErrorFactory$Action;", "description", "", "cause", "", "params", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "ConnectionLost", "HTTPError", "code", "", "(ILlive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "InvalidEndpointURL", "EndpointUnreachable", "InvalidTokenFormat", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class APIErrors {
        public static final APIErrors INSTANCE = new APIErrors();

        private APIErrors() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException ConnectionLost$default(APIErrors aPIErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return aPIErrors.ConnectionLost(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException EndpointUnreachable$default(APIErrors aPIErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return aPIErrors.EndpointUnreachable(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException HTTPError$default(APIErrors aPIErrors, int i13, Action action, String str, Throwable th3, HashMap map, int i14, Object obj) {
            if ((i14 & 4) != 0) {
                str = "";
            }
            String str2 = str;
            if ((i14 & 8) != 0) {
                th3 = null;
            }
            Throwable th4 = th3;
            if ((i14 & 16) != 0) {
                map = new HashMap();
            }
            return aPIErrors.HTTPError(i13, action, str2, th4, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException InvalidEndpointURL$default(APIErrors aPIErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return aPIErrors.InvalidEndpointURL(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException InvalidTokenFormat$default(APIErrors aPIErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return aPIErrors.InvalidTokenFormat(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException ServerErrors$default(APIErrors aPIErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return aPIErrors.ServerErrors(action, str, th3, map);
        }

        public final HMSException ConnectionLost(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.InitAPIErrors.cConnectionLost, "ConnectionLost", action.toString(), "[INIT]: Network error", description, cause, false, params, 64, null);
        }

        public final HMSException EndpointUnreachable(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.InitAPIErrors.cEndpointUnreachable, "EndpointUnreachable", action.toString(), "Endpoint is not reachable.", description, cause, false, params, 64, null);
        }

        public final HMSException HTTPError(int code, Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(code, "HTTPError", action.toString(), "Bad Request", description, cause, false, params, 64, null);
        }

        public final HMSException InvalidEndpointURL(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.InitAPIErrors.cInvalidEndpointURL, "InvalidEndpointURL", action.toString(), "Endpoint URL is invalid", description, cause, false, params, 64, null);
        }

        public final HMSException InvalidTokenFormat(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.InitAPIErrors.cInvalidTokenFormat, "InvalidTokenFormat", action.toString(), "Token is not in proper JWT format", description, cause, false, params, 64, null);
        }

        public final HMSException ServerErrors(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.InitAPIErrors.cServerErrors, "ServerErrors", action.toString(), "[INIT]: Server error", description, cause, false, params, 64, null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$Action;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "TRACK", "INIT", "PUBLISH", "JOIN", "PREVIEW", "SUBSCRIBE", "GET_TOKEN", "GET_LAYOUT_CONFIG", "DATA_CHANNEL_SEND", "WHITEBOARD", "PLUGIN", "DIAGNOSTICS", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum Action {
        NONE,
        TRACK,
        INIT,
        PUBLISH,
        JOIN,
        PREVIEW,
        SUBSCRIBE,
        GET_TOKEN,
        GET_LAYOUT_CONFIG,
        DATA_CHANNEL_SEND,
        WHITEBOARD,
        PLUGIN,
        DIAGNOSTICS;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$AudioOutputErrors;", "", "<init>", "()V", "bluetoothScoInitFailure", "Llive/hms/video/error/HMSException;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class AudioOutputErrors {
        public static final AudioOutputErrors INSTANCE = new AudioOutputErrors();

        private AudioOutputErrors() {
        }

        public final HMSException bluetoothScoInitFailure() {
            return new HMSException(7005, "BluetoothScoInitFailed", HMSAction.AUDIO_OUTPUT.toString(), "Bluetooth Connection Init Failed", "bluetooth headset is not available or in a processing state", new Throwable("Bluetooth Connection Init Failed"), false, new HashMap());
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJM\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJM\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJW\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0015JO\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJQ\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJQ\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJQ\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000f¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$GenericErrors;", "", "<init>", "()V", "NotConnected", "Llive/hms/video/error/HMSException;", "action", "Llive/hms/video/error/ErrorFactory$Action;", "description", "", "cause", "", "params", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "Signalling", "Unknown", "NotReady", "JsonParsingFailed", "jsonMessage", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "TrackMetadataMissing", "RTCTrackMissing", "PeerMetadataMissing", "CannotSendMessage", "InvalidResolutionForRtmpStreaming", "APINotSupported", "PollQuestionIterationFailure", "PollNotFound", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class GenericErrors {
        public static final GenericErrors INSTANCE = new GenericErrors();

        private GenericErrors() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException APINotSupported$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = Action.NONE;
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.APINotSupported(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException CannotSendMessage$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = Action.NONE;
            }
            if ((i13 & 2) != 0) {
                str = "Cannot send message. Peer is null. The sdk must be disconnected from a room.";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.CannotSendMessage(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException InvalidResolutionForRtmpStreaming$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = Action.NONE;
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.InvalidResolutionForRtmpStreaming(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException JsonParsingFailed$default(GenericErrors genericErrors, Action action, String str, String str2, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i13 & 8) != 0) {
                th3 = null;
            }
            Throwable th4 = th3;
            if ((i13 & 16) != 0) {
                map = new HashMap();
            }
            return genericErrors.JsonParsingFailed(action, str, str3, th4, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException NotConnected$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.NotConnected(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException NotReady$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.NotReady(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException PeerMetadataMissing$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.PeerMetadataMissing(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException PollNotFound$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = Action.NONE;
            }
            if ((i13 & 2) != 0) {
                str = "Poll not found";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.PollNotFound(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException PollQuestionIterationFailure$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = Action.NONE;
            }
            if ((i13 & 2) != 0) {
                str = "Poll question iteration failure";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.PollQuestionIterationFailure(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException RTCTrackMissing$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.RTCTrackMissing(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException Signalling$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.Signalling(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException TrackMetadataMissing$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.TrackMetadataMissing(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException Unknown$default(GenericErrors genericErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return genericErrors.Unknown(action, str, th3, map);
        }

        public final HMSException APINotSupported(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(6010, "APINotSupported", action.toString(), "This API is not support on the current Android Version", description, cause, false, params, 64, null);
        }

        public final HMSException CannotSendMessage(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(6008, "CannotSendMessage", action.toString(), "Client is not connected", description, cause, false, params, 64, null);
        }

        public final HMSException InvalidResolutionForRtmpStreaming(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(6009, "InvalidRtmpStreamResolution", action.toString(), "Invalid resolution for rtmp streaming. Valid values are between 480, 1280. Width and height both cannot be over 720 at the same time.", description, cause, false, params, 64, null);
        }

        public final HMSException JsonParsingFailed(Action action, String jsonMessage, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(jsonMessage, "jsonMessage");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.GenericErrors.cJsonParsingFailed, "JsonParsingFailed", action.toString(), AbstractC39421y.m125926K("Failed to parse JSON message - {json_message}", "{json_message}", jsonMessage, false), description, cause, false, params, 64, null);
        }

        public final HMSException NotConnected(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.GenericErrors.cNotConnected, "NotConnected", action.toString(), "Client is not connected", description, cause, false, params, 64, null);
        }

        public final HMSException NotReady(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.GenericErrors.cNotReady, "NotReady", action.toString(), "WebRTC engine is not ready yet", description, cause, false, params, 64, null);
        }

        public final HMSException PeerMetadataMissing(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.GenericErrors.cPeerMetadataMissing, "PeerMetadataMissing", action.toString(), "Peer Metadata Missing", description, cause, false, params, 64, null);
        }

        public final HMSException PollNotFound(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(6012, "Poll Question Iteration Failure", action.toString(), "Client is not connected", description, cause, false, params, 64, null);
        }

        public final HMSException PollQuestionIterationFailure(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(6011, "Poll Question Iteration Failure", action.toString(), "Client is not connected", description, cause, false, params, 64, null);
        }

        public final HMSException RTCTrackMissing(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.GenericErrors.cRTCTrackMissing, "RTCTrackMissing", action.toString(), "RTC Track missing", description, cause, false, params, 64, null);
        }

        public final HMSException Signalling(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.GenericErrors.cSignalling, "Signalling", action.toString(), AbstractC39421y.m125926K(AbstractC39421y.m125926K("Unknown signalling error: {action} {error_info} ", "{action}", action.toString(), false), "{error_info}", description, false), description, cause, false, params, 64, null);
        }

        public final HMSException TrackMetadataMissing(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.GenericErrors.cTrackMetadataMissing, "TrackMetadataMissing", action.toString(), "Track Metadata Missing", description, cause, false, params, 64, null);
        }

        public final HMSException Unknown(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.GenericErrors.cUnknown, "Unknown", action.toString(), AbstractC39421y.m125926K("Unknown exception: {error_info}", "{error_info}", description, false), description, cause, false, params, 64, null);
        }
    }

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\r"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$MediaPluginErrors;", "", "<init>", "()V", "PlatformNotSupported", "Llive/hms/video/error/HMSException;", "action", "Llive/hms/video/error/HMSAction;", "description", "", "InitFailed", "ProcessingFailed", "AddAlreadyInProgress", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class MediaPluginErrors {
        public static final MediaPluginErrors INSTANCE = new MediaPluginErrors();

        private MediaPluginErrors() {
        }

        public static /* synthetic */ HMSException AddAlreadyInProgress$default(MediaPluginErrors mediaPluginErrors, HMSAction hMSAction, String str, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            return mediaPluginErrors.AddAlreadyInProgress(hMSAction, str);
        }

        public static /* synthetic */ HMSException InitFailed$default(MediaPluginErrors mediaPluginErrors, HMSAction hMSAction, String str, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            return mediaPluginErrors.InitFailed(hMSAction, str);
        }

        public static /* synthetic */ HMSException PlatformNotSupported$default(MediaPluginErrors mediaPluginErrors, HMSAction hMSAction, String str, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            return mediaPluginErrors.PlatformNotSupported(hMSAction, str);
        }

        public static /* synthetic */ HMSException ProcessingFailed$default(MediaPluginErrors mediaPluginErrors, HMSAction hMSAction, String str, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            return mediaPluginErrors.ProcessingFailed(hMSAction, str);
        }

        public final HMSException AddAlreadyInProgress(HMSAction action, String description) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            return new HMSException(7004, "AddAlreadyInProgress", action.toString(), "Plugin add already in progress", description, null, false, null, 224, null);
        }

        public final HMSException InitFailed(HMSAction action, String description) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            return new HMSException(7002, "InitFailed", action.toString(), "Plugin init failed", description, null, false, null, 224, null);
        }

        public final HMSException PlatformNotSupported(HMSAction action, String description) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            return new HMSException(7001, "PlatformNotSupported", action.toString(), "Check HMS Docs to see the list of supported platforms", description, null, false, null, 224, null);
        }

        public final HMSException ProcessingFailed(HMSAction action, String description) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            return new HMSException(7003, "ProcessingFailed", action.toString(), "Plugin processing failed", description, null, false, null, 224, null);
        }
    }

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011Ja\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0014Ja\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0014JO\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0018JO\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0018JO\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0018JO\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0018JO\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u0018J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010 \u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\""}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$TracksErrors;", "", "<init>", "()V", "GenericTrack", "Llive/hms/video/error/HMSException;", "action", "Llive/hms/video/error/ErrorFactory$Action;", "description", "", "cause", "", "params", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "isTerminal", "", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;Z)Llive/hms/video/error/HMSException;", "CantAccessCaptureDevice", "deviceInfo", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "CantFindCameraIdForParticularFace", "face", "PeerConnectionFactoryDisposed", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "NothingToReturn", "InvalidVideoSettings", "CodecChangeNotPermitted", "MicCaptureFailed", "PreferLayerFailed", "preferStateResponseError", "Llive/hms/video/media/streams/models/PreferStateResponseError;", "PreferLayerFailedUnknownError", "PreferLayerTimeoutError", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class TracksErrors {
        public static final TracksErrors INSTANCE = new TracksErrors();

        private TracksErrors() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException CantAccessCaptureDevice$default(TracksErrors tracksErrors, Action action, String str, String str2, boolean z4, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i13 & 8) != 0) {
                z4 = false;
            }
            boolean z13 = z4;
            if ((i13 & 16) != 0) {
                th3 = null;
            }
            Throwable th4 = th3;
            if ((i13 & 32) != 0) {
                map = new HashMap();
            }
            return tracksErrors.CantAccessCaptureDevice(action, str, str3, z13, th4, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException CantFindCameraIdForParticularFace$default(TracksErrors tracksErrors, Action action, String str, String str2, boolean z4, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i13 & 8) != 0) {
                z4 = false;
            }
            boolean z13 = z4;
            if ((i13 & 16) != 0) {
                th3 = null;
            }
            Throwable th4 = th3;
            if ((i13 & 32) != 0) {
                map = new HashMap();
            }
            return tracksErrors.CantFindCameraIdForParticularFace(action, str, str3, z13, th4, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException CodecChangeNotPermitted$default(TracksErrors tracksErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return tracksErrors.CodecChangeNotPermitted(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException GenericTrack$default(TracksErrors tracksErrors, Action action, String str, Throwable th3, HashMap map, boolean z4, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            String str2 = str;
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            Throwable th4 = th3;
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            HashMap map2 = map;
            if ((i13 & 16) != 0) {
                z4 = true;
            }
            return tracksErrors.GenericTrack(action, str2, th4, map2, z4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException InvalidVideoSettings$default(TracksErrors tracksErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return tracksErrors.InvalidVideoSettings(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException MicCaptureFailed$default(TracksErrors tracksErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return tracksErrors.MicCaptureFailed(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException NothingToReturn$default(TracksErrors tracksErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return tracksErrors.NothingToReturn(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException PeerConnectionFactoryDisposed$default(TracksErrors tracksErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return tracksErrors.PeerConnectionFactoryDisposed(action, str, th3, map);
        }

        public static /* synthetic */ HMSException PreferLayerFailed$default(TracksErrors tracksErrors, PreferStateResponseError preferStateResponseError, Action action, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                action = Action.NONE;
            }
            return tracksErrors.PreferLayerFailed(preferStateResponseError, action);
        }

        public static /* synthetic */ HMSException PreferLayerFailedUnknownError$default(TracksErrors tracksErrors, Action action, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = Action.NONE;
            }
            return tracksErrors.PreferLayerFailedUnknownError(action);
        }

        public static /* synthetic */ HMSException PreferLayerTimeoutError$default(TracksErrors tracksErrors, Action action, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = Action.NONE;
            }
            return tracksErrors.PreferLayerTimeoutError(action);
        }

        public final HMSException CantAccessCaptureDevice(Action action, String deviceInfo, String description, boolean isTerminal, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(deviceInfo, "deviceInfo");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.TracksErrors.cCantAccessCaptureDevice, "CantAccessCaptureDevice", action.toString(), AbstractC39421y.m125926K("[PUBLISH]: No permission to access capture device - {device_type}", "{device_type}", deviceInfo, false), description, cause, isTerminal, params);
        }

        public final HMSException CantFindCameraIdForParticularFace(Action action, String face, String description, boolean isTerminal, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(face, "face");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(3002, "CantFindCameraIdForParticularFace", action.toString(), AbstractC11895b.m31996o("Couldn't find ", face, " facing camera. Please restart your device"), description, cause, isTerminal, params);
        }

        public final HMSException CodecChangeNotPermitted(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.TracksErrors.cCodecChangeNotPermitted, "CodecChangeNotPermitted", action.toString(), "Codec can't be changed mid call.", description, cause, false, params, 64, null);
        }

        public final HMSException GenericTrack(Action action, String description, Throwable cause, HashMap<String, Object> params, boolean isTerminal) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.TracksErrors.cGenericTrack, "GenericTrack", action.toString(), "[PUBLISH]: Something went wrong", description, cause, isTerminal, params);
        }

        public final HMSException InvalidVideoSettings(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.TracksErrors.cInvalidVideoSettings, "InvalidVideoSettings", action.toString(), "Cannot enable simulcast when no video settings are provided", description, cause, false, params, 64, null);
        }

        public final HMSException MicCaptureFailed(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(3011, "Mic Capture Failed", action.toString(), "Mic Capture Failed", description, cause, false, params, 64, null);
        }

        public final HMSException NothingToReturn(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.TracksErrors.cNothingToReturn, "NothingToReturn", action.toString(), "There is no media to return. Please select either video or audio or both.", description, cause, false, params, 64, null);
        }

        public final HMSException PeerConnectionFactoryDisposed(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.TracksErrors.cPeerConnectionFactoryDisposed, "PeerConnectionFactoryDisposed", action.toString(), "[PUBLISH]: Peer Connection Factory Disposed", description, cause, false, params);
        }

        public final HMSException PreferLayerFailed(PreferStateResponseError preferStateResponseError, Action action) {
            AbstractC22676k.m65750j(preferStateResponseError, "preferStateResponseError");
            AbstractC22676k.m65750j(action, "action");
            String string = action.toString();
            Integer code = preferStateResponseError.getCode();
            int iIntValue = code != null ? code.intValue() : 0;
            String message = preferStateResponseError.getMessage();
            if (message == null) {
                message = "";
            }
            return new HMSException(iIntValue, "Prefer Layer failed", string, message, "Prefer layer change failed. Data: " + preferStateResponseError.getData(), null, false, null, 224, null);
        }

        public final HMSException PreferLayerFailedUnknownError(Action action) {
            AbstractC22676k.m65750j(action, "action");
            return new HMSException(3014, "Prefer Layer failed", action.toString(), "Unknown prefer layer error", "Unknown error for prefer layer", null, false, null, 224, null);
        }

        public final HMSException PreferLayerTimeoutError(Action action) {
            AbstractC22676k.m65750j(action, "action");
            return new HMSException(3015, "Prefer Layer failed", action.toString(), "Prefer layer timed out", "The server did not acknowledge the request to change the preferred layer.", null, false, null, 224, null);
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000f¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;", "", "<init>", "()V", "GenericConnect", "Llive/hms/video/error/HMSException;", "action", "Llive/hms/video/error/ErrorFactory$Action;", "description", "", "cause", "", "params", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "WebSocketConnectionLost", "WebSocketNotAvailable", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class WebSocketConnectionErrors {
        public static final WebSocketConnectionErrors INSTANCE = new WebSocketConnectionErrors();

        private WebSocketConnectionErrors() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException GenericConnect$default(WebSocketConnectionErrors webSocketConnectionErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return webSocketConnectionErrors.GenericConnect(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException WebSocketConnectionLost$default(WebSocketConnectionErrors webSocketConnectionErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return webSocketConnectionErrors.WebSocketConnectionLost(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException WebSocketNotAvailable$default(WebSocketConnectionErrors webSocketConnectionErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return webSocketConnectionErrors.WebSocketNotAvailable(action, str, th3, map);
        }

        public final HMSException GenericConnect(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(1000, "GenericConnect", action.toString(), "Something went wrong", description, cause, false, params, 64, null);
        }

        public final HMSException WebSocketConnectionLost(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(1003, "WebSocketConnectionLost", action.toString(), "Network connection lost ", description, cause, false, params, 64, null);
        }

        public final HMSException WebSocketNotAvailable(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(MessageListItemViewType.CUSTOM_ATTACHMENTS, "WebSocketNotAvailable", action.toString(), "Websocket is not ready yet or has been destroyed ", description, cause, false, params, 64, null);
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000fJO\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000ej\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\r¢\u0006\u0002\u0010\u000f¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$WebrtcErrors;", "", "<init>", "()V", "CreateOfferFailed", "Llive/hms/video/error/HMSException;", "action", "Llive/hms/video/error/ErrorFactory$Action;", "description", "", "cause", "", "params", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "CreateAnswerFailed", "SetLocalDescriptionFailed", "SetRemoteDescriptionFailed", "ICEFailure", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class WebrtcErrors {
        public static final WebrtcErrors INSTANCE = new WebrtcErrors();

        private WebrtcErrors() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException CreateAnswerFailed$default(WebrtcErrors webrtcErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return webrtcErrors.CreateAnswerFailed(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException CreateOfferFailed$default(WebrtcErrors webrtcErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return webrtcErrors.CreateOfferFailed(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException ICEFailure$default(WebrtcErrors webrtcErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return webrtcErrors.ICEFailure(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException SetLocalDescriptionFailed$default(WebrtcErrors webrtcErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return webrtcErrors.SetLocalDescriptionFailed(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException SetRemoteDescriptionFailed$default(WebrtcErrors webrtcErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return webrtcErrors.SetRemoteDescriptionFailed(action, str, th3, map);
        }

        public final HMSException CreateAnswerFailed(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.WebrtcErrors.cCreateAnswerFailed, "CreateAnswerFailed", action.toString(), AbstractC39421y.m125926K("[{action}]: Failed to create answer. ", "{action}", action.toString(), false), description, cause, false, params, 64, null);
        }

        public final HMSException CreateOfferFailed(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.WebrtcErrors.cCreateOfferFailed, "CreateOfferFailed", action.toString(), AbstractC39421y.m125926K("[{action}]: Failed to create offer. ", "{action}", action.toString(), false), description, cause, false, params, 64, null);
        }

        public final HMSException ICEFailure(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.WebrtcErrors.cICEFailure, "ICEFailure", action.toString(), AbstractC39421y.m125926K("[{action}]: Ice connection state FAILED", "{action}", action.toString(), false), description, cause, false, params, 64, null);
        }

        public final HMSException SetLocalDescriptionFailed(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.WebrtcErrors.cSetLocalDescriptionFailed, "SetLocalDescriptionFailed", action.toString(), AbstractC39421y.m125926K("[{action}]: Failed to set offer. ", "{action}", action.toString(), false), description, cause, false, params, 64, null);
        }

        public final HMSException SetRemoteDescriptionFailed(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.WebrtcErrors.cSetRemoteDescriptionFailed, "SetRemoteDescriptionFailed", action.toString(), AbstractC39421y.m125926K("[{action}]: Failed to set answer. ", "{action}", action.toString(), false), description, cause, false, params, 64, null);
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2$\b\u0002\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0010j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001`\u000f¢\u0006\u0002\u0010\u0011JO\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2$\b\u0002\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0010j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001`\u000f¢\u0006\u0002\u0010\u0013JO\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2$\b\u0002\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0010j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001`\u000f¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;", "", "<init>", "()V", "ServerErrors", "Llive/hms/video/error/HMSException;", "code", "", "action", "Llive/hms/video/error/ErrorFactory$Action;", "description", "", "cause", "", "params", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(ILlive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "AlreadyJoined", "(Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;", "PreviewAlreadyStarted", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class WebsocketMethodErrors {
        public static final WebsocketMethodErrors INSTANCE = new WebsocketMethodErrors();

        private WebsocketMethodErrors() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException AlreadyJoined$default(WebsocketMethodErrors websocketMethodErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return websocketMethodErrors.AlreadyJoined(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException PreviewAlreadyStarted$default(WebsocketMethodErrors websocketMethodErrors, Action action, String str, Throwable th3, HashMap map, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = "";
            }
            if ((i13 & 4) != 0) {
                th3 = null;
            }
            if ((i13 & 8) != 0) {
                map = new HashMap();
            }
            return websocketMethodErrors.PreviewAlreadyStarted(action, str, th3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSException ServerErrors$default(WebsocketMethodErrors websocketMethodErrors, int i13, Action action, String str, Throwable th3, HashMap map, int i14, Object obj) {
            if ((i14 & 8) != 0) {
                th3 = null;
            }
            Throwable th4 = th3;
            if ((i14 & 16) != 0) {
                map = new HashMap();
            }
            return websocketMethodErrors.ServerErrors(i13, action, str, th4, map);
        }

        public final HMSException AlreadyJoined(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(ErrorCodes.WebsocketMethodErrors.cAlreadyJoined, "AlreadyJoined", action.toString(), "[JOIN]: You have already joined this room.", description, cause, false, params, 64, null);
        }

        public final HMSException PreviewAlreadyStarted(Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(5002, "PreviewAlreadyStarted", action.toString(), "[PREVIEW]: Preview has already been started for this room.", "[PREVIEW]: Preview has already been started for this room.", cause, false, params);
        }

        public final HMSException ServerErrors(int code, Action action, String description, Throwable cause, HashMap<String, Object> params) {
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(params, "params");
            return new HMSException(code, "ServerErrors", action.toString(), AbstractC39421y.m125926K("[" + action + "]: {server_error}", "{server_error}", description, false), description, cause, false, params, 64, null);
        }
    }

    private ErrorFactory() {
    }

    public static final HMSException BluetoothError(BluetoothErrorType bluetoothErrorType) {
        AbstractC22676k.m65750j(bluetoothErrorType, "bluetoothErrorType");
        return new HMSException(bluetoothErrorType == BluetoothErrorType.NO_BLUETOOTH_CONNECT_PERMISSION ? 3012 : 3013, "Bluetooth Inaccessible", Action.NONE.toString(), bluetoothErrorType.getDescription(), bluetoothErrorType.getDescription(), null, false, new HashMap());
    }

    public static final HMSException ReadPhoneStateError() {
        return new HMSException(3016, "ReadPhoneStateError", Action.NONE.toString(), "Read phone state permission not granted", "READ_PHONE_STATE, a dangerous level permission, is required on Android 12 and above to enable devices to work", null, false, new HashMap(), 64, null);
    }

    public final HMSException ImageCaptureException(Throwable throwable) {
        return new HMSException(8001, "ImageCaptureException", HMSAction.None.toString(), "Error capturing image", "The error occured while capturing an image", throwable, false, null, 192, null);
    }

    public final HMSException MediaProjectionPermissionError() {
        return new HMSException(3017, "Media Projection Permission not present", Action.NONE.toString(), "Cannot start screen-share, due to FOREGROUND_SERVICE_MEDIA_PROJECTION not present", "FOREGROUND_SERVICE_MEDIA_PROJECTION permission is needed for screen sharing in Android 14", null, false, new HashMap());
    }

    public final HMSException NoiseCancellationNotAvailable(AvailabilityStatus.NotAvailable availabilityStatus) {
        AbstractC22676k.m65750j(availabilityStatus, "availabilityStatus");
        return new HMSException(8002, "Noise cancellation not supported", HMSAction.None.toString(), "Noise cancelltion not supported", availabilityStatus.getReason(), null, false, null, 160, null);
    }

    public final HMSException NoiseCancellationToggleFailed(boolean expected, boolean actual) {
        return new HMSException(8003, "NoiseCancellationToggleFailed", HMSAction.None.toString(), "Noise cancellation could not be toggled", "Noise cancellation was expected to be " + expected + " but was " + actual + '.', null, false, null, 160, null);
    }
}
