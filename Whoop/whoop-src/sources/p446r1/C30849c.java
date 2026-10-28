package p446r1;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: r1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C30849c implements RandomAccess {

    /* JADX INFO: renamed from: w */
    public Object[] f127227w;

    /* JADX INFO: renamed from: x */
    public C30848b f127228x;

    /* JADX INFO: renamed from: y */
    public int f127229y = 0;

    public C30849c(Object[] objArr) {
        this.f127227w = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m94884a(int i13, Object obj) {
        int i14 = this.f127229y + 1;
        if (this.f127227w.length < i14) {
            m94896n(i14);
        }
        Object[] objArr = this.f127227w;
        int i15 = this.f127229y;
        if (i13 != i15) {
            System.arraycopy(objArr, i13, objArr, i13 + 1, i15 - i13);
        }
        objArr[i13] = obj;
        this.f127229y++;
    }

    /* JADX INFO: renamed from: b */
    public final void m94885b(Object obj) {
        int i13 = this.f127229y + 1;
        if (this.f127227w.length < i13) {
            m94896n(i13);
        }
        Object[] objArr = this.f127227w;
        int i14 = this.f127229y;
        objArr[i14] = obj;
        this.f127229y = i14 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m94886c(int i13, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i14 = this.f127229y + size;
        if (this.f127227w.length < i14) {
            m94896n(i14);
        }
        Object[] objArr = this.f127227w;
        int i15 = this.f127229y;
        if (i13 != i15) {
            System.arraycopy(objArr, i13, objArr, i13 + size, i15 - i13);
        }
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            objArr[i13 + i16] = list.get(i16);
        }
        this.f127229y += size;
    }

    /* JADX INFO: renamed from: d */
    public final void m94887d(int i13, C30849c c30849c) {
        int i14 = c30849c.f127229y;
        if (i14 == 0) {
            return;
        }
        int i15 = this.f127229y + i14;
        if (this.f127227w.length < i15) {
            m94896n(i15);
        }
        Object[] objArr = this.f127227w;
        int i16 = this.f127229y;
        if (i13 != i16) {
            System.arraycopy(objArr, i13, objArr, i13 + i14, i16 - i13);
        }
        System.arraycopy(c30849c.f127227w, 0, objArr, i13, i14);
        this.f127229y += i14;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m94888e(int i13, Collection collection) {
        int i14 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i15 = this.f127229y + size;
        if (this.f127227w.length < i15) {
            m94896n(i15);
        }
        Object[] objArr = this.f127227w;
        int i16 = this.f127229y;
        if (i13 != i16) {
            System.arraycopy(objArr, i13, objArr, i13 + size, i16 - i13);
        }
        for (Object obj : collection) {
            int i17 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            objArr[i14 + i13] = obj;
            i14 = i17;
        }
        this.f127229y += size;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final List m94889f() {
        C30848b c30848b = this.f127228x;
        if (c30848b != null) {
            return c30848b;
        }
        C30848b c30848b2 = new C30848b(this);
        this.f127228x = c30848b2;
        return c30848b2;
    }

    /* JADX INFO: renamed from: g */
    public final void m94890g() {
        Object[] objArr = this.f127227w;
        int i13 = this.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = null;
        }
        this.f127229y = 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m94891h(Object obj) {
        int i13 = this.f127229y - 1;
        if (i13 >= 0) {
            for (int i14 = 0; !AbstractC22676k.m65745e(this.f127227w[i14], obj); i14++) {
                if (i14 != i13) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final int m94892j(Object obj) {
        Object[] objArr = this.f127227w;
        int i13 = this.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            if (AbstractC22676k.m65745e(obj, objArr[i14])) {
                return i14;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m94893k(Object obj) {
        int iM94892j = m94892j(obj);
        if (iM94892j < 0) {
            return false;
        }
        m94894l(iM94892j);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m94894l(int i13) {
        Object[] objArr = this.f127227w;
        Object obj = objArr[i13];
        int i14 = this.f127229y;
        if (i13 != i14 - 1) {
            int i15 = i13 + 1;
            System.arraycopy(objArr, i15, objArr, i13, i14 - i15);
        }
        int i16 = this.f127229y - 1;
        this.f127229y = i16;
        objArr[i16] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m94895m(int i13, int i14) {
        if (i14 > i13) {
            int i15 = this.f127229y;
            if (i14 < i15) {
                Object[] objArr = this.f127227w;
                System.arraycopy(objArr, i14, objArr, i13, i15 - i14);
            }
            int i16 = this.f127229y;
            int i17 = i16 - (i14 - i13);
            int i18 = i16 - 1;
            if (i17 <= i18) {
                int i19 = i17;
                while (true) {
                    this.f127227w[i19] = null;
                    if (i19 == i18) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.f127229y = i17;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m94896n(int i13) {
        Object[] objArr = this.f127227w;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i13, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f127227w = objArr2;
    }
}
