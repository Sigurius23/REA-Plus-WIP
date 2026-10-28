package p294l3;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p002a0.AbstractC0048r;
import p002a0.C0020f0;
import p389p0.C28539n0;
import p448r3.AbstractC30895a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C23254g implements CharSequence {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f92133E = 0;

    /* JADX INFO: renamed from: w */
    public final List f92134w;

    /* JADX INFO: renamed from: x */
    public final String f92135x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f92136y;

    /* JADX INFO: renamed from: z */
    public final ArrayList f92137z;

    static {
        C28539n0 c28539n0 = AbstractC23265l0.f92165a;
    }

    public C23254g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f92134w = list;
        this.f92135x = str;
        int i13 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i14 = 0; i14 < size; i14++) {
                C23250e c23250e = (C23250e) list.get(i14);
                Object obj = c23250e.f92125a;
                if (obj instanceof C23267m0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c23250e);
                } else if (obj instanceof C23245b0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c23250e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f92136y = arrayList;
        this.f92137z = arrayList2;
        List listM74152u1 = arrayList2 != null ? AbstractC25265s.m74152u1(arrayList2, new C23252f(i13)) : null;
        List list2 = listM74152u1;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i15 = ((C23250e) AbstractC25265s.m74096F0(listM74152u1)).f92127c;
        C0020f0 c0020f0 = AbstractC0048r.f139a;
        C0020f0 c0020f1 = new C0020f0(1);
        c0020f1.m26a(i15);
        int size2 = listM74152u1.size();
        for (int i16 = 1; i16 < size2; i16++) {
            C23250e c23250e2 = (C23250e) listM74152u1.get(i16);
            while (c0020f1.f47b != 0) {
                int iM29d = c0020f1.m29d();
                int i17 = c23250e2.f92126b;
                int i18 = c23250e2.f92127c;
                if (i17 < iM29d) {
                    if (i18 > iM29d) {
                        AbstractC30895a.m95015a("Paragraph overlap not allowed, end " + i18 + " should be less than or equal to " + iM29d);
                        break;
                    }
                    break;
                }
                c0020f1.m31f(c0020f1.f47b - 1);
            }
            c0020f1.m26a(c23250e2.f92127c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m67314a(int i13) {
        List list = this.f92134w;
        if (list == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            C23250e c23250e = (C23250e) obj;
            if ((c23250e.f92125a instanceof AbstractC23284v) && AbstractC23256h.m67320b(0, i13, c23250e.f92126b, c23250e.f92127c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List m67315b(int i13, int i14) {
        List list = this.f92134w;
        if (list == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            C23250e c23250e = (C23250e) list.get(i15);
            if ((c23250e.f92125a instanceof C23271o0) && AbstractC23256h.m67320b(i13, i14, c23250e.f92126b, c23250e.f92127c)) {
                arrayList.add(AbstractC23278s.m67351h(c23250e));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final List m67316c(int i13, int i14, String str) {
        List list = this.f92134w;
        if (list == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            C23250e c23250e = (C23250e) list.get(i15);
            if ((c23250e.f92125a instanceof C23271o0) && str.equals(c23250e.f92128d) && AbstractC23256h.m67320b(i13, i14, c23250e.f92126b, c23250e.f92127c)) {
                arrayList.add(AbstractC23278s.m67351h(c23250e));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i13) {
        return this.f92135x.charAt(i13);
    }

    /* JADX INFO: renamed from: d */
    public final C23254g m67317d(Function1 function1) {
        C23248d c23248d = new C23248d(this);
        ArrayList arrayList = c23248d.f92121y;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C23250e c23250e = (C23250e) function1.invoke(((C23246c) arrayList.get(i13)).m67297a(Integer.MIN_VALUE));
            arrayList.set(i13, new C23246c(c23250e.f92126b, c23250e.f92127c, c23250e.f92125a, c23250e.f92128d));
        }
        return c23248d.m67309k();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C23254g subSequence(int i13, int i14) {
        ArrayList arrayList;
        if (i13 > i14) {
            AbstractC30895a.m95015a("start (" + i13 + ") should be less or equal to end (" + i14 + ')');
        }
        String str = this.f92135x;
        if (i13 == 0 && i14 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i13, i14);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        C23254g c23254g = AbstractC23256h.f92140a;
        if (i13 > i14) {
            AbstractC30895a.m95015a("start (" + i13 + ") should be less than or equal to end (" + i14 + ')');
        }
        List list = this.f92134w;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                C23250e c23250e = (C23250e) list.get(i15);
                int i16 = c23250e.f92126b;
                int i17 = c23250e.f92127c;
                if (AbstractC23256h.m67320b(i13, i14, i16, i17)) {
                    arrayList.add(new C23250e(Math.max(i13, c23250e.f92126b) - i13, Math.min(i14, i17) - i13, c23250e.f92125a, c23250e.f92128d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new C23254g(arrayList, strSubstring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23254g)) {
            return false;
        }
        C23254g c23254g = (C23254g) obj;
        return AbstractC22676k.m65745e(this.f92135x, c23254g.f92135x) && AbstractC22676k.m65745e(this.f92134w, c23254g.f92134w);
    }

    public final int hashCode() {
        int iHashCode = this.f92135x.hashCode() * 31;
        List list = this.f92134w;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f92135x.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f92135x;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23254g(int i13, String str, ArrayList arrayList) {
        List list = (i13 & 2) != 0 ? C25271y.f99162w : arrayList;
        C23254g c23254g = AbstractC23256h.f92140a;
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ C23254g(String str) {
        this(str, C25271y.f99162w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23254g(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
