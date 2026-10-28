package p584wi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: wi.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C37305e {

    /* JADX INFO: renamed from: c */
    public static final C37305e f159517c = new C37305e("COMPOSITION");

    /* JADX INFO: renamed from: a */
    public final List f159518a;

    /* JADX INFO: renamed from: b */
    public InterfaceC37306f f159519b;

    public C37305e(String... strArr) {
        this.f159518a = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: a */
    public final C37305e m119477a(String str) {
        C37305e c37305e = new C37305e(this);
        c37305e.f159518a.add(str);
        return c37305e;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007e A[RETURN] */
    /* JADX INFO: renamed from: b */
    public final boolean m119478b(int i13, String str) {
        List list = this.f159518a;
        if (i13 < list.size()) {
            boolean z4 = i13 == list.size() - 1;
            String str2 = (String) list.get(i13);
            if (!str2.equals("**")) {
                boolean z13 = str2.equals(str) || str2.equals("*");
                if ((z4 || (i13 == list.size() - 2 && ((String) AbstractC11266d.m30455i(1, list)).equals("**"))) && z13) {
                    return true;
                }
            } else {
                if (z4 || !((String) list.get(i13 + 1)).equals(str)) {
                    if (!z4) {
                        int i14 = i13 + 1;
                        if (i14 >= list.size() - 1) {
                            return ((String) list.get(i14)).equals(str);
                        }
                    }
                    return true;
                }
                if (i13 == list.size() - 2 || (i13 == list.size() - 3 && ((String) AbstractC11266d.m30455i(1, list)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC37306f m119479c() {
        return this.f159519b;
    }

    /* JADX INFO: renamed from: d */
    public final int m119480d(int i13, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f159518a;
        if (((String) list.get(i13)).equals("**")) {
            return (i13 != list.size() - 1 && ((String) list.get(i13 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m119481e(int i13, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f159518a;
        if (i13 >= list.size()) {
            return false;
        }
        return ((String) list.get(i13)).equals(str) || ((String) list.get(i13)).equals("**") || ((String) list.get(i13)).equals("*");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C37305e.class == obj.getClass()) {
            C37305e c37305e = (C37305e) obj;
            if (!this.f159518a.equals(c37305e.f159518a)) {
                return false;
            }
            InterfaceC37306f interfaceC37306f = this.f159519b;
            InterfaceC37306f interfaceC37306f2 = c37305e.f159519b;
            if (interfaceC37306f != null) {
                return interfaceC37306f.equals(interfaceC37306f2);
            }
            if (interfaceC37306f2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m119482f(int i13, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f159518a;
        return i13 < list.size() - 1 || ((String) list.get(i13)).equals("**");
    }

    /* JADX INFO: renamed from: g */
    public final C37305e m119483g(InterfaceC37306f interfaceC37306f) {
        C37305e c37305e = new C37305e(this);
        c37305e.f159519b = interfaceC37306f;
        return c37305e;
    }

    public final int hashCode() {
        int iHashCode = this.f159518a.hashCode() * 31;
        InterfaceC37306f interfaceC37306f = this.f159519b;
        return iHashCode + (interfaceC37306f != null ? interfaceC37306f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("KeyPath{keys=");
        sb4.append(this.f159518a);
        sb4.append(",resolved=");
        return AbstractC2875y.m8305r(sb4, this.f159519b != null, '}');
    }

    public C37305e(C37305e c37305e) {
        this.f159518a = new ArrayList(c37305e.f159518a);
        this.f159519b = c37305e.f159519b;
    }
}
