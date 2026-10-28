package y00;

import ge3.AbstractC15751g;
import p499t9.C33623c0;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.z[], still in use, count: 1, list:
  (r0v1 y00.z[]) from 0x0038: INVOKE (r0v1 y00.z[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.z */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC39009z {
    /* JADX INFO: Fake field, exist only in values array */
    Credit("CREDIT", EnumC38863j.Credit),
    /* JADX INFO: Fake field, exist only in values array */
    Debit("DEBIT", EnumC38863j.Debit),
    /* JADX INFO: Fake field, exist only in values array */
    Prepaid("PREPAID", EnumC38863j.Prepaid),
    Unknown("UNKNOWN", EnumC38863j.Unknown);


    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ C33617b f167902F;

    /* JADX INFO: renamed from: y */
    public static final C33623c0 f167903y = new C33623c0();

    /* JADX INFO: renamed from: w */
    public final String f167905w;

    /* JADX INFO: renamed from: x */
    public final EnumC38863j f167906x;

    static {
        f167902F = AbstractC15751g.m44468u(new EnumC39009z[]{r0, r1, r2, r3});
    }

    public EnumC39009z(String str, EnumC38863j enumC38863j) {
        super(str, i);
        this.f167905w = str;
        this.f167906x = enumC38863j;
    }

    public static EnumC39009z valueOf(String str) {
        return (EnumC39009z) Enum.valueOf(EnumC39009z.class, str);
    }

    public static EnumC39009z[] values() {
        return (EnumC39009z[]) f167901E.clone();
    }
}
