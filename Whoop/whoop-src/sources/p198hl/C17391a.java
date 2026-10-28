package p198hl;

import android.os.ParcelFileDescriptor;
import f93.C14289a;
import gl.C15943h;
import java.nio.ByteBuffer;
import p618xk.C38417h;
import p618xk.InterfaceC38415f;
import p618xk.InterfaceC38416g;

/* JADX INFO: renamed from: hl.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17391a implements InterfaceC38415f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67335a;

    @Override // p618xk.InterfaceC38415f
    /* JADX INFO: renamed from: a */
    public final InterfaceC38416g mo49223a(Object obj) {
        switch (this.f67335a) {
            case 0:
                return new C15943h((ByteBuffer) obj, 2);
            case 1:
                return new C14289a(obj, 7);
            default:
                return new C38417h((ParcelFileDescriptor) obj);
        }
    }

    @Override // p618xk.InterfaceC38415f
    /* JADX INFO: renamed from: b */
    public final Class mo49224b() {
        switch (this.f67335a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
