package no0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.webkit.ValueCallback;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.protobuf.AbstractC1391i;
import androidx.glance.appwidget.protobuf.C1388h;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.education.view.EducationFragment;
import com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment;
import com.whoop.shepherd.fragment.ShepherdOnboardingFragment;
import com.whoop.shepherd.fragment.ShepherdTermsOfUseFragment;
import com.whoop.stress.view.StressSessionFragment;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse;
import dp0.InterfaceC12251g;
import e93.AbstractC12889b;
import ge2.InterfaceC15739d;
import h00.C16528v;
import io0.EnumC20735v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import k71.C22257n;
import ko1.C22648a;
import ko1.C22650c;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import ld1.AbstractC23864c;
import ld2.C23866a;
import lj2.C24481g;
import lo0.C24571b0;
import lo1.InterfaceC24616a;
import m62.C25114e;
import me2.InterfaceC25473a;
import mh1.C25558a;
import mh1.C25560c;
import mp2.C25871a;
import mp2.C25872b;
import ne1.AbstractC26598a;
import ne1.C26599b;
import ng0.C26679a;
import ng0.C26681c;
import nh1.InterfaceC26720a;
import no1.AbstractC26994h;
import np2.InterfaceC27034a;
import nw0.AbstractC27208o;
import nz2.AbstractC27310d;
import og0.InterfaceC27915a;
import ot2.C28349r;
import oy2.AbstractC28486l;
import oy2.AbstractC28490p;
import oy2.C28479e;
import p114eb.AbstractC12939a0;
import p114eb.C12987s0;
import p329n0.InterfaceC26064q;
import p358o6.C27595c;
import p358o6.C27598f;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p395p6.C28864b;
import p41.AbstractC28838i;
import p41.C28839j;
import p451r6.C30947a;
import p451r6.C30956j;
import p451r6.C30957k;
import p451r6.C30960n;
import p465rm.InterfaceC31544k;
import p702ch0.C4656v0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31917f;
import pd2.C29110f;
import pe2.C29118b;
import ph1.AbstractC29245i;
import ph1.AbstractC29247k;
import pp2.AbstractC29452p;
import pt2.AbstractC29543y;
import q00.AbstractC29713f;
import q00.AbstractC29740v;
import q00.C29737s;
import q00.C29738t;
import q00.C29739u;
import q12.AbstractC29803d;
import q31.AbstractC29946d;
import q31.C29948f;
import q62.AbstractC30001a;
import q81.AbstractC30043a;
import q81.C30044b;
import qd2.AbstractC30295a;
import qg0.AbstractC30344e;
import r51.C30938f;
import r80.AbstractC31062d;
import r80.C31063e;
import r80.C31064f;
import r80.EnumC31059a;
import re1.AbstractC31323j;
import rm1.AbstractC31595i;
import s41.C32193a;
import s41.C32194b;
import ty2.AbstractC34268a;
import xd2.InterfaceC38212h;

