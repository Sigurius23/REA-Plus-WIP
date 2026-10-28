package p395p6;

import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p6.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28931x0 {

    /* JADX INFO: renamed from: a */
    public final int f117046a;

    /* JADX INFO: renamed from: b */
    public final int f117047b;

    /* JADX INFO: renamed from: c */
    public final Map f117048c;

    public C28931x0(Map map, int i13, int i14) {
        this.f117046a = i13;
        this.f117047b = i14;
        this.f117048c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28931x0)) {
            return false;
        }
        C28931x0 c28931x0 = (C28931x0) obj;
        return this.f117046a == c28931x0.f117046a && this.f117047b == c28931x0.f117047b && AbstractC22676k.m65745e(this.f117048c, c28931x0.f117048c);
    }

    public final int hashCode() {
        return this.f117048c.hashCode() + AbstractC11266d.m30448b(this.f117047b, Integer.hashCode(this.f117046a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InsertedViewInfo(mainViewId=");
        sb4.append(this.f117046a);
        sb4.append(", complexViewId=");
        sb4.append(this.f117047b);
        sb4.append(", children=");
        return AbstractC30802r.m94764m(sb4, this.f117048c, ')');
    }

    public /* synthetic */ C28931x0(int i13, Map map, int i14, int i15) {
        this((i15 & 4) != 0 ? C25272z.f99163w : map, (i15 & 1) != 0 ? -1 : i13, (i15 & 2) != 0 ? -1 : i14);
    }
}
