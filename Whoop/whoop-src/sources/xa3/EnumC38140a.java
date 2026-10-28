package xa3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xa3.a[], still in use, count: 1, list:
  (r0v1 xa3.a[]) from 0x0021: INVOKE (r0v1 xa3.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: xa3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC38140a {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: w */
    public final boolean f163287w;

    /* JADX INFO: renamed from: x */
    public final boolean f163288x;

    static {
        AbstractC15751g.m44468u(enumC38140aArr);
    }

    public /* synthetic */ EnumC38140a(int i13) {
        this((i13 & 1) == 0, false);
    }

    public static EnumC38140a valueOf(String str) {
        return (EnumC38140a) Enum.valueOf(EnumC38140a.class, str);
    }

    public static EnumC38140a[] values() {
        return (EnumC38140a[]) f163286z.clone();
    }

    public EnumC38140a(boolean z4, boolean z13) {
        super(str, i);
        this.f163287w = z4;
        this.f163288x = z13;
    }
}
