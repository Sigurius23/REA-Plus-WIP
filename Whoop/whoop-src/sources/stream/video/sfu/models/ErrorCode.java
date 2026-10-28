package stream.video.sfu.models;

import com.squareup.wire.AbstractC5572c;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.InterfaceC5594y;
import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import j93.InterfaceC21461d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 stream.video.sfu.models.ErrorCode, still in use, count: 1, list:
  (r0v0 stream.video.sfu.models.ErrorCode A[DONT_INLINE]) from 0x0134: CONSTRUCTOR 
  (r1v26 j93.d A[DONT_INLINE])
  (r3v21 com.squareup.wire.x A[DONT_INLINE])
  (r0v0 stream.video.sfu.models.ErrorCode A[DONT_INLINE])
 A[MD:(j93.d, com.squareup.wire.x, stream.video.sfu.models.ErrorCode):void (m), WRAPPED] call: stream.video.sfu.models.ErrorCode$Companion$ADAPTER$1.<init>(j93.d, com.squareup.wire.x, stream.video.sfu.models.ErrorCode):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, m65681d2 = {"Lstream/video/sfu/models/ErrorCode;", "", "Lcom/squareup/wire/y;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "ERROR_CODE_UNSPECIFIED", "ERROR_CODE_PUBLISH_TRACK_NOT_FOUND", "ERROR_CODE_PUBLISH_TRACKS_MISMATCH", "ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER", "ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND", "ERROR_CODE_LIVE_ENDED", "ERROR_CODE_PARTICIPANT_NOT_FOUND", "ERROR_CODE_PARTICIPANT_MIGRATING_OUT", "ERROR_CODE_PARTICIPANT_MIGRATION_FAILED", "ERROR_CODE_PARTICIPANT_MIGRATING", "ERROR_CODE_PARTICIPANT_RECONNECT_FAILED", "ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE", "ERROR_CODE_PARTICIPANT_SIGNAL_LOST", "ERROR_CODE_CALL_NOT_FOUND", "ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED", "ERROR_CODE_REQUEST_VALIDATION_FAILED", "ERROR_CODE_UNAUTHENTICATED", "ERROR_CODE_PERMISSION_DENIED", "ERROR_CODE_TOO_MANY_REQUESTS", "ERROR_CODE_INTERNAL_SERVER_ERROR", "ERROR_CODE_SFU_SHUTTING_DOWN", "ERROR_CODE_SFU_FULL", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ErrorCode implements InterfaceC5594y {
    ERROR_CODE_UNSPECIFIED(0),
    ERROR_CODE_PUBLISH_TRACK_NOT_FOUND(100),
    ERROR_CODE_PUBLISH_TRACKS_MISMATCH(101),
    ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER(102),
    ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND(103),
    ERROR_CODE_LIVE_ENDED(104),
    ERROR_CODE_PARTICIPANT_NOT_FOUND(200),
    ERROR_CODE_PARTICIPANT_MIGRATING_OUT(201),
    ERROR_CODE_PARTICIPANT_MIGRATION_FAILED(202),
    ERROR_CODE_PARTICIPANT_MIGRATING(203),
    ERROR_CODE_PARTICIPANT_RECONNECT_FAILED(204),
    ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE(205),
    ERROR_CODE_PARTICIPANT_SIGNAL_LOST(206),
    ERROR_CODE_CALL_NOT_FOUND(300),
    ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED(301),
    ERROR_CODE_REQUEST_VALIDATION_FAILED(400),
    ERROR_CODE_UNAUTHENTICATED(401),
    ERROR_CODE_PERMISSION_DENIED(403),
    ERROR_CODE_TOO_MANY_REQUESTS(429),
    ERROR_CODE_INTERNAL_SERVER_ERROR(500),
    ERROR_CODE_SFU_SHUTTING_DOWN(600),
    ERROR_CODE_SFU_FULL(700);

    public static final AbstractC5586q ADAPTER;
    private final int value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lstream/video/sfu/models/ErrorCode$Companion;", "", "<init>", "()V", "", "value", "Lstream/video/sfu/models/ErrorCode;", "fromValue", "(I)Lstream/video/sfu/models/ErrorCode;", "Lcom/squareup/wire/q;", "ADAPTER", "Lcom/squareup/wire/q;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorCode fromValue(int value) {
            if (value == 0) {
                return ErrorCode.ERROR_CODE_UNSPECIFIED;
            }
            if (value == 403) {
                return ErrorCode.ERROR_CODE_PERMISSION_DENIED;
            }
            if (value == 429) {
                return ErrorCode.ERROR_CODE_TOO_MANY_REQUESTS;
            }
            if (value == 500) {
                return ErrorCode.ERROR_CODE_INTERNAL_SERVER_ERROR;
            }
            if (value == 600) {
                return ErrorCode.ERROR_CODE_SFU_SHUTTING_DOWN;
            }
            if (value == 700) {
                return ErrorCode.ERROR_CODE_SFU_FULL;
            }
            if (value == 300) {
                return ErrorCode.ERROR_CODE_CALL_NOT_FOUND;
            }
            if (value == 301) {
                return ErrorCode.ERROR_CODE_CALL_PARTICIPANT_LIMIT_REACHED;
            }
            if (value == 400) {
                return ErrorCode.ERROR_CODE_REQUEST_VALIDATION_FAILED;
            }
            if (value == 401) {
                return ErrorCode.ERROR_CODE_UNAUTHENTICATED;
            }
            switch (value) {
                case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                    return ErrorCode.ERROR_CODE_PUBLISH_TRACK_NOT_FOUND;
                case 101:
                    return ErrorCode.ERROR_CODE_PUBLISH_TRACKS_MISMATCH;
                case 102:
                    return ErrorCode.ERROR_CODE_PUBLISH_TRACK_OUT_OF_ORDER;
                case 103:
                    return ErrorCode.ERROR_CODE_PUBLISH_TRACK_VIDEO_LAYER_NOT_FOUND;
                case 104:
                    return ErrorCode.ERROR_CODE_LIVE_ENDED;
                default:
                    switch (value) {
                        case 200:
                            return ErrorCode.ERROR_CODE_PARTICIPANT_NOT_FOUND;
                        case 201:
                            return ErrorCode.ERROR_CODE_PARTICIPANT_MIGRATING_OUT;
                        case 202:
                            return ErrorCode.ERROR_CODE_PARTICIPANT_MIGRATION_FAILED;
                        case 203:
                            return ErrorCode.ERROR_CODE_PARTICIPANT_MIGRATING;
                        case 204:
                            return ErrorCode.ERROR_CODE_PARTICIPANT_RECONNECT_FAILED;
                        case 205:
                            return ErrorCode.ERROR_CODE_PARTICIPANT_MEDIA_TRANSPORT_FAILURE;
                        case 206:
                            return ErrorCode.ERROR_CODE_PARTICIPANT_SIGNAL_LOST;
                        default:
                            return null;
                    }
            }
        }

        private Companion() {
        }
    }

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ErrorCode.class);
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5572c(orCreateKotlinClass, enumC5593x, errorCode) { // from class: stream.video.sfu.models.ErrorCode$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5572c
            public ErrorCode fromValue(int value) {
                return ErrorCode.INSTANCE.fromValue(value);
            }
        };
    }

    private ErrorCode(int i13) {
        super(str, i);
        this.value = i13;
    }

    public static final ErrorCode fromValue(int i13) {
        return INSTANCE.fromValue(i13);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.InterfaceC5594y
    public int getValue() {
        return this.value;
    }
}
