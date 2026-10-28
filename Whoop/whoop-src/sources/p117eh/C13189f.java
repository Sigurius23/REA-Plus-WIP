package p117eh;

import java.io.IOException;
import ne3.AbstractC26636r;
import ne3.C26616h;
import ne3.InterfaceC26629n0;
import p007a6.C0428i;

/* JADX INFO: renamed from: eh.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13189f extends AbstractC26636r {

    /* JADX INFO: renamed from: w */
    public final C0428i f45729w;

    /* JADX INFO: renamed from: x */
    public boolean f45730x;

    public C13189f(InterfaceC26629n0 interfaceC26629n0, C0428i c0428i) {
        super(interfaceC26629n0);
        this.f45729w = c0428i;
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e5) {
            this.f45730x = true;
            this.f45729w.invoke(e5);
        }
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e5) {
            this.f45730x = true;
            this.f45729w.invoke(e5);
        }
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0
    public final void write(C26616h c26616h, long j7) {
        if (this.f45730x) {
            c26616h.skip(j7);
            return;
        }
        try {
            super.write(c26616h, j7);
        } catch (IOException e5) {
            this.f45730x = true;
            this.f45729w.invoke(e5);
        }
    }
}
