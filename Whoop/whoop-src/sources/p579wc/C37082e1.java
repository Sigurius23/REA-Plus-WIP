package p579wc;

import al1.C0982c;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.icu.text.NumberFormat;
import android.text.Editable;
import android.view.textclassifier.TextClassification;
import androidx.health.platform.client.proto.C1533u;
import b30.C2591o4;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cf.AbstractC4530e;
import cf.AbstractC4537l;
import com.whoop.community.CommunityAddMemberFragment;
import com.whoop.community.CommunityManageTeamFragment;
import com.whoop.community.CommunityRemoveMembersFragment;
import com.whoop.navigation.AppScreen;
import gf.InterfaceC15761b;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import l21.C23239c;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ld1.AbstractC23864c;
import m83.AbstractC25265s;
import mg.InterfaceC25526h;
import p023ay.C2140n;
import p027b3.C2368e1;
import p027b3.InterfaceC2355b3;
import p114eb.C12987s0;
import p162g0.AbstractC14925b;
import p162g0.C14927d;
import p181h2.C16617b;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23277r0;
import p329n0.InterfaceC26064q;
import p390p1.C28621h1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p395p6.C28894l;
import p409q0.C29674b;
import p421qd.C30290e;
import p601x0.AbstractC37791b;
import p601x0.C37792c;
import p601x0.C37793d;
import p601x0.C37795f;
import p601x0.C37797h;
import p601x0.InterfaceC37796g;
import p602x1.C37816b;
import p605x6.C37998c;
import p605x6.C37999d;
import p605x6.C38015t;
import p605x6.C38017v;
import p605x6.InterfaceC38016u;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p646yd.AbstractC39453d;
import p664yy.C39850b0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.time.Duration;
import p748zc1.AbstractC40313e4;
import p748zc1.C40324f4;
import qh0.C30365b;
import so1.C32804b;
import up2.C35155b;
import vf1.C35946a;
import vf1.C35948c;
import vh0.AbstractC36042c;
import vp2.InterfaceC36274a;
import w22.C36740a;
import w22.C36742c;
import w50.C36834a;
import wb0.C37035f;
import wf1.InterfaceC37243a;
import wi0.AbstractC37313e;
import wo1.AbstractC37456k;
import wo1.AbstractC37471t;
import wo2.C37479b;
import wr0.AbstractC37552s;
import wr0.C37554t;
import wt2.AbstractC37625f;
import wt2.AbstractC37636q;
import x22.InterfaceC37862a;
import x50.C37987b;
import x50.InterfaceC37986a;
import xh0.AbstractC38307c;
import xo2.InterfaceC38495a;
import xp2.AbstractC38538g;
import yb0.AbstractC39384g;
import yb0.AbstractC39388k;
import yf1.AbstractC39519h;
import yl0.AbstractC39619b;
import yl0.AbstractC39631n;
import yl0.C39620c;
import yo1.C39689b;
import yt2.AbstractC39772c;
import yt2.AbstractC39782m;
import yv2.C39809c;
import yv2.EnumC39807a;
import z22.AbstractC40030i;
import z50.AbstractC40089e;
import zk1.AbstractC40837a;
import zk1.C40839c;
import zk2.AbstractC40844e;
import zo2.AbstractC40936g;
import zv2.AbstractC41172h;

