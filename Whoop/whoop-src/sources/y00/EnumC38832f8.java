package y00;

import ge3.AbstractC15751g;
import p499t9.C33647p;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.f8[], still in use, count: 1, list:
  (r0v1 y00.f8[]) from 0x0046: INVOKE (r0v1 y00.f8[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.f8 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38832f8 {
    Card("card"),
    BankAccount("bank_account"),
    /* JADX INFO: Fake field, exist only in values array */
    Pii("pii"),
    /* JADX INFO: Fake field, exist only in values array */
    Account("account"),
    /* JADX INFO: Fake field, exist only in values array */
    CvcUpdate("cvc_update"),
    /* JADX INFO: Fake field, exist only in values array */
    Person("person");


    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ C33617b f167150F;

    /* JADX INFO: renamed from: x */
    public static final C33647p f167151x = new C33647p(27);

    /* JADX INFO: renamed from: w */
    public final String f167154w;

    static {
        f167150F = AbstractC15751g.m44468u(new EnumC38832f8[]{r0, r1, new EnumC38832f8("pii"), new EnumC38832f8("account"), new EnumC38832f8("cvc_update"), new EnumC38832f8("person")});
    }

    public EnumC38832f8(String str) {
        super(str, i);
        this.f167154w = str;
    }

    public static EnumC38832f8 valueOf(String str) {
        return (EnumC38832f8) Enum.valueOf(EnumC38832f8.class, str);
    }

    public static EnumC38832f8[] values() {
        return (EnumC38832f8[]) f167149E.clone();
    }
}
