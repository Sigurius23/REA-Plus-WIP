package xt2;

import a61.C0472e;
import au2.C2079d;
import au2.C2080e;
import au2.C2084i;
import au2.C2085j;
import au2.EnumC2086k;
import com.mapbox.common.HttpHeaders;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.PlanTileModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.WeeklyPlanPresetLandingScreenModel;
import com.whoop.navigation.WeeklyPlanSetupScreenModel;
import com.whoop.weeklyplan.weeklyplan.domain.models.BannerCalloutTile;
import com.whoop.weeklyplan.weeklyplan.domain.models.ButtonInfo;
import com.whoop.weeklyplan.weeklyplan.domain.models.CancelPlanModal;
import com.whoop.weeklyplan.weeklyplan.domain.models.CurrentPlanTile;
import com.whoop.weeklyplan.weeklyplan.domain.models.GoalSection;
import com.whoop.weeklyplan.weeklyplan.domain.models.GradientStyle;
import com.whoop.weeklyplan.weeklyplan.domain.models.NewSummary;
import com.whoop.weeklyplan.weeklyplan.domain.models.NewSummaryItem;
import com.whoop.weeklyplan.weeklyplan.domain.models.ProgressBarModel;
import com.whoop.weeklyplan.weeklyplan.domain.models.SummaryItem;
import com.whoop.weeklyplan.weeklyplan.domain.models.SummaryState;
import com.whoop.weeklyplan.weeklyplan.domain.models.WeeklyPlanModel;
import com.whoop.weeklyplan.weeklyplan.domain.models.WeeklyPlanResponse;
import e11.C12584d;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import hy0.EnumC17740f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.C21535a;
import k71.C22256m;
import k71.EnumC22247d0;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ny0.C27273p0;
import p01.C28582b;
import p01.EnumC28588h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23613d4;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tt2.AbstractC34164b;
import tt2.AbstractC34172j;
import tt2.C34169g;
import v41.InterfaceC35689r0;
import w11.C36696c;
import wt2.AbstractC37625f;
import wt2.AbstractC37636q;
import wt2.C37620a;
import wt2.C37621b;
import wt2.C37623d;
import wt2.C37626g;
import wt2.C37627h;
import wt2.C37631l;
import wt2.C37633n;
import wt2.EnumC37624e;
import wt2.EnumC37632m;
import x11.C37829c;
import y71.C39274g;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import zr2.InterfaceC41070a;
import zt2.C41136e;
import zt2.C41139h;

