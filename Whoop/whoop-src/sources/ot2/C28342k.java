package ot2;

import aq0.C1898i;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.weeklyplan.customizeplan.domain.api.BottomButton;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.ToggleContent;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import f41.C14063a;
import f41.C14067e;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jt2.AbstractC21951m;
import jt2.C21940b;
import jt2.C21942d;
import kd1.AbstractC22403o;
import km0.C22580d;
import km0.C22581e;
import km0.C22583g;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import o72.C27644e;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23726v1;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import sw0.AbstractC33051h;
import sw0.C33044a;
import sw0.C33052i;
import sw0.C33053j;
import tw0.C34215a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ot2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lot2/k;", "", "Ltw0/a;", "bottomSheetReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ltw0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "behaviorId", "Ljt2/d;", "accumulator", "Lf41/a;", "e", "(Ljava/lang/String;Ljt2/d;)Lf41/a;", "Ljt2/m$i;", "domainState", "Lot2/c;", "i", "(Ljt2/m$i;Ljt2/d;)Lot2/c;", "", "Lcom/whoop/design/models/items/GoalSettingsTileModel;", "topItems", "items", "", "useTopItems", "", "Lm91/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;Ljava/util/List;Ljt2/d;Z)Ljava/util/List;", "a", "Ltw0/a;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljb1/a;", "c", "Ljb1/a;", "designItemReducer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28342k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34215a bottomSheetReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: ot2.k$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f114309w = new a();

        /* JADX INFO: renamed from: a */
        public final long m85940a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85940a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.k$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f114310w = new b();

        /* JADX INFO: renamed from: a */
        public final long m85941a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85941a((C39336i) obj));
        }
    }

    public C28342k(C34215a bottomSheetReducer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(bottomSheetReducer, "bottomSheetReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.bottomSheetReducer = bottomSheetReducer;
        this.featureFlagChecker = featureFlagChecker;
        this.designItemReducer = AbstractC21537c.m60554d(new C27644e(27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m85934d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private final C14063a m85935e(String behaviorId, C21942d accumulator) {
        Object next;
        C33044a c33044aM104655h;
        List<C33052i> listM104635j = accumulator.getBehaviorsBottomSheet().m104635j();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM104635j.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C33052i) it.next()).m104651f());
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!AbstractC22676k.m65745e(((C33053j) next).getId(), behaviorId));
        C33053j c33053j = (C33053j) next;
        if (c33053j == null || (c33044aM104655h = c33053j.getBottomSheetInfo()) == null) {
            return null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(c33044aM104655h.getBottomSheetTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c33044aM104655h.getImpactTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c33044aM104655h.getDescription());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(c33044aM104655h.getMetricsTagTitle());
        List<String> listM104587d = c33044aM104655h.m104587d();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104587d, 10));
        Iterator<T> it4 = listM104587d.iterator();
        while (it4.hasNext()) {
            arrayList2.add(new C17750h1(AbstractC8693b.m21278l((String) it4.next()), null, p745y81.Function1.m125323a(a.f114309w), null, p745y81.Function1.m125323a(b.f114310w), null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null));
        }
        return new C14063a(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final boolean m85936f(C21942d c21942d, InterfaceC25312u item) {
        AbstractC22676k.m65750j(item, "item");
        List<C21940b> listM62544k = c21942d.m62544k();
        if ((listM62544k instanceof Collection) && listM62544k.isEmpty()) {
            return true;
        }
        Iterator<T> it = listM62544k.iterator();
        while (it.hasNext()) {
            String strM62531d = ((C21940b) it.next()).getId();
            C14067e c14067e = item instanceof C14067e ? (C14067e) item : null;
            if (AbstractC22676k.m65745e(strM62531d, c14067e != null ? c14067e.getId() : null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final boolean m85937g(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC25312u> m85938h(List<GoalSettingsTileModel> topItems, List<GoalSettingsTileModel> items, C21942d accumulator, boolean useTopItems) {
        Object next;
        C21940b c21940b;
        AbstractC22676k.m65750j(accumulator, "accumulator");
        C21535a c21535a = this.designItemReducer;
        List<GoalSettingsTileModel> list = C25271y.f99162w;
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(c21535a.m60540g(topItems == null ? list : topItems));
        C21535a c21535a2 = this.designItemReducer;
        if (items != null) {
            list = items;
        }
        ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(c21535a2.m60540g(list));
        ArrayList arrayList = useTopItems ? arrayListM74097F1 : arrayListM74097F2;
        arrayList.removeIf(new C1898i(new C28340i(accumulator, 1), 7));
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (!useTopItems) {
                    for (C21940b c21940b2 : accumulator.m62544k()) {
                        if (!arrayListM74097F1.isEmpty()) {
                            Iterator it3 = arrayListM74097F1.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    InterfaceC25312u interfaceC25312u = (InterfaceC25312u) it3.next();
                                    C14067e c14067e = interfaceC25312u instanceof C14067e ? (C14067e) interfaceC25312u : null;
                                    if (AbstractC22676k.m65745e(c14067e != null ? c14067e.getId() : null, c21940b2.getId())) {
                                    }
                                }
                            }
                        }
                        if (!arrayListM74097F2.isEmpty()) {
                            Iterator it4 = arrayListM74097F2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    InterfaceC25312u interfaceC25312u2 = (InterfaceC25312u) it4.next();
                                    C14067e c14067e2 = interfaceC25312u2 instanceof C14067e ? (C14067e) interfaceC25312u2 : null;
                                    if (AbstractC22676k.m65745e(c14067e2 != null ? c14067e2.getId() : null, c21940b2.getId())) {
                                    }
                                }
                            }
                        }
                        List<C33052i> listM104635j = accumulator.getBehaviorsBottomSheet().m104635j();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it5 = listM104635j.iterator();
                        while (it5.hasNext()) {
                            AbstractC25265s.m74141p0(arrayList2, ((C33052i) it5.next()).m104651f());
                        }
                        Iterator it6 = arrayList2.iterator();
                        do {
                            if (!it6.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it6.next();
                        } while (!AbstractC22676k.m65745e(((C33053j) next).getId(), c21940b2.getId()));
                        C33053j c33053j = (C33053j) next;
                        if (c33053j != null) {
                            C14067e c14067eM69575b = AbstractC23726v1.m69575b(AbstractC33051h.m104644e(c33053j));
                            arrayList.add(c14067eM69575b.m40036a((2751 & 1) != 0 ? c14067eM69575b.id : null, (2751 & 2) != 0 ? c14067eM69575b.title : null, (2751 & 4) != 0 ? c14067eM69575b.subtitle : null, (2751 & 8) != 0 ? c14067eM69575b.avoidText : null, (2751 & 16) != 0 ? c14067eM69575b.icon : null, (2751 & 32) != 0 ? c14067eM69575b.trend : null, (2751 & 64) != 0 ? c14067eM69575b.activeColor : c21940b2.getIsAvoid() ? EnumC39333f.ACCENT_NEGATIVE_TREND : EnumC39333f.RECOVERY, (2751 & 128) != 0 ? c14067eM69575b.imageUrl : null, (2751 & 256) != 0 ? c14067eM69575b.isSelected : c21940b2.getIsSelected(), (2751 & 512) != 0 ? c14067eM69575b.showAvoidOption : false, (2751 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14067eM69575b.isAvoidChecked : c21940b2.getIsAvoid(), (2751 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14067eM69575b.dayOptions : null, (2751 & 4096) != 0 ? c14067eM69575b.selectedNumber : c21940b2.getDaysPerWeek(), (2751 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14067eM69575b.bottomSheetInfo : m85935e(c33053j.getId(), accumulator)));
                        }
                    }
                }
                return arrayList;
            }
            Object next2 = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC25312u interfaceC25312u3 = (InterfaceC25312u) next2;
            C14067e c14067e3 = interfaceC25312u3 instanceof C14067e ? (C14067e) interfaceC25312u3 : null;
            if (c14067e3 != null) {
                List<C21940b> listM62544k = accumulator.m62544k();
                if (!(listM62544k instanceof Collection) || !listM62544k.isEmpty()) {
                    Iterator<T> it7 = listM62544k.iterator();
                    while (it7.hasNext()) {
                        if (AbstractC22676k.m65745e(((C21940b) it7.next()).getId(), c14067e3.getId())) {
                            Iterator<T> it8 = accumulator.m62544k().iterator();
                            do {
                                if (!it8.hasNext()) {
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                c21940b = (C21940b) it8.next();
                            } while (!AbstractC22676k.m65745e(c21940b.getId(), c14067e3.getId()));
                            arrayList.set(i13, c14067e3.m40036a((2751 & 1) != 0 ? c14067e3.id : null, (2751 & 2) != 0 ? c14067e3.title : null, (2751 & 4) != 0 ? c14067e3.subtitle : null, (2751 & 8) != 0 ? c14067e3.avoidText : null, (2751 & 16) != 0 ? c14067e3.icon : null, (2751 & 32) != 0 ? c14067e3.trend : null, (2751 & 64) != 0 ? c14067e3.activeColor : c21940b.getIsAvoid() ? EnumC39333f.ACCENT_NEGATIVE_TREND : EnumC39333f.RECOVERY, (2751 & 128) != 0 ? c14067e3.imageUrl : null, (2751 & 256) != 0 ? c14067e3.isSelected : c21940b.getIsSelected(), (2751 & 512) != 0 ? c14067e3.showAvoidOption : false, (2751 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14067e3.isAvoidChecked : c21940b.getIsAvoid(), (2751 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14067e3.dayOptions : null, (2751 & 4096) != 0 ? c14067e3.selectedNumber : c21940b.getDaysPerWeek(), (2751 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14067e3.bottomSheetInfo : m85935e(c14067e3.getId(), accumulator)));
                            break;
                        }
                    }
                }
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: i */
    public final C28334c m85939i(AbstractC21951m.i domainState, C21942d accumulator) {
        int whoopIcon;
        BottomButton bottomButton;
        C9598e action;
        BottomButton bottomButton2;
        String icon;
        EnumC16313m0 enumC16313m0;
        BottomButton bottomButton3;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulator, "accumulator");
        Iterator<T> it = domainState.getResult().getGoalScreens().iterator();
        int i13 = 0;
        Object obj = null;
        boolean z4 = false;
        while (true) {
            if (!it.hasNext()) {
                if (!z4) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((WeeklyPlanCustomizationScreenModel) next).getGoal() == TargetGoalType.BEHAVIORS) {
                if (!z4) {
                    obj = next;
                    z4 = true;
                }
            }
            obj = null;
            break;
        }
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) obj;
        if (weeklyPlanCustomizationScreenModel == null) {
            return null;
        }
        List<List<C33052i>> listM108146c = this.featureFlagChecker.isFeatureEnabled("healthspan-coaching-bottom-sheet-swipe") ? this.bottomSheetReducer.m108146c(accumulator.getBehaviorsBottomSheet()) : C25271y.f99162w;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getNavigationTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getDescription());
        ToggleContent toggles = weeklyPlanCustomizationScreenModel.getToggles();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(toggles != null ? toggles.getTopHeadingDisplay() : null);
        ToggleContent toggles2 = weeklyPlanCustomizationScreenModel.getToggles();
        List<GoalSettingsTileModel> topInitialToggles = toggles2 != null ? toggles2.getTopInitialToggles() : null;
        ToggleContent toggles3 = weeklyPlanCustomizationScreenModel.getToggles();
        List<InterfaceC25312u> listM85938h = m85938h(topInitialToggles, toggles3 != null ? toggles3.getInitialToggles() : null, accumulator, true);
        ToggleContent toggles4 = weeklyPlanCustomizationScreenModel.getToggles();
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(toggles4 != null ? toggles4.getHeadingDisplay() : null);
        ToggleContent toggles5 = weeklyPlanCustomizationScreenModel.getToggles();
        List<GoalSettingsTileModel> topInitialToggles2 = toggles5 != null ? toggles5.getTopInitialToggles() : null;
        ToggleContent toggles6 = weeklyPlanCustomizationScreenModel.getToggles();
        List<InterfaceC25312u> listM85938h2 = m85938h(topInitialToggles2, toggles6 != null ? toggles6.getInitialToggles() : null, accumulator, false);
        ToggleContent toggles7 = weeklyPlanCustomizationScreenModel.getToggles();
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l((toggles7 == null || (bottomButton3 = toggles7.getBottomButton()) == null) ? null : bottomButton3.getTitleDisplay());
        ToggleContent toggles8 = weeklyPlanCustomizationScreenModel.getToggles();
        if (toggles8 == null || (bottomButton2 = toggles8.getBottomButton()) == null || (icon = bottomButton2.getIcon()) == null) {
            whoopIcon = EnumC16313m0.SETTINGS.toWhoopIcon();
        } else {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.SETTINGS;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                EnumC16313m0 enumC16313m2 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            whoopIcon = enumC16313m1.toWhoopIcon();
        }
        int i14 = whoopIcon;
        ToggleContent toggles9 = weeklyPlanCustomizationScreenModel.getToggles();
        C28333b c28333b = new C28333b(textResourceM21278l6, (toggles9 == null || (bottomButton = toggles9.getBottomButton()) == null || (action = bottomButton.getAction()) == null) ? new C9598e(null, null, null, 7, null) : action, false, i14, 4, null);
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getButtonDescriptionDisplay());
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getContinueButtonDisplay());
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(accumulator.getBehaviorsBottomSheet().getTitle());
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(accumulator.getBehaviorsBottomSheet().getSearchQuery());
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(accumulator.getBehaviorsBottomSheet().getSearchTitle());
        List<String> listM104629d = accumulator.getBehaviorsBottomSheet().m104629d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM104629d, 10));
        Iterator<T> it3 = listM104629d.iterator();
        while (it3.hasNext()) {
            arrayList.add(AbstractC8693b.m21278l((String) it3.next()));
        }
        TextResource textResourceM21278l12 = AbstractC8693b.m21278l(accumulator.getBehaviorsBottomSheet().getCurrentCategory());
        TextResource textResourceM21278l13 = AbstractC8693b.m21278l(accumulator.getBehaviorsBottomSheet().getButtonTitle());
        InterfaceC39332e interfaceC39332eM85888a = AbstractC28335d.m85888a(weeklyPlanCustomizationScreenModel);
        List<C33052i> listM108145b = this.bottomSheetReducer.m108145b(accumulator.getBehaviorsBottomSheet());
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM108145b, 10));
        Iterator it4 = listM108145b.iterator();
        while (it4.hasNext()) {
            C33052i c33052i = (C33052i) it4.next();
            TextResource textResourceM104650e = c33052i.getTitle();
            List<C33053j> listM104651f = c33052i.m104651f();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
            for (C33053j c33053j : listM104651f) {
                String strM104659l = c33053j.getId();
                TextResource textResourceM21278l14 = AbstractC8693b.m21278l(c33053j.m104665r());
                boolean zM104669v = c33053j.getIsSelected();
                AbstractC22403o.c cVar = new AbstractC22403o.c(c33053j.getIconUrl(), 0, 0, 0, 14, null);
                TextResource textResourceM21278l15 = AbstractC8693b.m21278l(c33053j.getSubtitle());
                List<String> listM104656i = c33053j.m104656i();
                Iterator it5 = it4;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(listM104656i, 10));
                Iterator<T> it6 = listM104656i.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(AbstractC8693b.m21278l((String) it6.next()));
                }
                arrayList3.add(new C22580d(strM104659l, textResourceM21278l14, zM104669v, cVar, textResourceM21278l15, arrayList4, AbstractC8693b.m21278l(c33053j.getAvoidanceText()), false, null, null, 896, null));
                it4 = it5;
            }
            arrayList2.add(new C22583g(textResourceM104650e, arrayList3, null, 4, null));
        }
        List<List<C33052i>> list = listM108146c;
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            List list2 = (List) it7.next();
            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                C33052i c33052i2 = (C33052i) it8.next();
                TextResource textResourceM104650e2 = c33052i2.getTitle();
                List<C33053j> listM104651f2 = c33052i2.m104651f();
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(listM104651f2, 10));
                for (C33053j c33053j2 : listM104651f2) {
                    String strM104659l2 = c33053j2.getId();
                    TextResource textResourceM21278l16 = AbstractC8693b.m21278l(c33053j2.m104665r());
                    boolean zM104669v2 = c33053j2.getIsSelected();
                    AbstractC22403o.c cVar2 = new AbstractC22403o.c(c33053j2.getIconUrl(), 0, 0, 0, 14, null);
                    TextResource textResourceM21278l17 = AbstractC8693b.m21278l(c33053j2.getSubtitle());
                    Iterator it9 = it7;
                    List<String> listM104656i2 = c33053j2.m104656i();
                    Iterator it10 = it8;
                    ArrayList arrayList8 = arrayList2;
                    ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(listM104656i2, 10));
                    Iterator<T> it11 = listM104656i2.iterator();
                    while (it11.hasNext()) {
                        arrayList9.add(AbstractC8693b.m21278l((String) it11.next()));
                    }
                    arrayList7.add(new C22580d(strM104659l2, textResourceM21278l16, zM104669v2, cVar2, textResourceM21278l17, arrayList9, AbstractC8693b.m21278l(c33053j2.getAvoidanceText()), false, null, null, 896, null));
                    it7 = it9;
                    it8 = it10;
                    arrayList2 = arrayList8;
                }
                arrayList6.add(new C22583g(textResourceM104650e2, arrayList7, null, 4, null));
                it7 = it7;
            }
            arrayList5.add(arrayList6);
        }
        return new C28334c(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, listM85938h, textResourceM21278l5, listM85938h2, c28333b, textResourceM21278l8, true, new C22581e(textResourceM21278l9, textResourceM21278l10, textResourceM21278l11, arrayList, textResourceM21278l12, arrayList2, arrayList5, textResourceM21278l13, interfaceC39332eM85888a, null, null, null, null, 7680, null), textResourceM21278l7);
    }
}
