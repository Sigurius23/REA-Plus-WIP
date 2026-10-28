package dv2;

import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.FilterOptions;
import eu2.C13645b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import o11.AbstractC27407m;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: dv2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Ldv2/e;", "", "c", "a", "b", "Ldv2/e$a;", "Ldv2/e$b;", "Ldv2/e$c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12394e {

    /* JADX INFO: renamed from: dv2.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ldv2/e$a;", "Ldv2/e;", "Lcom/whoop/design/util/TextResource;", "errorText", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12394e {

        /* JADX INFO: renamed from: b */
        public static final int f41963b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorText;

        public a(TextResource errorText) {
            AbstractC22676k.m65750j(errorText, "errorText");
            this.errorText = errorText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.errorText, ((a) other).errorText);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getErrorText() {
            return this.errorText;
        }

        public int hashCode() {
            return this.errorText.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("Error(errorText=", this.errorText, ")");
        }
    }

    /* JADX INFO: renamed from: dv2.e$b */
    @Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u001e\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0002!\"¨\u0006#À\u0006\u0003"}, m65681d2 = {"Ldv2/e$b;", "Ldv2/e;", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "searchQuery", "", "f", "()Z", "hideCta", "Leu2/b;", "Ldv2/b;", "a", "()Leu2/b;", "leftCta", "e", "rightCta", "", "Lo11/m$c$b;", "c", "()Ljava/util/List;", "selectedExercisesList", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "g", "()Lcom/whoop/weightlifting/data/domain/FilterOptions;", "filterOptions", "", "Ll83/k;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "Lcv2/a;", "b", "()Ljava/util/Set;", "selectedFilterOptions", "Ldv2/e$b$a;", "Ldv2/e$b$b;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b extends InterfaceC12394e {

        /* JADX INFO: renamed from: dv2.e$b$a */
        @Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b&\u00100R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b1\u00100R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b.\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b2\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010<\u001a\u0004\b6\u0010=R,\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b*\u0010?¨\u0006@"}, m65681d2 = {"Ldv2/e$b$a;", "Ldv2/e$b;", "", "Lo11/m$c;", "filteredExerciseList", "Lcom/whoop/design/util/TextResource;", "searchQuery", "Leu2/b;", "Ldv2/b;", "leftCta", "rightCta", "Lo11/m$c$b;", "selectedExercisesList", "Lm91/u;", "customExerciseTileOrInformation", "", "hideCta", "Ldv2/a;", "searchResultsEmptyState", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "filterOptions", "", "Ll83/k;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "Lcv2/a;", "selectedFilterOptions", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;Leu2/b;Leu2/b;Ljava/util/List;Lm91/u;ZLdv2/a;Lcom/whoop/weightlifting/data/domain/FilterOptions;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "i", "()Ljava/util/List;", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Leu2/b;", "()Leu2/b;", "e", "f", "Lm91/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lm91/u;", "g", "Z", "()Z", "Ldv2/a;", "j", "()Ldv2/a;", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "()Lcom/whoop/weightlifting/data/domain/FilterOptions;", "Ljava/util/Set;", "()Ljava/util/Set;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final List<AbstractC27407m.c> filteredExerciseList;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final TextResource searchQuery;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final C13645b<InterfaceC12391b> leftCta;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final C13645b<InterfaceC12391b> rightCta;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final List<AbstractC27407m.c.b> selectedExercisesList;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final InterfaceC25312u customExerciseTileOrInformation;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final boolean hideCta;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final C12390a searchResultsEmptyState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final FilterOptions filterOptions;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final Set<C23465k> selectedFilterOptions;

            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends AbstractC27407m.c> filteredExerciseList, TextResource searchQuery, C13645b<InterfaceC12391b> leftCta, C13645b<InterfaceC12391b> rightCta, List<AbstractC27407m.c.b> selectedExercisesList, InterfaceC25312u interfaceC25312u, boolean z4, C12390a c12390a, FilterOptions filterOptions, Set<? extends C23465k> selectedFilterOptions) {
                AbstractC22676k.m65750j(filteredExerciseList, "filteredExerciseList");
                AbstractC22676k.m65750j(searchQuery, "searchQuery");
                AbstractC22676k.m65750j(leftCta, "leftCta");
                AbstractC22676k.m65750j(rightCta, "rightCta");
                AbstractC22676k.m65750j(selectedExercisesList, "selectedExercisesList");
                AbstractC22676k.m65750j(filterOptions, "filterOptions");
                AbstractC22676k.m65750j(selectedFilterOptions, "selectedFilterOptions");
                this.filteredExerciseList = filteredExerciseList;
                this.searchQuery = searchQuery;
                this.leftCta = leftCta;
                this.rightCta = rightCta;
                this.selectedExercisesList = selectedExercisesList;
                this.customExerciseTileOrInformation = interfaceC25312u;
                this.hideCta = z4;
                this.searchResultsEmptyState = c12390a;
                this.filterOptions = filterOptions;
                this.selectedFilterOptions = selectedFilterOptions;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: a */
            public C13645b<InterfaceC12391b> mo34810a() {
                return this.leftCta;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: b */
            public Set<C23465k> mo34811b() {
                return this.selectedFilterOptions;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: c */
            public List<AbstractC27407m.c.b> mo34812c() {
                return this.selectedExercisesList;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: d, reason: from getter */
            public TextResource getSearchQuery() {
                return this.searchQuery;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: e */
            public C13645b<InterfaceC12391b> mo34814e() {
                return this.rightCta;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.filteredExerciseList, aVar.filteredExerciseList) && AbstractC22676k.m65745e(this.searchQuery, aVar.searchQuery) && AbstractC22676k.m65745e(this.leftCta, aVar.leftCta) && AbstractC22676k.m65745e(this.rightCta, aVar.rightCta) && AbstractC22676k.m65745e(this.selectedExercisesList, aVar.selectedExercisesList) && AbstractC22676k.m65745e(this.customExerciseTileOrInformation, aVar.customExerciseTileOrInformation) && this.hideCta == aVar.hideCta && AbstractC22676k.m65745e(this.searchResultsEmptyState, aVar.searchResultsEmptyState) && AbstractC22676k.m65745e(this.filterOptions, aVar.filterOptions) && AbstractC22676k.m65745e(this.selectedFilterOptions, aVar.selectedFilterOptions);
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: f, reason: from getter */
            public boolean getHideCta() {
                return this.hideCta;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: g, reason: from getter */
            public FilterOptions getFilterOptions() {
                return this.filterOptions;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public InterfaceC25312u getCustomExerciseTileOrInformation() {
                return this.customExerciseTileOrInformation;
            }

            public int hashCode() {
                int iM31983b = AbstractC11895b.m31983b((this.rightCta.hashCode() + ((this.leftCta.hashCode() + AbstractC31061c.m95625a(this.filteredExerciseList.hashCode() * 31, this.searchQuery, 31)) * 31)) * 31, 31, this.selectedExercisesList);
                InterfaceC25312u interfaceC25312u = this.customExerciseTileOrInformation;
                int iM8289b = AbstractC2875y.m8289b((iM31983b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.hideCta);
                C12390a c12390a = this.searchResultsEmptyState;
                return this.selectedFilterOptions.hashCode() + ((this.filterOptions.hashCode() + ((iM8289b + (c12390a != null ? c12390a.hashCode() : 0)) * 31)) * 31);
            }

            /* JADX INFO: renamed from: i */
            public final List<AbstractC27407m.c> m34818i() {
                return this.filteredExerciseList;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final C12390a getSearchResultsEmptyState() {
                return this.searchResultsEmptyState;
            }

            public String toString() {
                return "Filtered(filteredExerciseList=" + this.filteredExerciseList + ", searchQuery=" + this.searchQuery + ", leftCta=" + this.leftCta + ", rightCta=" + this.rightCta + ", selectedExercisesList=" + this.selectedExercisesList + ", customExerciseTileOrInformation=" + this.customExerciseTileOrInformation + ", hideCta=" + this.hideCta + ", searchResultsEmptyState=" + this.searchResultsEmptyState + ", filterOptions=" + this.filterOptions + ", selectedFilterOptions=" + this.selectedFilterOptions + ")";
            }
        }

        /* JADX INFO: renamed from: dv2.e$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b%\u0010/R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b0\u0010/R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b-\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b3\u00109R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b7\u0010;R,\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b)\u0010=¨\u0006>"}, m65681d2 = {"Ldv2/e$b$b;", "Ldv2/e$b;", "", "", "", "Lo11/m$c;", "categorizedExerciseList", "Lcom/whoop/design/util/TextResource;", "searchQuery", "Leu2/b;", "Ldv2/b;", "leftCta", "rightCta", "Lo11/m$c$b;", "selectedExercisesList", "Lm91/u;", "customExerciseTileOrInformation", "", "hideCta", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "filterOptions", "", "Ll83/k;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "Lcv2/a;", "selectedFilterOptions", "<init>", "(Ljava/util/Map;Lcom/whoop/design/util/TextResource;Leu2/b;Leu2/b;Ljava/util/List;Lm91/u;ZLcom/whoop/weightlifting/data/domain/FilterOptions;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/Map;", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Leu2/b;", "()Leu2/b;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lm91/u;", "i", "()Lm91/u;", "g", "Z", "()Z", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "()Lcom/whoop/weightlifting/data/domain/FilterOptions;", "Ljava/util/Set;", "()Ljava/util/Set;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41498b implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Map<String, List<AbstractC27407m.c>> categorizedExerciseList;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final TextResource searchQuery;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final C13645b<InterfaceC12391b> leftCta;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final C13645b<InterfaceC12391b> rightCta;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final List<AbstractC27407m.c.b> selectedExercisesList;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final InterfaceC25312u customExerciseTileOrInformation;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final boolean hideCta;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final FilterOptions filterOptions;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final Set<C23465k> selectedFilterOptions;

            /* JADX WARN: Multi-variable type inference failed */
            public C41498b(Map<String, ? extends List<? extends AbstractC27407m.c>> categorizedExerciseList, TextResource searchQuery, C13645b<InterfaceC12391b> leftCta, C13645b<InterfaceC12391b> rightCta, List<AbstractC27407m.c.b> selectedExercisesList, InterfaceC25312u interfaceC25312u, boolean z4, FilterOptions filterOptions, Set<? extends C23465k> selectedFilterOptions) {
                AbstractC22676k.m65750j(categorizedExerciseList, "categorizedExerciseList");
                AbstractC22676k.m65750j(searchQuery, "searchQuery");
                AbstractC22676k.m65750j(leftCta, "leftCta");
                AbstractC22676k.m65750j(rightCta, "rightCta");
                AbstractC22676k.m65750j(selectedExercisesList, "selectedExercisesList");
                AbstractC22676k.m65750j(filterOptions, "filterOptions");
                AbstractC22676k.m65750j(selectedFilterOptions, "selectedFilterOptions");
                this.categorizedExerciseList = categorizedExerciseList;
                this.searchQuery = searchQuery;
                this.leftCta = leftCta;
                this.rightCta = rightCta;
                this.selectedExercisesList = selectedExercisesList;
                this.customExerciseTileOrInformation = interfaceC25312u;
                this.hideCta = z4;
                this.filterOptions = filterOptions;
                this.selectedFilterOptions = selectedFilterOptions;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: a */
            public C13645b<InterfaceC12391b> mo34810a() {
                return this.leftCta;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: b */
            public Set<C23465k> mo34811b() {
                return this.selectedFilterOptions;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: c */
            public List<AbstractC27407m.c.b> mo34812c() {
                return this.selectedExercisesList;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: d, reason: from getter */
            public TextResource getSearchQuery() {
                return this.searchQuery;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: e */
            public C13645b<InterfaceC12391b> mo34814e() {
                return this.rightCta;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41498b)) {
                    return false;
                }
                C41498b c41498b = (C41498b) other;
                return AbstractC22676k.m65745e(this.categorizedExerciseList, c41498b.categorizedExerciseList) && AbstractC22676k.m65745e(this.searchQuery, c41498b.searchQuery) && AbstractC22676k.m65745e(this.leftCta, c41498b.leftCta) && AbstractC22676k.m65745e(this.rightCta, c41498b.rightCta) && AbstractC22676k.m65745e(this.selectedExercisesList, c41498b.selectedExercisesList) && AbstractC22676k.m65745e(this.customExerciseTileOrInformation, c41498b.customExerciseTileOrInformation) && this.hideCta == c41498b.hideCta && AbstractC22676k.m65745e(this.filterOptions, c41498b.filterOptions) && AbstractC22676k.m65745e(this.selectedFilterOptions, c41498b.selectedFilterOptions);
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: f, reason: from getter */
            public boolean getHideCta() {
                return this.hideCta;
            }

            @Override // dv2.InterfaceC12394e.b
            /* JADX INFO: renamed from: g, reason: from getter */
            public FilterOptions getFilterOptions() {
                return this.filterOptions;
            }

            /* JADX INFO: renamed from: h */
            public final Map<String, List<AbstractC27407m.c>> m34820h() {
                return this.categorizedExerciseList;
            }

            public int hashCode() {
                int iM31983b = AbstractC11895b.m31983b((this.rightCta.hashCode() + ((this.leftCta.hashCode() + AbstractC31061c.m95625a(this.categorizedExerciseList.hashCode() * 31, this.searchQuery, 31)) * 31)) * 31, 31, this.selectedExercisesList);
                InterfaceC25312u interfaceC25312u = this.customExerciseTileOrInformation;
                return this.selectedFilterOptions.hashCode() + ((this.filterOptions.hashCode() + AbstractC2875y.m8289b((iM31983b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.hideCta)) * 31);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public InterfaceC25312u getCustomExerciseTileOrInformation() {
                return this.customExerciseTileOrInformation;
            }

            public String toString() {
                return "Unfiltered(categorizedExerciseList=" + this.categorizedExerciseList + ", searchQuery=" + this.searchQuery + ", leftCta=" + this.leftCta + ", rightCta=" + this.rightCta + ", selectedExercisesList=" + this.selectedExercisesList + ", customExerciseTileOrInformation=" + this.customExerciseTileOrInformation + ", hideCta=" + this.hideCta + ", filterOptions=" + this.filterOptions + ", selectedFilterOptions=" + this.selectedFilterOptions + ")";
            }
        }

        /* JADX INFO: renamed from: a */
        C13645b<InterfaceC12391b> mo34810a();

        /* JADX INFO: renamed from: b */
        Set<C23465k> mo34811b();

        /* JADX INFO: renamed from: c */
        List<AbstractC27407m.c.b> mo34812c();

        /* JADX INFO: renamed from: d */
        TextResource getSearchQuery();

        /* JADX INFO: renamed from: e */
        C13645b<InterfaceC12391b> mo34814e();

        /* JADX INFO: renamed from: f */
        boolean getHideCta();

        /* JADX INFO: renamed from: g */
        FilterOptions getFilterOptions();
    }

    /* JADX INFO: renamed from: dv2.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldv2/e$c;", "Ldv2/e;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC12394e {

        /* JADX INFO: renamed from: a */
        public static final c f41984a = new c();

        private c() {
        }
    }
}
