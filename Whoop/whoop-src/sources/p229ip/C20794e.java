package p229ip;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.crypto.tink.internal.C5099k0;
import p529uo.AbstractC35117h;

/* JADX INFO: renamed from: ip.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C20794e extends AbstractC35117h {

    /* JADX INFO: renamed from: z */
    public final Bundle f78082z;

    public C20794e(Context context, Looper looper, C5099k0 c5099k0, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        super(context, looper, 212, c5099k0, interfaceC4978i, interfaceC4979j, 0);
        this.f78082z = new Bundle();
    }

    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 17895000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C20803n ? (C20803n) iInterfaceQueryLocalInterface : new C20803n(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 0);
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: g */
    public final C4986c[] mo57329g() {
        return AbstractC20795f.f78086d;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: h */
    public final Bundle mo5668h() {
        return this.f78082z;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: m */
    public final boolean mo57330m() {
        return true;
    }
}
