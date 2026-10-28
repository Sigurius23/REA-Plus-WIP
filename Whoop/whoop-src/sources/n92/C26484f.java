package n92;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.iterable.iterableapi.AsyncTaskC5389y1;
import com.iterable.iterableapi.C5315d1;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.C5378v;
import com.iterable.iterableapi.C5381w;
import com.iterable.iterableapi.C5386x1;
import com.iterable.iterableapi.InterfaceC5384x;
import com.iterable.iterableapi.InterfaceC5385x0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: n92.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Ln92/f;", "Ln92/e;", "Lcom/iterable/iterableapi/k;", "iterableApi", "Ll83/h;", "Lcom/iterable/iterableapi/x0;", "inAppHandler", "Lcom/iterable/iterableapi/x;", "customActionHandler", "Ln92/h;", "urlHandler", "Ln92/g;", "iterableInitializer", "Ltr2/n;", "logger", "<init>", "(Lcom/iterable/iterableapi/k;Ll83/h;Ll83/h;Ln92/h;Ln92/g;Ltr2/n;)V", "Ll83/a0;", "e", "()V", "c", "a", "", NotificationCompat.CATEGORY_EMAIL, "d", "(Ljava/lang/String;)V", "Landroid/content/Context;", "appContext", "pushIntegrationName", "apiKey", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/iterable/iterableapi/k;", "Ll83/h;", "Ln92/h;", "Ln92/g;", "f", "Ltr2/n;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26484f implements InterfaceC26483e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C5341k iterableApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC23462h inAppHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC23462h customActionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C26486h urlHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C26485g iterableInitializer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C26484f(C5341k iterableApi, InterfaceC23462h inAppHandler, InterfaceC23462h customActionHandler, C26486h urlHandler, C26485g iterableInitializer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(iterableApi, "iterableApi");
        AbstractC22676k.m65750j(inAppHandler, "inAppHandler");
        AbstractC22676k.m65750j(customActionHandler, "customActionHandler");
        AbstractC22676k.m65750j(urlHandler, "urlHandler");
        AbstractC22676k.m65750j(iterableInitializer, "iterableInitializer");
        AbstractC22676k.m65750j(logger, "logger");
        this.iterableApi = iterableApi;
        this.inAppHandler = inAppHandler;
        this.customActionHandler = customActionHandler;
        this.urlHandler = urlHandler;
        this.iterableInitializer = iterableInitializer;
        this.logger = logger;
    }

    @Override // n92.InterfaceC26483e
    /* JADX INFO: renamed from: a */
    public void mo78527a() {
        try {
            this.iterableApi.m16492m(null);
        } catch (NullPointerException e5) {
            this.logger.mo85218i("Caught exception when calling setEmail() in logout()", e5, new AbstractC30556a.a[0]);
        }
        try {
            C5341k c5341k = this.iterableApi;
            if (c5341k.m16482a()) {
                String str = c5341k.f21746d;
                String str2 = c5341k.f21747e;
                String str3 = c5341k.f21749g;
                String packageName = c5341k.f21744b.f21875a;
                if (packageName == null) {
                    packageName = c5341k.f21743a.getPackageName();
                }
                new AsyncTaskC5389y1().execute(new C5386x1(str, str2, str3, packageName, 2));
            }
        } catch (NullPointerException e13) {
            this.logger.mo85218i("Caught exception when calling disablePush() in logout()", e13, new AbstractC30556a.a[0]);
        }
    }

    @Override // n92.InterfaceC26483e
    /* JADX INFO: renamed from: b */
    public void mo78528b(Context appContext, String pushIntegrationName, String apiKey) {
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(pushIntegrationName, "pushIntegrationName");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        C5378v c5378v = new C5378v(0);
        c5378v.f21851b = pushIntegrationName;
        c5378v.f21855f = (InterfaceC5385x0) this.inAppHandler.getValue();
        c5378v.f21854e = (InterfaceC5384x) this.customActionHandler.getValue();
        c5378v.f21853d = this.urlHandler;
        c5378v.f21852c = 7;
        this.iterableInitializer.m78532a(appContext, apiKey, new C5381w(c5378v));
        this.iterableApi.m16490k();
    }

    @Override // n92.InterfaceC26483e
    /* JADX INFO: renamed from: c */
    public void mo78529c() {
        C5315d1 c5315d1M16486e = this.iterableApi.m16486e();
        c5315d1M16486e.f21664K = false;
        c5315d1M16486e.m16425h();
    }

    @Override // n92.InterfaceC26483e
    /* JADX INFO: renamed from: d */
    public void mo78530d(String email) {
        AbstractC22676k.m65750j(email, "email");
        this.iterableApi.m16492m(email);
        this.iterableApi.m16490k();
    }

    @Override // n92.InterfaceC26483e
    /* JADX INFO: renamed from: e */
    public void mo78531e() {
        this.iterableApi.m16486e().f21664K = true;
    }

    public /* synthetic */ C26484f(C5341k c5341k, InterfaceC23462h interfaceC23462h, InterfaceC23462h interfaceC23462h2, C26486h c26486h, C26485g c26485g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5341k, interfaceC23462h, interfaceC23462h2, c26486h, (i13 & 16) != 0 ? new C26485g() : c26485g, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("IterableInAppMessagingClientImpl") : interfaceC34116n);
    }
}
