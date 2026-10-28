package p543v4;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p044c5.C4217i;
import p505ts.AbstractC34132o;
import p513u4.C34517e;
import p513u4.C34518f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: v4.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C35647f extends AbstractC34132o {

    /* JADX INFO: renamed from: h */
    public static Class f151458h = null;

    /* JADX INFO: renamed from: i */
    public static Constructor f151459i = null;

    /* JADX INFO: renamed from: j */
    public static Method f151460j = null;

    /* JADX INFO: renamed from: k */
    public static Method f151461k = null;

    /* JADX INFO: renamed from: l */
    public static boolean f151462l = false;

    /* JADX INFO: renamed from: a */
    public final Class f151463a;

    /* JADX INFO: renamed from: b */
    public final Constructor f151464b;

    /* JADX INFO: renamed from: c */
    public final Method f151465c;

    /* JADX INFO: renamed from: d */
    public final Method f151466d;

    /* JADX INFO: renamed from: e */
    public final Method f151467e;

    /* JADX INFO: renamed from: f */
    public final Method f151468f;

    /* JADX INFO: renamed from: g */
    public final Method f151469g;

    public C35647f() throws NoSuchMethodException {
        Method methodM112853b0;
        Constructor<?> constructor;
        Method methodM112849a0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM112849a0 = m112849a0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodM112853b0 = m112853b0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e5.getClass().getName()), e5);
            methodM112853b0 = null;
            constructor = null;
            methodM112849a0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f151463a = cls;
        this.f151464b = constructor;
        this.f151465c = methodM112849a0;
        this.f151466d = method;
        this.f151467e = method2;
        this.f151468f = method3;
        this.f151469g = methodM112853b0;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m112847W(String str, boolean z4, int i13, Object obj) throws NoSuchMethodException {
        m112848Z();
        try {
            return ((Boolean) f151460j.invoke(obj, str, Integer.valueOf(i13), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m112848Z() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f151462l) {
            return;
        }
        f151462l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi21Impl", e5.getClass().getName(), e5);
            method = null;
            cls = null;
            method2 = null;
        }
        f151459i = constructor;
        f151458h = cls;
        f151460j = method2;
        f151461k = method;
    }

    /* JADX INFO: renamed from: a0 */
    public static Method m112849a0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m112850V(Context context, Object obj, String str, int i13, int i14, int i15, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f151465c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: X */
    public final Typeface m112851X(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f151463a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f151469g.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m112852Y(Object obj) {
        try {
            return ((Boolean) this.f151467e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final Method m112853b0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: m */
    public final Typeface mo107897m(Context context, C34517e c34517e, Resources resources, int i13) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f151465c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f151464b.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                C34518f[] c34518fArr = c34517e.f145100a;
                int length = c34518fArr.length;
                int i14 = 0;
                while (i14 < length) {
                    C34518f c34518f = c34518fArr[i14];
                    Context context2 = context;
                    if (m112850V(context2, objNewInstance, c34518f.f145101a, c34518f.f145105e, c34518f.f145102b, c34518f.f145103c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c34518f.f145104d))) {
                        i14++;
                        context = context2;
                    } else {
                        try {
                            this.f151468f.invoke(objNewInstance, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (m112852Y(objNewInstance)) {
                    return m112851X(objNewInstance);
                }
            }
            return null;
        }
        m112848Z();
        try {
            Object objNewInstance2 = f151459i.newInstance(null);
            for (C34518f c34518f2 : c34517e.f145100a) {
                File fileM118953E = AbstractC37056f.m118953E(context);
                if (fileM118953E == null) {
                    return null;
                }
                try {
                    if (AbstractC37056f.m118998v(fileM118953E, resources, c34518f2.f145106f)) {
                        if (m112847W(fileM118953E.getPath(), c34518f2.f145103c, c34518f2.f145102b, objNewInstance2)) {
                            fileM118953E.delete();
                        }
                    }
                } catch (RuntimeException unused3) {
                } finally {
                    fileM118953E.delete();
                }
                return null;
            }
            m112848Z();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) f151458h, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) f151461k.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e5) {
                throw new RuntimeException(e5);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: n */
    public final Typeface mo107898n(Context context, C4217i[] c4217iArr, int i13) throws IOException {
        Object objNewInstance;
        Typeface typefaceM112851X;
        boolean zBooleanValue;
        if (c4217iArr.length >= 1) {
            Method method = this.f151465c;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C4217i c4217i : c4217iArr) {
                        if (c4217i.f17102e == 0) {
                            Uri uri = c4217i.f17098a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC37056f.m118963O(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f151464b.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c4217iArr.length;
                        int i14 = 0;
                        boolean z4 = false;
                        while (true) {
                            Method method2 = this.f151468f;
                            if (i14 >= length) {
                                if (!z4) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!m112852Y(objNewInstance) || (typefaceM112851X = m112851X(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceM112851X, i13);
                            }
                            C4217i c4217i2 = c4217iArr[i14];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c4217i2.f17098a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f151466d.invoke(objNewInstance, byteBuffer, Integer.valueOf(c4217i2.f17099b), null, Integer.valueOf(c4217i2.f17100c), Integer.valueOf(c4217i2.f17101d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z4 = true;
                            }
                            i14++;
                            z4 = z4;
                        }
                    }
                } else {
                    C4217i c4217iMo107901s = mo107901s(c4217iArr, i13);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c4217iMo107901s.f17098a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c4217iMo107901s.f17100c).setItalic(c4217iMo107901s.f17101d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th3) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: p */
    public final Typeface mo107900p(Context context, Resources resources, int i13, String str, int i14) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f151465c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo107900p(context, resources, i13, str, i14);
        }
        try {
            objNewInstance = this.f151464b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m112850V(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f151468f.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m112852Y(objNewInstance)) {
                return m112851X(objNewInstance);
            }
        }
        return null;
    }
}
