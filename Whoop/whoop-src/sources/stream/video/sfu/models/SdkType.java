package stream.video.sfu.models;

import com.squareup.wire.AbstractC5572c;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.InterfaceC5594y;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 stream.video.sfu.models.SdkType, still in use, count: 1, list:
  (r0v0 stream.video.sfu.models.SdkType A[DONT_INLINE]) from 0x009c: CONSTRUCTOR 
  (r1v16 j93.d A[DONT_INLINE])
  (r3v11 com.squareup.wire.x A[DONT_INLINE])
  (r0v0 stream.video.sfu.models.SdkType A[DONT_INLINE])
 A[MD:(j93.d, com.squareup.wire.x, stream.video.sfu.models.SdkType):void (m), WRAPPED] call: stream.video.sfu.models.SdkType$Companion$ADAPTER$1.<init>(j93.d, com.squareup.wire.x, stream.video.sfu.models.SdkType):void type: CONSTRUCTOR
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
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m65681d2 = {"Lstream/video/sfu/models/SdkType;", "", "Lcom/squareup/wire/y;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "SDK_TYPE_UNSPECIFIED", "SDK_TYPE_REACT", "SDK_TYPE_ANGULAR", "SDK_TYPE_ANDROID", "SDK_TYPE_IOS", "SDK_TYPE_FLUTTER", "SDK_TYPE_REACT_NATIVE", "SDK_TYPE_UNITY", "SDK_TYPE_GO", "SDK_TYPE_PLAIN_JAVASCRIPT", "SDK_TYPE_PYTHON", "SDK_TYPE_VISION_AGENTS", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SdkType implements InterfaceC5594y {
    SDK_TYPE_UNSPECIFIED(0),
    SDK_TYPE_REACT(1),
    SDK_TYPE_ANGULAR(2),
    SDK_TYPE_ANDROID(3),
    SDK_TYPE_IOS(4),
    SDK_TYPE_FLUTTER(5),
    SDK_TYPE_REACT_NATIVE(6),
    SDK_TYPE_UNITY(7),
    SDK_TYPE_GO(8),
    SDK_TYPE_PLAIN_JAVASCRIPT(9),
    SDK_TYPE_PYTHON(10),
    SDK_TYPE_VISION_AGENTS(11);

    public static final AbstractC5586q ADAPTER;
    private final int value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lstream/video/sfu/models/SdkType$Companion;", "", "<init>", "()V", "", "value", "Lstream/video/sfu/models/SdkType;", "fromValue", "(I)Lstream/video/sfu/models/SdkType;", "Lcom/squareup/wire/q;", "ADAPTER", "Lcom/squareup/wire/q;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SdkType fromValue(int value) {
            switch (value) {
                case 0:
                    return SdkType.SDK_TYPE_UNSPECIFIED;
                case 1:
                    return SdkType.SDK_TYPE_REACT;
                case 2:
                    return SdkType.SDK_TYPE_ANGULAR;
                case 3:
                    return SdkType.SDK_TYPE_ANDROID;
                case 4:
                    return SdkType.SDK_TYPE_IOS;
                case 5:
                    return SdkType.SDK_TYPE_FLUTTER;
                case 6:
                    return SdkType.SDK_TYPE_REACT_NATIVE;
                case 7:
                    return SdkType.SDK_TYPE_UNITY;
                case 8:
                    return SdkType.SDK_TYPE_GO;
                case 9:
                    return SdkType.SDK_TYPE_PLAIN_JAVASCRIPT;
                case 10:
                    return SdkType.SDK_TYPE_PYTHON;
                case 11:
                    return SdkType.SDK_TYPE_VISION_AGENTS;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SdkType.class);
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5572c(orCreateKotlinClass, enumC5593x, sdkType) { // from class: stream.video.sfu.models.SdkType$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5572c
            public SdkType fromValue(int value) {
                return SdkType.INSTANCE.fromValue(value);
            }
        };
    }

    private SdkType(int i13) {
        super(str, i);
        this.value = i13;
    }

    public static final SdkType fromValue(int i13) {
        return INSTANCE.fromValue(i13);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static SdkType valueOf(String str) {
        return (SdkType) Enum.valueOf(SdkType.class, str);
    }

    public static SdkType[] values() {
        return (SdkType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.InterfaceC5594y
    public int getValue() {
        return this.value;
    }
}
