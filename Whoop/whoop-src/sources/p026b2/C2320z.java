package p026b2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p019ui.PlayerView;
import b01.C2185f;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.SurveyResponseText;
import com.amplitude.android.engagement.types.SurveyTextBlock;
import com.amplitude.android.engagement.types.SurveyTextShortBlock;
import com.google.crypto.tink.internal.C5101l0;
import com.mapbox.maps.CameraOptions;
import eu.C13612g;
import f53.C14122j;
import f53.C14126n;
import f53.C14127o;
import f53.C14128p;
import g53.AbstractC15506k;
import g53.AbstractC15508m;
import g53.C15498c;
import g53.C15499d;
import g53.C15500e;
import g53.C15501f;
import g53.C15502g;
import g53.C15503h;
import g53.C15504i;
import g53.C15505j;
import g53.C15507l;
import g53.C15509n;
import g53.C15510o;
import g53.C15511p;
import g53.C15512q;
import g53.C15513r;
import g53.C15514s;
import g53.C15515t;
import g53.C15516u;
import g53.C15517v;
import g53.C15518w;
import ge3.AbstractC15751g;
import h53.C16943h;
import h53.C16944i;
import h53.C16945j;
import i53.AbstractC18138j;
import i53.AbstractC18144p;
import i53.C18129a;
import i53.C18130b;
import i53.C18131c;
import i53.C18132d;
import i53.C18133e;
import i53.C18134f;
import i53.C18135g;
import i53.C18136h;
import i53.C18139k;
import i53.C18140l;
import i53.C18141m;
import i53.C18142n;
import i53.C18143o;
import i53.C18145q;
import i53.C18146r;
import io.sentry.C20337g0;
import io.sentry.InterfaceC20308d1;
import io.sentry.android.replay.capture.AbstractC20195k;
import io.sentry.android.replay.capture.C20190f;
import io.sentry.android.replay.capture.C20193i;
import io.sentry.android.replay.capture.C20199o;
import io.sentry.hints.C20363j;
import io.sentry.internal.debugmeta.C20378c;
import io.sentry.rrweb.AbstractC20523b;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import nh3.AbstractC26725a;
import p002a0.C0006a1;
import p005a3.C0230n0;
import p005a3.C0248r2;
import p021av.C2088b;
import p027b3.C2389i2;
import p027b3.C2462x0;
import p027b3.C2466y;
import p028b4.C2694e;
import p043c4.C3958f0;
import p043c4.C3970m;
import p043c4.InterfaceC3964i0;
import p078d1.C11457j;
import p078d1.C11462o;
import p078d1.InputConnectionC11463p;
import p095dp.AbstractC12240d;
import p114eb.AbstractC12939a0;
import p114eb.AbstractC12964i1;
import p114eb.C12970k1;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12985r0;
import p114eb.C12988t;
import p114eb.C12992v;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p114eb.C12999y0;
import p157fv.C14802h;
import p157fv.C14810p;
import p157fv.InterfaceC14795a;
import p197hj.EnumC17339v;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p309lo.C24560r;
import p328mj.C25600g;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p408q.C29662f;
import p412q3.C29892z;
import p412q3.InputConnectionC29881o;
import p446r1.C30849c;
import p479s4.AbstractC32120a;
import p505ts.AbstractC34132o;
import p512u2.C34479y;
import p512u2.EnumC34477w;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22673i0;
import qg3.C30352d;
import s40.AbstractC32145e0;
import se.AbstractC32417h;
import u33.C34508a;
import u33.C34509b;
import u33.C34510c;
import u33.C34511d;
import u33.EnumC34512e;
import ud3.AbstractC34814f1;
import ud3.C34826l0;
import ud3.C34832o0;
import v63.AbstractC35744b;
import x43.AbstractC37978j;
import x43.AbstractC37979k;
import x43.C37981m;
import xb3.AbstractC38176k;
import z43.C40082b;

