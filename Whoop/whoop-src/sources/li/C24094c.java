package li;

import android.media.MediaDataSource;
import java.io.IOException;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26633p0;

/* JADX INFO: renamed from: li.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C24094c implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final MediaDataSource f95173w;

    /* JADX INFO: renamed from: x */
    public final long f95174x;

    /* JADX INFO: renamed from: y */
    public long f95175y;

    public C24094c(MediaDataSource mediaDataSource) {
        this.f95173w = mediaDataSource;
        this.f95174x = mediaDataSource.getSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f95173w.close();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h c26616h, long j7) throws IOException {
        long j13 = this.f95175y;
        long j14 = this.f95174x;
        if (j13 >= j14) {
            return -1L;
        }
        int iMin = (int) Math.min(j7, j14 - j13);
        byte[] bArr = new byte[iMin];
        int at3 = this.f95173w.readAt(this.f95175y, bArr, 0, iMin);
        long j15 = at3;
        this.f95175y += j15;
        c26616h.m134463write(bArr, 0, at3);
        return j15;
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }
}
