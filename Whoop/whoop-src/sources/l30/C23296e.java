package l30;

import ai.C0904j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import ih0.AbstractC18489d0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import l83.C23465k;
import live.hms.video.factories.MediaConstraintsFactory;
import m83.AbstractC25247g0;
import p029b5.C2728g;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29924p0;
import q30.C29926q0;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: l30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C23296e {

    /* JADX INFO: renamed from: a */
    public final C0904j f92298a;

    /* JADX INFO: renamed from: b */
    public final C29924p0 f92299b;

    /* JADX INFO: renamed from: c */
    public final DisplayMetrics f92300c;

    /* JADX INFO: renamed from: d */
    public final String f92301d;

    /* JADX INFO: renamed from: e */
    public final TelephonyManager f92302e;

    /* JADX INFO: renamed from: f */
    public final int f92303f;

    /* JADX INFO: renamed from: g */
    public final AudioManager f92304g;

    /* JADX INFO: renamed from: h */
    public final PackageManager f92305h;

    /* JADX INFO: renamed from: i */
    public final int f92306i;

    /* JADX INFO: renamed from: j */
    public final String f92307j;

    /* JADX INFO: renamed from: k */
    public final String f92308k;

    /* JADX INFO: renamed from: l */
    public final int f92309l;

    public C23296e(Context context, C0904j c0904j, C29924p0 c29924p0) {
        String name;
        int i13;
        this.f92298a = c0904j;
        this.f92299b = c29924p0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AbstractC22676k.m65749i(displayMetrics, "getDisplayMetrics(...)");
        this.f92300c = displayMetrics;
        this.f92301d = WebSettings.getDefaultUserAgent(context);
        Object systemService = context.getSystemService("phone");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.f92302e = (TelephonyManager) systemService;
        int i14 = 0;
        this.f92303f = Settings.Secure.getInt(context.getContentResolver(), "secure_frp_mode", 0);
        Object systemService2 = context.getSystemService("audio");
        AbstractC22676k.m65748h(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        this.f92304g = (AudioManager) systemService2;
        this.f92305h = context.getPackageManager();
        this.f92306i = Build.VERSION.SDK_INT;
        this.f92307j = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(Calendar.getInstance().getTime());
        Field[] fields = Build.VERSION_CODES.class.getFields();
        AbstractC22676k.m65749i(fields, "getFields(...)");
        int length = fields.length;
        while (true) {
            if (i14 >= length) {
                name = null;
                break;
            }
            Field field = fields[i14];
            name = field.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            try {
                i13 = field.getInt(new Object());
            } catch (IllegalAccessException | IllegalArgumentException | NullPointerException unused) {
                i13 = -1;
            }
            if (i13 == Build.VERSION.SDK_INT) {
                break;
            } else {
                i14++;
            }
        }
        name = name == null ? "UNKNOWN" : name;
        String str = Build.VERSION.RELEASE;
        int i15 = this.f92306i;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Android ", name, " ", str, " API ");
        sbM32001t.append(i15);
        this.f92308k = sbM32001t.toString();
        this.f92309l = (TimeZone.getDefault().getRawOffset() / 1000) / 60;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m67389a(String str, C29926q0 c29926q0, AbstractC32269c abstractC32269c) {
        C23295d c23295d;
        String str2;
        C23465k[] c23465kArr;
        int i13;
        C29926q0 c29926q1;
        String str3;
        C23296e c23296e;
        C23465k[] c23465kArr2;
        if (abstractC32269c instanceof C23295d) {
            c23295d = (C23295d) abstractC32269c;
            int i14 = c23295d.f92293J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c23295d.f92293J = i14 - Integer.MIN_VALUE;
            } else {
                c23295d = new C23295d(this, abstractC32269c);
            }
        } else {
            c23295d = new C23295d(this, abstractC32269c);
        }
        Object obj = c23295d.f92291H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c23295d.f92293J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            C23465k[] c23465kArr3 = new C23465k[13];
            EnumC23297f enumC23297f = EnumC23297f.PARAM_PLATFORM;
            c23465kArr3[0] = new C23465k("C001", "Android");
            c23465kArr3[1] = new C23465k("C002", AbstractC18489d0.m53370k(Build.MANUFACTURER, "||", Build.MODEL));
            c23465kArr3[2] = new C23465k("C003", this.f92308k);
            c23465kArr3[3] = new C23465k("C004", Build.VERSION.RELEASE);
            Locale[] localeArr = {Locale.getDefault()};
            C2728g c2728g = C2728g.f10738b;
            c23465kArr3[4] = new C23465k("C005", C2728g.m7699f(new LocaleList(localeArr)).m7703e());
            c23465kArr3[5] = new C23465k("C006", String.valueOf(this.f92309l));
            Locale locale = Locale.ROOT;
            DisplayMetrics displayMetrics = this.f92300c;
            c23465kArr3[6] = new C23465k("C008", String.format(locale, "%sx%s", Arrays.copyOf(new Object[]{new Integer(displayMetrics.heightPixels), new Integer(displayMetrics.widthPixels)}, 2)));
            c23295d.f92294w = this;
            c23295d.f92295x = str;
            c23295d.f92296y = c29926q0;
            c23295d.f92297z = c23465kArr3;
            c23295d.f92288E = c23465kArr3;
            c23295d.f92289F = "C014";
            c23295d.f92290G = 7;
            c23295d.f92293J = 1;
            Object objM2221h = this.f92298a.m2221h(c23295d);
            if (objM2221h == enumC31071a) {
                return enumC31071a;
            }
            str2 = str;
            c23465kArr = c23465kArr3;
            i13 = 7;
            c29926q1 = c29926q0;
            obj = objM2221h;
            str3 = "C014";
            c23296e = this;
            c23465kArr2 = c23465kArr;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c23295d.f92290G;
            str3 = c23295d.f92289F;
            c23465kArr = c23295d.f92288E;
            c23465kArr2 = c23295d.f92297z;
            c29926q1 = c23295d.f92296y;
            str2 = c23295d.f92295x;
            c23296e = c23295d.f92294w;
            AbstractC34132o.m107864I(obj);
        }
        c23465kArr[i13] = new C23465k(str3, ((C23292a) obj).f92280w);
        EnumC23297f enumC23297f2 = EnumC23297f.PARAM_PLATFORM;
        C29924p0 c29924p0 = c23296e.f92299b;
        int i16 = c23296e.f92306i;
        TelephonyManager telephonyManager = c23296e.f92302e;
        c23465kArr2[8] = new C23465k("C015", "2.2.0");
        c23465kArr2[9] = new C23465k("C016", str2);
        c23465kArr2[10] = new C23465k("C017", c23296e.f92307j);
        c23465kArr2[11] = new C23465k("C018", c29926q1.f122226w);
        c23465kArr2[12] = new C23465k("A137", c23296e.f92301d);
        HashMap mapM73987V = AbstractC25247g0.m73987V(c23465kArr2);
        if (i16 >= 28) {
            mapM73987V.put("A138", String.valueOf(telephonyManager.getSimCarrierId()));
            mapM73987V.put("A139", String.valueOf(telephonyManager.getSimCarrierIdName()));
        }
        if (i16 >= 29) {
            mapM73987V.put("A141", String.valueOf(telephonyManager.getSimSpecificCarrierId()));
            mapM73987V.put("A142", String.valueOf(telephonyManager.getSimSpecificCarrierIdName()));
            if (c23296e.f92305h.hasSystemFeature("android.hardware.telephony.ims")) {
                mapM73987V.put("A150", String.valueOf(telephonyManager.isRttSupported()));
            }
        }
        if (i16 >= 30) {
            mapM73987V.put("A145", String.valueOf(telephonyManager.getSubscriptionId()));
            mapM73987V.put("A151", c23296e.f92303f == 1 ? MediaConstraintsFactory.kValueTrue : MediaConstraintsFactory.kValueFalse);
        }
        if (i16 >= 31) {
            mapM73987V.put("A153", Build.SKU);
            mapM73987V.put("A154", Build.SOC_MANUFACTURER);
            mapM73987V.put("A155", Build.SOC_MODEL);
        }
        if (i16 >= 33) {
            mapM73987V.put("A152", String.valueOf(c23296e.f92304g.isRampingRingerEnabled()));
        }
        return mapM73987V;
    }
}
