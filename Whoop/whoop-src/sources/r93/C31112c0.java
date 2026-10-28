package r93;

import java.util.ArrayList;
import java.util.Map;
import m83.AbstractC25247g0;
import va3.C35850h;

/* JADX INFO: renamed from: r93.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31112c0 extends AbstractC31167y0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f128313a;

    /* JADX INFO: renamed from: b */
    public final Map f128314b;

    public C31112c0(ArrayList arrayList) {
        this.f128313a = arrayList;
        this.f128314b = AbstractC25247g0.m74000i0(arrayList);
    }

    @Override // r93.AbstractC31167y0
    /* JADX INFO: renamed from: a */
    public final boolean mo95860a(C35850h c35850h) {
        return this.f128314b.containsKey(c35850h);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f128313a + ')';
    }
}
