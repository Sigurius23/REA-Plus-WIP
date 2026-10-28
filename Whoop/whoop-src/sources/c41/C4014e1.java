package c41;

import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import ni0.C26732c;
import p268k0.AbstractC22086a;
import p270k2.InterfaceC22131e;
import p409q0.C29678d;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.C39178j;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import p730qt2.AbstractC30610p;

/* JADX INFO: renamed from: c41.e1 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4014e1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16309w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ArrayList f16310x;

    public /* synthetic */ C4014e1(ArrayList arrayList, int i13) {
        this.f16309w = i13;
        this.f16310x = arrayList;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16309w) {
            case 0:
                return AbstractC4021f1.m12240q(this.f16310x, (InterfaceC22131e) obj);
            case 1:
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                ArrayList arrayList = this.f16310x;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    abstractC39101i1.m124632f((AbstractC39104j1) arrayList.get(i13), 0, 0, 0.0f);
                }
                return C23454a0.f92919a;
            case 2:
                return C26732c.m79537O(this.f16310x, (C25308q) obj);
            case 3:
                AbstractC39101i1 abstractC39101i2 = (AbstractC39101i1) obj;
                ArrayList arrayList2 = this.f16310x;
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    C29678d c29678d = (C29678d) arrayList2.get(i14);
                    List list = c29678d.f121295b;
                    boolean z4 = c29678d.f121301h;
                    if (c29678d.f121305l == Integer.MIN_VALUE) {
                        AbstractC22086a.m63158a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) list.get(i15);
                        int[] iArr = c29678d.f121303j;
                        int i16 = i15 * 2;
                        int i17 = i14;
                        long jM124794d = C39178j.m124794d((((long) iArr[i16 + 1]) & 4294967295L) | (((long) iArr[i16]) << 32), c29678d.f121296c);
                        if (z4) {
                            AbstractC39101i1.m124628t(abstractC39101i2, abstractC39104j1, jM124794d);
                        } else {
                            AbstractC39101i1.m124626p(abstractC39101i2, abstractC39104j1, jM124794d);
                        }
                        i15++;
                        i14 = i17;
                    }
                    i14++;
                }
                return C23454a0.f92919a;
            case 4:
                return AbstractC30610p.m93942d(this.f16310x, (InterfaceC22131e) obj);
            default:
                AbstractC39101i1 abstractC39101i3 = (AbstractC39101i1) obj;
                ArrayList arrayList3 = this.f16310x;
                int size4 = arrayList3.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    AbstractC39101i1.m124624n((AbstractC39104j1) arrayList3.get(i18), 0, 0, abstractC39101i3);
                }
                return C23454a0.f92919a;
        }
    }
}
