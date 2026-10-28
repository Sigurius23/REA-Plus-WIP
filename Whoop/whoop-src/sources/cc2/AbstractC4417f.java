package cc2;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import be1.C3169c;
import c41.C4007d1;
import c62.C4273a;
import c93.InterfaceC4351m;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21166s;
import j02.EnumC21172v;
import java.util.Locale;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import p000.AbstractC11266d;
import p003a1.C0103b;
import p026b2.C2314t;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cc2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcc2/c;", "itemState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lcc2/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcc2/a;", "viewState", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4417f {

    /* JADX INFO: renamed from: cc2.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.optout.presentation.LanguageBetaOptOutWrapperKt$LanguageBetaOptOutWrapper$2$1", m100430f = "LanguageBetaOptOutWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f17873w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f17874x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f17875y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17874x = function1;
            this.f17875y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f17874x, this.f17875y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f17873w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC4417f.m13859g(this.f17875y).getShouldDismiss()) {
                this.f17874x.invoke(new C21166s(EnumC21172v.AUTO, null, null, 6, null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cc2.f$b */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"cc2/f$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", ProfileAnalyticsKt.VIEW, "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC23864c<C4412a, InterfaceC4415d> f17876a;

        public b(AbstractC23864c<C4412a, InterfaceC4415d> abstractC23864c) {
            this.f17876a = abstractC23864c;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
            AbstractC22676k.m65750j(request, "request");
            String string = request.getUrl().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            if (AbstractC39414r.m125876U(lowerCase, "complete-submission", false)) {
                this.f17876a.mo1216g(InterfaceC4415d.a.f17841a);
            }
            return super.shouldInterceptRequest(view, request);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0218  */
    /* JADX WARN: Code duplicated, block: B:103:0x022c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0236  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:71:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:75:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x020f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public static final void m13857e(C4414c itemState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        int i18;
        boolean z4;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        C4412a c4412a;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        int i19;
        boolean z16;
        boolean zM87157i;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R5;
        Object obj;
        Object obj2;
        boolean zM87153g3;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(876732396);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(itemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = 1;
                z4 = false;
                if ((i15 & 147) != 146) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i24 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4273a(3);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function3 = (Function1) objM87133R7;
                    } else {
                        function3 = function2;
                    }
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    c4412a = new C4412a(z4, i18, defaultConstructorMarker);
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c4412a) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == c28676v0) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c4412a, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                    } else {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj = null;
                            abstractC23864c = null;
                            obj2 = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext2;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c4412a) | c28655q.m87153g(null);
                            objM87133R5 = c28655q.m87133R();
                            if (!zM87153g2 || objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, new C23863b(c4412a), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                obj = null;
                                obj2 = null;
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R5;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c4412a) | c28655q.m87153g(obj);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87153g3 || objM87133R6 == c28676v0) {
                                objM87133R6 = new C23863b(c4412a);
                                c28655q.m87172p0(objM87133R6);
                            }
                            abstractC23864c = (C23863b) objM87133R6;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C4412a(z4, i18, defaultConstructorMarker), null, c28655q, 0, 2);
                    Boolean boolValueOf = Boolean.valueOf(m13859g(interfaceC28601c1M87260n).getShouldDismiss());
                    boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1M87260n);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87153g4 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z15 || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(function3, interfaceC28601c1M87260n, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier3);
                    i19 = i15 & 14;
                    if (i19 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i = z16 | c28655q.m87157i(abstractC23864c);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i || objM87133R3 == c28676v0) {
                        objM87133R3 = new C3169c(11, itemState, abstractC23864c);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function4 = (Function1) objM87133R3;
                    i18 = i19 != 4 ? 0 : 1;
                    objM87133R4 = c28655q.m87133R();
                    if (i18 == 0 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C0103b(itemState, 28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC1137a.m3601a(function4, modifierM3407d, (Function1) objM87133R4, c28655q, 0, 0);
                    modifier2 = modifier3;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4007d1(i13, i14, 9, modifier2, function3, itemState);
                }
            }
            i15 |= 384;
            function2 = function1;
            i18 = 1;
            z4 = false;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C4273a(3);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                c4412a = new C4412a(z4, i18, defaultConstructorMarker2);
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                        obj2 = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext3;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c4412a) | c28655q.m87153g(null);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, new C23863b(c4412a), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, new C23863b(c4412a), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R5;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c4412a) | c28655q.m87153g(obj);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R6 = new C23863b(c4412a);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C23863b(c4412a);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (C23863b) objM87133R6;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c4412a) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c4412a, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c4412a, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                }
                c28655q.m87173q(false);
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C4412a(z4, i18, defaultConstructorMarker2), null, c28655q, 0, 2);
                Boolean boolValueOf2 = Boolean.valueOf(m13859g(interfaceC28601c1M87260n).getShouldDismiss());
                boolean zM87153g5 = c28655q.m87153g(interfaceC28601c1M87260n);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87153g5 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new a(function3, interfaceC28601c1M87260n, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(function3, interfaceC28601c1M87260n, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf2);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier3);
                i19 = i15 & 14;
                if (i19 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = z16 | c28655q.m87157i(abstractC23864c);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C3169c(11, itemState, abstractC23864c);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3169c(11, itemState, abstractC23864c);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function5 = (Function1) objM87133R3;
                if (i19 != 4) {
                }
                objM87133R4 = c28655q.m87133R();
                if (i18 == 0) {
                    objM87133R4 = new C0103b(itemState, 28);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C0103b(itemState, 28);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC1137a.m3601a(function5, modifierM3407d2, (Function1) objM87133R4, c28655q, 0, 0);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 9, modifier2, function3, itemState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = 1;
            z4 = false;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C4273a(3);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                DefaultConstructorMarker defaultConstructorMarker3 = null;
                c4412a = new C4412a(z4, i18, defaultConstructorMarker3);
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                        obj2 = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext4 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext4, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext4;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c4412a) | c28655q.m87153g(null);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, new C23863b(c4412a), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, new C23863b(c4412a), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R5;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c4412a) | c28655q.m87153g(obj);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R6 = new C23863b(c4412a);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C23863b(c4412a);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (C23863b) objM87133R6;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c4412a) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c4412a, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c4412a, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                }
                c28655q.m87173q(false);
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C4412a(z4, i18, defaultConstructorMarker3), null, c28655q, 0, 2);
                Boolean boolValueOf3 = Boolean.valueOf(m13859g(interfaceC28601c1M87260n).getShouldDismiss());
                boolean zM87153g6 = c28655q.m87153g(interfaceC28601c1M87260n);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87153g6 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new a(function3, interfaceC28601c1M87260n, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(function3, interfaceC28601c1M87260n, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf3);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, modifier3);
                i19 = i15 & 14;
                if (i19 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = z16 | c28655q.m87157i(abstractC23864c);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C3169c(11, itemState, abstractC23864c);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3169c(11, itemState, abstractC23864c);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function6 = (Function1) objM87133R3;
                if (i19 != 4) {
                }
                objM87133R4 = c28655q.m87133R();
                if (i18 == 0) {
                    objM87133R4 = new C0103b(itemState, 28);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C0103b(itemState, 28);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC1137a.m3601a(function6, modifierM3407d3, (Function1) objM87133R4, c28655q, 0, 0);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 9, modifier2, function3, itemState);
            }
        }
        i15 |= 384;
        function2 = function1;
        i18 = 1;
        z4 = false;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i24 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C4273a(3);
                    c28655q.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            } else {
                function3 = function2;
            }
            DefaultConstructorMarker defaultConstructorMarker4 = null;
            c4412a = new C4412a(z4, i18, defaultConstructorMarker4);
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj = null;
                    abstractC23864c = null;
                    obj2 = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext5 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext5, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext5;
                    zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c4412a) | c28655q.m87153g(null);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, new C23863b(c4412a), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, new C23863b(c4412a), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R5;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c4412a) | c28655q.m87153g(obj);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R6 = new C23863b(c4412a);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C23863b(c4412a);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (C23863b) objM87133R6;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c4412a) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c4412a, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c4412a, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4416e.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
            }
            c28655q.m87173q(false);
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C4412a(z4, i18, defaultConstructorMarker4), null, c28655q, 0, 2);
            Boolean boolValueOf4 = Boolean.valueOf(m13859g(interfaceC28601c1M87260n).getShouldDismiss());
            boolean zM87153g7 = c28655q.m87153g(interfaceC28601c1M87260n);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87153g7 | z14;
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new a(function3, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(function3, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf4);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, modifier3);
            i19 = i15 & 14;
            if (i19 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i = z16 | c28655q.m87157i(abstractC23864c);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new C3169c(11, itemState, abstractC23864c);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3169c(11, itemState, abstractC23864c);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function7 = (Function1) objM87133R3;
            if (i19 != 4) {
            }
            objM87133R4 = c28655q.m87133R();
            if (i18 == 0) {
                objM87133R4 = new C0103b(itemState, 28);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C0103b(itemState, 28);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC1137a.m3601a(function7, modifierM3407d4, (Function1) objM87133R4, c28655q, 0, 0);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(i13, i14, 9, modifier2, function3, itemState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m13858f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C4412a m13859g(InterfaceC28670t2 interfaceC28670t2) {
        return (C4412a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final WebView m13860h(C4414c c4414c, AbstractC23864c abstractC23864c, Context webViewContext) {
        AbstractC22676k.m65750j(webViewContext, "webViewContext");
        WebView webView = new WebView(webViewContext);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (c4414c.getEnableJavascript()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        webView.setWebViewClient(new b(abstractC23864c));
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m13861i(C4414c c4414c, WebView webView) {
        AbstractC22676k.m65750j(webView, "webView");
        webView.loadUrl(c4414c.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m13862j(C4414c c4414c, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m13857e(c4414c, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