/* JADX INFO: renamed from: no0.j0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26954j0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107515w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f107516x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f107517y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f107518z;

    public /* synthetic */ C26954j0(InterfaceC4339a interfaceC4339a, InterfaceC23459e interfaceC23459e, Object obj, int i13) {
        this.f107515w = i13;
        this.f107518z = interfaceC4339a;
        this.f107516x = interfaceC23459e;
        this.f107517y = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f107515w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f107518z;
        Object obj3 = this.f107517y;
        Object obj4 = this.f107516x;
        switch (i13) {
            case 0:
                return AbstractC26958l0.m80610O0((Function1) obj4, (EnumC20735v) obj3, (InterfaceC4339a) obj2, (String) obj);
            case 1:
                return AbstractC26962n0.m80714p((C24571b0.b.e) obj3, (InterfaceC28601c1) obj2, (Function1) obj4, (InterfaceC26064q) obj);
            case 2:
                return AbstractC26994h.m80974i((C22648a) obj4, (C22650c) obj3, (InterfaceC23462h) obj2, (InterfaceC24616a) obj);
            case 3:
                return AbstractC27208o.m81907S((C22257n) obj3, (Function1) obj4, (Function1) obj2, obj);
            case 4:
                return AbstractC27310d.m82461c((ValueCallback) obj3, (Function1) obj4, (InterfaceC4339a) obj2, (ValueCallback) obj);
            case 5:
                return ShepherdNotificationHistoryFragment.m25867H((AbstractC12939a0) obj4, (ShepherdNotificationHistoryFragment) obj3, (C29118b) obj2, (InterfaceC38212h.l) obj);
            case 6:
                return ShepherdOnboardingFragment.m25877G((AbstractC12939a0) obj4, (C29118b) obj3, (ShepherdOnboardingFragment) obj2, (InterfaceC25473a.c) obj);
            case 7:
                return ShepherdTermsOfUseFragment.m25899H((AbstractC12939a0) obj4, (ShepherdTermsOfUseFragment) obj3, (C29118b) obj2, (InterfaceC15739d.c) obj);
            case 8:
                return C28479e.m86691x0((C28479e) obj4, (AbstractC28486l.b) obj3, (AbstractC28490p) obj2, (CampaignStepConfigResponse) obj);
            case 9:
                return AbstractC28838i.m87720j((Function1) obj4, (C28839j) obj3, (InterfaceC28601c1) obj2, ((Boolean) obj).booleanValue());
            case 10:
                return AbstractC29245i.m88776D((InterfaceC4339a) obj2, (Function1) obj4, (C30938f) obj3, obj);
            case 11:
                return AbstractC29247k.m88845i((C25558a) obj4, (C25560c) obj3, (InterfaceC23462h) obj2, (InterfaceC26720a) obj);
            case 12:
                return StressSessionFragment.m26448P((StressSessionFragment) obj4, (C24481g) obj3, (InterfaceC28670t2) obj2, (C12987s0) obj);
            case 13:
                return AbstractC29452p.m89924r((C25871a) obj4, (C25872b) obj3, (InterfaceC23462h) obj2, (InterfaceC27034a) obj);
            case 14:
                return AbstractC29543y.m90489y((C28349r) obj3, (Function1) obj4, (Function1) obj2, (InterfaceC26064q) obj);
            case 15:
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj2;
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj4;
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) obj3;
                AbstractC29740v item = (AbstractC29740v) obj;
                AbstractC22676k.m65750j(item, "item");
                if (item instanceof C29738t) {
                    interfaceC4339a.invoke();
                } else if (item instanceof C29737s) {
                    interfaceC4339a2.invoke();
                } else {
                    if (!(item instanceof C29739u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC4339a3.invoke();
                }
                return c23454a0;
            case 16:
                AbstractC29713f option = (AbstractC29713f) obj;
                AbstractC22676k.m65750j(option, "option");
                ((Function1) obj4).invoke(option);
                AbstractC3006f0.m8732z((InterfaceC2994c0) obj3, null, null, new C16528v(3, (Function1) obj2, null), 3);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC29803d.m91315q((C4656v0) obj4, (InterfaceC2994c0) obj3, (InterfaceC12251g) obj2, (C28624i0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29946d.m91606q((Function1) obj4, (C29948f) obj3, (Function1) obj2, ((Integer) obj).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C30947a c30947a = (C30947a) obj;
                int i14 = ActionCallbackBroadcastReceiver.f5861a;
                C30956j c30956jM95218t = C30957k.m95218t();
                c30956jM95218t.m4554c();
                C30957k.m95214n((C30957k) c30956jM95218t.f5992x, (String) obj4);
                int i15 = ((C28864b) obj3).f116802a;
                c30956jM95218t.m4554c();
                C30957k.m95215o((C30957k) c30956jM95218t.f5992x, i15);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(((C27598f) obj2).f111088a);
                ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
                for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    C27595c c27595c = (C27595c) entry.getKey();
                    arrayList.add(new C23465k(c27595c.f111087a, entry.getValue()));
                }
                C23465k[] c23465kArr = (C23465k[]) arrayList.toArray(new C23465k[0]);
                Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("ActionCallbackBroadcastReceiver:parameters", AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length))));
                Parcel parcelObtain = Parcel.obtain();
                bundleM36273g.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                C1388h c1388hM4353d = AbstractC1391i.m4353d(bArrMarshall, 0, bArrMarshall.length);
                c30956jM95218t.m4554c();
                C30957k.m95216p((C30957k) c30956jM95218t.f5992x, c1388hM4353d);
                C30957k c30957k = (C30957k) c30956jM95218t.m4552a();
                c30947a.m4554c();
                C30960n.m95233r((C30960n) c30947a.f5992x, c30957k);
                return c23454a0;
            case 20:
                return AbstractC30001a.m91798d((C25114e) obj3, (Function1) obj4, (Function1) obj2, obj);
            case 21:
                return AbstractC30043a.m91996p((InterfaceC1585g0) obj4, (C30044b) obj3, (InterfaceC28601c1) obj2, (C28624i0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30295a.m92583m((C29110f) obj3, (C23866a) obj2, (Function1) obj4, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30344e.m92736i((C26679a) obj4, (C26681c) obj3, (InterfaceC23462h) obj2, (InterfaceC27915a) obj);
            case 24:
                return AbstractC31062d.m95660j((C31063e) obj3, (Function1) obj4, (C31064f) obj2, (EnumC31059a) obj);
            case 25:
                return EducationFragment.m21374T((C26599b) obj4, (EducationFragment) obj3, (String) obj2, (AbstractC26598a) obj);
            case 26:
                return AbstractC31323j.m96362e0((Context) obj4, (InterfaceC31544k) obj3, (InterfaceC28601c1) obj2, (Context) obj);
            case 27:
                return AbstractC31595i.m97477z((AbstractC23864c) obj4, (InterfaceC28601c1) obj3, (InterfaceC28601c1) obj2, obj);
            case 28:
                return AbstractC31917f.m99354l((AbstractC34268a.a) obj3, (Function1) obj4, (InterfaceC28601c1) obj2, ((Integer) obj).intValue());
            default:
                return C32193a.m100119f((Function1) obj4, (C32194b) obj3, (InterfaceC28601c1) obj2, ((Integer) obj).intValue());
        }
    }

    public /* synthetic */ C26954j0(Object obj, Object obj2, Object obj3, int i13) {
        this.f107515w = i13;
        this.f107516x = obj;
        this.f107517y = obj2;
        this.f107518z = obj3;
    }

    public /* synthetic */ C26954j0(Object obj, Object obj2, Function1 function1, int i13) {
        this.f107515w = i13;
        this.f107517y = obj;
        this.f107518z = obj2;
        this.f107516x = function1;
    }

    public /* synthetic */ C26954j0(Object obj, Function1 function1, Object obj2, int i13) {
        this.f107515w = i13;
        this.f107517y = obj;
        this.f107516x = function1;
        this.f107518z = obj2;
    }
}
