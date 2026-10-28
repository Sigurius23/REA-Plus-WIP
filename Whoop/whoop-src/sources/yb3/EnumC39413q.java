package yb3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yb3.q[], still in use, count: 1, list:
  (r0v1 yb3.q[]) from 0x0048: INVOKE (r0v1 yb3.q[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: yb3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC39413q implements InterfaceC39400d {
    IGNORE_CASE(2),
    /* JADX INFO: Fake field, exist only in values array */
    MULTILINE(8),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4),
    /* JADX INFO: Fake field, exist only in values array */
    DOT_MATCHES_ALL(32),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(128);


    /* JADX INFO: renamed from: w */
    public final int f169591w;

    static {
        AbstractC15751g.m44468u(enumC39413qArr);
    }

    public EnumC39413q(int i13) {
        super(str, i);
        this.f169591w = i13;
    }

    public static EnumC39413q valueOf(String str) {
        return (EnumC39413q) Enum.valueOf(EnumC39413q.class, str);
    }

    public static EnumC39413q[] values() {
        return (EnumC39413q[]) f169590y.clone();
    }
}
