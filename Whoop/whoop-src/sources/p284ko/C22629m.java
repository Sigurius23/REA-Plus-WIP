package p284ko;

import java.io.InputStream;
import p309lo.AbstractC24543a;
import p674z8.C40171g;
import p674z8.InterfaceC40170f;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ko.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C22629m extends InputStream {

    /* JADX INFO: renamed from: E */
    public final Object f89012E;

    /* JADX INFO: renamed from: F */
    public final Object f89013F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89014w;

    /* JADX INFO: renamed from: x */
    public final byte[] f89015x;

    /* JADX INFO: renamed from: y */
    public boolean f89016y;

    /* JADX INFO: renamed from: z */
    public boolean f89017z;

    public C22629m(InterfaceC22628l interfaceC22628l, C22630n c22630n) {
        this.f89014w = 0;
        this.f89016y = false;
        this.f89017z = false;
        this.f89012E = interfaceC22628l;
        this.f89013F = c22630n;
        this.f89015x = new byte[1];
    }

    /* JADX INFO: renamed from: b */
    public void m65565b() {
        if (this.f89016y) {
            return;
        }
        ((InterfaceC22628l) this.f89012E).mo65551z((C22630n) this.f89013F);
        this.f89016y = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f89014w) {
            case 0:
                if (!this.f89017z) {
                    ((InterfaceC22628l) this.f89012E).close();
                    this.f89017z = true;
                }
                break;
            default:
                if (!this.f89017z) {
                    ((InterfaceC40170f) this.f89012E).close();
                    this.f89017z = true;
                }
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f89014w) {
            case 0:
                byte[] bArr = this.f89015x;
                if (read(bArr, 0, bArr.length) == -1) {
                    return -1;
                }
                return bArr[0] & 255;
            default:
                byte[] bArr2 = this.f89015x;
                if (read(bArr2, 0, bArr2.length) == -1) {
                    return -1;
                }
                return bArr2[0] & 255;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        switch (this.f89014w) {
            case 0:
                break;
        }
        return read(bArr, 0, bArr.length);
    }

    public C22629m(InterfaceC40170f interfaceC40170f, C40171g c40171g) {
        this.f89014w = 1;
        this.f89016y = false;
        this.f89017z = false;
        this.f89012E = interfaceC40170f;
        this.f89013F = c40171g;
        this.f89015x = new byte[1];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        switch (this.f89014w) {
            case 0:
                AbstractC24543a.m71573i(!this.f89017z);
                m65565b();
                int i15 = ((InterfaceC22628l) this.f89012E).read(bArr, i13, i14);
                if (i15 == -1) {
                    return -1;
                }
                return i15;
            default:
                InterfaceC40170f interfaceC40170f = (InterfaceC40170f) this.f89012E;
                AbstractC35849g.m113807i(!this.f89017z);
                if (!this.f89016y) {
                    interfaceC40170f.open((C40171g) this.f89013F);
                    this.f89016y = true;
                }
                int i16 = interfaceC40170f.read(bArr, i13, i14);
                if (i16 == -1) {
                    return -1;
                }
                return i16;
        }
    }
}
