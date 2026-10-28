package vc0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import com.whoop.metrics.common.ScreenState;
import ep0.C13404j;
import fy1.InterfaceC14875k;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: vc0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lvc0/c;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lvc0/c$a;", "Lvc0/c$b;", "Lvc0/c$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35876c implements InterfaceC14875k {

    /* JADX INFO: renamed from: vc0.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvc0/c$a;", "Lvc0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC35876c {

        /* JADX INFO: renamed from: b */
        public static final a f152762b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vc0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvc0/c$b;", "Lvc0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC35876c {

        /* JADX INFO: renamed from: b */
        public static final b f152763b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vc0.c$c */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, m65681d2 = {"Lvc0/c$c;", "Lvc0/c;", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "Lm91/u;", "sections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "Lep0/j;", "screenContextMetadata", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Lep0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "c", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "Lep0/j;", "()Lep0/j;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC35876c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final NavigationBarModel navigationBar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<InterfaceC25312u> sections;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(NavigationBarModel navigationBar, List<? extends InterfaceC25312u> sections, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, C13404j c13404j) {
            super(null);
            AbstractC22676k.m65750j(navigationBar, "navigationBar");
            AbstractC22676k.m65750j(sections, "sections");
            this.navigationBar = navigationBar;
            this.sections = sections;
            this.analyticsData = advancedLabsAnalyticsDomainModel;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final NavigationBarModel getNavigationBar() {
            return this.navigationBar;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC25312u> m113920e() {
            return this.sections;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.navigationBar, cVar.navigationBar) && AbstractC22676k.m65745e(this.sections, cVar.sections) && AbstractC22676k.m65745e(this.analyticsData, cVar.analyticsData) && AbstractC22676k.m65745e(this.screenContextMetadata, cVar.screenContextMetadata);
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.navigationBar.hashCode() * 31, 31, this.sections);
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            int iHashCode = (iM31983b + (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode())) * 31;
            C13404j c13404j = this.screenContextMetadata;
            return iHashCode + (c13404j != null ? c13404j.hashCode() : 0);
        }

        public String toString() {
            return "Success(navigationBar=" + this.navigationBar + ", sections=" + this.sections + ", analyticsData=" + this.analyticsData + ", screenContextMetadata=" + this.screenContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC35876c(DefaultConstructorMarker defaultConstructorMarker) {
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

    private AbstractC35876c() {
    }
}
