package f12;

import io.getstream.chat.android.client.api.QueryParams;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f12.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lf12/a;", "", "<init>", "()V", "a", "Lf12/a$a;", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14009a {

    /* JADX INFO: renamed from: f12.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lf12/a$a;", "Lf12/a;", "", "provider", QueryParams.URL, "codeVerifier", "authScope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC14009a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String provider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String codeVerifier;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String authScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String provider, String url, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(provider, "provider");
            AbstractC22676k.m65750j(url, "url");
            this.provider = provider;
            this.url = url;
            this.codeVerifier = str;
            this.authScope = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAuthScope() {
            return this.authScope;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getProvider() {
            return this.provider;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.provider, aVar.provider) && AbstractC22676k.m65745e(this.url, aVar.url) && AbstractC22676k.m65745e(this.codeVerifier, aVar.codeVerifier) && AbstractC22676k.m65745e(this.authScope, aVar.authScope);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.provider.hashCode() * 31, 31, this.url);
            String str = this.codeVerifier;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.authScope;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.provider;
            String str2 = this.url;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("CreateConnection(provider=", str, ", url=", str2, ", codeVerifier="), this.codeVerifier, ", authScope=", this.authScope, ")");
        }
    }

    public /* synthetic */ AbstractC14009a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14009a() {
    }
}
