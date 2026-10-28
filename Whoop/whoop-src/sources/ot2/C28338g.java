package ot2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.atomic.atom.TrendTypeEnum;
import com.whoop.design.models.items.BottomSheetInfoModel;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.GroupedTogglesModel;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.TogglesModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverride;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.ToggleContent;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetail;
import d13.AbstractC11478a;
import f41.C14063a;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import jb1.AbstractC21537c;
import jb1.C21536b;
import jp2.C21881l;
import jt2.AbstractC21951m;
import jt2.C21939a;
import jt2.C21940b;
import jt2.C21942d;
import jt2.C21956r;
import kd1.AbstractC22403o;
import ks2.AbstractC22822a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mt2.AbstractC25946g;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p730qt2.C30597d;
import p730qt2.C30607m;
import p730qt2.C30612r;
import p730qt2.C30616v;
import p736sz0.C33210q;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import ys2.C39756c;

/* JADX INFO: renamed from: ot2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020'2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lot2/g;", "", "Lot2/s;", "sliderStatReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lot2/s;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ljt2/m$i;", "domainState", "Ljt2/d;", "accumulator", "", "Lm91/u;", "j", "(Ljt2/m$i;Ljt2/d;)Ljava/util/List;", "f", "e", "d", "Lcom/whoop/design/util/TextResource;", "title", "", "numberOfItems", "Lmt2/g;", "navDestination", "Lqt2/m;", "i", "(Lcom/whoop/design/util/TextResource;ILmt2/g;)Lqt2/m;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "dialogModel", "Lys2/c;", "n", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;)Lys2/c;", "", "o", "(Ljt2/m$i;Ljt2/d;)Z", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "l", "(Ljt2/m$i;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "Lot2/p;", "m", "(Ljt2/m$i;Ljt2/d;)Lot2/p;", "k", "(Ljt2/m$i;Ljt2/d;)Lys2/c;", "a", "Lot2/s;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28338g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28350s sliderStatReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: ot2.g$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f114286w = new a();

        /* JADX INFO: renamed from: a */
        public final long m85908a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85908a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.g$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f114287w = new b();

        /* JADX INFO: renamed from: a */
        public final long m85909a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85909a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.g$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ HorizontalStatModel f114288w;

        public c(HorizontalStatModel horizontalStatModel) {
            this.f114288w = horizontalStatModel;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            EnumC39333f enumC39333fM86027a;
            EnumC39333f enumC39333fM86027a2;
            AbstractC22676k.m65750j(it, "it");
            C33210q c33210q = (C33210q) it;
            TrendTypeEnum statTrendType = this.f114288w.getStatTrendType();
            if (statTrendType == null || (enumC39333fM86027a = AbstractC28354w.m86027a(statTrendType)) == null) {
                enumC39333fM86027a = EnumC39333f.BRAND_WHITE;
            }
            EnumC39333f enumC39333f = enumC39333fM86027a;
            TrendTypeEnum statTrendType2 = this.f114288w.getStatTrendType();
            if (statTrendType2 == null || (enumC39333fM86027a2 = AbstractC28354w.m86027a(statTrendType2)) == null) {
                enumC39333fM86027a2 = EnumC39333f.BRAND_WHITE;
            }
            return C33210q.m105317b(c33210q, null, null, null, null, null, null, null, false, enumC39333f, enumC39333fM86027a2, null, false, 3327, null);
        }
    }

    /* JADX INFO: renamed from: ot2.g$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21942d f114290x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21951m.i f114291y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ MetricDetail f114292z;

        public d(C21942d c21942d, AbstractC21951m.i iVar, MetricDetail metricDetail) {
            this.f114290x = c21942d;
            this.f114291y = iVar;
            this.f114292z = metricDetail;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C33210q c33210q = (C33210q) it;
            TextResource textResourceM86018a = C28338g.this.sliderStatReducer.m86018a(this.f114290x, this.f114291y, this.f114292z);
            if (textResourceM86018a == null) {
                textResourceM86018a = c33210q.getStat();
            }
            return C33210q.m105317b(c33210q, new AbstractC25946g.g(this.f114292z.getGoalType()), textResourceM86018a, null, null, null, null, null, false, null, EnumC39333f.BRAND_WHITE, null, false, 3576, null);
        }
    }

    public C28338g(C28350s sliderStatReducer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(sliderStatReducer, "sliderStatReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.sliderStatReducer = sliderStatReducer;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: d */
    private final List<InterfaceC25312u> m85896d(AbstractC21951m.i domainState, C21942d accumulator) {
        Iterable iterableM74092D0;
        TogglesModel togglesModel;
        CustomizeBottomSheetSelectorModel bottomSheet;
        List<GroupedTogglesModel> groupedTogglesModels;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(domainState.getResult().getActivitiesSection().getTitle());
        List<C21939a> listM62549p = accumulator.m62549p();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM62549p) {
            if (((C21939a) obj).getIsSelected()) {
                arrayList.add(obj);
            }
        }
        C30607m c30607mM85901i = m85901i(textResourceM21278l, arrayList.size(), accumulator.getIsSaveEnabled() ? AbstractC25946g.a.f102482a : null);
        List<C21939a> listM62549p2 = accumulator.m62549p();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM62549p2) {
            if (((C21939a) obj2).getIsSelected()) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            iterableM74092D0 = AbstractC37056f.m118958J(new C30597d(AbstractC8693b.m21278l(domainState.getResult().getActivitiesSection().getEmptyState().getTitle()), AbstractC8693b.m21278l(domainState.getResult().getActivitiesSection().getEmptyState().getButtonText()), accumulator.getIsSaveEnabled() ? AbstractC25946g.a.f102482a : null));
        } else {
            List<C21939a> listM62549p3 = accumulator.m62549p();
            ArrayList<C21939a> arrayList3 = new ArrayList();
            for (Object obj3 : listM62549p3) {
                if (((C21939a) obj3).getIsSelected()) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
            for (C21939a c21939a : arrayList3) {
                Object obj4 = null;
                boolean z4 = false;
                for (Object obj5 : domainState.getResult().getGoalScreens()) {
                    if (((WeeklyPlanCustomizationScreenModel) obj5).getGoal() == TargetGoalType.ACTIVITIES) {
                        if (z4) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj4 = obj5;
                        z4 = true;
                    }
                }
                if (!z4) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                ToggleContent toggles = ((WeeklyPlanCustomizationScreenModel) obj4).getToggles();
                if (toggles == null || (bottomSheet = toggles.getBottomSheet()) == null || (groupedTogglesModels = bottomSheet.getGroupedTogglesModels()) == null) {
                    togglesModel = null;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<T> it = groupedTogglesModels.iterator();
                    while (it.hasNext()) {
                        List<TogglesModel> toggles2 = ((GroupedTogglesModel) it.next()).getToggles();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj6 : toggles2) {
                            if (AbstractC22676k.m65745e(((TogglesModel) obj6).getId(), c21939a.getActivityType())) {
                                arrayList6.add(obj6);
                            }
                        }
                        AbstractC25265s.m74141p0(arrayList5, arrayList6);
                    }
                    togglesModel = (TogglesModel) AbstractC25265s.m74100H0(arrayList5);
                }
                arrayList4.add(togglesModel != null ? new C30616v(null, AbstractC16315n0.m46377b(togglesModel.getIcon()), AbstractC11478a.m30853e(Locale.ROOT, togglesModel.getTitle(), "toUpperCase(...)"), new TextResource.C8688b(AbstractC22822a.f89930b, new TextResource.AbstractC8690d.c(AbstractC8693b.m21278l(String.valueOf(c21939a.getDaysPerWeek())))), null, null, AbstractC8693b.m21267a(), EnumC39333f.ACCENT_ACTION, null, null, 512, null) : null);
            }
            iterableM74092D0 = AbstractC25265s.m74092D0(arrayList4);
        }
        return AbstractC25265s.m74129g1(AbstractC37056f.m118958J(c30607mM85901i), iterableM74092D0);
    }

    /* JADX INFO: renamed from: e */
    private final List<InterfaceC25312u> m85897e(AbstractC21951m.i domainState, C21942d accumulator) {
        Iterable iterableM74092D0;
        TogglesModel togglesModel;
        C30616v c30616v;
        String upperCase;
        C14063a c14063a;
        CustomizeBottomSheetSelectorModel bottomSheet;
        List<GroupedTogglesModel> groupedTogglesModels;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(domainState.getResult().getBehaviorSection().getTitle());
        List<C21940b> listM62550q = accumulator.m62550q();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM62550q) {
            if (((C21940b) obj).getIsSelected()) {
                arrayList.add(obj);
            }
        }
        C30607m c30607mM85901i = m85901i(textResourceM21278l, arrayList.size(), accumulator.getIsSaveEnabled() ? AbstractC25946g.c.f102484a : null);
        List<C21940b> listM62550q2 = accumulator.m62550q();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM62550q2) {
            if (((C21940b) obj2).getIsSelected()) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            iterableM74092D0 = AbstractC37056f.m118958J(new C30597d(AbstractC8693b.m21278l(domainState.getResult().getBehaviorSection().getEmptyState().getTitle()), AbstractC8693b.m21278l(domainState.getResult().getBehaviorSection().getEmptyState().getButtonText()), accumulator.getIsSaveEnabled() ? AbstractC25946g.c.f102484a : null));
        } else {
            List<C21940b> listM62550q3 = accumulator.m62550q();
            ArrayList<C21940b> arrayList3 = new ArrayList();
            for (Object obj3 : listM62550q3) {
                if (((C21940b) obj3).getIsSelected()) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
            for (C21940b c21940b : arrayList3) {
                Object obj4 = null;
                boolean z4 = false;
                for (Object obj5 : domainState.getResult().getGoalScreens()) {
                    if (((WeeklyPlanCustomizationScreenModel) obj5).getGoal() == TargetGoalType.BEHAVIORS) {
                        if (z4) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj4 = obj5;
                        z4 = true;
                    }
                }
                if (!z4) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                ToggleContent toggles = ((WeeklyPlanCustomizationScreenModel) obj4).getToggles();
                if (toggles == null || (bottomSheet = toggles.getBottomSheet()) == null || (groupedTogglesModels = bottomSheet.getGroupedTogglesModels()) == null) {
                    togglesModel = null;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<T> it = groupedTogglesModels.iterator();
                    while (it.hasNext()) {
                        List<TogglesModel> toggles2 = ((GroupedTogglesModel) it.next()).getToggles();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj6 : toggles2) {
                            if (AbstractC22676k.m65745e(((TogglesModel) obj6).getId(), c21940b.getId())) {
                                arrayList6.add(obj6);
                            }
                        }
                        AbstractC25265s.m74141p0(arrayList5, arrayList6);
                    }
                    togglesModel = (TogglesModel) AbstractC25265s.m74100H0(arrayList5);
                }
                if (togglesModel != null) {
                    if (c21940b.getIsAvoid()) {
                        upperCase = togglesModel.getAvoidTextDisplay();
                    } else {
                        String title = togglesModel.getTitle();
                        Locale locale = Locale.getDefault();
                        AbstractC22676k.m65749i(locale, "getDefault(...)");
                        upperCase = title.toUpperCase(locale);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    }
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(upperCase);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC22822a.f89930b, new TextResource.AbstractC8690d.c(AbstractC8693b.m21278l(String.valueOf(c21940b.getDaysPerWeek()))));
                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                    EnumC39333f enumC39333f = EnumC39333f.ACCENT_ACTION;
                    BottomSheetInfoModel bottomSheetInfo = togglesModel.getBottomSheetInfo();
                    if (bottomSheetInfo != null) {
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(bottomSheetInfo.getBottomSheetTitle());
                        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(bottomSheetInfo.getImpactTitle());
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(bottomSheetInfo.getDescription());
                        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(bottomSheetInfo.getMetricsTagTitle());
                        List<String> metricTags = bottomSheetInfo.getMetricTags();
                        ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(metricTags, 10));
                        Iterator<T> it3 = metricTags.iterator();
                        while (it3.hasNext()) {
                            arrayList7.add(new C17750h1(AbstractC8693b.m21278l((String) it3.next()), null, p745y81.Function1.m125323a(a.f114286w), null, p745y81.Function1.m125323a(b.f114287w), null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null));
                        }
                        c14063a = new C14063a(textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, arrayList7);
                    } else {
                        c14063a = null;
                    }
                    c30616v = new C30616v(null, null, textResourceM21278l2, c8688b, c14063a, null, textResourceM21267a, enumC39333f, null, null, 512, null);
                } else {
                    c30616v = null;
                }
                arrayList4.add(c30616v);
            }
            iterableM74092D0 = AbstractC25265s.m74092D0(arrayList4);
        }
        return AbstractC25265s.m74129g1(AbstractC37056f.m118958J(c30607mM85901i), iterableM74092D0);
    }

    /* JADX INFO: renamed from: f */
    private final List<InterfaceC25312u> m85898f(AbstractC21951m.i domainState, C21942d accumulator) {
        List listM118958J;
        MetricDetail metricDetail;
        EnumC16313m0 enumC16313m0;
        C28338g c28338g = this;
        C30607m c30607mM85901i = c28338g.m85901i(AbstractC8693b.m21278l(domainState.getResult().getMetricSection().getTitle()), accumulator.m62538e().size(), accumulator.getIsSaveEnabled() ? AbstractC25946g.e.f102486a : null);
        if (accumulator.m62538e().isEmpty()) {
            listM118958J = AbstractC37056f.m118958J(new C30597d(AbstractC8693b.m21278l(domainState.getResult().getMetricSection().getEmptyState().getTitle()), AbstractC8693b.m21278l(domainState.getResult().getMetricSection().getEmptyState().getButtonText()), accumulator.getIsSaveEnabled() ? AbstractC25946g.e.f102486a : null));
        } else {
            List<Integer> listM62538e = accumulator.m62538e();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM62538e, 10));
            Iterator<T> it = listM62538e.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Iterator<T> it3 = domainState.getResult().getMetricDetails().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    metricDetail = (MetricDetail) it3.next();
                    if (metricDetail.getGoalTypeId() == iIntValue) {
                        break;
                    }
                    c28338g = this;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(metricDetail.getMetricCard().getTitle());
                int goalTypeId = metricDetail.getGoalTypeId();
                HorizontalStatModel horizontalStatAvg = metricDetail.getMetricCard().getHorizontalStatAvg();
                InterfaceC25312u interfaceC25312uM60541h = AbstractC21537c.m60554d(new C28337f(horizontalStatAvg, 0)).m60541h(horizontalStatAvg);
                AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.HorizontalStatState");
                C33210q c33210q = (C33210q) interfaceC25312uM60541h;
                InterfaceC25312u interfaceC25312uM60541h2 = AbstractC21537c.m60554d(new C21881l(c28338g, accumulator, domainState, metricDetail, 18)).m60541h(metricDetail.getMetricCard().getHorizontalStatGoal());
                AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.HorizontalStatState");
                C33210q c33210q2 = (C33210q) interfaceC25312uM60541h2;
                String leftIcon = metricDetail.getMetricCard().getLeftIcon();
                EnumC16313m0 enumC16313m1 = EnumC16313m0.ACTIVITY;
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC16313m0 = null;
                        break;
                    }
                    enumC16313m0 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                        break;
                    }
                    i13++;
                }
                if (enumC16313m0 != null) {
                    enumC16313m1 = enumC16313m0;
                }
                arrayList.add(new C30612r(textResourceM21278l, Integer.valueOf(enumC16313m1.toWhoopIcon()), null, C25271y.f99162w, goalTypeId, c33210q, c33210q2, null));
                c28338g = this;
            }
            listM118958J = arrayList;
        }
        return AbstractC25265s.m74129g1(AbstractC37056f.m118958J(c30607mM85901i), listM118958J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m85899g(HorizontalStatModel horizontalStatModel, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33210q.class), new c(horizontalStatModel));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m85900h(C28338g c28338g, C21942d c21942d, AbstractC21951m.i iVar, MetricDetail metricDetail, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33210q.class), c28338g.new d(c21942d, iVar, metricDetail));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private final C30607m m85901i(TextResource title, int numberOfItems, AbstractC25946g navDestination) {
        return new C30607m(title, AbstractC8693b.m21278l("(" + numberOfItems + ")"), numberOfItems > 0 ? AbstractC8693b.m21277k(AbstractC22822a.f89929a) : null, numberOfItems > 0 ? EnumC16313m0.PENCIL : null, navDestination);
    }

    /* JADX INFO: renamed from: j */
    private final List<InterfaceC25312u> m85902j(AbstractC21951m.i domainState, C21942d accumulator) {
        List<InterfaceC25312u> listM85898f = m85898f(domainState, accumulator);
        List<InterfaceC25312u> listM85897e = m85897e(domainState, accumulator);
        return AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(listM85898f, listM85897e), m85896d(domainState, accumulator));
    }

    /* JADX INFO: renamed from: l */
    private final WeeklyPlanCustomizationScreenModel m85903l(AbstractC21951m.i domainState) {
        Object obj;
        Object next;
        Object next2;
        Iterator<T> it = domainState.getResult().getGoalScreens().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((WeeklyPlanCustomizationScreenModel) next).getGoal() != TargetGoalType.SLEEP_PERFORMANCE);
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) next;
        if (weeklyPlanCustomizationScreenModel == null) {
            Iterator<T> it3 = domainState.getResult().getGoalScreens().iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((WeeklyPlanCustomizationScreenModel) next2).getGoal() != TargetGoalType.SLEEP_HOURS);
            weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) next2;
            if (weeklyPlanCustomizationScreenModel == null) {
                for (Object obj2 : domainState.getResult().getGoalScreens()) {
                    if (((WeeklyPlanCustomizationScreenModel) obj2).getGoal() == TargetGoalType.SLEEP_CONSISTENCY) {
                        obj = obj2;
                        break;
                    }
                }
                return (WeeklyPlanCustomizationScreenModel) obj;
            }
        }
        return weeklyPlanCustomizationScreenModel;
    }

    /* JADX INFO: renamed from: n */
    private final C39756c m85904n(SmartAlarmOverride dialogModel) {
        return new C39756c(AbstractC8693b.m21278l(dialogModel.getTitle()), AbstractC8693b.m21278l(dialogModel.getDescription()), AbstractC8693b.m21278l(dialogModel.getButtonConfirmTitle()), AbstractC8693b.m21278l(dialogModel.getButtonRejectTitle()));
    }

    /* JADX INFO: renamed from: o */
    private final boolean m85905o(AbstractC21951m.i domainState, C21942d accumulator) {
        List<C21956r> listM62551r = accumulator.m62551r();
        if ((listM62551r instanceof Collection) && listM62551r.isEmpty()) {
            return false;
        }
        for (C21956r c21956r : listM62551r) {
            if (c21956r.getTargetGoalType() == TargetGoalType.SLEEP_PERFORMANCE || c21956r.getTargetGoalType() == TargetGoalType.SLEEP_HOURS || c21956r.getTargetGoalType() == TargetGoalType.SLEEP_CONSISTENCY) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final C39756c m85906k(AbstractC21951m.i domainState, C21942d accumulator) {
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModelM85903l;
        SmartAlarmOverride smartAlarmOverride;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulator, "accumulator");
        if (!m85905o(domainState, accumulator) || (weeklyPlanCustomizationScreenModelM85903l = m85903l(domainState)) == null || (smartAlarmOverride = weeklyPlanCustomizationScreenModelM85903l.getSmartAlarmOverride()) == null) {
            return null;
        }
        return new C39756c(AbstractC8693b.m21278l(smartAlarmOverride.getTitle()), AbstractC8693b.m21278l(smartAlarmOverride.getDescription()), AbstractC8693b.m21278l(smartAlarmOverride.getButtonConfirmTitle()), AbstractC8693b.m21278l(smartAlarmOverride.getButtonRejectTitle()));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:0: B:55:0x00f8->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public final C28347p m85907m(AbstractC21951m.i domainState, C21942d accumulator) {
        TextResource textResourceM21278l;
        TextResource textResourceM21278l2;
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        boolean z4;
        List<C21939a> listM62549p;
        Iterator<T> it;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulator, "accumulator");
        HubAndSpokeResponse hubAndSpokeResponseM62640b = domainState.getResult();
        String planId = hubAndSpokeResponseM62640b.getPlanId();
        String currentPlanTitle = hubAndSpokeResponseM62640b.getCurrentPlanTitle();
        TextResource textResourceM21278l3 = currentPlanTitle != null ? AbstractC8693b.m21278l(currentPlanTitle) : null;
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(hubAndSpokeResponseM62640b.getNavigationTitle());
        String planTitle = accumulator.getPlanTitle();
        if (planTitle == null || (textResourceM21278l = AbstractC8693b.m21278l(planTitle)) == null) {
            textResourceM21278l = AbstractC8693b.m21278l(hubAndSpokeResponseM62640b.getHeaderDisplay());
        }
        String headerImageUrl = hubAndSpokeResponseM62640b.getHeaderImageUrl();
        AbstractC22403o.c cVar = headerImageUrl != null ? new AbstractC22403o.c(headerImageUrl, 0, 0, 0, 14, null) : null;
        String description = accumulator.getDescription();
        if (description == null || (textResourceM21278l2 = AbstractC8693b.m21278l(description)) == null) {
            textResourceM21278l2 = AbstractC8693b.m21278l(hubAndSpokeResponseM62640b.getSubtitle());
        }
        String explanationTitle = accumulator.getExplanationTitle();
        if (explanationTitle == null || (textResourceM21267a = AbstractC8693b.m21278l(explanationTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        String explanation = accumulator.getExplanation();
        if (explanation == null || (textResourceM21267a2 = AbstractC8693b.m21278l(explanation)) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        TextResource textResource2 = textResourceM21267a2;
        TextResource textResource3 = textResourceM21278l;
        AbstractC22403o.c cVar2 = cVar;
        TextResource textResource4 = textResourceM21278l2;
        List<InterfaceC25312u> listM85902j = m85902j(domainState, accumulator);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(hubAndSpokeResponseM62640b.getStartPlanButtonText());
        if (accumulator.getIsSaveEnabled()) {
            if (accumulator.m62538e().isEmpty()) {
                List<C21940b> listM62550q = accumulator.m62550q();
                if ((listM62550q instanceof Collection) && listM62550q.isEmpty()) {
                    listM62549p = accumulator.m62549p();
                    if (listM62549p instanceof Collection) {
                        it = listM62549p.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C21939a) it.next()).getIsSelected()) {
                                }
                            }
                        }
                    } else {
                        it = listM62549p.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C21939a) it.next()).getIsSelected()) {
                                }
                            }
                        }
                    }
                    z4 = false;
                } else {
                    Iterator<T> it3 = listM62550q.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            listM62549p = accumulator.m62549p();
                            if ((listM62549p instanceof Collection) || !listM62549p.isEmpty()) {
                                it = listM62549p.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((C21939a) it.next()).getIsSelected()) {
                                        }
                                    }
                                }
                            }
                            z4 = false;
                        } else if (((C21940b) it3.next()).getIsSelected()) {
                        }
                    }
                }
            }
            z4 = true;
        } else {
            z4 = false;
        }
        boolean zM86023a = AbstractC28352u.m86023a(accumulator);
        boolean z13 = z4;
        boolean isCustomized = accumulator.getIsCustomized();
        C39756c c39756cM85906k = m85906k(domainState, accumulator);
        List<C21956r> listM62551r = accumulator.m62551r();
        List<C21940b> listM62550q2 = accumulator.m62550q();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM62550q2) {
            HubAndSpokeResponse hubAndSpokeResponse = hubAndSpokeResponseM62640b;
            if (((C21940b) obj).getIsSelected()) {
                arrayList.add(obj);
            }
            hubAndSpokeResponseM62640b = hubAndSpokeResponse;
        }
        HubAndSpokeResponse hubAndSpokeResponse2 = hubAndSpokeResponseM62640b;
        List<C21939a> listM62549p2 = accumulator.m62549p();
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = listM62549p2.iterator();
        while (it4.hasNext()) {
            Iterator it5 = it4;
            Object next = it5.next();
            if (((C21939a) next).getIsSelected()) {
                arrayList2.add(next);
            }
            it4 = it5;
        }
        String endPlanButtonText = hubAndSpokeResponse2.getEndPlanButtonText();
        TextResource textResourceM21278l6 = endPlanButtonText != null ? AbstractC8693b.m21278l(endPlanButtonText) : null;
        SmartAlarmOverride endPlanDialog = hubAndSpokeResponse2.getEndPlanDialog();
        C39756c c39756cM85904n = endPlanDialog != null ? m85904n(endPlanDialog) : null;
        SmartAlarmOverride unsavedChangesDialog = hubAndSpokeResponse2.getUnsavedChangesDialog();
        return new C28347p(planId, textResourceM21278l3, textResourceM21278l4, textResource3, cVar2, textResource4, listM85902j, textResourceM21278l5, z13, isCustomized, zM86023a, c39756cM85906k, textResourceM21278l6, c39756cM85904n, unsavedChangesDialog != null ? m85904n(unsavedChangesDialog) : null, listM62551r, arrayList2, arrayList, accumulator.getSource(), accumulator.getPresetPlanCategory(), textResource, textResource2, accumulator.getTemplateId());
    }
}