/* JADX INFO: renamed from: xt2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J-\u0010,\u001a\b\u0012\u0004\u0012\u00020+0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J!\u00103\u001a\b\u0012\u0004\u0012\u00020\u0012002\f\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b$\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m65681d2 = {"Lxt2/d;", "", "Lzr2/a;", "dateAndTimeProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lzr2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "result", "", HttpHeaders.DATE, "", "isUpdating", "Ltt2/b;", "presetDomain", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "Lwt2/q;", "i", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;ZLtt2/b;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lwt2/q;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;", "item", "isCompleted", "Lau2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;Z)Lau2/e;", "domain", "planId", "planState", "Lwt2/f;", "d", "(Ltt2/b;Ljava/lang/String;Ljava/lang/String;)Lwt2/f;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "model", "Lwt2/n;", "c", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Ljava/lang/String;)Lwt2/n;", "", "Lcom/whoop/design/models/DesignSystemModel;", "goalCards", "Lny0/p0;", "secondaryButton", "Lm91/u;", "g", "(Ljava/util/List;Lny0/p0;)Ljava/util/List;", "e", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;)Ljava/lang/String;", "Lec3/l;", "Ltt2/g;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Lzr2/a;", "getDateAndTimeProvider", "()Lzr2/a;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljb1/a;", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38650d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: xt2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f166283w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38650d f166284x;

        /* JADX INFO: renamed from: xt2.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42667a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f166285w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38650d f166286x;

            /* JADX INFO: renamed from: xt2.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.reducers.WeeklyPlanViewStateReducer$reduce$$inlined$map$1$2", m100430f = "WeeklyPlanViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42668a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f166287E;

                /* JADX INFO: renamed from: F */
                Object f166288F;

                /* JADX INFO: renamed from: G */
                Object f166289G;

                /* JADX INFO: renamed from: H */
                int f166290H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f166291w;

                /* JADX INFO: renamed from: x */
                int f166292x;

                /* JADX INFO: renamed from: y */
                Object f166293y;

                public C42668a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f166291w = obj;
                    this.f166292x |= Integer.MIN_VALUE;
                    return C42667a.this.emit(null, this);
                }
            }

            public C42667a(InterfaceC13062m interfaceC13062m, C38650d c38650d) {
                this.f166285w = interfaceC13062m;
                this.f166286x = c38650d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42668a c42668a;
                Object cVar;
                if (interfaceC30057d instanceof C42668a) {
                    c42668a = (C42668a) interfaceC30057d;
                    int i13 = c42668a.f166292x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42668a.f166292x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42668a = new C42668a(interfaceC30057d);
                    }
                } else {
                    c42668a = new C42668a(interfaceC30057d);
                }
                Object obj2 = c42668a.f166291w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42668a.f166292x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f166285w;
                    C34169g c34169g = (C34169g) obj;
                    AbstractC34172j weeklyPlan = c34169g.getWeeklyPlan();
                    AbstractC34164b presets = c34169g.getPresets();
                    if (weeklyPlan instanceof AbstractC34172j.c) {
                        cVar = AbstractC37636q.b.f161161a;
                    } else if (weeklyPlan instanceof AbstractC34172j.d) {
                        AbstractC34172j.d dVar = (AbstractC34172j.d) weeklyPlan;
                        cVar = this.f166286x.m123901i(dVar.getResult(), dVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false, presets, dVar.getAiContextMetadata());
                    } else if (weeklyPlan instanceof AbstractC34172j.e) {
                        AbstractC34172j.e eVar = (AbstractC34172j.e) weeklyPlan;
                        cVar = this.f166286x.m123901i(eVar.getResult(), eVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), true, presets, eVar.getAiContextMetadata());
                    } else if (weeklyPlan instanceof AbstractC34172j.b) {
                        cVar = new AbstractC37636q.a(((AbstractC34172j.b) weeklyPlan).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                    } else {
                        if (!(weeklyPlan instanceof AbstractC34172j.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = new AbstractC37636q.c(null, null, this.f166286x.m123897d(presets, null, "Active Plan"), "Active Plan", false, null, 48, null);
                    }
                    c42668a.f166293y = null;
                    c42668a.f166287E = null;
                    c42668a.f166288F = null;
                    c42668a.f166289G = null;
                    c42668a.f166290H = 0;
                    c42668a.f166292x = 1;
                    if (interfaceC13062m.emit(cVar, c42668a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C38650d c38650d) {
            this.f166283w = interfaceC13058l;
            this.f166284x = c38650d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f166283w.collect(new C42667a(interfaceC13062m, this.f166284x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C38650d(InterfaceC41070a dateAndTimeProvider, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.reducer = AbstractC38648b.m123880h();
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private final C37633n m123896c(WeeklyPlanModel model, String planState) {
        EnumC37632m enumC37632m;
        C12584d c12584d;
        ArrayList arrayList;
        C37626g c37626g;
        C41136e c41136e;
        EnumC16313m0 enumC16313m0;
        C27273p0 c27273p0M68666p;
        EnumC16313m0 enumC16313m1;
        DateSelectorModel datePicker = model.getDatePicker();
        C37623d c37623d = datePicker != null ? new C37623d(datePicker.getNextDateTime(), datePicker.getPrevDateTime(), AbstractC8693b.m21278l(datePicker.getCurrentDateRange())) : null;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay().getDisplay());
        String strName = model.getTitleDisplay().getStyle().name();
        EnumC37632m enumC37632m2 = EnumC37632m.NONE;
        EnumC37632m[] enumC37632mArrValues = EnumC37632m.values();
        int length = enumC37632mArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC37632m = null;
                break;
            }
            enumC37632m = enumC37632mArrValues[i14];
            if (AbstractC22676k.m65745e(enumC37632m.name(), strName)) {
                break;
            }
            i14++;
        }
        if (enumC37632m != null) {
            enumC37632m2 = enumC37632m;
        }
        C37627h c37627h = new C37627h(textResourceM21278l, enumC37632m2);
        String strM123898e = m123898e(model);
        String descriptionDisplay = model.getDescriptionDisplay();
        TextResource textResourceM21278l2 = descriptionDisplay != null ? AbstractC8693b.m21278l(descriptionDisplay) : null;
        String subtitleDisplay = model.getSubtitleDisplay();
        TextResource textResourceM21278l3 = subtitleDisplay != null ? AbstractC8693b.m21278l(subtitleDisplay) : null;
        CurrentPlanTile currentPlanTile = model.getCurrentPlanTile();
        if (currentPlanTile != null) {
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(currentPlanTile.getTitleDisplay());
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(currentPlanTile.getSubtitleDisplay());
            String upperCase = currentPlanTile.getLeadingIcon().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            EnumC16313m0 enumC16313m2 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i15];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), upperCase)) {
                    break;
                }
                i15++;
            }
            if (enumC16313m1 != null) {
                enumC16313m2 = enumC16313m1;
            }
            int whoopIcon = enumC16313m2.toWhoopIcon();
            String trailingIcon = currentPlanTile.getTrailingIcon();
            c12584d = new C12584d(textResourceM21278l4, textResourceM21278l5, whoopIcon, trailingIcon != null ? EnumC16313m0.valueOf(trailingIcon) : null, currentPlanTile.getDestination());
        } else {
            c12584d = null;
        }
        List<DesignSystemModel> headerItems = model.getHeaderItems();
        if (headerItems != null) {
            List<DesignSystemModel> list = headerItems;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.reducer.m60541h((DesignSystemModel) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List<GoalSection> goalSection = model.getGoalSection();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(goalSection, 10));
        for (GoalSection goalSection2 : goalSection) {
            String titleImage = goalSection2.getTitleImage();
            AbstractC22403o.c cVar = titleImage != null ? new AbstractC22403o.c(titleImage, 0, 0, 0, 14, null) : null;
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(goalSection2.getTitleDisplay());
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(goalSection2.getSubtitleDisplay());
            String actionDisplay = goalSection2.getActionDisplay();
            TextResource textResourceM21278l8 = actionDisplay != null ? AbstractC8693b.m21278l(actionDisplay) : null;
            String icon = goalSection2.getIcon();
            C39274g c39274g = icon != null ? new C39274g(EnumC16313m0.valueOf(icon).toWhoopIcon(), AbstractC8693b.m21267a()) : null;
            EnumC17740f titleStyle = goalSection2.getTitleStyle();
            if (titleStyle == null) {
                titleStyle = EnumC17740f.LEFT;
            }
            EnumC17740f enumC17740f = titleStyle;
            List<DesignSystemModel> goalCards = goalSection2.getGoalCards();
            SecondaryButtonModel secondaryButton = goalSection2.getSecondaryButton();
            if (secondaryButton == null) {
                c27273p0M68666p = null;
            } else {
                if (!this.featureFlagChecker.isFeatureEnabled("weekly-plan-add-activity-cta")) {
                    secondaryButton = null;
                }
                if (secondaryButton != null) {
                    c27273p0M68666p = AbstractC23613d4.m68666p(secondaryButton);
                } else {
                    c27273p0M68666p = null;
                }
            }
            List<InterfaceC25312u> listM123899g = m123899g(goalCards, c27273p0M68666p);
            C9598e action = goalSection2.getAction();
            TextResource textResourceM21278l9 = AbstractC8693b.m21278l(goalSection2.getCalloutDisplay());
            TextResource textResourceM21278l10 = AbstractC8693b.m21278l(goalSection2.getCalloutCtaDisplay());
            String id4 = goalSection2.getId();
            if (id4 == null) {
                id4 = AbstractC39421y.m125926K(goalSection2.getTitleDisplay(), " ", "_", false);
            }
            arrayList3.add(new C41139h(cVar, textResourceM21278l6, textResourceM21278l7, textResourceM21278l8, c39274g, action, listM123899g, enumC17740f, false, true, textResourceM21278l9, textResourceM21278l10, id4));
        }
        BannerCalloutTile bannerTile = model.getBannerTile();
        if (bannerTile != null) {
            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(bannerTile.getTitleDisplay());
            String icon2 = bannerTile.getIcon();
            EnumC16313m0 enumC16313m3 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length3 = enumC16313m0ArrValues2.length;
            while (true) {
                if (i13 >= length3) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues2[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon2)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m3 = enumC16313m0;
            }
            c37626g = null;
            C39274g c39274g2 = new C39274g(enumC16313m3.toWhoopIcon(), null, 2, null);
            C9598e destination = bannerTile.getDestination();
            c41136e = new C41136e(textResourceM21278l11, c39274g2, 0.0f, destination == null ? new C9598e(null, null, null, 7, null) : destination, 4, null);
        } else {
            c37626g = null;
            c41136e = null;
        }
        ProgressBarModel progressBar = model.getProgressBar();
        C37626g c37626g2 = progressBar != null ? new C37626g(AbstractC39414r.m125900s0(progressBar.getPercentString(), "%"), progressBar.getPercentSubtitle(), (int) progressBar.getPercentValue()) : c37626g;
        GradientStyle gradientStyle = model.getGradientStyle();
        return new C37633n(c37623d, strM123898e, c37627h, textResourceM21278l2, textResourceM21278l3, c12584d, arrayList, arrayList3, c41136e, c37626g2, gradientStyle != null ? EnumC37624e.valueOf(gradientStyle.name()) : c37626g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final AbstractC37625f m123897d(AbstractC34164b domain, String planId, String planState) {
        if (domain instanceof AbstractC34164b.e) {
            return AbstractC37625f.e.f161006a;
        }
        if (domain instanceof AbstractC34164b.d) {
            return AbstractC37625f.d.f161005a;
        }
        if (domain instanceof AbstractC34164b.b) {
            return AbstractC37625f.b.f161003a;
        }
        if (domain instanceof AbstractC34164b.c) {
            return AbstractC37625f.c.f161004a;
        }
        if (domain instanceof AbstractC34164b.a) {
            return new AbstractC37625f.a(((AbstractC34164b.a) domain).getPlanId());
        }
        if (!(domain instanceof AbstractC34164b.f)) {
            throw new IllegalArgumentException("invalid domain result  " + domain + ", cannot be mapped to a view state.");
        }
        AbstractC34164b.f fVar = (AbstractC34164b.f) domain;
        C37633n c37633nM123896c = m123896c(fVar.getResult().getPlan(), planState);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(fVar.getResult().getCancelPlanButtonDisplay());
        CancelPlanModal cancelPlanModal = fVar.getResult().getCancelPlanModal();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(cancelPlanModal != null ? cancelPlanModal.getTitleDisplay() : null);
        CancelPlanModal cancelPlanModal2 = fVar.getResult().getCancelPlanModal();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(cancelPlanModal2 != null ? cancelPlanModal2.getDescriptionDisplay() : null);
        CancelPlanModal cancelPlanModal3 = fVar.getResult().getCancelPlanModal();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(cancelPlanModal3 != null ? cancelPlanModal3.getButtonDisplay() : null);
        CancelPlanModal cancelPlanModal4 = fVar.getResult().getCancelPlanModal();
        C37621b c37621b = new C37621b(textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, AbstractC8693b.m21278l(cancelPlanModal4 != null ? cancelPlanModal4.getCancelDisplay() : null));
        AiContextMetadata aiContextMetadata = fVar.getAiContextMetadata();
        return new AbstractC37625f.f(planId, c37633nM123896c, textResourceM21278l, c37621b, aiContextMetadata != null ? AbstractC6219a.m18523a(aiContextMetadata) : null);
    }

    /* JADX INFO: renamed from: e */
    private final String m123898e(WeeklyPlanModel model) {
        String planName;
        List<DesignSystemModel> goalCards;
        GoalSection goalSection = (GoalSection) AbstractC25265s.m74100H0(model.getGoalSection());
        DesignSystemModel designSystemModel = (goalSection == null || (goalCards = goalSection.getGoalCards()) == null) ? null : (DesignSystemModel) AbstractC25265s.m74100H0(goalCards);
        PlanTileModel planTileModel = designSystemModel instanceof PlanTileModel ? (PlanTileModel) designSystemModel : null;
        if (planTileModel != null) {
            C9598e destination = planTileModel.getDestination();
            NavigationScreenModel parameters = destination != null ? destination.getParameters() : null;
            WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel = parameters instanceof WeeklyPlanSetupScreenModel ? (WeeklyPlanSetupScreenModel) parameters : null;
            if (weeklyPlanSetupScreenModel != null && (planName = weeklyPlanSetupScreenModel.getPlanName()) != null) {
                return planName;
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00aa  */
    /* JADX INFO: renamed from: g */
    private final List<InterfaceC25312u> m123899g(List<? extends DesignSystemModel> goalCards, C27273p0 secondaryButton) {
        List<? extends DesignSystemModel> list = goalCards;
        ArrayList<Object> arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC38648b.m123880h().m60541h((DesignSystemModel) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (Object objM1178b : arrayList) {
            if (objM1178b instanceof C22256m) {
                objM1178b = C22256m.m63894b((C22256m) objM1178b, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, EnumC22247d0.WEEKLY_PLAN, null, 6291455, null);
            } else if (objM1178b instanceof C0472e) {
                if (secondaryButton != null) {
                    C0472e c0472e = (C0472e) objM1178b;
                    if (c0472e.getCardCtaState() == null) {
                        objM1178b = C0472e.m1178b(c0472e, null, null, null, null, null, null, null, null, new C37829c(secondaryButton.getNavigationAction(), AbstractC8693b.m21267a(), secondaryButton.getText()), null, 767, null);
                    } else {
                        objM1178b = (C0472e) objM1178b;
                    }
                } else {
                    objM1178b = (C0472e) objM1178b;
                }
            }
            arrayList2.add(objM1178b);
        }
        if (!(AbstractC25265s.m74100H0(arrayList2) instanceof C36696c)) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof C36696c) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: h */
    private final C2080e m123900h(NewSummaryItem item, boolean isCompleted) {
        String textDisplay;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(item.getTitle());
        EnumC39333f enumC39333f = isCompleted ? EnumC39333f.ACCENT_ACTION : EnumC39333f.BRAND_WHITE;
        CurrentProgressSteps currentProgressSteps = item.getCircularProgressIndicator().getCurrentProgressSteps();
        int totalSteps = currentProgressSteps != null ? currentProgressSteps.getTotalSteps() : 0;
        CurrentProgressSteps currentProgressSteps2 = item.getCircularProgressIndicator().getCurrentProgressSteps();
        int currentStep = currentProgressSteps2 != null ? currentProgressSteps2.getCurrentStep() : 0;
        CurrentProgressPercentage currentProgressPercentage = item.getCircularProgressIndicator().getCurrentProgressPercentage();
        float percentage = (currentProgressPercentage != null ? (float) currentProgressPercentage.getPercentage() : 0.0f) / 100.0f;
        CurrentProgressSteps currentProgressSteps3 = item.getCircularProgressIndicator().getCurrentProgressSteps();
        if (currentProgressSteps3 == null || (textDisplay = currentProgressSteps3.getTextDisplay()) == null) {
            CurrentProgressPercentage currentProgressPercentage2 = item.getCircularProgressIndicator().getCurrentProgressPercentage();
            textDisplay = currentProgressPercentage2 != null ? currentProgressPercentage2.getTextDisplay() : null;
        }
        return new C2080e(textResourceM21278l, enumC39333f, new C28582b(totalSteps, currentStep, percentage, textDisplay, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, item.getCircularProgressIndicator().getCurrentProgressPercentage() != null ? EnumC28588h.PERCENTAGE : EnumC28588h.STEPS, null, 786416, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:58:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x0245  */
    /* JADX INFO: renamed from: i */
    public final AbstractC37636q m123901i(WeeklyPlanResponse result, String date, boolean isUpdating, AbstractC34164b presetDomain, AiContextMetadata aiContextMetadata) {
        String planId;
        C37631l c37631l;
        SummaryState summaryState;
        EnumC37632m enumC37632m;
        C2084i c2084i;
        C2079d c2079d;
        C37620a c37620a;
        C9598e destination;
        CurrentPlanTile currentPlanTile = result.getPlan().getCurrentPlanTile();
        if (((currentPlanTile == null || (destination = currentPlanTile.getDestination()) == null) ? null : destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()) instanceof AppScreen.C9366m6) {
            NavigationScreenModel parameters = result.getPlan().getCurrentPlanTile().getDestination().getParameters();
            AbstractC22676k.m65748h(parameters, "null cannot be cast to non-null type com.whoop.navigation.WeeklyPlanPresetLandingScreenModel");
            planId = ((WeeklyPlanPresetLandingScreenModel) parameters).getPlanId();
        } else {
            planId = result.getSummary() != null ? result.getSummary().getPlanId() : null;
        }
        String strM123892a = AbstractC38649c.m123892a(result.getPlan().getGoalSection());
        AbstractC37625f abstractC37625fM123897d = presetDomain != null ? m123897d(presetDomain, planId, strM123892a) : null;
        C37633n c37633nM123896c = m123896c(result.getPlan(), strM123892a);
        SummaryState summary = result.getSummary();
        if (summary != null) {
            String planId2 = summary.getPlanId();
            Boolean boolIsDismissible = summary.isDismissible();
            boolean zBooleanValue = boolIsDismissible != null ? boolIsDismissible.booleanValue() : true;
            TextResource textResourceM21278l = AbstractC8693b.m21278l(summary.getTitleDisplay());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(summary.getSubtitleDisplay());
            InterfaceC35689r0.c cVarM113122a = InterfaceC35689r0.c.m113122a(InterfaceC35689r0.c.m113123b(summary.getAnimation().toString()));
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(summary.getHeaderDisplay().getDisplay());
            String strName = summary.getHeaderDisplay().getStyle().name();
            EnumC37632m enumC37632m2 = EnumC37632m.NONE;
            EnumC37632m[] enumC37632mArrValues = EnumC37632m.values();
            int length = enumC37632mArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    summaryState = summary;
                    enumC37632m = null;
                    break;
                }
                enumC37632m = enumC37632mArrValues[i13];
                summaryState = summary;
                if (AbstractC22676k.m65745e(enumC37632m.name(), strName)) {
                    break;
                }
                i13++;
                summary = summaryState;
            }
            if (enumC37632m != null) {
                enumC37632m2 = enumC37632m;
            }
            C37627h c37627h = new C37627h(textResourceM21278l3, enumC37632m2);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(summaryState.getDescriptionDisplay());
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(summaryState.getSummary().getTitleDisplay());
            List<SummaryItem> items = summaryState.getSummary().getItems();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            for (SummaryItem summaryItem : items) {
                arrayList.add(new C2085j(AbstractC8693b.m21278l(summaryItem.getTitleDisplay()), AbstractC8693b.m21278l(summaryItem.getProgressDisplay()), EnumC2086k.valueOf(summaryItem.getStyle().name())));
                c37627h = c37627h;
                textResourceM21278l4 = textResourceM21278l4;
            }
            C37627h c37627h2 = c37627h;
            TextResource textResource = textResourceM21278l4;
            C2084i c2084i2 = new C2084i(textResourceM21278l5, arrayList);
            NewSummary summaryV2 = summaryState.getSummaryV2();
            if (summaryV2 != null) {
                C37626g c37626g = new C37626g(AbstractC39414r.m125900s0(summaryV2.getProgressBar().getPercentString(), "%"), summaryV2.getProgressBar().getPercentSubtitle(), (int) summaryV2.getProgressBar().getPercentValue());
                List<NewSummaryItem> items2 = summaryV2.getItems();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : items2) {
                    NewSummaryItem newSummaryItem = (NewSummaryItem) obj;
                    CurrentProgressSteps currentProgressSteps = newSummaryItem.getCircularProgressIndicator().getCurrentProgressSteps();
                    CircularProgressStyle style = currentProgressSteps != null ? currentProgressSteps.getStyle() : null;
                    NewSummary newSummary = summaryV2;
                    CircularProgressStyle circularProgressStyle = CircularProgressStyle.WEEKLY_PLAN_IN_PROGRESS;
                    if (style == circularProgressStyle) {
                        arrayList2.add(obj);
                    } else {
                        CurrentProgressPercentage currentProgressPercentage = newSummaryItem.getCircularProgressIndicator().getCurrentProgressPercentage();
                        if ((currentProgressPercentage != null ? currentProgressPercentage.getStyle() : null) == circularProgressStyle) {
                            arrayList2.add(obj);
                        }
                    }
                    c2084i2 = c2084i2;
                    summaryV2 = newSummary;
                }
                c2084i = c2084i2;
                NewSummary newSummary2 = summaryV2;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(m123900h((NewSummaryItem) it.next(), false));
                }
                List<NewSummaryItem> items3 = newSummary2.getItems();
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = items3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    NewSummaryItem newSummaryItem2 = (NewSummaryItem) next;
                    CurrentProgressSteps currentProgressSteps2 = newSummaryItem2.getCircularProgressIndicator().getCurrentProgressSteps();
                    CircularProgressStyle style2 = currentProgressSteps2 != null ? currentProgressSteps2.getStyle() : null;
                    Iterator it4 = it3;
                    CircularProgressStyle circularProgressStyle2 = CircularProgressStyle.WEEKLY_PLAN_COMPLETE;
                    if (style2 == circularProgressStyle2) {
                        arrayList4.add(next);
                    } else {
                        CurrentProgressPercentage currentProgressPercentage2 = newSummaryItem2.getCircularProgressIndicator().getCurrentProgressPercentage();
                        if ((currentProgressPercentage2 != null ? currentProgressPercentage2.getStyle() : null) == circularProgressStyle2) {
                            arrayList4.add(next);
                        }
                    }
                    it3 = it4;
                }
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(m123900h((NewSummaryItem) it5.next(), true));
                }
                c2079d = new C2079d(c37626g, arrayList3, arrayList5);
            } else {
                c2084i = c2084i2;
                c2079d = null;
            }
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(summaryState.getPrimaryButton().getTitleDisplay());
            String icon = summaryState.getPrimaryButton().getIcon();
            C37620a c37620a2 = new C37620a(textResourceM21278l6, icon != null ? EnumC16313m0.valueOf(icon) : null, summaryState.getPrimaryButton().getDestination(), summaryState.getPrimaryButton().getEnabled());
            ButtonInfo secondaryButton = summaryState.getSecondaryButton();
            if (secondaryButton != null) {
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(secondaryButton.getTitleDisplay());
                String icon2 = summaryState.getPrimaryButton().getIcon();
                c37620a = new C37620a(textResourceM21278l7, icon2 != null ? EnumC16313m0.valueOf(icon2) : null, secondaryButton.getDestination(), secondaryButton.getEnabled());
            } else {
                c37620a = null;
            }
            List<SummaryItem> items4 = summaryState.getSummary().getItems();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : items4) {
                if (EnumC2086k.valueOf(((SummaryItem) obj2).getStyle().name()) == EnumC2086k.COMPLETE) {
                    arrayList6.add(obj2);
                }
            }
            c37631l = new C37631l(planId2, zBooleanValue, textResourceM21278l, textResourceM21278l2, cVarM113122a, c37627h2, textResource, c2084i, c2079d, c37620a2, c37620a, arrayList6.size(), null, 4096, null);
        } else {
            c37631l = null;
        }
        return new AbstractC37636q.c(c37633nM123896c, c37631l, abstractC37625fM123897d, strM123892a, isUpdating, aiContextMetadata != null ? AbstractC6219a.m18523a(aiContextMetadata) : null);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m123902f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}
