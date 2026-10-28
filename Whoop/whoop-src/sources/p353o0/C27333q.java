package p353o0;

import java.util.List;
import p078d1.C11457j;

/* JADX INFO: renamed from: o0.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C27333q {

    /* JADX INFO: renamed from: a */
    public final int f109469a;

    /* JADX INFO: renamed from: b */
    public final C27332p[] f109470b;

    /* JADX INFO: renamed from: c */
    public final C11457j f109471c;

    /* JADX INFO: renamed from: d */
    public final List f109472d;

    /* JADX INFO: renamed from: e */
    public final int f109473e;

    /* JADX INFO: renamed from: f */
    public final int f109474f;

    /* JADX INFO: renamed from: g */
    public final int f109475g;

    public C27333q(int i13, C27332p[] c27332pArr, C11457j c11457j, List list, int i14) {
        this.f109469a = i13;
        this.f109470b = c27332pArr;
        this.f109471c = c11457j;
        this.f109472d = list;
        this.f109473e = i14;
        int iMax = 0;
        for (C27332p c27332p : c27332pArr) {
            iMax = Math.max(iMax, c27332p.f109459n);
        }
        this.f109474f = iMax;
        int i15 = iMax + this.f109473e;
        this.f109475g = i15 >= 0 ? i15 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final C27332p[] m82475a(int i13, int i14, int i15) {
        C27332p[] c27332pArr = this.f109470b;
        int length = c27332pArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < length) {
            C27332p c27332p = c27332pArr[i16];
            int i19 = i17 + 1;
            int i24 = (int) ((C27319c) this.f109472d.get(i17)).f109387a;
            c27332p.m82474m(i13, ((int[]) this.f109471c.f36754y)[i18], i14, i15, this.f109469a, i18);
            i18 += i24;
            i16++;
            i17 = i19;
        }
        return c27332pArr;
    }
}
