package lb3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lb3.g1[], still in use, count: 1, list:
  (r0v1 lb3.g1[]) from 0x002a: INVOKE (r0v1 lb3.g1[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: lb3.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC23776g1 {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);


    /* JADX INFO: renamed from: w */
    public final String f94154w;

    /* JADX INFO: renamed from: x */
    public final boolean f94155x;

    static {
        AbstractC15751g.m44468u(enumC23776g1Arr);
    }

    public EnumC23776g1(String str, boolean z4) {
        super(str, i);
        this.f94154w = str;
        this.f94155x = z4;
    }

    public static EnumC23776g1 valueOf(String str) {
        return (EnumC23776g1) Enum.valueOf(EnumC23776g1.class, str);
    }

    public static EnumC23776g1[] values() {
        return (EnumC23776g1[]) f94151F.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f94154w;
    }
}
