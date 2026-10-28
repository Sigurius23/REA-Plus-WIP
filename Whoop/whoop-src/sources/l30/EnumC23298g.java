package l30;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l30.g[], still in use, count: 1, list:
  (r0v1 l30.g[]) from 0x002e: INVOKE (r0v1 l30.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: l30.g */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC23298g {
    /* JADX INFO: Fake field, exist only in values array */
    MARKET_OR_REGION_RESTRICTION("RE01"),
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM_VERSION("RE02"),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION("RE03"),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE("RE04");


    /* JADX INFO: renamed from: w */
    public final String f92340w;

    static {
        AbstractC15751g.m44468u(enumC23298gArr);
    }

    public EnumC23298g(String str) {
        super(str, i);
        this.f92340w = str;
    }

    public static EnumC23298g valueOf(String str) {
        return (EnumC23298g) Enum.valueOf(EnumC23298g.class, str);
    }

    public static EnumC23298g[] values() {
        return (EnumC23298g[]) f92339x.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f92340w;
    }
}
