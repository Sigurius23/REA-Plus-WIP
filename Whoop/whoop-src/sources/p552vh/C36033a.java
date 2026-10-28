package p552vh;

import android.os.Build;
import fi.C14509o;
import ne3.InterfaceC26620j;
import p523uh.C34962h;
import sh.InterfaceC32484j;
import sh.InterfaceC32485k;

/* JADX INFO: renamed from: vh.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36033a implements InterfaceC32484j {

    /* JADX INFO: renamed from: a */
    public final boolean f153710a;

    public C36033a(boolean z4) {
        this.f153710a = z4;
    }

    @Override // sh.InterfaceC32484j
    /* JADX INFO: renamed from: a */
    public final InterfaceC32485k mo71005a(C34962h c34962h, C14509o c14509o) {
        InterfaceC26620j interfaceC26620jMo101470d1 = c34962h.f147929a.mo101470d1();
        if (!interfaceC26620jMo101470d1.mo79202d0(0L, AbstractC36037e.f153725b) && !interfaceC26620jMo101470d1.mo79202d0(0L, AbstractC36037e.f153724a) && (!interfaceC26620jMo101470d1.mo79202d0(0L, AbstractC36037e.f153726c) || !interfaceC26620jMo101470d1.mo79202d0(8L, AbstractC36037e.f153727d) || !interfaceC26620jMo101470d1.mo79202d0(12L, AbstractC36037e.f153728e) || !interfaceC26620jMo101470d1.request(21L) || ((byte) (interfaceC26620jMo101470d1.mo79205f().m79229s(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !interfaceC26620jMo101470d1.mo79202d0(4L, AbstractC36037e.f153729f)) {
                return null;
            }
            if (!interfaceC26620jMo101470d1.mo79202d0(8L, AbstractC36037e.f153730g) && !interfaceC26620jMo101470d1.mo79202d0(8L, AbstractC36037e.f153731h) && !interfaceC26620jMo101470d1.mo79202d0(8L, AbstractC36037e.f153732i)) {
                return null;
            }
        }
        return new C36036d(c34962h.f147929a, c14509o, this.f153710a);
    }
}
