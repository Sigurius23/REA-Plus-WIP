package qa0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;

/* JADX INFO: renamed from: qa0.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m65681d2 = {"Lqa0/c;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "Lqa0/c$a;", "Lqa0/c$b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30111c implements InterfaceC14875k {

    /* JADX INFO: renamed from: qa0.c$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, m65681d2 = {"Lqa0/c$b;", "Lqa0/c;", "", "navigationTitle", "", "Lm91/u;", "sections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "", "displayRefreshingSpinner", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC30111c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String navigationTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<InterfaceC25312u> sections;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean displayRefreshingSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String navigationTitle, List<? extends InterfaceC25312u> sections, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            AbstractC22676k.m65750j(sections, "sections");
            this.navigationTitle = navigationTitle;
            this.sections = sections;
            this.analyticsData = advancedLabsAnalyticsDomainModel;
            this.displayRefreshingSpinner = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getDisplayRefreshingSpinner() {
            return this.displayRefreshingSpinner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNavigationTitle() {
            return this.navigationTitle;
        }

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC25312u> m92246e() {
            return this.sections;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.navigationTitle, bVar.navigationTitle) && AbstractC22676k.m65745e(this.sections, bVar.sections) && AbstractC22676k.m65745e(this.analyticsData, bVar.analyticsData) && this.displayRefreshingSpinner == bVar.displayRefreshingSpinner;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.navigationTitle.hashCode() * 31, 31, this.sections);
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            return Boolean.hashCode(this.displayRefreshingSpinner) + ((iM31983b + (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode())) * 31);
        }

        public String toString() {
            String str = this.navigationTitle;
            List<InterfaceC25312u> list = this.sections;
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            boolean z4 = this.displayRefreshingSpinner;
            StringBuilder sbM94766o = AbstractC30802r.m94766o("Success(navigationTitle=", str, ", sections=", ", analyticsData=", list);
            sbM94766o.append(advancedLabsAnalyticsDomainModel);
            sbM94766o.append(", displayRefreshingSpinner=");
            sbM94766o.append(z4);
            sbM94766o.append(")");
            return sbM94766o.toString();
        }
    }

    public /* synthetic */ AbstractC30111c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (!(this instanceof a)) {
            if (this instanceof b) {
                return ScreenState.SUCCESS;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC33208p0 type = ((a) this).getModalState().getType();
        if (AbstractC22676k.m65745e(type, AbstractC33208p0.c.f138471e)) {
            return ScreenState.LOADING;
        }
        if (type instanceof AbstractC33208p0.b) {
            return ScreenState.ERROR;
        }
        return type instanceof AbstractC33208p0.h ? ScreenState.SUCCESS : ScreenState.OTHER;
    }

    private AbstractC30111c() {
    }

    /* JADX INFO: renamed from: qa0.c$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lqa0/c$a;", "Lqa0/c;", "Lsz0/q0;", "modalState", "Lqa0/a;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Lsz0/q0;Lqa0/a;Lqa0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsz0/q0;", "()Lsz0/q0;", "c", "Lqa0/a;", "()Lqa0/a;", "d", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC30111c {

        /* JADX INFO: renamed from: e */
        public static final int f122935e = C33211q0.f138501k;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C33211q0 modalState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC30109a primaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC30109a secondaryClickEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C33211q0 modalState, InterfaceC30109a interfaceC30109a, InterfaceC30109a interfaceC30109a2) {
            super(null);
            AbstractC22676k.m65750j(modalState, "modalState");
            this.modalState = modalState;
            this.primaryClickEvent = interfaceC30109a;
            this.secondaryClickEvent = interfaceC30109a2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C33211q0 getModalState() {
            return this.modalState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC30109a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC30109a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.modalState, aVar.modalState) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.modalState.hashCode() * 31;
            InterfaceC30109a interfaceC30109a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC30109a == null ? 0 : interfaceC30109a.hashCode())) * 31;
            InterfaceC30109a interfaceC30109a2 = this.secondaryClickEvent;
            return iHashCode2 + (interfaceC30109a2 != null ? interfaceC30109a2.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(modalState=" + this.modalState + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ a(C33211q0 c33211q0, InterfaceC30109a interfaceC30109a, InterfaceC30109a interfaceC30109a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC30109a, (i13 & 4) != 0 ? null : interfaceC30109a2);
        }
    }
}
