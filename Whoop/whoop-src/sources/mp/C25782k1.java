package mp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C4986c;
import p125ep.AbstractC13394a;
import p529uo.AbstractC35117h;

/* JADX INFO: renamed from: mp.k1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25782k1 extends AbstractC35117h {
    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 13000000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof C25785l1 ? (C25785l1) iInterfaceQueryLocalInterface : new C25785l1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: g */
    public final C4986c[] mo57329g() {
        return new C4986c[]{AbstractC13394a.f46918b, AbstractC13394a.f46917a};
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: h */
    public final Bundle mo5668h() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: p */
    public final boolean mo57337p() {
        return true;
    }
}
