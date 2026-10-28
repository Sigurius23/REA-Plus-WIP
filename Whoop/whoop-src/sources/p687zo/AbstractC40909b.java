package p687zo;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: renamed from: zo.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC40909b {

    /* JADX INFO: renamed from: a */
    public static final char[] f176318a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static Boolean f176319b;

    /* JADX INFO: renamed from: c */
    public static Boolean f176320c;

    /* JADX INFO: renamed from: d */
    public static Boolean f176321d;

    /* JADX INFO: renamed from: e */
    public static Boolean f176322e;

    /* JADX INFO: renamed from: f */
    public static String f176323f;

    /* JADX INFO: renamed from: g */
    public static Boolean f176324g;

    /* JADX INFO: renamed from: a */
    public static byte[] m132599a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    /* JADX INFO: renamed from: b */
    public static String m132600b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m132601c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f176319b == null) {
            f176319b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f176319b.booleanValue();
        if (f176320c == null) {
            f176320c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f176320c.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }
}
