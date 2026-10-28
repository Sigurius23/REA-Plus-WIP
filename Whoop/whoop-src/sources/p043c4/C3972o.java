package p043c4;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.List;
import l83.C23465k;
import m01.C24877e;
import m83.C25272z;
import p181h2.C16618c;
import p510u0.C34355s1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: c4.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C3972o implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16184a;

    /* JADX INFO: renamed from: b */
    public final Object f16185b;

    /* JADX INFO: renamed from: c */
    public final Object f16186c;

    public /* synthetic */ C3972o(int i13, Object obj, Object obj2) {
        this.f16184a = i13;
        this.f16185b = obj;
        this.f16186c = obj2;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        ArrayList arrayList;
        C23465k c23465k;
        switch (this.f16184a) {
            case 0:
                ((C3958f0) this.f16185b).setParentLayoutDirection((EnumC39181m) this.f16186c);
                return interfaceC39133t0.mo86822W(0, 0, C25272z.f99163w, C3953d.f16109z);
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                List list2 = list;
                int size = list2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj = list.get(i13);
                    if (!(((InterfaceC39124q0) obj).mo454p() instanceof C34355s1)) {
                        arrayList2.add(obj);
                    }
                }
                List list3 = (List) ((InterfaceC4339a) this.f16186c).invoke();
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        C16618c c16618c = (C16618c) list3.get(i14);
                        if (c16618c != null) {
                            float f13 = c16618c.f63940b;
                            float f14 = c16618c.f63939a;
                            c23465k = new C23465k(((InterfaceC39124q0) arrayList2.get(i14)).mo448T(AbstractC39170b.m124770b((int) Math.floor(c16618c.f63941c - f14), (int) Math.floor(c16618c.f63942d - f13), 5)), new C39178j((((long) Math.round(f13)) & 4294967295L) | (((long) Math.round(f14)) << 32)));
                        } else {
                            c23465k = null;
                        }
                        ArrayList arrayList4 = arrayList3;
                        if (c23465k != null) {
                            arrayList4.add(c23465k);
                        }
                        i14++;
                        arrayList3 = arrayList4;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size3 = list2.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    Object obj2 = list.get(i15);
                    if (((InterfaceC39124q0) obj2).mo454p() instanceof C34355s1) {
                        arrayList5.add(obj2);
                    }
                }
                return interfaceC39133t0.mo86822W(C39169a.m124765i(j7), C39169a.m124764h(j7), C25272z.f99163w, new C24877e(1, arrayList, AbstractC30060g.m92117g(arrayList5, (InterfaceC4339a) this.f16185b)));
        }
    }
}
