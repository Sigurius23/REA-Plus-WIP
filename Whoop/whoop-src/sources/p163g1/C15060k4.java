package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p291l0.InterfaceC22973k1;
import p602x1.C37816b;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p635y2.InterfaceC39140v1;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22665e0;

/* JADX INFO: renamed from: g1.k4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15060k4 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56385E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f56386F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f56387G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f56388H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f56389I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f56390J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f56391K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56392w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f56393x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f56394y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56395z;

    public /* synthetic */ C15060k4(int i13, int i14, AbstractC39104j1 abstractC39104j1, AbstractC39104j1 abstractC39104j2, AbstractC39104j1 abstractC39104j3, AbstractC39104j1 abstractC39104j4, AbstractC39104j1 abstractC39104j5, AbstractC39104j1 abstractC39104j6, C15070l4 c15070l4, InterfaceC39133t0 interfaceC39133t0) {
        this.f56393x = i13;
        this.f56394y = i14;
        this.f56395z = abstractC39104j1;
        this.f56385E = abstractC39104j2;
        this.f56386F = abstractC39104j3;
        this.f56387G = abstractC39104j4;
        this.f56388H = abstractC39104j5;
        this.f56389I = abstractC39104j6;
        this.f56390J = c15070l4;
        this.f56391K = interfaceC39133t0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f13;
        int i13;
        int i14 = this.f56392w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f56391K;
        Object obj3 = this.f56390J;
        Object obj4 = this.f56389I;
        Object obj5 = this.f56388H;
        int i15 = this.f56394y;
        Object obj6 = this.f56387G;
        Object obj7 = this.f56386F;
        Object obj8 = this.f56385E;
        Object obj9 = this.f56395z;
        int i16 = this.f56393x;
        switch (i14) {
            case 0:
                AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) obj9;
                AbstractC39104j1 abstractC39104j2 = (AbstractC39104j1) obj8;
                AbstractC39104j1 abstractC39104j3 = (AbstractC39104j1) obj7;
                AbstractC39104j1 abstractC39104j4 = (AbstractC39104j1) obj6;
                AbstractC39104j1 abstractC39104j5 = (AbstractC39104j1) obj5;
                AbstractC39104j1 abstractC39104j6 = (AbstractC39104j1) obj4;
                C15070l4 c15070l4 = (C15070l4) obj3;
                InterfaceC39133t0 interfaceC39133t0 = (InterfaceC39133t0) obj2;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                float f14 = c15070l4.f56425c;
                boolean z4 = c15070l4.f56424b;
                float density = interfaceC39133t0.getDensity();
                EnumC39181m layoutDirection = interfaceC39133t0.getLayoutDirection();
                InterfaceC22973k1 interfaceC22973k1 = c15070l4.f56426d;
                float f15 = AbstractC15050j4.f56342a;
                int iM36258X = AbstractC12889b.m36258X(interfaceC22973k1.mo43112d() * density);
                int iM36258X2 = AbstractC12889b.m36258X(AbstractC1099a.m3387i(interfaceC22973k1, layoutDirection) * density);
                float f16 = AbstractC15114p8.f56625b * density;
                if (abstractC39104j1 != null) {
                    f13 = 2.0f;
                    AbstractC39101i1.m124624n(abstractC39104j1, 0, AbstractC11895b.m31982a(1, 0.0f, (i16 - abstractC39104j1.f168212x) / 2.0f), abstractC39101i1);
                } else {
                    f13 = 2.0f;
                }
                if (abstractC39104j2 != null) {
                    i13 = 1;
                    AbstractC39101i1.m124624n(abstractC39104j2, i15 - abstractC39104j2.f168211w, AbstractC11895b.m31982a(1, 0.0f, (i16 - abstractC39104j2.f168212x) / f13), abstractC39101i1);
                } else {
                    i13 = 1;
                }
                if (abstractC39104j4 != null) {
                    AbstractC39101i1.m124624n(abstractC39104j4, AbstractC12889b.m36258X(abstractC39104j1 == null ? 0.0f : (1 - f14) * (abstractC39104j1.f168211w - f16)) + iM36258X2, AbstractC12889b.m36250P(f14, z4 ? AbstractC11895b.m31982a(i13, 0.0f, (i16 - abstractC39104j4.f168212x) / f13) : iM36258X, -(abstractC39104j4.f168212x / 2)), abstractC39101i1);
                }
                AbstractC39101i1.m124624n(abstractC39104j3, abstractC39104j1 != null ? abstractC39104j1.f168211w : 0, Math.max(z4 != 0 ? AbstractC11895b.m31982a(1, 0.0f, (i16 - abstractC39104j3.f168212x) / f13) : iM36258X, (abstractC39104j4 != null ? abstractC39104j4.f168212x : 0) / 2), abstractC39101i1);
                if (abstractC39104j5 != null) {
                    if (z4 != 0) {
                        iM36258X = AbstractC11895b.m31982a(1, 0.0f, (i16 - abstractC39104j5.f168212x) / f13);
                    }
                    AbstractC39101i1.m124624n(abstractC39104j5, abstractC39104j1 != null ? abstractC39104j1.f168211w : 0, Math.max(iM36258X, (abstractC39104j4 != null ? abstractC39104j4.f168212x : 0) / 2), abstractC39101i1);
                }
                AbstractC39101i1.m124623k(abstractC39101i1, abstractC39104j6, 0L);
                return c23454a0;
            default:
                ArrayList arrayList = (ArrayList) obj9;
                InterfaceC39140v1 interfaceC39140v1 = (InterfaceC39140v1) obj8;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) obj7;
                C15061k5 c15061k5 = (C15061k5) obj6;
                C39169a c39169a = (C39169a) obj5;
                C22665e0 c22665e0 = (C22665e0) obj4;
                C22665e0 c22665e1 = (C22665e0) obj3;
                C37816b c37816b = (C37816b) obj2;
                AbstractC39101i1 abstractC39101i2 = (AbstractC39101i1) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i17 = i16;
                int i18 = 0;
                while (i18 < size) {
                    C23454a0 c23454a1 = c23454a0;
                    AbstractC39104j1 abstractC39104j7 = (AbstractC39104j1) arrayList.get(i18);
                    AbstractC39101i1.m124624n(abstractC39104j7, i17, 0, abstractC39101i2);
                    arrayList2.add(new C15183w7(interfaceC39140v1.mo733e0(i17), interfaceC39140v1.mo733e0(abstractC39104j7.f168211w)));
                    i17 += abstractC39104j7.f168211w;
                    i18++;
                    size = size;
                    arrayList = arrayList;
                    c23454a0 = c23454a1;
                }
                C23454a0 c23454a2 = c23454a0;
                List listMo124616s0 = interfaceC39140v1.mo124616s0(EnumC14988d8.f56027x, interfaceC4351m);
                int size2 = listMo124616s0.size();
                int i19 = 0;
                while (i19 < size2) {
                    InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) listMo124616s0.get(i19);
                    int i24 = size2;
                    long j7 = c39169a.f168407a;
                    int i25 = c22665e0.f89334w;
                    AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(C39169a.m124758b(j7, i25, i25, 0, 0, 8));
                    AbstractC39101i1.m124624n(abstractC39104j1Mo448T, 0, c22665e1.f89334w - abstractC39104j1Mo448T.f168212x, abstractC39101i2);
                    i19++;
                    size2 = i24;
                }
                List listMo124616s1 = interfaceC39140v1.mo124616s0(EnumC14988d8.f56028y, new C37816b(new C15203y7(c37816b, arrayList2, 0), true, -43203918));
                int i26 = 0;
                for (int size3 = listMo124616s1.size(); i26 < size3; size3 = size3) {
                    InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) listMo124616s1.get(i26);
                    int i27 = c22665e0.f89334w;
                    int i28 = c22665e1.f89334w;
                    if (!((i27 >= 0) & (i28 >= 0))) {
                        AbstractC39177i.m124789a("width and height must be >= 0");
                    }
                    AbstractC39101i1.m124624n(interfaceC39124q1.mo448T(AbstractC39170b.m124776h(i27, i27, i28, i28)), 0, 0, abstractC39101i2);
                    i26++;
                }
                C13821r1 c13821r1 = c15061k5.f56396a;
                Integer num = c15061k5.f56398c;
                if (num == null || num.intValue() != i15) {
                    c15061k5.f56398c = Integer.valueOf(i15);
                    C15183w7 c15183w7 = (C15183w7) AbstractC25265s.m74102I0(i15, arrayList2);
                    if (c15183w7 != null) {
                        C15183w7 c15183w8 = (C15183w7) AbstractC25265s.m74112P0(arrayList2);
                        int iMo724F = interfaceC39140v1.mo724F(c15183w8.f56983a + c15183w8.f56984b) + i16;
                        int iM87024x = iMo724F - c13821r1.f49321d.m87024x();
                        int iMo724F2 = interfaceC39140v1.mo724F(c15183w7.f56983a) - ((iM87024x / 2) - (interfaceC39140v1.mo724F(c15183w7.f56984b) / 2));
                        int i29 = iMo724F - iM87024x;
                        if (i29 < 0) {
                            i29 = 0;
                        }
                        int iM36284n = AbstractC12889b.m36284n(iMo724F2, 0, i29);
                        if (c13821r1.f49318a.m87024x() != iM36284n) {
                            AbstractC3006f0.m8732z(c15061k5.f56397b, null, null, new C15051j5(c15061k5, iM36284n, null, 0), 3);
                        }
                    }
                }
                return c23454a2;
        }
    }

    public /* synthetic */ C15060k4(int i13, ArrayList arrayList, InterfaceC39140v1 interfaceC39140v1, InterfaceC4351m interfaceC4351m, C15061k5 c15061k5, int i14, C39169a c39169a, C22665e0 c22665e0, C22665e0 c22665e1, C37816b c37816b) {
        this.f56393x = i13;
        this.f56395z = arrayList;
        this.f56385E = interfaceC39140v1;
        this.f56386F = interfaceC4351m;
        this.f56387G = c15061k5;
        this.f56394y = i14;
        this.f56388H = c39169a;
        this.f56389I = c22665e0;
        this.f56390J = c22665e1;
        this.f56391K = c37816b;
    }
}
