package p076d;

import java.io.IOException;
import java.io.InputStream;
import p012ab.C0682h0;

/* JADX INFO: renamed from: d.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11314t0 extends InputStream {

    /* JADX INFO: renamed from: E */
    public InputStream f36252E;

    /* JADX INFO: renamed from: w */
    public final C0682h0 f36253w;

    /* JADX INFO: renamed from: x */
    public boolean f36254x = true;

    /* JADX INFO: renamed from: y */
    public int f36255y = 0;

    /* JADX INFO: renamed from: z */
    public InterfaceC11293j f36256z;

    public C11314t0(C0682h0 c0682h0) {
        this.f36253w = c0682h0;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC11293j m30528b() throws IOException {
        C0682h0 c0682h0 = this.f36253w;
        int i13 = ((AbstractC11305p) c0682h0.f2433y).read();
        InterfaceC11307q interfaceC11307qM1687b = i13 < 0 ? null : c0682h0.m1687b(i13);
        if (interfaceC11307qM1687b == null) {
            return null;
        }
        if (interfaceC11307qM1687b instanceof InterfaceC11293j) {
            if (this.f36255y == 0) {
                return (InterfaceC11293j) interfaceC11307qM1687b;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + interfaceC11307qM1687b.getClass());
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f36252E == null) {
            if (this.f36254x) {
                InterfaceC11293j interfaceC11293jM30528b = m30528b();
                this.f36256z = interfaceC11293jM30528b;
                if (interfaceC11293jM30528b != null) {
                    this.f36254x = false;
                    this.f36252E = interfaceC11293jM30528b.mo30494a();
                }
            }
            return -1;
        }
        while (true) {
            int i13 = this.f36252E.read();
            if (i13 >= 0) {
                return i13;
            }
            this.f36255y = this.f36256z.mo30495e();
            InterfaceC11293j interfaceC11293jM30528b2 = m30528b();
            this.f36256z = interfaceC11293jM30528b2;
            if (interfaceC11293jM30528b2 == null) {
                this.f36252E = null;
                return -1;
            }
            this.f36252E = interfaceC11293jM30528b2.mo30494a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = 0;
        if (this.f36252E == null) {
            if (!this.f36254x) {
                return -1;
            }
            InterfaceC11293j interfaceC11293jM30528b = m30528b();
            this.f36256z = interfaceC11293jM30528b;
            if (interfaceC11293jM30528b == null) {
                return -1;
            }
            this.f36254x = false;
            this.f36252E = interfaceC11293jM30528b.mo30494a();
        }
        while (true) {
            int i16 = this.f36252E.read(bArr, i13 + i15, i14 - i15);
            if (i16 >= 0) {
                i15 += i16;
                if (i15 == i14) {
                    return i15;
                }
            } else {
                this.f36255y = this.f36256z.mo30495e();
                InterfaceC11293j interfaceC11293jM30528b2 = m30528b();
                this.f36256z = interfaceC11293jM30528b2;
                if (interfaceC11293jM30528b2 == null) {
                    this.f36252E = null;
                    if (i15 < 1) {
                        return -1;
                    }
                    return i15;
                }
                this.f36252E = interfaceC11293jM30528b2.mo30494a();
            }
        }
    }
}
