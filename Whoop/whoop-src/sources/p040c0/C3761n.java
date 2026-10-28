package p040c0;

import java.util.List;
import m83.C25272z;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39180l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3761n implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final C3789x f15368a;

    public C3761n(C3789x c3789x) {
        this.f15368a = c3789x;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        AbstractC39104j1 abstractC39104j1;
        int i13;
        AbstractC39104j1 abstractC39104j2;
        int i14;
        int i15;
        int size = list.size();
        AbstractC39104j1[] abstractC39104j1Arr = new AbstractC39104j1[size];
        List list2 = list;
        int size2 = list2.size();
        long j13 = 0;
        int i16 = 0;
        while (true) {
            abstractC39104j1 = null;
            i13 = 1;
            if (i16 >= size2) {
                break;
            }
            InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) list.get(i16);
            Object objMo454p = interfaceC39124q0.mo454p();
            C3773r c3773r = objMo454p instanceof C3773r ? (C3773r) objMo454p : null;
            if (c3773r != null && ((Boolean) c3773r.f15401w.getValue()).booleanValue()) {
                AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
                long j14 = (((long) abstractC39104j1Mo448T.f168212x) & 4294967295L) | (((long) abstractC39104j1Mo448T.f168211w) << 32);
                abstractC39104j1Arr[i16] = abstractC39104j1Mo448T;
                j13 = j14;
            }
            i16++;
        }
        int size3 = list2.size();
        for (int i17 = 0; i17 < size3; i17++) {
            InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) list.get(i17);
            if (abstractC39104j1Arr[i17] == null) {
                abstractC39104j1Arr[i17] = interfaceC39124q1.mo448T(j7);
            }
        }
        if (interfaceC39133t0.mo781A()) {
            i14 = (int) (j13 >> 32);
        } else {
            if (size != 0) {
                abstractC39104j2 = abstractC39104j1Arr[0];
                int i18 = size - 1;
                if (i18 != 0) {
                    int i19 = abstractC39104j2 != null ? abstractC39104j2.f168211w : 0;
                    if (1 <= i18) {
                        int i24 = 1;
                        while (true) {
                            AbstractC39104j1 abstractC39104j3 = abstractC39104j1Arr[i24];
                            int i25 = abstractC39104j3 != null ? abstractC39104j3.f168211w : 0;
                            if (i19 < i25) {
                                abstractC39104j2 = abstractC39104j3;
                                i19 = i25;
                            }
                            if (i24 == i18) {
                                break;
                            }
                            i24++;
                        }
                    }
                }
            } else {
                abstractC39104j2 = null;
            }
            i14 = abstractC39104j2 != null ? abstractC39104j2.f168211w : 0;
        }
        if (interfaceC39133t0.mo781A()) {
            i15 = (int) (j13 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC39104j1 = abstractC39104j1Arr[0];
                int i26 = size - 1;
                if (i26 != 0) {
                    int i27 = abstractC39104j1 != null ? abstractC39104j1.f168212x : 0;
                    if (1 <= i26) {
                        while (true) {
                            AbstractC39104j1 abstractC39104j4 = abstractC39104j1Arr[i13];
                            int i28 = abstractC39104j4 != null ? abstractC39104j4.f168212x : 0;
                            if (i27 < i28) {
                                abstractC39104j1 = abstractC39104j4;
                                i27 = i28;
                            }
                            if (i13 == i26) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
            }
            i15 = abstractC39104j1 != null ? abstractC39104j1.f168212x : 0;
        }
        if (!interfaceC39133t0.mo781A()) {
            this.f15368a.f15450d.setValue(new C39180l((((long) i14) << 32) | (((long) i15) & 4294967295L)));
        }
        return interfaceC39133t0.mo86822W(i14, i15, C25272z.f99163w, new C3758m(abstractC39104j1Arr, this, i14, i15));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC39124q0) list.get(0)).mo438C(i13));
            int iM118951C = AbstractC37056f.m118951C(list);
            int i14 = 1;
            if (1 <= iM118951C) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC39124q0) list.get(i14)).mo438C(i13));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i14 == iM118951C) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC39124q0) list.get(0)).mo447Q(i13));
            int iM118951C = AbstractC37056f.m118951C(list);
            int i14 = 1;
            if (1 <= iM118951C) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC39124q0) list.get(i14)).mo447Q(i13));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i14 == iM118951C) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC39124q0) list.get(0)).mo449b(i13));
            int iM118951C = AbstractC37056f.m118951C(list);
            int i14 = 1;
            if (1 <= iM118951C) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC39124q0) list.get(i14)).mo449b(i13));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i14 == iM118951C) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC39124q0) list.get(0)).mo446O(i13));
            int iM118951C = AbstractC37056f.m118951C(list);
            int i14 = 1;
            if (1 <= iM118951C) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC39124q0) list.get(i14)).mo446O(i13));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i14 == iM118951C) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
