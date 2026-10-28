package p000;

import a42.C0378a;
import a80.AbstractC0549m;
import am2.AbstractC1035o0;
import am2.C1037p0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1615p0;
import aq1.AbstractC1912f;
import az1.AbstractC2166g;
import b41.AbstractC2715d;
import b41.C2717f;
import b62.C2761b;
import bc0.AbstractC2980c;
import bg0.AbstractC3227i;
import bp0.AbstractC3531s;
import bs1.AbstractC3583c0;
import bt1.C3625f;
import c31.EnumC3919c;
import c42.C4181r;
import c51.AbstractC4234k;
import c51.C4242s;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import com.whoop.bot.settings.CoachSettingsCoachingModeKt;
import com.whoop.bot.settings.CoachSettingsConcisenessContentKt;
import com.whoop.bot.settings.CoachingMode;
import com.whoop.bot.settings.ConcisenessMode;
import com.whoop.data.remote.commons.ApiResponse;
import com.whoop.helpcenter.view.fragment.HelpCenterFragment;
import com.whoop.labrador.fragment.LabradorEligibilityFragment;
import com.whoop.navigation.AiAction;
import com.whoop.pregnancy.view.PregnancySettingsFragment;
import com.whoop.profile.presentation.edit.BirthdayContentKt;
import com.whoop.profile.view.edit.CountrySelectionContentKt;
import cp0.AbstractC11009x0;
import cp1.C11014a;
import cq0.AbstractC11057e;
import d21.C11504b;
import d21.C11505c;
import d30.C11514a;
import d62.AbstractC11737c;
import dc0.AbstractC11903e;
import dp0.InterfaceC12251g;
import ds1.C12341k;
import du1.C12375a;
import e30.AbstractC12605c;
import ec.InterfaceC13008a;
import ep1.AbstractC13408c;
import f31.C14044a;
import h00.C16491a0;
import java.util.List;
import kotlin.AbstractC2016m;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import lv0.AbstractC24758a;
import mf0.AbstractC25502a;
import nt1.InterfaceC27122a;
import nv0.EnumC27166d;
import p003a1.C0103b;
import p023ay.C2128c0;
import p023ay.InterfaceC2135i;
import p028b4.AbstractC2703n;
import p114eb.AbstractC12939a0;
import p114eb.C12987s0;
import p163g1.EnumC14960b2;
import p208i2.AbstractC17911t;
import p208i2.InterfaceC17910s0;
import p270k2.InterfaceC22129c;
import p292l1.InterfaceC23098g1;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p482s7.AbstractC32237a;
import p602x1.C37816b;
import p636y3.C39180l;
import p698au1.AbstractC2072q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import pv0.C29577d;
import ss1.C32948a;
import v00.C35459c0;
import wy1.C37695b;
import x70.C38036a;
import x70.C38038c;
import y70.InterfaceC39265a;
import yf0.C39509a;
import yf0.C39511c;
import yp1.AbstractC39703b;
import ys2.AbstractC39758e;
import zf0.InterfaceC40609a;
import zk1.C40839c;
import zt1.InterfaceC41128c;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29656q implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121210w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f121211x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f121212y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f121213z;

    public /* synthetic */ C29656q(Object obj, Object obj2, Object obj3, int i13) {
        this.f121210w = i13;
        this.f121211x = obj;
        this.f121212y = obj2;
        this.f121213z = obj3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC1329o1 childFragmentManager;
        switch (this.f121210w) {
            case 0:
                C29577d c29577d = (C29577d) this.f121211x;
                C29577d c29577d2 = (C29577d) this.f121212y;
                Function1 function1 = (Function1) this.f121213z;
                InterfaceC26064q LazyColumn = (InterfaceC26064q) obj;
                AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
                List<InterfaceC25312u> listM90683l = c29577d.m90683l();
                ((C26053f) LazyColumn).m77529r(listM90683l.size(), null, new C31931s(listM90683l, 0), new C37816b(new C16491a0(listM90683l, function1, 2), true, 802480018));
                if (c29577d.getPaginationState() == EnumC27166d.FETCHING_NEXT_PAGE) {
                    InterfaceC26064q.m77556b(LazyColumn, null, AbstractC14893g.f55561a, 3);
                }
                if (c29577d.getPaginationState() == EnumC27166d.FETCH_NEXT_PAGE_ERROR) {
                    InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C22931l(0, c29577d, function1), true, 66377953), 3);
                }
                if (c29577d.m90683l().isEmpty() && !c29577d2.getIsContentListLoading()) {
                    function1.invoke(new AbstractC24758a.d(String.valueOf(c29577d2.getSelectedFilter()), null, null, c29577d2.getSearchQuery().toString(), 6, null));
                }
                return C23454a0.f92919a;
            case 1:
                return AbstractC0549m.m1367i((C38036a) this.f121211x, (C38038c) this.f121212y, (InterfaceC23462h) this.f121213z, (InterfaceC39265a) obj);
            case 2:
                return AbstractC1035o0.m2812B0((Function1) this.f121213z, (Function1) this.f121211x, (C1037p0) this.f121212y, obj);
            case 3:
                return AbstractC1912f.m5868x((AbstractC39703b.c) this.f121211x, (Function1) this.f121213z, (Function1) this.f121212y, ((Integer) obj).intValue());
            case 4:
                return AbstractC2016m.m6226M((AbstractC39758e) this.f121211x, (Function1) this.f121213z, (Function1) this.f121212y, (C12987s0) obj);
            case 5:
                return AbstractC2072q.m6553w((InterfaceC41128c.c) this.f121211x, (Function1) this.f121213z, (Function1) this.f121212y, (InterfaceC26064q) obj);
            case 6:
                Function1 function2 = (Function1) this.f121213z;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f121211x;
                InterfaceC2135i handler = (InterfaceC2135i) this.f121212y;
                Context context = (Context) obj;
                AbstractC22676k.m65750j(context, "context");
                C2128c0 c2128c0 = (C2128c0) function2.invoke(context);
                c2128c0.setWebViewClient((WebViewClient) interfaceC4339a.invoke());
                AbstractC22676k.m65750j(handler, "handler");
                c2128c0.addJavascriptInterface(handler, "Android");
                c2128c0.loadUrl("https://b.stripecdn.com/mobile-confirmation-challenge/assets/index.html?v=1");
                return c2128c0;
            case 7:
                return AbstractC2166g.m6743F((Function1) this.f121213z, (C37695b) this.f121211x, (String) this.f121212y, (EnumC3919c) obj);
            case 8:
                AbstractC12605c abstractC12605c = (AbstractC12605c) this.f121211x;
                C35459c0 c35459c0 = (C35459c0) this.f121212y;
                C11514a c11514a = (C11514a) this.f121213z;
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                return AbstractC32237a.m100289c(abstractC12605c, c35459c0, it, c11514a);
            case 9:
                Function1 function3 = (Function1) this.f121213z;
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.f121211x;
                Context context2 = (Context) this.f121212y;
                View view = (View) obj;
                Object tag = view.getTag(R.id.binding_reference);
                AbstractC22676k.m65748h(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
                function3.invoke((InterfaceC13008a) tag);
                AbstractC1329o1 supportFragmentManager = null;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    if (abstractComponentCallbacksC1320m0 == null || (childFragmentManager = abstractComponentCallbacksC1320m0.getChildFragmentManager()) == null) {
                        AbstractActivityC1340r0 abstractActivityC1340r0 = context2 instanceof AbstractActivityC1340r0 ? (AbstractActivityC1340r0) context2 : null;
                        if (abstractActivityC1340r0 != null) {
                            supportFragmentManager = abstractActivityC1340r0.getSupportFragmentManager();
                        }
                    } else {
                        supportFragmentManager = childFragmentManager;
                    }
                    AbstractC2703n.m7591j(viewGroup, new C0103b(supportFragmentManager, 18));
                }
                return C23454a0.f92919a;
            case 10:
                return AbstractC2715d.m7629r((C2717f) this.f121211x, (Function1) this.f121213z, (InterfaceC28601c1) this.f121212y, (String) obj);
            case 11:
                return AbstractC3227i.m9323i((C39509a) this.f121211x, (C39511c) this.f121212y, (InterfaceC23462h) this.f121213z, (InterfaceC40609a) obj);
            case 12:
                return Boolean.valueOf(AbstractC3531s.m10432M((InterfaceC29805a) this.f121211x, (C23465k) this.f121212y, (InterfaceC4351m) this.f121213z, (EnumC14960b2) obj));
            case 13:
                return AbstractC3583c0.m10803W1((C12341k) this.f121211x, (InterfaceC4351m) this.f121212y, (InterfaceC28601c1) this.f121213z, (String) obj);
            case 14:
                return AbstractC3583c0.m10764J1(this.f121211x, (InterfaceC28601c1) this.f121212y, (InterfaceC28601c1) this.f121213z, (List) obj);
            case 15:
                return PregnancySettingsFragment.m23303i0((C4181r) this.f121211x, (C0378a) this.f121212y, (PregnancySettingsFragment) this.f121213z, (C12987s0) obj);
            case 16:
                return AbstractC4234k.m13138K((InterfaceC17910s0) this.f121211x, (AbstractC17911t) this.f121212y, (C4242s) this.f121213z, (InterfaceC22129c) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HelpCenterFragment.m21670G((HelpCenterFragment) this.f121211x, (InterfaceC12251g) this.f121212y, (C40839c) this.f121213z, (AiAction) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return CoachSettingsCoachingModeKt.CoachingModeContent$lambda$2$0$0$0((C14044a) this.f121211x, (Function1) this.f121213z, (CoachingMode) this.f121212y, ((Boolean) obj).booleanValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return CoachSettingsConcisenessContentKt.ConcisenessContent$lambda$2$0$0$0((C14044a) this.f121211x, (Function1) this.f121213z, (ConcisenessMode) this.f121212y, ((Boolean) obj).booleanValue());
            case 20:
                return BirthdayContentKt.BirthdayContent$lambda$0$1$0((InterfaceC23098g1) this.f121211x, (InterfaceC4339a) this.f121212y, (Function1) this.f121213z, obj);
            case 21:
                return CountrySelectionContentKt.CountrySelectionContent$lambda$7$1$0((InterfaceC28670t2) this.f121211x, (String) this.f121212y, (Function1) this.f121213z, (InterfaceC26064q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC11009x0.m29418B0((InterfaceC28593a1) this.f121211x, (InterfaceC28670t2) this.f121212y, (InterfaceC28593a1) this.f121213z, (C39180l) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC11057e.m29735p((AbstractC11057e) this.f121211x, (AbstractC1615p0) this.f121212y, (AbstractC1615p0) this.f121213z, (ApiResponse) obj);
            case 24:
                return p703ct1.Function1.m30052m((C3625f) this.f121211x, (C32948a) this.f121212y, (Function1) this.f121213z, obj);
            case 25:
                return LabradorEligibilityFragment.m22495F((AbstractC12939a0) this.f121211x, (C12375a) this.f121212y, (LabradorEligibilityFragment) this.f121213z, (InterfaceC27122a.c) obj);
            case 26:
                return C11504b.m30937f((Function1) this.f121213z, (C11505c) this.f121211x, (InterfaceC28601c1) this.f121212y, ((Integer) obj).intValue());
            case 27:
                return AbstractC11737c.m31378n((C2761b) this.f121211x, (Function1) this.f121213z, (InterfaceC23462h) this.f121212y, obj);
            case 28:
                return AbstractC11903e.m32033n((Function1) this.f121213z, (Function1) this.f121211x, (AbstractC2980c.d) this.f121212y, (AbstractC25502a) obj);
            default:
                return AbstractC13408c.m37901o((C11014a) this.f121211x, (Function1) this.f121213z, (InterfaceC28601c1) this.f121212y, (EnumC3919c) obj);
        }
    }

    public /* synthetic */ C29656q(Object obj, Function1 function1, Object obj2, int i13) {
        this.f121210w = i13;
        this.f121211x = obj;
        this.f121213z = function1;
        this.f121212y = obj2;
    }

    public /* synthetic */ C29656q(Function1 function1, Object obj, Object obj2, int i13) {
        this.f121210w = i13;
        this.f121213z = function1;
        this.f121211x = obj;
        this.f121212y = obj2;
    }
}
