package p294l3;

import java.util.ArrayList;
import java.util.List;
import p448r3.AbstractC30895a;

/* JADX INFO: renamed from: l3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C23248d implements Appendable {

    /* JADX INFO: renamed from: w */
    public final StringBuilder f92119w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f92120x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f92121y;

    public /* synthetic */ C23248d() {
        this(16);
    }

    /* JADX INFO: renamed from: a */
    public final void m67299a(C23267m0 c23267m0, int i13, int i14) {
        this.f92121y.add(new C23246c(null, i13, i14, 8, c23267m0));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C23254g) {
            m67301c((C23254g) charSequence);
            return this;
        }
        this.f92119w.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m67300b(String str) {
        this.f92119w.append(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m67301c(C23254g c23254g) {
        StringBuilder sb4 = this.f92119w;
        int length = sb4.length();
        sb4.append(c23254g.f92135x);
        List list = c23254g.f92134w;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                C23250e c23250e = (C23250e) list.get(i13);
                this.f92121y.add(new C23246c(c23250e.f92126b + length, c23250e.f92127c + length, c23250e.f92125a, c23250e.f92128d));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m67302d(C23254g c23254g, int i13, int i14) {
        StringBuilder sb4 = this.f92119w;
        int length = sb4.length();
        sb4.append((CharSequence) c23254g.f92135x, i13, i14);
        List listM67319a = AbstractC23256h.m67319a(c23254g, i13, i14, null);
        if (listM67319a != null) {
            int size = listM67319a.size();
            for (int i15 = 0; i15 < size; i15++) {
                C23250e c23250e = (C23250e) listM67319a.get(i15);
                this.f92121y.add(new C23246c(c23250e.f92126b + length, c23250e.f92127c + length, c23250e.f92125a, c23250e.f92128d));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m67303e() {
        ArrayList arrayList = this.f92120x;
        if (arrayList.isEmpty()) {
            AbstractC30895a.m95017c("Nothing to pop.");
        }
        ((C23246c) arrayList.remove(arrayList.size() - 1)).f92115c = this.f92119w.length();
    }

    /* JADX INFO: renamed from: f */
    public final void m67304f(int i13) {
        ArrayList arrayList = this.f92120x;
        if (i13 >= arrayList.size()) {
            AbstractC30895a.m95017c(i13 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i13) {
            m67303e();
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m67305g(C23280t c23280t) {
        C23246c c23246c = new C23246c(null, this.f92119w.length(), 0, 12, c23280t);
        ArrayList arrayList = this.f92120x;
        arrayList.add(c23246c);
        this.f92121y.add(c23246c);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m67306h(String str, String str2) {
        C23246c c23246c = new C23246c(str, this.f92119w.length(), 0, 4, new C23271o0(str2));
        ArrayList arrayList = this.f92120x;
        arrayList.add(c23246c);
        this.f92121y.add(c23246c);
        arrayList.size();
    }

    /* JADX INFO: renamed from: i */
    public final int m67307i(C23245b0 c23245b0) {
        C23246c c23246c = new C23246c(null, this.f92119w.length(), 0, 12, c23245b0);
        ArrayList arrayList = this.f92120x;
        arrayList.add(c23246c);
        this.f92121y.add(c23246c);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: j */
    public final int m67308j(C23267m0 c23267m0) {
        C23246c c23246c = new C23246c(null, this.f92119w.length(), 0, 12, c23267m0);
        ArrayList arrayList = this.f92120x;
        arrayList.add(c23246c);
        this.f92121y.add(c23246c);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: k */
    public final C23254g m67309k() {
        StringBuilder sb4 = this.f92119w;
        String string = sb4.toString();
        ArrayList arrayList = this.f92121y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(((C23246c) arrayList.get(i13)).m67297a(sb4.length()));
        }
        return new C23254g(string, arrayList2);
    }

    public C23248d(int i13) {
        this.f92119w = new StringBuilder(i13);
        this.f92120x = new ArrayList();
        this.f92121y = new ArrayList();
        new ArrayList();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i13, int i14) {
        if (charSequence instanceof C23254g) {
            m67302d((C23254g) charSequence, i13, i14);
            return this;
        }
        this.f92119w.append(charSequence, i13, i14);
        return this;
    }

    public C23248d(C23254g c23254g) {
        this();
        m67301c(c23254g);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        this.f92119w.append(c3);
        return this;
    }
}
