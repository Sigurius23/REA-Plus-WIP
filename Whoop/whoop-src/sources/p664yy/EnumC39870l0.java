package p664yy;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yy.l0[], still in use, count: 1, list:
  (r0v1 yy.l0[]) from 0x0026: INVOKE (r0v1 yy.l0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: yy.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC39870l0 {
    Form("application/x-www-form-urlencoded"),
    /* JADX INFO: Fake field, exist only in values array */
    MultipartForm("multipart/form-data"),
    /* JADX INFO: Fake field, exist only in values array */
    Json("application/json");


    /* JADX INFO: renamed from: w */
    public final String f172175w;

    static {
        AbstractC15751g.m44468u(enumC39870l0Arr);
    }

    public EnumC39870l0(String str) {
        super(str, i);
        this.f172175w = str;
    }

    public static EnumC39870l0 valueOf(String str) {
        return (EnumC39870l0) Enum.valueOf(EnumC39870l0.class, str);
    }

    public static EnumC39870l0[] values() {
        return (EnumC39870l0[]) f172174y.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f172175w;
    }
}
