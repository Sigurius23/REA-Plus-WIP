package p326mf;

import ge3.AbstractC15751g;
import i93.C18284j;
import i93.InterfaceC18281g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mf.s[], still in use, count: 1, list:
  (r0v1 mf.s[]) from 0x005f: INVOKE (r0v1 mf.s[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: mf.s */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC25499s implements Comparable, InterfaceC18281g {
    /* JADX INFO: Fake field, exist only in values array */
    INFORMATION(new C18284j(100, 199, 1)),
    SUCCESS(new C18284j(200, 299, 1)),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT(new C18284j(300, 399, 1)),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_ERROR(new C18284j(400, 499, 1)),
    SERVER_ERROR(new C18284j(500, 599, 1));


    /* JADX INFO: renamed from: x */
    public static final C25481a f99845x;

    /* JADX INFO: renamed from: w */
    public final C18284j f99848w;

    static {
        AbstractC15751g.m44468u(enumC25499sArr);
        f99845x = new C25481a();
    }

    public EnumC25499s(C18284j c18284j) {
        super(str, i);
        this.f99848w = c18284j;
    }

    public static EnumC25499s valueOf(String str) {
        return (EnumC25499s) Enum.valueOf(EnumC25499s.class, str);
    }

    public static EnumC25499s[] values() {
        return (EnumC25499s[]) f99844E.clone();
    }

    @Override // i93.InterfaceC18281g
    /* JADX INFO: renamed from: d */
    public final Comparable mo52651d() {
        return Integer.valueOf(this.f99848w.f71134x);
    }

    @Override // i93.InterfaceC18281g
    public final Comparable getStart() {
        return Integer.valueOf(this.f99848w.f71133w);
    }

    @Override // i93.InterfaceC18281g
    public final boolean isEmpty() {
        return this.f99848w.isEmpty();
    }
}
