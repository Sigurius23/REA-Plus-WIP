package fu2;

import com.whoop.weightlifting.data.domain.FilterOptions;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import cv2.C11149b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: fu2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lfu2/g;", "", "e", "g", "i", "f", "a", "b", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "Lfu2/g$a;", "Lfu2/g$b;", "Lfu2/g$c;", "Lfu2/g$d;", "Lfu2/g$e;", "Lfu2/g$f;", "Lfu2/g$g;", "Lfu2/g$h;", "Lfu2/g$i;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14792g {

    /* JADX INFO: renamed from: fu2.g$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lfu2/g$a;", "Lfu2/g;", "", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercises", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC14792g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<WeightliftingExercise> exercises;

        public a(List<WeightliftingExercise> exercises) {
            AbstractC22676k.m65750j(exercises, "exercises");
            this.exercises = exercises;
        }

        /* JADX INFO: renamed from: a */
        public final List<WeightliftingExercise> m42521a() {
            return this.exercises;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.exercises, ((a) other).exercises);
        }

        public int hashCode() {
            return this.exercises.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("AddExercises(exercises=", ")", this.exercises);
        }
    }

    /* JADX INFO: renamed from: fu2.g$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lfu2/g$b;", "Lfu2/g;", "", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercises", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC14792g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<WeightliftingExercise> exercises;

        public b(List<WeightliftingExercise> exercises) {
            AbstractC22676k.m65750j(exercises, "exercises");
            this.exercises = exercises;
        }

        /* JADX INFO: renamed from: a */
        public final List<WeightliftingExercise> m42522a() {
            return this.exercises;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.exercises, ((b) other).exercises);
        }

        public int hashCode() {
            return this.exercises.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("AddExercisesToSuperset(exercises=", ")", this.exercises);
        }
    }

    /* JADX INFO: renamed from: fu2.g$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lfu2/g$c;", "Lfu2/g;", "", "", "Lcv2/b;", "exerciseList", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "filterOptions", "<init>", "(Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/FilterOptions;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "()Lcom/whoop/weightlifting/data/domain/FilterOptions;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC14792g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, C11149b> exerciseList;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final FilterOptions filterOptions;

        public c(Map<String, C11149b> exerciseList, FilterOptions filterOptions) {
            AbstractC22676k.m65750j(exerciseList, "exerciseList");
            AbstractC22676k.m65750j(filterOptions, "filterOptions");
            this.exerciseList = exerciseList;
            this.filterOptions = filterOptions;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, C11149b> m42523a() {
            return this.exerciseList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FilterOptions getFilterOptions() {
            return this.filterOptions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.exerciseList, cVar.exerciseList) && AbstractC22676k.m65745e(this.filterOptions, cVar.filterOptions);
        }

        public int hashCode() {
            return this.filterOptions.hashCode() + (this.exerciseList.hashCode() * 31);
        }

        public String toString() {
            return "CacheExerciseListAndFilterOptions(exerciseList=" + this.exerciseList + ", filterOptions=" + this.filterOptions + ")";
        }
    }

    /* JADX INFO: renamed from: fu2.g$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/g$d;", "Lfu2/g;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC14792g {

        /* JADX INFO: renamed from: a */
        public static final d f54904a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: fu2.g$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/g$e;", "Lfu2/g;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14792g {

        /* JADX INFO: renamed from: a */
        public static final e f54905a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: fu2.g$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lfu2/g$f;", "Lfu2/g;", "", "activityId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC14792g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        public f(String activityId) {
            AbstractC22676k.m65750j(activityId, "activityId");
            this.activityId = activityId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.activityId, ((f) other).activityId);
        }

        public int hashCode() {
            return this.activityId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateActivityId(activityId=", this.activityId, ")");
        }
    }

    /* JADX INFO: renamed from: fu2.g$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfu2/g$g;", "Lfu2/g;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "customExercise", "<init>", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC14792g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WeightliftingExercise customExercise;

        public g(WeightliftingExercise customExercise) {
            AbstractC22676k.m65750j(customExercise, "customExercise");
            this.customExercise = customExercise;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WeightliftingExercise getCustomExercise() {
            return this.customExercise;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.customExercise, ((g) other).customExercise);
        }

        public int hashCode() {
            return this.customExercise.hashCode();
        }

        public String toString() {
            return "UpdateDomainStateWithUpdatedCustomExercise(customExercise=" + this.customExercise + ")";
        }
    }

    /* JADX INFO: renamed from: fu2.g$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfu2/g$h;", "Lfu2/g;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "customExercise", "<init>", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC14792g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WeightliftingExercise customExercise;

        public h(WeightliftingExercise customExercise) {
            AbstractC22676k.m65750j(customExercise, "customExercise");
            this.customExercise = customExercise;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WeightliftingExercise getCustomExercise() {
            return this.customExercise;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.customExercise, ((h) other).customExercise);
        }

        public int hashCode() {
            return this.customExercise.hashCode();
        }

        public String toString() {
            return "UpdateExerciseListCache(customExercise=" + this.customExercise + ")";
        }
    }

    /* JADX INFO: renamed from: fu2.g$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfu2/g$i;", "Lfu2/g;", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "workoutTemplate", "<init>", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC14792g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WorkoutTemplate workoutTemplate;

        public i(WorkoutTemplate workoutTemplate) {
            AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
            this.workoutTemplate = workoutTemplate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WorkoutTemplate getWorkoutTemplate() {
            return this.workoutTemplate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.workoutTemplate, ((i) other).workoutTemplate);
        }

        public int hashCode() {
            return this.workoutTemplate.hashCode();
        }

        public String toString() {
            return "UpdateWorkoutTemplate(workoutTemplate=" + this.workoutTemplate + ")";
        }
    }
}