/* JADX INFO: renamed from: b2.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C2320z extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9154w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9155x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f9156y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2320z(int i13, Object obj, Object obj2) {
        super(1);
        this.f9154w = i13;
        this.f9155x = obj;
        this.f9156y = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws InterruptedException {
        InputConnectionC11463p inputConnectionC11463p;
        C12977n0 c12977n0Mo36424c;
        AbstractC32145e0 c34509b;
        int i13 = 2;
        int i14 = 0;
        View view = null;
        switch (this.f9154w) {
            case 0:
                ((AbstractC39101i1) obj).m124632f((AbstractC39104j1) this.f9155x, 0, 0, ((C2295a0) this.f9156y).f9096O);
                return C23454a0.f92919a;
            case 1:
                return new C2389i2((C11462o) this.f9155x, new C2088b((C2462x0) this.f9156y, 1));
            case 2:
                C2389i2 c2389i2 = (C2389i2) this.f9155x;
                synchronized (c2389i2.f9441c) {
                    try {
                        c2389i2.f9443e = true;
                        C30849c c30849c = c2389i2.f9442d;
                        Object[] objArr = c30849c.f127227w;
                        int i15 = c30849c.f127229y;
                        while (i14 < i15) {
                            InputConnectionC29881o inputConnectionC29881o = (InputConnectionC29881o) ((C0248r2) objArr[i14]).get();
                            if (inputConnectionC29881o != null && (inputConnectionC11463p = inputConnectionC29881o.f122108b) != null) {
                                inputConnectionC29881o.m91504a(inputConnectionC11463p);
                                inputConnectionC29881o.f122108b = null;
                            }
                            i14++;
                        }
                        c2389i2.f9442d.m94890g();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C29892z c29892z = ((C2462x0) this.f9156y).f9611x;
                c29892z.f122129b.set(null);
                c29892z.f122128a.mo30719b();
                return C23454a0.f92919a;
            case 3:
                View view2 = (View) obj;
                View view3 = (View) this.f9155x;
                C2466y c2466y = new C2466y(view2.getNextFocusForwardId(), 1);
                View view4 = null;
                while (true) {
                    View viewM34036B = AbstractC12240d.m34036B(view2, c2466y, view4);
                    if (viewM34036B != null || view2 == view3) {
                        view = viewM34036B;
                    } else {
                        ViewParent parent = view2.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view5 = (View) parent;
                            view4 = view2;
                            view2 = view5;
                        }
                    }
                }
                return Boolean.valueOf(view == ((View) this.f9156y));
            case 4:
                return ((C2185f) this.f9155x).invoke(((List) this.f9156y).get(((Number) obj).intValue()));
            case 5:
                ((C0230n0) this.f9155x).m586E0(((Modifier) obj).mo3471e((Modifier) this.f9156y));
                return C23454a0.f92919a;
            case 6:
                C3958f0 c3958f0 = (C3958f0) this.f9155x;
                c3958f0.setPositionProvider((InterfaceC3964i0) this.f9156y);
                c3958f0.m12002n();
                return new C3970m();
            case 7:
                C12999y0 navOptions = (C12999y0) obj;
                AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.f9156y;
                AbstractC22676k.m65750j(navOptions, "$this$navOptions");
                C12995w0 c12995w0 = navOptions.f44914a;
                c12995w0.f44897g = 0;
                c12995w0.f44898h = 0;
                c12995w0.f44899i = -1;
                c12995w0.f44900j = -1;
                C12977n0 c12977n0 = (C12977n0) this.f9155x;
                if (c12977n0 instanceof C12985r0) {
                    int i16 = C12977n0.f44815K;
                    for (C12977n0 c12977n1 : AbstractC34132o.m107896y(c12977n0)) {
                        C12977n0 c12977n0M36394i = abstractC12939a0.m36394i();
                        if (AbstractC22676k.m65745e(c12977n1, c12977n0M36394i != null ? c12977n0M36394i.f44823x : null)) {
                        }
                    }
                    int i17 = C12985r0.f44854P;
                    navOptions.f44917d = ((C12977n0) AbstractC38176k.m122290z(AbstractC38176k.m122288x(abstractC12939a0.m36396k(), C12992v.f44876F))).f44819H;
                    navOptions.f44919f = false;
                    C12970k1 c12970k1 = new C12970k1();
                    c12970k1.f44797b = true;
                    navOptions.f44919f = c12970k1.f44796a;
                    navOptions.f44920g = c12970k1.f44797b;
                }
                return C23454a0.f92919a;
            case 8:
                C12982q backStackEntry = (C12982q) obj;
                AbstractC12964i1 abstractC12964i1 = (AbstractC12964i1) this.f9155x;
                AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
                C12977n0 c12977n2 = backStackEntry.f44844x;
                if (c12977n2 == null) {
                    c12977n2 = null;
                }
                if (c12977n2 == null || (c12977n0Mo36424c = abstractC12964i1.mo36424c(c12977n2, backStackEntry.m36479a(), (C12997x0) this.f9156y)) == null) {
                    return null;
                }
                if (c12977n0Mo36424c.equals(c12977n2)) {
                    return backStackEntry;
                }
                C12988t c12988tM36435b = abstractC12964i1.m36435b();
                Bundle bundleM36464c = c12977n0Mo36424c.m36464c(backStackEntry.m36479a());
                AbstractC12939a0 abstractC12939a1 = c12988tM36435b.f44873h;
                return C20363j.m56531o(abstractC12939a1.f44680a, c12977n0Mo36424c, bundleM36464c, abstractC12939a1.m36397l(), abstractC12939a1.f44696q);
            case 9:
                C13612g c13612g = (C13612g) this.f9155x;
                Object obj2 = c13612g.f48190d;
                C24560r c24560r = (C24560r) this.f9156y;
                synchronized (obj2) {
                    if (c13612g.f48192f == c24560r) {
                        c13612g.f48192f = null;
                    }
                    break;
                }
                return C23454a0.f92919a;
            case 10:
                AbstractC37979k listener = (AbstractC37979k) obj;
                AbstractC22676k.m65750j(listener, "listener");
                C14122j c14122j = (C14122j) this.f9155x;
                AbstractC15506k abstractC15506k = (AbstractC15506k) ((AbstractC15508m) this.f9156y);
                c14122j.getClass();
                if (abstractC15506k instanceof C15500e ? true : abstractC15506k instanceof C15504i) {
                    c34509b = C34508a.f145071w;
                } else if (abstractC15506k instanceof C15503h) {
                    c34509b = C34510c.f145073w;
                } else if (abstractC15506k instanceof C15501f) {
                    c34509b = new C34511d(1);
                } else if (abstractC15506k instanceof C15502g) {
                    c34509b = new C34509b(((C15502g) abstractC15506k).f58173a);
                } else {
                    if (!(abstractC15506k instanceof C15505j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c34509b = C34511d.f145074x;
                }
                listener.mo40221f(c34509b);
                return C23454a0.f92919a;
            case 11:
                C40082b invoke = (C40082b) obj;
                AbstractC22676k.m65750j(invoke, "$this$invoke");
                invoke.f172991a = (AbstractC15508m) this.f9155x;
                C20378c c20378c = (C20378c) this.f9156y;
                invoke.f172993c = new C14127o(c20378c, i14);
                LinkedHashMap linkedHashMap = invoke.f172992b;
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C15507l.class);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                new ArrayList();
                C14126n c14126n = C14126n.f50807z;
                InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C15509n.class);
                AbstractC22681m0.m65774e(2, c14126n);
                linkedHashMap2.put(orCreateKotlinClass2, c14126n);
                C14126n c14126n2 = C14126n.f50778E;
                InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C15510o.class);
                AbstractC22681m0.m65774e(2, c14126n2);
                linkedHashMap2.put(orCreateKotlinClass3, c14126n2);
                C14126n c14126n3 = C14126n.f50779F;
                InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C15518w.class);
                AbstractC22681m0.m65774e(2, c14126n3);
                linkedHashMap2.put(orCreateKotlinClass4, c14126n3);
                C14126n c14126n4 = C14126n.f50780G;
                InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C15513r.class);
                AbstractC22681m0.m65774e(2, c14126n4);
                linkedHashMap2.put(orCreateKotlinClass5, c14126n4);
                C14126n c14126n5 = C14126n.f50781H;
                InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C15517v.class);
                AbstractC22681m0.m65774e(2, c14126n5);
                linkedHashMap2.put(orCreateKotlinClass6, c14126n5);
                C14126n c14126n6 = C14126n.f50782I;
                InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C15512q.class);
                AbstractC22681m0.m65774e(2, c14126n6);
                linkedHashMap2.put(orCreateKotlinClass7, c14126n6);
                C14126n c14126n7 = C14126n.f50783J;
                InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14126n7);
                linkedHashMap2.put(orCreateKotlinClass8, c14126n7);
                C14126n c14126n8 = C14126n.f50784K;
                InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C15516u.class);
                AbstractC22681m0.m65774e(2, c14126n8);
                linkedHashMap2.put(orCreateKotlinClass9, c14126n8);
                linkedHashMap.put(orCreateKotlinClass, linkedHashMap2);
                InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C15499d.class);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                new ArrayList();
                C14126n c14126n9 = C14126n.f50785L;
                InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C15509n.class);
                AbstractC22681m0.m65774e(2, c14126n9);
                linkedHashMap3.put(orCreateKotlinClass11, c14126n9);
                C14126n c14126n10 = C14126n.f50786M;
                InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C15510o.class);
                AbstractC22681m0.m65774e(2, c14126n10);
                linkedHashMap3.put(orCreateKotlinClass12, c14126n10);
                C14126n c14126n11 = C14126n.f50787N;
                InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C15518w.class);
                AbstractC22681m0.m65774e(2, c14126n11);
                linkedHashMap3.put(orCreateKotlinClass13, c14126n11);
                C14126n c14126n12 = C14126n.f50788O;
                InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C15513r.class);
                AbstractC22681m0.m65774e(2, c14126n12);
                linkedHashMap3.put(orCreateKotlinClass14, c14126n12);
                C14126n c14126n13 = C14126n.f50789P;
                InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C15517v.class);
                AbstractC22681m0.m65774e(2, c14126n13);
                linkedHashMap3.put(orCreateKotlinClass15, c14126n13);
                C14126n c14126n14 = C14126n.f50790Q;
                InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C15512q.class);
                AbstractC22681m0.m65774e(2, c14126n14);
                linkedHashMap3.put(orCreateKotlinClass16, c14126n14);
                C14126n c14126n15 = C14126n.f50791R;
                InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14126n15);
                linkedHashMap3.put(orCreateKotlinClass17, c14126n15);
                C14126n c14126n16 = C14126n.f50792S;
                InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C15516u.class);
                AbstractC22681m0.m65774e(2, c14126n16);
                linkedHashMap3.put(orCreateKotlinClass18, c14126n16);
                linkedHashMap.put(orCreateKotlinClass10, linkedHashMap3);
                InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C15498c.class);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                new ArrayList();
                C14126n c14126n17 = C14126n.f50793T;
                InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C15510o.class);
                AbstractC22681m0.m65774e(2, c14126n17);
                linkedHashMap4.put(orCreateKotlinClass20, c14126n17);
                C14126n c14126n18 = C14126n.f50794U;
                InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C15518w.class);
                AbstractC22681m0.m65774e(2, c14126n18);
                linkedHashMap4.put(orCreateKotlinClass21, c14126n18);
                C14126n c14126n19 = C14126n.f50795V;
                InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C15513r.class);
                AbstractC22681m0.m65774e(2, c14126n19);
                linkedHashMap4.put(orCreateKotlinClass22, c14126n19);
                C14126n c14126n20 = C14126n.f50796W;
                InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C15517v.class);
                AbstractC22681m0.m65774e(2, c14126n20);
                linkedHashMap4.put(orCreateKotlinClass23, c14126n20);
                C14126n c14126n21 = C14126n.f50797X;
                InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(C15512q.class);
                AbstractC22681m0.m65774e(2, c14126n21);
                linkedHashMap4.put(orCreateKotlinClass24, c14126n21);
                C14126n c14126n22 = C14126n.f50798Y;
                InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14126n22);
                linkedHashMap4.put(orCreateKotlinClass25, c14126n22);
                C14126n c14126n23 = C14126n.f50799Z;
                InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(C15516u.class);
                AbstractC22681m0.m65774e(2, c14126n23);
                linkedHashMap4.put(orCreateKotlinClass26, c14126n23);
                linkedHashMap.put(orCreateKotlinClass19, linkedHashMap4);
                InterfaceC21461d orCreateKotlinClass27 = c22673i0.getOrCreateKotlinClass(C15504i.class);
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                new ArrayList();
                C14126n c14126n24 = C14126n.f50800a0;
                InterfaceC21461d orCreateKotlinClass28 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14126n24);
                linkedHashMap5.put(orCreateKotlinClass28, c14126n24);
                C14126n c14126n25 = C14126n.f50801b0;
                InterfaceC21461d orCreateKotlinClass29 = c22673i0.getOrCreateKotlinClass(C15509n.class);
                AbstractC22681m0.m65774e(2, c14126n25);
                linkedHashMap5.put(orCreateKotlinClass29, c14126n25);
                C14126n c14126n26 = C14126n.f50802c0;
                InterfaceC21461d orCreateKotlinClass30 = c22673i0.getOrCreateKotlinClass(C15515t.class);
                AbstractC22681m0.m65774e(2, c14126n26);
                linkedHashMap5.put(orCreateKotlinClass30, c14126n26);
                linkedHashMap.put(orCreateKotlinClass27, linkedHashMap5);
                InterfaceC21461d orCreateKotlinClass31 = c22673i0.getOrCreateKotlinClass(C15503h.class);
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                new ArrayList();
                C14126n c14126n27 = C14126n.f50803d0;
                InterfaceC21461d orCreateKotlinClass32 = c22673i0.getOrCreateKotlinClass(C15509n.class);
                AbstractC22681m0.m65774e(2, c14126n27);
                linkedHashMap6.put(orCreateKotlinClass32, c14126n27);
                C14126n c14126n28 = C14126n.f50804e0;
                InterfaceC21461d orCreateKotlinClass33 = c22673i0.getOrCreateKotlinClass(C15510o.class);
                AbstractC22681m0.m65774e(2, c14126n28);
                linkedHashMap6.put(orCreateKotlinClass33, c14126n28);
                C14128p c14128p = C14128p.f50829x;
                InterfaceC21461d orCreateKotlinClass34 = c22673i0.getOrCreateKotlinClass(C15517v.class);
                AbstractC22681m0.m65774e(2, c14128p);
                linkedHashMap6.put(orCreateKotlinClass34, c14128p);
                C14128p c14128p2 = C14128p.f50830y;
                InterfaceC21461d orCreateKotlinClass35 = c22673i0.getOrCreateKotlinClass(C15512q.class);
                AbstractC22681m0.m65774e(2, c14128p2);
                linkedHashMap6.put(orCreateKotlinClass35, c14128p2);
                C14128p c14128p3 = C14128p.f50831z;
                InterfaceC21461d orCreateKotlinClass36 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14128p3);
                linkedHashMap6.put(orCreateKotlinClass36, c14128p3);
                C14128p c14128p4 = C14128p.f50811E;
                InterfaceC21461d orCreateKotlinClass37 = c22673i0.getOrCreateKotlinClass(C15516u.class);
                AbstractC22681m0.m65774e(2, c14128p4);
                linkedHashMap6.put(orCreateKotlinClass37, c14128p4);
                C14128p c14128p5 = C14128p.f50812F;
                InterfaceC21461d orCreateKotlinClass38 = c22673i0.getOrCreateKotlinClass(C15511p.class);
                AbstractC22681m0.m65774e(2, c14128p5);
                linkedHashMap6.put(orCreateKotlinClass38, c14128p5);
                linkedHashMap.put(orCreateKotlinClass31, linkedHashMap6);
                InterfaceC21461d orCreateKotlinClass39 = c22673i0.getOrCreateKotlinClass(C15505j.class);
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                new ArrayList();
                C14128p c14128p6 = C14128p.f50813G;
                InterfaceC21461d orCreateKotlinClass40 = c22673i0.getOrCreateKotlinClass(C15509n.class);
                AbstractC22681m0.m65774e(2, c14128p6);
                linkedHashMap7.put(orCreateKotlinClass40, c14128p6);
                C14128p c14128p7 = C14128p.f50814H;
                InterfaceC21461d orCreateKotlinClass41 = c22673i0.getOrCreateKotlinClass(C15510o.class);
                AbstractC22681m0.m65774e(2, c14128p7);
                linkedHashMap7.put(orCreateKotlinClass41, c14128p7);
                C14128p c14128p8 = C14128p.f50815I;
                InterfaceC21461d orCreateKotlinClass42 = c22673i0.getOrCreateKotlinClass(C15513r.class);
                AbstractC22681m0.m65774e(2, c14128p8);
                linkedHashMap7.put(orCreateKotlinClass42, c14128p8);
                C14128p c14128p9 = C14128p.f50816J;
                InterfaceC21461d orCreateKotlinClass43 = c22673i0.getOrCreateKotlinClass(C15517v.class);
                AbstractC22681m0.m65774e(2, c14128p9);
                linkedHashMap7.put(orCreateKotlinClass43, c14128p9);
                C14128p c14128p10 = C14128p.f50817K;
                InterfaceC21461d orCreateKotlinClass44 = c22673i0.getOrCreateKotlinClass(C15512q.class);
                AbstractC22681m0.m65774e(2, c14128p10);
                linkedHashMap7.put(orCreateKotlinClass44, c14128p10);
                C14128p c14128p11 = C14128p.f50818L;
                InterfaceC21461d orCreateKotlinClass45 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14128p11);
                linkedHashMap7.put(orCreateKotlinClass45, c14128p11);
                C14128p c14128p12 = C14128p.f50819M;
                InterfaceC21461d orCreateKotlinClass46 = c22673i0.getOrCreateKotlinClass(C15516u.class);
                AbstractC22681m0.m65774e(2, c14128p12);
                linkedHashMap7.put(orCreateKotlinClass46, c14128p12);
                linkedHashMap.put(orCreateKotlinClass39, linkedHashMap7);
                InterfaceC21461d orCreateKotlinClass47 = c22673i0.getOrCreateKotlinClass(C15500e.class);
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                new ArrayList();
                C14127o c14127o = new C14127o(c20378c, 1);
                InterfaceC21461d orCreateKotlinClass48 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14127o);
                linkedHashMap8.put(orCreateKotlinClass48, c14127o);
                C14128p c14128p13 = C14128p.f50820N;
                InterfaceC21461d orCreateKotlinClass49 = c22673i0.getOrCreateKotlinClass(C15509n.class);
                AbstractC22681m0.m65774e(2, c14128p13);
                linkedHashMap8.put(orCreateKotlinClass49, c14128p13);
                linkedHashMap.put(orCreateKotlinClass47, linkedHashMap8);
                InterfaceC21461d orCreateKotlinClass50 = c22673i0.getOrCreateKotlinClass(C15502g.class);
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                new ArrayList();
                C14128p c14128p14 = C14128p.f50821O;
                InterfaceC21461d orCreateKotlinClass51 = c22673i0.getOrCreateKotlinClass(C15509n.class);
                AbstractC22681m0.m65774e(2, c14128p14);
                linkedHashMap9.put(orCreateKotlinClass51, c14128p14);
                C14128p c14128p15 = C14128p.f50822P;
                InterfaceC21461d orCreateKotlinClass52 = c22673i0.getOrCreateKotlinClass(C15510o.class);
                AbstractC22681m0.m65774e(2, c14128p15);
                linkedHashMap9.put(orCreateKotlinClass52, c14128p15);
                C14128p c14128p16 = C14128p.f50823Q;
                InterfaceC21461d orCreateKotlinClass53 = c22673i0.getOrCreateKotlinClass(C15513r.class);
                AbstractC22681m0.m65774e(2, c14128p16);
                linkedHashMap9.put(orCreateKotlinClass53, c14128p16);
                C14128p c14128p17 = C14128p.f50824R;
                InterfaceC21461d orCreateKotlinClass54 = c22673i0.getOrCreateKotlinClass(C15518w.class);
                AbstractC22681m0.m65774e(2, c14128p17);
                linkedHashMap9.put(orCreateKotlinClass54, c14128p17);
                C14128p c14128p18 = C14128p.f50825S;
                InterfaceC21461d orCreateKotlinClass55 = c22673i0.getOrCreateKotlinClass(C15517v.class);
                AbstractC22681m0.m65774e(2, c14128p18);
                linkedHashMap9.put(orCreateKotlinClass55, c14128p18);
                C14128p c14128p19 = C14128p.f50826T;
                InterfaceC21461d orCreateKotlinClass56 = c22673i0.getOrCreateKotlinClass(C15512q.class);
                AbstractC22681m0.m65774e(2, c14128p19);
                linkedHashMap9.put(orCreateKotlinClass56, c14128p19);
                C14128p c14128p20 = C14128p.f50827U;
                InterfaceC21461d orCreateKotlinClass57 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14128p20);
                linkedHashMap9.put(orCreateKotlinClass57, c14128p20);
                C14128p c14128p21 = C14128p.f50828V;
                InterfaceC21461d orCreateKotlinClass58 = c22673i0.getOrCreateKotlinClass(C15516u.class);
                AbstractC22681m0.m65774e(2, c14128p21);
                linkedHashMap9.put(orCreateKotlinClass58, c14128p21);
                linkedHashMap.put(orCreateKotlinClass50, linkedHashMap9);
                InterfaceC21461d orCreateKotlinClass59 = c22673i0.getOrCreateKotlinClass(C15501f.class);
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                new ArrayList();
                C14126n c14126n29 = C14126n.f50805x;
                InterfaceC21461d orCreateKotlinClass60 = c22673i0.getOrCreateKotlinClass(C15509n.class);
                AbstractC22681m0.m65774e(2, c14126n29);
                linkedHashMap10.put(orCreateKotlinClass60, c14126n29);
                C14126n c14126n30 = C14126n.f50806y;
                InterfaceC21461d orCreateKotlinClass61 = c22673i0.getOrCreateKotlinClass(C15514s.class);
                AbstractC22681m0.m65774e(2, c14126n30);
                linkedHashMap10.put(orCreateKotlinClass61, c14126n30);
                linkedHashMap.put(orCreateKotlinClass59, linkedHashMap10);
                return C23454a0.f92919a;
            case 12:
                InterfaceC14795a cameraAnimationsPlugin = (InterfaceC14795a) obj;
                AbstractC22676k.m65750j(cameraAnimationsPlugin, "$this$cameraAnimationsPlugin");
                return ((C14802h) cameraAnimationsPlugin).m42550h((CameraOptions) this.f9155x, (C14810p) this.f9156y, null);
            case 13:
                C40082b invoke2 = (C40082b) obj;
                AbstractC22676k.m65750j(invoke2, "$this$invoke");
                invoke2.f172991a = (AbstractC18138j) this.f9155x;
                C30352d c30352d = (C30352d) this.f9156y;
                invoke2.f172993c = new C16943h(c30352d, i14);
                LinkedHashMap linkedHashMap11 = invoke2.f172992b;
                C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass62 = c22673i1.getOrCreateKotlinClass(C18130b.class);
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                new ArrayList();
                C16944i c16944i = C16944i.f65053x;
                InterfaceC21461d orCreateKotlinClass63 = c22673i1.getOrCreateKotlinClass(C18139k.class);
                AbstractC22681m0.m65774e(2, c16944i);
                linkedHashMap12.put(orCreateKotlinClass63, c16944i);
                C16944i c16944i2 = C16944i.f65054y;
                InterfaceC21461d orCreateKotlinClass64 = c22673i1.getOrCreateKotlinClass(C18140l.class);
                AbstractC22681m0.m65774e(2, c16944i2);
                linkedHashMap12.put(orCreateKotlinClass64, c16944i2);
                C16944i c16944i3 = C16944i.f65055z;
                InterfaceC21461d orCreateKotlinClass65 = c22673i1.getOrCreateKotlinClass(C18146r.class);
                AbstractC22681m0.m65774e(2, c16944i3);
                linkedHashMap12.put(orCreateKotlinClass65, c16944i3);
                C16944i c16944i4 = C16944i.f65026E;
                InterfaceC21461d orCreateKotlinClass66 = c22673i1.getOrCreateKotlinClass(C18142n.class);
                AbstractC22681m0.m65774e(2, c16944i4);
                linkedHashMap12.put(orCreateKotlinClass66, c16944i4);
                C16944i c16944i5 = C16944i.f65027F;
                InterfaceC21461d orCreateKotlinClass67 = c22673i1.getOrCreateKotlinClass(C18145q.class);
                AbstractC22681m0.m65774e(2, c16944i5);
                linkedHashMap12.put(orCreateKotlinClass67, c16944i5);
                C16944i c16944i6 = C16944i.f65028G;
                InterfaceC21461d orCreateKotlinClass68 = c22673i1.getOrCreateKotlinClass(C18141m.class);
                AbstractC22681m0.m65774e(2, c16944i6);
                linkedHashMap12.put(orCreateKotlinClass68, c16944i6);
                C16944i c16944i7 = C16944i.f65029H;
                InterfaceC21461d orCreateKotlinClass69 = c22673i1.getOrCreateKotlinClass(C18143o.class);
                AbstractC22681m0.m65774e(2, c16944i7);
                linkedHashMap12.put(orCreateKotlinClass69, c16944i7);
                C16944i c16944i8 = C16944i.f65030I;
                InterfaceC21461d orCreateKotlinClass70 = c22673i1.getOrCreateKotlinClass(AbstractC18144p.class);
                AbstractC22681m0.m65774e(2, c16944i8);
                linkedHashMap12.put(orCreateKotlinClass70, c16944i8);
                linkedHashMap11.put(orCreateKotlinClass62, linkedHashMap12);
                InterfaceC21461d orCreateKotlinClass71 = c22673i1.getOrCreateKotlinClass(C18129a.class);
                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                new ArrayList();
                C16944i c16944i9 = C16944i.f65031J;
                InterfaceC21461d orCreateKotlinClass72 = c22673i1.getOrCreateKotlinClass(C18140l.class);
                AbstractC22681m0.m65774e(2, c16944i9);
                linkedHashMap13.put(orCreateKotlinClass72, c16944i9);
                C16944i c16944i10 = C16944i.f65032K;
                InterfaceC21461d orCreateKotlinClass73 = c22673i1.getOrCreateKotlinClass(C18146r.class);
                AbstractC22681m0.m65774e(2, c16944i10);
                linkedHashMap13.put(orCreateKotlinClass73, c16944i10);
                C16944i c16944i11 = C16944i.f65033L;
                InterfaceC21461d orCreateKotlinClass74 = c22673i1.getOrCreateKotlinClass(C18142n.class);
                AbstractC22681m0.m65774e(2, c16944i11);
                linkedHashMap13.put(orCreateKotlinClass74, c16944i11);
                C16944i c16944i12 = C16944i.f65034M;
                InterfaceC21461d orCreateKotlinClass75 = c22673i1.getOrCreateKotlinClass(C18145q.class);
                AbstractC22681m0.m65774e(2, c16944i12);
                linkedHashMap13.put(orCreateKotlinClass75, c16944i12);
                C16944i c16944i13 = C16944i.f65035N;
                InterfaceC21461d orCreateKotlinClass76 = c22673i1.getOrCreateKotlinClass(C18141m.class);
                AbstractC22681m0.m65774e(2, c16944i13);
                linkedHashMap13.put(orCreateKotlinClass76, c16944i13);
                C16944i c16944i14 = C16944i.f65036O;
                InterfaceC21461d orCreateKotlinClass77 = c22673i1.getOrCreateKotlinClass(C18143o.class);
                AbstractC22681m0.m65774e(2, c16944i14);
                linkedHashMap13.put(orCreateKotlinClass77, c16944i14);
                C16944i c16944i15 = C16944i.f65037P;
                InterfaceC21461d orCreateKotlinClass78 = c22673i1.getOrCreateKotlinClass(AbstractC18144p.class);
                AbstractC22681m0.m65774e(2, c16944i15);
                linkedHashMap13.put(orCreateKotlinClass78, c16944i15);
                linkedHashMap11.put(orCreateKotlinClass71, linkedHashMap13);
                InterfaceC21461d orCreateKotlinClass79 = c22673i1.getOrCreateKotlinClass(C18135g.class);
                LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                new ArrayList();
                C16944i c16944i16 = C16944i.f65038Q;
                InterfaceC21461d orCreateKotlinClass80 = c22673i1.getOrCreateKotlinClass(C18143o.class);
                AbstractC22681m0.m65774e(2, c16944i16);
                linkedHashMap14.put(orCreateKotlinClass80, c16944i16);
                C16944i c16944i17 = C16944i.f65039R;
                InterfaceC21461d orCreateKotlinClass81 = c22673i1.getOrCreateKotlinClass(C18139k.class);
                AbstractC22681m0.m65774e(2, c16944i17);
                linkedHashMap14.put(orCreateKotlinClass81, c16944i17);
                linkedHashMap11.put(orCreateKotlinClass79, linkedHashMap14);
                InterfaceC21461d orCreateKotlinClass82 = c22673i1.getOrCreateKotlinClass(C18134f.class);
                LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                new ArrayList();
                C16944i c16944i18 = C16944i.f65040S;
                InterfaceC21461d orCreateKotlinClass83 = c22673i1.getOrCreateKotlinClass(C18139k.class);
                AbstractC22681m0.m65774e(2, c16944i18);
                linkedHashMap15.put(orCreateKotlinClass83, c16944i18);
                C16944i c16944i19 = C16944i.f65041T;
                InterfaceC21461d orCreateKotlinClass84 = c22673i1.getOrCreateKotlinClass(C18140l.class);
                AbstractC22681m0.m65774e(2, c16944i19);
                linkedHashMap15.put(orCreateKotlinClass84, c16944i19);
                C16944i c16944i20 = C16944i.f65042U;
                InterfaceC21461d orCreateKotlinClass85 = c22673i1.getOrCreateKotlinClass(C18145q.class);
                AbstractC22681m0.m65774e(2, c16944i20);
                linkedHashMap15.put(orCreateKotlinClass85, c16944i20);
                C16943h c16943h = new C16943h(c30352d, 1);
                InterfaceC21461d orCreateKotlinClass86 = c22673i1.getOrCreateKotlinClass(C18141m.class);
                AbstractC22681m0.m65774e(2, c16943h);
                linkedHashMap15.put(orCreateKotlinClass86, c16943h);
                C16944i c16944i21 = C16944i.f65043V;
                InterfaceC21461d orCreateKotlinClass87 = c22673i1.getOrCreateKotlinClass(C18143o.class);
                AbstractC22681m0.m65774e(2, c16944i21);
                linkedHashMap15.put(orCreateKotlinClass87, c16944i21);
                C16944i c16944i22 = C16944i.f65044W;
                InterfaceC21461d orCreateKotlinClass88 = c22673i1.getOrCreateKotlinClass(AbstractC18144p.class);
                AbstractC22681m0.m65774e(2, c16944i22);
                linkedHashMap15.put(orCreateKotlinClass88, c16944i22);
                linkedHashMap11.put(orCreateKotlinClass82, linkedHashMap15);
                InterfaceC21461d orCreateKotlinClass89 = c22673i1.getOrCreateKotlinClass(C18136h.class);
                LinkedHashMap linkedHashMap16 = new LinkedHashMap();
                new ArrayList();
                C16944i c16944i23 = C16944i.f65045X;
                InterfaceC21461d orCreateKotlinClass90 = c22673i1.getOrCreateKotlinClass(C18139k.class);
                AbstractC22681m0.m65774e(2, c16944i23);
                linkedHashMap16.put(orCreateKotlinClass90, c16944i23);
                C16944i c16944i24 = C16944i.f65046Y;
                InterfaceC21461d orCreateKotlinClass91 = c22673i1.getOrCreateKotlinClass(C18140l.class);
                AbstractC22681m0.m65774e(2, c16944i24);
                linkedHashMap16.put(orCreateKotlinClass91, c16944i24);
                C16944i c16944i25 = C16944i.f65047Z;
                InterfaceC21461d orCreateKotlinClass92 = c22673i1.getOrCreateKotlinClass(C18142n.class);
                AbstractC22681m0.m65774e(2, c16944i25);
                linkedHashMap16.put(orCreateKotlinClass92, c16944i25);
                C16944i c16944i26 = C16944i.f65048a0;
                InterfaceC21461d orCreateKotlinClass93 = c22673i1.getOrCreateKotlinClass(C18145q.class);
                AbstractC22681m0.m65774e(2, c16944i26);
                linkedHashMap16.put(orCreateKotlinClass93, c16944i26);
                C16944i c16944i27 = C16944i.f65049b0;
                InterfaceC21461d orCreateKotlinClass94 = c22673i1.getOrCreateKotlinClass(C18141m.class);
                AbstractC22681m0.m65774e(2, c16944i27);
                linkedHashMap16.put(orCreateKotlinClass94, c16944i27);
                C16944i c16944i28 = C16944i.f65050c0;
                InterfaceC21461d orCreateKotlinClass95 = c22673i1.getOrCreateKotlinClass(C18143o.class);
                AbstractC22681m0.m65774e(2, c16944i28);
                linkedHashMap16.put(orCreateKotlinClass95, c16944i28);
                C16944i c16944i29 = C16944i.f65051d0;
                InterfaceC21461d orCreateKotlinClass96 = c22673i1.getOrCreateKotlinClass(AbstractC18144p.class);
                AbstractC22681m0.m65774e(2, c16944i29);
                linkedHashMap16.put(orCreateKotlinClass96, c16944i29);
                linkedHashMap11.put(orCreateKotlinClass89, linkedHashMap16);
                InterfaceC21461d orCreateKotlinClass97 = c22673i1.getOrCreateKotlinClass(C18131c.class);
                LinkedHashMap linkedHashMap17 = new LinkedHashMap();
                new ArrayList();
                C16943h c16943h2 = new C16943h(c30352d, i13);
                InterfaceC21461d orCreateKotlinClass98 = c22673i1.getOrCreateKotlinClass(C18143o.class);
                AbstractC22681m0.m65774e(2, c16943h2);
                linkedHashMap17.put(orCreateKotlinClass98, c16943h2);
                C16944i c16944i30 = C16944i.f65052e0;
                InterfaceC21461d orCreateKotlinClass99 = c22673i1.getOrCreateKotlinClass(C18139k.class);
                AbstractC22681m0.m65774e(2, c16944i30);
                linkedHashMap17.put(orCreateKotlinClass99, c16944i30);
                linkedHashMap11.put(orCreateKotlinClass97, linkedHashMap17);
                InterfaceC21461d orCreateKotlinClass100 = c22673i1.getOrCreateKotlinClass(C18133e.class);
                LinkedHashMap linkedHashMap18 = new LinkedHashMap();
                new ArrayList();
                C16945j c16945j = C16945j.f65064x;
                InterfaceC21461d orCreateKotlinClass101 = c22673i1.getOrCreateKotlinClass(C18139k.class);
                AbstractC22681m0.m65774e(2, c16945j);
                linkedHashMap18.put(orCreateKotlinClass101, c16945j);
                C16945j c16945j2 = C16945j.f65065y;
                InterfaceC21461d orCreateKotlinClass102 = c22673i1.getOrCreateKotlinClass(C18140l.class);
                AbstractC22681m0.m65774e(2, c16945j2);
                linkedHashMap18.put(orCreateKotlinClass102, c16945j2);
                C16945j c16945j3 = C16945j.f65066z;
                InterfaceC21461d orCreateKotlinClass103 = c22673i1.getOrCreateKotlinClass(C18142n.class);
                AbstractC22681m0.m65774e(2, c16945j3);
                linkedHashMap18.put(orCreateKotlinClass103, c16945j3);
                C16945j c16945j4 = C16945j.f65057E;
                InterfaceC21461d orCreateKotlinClass104 = c22673i1.getOrCreateKotlinClass(C18146r.class);
                AbstractC22681m0.m65774e(2, c16945j4);
                linkedHashMap18.put(orCreateKotlinClass104, c16945j4);
                C16945j c16945j5 = C16945j.f65058F;
                InterfaceC21461d orCreateKotlinClass105 = c22673i1.getOrCreateKotlinClass(C18145q.class);
                AbstractC22681m0.m65774e(2, c16945j5);
                linkedHashMap18.put(orCreateKotlinClass105, c16945j5);
                C16945j c16945j6 = C16945j.f65059G;
                InterfaceC21461d orCreateKotlinClass106 = c22673i1.getOrCreateKotlinClass(C18141m.class);
                AbstractC22681m0.m65774e(2, c16945j6);
                linkedHashMap18.put(orCreateKotlinClass106, c16945j6);
                C16945j c16945j7 = C16945j.f65060H;
                InterfaceC21461d orCreateKotlinClass107 = c22673i1.getOrCreateKotlinClass(C18143o.class);
                AbstractC22681m0.m65774e(2, c16945j7);
                linkedHashMap18.put(orCreateKotlinClass107, c16945j7);
                C16945j c16945j8 = C16945j.f65061I;
                InterfaceC21461d orCreateKotlinClass108 = c22673i1.getOrCreateKotlinClass(AbstractC18144p.class);
                AbstractC22681m0.m65774e(2, c16945j8);
                linkedHashMap18.put(orCreateKotlinClass108, c16945j8);
                linkedHashMap11.put(orCreateKotlinClass100, linkedHashMap18);
                InterfaceC21461d orCreateKotlinClass109 = c22673i1.getOrCreateKotlinClass(C18132d.class);
                LinkedHashMap linkedHashMap19 = new LinkedHashMap();
                new ArrayList();
                C16945j c16945j9 = C16945j.f65062J;
                InterfaceC21461d orCreateKotlinClass110 = c22673i1.getOrCreateKotlinClass(C18139k.class);
                AbstractC22681m0.m65774e(2, c16945j9);
                linkedHashMap19.put(orCreateKotlinClass110, c16945j9);
                C16945j c16945j10 = C16945j.f65063K;
                InterfaceC21461d orCreateKotlinClass111 = c22673i1.getOrCreateKotlinClass(C18143o.class);
                AbstractC22681m0.m65774e(2, c16945j10);
                linkedHashMap19.put(orCreateKotlinClass111, c16945j10);
                linkedHashMap11.put(orCreateKotlinClass109, linkedHashMap19);
                return C23454a0.f92919a;
            case 14:
                AbstractC20195k segment = (AbstractC20195k) obj;
                AbstractC22676k.m65750j(segment, "segment");
                C20190f c20190f = (C20190f) this.f9155x;
                ArrayList arrayList = c20190f.f75860v;
                InterfaceC20308d1 interfaceC20308d1 = c20190f.f75857s;
                C20193i c20193i = (C20193i) AbstractC25265s.m74133k1(arrayList);
                while (c20193i != null) {
                    c20193i.m56120a(interfaceC20308d1, new C20337g0());
                    c20193i = (C20193i) AbstractC25265s.m74133k1(arrayList);
                    Thread.sleep(100L);
                }
                if (segment instanceof C20193i) {
                    C20193i c20193i2 = (C20193i) segment;
                    c20193i2.m56120a(interfaceC20308d1, new C20337g0());
                    C0006a1 c0006a1 = (C0006a1) this.f9156y;
                    Date date = c20193i2.f75861a.f76991U;
                    AbstractC22676k.m65749i(date, "getTimestamp(...)");
                    c0006a1.invoke(date);
                }
                return C23454a0.f92919a;
            case 15:
                AbstractC20523b event = (AbstractC20523b) obj;
                AbstractC22676k.m65750j(event, "event");
                if (event.f76901x >= ((Date) this.f9155x).getTime()) {
                    ((ArrayList) this.f9156y).add(event);
                }
                return C23454a0.f92919a;
            case 16:
                AbstractC20195k segment2 = (AbstractC20195k) obj;
                C20199o c20199o = (C20199o) this.f9155x;
                AbstractC22676k.m65750j(segment2, "segment");
                if (segment2 instanceof C20193i) {
                    ((C20193i) segment2).m56120a(c20199o.f75871s, new C20337g0());
                }
                c20199o.m56110k(-1);
                AbstractC15751g.m44465r((File) this.f9156y);
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                EnumC17339v enumC17339v = EnumC17339v.DEBUG;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C4861a c4861a = ((C25600g) this.f9155x).f100435a;
                ((InterfaceC28601c1) this.f9156y).setValue(Boolean.FALSE);
                if (zBooleanValue) {
                    C5101l0 c5101l0 = C4861a.f20259o;
                    if (4 <= ((EnumC17339v) c5101l0.f21444y).f67150w) {
                        c5101l0.m16045Z(enumC17339v, "AmplitudeEngagement.sdk[internal]#restartDebugSession()");
                    }
                    c4861a.f20268i.m36570j(null);
                    c4861a.f20263d.m53801a("globalThis.nudgeActions.restartDebugSession()", null);
                } else {
                    C5101l0 c5101l1 = C4861a.f20259o;
                    if (4 <= ((EnumC17339v) c5101l1.f21444y).f67150w) {
                        c5101l1.m16045Z(enumC17339v, "AmplitudeEngagement.sdk[internal]#stopDebugSession()");
                    }
                    c4861a.f20263d.m53801a("globalThis.nudgeActions.stopDebugSession()", null);
                }
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC17886g0 graphicsLayer = (InterfaceC17886g0) obj;
                AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f9155x;
                C17920x0 c17920x0 = (C17920x0) graphicsLayer;
                c17920x0.m51560p(((Number) interfaceC28670t2.getValue()).floatValue());
                c17920x0.m51561r(((Number) interfaceC28670t2.getValue()).floatValue());
                c17920x0.m51551a(((Number) ((InterfaceC28670t2) this.f9156y).getValue()).floatValue());
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                InterfaceC39147y coordinates = (InterfaceC39147y) obj;
                AbstractC22676k.m65750j(coordinates, "coordinates");
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) this.f9155x;
                ((InterfaceC28601c1) this.f9156y).setValue(new C39180l(AbstractC35744b.m113228a((int) interfaceC39171c.mo733e0((int) (coordinates.mo3541n() >> 32)), (int) interfaceC39171c.mo733e0((int) (coordinates.mo3541n() & 4294967295L)))));
                return C23454a0.f92919a;
            case 20:
                Context it = (Context) obj;
                AbstractC22676k.m65750j(it, "it");
                PlayerView playerView = new PlayerView((Context) this.f9155x, null);
                playerView.setPlayer((ExoPlayer) this.f9156y);
                playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                playerView.setUseController(true);
                return playerView;
            case 21:
                Context it3 = (Context) obj;
                AbstractC22676k.m65750j(it3, "it");
                WebView webView = new WebView((Context) this.f9155x);
                String str = (String) this.f9156y;
                webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                webView.setWebViewClient(new WebViewClient());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(str);
                return webView;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                String newText = (String) obj;
                AbstractC22676k.m65750j(newText, "newText");
                ((Function1) this.f9155x).invoke(new SurveyResponseText(((SurveyTextShortBlock) this.f9156y).getUuid(), newText, newText));
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String newText2 = (String) obj;
                AbstractC22676k.m65750j(newText2, "newText");
                ((Function1) this.f9155x).invoke(new SurveyResponseText(((SurveyTextBlock) this.f9156y).getUuid(), newText2, newText2));
                return C23454a0.f92919a;
            case 24:
                MotionEvent motionEvent = (MotionEvent) obj;
                C34479y c34479y = (C34479y) this.f9156y;
                if (motionEvent.getActionMasked() == 0) {
                    C29662f c29662f = (C29662f) this.f9155x;
                    C2694e c2694e = c34479y.f144850w;
                    if (c2694e == null) {
                        AbstractC22676k.m65757q("onTouchEvent");
                        throw null;
                    }
                    c29662f.f121231y = ((Boolean) c2694e.invoke(motionEvent)).booleanValue() ? EnumC34477w.f144845x : EnumC34477w.f144846y;
                } else {
                    C2694e c2694e2 = c34479y.f144850w;
                    if (c2694e2 == null) {
                        AbstractC22676k.m65757q("onTouchEvent");
                        throw null;
                    }
                    c2694e2.invoke(motionEvent);
                }
                return C23454a0.f92919a;
            case 25:
                AbstractC34814f1 it4 = (AbstractC34814f1) obj;
                AbstractC22676k.m65750j(it4, "it");
                return ((C34826l0) ((C29662f) this.f9155x).f121231y).m109899c((C34832o0) this.f9156y, it4);
            case 26:
                AbstractC26202e parseChatError = (AbstractC26202e) obj;
                AbstractC22676k.m65750j(parseChatError, "parseChatError");
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, "Video:VideoParser")) {
                    C2343i.f9271c.log(enumC2341g, "Video:VideoParser", "[decode#recover] raw: " + parseChatError, null);
                }
                AbstractC26205h abstractC26205hM30751v = ((C11457j) this.f9155x).m30751v((String) this.f9156y, AbstractC37978j.class);
                if (abstractC26205hM30751v instanceof C26204g) {
                    throw AbstractC26725a.m79500d(((C26204g) abstractC26205hM30751v).f103919a);
                }
                if (abstractC26205hM30751v instanceof C26203f) {
                    return new C37981m(AbstractC32120a.m99978d(EnumC34512e.CANT_PARSE_EVENT, AbstractC32417h.m101171B(parseChatError), 2), null);
                }
                throw new NoWhenBranchMatchedException();
            default:
                ConnectivityManager callWithSecurityExceptionHandling = (ConnectivityManager) obj;
                AbstractC22676k.m65750j(callWithSecurityExceptionHandling, "$this$callWithSecurityExceptionHandling");
                callWithSecurityExceptionHandling.registerNetworkCallback((NetworkRequest) this.f9155x, (ConnectivityManager.NetworkCallback) this.f9156y);
                return C23454a0.f92919a;
        }
    }
}
