package ce3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ce3.a[], still in use, count: 1, list:
  (r0v1 ce3.a[]) from 0x0088: INVOKE (r0v1 ce3.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: ce3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC4496a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS_TIMEOUT(4),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_CLOSED(5),
    /* JADX INFO: Fake field, exist only in values array */
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    /* JADX INFO: Fake field, exist only in values array */
    COMPRESSION_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_ERROR(10),
    /* JADX INFO: Fake field, exist only in values array */
    ENHANCE_YOUR_CALM(11),
    /* JADX INFO: Fake field, exist only in values array */
    INADEQUATE_SECURITY(12),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: x */
    public static final C4501c0 f18114x;

    /* JADX INFO: renamed from: w */
    public final int f18117w;

    static {
        AbstractC15751g.m44468u(enumC4496aArr);
        f18114x = new C4501c0();
    }

    public EnumC4496a(int i13) {
        super(str, i);
        this.f18117w = i13;
    }

    public static EnumC4496a valueOf(String str) {
        return (EnumC4496a) Enum.valueOf(EnumC4496a.class, str);
    }

    public static EnumC4496a[] values() {
        return (EnumC4496a[]) f18113I.clone();
    }
}
