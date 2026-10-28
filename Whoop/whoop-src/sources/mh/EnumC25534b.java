package mh;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mh.b[], still in use, count: 1, list:
  (r0v1 mh.b[]) from 0x002a: INVOKE (r0v1 mh.b[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: mh.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC25534b {
    ENABLED(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    READ_ONLY(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: w */
    public final boolean f100053w;

    /* JADX INFO: renamed from: x */
    public final boolean f100054x;

    static {
        AbstractC15751g.m44468u(enumC25534bArr);
    }

    public EnumC25534b(boolean z4, boolean z13) {
        super(str, i);
        this.f100053w = z4;
        this.f100054x = z13;
    }

    public static EnumC25534b valueOf(String str) {
        return (EnumC25534b) Enum.valueOf(EnumC25534b.class, str);
    }

    public static EnumC25534b[] values() {
        return (EnumC25534b[]) f100050E.clone();
    }
}
