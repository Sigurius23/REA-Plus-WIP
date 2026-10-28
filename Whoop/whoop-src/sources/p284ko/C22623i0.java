package p284ko;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ko.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C22623i0 implements InterfaceC22628l {

    /* JADX INFO: renamed from: w */
    public final InterfaceC22628l f88996w;

    /* JADX INFO: renamed from: x */
    public long f88997x;

    /* JADX INFO: renamed from: y */
    public Uri f88998y;

    public C22623i0(InterfaceC22628l interfaceC22628l) {
        interfaceC22628l.getClass();
        this.f88996w = interfaceC22628l;
        this.f88998y = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        this.f88996w.close();
    }

    @Override // p284ko.InterfaceC22628l
    public final Map getResponseHeaders() {
        return this.f88996w.getResponseHeaders();
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        return this.f88996w.getUri();
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = this.f88996w.read(bArr, i13, i14);
        if (i15 != -1) {
            this.f88997x += (long) i15;
        }
        return i15;
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: y */
    public final void mo65561y(InterfaceC22625j0 interfaceC22625j0) {
        interfaceC22625j0.getClass();
        this.f88996w.mo65561y(interfaceC22625j0);
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) {
        this.f88998y = c22630n.f89019a;
        Map map = Collections.EMPTY_MAP;
        InterfaceC22628l interfaceC22628l = this.f88996w;
        long jMo65551z = interfaceC22628l.mo65551z(c22630n);
        Uri uri = interfaceC22628l.getUri();
        uri.getClass();
        this.f88998y = uri;
        interfaceC22628l.getResponseHeaders();
        return jMo65551z;
    }
}
