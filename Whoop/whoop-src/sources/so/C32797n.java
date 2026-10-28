package so;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import p073cq.C11040i;

/* JADX INFO: renamed from: so.n */
/* JADX INFO: loaded from: classes.dex */
public final class C32797n {

    /* JADX INFO: renamed from: a */
    public final int f136493a;

    /* JADX INFO: renamed from: b */
    public final C11040i f136494b = new C11040i();

    /* JADX INFO: renamed from: c */
    public final int f136495c;

    /* JADX INFO: renamed from: d */
    public final Bundle f136496d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f136497e;

    public C32797n(int i13, int i14, Bundle bundle, int i15) {
        this.f136497e = i15;
        this.f136493a = i13;
        this.f136495c = i14;
        this.f136496d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m102852a() {
        switch (this.f136497e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m102853b(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f136494b.m29686a(zztVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m102854c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f136494b.m29687b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f136495c + " id=" + this.f136493a + " oneWay=" + m102852a() + "}";
    }
}
