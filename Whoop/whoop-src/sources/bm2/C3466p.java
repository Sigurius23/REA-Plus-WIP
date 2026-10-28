package bm2;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bm.C3396t;
import c41.AbstractC4062l0;
import c41.AbstractC4076n0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.util.TrendKey;
import dv2.InterfaceC12394e;
import ev2.AbstractC13705n;
import fi0.InterfaceC14515a;
import h01.AbstractC16552s;
import h01.C16553t;
import i93.C18284j;
import java.util.ArrayList;
import java.util.List;
import kd1.EnumC22400l;
import l83.C23454a0;
import or2.EnumC28166h0;
import p163g1.C15199y3;
import p164g2.C15247s;
import p164g2.InterfaceC15237i;
import p292l1.AbstractC23192w;
import p292l1.C23085e0;
import p292l1.C23204y;
import p292l1.InterfaceC23142n3;
import p316m1.AbstractC24917o;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import qh0.C30365b;
import rv2.InterfaceC31850h;
import sv2.AbstractC33042e;
import v41.C35666g;
import vh0.AbstractC36042c;
import xh0.AbstractC38307c;
import z80.AbstractC40180a;

/* JADX INFO: renamed from: bm2.p */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3466p implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f13590E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f13591F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f13592G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f13593H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f13594I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13595w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f13596x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f13597y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f13598z;

    public /* synthetic */ C3466p(AbstractC4076n0 abstractC4076n0, String str, Function1 function1, EnumC22400l enumC22400l, C9598e c9598e, TextResource textResource, TextResource textResource2, FeatureFlagChecker featureFlagChecker) {
        this.f13597y = abstractC4076n0;
        this.f13598z = str;
        this.f13596x = function1;
        this.f13590E = enumC22400l;
        this.f13591F = c9598e;
        this.f13592G = textResource;
        this.f13593H = textResource2;
        this.f13594I = featureFlagChecker;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13595w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3468q.m10180o((TrendKey) this.f13597y, (EnumC28166h0) this.f13598z, (C3470r) this.f13590E, (C26068u) this.f13591F, (InterfaceC28601c1) this.f13592G, (InterfaceC28601c1) this.f13593H, this.f13596x, (Function1) this.f13594I, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4062l0.m12424l((AbstractC4076n0) this.f13597y, (String) this.f13598z, this.f13596x, (EnumC22400l) this.f13590E, (C9598e) this.f13591F, (TextResource) this.f13592G, (TextResource) this.f13593H, (FeatureFlagChecker) this.f13594I, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC13705n.m38672A((InterfaceC12394e.b) this.f13597y, this.f13596x, (C26068u) this.f13591F, (InterfaceC15237i) this.f13598z, (Function3) this.f13590E, (InterfaceC2994c0) this.f13593H, (C15199y3) this.f13594I, (InterfaceC28601c1) this.f13592G, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC16552s.m46824m((C16553t) this.f13597y, this.f13596x, (String) this.f13598z, (InterfaceC28670t2) this.f13590E, (InterfaceC28601c1) this.f13592G, (InterfaceC28670t2) this.f13591F, (InterfaceC28601c1) this.f13593H, (InterfaceC28601c1) this.f13594I, (Composer) obj, iIntValue4);
            case 4:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC23192w.m67147a((Long) this.f13597y, this.f13596x, (AbstractC24917o) this.f13598z, (C18284j) this.f13590E, (C23085e0) this.f13591F, (InterfaceC23142n3) this.f13592G, (C23204y) this.f13593H, (C15247s) this.f13594I, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 5:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC33042e.m104491a1((InterfaceC31850h.b) this.f13597y, this.f13596x, (List) this.f13598z, (C3396t) this.f13590E, (ArrayList) this.f13591F, (InterfaceC14515a) this.f13592G, (InterfaceC2994c0) this.f13593H, (C15199y3) this.f13594I, (Composer) obj, iIntValue5);
            case 6:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC38307c.m122729v((C15199y3) this.f13597y, (C35666g) this.f13598z, (InterfaceC2994c0) this.f13590E, (C30365b) this.f13591F, this.f13596x, (AbstractC36042c) this.f13592G, (Function1) this.f13594I, (InterfaceC4339a) this.f13593H, (Composer) obj, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC40180a.m128908p((TextResource) this.f13597y, (TextResource) this.f13598z, (List) this.f13590E, (TextResource) this.f13591F, this.f13596x, (TextResource) this.f13592G, (InterfaceC4339a) this.f13593H, (InterfaceC28593a1) this.f13594I, (Composer) obj, iIntValue7);
        }
    }

    public /* synthetic */ C3466p(TextResource textResource, TextResource textResource2, List list, TextResource textResource3, Function1 function1, TextResource textResource4, InterfaceC4339a interfaceC4339a, InterfaceC28593a1 interfaceC28593a1) {
        this.f13597y = textResource;
        this.f13598z = textResource2;
        this.f13590E = list;
        this.f13591F = textResource3;
        this.f13596x = function1;
        this.f13592G = textResource4;
        this.f13593H = interfaceC4339a;
        this.f13594I = interfaceC28593a1;
    }

    public /* synthetic */ C3466p(TrendKey trendKey, EnumC28166h0 enumC28166h0, C3470r c3470r, C26068u c26068u, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, Function1 function2) {
        this.f13597y = trendKey;
        this.f13598z = enumC28166h0;
        this.f13590E = c3470r;
        this.f13591F = c26068u;
        this.f13592G = interfaceC28601c1;
        this.f13593H = interfaceC28601c2;
        this.f13596x = function1;
        this.f13594I = function2;
    }

    public /* synthetic */ C3466p(InterfaceC12394e.b bVar, Function1 function1, C26068u c26068u, InterfaceC15237i interfaceC15237i, Function3 function3, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1) {
        this.f13597y = bVar;
        this.f13596x = function1;
        this.f13591F = c26068u;
        this.f13598z = interfaceC15237i;
        this.f13590E = function3;
        this.f13593H = interfaceC2994c0;
        this.f13594I = c15199y3;
        this.f13592G = interfaceC28601c1;
    }

    public /* synthetic */ C3466p(C15199y3 c15199y3, C35666g c35666g, InterfaceC2994c0 interfaceC2994c0, C30365b c30365b, Function1 function1, AbstractC36042c abstractC36042c, Function1 function2, InterfaceC4339a interfaceC4339a) {
        this.f13597y = c15199y3;
        this.f13598z = c35666g;
        this.f13590E = interfaceC2994c0;
        this.f13591F = c30365b;
        this.f13596x = function1;
        this.f13592G = abstractC36042c;
        this.f13594I = function2;
        this.f13593H = interfaceC4339a;
    }

    public /* synthetic */ C3466p(C16553t c16553t, Function1 function1, String str, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        this.f13597y = c16553t;
        this.f13596x = function1;
        this.f13598z = str;
        this.f13590E = interfaceC28670t2;
        this.f13592G = interfaceC28601c1;
        this.f13591F = interfaceC28670t3;
        this.f13593H = interfaceC28601c2;
        this.f13594I = interfaceC28601c3;
    }

    public /* synthetic */ C3466p(Long l7, Function1 function1, AbstractC24917o abstractC24917o, C18284j c18284j, C23085e0 c23085e0, InterfaceC23142n3 interfaceC23142n3, C23204y c23204y, C15247s c15247s, int i13) {
        this.f13597y = l7;
        this.f13596x = function1;
        this.f13598z = abstractC24917o;
        this.f13590E = c18284j;
        this.f13591F = c23085e0;
        this.f13592G = interfaceC23142n3;
        this.f13593H = c23204y;
        this.f13594I = c15247s;
    }

    public /* synthetic */ C3466p(InterfaceC31850h.b bVar, Function1 function1, List list, C3396t c3396t, ArrayList arrayList, InterfaceC14515a interfaceC14515a, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        this.f13597y = bVar;
        this.f13596x = function1;
        this.f13598z = list;
        this.f13590E = c3396t;
        this.f13591F = arrayList;
        this.f13592G = interfaceC14515a;
        this.f13593H = interfaceC2994c0;
        this.f13594I = c15199y3;
    }
}
