package ne3;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ne3.j */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC26620j extends InterfaceC26633p0, ReadableByteChannel {
    /* JADX INFO: renamed from: H0 */
    String mo79183H0(Charset charset);

    /* JADX INFO: renamed from: I0 */
    long mo79184I0(C26624l c26624l);

    /* JADX INFO: renamed from: M */
    String mo79187M(long j7);

    /* JADX INFO: renamed from: P0 */
    long mo79190P0(InterfaceC26618i interfaceC26618i);

    /* JADX INFO: renamed from: Q0 */
    int mo79192Q0();

    /* JADX INFO: renamed from: Y0 */
    int mo79198Y0(C26607c0 c26607c0);

    /* JADX INFO: renamed from: d0 */
    boolean mo79202d0(long j7, C26624l c26624l);

    /* JADX INFO: renamed from: e0 */
    long mo79204e0();

    /* JADX INFO: renamed from: f */
    C26616h mo79205f();

    /* JADX INFO: renamed from: f0 */
    long mo79206f0(C26624l c26624l);

    /* JADX INFO: renamed from: g0 */
    void mo79207g0(long j7);

    /* JADX INFO: renamed from: i1 */
    InputStream mo79211i1();

    /* JADX INFO: renamed from: j0 */
    void mo79212j0(C26616h c26616h, long j7);

    /* JADX INFO: renamed from: k0 */
    String mo79215k0(long j7);

    /* JADX INFO: renamed from: m0 */
    C26624l mo79218m0(long j7);

    /* JADX INFO: renamed from: n */
    byte[] mo79220n();

    /* JADX INFO: renamed from: o */
    boolean mo79222o();

    C26621j0 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j7);

    void skip(long j7);
}
