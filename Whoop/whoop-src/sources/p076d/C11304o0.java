package p076d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import ro.C31624i;

/* JADX INFO: renamed from: d.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11304o0 extends AbstractC11285g {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f36233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11304o0(byte[] bArr, int i13) {
        super(bArr);
        this.f36233d = i13;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        switch (this.f36233d) {
            case 0:
                break;
        }
        return C31624i.m97696b(this.f36207a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        switch (this.f36233d) {
            case 0:
                c31624i.m97707f(3, z4, this.f36207a);
                break;
            default:
                byte[] bArr = this.f36207a;
                int i13 = bArr[0] & 255;
                int length = bArr.length;
                int i14 = length - 1;
                byte b = bArr[i14];
                byte b6 = (byte) ((255 << i13) & b);
                if (b != b6) {
                    c31624i.m97709n(3, z4);
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c31624i.f130665x;
                    c31624i.m97705d(length);
                    byteArrayOutputStream.write(bArr, 0, i14);
                    byteArrayOutputStream.write(b6);
                } else {
                    c31624i.m97707f(3, z4, bArr);
                }
                break;
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        switch (this.f36233d) {
        }
        return false;
    }

    @Override // p076d.AbstractC11285g, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        switch (this.f36233d) {
            case 1:
                return this;
            default:
                return super.mo30476j();
        }
    }

    @Override // p076d.AbstractC11285g, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public final AbstractC11272b1 mo30477k() {
        int i13 = this.f36233d;
        return this;
    }
}
