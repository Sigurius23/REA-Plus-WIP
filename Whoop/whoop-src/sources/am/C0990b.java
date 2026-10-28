package am;

import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import p291l0.InterfaceC22974l;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39133t0;
import p636y3.EnumC39181m;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import v63.AbstractC35744b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: am.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C0990b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ EnumC0995g f3711E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f3712F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ EnumC0989a f3713G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ ArrayList f3714H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ ArrayList f3715I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ArrayList f3716w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC39133t0 f3717x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f3718y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ EnumC0995g f3719z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0990b(ArrayList arrayList, InterfaceC39133t0 interfaceC39133t0, float f13, EnumC0995g enumC0995g, EnumC0995g enumC0995g2, int i13, EnumC0989a enumC0989a, ArrayList arrayList2, ArrayList arrayList3) {
        super(1);
        EnumC0994f enumC0994f = EnumC0994f.f3743w;
        this.f3716w = arrayList;
        this.f3717x = interfaceC39133t0;
        this.f3718y = f13;
        this.f3719z = enumC0995g;
        this.f3711E = enumC0995g2;
        this.f3712F = i13;
        this.f3713G = enumC0989a;
        this.f3714H = arrayList2;
        this.f3715I = arrayList3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC39133t0 interfaceC39133t0;
        int iRound;
        AbstractC39101i1 layout = (AbstractC39101i1) obj;
        AbstractC22676k.m65750j(layout, "$this$layout");
        EnumC0994f enumC0994f = EnumC0994f.f3743w;
        ArrayList arrayList = this.f3716w;
        int i13 = 0;
        int i14 = 0;
        for (Object obj2 : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            List list = (List) obj2;
            int size = list.size();
            int[] iArr = new int[size];
            int i16 = i13;
            while (true) {
                interfaceC39133t0 = this.f3717x;
                if (i16 >= size) {
                    break;
                }
                AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) list.get(i16);
                EnumC0994f enumC0994f2 = EnumC0994f.f3743w;
                iArr[i16] = abstractC39104j1.f168211w + (i16 < AbstractC37056f.m118951C(list) ? interfaceC39133t0.mo724F(this.f3718y) : i13);
                i16++;
            }
            InterfaceC22974l interfaceC22974l = i14 < AbstractC37056f.m118951C(arrayList) ? this.f3719z.f3747w : this.f3711E.f3747w;
            int[] iArr2 = new int[size];
            for (int i17 = i13; i17 < size; i17++) {
                iArr2[i17] = i13;
            }
            interfaceC22974l.mo66728b(interfaceC39133t0, this.f3712F, iArr, iArr2);
            int i18 = i13;
            for (Object obj3 : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                AbstractC39104j1 abstractC39104j2 = (AbstractC39104j1) obj3;
                int iOrdinal = this.f3713G.ordinal();
                ArrayList arrayList2 = this.f3714H;
                if (iOrdinal == 0) {
                    int iIntValue = ((Number) arrayList2.get(i14)).intValue();
                    EnumC0994f enumC0994f3 = EnumC0994f.f3743w;
                    long jM113228a = AbstractC35744b.m113228a(i13, iIntValue - abstractC39104j2.f168212x);
                    EnumC39181m enumC39181m = EnumC39181m.f168423w;
                    int i24 = (int) 0;
                    float f13 = 1 + 0.0f;
                    float f14 = ((((int) (jM113228a >> 32)) - i24) / 2.0f) * f13;
                    iRound = (int) (((((long) Math.round(f13 * ((((int) (jM113228a & 4294967295L)) - i24) / 2.0f))) & 4294967295L) | (((long) Math.round(f14)) << 32)) & 4294967295L);
                } else if (iOrdinal == 1) {
                    iRound = i13;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iIntValue2 = ((Number) arrayList2.get(i14)).intValue();
                    EnumC0994f enumC0994f4 = EnumC0994f.f3743w;
                    iRound = iIntValue2 - abstractC39104j2.f168212x;
                }
                EnumC0994f enumC0994f5 = EnumC0994f.f3743w;
                int i25 = iArr2[i18];
                int i26 = i14;
                layout.m124632f(abstractC39104j2, i25, ((Number) this.f3715I.get(i26)).intValue() + iRound, 0.0f);
                i14 = i26;
                i18 = i19;
                i13 = 0;
            }
            i14 = i15;
        }
        return C23454a0.f92919a;
    }
}
