package q20;

import ge3.AbstractC15751g;
import y00.EnumC38910o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q20.h[], still in use, count: 1, list:
  (r0v1 q20.h[]) from 0x0029: INVOKE (r0v1 q20.h[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: q20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC29820h {
    f121893x(EnumC38910o.OffSession),
    f121894y(EnumC38910o.Blank),
    f121895z(null);


    /* JADX INFO: renamed from: w */
    public final EnumC38910o f121896w;

    static {
        AbstractC15751g.m44468u(enumC29820hArr);
    }

    public EnumC29820h(EnumC38910o enumC38910o) {
        super(str, i);
        this.f121896w = enumC38910o;
    }

    public static EnumC29820h valueOf(String str) {
        return (EnumC29820h) Enum.valueOf(EnumC29820h.class, str);
    }

    public static EnumC29820h[] values() {
        return (EnumC29820h[]) f121892E.clone();
    }
}
