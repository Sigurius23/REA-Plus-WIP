package cx;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import ax.InterfaceC2118c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import l83.C23454a0;
import p479s4.AbstractC32123d;

/* JADX INFO: renamed from: cx.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11165a implements InterfaceC11166b {

    /* JADX INFO: renamed from: a */
    public final C11175k f35749a;

    /* JADX INFO: renamed from: b */
    public AbstractC11165a f35750b;

    /* JADX INFO: renamed from: c */
    public final C11167c f35751c = new C11167c();

    /* JADX INFO: renamed from: d */
    public final C11168d f35752d = new C11168d();

    public AbstractC11165a(C11175k c11175k) {
        this.f35749a = c11175k;
    }

    /* JADX INFO: renamed from: a */
    public final void m30273a() {
        C23454a0 c23454a0;
        C11175k c11175k = this.f35749a;
        LinkedHashSet linkedHashSet = c11175k.f35778d;
        LinkedHashSet linkedHashSet2 = c11175k.f35780f;
        AbstractC11165a abstractC11165a = this.f35750b;
        if (abstractC11165a != null) {
            abstractC11165a.mo30274m();
            c23454a0 = C23454a0.f92919a;
        } else {
            c23454a0 = null;
        }
        if (c23454a0 == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c11175k.f35781g);
            arrayList.addAll(c11175k.f35782h);
            arrayList.addAll(c11175k.f35779e);
            if (linkedHashSet.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                if (AbstractC32123d.m100027g(c11175k.m30280a(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    linkedHashSet2.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (linkedHashSet.contains("android.permission.SYSTEM_ALERT_WINDOW") && c11175k.m30283d() >= 23) {
                if (Settings.canDrawOverlays(c11175k.m30280a())) {
                    linkedHashSet2.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (linkedHashSet.contains("android.permission.WRITE_SETTINGS") && c11175k.m30283d() >= 23) {
                if (Settings.System.canWrite(c11175k.m30280a())) {
                    linkedHashSet2.add("android.permission.WRITE_SETTINGS");
                } else {
                    arrayList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (linkedHashSet.contains("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                } else {
                    linkedHashSet2.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
            }
            if (linkedHashSet.contains("android.permission.REQUEST_INSTALL_PACKAGES")) {
                if (c11175k.m30283d() < 26 || !c11175k.m30280a().getPackageManager().canRequestPackageInstalls()) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                } else {
                    linkedHashSet2.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
            }
            if (linkedHashSet.contains("android.permission.POST_NOTIFICATIONS")) {
                if (NotificationManagerCompat.from(c11175k.m30280a()).areNotificationsEnabled()) {
                    linkedHashSet2.add("android.permission.POST_NOTIFICATIONS");
                } else {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
            }
            if (linkedHashSet.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
                if (AbstractC32123d.m100027g(c11175k.m30280a(), "android.permission.BODY_SENSORS_BACKGROUND")) {
                    linkedHashSet2.add("android.permission.BODY_SENSORS_BACKGROUND");
                } else {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
            }
            InterfaceC2118c interfaceC2118c = c11175k.f35786l;
            if (interfaceC2118c != null) {
                interfaceC2118c.mo6684a(arrayList.isEmpty(), new ArrayList(linkedHashSet2), arrayList);
            }
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = c11175k.m30281b().m4140E("InvisibleFragment");
            if (abstractComponentCallbacksC1320m0M4140E != null) {
                C1271a c1271a = new C1271a(c11175k.m30281b());
                c1271a.m4050n(abstractComponentCallbacksC1320m0M4140E);
                if (c1271a.f5569i) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                c1271a.f5570j = false;
                c1271a.f5518t.m4136A(c1271a, true);
            }
            c11175k.m30280a().setRequestedOrientation(c11175k.f35776b);
        }
    }
}
