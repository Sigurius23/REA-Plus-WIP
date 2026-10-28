package no0;

import a72.AbstractC0524a;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import bc3.C3031l1;
import bi.AbstractC3269g;
import com.whoop.core.details.sleep.view.SleepDetailsFragment;
import com.whoop.core.details.view.CoreDetailsFragment;
import com.whoop.core.details.view.InterfaceC6471b;
import com.whoop.realtime.presentation.C9889m;
import com.whoop.sage.view.SageFragment;
import com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment;
import com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment;
import com.whoop.user.journey.yearinreviewraf.YirRafFragment;
import com.whoop.whattoexpect.view.WhatToExpectFragment;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse;
import e93.AbstractC12889b;
import ec3.InterfaceC13058l;
import f72.AbstractC14227b;
import f72.C14229d;
import g40.C15329c;
import g40.C15335d;
import g40.InterfaceC15367i1;
import h20.C16687l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je2.InterfaceC21622a;
import kd1.EnumC22400l;
import kw0.AbstractC22848a;
import kw0.C22849b;
import kw2.C22872a;
import kw2.InterfaceC22873b;
import l83.C23454a0;
import lo0.EnumC24591l0;
import lw2.InterfaceC24776a;
import m72.AbstractC25206e;
import m72.C25207f;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mw0.AbstractC25974b;
import mw0.C25975c;
import n53.C26318e;
import nq2.AbstractC27062e;
import nw0.AbstractC27203j;
import ny0.AbstractC27265l0;
import o01.AbstractC27346b;
import o01.C27347c;
import o72.AbstractC27645f;
import oy2.AbstractC28486l;
import oy2.C28479e;
import p005a3.C0230n0;
import p025b1.C2214e;
import p040c0.InterfaceC3770q;
import p042c2.C3867l;
import p088dc.AbstractC11894a;
import p208i2.InterfaceC17886g0;
import p209i3.InterfaceC18044z;
import p268k0.AbstractC22086a;
import p291l0.InterfaceC22973k1;
import p31.AbstractC28795f;
import p31.C28797h;
import p329n0.InterfaceC26064q;
import p352ny.C27235g;
import p353o0.C27331o;
import p353o0.C27338v;
import p353o0.C27341y;
import p389p0.C28524g0;
import p389p0.C28562z;
import p390p1.C28621h1;
import p390p1.C28625i1;
import p390p1.C28633k1;
import p490t0.C33252i;
import p634y1.InterfaceC39033f;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc2.AbstractC29074d;
import pc2.C29076f;
import xd2.InterfaceC38212h;

