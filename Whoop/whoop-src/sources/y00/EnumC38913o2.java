package y00;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.o2[], still in use, count: 1, list:
  (r0v1 y00.o2[]) from 0x0036: INVOKE (r0v1 y00.o2[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: y00.o2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38913o2 {
    NotSupportedInElementsSession("not_supported_in_elements_session"),
    LinkConfiguration("link_configuration"),
    CardBrandFiltering("card_brand_filtering"),
    BillingDetailsCollection("billing_details_collection");


    /* JADX INFO: renamed from: w */
    public final String f167509w;

    static {
        AbstractC15751g.m44468u(enumC38913o2Arr);
    }

    public EnumC38913o2(String str) {
        super(str, i);
        this.f167509w = str;
    }

    public static EnumC38913o2 valueOf(String str) {
        return (EnumC38913o2) Enum.valueOf(EnumC38913o2.class, str);
    }

    public static EnumC38913o2[] values() {
        return (EnumC38913o2[]) f167505F.clone();
    }
}
