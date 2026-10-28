package p076d;

import c13.AbstractC3855a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p001a.C0002v;
import p012ab.C0682h0;

/* JADX INFO: renamed from: d.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C11319w implements InterfaceC11293j {

    /* JADX INFO: renamed from: a */
    public final C0682h0 f36269a;

    /* JADX INFO: renamed from: b */
    public C11314t0 f36270b;

    public C11319w(C0682h0 c0682h0) {
        this.f36269a = c0682h0;
    }

    @Override // p076d.InterfaceC11293j
    /* JADX INFO: renamed from: a */
    public final InputStream mo30494a() {
        C11314t0 c11314t0 = new C11314t0(this.f36269a);
        this.f36270b = c11314t0;
        return c11314t0;
    }

    @Override // p076d.InterfaceC11282f
    /* JADX INFO: renamed from: b */
    public final AbstractC11272b1 mo30486b() throws IOException {
        C11314t0 c11314t0 = new C11314t0(this.f36269a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i13 = c11314t0.read(bArr, 0, 4096);
            if (i13 < 0) {
                return new C11313t(byteArrayOutputStream.toByteArray(), c11314t0.f36255y);
            }
            byteArrayOutputStream.write(bArr, 0, i13);
        }
    }

    @Override // p076d.InterfaceC11307q
    /* JADX INFO: renamed from: d */
    public final AbstractC11272b1 mo30482d() {
        try {
            C11314t0 c11314t0 = new C11314t0(this.f36269a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i13 = c11314t0.read(bArr, 0, 4096);
                if (i13 < 0) {
                    return new C11313t(byteArrayOutputStream.toByteArray(), c11314t0.f36255y);
                }
                byteArrayOutputStream.write(bArr, 0, i13);
            }
        } catch (IOException e5) {
            throw new C0002v(e5, AbstractC3855a.m11824h(e5, new StringBuilder("IOException converting stream to byte array: ")));
        }
    }

    @Override // p076d.InterfaceC11293j
    /* JADX INFO: renamed from: e */
    public final int mo30495e() {
        return this.f36270b.f36255y;
    }
}
