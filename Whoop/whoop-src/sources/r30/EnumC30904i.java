package r30;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 r30.i[], still in use, count: 1, list:
  (r0v1 r30.i[]) from 0x006a: INVOKE (r0v1 r30.i[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: r30.i */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC30904i {
    /* JADX INFO: Fake field, exist only in values array */
    InvalidMessageReceived(101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes"),
    /* JADX INFO: Fake field, exist only in values array */
    UnsupportedMessageVersion(102, "Message Version Number received is not valid for the receiving component."),
    /* JADX INFO: Fake field, exist only in values array */
    RequiredDataElementMissing(201, "A message element required as defined in Table A.1 is missing from the message."),
    UnrecognizedCriticalMessageExtensions(202, "Critical message extension not recognised."),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidDataElementFormat(203, "Data element not in the required format or value is invalid as defined in Table A.1"),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidTransactionId(301, "Transaction ID received is not valid for the receiving component."),
    DataDecryptionFailure(302, "Data could not be decrypted by the receiving system due to technical or other reason."),
    /* JADX INFO: Fake field, exist only in values array */
    TransactionTimedout(402, "Transaction timed-out.");


    /* JADX INFO: renamed from: w */
    public final int f127453w;

    /* JADX INFO: renamed from: x */
    public final String f127454x;

    static {
        AbstractC15751g.m44468u(enumC30904iArr);
    }

    public EnumC30904i(int i13, String str) {
        super(str, i);
        this.f127453w = i13;
        this.f127454x = str;
    }

    public static EnumC30904i valueOf(String str) {
        return (EnumC30904i) Enum.valueOf(EnumC30904i.class, str);
    }

    public static EnumC30904i[] values() {
        return (EnumC30904i[]) f127450E.clone();
    }
}
