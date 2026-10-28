package live.hms.video.signal;

import ge3.AbstractC15751g;
import java.util.Locale;
import live.hms.video.error.ErrorFactory;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import t83.InterfaceC33616a;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b2\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00103\u001a\u000204H\u0016J\u0006\u00105\u001a\u000206j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2¨\u00068"}, m65681d2 = {"Llive/hms/video/signal/HMSSignalMethod;", "", "<init>", "(Ljava/lang/String;I)V", "JOIN", "OFFER", "ANSWER", "TRICKLE", "TRACK_UPDATE", "ANALYTICS", "SERVER_ERROR", "SDK_NOTIFICATION", "LEAVE", "ROLE_CHANGE_REQUEST", "ROLE_CHANGE", "PEER_LEAVE_REQUEST", "END_ROOM", "BROADCAST", "TRACK_UPDATE_REQUEST", "CHANGE_TRACK_MUTE_STATE_REQUEST", "RTMP_START", "RTMP_STOP", "HLS_START", "HLS_STOP", "PEER_UPDATE", "GET_METADATA", "SET_METADATA", "HLS_TIMED_METADATA", "LISTEN_METADATA_CHANGE", "POLL_INFO_SET", "POLL_INFO_GET", "POLL_QUESTIONS_SET", "POLL_RESPONSE", "POLL_START", "POLL_STOP", "POLL_QUESTIONS_GET", "POLL_RESPONSES", "POLL_RESULT", "POLL_LEADERBOARD", "POLL_LIST", "GROUP_JOIN", "GROUP_LEAVE", "GROUP_ADD", "GROUP_REMOVE", "FIND_PEER", "PEER_ITER_NEXT", "WHITEBOARD_CREATE", "WHITEBOARD_GET", "TRANSCRIPTION_START", "TRANSCRIPTION_STOP", "PEER_NAME_SEARCH", "toString", "", "toErrorAction", "Llive/hms/video/error/ErrorFactory$Action;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum HMSSignalMethod {
    JOIN,
    OFFER,
    ANSWER,
    TRICKLE,
    TRACK_UPDATE,
    ANALYTICS,
    SERVER_ERROR,
    SDK_NOTIFICATION,
    LEAVE,
    ROLE_CHANGE_REQUEST,
    ROLE_CHANGE,
    PEER_LEAVE_REQUEST,
    END_ROOM,
    BROADCAST,
    TRACK_UPDATE_REQUEST,
    CHANGE_TRACK_MUTE_STATE_REQUEST,
    RTMP_START,
    RTMP_STOP,
    HLS_START,
    HLS_STOP,
    PEER_UPDATE,
    GET_METADATA,
    SET_METADATA,
    HLS_TIMED_METADATA,
    LISTEN_METADATA_CHANGE,
    POLL_INFO_SET,
    POLL_INFO_GET,
    POLL_QUESTIONS_SET,
    POLL_RESPONSE,
    POLL_START,
    POLL_STOP,
    POLL_QUESTIONS_GET,
    POLL_RESPONSES,
    POLL_RESULT,
    POLL_LEADERBOARD,
    POLL_LIST,
    GROUP_JOIN,
    GROUP_LEAVE,
    GROUP_ADD,
    GROUP_REMOVE,
    FIND_PEER,
    PEER_ITER_NEXT,
    WHITEBOARD_CREATE,
    WHITEBOARD_GET,
    TRANSCRIPTION_START,
    TRANSCRIPTION_STOP,
    PEER_NAME_SEARCH;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/signal/HMSSignalMethod$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/signal/HMSSignalMethod;", "method", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final HMSSignalMethod from(String method) {
            AbstractC22676k.m65750j(method, "method");
            switch (method.hashCode()) {
                case -1412808770:
                    if (method.equals("answer")) {
                        return HMSSignalMethod.ANSWER;
                    }
                    break;
                case -1060006900:
                    if (method.equals("trickle")) {
                        return HMSSignalMethod.TRICKLE;
                    }
                    break;
                case 3267882:
                    if (method.equals("join")) {
                        return HMSSignalMethod.JOIN;
                    }
                    break;
                case 102846135:
                    if (method.equals("leave")) {
                        return HMSSignalMethod.LEAVE;
                    }
                    break;
                case 105650780:
                    if (method.equals("offer")) {
                        return HMSSignalMethod.OFFER;
                    }
                    break;
                case 404672666:
                    if (method.equals("on-error")) {
                        return HMSSignalMethod.SERVER_ERROR;
                    }
                    break;
            }
            return HMSSignalMethod.SDK_NOTIFICATION;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSSignalMethod.values().length];
            try {
                iArr[HMSSignalMethod.JOIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSSignalMethod.OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HMSSignalMethod.ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HMSSignalMethod.TRICKLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HMSSignalMethod.TRACK_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HMSSignalMethod.ANALYTICS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HMSSignalMethod.SERVER_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HMSSignalMethod.SDK_NOTIFICATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HMSSignalMethod.LEAVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final ErrorFactory.Action toErrorAction() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return ErrorFactory.Action.JOIN;
            case 2:
                return ErrorFactory.Action.PUBLISH;
            case 3:
                return ErrorFactory.Action.SUBSCRIBE;
            case 4:
                return ErrorFactory.Action.NONE;
            case 5:
                return ErrorFactory.Action.TRACK;
            case 6:
                return ErrorFactory.Action.NONE;
            case 7:
                return ErrorFactory.Action.NONE;
            case 8:
                return ErrorFactory.Action.NONE;
            case 9:
                return ErrorFactory.Action.NONE;
            default:
                return ErrorFactory.Action.NONE;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        String strName = name();
        Locale locale = Locale.ROOT;
        return AbstractC39421y.m125926K(AbstractC31061c.m95641q(locale, "ROOT", strName, locale, "toLowerCase(...)"), "_", "-", false);
    }
}
