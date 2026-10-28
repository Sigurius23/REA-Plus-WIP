package ne3;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: ne3.i */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC26618i extends InterfaceC26629n0, WritableByteChannel {
    /* JADX INFO: renamed from: H */
    InterfaceC26618i mo79182H(long j7);

    /* JADX INFO: renamed from: L0 */
    InterfaceC26618i mo79186L0(int i13, int i14, String str);

    /* JADX INFO: renamed from: N0 */
    long mo79189N0(InterfaceC26633p0 interfaceC26633p0);

    /* JADX INFO: renamed from: Q */
    InterfaceC26618i mo79191Q(C26624l c26624l);

    /* JADX INFO: renamed from: S */
    InterfaceC26618i mo79193S(String str);

    /* JADX INFO: renamed from: e */
    InterfaceC26618i mo79203e();

    /* JADX INFO: renamed from: f */
    C26616h mo79205f();

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: h0 */
    InterfaceC26618i mo79209h0(long j7);

    /* JADX INFO: renamed from: v0 */
    InterfaceC26618i mo79233v0(int i13);

    InterfaceC26618i write(byte[] bArr);

    InterfaceC26618i write(byte[] bArr, int i13, int i14);

    InterfaceC26618i writeByte(int i13);

    InterfaceC26618i writeInt(int i13);

    InterfaceC26618i writeShort(int i13);
}
