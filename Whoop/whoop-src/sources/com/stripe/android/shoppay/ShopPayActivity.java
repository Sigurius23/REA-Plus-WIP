package com.stripe.android.shoppay;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1643y1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.shoppay.ShopPayActivity;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import d40.AbstractC11673r;
import d40.C11671p;
import e93.AbstractC12889b;
import f01.C13845b;
import h00.C16513l0;
import h30.AbstractC16806k;
import h30.AbstractC16807l;
import h30.C16797b;
import h30.C16798c;
import h30.C16799d;
import h30.C16803h;
import h30.InterfaceC16804i;
import h40.C16845k;
import j30.AbstractC21269a;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2147u;
import p024b0.C2178b;
import p026b2.C2299e;
import p026b2.C2314t;
import p161g.AbstractActivityC14909l;
import p163g1.AbstractC14981d1;
import p163g1.C14970c1;
import p163g1.C15001f;
import p179h.AbstractC16348f;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p298l8.C23421d;
import p390p1.AbstractC28683x;
import p390p1.C28592a0;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p479s4.AbstractC32126g;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/shoppay/ShopPayActivity;", "Lg/l;", "<init>", "()V", "Landroid/webkit/WebView;", "popupWebView", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ShopPayActivity extends AbstractActivityC14909l {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f22413E = 0;

    /* JADX INFO: renamed from: w */
    public final C23421d f22414w;

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22415x;

    /* JADX INFO: renamed from: y */
    public final C28633k1 f22416y;

    /* JADX INFO: renamed from: z */
    public final C23470p f22417z;

    public ShopPayActivity() {
        C2178b c2178b = new C2178b(2);
        C16513l0 c16513l0 = new C16513l0(13);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c2178b.m6855a(c22673i0.getOrCreateKotlinClass(AbstractC16807l.class), c16513l0);
        this.f22414w = c2178b.m6857c();
        final int i13 = 0;
        this.f22415x = new C1643y1(c22673i0.getOrCreateKotlinClass(AbstractC16807l.class), new C16799d(this, 0), new InterfaceC4339a(this) { // from class: h30.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ShopPayActivity f64553x;

            {
                this.f64553x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                ShopPayActivity shopPayActivity = this.f64553x;
                switch (i14) {
                    case 0:
                        return shopPayActivity.f22414w;
                    default:
                        int i15 = ShopPayActivity.f22413E;
                        AbstractC30802r.m94771t(shopPayActivity.f22415x.getValue());
                        throw null;
                }
            }
        }, new C16799d(this, 1));
        this.f22416y = AbstractC28683x.m87272z(null);
        final int i14 = 1;
        this.f22417z = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: h30.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ShopPayActivity f64553x;

            {
                this.f64553x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i15 = i14;
                ShopPayActivity shopPayActivity = this.f64553x;
                switch (i15) {
                    case 0:
                        return shopPayActivity.f22414w;
                    default:
                        int i16 = ShopPayActivity.f22413E;
                        AbstractC30802r.m94771t(shopPayActivity.f22415x.getValue());
                        throw null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m16871m(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1272665958);
        if ((((c28655q.m87157i(this) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC30057d interfaceC30057d = null;
            C16845k c16845kM113944O = AbstractC35902e.m113944O(null, c28655q, 3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C28592a0 c28592a0 = new C28592a0(AbstractC28683x.m87262p(c28655q));
                c28655q.m87172p0(c28592a0);
                objM87133R = c28592a0;
            }
            InterfaceC2994c0 interfaceC2994c0 = ((C28592a0) objM87133R).f115706w;
            c28655q.m87150e0(1695438094);
            boolean zM87157i = c28655q.m87157i(this) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c16845kM113944O);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C2147u c2147u = new C2147u(this, interfaceC2994c0, c16845kM113944O, interfaceC30057d, 7);
                c28655q.m87172p0(c2147u);
                objM87133R2 = c2147u;
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            AbstractC11673r.m31072a(C11671p.f37681b, null, null, null, null, null, null, AbstractC37817c.m121344e(-1683633104, c28655q, new C15001f(c16845kM113944O, interfaceC2994c0, this, 3)), c28655q, 12582912, 126);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16797b(this, i13, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m16872n(WebView webView, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1364686289);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(webView) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            int iM51506H = AbstractC17918w0.m51506H(((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43087b());
            c28655q.m87150e0(-2112488268);
            boolean zM87157i = c28655q.m87157i(webView) | c28655q.m87149e(iM51506H);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C6516c(webView, iM51506H, 8);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC1137a.m3601a((Function1) objM87133R, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, c28655q, 48, 4);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(this, webView, i13, 15);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m16873o(Composer composer, int i13) {
        C23454a0 c23454a0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-655850928);
        int i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-2132250687);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = this.f22416y;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            WebView webView = (WebView) interfaceC28601c1.getValue();
            c28655q.m87150e0(-1562536260);
            if (webView == null) {
                c23454a0 = null;
            } else {
                m16872n(webView, c28655q, (i14 << 3) & 112);
                c23454a0 = C23454a0.f92919a;
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(-1562536441);
            if (c23454a0 == null) {
                AbstractC32126g.m100036a(4, 438, AbstractC16806k.f64574a, 0L, c28655q, AbstractC1102d.m3419p(64, c2314t));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16797b(this, i13, 1);
        }
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23470p c23470p = this.f22417z;
        try {
            if (bundle != null) {
                ((AbstractC21269a) c23470p.getValue()).restoreState(bundle);
                AbstractC16348f.m46559a(this, new C37816b(new C16798c(this, 1), true, 2124675811));
            } else {
                AbstractC30802r.m94771t(this.f22415x.getValue());
                throw null;
            }
        } catch (ShopPayViewModel$NoArgsException unused) {
            m16874p(new C16803h(new Throwable("Failed to create ShopPayViewModel")));
        }
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        super.onSaveInstanceState(outState);
        ((AbstractC21269a) this.f22417z.getValue()).saveState(outState);
    }

    /* JADX INFO: renamed from: p */
    public final void m16874p(InterfaceC16804i interfaceC16804i) {
        setResult(63636, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.shoppay.ShopPayActivityContract.extra_result", interfaceC16804i))));
        finish();
    }
}
