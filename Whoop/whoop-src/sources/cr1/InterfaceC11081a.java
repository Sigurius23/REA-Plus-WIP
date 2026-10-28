package cr1;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cr1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lcr1/a;", "", "e", "c", "d", "b", "a", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcr1/a$a;", "Lcr1/a$b;", "Lcr1/a$c;", "Lcr1/a$d;", "Lcr1/a$e;", "Lcr1/a$f;", "Lcr1/a$g;", "Lcr1/a$h;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11081a {

    /* JADX INFO: renamed from: cr1.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lcr1/a$a;", "Lcr1/a;", "", "integrationId", "integrationIdFor3P", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC11081a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String integrationIdFor3P;

        public a(String integrationId, String integrationIdFor3P) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            AbstractC22676k.m65750j(integrationIdFor3P, "integrationIdFor3P");
            this.integrationId = integrationId;
            this.integrationIdFor3P = integrationIdFor3P;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIntegrationIdFor3P() {
            return this.integrationIdFor3P;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.integrationId, aVar.integrationId) && AbstractC22676k.m65745e(this.integrationIdFor3P, aVar.integrationIdFor3P);
        }

        public int hashCode() {
            return this.integrationIdFor3P.hashCode() + (this.integrationId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Disconnect3PIntegration(integrationId=", this.integrationId, ", integrationIdFor3P=", this.integrationIdFor3P, ")");
        }
    }

    /* JADX INFO: renamed from: cr1.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcr1/a$b;", "Lcr1/a;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC11081a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public b(String integrationId) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            this.integrationId = integrationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.integrationId, ((b) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DisconnectIntegration(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: cr1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcr1/a$c;", "Lcr1/a;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC11081a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public c(String integrationId) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            this.integrationId = integrationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.integrationId, ((c) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LoadIntegrationDetailsData(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: cr1.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcr1/a$d;", "Lcr1/a;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC11081a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public d(String integrationId) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            this.integrationId = integrationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.integrationId, ((d) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LoadIntegrationDisclaimerData(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: cr1.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcr1/a$e;", "Lcr1/a;", "<init>", "()V", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC11081a {

        /* JADX INFO: renamed from: a */
        public static final e f35047a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: cr1.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lcr1/a$f;", "Lcr1/a;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIntegrationId", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC11081a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public f(String integrationId) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            this.integrationId = integrationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.integrationId, ((f) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OAuthStarted(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: cr1.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcr1/a$g;", "Lcr1/a;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC11081a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public g(String integrationId) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            this.integrationId = integrationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.integrationId, ((g) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TriggerSyncAndRefresh(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: cr1.a$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcr1/a$h;", "Lcr1/a;", "", "integrationId", "type", "", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC11081a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isEnabled;

        public h(String integrationId, String type, boolean z4) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            AbstractC22676k.m65750j(type, "type");
            this.integrationId = integrationId;
            this.type = type;
            this.isEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.integrationId, hVar.integrationId) && AbstractC22676k.m65745e(this.type, hVar.type) && this.isEnabled == hVar.isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled) + AbstractC11266d.m30450d(this.integrationId.hashCode() * 31, 31, this.type);
        }

        public String toString() {
            String str = this.integrationId;
            String str2 = this.type;
            return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("UpdatePrivacyControl(integrationId=", str, ", type=", str2, ", isEnabled="), this.isEnabled, ")");
        }
    }
}
