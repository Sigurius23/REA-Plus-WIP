package k20;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 k20.m[], still in use, count: 1, list:
  (r0v1 k20.m[]) from 0x001c: INVOKE (r0v1 k20.m[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: k20.m */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC22148m {
    Edit("edit"),
    /* JADX INFO: Fake field, exist only in values array */
    Add("add");


    /* JADX INFO: renamed from: w */
    public final String f85902w;

    static {
        AbstractC15751g.m44468u(enumC22148mArr);
    }

    public EnumC22148m(String str) {
        super(str, i);
        this.f85902w = str;
    }

    public static EnumC22148m valueOf(String str) {
        return (EnumC22148m) Enum.valueOf(EnumC22148m.class, str);
    }

    public static EnumC22148m[] values() {
        return (EnumC22148m[]) f85901y.clone();
    }
}
