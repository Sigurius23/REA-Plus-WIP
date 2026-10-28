package p098dt;

import aa3.C0627i1;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import gt.C16163b;
import gt.C16168g;
import p014aj.C0928c;
import p479s4.AbstractC32122c;
import p625xt.C38641a;
import st.InterfaceC32956a;

/* JADX INFO: renamed from: dt.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12351c implements InterfaceC32956a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f41511b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f41512c;

    public /* synthetic */ C12351c(int i13, Object obj, Object obj2) {
        this.f41510a = i13;
        this.f41511b = obj;
        this.f41512c = obj2;
    }

    @Override // st.InterfaceC32956a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f41510a) {
            case 0:
                C12355g c12355g = (C12355g) this.f41511b;
                Context context = (Context) this.f41512c;
                String strM34611c = c12355g.m34611c();
                C38641a c38641a = new C38641a();
                Context contextCreateDeviceProtectedStorageContext = AbstractC32122c.createDeviceProtectedStorageContext(context);
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + strM34611c, 0);
                boolean z4 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z4 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z4 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                c38641a.f166180a = z4;
                return c38641a;
            case 1:
                C16168g c16168g = (C16168g) this.f41511b;
                C16163b c16163b = (C16163b) this.f41512c;
                return c16163b.f61433f.mo7223f(new C0627i1(c16163b, c16168g));
            default:
                return new C0928c((Context) this.f41512c, (String) this.f41511b);
        }
    }

    public /* synthetic */ C12351c(Context context, String str) {
        this.f41510a = 2;
        this.f41512c = context;
        this.f41511b = str;
    }
}
