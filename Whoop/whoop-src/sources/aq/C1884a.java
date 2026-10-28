package aq;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.crypto.tink.internal.C5099k0;
import p529uo.AbstractC35117h;

/* JADX INFO: renamed from: aq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C1884a extends AbstractC35117h implements InterfaceC4973d {

    /* JADX INFO: renamed from: A */
    public final C5099k0 f7426A;

    /* JADX INFO: renamed from: B */
    public final Bundle f7427B;

    /* JADX INFO: renamed from: C */
    public final Integer f7428C;

    /* JADX INFO: renamed from: z */
    public final boolean f7429z;

    public C1884a(Context context, Looper looper, C5099k0 c5099k0, Bundle bundle, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        super(context, looper, 44, c5099k0, interfaceC4978i, interfaceC4979j, 0);
        this.f7429z = true;
        this.f7426A = c5099k0;
        this.f7427B = bundle;
        this.f7428C = (Integer) c5099k0.f21438w;
    }

    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: a */
    public final boolean mo5665a() {
        return this.f7429z;
    }

    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 12451000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C1887d ? (C1887d) iInterfaceQueryLocalInterface : new C1887d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: h */
    public final Bundle mo5668h() {
        C5099k0 c5099k0 = this.f7426A;
        boolean zEquals = this.f148964c.getPackageName().equals((String) c5099k0.f21439x);
        Bundle bundle = this.f7427B;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c5099k0.f21439x);
        }
        return bundle;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.gms.signin.service.START";
    }
}
