package p043c4;

import java.util.ArrayList;
import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c4.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C3959g extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16146w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ArrayList f16147x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3959g(ArrayList arrayList, int i13) {
        super(1);
        this.f16146w = i13;
        this.f16147x = arrayList;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16146w) {
            case 0:
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                ArrayList arrayList = this.f16147x;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC39101i1.m124624n((AbstractC39104j1) arrayList.get(i13), 0, 0, abstractC39101i1);
                }
                break;
            case 1:
                AbstractC39101i1 abstractC39101i2 = (AbstractC39101i1) obj;
                ArrayList arrayList2 = this.f16147x;
                int iM118951C = AbstractC37056f.m118951C(arrayList2);
                if (iM118951C >= 0) {
                    int i14 = 0;
                    while (true) {
                        AbstractC39101i1.m124624n((AbstractC39104j1) arrayList2.get(i14), 0, 0, abstractC39101i2);
                        if (i14 != iM118951C) {
                            i14++;
                        }
                    }
                }
                break;
            default:
                AbstractC39101i1 abstractC39101i3 = (AbstractC39101i1) obj;
                ArrayList arrayList3 = this.f16147x;
                int size2 = arrayList3.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    AbstractC39101i1.m124625o((AbstractC39104j1) arrayList3.get(i15), 0, 0, abstractC39101i3);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
