package nq0;

import ad3.AbstractC0757c;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import c31.EnumC3919c;
import c41.C4014e1;
import c93.InterfaceC4351m;
import com.whoop.core.details.view.AbstractC6470a;
import com.whoop.core.details.view.CoreDetailsFragment;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment;
import com.whoop.navigation.AppScreen;
import com.whoop.realtime.presentation.AbstractC9879c;
import com.whoop.realtime.presentation.C9880d;
import com.whoop.realtime.presentation.RealTimeFinishPromptActivity;
import com.whoop.stress.view.StressMonitorFragment;
import ec3.C13045h2;
import ew0.AbstractC13720a;
import ew0.C13721b;
import gm.C15990r;
import hw0.InterfaceC17699d;
import i11.C17863f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import lf2.C24011d;
import lj2.C24477c;
import lq1.C24663c;
import m62.C25115f;
import m62.InterfaceC25116g;
import mp1.C25869b;
import np1.AbstractC27032j;
import np2.C27036c;
import nt1.InterfaceC27125d;
import o11.AbstractC27401g;
import o51.AbstractC27537c;
import oa2.C27753a;
import of2.AbstractC27897a;
import oq1.AbstractC28120d;
import ot2.C28351t;
import ou0.C28373d;
import ou0.C28375f;
import p042c2.C3856a;
import p042c2.C3867l;
import p042c2.InterfaceC3863h;
import p077d0.C11335b2;
import p12.AbstractC28734x;
import p12.C28714e;
import p151fn.C14618f;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p294l3.C23254g;
import p329n0.InterfaceC26064q;
import p353o0.C27319c;
import p353o0.C27328l;
import p353o0.C27329m;
import p353o0.C27338v;
import p389p0.C28559x0;
import p390p1.C28688y1;
import p390p1.EnumC28681w1;
import p390p1.InterfaceC28601c1;
import p500tb.InterfaceC33687a;
import p505ts.AbstractC34132o;
import p62.AbstractC28941b;
import p62.AbstractC28948i;
import p634y1.InterfaceC39030c;
import p634y1.InterfaceC39033f;
import p635y2.AbstractC39101i1;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p92.C29016e;
import pa2.AbstractC29037a;
import pf.AbstractC29125c;
import pp1.AbstractC29436i;
import pp2.AbstractC29450n;
import pt2.AbstractC29517a0;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: nq0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C27050m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f108147w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f108148x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f108149y;

    public /* synthetic */ C27050m(int i13, Object obj, Object obj2) {
        this.f108147w = i13;
        this.f108148x = obj;
        this.f108149y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM107888l;
        switch (this.f108147w) {
            case 0:
                return C27051n.m81269c((Function1) this.f108148x, (TeamInviteDto) this.f108149y, (View) obj);
            case 1:
                C15990r c15990r = (C15990r) this.f108148x;
                InterfaceC37138c interfaceC37138c = (InterfaceC37138c) this.f108149y;
                String body = (String) obj;
                AbstractC22676k.m65750j(body, "body");
                try {
                    objM107888l = ((AbstractC0757c) c15990r.f60513y).m1831b(interfaceC37138c, body);
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                return new C23468n(objM107888l);
            case 2:
                C27338v c27338v = (C27338v) this.f108148x;
                C27329m c27329m = (C27329m) this.f108149y;
                C14618f c14618fM82477b = c27338v.m82477b(((Integer) obj).intValue());
                int i13 = c14618fM82477b.f53875a;
                List list = c14618fM82477b.f53876b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i14 = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    int i16 = (int) ((C27319c) list.get(i15)).f109387a;
                    arrayList.add(new C23465k(Integer.valueOf(i13), new C39169a(c27329m.m82469a(i14, i16))));
                    i13++;
                    i14 += i16;
                }
                return arrayList;
            case 3:
                C27329m c27329m2 = (C27329m) this.f108148x;
                C27328l c27328l = (C27328l) this.f108149y;
                int iIntValue = ((Integer) obj).intValue();
                C27338v c27338v2 = c27329m2.f109417e;
                int i17 = c27338v2.f109488i;
                int iM82480e = c27338v2.m82480e(iIntValue);
                return c27328l.m82468Q(iIntValue, 0, iM82480e, c27329m2.m82469a(0, iM82480e), c27328l.f109405E);
            case 4:
                return AbstractC27401g.m82597w((Function1) this.f108148x, this.f108149y, obj);
            case 5:
                return AbstractC27537c.m83069o((Function1) this.f108148x, (C17863f) this.f108149y, obj);
            case 6:
                return C9880d.m24020c((C9880d) this.f108148x, (AbstractC9879c) this.f108149y, (View) obj);
            case 7:
                return RealTimeFinishPromptActivity.m23734d0((RealTimeFinishPromptActivity) this.f108148x, (C29016e) this.f108149y, (List) obj);
            case 8:
                return AbstractC27897a.m84188j((C24011d) this.f108149y, (Function1) this.f108148x, (InterfaceC26064q) obj);
            case 9:
                return AbstractC28120d.m85046p((C24663c) this.f108149y, (Function1) this.f108148x, (InterfaceC26064q) obj);
            case 10:
                return p725ot1.Function1.m85839z((Function1) this.f108148x, (InterfaceC27125d.b) this.f108149y, ((Boolean) obj).booleanValue());
            case 11:
                return ((C28373d) this.f108148x).m86053o((List) this.f108149y, (InterfaceC33687a) obj);
            case 12:
                return ((C28375f) this.f108148x).m86070o((List) this.f108149y, (InterfaceC33687a) obj);
            case 13:
                return CoreDetailsFragment.m19762L((CoreDetailsFragment) this.f108148x, (C13721b) this.f108149y, (AbstractC13720a) obj);
            case 14:
                return AbstractC6470a.m19815z((Function1) this.f108148x, (InterfaceC17699d.b) this.f108149y, (String) obj);
            case 15:
                C28559x0 c28559x0 = (C28559x0) this.f108148x;
                Object obj2 = this.f108149y;
                c28559x0.f115545y.m144i(obj2);
                return new C11335b2(3, c28559x0, obj2);
            case 16:
                return new C28559x0((InterfaceC39033f) this.f108148x, (Map) obj, (InterfaceC39030c) this.f108149y);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C28688y1 c28688y1 = (C28688y1) this.f108148x;
                Throwable th4 = (Throwable) this.f108149y;
                Throwable th5 = (Throwable) obj;
                synchronized (c28688y1.f116037c) {
                    if (th4 == null) {
                        th4 = null;
                    } else if (th5 != null) {
                        try {
                            if (th5 instanceof CancellationException) {
                                th5 = null;
                            }
                            if (th5 != null) {
                                AbstractC29125c.m88530g(th4, th5);
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    c28688y1.f116039e = th4;
                    C13045h2 c13045h2 = c28688y1.f116055u;
                    EnumC28681w1 enumC28681w1 = EnumC28681w1.f116014w;
                    c13045h2.getClass();
                    c13045h2.m36571k(null, enumC28681w1);
                }
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC28734x.m87427g0((Function1) this.f108148x, (C28714e) this.f108149y, (EnumC3919c) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C3867l c3867l = (C3867l) this.f108148x;
                InterfaceC3863h interfaceC3863h = (InterfaceC3863h) this.f108149y;
                InterfaceC15250v focusState = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(focusState, "focusState");
                if (c3867l.f15801b != null && interfaceC3863h != null) {
                    if (((EnumC15251w) focusState).m43354b()) {
                        ((C3856a) interfaceC3863h).m11843a(c3867l);
                    } else {
                        C3856a c3856a = (C3856a) interfaceC3863h;
                        c3856a.f15780c.notifyViewExited(c3856a.f15778a, c3867l.m11853b());
                    }
                }
                return C23454a0.f92919a;
            case 20:
                Function1 function1 = (Function1) this.f108148x;
                C23254g c23254g = (C23254g) this.f108149y;
                int iIntValue2 = ((Integer) obj).intValue();
                function1.invoke(c23254g.m67316c(iIntValue2, iIntValue2, AppScreen.URLScreen.NAME));
                return C23454a0.f92919a;
            case 21:
                return AbstractC28941b.m87863j((Function1) this.f108148x, (C25115f) this.f108149y, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC28948i.m87904h((InterfaceC25116g.e) this.f108149y, (Function1) this.f108148x, (InterfaceC26064q) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC29037a.m88281l((C27753a) this.f108148x, (InterfaceC4351m) this.f108149y, obj);
            case 24:
                return StressMonitorFragment.m26416R((StressMonitorFragment) this.f108148x, (C24477c) this.f108149y, obj);
            case 25:
                return PregnancyInsightsFragment.m22148S((PregnancyInsightsFragment) this.f108148x, (C25869b) this.f108149y, obj);
            case 26:
                return AbstractC29436i.m89709A0((Function1) this.f108148x, (AbstractC27032j.g) this.f108149y, obj);
            case 27:
                return AbstractC29450n.m89897k((C27036c.d) this.f108149y, (Function1) this.f108148x, (InterfaceC26064q) obj);
            case 28:
                return AbstractC29517a0.m90209o((Function1) this.f108148x, (C28351t) this.f108149y, obj);
            default:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f108148x;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                C4014e1 c4014e1 = new C4014e1((ArrayList) this.f108149y, 3);
                abstractC39101i1.f168198w = true;
                c4014e1.invoke(abstractC39101i1);
                abstractC39101i1.f168198w = false;
                interfaceC28601c1.getValue();
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C27050m(Object obj, Function1 function1, int i13) {
        this.f108147w = i13;
        this.f108149y = obj;
        this.f108148x = function1;
    }
}
