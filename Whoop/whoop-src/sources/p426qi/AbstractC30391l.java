package p426qi;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import bj.AbstractC3320s;
import dj.AbstractC12058c;
import dj.AbstractC12064i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import ne3.AbstractC26604b;
import ne3.C26619i0;
import ne3.C26621j0;
import ne3.C26645y;
import p049cj.AbstractC4737c;
import p049cj.C4738d;
import p584wi.C37303c;
import p584wi.C37307g;

/* JADX INFO: renamed from: qi.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30391l {

    /* JADX INFO: renamed from: a */
    public static final HashMap f124703a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashSet f124704b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static final byte[] f124705c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d */
    public static final byte[] f124706d = {31, -117, 8};

    /* JADX INFO: renamed from: a */
    public static C30378d0 m92862a(final String str, Callable callable, Runnable runnable) {
        C30387i c30387iM119484a = str == null ? null : C37307g.f159520b.m119484a(str);
        C30378d0 c30378d0 = c30387iM119484a != null ? new C30378d0(c30387iM119484a) : null;
        HashMap map = f124703a;
        if (str != null && map.containsKey(str)) {
            c30378d0 = (C30378d0) map.get(str);
        }
        if (c30378d0 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return c30378d0;
        }
        C30378d0 c30378d1 = new C30378d0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i13 = 0;
            c30378d1.m92855b(new InterfaceC30405z() { // from class: qi.j
                @Override // p426qi.InterfaceC30405z
                public final void onResult(Object obj) {
                    switch (i13) {
                        case 0:
                            HashMap map2 = AbstractC30391l.f124703a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                AbstractC30391l.m92872k();
                            }
                            break;
                        default:
                            HashMap map3 = AbstractC30391l.f124703a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                AbstractC30391l.m92872k();
                            }
                            break;
                    }
                }
            });
            final int i14 = 1;
            c30378d1.m92854a(new InterfaceC30405z() { // from class: qi.j
                @Override // p426qi.InterfaceC30405z
                public final void onResult(Object obj) {
                    switch (i14) {
                        case 0:
                            HashMap map2 = AbstractC30391l.f124703a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                AbstractC30391l.m92872k();
                            }
                            break;
                        default:
                            HashMap map3 = AbstractC30391l.f124703a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                AbstractC30391l.m92872k();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, c30378d1);
                if (map.size() == 1) {
                    m92872k();
                }
            }
        }
        return c30378d1;
    }

    /* JADX INFO: renamed from: b */
    public static C30374b0 m92863b(Context context, String str, String str2) {
        C30387i c30387iM119484a = str2 == null ? null : C37307g.f159520b.m119484a(str2);
        if (c30387iM119484a != null) {
            return new C30374b0(c30387iM119484a);
        }
        try {
            return m92864c(context, str2, context.getAssets().open(str));
        } catch (IOException e5) {
            return new C30374b0(e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C30374b0 m92864c(Context context, String str, InputStream inputStream) {
        C30387i c30387iM119484a = str == null ? null : C37307g.f159520b.m119484a(str);
        if (c30387iM119484a != null) {
            return new C30374b0(c30387iM119484a);
        }
        try {
            C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(AbstractC26604b.m79166k(inputStream));
            if (m92871j(c26621j0M79158c, f124705c).booleanValue()) {
                return m92869h(context, new ZipInputStream(new C26619i0(c26621j0M79158c)), str);
            }
            if (m92871j(c26621j0M79158c, f124706d).booleanValue()) {
                return m92866e(AbstractC26604b.m79166k(new GZIPInputStream(new C26619i0(c26621j0M79158c))), str);
            }
            String[] strArr = AbstractC4737c.f19339E;
            return m92865d(new C4738d(c26621j0M79158c), str, true);
        } catch (IOException e5) {
            return new C30374b0(e5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C30374b0 m92865d(C4738d c4738d, String str, boolean z4) {
        try {
            C30387i c30387iM119484a = str == null ? null : C37307g.f159520b.m119484a(str);
            if (c30387iM119484a != null) {
                return new C30374b0(c30387iM119484a);
            }
            C30387i c30387iM9619a = AbstractC3320s.m9619a(c4738d);
            if (str != null) {
                C37307g.f159520b.f159521a.m3d(str, c30387iM9619a);
            }
            return new C30374b0(c30387iM9619a);
        } catch (Exception e5) {
            return new C30374b0(e5);
        } finally {
            if (z4) {
                AbstractC12064i.m33264b(c4738d);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C30374b0 m92866e(C26645y c26645y, String str) {
        C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c26645y);
        String[] strArr = AbstractC4737c.f19339E;
        return m92865d(new C4738d(c26621j0M79158c), str, true);
    }

    /* JADX INFO: renamed from: f */
    public static C30378d0 m92867f(Context context, final int i13, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m92862a(str, new Callable() { // from class: qi.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return AbstractC30391l.m92868g(context2, i13, str);
            }
        }, null);
    }

    /* JADX INFO: renamed from: g */
    public static C30374b0 m92868g(Context context, int i13, String str) {
        C30387i c30387iM119484a = str == null ? null : C37307g.f159520b.m119484a(str);
        if (c30387iM119484a != null) {
            return new C30374b0(c30387iM119484a);
        }
        try {
            C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(AbstractC26604b.m79166k(context.getResources().openRawResource(i13)));
            if (m92871j(c26621j0M79158c, f124705c).booleanValue()) {
                return m92869h(context, new ZipInputStream(new C26619i0(c26621j0M79158c)), str);
            }
            if (!m92871j(c26621j0M79158c, f124706d).booleanValue()) {
                String[] strArr = AbstractC4737c.f19339E;
                return m92865d(new C4738d(c26621j0M79158c), str, true);
            }
            try {
                return m92866e(AbstractC26604b.m79166k(new GZIPInputStream(new C26619i0(c26621j0M79158c))), str);
            } catch (IOException e5) {
                return new C30374b0(e5);
            }
        } catch (Resources.NotFoundException e13) {
            return new C30374b0(e13);
        }
    }

    /* JADX INFO: renamed from: h */
    public static C30374b0 m92869h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return m92870i(context, zipInputStream, str);
        } finally {
            AbstractC12064i.m33264b(zipInputStream);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C30374b0 m92870i(Context context, ZipInputStream zipInputStream, String str) {
        C30387i c30387iM119484a;
        C30404y c30404y;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c30387iM119484a = null;
        } else {
            try {
                c30387iM119484a = C37307g.f159520b.m119484a(str);
            } catch (IOException e5) {
                return new C30374b0(e5);
            }
        }
        if (c30387iM119484a != null) {
            return new C30374b0(c30387iM119484a);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C30387i c30387i = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(AbstractC26604b.m79166k(zipInputStream));
                String[] strArr = AbstractC4737c.f19339E;
                c30387i = m92865d(new C4738d(c26621j0M79158c), null, false).f124646a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new C30374b0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i13 = zipInputStream.read(bArr);
                                if (i13 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i13);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    AbstractC12058c.m33240c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th7);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    AbstractC12058c.m33239b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c30387i == null) {
            return new C30374b0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c30387i.m92860c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    c30404y = null;
                    break;
                }
                c30404y = (C30404y) it.next();
            } while (!c30404y.m92899b().equals(str4));
            if (c30404y != null) {
                c30404y.m92903f(AbstractC12064i.m33266d((Bitmap) entry.getValue(), c30404y.m92902e(), c30404y.m92900c()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z4 = false;
            for (C37303c c37303c : c30387i.f124686f.values()) {
                if (c37303c.m119473a().equals(entry2.getKey())) {
                    c37303c.m119475c((Typeface) entry2.getValue());
                    z4 = true;
                }
            }
            if (!z4) {
                AbstractC12058c.m33239b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it3 = ((HashMap) c30387i.m92860c()).entrySet().iterator();
            while (it3.hasNext()) {
                C30404y c30404y2 = (C30404y) ((Map.Entry) it3.next()).getValue();
                if (c30404y2 == null) {
                    return null;
                }
                String strM92899b = c30404y2.m92899b();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strM92899b.startsWith("data:") && strM92899b.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strM92899b.substring(strM92899b.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            c30404y2.m92903f(AbstractC12064i.m33266d(bitmapDecodeByteArray, c30404y2.m92902e(), c30404y2.m92900c()));
                        }
                    } catch (IllegalArgumentException e13) {
                        AbstractC12058c.m33240c("data URL did not have correct base64 format.", e13);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C37307g.f159520b.f159521a.m3d(str, c30387i);
        }
        return new C30374b0(c30387i);
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m92871j(C26621j0 c26621j0, byte[] bArr) {
        try {
            C26621j0 c26621j0Peek = c26621j0.peek();
            for (byte b : bArr) {
                if (c26621j0Peek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            c26621j0Peek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            AbstractC12058c.f39982a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m92872k() {
        ArrayList arrayList = new ArrayList(f124704b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: l */
    public static String m92873l(Context context, int i13) {
        StringBuilder sb4 = new StringBuilder("rawRes");
        sb4.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb4.append(i13);
        return sb4.toString();
    }
}
