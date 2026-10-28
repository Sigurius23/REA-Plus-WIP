package p674z8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: z8.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C40177m implements InterfaceC40170f {

    /* JADX INFO: renamed from: w */
    public final InterfaceC40170f f173385w;

    /* JADX INFO: renamed from: x */
    public long f173386x;

    /* JADX INFO: renamed from: y */
    public Uri f173387y;

    public C40177m(InterfaceC40170f interfaceC40170f) {
        interfaceC40170f.getClass();
        this.f173385w = interfaceC40170f;
        this.f173387y = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // p674z8.InterfaceC40170f
    public final void addTransferListener(InterfaceC40178n interfaceC40178n) {
        interfaceC40178n.getClass();
        this.f173385w.addTransferListener(interfaceC40178n);
    }

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        this.f173385w.close();
    }

    @Override // p674z8.InterfaceC40170f
    public final Map getResponseHeaders() {
        return this.f173385w.getResponseHeaders();
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        return this.f173385w.getUri();
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) {
        InterfaceC40170f interfaceC40170f = this.f173385w;
        this.f173387y = c40171g.f173343a;
        Map map = Collections.EMPTY_MAP;
        try {
            return interfaceC40170f.open(c40171g);
        } finally {
            Uri uri = interfaceC40170f.getUri();
            if (uri != null) {
                this.f173387y = uri;
            }
            interfaceC40170f.getResponseHeaders();
        }
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = this.f173385w.read(bArr, i13, i14);
        if (i15 != -1) {
            this.f173386x += (long) i15;
        }
        return i15;
    }
}
