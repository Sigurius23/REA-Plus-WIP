package p030b7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.List;
import p110e7.C12786g;
import p110e7.C12797r;
import p463rj.AbstractC31479j;
import p482s7.AbstractC32237a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2772a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C2772a f10909a = new C2772a();

    /* JADX INFO: renamed from: b */
    public static final String f10910b;

    static {
        f10910b = Build.VERSION.SDK_INT >= 34 ? "android.health.connect.action.HEALTH_HOME_SETTINGS" : "androidx.health.ACTION_HEALTH_CONNECT_SETTINGS";
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2773b m7834a(C2772a c2772a, Context context) {
        c2772a.getClass();
        AbstractC22676k.m65750j(context, "context");
        int iM7835b = m7835b(context, "com.google.android.apps.healthdata");
        if (iM7835b == 1) {
            throw new UnsupportedOperationException("SDK version too low");
        }
        if (iM7835b != 2) {
            return Build.VERSION.SDK_INT >= 34 ? new C12797r(context) : new C12786g(AbstractC32237a.m100293g(context, "com.google.android.apps.healthdata"));
        }
        throw new IllegalStateException("Service not available");
    }

    /* JADX INFO: renamed from: b */
    public static int m7835b(Context context, String str) {
        AbstractC22676k.m65750j(context, "context");
        if (Build.VERSION.SDK_INT >= 34) {
            return 3;
        }
        PackageManager packageManager = context.getPackageManager();
        AbstractC22676k.m65749i(packageManager, "context.packageManager");
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            AbstractC22676k.m65749i(packageInfo, "{\n                    @S…= */ 0)\n                }");
            if (!packageInfo.applicationInfo.enabled) {
                return 2;
            }
            if (str.equals("com.google.android.apps.healthdata") && AbstractC31479j.m96941t(packageInfo) < 68623) {
                return 2;
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            AbstractC22676k.m65749i(listQueryIntentServices, "packageManager.queryIntentServices(bindIntent, 0)");
            return !listQueryIntentServices.isEmpty() ? 3 : 2;
        } catch (PackageManager.NameNotFoundException unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m7836c(C2772a c2772a, Context context) {
        c2772a.getClass();
        return m7835b(context, "com.google.android.apps.healthdata");
    }
}
