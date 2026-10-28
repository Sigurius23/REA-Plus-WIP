package or2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.domain.model.Session;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import nf1.AbstractC26661b;
import nf1.AbstractC26666g;
import od1.C27858u;
import p031b9.AbstractC2875y;
import p217ib.C18312i;
import p412q3.C29875i;
import p600x.C37786a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.y */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u001cJ\u0015\u0010 \u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010\u001cJ\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\u001cJ\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b#\u0010\u001cJ\u0015\u0010$\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b$\u0010\u001cJ\u0015\u0010%\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010\u001cJ\u0015\u0010&\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b&\u0010\u001cJ\u0015\u0010'\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b'\u0010\u001cJ\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b(\u0010\u001cJ\u0015\u0010)\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b)\u0010\u001cJ\u0015\u0010*\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b*\u0010\u001cJ\u0015\u0010+\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b+\u0010\u001cJ\u001f\u0010-\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b-\u0010.J+\u00100\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010/\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010\u0014J\u001f\u00101\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b1\u0010.J\u001f\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u0002022\u0006\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b\u001d\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010A¨\u0006C"}, m65681d2 = {"Lor2/y;", "", "Lod1/u;", "userContext", "Lsr2/y;", "urlProvider", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "<init>", "(Lod1/u;Lsr2/y;Lcom/whoop/data/repositories/LanguageRepository;Lcom/whoop/data/repositories/FeatureFlagRepository;)V", "Landroid/app/Activity;", "activity", "", QueryParams.URL, "", "localize", "Ll83/a0;", "x", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "b", "(Ljava/lang/String;Z)Ljava/lang/String;", "destinationPath", "Landroid/net/Uri;", "d", "(Ljava/lang/String;)Landroid/net/Uri;", "j", "(Landroid/app/Activity;)V", "e", "o", "i", "q", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "s", "u", "l", "m", "n", "r", "v", "p", "t", "uri", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroid/app/Activity;Landroid/net/Uri;)V", "isCheckoutPage", "f", "z", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;Landroid/net/Uri;)Z", "Lod1/u;", "Lsr2/y;", "c", "Lcom/whoop/data/repositories/LanguageRepository;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "Ltr2/n;", "Ltr2/n;", "getLogger", "()Ltr2/n;", "logger", "Lor2/p1;", "()Lor2/p1;", "allowedLanguage", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28216y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C28216y(C27858u userContext, AbstractC32943y urlProvider, LanguageRepository languageRepository, FeatureFlagRepository featureFlagRepository) {
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        this.userContext = userContext;
        this.urlProvider = urlProvider;
        this.languageRepository = languageRepository;
        this.featureFlagRepository = featureFlagRepository;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("ExternalLinkNavigator");
    }

    /* JADX INFO: renamed from: a */
    private final boolean m85409a(Context context, Uri uri) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
        AbstractC22676k.m65749i(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(it.next().activityInfo.packageName, "com.android.chrome")) {
                Intent intent = new Intent();
                intent.setAction("android.support.customtabs.action.CustomTabsService");
                intent.setPackage("com.android.chrome");
                if (context.getPackageManager().resolveService(intent, 0) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private final EnumC28191p1 m85410c() {
        String language = this.languageRepository.getAllowedLanguage().getLanguage();
        AbstractC22676k.m65749i(language, "getLanguage(...)");
        return AbstractC28208v0.m85386b(language, this.featureFlagRepository);
    }

    /* JADX INFO: renamed from: f */
    private final void m85411f(Activity activity, String destinationPath, boolean isCheckoutPage) {
        AbstractC32943y abstractC32943y = this.urlProvider;
        String strMo103894b = isCheckoutPage ? abstractC32943y.getCheckoutBaseUrl() : abstractC32943y.getWebBaseUrl();
        Session sessionM84057h = this.userContext.m84057h();
        if (sessionM84057h == null) {
            InterfaceC34116n interfaceC34116n = this.logger;
            if (destinationPath == null) {
                destinationPath = "";
            }
            interfaceC34116n.mo85226q(AbstractC31061c.m95640p("Attempted to open authenticated web page ", strMo103894b, destinationPath, ", but there is no active session from which we can grab an auth token."), new AbstractC30556a.a[0]);
            return;
        }
        Uri.Builder builderBuildUpon = Uri.parse(strMo103894b).buildUpon();
        String language = this.languageRepository.getAllowedLanguage().getLanguage();
        AbstractC22676k.m65749i(language, "getLanguage(...)");
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.path(AbstractC28208v0.m85385a("login-token.html", AbstractC28208v0.m85386b(language, this.featureFlagRepository))).appendQueryParameter("token", sessionM84057h.getAuthToken().getAccessToken());
        AbstractC22676k.m65749i(builderAppendQueryParameter, "appendQueryParameter(...)");
        Uri uriBuild = AbstractC28219z.m85446a(AbstractC28219z.m85446a(AbstractC28219z.m85446a(builderAppendQueryParameter, !isCheckoutPage, UserState.Sources.USER, String.valueOf(sessionM84057h.getUser().getId())), isCheckoutPage, "device", "android"), destinationPath != null, "for", destinationPath).build();
        AbstractC22676k.m65747g(uriBuild);
        m85415z(activity, uriBuild);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m85412g(C28216y c28216y, Activity activity, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        c28216y.m85411f(activity, str, z4);
    }

    /* JADX INFO: renamed from: w */
    private final void m85413w(Activity activity, Uri uri) {
        m85415z(activity, uri);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m85414y(C28216y c28216y, Activity activity, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        c28216y.m85434x(activity, str, z4);
    }

    /* JADX INFO: renamed from: z */
    private final void m85415z(Activity activity, Uri uri) {
        C37786a c37786a = new C37786a();
        c37786a.m121287b(activity.getColor(AbstractC26661b.f105975a));
        C37786a c37786aM121286a = c37786a.m121286a();
        C18312i c18312i = new C18312i();
        c18312i.m52716c(c37786aM121286a);
        c18312i.m52718e();
        C29875i c29875iM52714a = c18312i.m52714a();
        Intent intent = (Intent) c29875iM52714a.f122095w;
        if (m85409a(activity, uri)) {
            intent.setPackage("com.android.chrome");
        }
        Bundle bundle = new Bundle();
        bundle.putString(LanguageRepositoryKt.ACCEPT_LANGUAGE_HEADER, m85410c().getSlug());
        intent.putExtra("com.android.browser.headers", bundle);
        c29875iM52714a.m91499h(activity, uri);
    }

    /* JADX INFO: renamed from: b */
    public final String m85416b(String url, boolean localize) {
        AbstractC22676k.m65750j(url, "url");
        return localize ? AbstractC28208v0.m85385a(url, m85410c()) : url;
    }

    /* JADX INFO: renamed from: d */
    public final Uri m85417d(String destinationPath) {
        String strMo103896d = this.urlProvider.getWebBaseUrl();
        Session sessionM84057h = this.userContext.m84057h();
        if (sessionM84057h == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = Uri.parse(strMo103896d).buildUpon();
        String language = this.languageRepository.getAllowedLanguage().getLanguage();
        AbstractC22676k.m65749i(language, "getLanguage(...)");
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.path(AbstractC28208v0.m85385a("login-token.html", AbstractC28208v0.m85386b(language, this.featureFlagRepository))).appendQueryParameter("token", sessionM84057h.getAuthToken().getAccessToken()).appendQueryParameter(UserState.Sources.USER, String.valueOf(sessionM84057h.getUser().getId())).appendQueryParameter("device", "android");
        AbstractC22676k.m65749i(builderAppendQueryParameter, "appendQueryParameter(...)");
        Uri.Builder builderAppendQueryParameter2 = AbstractC28219z.m85446a(builderAppendQueryParameter, true ^ (destinationPath == null || destinationPath.length() == 0), "for", destinationPath).appendQueryParameter("lang", this.languageRepository.getAllowedLanguage().getLanguage());
        String language2 = this.languageRepository.getAllowedLanguage().getLanguage();
        AbstractC22676k.m65749i(language2, "getLanguage(...)");
        return builderAppendQueryParameter2.appendQueryParameter("region", AbstractC28208v0.m85386b(language2, this.featureFlagRepository).getRegion()).build();
    }

    /* JADX INFO: renamed from: e */
    public final void m85418e(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85412g(this, activity, "affiliate", false, 4, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m85419h(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85412g(this, activity, "membership/annual", false, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m85420i(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85412g(this, activity, "membership", false, 4, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m85421j(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85412g(this, activity, "cancel-trial", false, 4, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m85422k(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        String language = this.languageRepository.getAllowedLanguage().getLanguage();
        AbstractC22676k.m65749i(language, "getLanguage(...)");
        m85412g(this, activity, AbstractC28208v0.m85385a("en-us/family", AbstractC28208v0.m85386b(language, this.featureFlagRepository)), false, 4, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m85423l(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85411f(activity, "gift", true);
    }

    /* JADX INFO: renamed from: m */
    public final void m85424m(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85411f(activity, "gifts/extensions", false);
    }

    /* JADX INFO: renamed from: n */
    public final void m85425n(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85411f(activity, null, true);
    }

    /* JADX INFO: renamed from: o */
    public final void m85426o(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85412g(this, activity, "membership", false, 4, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m85427p(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        String string = activity.getString(AbstractC26666g.f106014e);
        AbstractC22676k.m65749i(string, "getString(...)");
        m85414y(this, activity, string, false, 4, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m85428q(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85412g(this, activity, "membership/pause", false, 4, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m85429r(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        String string = activity.getString(AbstractC26666g.f106016g);
        AbstractC22676k.m65749i(string, "getString(...)");
        m85414y(this, activity, string, false, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m85430s(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85412g(this, activity, "gifts/redeem", false, 4, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m85431t(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85434x(activity, "https://support.whoop.com/s/topic/0TO6Q000000gQa7WAE/regulatory-information?language=" + AbstractC28202t0.m85351b(this.languageRepository.getAllowedLanguage()), false);
    }

    /* JADX INFO: renamed from: u */
    public final void m85432u(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        m85434x(activity, "https://support.whoop.com/s/article/Strain-Coach", true);
    }

    /* JADX INFO: renamed from: v */
    public final void m85433v(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        String string = activity.getString(AbstractC26666g.f106018i);
        AbstractC22676k.m65749i(string, "getString(...)");
        m85414y(this, activity, string, false, 4, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m85434x(Activity activity, String url, boolean localize) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(url, "url");
        try {
            Uri uri = Uri.parse(m85416b(url, localize));
            AbstractC22676k.m65749i(uri, "parse(...)");
            m85413w(activity, uri);
        } catch (Exception e5) {
            this.logger.mo85216g(AbstractC2875y.m8297j(e5, "ExternalLinkNavigator error has occurred "), new AbstractC30556a.a[0]);
        }
    }
}
