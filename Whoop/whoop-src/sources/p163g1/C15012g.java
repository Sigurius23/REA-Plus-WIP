package p163g1;

import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import i93.InterfaceC18280f;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import p291l0.AbstractC22977m;
import p291l0.C22949e;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39133t0;
import p715kotlin.jvm.functions.Function1;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.g */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15012g implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f56167E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f56168F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56169w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f56170x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56171y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f56172z;

    public /* synthetic */ C15012g(InterfaceC18280f interfaceC18280f, int i13, float f13, Function1 function1, InterfaceC4339a interfaceC4339a) {
        this.f56169w = 2;
        this.f56170x = interfaceC18280f;
        this.f56167E = i13;
        this.f56172z = f13;
        this.f56168F = function1;
        this.f56171y = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z4;
        int i13;
        int i14 = this.f56169w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i15 = this.f56167E;
        Object obj2 = this.f56171y;
        Object obj3 = this.f56168F;
        float f13 = this.f56172z;
        Object obj4 = this.f56170x;
        switch (i14) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                InterfaceC39133t0 interfaceC39133t0 = (InterfaceC39133t0) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    List list = (List) arrayList.get(i16);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i17 = 0;
                    while (i17 < size2) {
                        iArr[i17] = ((AbstractC39104j1) list.get(i17)).f168211w + (i17 < AbstractC37056f.m118951C(list) ? interfaceC39133t0.mo724F(f13) : 0);
                        i17++;
                    }
                    C22949e c22949e = AbstractC22977m.f90650a;
                    int[] iArr2 = new int[size2];
                    AbstractC22977m.m66742e(i15, iArr, iArr2, false);
                    int size3 = list.size();
                    for (int i18 = 0; i18 < size3; i18++) {
                        abstractC39101i1.m124632f((AbstractC39104j1) list.get(i18), iArr2[i18], ((Number) arrayList2.get(i16)).intValue(), 0.0f);
                    }
                }
                return c23454a0;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj4;
                InterfaceC39133t0 interfaceC39133t1 = (InterfaceC39133t0) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                AbstractC39101i1 abstractC39101i2 = (AbstractC39101i1) obj;
                int size4 = arrayList3.size();
                for (int i19 = 0; i19 < size4; i19++) {
                    List list2 = (List) arrayList3.get(i19);
                    int size5 = list2.size();
                    int[] iArr3 = new int[size5];
                    int i24 = 0;
                    while (i24 < size5) {
                        iArr3[i24] = ((AbstractC39104j1) list2.get(i24)).f168211w + (i24 < AbstractC37056f.m118951C(list2) ? interfaceC39133t1.mo724F(f13) : 0);
                        i24++;
                    }
                    int[] iArr4 = new int[size5];
                    AbstractC22977m.f90651b.mo66713c(interfaceC39133t1, this.f56167E, iArr3, interfaceC39133t1.getLayoutDirection(), iArr4);
                    int size6 = list2.size();
                    for (int i25 = 0; i25 < size6; i25++) {
                        abstractC39101i2.m124632f((AbstractC39104j1) list2.get(i25), iArr4[i25], ((Number) arrayList4.get(i19)).intValue(), 0.0f);
                    }
                }
                return c23454a0;
            default:
                InterfaceC18280f interfaceC18280f = (InterfaceC18280f) obj4;
                Function1 function1 = (Function1) obj3;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj2;
                float fM36283m = AbstractC12889b.m36283m(((Float) obj).floatValue(), ((Number) interfaceC18280f.getStart()).floatValue(), ((Number) interfaceC18280f.mo52651d()).floatValue());
                if (i15 > 0 && (i13 = i15 + 1) >= 0) {
                    float fAbs = fM36283m;
                    float f14 = fAbs;
                    int i26 = 0;
                    while (true) {
                        float fM36249O = AbstractC12889b.m36249O(((Number) interfaceC18280f.getStart()).floatValue(), ((Number) interfaceC18280f.mo52651d()).floatValue(), i26 / i13);
                        float f15 = fM36249O - fM36283m;
                        if (Math.abs(f15) <= fAbs) {
                            fAbs = Math.abs(f15);
                            f14 = fM36249O;
                        }
                        if (i26 != i13) {
                            i26++;
                        } else {
                            fM36283m = f14;
                        }
                    }
                }
                if (fM36283m == f13) {
                    z4 = false;
                } else {
                    function1.invoke(Float.valueOf(fM36283m));
                    if (interfaceC4339a != null) {
                        interfaceC4339a.invoke();
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
        }
    }

    public /* synthetic */ C15012g(ArrayList arrayList, InterfaceC39133t0 interfaceC39133t0, float f13, int i13, ArrayList arrayList2, int i14) {
        this.f56169w = i14;
        this.f56170x = arrayList;
        this.f56171y = interfaceC39133t0;
        this.f56172z = f13;
        this.f56167E = i13;
        this.f56168F = arrayList2;
    }
}
