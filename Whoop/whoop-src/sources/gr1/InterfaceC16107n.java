package gr1;

import com.whoop.whoopaction.domain.models.Action;
import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gr1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 À\u0006\u0003"}, m65681d2 = {"Lgr1/n;", "", "l", "e", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "c", "b", "n", "a", "d", "i", "j", "o", "k", "m", "Lgr1/n$a;", "Lgr1/n$b;", "Lgr1/n$c;", "Lgr1/n$d;", "Lgr1/n$e;", "Lgr1/n$f;", "Lgr1/n$g;", "Lgr1/n$h;", "Lgr1/n$i;", "Lgr1/n$j;", "Lgr1/n$k;", "Lgr1/n$l;", "Lgr1/n$m;", "Lgr1/n$n;", "Lgr1/n$o;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC16107n {

    /* JADX INFO: renamed from: gr1.n$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr1/n$a;", "Lgr1/n;", "", "analyticsEventsKey", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String analyticsEventsKey;

        public a(String analyticsEventsKey) {
            AbstractC22676k.m65750j(analyticsEventsKey, "analyticsEventsKey");
            this.analyticsEventsKey = analyticsEventsKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnalyticsEventsKey() {
            return this.analyticsEventsKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.analyticsEventsKey, ((a) other).analyticsEventsKey);
        }

        public int hashCode() {
            return this.analyticsEventsKey.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ConnectButtonClicked(analyticsEventsKey=", this.analyticsEventsKey, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lgr1/n$b;", "Lgr1/n;", "", "integrationId", "integrationIdFor3P", "analyticsEventsKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getAnalyticsEventsKey", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String integrationIdFor3P;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String analyticsEventsKey;

        public b(String integrationId, String integrationIdFor3P, String analyticsEventsKey) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            AbstractC22676k.m65750j(integrationIdFor3P, "integrationIdFor3P");
            AbstractC22676k.m65750j(analyticsEventsKey, "analyticsEventsKey");
            this.integrationId = integrationId;
            this.integrationIdFor3P = integrationIdFor3P;
            this.analyticsEventsKey = analyticsEventsKey;
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
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.integrationId, bVar.integrationId) && AbstractC22676k.m65745e(this.integrationIdFor3P, bVar.integrationIdFor3P) && AbstractC22676k.m65745e(this.analyticsEventsKey, bVar.analyticsEventsKey);
        }

        public int hashCode() {
            return this.analyticsEventsKey.hashCode() + AbstractC11266d.m30450d(this.integrationId.hashCode() * 31, 31, this.integrationIdFor3P);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.analyticsEventsKey, ")", AbstractC11895b.m32001t("Disconnect3PButtonClicked(integrationId=", this.integrationId, ", integrationIdFor3P=", this.integrationIdFor3P, ", analyticsEventsKey="));
        }
    }

    /* JADX INFO: renamed from: gr1.n$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lgr1/n$c;", "Lgr1/n;", "", "integrationId", "analyticsEventsKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String analyticsEventsKey;

        public c(String integrationId, String analyticsEventsKey) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            AbstractC22676k.m65750j(analyticsEventsKey, "analyticsEventsKey");
            this.integrationId = integrationId;
            this.analyticsEventsKey = analyticsEventsKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnalyticsEventsKey() {
            return this.analyticsEventsKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.integrationId, cVar.integrationId) && AbstractC22676k.m65745e(this.analyticsEventsKey, cVar.analyticsEventsKey);
        }

        public int hashCode() {
            return this.analyticsEventsKey.hashCode() + (this.integrationId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("DisconnectButtonClicked(integrationId=", this.integrationId, ", analyticsEventsKey=", this.analyticsEventsKey, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr1/n$d;", "Lgr1/n;", "", "analyticsEventsKey", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String analyticsEventsKey;

        public d(String analyticsEventsKey) {
            AbstractC22676k.m65750j(analyticsEventsKey, "analyticsEventsKey");
            this.analyticsEventsKey = analyticsEventsKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnalyticsEventsKey() {
            return this.analyticsEventsKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.analyticsEventsKey, ((d) other).analyticsEventsKey);
        }

        public int hashCode() {
            return this.analyticsEventsKey.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DisconnectPopupOpened(analyticsEventsKey=", this.analyticsEventsKey, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lgr1/n$e;", "Lgr1/n;", "", "integrationId", "analyticsEventsKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String analyticsEventsKey;

        public e(String integrationId, String analyticsEventsKey) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            AbstractC22676k.m65750j(analyticsEventsKey, "analyticsEventsKey");
            this.integrationId = integrationId;
            this.analyticsEventsKey = analyticsEventsKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnalyticsEventsKey() {
            return this.analyticsEventsKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.integrationId, eVar.integrationId) && AbstractC22676k.m65745e(this.analyticsEventsKey, eVar.analyticsEventsKey);
        }

        public int hashCode() {
            return this.analyticsEventsKey.hashCode() + (this.integrationId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("IntegrationClicked(integrationId=", this.integrationId, ", analyticsEventsKey=", this.analyticsEventsKey, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr1/n$f;", "Lgr1/n;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public f(String integrationId) {
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
            return (other instanceof f) && AbstractC22676k.m65745e(this.integrationId, ((f) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("IntegrationDeeplink(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr1/n$g;", "Lgr1/n;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC16107n {

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
            return AbstractC11895b.m31996o("LoadDisclaimerScreen(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgr1/n$h;", "Lgr1/n;", "<init>", "()V", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC16107n {

        /* JADX INFO: renamed from: a */
        public static final h f61108a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: gr1.n$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr1/n$i;", "Lgr1/n;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public i(String integrationId) {
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
            return (other instanceof i) && AbstractC22676k.m65745e(this.integrationId, ((i) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OAuthFailed(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr1/n$j;", "Lgr1/n;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public j(String integrationId) {
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
            return (other instanceof j) && AbstractC22676k.m65745e(this.integrationId, ((j) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OAuthStarted(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lgr1/n$k;", "Lgr1/n;", "", "integrationId", "", "isManualRefresh", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isManualRefresh;

        public k(String integrationId, boolean z4) {
            AbstractC22676k.m65750j(integrationId, "integrationId");
            this.integrationId = integrationId;
            this.isManualRefresh = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsManualRefresh() {
            return this.isManualRefresh;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.integrationId, kVar.integrationId) && this.isManualRefresh == kVar.isManualRefresh;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isManualRefresh) + (this.integrationId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("OAuthSyncComplete(integrationId=", this.integrationId, ", isManualRefresh=", ")", this.isManualRefresh);
        }
    }

    /* JADX INFO: renamed from: gr1.n$l */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgr1/n$l;", "Lgr1/n;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        public l(Action action) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.action, ((l) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11478a.m30856h("PerformAction(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$m */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lgr1/n$m;", "Lgr1/n;", "", "integrationId", "type", "", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isEnabled;

        public m(String integrationId, String type, boolean z4) {
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
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.integrationId, mVar.integrationId) && AbstractC22676k.m65745e(this.type, mVar.type) && this.isEnabled == mVar.isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled) + AbstractC11266d.m30450d(this.integrationId.hashCode() * 31, 31, this.type);
        }

        public String toString() {
            String str = this.integrationId;
            String str2 = this.type;
            return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("PrivacyControlToggled(integrationId=", str, ", type=", str2, ", isEnabled="), this.isEnabled, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr1/n$n;", "Lgr1/n;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public n(String integrationId) {
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
            return (other instanceof n) && AbstractC22676k.m65745e(this.integrationId, ((n) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("RefreshIntegrationDetails(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: renamed from: gr1.n$o */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr1/n$o;", "Lgr1/n;", "", "integrationId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o implements InterfaceC16107n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String integrationId;

        public o(String integrationId) {
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
            return (other instanceof o) && AbstractC22676k.m65745e(this.integrationId, ((o) other).integrationId);
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TriggerSyncAndRefresh(integrationId=", this.integrationId, ")");
        }
    }
}