/* JADX INFO: renamed from: no0.e0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26944e0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107469w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f107470x;

    public /* synthetic */ C26944e0(Object obj, int i13) {
        this.f107469w = i13;
        this.f107470x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C27331o c27331o;
        switch (this.f107469w) {
            case 0:
                return AbstractC26948g0.m80498u((EnumC24591l0) this.f107470x, (InterfaceC3770q) obj);
            case 1:
                return AbstractC27062e.m81307E((C33252i) this.f107470x, (InterfaceC17886g0) obj);
            case 2:
                return YirRafFragment.m27804F((YirRafFragment) this.f107470x, (String) obj);
            case 3:
                return AbstractC27203j.m81844K((C25975c) this.f107470x, (AbstractC25974b) obj);
            case 4:
                return SleepDetailsFragment.m19745d0((C22849b) this.f107470x, (AbstractC22848a) obj);
            case 5:
                return WhatToExpectFragment.m28406I((WhatToExpectFragment) this.f107470x, (InterfaceC24776a) obj);
            case 6:
                return WhatToExpectFragment.m28407J((C22872a) this.f107470x, (InterfaceC22873b) obj);
            case 7:
                C27235g c27235g = (C27235g) this.f107470x;
                C16687l c16687l = (C16687l) obj;
                C25271y c25271y = C25271y.f99162w;
                if (c16687l != null) {
                    return AbstractC3269g.m9493Z(c25271y);
                }
                List list = c27235g.f109007d;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC15367i1) it.next()).mo43551e());
                }
                return new C26318e(arrayList.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25267u.m74164j0(c25271y)) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 9), new C15335d(arrayList, 11));
            case 8:
                return AbstractC27265l0.m82220l((InterfaceC22973k1) this.f107470x, (Modifier) obj);
            case 9:
                return Integer.valueOf(((C27338v) this.f107470x).m82478c(((Integer) obj).intValue()));
            case 10:
                C27341y c27341y = (C27341y) this.f107470x;
                float f13 = -((Float) obj).floatValue();
                if ((f13 >= 0.0f || c27341y.mo39183d()) && (f13 <= 0.0f || c27341y.mo39182c())) {
                    if (Math.abs(c27341y.f109503g) > 0.5f) {
                        AbstractC22086a.m63160c("entered drag with non-zero pending scroll");
                    }
                    float f14 = c27341y.f109503g + f13;
                    c27341y.f109503g = f14;
                    if (Math.abs(f14) > 0.5f) {
                        float f15 = c27341y.f109503g;
                        int iM36258X = AbstractC12889b.m36258X(f15);
                        C27331o c27331oM82471d = ((C27331o) c27341y.f109501e.getValue()).m82471d(iM36258X, !c27341y.f109498b);
                        if (c27331oM82471d != null && (c27331o = c27341y.f109499c) != null) {
                            C27331o c27331oM82471d2 = c27331o.m82471d(iM36258X, true);
                            if (c27331oM82471d2 != null) {
                                c27341y.f109499c = c27331oM82471d2;
                            } else {
                                c27331oM82471d = null;
                            }
                        }
                        if (c27331oM82471d != null) {
                            c27341y.m82481f(c27331oM82471d, c27341y.f109498b, true);
                            c27341y.f109514r.setValue(C23454a0.f92919a);
                            c27341y.m82483h(f15 - c27341y.f109503g, c27331oM82471d);
                        } else {
                            C0230n0 c0230n0 = c27341y.f109506j;
                            if (c0230n0 != null) {
                                c0230n0.m630m();
                            }
                            c27341y.m82483h(f15 - c27341y.f109503g, c27341y.m82482g());
                        }
                    }
                    if (Math.abs(c27341y.f109503g) > 0.5f) {
                        f13 -= c27341y.f109503g;
                        c27341y.f109503g = 0.0f;
                    }
                } else {
                    f13 = 0.0f;
                }
                return Float.valueOf(-f13);
            case 11:
                return AbstractC27346b.m82502j((C27347c) this.f107470x, (InterfaceC18044z) obj);
            case 12:
                return C9889m.m24124w((C9889m) this.f107470x, (Float) obj);
            case 13:
                return SageFragment.m24445O((C14229d) this.f107470x, (AbstractC14227b) obj);
            case 14:
                return SageFragment.m24446P((SageFragment) this.f107470x, (AbstractC0524a) obj);
            case 15:
                return AbstractC27645f.m83488t((C25207f) this.f107470x, (AbstractC25206e) obj);
            case 16:
                return ShepherdNotificationHistoryFragment.m25868I((ShepherdNotificationHistoryFragment) this.f107470x, (InterfaceC38212h.p) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ShepherdToggleSettingsFragment.m25909H((ShepherdToggleSettingsFragment) this.f107470x, (InterfaceC21622a.j) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return CoreDetailsFragment.m19761K((CoreDetailsFragment) this.f107470x, (InterfaceC6471b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C28479e.m86695z0((AbstractC28486l.l) this.f107470x, (CampaignStepConfigResponse) obj);
            case 20:
                return new C2214e((C28562z) this.f107470x, 8);
            case 21:
                return new C2214e((C28524g0) this.f107470x, 10);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                InterfaceC39033f interfaceC39033f = (InterfaceC39033f) this.f107470x;
                return Boolean.valueOf(interfaceC39033f != null ? interfaceC39033f.mo7446d(obj) : true);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((C28621h1) this.f107470x).m87025y(((Integer) obj).intValue());
                return C23454a0.f92919a;
            case 24:
                ((C28625i1) this.f107470x).m87033y(((Long) obj).longValue());
                return C23454a0.f92919a;
            case 25:
                ((C28633k1) this.f107470x).setValue(obj);
                return C23454a0.f92919a;
            case 26:
                return AbstractC28795f.m87575w((C28797h) this.f107470x, (EnumC22400l) obj);
            case 27:
                C3867l c3867l = (C3867l) this.f107470x;
                InterfaceC39147y it3 = (InterfaceC39147y) obj;
                AbstractC22676k.m65750j(it3, "it");
                c3867l.f15801b = AbstractC39125q1.m124660f(it3);
                return C23454a0.f92919a;
            case 28:
                return AbstractC29074d.m88388f((C29076f) this.f107470x, (InterfaceC26064q) obj);
            default:
                C3031l1 c3031l1 = (C3031l1) this.f107470x;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    c3031l1.mo8819p(AbstractC11894a.m31955d(th3.getMessage(), th3));
                }
                return C23454a0.f92919a;
        }
    }
}
