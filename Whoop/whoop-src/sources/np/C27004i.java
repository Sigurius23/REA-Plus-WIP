package np;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import cd3.C4455g;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.crypto.tink.internal.C5099k0;
import java.util.HashMap;
import p014aj.C0928c;
import p503tp.AbstractC34037h;
import p503tp.BinderC34048s;
import p529uo.AbstractC35117h;
import p529uo.AbstractC35135w;
import to.C33979j;

/* JADX INFO: renamed from: np.i */
/* JADX INFO: loaded from: classes.dex */
public final class C27004i extends AbstractC35117h {

    /* JADX INFO: renamed from: A */
    public final C4455g f107683A;

    /* JADX INFO: renamed from: z */
    public final String f107684z;

    public C27004i(Context context, Looper looper, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j, String str, C5099k0 c5099k0) {
        super(context, looper, 23, c5099k0, interfaceC4978i, interfaceC4979j, 0);
        C0928c c0928c = new C0928c(this, 21);
        this.f107684z = str;
        this.f107683A = new C4455g(context, c0928c);
    }

    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 11717000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof C27000e ? (C27000e) iInterfaceQueryLocalInterface : new C27000e(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: e */
    public final void mo80986e() {
        synchronized (this.f107683A) {
            if (m111062n()) {
                try {
                    this.f107683A.m13939M();
                    C4455g c4455g = this.f107683A;
                    if (c4455g.f17961w) {
                        C0928c c0928c = (C0928c) c4455g.f17959E;
                        ((C27004i) c0928c.f3421x).m111058c();
                        C27000e c27000eM2318a0 = c0928c.m2318a0();
                        Parcel parcelM80981s = c27000eM2318a0.m80981s();
                        AbstractC27007l.m80994a(parcelM80981s, false);
                        c27000eM2318a0.m80980c0(parcelM80981s, 12);
                        c4455g.f17961w = false;
                    }
                } catch (Exception e5) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e5);
                }
                super.mo80986e();
            } else {
                super.mo80986e();
            }
            throw th;
        }
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: g */
    public final C4986c[] mo57329g() {
        return AbstractC34037h.f142699e;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: h */
    public final Bundle mo5668h() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f107684z);
        return bundle;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: p */
    public final boolean mo57337p() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final void m80987u(C33979j c33979j, BinderC34048s binderC34048s) {
        C4455g c4455g = this.f107683A;
        ((C27004i) ((C0928c) c4455g.f17959E).f3421x).m111058c();
        AbstractC35135w.m111095g(c33979j, "Invalid null listener key");
        synchronized (((HashMap) c4455g.f17964z)) {
            try {
                BinderC27001f binderC27001f = (BinderC27001f) ((HashMap) c4455g.f17964z).remove(c33979j);
                if (binderC27001f != null) {
                    binderC27001f.m80985i0();
                    ((C0928c) c4455g.f17959E).m2318a0().m80984j0(C27006k.m80993f(binderC27001f, binderC34048s));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
