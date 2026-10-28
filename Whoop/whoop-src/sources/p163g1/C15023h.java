package p163g1;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25272z;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.jvm.internal.C22665e0;

/* JADX INFO: renamed from: g1.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C15023h implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f56223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f56224c;

    public /* synthetic */ C15023h(float f13, float f14, int i13) {
        this.f56222a = i13;
        this.f56223b = f13;
        this.f56224c = f14;
    }

    /* JADX INFO: renamed from: f */
    public static final void m43124f(ArrayList arrayList, C22665e0 c22665e0, InterfaceC39133t0 interfaceC39133t0, float f13, ArrayList arrayList2, ArrayList arrayList3, C22665e0 c22665e1, ArrayList arrayList4, C22665e0 c22665e2, C22665e0 c22665e3) {
        if (!arrayList.isEmpty()) {
            c22665e0.f89334w = interfaceC39133t0.mo724F(f13) + c22665e0.f89334w;
        }
        arrayList.add(0, AbstractC25265s.m74093D1(arrayList2));
        arrayList3.add(Integer.valueOf(c22665e1.f89334w));
        arrayList4.add(Integer.valueOf(c22665e0.f89334w));
        c22665e0.f89334w += c22665e1.f89334w;
        c22665e2.f89334w = Math.max(c22665e2.f89334w, c22665e3.f89334w);
        arrayList2.clear();
        c22665e3.f89334w = 0;
        c22665e1.f89334w = 0;
    }

    /* JADX INFO: renamed from: g */
    public static final void m43125g(ArrayList arrayList, C22665e0 c22665e0, InterfaceC39133t0 interfaceC39133t0, float f13, ArrayList arrayList2, ArrayList arrayList3, C22665e0 c22665e1, ArrayList arrayList4, C22665e0 c22665e2, C22665e0 c22665e3) {
        if (!arrayList.isEmpty()) {
            c22665e0.f89334w = interfaceC39133t0.mo724F(f13) + c22665e0.f89334w;
        }
        arrayList.add(0, AbstractC25265s.m74093D1(arrayList2));
        arrayList3.add(Integer.valueOf(c22665e1.f89334w));
        arrayList4.add(Integer.valueOf(c22665e0.f89334w));
        c22665e0.f89334w += c22665e1.f89334w;
        c22665e2.f89334w = Math.max(c22665e2.f89334w, c22665e3.f89334w);
        arrayList2.clear();
        c22665e3.f89334w = 0;
        c22665e1.f89334w = 0;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        AbstractC39104j1 abstractC39104j1;
        AbstractC39104j1 abstractC39104j2;
        List list2 = list;
        switch (this.f56222a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C22665e0 c22665e0 = new C22665e0();
                C22665e0 c22665e1 = new C22665e0();
                ArrayList arrayList4 = new ArrayList();
                C22665e0 c22665e2 = new C22665e0();
                C22665e0 c22665e3 = new C22665e0();
                int i13 = 0;
                long jM124770b = AbstractC39170b.m124770b(C39169a.m124765i(j7), 0, 13);
                for (int size = list2.size(); i13 < size; size = size) {
                    AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) list2.get(i13)).mo448T(jM124770b);
                    boolean zIsEmpty = arrayList4.isEmpty();
                    float f13 = this.f56223b;
                    if (zIsEmpty) {
                        abstractC39104j1 = abstractC39104j1Mo448T;
                    } else {
                        ArrayList arrayList5 = arrayList;
                        C22665e0 c22665e4 = c22665e1;
                        if (interfaceC39133t0.mo724F(f13) + c22665e2.f89334w + abstractC39104j1Mo448T.f168211w <= C39169a.m124765i(j7)) {
                            arrayList = arrayList5;
                            c22665e1 = c22665e4;
                            abstractC39104j1 = abstractC39104j1Mo448T;
                        } else {
                            c22665e1 = c22665e4;
                            abstractC39104j1 = abstractC39104j1Mo448T;
                            arrayList = arrayList5;
                            m43124f(arrayList, c22665e1, interfaceC39133t0, this.f56224c, arrayList4, arrayList2, c22665e3, arrayList3, c22665e0, c22665e2);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        c22665e2.f89334w = interfaceC39133t0.mo724F(f13) + c22665e2.f89334w;
                    }
                    arrayList4.add(abstractC39104j1);
                    c22665e2.f89334w += abstractC39104j1.f168211w;
                    c22665e3.f89334w = Math.max(c22665e3.f89334w, abstractC39104j1.f168212x);
                    i13++;
                    list2 = list;
                }
                if (!arrayList4.isEmpty()) {
                    m43124f(arrayList, c22665e1, interfaceC39133t0, this.f56224c, arrayList4, arrayList2, c22665e3, arrayList3, c22665e0, c22665e2);
                }
                int iM124765i = C39169a.m124765i(j7) != Integer.MAX_VALUE ? C39169a.m124765i(j7) : Math.max(c22665e0.f89334w, C39169a.m124767k(j7));
                return interfaceC39133t0.mo86822W(iM124765i, Math.max(c22665e1.f89334w, C39169a.m124766j(j7)), C25272z.f99163w, new C15012g(arrayList, interfaceC39133t0, this.f56223b, iM124765i, arrayList3, 0));
            default:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                C22665e0 c22665e5 = new C22665e0();
                C22665e0 c22665e6 = new C22665e0();
                ArrayList arrayList9 = new ArrayList();
                C22665e0 c22665e7 = new C22665e0();
                C22665e0 c22665e8 = new C22665e0();
                int size2 = list2.size();
                int i14 = 0;
                while (i14 < size2) {
                    AbstractC39104j1 abstractC39104j1Mo448T2 = ((InterfaceC39124q0) list2.get(i14)).mo448T(j7);
                    boolean zIsEmpty2 = arrayList9.isEmpty();
                    int i15 = size2;
                    float f14 = this.f56223b;
                    if (zIsEmpty2) {
                        abstractC39104j2 = abstractC39104j1Mo448T2;
                    } else {
                        ArrayList arrayList10 = arrayList6;
                        C22665e0 c22665e9 = c22665e6;
                        if (interfaceC39133t0.mo724F(f14) + c22665e7.f89334w + abstractC39104j1Mo448T2.f168211w <= C39169a.m124765i(j7)) {
                            arrayList6 = arrayList10;
                            c22665e6 = c22665e9;
                            abstractC39104j2 = abstractC39104j1Mo448T2;
                        } else {
                            c22665e6 = c22665e9;
                            abstractC39104j2 = abstractC39104j1Mo448T2;
                            arrayList6 = arrayList10;
                            m43125g(arrayList6, c22665e6, interfaceC39133t0, this.f56224c, arrayList9, arrayList7, c22665e8, arrayList8, c22665e5, c22665e7);
                        }
                    }
                    if (!arrayList9.isEmpty()) {
                        c22665e7.f89334w = interfaceC39133t0.mo724F(f14) + c22665e7.f89334w;
                    }
                    arrayList9.add(abstractC39104j2);
                    c22665e7.f89334w += abstractC39104j2.f168211w;
                    c22665e8.f89334w = Math.max(c22665e8.f89334w, abstractC39104j2.f168212x);
                    i14++;
                    size2 = i15;
                }
                if (!arrayList9.isEmpty()) {
                    m43125g(arrayList6, c22665e6, interfaceC39133t0, this.f56224c, arrayList9, arrayList7, c22665e8, arrayList8, c22665e5, c22665e7);
                }
                int iMax = Math.max(c22665e5.f89334w, C39169a.m124767k(j7));
                return interfaceC39133t0.mo86822W(iMax, Math.max(c22665e6.f89334w, C39169a.m124766j(j7)), C25272z.f99163w, new C15012g(arrayList6, interfaceC39133t0, this.f56223b, iMax, arrayList8, 1));
        }
    }
}
