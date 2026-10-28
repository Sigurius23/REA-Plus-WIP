package zs2;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.weeklyplan.customizeplan.domain.api.BehaviorTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.BottomButton;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.ToggleContent;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import f41.C14063a;
import f41.C14067e;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import km0.C22581e;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ot2.AbstractC28335d;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import sw0.C33044a;
import sw0.C33050g;
import sw0.C33052i;
import sw0.C33053j;
import tw0.C34215a;
import ws2.C37615g;
import yb3.AbstractC39421y;
import ys2.AbstractC39758e;
import ys2.C39754a;
import ys2.C39755b;
import ys2.C39759f;
import zm1.C40893d;

/* JADX INFO: renamed from: zs2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lzs2/b;", "", "Ltw0/a;", "bottomSheetReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ltw0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ljava/util/UUID;", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "Lsw0/g;", "bottomSheet", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "", "showLoading", "Lys2/e;", "c", "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lsw0/g;Lws2/g;Z)Lys2/e;", "", "behaviorId", "Lf41/a;", "b", "(Ljava/lang/String;Lsw0/g;)Lf41/a;", "a", "Ltw0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljb1/a;", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41078b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34215a bottomSheetReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: zs2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f177104w = new a();

        /* JADX INFO: renamed from: a */
        public final long m133385a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133385a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zs2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f177105w = new b();

        /* JADX INFO: renamed from: a */
        public final long m133386a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133386a((C39336i) obj));
        }
    }

    public C41078b(C34215a bottomSheetReducer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(bottomSheetReducer, "bottomSheetReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.bottomSheetReducer = bottomSheetReducer;
        this.featureFlagChecker = featureFlagChecker;
        this.reducer = AbstractC21537c.m60554d(new C40893d(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m133382d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final C14063a m133383b(String behaviorId, C33050g bottomSheet) {
        Object next;
        C33044a bottomSheetInfo;
        AbstractC22676k.m65750j(behaviorId, "behaviorId");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        List<C33052i> listM104635j = bottomSheet.m104635j();
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
        if (c33053j == null || (bottomSheetInfo = c33053j.getBottomSheetInfo()) == null) {
            return null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bottomSheetInfo.getBottomSheetTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bottomSheetInfo.getImpactTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(bottomSheetInfo.getDescription());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(bottomSheetInfo.getMetricsTagTitle());
        List<String> listM104587d = bottomSheetInfo.m104587d();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104587d, 10));
        Iterator<T> it4 = listM104587d.iterator();
        while (it4.hasNext()) {
            arrayList2.add(new C17750h1(AbstractC8693b.m21278l((String) it4.next()), null, p745y81.Function1.m125323a(a.f177104w), null, p745y81.Function1.m125323a(b.f177105w), null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null));
        }
        return new C14063a(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [jb1.a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [jb1.a] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final AbstractC39758e m133384c(UUID planId, WeeklyPlanCustomizationScreenModel model, C33050g bottomSheet, C37615g progress, boolean showLoading) {
        ArrayList arrayListM74129g1;
        ?? r10;
        ?? r14;
        int whoopIcon;
        BehaviorTarget behaviorTarget;
        BottomButton bottomButton;
        C9598e action;
        BottomButton bottomButton2;
        String icon;
        EnumC16313m0 enumC16313m0;
        BottomButton bottomButton3;
        List<GoalSettingsTileModel> initialToggles;
        List<GoalSettingsTileModel> topInitialToggles;
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        AbstractC22676k.m65750j(progress, "progress");
        List<C33052i> listM108145b = this.bottomSheetReducer.m108145b(bottomSheet);
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("healthspan-coaching-bottom-sheet-swipe");
        ?? arrayList = C25271y.f99162w;
        ?? M108146c = zIsFeatureEnabled ? this.bottomSheetReducer.m108146c(bottomSheet) : arrayList;
        ToggleContent toggles = model.getToggles();
        if (toggles != null) {
            List<GoalSettingsTileModel> initialToggles2 = toggles.getInitialToggles();
            List<GoalSettingsTileModel> topInitialToggles2 = toggles.getTopInitialToggles();
            arrayListM74129g1 = AbstractC25265s.m74129g1(initialToggles2, topInitialToggles2 != null ? topInitialToggles2 : arrayList);
        } else {
            arrayListM74129g1 = null;
        }
        String string = planId.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        TargetGoalType targetGoalType = TargetGoalType.BEHAVIORS;
        C39759f c39759f = new C39759f(AbstractC8693b.m21278l(model.getNavigationTitleDisplay()), AbstractC8693b.m21278l(model.getNavigationSubtitleDisplay()), AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getDescription()));
        ToggleContent toggles2 = model.getToggles();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(toggles2 != null ? toggles2.getTopHeadingDisplay() : null);
        ?? r15 = this.reducer;
        ToggleContent toggles3 = model.getToggles();
        if (toggles3 == null || (topInitialToggles = toggles3.getTopInitialToggles()) == null) {
            r10 = topInitialToggles;
            r10 = arrayList;
        }
        r10 = topInitialToggles;
        List<InterfaceC25312u> listM60540g = r15.m60540g(r10);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM60540g, 10));
        for (InterfaceC25312u interfaceC25312u : listM60540g) {
            AbstractC22676k.m65748h(interfaceC25312u, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.goalsettingstile.GoalSettingsTileState");
            C14067e c14067e = (C14067e) interfaceC25312u;
            arrayList2.add(c14067e.m40036a((2751 & 1) != 0 ? c14067e.id : null, (2751 & 2) != 0 ? c14067e.title : null, (2751 & 4) != 0 ? c14067e.subtitle : null, (2751 & 8) != 0 ? c14067e.avoidText : null, (2751 & 16) != 0 ? c14067e.icon : null, (2751 & 32) != 0 ? c14067e.trend : null, (2751 & 64) != 0 ? c14067e.activeColor : null, (2751 & 128) != 0 ? c14067e.imageUrl : null, (2751 & 256) != 0 ? c14067e.isSelected : false, (2751 & 512) != 0 ? c14067e.showAvoidOption : false, (2751 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14067e.isAvoidChecked : false, (2751 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14067e.dayOptions : null, (2751 & 4096) != 0 ? c14067e.selectedNumber : 0, (2751 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14067e.bottomSheetInfo : m133383b(c14067e.getId(), bottomSheet)));
        }
        ToggleContent toggles4 = model.getToggles();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(toggles4 != null ? toggles4.getHeadingDisplay() : null);
        ToggleContent toggles5 = model.getToggles();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(toggles5 != null ? toggles5.getSubHeadingDisplay() : null);
        ?? r16 = this.reducer;
        ToggleContent toggles6 = model.getToggles();
        if (toggles6 == null || (initialToggles = toggles6.getInitialToggles()) == null) {
            r14 = initialToggles;
            r14 = arrayList;
        }
        r14 = initialToggles;
        List<InterfaceC25312u> listM60540g2 = r16.m60540g(r14);
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM60540g2, 10));
        for (InterfaceC25312u interfaceC25312u2 : listM60540g2) {
            AbstractC22676k.m65748h(interfaceC25312u2, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.goalsettingstile.GoalSettingsTileState");
            C14067e c14067e2 = (C14067e) interfaceC25312u2;
            arrayList3.add(c14067e2.m40036a((2751 & 1) != 0 ? c14067e2.id : null, (2751 & 2) != 0 ? c14067e2.title : null, (2751 & 4) != 0 ? c14067e2.subtitle : null, (2751 & 8) != 0 ? c14067e2.avoidText : null, (2751 & 16) != 0 ? c14067e2.icon : null, (2751 & 32) != 0 ? c14067e2.trend : null, (2751 & 64) != 0 ? c14067e2.activeColor : null, (2751 & 128) != 0 ? c14067e2.imageUrl : null, (2751 & 256) != 0 ? c14067e2.isSelected : false, (2751 & 512) != 0 ? c14067e2.showAvoidOption : false, (2751 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14067e2.isAvoidChecked : false, (2751 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14067e2.dayOptions : null, (2751 & 4096) != 0 ? c14067e2.selectedNumber : 0, (2751 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14067e2.bottomSheetInfo : m133383b(c14067e2.getId(), bottomSheet)));
        }
        ToggleContent toggles7 = model.getToggles();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l((toggles7 == null || (bottomButton3 = toggles7.getBottomButton()) == null) ? null : bottomButton3.getTitleDisplay());
        ToggleContent toggles8 = model.getToggles();
        if (toggles8 == null || (bottomButton2 = toggles8.getBottomButton()) == null || (icon = bottomButton2.getIcon()) == null) {
            whoopIcon = EnumC16313m0.SETTINGS.toWhoopIcon();
        } else {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.SETTINGS;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                int i14 = i13;
                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                    break;
                }
                i13 = i14 + 1;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            whoopIcon = enumC16313m1.toWhoopIcon();
        }
        int i15 = whoopIcon;
        ToggleContent toggles9 = model.getToggles();
        C39754a c39754a = new C39754a(textResourceM21278l4, (toggles9 == null || (bottomButton = toggles9.getBottomButton()) == null || (action = bottomButton.getAction()) == null) ? new C9598e(null, null, null, 7, null) : action, false, i15, 4, null);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(model.getButtonDescriptionDisplay());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(model.getContinueButtonDisplay());
        String skipButtonDisplay = model.getSkipButtonDisplay();
        C39755b c39755b = new C39755b(textResourceM21278l6, true, skipButtonDisplay != null ? AbstractC8693b.m21278l(skipButtonDisplay) : null, showLoading);
        if (arrayListM74129g1 != null) {
            ArrayList<GoalSettingsTileModel> arrayList4 = new ArrayList();
            for (Object obj : arrayListM74129g1) {
                if (((GoalSettingsTileModel) obj).getSelectedValue() != null) {
                    arrayList4.add(obj);
                }
            }
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
            for (GoalSettingsTileModel goalSettingsTileModel : arrayList4) {
                if (goalSettingsTileModel == null) {
                    goalSettingsTileModel = null;
                }
                if (goalSettingsTileModel != null) {
                    Integer numM125932Q = AbstractC39421y.m125932Q(goalSettingsTileModel.getId());
                    int iIntValue = numM125932Q != null ? numM125932Q.intValue() : 0;
                    Integer selectedValue = goalSettingsTileModel.getSelectedValue();
                    int iIntValue2 = selectedValue != null ? selectedValue.intValue() : 0;
                    Boolean boolIsAvoidChecked = goalSettingsTileModel.isAvoidChecked();
                    behaviorTarget = new BehaviorTarget(iIntValue, iIntValue2, boolIsAvoidChecked != null ? boolIsAvoidChecked.booleanValue() : false);
                } else {
                    behaviorTarget = new BehaviorTarget(0, 0, false);
                }
                arrayList.add(behaviorTarget);
            }
        }
        return new AbstractC39758e.j(string, targetGoalType, c39759f, arrayList2, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, arrayList3, c39754a, textResourceM21278l5, c39755b, arrayList, C22581e.m65416b(C34215a.m108144f(this.bottomSheetReducer, bottomSheet, listM108145b, M108146c, null, null, 24, null), null, null, null, null, null, null, null, null, AbstractC28335d.m85888a(model), null, null, null, null, 7935, null), progress);
    }
}
