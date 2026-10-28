package j81;

import af3.AbstractC0844t;
import af3.C0826c;
import af3.C0846v;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.InterfaceC1585g0;
import b91.C2886a;
import c31.C3927k;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6720c;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.TextResource;
import com.whoop.membership.familyPlan.navigation.AbstractC9113a;
import com.whoop.membership.familyPlan.navigation.FamilyPlanNavHostDestination;
import com.whoop.payments.domain.models.Card;
import com.whoop.whooplabs.feature.navigation.AbstractC10838a;
import com.whoop.whooplabs.feature.navigation.C10839b;
import gz0.EnumC16313m0;
import ii0.AbstractC18533a;
import io0.C20734u;
import iz0.C21054m;
import java.util.List;
import jx2.AbstractC22042f;
import kd1.AbstractC22403o;
import ko0.C22646d;
import ko0.C22647e;
import l01.AbstractC23041m;
import l72.AbstractC23408o;
import l81.AbstractC23449d;
import l83.InterfaceC23459e;
import m72.AbstractC25208g;
import n01.AbstractC26087d;
import n01.C26088e;
import nn2.AbstractC26867a;
import no0.AbstractC26950h0;
import no0.AbstractC26958l0;
import no0.AbstractC26979w;
import nw0.AbstractC27200g;
import o72.AbstractC27645f;
import o72.AbstractC27647h;
import p114eb.C12991u0;
import p291l0.InterfaceC23001u;
import p294l3.C23248d;
import p294l3.C23285v0;
import p635y2.InterfaceC39105k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p732rs0.AbstractC42791d;
import p734sl0.AbstractC32637l2;
import p734sl0.C32588b3;
import p734sl0.EnumC32593c3;
import p734sl0.EnumC32685v2;
import p745y81.EnumC39333f;
import q22.AbstractC29854d;
import q22.C29855e;
import q81.AbstractC30049g;
import q81.C30050h;
import rf0.C31354a;
import rf0.C31356c;
import rg2.C31391c;
import rm2.AbstractC31605e;
import rm2.EnumC31606f;
import sg2.AbstractC32453d;
import sg2.AbstractC32471v;
import sg2.C32457h;
import sy1.C33096a;
import ty1.AbstractC34264i;
import ty1.C34266k;
import uf0.AbstractC34907h;
import uu2.AbstractC35252g0;
import uw1.C35313f;
import zk0.C40819i0;
import zw2.C41178b;

