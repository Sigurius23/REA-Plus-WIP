package w23;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 w23.t[], still in use, count: 1, list:
  (r0v1 w23.t[]) from 0x0024: INVOKE (r0v1 w23.t[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: w23.t */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC36762t {
    CONNECTED("CONNECTED"),
    FAILED("FAILED"),
    NOT_CONNECTED("NOT_CONNECTED");


    /* JADX INFO: renamed from: w */
    public final String f157330w;

    static {
        AbstractC15751g.m44468u(enumC36762tArr);
    }

    public EnumC36762t(String str) {
        super(str, i);
        this.f157330w = str;
    }

    public static EnumC36762t valueOf(String str) {
        return (EnumC36762t) Enum.valueOf(EnumC36762t.class, str);
    }

    public static EnumC36762t[] values() {
        return (EnumC36762t[]) f157326E.clone();
    }
}
