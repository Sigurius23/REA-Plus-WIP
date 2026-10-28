package gl;

import android.graphics.Bitmap;
import java.io.File;
import p684zk.InterfaceC40801z;
import pf.AbstractC29125c;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: gl.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C15959x implements InterfaceC40801z {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60391w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f60392x;

    public C15959x(byte[] bArr) {
        AbstractC29125c.m88539p(bArr, "Argument must not be null");
        this.f60392x = bArr;
    }

    /* JADX INFO: renamed from: b */
    private final void m45029b() {
    }

    /* JADX INFO: renamed from: d */
    private final void m45030d() {
    }

    /* JADX INFO: renamed from: e */
    private final void m45031e() {
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: a */
    public final void mo44996a() {
        int i13 = this.f60391w;
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: c */
    public final Class mo44997c() {
        switch (this.f60391w) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return ((File) this.f60392x).getClass();
        }
    }

    @Override // p684zk.InterfaceC40801z
    public final Object get() {
        switch (this.f60391w) {
            case 0:
                return (Bitmap) this.f60392x;
            case 1:
                return (byte[]) this.f60392x;
            default:
                return (File) this.f60392x;
        }
    }

    @Override // p684zk.InterfaceC40801z
    public final int getSize() {
        switch (this.f60391w) {
            case 0:
                return AbstractC33913l.m107268c((Bitmap) this.f60392x);
            case 1:
                return ((byte[]) this.f60392x).length;
            default:
                return 1;
        }
    }

    public C15959x(File file) {
        AbstractC29125c.m88539p(file, "Argument must not be null");
        this.f60392x = file;
    }

    public C15959x(Bitmap bitmap) {
        this.f60392x = bitmap;
    }
}
