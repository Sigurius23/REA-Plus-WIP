package p316m1;

import java.util.Iterator;
import java.util.Map;
import m83.AbstractC25265s;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m1.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24893b0 {

    /* JADX INFO: renamed from: a */
    public final Map f97517a;

    public C24893b0(Map map) {
        this.f97517a = map;
    }

    /* JADX INFO: renamed from: a */
    public final Object m72990a(float f13) {
        Object next;
        Iterator it = this.f97517a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f13 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f13 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m72991b(float f13, boolean z4) {
        Object next;
        Iterator it = this.f97517a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f14 = z4 ? fFloatValue - f13 : f13 - fFloatValue;
                if (f14 < 0.0f) {
                    f14 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f15 = z4 ? fFloatValue2 - f13 : f13 - fFloatValue2;
                    if (f15 < 0.0f) {
                        f15 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f14, f15) > 0) {
                        next = next2;
                        f14 = f15;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final float m72992c() {
        Float fM74121Y0 = AbstractC25265s.m74121Y0(this.f97517a.values());
        if (fM74121Y0 != null) {
            return fM74121Y0.floatValue();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: d */
    public final float m72993d(Object obj) {
        Float f13 = (Float) this.f97517a.get(obj);
        if (f13 != null) {
            return f13.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24893b0)) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f97517a, ((C24893b0) obj).f97517a);
    }

    public final int hashCode() {
        return this.f97517a.hashCode() * 31;
    }

    public final String toString() {
        return AbstractC30802r.m94764m(new StringBuilder("MapDraggableAnchors("), this.f97517a, ')');
    }
}
