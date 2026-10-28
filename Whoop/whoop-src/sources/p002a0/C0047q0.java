package p002a0;

import e93.AbstractC12889b;
import i93.C18284j;
import java.util.List;
import m83.AbstractC25260n;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047q0 {

    /* JADX INFO: renamed from: a */
    public Object[] f136a;

    /* JADX INFO: renamed from: b */
    public int f137b;

    /* JADX INFO: renamed from: c */
    public C0043o0 f138c;

    public C0047q0(int i13) {
        this.f136a = i13 == 0 ? AbstractC0009b1.f23a : new Object[i13];
    }

    /* JADX INFO: renamed from: a */
    public final void m98a(Object obj) {
        int i13 = this.f137b + 1;
        Object[] objArr = this.f136a;
        if (objArr.length < i13) {
            m109l(i13, objArr);
        }
        Object[] objArr2 = this.f136a;
        int i14 = this.f137b;
        objArr2[i14] = obj;
        this.f137b = i14 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m99b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i13 = this.f137b;
        int size = list.size() + i13;
        Object[] objArr = this.f136a;
        if (objArr.length < size) {
            m109l(size, objArr);
        }
        Object[] objArr2 = this.f136a;
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            objArr2[i14 + i13] = list.get(i14);
        }
        this.f137b = list.size() + this.f137b;
    }

    /* JADX INFO: renamed from: c */
    public final void m100c() {
        AbstractC25260n.m74073n0(0, this.f137b, null, this.f136a);
        this.f137b = 0;
    }

    /* JADX INFO: renamed from: d */
    public final Object m101d() {
        if (!m104g()) {
            return this.f136a[0];
        }
        AbstractC34924m.m110136R("ObjectList is empty.");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final Object m102e(int i13) {
        if (i13 >= 0 && i13 < this.f137b) {
            return this.f136a[i13];
        }
        m110m(i13);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0047q0) {
            C0047q0 c0047q0 = (C0047q0) obj;
            int i13 = c0047q0.f137b;
            int i14 = this.f137b;
            if (i13 == i14) {
                Object[] objArr = this.f136a;
                Object[] objArr2 = c0047q0.f136a;
                C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, i14);
                int i15 = c18284jM36278i0.f71133w;
                int i16 = c18284jM36278i0.f71134x;
                if (i15 > i16) {
                    return true;
                }
                while (AbstractC22676k.m65745e(objArr[i15], objArr2[i15])) {
                    if (i15 == i16) {
                        return true;
                    }
                    i15++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m103f(Object obj) {
        int i13 = 0;
        if (obj == null) {
            Object[] objArr = this.f136a;
            int i14 = this.f137b;
            while (i13 < i14) {
                if (objArr[i13] == null) {
                    return i13;
                }
                i13++;
            }
            return -1;
        }
        Object[] objArr2 = this.f136a;
        int i15 = this.f137b;
        while (i13 < i15) {
            if (obj.equals(objArr2[i13])) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m104g() {
        return this.f137b == 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m105h() {
        return this.f137b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f136a;
        int i13 = this.f137b;
        int iHashCode = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = objArr[i14];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m106i(Object obj) {
        int iM103f = m103f(obj);
        if (iM103f < 0) {
            return false;
        }
        m107j(iM103f);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final Object m107j(int i13) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f137b)) {
            m110m(i13);
            throw null;
        }
        Object[] objArr = this.f136a;
        Object obj = objArr[i13];
        if (i13 != i14 - 1) {
            AbstractC25260n.m74062d0(i13, i13 + 1, i14, objArr, objArr);
        }
        int i15 = this.f137b - 1;
        this.f137b = i15;
        objArr[i15] = null;
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m108k(int i13, int i14) {
        int i15;
        if (i13 < 0 || i13 > (i15 = this.f137b) || i14 < 0 || i14 > i15) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "Start (", ") and end (", ") must be in 0..");
            sbM30465s.append(this.f137b);
            AbstractC34924m.m110135Q(sbM30465s.toString());
            throw null;
        }
        if (i14 < i13) {
            AbstractC34924m.m110133O("Start (" + i13 + ") is more than end (" + i14 + ')');
            throw null;
        }
        if (i14 != i13) {
            if (i14 < i15) {
                Object[] objArr = this.f136a;
                AbstractC25260n.m74062d0(i13, i14, i15, objArr, objArr);
            }
            int i16 = this.f137b;
            int i17 = i16 - (i14 - i13);
            AbstractC25260n.m74073n0(i17, i16, null, this.f136a);
            this.f137b = i17;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m109l(int i13, Object[] oldContent) {
        AbstractC22676k.m65750j(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i13, (length * 3) / 2)];
        AbstractC25260n.m74062d0(0, 0, length, oldContent, objArr);
        this.f136a = objArr;
    }

    /* JADX INFO: renamed from: m */
    public final void m110m(int i13) {
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index ", " must be in 0..");
        sbM30466t.append(this.f137b - 1);
        AbstractC34924m.m110135Q(sbM30466t.toString());
        throw null;
    }

    public final String toString() {
        C0006a1 c0006a1 = new C0006a1(this, 0);
        StringBuilder sb4 = new StringBuilder("[");
        Object[] objArr = this.f136a;
        int i13 = this.f137b;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = objArr[i14];
            if (i14 == -1) {
                sb4.append((CharSequence) "...");
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            }
            if (i14 != 0) {
                sb4.append((CharSequence) ", ");
            }
            sb4.append((CharSequence) c0006a1.invoke(obj));
        }
        sb4.append((CharSequence) "]");
        String string2 = sb4.toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        return string2;
    }

    public /* synthetic */ C0047q0() {
        this(16);
    }
}
