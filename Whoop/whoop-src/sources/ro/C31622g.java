package ro;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC4980k;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.common.api.InterfaceC4982m;
import com.google.android.gms.common.api.Status;
import p229ip.AbstractC20798i;
import p374oo.AbstractC28052a;
import p529uo.AbstractC35135w;
import to.AbstractC33967d;

/* JADX INFO: renamed from: ro.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C31622g extends AbstractC33967d {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f130661k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31622g(AbstractC4980k abstractC4980k, int i13) {
        super(abstractC4980k);
        this.f130661k = i13;
        AbstractC35135w.m111095g(abstractC4980k, "GoogleApiClient must not be null");
        AbstractC35135w.m111095g(AbstractC28052a.f113195a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: X */
    public final /* bridge */ /* synthetic */ InterfaceC4982m mo15602X(Status status) {
        int i13 = this.f130661k;
        return status;
    }

    @Override // to.AbstractC33967d
    /* JADX INFO: renamed from: c0 */
    public final void mo97692c0(InterfaceC4973d interfaceC4973d) {
        switch (this.f130661k) {
            case 0:
                C31620e c31620e = (C31620e) interfaceC4973d;
                C31626k c31626k = (C31626k) c31620e.m111061j();
                BinderC31621f binderC31621f = new BinderC31621f(this, 0);
                GoogleSignInOptions googleSignInOptions = c31620e.f130658z;
                Parcel parcelM57324s = c31626k.m57324s();
                int i13 = AbstractC20798i.f78089a;
                parcelM57324s.writeStrongBinder(binderC31621f);
                AbstractC20798i.m57336c(parcelM57324s, googleSignInOptions);
                c31626k.m57319X(parcelM57324s, 102);
                break;
            default:
                C31620e c31620e2 = (C31620e) interfaceC4973d;
                C31626k c31626k2 = (C31626k) c31620e2.m111061j();
                BinderC31621f binderC31621f2 = new BinderC31621f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = c31620e2.f130658z;
                Parcel parcelM57324s2 = c31626k2.m57324s();
                int i14 = AbstractC20798i.f78089a;
                parcelM57324s2.writeStrongBinder(binderC31621f2);
                AbstractC20798i.m57336c(parcelM57324s2, googleSignInOptions2);
                c31626k2.m57319X(parcelM57324s2, 103);
                break;
        }
    }
}
