package r12;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CardNumberEditText;
import com.whoop.advancedlabs.actionplan.view.ActionPlanFragment;
import com.whoop.advancedlabs.feature.marketingconsent.view.MarketingConsentFragment;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.contentsearch.view.ContentSearchFragment;
import com.whoop.debug.jsonplayground.JsonPlaygroundFragment;
import com.whoop.debug.jsonplayground.JsonPlaygroundResultFragment;
import com.whoop.debug.localservice.DebugLocalServiceFragment;
import com.whoop.design.models.items.weightpicker.WeightPickerModel;
import com.whoop.domain.model.UnitSystem;
import com.whoop.educationModels.PodcastPlayer;
import com.whoop.healthconnect.view.HealthConnectFragment;
import com.whoop.labrador.LabradorResultsFragment;
import com.whoop.onboardingpersonalization.dayzero.DayZeroPersonalizationFragment;
import com.whoop.settings.switchPlan.SwitchPlanDialogFragment;
import com.whoop.training.p068ui.activitysettings.ActivitySettingsFragment;
import d30.C11530f0;
import ec3.C13045h2;
import j93.InterfaceC21493z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import ld1.AbstractC23864c;
import m62.C25122m;
import n43.C26285a;
import p114eb.C12991u0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p741vn1.EnumC36197a;
import q83.InterfaceC30057d;
import qc3.C30256l0;
import r62.AbstractC30988b;
import rm1.AbstractC31595i;
import rm2.AbstractC31605e;
import rp2.AbstractC31644d;
import rp2.C31642b;
import rq2.AbstractC31718c0;
import rq2.AbstractC31740n0;
import rq2.AbstractC31754v;
import rq2.C31734k0;
import rq2.C31749s;
import rx0.AbstractC31900e;
import rx0.InterfaceC31898c;
import s40.C32139c0;
import s40.C32142d0;
import s50.AbstractC32201c;
import s50.C32202d;
import s51.AbstractC32210g;
import s51.C32211h;
import sc3.C32405s;
import se1.AbstractC32421a;
import si0.C32539e;
import t10.C33285e;
import t10.C33290j;
import t20.C33321b;
import t20.C33326g;
import t20.C33342w;
import t20.InterfaceC33325f;
import tc1.AbstractC33698a;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: r12.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C30856a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127250w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f127251x;

    public /* synthetic */ C30856a(Object obj, int i13) {
        this.f127250w = i13;
        this.f127251x = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        int i13 = this.f127250w;
        int i14 = 0;
        Object[] objArr = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f127251x;
        switch (i13) {
            case 0:
                return DayZeroPersonalizationFragment.m23165F((DayZeroPersonalizationFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC30988b.m95521d((C25122m) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                C22677k0 c22677k0 = (C22677k0) obj3;
                String key = (String) obj;
                List values = (List) obj2;
                AbstractC22676k.m65750j(key, "key");
                AbstractC22676k.m65750j(values, "values");
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    c22677k0.m65765f(key, (String) it.next());
                }
                return c23454a0;
            case 3:
                return ActivitySettingsFragment.m26560L((ActivitySettingsFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC31595i.m97473v((AbstractC23864c) obj3, (String) obj, (EnumC36197a) obj2);
            case 5:
                return AbstractC31605e.m97628v0((C12991u0) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC31644d.m97800e((C31642b) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC31754v.m98561d((C31749s) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC31718c0.m98411r((InterfaceC35689r0) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC31740n0.m98508d((C31734k0) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return LabradorResultsFragment.m22414J((LabradorResultsFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return ContentSearchFragment.m19656F((ContentSearchFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return JsonPlaygroundFragment.m20059D((JsonPlaygroundFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return JsonPlaygroundResultFragment.m20067C((JsonPlaygroundResultFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC31900e.m99159g((InterfaceC31898c) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) obj3;
                InterfaceC1585g0 doWithCardWidgetViewModel = (InterfaceC1585g0) obj;
                C32142d0 viewModel = (C32142d0) obj2;
                InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                AbstractC22676k.m65750j(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
                AbstractC22676k.m65750j(viewModel, "viewModel");
                String str = cardMultilineWidget.f22495U;
                if (str != null && !AbstractC22676k.m65745e(viewModel.f133181F, str)) {
                    viewModel.f133181F = cardMultilineWidget.f22495U;
                    AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(viewModel), viewModel.f133184y, null, new C32139c0(viewModel, objArr == true ? 1 : 0, i14), 2);
                }
                C13045h2 c13045h2 = viewModel.f133180E;
                EnumC1635w enumC1635w = EnumC1635w.f6325w;
                AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(doWithCardWidgetViewModel), null, null, new C26285a(doWithCardWidgetViewModel, c13045h2, (InterfaceC30057d) null, cardMultilineWidget), 3);
                return c23454a0;
            case 16:
                InterfaceC1585g0 doWithCardWidgetViewModel2 = (InterfaceC1585g0) obj;
                C32142d0 viewModel2 = (C32142d0) obj2;
                int i15 = CardNumberEditText.f22507p0;
                AbstractC22676k.m65750j(doWithCardWidgetViewModel2, "$this$doWithCardWidgetViewModel");
                AbstractC22676k.m65750j(viewModel2, "viewModel");
                C13045h2 c13045h3 = viewModel2.f133180E;
                EnumC1635w enumC1635w2 = EnumC1635w.f6325w;
                AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(doWithCardWidgetViewModel2), null, null, new C26285a(doWithCardWidgetViewModel2, c13045h3, (InterfaceC30057d) null, (CardNumberEditText) obj3), 3);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC32201c.m100153h((C32202d) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC32210g.m100198k((C32211h) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ActionPlanFragment.m17259G((ActionPlanFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return MarketingConsentFragment.m17460F((MarketingConsentFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                for (C30256l0 c30256l0 : ((C32405s) obj3).f134151b) {
                    c30256l0.f123797a.m100983b(obj, Boolean.valueOf(zBooleanValue != AbstractC22676k.m65745e(c30256l0.f123797a.f134148a.get(obj), Boolean.TRUE)));
                }
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC32421a.m101229i((PodcastPlayer) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C32539e.m101556e((C32539e) obj3, (ScreenTemplate) obj, (Map) obj2);
            case 24:
                return HealthConnectFragment.m21554H((HealthConnectFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return DebugLocalServiceFragment.m20073B((DebugLocalServiceFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                InterfaceC41211c interfaceC41211c = (InterfaceC41211c) obj;
                ((Boolean) obj2).getClass();
                C13045h2 c13045h4 = ((C33285e) ((C11530f0) obj3).f37155h).f138824f;
                do {
                    value = c13045h4.getValue();
                } while (!c13045h4.m36569i(value, C33290j.m105602a((C33290j) value, null, false, null, false, null, interfaceC41211c, 63)));
                return c23454a0;
            case 27:
                C33342w c33342w = (C33342w) obj3;
                C33326g state = (C33326g) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(state, "state");
                C33321b c33321b = state.f139011z;
                InterfaceC41211c interfaceC41211cM105697g = c33321b != null ? c33342w.m105697g(c33321b.f138997G, zBooleanValue2) : null;
                if (c33321b == null || interfaceC41211cM105697g == null) {
                    return state;
                }
                InterfaceC33325f resultIdentifier = c33321b.f138999w;
                String str2 = c33321b.f139000x;
                String str3 = c33321b.f139001y;
                String str4 = c33321b.f139002z;
                String str5 = c33321b.f138995E;
                boolean z4 = c33321b.f138997G;
                boolean z13 = c33321b.f138998H;
                AbstractC22676k.m65750j(resultIdentifier, "resultIdentifier");
                return C33326g.m105694b(state, false, new C33321b(resultIdentifier, str2, str3, str4, str5, interfaceC41211cM105697g, z4, z13), 23);
            case 28:
                return AbstractC33698a.m106475f((WeightPickerModel) obj3, ((Integer) obj).intValue(), (UnitSystem) obj2);
            default:
                return SwitchPlanDialogFragment.m25801G((SwitchPlanDialogFragment) obj3, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
