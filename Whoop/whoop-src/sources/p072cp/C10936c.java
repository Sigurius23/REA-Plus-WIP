package p072cp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Objects;
import p127ev.C13668i;
import p375op.AbstractC28076h;
import p558vp.AbstractC36259c;
import p558vp.C36262f;
import q30.C29938w0;

/* JADX INFO: renamed from: cp.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C10936c implements InterfaceC10939f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f33828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13668i f33829b;

    public C10936c(C13668i c13668i, Bundle bundle) {
        this.f33828a = bundle;
        Objects.requireNonNull(c13668i);
        this.f33829b = c13668i;
    }

    @Override // p072cp.InterfaceC10939f
    /* JADX INFO: renamed from: a */
    public final int mo28989a() {
        return 1;
    }

    @Override // p072cp.InterfaceC10939f
    /* JADX INFO: renamed from: b */
    public final void mo28990b() {
        C29938w0 c29938w0 = (C29938w0) this.f33829b.f48454a;
        Bundle bundle = this.f33828a;
        ViewGroup viewGroup = (ViewGroup) c29938w0.f122260x;
        C36262f c36262f = (C36262f) c29938w0.f122261y;
        try {
            Bundle bundle2 = new Bundle();
            AbstractC36259c.m115710t0(bundle, bundle2);
            Parcel parcelM57322k0 = c36262f.m57322k0();
            AbstractC28076h.m84851c(parcelM57322k0, bundle2);
            c36262f.m57323l0(parcelM57322k0, 2);
            AbstractC36259c.m115710t0(bundle2, bundle);
            Parcel parcelM57321j0 = c36262f.m57321j0(c36262f.m57322k0(), 8);
            InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57321j0.readStrongBinder());
            parcelM57321j0.recycle();
            c29938w0.f122262z = (View) BinderC10935b.m28987c0(interfaceC10934aM28986X);
            viewGroup.removeAllViews();
            viewGroup.addView((View) c29938w0.f122262z);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }
}
