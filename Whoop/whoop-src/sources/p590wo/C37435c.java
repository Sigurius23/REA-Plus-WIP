package p590wo;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.crypto.tink.internal.C5099k0;
import jp.AbstractC21844b;
import p529uo.AbstractC35117h;
import p529uo.C35126n;

/* JADX INFO: renamed from: wo.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C37435c extends AbstractC35117h {

    /* JADX INFO: renamed from: z */
    public final C35126n f160243z;

    public C37435c(Context context, Looper looper, C5099k0 c5099k0, C35126n c35126n, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        super(context, looper, 270, c5099k0, interfaceC4978i, interfaceC4979j, 0);
        this.f160243z = c35126n;
    }

    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 203400000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C37433a ? (C37433a) iInterfaceQueryLocalInterface : new C37433a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: g */
    public final C4986c[] mo57329g() {
        return AbstractC21844b.f84373b;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: h */
    public final Bundle mo5668h() {
        this.f160243z.getClass();
        return new Bundle();
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: m */
    public final boolean mo57330m() {
        return true;
    }
}
