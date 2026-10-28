package cx;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.core.app.NotificationManagerCompat;
import ax.InterfaceC2116a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import p479s4.AbstractC32123d;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cx.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C11176l extends AbstractC11165a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f35789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11176l(C11175k c11175k, int i13) {
        super(c11175k);
        this.f35789e = i13;
    }

    @Override // cx.InterfaceC11166b
    /* JADX INFO: renamed from: m */
    public final void mo30274m() {
        switch (this.f35789e) {
            case 0:
                C11175k c11175k = this.f35749a;
                LinkedHashSet linkedHashSet = c11175k.f35778d;
                if (linkedHashSet.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    if (Build.VERSION.SDK_INT < 29) {
                        linkedHashSet.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                        c11175k.f35779e.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                        m30273a();
                    } else if (AbstractC32123d.m100027g(c11175k.m30280a(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        m30273a();
                    } else {
                        boolean zM100027g = AbstractC32123d.m100027g(c11175k.m30280a(), "android.permission.ACCESS_FINE_LOCATION");
                        boolean zM100027g2 = AbstractC32123d.m100027g(c11175k.m30280a(), "android.permission.ACCESS_COARSE_LOCATION");
                        if (zM100027g || zM100027g2) {
                            if (c11175k.f35787m == null) {
                                C11174j c11174jM30282c = c11175k.m30282c();
                                c11174jM30282c.f35772x = c11175k;
                                c11174jM30282c.f35773y = this;
                                c11174jM30282c.f35764E.mo4052a("android.permission.ACCESS_BACKGROUND_LOCATION", null);
                            } else {
                                ArrayList arrayListM118964P = AbstractC37056f.m118964P("android.permission.ACCESS_BACKGROUND_LOCATION");
                                InterfaceC2116a interfaceC2116a = c11175k.f35787m;
                                AbstractC22676k.m65747g(interfaceC2116a);
                                interfaceC2116a.mo6682a(this.f35751c, arrayListM118964P);
                            }
                        }
                    }
                }
                m30273a();
                break;
            case 1:
                C11175k c11175k2 = this.f35749a;
                LinkedHashSet linkedHashSet2 = c11175k2.f35778d;
                if (linkedHashSet2.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
                    if (Build.VERSION.SDK_INT < 33) {
                        linkedHashSet2.remove("android.permission.BODY_SENSORS_BACKGROUND");
                        c11175k2.f35779e.add("android.permission.BODY_SENSORS_BACKGROUND");
                        m30273a();
                    } else if (AbstractC32123d.m100027g(c11175k2.m30280a(), "android.permission.BODY_SENSORS_BACKGROUND")) {
                        m30273a();
                    } else if (AbstractC32123d.m100027g(c11175k2.m30280a(), "android.permission.BODY_SENSORS")) {
                        if (c11175k2.f35787m == null) {
                            C11174j c11174jM30282c2 = c11175k2.m30282c();
                            c11174jM30282c2.f35772x = c11175k2;
                            c11174jM30282c2.f35773y = this;
                            c11174jM30282c2.f35770K.mo4052a("android.permission.BODY_SENSORS_BACKGROUND", null);
                        } else {
                            ArrayList arrayListM118964P2 = AbstractC37056f.m118964P("android.permission.BODY_SENSORS_BACKGROUND");
                            InterfaceC2116a interfaceC2116a2 = c11175k2.f35787m;
                            AbstractC22676k.m65747g(interfaceC2116a2);
                            interfaceC2116a2.mo6682a(this.f35751c, arrayListM118964P2);
                        }
                    }
                }
                m30273a();
                break;
            case 2:
                C11175k c11175k3 = this.f35749a;
                if (!c11175k3.f35778d.contains("android.permission.REQUEST_INSTALL_PACKAGES") || c11175k3.m30283d() < 26) {
                    m30273a();
                } else if (c11175k3.m30280a().getPackageManager().canRequestPackageInstalls()) {
                    m30273a();
                } else if (c11175k3.f35787m == null) {
                    m30273a();
                } else {
                    ArrayList arrayListM118964P3 = AbstractC37056f.m118964P("android.permission.REQUEST_INSTALL_PACKAGES");
                    InterfaceC2116a interfaceC2116a3 = c11175k3.f35787m;
                    AbstractC22676k.m65747g(interfaceC2116a3);
                    interfaceC2116a3.mo6682a(this.f35751c, arrayListM118964P3);
                }
                break;
            case 3:
                ArrayList arrayList = new ArrayList();
                C11175k c11175k4 = this.f35749a;
                LinkedHashSet<String> linkedHashSet3 = c11175k4.f35777c;
                for (String str : linkedHashSet3) {
                    if (AbstractC32123d.m100027g(c11175k4.m30280a(), str)) {
                        c11175k4.f35780f.add(str);
                    } else {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    m30273a();
                } else {
                    c11175k4.m30285f(linkedHashSet3, this);
                }
                break;
            case 4:
                C11175k c11175k5 = this.f35749a;
                if (c11175k5.f35778d.contains("android.permission.POST_NOTIFICATIONS")) {
                    if (NotificationManagerCompat.from(c11175k5.m30280a()).areNotificationsEnabled()) {
                        m30273a();
                    } else if (c11175k5.f35787m != null) {
                        ArrayList arrayListM118964P4 = AbstractC37056f.m118964P("android.permission.POST_NOTIFICATIONS");
                        InterfaceC2116a interfaceC2116a4 = c11175k5.f35787m;
                        AbstractC22676k.m65747g(interfaceC2116a4);
                        interfaceC2116a4.mo6682a(this.f35751c, arrayListM118964P4);
                    }
                }
                m30273a();
                break;
            case 5:
                C11175k c11175k6 = this.f35749a;
                LinkedHashSet linkedHashSet4 = c11175k6.f35778d;
                if (!linkedHashSet4.contains("android.permission.SYSTEM_ALERT_WINDOW")) {
                    m30273a();
                } else if (c11175k6.m30283d() < 23) {
                    c11175k6.f35780f.add("android.permission.SYSTEM_ALERT_WINDOW");
                    linkedHashSet4.remove("android.permission.SYSTEM_ALERT_WINDOW");
                    m30273a();
                } else if (Settings.canDrawOverlays(c11175k6.m30280a())) {
                    m30273a();
                } else if (c11175k6.f35787m == null) {
                    m30273a();
                } else {
                    ArrayList arrayListM118964P5 = AbstractC37056f.m118964P("android.permission.SYSTEM_ALERT_WINDOW");
                    InterfaceC2116a interfaceC2116a5 = c11175k6.f35787m;
                    AbstractC22676k.m65747g(interfaceC2116a5);
                    interfaceC2116a5.mo6682a(this.f35751c, arrayListM118964P5);
                }
                break;
            default:
                C11175k c11175k7 = this.f35749a;
                LinkedHashSet linkedHashSet5 = c11175k7.f35778d;
                if (!linkedHashSet5.contains("android.permission.WRITE_SETTINGS")) {
                    m30273a();
                } else if (c11175k7.m30283d() < 23) {
                    c11175k7.f35780f.add("android.permission.WRITE_SETTINGS");
                    linkedHashSet5.remove("android.permission.WRITE_SETTINGS");
                    m30273a();
                } else if (Settings.System.canWrite(c11175k7.m30280a())) {
                    m30273a();
                } else if (c11175k7.f35787m == null) {
                    m30273a();
                } else {
                    ArrayList arrayListM118964P6 = AbstractC37056f.m118964P("android.permission.WRITE_SETTINGS");
                    InterfaceC2116a interfaceC2116a6 = c11175k7.f35787m;
                    AbstractC22676k.m65747g(interfaceC2116a6);
                    interfaceC2116a6.mo6682a(this.f35751c, arrayListM118964P6);
                }
                break;
        }
    }

    @Override // cx.InterfaceC11166b
    /* JADX INFO: renamed from: n */
    public final void mo30275n(List list) {
        switch (this.f35789e) {
            case 0:
                C11175k c11175k = this.f35749a;
                C11174j c11174jM30282c = c11175k.m30282c();
                c11174jM30282c.f35772x = c11175k;
                c11174jM30282c.f35773y = this;
                c11174jM30282c.f35764E.mo4052a("android.permission.ACCESS_BACKGROUND_LOCATION", null);
                break;
            case 1:
                C11175k c11175k2 = this.f35749a;
                C11174j c11174jM30282c2 = c11175k2.m30282c();
                c11174jM30282c2.f35772x = c11175k2;
                c11174jM30282c2.f35773y = this;
                c11174jM30282c2.f35770K.mo4052a("android.permission.BODY_SENSORS_BACKGROUND", null);
                break;
            case 2:
                C11175k c11175k3 = this.f35749a;
                C11174j c11174jM30282c3 = c11175k3.m30282c();
                c11174jM30282c3.f35772x = c11175k3;
                c11174jM30282c3.f35773y = this;
                Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                intent.setData(Uri.parse("package:" + c11174jM30282c3.requireActivity().getPackageName()));
                c11174jM30282c3.f35768I.mo4052a(intent, null);
                break;
            case 3:
                C11175k c11175k4 = this.f35749a;
                HashSet hashSet = new HashSet(c11175k4.f35780f);
                hashSet.addAll(list);
                if (!hashSet.isEmpty()) {
                    c11175k4.m30285f(hashSet, this);
                } else {
                    m30273a();
                }
                break;
            case 4:
                C11175k c11175k5 = this.f35749a;
                C11174j c11174jM30282c4 = c11175k5.m30282c();
                c11174jM30282c4.f35772x = c11175k5;
                c11174jM30282c4.f35773y = this;
                Intent intent2 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                intent2.putExtra("android.provider.extra.APP_PACKAGE", c11174jM30282c4.requireActivity().getPackageName());
                c11174jM30282c4.f35769J.mo4052a(intent2, null);
                break;
            case 5:
                C11175k c11175k6 = this.f35749a;
                C11174j c11174jM30282c5 = c11175k6.m30282c();
                c11174jM30282c5.f35772x = c11175k6;
                c11174jM30282c5.f35773y = this;
                if (!Settings.canDrawOverlays(c11174jM30282c5.requireContext())) {
                    Intent intent3 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                    intent3.setData(Uri.parse("package:" + c11174jM30282c5.requireActivity().getPackageName()));
                    c11174jM30282c5.f35765F.mo4052a(intent3, null);
                } else {
                    c11174jM30282c5.m30279z();
                }
                break;
            default:
                C11175k c11175k7 = this.f35749a;
                C11174j c11174jM30282c6 = c11175k7.m30282c();
                c11174jM30282c6.f35772x = c11175k7;
                c11174jM30282c6.f35773y = this;
                if (!Settings.System.canWrite(c11174jM30282c6.requireContext())) {
                    Intent intent4 = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                    intent4.setData(Uri.parse("package:" + c11174jM30282c6.requireActivity().getPackageName()));
                    c11174jM30282c6.f35766G.mo4052a(intent4, null);
                } else if (c11174jM30282c6.m30278y()) {
                    c11174jM30282c6.m30276A(new C11171g(c11174jM30282c6, 2));
                }
                break;
        }
    }
}
