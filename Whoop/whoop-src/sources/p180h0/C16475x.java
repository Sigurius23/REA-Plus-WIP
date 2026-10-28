package p180h0;

import java.util.Arrays;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p268k0.AbstractC22086a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C16475x implements InterfaceC16397h1 {

    /* JADX INFO: renamed from: a */
    public final List f63308a;

    /* JADX INFO: renamed from: b */
    public final float[] f63309b;

    /* JADX INFO: renamed from: c */
    public final int f63310c;

    public C16475x(List list, float[] fArr) {
        this.f63308a = list;
        this.f63309b = fArr;
        if (list.size() != fArr.length) {
            AbstractC22086a.m63158a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + AbstractC25260n.m74044T0(fArr));
        }
        this.f63310c = fArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final Object m46646a(float f13) {
        float[] fArr = this.f63309b;
        int length = fArr.length;
        int i13 = -1;
        float f14 = Float.POSITIVE_INFINITY;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int i16 = i15 + 1;
            float fAbs = Math.abs(f13 - fArr[i14]);
            if (fAbs <= f14) {
                i13 = i15;
                f14 = fAbs;
            }
            i14++;
            i15 = i16;
        }
        return this.f63308a.get(i13);
    }

    /* JADX INFO: renamed from: b */
    public final Object m46647b(float f13, boolean z4) {
        float[] fArr = this.f63309b;
        int length = fArr.length;
        int i13 = -1;
        int i14 = 0;
        float f14 = Float.POSITIVE_INFINITY;
        int i15 = 0;
        while (i14 < length) {
            float f15 = fArr[i14];
            int i16 = i15 + 1;
            float f16 = z4 ? f15 - f13 : f13 - f15;
            if (f16 < 0.0f) {
                f16 = Float.POSITIVE_INFINITY;
            }
            if (f16 <= f14) {
                i13 = i15;
                f14 = f16;
            }
            i14++;
            i15 = i16;
        }
        return this.f63308a.get(i13);
    }

    /* JADX INFO: renamed from: c */
    public final float m46648c() {
        Float fValueOf;
        float[] fArr = this.f63309b;
        AbstractC22676k.m65750j(fArr, "<this>");
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float fMax = fArr[0];
            int i13 = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    fMax = Math.max(fMax, fArr[i13]);
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                }
            }
            fValueOf = Float.valueOf(fMax);
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: d */
    public final float m46649d() {
        Float fValueOf;
        float[] fArr = this.f63309b;
        AbstractC22676k.m65750j(fArr, "<this>");
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float fMin = fArr[0];
            int i13 = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    fMin = Math.min(fMin, fArr[i13]);
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                }
            }
            fValueOf = Float.valueOf(fMin);
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: e */
    public final float m46650e(Object obj) {
        int iIndexOf = this.f63308a.indexOf(obj);
        if (iIndexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.f63309b;
        if (iIndexOf < fArr.length) {
            return fArr[iIndexOf];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16475x)) {
            return false;
        }
        C16475x c16475x = (C16475x) obj;
        return AbstractC22676k.m65745e(this.f63308a, c16475x.f63308a) && Arrays.equals(this.f63309b, c16475x.f63309b) && this.f63310c == c16475x.f63310c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f63309b) + (this.f63308a.hashCode() * 31)) * 31) + this.f63310c;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    public final String toString() {
        float f13;
        StringBuilder sb4 = new StringBuilder("DraggableAnchors(anchors={");
        int i13 = 0;
        while (true) {
            int i14 = this.f63310c;
            if (i13 >= i14) {
                sb4.append("})");
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(AbstractC25265s.m74102I0(i13, this.f63308a));
            sb5.append('=');
            if (i13 >= 0) {
                float[] fArr = this.f63309b;
                if (i13 < fArr.length) {
                    f13 = fArr[i13];
                } else {
                    f13 = Float.NaN;
                }
            } else {
                f13 = Float.NaN;
            }
            sb5.append(f13);
            sb4.append(sb5.toString());
            if (i13 < i14 - 1) {
                sb4.append(", ");
            }
            i13++;
        }
    }
}
