package p513u4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import e93.AbstractC12889b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p031b9.RunnableC2833g0;
import p044c5.C4212d;
import p449r4.AbstractC30915a;
import p450r5.RunnableC30928b;
import p543v4.AbstractC35642a;
import pg3.C29205p;

/* JADX INFO: renamed from: u4.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34514b {

    /* JADX INFO: renamed from: a */
    public static final float[][] f145092a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f145093b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f145094c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f145095d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e */
    public static final Object f145096e = new Object();

    /* JADX INFO: renamed from: f */
    public static Method f145097f;

    /* JADX INFO: renamed from: g */
    public static boolean f145098g;

    /* JADX INFO: renamed from: c */
    public static Shader m109067c(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        float f13;
        float f14;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        String name = xmlResourceParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM36252R = AbstractC12889b.m36252R(resources, theme, attributeSet, AbstractC30915a.f127493d);
        float f15 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM36252R.getFloat(8, 0.0f) : 0.0f;
        float f16 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM36252R.getFloat(9, 0.0f) : 0.0f;
        float f17 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM36252R.getFloat(10, 0.0f) : 0.0f;
        float f18 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM36252R.getFloat(11, 0.0f) : 0.0f;
        float f19 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM36252R.getFloat(3, 0.0f) : 0.0f;
        float f24 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM36252R.getFloat(4, 0.0f) : 0.0f;
        int i13 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayM36252R.getInt(2, 0) : 0;
        int color = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM36252R.getColor(0, 0) : 0;
        boolean z4 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM36252R.getColor(7, 0) : 0;
        int color3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM36252R.getColor(1, 0) : 0;
        int i14 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM36252R.getInt(6, 0) : 0;
        float f25 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM36252R.getFloat(5, 0.0f) : 0.0f;
        typedArrayM36252R.recycle();
        int depth = xmlResourceParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f26 = f25;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlResourceParser.next();
            f13 = f17;
            if (next == 1) {
                f14 = f18;
                break;
            }
            int depth2 = xmlResourceParser.getDepth();
            f14 = f18;
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray typedArrayM36252R2 = AbstractC12889b.m36252R(resources, theme, attributeSet, AbstractC30915a.f127494e);
                boolean zHasValue = typedArrayM36252R2.hasValue(0);
                boolean zHasValue2 = typedArrayM36252R2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM36252R2.getColor(0, 0);
                float f27 = typedArrayM36252R2.getFloat(1, 0.0f);
                typedArrayM36252R2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f27));
            }
            f17 = f13;
            f18 = f14;
        }
        C29205p c29205p = arrayList2.size() > 0 ? new C29205p(arrayList2, arrayList) : null;
        if (c29205p == null) {
            c29205p = z4 ? new C29205p(color, color2, color3) : new C29205p(color, color3);
        }
        if (i13 != 1) {
            if (i13 == 2) {
                return new SweepGradient(f19, f24, (int[]) c29205p.f118204x, (float[]) c29205p.f118205y);
            }
            int[] iArr = (int[]) c29205p.f118204x;
            float[] fArr = (float[]) c29205p.f118205y;
            if (i14 != 1) {
                tileMode2 = i14 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            return new LinearGradient(f15, f16, f13, f14, iArr, fArr, tileMode2);
        }
        if (f26 <= 0.0f) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        int[] iArr2 = (int[]) c29205p.f118204x;
        float[] fArr2 = (float[]) c29205p.f118205y;
        if (i14 != 1) {
            tileMode = i14 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        } else {
            tileMode = Shader.TileMode.REPEAT;
        }
        return new RadialGradient(f19, f24, f26, iArr2, fArr2, tileMode);
    }

    /* JADX INFO: renamed from: d */
    public static int m109068d(Resources resources, int i13, Resources.Theme theme) {
        return resources.getColor(i13, theme);
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m109069e(Resources resources, int i13, Resources.Theme theme) {
        return resources.getColorStateList(i13, theme);
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m109070f(Resources resources, int i13, Resources.Theme theme) {
        return resources.getDrawable(i13, theme);
    }

    /* JADX INFO: renamed from: g */
    public static Handler m109071g() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: h */
    public static int m109072h(float f13) {
        if (f13 < 1.0f) {
            return -16777216;
        }
        if (f13 > 99.0f) {
            return -1;
        }
        float f14 = (f13 + 16.0f) / 116.0f;
        float f15 = f13 > 8.0f ? f14 * f14 * f14 : f13 / 903.2963f;
        float f16 = f14 * f14 * f14;
        boolean z4 = f16 > 0.008856452f;
        float f17 = z4 ? f16 : ((f14 * 116.0f) - 16.0f) / 903.2963f;
        if (!z4) {
            f16 = ((f14 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f145094c;
        return AbstractC35642a.m112832a(f17 * fArr[0], f15 * fArr[1], f16 * fArr[2]);
    }

    /* JADX INFO: renamed from: i */
    public static float m109073i(int i13) {
        float f13 = i13 / 255.0f;
        return (f13 <= 0.04045f ? f13 / 12.92f : (float) Math.pow((f13 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC34516d m109074l(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m109077o(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC30915a.f127491b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                m109077o(xmlResourceParser);
            }
            List listM109075m = m109075m(resources, resourceId);
            return new C34519g(new C4212d(string, string2, string3, listM109075m), string4 != null ? new C4212d(string, string2, string4, listM109075m) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC30915a.f127492c);
                    int i13 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z4 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i14 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i15 = typedArrayObtainAttributes2.getInt(i14, 0);
                    int i16 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i16, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i16);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        m109077o(xmlResourceParser);
                    }
                    arrayList.add(new C34518f(i13, i15, resourceId2, string7, string6, z4));
                } else {
                    m109077o(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C34517e((C34518f[]) arrayList.toArray(new C34518f[0]));
    }

    /* JADX INFO: renamed from: m */
    public static List m109075m(Resources resources, int i13) {
        if (i13 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i13);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i14 = 0; i14 < typedArrayObtainTypedArray.length(); i14++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i14, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i13);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public static void m109076n(Resources.Theme theme) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC34520h.m109096b(theme);
            return;
        }
        synchronized (f145096e) {
            if (f145098g) {
                method = f145097f;
                if (method != null) {
                    method.invoke(theme, null);
                }
            } else {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    f145097f = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e5) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e5);
                }
                f145098g = true;
                method = f145097f;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException e13) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e13);
                        f145097f = null;
                    }
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m109077o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i13 = 1;
        while (i13 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i13++;
            } else if (next == 3) {
                i13--;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static float m109078p() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m109079a(int i13) {
        m109071g().post(new RunnableC2833g0(this, i13, 9));
    }

    /* JADX INFO: renamed from: b */
    public void m109080b(Typeface typeface) {
        m109071g().post(new RunnableC30928b(15, this, typeface));
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo50020j(int i13);

    /* JADX INFO: renamed from: k */
    public abstract void mo50021k(Typeface typeface);
}
