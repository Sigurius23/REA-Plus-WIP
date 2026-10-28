package y00;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.j8[], still in use, count: 1, list:
  (r0v1 y00.j8[]) from 0x0016: INVOKE (r0v1 y00.j8[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: y00.j8 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38872j8 {
    /* JADX INFO: Fake field, exist only in values array */
    EMAIL("EMAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    SMS("SMS");

    static {
        AbstractC15751g.m44468u(enumC38872j8Arr);
    }

    public EnumC38872j8(String str) {
        super(str, i);
    }

    public static EnumC38872j8 valueOf(String str) {
        return (EnumC38872j8) Enum.valueOf(EnumC38872j8.class, str);
    }

    public static EnumC38872j8[] values() {
        return (EnumC38872j8[]) f167319w.clone();
    }
}
