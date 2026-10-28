package p503tp;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import np.AbstractC27007l;
import np.C26997b;
import np.InterfaceC26999d;
import p073cq.C11040i;
import p229ip.AbstractBinderC20797h;
import p478s3.AbstractC32098d;

/* JADX INFO: renamed from: tp.s */
/* JADX INFO: loaded from: classes6.dex */
public class BinderC34048s extends AbstractBinderC20797h implements InterfaceC26999d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f142726g;

    /* JADX INFO: renamed from: h */
    public final C11040i f142727h;

    public BinderC34048s() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m107627n0() {
    }

    /* JADX INFO: renamed from: o0 */
    private void m107628o0() {
    }

    @Override // np.InterfaceC26999d
    /* JADX INFO: renamed from: V */
    public final void mo80982V(C26997b c26997b) {
        switch (this.f142726g) {
            case 0:
                Status status = c26997b.f107678w;
                C11040i c11040i = this.f142727h;
                if (status == null) {
                    c11040i.m29688c(new ApiException(new Status(8, "Got null status from location service", null, null)));
                } else if (status.f20493w != 0) {
                    c11040i.m29688c(AbstractC32098d.m99841g(status));
                } else {
                    c11040i.m29687b(Boolean.TRUE);
                }
                break;
            default:
                AbstractC32098d.m99850q(c26997b.f107678w, null, this.f142727h);
                break;
        }
    }

    @Override // np.InterfaceC26999d
    /* JADX INFO: renamed from: i0 */
    public void mo80983i0() {
        int i13 = this.f142726g;
    }

    @Override // p229ip.AbstractBinderC20797h
    /* JADX INFO: renamed from: m0 */
    public final boolean mo57333m0(Parcel parcel, int i13) {
        if (i13 == 1) {
            mo80982V((C26997b) AbstractC27007l.m80995b(parcel, C26997b.CREATOR));
            return true;
        }
        if (i13 != 2) {
            return false;
        }
        mo80983i0();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC34048s(int i13, C11040i c11040i) {
        this();
        this.f142726g = i13;
        switch (i13) {
            case 1:
                this();
                this.f142727h = c11040i;
                break;
            default:
                this.f142727h = c11040i;
                break;
        }
    }
}
