package jp1;

import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import com.whoop.aiinsights.AiInsightsFragment;
import com.whoop.design.util.TextResource;
import com.whoop.p069ui.home.HomeAuthWebViewFragment;
import com.whoop.payments.domain.models.Card;
import com.whoop.user.journey.view.UserJourneyFragment;
import com.whoop.widget.p071ui.healthspan.HealthspanWidgetLockedContentViewState;
import com.whoop.widget.p071ui.healthspan.HealthspanWidgetViewState;
import dp0.InterfaceC12251g;
import g40.C15454z1;
import g40.InterfaceC15391m3;
import hp1.C17550j;
import io.sentry.config.AbstractC20301a;
import iw1.InterfaceC20996b;
import j02.C21148j;
import java.util.List;
import jx1.C22014f;
import kd1.AbstractC22390d;
import kw1.AbstractC22853d;
import l03.C23058h;
import l83.C23454a0;
import lg2.AbstractC24038c;
import lg2.C24037b;
import lo0.C24575d0;
import lw2.C24778c;
import mf0.AbstractC25506e;
import mm1.C25697k;
import mq2.C25889b;
import mx1.AbstractC26007m;
import n00.C26075c;
import no0.AbstractC26958l0;
import nv1.AbstractC27169c;
import nv1.C27174h;
import ow2.AbstractC28443f;
import p11.AbstractC28704e;
import p133f1.C13977s1;
import p292l1.InterfaceC23098g1;
import p31.AbstractC28795f;
import p31.C28797h;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p460rg.AbstractC31366a;
import p510u0.AbstractC34339n0;
import p602x1.C37816b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p730qt2.AbstractC30618x;
import p730qt2.C30616v;
import q00.EnumC29733p;
import rm1.AbstractC31599m;
import rm1.C31587a;
import rs2.AbstractC31797c;
import sc3.AbstractC32398l;
import se.AbstractC32411b;
import se.AbstractC32417h;
import t10.AbstractC33295o;
import t10.C33290j;
import t71.AbstractC33580q;
import t71.C33569f;
import tu1.AbstractC34193f;
import tu1.C34194g;
import u10.AbstractC34428p;
import u10.C34429q;
import uh0.C34964b;
import v20.C35579s;
import v20.EnumC35561a;
import v21.AbstractC35584b;
import v21.C35585c;

