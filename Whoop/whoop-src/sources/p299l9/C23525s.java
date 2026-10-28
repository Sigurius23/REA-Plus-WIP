package p299l9;

import android.net.Uri;
import java.util.Map;
import p499t9.InterfaceC33639k0;
import p607x8.C38059n;
import p674z8.C40171g;
import p674z8.InterfaceC40170f;
import p674z8.InterfaceC40178n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C23525s implements InterfaceC40170f {

    /* JADX INFO: renamed from: E */
    public int f93111E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC40170f f93112w;

    /* JADX INFO: renamed from: x */
    public final int f93113x;

    /* JADX INFO: renamed from: y */
    public final C23520p0 f93114y;

    /* JADX INFO: renamed from: z */
    public final byte[] f93115z;

    public C23525s(InterfaceC40170f interfaceC40170f, int i13, C23520p0 c23520p0) {
        AbstractC35849g.m113802d(i13 > 0);
        this.f93112w = interfaceC40170f;
        this.f93113x = i13;
        this.f93114y = c23520p0;
        this.f93115z = new byte[1];
        this.f93111E = i13;
    }

    @Override // p674z8.InterfaceC40170f
    public final void addTransferListener(InterfaceC40178n interfaceC40178n) {
        interfaceC40178n.getClass();
        this.f93112w.addTransferListener(interfaceC40178n);
    }

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p674z8.InterfaceC40170f
    public final Map getResponseHeaders() {
        return this.f93112w.getResponseHeaders();
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        return this.f93112w.getUri();
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) {
        throw new UnsupportedOperationException();
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = this.f93111E;
        InterfaceC40170f interfaceC40170f = this.f93112w;
        if (i15 == 0) {
            byte[] bArr2 = this.f93115z;
            if (interfaceC40170f.read(bArr2, 0, 1) != -1) {
                int i16 = (bArr2[0] & 255) << 4;
                if (i16 != 0) {
                    byte[] bArr3 = new byte[i16];
                    int i17 = i16;
                    int i18 = 0;
                    while (i17 > 0) {
                        int i19 = interfaceC40170f.read(bArr3, i18, i17);
                        if (i19 != -1) {
                            i18 += i19;
                            i17 -= i19;
                        }
                    }
                    while (i16 > 0 && bArr3[i16 - 1] == 0) {
                        i16--;
                    }
                    if (i16 > 0) {
                        C38059n c38059n = new C38059n(bArr3, i16);
                        C23520p0 c23520p0 = this.f93114y;
                        long jMax = !c23520p0.f93100L ? c23520p0.f93097I : Math.max(c23520p0.f93101M.m68104j(true), c23520p0.f93097I);
                        int iM121848a = c38059n.m121848a();
                        InterfaceC33639k0 interfaceC33639k0 = c23520p0.f93099K;
                        interfaceC33639k0.getClass();
                        interfaceC33639k0.mo36176d(c38059n, iM121848a, 0);
                        interfaceC33639k0.mo36174b(jMax, 1, iM121848a, 0, null);
                        c23520p0.f93100L = true;
                    }
                }
                this.f93111E = this.f93113x;
            }
            return -1;
        }
        int i24 = interfaceC40170f.read(bArr, i13, Math.min(this.f93111E, i14));
        if (i24 != -1) {
            this.f93111E -= i24;
        }
        return i24;
    }
}
