package p329n0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import p353o0.C27332p;
import p390p1.InterfaceC28601c1;
import p635y2.AbstractC39101i1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: n0.m */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C26060m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f103162E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103163w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f103164x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ArrayList f103165y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f103166z;

    public /* synthetic */ C26060m(InterfaceC28601c1 interfaceC28601c1, ArrayList arrayList, List list, boolean z4, int i13) {
        this.f103163w = i13;
        this.f103164x = interfaceC28601c1;
        this.f103165y = arrayList;
        this.f103166z = list;
        this.f103162E = z4;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
        switch (this.f103163w) {
            case 0:
                abstractC39101i1.f168198w = true;
                ArrayList arrayList = this.f103165y;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    boolean z4 = this.f103162E;
                    if (i13 >= size) {
                        ?? r10 = this.f103166z;
                        int size2 = ((Collection) r10).size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            ((C26062o) r10.get(i14)).m77553p(abstractC39101i1, z4);
                        }
                        abstractC39101i1.f168198w = false;
                        this.f103164x.getValue();
                    } else {
                        ((C26062o) arrayList.get(i13)).m77553p(abstractC39101i1, z4);
                        i13++;
                    }
                    break;
                }
                break;
            default:
                abstractC39101i1.f168198w = true;
                ArrayList arrayList2 = this.f103165y;
                int size3 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    boolean z13 = this.f103162E;
                    if (i15 >= size3) {
                        ?? r14 = this.f103166z;
                        int size4 = ((Collection) r14).size();
                        for (int i16 = 0; i16 < size4; i16++) {
                            ((C27332p) r14.get(i16)).m82473l(abstractC39101i1, z13);
                        }
                        abstractC39101i1.f168198w = false;
                        this.f103164x.getValue();
                    } else {
                        ((C27332p) arrayList2.get(i15)).m82473l(abstractC39101i1, z13);
                        i15++;
                    }
                    break;
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
