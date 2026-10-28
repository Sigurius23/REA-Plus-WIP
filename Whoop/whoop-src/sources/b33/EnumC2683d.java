package b33;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b33.d[], still in use, count: 1, list:
  (r0v1 b33.d[]) from 0x0058: INVOKE (r0v1 b33.d[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b33.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2683d implements InterfaceC2685f {
    JOIN_INITIATED("JoinInitiated"),
    COORDINATOR_JOIN("CoordinatorJoin"),
    WS_JOIN("WSJoin"),
    PEER_CONNECTION_CONNECT("PeerConnectionConnect"),
    FIRST_AUDIO_FRAME_RENDERED("FirstAudioFrame"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_VIDEO_FRAME_RENDERED("FirstVideoFrame"),
    MEDIA_DEVICE_PERMISSION("MediaDevicePermission");


    /* JADX INFO: renamed from: w */
    public final String f10566w;

    static {
        AbstractC15751g.m44468u(enumC2683dArr);
    }

    public EnumC2683d(String str) {
        super(str, i);
        this.f10566w = str;
    }

    public static EnumC2683d valueOf(String str) {
        return (EnumC2683d) Enum.valueOf(EnumC2683d.class, str);
    }

    public static EnumC2683d[] values() {
        return (EnumC2683d[]) f10562H.clone();
    }

    @Override // b33.InterfaceC2685f
    public final String getValue() {
        return this.f10566w;
    }
}
