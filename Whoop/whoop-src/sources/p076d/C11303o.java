package p076d;

import c13.AbstractC3855a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p001a.C0002v;
import p012ab.C0682h0;

/* JADX INFO: renamed from: d.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C11303o implements InterfaceC11269a1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36231a;

    /* JADX INFO: renamed from: b */
    public final Object f36232b;

    public /* synthetic */ C11303o(Object obj, int i13) {
        this.f36231a = i13;
        this.f36232b = obj;
    }

    @Override // p076d.InterfaceC11282f
    /* JADX INFO: renamed from: b */
    public final AbstractC11272b1 mo30486b() throws IOException {
        switch (this.f36231a) {
            case 0:
                return new C11297l(((C11273c) this.f36232b).m30484h());
            default:
                C11318v0 c11318v0 = new C11318v0((C0682h0) this.f36232b);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i13 = c11318v0.read(bArr, 0, 4096);
                    if (i13 < 0) {
                        return new C11268a0(byteArrayOutputStream.toByteArray(), null);
                    }
                    byteArrayOutputStream.write(bArr, 0, i13);
                }
                break;
        }
    }

    @Override // p076d.InterfaceC11269a1
    /* JADX INFO: renamed from: c */
    public final InputStream mo30481c() {
        switch (this.f36231a) {
            case 0:
                return (C11273c) this.f36232b;
            default:
                return new C11318v0((C0682h0) this.f36232b);
        }
    }

    @Override // p076d.InterfaceC11307q
    /* JADX INFO: renamed from: d */
    public final AbstractC11272b1 mo30482d() {
        switch (this.f36231a) {
            case 0:
                try {
                    return mo30486b();
                } catch (IOException e5) {
                    throw new C0002v(e5, AbstractC3855a.m11824h(e5, new StringBuilder("IOException converting stream to byte array: ")));
                }
            default:
                try {
                    C11318v0 c11318v0 = new C11318v0((C0682h0) this.f36232b);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i13 = c11318v0.read(bArr, 0, 4096);
                        if (i13 < 0) {
                            return new C11268a0(byteArrayOutputStream.toByteArray(), null);
                        }
                        byteArrayOutputStream.write(bArr, 0, i13);
                    }
                } catch (IOException e13) {
                    throw new C0002v(e13, AbstractC3855a.m11824h(e13, new StringBuilder("IOException converting stream to byte array: ")));
                }
                break;
        }
    }
}