/* JADX INFO: renamed from: wc.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C37082e1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158636w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f158637x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f158638y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f158639z;

    public /* synthetic */ C37082e1(Object obj, Object obj2, Object obj3, int i13) {
        this.f158636w = i13;
        this.f158637x = obj;
        this.f158638y = obj2;
        this.f158639z = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.util.List] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f158636w) {
            case 0:
                C37091h1 c37091h1 = (C37091h1) this.f158637x;
                InterfaceC25526h interfaceC25526h = (InterfaceC25526h) this.f158638y;
                InterfaceC15761b interfaceC15761b = (InterfaceC15761b) this.f158639z;
                C30290e fromEnvironment = (C30290e) obj;
                AbstractC22676k.m65750j(fromEnvironment, "$this$fromEnvironment");
                fromEnvironment.f123868d = c37091h1.f158676x;
                fromEnvironment.f123865a.m133455G(c37091h1.f158678z);
                fromEnvironment.f123875k = interfaceC25526h;
                fromEnvironment.f123874j = (AbstractC4530e) interfaceC15761b.mo33082b(AbstractC4537l.f18271d);
                fromEnvironment.f123878n = (String) interfaceC15761b.mo33082b(AbstractC39453d.f169734a);
                return C23454a0.f92919a;
            case 1:
                return AbstractC37313e.m119502L((List) this.f158637x, (Function1) this.f158638y, (Function1) this.f158639z, (InterfaceC26064q) obj);
            case 2:
                return AbstractC37456k.m119978o((InterfaceC39171c) this.f158637x, (InterfaceC28601c1) this.f158638y, (InterfaceC28601c1) this.f158639z, (InterfaceC39147y) obj);
            case 3:
                return AbstractC37471t.m120139q((C32804b) this.f158637x, (InterfaceC28593a1) this.f158638y, (Function1) this.f158639z, obj);
            case 4:
                return AbstractC37471t.m120140r(120, (C28621h1) this.f158637x, (C32804b) this.f158638y, (InterfaceC4351m) this.f158639z, ((Integer) obj).intValue());
            case 5:
                return AbstractC37552s.m120464q((C37554t) this.f158637x, (InterfaceC28601c1) this.f158638y, (Function1) this.f158639z, (String) obj);
            case 6:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f158637x;
                C23254g c23254g = (C23254g) this.f158638y;
                InterfaceC2355b3 interfaceC2355b3 = (InterfaceC2355b3) this.f158639z;
                C16617b c16617b = (C16617b) obj;
                C23277r0 c23277r0 = (C23277r0) interfaceC28601c1.getValue();
                if (c23277r0 != null) {
                    int iM67377g = c23277r0.f92228b.m67377g(c16617b.f63937a);
                    C23250e c23250e = (C23250e) AbstractC25265s.m74100H0(c23254g.m67315b(iM67377g, iM67377g));
                    if (c23250e != null && AbstractC22676k.m65745e(c23250e.f92128d, AppScreen.URLScreen.NAME)) {
                        ((C2368e1) interfaceC2355b3).m7301a((String) c23250e.f92125a);
                    }
                }
                return C23454a0.f92919a;
            case 7:
                InterfaceC38016u interfaceC38016u = (InterfaceC38016u) this.f158637x;
                C38015t c38015t = (C38015t) this.f158638y;
                C37999d c37999d = (C37999d) this.f158639z;
                C38017v c38017v = (C38017v) interfaceC38016u;
                if (Duration.m134261compareToLRDsOJo(c38017v.m121746a(), c38015t.f162839b) < 0) {
                    long j7 = c38015t.f162839b;
                    AtomicReference atomicReference = c38017v.f162845x;
                    while (true) {
                        Object obj2 = atomicReference.get();
                        Long l7 = (Long) obj2;
                        if (l7 == null) {
                            throw new IllegalStateException("Start the timer with startTimer before calling addTime");
                        }
                        if (!Duration.m134289isPositiveimpl(j7)) {
                            throw new IllegalArgumentException("Cannot call addTime with a negative duration");
                        }
                        Long lValueOf = Long.valueOf(Duration.m134273getInWholeMillisecondsimpl(j7) + l7.longValue());
                        do {
                            if (atomicReference.compareAndSet(obj2, lValueOf)) {
                            }
                        } while (atomicReference.get() == obj2);
                    }
                }
                AbstractC3006f0.m8732z(c38017v, null, null, new C37998c(c37999d, null, 1), 3);
                return C23454a0.f92919a;
            case 8:
                return AbstractC38307c.m122699D((AbstractC36042c.f) this.f158637x, (Function1) this.f158638y, (C30365b) this.f158639z, (InterfaceC26064q) obj);
            case 9:
                return CommunityAddMemberFragment.m18810W((C22669g0) this.f158637x, (CommunityAddMemberFragment) this.f158638y, (Function1) this.f158639z, (Editable) obj);
            case 10:
                return CommunityManageTeamFragment.m19061i0((C22669g0) this.f158637x, (CommunityManageTeamFragment) this.f158638y, (Function1) this.f158639z, (Editable) obj);
            case 11:
                return CommunityRemoveMembersFragment.m19126V((C22669g0) this.f158637x, (CommunityRemoveMembersFragment) this.f158638y, (Function1) this.f158639z, (Editable) obj);
            case 12:
                return AbstractC38538g.m123492p((C35155b) this.f158637x, (InterfaceC23462h) this.f158638y, (InterfaceC23462h) this.f158639z, (InterfaceC36274a) obj);
            case 13:
                return AbstractC39384g.m125639x((NumberFormat) this.f158637x, (InterfaceC28601c1) this.f158638y, (InterfaceC28601c1) this.f158639z, (String) obj);
            case 14:
                return AbstractC39388k.m125667M0((C37035f) this.f158637x, (Function1) this.f158638y, (InterfaceC28601c1) this.f158639z, (C37035f) obj);
            case 15:
                return AbstractC39519h.m126226i((C35946a) this.f158637x, (C35948c) this.f158638y, (InterfaceC23462h) this.f158639z, (InterfaceC37243a) obj);
            case 16:
                return AbstractC39619b.m126614o((C39620c) this.f158637x, (Locale) this.f158638y, (InterfaceC28601c1) this.f158639z, (String) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC39631n.m126676i((AbstractC23864c) this.f158637x, (C23239c) this.f158638y, (Function1) this.f158639z, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39772c.m127321A((AbstractC37625f) this.f158637x, (Function1) this.f158638y, (InterfaceC4339a) this.f158639z, (InterfaceC26064q) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC39782m.m127445U((AbstractC37636q.c) this.f158637x, (Function1) this.f158638y, (InterfaceC28601c1) this.f158639z, obj);
            case 20:
                C37792c c37792c = (C37792c) this.f158637x;
                Context context = (Context) this.f158638y;
                InterfaceC37796g interfaceC37796g = (InterfaceC37796g) this.f158639z;
                C14927d c14927d = (C14927d) obj;
                ?? r10 = c37792c.f161892a;
                int size = ((Collection) r10).size();
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC37791b abstractC37791b = (AbstractC37791b) r10.get(i13);
                    if (abstractC37791b instanceof C37793d) {
                        C37793d c37793d = (C37793d) abstractC37791b;
                        C14927d.m43021b(c14927d, new C2140n(c37793d, 11), c37793d.f161894c != 0 ? new C37816b(new C2591o4(c37793d, 17), true, -1930700965) : null, new C39689b(8, c37793d, interfaceC37796g), 6);
                    } else if (abstractC37791b instanceof C37797h) {
                        C37797h c37797h = (C37797h) abstractC37791b;
                        if (context != null) {
                            int i14 = c37797h.f161903c;
                            TextClassification textClassification = c37797h.f161902b;
                            if (i14 < 0) {
                                C2140n c2140n = new C2140n(textClassification, 12);
                                Drawable icon = textClassification.getIcon();
                                C14927d.m43021b(c14927d, c2140n, icon != null ? new C37816b(new C2591o4(icon, 18), true, -1123224187) : null, new C39689b(10, context, textClassification), 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i14);
                                C14927d.m43021b(c14927d, new C2140n(remoteAction, 13), ((i14 == 0) || remoteAction.shouldShowIcon()) ? new C37816b(new C2591o4(remoteAction, 19), true, -1261173016) : null, new C39850b0(remoteAction, 3), 6);
                            }
                        }
                    } else if (abstractC37791b instanceof C37795f) {
                        c14927d.f55628a.add(AbstractC14925b.f55622a);
                    }
                }
                return C23454a0.f92919a;
            case 21:
                return AbstractC40030i.m128355j((C36740a) this.f158637x, (C36742c) this.f158638y, (InterfaceC23462h) this.f158639z, (InterfaceC37862a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40089e.m128515h((C37987b) this.f158637x, (C36834a) this.f158638y, (Function1) this.f158639z, (InterfaceC37986a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40313e4.m129651o((InterfaceC28601c1) this.f158637x, (InterfaceC28601c1) this.f158638y, (C40324f4) this.f158639z, ((Boolean) obj).booleanValue());
            case 24:
                return AbstractC40837a.m132339k((C0982c) this.f158637x, (C40839c) this.f158638y, (Function1) this.f158639z, (C12987s0) obj);
            case 25:
                return AbstractC40844e.m132364i((List) this.f158637x, (C29674b) this.f158638y, (InterfaceC2994c0) this.f158639z, (String) obj);
            case 26:
                return AbstractC40936g.m132842s((C37479b) this.f158637x, (InterfaceC23462h) this.f158638y, (InterfaceC23462h) this.f158639z, (InterfaceC38495a) obj);
            default:
                return AbstractC41172h.m133781B((Function1) this.f158637x, (C39809c) this.f158638y, (EnumC39807a) this.f158639z, ((Integer) obj).intValue());
        }
    }

    public /* synthetic */ C37082e1(InterfaceC38016u interfaceC38016u, C38015t c38015t, C28894l c28894l, C37999d c37999d) {
        this.f158636w = 7;
        this.f158637x = interfaceC38016u;
        this.f158638y = c38015t;
        this.f158639z = c37999d;
    }
}
