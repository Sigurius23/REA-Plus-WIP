package oe0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.C33742a;

/* JADX INFO: renamed from: oe0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Loe0/e;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Loe0/e$a;", "Loe0/e$b;", "Loe0/e$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27870e implements InterfaceC14875k {

    /* JADX INFO: renamed from: oe0.e$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loe0/e$a;", "Loe0/e;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC27870e {

        /* JADX INFO: renamed from: b */
        public static final a f112332b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oe0.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loe0/e$b;", "Loe0/e;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC27870e {

        /* JADX INFO: renamed from: b */
        public static final b f112333b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oe0.e$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, m65681d2 = {"Loe0/e$c;", "Loe0/e;", "Lte0/a;", "navigationBar", "", "title", "subtitle", "Loe0/a;", "paginatedRecords", "", "isLoadingMore", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "<init>", "(Lte0/a;Ljava/lang/String;Ljava/lang/String;Loe0/a;ZLcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lte0/a;", "c", "()Lte0/a;", "Ljava/lang/String;", "f", "d", "e", "Loe0/a;", "()Loe0/a;", "Z", "g", "()Z", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC27870e {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C33742a navigationBar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C27866a paginatedRecords;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isLoadingMore;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C33742a navigationBar, String title, String subtitle, C27866a paginatedRecords, boolean z4, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
            super(null);
            AbstractC22676k.m65750j(navigationBar, "navigationBar");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(paginatedRecords, "paginatedRecords");
            this.navigationBar = navigationBar;
            this.title = title;
            this.subtitle = subtitle;
            this.paginatedRecords = paginatedRecords;
            this.isLoadingMore = z4;
            this.analyticsData = advancedLabsAnalyticsDomainModel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C33742a getNavigationBar() {
            return this.navigationBar;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C27866a getPaginatedRecords() {
            return this.paginatedRecords;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.navigationBar, cVar.navigationBar) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.paginatedRecords, cVar.paginatedRecords) && this.isLoadingMore == cVar.isLoadingMore && AbstractC22676k.m65745e(this.analyticsData, cVar.analyticsData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsLoadingMore() {
            return this.isLoadingMore;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b((this.paginatedRecords.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31, 31, this.isLoadingMore);
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            return iM8289b + (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode());
        }

        public String toString() {
            return "Success(navigationBar=" + this.navigationBar + ", title=" + this.title + ", subtitle=" + this.subtitle + ", paginatedRecords=" + this.paginatedRecords + ", isLoadingMore=" + this.isLoadingMore + ", analyticsData=" + this.analyticsData + ")";
        }
    }

    public /* synthetic */ AbstractC27870e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof b) {
            return ScreenState.LOADING;
        }
        if (this instanceof a) {
            return ScreenState.ERROR;
        }
        if (this instanceof c) {
            return ScreenState.SUCCESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC27870e() {
    }
}
