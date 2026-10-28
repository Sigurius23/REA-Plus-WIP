package up1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.settings.domain.models.DueDateDrawer;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsBottomSheet;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsBottomSheetOption;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsGoalsDrawer;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsGoalsDrawerOptions;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsSettingsResponse;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsToggle;
import com.whoop.hormonalinsights.settings.domain.models.PreviousPregnanciesModel;
import com.whoop.navigation.C9598e;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qp1.AbstractC30532a;
import qp1.AbstractC30536e;
import qp1.C30533b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tp1.AbstractC34075o;
import tp1.C34061a;
import tp1.C34062b;
import tp1.C34063c;
import tp1.C34064d;
import tp1.C34065e;
import tp1.C34066f;
import tp1.C34070j;
import tp1.C34077q;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: up1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$¨\u0006&"}, m65681d2 = {"Lup1/a;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;", "response", "", "showUpsell", "showPregnancyConfirmation", "Ltp1/o;", "c", "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZ)Ltp1/o;", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;", "Ltp1/c;", "e", "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;)Ltp1/c;", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;", "Ltp1/f;", "g", "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)Ltp1/f;", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;", "Ltp1/d;", "f", "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;)Ltp1/d;", "Lec3/l;", "Lqp1/b;", "upstream", "b", "(Lec3/l;)Lec3/l;", "a", "Lzr2/a;", "getDateAndTimeProvider", "()Lzr2/a;", "Ljb1/a;", "Ljb1/a;", "designSystemReducer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35151a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a designSystemReducer;

    /* JADX INFO: renamed from: up1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149143w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35151a f149144x;

        /* JADX INFO: renamed from: up1.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42488a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149145w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35151a f149146x;

            /* JADX INFO: renamed from: up1.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.reducers.HormonalSettingsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "HormonalSettingsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42489a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149147E;

                /* JADX INFO: renamed from: F */
                Object f149148F;

                /* JADX INFO: renamed from: G */
                Object f149149G;

                /* JADX INFO: renamed from: H */
                int f149150H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149151w;

                /* JADX INFO: renamed from: x */
                int f149152x;

                /* JADX INFO: renamed from: y */
                Object f149153y;

                public C42489a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149151w = obj;
                    this.f149152x |= Integer.MIN_VALUE;
                    return C42488a.this.emit(null, this);
                }
            }

            public C42488a(InterfaceC13062m interfaceC13062m, C35151a c35151a) {
                this.f149145w = interfaceC13062m;
                this.f149146x = c35151a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42489a c42489a;
                Object objM111198d;
                if (interfaceC30057d instanceof C42489a) {
                    c42489a = (C42489a) interfaceC30057d;
                    int i13 = c42489a.f149152x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42489a.f149152x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42489a = new C42489a(interfaceC30057d);
                    }
                } else {
                    c42489a = new C42489a(interfaceC30057d);
                }
                Object obj2 = c42489a.f149151w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42489a.f149152x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149145w;
                    C30533b c30533b = (C30533b) obj;
                    AbstractC30536e hormonalResult = c30533b.getHormonalResult();
                    if (hormonalResult instanceof AbstractC30536e.b) {
                        objM111198d = AbstractC34075o.b.f142909a;
                    } else if (AbstractC22676k.m65745e(hormonalResult, AbstractC30536e.a.f125559a)) {
                        objM111198d = AbstractC34075o.a.f142908a;
                    } else if (hormonalResult instanceof AbstractC30536e.c) {
                        objM111198d = AbstractC34075o.c.f142910a;
                    } else if (AbstractC22676k.m65745e(hormonalResult, AbstractC30536e.d.f125562a)) {
                        objM111198d = AbstractC34075o.d.f142911a;
                    } else if (AbstractC22676k.m65745e(hormonalResult, AbstractC30536e.e.f125563a)) {
                        objM111198d = AbstractC34075o.e.f142912a;
                    } else {
                        if (!(hormonalResult instanceof AbstractC30536e.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC30532a fertilityResult = c30533b.getFertilityResult();
                        if (AbstractC22676k.m65745e(fertilityResult, AbstractC30532a.d.f125543a)) {
                            objM111198d = AbstractC34075o.e.f142912a;
                        } else if (AbstractC22676k.m65745e(fertilityResult, AbstractC30532a.c.f125542a)) {
                            objM111198d = AbstractC34075o.d.f142911a;
                        } else if (AbstractC22676k.m65745e(fertilityResult, AbstractC30532a.b.f125541a)) {
                            objM111198d = AbstractC34075o.c.f142910a;
                        } else if (AbstractC22676k.m65745e(fertilityResult, AbstractC30532a.a.f125540a) || fertilityResult == null) {
                            AbstractC30536e.f fVar = (AbstractC30536e.f) hormonalResult;
                            objM111198d = C35151a.m111198d(this.f149146x, fVar.getResponse(), fVar.getShowUpsell(), false, 4, null);
                        } else {
                            if (!(fertilityResult instanceof AbstractC30532a.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AbstractC30536e.f fVar2 = (AbstractC30536e.f) hormonalResult;
                            objM111198d = this.f149146x.m111197c(fVar2.getResponse(), fVar2.getShowUpsell(), ((AbstractC30532a.e) fertilityResult).getShowPregnancyConfirmation());
                        }
                    }
                    c42489a.f149153y = null;
                    c42489a.f149147E = null;
                    c42489a.f149148F = null;
                    c42489a.f149149G = null;
                    c42489a.f149150H = 0;
                    c42489a.f149152x = 1;
                    if (interfaceC13062m.emit(objM111198d, c42489a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C35151a c35151a) {
            this.f149143w = interfaceC13058l;
            this.f149144x = c35151a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149143w.collect(new C42488a(interfaceC13062m, this.f149144x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C35151a(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.designSystemReducer = AbstractC35153c.m111212i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX INFO: renamed from: c */
    public final AbstractC34075o m111197c(HormonalInsightsSettingsResponse response, boolean showUpsell, boolean showPregnancyConfirmation) {
        Object next;
        String value;
        C34077q c34077q;
        C34061a c34061a;
        Object next2;
        Object next3;
        List<HormonalInsightsBottomSheetOption> options;
        Object next4;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(response.getNavigationBarTitle());
        List<DesignSystemModel> tiles = response.getTiles();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(this.designSystemReducer.m60541h((DesignSystemModel) it.next()));
        }
        C34063c c34063cM111199e = m111199e(response.getHormonalInsightsModeDrawer());
        HormonalInsightsBottomSheet contraceptionTypeDrawer = response.getContraceptionTypeDrawer();
        C34063c c34063cM111199e2 = contraceptionTypeDrawer != null ? m111199e(contraceptionTypeDrawer) : null;
        HormonalInsightsConfirmDialog disablingDialog = response.getDisablingDialog();
        C34064d c34064dM111200f = disablingDialog != null ? m111200f(disablingDialog) : null;
        HormonalInsightsConfirmDialog switchingModeDialog = response.getSwitchingModeDialog();
        C34064d c34064dM111200f2 = switchingModeDialog != null ? m111200f(switchingModeDialog) : null;
        HormonalInsightsConfirmDialog switchingContraceptionTypeDialog = response.getSwitchingContraceptionTypeDialog();
        C34064d c34064dM111200f3 = switchingContraceptionTypeDialog != null ? m111200f(switchingContraceptionTypeDialog) : null;
        Iterator<T> it3 = response.getHormonalInsightsModeDrawer().getOptions().iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!((HormonalInsightsBottomSheetOption) next).getSelected());
        HormonalInsightsBottomSheetOption hormonalInsightsBottomSheetOption = (HormonalInsightsBottomSheetOption) next;
        String value2 = hormonalInsightsBottomSheetOption != null ? hormonalInsightsBottomSheetOption.getValue() : null;
        HormonalInsightsBottomSheet contraceptionTypeDrawer2 = response.getContraceptionTypeDrawer();
        if (contraceptionTypeDrawer2 == null || (options = contraceptionTypeDrawer2.getOptions()) == null) {
            value = null;
        } else {
            Iterator<T> it4 = options.iterator();
            do {
                if (!it4.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it4.next();
            } while (!((HormonalInsightsBottomSheetOption) next4).getSelected());
            HormonalInsightsBottomSheetOption hormonalInsightsBottomSheetOption2 = (HormonalInsightsBottomSheetOption) next4;
            if (hormonalInsightsBottomSheetOption2 != null) {
                value = hormonalInsightsBottomSheetOption2.getValue();
            } else {
                value = null;
            }
        }
        PreviousPregnanciesModel previousPregnancies = response.getPreviousPregnancies();
        if (previousPregnancies != null) {
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(previousPregnancies.getNavigationTitle());
            List<DesignSystemModel> items = previousPregnancies.getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator<T> it5 = items.iterator();
            while (it5.hasNext()) {
                arrayList2.add(this.designSystemReducer.m60541h((DesignSystemModel) it5.next()));
            }
            c34077q = new C34077q(textResourceM21278l2, arrayList2);
        } else {
            c34077q = null;
        }
        DueDateDrawer pregnancyDueDateDrawer = response.getPregnancyDueDateDrawer();
        if (pregnancyDueDateDrawer != null) {
            c34061a = new C34061a(AbstractC8693b.m21278l(pregnancyDueDateDrawer.getTitleDisplay()), AbstractC8693b.m21278l(pregnancyDueDateDrawer.getButtonDisplay()), pregnancyDueDateDrawer.getCurrentDate(), pregnancyDueDateDrawer.getMaxDate(), pregnancyDueDateDrawer.getMinDate(), AbstractC35152b.m111203a(this.dateAndTimeProvider, pregnancyDueDateDrawer.getCurrentDate()));
        } else {
            c34061a = null;
        }
        Iterator<T> it6 = response.getTiles().iterator();
        while (true) {
            if (!it6.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it6.next();
            DesignSystemModel designSystemModel = (DesignSystemModel) next2;
            if ((designSystemModel instanceof HormonalInsightsToggle) && AbstractC22676k.m65745e(((HormonalInsightsToggle) designSystemModel).getType(), "HORMONAL_INSIGHTS")) {
                break;
            }
        }
        HormonalInsightsToggle hormonalInsightsToggle = next2 instanceof HormonalInsightsToggle ? (HormonalInsightsToggle) next2 : null;
        boolean enabled = hormonalInsightsToggle != null ? hormonalInsightsToggle.getEnabled() : false;
        Iterator it7 = response.getTiles().iterator();
        while (true) {
            if (!it7.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it7.next();
            DesignSystemModel designSystemModel2 = (DesignSystemModel) next3;
            Iterator it8 = it7;
            if ((designSystemModel2 instanceof HormonalInsightsToggle) && AbstractC22676k.m65745e(((HormonalInsightsToggle) designSystemModel2).getType(), "MENSTRUAL_CYCLE_TRENDS_OVERLAY")) {
                break;
            }
            it7 = it8;
        }
        HormonalInsightsToggle hormonalInsightsToggle2 = next3 instanceof HormonalInsightsToggle ? (HormonalInsightsToggle) next3 : null;
        boolean enabled2 = hormonalInsightsToggle2 != null ? hormonalInsightsToggle2.getEnabled() : false;
        HormonalInsightsBottomSheet disableFertilityInsightsSurveyDrawer = response.getDisableFertilityInsightsSurveyDrawer();
        C34063c c34063cM111199e3 = disableFertilityInsightsSurveyDrawer != null ? m111199e(disableFertilityInsightsSurveyDrawer) : null;
        C9598e enableFertilityInsightsDestination = response.getEnableFertilityInsightsDestination();
        AnyModal enablePregnancyInsightsConfirmation = showPregnancyConfirmation ? response.getEnablePregnancyInsightsConfirmation() : null;
        HormonalInsightsGoalsDrawer goalsDrawer = response.getGoalsDrawer();
        return new AbstractC34075o.f(new C34070j(enabled, enabled2, textResourceM21278l, arrayList, c34063cM111199e, c34063cM111199e2, c34064dM111200f, c34064dM111200f2, c34064dM111200f3, value2, value, c34061a, c34077q, showUpsell, c34063cM111199e3, enableFertilityInsightsDestination, enablePregnancyInsightsConfirmation, goalsDrawer != null ? m111201g(goalsDrawer) : null));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AbstractC34075o m111198d(C35151a c35151a, HormonalInsightsSettingsResponse hormonalInsightsSettingsResponse, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return c35151a.m111197c(hormonalInsightsSettingsResponse, z4, z13);
    }

    /* JADX INFO: renamed from: e */
    private final C34063c m111199e(HormonalInsightsBottomSheet hormonalInsightsBottomSheet) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(hormonalInsightsBottomSheet.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(hormonalInsightsBottomSheet.getSaveButtonDisplay());
        List<HormonalInsightsBottomSheetOption> options = hormonalInsightsBottomSheet.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        for (HormonalInsightsBottomSheetOption hormonalInsightsBottomSheetOption : options) {
            String icon = hormonalInsightsBottomSheetOption.getIcon();
            TextResource textResourceM21278l3 = null;
            if (icon != null) {
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC16313m1 = null;
                        break;
                    }
                    enumC16313m1 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                        break;
                    }
                    i13++;
                }
                enumC16313m0 = enumC16313m1;
            } else {
                enumC16313m0 = null;
            }
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(hormonalInsightsBottomSheetOption.getTitleDisplay());
            String descriptionDisplay = hormonalInsightsBottomSheetOption.getDescriptionDisplay();
            if (descriptionDisplay != null) {
                textResourceM21278l3 = AbstractC8693b.m21278l(descriptionDisplay);
            }
            arrayList.add(new C34062b(enumC16313m0, textResourceM21278l4, textResourceM21278l3, hormonalInsightsBottomSheetOption.getValue(), hormonalInsightsBottomSheetOption.getSelected()));
        }
        return new C34063c(textResourceM21278l, textResourceM21278l2, arrayList);
    }

    /* JADX INFO: renamed from: f */
    private final C34064d m111200f(HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog) {
        return new C34064d(AbstractC8693b.m21278l(hormonalInsightsConfirmDialog.getTitle()), AbstractC8693b.m21278l(hormonalInsightsConfirmDialog.getMessage()), AbstractC8693b.m21278l(hormonalInsightsConfirmDialog.getPrimaryText()), AbstractC8693b.m21278l(hormonalInsightsConfirmDialog.getSecondaryText()));
    }

    /* JADX INFO: renamed from: g */
    private final C34066f m111201g(HormonalInsightsGoalsDrawer hormonalInsightsGoalsDrawer) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(hormonalInsightsGoalsDrawer.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(hormonalInsightsGoalsDrawer.getDescription());
        List<HormonalInsightsGoalsDrawerOptions> options = hormonalInsightsGoalsDrawer.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        for (HormonalInsightsGoalsDrawerOptions hormonalInsightsGoalsDrawerOptions : options) {
            arrayList.add(new C34065e(hormonalInsightsGoalsDrawerOptions.getValue(), AbstractC8693b.m21278l(hormonalInsightsGoalsDrawerOptions.getTitle()), hormonalInsightsGoalsDrawerOptions.isSelected()));
        }
        return new C34066f(textResourceM21278l, textResourceM21278l2, arrayList, AbstractC8693b.m21278l(hormonalInsightsGoalsDrawer.getButtonText()));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m111202b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}
