package bi;

import android.content.Context;
import android.net.ConnectivityManager;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: bi.i */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3271i extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C3271i f12772w = new C3271i(1, AbstractC3269g.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC32122c.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager != null && AbstractC32122c.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new C3268f(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return InterfaceC3267e.f12766a;
    }
}
