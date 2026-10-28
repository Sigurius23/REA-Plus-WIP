package ie;

import bf.InterfaceC3186a;
import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ie.b[], still in use, count: 1, list:
  (r0v1 ie.b[]) from 0x001c: INVOKE (r0v1 ie.b[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: ie.b */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC18439b implements InterfaceC3186a {
    S3_EXPRESS_BUCKET("J"),
    /* JADX INFO: Fake field, exist only in values array */
    DDB_MAPPER("d");


    /* JADX INFO: renamed from: w */
    public final String f71798w;

    static {
        AbstractC15751g.m44468u(enumC18439bArr);
    }

    public EnumC18439b(String str) {
        super(str, i);
        this.f71798w = str;
    }

    public static EnumC18439b valueOf(String str) {
        return (EnumC18439b) Enum.valueOf(EnumC18439b.class, str);
    }

    public static EnumC18439b[] values() {
        return (EnumC18439b[]) f71797y.clone();
    }

    @Override // bf.InterfaceC3186a
    /* JADX INFO: renamed from: a */
    public final String mo9168a() {
        return this.f71798w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f71798w;
    }
}
