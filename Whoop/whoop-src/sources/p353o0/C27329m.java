package p353o0;

import java.util.List;
import p078d1.C11457j;
import p151fn.C14618f;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;

/* JADX INFO: renamed from: o0.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C27329m {

    /* JADX INFO: renamed from: a */
    public final C11457j f109413a;

    /* JADX INFO: renamed from: b */
    public final int f109414b;

    /* JADX INFO: renamed from: c */
    public final int f109415c;

    /* JADX INFO: renamed from: d */
    public final C27328l f109416d;

    /* JADX INFO: renamed from: e */
    public final C27338v f109417e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C11457j f109418f;

    public C27329m(C11457j c11457j, int i13, int i14, C27328l c27328l, C27338v c27338v) {
        this.f109418f = c11457j;
        this.f109413a = c11457j;
        this.f109414b = i13;
        this.f109415c = i14;
        this.f109416d = c27328l;
        this.f109417e = c27338v;
    }

    /* JADX INFO: renamed from: a */
    public final long m82469a(int i13, int i14) {
        int i15;
        C11457j c11457j = this.f109413a;
        int[] iArr = (int[]) c11457j.f36753x;
        if (i14 == 1) {
            i15 = iArr[i13];
        } else {
            int i16 = (i14 + i13) - 1;
            int[] iArr2 = (int[]) c11457j.f36754y;
            i15 = (iArr2[i16] + iArr[i16]) - iArr2[i13];
        }
        if (i15 < 0) {
            i15 = 0;
        }
        if (i15 < 0) {
            AbstractC39177i.m124789a("width must be >= 0");
        }
        return AbstractC39170b.m124776h(i15, i15, 0, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public final C27333q m82470b(int i13) {
        C14618f c14618fM82477b = this.f109417e.m82477b(i13);
        int i14 = c14618fM82477b.f53875a;
        List list = c14618fM82477b.f53876b;
        int size = list.size();
        int i15 = 0;
        int i16 = (size == 0 || i14 + size == this.f109414b) ? 0 : this.f109415c;
        C27332p[] c27332pArr = new C27332p[size];
        int i17 = 0;
        while (i15 < size) {
            int i18 = (int) ((C27319c) list.get(i15)).f109387a;
            int i19 = i16;
            C27332p c27332pM82468Q = this.f109416d.m82468Q(i14 + i15, i17, i18, m82469a(i17, i18), i19);
            i17 += i18;
            c27332pArr[i15] = c27332pM82468Q;
            i15++;
            i16 = i19;
        }
        return new C27333q(i13, c27332pArr, this.f109418f, c14618fM82477b.f53876b, i16);
    }
}
