package ov2;

import android.app.NotificationChannel;
import android.util.Log;
import androidx.glance.appwidget.MyPackageReplacedReceiver;
import androidx.health.platform.client.proto.C1533u;
import bi.AbstractC3269g;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.android.R;
import com.whoop.core.details.view.AbstractC6470a;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse;
import com.whoop.workmanager.PushNotificationPermissionStatusWorker;
import java.util.ArrayList;
import kd1.EnumC22400l;
import kw2.InterfaceC22873b;
import l83.C23454a0;
import l83.C23465k;
import lw2.InterfaceC24776a;
import mh.C25540h;
import nh3.AbstractC26725a;
import ow2.AbstractC28443f;
import ox2.AbstractC28462h;
import oy2.C28479e;
import oy2.InterfaceC28476b;
import oz0.AbstractC28496b;
import p040c0.InterfaceC3770q;
import p11.AbstractC28704e;
import p12.AbstractC28734x;
import p12.EnumC28717g;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p294l3.C23277r0;
import p31.AbstractC28795f;
import p335n6.C26384a;
import p335n6.C26386c;
import p335n6.C26387d;
import p335n6.C26393j;
import p335n6.C26396m;
import p335n6.InterfaceC26388e;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26397n;
import p335n6.InterfaceC26398o;
import p358o6.C27594b;
import p389p0.C28557w0;
import p395p6.AbstractC28869c1;
import p395p6.C28866b1;
import p395p6.C28884h1;
import p395p6.C28887i1;
import p395p6.C28927w;
import p395p6.C28933y;
import p41.AbstractC28832c;
import p451r6.C30947a;
import p451r6.C30953g;
import p451r6.C30960n;
import p477s2.AbstractC32072d;
import p50.AbstractC28850b;
import p545v6.C35721j;
import p636y3.C39173e;
import p636y3.C39176h;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tw0.AbstractC34217c;