/* JADX INFO: renamed from: jp1.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21859k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84433w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f84434x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f84435y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f84436z;

    public /* synthetic */ C21859k(Object obj, Object obj2, Object obj3, int i13) {
        this.f84433w = i13;
        this.f84435y = obj;
        this.f84434x = obj2;
        this.f84436z = obj3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f84433w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f84436z;
        Object obj4 = this.f84434x;
        Object obj5 = this.f84435y;
        switch (i13) {
            case 0:
                return AbstractC21861m.m61922n((C17550j) obj5, (InterfaceC28601c1) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC22390d.m64428t((InterfaceC4339a) obj5, (InterfaceC28601c1) obj4, (C21148j) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return UserJourneyFragment.m27778d0((InterfaceC28670t2) obj5, (UserJourneyFragment) obj4, (C25889b) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC22853d.m66306S((InterfaceC20996b.c) obj5, (Function1) obj3, (InterfaceC28601c1) obj4, ((Boolean) obj).booleanValue(), (Card) obj2);
            case 4:
                return C23058h.m67020M((Context) obj5, (HealthspanWidgetLockedContentViewState) obj4, (Integer) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return C23058h.m67016I((HealthspanWidgetViewState) obj5, (Context) obj4, (Integer) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC24038c.m70925l((InterfaceC28601c1) obj4, (Function1) obj3, (C24037b) obj5, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC25506e.m74955j0((InterfaceC4339a) obj5, (InterfaceC4339a) obj4, (InterfaceC23098g1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC26007m.m77219K((InterfaceC4339a) obj5, (C22014f) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                ((Integer) obj2).getClass();
                AbstractC32411b.m101102n((C15454z1) obj5, (InterfaceC15391m3) obj4, (C26075c) obj3, (Composer) obj, AbstractC28683x.m87244L(9));
                return c23454a0;
            case 10:
                return AbstractC26958l0.m80634a0((C24575d0) obj5, (Long) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return AbstractC27169c.m81709v((C27174h) obj5, (C2886a) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return AbstractC28443f.m86198s((C24778c) obj5, (Function1) obj3, (Function1) obj4, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return AbstractC28704e.m87322s((InterfaceC4339a) obj5, (C37816b) obj4, (InterfaceC4351m) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC28795f.m87573u((C28797h) obj5, (Modifier) obj4, (InterfaceC4339a) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AiInsightsFragment.m17851S((AiInsightsFragment) obj5, (C34964b) obj4, (InterfaceC28670t2) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                ((Integer) obj2).getClass();
                AbstractC20301a.m56328a((Modifier) obj5, (List) obj4, (Function1) obj3, (Composer) obj, AbstractC28683x.m87244L(7));
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                AbstractC32417h.m101203l((InterfaceC41211c) obj5, (EnumC29733p) obj4, (Modifier) obj3, (Composer) obj, AbstractC28683x.m87244L(433));
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC30618x.m93999i((C30616v) obj5, (String) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC31599m.m97488B((C25697k) obj5, (C31587a) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return AbstractC31797c.m98763E((InterfaceC2994c0) obj5, (InterfaceC12251g) obj4, (InterfaceC4351m) obj3, obj, ((Integer) obj2).intValue());
            case 21:
                return HomeAuthWebViewFragment.m27228L((String) obj5, (HomeAuthWebViewFragment) obj4, (C21148j) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                AbstractC33295o.m105604b((C33290j) obj5, (InterfaceC4339a) obj4, (InterfaceC4339a) obj3, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC33580q.m106070d((Modifier) obj5, (C33569f) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC34193f.m108054r((C34194g) obj5, (Function1) obj3, (Function1) obj4, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                ((Integer) obj2).getClass();
                AbstractC34339n0.m108627e((Modifier) obj5, (C13977s1) obj4, (C37816b) obj3, (Composer) obj, AbstractC28683x.m87244L(385));
                return c23454a0;
            case 26:
                ((Integer) obj2).getClass();
                int i14 = ManageActivity.f22343G;
                ((ManageActivity) obj5).m16853o((C34429q) obj4, (AbstractC34428p) obj3, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 27:
                ((Integer) obj2).getClass();
                AbstractC32398l.m100969b((EnumC35561a) obj5, (String) obj4, (InterfaceC4339a) obj3, (Composer) obj, AbstractC28683x.m87244L(7));
                return c23454a0;
            case 28:
                ((Integer) obj2).getClass();
                AbstractC31366a.m96463c((C35579s) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            default:
                return AbstractC35584b.m112783j((C35585c) obj5, (TextResource) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C21859k(Object obj, Object obj2, Object obj3, int i13, int i14) {
        this.f84433w = i14;
        this.f84435y = obj;
        this.f84434x = obj2;
        this.f84436z = obj3;
    }

    public /* synthetic */ C21859k(Object obj, Function1 function1, Object obj2, int i13) {
        this.f84433w = i13;
        this.f84435y = obj;
        this.f84436z = function1;
        this.f84434x = obj2;
    }

    public /* synthetic */ C21859k(InterfaceC28601c1 interfaceC28601c1, Function1 function1, C24037b c24037b) {
        this.f84433w = 6;
        this.f84434x = interfaceC28601c1;
        this.f84436z = function1;
        this.f84435y = c24037b;
    }

    public /* synthetic */ C21859k(C35579s c35579s, Function1 function1, Modifier modifier, int i13) {
        this.f84433w = 28;
        this.f84435y = c35579s;
        this.f84436z = function1;
        this.f84434x = modifier;
    }
}
