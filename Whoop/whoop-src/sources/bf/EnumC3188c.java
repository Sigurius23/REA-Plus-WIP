package bf;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v22 bf.c[], still in use, count: 1, list:
  (r0v22 bf.c[]) from 0x0122: INVOKE (r0v22 bf.c[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: bf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC3188c implements InterfaceC3186a {
    /* JADX INFO: Fake field, exist only in values array */
    WAITER("B"),
    /* JADX INFO: Fake field, exist only in values array */
    PAGINATOR("C"),
    RETRY_MODE_STANDARD("E"),
    RETRY_MODE_ADAPTIVE("F"),
    /* JADX INFO: Fake field, exist only in values array */
    GZIP_REQUEST_COMPRESSION("L"),
    /* JADX INFO: Fake field, exist only in values array */
    PROTOCOL_RPC_V2_CBOR("M"),
    SERVICE_ENDPOINT_OVERRIDE("N"),
    ACCOUNT_ID_BASED_ENDPOINT("O"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCOUNT_ID_MODE_PREFERRED("P"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCOUNT_ID_MODE_DISABLED("Q"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCOUNT_ID_MODE_REQUIRED("R"),
    SIGV4A_SIGNING("S"),
    RESOLVED_ACCOUNT_ID("T"),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXIBLE_CHECKSUMS_REQ_CRC32("U"),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXIBLE_CHECKSUMS_REQ_CRC32C("V"),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXIBLE_CHECKSUMS_REQ_SHA1("X"),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXIBLE_CHECKSUMS_REQ_SHA256("Y"),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXIBLE_CHECKSUMS_REQ_WHEN_SUPPORTED("Z"),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXIBLE_CHECKSUMS_REQ_WHEN_REQUIRED("a"),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED("b"),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED("c"),
    /* JADX INFO: Fake field, exist only in values array */
    BEARER_SERVICE_ENV_VARS("3");


    /* JADX INFO: renamed from: w */
    public final String f12503w;

    static {
        AbstractC15751g.m44468u(enumC3188cArr);
    }

    public EnumC3188c(String str) {
        super(str, i);
        this.f12503w = str;
    }

    public static EnumC3188c valueOf(String str) {
        return (EnumC3188c) Enum.valueOf(EnumC3188c.class, str);
    }

    public static EnumC3188c[] values() {
        return (EnumC3188c[]) f12499H.clone();
    }

    @Override // bf.InterfaceC3186a
    /* JADX INFO: renamed from: a */
    public final String mo9168a() {
        return this.f12503w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12503w;
    }
}
