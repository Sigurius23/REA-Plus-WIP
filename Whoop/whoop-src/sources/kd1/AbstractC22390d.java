package kd1;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import bc3.InterfaceC2994c0;
import bm2.C3482x;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.AuthToken;
import com.whoop.domain.model.Session;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cp0.C10999t0;
import dn0.C12211k;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import iy0.C21026a;
import j02.C21148j;
import j21.C21245d;
import j92.AbstractC21453u;
import j92.C21452t;
import java.net.URI;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;
import jp1.C21859k;
import jt1.C21937b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import od1.C27858u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p043c4.C3948a0;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p707gt1.C16199m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y92.C39352a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: kd1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\u001a]\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lzr2/a;", "dateProvider", "Lod1/u;", "userContext", "Ly92/a;", "authManager", "Lj92/t;", "topPrivateDomainHelper", "", QueryParams.URL, "contentDescription", "Lj02/j;", "confirmDismissContent", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "r", "(Lzr2/a;Lod1/u;Ly92/a;Lj92/t;Ljava/lang/String;Ljava/lang/String;Lj02/j;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "cookieName", "", "isNewAuthEnabled", "R", "(Ljava/lang/String;Lzr2/a;Ljava/lang/String;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;", "P", "(Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;", "value", "kotlin.jvm.PlatformType", "Q", "(Ljava/lang/String;)Ljava/lang/String;", "S", "(Lj92/t;Ljava/lang/String;)Z", "", "a", "Ljava/util/List;", "cookieNames", "showConfirmDialog", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22390d {

    /* JADX INFO: renamed from: a */
    private static final List<String> f87583a = AbstractC37056f.m118959K("whoop-auth-token", "whoop-auth-expiry", "platform");

    /* JADX INFO: renamed from: kd1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.AuthenticatedWebViewKt$AuthenticatedWebView$2$1", m100430f = "AuthenticatedWebView.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f87584E;

        /* JADX INFO: renamed from: F */
        Object f87585F;

        /* JADX INFO: renamed from: G */
        Object f87586G;

        /* JADX INFO: renamed from: H */
        Object f87587H;

        /* JADX INFO: renamed from: I */
        Object f87588I;

        /* JADX INFO: renamed from: J */
        int f87589J;

        /* JADX INFO: renamed from: K */
        int f87590K;

        /* JADX INFO: renamed from: L */
        int f87591L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ C21452t f87592M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ String f87593N;

        /* JADX INFO: renamed from: O */
        final /* synthetic */ InterfaceC41070a f87594O;

        /* JADX INFO: renamed from: P */
        final /* synthetic */ C27858u f87595P;

        /* JADX INFO: renamed from: Q */
        final /* synthetic */ C39352a f87596Q;

        /* JADX INFO: renamed from: R */
        final /* synthetic */ FeatureFlagChecker f87597R;

        /* JADX INFO: renamed from: w */
        Object f87598w;

        /* JADX INFO: renamed from: x */
        Object f87599x;

        /* JADX INFO: renamed from: y */
        Object f87600y;

        /* JADX INFO: renamed from: z */
        Object f87601z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21452t c21452t, String str, InterfaceC41070a interfaceC41070a, C27858u c27858u, C39352a c39352a, FeatureFlagChecker featureFlagChecker, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87592M = c21452t;
            this.f87593N = str;
            this.f87594O = interfaceC41070a;
            this.f87595P = c27858u;
            this.f87596Q = c39352a;
            this.f87597R = featureFlagChecker;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f87592M, this.f87593N, this.f87594O, this.f87595P, this.f87596Q, this.f87597R, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x006b  */
        /* JADX WARN: Code duplicated, block: B:15:0x0097 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0095 -> B:16:0x0098). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                r83.a r7 = r83.EnumC31071a.f128113w
                int r0 = r14.f87591L
                r8 = 0
                r9 = 1
                if (r0 == 0) goto L41
                if (r0 != r9) goto L39
                int r0 = r14.f87589J
                java.lang.Object r1 = r14.f87588I
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r14.f87586G
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r2 = r14.f87585F
                com.whoop.data.repositories.FeatureFlagChecker r2 = (com.whoop.data.repositories.FeatureFlagChecker) r2
                java.lang.Object r3 = r14.f87584E
                y92.a r3 = (y92.C39352a) r3
                java.lang.Object r4 = r14.f87601z
                od1.u r4 = (od1.C27858u) r4
                java.lang.Object r5 = r14.f87600y
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r10 = r14.f87599x
                zr2.a r10 = (zr2.InterfaceC41070a) r10
                java.lang.Object r11 = r14.f87598w
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r4
                r4 = r3
                r3 = r11
                r11 = r1
                r12 = r2
                r2 = r5
                r1 = r10
                r10 = r0
                r0 = r15
                goto L98
            L39:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L41:
                p505ts.AbstractC34132o.m107864I(r15)
                j92.t r0 = r14.f87592M
                java.lang.String r1 = r14.f87593N
                boolean r0 = kd1.AbstractC22390d.m64404O(r0, r1)
                if (r0 == 0) goto La4
                java.util.List r0 = kd1.AbstractC22390d.m64403N()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                zr2.a r1 = r14.f87594O
                java.lang.String r2 = r14.f87593N
                od1.u r3 = r14.f87595P
                y92.a r4 = r14.f87596Q
                com.whoop.data.repositories.FeatureFlagChecker r5 = r14.f87597R
                java.util.Iterator r0 = r0.iterator()
                r11 = r0
                r12 = r5
                r10 = r8
            L65:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto La4
                java.lang.Object r0 = r11.next()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r5 = "new-auth-user-storage-android"
                boolean r5 = r12.isFeatureEnabled(r5)
                r13 = 0
                r14.f87598w = r13
                r14.f87599x = r1
                r14.f87600y = r2
                r14.f87601z = r3
                r14.f87584E = r4
                r14.f87585F = r12
                r14.f87586G = r11
                r14.f87587H = r13
                r14.f87588I = r13
                r14.f87589J = r10
                r14.f87590K = r8
                r14.f87591L = r9
                r6 = r14
                java.lang.Object r0 = kd1.AbstractC22390d.m64402M(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L98
                return r7
            L98:
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L65
                android.webkit.CookieManager r5 = android.webkit.CookieManager.getInstance()
                r5.setCookie(r2, r0)
                goto L65
            La4:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kd1.AbstractC22390d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kd1.d$b */
    @Metadata(m65680d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"kd1/d$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", ProfileAnalyticsKt.VIEW, "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", QueryParams.URL, "Ll83/a0;", "onLoadResource", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f87602a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC28601c1 f87603b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC28601c1 f87604c;

        public b(WebView webView, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f87602a = webView;
            this.f87603b = interfaceC28601c1;
            this.f87604c = interfaceC28601c2;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            boolean zCanGoBack = this.f87602a.canGoBack();
            boolean zCanGoForward = this.f87602a.canGoForward();
            if (((Boolean) this.f87603b.getValue()).booleanValue() != zCanGoBack) {
                this.f87603b.setValue(Boolean.valueOf(zCanGoBack));
            }
            if (((Boolean) this.f87604c.getValue()).booleanValue() != zCanGoForward) {
                this.f87604c.setValue(Boolean.valueOf(zCanGoForward));
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }

    /* JADX INFO: renamed from: kd1.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.AuthenticatedWebViewKt", m100430f = "AuthenticatedWebView.kt", m100431l = {229}, m100432m = "cookieValue", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f87605E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f87606F;

        /* JADX INFO: renamed from: G */
        int f87607G;

        /* JADX INFO: renamed from: w */
        Object f87608w;

        /* JADX INFO: renamed from: x */
        Object f87609x;

        /* JADX INFO: renamed from: y */
        Object f87610y;

        /* JADX INFO: renamed from: z */
        Object f87611z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f87606F = obj;
            this.f87607G |= Integer.MIN_VALUE;
            return AbstractC22390d.m64405P(null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: kd1.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.AuthenticatedWebViewKt", m100430f = "AuthenticatedWebView.kt", m100431l = {208}, m100432m = "generateCookie", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f87612E;

        /* JADX INFO: renamed from: F */
        boolean f87613F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f87614G;

        /* JADX INFO: renamed from: H */
        int f87615H;

        /* JADX INFO: renamed from: w */
        Object f87616w;

        /* JADX INFO: renamed from: x */
        Object f87617x;

        /* JADX INFO: renamed from: y */
        Object f87618y;

        /* JADX INFO: renamed from: z */
        Object f87619z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f87614G = obj;
            this.f87615H |= Integer.MIN_VALUE;
            return AbstractC22390d.m64407R(null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m64390A(C21148j c21148j, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC30795n.m94707h(c21148j.getMessage(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262138);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m64391B(InterfaceC41070a interfaceC41070a, C27858u c27858u, C39352a c39352a, C21452t c21452t, String str, String str2, C21148j c21148j, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m64426r(interfaceC41070a, c27858u, c39352a, c21452t, str, str2, c21148j, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m64392C(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    private static final void m64393D(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m64394E(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m64395F(String str, String str2, boolean z4, C21148j c21148j, InterfaceC4339a interfaceC4339a, FeatureFlagChecker featureFlagChecker, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, Composer composer, int i13) {
        float f13;
        boolean z13;
        InterfaceC28601c1 interfaceC28601c5;
        InterfaceC28601c1 interfaceC28601c6;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            long jM125408n = c38072d.m121949b(c28655q, 6).getBackgroundDarkAlt();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, jM125408n, c17916v0);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC6721d.c cVar = new AbstractC6721d.c(null, null, null, Integer.valueOf(AbstractC16272a.f62031Y), str2, null, null, null, null, null, null, null, null, 8167, null);
            boolean zM87155h = c28655q.m87155h(z4) | c28655q.m87157i(c21148j) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87155h || objM87133R == c28676v0) {
                objM87133R = new C12211k(z4, c21148j, interfaceC4339a, interfaceC28601c1, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, cVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, 0, 53);
            if (featureFlagChecker.isFeatureEnabled("webview-nav-bar-android")) {
                c28655q.m87150e0(1375218544);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 4), C2299e.f9107J, c28655q, 6);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
                Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                AbstractC27274q.a aVar = AbstractC27274q.a.f109136f;
                C27270o c27270o = new C27270o(aVar, AbstractC18489d0.m53357C(c38072d), null, null, null, ((Boolean) interfaceC28601c2.getValue()).booleanValue(), false, false, 0.0f, false, 988, null);
                String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62218B0, c28655q, 0);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21937b(4, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R2);
                }
                f13 = 1.0f;
                AbstractC27242b1.m82092d(c27270o, strM21273g, modifierM3419p, null, (InterfaceC4339a) objM87133R2, c28655q, 24960, 8);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                C27270o c27270o2 = new C27270o(aVar, AbstractC11895b.m31981D(c38072d), null, null, null, ((Boolean) interfaceC28601c3.getValue()).booleanValue(), false, false, 0.0f, false, 988, null);
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC16277f.f62222C0, c28655q, 0);
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C21937b(1, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierM3419p2, null, (InterfaceC4339a) objM87133R3, c28655q, 24960, 8);
                z13 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                f13 = 1.0f;
                z13 = true;
                c28655q.m87150e0(1376652356);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                interfaceC28601c5 = interfaceC28601c2;
                interfaceC28601c6 = interfaceC28601c3;
                objM87133R4 = new C3482x(interfaceC28601c4, interfaceC28601c5, interfaceC28601c6, 4);
                c28655q.m87172p0(objM87133R4);
            } else {
                interfaceC28601c5 = interfaceC28601c2;
                interfaceC28601c6 = interfaceC28601c3;
            }
            Function1 function1 = (Function1) objM87133R4;
            Modifier modifierM3407d = AbstractC1102d.m3407d(f13, c2314t);
            boolean zM87153g = c28655q.m87153g(str);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87153g || objM87133R5 == c28676v0) {
                objM87133R5 = new C22384a(str, interfaceC28601c5, interfaceC28601c6, 0);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC1137a.m3601a(function1, modifierM3407d, (Function1) objM87133R5, c28655q, 54, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m64396G(boolean z4, C21148j c21148j, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        if (!z4 || c21148j == null) {
            interfaceC4339a.invoke();
        } else {
            m64393D(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m64397H(InterfaceC28601c1 interfaceC28601c1) {
        WebView webView = (WebView) interfaceC28601c1.getValue();
        if (webView != null) {
            webView.goBack();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m64398I(InterfaceC28601c1 interfaceC28601c1) {
        WebView webView = (WebView) interfaceC28601c1.getValue();
        if (webView != null) {
            webView.goForward();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final WebView m64399J(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Context it) {
        AbstractC22676k.m65750j(it, "it");
        WebView webView = new WebView(it);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebViewClient(new b(webView, interfaceC28601c2, interfaceC28601c3));
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        interfaceC28601c1.setValue(webView);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m64400K(String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, WebView webView) {
        AbstractC22676k.m65750j(webView, "webView");
        webView.loadUrl(str);
        interfaceC28601c1.setValue(Boolean.valueOf(webView.canGoBack()));
        interfaceC28601c2.setValue(Boolean.valueOf(webView.canGoForward()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: P */
    public static final Object m64405P(String str, InterfaceC41070a interfaceC41070a, C27858u c27858u, C39352a c39352a, boolean z4, InterfaceC30057d<? super String> interfaceC30057d) {
        c cVar;
        AuthToken authToken;
        AuthToken authToken2;
        String accessToken;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f87607G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f87607G = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM125478a = cVar.f87606F;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f87607G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125478a);
            int iHashCode = str.hashCode();
            if (iHashCode != 761862730) {
                if (iHashCode != 1874684019) {
                    if (iHashCode == 1977818626 && str.equals("whoop-auth-token")) {
                        if (!z4) {
                            Session sessionM84057h = c27858u.m84057h();
                            if (sessionM84057h == null || (authToken = sessionM84057h.getAuthToken()) == null) {
                                return null;
                            }
                            return authToken.getAccessToken();
                        }
                        cVar.f87608w = null;
                        cVar.f87609x = null;
                        cVar.f87610y = c27858u;
                        cVar.f87611z = null;
                        cVar.f87605E = z4;
                        cVar.f87607G = 1;
                        objM125478a = c39352a.m125478a(cVar);
                        if (objM125478a == obj) {
                            return obj;
                        }
                    }
                } else if (str.equals("platform")) {
                    return "android-app";
                }
            } else if (str.equals("whoop-auth-expiry")) {
                return String.valueOf(interfaceC41070a.mo133364c().plusSeconds(14400).getMillis());
            }
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c27858u = (C27858u) cVar.f87610y;
        AbstractC34132o.m107864I(objM125478a);
        AuthMaterial authMaterial = (AuthMaterial) objM125478a;
        if (authMaterial != null && (accessToken = authMaterial.getAccessToken()) != null) {
            return accessToken;
        }
        Session sessionM84057h2 = c27858u.m84057h();
        if (sessionM84057h2 == null || (authToken2 = sessionM84057h2.getAuthToken()) == null) {
            return null;
        }
        return authToken2.getAccessToken();
    }

    /* JADX INFO: renamed from: Q */
    private static final String m64406Q(String str) {
        return URLEncoder.encode(str, "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: R */
    public static final Object m64407R(String str, InterfaceC41070a interfaceC41070a, String str2, C27858u c27858u, C39352a c39352a, boolean z4, InterfaceC30057d<? super String> interfaceC30057d) {
        d dVar;
        String str3;
        InterfaceC41070a interfaceC41070a2;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f87615H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f87615H = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM64405P = dVar2.f87614G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f87615H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM64405P);
            dVar2.f87616w = str;
            dVar2.f87617x = interfaceC41070a;
            dVar2.f87618y = str2;
            dVar2.f87619z = null;
            dVar2.f87612E = null;
            dVar2.f87613F = z4;
            dVar2.f87615H = 1;
            objM64405P = m64405P(str, interfaceC41070a, c27858u, c39352a, z4, dVar2);
            if (objM64405P == enumC31071a) {
                return enumC31071a;
            }
            str3 = str;
            interfaceC41070a2 = interfaceC41070a;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) dVar2.f87618y;
            interfaceC41070a2 = (InterfaceC41070a) dVar2.f87617x;
            str3 = (String) dVar2.f87616w;
            AbstractC34132o.m107864I(objM64405P);
        }
        String str4 = (String) objM64405P;
        if (str4 == null) {
            return null;
        }
        String strM64406Q = m64406Q(str3);
        String strM64406Q2 = m64406Q(str4);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH':'mm':'ss 'GMT'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str5 = simpleDateFormat.format(interfaceC41070a2.mo133364c().plusSeconds(14400).toDate());
        String host = new URI(str2).getHost();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(strM64406Q);
        sb4.append("=");
        sb4.append(strM64406Q2);
        sb4.append(";Domain=");
        sb4.append(host);
        return AbstractC25012a.m73376i(";Path=/;Secure;Expires=", str5, sb4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final boolean m64408S(C21452t c21452t, String str) {
        return AbstractC21453u.m60388a(c21452t, str);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0149  */
    /* JADX WARN: Code duplicated, block: B:105:0x015c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0177  */
    /* JADX WARN: Code duplicated, block: B:111:0x0195  */
    /* JADX WARN: Code duplicated, block: B:112:0x0197  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:129:0x022a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0297  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ae A[PHI: r14
      0x00ae: PHI (r14v30 int) = (r14v0 int), (r14v6 int), (r14v7 int) binds: [B:54:0x00ac, B:64:0x00c6, B:63:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b A[PHI: r4 r6 r10
      0x010b: PHI (r4v35 int) = (r4v19 int), (r4v16 int), (r4v36 int) binds: [B:95:0x0128, B:84:0x0107, B:85:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r6v17 j92.t) = (r6v7 j92.t), (r6v4 j92.t), (r6v4 j92.t) binds: [B:95:0x0128, B:84:0x0107, B:85:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r10v12 java.lang.String) = (r10v5 java.lang.String), (r10v3 java.lang.String), (r10v3 java.lang.String) binds: [B:95:0x0128, B:84:0x0107, B:85:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:91:0x0118  */
    /* JADX WARN: Code duplicated, block: B:94:0x0126  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0136  */
    /* JADX INFO: renamed from: r */
    public static final void m64426r(InterfaceC41070a interfaceC41070a, C27858u c27858u, C39352a authManager, C21452t c21452t, String url, String str, C21148j c21148j, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        C21452t c21452t2;
        String str2;
        int i16;
        int i17;
        boolean zM87157i;
        boolean z4;
        C28655q c28655q;
        C21148j c21148j2;
        C21452t c21452t3;
        String str3;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        int i19;
        C21148j c21148j3;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        FeatureFlagChecker featureFlagChecker;
        Object objM87133R5;
        boolean zIsFeatureEnabled;
        boolean z13;
        boolean zM87157i2;
        Object objM87133R6;
        FeatureFlagChecker featureFlagChecker2;
        boolean z14;
        boolean z15;
        C21452t c21452t4;
        String str4;
        boolean z16;
        Object objM87133R7;
        boolean z17;
        int i24;
        int i25;
        InterfaceC41070a dateProvider = interfaceC41070a;
        C27858u userContext = c27858u;
        InterfaceC4339a onDismiss = interfaceC4339a;
        AbstractC22676k.m65750j(dateProvider, "dateProvider");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-924850229);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(dateProvider) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(userContext) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(authManager) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c21452t2 = c21452t;
                if (c28655q2.m87157i(c21452t2)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i25;
            } else {
                c21452t2 = c21452t;
            }
            i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i25;
        } else {
            c21452t2 = c21452t;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(url) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i26 = i14 & 32;
        if (i26 == 0) {
            if ((196608 & i13) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 64;
            i17 = 1572864;
            if (i16 == 0) {
                i15 |= i17;
            } else if ((1572864 & i13) == 0) {
                if ((2097152 & i13) == 0) {
                    zM87157i = c28655q2.m87153g(c21148j);
                } else {
                    zM87157i = c28655q2.m87157i(c21148j);
                }
                if (zM87157i) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q2.m87157i(onDismiss)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i15 |= i24;
            }
            if ((4793491 & i15) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0 || c28655q2.m87118C()) {
                    if ((i14 & 8) != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C21452t();
                            c28655q2.m87172p0(objM87133R);
                        }
                        c21452t2 = (C21452t) objM87133R;
                        i15 &= -7169;
                    }
                    if (i26 != 0) {
                        str2 = "";
                    }
                    if (i16 != 0) {
                        i19 = i15;
                        c21148j3 = null;
                    }
                    c28655q2.m87175r();
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("webview-dismiss-confirmation");
                    boolean zM87157i3 = c28655q2.m87157i(c21452t2);
                    if ((i19 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i2 = zM87157i3 | z13 | c28655q2.m87157i(dateProvider) | c28655q2.m87157i(userContext) | c28655q2.m87157i(authManager) | c28655q2.m87157i(featureFlagChecker);
                    objM87133R6 = c28655q2.m87133R();
                    if (!zM87157i2 || objM87133R6 == c28676v0) {
                        C21452t c21452t5 = c21452t2;
                        featureFlagChecker2 = featureFlagChecker;
                        z14 = false;
                        z15 = true;
                        a aVar = new a(c21452t5, url, dateProvider, userContext, authManager, featureFlagChecker2, null);
                        c21452t4 = c21452t5;
                        str4 = url;
                        dateProvider = dateProvider;
                        userContext = userContext;
                        c28655q2.m87172p0(aVar);
                        objM87133R6 = aVar;
                    } else {
                        str4 = url;
                        c21452t4 = c21452t2;
                        z14 = false;
                        z15 = true;
                        featureFlagChecker2 = featureFlagChecker;
                    }
                    AbstractC28683x.m87255i(str4, userContext, dateProvider, (InterfaceC4351m) objM87133R6, c28655q2);
                    if ((29360128 & i19) == 8388608) {
                        z16 = z15;
                    } else {
                        z16 = z14;
                    }
                    objM87133R7 = c28655q2.m87133R();
                    if (z16 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C21026a(onDismiss, 9);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R7;
                    C3948a0 c3948a0 = new C3948a0(z15, z14, z14);
                    String str5 = str2;
                    z17 = z14;
                    final C21148j c21148j4 = c21148j3;
                    C16199m c16199m = new C16199m(str4, str5, zIsFeatureEnabled, c21148j4, onDismiss, featureFlagChecker2, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3);
                    onDismiss = onDismiss;
                    AbstractC32411b.m101089d(interfaceC4339a2, c3948a0, AbstractC37817c.m121344e(11714402, c28655q2, c16199m), c28655q2, 432);
                    if (zIsFeatureEnabled || !m64392C(interfaceC28601c4) || c21148j4 == null) {
                        c28655q = c28655q2;
                        c28655q.m87150e0(8539223);
                        c28655q.m87173q(z17);
                    } else {
                        c28655q2.m87150e0(7727178);
                        Object objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C21937b(3, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        C37816b c37816bM121344e = AbstractC37817c.m121344e(485004510, c28655q2, new C21859k(onDismiss, interfaceC28601c4, c21148j4, 1));
                        C37816b c37816bM121344e2 = AbstractC37817c.m121344e(1376079132, c28655q2, new C21245d(4, interfaceC28601c4, c21148j4));
                        final int i27 = 0;
                        C37816b c37816bM121344e3 = AbstractC37817c.m121344e(1821616443, c28655q2, new InterfaceC4351m() { // from class: kd1.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int i28 = i27;
                                Composer composer2 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                switch (i28) {
                                    case 0:
                                        return AbstractC22390d.m64434z(c21148j4, composer2, iIntValue);
                                    default:
                                        return AbstractC22390d.m64390A(c21148j4, composer2, iIntValue);
                                }
                            }
                        });
                        final int i28 = 1;
                        AbstractC11894a.m31952a((InterfaceC4339a) objM87133R8, c37816bM121344e, null, c37816bM121344e2, c37816bM121344e3, AbstractC37817c.m121344e(-2027813542, c28655q2, new InterfaceC4351m() { // from class: kd1.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int i29 = i28;
                                Composer composer2 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                switch (i29) {
                                    case 0:
                                        return AbstractC22390d.m64434z(c21148j4, composer2, iIntValue);
                                    default:
                                        return AbstractC22390d.m64390A(c21148j4, composer2, iIntValue);
                                }
                            }
                        }), null, 0L, 0L, null, c28655q2, 224310, 964);
                        c28655q = c28655q2;
                        c28655q.m87173q(z17);
                    }
                    str3 = str5;
                    c21148j2 = c21148j4;
                    c21452t3 = c21452t4;
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                }
                c21148j3 = c21148j;
                i19 = i15;
                c28655q2.m87175r();
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R4;
                featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R5;
                zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("webview-dismiss-confirmation");
                boolean zM87157i4 = c28655q2.m87157i(c21452t2);
                if ((i19 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i2 = zM87157i4 | z13 | c28655q2.m87157i(dateProvider) | c28655q2.m87157i(userContext) | c28655q2.m87157i(authManager) | c28655q2.m87157i(featureFlagChecker);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    C21452t c21452t6 = c21452t2;
                    featureFlagChecker2 = featureFlagChecker;
                    z14 = false;
                    z15 = true;
                    a aVar2 = new a(c21452t6, url, dateProvider, userContext, authManager, featureFlagChecker2, null);
                    c21452t4 = c21452t6;
                    str4 = url;
                    dateProvider = dateProvider;
                    userContext = userContext;
                    c28655q2.m87172p0(aVar2);
                    objM87133R6 = aVar2;
                } else {
                    C21452t c21452t7 = c21452t2;
                    featureFlagChecker2 = featureFlagChecker;
                    z14 = false;
                    z15 = true;
                    a aVar3 = new a(c21452t7, url, dateProvider, userContext, authManager, featureFlagChecker2, null);
                    c21452t4 = c21452t7;
                    str4 = url;
                    dateProvider = dateProvider;
                    userContext = userContext;
                    c28655q2.m87172p0(aVar3);
                    objM87133R6 = aVar3;
                }
                AbstractC28683x.m87255i(str4, userContext, dateProvider, (InterfaceC4351m) objM87133R6, c28655q2);
                if ((29360128 & i19) == 8388608) {
                    z16 = z15;
                } else {
                    z16 = z14;
                }
                objM87133R7 = c28655q2.m87133R();
                if (z16) {
                    objM87133R7 = new C21026a(onDismiss, 9);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C21026a(onDismiss, 9);
                    c28655q2.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R7;
                C3948a0 c3948a1 = new C3948a0(z15, z14, z14);
                String str6 = str2;
                z17 = z14;
                final C21148j c21148j5 = c21148j3;
                C16199m c16199m2 = new C16199m(str4, str6, zIsFeatureEnabled, c21148j5, onDismiss, featureFlagChecker2, interfaceC28601c8, interfaceC28601c5, interfaceC28601c6, interfaceC28601c7);
                onDismiss = onDismiss;
                AbstractC32411b.m101089d(interfaceC4339a3, c3948a1, AbstractC37817c.m121344e(11714402, c28655q2, c16199m2), c28655q2, 432);
                if (zIsFeatureEnabled) {
                    c28655q = c28655q2;
                    c28655q.m87150e0(8539223);
                    c28655q.m87173q(z17);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87150e0(8539223);
                    c28655q.m87173q(z17);
                }
                str3 = str6;
                c21148j2 = c21148j5;
                c21452t3 = c21452t4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c21148j2 = c21148j;
                c21452t3 = c21452t2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(interfaceC41070a, c27858u, authManager, c21452t3, url, str3, c21148j2, onDismiss, i13, i14, 9);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        str2 = str;
        i16 = i14 & 64;
        i17 = 1572864;
        if (i16 == 0) {
            i15 |= i17;
        } else if ((1572864 & i13) == 0) {
            if ((2097152 & i13) == 0) {
                zM87157i = c28655q2.m87153g(c21148j);
            } else {
                zM87157i = c28655q2.m87157i(c21148j);
            }
            if (zM87157i) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i15 |= i17;
        }
        if ((12582912 & i13) == 0) {
            if (c28655q2.m87157i(onDismiss)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i15 |= i24;
        }
        if ((4793491 & i15) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if ((i14 & 8) != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C21452t();
                        c28655q2.m87172p0(objM87133R);
                    }
                    c21452t2 = (C21452t) objM87133R;
                    i15 &= -7169;
                }
                if (i26 != 0) {
                    str2 = "";
                }
                if (i16 != 0) {
                    i19 = i15;
                    c21148j3 = null;
                } else {
                    c21148j3 = c21148j;
                    i19 = i15;
                }
            } else {
                if ((i14 & 8) != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C21452t();
                        c28655q2.m87172p0(objM87133R);
                    }
                    c21452t2 = (C21452t) objM87133R;
                    i15 &= -7169;
                }
                if (i26 != 0) {
                    str2 = "";
                }
                if (i16 != 0) {
                    i19 = i15;
                    c21148j3 = null;
                } else {
                    c21148j3 = c21148j;
                    i19 = i15;
                }
            }
            c28655q2.m87175r();
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R4;
            featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R5;
            zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("webview-dismiss-confirmation");
            boolean zM87157i5 = c28655q2.m87157i(c21452t2);
            if ((i19 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i2 = zM87157i5 | z13 | c28655q2.m87157i(dateProvider) | c28655q2.m87157i(userContext) | c28655q2.m87157i(authManager) | c28655q2.m87157i(featureFlagChecker);
            objM87133R6 = c28655q2.m87133R();
            if (zM87157i2) {
                C21452t c21452t8 = c21452t2;
                featureFlagChecker2 = featureFlagChecker;
                z14 = false;
                z15 = true;
                a aVar4 = new a(c21452t8, url, dateProvider, userContext, authManager, featureFlagChecker2, null);
                c21452t4 = c21452t8;
                str4 = url;
                dateProvider = dateProvider;
                userContext = userContext;
                c28655q2.m87172p0(aVar4);
                objM87133R6 = aVar4;
            } else {
                C21452t c21452t9 = c21452t2;
                featureFlagChecker2 = featureFlagChecker;
                z14 = false;
                z15 = true;
                a aVar5 = new a(c21452t9, url, dateProvider, userContext, authManager, featureFlagChecker2, null);
                c21452t4 = c21452t9;
                str4 = url;
                dateProvider = dateProvider;
                userContext = userContext;
                c28655q2.m87172p0(aVar5);
                objM87133R6 = aVar5;
            }
            AbstractC28683x.m87255i(str4, userContext, dateProvider, (InterfaceC4351m) objM87133R6, c28655q2);
            if ((29360128 & i19) == 8388608) {
                z16 = z15;
            } else {
                z16 = z14;
            }
            objM87133R7 = c28655q2.m87133R();
            if (z16) {
                objM87133R7 = new C21026a(onDismiss, 9);
                c28655q2.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C21026a(onDismiss, 9);
                c28655q2.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R7;
            C3948a0 c3948a2 = new C3948a0(z15, z14, z14);
            String str7 = str2;
            z17 = z14;
            final C21148j c21148j6 = c21148j3;
            C16199m c16199m3 = new C16199m(str4, str7, zIsFeatureEnabled, c21148j6, onDismiss, featureFlagChecker2, interfaceC28601c12, interfaceC28601c9, interfaceC28601c10, interfaceC28601c11);
            onDismiss = onDismiss;
            AbstractC32411b.m101089d(interfaceC4339a4, c3948a2, AbstractC37817c.m121344e(11714402, c28655q2, c16199m3), c28655q2, 432);
            if (zIsFeatureEnabled) {
                c28655q = c28655q2;
                c28655q.m87150e0(8539223);
                c28655q.m87173q(z17);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(8539223);
                c28655q.m87173q(z17);
            }
            str3 = str7;
            c21148j2 = c21148j6;
            c21452t3 = c21452t4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c21148j2 = c21148j;
            c21452t3 = c21452t2;
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(interfaceC41070a, c27858u, authManager, c21452t3, url, str3, c21148j2, onDismiss, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m64427s(InterfaceC28601c1 interfaceC28601c1) {
        m64393D(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m64428t(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, C21148j c21148j, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C10999t0(interfaceC4339a, interfaceC28601c1, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12350b.m34583d((InterfaceC4339a) objM87133R, null, false, null, null, null, null, AbstractC37817c.m121344e(900291841, c28655q, new C22386b(c21148j, 0)), c28655q, 805306368, 510);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m64429u(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        m64393D(interfaceC28601c1, false);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m64430v(C21148j c21148j, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC30795n.m94707h(c21148j.getConfirmTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262138);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m64431w(InterfaceC28601c1 interfaceC28601c1, C21148j c21148j, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C21937b(2, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12350b.m34583d((InterfaceC4339a) objM87133R, null, false, null, null, null, null, AbstractC37817c.m121344e(1791366463, c28655q, new C22386b(c21148j, 1)), c28655q, 805306374, 510);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m64432x(InterfaceC28601c1 interfaceC28601c1) {
        m64393D(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m64433y(C21148j c21148j, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC30795n.m94707h(c21148j.getCancelTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262138);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m64434z(C21148j c21148j, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC30795n.m94707h(c21148j.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262138);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
