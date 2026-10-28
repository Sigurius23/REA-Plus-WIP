package p122em;

import a30.C0332w0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import fm.AbstractC14571a;
import fm.AbstractC14585o;
import fm.AbstractC14587q;
import fm.AbstractC14588r;
import fm.AbstractC14589s;
import fm.AbstractC14592v;
import fm.C14572b;
import fm.C14573c;
import fm.C14574d;
import fm.C14575e;
import fm.C14576f;
import fm.C14577g;
import fm.C14578h;
import fm.C14579i;
import fm.C14580j;
import fm.C14581k;
import fm.C14582l;
import fm.C14584n;
import fm.EnumC14590t;
import fm.EnumC14591u;
import gm.C15980h;
import hm.InterfaceC17419f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import la.C23548b;
import p000.AbstractC11266d;
import p095dp.AbstractC12240d;
import p348nt.C27111d;
import pm.InterfaceC29353a;

/* JADX INFO: renamed from: em.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C13323c implements InterfaceC17419f {

    /* JADX INFO: renamed from: a */
    public final C23548b f46161a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f46162b;

    /* JADX INFO: renamed from: c */
    public final Context f46163c;

    /* JADX INFO: renamed from: d */
    public final URL f46164d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC29353a f46165e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC29353a f46166f;

    /* JADX INFO: renamed from: g */
    public final int f46167g;

    public C13323c(Context context, InterfaceC29353a interfaceC29353a, InterfaceC29353a interfaceC29353a2) {
        C27111d c27111d = new C27111d();
        C14573c c14573c = C14573c.f53607a;
        c27111d.m81481a(AbstractC14585o.class, c14573c);
        c27111d.m81481a(C14579i.class, c14573c);
        C14576f c14576f = C14576f.f53620a;
        c27111d.m81481a(AbstractC14589s.class, c14576f);
        c27111d.m81481a(C14582l.class, c14576f);
        C14574d c14574d = C14574d.f53609a;
        c27111d.m81481a(AbstractC14587q.class, c14574d);
        c27111d.m81481a(C14580j.class, c14574d);
        C14572b c14572b = C14572b.f53594a;
        c27111d.m81481a(AbstractC14571a.class, c14572b);
        c27111d.m81481a(C14578h.class, c14572b);
        C14575e c14575e = C14575e.f53612a;
        c27111d.m81481a(AbstractC14588r.class, c14575e);
        c27111d.m81481a(C14581k.class, c14575e);
        C14577g c14577g = C14577g.f53628a;
        c27111d.m81481a(AbstractC14592v.class, c14577g);
        c27111d.m81481a(C14584n.class, c14577g);
        c27111d.f108360d = true;
        this.f46161a = new C23548b(c27111d, 20);
        this.f46163c = context;
        this.f46162b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f46164d = m37429b(C13321a.f46152c);
        this.f46165e = interfaceC29353a2;
        this.f46166f = interfaceC29353a;
        this.f46167g = 130000;
    }

    /* JADX INFO: renamed from: b */
    public static URL m37429b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e5) {
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Invalid url: ", str), e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    /* JADX INFO: renamed from: a */
    public final C15980h m37430a(C15980h c15980h) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f46162b.getActiveNetworkInfo();
        C0332w0 c0332w0M45124c = c15980h.m45124c();
        int i13 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c0332w0M45124c.f1166G;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i13));
        c0332w0M45124c.m856f("model", Build.MODEL);
        c0332w0M45124c.m856f("hardware", Build.HARDWARE);
        c0332w0M45124c.m856f("device", Build.DEVICE);
        c0332w0M45124c.m856f("product", Build.PRODUCT);
        c0332w0M45124c.m856f("os-uild", Build.ID);
        c0332w0M45124c.m856f("manufacturer", Build.MANUFACTURER);
        c0332w0M45124c.m856f("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c0332w0M45124c.f1166G;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i14 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC14591u.f53665w;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c0332w0M45124c.f1166G;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC14590t.f53663w;
                subtype = 100;
            } else if (((EnumC14590t) EnumC14590t.f53663w.get(subtype)) == null) {
            }
            map = (HashMap) c0332w0M45124c.f1166G;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c0332w0M45124c.m856f("country", Locale.getDefault().getCountry());
            c0332w0M45124c.m856f("locale", Locale.getDefault().getLanguage());
            Context context = this.f46163c;
            c0332w0M45124c.m856f("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i14 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e5) {
                AbstractC12240d.m34035A("CctTransportBackend", "Unable to find version code for package", e5);
            }
            c0332w0M45124c.m856f("application_build", Integer.toString(i14));
            return c0332w0M45124c.m860m();
        }
        SparseArray sparseArray3 = EnumC14590t.f53663w;
        subtype = 0;
        map = (HashMap) c0332w0M45124c.f1166G;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c0332w0M45124c.m856f("country", Locale.getDefault().getCountry());
        c0332w0M45124c.m856f("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f46163c;
        c0332w0M45124c.m856f("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i14 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c0332w0M45124c.m856f("application_build", Integer.toString(i14));
        return c0332w0M45124c.m860m();
    }
}
