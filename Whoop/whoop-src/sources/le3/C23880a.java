package le3;

import java.io.Closeable;
import java.util.zip.Deflater;
import ne3.AbstractC26604b;
import ne3.C26616h;
import ne3.C26626m;
import ne3.C26644x;

/* JADX INFO: renamed from: le3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C23880a implements Closeable {

    /* JADX INFO: renamed from: E */
    public Closeable f94429E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94430w;

    /* JADX INFO: renamed from: x */
    public final boolean f94431x;

    /* JADX INFO: renamed from: y */
    public final C26616h f94432y;

    /* JADX INFO: renamed from: z */
    public Object f94433z;

    public C23880a(boolean z4, int i13) {
        this.f94430w = i13;
        switch (i13) {
            case 1:
                this.f94431x = z4;
                this.f94432y = new C26616h();
                break;
            default:
                this.f94431x = z4;
                C26616h c26616h = new C26616h();
                this.f94432y = c26616h;
                Deflater deflater = new Deflater(-1, true);
                this.f94433z = deflater;
                this.f94429E = new C26626m(AbstractC26604b.m79157b(c26616h), deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f94430w) {
            case 0:
                ((C26626m) this.f94429E).close();
                break;
            default:
                C26644x c26644x = (C26644x) this.f94429E;
                if (c26644x != null) {
                    c26644x.close();
                }
                this.f94429E = null;
                this.f94433z = null;
                break;
        }
    }
}
