package p503tp;

import com.google.android.gms.location.FusedLocationProviderClient;
import np.C27004i;
import p073cq.C11040i;
import to.C33979j;
import to.C33981k;

/* JADX INFO: renamed from: tp.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C34047r extends AbstractC34051v {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33981k f142725x;

    public C34047r(FusedLocationProviderClient fusedLocationProviderClient, C33981k c33981k) {
        this.f142725x = c33981k;
        this.f142729w = true;
    }

    @Override // to.InterfaceC33987n
    public final void accept(Object obj, Object obj2) {
        C27004i c27004i = (C27004i) obj;
        C11040i c11040i = (C11040i) obj2;
        if (this.f142729w) {
            BinderC34048s binderC34048s = new BinderC34048s(0, c11040i);
            try {
                C33979j c33979j = this.f142725x.f142452b;
                if (c33979j != null) {
                    c27004i.m80987u(c33979j, binderC34048s);
                }
            } catch (RuntimeException e5) {
                c11040i.m29688c(e5);
            }
        }
    }
}
