package jv2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.dto.TitleMetricTilesItem;
import com.whoop.weightlifting.data.dto.WorkoutDetailsModel;
import com.whoop.weightlifting.data.dto.WorkoutMetadataDescriptionsItem;
import iv2.C20954c;
import iv2.InterfaceC20952a;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jp2.C21875f;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import o11.AbstractC27407m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33210q;

/* JADX INFO: renamed from: jv2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Ljv2/d;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "result", "Ljv2/c;", "g", "(Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;)Ljv2/c;", "", "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;", "workoutMetadataList", "Ljv2/e;", "c", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;", "titleMetricTiles", "Lsz0/q;", "b", "Liv2/a;", "fullScreenModal", "f", "(Liv2/a;)Ljv2/c;", "Liv2/c;", "domainState", "d", "(Liv2/c;)Ljv2/c;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljb1/a;", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21973d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a reducer;

    public C21973d(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
        this.reducer = AbstractC21537c.m60554d(new C21875f(10));
    }

    /* JADX INFO: renamed from: b */
    private final List<C33210q> m62739b(List<TitleMetricTilesItem> titleMetricTiles) {
        List<TitleMetricTilesItem> list = titleMetricTiles;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (TitleMetricTilesItem titleMetricTilesItem : list) {
            arrayList.add(new C33210q(null, titleMetricTilesItem.getMetricValueDisplay(), null, titleMetricTilesItem.getMetricUnitDisplay(), null, null, titleMetricTilesItem.getMetricSubtitleDisplay(), false, null, null, null, false, 4021, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final List<C21974e> m62740c(List<WorkoutMetadataDescriptionsItem> workoutMetadataList) {
        List<WorkoutMetadataDescriptionsItem> list = workoutMetadataList;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (WorkoutMetadataDescriptionsItem workoutMetadataDescriptionsItem : list) {
            arrayList.add(new C21974e(workoutMetadataDescriptionsItem.getMetadataTitleDisplay(), workoutMetadataDescriptionsItem.getMetadataValueDisplay()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m62741e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC21972c m62742f(InterfaceC20952a fullScreenModal) {
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC20952a.a.f79147a)) {
            return InterfaceC21972c.a.INSTANCE.m62725a();
        }
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC20952a.b.f79148a)) {
            return InterfaceC21972c.a.m62719e(InterfaceC21972c.a.INSTANCE.m62726b(), null, null, null, InterfaceC21970a.a.f85044a, 7, null);
        }
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC20952a.c.f79149a)) {
            return InterfaceC21972c.a.m62719e(InterfaceC21972c.a.INSTANCE.m62727c(), null, null, null, InterfaceC21970a.a.f85044a, 7, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC21972c m62743g(WorkoutDetailsModel result) {
        if (result == null) {
            return m62742f(InterfaceC20952a.c.f79149a);
        }
        TextResource detailsPageTitle = result.getDetailsPageTitle();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getPrebuiltTemplateDetailsHeader().getWorkoutTitleDisplay());
        TextResource workoutSubtitleDisplay = result.getPrebuiltTemplateDetailsHeader().getWorkoutSubtitleDisplay();
        TextResource workoutSummaryDisplay = result.getWorkoutSummaryDisplay();
        AbstractC22403o.c cVar = new AbstractC22403o.c(result.getPrebuiltTemplateDetailsHeader().getBackgroundImageUrl(), 0, 0, 0, 14, null);
        List<WeightliftingExercise> exercises = result.getExercises();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
        for (WeightliftingExercise weightliftingExercise : exercises) {
            InterfaceC21970a.d dVar = new InterfaceC21970a.d(weightliftingExercise.getExerciseId());
            String exerciseId = weightliftingExercise.getExerciseId();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(weightliftingExercise.getName());
            String imageUrl = weightliftingExercise.getImageUrl();
            Object obj = this.featureFlagChecker.isFeatureEnabled("exercise-details-image-navigation-android") ? dVar : null;
            if (obj == null) {
                obj = C23454a0.f92919a;
            }
            arrayList.add(new AbstractC27407m.c.a(exerciseId, textResourceM21278l2, imageUrl, null, dVar, dVar, obj, false, 136, null));
        }
        return new InterfaceC21972c.b(arrayList, detailsPageTitle, textResourceM21278l, workoutSubtitleDisplay, workoutSummaryDisplay, cVar, result.getCallToActionDisplay(), m62739b(result.getPrebuiltTemplateDetailsHeader().getTitleMetricTiles()), m62740c(result.getWorkoutMetadataDescriptions()), result.getExerciseListTitleDisplay());
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC21972c m62744d(C20954c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return domainState.getFullScreenModal() != null ? m62742f(domainState.getFullScreenModal()) : m62743g(domainState.getResult());
    }
}
