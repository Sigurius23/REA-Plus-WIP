package no;

import p309lo.AbstractC24543a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: no.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C26873f {

    /* JADX INFO: renamed from: a */
    public final int f107231a;

    /* JADX INFO: renamed from: b */
    public final int f107232b;

    /* JADX INFO: renamed from: c */
    public final float[] f107233c;

    /* JADX INFO: renamed from: d */
    public final float[] f107234d;

    public C26873f(int i13, float[] fArr, float[] fArr2, int i14, int i15) {
        switch (i15) {
            case 1:
                this.f107231a = i13;
                AbstractC35849g.m113802d(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
                this.f107233c = fArr;
                this.f107234d = fArr2;
                this.f107232b = i14;
                break;
            default:
                this.f107231a = i13;
                AbstractC24543a.m71569e(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
                this.f107233c = fArr;
                this.f107234d = fArr2;
                this.f107232b = i14;
                break;
        }
    }
}
