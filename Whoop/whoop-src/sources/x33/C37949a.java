package x33;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.text.Normalizer;
import l83.C23467m;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33366b4;
import t23.C33403i3;
import t23.InterfaceC33408j3;
import yb3.C39412p;

/* JADX INFO: renamed from: x33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C37949a {

    /* JADX INFO: renamed from: a */
    public static final C39412p f162441a = new C39412p("[^\\p{ASCII}]");

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX INFO: renamed from: a */
    public static String m121544a() {
        Object objM107888l;
        String strConcat;
        PackageManager packageManager;
        PackageInfo packageInfo;
        String strConcat2;
        String string;
        StringBuilder sb4 = new StringBuilder("stream-video-android-1.28.0");
        sb4.append("|os=Android " + Build.VERSION.RELEASE);
        sb4.append("|api_version=" + Build.VERSION.SDK_INT);
        sb4.append("|device_model=" + Build.MANUFACTURER + " " + Build.MODEL);
        C33403i3 c33403i3 = InterfaceC33408j3.f139483t;
        c33403i3.getClass();
        InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
        if ((interfaceC33408j3 instanceof C33366b4 ? (C33366b4) interfaceC33408j3 : null) != null) {
            try {
                c33403i3.getClass();
                InterfaceC33408j3 interfaceC33408j4 = C33403i3.f139477b;
                Context context = interfaceC33408j4 != null ? ((C33366b4) interfaceC33408j4).f139259w : null;
                if (context == null || (packageManager = context.getPackageManager()) == null) {
                    objM107888l = null;
                } else {
                    c33403i3.getClass();
                    InterfaceC33408j3 interfaceC33408j5 = C33403i3.f139477b;
                    Context context2 = interfaceC33408j5 != null ? ((C33366b4) interfaceC33408j5).f139259w : null;
                    String packageName = context2 != null ? context2.getPackageName() : null;
                    if (packageName == null || (packageInfo = packageManager.getPackageInfo(packageName, 0)) == null) {
                        objM107888l = null;
                    } else {
                        objM107888l = packageInfo.versionName;
                    }
                }
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            if (objM107888l instanceof C23467m) {
                objM107888l = null;
            }
            String str = (String) objM107888l;
            if (str == null) {
                str = "nameNotFound";
            }
            strConcat = "|app_version=".concat(str);
            if (strConcat == null) {
                strConcat = "";
            }
        } else {
            strConcat = "";
        }
        sb4.append(strConcat);
        C33403i3 c33403i4 = InterfaceC33408j3.f139483t;
        c33403i4.getClass();
        InterfaceC33408j3 interfaceC33408j6 = C33403i3.f139477b;
        if ((interfaceC33408j6 instanceof C33366b4 ? (C33366b4) interfaceC33408j6 : null) != null) {
            c33403i4.getClass();
            InterfaceC33408j3 interfaceC33408j7 = C33403i3.f139477b;
            Context context3 = interfaceC33408j7 != null ? ((C33366b4) interfaceC33408j7).f139259w : null;
            String string2 = "UnknownApp";
            if (context3 != null) {
                ApplicationInfo applicationInfo = context3.getApplicationInfo();
                int i13 = applicationInfo.labelRes;
                if (i13 != 0) {
                    string2 = context3.getString(i13);
                    AbstractC22676k.m65747g(string2);
                } else {
                    CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                    if (charSequence != null && (string = charSequence.toString()) != null) {
                        string2 = string;
                    }
                }
            }
            strConcat2 = "|app_name=".concat(string2);
            if (strConcat2 == null) {
                strConcat2 = "";
            }
        } else {
            strConcat2 = "";
        }
        sb4.append(strConcat2);
        String string3 = sb4.toString();
        AbstractC22676k.m65749i(string3, "toString(...)");
        String strNormalize = Normalizer.normalize(string3, Normalizer.Form.NFD);
        AbstractC22676k.m65749i(strNormalize, "normalize(...)");
        return f162441a.m125852f(strNormalize, "");
    }
}
