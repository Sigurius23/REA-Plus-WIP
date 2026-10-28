package fi;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 fi.b[], still in use, count: 1, list:
  (r0v1 fi.b[]) from 0x0028: INVOKE (r0v1 fi.b[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: fi.b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC14496b {
    ENABLED(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    READ_ONLY(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_ONLY(false, true),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED(false, false);


    /* JADX INFO: renamed from: w */
    public final boolean f52928w;

    /* JADX INFO: renamed from: x */
    public final boolean f52929x;

    static {
        AbstractC15751g.m44468u(enumC14496bArr);
    }

    public EnumC14496b(boolean z4, boolean z13) {
        super(str, i);
        this.f52928w = z4;
        this.f52929x = z13;
    }

    public static EnumC14496b valueOf(String str) {
        return (EnumC14496b) Enum.valueOf(EnumC14496b.class, str);
    }

    public static EnumC14496b[] values() {
        return (EnumC14496b[]) f52927z.clone();
    }
}
