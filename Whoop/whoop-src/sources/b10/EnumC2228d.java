package b10;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b10.d[], still in use, count: 1, list:
  (r0v1 b10.d[]) from 0x001c: INVOKE (r0v1 b10.d[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2228d {
    PaymentElement("android_payment_element"),
    /* JADX INFO: Fake field, exist only in values array */
    CryptoOnramp("android_crypto_onramp");


    /* JADX INFO: renamed from: w */
    public final String f8870w;

    static {
        AbstractC15751g.m44468u(enumC2228dArr);
    }

    public EnumC2228d(String str) {
        super(str, i);
        this.f8870w = str;
    }

    public static EnumC2228d valueOf(String str) {
        return (EnumC2228d) Enum.valueOf(EnumC2228d.class, str);
    }

    public static EnumC2228d[] values() {
        return (EnumC2228d[]) f8869y.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8870w;
    }
}
