package p353o0;

import java.util.ArrayList;
import m83.C25271y;
import p151fn.C14618f;
import p268k0.AbstractC22086a;
import p389p0.C28526h;

/* JADX INFO: renamed from: o0.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C27338v {

    /* JADX INFO: renamed from: a */
    public final C27323g f109480a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f109481b;

    /* JADX INFO: renamed from: c */
    public int f109482c;

    /* JADX INFO: renamed from: d */
    public int f109483d;

    /* JADX INFO: renamed from: e */
    public int f109484e;

    /* JADX INFO: renamed from: f */
    public int f109485f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f109486g;

    /* JADX INFO: renamed from: h */
    public Object f109487h;

    /* JADX INFO: renamed from: i */
    public int f109488i;

    public C27338v(C27323g c27323g) {
        this.f109480a = c27323g;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C27336t(0, 0));
        this.f109481b = arrayList;
        this.f109485f = -1;
        this.f109486g = new ArrayList();
        this.f109487h = C25271y.f99162w;
    }

    /* JADX INFO: renamed from: a */
    public final int m82476a() {
        return ((int) Math.sqrt((((double) m82479d()) * 1.0d) / ((double) this.f109488i))) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final C14618f m82477b(int i13) {
        ?? r10;
        int i14 = this.f109488i;
        int i15 = i13 * i14;
        int iM82479d = m82479d() - i15;
        if (i14 > iM82479d) {
            i14 = iM82479d;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i14 == this.f109487h.size()) {
            r10 = this.f109487h;
        } else {
            ArrayList arrayList = new ArrayList(i14);
            for (int i16 = 0; i16 < i14; i16++) {
                arrayList.add(new C27319c(1));
            }
            this.f109487h = arrayList;
            r10 = arrayList;
        }
        return new C14618f(i15, r10);
    }

    /* JADX INFO: renamed from: c */
    public final int m82478c(int i13) {
        if (m82479d() <= 0) {
            return 0;
        }
        if (i13 >= m82479d()) {
            AbstractC22086a.m63158a("ItemIndex > total count");
        }
        return i13 / this.f109488i;
    }

    /* JADX INFO: renamed from: d */
    public final int m82479d() {
        return this.f109480a.f109398d.f2432x;
    }

    /* JADX INFO: renamed from: e */
    public final int m82480e(int i13) {
        C28526h c28526hM1698m = this.f109480a.f109398d.m1698m(i13);
        int i14 = i13 - c28526hM1698m.f115433a;
        return (int) ((C27319c) ((C27322f) c28526hM1698m.f115435c).f109393a.invoke(C27337u.f109479a, Integer.valueOf(i14))).f109387a;
    }
}
