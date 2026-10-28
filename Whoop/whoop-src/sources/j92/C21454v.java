package j92;

import ae3.C0801i;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.InterfaceC23462h;
import or2.C28162g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import ud3.C34810e0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: j92.v */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lj92/v;", "Lud3/g0;", "Lor2/g;", "buildConfigProvider", "Ll83/h;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lor2/g;Ll83/h;)V", "Lud3/e0;", QueryParams.URL, "", "suffix", "a", "(Lud3/e0;Ljava/lang/String;)Ljava/lang/String;", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lor2/g;", "x", "Ll83/h;", "Ltr2/n;", "y", "Ltr2/n;", "logger", "", "z", "Ljava/util/List;", "getInvalidCharacters", "()Ljava/util/List;", "invalidCharacters", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21454v implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final List<String> invalidCharacters;

    public C21454v(C28162g buildConfigProvider, InterfaceC23462h featureFlagChecker) {
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.buildConfigProvider = buildConfigProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("UrlValidationInterceptor");
        this.invalidCharacters = AbstractC37056f.m118959K(" ", "`", "\"");
    }

    /* JADX INFO: renamed from: a */
    private final String m60390a(C34810e0 url, String suffix) {
        return "Inavlid URL \"" + url + "\" Reason: " + suffix;
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) {
        String strM109880i;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        C34810e0 c34810e0 = c34832o0.f146712a;
        try {
            if (c34810e0.f146565d.length() <= 0) {
                throw new IllegalArgumentException(m60390a(c34810e0, "Host URL Is Empty").toString());
            }
            if (((FeatureFlagChecker) this.featureFlagChecker.getValue()).isFeatureEnabled(CoreFeatureFlagsKt.URL_VALIDATION_ENCODED_QUERY_FIX)) {
                strM109880i = c34810e0.m109875d();
                if (strM109880i == null) {
                    strM109880i = "";
                }
            } else {
                strM109880i = c34810e0.m109880i();
            }
            String str = c34810e0.f146562a + c34810e0.f146565d + c34810e0.m109873b() + strM109880i;
            for (String str2 : this.invalidCharacters) {
                if (AbstractC39414r.m125876U(str, str2, false)) {
                    throw new IllegalArgumentException(m60390a(c34810e0, "Invalid character \"" + str2 + "\"").toString());
                }
            }
            return c0801i.m1939b(c34832o0);
        } catch (IllegalArgumentException e5) {
            if (AbstractC22676k.m65745e(this.buildConfigProvider.getBuildFlavor(), "qaDev")) {
                throw e5;
            }
            this.logger.mo85222m(e5.toString(), new AbstractC30556a.a[0]);
        }
    }
}
