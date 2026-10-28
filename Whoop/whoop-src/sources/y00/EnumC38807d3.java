package y00;

import ge3.AbstractC15751g;
import p499t9.C33623c0;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.d3[], still in use, count: 1, list:
  (r0v1 y00.d3[]) from 0x004c: INVOKE (r0v1 y00.d3[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.d3 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38807d3 {
    /* JADX INFO: Fake field, exist only in values array */
    Duplicate("duplicate"),
    /* JADX INFO: Fake field, exist only in values array */
    Fraudulent("fraudulent"),
    /* JADX INFO: Fake field, exist only in values array */
    RequestedByCustomer("requested_by_customer"),
    /* JADX INFO: Fake field, exist only in values array */
    Abandoned("abandoned"),
    /* JADX INFO: Fake field, exist only in values array */
    FailedInvoice("failed_invoice"),
    /* JADX INFO: Fake field, exist only in values array */
    VoidInvoice("void_invoice"),
    /* JADX INFO: Fake field, exist only in values array */
    Automatic("automatic");


    /* JADX INFO: renamed from: x */
    public static final C33623c0 f167003x = new C33623c0();

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f167005z = AbstractC15751g.m44468u(new EnumC38807d3[]{new EnumC38807d3("duplicate"), new EnumC38807d3("fraudulent"), new EnumC38807d3("requested_by_customer"), new EnumC38807d3("abandoned"), new EnumC38807d3("failed_invoice"), new EnumC38807d3("void_invoice"), new EnumC38807d3("automatic")});

    /* JADX INFO: renamed from: w */
    public final String f167006w;

    static {
    }

    public EnumC38807d3(String str) {
        super(str, i);
        this.f167006w = str;
    }

    public static EnumC38807d3 valueOf(String str) {
        return (EnumC38807d3) Enum.valueOf(EnumC38807d3.class, str);
    }

    public static EnumC38807d3[] values() {
        return (EnumC38807d3[]) f167004y.clone();
    }
}
