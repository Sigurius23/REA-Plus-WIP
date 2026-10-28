package io.seon.androidsdk.service;

import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.iterable.iterableapi.C5327g1;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: io.seon.androidsdk.service.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20662f0 implements InterfaceC20695t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C20668h0 f77298b;

    public /* synthetic */ C20662f0(C20668h0 c20668h0, int i13) {
        this.f77297a = i13;
        this.f77298b = c20668h0;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20695t0
    /* JADX INFO: renamed from: a */
    public final Object mo56800a() {
        switch (this.f77297a) {
            case 0:
                C20668h0 c20668h0 = this.f77298b;
                c20668h0.getClass();
                try {
                    return c20668h0.f77322f.registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE")).getExtras().getBoolean("connected") ? OSProbe$OSEnum.USB_CONNECTED : OSProbe$OSEnum.USB_DISCONNECTED;
                } catch (Exception e5) {
                    AbstractC20684o.m56853f("USBStateError", e5);
                    return OSProbe$OSEnum.UNKNOWN;
                }
            case 1:
                C20668h0 c20668h1 = this.f77298b;
                c20668h1.getClass();
                C20691r0 c20691r0 = C20668h0.f77318k;
                c20691r0.f77447d.lock();
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (System.currentTimeMillis() - c20691r0.f77445b >= c20691r0.f77446c || c20691r0.f77445b == -1) {
                        c20691r0.f77444a = c20668h1.m56809k();
                        c20691r0.f77445b = jCurrentTimeMillis;
                    }
                    break;
                } catch (Throwable unused) {
                }
                c20691r0.f77447d.unlock();
                return (String) c20691r0.f77444a;
            case 2:
                C20668h0 c20668h2 = this.f77298b;
                c20668h2.getClass();
                C20691r0 c20691r1 = C20668h0.f77319l;
                c20691r1.f77447d.lock();
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (System.currentTimeMillis() - c20691r1.f77445b >= c20691r1.f77446c || c20691r1.f77445b == -1) {
                        c20691r1.f77444a = c20668h2.m56810l();
                        c20691r1.f77445b = jCurrentTimeMillis2;
                    }
                    break;
                } catch (Throwable unused2) {
                }
                c20691r1.f77447d.unlock();
                return (String) c20691r1.f77444a;
            case 3:
                C5327g1 c5327g1 = new C5327g1(this.f77298b.f77322f);
                c5327g1.m16446h();
                Boolean bool = (Boolean) C20668h0.f77320m.m56879a(new C20665g0(c5327g1, 0));
                bool.booleanValue();
                return bool;
            default:
                C20668h0 c20668h3 = this.f77298b;
                c20668h3.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    PackageManager packageManager = c20668h3.f77322f.getPackageManager();
                    String[] strArr = packageManager.getPackageInfo(c20668h3.f77322f.getPackageName(), 4096).requestedPermissions;
                    if (strArr == null) {
                        return arrayList;
                    }
                    for (String strSubstring : strArr) {
                        int i13 = packageManager.checkPermission(strSubstring, c20668h3.f77322f.getPackageName()) == 0 ? 1 : 0;
                        int iLastIndexOf = strSubstring.lastIndexOf(46);
                        if (iLastIndexOf != -1 && iLastIndexOf < strSubstring.length() - 1) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                        Locale locale = Locale.ENGLISH;
                        arrayList.add(strSubstring + ": " + i13);
                    }
                    return arrayList;
                } catch (Exception unused3) {
                    return null;
                }
        }
    }
}
