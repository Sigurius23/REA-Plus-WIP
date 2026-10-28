package p095dp;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import at.C1956b;
import com.google.android.gms.common.C4987d;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import cr.C11078p;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kr.C22786e;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10934a;
import p077d0.C11387o2;
import p529uo.AbstractC35135w;
import u00.C34377e;

/* JADX INFO: renamed from: dp.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12238b {

    /* JADX INFO: renamed from: c */
    public static Boolean f40941c = null;

    /* JADX INFO: renamed from: d */
    public static String f40942d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f40943e = false;

    /* JADX INFO: renamed from: f */
    public static int f40944f = -1;

    /* JADX INFO: renamed from: g */
    public static Boolean f40945g;

    /* JADX INFO: renamed from: k */
    public static C12243g f40949k;

    /* JADX INFO: renamed from: l */
    public static C12244h f40950l;

    /* JADX INFO: renamed from: a */
    public final Context f40951a;

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal f40946h = new ThreadLocal();

    /* JADX INFO: renamed from: i */
    public static final C1956b f40947i = new C1956b(5);

    /* JADX INFO: renamed from: j */
    public static final C34377e f40948j = new C34377e(22);

    /* JADX INFO: renamed from: b */
    public static final C22786e f40940b = new C22786e(23);

    public C12238b(Context context) {
        this.f40951a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m34028a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb4 = new StringBuilder(str.length() + 61);
            sb4.append("com.google.android.gms.dynamite.descriptors.");
            sb4.append(str);
            sb4.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb4.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC35135w.m111097i(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb5.append("Module descriptor id '");
            sb5.append(strValueOf);
            sb5.append("' didn't match expected id '");
            sb5.append(str);
            sb5.append("'");
            Log.e("DynamiteModule", sb5.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb6 = new StringBuilder(str.length() + 45);
            sb6.append("Local module descriptor class for ");
            sb6.append(str);
            sb6.append(" not found.");
            Log.w("DynamiteModule", sb6.toString());
            return 0;
        } catch (Exception e5) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e5.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023a A[Catch: all -> 0x0223, DynamiteModule$LoadingException -> 0x0226, RemoteException -> 0x0229, TryCatch #11 {RemoteException -> 0x0229, DynamiteModule$LoadingException -> 0x0226, all -> 0x0223, blocks: (B:89:0x0214, B:102:0x025b, B:104:0x0261, B:105:0x026a, B:106:0x0271, B:96:0x022c, B:97:0x0235, B:100:0x023a, B:101:0x024b, B:107:0x0272, B:108:0x027b, B:109:0x027c, B:110:0x0285, B:118:0x0296), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x024b A[Catch: all -> 0x0223, DynamiteModule$LoadingException -> 0x0226, RemoteException -> 0x0229, TryCatch #11 {RemoteException -> 0x0229, DynamiteModule$LoadingException -> 0x0226, all -> 0x0223, blocks: (B:89:0x0214, B:102:0x025b, B:104:0x0261, B:105:0x026a, B:106:0x0271, B:96:0x022c, B:97:0x0235, B:100:0x023a, B:101:0x024b, B:107:0x0272, B:108:0x027b, B:109:0x027c, B:110:0x0285, B:118:0x0296), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0261 A[Catch: all -> 0x0223, DynamiteModule$LoadingException -> 0x0226, RemoteException -> 0x0229, TryCatch #11 {RemoteException -> 0x0229, DynamiteModule$LoadingException -> 0x0226, all -> 0x0223, blocks: (B:89:0x0214, B:102:0x025b, B:104:0x0261, B:105:0x026a, B:106:0x0271, B:96:0x022c, B:97:0x0235, B:100:0x023a, B:101:0x024b, B:107:0x0272, B:108:0x027b, B:109:0x027c, B:110:0x0285, B:118:0x0296), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x026a A[Catch: all -> 0x0223, DynamiteModule$LoadingException -> 0x0226, RemoteException -> 0x0229, TryCatch #11 {RemoteException -> 0x0229, DynamiteModule$LoadingException -> 0x0226, all -> 0x0223, blocks: (B:89:0x0214, B:102:0x025b, B:104:0x0261, B:105:0x026a, B:106:0x0271, B:96:0x022c, B:97:0x0235, B:100:0x023a, B:101:0x024b, B:107:0x0272, B:108:0x027b, B:109:0x027c, B:110:0x0285, B:118:0x0296), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0272 A[Catch: all -> 0x0223, DynamiteModule$LoadingException -> 0x0226, RemoteException -> 0x0229, TryCatch #11 {RemoteException -> 0x0229, DynamiteModule$LoadingException -> 0x0226, all -> 0x0223, blocks: (B:89:0x0214, B:102:0x025b, B:104:0x0261, B:105:0x026a, B:106:0x0271, B:96:0x022c, B:97:0x0235, B:100:0x023a, B:101:0x024b, B:107:0x0272, B:108:0x027b, B:109:0x027c, B:110:0x0285, B:118:0x0296), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x027c A[Catch: all -> 0x0223, DynamiteModule$LoadingException -> 0x0226, RemoteException -> 0x0229, TryCatch #11 {RemoteException -> 0x0229, DynamiteModule$LoadingException -> 0x0226, all -> 0x0223, blocks: (B:89:0x0214, B:102:0x025b, B:104:0x0261, B:105:0x026a, B:106:0x0271, B:96:0x022c, B:97:0x0235, B:100:0x023a, B:101:0x024b, B:107:0x0272, B:108:0x027b, B:109:0x027c, B:110:0x0285, B:118:0x0296), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x028a  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:139:0x0308  */
    /* JADX WARN: Code duplicated, block: B:144:0x0319 A[Catch: all -> 0x00b8, TryCatch #8 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0297, B:120:0x029e, B:128:0x02ad, B:130:0x02d5, B:132:0x02e5, B:142:0x0311, B:143:0x0318, B:123:0x02a1, B:124:0x02a2, B:125:0x02a9, B:144:0x0319, B:145:0x0339, B:146:0x033a, B:147:0x0387), top: B:165:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #8 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0297, B:120:0x029e, B:128:0x02ad, B:130:0x02d5, B:132:0x02e5, B:142:0x0311, B:143:0x0318, B:123:0x02a1, B:124:0x02a2, B:125:0x02a9, B:144:0x0319, B:145:0x0339, B:146:0x033a, B:147:0x0387), top: B:165:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:34:0x00f1, B:36:0x00f7, B:37:0x00f9), top: B:160:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: all -> 0x0171, DynamiteModule$LoadingException -> 0x0176, RemoteException -> 0x017b, TRY_ENTER, TryCatch #10 {RemoteException -> 0x017b, DynamiteModule$LoadingException -> 0x0176, all -> 0x0171, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0150, B:58:0x015b, B:66:0x0195, B:68:0x019d, B:69:0x01a4, B:70:0x01ab, B:65:0x0180, B:73:0x01ae, B:74:0x01af, B:75:0x01b6, B:76:0x01b7, B:77:0x01be, B:80:0x01c1, B:81:0x01c2, B:83:0x01f5, B:85:0x0208, B:87:0x0210), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[Catch: all -> 0x0171, DynamiteModule$LoadingException -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {RemoteException -> 0x017b, DynamiteModule$LoadingException -> 0x0176, all -> 0x0171, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0150, B:58:0x015b, B:66:0x0195, B:68:0x019d, B:69:0x01a4, B:70:0x01ab, B:65:0x0180, B:73:0x01ae, B:74:0x01af, B:75:0x01b6, B:76:0x01b7, B:77:0x01be, B:80:0x01c1, B:81:0x01c2, B:83:0x01f5, B:85:0x0208, B:87:0x0210), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[Catch: all -> 0x0171, DynamiteModule$LoadingException -> 0x0176, RemoteException -> 0x017b, TRY_ENTER, TryCatch #10 {RemoteException -> 0x017b, DynamiteModule$LoadingException -> 0x0176, all -> 0x0171, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0150, B:58:0x015b, B:66:0x0195, B:68:0x019d, B:69:0x01a4, B:70:0x01ab, B:65:0x0180, B:73:0x01ae, B:74:0x01af, B:75:0x01b6, B:76:0x01b7, B:77:0x01be, B:80:0x01c1, B:81:0x01c2, B:83:0x01f5, B:85:0x0208, B:87:0x0210), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7 A[Catch: all -> 0x0171, DynamiteModule$LoadingException -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {RemoteException -> 0x017b, DynamiteModule$LoadingException -> 0x0176, all -> 0x0171, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0150, B:58:0x015b, B:66:0x0195, B:68:0x019d, B:69:0x01a4, B:70:0x01ab, B:65:0x0180, B:73:0x01ae, B:74:0x01af, B:75:0x01b6, B:76:0x01b7, B:77:0x01be, B:80:0x01c1, B:81:0x01c2, B:83:0x01f5, B:85:0x0208, B:87:0x0210), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c2 A[Catch: all -> 0x0171, DynamiteModule$LoadingException -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {RemoteException -> 0x017b, DynamiteModule$LoadingException -> 0x0176, all -> 0x0171, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0150, B:58:0x015b, B:66:0x0195, B:68:0x019d, B:69:0x01a4, B:70:0x01ab, B:65:0x0180, B:73:0x01ae, B:74:0x01af, B:75:0x01b6, B:76:0x01b7, B:77:0x01be, B:80:0x01c1, B:81:0x01c2, B:83:0x01f5, B:85:0x0208, B:87:0x0210), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f5 A[Catch: all -> 0x0171, DynamiteModule$LoadingException -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {RemoteException -> 0x017b, DynamiteModule$LoadingException -> 0x0176, all -> 0x0171, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0150, B:58:0x015b, B:66:0x0195, B:68:0x019d, B:69:0x01a4, B:70:0x01ab, B:65:0x0180, B:73:0x01ae, B:74:0x01af, B:75:0x01b6, B:76:0x01b7, B:77:0x01be, B:80:0x01c1, B:81:0x01c2, B:83:0x01f5, B:85:0x0208, B:87:0x0210), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0208 A[Catch: all -> 0x0171, DynamiteModule$LoadingException -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {RemoteException -> 0x017b, DynamiteModule$LoadingException -> 0x0176, all -> 0x0171, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0150, B:58:0x015b, B:66:0x0195, B:68:0x019d, B:69:0x01a4, B:70:0x01ab, B:65:0x0180, B:73:0x01ae, B:74:0x01af, B:75:0x01b6, B:76:0x01b7, B:77:0x01be, B:80:0x01c1, B:81:0x01c2, B:83:0x01f5, B:85:0x0208, B:87:0x0210), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0210 A[Catch: all -> 0x0171, DynamiteModule$LoadingException -> 0x0176, RemoteException -> 0x017b, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x017b, DynamiteModule$LoadingException -> 0x0176, all -> 0x0171, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0150, B:58:0x015b, B:66:0x0195, B:68:0x019d, B:69:0x01a4, B:70:0x01ab, B:65:0x0180, B:73:0x01ae, B:74:0x01af, B:75:0x01b6, B:76:0x01b7, B:77:0x01be, B:80:0x01c1, B:81:0x01c2, B:83:0x01f5, B:85:0x0208, B:87:0x0210), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022c A[Catch: all -> 0x0223, DynamiteModule$LoadingException -> 0x0226, RemoteException -> 0x0229, TryCatch #11 {RemoteException -> 0x0229, DynamiteModule$LoadingException -> 0x0226, all -> 0x0223, blocks: (B:89:0x0214, B:102:0x025b, B:104:0x0261, B:105:0x026a, B:106:0x0271, B:96:0x022c, B:97:0x0235, B:100:0x023a, B:101:0x024b, B:107:0x0272, B:108:0x027b, B:109:0x027c, B:110:0x0285, B:118:0x0296), top: B:164:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0236  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [kr.e] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    /* JADX INFO: renamed from: c */
    public static C12238b m34029c(Context context, C22786e c22786e, String str) throws DynamiteModule$LoadingException {
        ?? r10;
        int i13;
        C12238b c12238b;
        Cursor cursor;
        int i14;
        Boolean bool;
        C12243g c12243gM34033g;
        int i15;
        InterfaceC10934a interfaceC10934aM34090m0;
        Object objM28987c0;
        C12242f c12242f;
        C12244h c12244h;
        C12242f c12242f2;
        boolean z4;
        InterfaceC10934a interfaceC10934aM34094m0;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new DynamiteModule$LoadingException("null application Context");
        }
        ThreadLocal threadLocal = f40946h;
        C12242f c12242f3 = (C12242f) threadLocal.get();
        C12242f c12242f4 = new C12242f();
        threadLocal.set(c12242f4);
        C1956b c1956b = f40947i;
        Long l7 = (Long) c1956b.get();
        long jLongValue = l7.longValue();
        try {
            c1956b.set(Long.valueOf(SystemClock.uptimeMillis()));
            C11078p c11078pM66000o = c22786e.m66000o(context, str, f40948j);
            int i16 = c11078pM66000o.f35038a;
            int i17 = c11078pM66000o.f35039b;
            StringBuilder sb4 = new StringBuilder(str.length() + 26 + String.valueOf(i16).length() + 19 + str.length() + 1 + String.valueOf(i17).length());
            sb4.append("Considering local module ");
            sb4.append(str);
            sb4.append(":");
            sb4.append(i16);
            sb4.append(" and remote module ");
            sb4.append(str);
            sb4.append(":");
            sb4.append(i17);
            Log.i("DynamiteModule", sb4.toString());
            int i18 = c11078pM66000o.f35040c;
            if (i18 != 0) {
                if (i18 != -1) {
                    if (i18 == 1 || c11078pM66000o.f35039b != 0) {
                        if (i18 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            C12238b c12238b2 = new C12238b(applicationContext);
                            if (jLongValue == 0) {
                                c1956b.remove();
                            } else {
                                c1956b.set(l7);
                            }
                            cursor2 = c12242f4.f40955a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(c12242f3);
                            return c12238b2;
                        }
                        if (i18 == 1) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(i18).length() + 36);
                            sb5.append("VersionPolicy returned invalid code:");
                            sb5.append(i18);
                            throw new DynamiteModule$LoadingException(sb5.toString());
                        }
                        try {
                            try {
                                i14 = c11078pM66000o.f35039b;
                                try {
                                    try {
                                        try {
                                            synchronized (C12238b.class) {
                                                try {
                                                    if (m34030d(context)) {
                                                        throw new DynamiteModule$LoadingException("Remote loading disabled");
                                                    }
                                                    bool = f40941c;
                                                    if (bool != null) {
                                                        throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb6 = new StringBuilder(str.length() + 40 + String.valueOf(i14).length());
                                                        sb6.append("Selected remote version of ");
                                                        sb6.append(str);
                                                        sb6.append(", version >= ");
                                                        sb6.append(i14);
                                                        Log.i("DynamiteModule", sb6.toString());
                                                        synchronized (C12238b.class) {
                                                            c12244h = f40950l;
                                                        }
                                                        if (c12244h != null) {
                                                            throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        c12242f2 = (C12242f) threadLocal.get();
                                                        if (c12242f2 != null || c12242f2.f40955a == null) {
                                                            throw new DynamiteModule$LoadingException("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = c12242f2.f40955a;
                                                        BinderC10935b.m28988j0(null);
                                                        synchronized (C12238b.class) {
                                                            z4 = f40944f >= 2;
                                                        }
                                                        if (z4) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            interfaceC10934aM34094m0 = c12244h.m34095n0(new BinderC10935b(applicationContext2), str, i14, new BinderC10935b(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            interfaceC10934aM34094m0 = c12244h.m34094m0(new BinderC10935b(applicationContext2), str, i14, new BinderC10935b(cursor3));
                                                        }
                                                        Context context2 = (Context) BinderC10935b.m28987c0(interfaceC10934aM34094m0);
                                                        if (context2 == null) {
                                                            throw new DynamiteModule$LoadingException("Failed to get module context");
                                                        }
                                                        c12238b = new C12238b(context2);
                                                    } else {
                                                        StringBuilder sb7 = new StringBuilder(str.length() + 40 + String.valueOf(i14).length());
                                                        sb7.append("Selected remote version of ");
                                                        sb7.append(str);
                                                        sb7.append(", version >= ");
                                                        sb7.append(i14);
                                                        Log.i("DynamiteModule", sb7.toString());
                                                        c12243gM34033g = m34033g(context);
                                                        if (c12243gM34033g != null) {
                                                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelM57320c0 = c12243gM34033g.m57320c0(c12243gM34033g.m57322k0(), 6);
                                                        i15 = parcelM57320c0.readInt();
                                                        parcelM57320c0.recycle();
                                                        if (i15 >= 3) {
                                                            c12242f = (C12242f) threadLocal.get();
                                                            if (c12242f != null) {
                                                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                                            }
                                                            interfaceC10934aM34090m0 = c12243gM34033g.m34093p0(new BinderC10935b(context), str, i14, new BinderC10935b(c12242f.f40955a));
                                                        } else if (i15 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            interfaceC10934aM34090m0 = c12243gM34033g.m34091n0(new BinderC10935b(context), str, i14);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            interfaceC10934aM34090m0 = c12243gM34033g.m34090m0(new BinderC10935b(context), str, i14);
                                                        }
                                                        objM28987c0 = BinderC10935b.m28987c0(interfaceC10934aM34090m0);
                                                        if (objM28987c0 != null) {
                                                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                                                        }
                                                        c12238b = new C12238b((Context) objM28987c0);
                                                    }
                                                    if (jLongValue == 0) {
                                                        f40947i.remove();
                                                    } else {
                                                        f40947i.set(l7);
                                                    }
                                                    cursor = c12242f4.f40955a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    f40946h.set(c12242f3);
                                                    return c12238b;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (RemoteException e5) {
                                        e = e5;
                                        throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                    } catch (DynamiteModule$LoadingException e13) {
                                        throw e13;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                    }
                                } catch (RemoteException e14) {
                                    e = e14;
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                } catch (DynamiteModule$LoadingException e15) {
                                    throw e15;
                                } catch (Throwable th6) {
                                    th = th6;
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                }
                            } catch (DynamiteModule$LoadingException e16) {
                                e = e16;
                                r10 = c1956b;
                                String message = e.getMessage();
                                StringBuilder sb8 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb8.append("Failed to load remote module: ");
                                sb8.append(message);
                                Log.w("DynamiteModule", sb8.toString());
                                i13 = c11078pM66000o.f35038a;
                                if (i13 != 0 || c22786e.m66000o(r10, str, new C11387o2(i13, 1)).f35040c != -1) {
                                    throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                c12238b = new C12238b(applicationContext);
                            }
                        } catch (DynamiteModule$LoadingException e17) {
                            e = e17;
                            r10 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb9 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb9.append("Failed to load remote module: ");
                            sb9.append(message2);
                            Log.w("DynamiteModule", sb9.toString());
                            i13 = c11078pM66000o.f35038a;
                            if (i13 != 0) {
                            }
                            throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (c11078pM66000o.f35038a != 0) {
                    i18 = -1;
                    if (i18 == 1) {
                    }
                    if (i18 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        C12238b c12238b3 = new C12238b(applicationContext);
                        if (jLongValue == 0) {
                            c1956b.remove();
                        } else {
                            c1956b.set(l7);
                        }
                        cursor2 = c12242f4.f40955a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(c12242f3);
                        return c12238b3;
                    }
                    if (i18 == 1) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i18).length() + 36);
                        sb10.append("VersionPolicy returned invalid code:");
                        sb10.append(i18);
                        throw new DynamiteModule$LoadingException(sb10.toString());
                    }
                    i14 = c11078pM66000o.f35039b;
                    synchronized (C12238b.class) {
                        if (m34030d(context)) {
                            throw new DynamiteModule$LoadingException("Remote loading disabled");
                        }
                        bool = f40941c;
                        if (bool != null) {
                            throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb11 = new StringBuilder(str.length() + 40 + String.valueOf(i14).length());
                            sb11.append("Selected remote version of ");
                            sb11.append(str);
                            sb11.append(", version >= ");
                            sb11.append(i14);
                            Log.i("DynamiteModule", sb11.toString());
                            synchronized (C12238b.class) {
                                c12244h = f40950l;
                                if (c12244h != null) {
                                    throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                c12242f2 = (C12242f) threadLocal.get();
                                if (c12242f2 != null) {
                                }
                                throw new DynamiteModule$LoadingException("No result cursor");
                            }
                        }
                        StringBuilder sb12 = new StringBuilder(str.length() + 40 + String.valueOf(i14).length());
                        sb12.append("Selected remote version of ");
                        sb12.append(str);
                        sb12.append(", version >= ");
                        sb12.append(i14);
                        Log.i("DynamiteModule", sb12.toString());
                        c12243gM34033g = m34033g(context);
                        if (c12243gM34033g != null) {
                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelM57320c1 = c12243gM34033g.m57320c0(c12243gM34033g.m57322k0(), 6);
                        i15 = parcelM57320c1.readInt();
                        parcelM57320c1.recycle();
                        if (i15 >= 3) {
                            c12242f = (C12242f) threadLocal.get();
                            if (c12242f != null) {
                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                            }
                            interfaceC10934aM34090m0 = c12243gM34033g.m34093p0(new BinderC10935b(context), str, i14, new BinderC10935b(c12242f.f40955a));
                        } else if (i15 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            interfaceC10934aM34090m0 = c12243gM34033g.m34091n0(new BinderC10935b(context), str, i14);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            interfaceC10934aM34090m0 = c12243gM34033g.m34090m0(new BinderC10935b(context), str, i14);
                        }
                        objM28987c0 = BinderC10935b.m28987c0(interfaceC10934aM34090m0);
                        if (objM28987c0 != null) {
                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                        }
                        c12238b = new C12238b((Context) objM28987c0);
                        if (jLongValue == 0) {
                            f40947i.remove();
                        } else {
                            f40947i.set(l7);
                        }
                        cursor = c12242f4.f40955a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f40946h.set(c12242f3);
                        return c12238b;
                    }
                }
            }
            int i19 = c11078pM66000o.f35038a;
            int i24 = c11078pM66000o.f35039b;
            StringBuilder sb13 = new StringBuilder(str.length() + 46 + String.valueOf(i19).length() + 23 + String.valueOf(i24).length() + 1);
            sb13.append("No acceptable module ");
            sb13.append(str);
            sb13.append(" found. Local version is ");
            sb13.append(i19);
            sb13.append(" and remote version is ");
            sb13.append(i24);
            sb13.append(".");
            throw new DynamiteModule$LoadingException(sb13.toString());
        } catch (Throwable th7) {
            if (jLongValue == 0) {
                f40947i.remove();
            } else {
                f40947i.set(l7);
            }
            Cursor cursor4 = c12242f4.f40955a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f40946h.set(c12242f3);
            throw th7;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m34030d(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f40945g)) {
            return true;
        }
        boolean z4 = false;
        if (f40945g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (C4987d.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z4 = true;
            }
            f40945g = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f40943e = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    public static int m34031e(Context context, String str, boolean z4, boolean z13) throws Throwable {
        Exception exc;
        Throwable th3;
        MatrixCursor matrixCursor;
        boolean z14;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z15 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z4 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f40947i.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z16 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i13 = 0; i13 < count; i13++) {
                                    if (!cursorQuery.moveToPosition(i13)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i14 = 0; i14 < columnCount; i14++) {
                                        int type = cursorQuery.getType(i14);
                                        if (type == 0) {
                                            objArr[i14] = null;
                                        } else if (type == 1) {
                                            objArr[i14] = Long.valueOf(cursorQuery.getLong(i14));
                                        } else if (type == 2) {
                                            objArr[i14] = Double.valueOf(cursorQuery.getDouble(i14));
                                        } else if (type == 3) {
                                            objArr[i14] = cursorQuery.getString(i14);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i14] = cursorQuery.getBlob(i14);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th4) {
                                try {
                                    cursorQuery.close();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th6) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th6;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i15 = matrixCursor.getInt(0);
                            if (i15 > 0) {
                                synchronized (C12238b.class) {
                                    try {
                                        f40942d = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f40944f = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z14 = matrixCursor.getInt(columnIndex2) != 0;
                                            f40943e = z14;
                                        } else {
                                            z14 = false;
                                        }
                                    } catch (Throwable th7) {
                                        throw th7;
                                    }
                                }
                                C12242f c12242f = (C12242f) f40946h.get();
                                if (c12242f == null || c12242f.f40955a != null) {
                                    z15 = false;
                                } else {
                                    c12242f.f40955a = matrixCursor;
                                }
                                z16 = z14;
                                matrixCursor2 = z15 ? null : matrixCursor;
                            }
                            if (z13 && z16) {
                                throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i15;
                        }
                    } catch (Exception e5) {
                        exc = e5;
                        if (exc instanceof DynamiteModule$LoadingException) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb4.append("V2 version check failed: ");
                        sb4.append(message);
                        throw new DynamiteModule$LoadingException(sb4.toString(), exc);
                    } catch (Throwable th8) {
                        th3 = th8;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th3;
                        }
                        matrixCursor2.close();
                        throw th3;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th9) {
                th3 = th9;
            }
        } catch (Exception e13) {
            exc = e13;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m34032f(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            C12244h c12244h = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c12244h = iInterfaceQueryLocalInterface instanceof C12244h ? (C12244h) iInterfaceQueryLocalInterface : new C12244h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
            }
            f40950l = c12244h;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e5);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C12243g m34033g(Context context) {
        C12243g c12243g;
        synchronized (C12238b.class) {
            C12243g c12243g2 = f40949k;
            if (c12243g2 != null) {
                return c12243g2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c12243g = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c12243g = iInterfaceQueryLocalInterface instanceof C12243g ? (C12243g) iInterfaceQueryLocalInterface : new C12243g(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (c12243g != null) {
                    f40949k = c12243g;
                    return c12243g;
                }
            } catch (Exception e5) {
                String message = e5.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 45);
                sb4.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb4.append(message);
                Log.e("DynamiteModule", sb4.toString());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m34034b() throws DynamiteModule$LoadingException {
        try {
            return (IBinder) this.f40951a.getClassLoader().loadClass("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e5) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl"), e5);
        }
    }
}
