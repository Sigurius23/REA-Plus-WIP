package y00;

import ge3.AbstractC15751g;
import p499t9.C33647p;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.n6[], still in use, count: 1, list:
  (r0v1 y00.n6[]) from 0x0024: INVOKE (r0v1 y00.n6[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.n6 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38908n6 {
    /* JADX INFO: Fake field, exist only in values array */
    Sku("sku"),
    /* JADX INFO: Fake field, exist only in values array */
    Tax("tax"),
    /* JADX INFO: Fake field, exist only in values array */
    Shipping("shipping");


    /* JADX INFO: renamed from: x */
    public static final C33647p f167479x = new C33647p(25);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f167481z = AbstractC15751g.m44468u(new EnumC38908n6[]{new EnumC38908n6("sku"), new EnumC38908n6("tax"), new EnumC38908n6("shipping")});

    /* JADX INFO: renamed from: w */
    public final String f167482w;

    static {
    }

    public EnumC38908n6(String str) {
        super(str, i);
        this.f167482w = str;
    }

    public static EnumC38908n6 valueOf(String str) {
        return (EnumC38908n6) Enum.valueOf(EnumC38908n6.class, str);
    }

    public static EnumC38908n6[] values() {
        return (EnumC38908n6[]) f167480y.clone();
    }
}
