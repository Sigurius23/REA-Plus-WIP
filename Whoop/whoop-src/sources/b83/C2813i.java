package b83;

import n73.InterfaceC26443b;
import p410q1.C29775l0;

/* JADX INFO: renamed from: b83.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C2813i {

    /* JADX INFO: renamed from: a */
    public int f11005a;

    /* JADX INFO: renamed from: b */
    public int f11006b;

    /* JADX INFO: renamed from: c */
    public int f11007c;

    /* JADX INFO: renamed from: d */
    public Object f11008d;

    /* JADX INFO: renamed from: a */
    public void m7994a(InterfaceC26443b interfaceC26443b) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.f11008d;
        int i13 = this.f11005a;
        int iHashCode = interfaceC26443b.hashCode() * (-1640531527);
        int i14 = (iHashCode ^ (iHashCode >>> 16)) & i13;
        Object obj3 = objArr[i14];
        if (obj3 != null) {
            if (obj3.equals(interfaceC26443b)) {
                return;
            }
            do {
                i14 = (i14 + 1) & i13;
                obj2 = objArr[i14];
                if (obj2 == null) {
                }
            } while (!obj2.equals(interfaceC26443b));
            return;
        }
        objArr[i14] = interfaceC26443b;
        int i15 = this.f11006b + 1;
        this.f11006b = i15;
        if (i15 < this.f11007c) {
            return;
        }
        Object[] objArr2 = (Object[]) this.f11008d;
        int length = objArr2.length;
        int i16 = length << 1;
        int i17 = i16 - 1;
        Object[] objArr3 = new Object[i16];
        while (true) {
            int i18 = i15 - 1;
            if (i15 == 0) {
                this.f11005a = i17;
                this.f11007c = (int) (i16 * 0.75f);
                this.f11008d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i19 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i17;
            if (objArr3[i19] != null) {
                do {
                    i19 = (i19 + 1) & i17;
                } while (objArr3[i19] != null);
            }
            objArr3[i19] = objArr2[length];
            i15 = i18;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m7995b(int i13) {
        return ((C29775l0) this.f11008d).f121782c[this.f11006b + i13];
    }

    /* JADX INFO: renamed from: c */
    public Object m7996c(int i13) {
        return ((C29775l0) this.f11008d).f121784e[this.f11007c + i13];
    }

    /* JADX INFO: renamed from: d */
    public void m7997d(int i13, int i14, Object[] objArr) {
        int i15;
        Object obj;
        this.f11006b--;
        while (true) {
            int i16 = i13 + 1;
            while (true) {
                i15 = i16 & i14;
                obj = objArr[i15];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i17 = (iHashCode ^ (iHashCode >>> 16)) & i14;
                    if (i13 > i15) {
                        if (i13 >= i17 && i17 > i15) {
                            break;
                        } else {
                            i16 = i15 + 1;
                        }
                    } else if (i13 >= i17 || i17 > i15) {
                        break;
                    } else {
                        i16 = i15 + 1;
                    }
                } else {
                    objArr[i13] = null;
                    return;
                }
            }
            objArr[i13] = obj;
            i13 = i15;
        }
    }
}
