package h92;

import com.whoop.domain.model.WhoopUri;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: h92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, m65681d2 = {"Lh92/a;", "", "", "whoopScheme", "appLinkScheme", "appLinkHost", "mxmSpecificDeepLinkHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/whoop/domain/model/WhoopUri;", "", "c", "(Lcom/whoop/domain/model/WhoopUri;)Z", "b", "uri", "a", "(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/domain/model/WhoopUri;", "Ljava/lang/String;", "d", "e", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17029a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String whoopScheme;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String appLinkScheme;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String appLinkHost;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String mxmSpecificDeepLinkHost;

    /* JADX INFO: renamed from: h92.a$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, m65681d2 = {"Lh92/a$a;", "", "<init>", "()V", "Lcom/whoop/domain/model/WhoopUri;", "whoopUri", "", "b", "(Lcom/whoop/domain/model/WhoopUri;)Z", "a", "", "HTTPS", "Ljava/lang/String;", "WHOOP_SCHEME", "MXM_SPECIFIC_DEEPLINK_HOST", "PASSWORD_RESET", "PASSWORD_RESET_NEW", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m48093a(WhoopUri whoopUri) {
            return whoopUri != null && AbstractC17030b.m48097c(whoopUri);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m48094b(WhoopUri whoopUri) {
            return whoopUri != null && AbstractC17030b.m48098d(whoopUri);
        }

        private Companion() {
        }
    }

    public C17029a(String whoopScheme, String appLinkScheme, String appLinkHost, String mxmSpecificDeepLinkHost) {
        AbstractC22676k.m65750j(whoopScheme, "whoopScheme");
        AbstractC22676k.m65750j(appLinkScheme, "appLinkScheme");
        AbstractC22676k.m65750j(appLinkHost, "appLinkHost");
        AbstractC22676k.m65750j(mxmSpecificDeepLinkHost, "mxmSpecificDeepLinkHost");
        this.whoopScheme = whoopScheme;
        this.appLinkScheme = appLinkScheme;
        this.appLinkHost = appLinkHost;
        this.mxmSpecificDeepLinkHost = mxmSpecificDeepLinkHost;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m48090b(WhoopUri whoopUri) {
        return AbstractC39421y.m125921F(whoopUri.getScheme(), this.appLinkScheme, true) && AbstractC39421y.m125921F(whoopUri.getHost(), this.appLinkHost, true);
    }

    /* JADX INFO: renamed from: c */
    private final boolean m48091c(WhoopUri whoopUri) {
        return AbstractC39421y.m125921F(whoopUri.getScheme(), this.whoopScheme, true) && !AbstractC39421y.m125921F(whoopUri.getHost(), this.mxmSpecificDeepLinkHost, true);
    }

    /* JADX INFO: renamed from: a */
    public final WhoopUri m48092a(WhoopUri uri) {
        if (uri == null) {
            return null;
        }
        if (m48090b(uri) || m48091c(uri)) {
            return uri;
        }
        return null;
    }

    public /* synthetic */ C17029a(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "whoop" : str, (i13 & 2) != 0 ? "https" : str2, str3, (i13 & 8) != 0 ? "mxm" : str4);
    }
}
