package or2;

import android.net.Uri;
import com.whoop.data.repositories.FeatureFlagRepository;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: or2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lor2/f;", "", "Lor2/y;", "externalLinkNavigator", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "<init>", "(Lor2/y;Lcom/whoop/data/repositories/FeatureFlagRepository;)V", "", QueryParams.URL, "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lor2/y;", "b", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "c", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28159f {

    /* JADX INFO: renamed from: d */
    public static final int f113855d = 8;

    /* JADX INFO: renamed from: e */
    private static final List<String> f113856e = AbstractC37056f.m118959K("app.whoop.com", "app.dev.whoop.com", "app.qa.whoop.com");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    public C28159f(C28216y externalLinkNavigator, FeatureFlagRepository featureFlagRepository) {
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        this.externalLinkNavigator = externalLinkNavigator;
        this.featureFlagRepository = featureFlagRepository;
    }

    /* JADX INFO: renamed from: a */
    public final String m85210a(String url) {
        String string;
        String strConcat;
        String string2;
        AbstractC22676k.m65750j(url, "url");
        Uri uri = Uri.parse(url);
        if (this.featureFlagRepository.isFeatureEnabled("generate-authenticated-url-in-authenticated-web-view-android") && AbstractC25265s.m74155w0(f113856e, uri.getHost())) {
            if (AbstractC22676k.m65745e(uri.getPath(), "/login-token.html")) {
                String queryParameter = uri.getQueryParameter("for");
                Uri uriM85417d = this.externalLinkNavigator.m85417d(queryParameter != null ? AbstractC39414r.m125898q0(queryParameter, "/") : null);
                if (uriM85417d != null && (string2 = uriM85417d.toString()) != null) {
                    return string2;
                }
            } else {
                String path = uri.getPath();
                String str = "";
                String strM125898q0 = path != null ? AbstractC39414r.m125898q0(path, "/") : "";
                String query = uri.getQuery();
                if (query != null && (strConcat = "?".concat(query)) != null) {
                    str = strConcat;
                }
                Uri uriM85417d2 = this.externalLinkNavigator.m85417d(strM125898q0.concat(str));
                if (uriM85417d2 != null && (string = uriM85417d2.toString()) != null) {
                    return string;
                }
            }
        }
        return url;
    }
}
