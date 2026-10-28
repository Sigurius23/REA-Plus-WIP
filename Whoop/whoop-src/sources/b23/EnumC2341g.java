package b23;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b23.g[], still in use, count: 1, list:
  (r0v1 b23.g[]) from 0x0042: INVOKE (r0v1 b23.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b23.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2341g {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ASSERT(7);


    /* JADX INFO: renamed from: w */
    public final int f9267w;

    static {
        AbstractC15751g.m44468u(enumC2341gArr);
    }

    public EnumC2341g(int i13) {
        super(str, i);
        this.f9267w = i13;
    }

    public static EnumC2341g valueOf(String str) {
        return (EnumC2341g) Enum.valueOf(EnumC2341g.class, str);
    }

    public static EnumC2341g[] values() {
        return (EnumC2341g[]) f9263G.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m7217a() {
        return this.f9267w;
    }
}
