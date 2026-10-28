package dj0;

import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dj0.u */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ldj0/u;", "", "b", "a", "Ldj0/u$a;", "Ldj0/u$b;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12085u {

    /* JADX INFO: renamed from: dj0.u$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldj0/u$a;", "Ldj0/u;", "Ldj0/a;", "codeDeliveryInfo", "<init>", "(Ldj0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldj0/a;", "()Ldj0/a;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12085u {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12065a codeDeliveryInfo;

        public a(C12065a c12065a) {
            this.codeDeliveryInfo = c12065a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C12065a getCodeDeliveryInfo() {
            return this.codeDeliveryInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.codeDeliveryInfo, ((a) other).codeDeliveryInfo);
        }

        public int hashCode() {
            C12065a c12065a = this.codeDeliveryInfo;
            if (c12065a == null) {
                return 0;
            }
            return c12065a.hashCode();
        }

        public String toString() {
            return "MfaSetupChallengeData(codeDeliveryInfo=" + this.codeDeliveryInfo + ")";
        }
    }

    /* JADX INFO: renamed from: dj0.u$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ldj0/u$b;", "Ldj0/u;", "", "session", "username", "password", "challengeName", "", "challengeParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC12085u {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String session;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String username;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String password;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String challengeName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Map<String, String> challengeParameters;

        public b(String session, String username, String password, String challengeName, Map<String, String> challengeParameters) {
            AbstractC22676k.m65750j(session, "session");
            AbstractC22676k.m65750j(username, "username");
            AbstractC22676k.m65750j(password, "password");
            AbstractC22676k.m65750j(challengeName, "challengeName");
            AbstractC22676k.m65750j(challengeParameters, "challengeParameters");
            this.session = session;
            this.username = username;
            this.password = password;
            this.challengeName = challengeName;
            this.challengeParameters = challengeParameters;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getChallengeName() {
            return this.challengeName;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, String> m33342b() {
            return this.challengeParameters;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSession() {
            return this.session;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.session, bVar.session) && AbstractC22676k.m65745e(this.username, bVar.username) && AbstractC22676k.m65745e(this.password, bVar.password) && AbstractC22676k.m65745e(this.challengeName, bVar.challengeName) && AbstractC22676k.m65745e(this.challengeParameters, bVar.challengeParameters);
        }

        public int hashCode() {
            return this.challengeParameters.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.session.hashCode() * 31, 31, this.username), 31, this.password), 31, this.challengeName);
        }

        public String toString() {
            String str = this.session;
            String str2 = this.challengeName;
            return AbstractC13673n.m38565l(AbstractC11895b.m32001t("MfaChallengeData(session='", str, "', challengeName='", str2, "', challengeParameters="), this.challengeParameters, ")");
        }
    }
}
