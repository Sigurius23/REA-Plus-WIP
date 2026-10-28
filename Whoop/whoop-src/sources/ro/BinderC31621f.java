package ro;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p229ip.AbstractBinderC20797h;
import p229ip.AbstractC20798i;

/* JADX INFO: renamed from: ro.f */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC31621f extends AbstractBinderC20797h implements InterfaceC31625j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f130659g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C31622g f130660h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC31621f(C31622g c31622g, int i13) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.f130659g = i13;
        this.f130660h = c31622g;
    }

    @Override // ro.InterfaceC31625j
    /* JADX INFO: renamed from: P */
    public void mo97690P(Status status) {
        switch (this.f130659g) {
            case 1:
                this.f130660h.m15605a0(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ro.InterfaceC31625j
    /* JADX INFO: renamed from: S */
    public void mo97691S(Status status) {
        switch (this.f130659g) {
            case 0:
                this.f130660h.m15605a0(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p229ip.AbstractBinderC20797h
    /* JADX INFO: renamed from: k0 */
    public final boolean mo57325k0(int i13, Parcel parcel, Parcel parcel2) {
        switch (i13) {
            case 101:
                AbstractC20798i.m57335b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) AbstractC20798i.m57334a(parcel, Status.CREATOR);
                AbstractC20798i.m57335b(parcel);
                mo97691S(status);
                break;
            case 103:
                Status status2 = (Status) AbstractC20798i.m57334a(parcel, Status.CREATOR);
                AbstractC20798i.m57335b(parcel);
                mo97690P(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
