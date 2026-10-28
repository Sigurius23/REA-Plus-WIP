package p180h0;

import java.util.ArrayList;
import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h0.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16402i1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f63049a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public float[] f63050b;

    public C16402i1() {
        float[] fArr = new float[5];
        for (int i13 = 0; i13 < 5; i13++) {
            fArr[i13] = Float.NaN;
        }
        this.f63050b = fArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m46592a(Enum r10, float f13) {
        ArrayList arrayList = this.f63049a;
        arrayList.add(r10);
        if (this.f63050b.length < arrayList.size()) {
            float[] fArrCopyOf = Arrays.copyOf(this.f63050b, arrayList.size() + 2);
            AbstractC22676k.m65749i(fArrCopyOf, "copyOf(...)");
            this.f63050b = fArrCopyOf;
        }
        this.f63050b[arrayList.size() - 1] = f13;
    }
}
