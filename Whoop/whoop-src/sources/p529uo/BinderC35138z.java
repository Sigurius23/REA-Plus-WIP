package p529uo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import p310lp.AbstractBinderC24628g;
import p310lp.AbstractC24629h;

/* JADX INFO: renamed from: uo.z */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC35138z extends AbstractBinderC24628g {

    /* JADX INFO: renamed from: f */
    public AbstractC35107c f149087f;

    /* JADX INFO: renamed from: g */
    public final int f149088g;

    public BinderC35138z(AbstractC35107c abstractC35107c, int i13) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f149087f = abstractC35107c;
        this.f149088g = i13;
    }

    @Override // p310lp.AbstractBinderC24628g
    /* JADX INFO: renamed from: s */
    public final boolean mo15621s(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 == 1) {
            int i14 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC24629h.m71962a(parcel, Bundle.CREATOR);
            AbstractC24629h.m71964c(parcel);
            AbstractC35135w.m111095g(this.f149087f, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC35107c abstractC35107c = this.f149087f;
            int i15 = this.f149088g;
            abstractC35107c.getClass();
            C35106b0 c35106b0 = new C35106b0(abstractC35107c, i14, strongBinder, bundle);
            HandlerC35137y handlerC35137y = abstractC35107c.f148966e;
            handlerC35137y.sendMessage(handlerC35137y.obtainMessage(1, i15, -1, c35106b0));
            this.f149087f = null;
        } else if (i13 == 2) {
            parcel.readInt();
            AbstractC24629h.m71964c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i13 != 3) {
                return false;
            }
            int i16 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C35110d0 c35110d0 = (C35110d0) AbstractC24629h.m71962a(parcel, C35110d0.CREATOR);
            AbstractC24629h.m71964c(parcel);
            AbstractC35107c abstractC35107c2 = this.f149087f;
            AbstractC35135w.m111095g(abstractC35107c2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC35135w.m111094f(c35110d0);
            abstractC35107c2.f148983v = c35110d0;
            if (abstractC35107c2.mo57337p()) {
                C35113f c35113f = c35110d0.f148991z;
                C35123k c35123kM111072a = C35123k.m111072a();
                C35124l c35124lM111068b = c35113f == null ? null : c35113f.m111068b();
                synchronized (c35123kM111072a) {
                    try {
                        if (c35124lM111068b == null) {
                            c35124lM111068b = C35123k.f149048c;
                        } else {
                            C35124l c35124l = (C35124l) c35123kM111072a.f149049a;
                            if (c35124l == null || c35124l.f149051w < c35124lM111068b.f149051w) {
                            }
                        }
                        c35123kM111072a.f149049a = c35124lM111068b;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            Bundle bundle2 = c35110d0.f148988w;
            AbstractC35135w.m111095g(this.f149087f, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC35107c abstractC35107c3 = this.f149087f;
            int i17 = this.f149088g;
            abstractC35107c3.getClass();
            C35106b0 c35106b1 = new C35106b0(abstractC35107c3, i16, strongBinder2, bundle2);
            HandlerC35137y handlerC35137y2 = abstractC35107c3.f148966e;
            handlerC35137y2.sendMessage(handlerC35137y2.obtainMessage(1, i17, -1, c35106b1));
            this.f149087f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
