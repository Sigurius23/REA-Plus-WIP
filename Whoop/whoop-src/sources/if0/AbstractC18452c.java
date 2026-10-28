package if0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.view.C9812h;
import ef0.AbstractC13142a;
import ff0.AbstractC14424a;
import ff0.AbstractC14426c;
import fy1.AbstractC14874j;
import ge0.C15728c;
import gy0.AbstractC16277f;
import ht2.C17632d;
import hy0.C17794v;
import ib0.C18332c;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15079m3;
import p178gz.C16283a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: if0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\n\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"", QueryParams.URL, "Lff0/c;", "viewState", "Lkotlin/Function1;", "Lff0/a;", "Ll83/a0;", "onViewEvent", "Lef0/a;", "onNavigationEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Lff0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "n", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18452c {

    /* JADX INFO: renamed from: if0.c$a */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"if0/c$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", ProfileAnalyticsKt.VIEW, "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends WebViewClient {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f71872a;

        public a(Function1 function1) {
            this.f71872a = function1;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
            this.f71872a.invoke(new AbstractC14424a.d(request != null ? request.getUrl() : null));
            return super.shouldInterceptRequest(view, request);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m53167A(Function1 function1) {
        function1.invoke(AbstractC14424a.c.f52608a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m53168B(String str, AbstractC14426c abstractC14426c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m53191w(str, abstractC14426c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0157  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: n */
    public static final void m53182n(String url, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        Function1 function10;
        boolean z15;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(url, "url");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-480516070);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(url) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C18332c(16);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C18332c(17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t)));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    function9 = function7;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(""), null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, false, AbstractC37817c.m121344e(679975060, c28655q, new C9812h(function8, 2)), null, null, null, null, null, null, null, 32634, null);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C18451b(function8, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function11 = function8;
                    AbstractC6719b.m20143d(modifierM3409f, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (!z14 || objM87133R2 == c28676v0) {
                        function10 = function9;
                        objM87133R2 = new C15728c(function10, 25);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function10 = function9;
                    }
                    Function1 function12 = (Function1) objM87133R2;
                    if ((i15 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C17632d(url, 1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC1137a.m3601a(function12, modifierM3407d, (Function1) objM87133R3, c28655q, 48, 0);
                    c28655q.m87173q(true);
                    function6 = function11;
                    function5 = function10;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C17794v(i13, i14, 10, (Object) url, (Object) function6, function5);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C18332c(16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18332c(17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t2)));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                function9 = function7;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66720i2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(""), null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, false, AbstractC37817c.m121344e(679975060, c28655q, new C9812h(function8, 2)), null, null, null, null, null, null, null, 32634, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C18451b(function8, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C18451b(function8, 0);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function13 = function8;
                AbstractC6719b.m20143d(modifierM3409f2, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    function10 = function9;
                    objM87133R2 = new C15728c(function10, 25);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function10 = function9;
                    objM87133R2 = new C15728c(function10, 25);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function14 = (Function1) objM87133R2;
                if ((i15 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C17632d(url, 1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C17632d(url, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC1137a.m3601a(function14, modifierM3407d2, (Function1) objM87133R3, c28655q, 48, 0);
                c28655q.m87173q(true);
                function6 = function13;
                function5 = function10;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 10, (Object) url, (Object) function6, function5);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C18332c(16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18332c(17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM66720i3 = AbstractC22953f.m66720i(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t3)));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                function9 = function7;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66720i3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(AbstractC8693b.m21278l(""), null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, false, AbstractC37817c.m121344e(679975060, c28655q, new C9812h(function8, 2)), null, null, null, null, null, null, null, 32634, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C18451b(function8, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C18451b(function8, 0);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function15 = function8;
                AbstractC6719b.m20143d(modifierM3409f3, aVar3, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t3);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    function10 = function9;
                    objM87133R2 = new C15728c(function10, 25);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function10 = function9;
                    objM87133R2 = new C15728c(function10, 25);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function16 = (Function1) objM87133R2;
                if ((i15 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C17632d(url, 1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C17632d(url, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC1137a.m3601a(function16, modifierM3407d3, (Function1) objM87133R3, c28655q, 48, 0);
                c28655q.m87173q(true);
                function6 = function15;
                function5 = function10;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 10, (Object) url, (Object) function6, function5);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C18332c(16);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C18332c(17);
                    c28655q.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM66720i4 = AbstractC22953f.m66720i(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t4)));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            function9 = function7;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66720i4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(AbstractC8693b.m21278l(""), null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, false, AbstractC37817c.m121344e(679975060, c28655q, new C9812h(function8, 2)), null, null, null, null, null, null, null, 32634, null);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C18451b(function8, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C18451b(function8, 0);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function17 = function8;
            AbstractC6719b.m20143d(modifierM3409f4, aVar4, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t4);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                function10 = function9;
                objM87133R2 = new C15728c(function10, 25);
                c28655q.m87172p0(objM87133R2);
            } else {
                function10 = function9;
                objM87133R2 = new C15728c(function10, 25);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function18 = (Function1) objM87133R2;
            if ((i15 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z15) {
                objM87133R3 = new C17632d(url, 1);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C17632d(url, 1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC1137a.m3601a(function18, modifierM3407d4, (Function1) objM87133R3, c28655q, 48, 0);
            c28655q.m87173q(true);
            function6 = function17;
            function5 = function10;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 10, (Object) url, (Object) function6, function5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m53183o(AbstractC14424a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m53184p(AbstractC13142a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m53185q(Function1 function1, Composer composer, int i13) {
        int i14 = 2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC16277f.f62311c0, null, i14, 0 == true ? 1 : 0);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C15728c(function1, 24);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27265l0.m82217i(null, enumC27269n0, c8688b, null, null, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.C8688b.f25889c << 6) | 48, 0, 4089);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m53186r(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(AbstractC13142a.b.f45452a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m53187s(Function1 function1) {
        function1.invoke(AbstractC13142a.a.f45451a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final WebView m53188t(Function1 function1, Context context) {
        AbstractC22676k.m65750j(context, "context");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new a(function1));
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m53189u(String str, WebView webView) {
        AbstractC22676k.m65750j(webView, "webView");
        webView.loadUrl(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m53190v(String str, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m53182n(str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0263  */
    /* JADX WARN: Code duplicated, block: B:106:0x026e  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x0195  */
    /* JADX WARN: Code duplicated, block: B:80:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01da  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0217  */
    /* JADX WARN: Code duplicated, block: B:94:0x0219  */
    /* JADX WARN: Code duplicated, block: B:97:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0222  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static final void m53191w(String str, AbstractC14426c viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        int i19;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        List list;
        Object[] objArr;
        Object objM87133R;
        Object[] objArr2;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1141400930);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C18332c(14);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    } else {
                        function5 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C18332c(15);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    i19 = i18 >> 3;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_typeform_webview", c28655q, (i19 & 14) | 48);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (str != null) {
                        c28655q.m87150e0(1822786721);
                        m53182n(str, function5, function7, c28655q, (i19 & 896) | (i18 & 14) | (i19 & 112), 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1822976038);
                        c28655q.m87173q(false);
                    }
                    if (viewState instanceof AbstractC14426c.c) {
                        c28655q.m87150e0(1823071642);
                        z13 = true;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q.m87173q(false);
                    } else {
                        z13 = true;
                        list = null;
                        objArr9 = 0;
                        objArr8 = 0;
                        objArr7 = 0;
                        objArr6 = 0;
                        objArr5 = 0;
                        objArr4 = 0;
                        objArr3 = 0;
                        if (viewState instanceof AbstractC14426c.b) {
                            c28655q.m87150e0(1823312481);
                            int i25 = 2;
                            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr3 == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, objArr4 == true ? 1 : 0, i25, objArr5 == true ? 1 : 0);
                            if ((i18 & 7168) == 2048) {
                                objArr2 = true;
                            } else {
                                objArr2 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (objArr2 == true || objM87133R2 == c28676v0) {
                                objM87133R2 = new C16283a(function7, 28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC14426c.a) {
                            c28655q.m87150e0(1823790346);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC14426c.d) {
                                throw AbstractC11895b.m32003v(1582828019, c28655q, false);
                            }
                            c28655q.m87150e0(1823965961);
                            int i26 = 2;
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr6 == true ? 1 : 0, i26, objArr7 == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr8 == true ? 1 : 0, i26, objArr9 == true ? 1 : 0);
                            if ((i18 & 896) == 256) {
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (objArr == true || objM87133R == c28676v0) {
                                objM87133R = new C16283a(function5, 29);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(z13);
                    function6 = function7;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15079m3(str, viewState, function5, function6, i13, i14, 14);
                }
            }
            i15 |= 3072;
            function4 = function2;
            i18 = i15;
            if ((i18 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18332c(14);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                } else {
                    function5 = function3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C18332c(15);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                i19 = i18 >> 3;
                AbstractC14874j.m42904c(viewState, "advanced_labs_typeform_webview", c28655q, (i19 & 14) | 48);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (str != null) {
                    c28655q.m87150e0(1822786721);
                    m53182n(str, function5, function7, c28655q, (i19 & 896) | (i18 & 14) | (i19 & 112), 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1822976038);
                    c28655q.m87173q(false);
                }
                if (viewState instanceof AbstractC14426c.c) {
                    c28655q.m87150e0(1823071642);
                    z13 = true;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                } else {
                    z13 = true;
                    list = null;
                    objArr9 = 0;
                    objArr8 = 0;
                    objArr7 = 0;
                    objArr6 = 0;
                    objArr5 = 0;
                    objArr4 = 0;
                    objArr3 = 0;
                    if (viewState instanceof AbstractC14426c.b) {
                        c28655q.m87150e0(1823312481);
                        int i27 = 2;
                        AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i27, objArr3 == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr4 == true ? 1 : 0, i27, objArr5 == true ? 1 : 0);
                        if ((i18 & 7168) == 2048) {
                            objArr2 = true;
                        } else {
                            objArr2 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (objArr2 == true) {
                            objM87133R2 = new C16283a(function7, 28);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16283a(function7, 28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC14426c.a) {
                        c28655q.m87150e0(1823790346);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC14426c.d) {
                            throw AbstractC11895b.m32003v(1582828019, c28655q, false);
                        }
                        c28655q.m87150e0(1823965961);
                        int i28 = 2;
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr6 == true ? 1 : 0, i28, objArr7 == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr8 == true ? 1 : 0, i28, objArr9 == true ? 1 : 0);
                        if ((i18 & 896) == 256) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objArr == true) {
                            objM87133R = new C16283a(function5, 29);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C16283a(function5, 29);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z13);
                function6 = function7;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(str, viewState, function5, function6, i13, i14, 14);
            }
        }
        i15 |= 384;
        function3 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18332c(14);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                } else {
                    function5 = function3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C18332c(15);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                i19 = i18 >> 3;
                AbstractC14874j.m42904c(viewState, "advanced_labs_typeform_webview", c28655q, (i19 & 14) | 48);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                if (str != null) {
                    c28655q.m87150e0(1822786721);
                    m53182n(str, function5, function7, c28655q, (i19 & 896) | (i18 & 14) | (i19 & 112), 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1822976038);
                    c28655q.m87173q(false);
                }
                if (viewState instanceof AbstractC14426c.c) {
                    c28655q.m87150e0(1823071642);
                    z13 = true;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                } else {
                    z13 = true;
                    list = null;
                    objArr9 = 0;
                    objArr8 = 0;
                    objArr7 = 0;
                    objArr6 = 0;
                    objArr5 = 0;
                    objArr4 = 0;
                    objArr3 = 0;
                    if (viewState instanceof AbstractC14426c.b) {
                        c28655q.m87150e0(1823312481);
                        int i29 = 2;
                        AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i29, objArr3 == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr4 == true ? 1 : 0, i29, objArr5 == true ? 1 : 0);
                        if ((i18 & 7168) == 2048) {
                            objArr2 = true;
                        } else {
                            objArr2 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (objArr2 == true) {
                            objM87133R2 = new C16283a(function7, 28);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16283a(function7, 28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b5, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC14426c.a) {
                        c28655q.m87150e0(1823790346);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC14426c.d) {
                            throw AbstractC11895b.m32003v(1582828019, c28655q, false);
                        }
                        c28655q.m87150e0(1823965961);
                        int i210 = 2;
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr6 == true ? 1 : 0, i210, objArr7 == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr8 == true ? 1 : 0, i210, objArr9 == true ? 1 : 0);
                        if ((i18 & 896) == 256) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objArr == true) {
                            objM87133R = new C16283a(function5, 29);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C16283a(function5, 29);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b6, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z13);
                function6 = function7;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(str, viewState, function5, function6, i13, i14, 14);
            }
        }
        i15 |= 3072;
        function4 = function2;
        i18 = i15;
        if ((i18 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C18332c(14);
                    c28655q.m87172p0(objM87133R4);
                }
                function5 = (Function1) objM87133R4;
            } else {
                function5 = function3;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C18332c(15);
                    c28655q.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function4;
            }
            i19 = i18 >> 3;
            AbstractC14874j.m42904c(viewState, "advanced_labs_typeform_webview", c28655q, (i19 & 14) | 48);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            if (str != null) {
                c28655q.m87150e0(1822786721);
                m53182n(str, function5, function7, c28655q, (i19 & 896) | (i18 & 14) | (i19 & 112), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1822976038);
                c28655q.m87173q(false);
            }
            if (viewState instanceof AbstractC14426c.c) {
                c28655q.m87150e0(1823071642);
                z13 = true;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
            } else {
                z13 = true;
                list = null;
                objArr9 = 0;
                objArr8 = 0;
                objArr7 = 0;
                objArr6 = 0;
                objArr5 = 0;
                objArr4 = 0;
                objArr3 = 0;
                if (viewState instanceof AbstractC14426c.b) {
                    c28655q.m87150e0(1823312481);
                    int i211 = 2;
                    AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i211, objArr3 == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr4 == true ? 1 : 0, i211, objArr5 == true ? 1 : 0);
                    if ((i18 & 7168) == 2048) {
                        objArr2 = true;
                    } else {
                        objArr2 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (objArr2 == true) {
                        objM87133R2 = new C16283a(function7, 28);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C16283a(function7, 28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b7, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC14426c.a) {
                    c28655q.m87150e0(1823790346);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC14426c.d) {
                        throw AbstractC11895b.m32003v(1582828019, c28655q, false);
                    }
                    c28655q.m87150e0(1823965961);
                    int i212 = 2;
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr6 == true ? 1 : 0, i212, objArr7 == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr8 == true ? 1 : 0, i212, objArr9 == true ? 1 : 0);
                    if ((i18 & 896) == 256) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objArr == true) {
                        objM87133R = new C16283a(function5, 29);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C16283a(function5, 29);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b8, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(z13);
            function6 = function7;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(str, viewState, function5, function6, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m53192x(AbstractC14424a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m53193y(AbstractC13142a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m53194z(Function1 function1) {
        function1.invoke(AbstractC13142a.a.f45451a);
        return C23454a0.f92919a;
    }
}
