package p513u4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.whoop.android.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p449r4.AbstractC30915a;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: u4.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34515c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f145099a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m109081a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m109082b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m109082b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f13;
        int iM109072h;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = AbstractC30915a.f127490a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i13, i13);
                int resourceId = ObtainAttributes.getResourceId(i13, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f145099a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r10);
                    int i15 = typedValue.type;
                    if (i15 < 28 || i15 > 31) {
                        try {
                            color = m109081a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i13, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i13, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i13, -65281);
                }
                if (ObtainAttributes.hasValue(r10)) {
                    f13 = ObtainAttributes.getFloat(r10, 1.0f);
                } else {
                    f13 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r10;
                float f14 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i16 = i13;
                int i17 = i16;
                while (i16 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i18 = i17 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i16, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i17] = attributeNameResource;
                        i17 = i18;
                    }
                    i16++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i17);
                float f15 = 100.0f;
                boolean z4 = (f14 < 0.0f || f14 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f13 != 1.0f || z4) {
                    int iM96939r = AbstractC31479j.m96939r((int) ((Color.alpha(color) * f13) + 0.5f), 0, 255);
                    if (z4) {
                        C34513a c34513aM109064a = C34513a.m109064a(color);
                        float f16 = c34513aM109064a.f145086a;
                        float f17 = c34513aM109064a.f145087b;
                        C34524l c34524l = C34524l.f145120k;
                        if (f17 >= 1.0d && Math.round(f14) > 0.0d && Math.round(f14) < 100.0d) {
                            float fMin = f16 < 0.0f ? 0.0f : Math.min(360.0f, f16);
                            float f18 = 0.0f;
                            float f19 = f17;
                            boolean z13 = r16 == true ? 1 : 0;
                            C34513a c34513a = null;
                            while (true) {
                                if (Math.abs(f18 - f17) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (c34513a != null) {
                                        iM109072h = c34513a.m109066c(c34524l);
                                        break;
                                    }
                                    iM109072h = AbstractC34514b.m109072h(f14);
                                    break;
                                }
                                float f24 = 1000.0f;
                                float f25 = f15;
                                float f26 = 0.0f;
                                float f27 = 1000.0f;
                                C34513a c34513a2 = null;
                                while (true) {
                                    if (Math.abs(f26 - f25) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f15 = f15;
                                        break;
                                    }
                                    f15 = f15;
                                    float f28 = ((f25 - f26) / 2.0f) + f26;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iM109066c = C34513a.m109065b(f28, f19, fMin).m109066c(C34524l.f145120k);
                                    float fM109073i = AbstractC34514b.m109073i(Color.red(iM109066c));
                                    float fM109073i2 = AbstractC34514b.m109073i(Color.green(iM109066c));
                                    float fM109073i3 = AbstractC34514b.m109073i(Color.blue(iM109066c));
                                    float[] fArr = AbstractC34514b.f145095d[r16 == true ? 1 : 0];
                                    float f29 = ((fM109073i3 * fArr[2]) + ((fM109073i2 * fArr[r16 == true ? 1 : 0]) + (fM109073i * fArr[0]))) / f15;
                                    float fCbrt = f29 <= 0.008856452f ? f29 * 903.2963f : (((float) Math.cbrt(f29)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f14 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        C34513a c34513aM109064a2 = C34513a.m109064a(iM109066c);
                                        C34513a c34513aM109065b = C34513a.m109065b(c34513aM109064a2.f145088c, c34513aM109064a2.f145087b, fMin);
                                        float f34 = c34513aM109064a2.f145089d - c34513aM109065b.f145089d;
                                        float f35 = c34513aM109064a2.f145090e - c34513aM109065b.f145090e;
                                        float f36 = c34513aM109064a2.f145091f - c34513aM109065b.f145091f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f36 * f36) + (f35 * f35) + (f34 * f34)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f27 = fPow;
                                            f24 = fAbs;
                                            c34513a2 = c34513aM109064a2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f24 == 0.0f && f27 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f14) {
                                        f26 = f28;
                                    } else {
                                        f25 = f28;
                                    }
                                    f15 = f15;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                C34513a c34513a3 = c34513a2;
                                if (!z13) {
                                    if (c34513a3 == null) {
                                        f17 = f19;
                                    } else {
                                        c34513a = c34513a3;
                                        f18 = f19;
                                    }
                                    f19 = ((f17 - f18) / 2.0f) + f18;
                                } else {
                                    if (c34513a3 != null) {
                                        iM109072h = c34513a3.m109066c(c34524l);
                                        break;
                                    }
                                    f19 = ((f17 - f18) / 2.0f) + f18;
                                    z13 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iM109072h = AbstractC34514b.m109072h(f14);
                        }
                        color = iM109072h;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iM96939r << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i19 = i14 + 1;
                if (i19 > iArr.length) {
                    int[] iArr4 = new int[i14 <= 4 ? 8 : i14 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i14);
                    iArr = iArr4;
                }
                iArr[i14] = color;
                if (i19 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i14 > 4 ? i14 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i14);
                    objArr = objArr2;
                }
                objArr[i14] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i14 = i19;
                r10 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i13 = 0;
            } else {
                int i24 = depth2;
                r10 = r10 == true ? 1 : 0;
                depth2 = i24;
                i13 = 0;
            }
        }
        int[] iArr5 = new int[i14];
        int[][] iArr6 = new int[i14][];
        System.arraycopy(iArr, 0, iArr5, 0, i14);
        System.arraycopy(objArr, 0, iArr6, 0, i14);
        return new ColorStateList(iArr6, iArr5);
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m109083c(Resources resources, int i13, Resources.Theme theme) {
        try {
            return m109081a(resources, resources.getXml(i13), theme);
        } catch (Exception e5) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e5);
            return null;
        }
    }
}
