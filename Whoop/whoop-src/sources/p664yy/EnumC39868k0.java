package p664yy;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yy.k0[], still in use, count: 1, list:
  (r0v1 yy.k0[]) from 0x0024: INVOKE (r0v1 yy.k0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: yy.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC39868k0 {
    GET("GET"),
    POST("POST"),
    DELETE("DELETE");


    /* JADX INFO: renamed from: w */
    public final String f172167w;

    static {
        AbstractC15751g.m44468u(enumC39868k0Arr);
    }

    public EnumC39868k0(String str) {
        super(str, i);
        this.f172167w = str;
    }

    public static EnumC39868k0 valueOf(String str) {
        return (EnumC39868k0) Enum.valueOf(EnumC39868k0.class, str);
    }

    public static EnumC39868k0[] values() {
        return (EnumC39868k0[]) f172163E.clone();
    }
}
