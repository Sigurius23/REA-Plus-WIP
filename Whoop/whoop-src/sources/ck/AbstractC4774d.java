package ck;

import android.content.Context;
import cd3.C4455g;
import java.util.Set;
import java.util.UUID;
import m83.AbstractC25260n;
import p005a3.C0222l0;
import p114eb.C12968k;
import p173gj.C15901b;
import p173gj.C15903d;
import p173gj.C15906g;
import p173gj.C15913n;
import p255jk.C21743a;
import p282kk.EnumC22535d;
import p282kk.InterfaceC22536e;
import p428qk.C30438a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ck.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4774d implements InterfaceC22536e {

    /* JADX INFO: renamed from: y */
    public static final Set f19662y = AbstractC25260n.m74059b1(new String[]{"", "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000"});

    /* JADX INFO: renamed from: w */
    public C15903d f19663w;

    /* JADX INFO: renamed from: x */
    public C12968k f19664x;

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: a */
    public final C21743a mo15042a(C21743a c21743a) {
        C15906g c15906g = m15044c().f60128a;
        if (c21743a.f83631c == null) {
            c21743a.f83631c = Long.valueOf(System.currentTimeMillis());
        }
        if (c21743a.f83634f == null) {
            c21743a.f83634f = UUID.randomUUID().toString();
        }
        if (c21743a.f83613B == null) {
            c21743a.f83613B = "amplitude-analytics-android/1.21.1";
        }
        if (c21743a.f83629a == null) {
            c21743a.f83629a = (String) m15044c().f60129b.f812x;
        }
        if (c21743a.f83630b == null) {
            c21743a.f83630b = (String) m15044c().f60129b.f813y;
        }
        C15913n c15913n = c15906g.f60160i;
        if (c15913n.m44895a("version_name")) {
            C12968k c12968k = this.f19664x;
            if (c12968k == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c21743a.f83638j = c12968k.m36456e().f60224c;
        }
        if (c15913n.m44895a("os_name")) {
            C12968k c12968k2 = this.f19664x;
            if (c12968k2 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c12968k2.m36456e().getClass();
            c21743a.f83640l = "android";
        }
        if (c15913n.m44895a("os_version")) {
            C12968k c12968k3 = this.f19664x;
            if (c12968k3 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c21743a.f83641m = c12968k3.m36456e().f60225d;
        }
        if (c15913n.m44895a("device_brand")) {
            C12968k c12968k4 = this.f19664x;
            if (c12968k4 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c21743a.f83642n = c12968k4.m36456e().f60226e;
        }
        if (c15913n.m44895a("device_manufacturer")) {
            C12968k c12968k5 = this.f19664x;
            if (c12968k5 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c21743a.f83643o = c12968k5.m36456e().f60227f;
        }
        if (c15913n.m44895a("device_model")) {
            C12968k c12968k6 = this.f19664x;
            if (c12968k6 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c21743a.f83644p = c12968k6.m36456e().f60228g;
        }
        if (c15913n.m44895a("carrier")) {
            C12968k c12968k7 = this.f19664x;
            if (c12968k7 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c21743a.f83645q = c12968k7.m36456e().f60229h;
        }
        if (c15913n.m44895a("ip_address") && c21743a.f83614C == null) {
            c21743a.f83614C = "$remote";
        }
        if (c15913n.m44895a("country") && c21743a.f83614C != "$remote") {
            C12968k c12968k8 = this.f19664x;
            if (c12968k8 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c21743a.f83646r = c12968k8.m36456e().f60223b;
        }
        if (c15913n.m44895a("language")) {
            C12968k c12968k9 = this.f19664x;
            if (c12968k9 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            c21743a.f83612A = c12968k9.m36456e().f60230i;
        }
        if (c15913n.m44895a("platform")) {
            c21743a.f83639k = "Android";
        }
        if (c15913n.m44895a("lat_lng") && this.f19664x == null) {
            AbstractC22676k.m65757q("contextProvider");
            throw null;
        }
        if (c15913n.m44895a("adid")) {
            C12968k c12968k10 = this.f19664x;
            if (c12968k10 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            String str = c12968k10.m36456e().f60222a;
            if (str != null) {
                c21743a.f83652x = str;
            }
        }
        if (c15913n.m44895a("app_set_id")) {
            C12968k c12968k11 = this.f19664x;
            if (c12968k11 == null) {
                AbstractC22676k.m65757q("contextProvider");
                throw null;
            }
            String str2 = c12968k11.m36456e().f60231j;
            if (str2 != null) {
                c21743a.f83653y = str2;
            }
        }
        if (c21743a.f83622K == null) {
            m15044c();
        }
        if (c21743a.f83615D == null) {
            m15044c();
        }
        if (c21743a.f83616E == null) {
            m15044c();
        }
        return c21743a;
    }

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: b */
    public final void mo15043b(C15903d c15903d) {
        this.f19663w = c15903d;
        C15906g c15906g = c15903d.f60128a;
        Context context = c15906g.f60153b;
        C15913n c15913n = c15906g.f60160i;
        boolean zM44895a = c15913n.m44895a("adid");
        boolean zM44895a2 = c15913n.m44895a("app_set_id");
        AbstractC22676k.m65750j(context, "context");
        C12968k c12968k = new C12968k();
        c12968k.f44791c = context;
        c12968k.f44789a = zM44895a;
        c12968k.f44790b = zM44895a2;
        c12968k.f44792d = AbstractC30060g.m92088H(new C0222l0(c12968k, 11));
        this.f19664x = c12968k;
        m15045d(c15906g);
    }

    /* JADX INFO: renamed from: c */
    public final C15903d m15044c() {
        C15903d c15903d = this.f19663w;
        if (c15903d != null) {
            return c15903d;
        }
        AbstractC22676k.m65757q("amplitude");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m15045d(C15906g c15906g) {
        String deviceId = (String) m15044c().f60129b.f813y;
        if (deviceId != null) {
            AbstractC22676k.m65750j(deviceId, "deviceId");
            if (((deviceId.length() == 0 || f19662y.contains(deviceId)) ? false : true) && !AbstractC39421y.m125920E(deviceId, "S", false)) {
                return;
            }
        }
        String string = UUID.randomUUID().toString();
        AbstractC22676k.m65749i(string, "randomUUID().toString()");
        String deviceId2 = string.concat("R");
        AbstractC22676k.m65750j(deviceId2, "deviceId");
        C4455g c4455g = ((C15901b) this).f60125z.m44882c().f125070a;
        c4455g.m13935I(new C30438a(c4455g.m13958y().f125060a, deviceId2), 2);
    }

    @Override // p282kk.InterfaceC22536e
    public final EnumC22535d getType() {
        return EnumC22535d.f88573w;
    }
}
