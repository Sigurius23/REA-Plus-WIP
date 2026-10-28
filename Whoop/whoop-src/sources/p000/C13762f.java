package p000;

import a11.C0140r;
import a61.AbstractC0470c;
import a80.C0538b;
import a81.C0550a;
import am0.AbstractC1000d;
import am2.AbstractC1026k;
import am2.AbstractC1035o0;
import am2.AbstractC1046w;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import b30.C2603q0;
import bb2.AbstractC2933i;
import bg0.C3220b;
import bp0.C3514b;
import bs1.AbstractC3583c0;
import bs1.AbstractC3585d0;
import c41.AbstractC3993b1;
import c41.C4092p2;
import cd1.C4443g;
import ck1.AbstractC4786i;
import java.util.List;
import l01.C23042n;
import l83.C23454a0;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p390p1.C28655q;
import p698au1.C2056a;
import p699b70.Function1;
import p702ch0.C4619f1;
import p702ch0.C4622g1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q20.AbstractC29840y;
import s01.C32048d;
import w71.C36906y;
import y00.C38915o4;
import y71.C39282o;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13762f implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49112w;

    public /* synthetic */ C13762f(int i13) {
        this.f49112w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f49112w) {
            case 0:
                InterfaceC1103a item = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC22676k.m65750j(item, "$this$item");
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC37785x.m121283d(c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            case 1:
                return AbstractC0470c.m1141l((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return C0538b.m1313d((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return C0550a.m1374c((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return AbstractC1000d.m2692j((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return AbstractC1026k.m2738L((C39282o) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return AbstractC1046w.m3004P((C39282o) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return AbstractC1035o0.m2922w0((C39282o) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return AbstractC1035o0.m2926y0((C39282o) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return AbstractC1035o0.m2810A0((C39282o) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return AbstractC1035o0.m2826I0((C4092p2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return AbstractC1035o0.m2918u0((C32048d) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return AbstractC1035o0.m2840P0((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                return C2056a.m6479e((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 14:
                return C2056a.m6480f((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                return C2603q0.m7514a((AbstractC29840y) obj, (C38915o4) obj2, (List) obj3);
            case 16:
                return Function1.m7866w((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC2933i.m8558l((C23042n) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C3220b.m9262d((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C3514b.m10405c((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 20:
                return AbstractC3583c0.m10812Z1((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 21:
                return AbstractC3585d0.m10926g((C36906y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC3993b1.m12092p((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC3993b1.m12094r((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 24:
                return C4443g.m13888e((InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 25:
                return C4443g.m13889f((InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 26:
                return C4619f1.m14377c((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 27:
                return C4622g1.m14380c((InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 28:
                return AbstractC4786i.m15071A((C0140r) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC4786i.m15073C((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ C13762f(C2603q0 c2603q0) {
        this.f49112w = 15;
    }
}
