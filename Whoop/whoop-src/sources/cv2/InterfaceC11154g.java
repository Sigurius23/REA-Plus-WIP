package cv2;

import com.whoop.weightlifting.data.domain.FilterOptions;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.C25235a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: cv2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcv2/g;", "", "b", "a", "Lcv2/g$a;", "Lcv2/g$b;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11154g {

    /* JADX INFO: renamed from: cv2.g$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcv2/g$b;", "Lcv2/g;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC11154g {

        /* JADX INFO: renamed from: a */
        public static final b f35703a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: cv2.g$a */
    @Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0090\u0001\u0010\u0018\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0011HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u00105\u001a\u0004\b3\u00106R)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00118\u0006¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Lcv2/g$a;", "Lcv2/g;", "", "", "Lcv2/b;", "exerciseList", "", "selectedExerciseIds", "searchQuery", "Lcv2/c;", "exerciseSelectionState", "", "inLinkWorkoutFlow", "isLinkingCustomExercise", "exerciseIdToLink", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "filterOptions", "", "Ll83/k;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "Lcv2/a;", "selectedFilterOptions", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lcv2/c;ZZLjava/lang/String;Lcom/whoop/weightlifting/data/domain/FilterOptions;Ljava/util/Set;)V", "a", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lcv2/c;ZZLjava/lang/String;Lcom/whoop/weightlifting/data/domain/FilterOptions;Ljava/util/Set;)Lcv2/g$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "b", "Ljava/util/List;", "i", "()Ljava/util/List;", "c", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcv2/c;", "e", "()Lcv2/c;", "Z", "g", "()Z", "f", "k", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "()Lcom/whoop/weightlifting/data/domain/FilterOptions;", "Ljava/util/Set;", "j", "()Ljava/util/Set;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC11154g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, C11149b> exerciseList;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> selectedExerciseIds;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String searchQuery;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC11150c exerciseSelectionState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean inLinkWorkoutFlow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isLinkingCustomExercise;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String exerciseIdToLink;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final FilterOptions filterOptions;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Set<C23465k> selectedFilterOptions;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<String, C11149b> exerciseList, List<String> selectedExerciseIds, String searchQuery, InterfaceC11150c exerciseSelectionState, boolean z4, boolean z13, String str, FilterOptions filterOptions, Set<? extends C23465k> selectedFilterOptions) {
            AbstractC22676k.m65750j(exerciseList, "exerciseList");
            AbstractC22676k.m65750j(selectedExerciseIds, "selectedExerciseIds");
            AbstractC22676k.m65750j(searchQuery, "searchQuery");
            AbstractC22676k.m65750j(exerciseSelectionState, "exerciseSelectionState");
            AbstractC22676k.m65750j(filterOptions, "filterOptions");
            AbstractC22676k.m65750j(selectedFilterOptions, "selectedFilterOptions");
            this.exerciseList = exerciseList;
            this.selectedExerciseIds = selectedExerciseIds;
            this.searchQuery = searchQuery;
            this.exerciseSelectionState = exerciseSelectionState;
            this.inLinkWorkoutFlow = z4;
            this.isLinkingCustomExercise = z13;
            this.exerciseIdToLink = str;
            this.filterOptions = filterOptions;
            this.selectedFilterOptions = selectedFilterOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m30167b(a aVar, Map map, List list, String str, InterfaceC11150c interfaceC11150c, boolean z4, boolean z13, String str2, FilterOptions filterOptions, Set set, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                map = aVar.exerciseList;
            }
            if ((i13 & 2) != 0) {
                list = aVar.selectedExerciseIds;
            }
            if ((i13 & 4) != 0) {
                str = aVar.searchQuery;
            }
            if ((i13 & 8) != 0) {
                interfaceC11150c = aVar.exerciseSelectionState;
            }
            if ((i13 & 16) != 0) {
                z4 = aVar.inLinkWorkoutFlow;
            }
            if ((i13 & 32) != 0) {
                z13 = aVar.isLinkingCustomExercise;
            }
            if ((i13 & 64) != 0) {
                str2 = aVar.exerciseIdToLink;
            }
            if ((i13 & 128) != 0) {
                filterOptions = aVar.filterOptions;
            }
            if ((i13 & 256) != 0) {
                set = aVar.selectedFilterOptions;
            }
            FilterOptions filterOptions2 = filterOptions;
            Set set2 = set;
            boolean z14 = z13;
            String str3 = str2;
            boolean z15 = z4;
            String str4 = str;
            return aVar.m30168a(map, list, str4, interfaceC11150c, z15, z14, str3, filterOptions2, set2);
        }

        /* JADX INFO: renamed from: a */
        public final a m30168a(Map<String, C11149b> exerciseList, List<String> selectedExerciseIds, String searchQuery, InterfaceC11150c exerciseSelectionState, boolean inLinkWorkoutFlow, boolean isLinkingCustomExercise, String exerciseIdToLink, FilterOptions filterOptions, Set<? extends C23465k> selectedFilterOptions) {
            AbstractC22676k.m65750j(exerciseList, "exerciseList");
            AbstractC22676k.m65750j(selectedExerciseIds, "selectedExerciseIds");
            AbstractC22676k.m65750j(searchQuery, "searchQuery");
            AbstractC22676k.m65750j(exerciseSelectionState, "exerciseSelectionState");
            AbstractC22676k.m65750j(filterOptions, "filterOptions");
            AbstractC22676k.m65750j(selectedFilterOptions, "selectedFilterOptions");
            return new a(exerciseList, selectedExerciseIds, searchQuery, exerciseSelectionState, inLinkWorkoutFlow, isLinkingCustomExercise, exerciseIdToLink, filterOptions, selectedFilterOptions);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getExerciseIdToLink() {
            return this.exerciseIdToLink;
        }

        /* JADX INFO: renamed from: d */
        public final Map<String, C11149b> m30170d() {
            return this.exerciseList;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC11150c getExerciseSelectionState() {
            return this.exerciseSelectionState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.exerciseList, aVar.exerciseList) && AbstractC22676k.m65745e(this.selectedExerciseIds, aVar.selectedExerciseIds) && AbstractC22676k.m65745e(this.searchQuery, aVar.searchQuery) && AbstractC22676k.m65745e(this.exerciseSelectionState, aVar.exerciseSelectionState) && this.inLinkWorkoutFlow == aVar.inLinkWorkoutFlow && this.isLinkingCustomExercise == aVar.isLinkingCustomExercise && AbstractC22676k.m65745e(this.exerciseIdToLink, aVar.exerciseIdToLink) && AbstractC22676k.m65745e(this.filterOptions, aVar.filterOptions) && AbstractC22676k.m65745e(this.selectedFilterOptions, aVar.selectedFilterOptions);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final FilterOptions getFilterOptions() {
            return this.filterOptions;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getInLinkWorkoutFlow() {
            return this.inLinkWorkoutFlow;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.exerciseSelectionState.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.exerciseList.hashCode() * 31, 31, this.selectedExerciseIds), 31, this.searchQuery)) * 31, 31, this.inLinkWorkoutFlow), 31, this.isLinkingCustomExercise);
            String str = this.exerciseIdToLink;
            return this.selectedFilterOptions.hashCode() + ((this.filterOptions.hashCode() + ((iM8289b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        /* JADX INFO: renamed from: i */
        public final List<String> m30175i() {
            return this.selectedExerciseIds;
        }

        /* JADX INFO: renamed from: j */
        public final Set<C23465k> m30176j() {
            return this.selectedFilterOptions;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsLinkingCustomExercise() {
            return this.isLinkingCustomExercise;
        }

        public String toString() {
            Map<String, C11149b> map = this.exerciseList;
            List<String> list = this.selectedExerciseIds;
            String str = this.searchQuery;
            InterfaceC11150c interfaceC11150c = this.exerciseSelectionState;
            boolean z4 = this.inLinkWorkoutFlow;
            boolean z13 = this.isLinkingCustomExercise;
            String str2 = this.exerciseIdToLink;
            FilterOptions filterOptions = this.filterOptions;
            Set<C23465k> set = this.selectedFilterOptions;
            StringBuilder sb4 = new StringBuilder("Loaded(exerciseList=");
            sb4.append(map);
            sb4.append(", selectedExerciseIds=");
            sb4.append(list);
            sb4.append(", searchQuery=");
            sb4.append(str);
            sb4.append(", exerciseSelectionState=");
            sb4.append(interfaceC11150c);
            sb4.append(", inLinkWorkoutFlow=");
            AbstractC38963t7.m124392v(sb4, z4, ", isLinkingCustomExercise=", z13, ", exerciseIdToLink=");
            sb4.append(str2);
            sb4.append(", filterOptions=");
            sb4.append(filterOptions);
            sb4.append(", selectedFilterOptions=");
            sb4.append(set);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ a(Map map, List list, String str, InterfaceC11150c interfaceC11150c, boolean z4, boolean z13, String str2, FilterOptions filterOptions, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? InterfaceC11150c.a.f35683a : interfaceC11150c, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? null : str2, filterOptions, (i13 & 256) != 0 ? C25235a0.f99113w : set);
        }
    }
}
