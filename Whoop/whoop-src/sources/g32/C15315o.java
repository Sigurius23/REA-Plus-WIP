package g32;

import android.content.Context;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import d30.C11558r;
import gy0.AbstractC16273b;
import h20.AbstractC16632b4;
import h20.C16625a3;
import h20.C16631b3;
import h20.C16637c3;
import h20.C16665h1;
import h20.C16671i1;
import h20.C16691l3;
import h20.C16695m1;
import h20.C16720q2;
import h20.C16727r3;
import h20.C16744u2;
import h20.C16749v1;
import h20.C16755w1;
import h20.C16760x0;
import h20.C16761x1;
import h20.C16768y2;
import h20.C16774z2;
import h20.EnumC16648e2;
import h20.InterfaceC16627b;
import h20.InterfaceC16645e;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.C28162g;
import p208i2.AbstractC17918w0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p499t9.C33623c0;
import p507tx.AbstractC34235f;
import p636y3.C39183o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.AbstractC42793j;
import q83.InterfaceC30057d;
import v63.AbstractC35745c;
import y00.C38915o4;

/* JADX INFO: renamed from: g32.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJe\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2*\u0010\u0015\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u000fH\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lg32/o;", "", "Lor2/g;", "buildConfigProvider", "<init>", "(Lor2/g;)V", "Landroid/content/Context;", "context", "", "publishableKey", "Ll83/a0;", "e", "(Landroid/content/Context;Ljava/lang/String;)V", "Lg32/f;", "intentConfig", "Lg32/e;", "sheetConfig", "Lkotlin/Function3;", "Ly00/o4;", "Lq83/d;", "Lh20/e;", "onCreateIntent", "Lkotlin/Function1;", "Lh20/b4;", "onResult", "Lkotlin/Function0;", "f", "(Lg32/f;Lg32/e;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lc93/a;", "intentConfiguration", "Lh20/u2;", "c", "(Lg32/f;)Lh20/u2;", "configuration", "Lh20/x1;", "d", "(Lg32/e;)Lh20/x1;", "a", "Lor2/g;", "b", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15315o {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final int f57538c = 8;

    /* JADX INFO: renamed from: d */
    private static final Map<String, EnumC16648e2> f57539d = AbstractC25247g0.m73990Y(new C23465k("BUY", EnumC16648e2.f64011w), new C23465k("BOOK", EnumC16648e2.f64012x), new C23465k("CHECKOUT", EnumC16648e2.f64013y), new C23465k("DONATE", EnumC16648e2.f64014z), new C23465k("ORDER", EnumC16648e2.f64006E), new C23465k("SUBSCRIBE", EnumC16648e2.f64008G), new C23465k("PLAIN", EnumC16648e2.f64009H));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: g32.o$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lg32/o$a;", "", "<init>", "()V", "Lh20/h1;", "a", "()Lh20/h1;", "", "", "Lh20/e2;", "GOOGLE_PAY_BUTTON_TYPES", "Ljava/util/Map;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: g32.o$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lg32/o$a$a;", "", "<init>", "()V", "Lh20/v1;", "b", "Lh20/v1;", "a", "()Lh20/v1;", "FLOW_CONTROLLER_COLORS", "Lh20/z2;", "c", "Lh20/z2;", "()Lh20/z2;", "FLOW_CONTROLLER_PRIMARY_BUTTON_COLORS", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41622a {

            /* JADX INFO: renamed from: a */
            public static final C41622a f57541a = new C41622a();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private static final C16749v1 FLOW_CONTROLLER_COLORS = new C16749v1(AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC17918w0.m51517e(4279968552L)), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getWhite10()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getTransparent()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getWhite20()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getAccentAlert()));

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private static final C16774z2 FLOW_CONTROLLER_PRIMARY_BUTTON_COLORS = new C16774z2(Integer.valueOf(AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite())), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandBlack()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getTransparent()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandWhite()), AbstractC17918w0.m51506H(AbstractC42793j.m125436c().getBrandBlack()));

            private C41622a() {
            }

            /* JADX INFO: renamed from: a */
            public final C16749v1 m43521a() {
                return FLOW_CONTROLLER_COLORS;
            }

            /* JADX INFO: renamed from: b */
            public final C16774z2 m43522b() {
                return FLOW_CONTROLLER_PRIMARY_BUTTON_COLORS;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C16665h1 m43520a() {
            C41622a c41622a = C41622a.f57541a;
            C16749v1 c16749v1M43521a = c41622a.m43521a();
            C16749v1 c16749v1M43521a2 = c41622a.m43521a();
            float f13 = 4;
            C16768y2 c16768y2 = new C16768y2(c41622a.m43522b(), c41622a.m43522b(), new C16625a3(4, Float.valueOf(f13 * f13)), new C16631b3(Integer.valueOf(AbstractC16273b.f62200a), Float.valueOf(C39183o.m124805c(AbstractC35745c.m113246h(13)))));
            float f14 = 3 * f13;
            return new C16665h1(c16749v1M43521a, c16749v1M43521a2, new C16637c3(f14, 0.0f, f14), new C16691l3(Integer.valueOf(AbstractC16273b.f62200a)), c16768y2);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: g32.o$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC16627b {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function3 f57544w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f57545x;

        public b(Function3 function3, String str) {
            this.f57544w = function3;
            this.f57545x = str;
        }

        @Override // h20.InterfaceC16627b
        /* JADX INFO: renamed from: a */
        public final Object mo43523a(C38915o4 c38915o4, boolean z4, InterfaceC30057d<? super InterfaceC16645e> interfaceC30057d) {
            return this.f57544w.invoke(c38915o4, this.f57545x, interfaceC30057d);
        }
    }

    public C15315o(C28162g buildConfigProvider) {
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        this.buildConfigProvider = buildConfigProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m43514g(InterfaceC28670t2 interfaceC28670t2, AbstractC16632b4 result) {
        AbstractC22676k.m65750j(result, "result");
        ((Function1) interfaceC28670t2.getValue()).invoke(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m43515h(C16727r3 c16727r3, C16744u2 c16744u2, C16761x1 c16761x1) {
        c16727r3.m47259a(c16744u2, c16761x1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final C16744u2 m43516c(C15306f intentConfiguration) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        return new C16744u2(new C16720q2(intentConfiguration.getCurrency(), intentConfiguration.getSetupFutureUse()), intentConfiguration.m43449d(), intentConfiguration.getPaymentMethodConfigurationId(), intentConfiguration.getOnBehalfOf(), intentConfiguration.getRequireCvcRecollection());
    }

    /* JADX INFO: renamed from: d */
    public final C16761x1 m43517d(C15305e configuration) {
        AbstractC22676k.m65750j(configuration, "configuration");
        C16755w1 c16755w1 = new C16755w1(configuration.getMerchantDisplayName());
        c16755w1.m47268c(INSTANCE.m43520a());
        c16755w1.m47274i(configuration.getCtaText());
        C15303c c15303cM43442b = configuration.getCustomer();
        if (c15303cM43442b != null) {
            c16755w1.m47270e(AbstractC34235f.m108199D(c15303cM43442b.getId(), c15303cM43442b.getCustomerSessionClientSecret()));
        }
        configuration.m43444d();
        C15302b c15302bM43443c = configuration.getDefaultBillingDetails();
        if (c15302bM43443c != null) {
            String strM43436b = c15302bM43443c.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String();
            String strM43437c = c15302bM43443c.getName();
            String strM43438d = c15302bM43443c.getPhone();
            C15301a c15301aM43435a = c15302bM43443c.getAddress();
            c16755w1.m47271f(new C16671i1(c15301aM43435a != null ? new C16760x0(c15301aM43435a.getCity(), c15301aM43435a.getCountry(), c15301aM43435a.getLine1(), c15301aM43435a.getLine2(), c15301aM43435a.getPostalCode(), c15301aM43435a.getState()) : null, strM43436b, strM43437c, strM43438d));
        }
        return c16755w1.m47269d();
    }

    /* JADX INFO: renamed from: e */
    public final void m43518e(Context context, String publishableKey) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        C33623c0.m106242r(context, publishableKey);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC4339a m43519f(C15306f intentConfig, C15305e sheetConfig, Function3 onCreateIntent, Function1 onResult, Composer composer, int i13) {
        C15301a c15301aM43435a;
        AbstractC22676k.m65750j(intentConfig, "intentConfig");
        AbstractC22676k.m65750j(sheetConfig, "sheetConfig");
        AbstractC22676k.m65750j(onCreateIntent, "onCreateIntent");
        AbstractC22676k.m65750j(onResult, "onResult");
        C15302b c15302bM43443c = sheetConfig.getDefaultBillingDetails();
        String strM43433e = (c15302bM43443c == null || (c15301aM43435a = c15302bM43443c.getAddress()) == null) ? null : c15301aM43435a.getPostalCode();
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(onResult, composer);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(strM43433e);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        Object obj = objM87133R;
        if (zM87153g || objM87133R == c28676v0) {
            C16695m1 c16695m1 = new C16695m1(new C15314n(interfaceC28601c1M87238F));
            c16695m1.m47255b(new b(onCreateIntent, strM43433e));
            c28655q.m87172p0(c16695m1);
            obj = c16695m1;
        }
        C16727r3 c16727r3M47254a = ((C16695m1) obj).m47254a(c28655q);
        boolean zM87153g2 = c28655q.m87153g(c16727r3M47254a) | c28655q.m87153g(intentConfig) | ((((i13 & 112) ^ 48) > 32 && c28655q.m87153g(sheetConfig)) || (i13 & 48) == 32);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C11558r(c16727r3M47254a, m43516c(intentConfig), m43517d(sheetConfig), 17);
            c28655q.m87172p0(objM87133R2);
        }
        return (InterfaceC4339a) objM87133R2;
    }
}
