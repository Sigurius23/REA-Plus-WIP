package as;

import java.io.IOException;
import java.io.OutputStream;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: as.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C1937a extends OutputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7695w;

    public /* synthetic */ C1937a(int i13) {
        this.f7695w = i13;
    }

    /* JADX INFO: renamed from: b */
    private final void m5937b(int i13) {
    }

    /* JADX INFO: renamed from: h */
    private final void m5938h(int i13) {
    }

    public String toString() {
        switch (this.f7695w) {
            case 0:
                return "ByteStreams.nullOutputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        int i14 = this.f7695w;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f7695w) {
            case 0:
                bArr.getClass();
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i13, int i14) throws IOException {
        switch (this.f7695w) {
            case 0:
                bArr.getClass();
                AbstractC31484o.m96960l(i13, i14 + i13, bArr.length);
                break;
            default:
                super.write(bArr, i13, i14);
                break;
        }
    }
}
