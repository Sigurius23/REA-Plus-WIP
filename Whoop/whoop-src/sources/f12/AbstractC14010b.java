package f12;

import io.getstream.chat.android.client.api.QueryParams;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f12.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lf12/b;", "", "<init>", "()V", "b", "a", "Lf12/b$a;", "Lf12/b$b;", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14010b {

    /* JADX INFO: renamed from: f12.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lf12/b$a;", "Lf12/b;", "", "provider", QueryParams.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getProvider", "b", "getUrl", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC14010b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String provider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String provider, String url) {
            super(null);
            AbstractC22676k.m65750j(provider, "provider");
            AbstractC22676k.m65750j(url, "url");
            this.provider = provider;
            this.url = url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.provider, aVar.provider) && AbstractC22676k.m65745e(this.url, aVar.url);
        }

        public int hashCode() {
            return this.url.hashCode() + (this.provider.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Error(provider=", this.provider, ", url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: f12.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf12/b$b;", "Lf12/b;", "<init>", "()V", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC14010b {

        /* JADX INFO: renamed from: a */
        public static final b f50003a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC14010b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14010b() {
    }
}
