package gl;

import a33.C0352d;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import p437qt.C30582e;
import p586wk.C37330h;
import p586wk.InterfaceC37332j;
import p684zk.InterfaceC40801z;
import sh.C32487m;
import tl.AbstractC33902a;

/* JADX INFO: renamed from: gl.e */
/* JADX INFO: loaded from: classes.dex */
public final class C15940e implements InterfaceC37332j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60347a;

    /* JADX INFO: renamed from: b */
    public final C15948m f60348b;

    public /* synthetic */ C15940e(C15948m c15948m, int i13) {
        this.f60347a = i13;
        this.f60348b = c15948m;
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: a */
    public final InterfaceC40801z mo44989a(Object obj, int i13, int i14, C37330h c37330h) {
        switch (this.f60347a) {
            case 0:
                C32487m c32487mM107254d = AbstractC33902a.m107254d((ByteBuffer) obj);
                C30582e c30582e = C15948m.f60366j;
                C15948m c15948m = this.f60348b;
                return c15948m.m45016a(new C0352d(c32487mM107254d, c15948m.f60371d, c15948m.f60370c), i13, i14, c37330h, c30582e);
            default:
                C15948m c15948m2 = this.f60348b;
                return c15948m2.m45016a(new C0352d((ParcelFileDescriptor) obj, c15948m2.f60371d, c15948m2.f60370c), i13, i14, c37330h, C15948m.f60366j);
        }
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: b */
    public final boolean mo44990b(Object obj, C37330h c37330h) {
        switch (this.f60347a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
