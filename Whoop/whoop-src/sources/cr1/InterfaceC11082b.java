package cr1;

import com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel;
import com.whoop.integrations.domain.models.IntegrationsDisclaimerModel;
import com.whoop.integrations.domain.models.IntegrationsDiscoveryComponentsModel;
import com.whoop.integrations.domain.models.p061v2.IntegrationsDetailsV2ComponentsModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ir1.EnumC20861b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cr1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lcr1/b;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "a", "j", "k", "f", "g", "b", "d", "c", "e", "Lcr1/b$a;", "Lcr1/b$e;", "Lcr1/b$f;", "Lcr1/b$g;", "Lcr1/b$h;", "Lcr1/b$i;", "Lcr1/b$j;", "Lcr1/b$k;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11082b {

    /* JADX INFO: renamed from: cr1.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcr1/b$a;", "Lcr1/b;", "<init>", "()V", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC11082b {

        /* JADX INFO: renamed from: a */
        public static final a f35053a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: cr1.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcr1/b$b;", "Lcr1/b$g;", "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "data", "<init>", "(Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "()Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final IntegrationsDetailsComponentsModel data;

        public b(IntegrationsDetailsComponentsModel data) {
            AbstractC22676k.m65750j(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IntegrationsDetailsComponentsModel getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.data, ((b) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "IntegrationDetails(data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: cr1.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcr1/b$c;", "Lcr1/b$g;", "Lir1/b;", "integration", "<init>", "(Lir1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lir1/b;", "()Lir1/b;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC20861b integration;

        public c(EnumC20861b integration) {
            AbstractC22676k.m65750j(integration, "integration");
            this.integration = integration;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC20861b getIntegration() {
            return this.integration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.integration == ((c) other).integration;
        }

        public int hashCode() {
            return this.integration.hashCode();
        }

        public String toString() {
            return "IntegrationDetailsSpecial(integration=" + this.integration + ")";
        }
    }

    /* JADX INFO: renamed from: cr1.b$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcr1/b$d;", "Lcr1/b$g;", "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;", "data", "<init>", "(Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;", "()Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final IntegrationsDetailsV2ComponentsModel data;

        public d(IntegrationsDetailsV2ComponentsModel data) {
            AbstractC22676k.m65750j(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IntegrationsDetailsV2ComponentsModel getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.data, ((d) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "IntegrationDetailsV2(data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: cr1.b$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcr1/b$e;", "Lcr1/b;", "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;", "data", "<init>", "(Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;", "()Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC11082b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final IntegrationsDisclaimerModel data;

        public e(IntegrationsDisclaimerModel data) {
            AbstractC22676k.m65750j(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IntegrationsDisclaimerModel getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.data, ((e) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "IntegrationDisclaimer(data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: cr1.b$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcr1/b$f;", "Lcr1/b;", "Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;", "data", "<init>", "(Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;", "()Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC11082b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final IntegrationsDiscoveryComponentsModel data;

        public f(IntegrationsDiscoveryComponentsModel data) {
            AbstractC22676k.m65750j(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IntegrationsDiscoveryComponentsModel getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.data, ((f) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "IntegrationsDiscovery(data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: cr1.b$g */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lcr1/b$g;", "Lcr1/b;", "Lcr1/b$b;", "Lcr1/b$c;", "Lcr1/b$d;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface g extends InterfaceC11082b {
    }

    /* JADX INFO: renamed from: cr1.b$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcr1/b$h;", "Lcr1/b;", "Lcr1/d;", "loadingType", "<init>", "(Lcr1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcr1/d;", "()Lcr1/d;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC11082b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC11084d loadingType;

        public h(EnumC11084d loadingType) {
            AbstractC22676k.m65750j(loadingType, "loadingType");
            this.loadingType = loadingType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC11084d getLoadingType() {
            return this.loadingType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.loadingType == ((h) other).loadingType;
        }

        public int hashCode() {
            return this.loadingType.hashCode();
        }

        public String toString() {
            return "Loading(loadingType=" + this.loadingType + ")";
        }

        public /* synthetic */ h(EnumC11084d enumC11084d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? EnumC11084d.OTHER : enumC11084d);
        }
    }

    /* JADX INFO: renamed from: cr1.b$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcr1/b$i;", "Lcr1/b;", "<init>", "()V", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC11082b {

        /* JADX INFO: renamed from: a */
        public static final i f35060a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: cr1.b$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcr1/b$j;", "Lcr1/b;", "<init>", "()V", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC11082b {

        /* JADX INFO: renamed from: a */
        public static final j f35061a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: cr1.b$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcr1/b$k;", "Lcr1/b;", "<init>", "()V", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC11082b {

        /* JADX INFO: renamed from: a */
        public static final k f35062a = new k();

        private k() {
        }
    }
}
