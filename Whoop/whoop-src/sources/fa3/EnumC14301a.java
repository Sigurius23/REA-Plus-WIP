package fa3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 fa3.a[], still in use, count: 1, list:
  (r0v1 fa3.a[]) from 0x0044: INVOKE (r0v1 fa3.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: fa3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC14301a {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PARAMETER("TYPE_PARAMETER");


    /* JADX INFO: renamed from: w */
    public final String f52222w;

    static {
        AbstractC15751g.m44468u(enumC14301aArr);
    }

    public EnumC14301a(String str) {
        super(str, i);
        this.f52222w = str;
    }

    public static EnumC14301a valueOf(String str) {
        return (EnumC14301a) Enum.valueOf(EnumC14301a.class, str);
    }

    public static EnumC14301a[] values() {
        return (EnumC14301a[]) f52218G.clone();
    }
}
