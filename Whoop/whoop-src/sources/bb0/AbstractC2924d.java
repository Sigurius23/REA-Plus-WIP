package bb0;

import a01.EnumC0093m;
import androidx.core.app.NotificationCompat;
import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.metrics.common.ScreenState;
import ep0.C13404j;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bb0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lbb0/d;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lbb0/d$a;", "Lbb0/d$b;", "Lbb0/d$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2924d implements InterfaceC14875k {

    /* JADX INFO: renamed from: bb0.d$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lbb0/d$a;", "Lbb0/d;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC2924d {

        /* JADX INFO: renamed from: b */
        public static final a f11782b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: bb0.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lbb0/d$b;", "Lbb0/d;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC2924d {

        /* JADX INFO: renamed from: b */
        public static final b f11783b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: bb0.d$c */
    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b&\u0010-¨\u0006."}, m65681d2 = {"Lbb0/d$c;", "Lbb0/d;", "", "biomarkerId", "navigationTitle", "Lbb0/a;", "header", "", "Lm91/u;", "sections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "La01/m;", NotificationCompat.CATEGORY_STATUS, "Lep0/j;", "screenContextMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbb0/a;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;La01/m;Lep0/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "e", "d", "Lbb0/a;", "()Lbb0/a;", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "La01/m;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()La01/m;", "Lep0/j;", "()Lep0/j;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC2924d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String biomarkerId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String navigationTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C2921a header;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<InterfaceC25312u> sections;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final EnumC0093m status;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String biomarkerId, String navigationTitle, C2921a header, List<? extends InterfaceC25312u> sections, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, EnumC0093m status, C13404j c13404j) {
            super(null);
            AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(sections, "sections");
            AbstractC22676k.m65750j(status, "status");
            this.biomarkerId = biomarkerId;
            this.navigationTitle = navigationTitle;
            this.header = header;
            this.sections = sections;
            this.analyticsData = advancedLabsAnalyticsDomainModel;
            this.status = status;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBiomarkerId() {
            return this.biomarkerId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C2921a getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getNavigationTitle() {
            return this.navigationTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.biomarkerId, cVar.biomarkerId) && AbstractC22676k.m65745e(this.navigationTitle, cVar.navigationTitle) && AbstractC22676k.m65745e(this.header, cVar.header) && AbstractC22676k.m65745e(this.sections, cVar.sections) && AbstractC22676k.m65745e(this.analyticsData, cVar.analyticsData) && this.status == cVar.status && AbstractC22676k.m65745e(this.screenContextMetadata, cVar.screenContextMetadata);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        /* JADX INFO: renamed from: g */
        public final List<InterfaceC25312u> m8529g() {
            return this.sections;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final EnumC0093m getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b((this.header.hashCode() + AbstractC11266d.m30450d(this.biomarkerId.hashCode() * 31, 31, this.navigationTitle)) * 31, 31, this.sections);
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            int iHashCode = (this.status.hashCode() + ((iM31983b + (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode())) * 31)) * 31;
            C13404j c13404j = this.screenContextMetadata;
            return iHashCode + (c13404j != null ? c13404j.hashCode() : 0);
        }

        public String toString() {
            String str = this.biomarkerId;
            String str2 = this.navigationTitle;
            C2921a c2921a = this.header;
            List<InterfaceC25312u> list = this.sections;
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            EnumC0093m enumC0093m = this.status;
            C13404j c13404j = this.screenContextMetadata;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Success(biomarkerId=", str, ", navigationTitle=", str2, ", header=");
            sbM32001t.append(c2921a);
            sbM32001t.append(", sections=");
            sbM32001t.append(list);
            sbM32001t.append(", analyticsData=");
            sbM32001t.append(advancedLabsAnalyticsDomainModel);
            sbM32001t.append(", status=");
            sbM32001t.append(enumC0093m);
            sbM32001t.append(", screenContextMetadata=");
            sbM32001t.append(c13404j);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    public /* synthetic */ AbstractC2924d(DefaultConstructorMarker defaultConstructorMarker) {
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

    private AbstractC2924d() {
    }
}