/* JADX INFO: renamed from: j81.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21421e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f82197E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f82198F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f82199G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f82200H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82201w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f82202x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f82203y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f82204z;

    public /* synthetic */ C21421e(int i13, int i14, int i15, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z4) {
        this.f82201w = i15;
        this.f82203y = obj;
        this.f82202x = obj2;
        this.f82204z = obj3;
        this.f82200H = obj4;
        this.f82197E = obj5;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f82201w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC21422f.m60268l((Modifier) this.f82202x, (String) this.f82203y, (TextResource) this.f82204z, (TextResource) this.f82200H, (EnumC39333f) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21422f.m60266j((Modifier) this.f82202x, (String) this.f82203y, (TextResource) this.f82204z, (EnumC39333f) this.f82197E, (Integer) this.f82200H, this.f82198F, this.f82199G, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC22042f.m63093x0((AbstractC10838a) this.f82202x, (C12991u0) this.f82203y, (C10839b) this.f82204z, (C41178b) this.f82200H, (InterfaceC4339a) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC23041m.m66846I((InterfaceC23001u) this.f82204z, (Modifier) this.f82202x, (EnumC16313m0) this.f82200H, (String) this.f82203y, (Function1) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC23408o.m67882y0((Function1) this.f82202x, (Function1) this.f82203y, (InterfaceC4339a) this.f82204z, (InterfaceC4339a) this.f82200H, (InterfaceC4351m) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC23449d.m68023n((Function3) this.f82203y, (Function3) this.f82204z, (Modifier) this.f82202x, (Double) this.f82200H, (Double) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC26087d.m77592i((Modifier) this.f82202x, (Modifier) this.f82203y, (C26088e) this.f82204z, (Function1) this.f82200H, (Function3) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC26867a.m80220c((InterfaceC23001u) this.f82203y, (AbstractC22403o) this.f82204z, (List) this.f82200H, (Modifier) this.f82202x, (InterfaceC39105k) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC26979w.m80835C((String) this.f82203y, (String) this.f82202x, (String) this.f82204z, (Function1) this.f82200H, (Function1) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC26950h0.m80514k((C22647e) this.f82202x, (C22646d) this.f82204z, (String) this.f82203y, (String) this.f82200H, (String) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC26958l0.m80629Y((Modifier) this.f82202x, (C3927k) this.f82204z, (String) this.f82203y, (C20734u) this.f82200H, (Function1) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC27200g.m81801Z((TextResource) this.f82204z, (TextResource) this.f82200H, (List) this.f82202x, (Function1) this.f82203y, (Function1) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return AbstractC27645f.m83483o((AbstractC25208g) this.f82202x, (Function1) this.f82204z, (Function1) this.f82200H, (Function1) this.f82197E, (String) this.f82203y, this.f82198F, this.f82199G, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return AbstractC27647h.m83491B((AbstractC25208g.c) this.f82202x, (Function1) this.f82204z, (Function1) this.f82200H, (Function1) this.f82197E, (String) this.f82203y, this.f82198F, this.f82199G, (Composer) obj, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj2).intValue();
                return AbstractC6720c.m20154g((Modifier) this.f82202x, (Modifier) this.f82203y, (AbstractC6721d.c) this.f82204z, (InterfaceC4339a) this.f82200H, (InterfaceC4339a) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj2).intValue();
                return AbstractC29854d.m91443L((C29855e) this.f82202x, (Card) this.f82203y, (InterfaceC4351m) this.f82204z, (Function1) this.f82200H, (InterfaceC4351m) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC30049g.m92024L((Modifier) this.f82202x, (InterfaceC1585g0) this.f82203y, (C23285v0) this.f82204z, (C2886a) this.f82200H, (C30050h) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return AbstractC31605e.m97567I0((EnumC31606f) this.f82202x, (C12991u0) this.f82203y, (AbstractC18533a) this.f82204z, (InterfaceC4339a) this.f82200H, (InterfaceC4339a) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC42791d.m98712f((InterfaceC4339a) this.f82203y, (InterfaceC4339a) this.f82204z, (InterfaceC4339a) this.f82200H, (Modifier) this.f82202x, (Float) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue19);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue20 = ((Integer) obj2).intValue();
                return AbstractC32453d.m101345e((C32457h) this.f82203y, (Function1) this.f82204z, (InterfaceC4339a) this.f82200H, (Function1) this.f82197E, (Modifier) this.f82202x, this.f82198F, this.f82199G, (Composer) obj, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj2).intValue();
                return AbstractC32471v.m101427L((C31391c) this.f82203y, (Modifier) this.f82202x, (Function1) this.f82204z, (InterfaceC4339a) this.f82200H, (Function1) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj2).intValue();
                return AbstractC32637l2.m101981s((AbstractC0844t) this.f82202x, (C23248d) this.f82203y, (C21054m) this.f82204z, (C40819i0) this.f82200H, (C32588b3) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue22);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC32637l2.m101944T((C0846v) this.f82202x, (EnumC32685v2) this.f82203y, (C21054m) this.f82204z, (C40819i0) this.f82200H, (C32588b3) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue23);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue24 = ((Integer) obj2).intValue();
                return AbstractC32637l2.m101935K((C0826c) this.f82202x, (EnumC32593c3) this.f82203y, (C21054m) this.f82204z, (C40819i0) this.f82200H, (C32588b3) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue24);
            case 24:
                int iIntValue25 = ((Integer) obj2).intValue();
                return AbstractC9113a.m22745j((C35313f) this.f82202x, (C12991u0) this.f82203y, (InterfaceC1585g0) this.f82204z, (FamilyPlanNavHostDestination) this.f82200H, (Function1) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue25);
            case 25:
                int iIntValue26 = ((Integer) obj2).intValue();
                return AbstractC34264i.m108338O((C34266k) this.f82204z, (String) this.f82203y, (Modifier) this.f82202x, (Function1) this.f82200H, (InterfaceC4339a) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue26);
            case 26:
                int iIntValue27 = ((Integer) obj2).intValue();
                return AbstractC34264i.m108330G((C34266k) this.f82203y, (InterfaceC4351m) this.f82204z, (Modifier) this.f82202x, (Function1) this.f82200H, (InterfaceC4339a) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue27);
            case 27:
                int iIntValue28 = ((Integer) obj2).intValue();
                return AbstractC34264i.m108349Z((C33096a) this.f82202x, (String) this.f82203y, (InterfaceC4339a) this.f82204z, (InterfaceC4339a) this.f82200H, (InterfaceC4339a) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue28);
            case 28:
                int iIntValue29 = ((Integer) obj2).intValue();
                return AbstractC34907h.m110091j((String) this.f82203y, (String) this.f82202x, (String) this.f82204z, (C31356c) this.f82200H, (C31354a) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue29);
            default:
                int iIntValue30 = ((Integer) obj2).intValue();
                return AbstractC35252g0.m111713m((Modifier) this.f82202x, (AbstractC22403o) this.f82204z, (String) this.f82203y, (String) this.f82200H, (InterfaceC4339a) this.f82197E, this.f82198F, this.f82199G, (Composer) obj, iIntValue30);
        }
    }

    public /* synthetic */ C21421e(Modifier modifier, String str, TextResource textResource, EnumC39333f enumC39333f, Integer num, int i13, int i14) {
        this.f82201w = 1;
        this.f82202x = modifier;
        this.f82203y = str;
        this.f82204z = textResource;
        this.f82197E = enumC39333f;
        this.f82200H = num;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(TextResource textResource, TextResource textResource2, List list, Function1 function1, Function1 function2, int i13, int i14) {
        this.f82201w = 11;
        this.f82204z = textResource;
        this.f82200H = textResource2;
        this.f82202x = list;
        this.f82203y = function1;
        this.f82197E = function2;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(Object obj, Object obj2, Object obj3, Modifier modifier, Object obj4, int i13, int i14, int i15) {
        this.f82201w = i15;
        this.f82203y = obj;
        this.f82204z = obj2;
        this.f82200H = obj3;
        this.f82202x = modifier;
        this.f82197E = obj4;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13, int i14, int i15) {
        this.f82201w = i15;
        this.f82202x = obj;
        this.f82203y = obj2;
        this.f82204z = obj3;
        this.f82200H = obj4;
        this.f82197E = obj5;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(Object obj, Object obj2, String str, Object obj3, Object obj4, int i13, int i14, int i15) {
        this.f82201w = i15;
        this.f82202x = obj;
        this.f82204z = obj2;
        this.f82203y = str;
        this.f82200H = obj3;
        this.f82197E = obj4;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(Object obj, InterfaceC23459e interfaceC23459e, Modifier modifier, Object obj2, Object obj3, int i13, int i14, int i15) {
        this.f82201w = i15;
        this.f82203y = obj;
        this.f82204z = interfaceC23459e;
        this.f82202x = modifier;
        this.f82200H = obj2;
        this.f82197E = obj3;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(InterfaceC23001u interfaceC23001u, Modifier modifier, EnumC16313m0 enumC16313m0, String str, Function1 function1, int i13, int i14) {
        this.f82201w = 3;
        this.f82204z = interfaceC23001u;
        this.f82202x = modifier;
        this.f82200H = enumC16313m0;
        this.f82203y = str;
        this.f82197E = function1;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(AbstractC25208g abstractC25208g, Function1 function1, Function1 function2, Function1 function3, String str, int i13, int i14, int i15) {
        this.f82201w = i15;
        this.f82202x = abstractC25208g;
        this.f82204z = function1;
        this.f82200H = function2;
        this.f82197E = function3;
        this.f82203y = str;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(C32457h c32457h, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, Modifier modifier, int i13, int i14) {
        this.f82201w = 19;
        this.f82203y = c32457h;
        this.f82204z = function1;
        this.f82200H = interfaceC4339a;
        this.f82197E = function2;
        this.f82202x = modifier;
        this.f82198F = i13;
        this.f82199G = i14;
    }

    public /* synthetic */ C21421e(C34266k c34266k, String str, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f82201w = 25;
        this.f82204z = c34266k;
        this.f82203y = str;
        this.f82202x = modifier;
        this.f82200H = function1;
        this.f82197E = interfaceC4339a;
        this.f82198F = i13;
        this.f82199G = i14;
    }
}