/* JADX INFO: renamed from: ov2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C28402f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114602w;

    public /* synthetic */ C28402f(int i13) {
        this.f114602w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C26393j c26393j;
        C26393j c26393j2;
        C28933y c28933y;
        int i13 = this.f114602w;
        boolean z4 = true;
        z4 = true;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i14 = 0;
        switch (i13) {
            case 0:
                return AbstractC28403g.m86124e(obj);
            case 1:
                return AbstractC6470a.m19781O((AnalyticEventModel) obj);
            case 2:
                return AbstractC28443f.m86194o((InterfaceC24776a) obj);
            case 3:
                return AbstractC28443f.m86195p((InterfaceC22873b) obj);
            case 4:
                return AbstractC28462h.m86323H((InterfaceC22129c) obj);
            case 5:
                return AbstractC28462h.m86324I((C25540h) obj);
            case 6:
                return C28479e.m86594C0((CampaignStepConfigResponse) obj);
            case 7:
                return C28479e.m86598E0((CampaignStepConfigResponse) obj);
            case 8:
                return C28479e.m86602G0((InterfaceC28476b.c) obj);
            case 9:
                return C28479e.m86608J0((InterfaceC28476b.c) obj);
            case 10:
                return C28479e.m86614M0((InterfaceC28476b.c) obj);
            case 11:
                return C28479e.m86590A0((CampaignStepConfigResponse) obj);
            case 12:
                return AbstractC28496b.m86795e(obj);
            case 13:
                return PushNotificationPermissionStatusWorker.m28974m((NotificationChannel) obj);
            case 14:
                return AbstractC28704e.m87327x(obj);
            case 15:
                return AbstractC28734x.m87405R((EnumC28717g) obj);
            case 16:
                return AbstractC28734x.m87451s0(((Float) obj).floatValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC28734x.m87406S((AbstractC34217c) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                throw AbstractC26725a.m79500d(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC28795f.m87568p((EnumC22400l) obj);
            case 20:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                return c23454a0;
            case 21:
                C23277r0 it = (C23277r0) obj;
                AbstractC22676k.m65750j(it, "it");
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC28832c.m87694i((InterfaceC3770q) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC28850b.m87747i(obj);
            case 24:
                C39176h c39176h = (C39176h) obj;
                return Float.valueOf(C39176h.m124786b(c39176h.f168415a) * C39176h.m124787c(c39176h.f168415a));
            case 25:
                return Float.valueOf(C39176h.m124787c(((C39176h) obj).f168415a));
            case 26:
                Object obj2 = AbstractC28869c1.f116844a;
                return Boolean.TRUE;
            case 27:
                C30947a c30947a = (C30947a) obj;
                int i15 = MyPackageReplacedReceiver.f5858a;
                C30953g c30953g = (C30953g) C30953g.m95205n().m4552a();
                c30947a.m4554c();
                C30960n.m95234s((C30960n) c30947a.f5992x, c30953g);
                return c23454a0;
            case 28:
                InterfaceC26392i interfaceC26392i = (InterfaceC26392i) obj;
                if ((interfaceC26392i instanceof C28927w) || !interfaceC26392i.mo78105c().mo78099c(new C28402f(29))) {
                    return interfaceC26392i;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                InterfaceC26398o interfaceC26398oMo78105c = interfaceC26392i.mo78105c();
                boolean zMo78099c = interfaceC26398oMo78105c.mo78099c(C28887i1.f116929y);
                C26396m c26396m = C26396m.f104850a;
                InterfaceC26398o interfaceC26398o = null;
                C23465k c23465k = zMo78099c ? (C23465k) interfaceC26398oMo78105c.mo78097a(new C23465k(null, c26396m), C28866b1.f116824P) : new C23465k(null, interfaceC26398oMo78105c);
                InterfaceC26388e interfaceC26388e = (InterfaceC26388e) c23465k.f92937w;
                InterfaceC26398o interfaceC26398o2 = (InterfaceC26398o) c23465k.f92938x;
                int i16 = 2;
                if (interfaceC26388e == null) {
                    c26393j = null;
                } else if (interfaceC26388e instanceof C26387d) {
                    c26393j = new C26393j();
                    c26393j.f104844a = AbstractC32072d.m99702k(c26396m);
                    c26393j.f104845b = ((C26387d) interfaceC26388e).f104836a;
                    c26393j.f104847d = 2;
                    c26393j.f104846c = null;
                } else {
                    if (!(interfaceC26388e instanceof C26386c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(interfaceC26388e);
                    c26393j = null;
                }
                if (((Number) interfaceC26398o2.mo78097a(0, new C28557w0(i16))).intValue() > 1) {
                    Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                }
                C23465k c23465k2 = interfaceC26398o2.mo78099c(C28887i1.f116930z) ? (C23465k) interfaceC26398o2.mo78097a(new C23465k(null, c26396m), C28866b1.f116825Q) : new C23465k(null, interfaceC26398o2);
                C27594b c27594b = (C27594b) c23465k2.f92937w;
                InterfaceC26398o interfaceC26398o3 = (InterfaceC26398o) c23465k2.f92938x;
                arrayList.add(c27594b);
                if (c27594b != null) {
                    C26384a c26384a = new C26384a(R.drawable.glance_ripple);
                    c26393j2 = new C26393j();
                    c26393j2.f104844a = AbstractC32072d.m99702k(c26396m);
                    c26393j2.f104845b = c26384a;
                } else {
                    c26393j2 = null;
                }
                if (interfaceC26398o3.mo78099c(new C28884h1(i14))) {
                    int i17 = 3;
                    c28933y = (C28933y) interfaceC26398o3.mo78097a(new C28933y(interfaceC26398o, i17), new C28557w0(i17));
                } else {
                    c28933y = new C28933y(interfaceC26398o3, true ? 1 : 0);
                }
                InterfaceC26398o interfaceC26398o4 = c28933y.f117064a;
                InterfaceC26398o interfaceC26398o5 = c28933y.f117065b;
                arrayList.add(interfaceC26398o4);
                arrayList2.add(AbstractC32072d.m99702k(interfaceC26398o5));
                C35721j c35721j = new C35721j();
                c35721j.f151962c = AbstractC3269g.m9507n(arrayList);
                interfaceC26392i.mo78104b(AbstractC3269g.m9507n(arrayList2));
                ArrayList arrayList3 = c35721j.f104849b;
                if (c26393j != null) {
                    arrayList3.add(c26393j);
                }
                arrayList3.add(interfaceC26392i);
                if (c26393j2 != null) {
                    arrayList3.add(c26393j2);
                }
                return c35721j;
            default:
                InterfaceC26397n interfaceC26397n = (InterfaceC26397n) obj;
                if (!(interfaceC26397n instanceof C26387d) && !(interfaceC26397n instanceof C27594b)) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
        }
    }

    public /* synthetic */ C28402f(C39173e c39173e) {
        this.f114602w = 18;
    }
}
