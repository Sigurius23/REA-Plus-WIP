package p529uo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: uo.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C35106b0 extends AbstractC35133u {

    /* JADX INFO: renamed from: g */
    public final IBinder f148959g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC35107c f148960h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35106b0(AbstractC35107c abstractC35107c, int i13, IBinder iBinder, Bundle bundle) {
        super(abstractC35107c, i13, bundle);
        this.f148960h = abstractC35107c;
        this.f148959g = iBinder;
    }

    @Override // p529uo.AbstractC35133u
    /* JADX INFO: renamed from: a */
    public final boolean mo111056a() {
        IBinder iBinder = this.f148959g;
        try {
            AbstractC35135w.m111094f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC35107c abstractC35107c = this.f148960h;
            if (!abstractC35107c.mo5669k().equals(interfaceDescriptor)) {
                String strMo5669k = abstractC35107c.mo5669k();
                Log.w("GmsClient", AbstractC11266d.m30464r(new StringBuilder(strMo5669k.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strMo5669k, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceMo5667d = abstractC35107c.mo5667d(iBinder);
            if (iInterfaceMo5667d == null || !(abstractC35107c.m111064q(2, 4, iInterfaceMo5667d) || abstractC35107c.m111064q(3, 4, iInterfaceMo5667d))) {
                return false;
            }
            abstractC35107c.f148981t = null;
            C35123k c35123k = abstractC35107c.f148975n;
            if (c35123k == null) {
                return true;
            }
            ((InterfaceC4978i) c35123k.f149049a).mo15600s();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p529uo.AbstractC35133u
    /* JADX INFO: renamed from: b */
    public final void mo111057b(C4969a c4969a) {
        C35123k c35123k = this.f148960h.f148976o;
        if (c35123k != null) {
            ((InterfaceC4979j) c35123k.f149049a).mo15607c0(c4969a);
        }
        System.currentTimeMillis();
    }
}
