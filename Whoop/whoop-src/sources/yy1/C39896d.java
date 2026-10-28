package yy1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.MfaSupportUrl;
import j93.InterfaceC21461d;
import js0.AbstractC21909c;
import js0.C21908b;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12977n0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import py1.C29622a;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yy1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006,"}, m65681d2 = {"Lyy1/d;", "", "Leb/a0;", "navController", "Landroid/content/Context;", "context", "Ljs0/c;", "configurationRepository", "Lpy1/a;", "mfaAnalyticsHelper", "Ltr2/n;", "logger", "", "source", "enforcementTag", "<init>", "(Leb/a0;Landroid/content/Context;Ljs0/c;Lpy1/a;Ltr2/n;Ljava/lang/String;Ljava/lang/String;)V", "Ll83/a0;", "a", "()V", "Lyy1/a;", "enforcementArea", "b", "(Lyy1/a;)V", "Leb/n0;", "navDestination", "Landroid/net/Uri;", "deepLink", "", "c", "(Leb/n0;Landroid/net/Uri;)Z", "Lyy1/c;", NotificationCompat.CATEGORY_EVENT, "d", "(Lyy1/c;)V", "Leb/a0;", "Landroid/content/Context;", "Ljs0/c;", "Lpy1/a;", "e", "Ltr2/n;", "f", "Ljava/lang/String;", "g", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39896d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C29622a mfaAnalyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String enforcementTag;

    public C39896d(AbstractC12939a0 navController, Context context, AbstractC21909c configurationRepository, C29622a mfaAnalyticsHelper, InterfaceC34116n logger, String source, String enforcementTag) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(mfaAnalyticsHelper, "mfaAnalyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(enforcementTag, "enforcementTag");
        this.navController = navController;
        this.context = context;
        this.configurationRepository = configurationRepository;
        this.mfaAnalyticsHelper = mfaAnalyticsHelper;
        this.logger = logger;
        this.source = source;
        this.enforcementTag = enforcementTag;
    }

    /* JADX INFO: renamed from: a */
    private final void m127992a() {
        while (this.navController.m36410z()) {
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m127993b(EnumC39893a enforcementArea) {
        Uri uri = Uri.parse(enforcementArea.getDeepLink());
        boolean zM36410z = this.navController.m36410z();
        while (zM36410z) {
            C12977n0 c12977n0M36394i = this.navController.m36394i();
            if (this.navController.m36410z() && c12977n0M36394i != null) {
                AbstractC22676k.m65747g(uri);
                if (!m127994c(c12977n0M36394i, uri)) {
                    zM36410z = true;
                }
            }
            zM36410z = false;
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m127994c(C12977n0 navDestination, Uri deepLink) {
        navDestination.getClass();
        AbstractC22676k.m65750j(deepLink, "deepLink");
        boolean z4 = navDestination.mo36468j(new C12969k0(deepLink, null, null)) != null;
        this.logger.mo85228t("dest " + ((Object) navDestination.f44825z) + " has " + z4 + " " + deepLink, new AbstractC30556a.a[0]);
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0256  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX INFO: renamed from: d */
    public final void m127995d(AbstractC39895c event) {
        String str;
        EnumC39893a enumC39893a;
        String str2;
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC39895c.d.f172247a)) {
            this.navController.m36402q(Uri.parse("android-app://com.whoop/settings/myAccountFragment"));
            return;
        }
        boolean z4 = event instanceof AbstractC39895c.e;
        Class cls = Boolean.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Long.TYPE;
        Class cls5 = Integer.TYPE;
        Object objM125868N0 = null;
        if (z4) {
            AbstractC21909c abstractC21909c = this.configurationRepository;
            MfaSupportUrl mfaSupportUrl = MfaSupportUrl.INSTANCE;
            C21908b configurations = abstractC21909c.getConfigurations();
            String name = mfaSupportUrl.getName();
            Object defaultValue = mfaSupportUrl.getDefaultValue();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                String str3 = (String) configurations.get(name);
                if (str3 != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str3);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                String str4 = (String) configurations.get(name);
                if (str4 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str4);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                String str5 = (String) configurations.get(name);
                if (str5 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str5);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                String str6 = (String) configurations.get(name);
                if (str6 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str6);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                String str7 = (String) configurations.get(name);
                if (str7 != null) {
                    objM125868N0 = AbstractC39414r.m125868N0(str7);
                }
            } else {
                objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
            }
            if (objM125868N0 != null) {
                defaultValue = objM125868N0;
            }
            if (defaultValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) defaultValue));
            String currentPage = ((AbstractC39895c.e) event).getCurrentPage();
            if (currentPage == null) {
                str2 = "";
            } else {
                int iHashCode = currentPage.hashCode();
                if (iHashCode != -304233708) {
                    if (iHashCode != 69820330) {
                        if (iHashCode == 69824076 && currentPage.equals("INTRO")) {
                            str2 = "welcome_screen";
                        } else {
                            str2 = "";
                        }
                    } else if (currentPage.equals("INPUT")) {
                        str2 = "input_screen";
                    } else {
                        str2 = "";
                    }
                } else if (currentPage.equals("ENTER_CODE")) {
                    str2 = "challenge_screen";
                } else {
                    str2 = "";
                }
            }
            C29622a.m91010n(this.mfaAnalyticsHelper, str2, null, this.source, "MFA Setup Flow", 2, null);
            this.context.startActivity(intent);
            return;
        }
        if (event.equals(AbstractC39895c.c.f172246a)) {
            AbstractC21909c abstractC21909c2 = this.configurationRepository;
            MfaSupportUrl mfaSupportUrl2 = MfaSupportUrl.INSTANCE;
            C21908b configurations2 = abstractC21909c2.getConfigurations();
            String name2 = mfaSupportUrl2.getName();
            Object defaultValue2 = mfaSupportUrl2.getDefaultValue();
            C22673i0 c22673i1 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                String str8 = (String) configurations2.get(name2);
                if (str8 != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str8);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                String str9 = (String) configurations2.get(name2);
                if (str9 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str9);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                String str10 = (String) configurations2.get(name2);
                if (str10 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str10);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                String str11 = (String) configurations2.get(name2);
                if (str11 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str11);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                String str12 = (String) configurations2.get(name2);
                if (str12 != null) {
                    objM125868N0 = AbstractC39414r.m125868N0(str12);
                }
            } else {
                objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
            }
            if (objM125868N0 != null) {
                defaultValue2 = objM125868N0;
            }
            if (defaultValue2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) defaultValue2)));
            return;
        }
        if (!(event instanceof AbstractC39895c.b)) {
            if (!event.equals(AbstractC39895c.a.f172243a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
            return;
        }
        AbstractC39895c.b bVar = (AbstractC39895c.b) event;
        String currentPage2 = bVar.getCurrentPage();
        if (currentPage2 == null) {
            str = "";
        } else {
            int iHashCode2 = currentPage2.hashCode();
            if (iHashCode2 != -304233708) {
                if (iHashCode2 != 69820330) {
                    if (iHashCode2 == 69824076 && currentPage2.equals("INTRO")) {
                        str = "welcome_screen";
                    } else {
                        str = "";
                    }
                } else if (currentPage2.equals("INPUT")) {
                    str = "input_screen";
                } else {
                    str = "";
                }
            } else if (currentPage2.equals("ENTER_CODE")) {
                str = "challenge_screen";
            } else {
                str = "";
            }
        }
        C29622a.m91009k(this.mfaAnalyticsHelper, str, null, this.source, "MFA Setup Flow", 2, null);
        if (bVar.getPoppedFromComposeNavController()) {
            return;
        }
        String str13 = this.source;
        if (AbstractC22676k.m65745e(str13, "clinical_intake")) {
            this.navController.m36410z();
            this.navController.m36410z();
            return;
        }
        if (!AbstractC22676k.m65745e(str13, "enforcement")) {
            this.navController.m36410z();
            return;
        }
        EnumC39893a[] enumC39893aArrValues = EnumC39893a.values();
        int length = enumC39893aArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC39893a = null;
                break;
            }
            enumC39893a = enumC39893aArrValues[i13];
            if (AbstractC39414r.m125876U(this.enforcementTag, enumC39893a.getKey(), false)) {
                break;
            } else {
                i13++;
            }
        }
        this.logger.mo85228t("using MFA enforcement area " + enumC39893a + " from " + this.enforcementTag, new AbstractC30556a.a[0]);
        if (enumC39893a != null) {
            m127993b(enumC39893a);
        } else {
            m127992a();
        }
    }

    public /* synthetic */ C39896d(AbstractC12939a0 abstractC12939a0, Context context, AbstractC21909c abstractC21909c, C29622a c29622a, InterfaceC34116n interfaceC34116n, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12939a0, context, abstractC21909c, c29622a, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MfaSetupNavigationRouter") : interfaceC34116n, (i13 & 32) != 0 ? "" : str, (i13 & 64) != 0 ? "" : str2);
    }
}
