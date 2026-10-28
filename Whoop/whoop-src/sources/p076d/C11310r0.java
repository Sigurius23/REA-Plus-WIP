package p076d;

import c13.AbstractC3855a;
import java.io.IOException;
import java.io.InputStream;
import p001a.C0002v;

/* JADX INFO: renamed from: d.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11310r0 implements InterfaceC11293j {

    /* JADX INFO: renamed from: a */
    public final C11273c f36241a;

    /* JADX INFO: renamed from: b */
    public int f36242b = 0;

    public C11310r0(C11273c c11273c) {
        this.f36241a = c11273c;
    }

    @Override // p076d.InterfaceC11293j
    /* JADX INFO: renamed from: a */
    public final InputStream mo30494a() throws IOException {
        C11273c c11273c = this.f36241a;
        int i13 = c11273c.f36189z;
        if (i13 < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i14 = c11273c.read();
        this.f36242b = i14;
        if (i14 > 0) {
            if (i13 < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i14 > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return c11273c;
    }

    @Override // p076d.InterfaceC11282f
    /* JADX INFO: renamed from: b */
    public final AbstractC11272b1 mo30486b() {
        return AbstractC11285g.m30493l(this.f36241a.m30484h());
    }

    @Override // p076d.InterfaceC11307q
    /* JADX INFO: renamed from: d */
    public final AbstractC11272b1 mo30482d() {
        try {
            return mo30486b();
        } catch (IOException e5) {
            throw new C0002v(e5, AbstractC3855a.m11824h(e5, new StringBuilder("IOException converting stream to byte array: ")));
        }
    }

    @Override // p076d.InterfaceC11293j
    /* JADX INFO: renamed from: e */
    public final int mo30495e() {
        return this.f36242b;
    }
}
