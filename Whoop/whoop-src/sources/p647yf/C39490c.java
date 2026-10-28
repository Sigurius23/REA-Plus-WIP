package p647yf;

import java.io.IOException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C39490c implements InterfaceC39508u {

    /* JADX INFO: renamed from: w */
    public final byte[] f169886w;

    /* JADX INFO: renamed from: x */
    public int f169887x;

    public C39490c(byte[] bArr) {
        this.f169886w = bArr;
    }

    @Override // p647yf.InterfaceC39508u
    /* JADX INFO: renamed from: c0 */
    public final long mo119145c0(C39498k sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        int i13 = this.f169887x;
        byte[] bArr = this.f169886w;
        if (i13 >= bArr.length) {
            return -1L;
        }
        long jMin = Math.min(j7, ((long) bArr.length) - ((long) i13));
        int i14 = (int) jMin;
        sink.write(bArr, this.f169887x, i14);
        this.f169887x += i14;
        return jMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
