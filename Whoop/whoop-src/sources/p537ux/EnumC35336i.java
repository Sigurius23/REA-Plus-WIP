package p537ux;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ux.i[], still in use, count: 1, list:
  (r0v1 ux.i[]) from 0x001e: INVOKE (r0v1 ux.i[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: ux.i */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC35336i {
    Min("MIN"),
    Full("FULL");


    /* JADX INFO: renamed from: w */
    public final String f150544w;

    static {
        AbstractC15751g.m44468u(enumC35336iArr);
    }

    public EnumC35336i(String str) {
        super(str, i);
        this.f150544w = str;
    }

    public static EnumC35336i valueOf(String str) {
        return (EnumC35336i) Enum.valueOf(EnumC35336i.class, str);
    }

    public static EnumC35336i[] values() {
        return (EnumC35336i[]) f150543z.clone();
    }
}
