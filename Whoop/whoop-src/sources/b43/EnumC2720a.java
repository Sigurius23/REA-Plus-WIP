package b43;

import ge3.AbstractC15751g;
import me3.EnumC25478a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b43.a[], still in use, count: 1, list:
  (r0v1 b43.a[]) from 0x0026: INVOKE (r0v1 b43.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2720a {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(EnumC25478a.f99796w),
    BASIC(EnumC25478a.f99797x),
    /* JADX INFO: Fake field, exist only in values array */
    BODY(EnumC25478a.f99799z);


    /* JADX INFO: renamed from: w */
    public final EnumC25478a f10729w;

    static {
        AbstractC15751g.m44468u(enumC2720aArr);
    }

    public EnumC2720a(EnumC25478a enumC25478a) {
        super(str, i);
        this.f10729w = enumC25478a;
    }

    public static EnumC2720a valueOf(String str) {
        return (EnumC2720a) Enum.valueOf(EnumC2720a.class, str);
    }

    public static EnumC2720a[] values() {
        return (EnumC2720a[]) f10728y.clone();
    }
}
