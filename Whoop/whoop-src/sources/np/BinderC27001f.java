package np;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import la.C23548b;
import p097ds.RunnableC12316s;
import p229ip.AbstractBinderC20797h;
import p503tp.InterfaceC34053x;
import to.C33981k;

/* JADX INFO: renamed from: np.f */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC27001f extends AbstractBinderC20797h implements InterfaceC34053x {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f107679h = 0;

    /* JADX INFO: renamed from: g */
    public final C33981k f107680g;

    public BinderC27001f(C33981k c33981k) {
        super("com.google.android.gms.location.ILocationCallback", 2);
        this.f107680g = c33981k;
    }

    /* JADX INFO: renamed from: i0 */
    public final synchronized void m80985i0() {
        this.f107680g.f142452b = null;
    }

    @Override // p229ip.AbstractBinderC20797h
    /* JADX INFO: renamed from: m0 */
    public final boolean mo57333m0(Parcel parcel, int i13) {
        C33981k c33981k = this.f107680g;
        if (i13 == 1) {
            C23548b c23548b = new C23548b((LocationResult) AbstractC27007l.m80995b(parcel, LocationResult.CREATOR), 17);
            c33981k.getClass();
            c33981k.f142451a.execute(new RunnableC12316s(15, c33981k, c23548b));
            return true;
        }
        if (i13 != 2) {
            return false;
        }
        C23548b c23548b2 = new C23548b((LocationAvailability) AbstractC27007l.m80995b(parcel, LocationAvailability.CREATOR), 18);
        c33981k.getClass();
        c33981k.f142451a.execute(new RunnableC12316s(15, c33981k, c23548b2));
        return true;
    }
}
