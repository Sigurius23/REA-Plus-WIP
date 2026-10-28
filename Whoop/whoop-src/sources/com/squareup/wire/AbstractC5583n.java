package com.squareup.wire;

import aa3.C0656u0;
import ab3.AbstractC0715g;
import ab3.C0719k;
import ab3.C0732x;
import am2.C1023i0;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.SizeF;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.webkit.MimeTypeMap;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.lazy.layout.AbstractC1105a;
import androidx.compose.material.AnchoredDragFinishedSignal;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.fragment.app.FragmentContainerView;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.navigation.fragment.NavHostFragment;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2509e2;
import b30.C2541i2;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.C3033m;
import bc3.C3058t;
import bc3.InterfaceC2994c0;
import bh.C3238a;
import bh.InterfaceC3242e;
import c20.C3878f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.SimulationContext;
import com.google.android.gms.tasks.Task;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.StylePropertyValue;
import com.stripe.android.uicore.elements.IdentifierSpec;
import cv.C11142b;
import d23.C11513a;
import d40.AbstractC11673r;
import e93.AbstractC12889b;
import ec3.InterfaceC13058l;
import eu.C13610f;
import g40.C15352f4;
import g40.C15373j1;
import ge3.AbstractC15751g;
import hc3.AbstractC17182o;
import hc3.C17177j;
import i20.C17956k0;
import i20.C17967o;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.getstream.photoview.dialog.common.pager.MultiTouchViewPager;
import io.sentry.InterfaceC20392j3;
import io.sentry.InterfaceC20602v0;
import io.sentry.config.AbstractC20301a;
import io.sentry.protocol.C20483i0;
import io.sentry.rrweb.AbstractC20523b;
import io.sentry.rrweb.EnumC20524c;
import j93.InterfaceC21488u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kc3.C22365e;
import ki.AbstractC22496h;
import l83.C23454a0;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23791o;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23798r0;
import live.hms.video.utils.AndroidSDKConstants;
import m23.C24968b;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import nc3.ExecutorC26571a;
import no.nordicsemi.android.dfu.DfuBaseService;
import o20.C27460e;
import o73.C27648a;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import o93.AbstractC27742n;
import ob3.InterfaceC27796f;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27798h;
import ob3.InterfaceC27801k;
import ob3.InterfaceC27805o;
import ov2.C28402f;
import ox0.C28448b;
import p000.AbstractC11266d;
import p000.C12473e;
import p003a1.C0107f;
import p021av.C2088b;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2301g;
import p031b9.AbstractC2875y;
import p048ce.AbstractC4482w;
import p078d1.C11457j;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p099dv.AbstractC12382c;
import p114eb.AbstractC12939a0;
import p132f0.C13798k;
import p132f0.EnumC13840z0;
import p161g.AbstractActivityC14909l;
import p163g1.AbstractC15011f9;
import p163g1.C14947a0;
import p163g1.C15069l3;
import p163g1.C15075m;
import p163g1.C15085n;
import p163g1.C15095o;
import p163g1.C15135s;
import p180h0.AbstractC16412k1;
import p180h0.AbstractC16460u;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16439p3;
import p180h0.InterfaceC16450s;
import p206i0.InterfaceC17836n;
import p208i2.C17875c1;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p217ib.AbstractC18313j;
import p251jg.C21654g;
import p251jg.C21655h;
import p251jg.C21656i;
import p251jg.C21657j;
import p251jg.C21658k;
import p251jg.C21659l;
import p251jg.C21660m;
import p251jg.C21661n;
import p251jg.C21662o;
import p251jg.C21663p;
import p268k0.AbstractC22086a;
import p291l0.InterfaceC22973k1;
import p294l3.C23255g0;
import p294l3.C23285v0;
import p298l8.AbstractC23420c;
import p298l8.C23418a;
import p319m4.AbstractC25012a;
import p323m8.AbstractC25218a;
import p329n0.C26049b;
import p335n6.AbstractC26391h;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p355o2.C27444o;
import p370oj.AbstractC27975v;
import p370oj.C27960g;
import p370oj.C27976w;
import p370oj.C27977x;
import p389p0.AbstractC28560y;
import p389p0.InterfaceC28512c0;
import p389p0.InterfaceC28549s0;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28664s0;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p395p6.AbstractC28909q;
import p395p6.C28908p1;
import p395p6.C28914r1;
import p395p6.C28917s1;
import p395p6.C28920t1;
import p395p6.InterfaceC28923u1;
import p409q0.AbstractC29701y;
import p409q0.C29676c;
import p409q0.C29680e;
import p409q0.C29681e0;
import p409q0.C29682f;
import p409q0.C29683g;
import p409q0.C29692p;
import p479s4.AbstractC32131l;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39176h;
import p702ch0.C4632k;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24685q;
import p93.AbstractC29032k;
import p93.C29028g;
import p93.C29031j;
import p93.C29033l;
import p93.C29034m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import s20.C32077a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s93.C32305g;
import s93.C32308j;
import s93.C32310l;
import s93.InterfaceC32300b;
import s93.InterfaceC32307i;
import ub3.AbstractC34756j;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;
import vf3.AbstractC35952b;
import vu.C36500a;
import vu.C36501b;
import vu.C36503d;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import yb0.AbstractC39383f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.squareup.wire.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5583n {

    /* JADX INFO: renamed from: b */
    public static C27430e f22103b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22104a;

    public /* synthetic */ AbstractC5583n(int i13) {
        this.f22104a = i13;
    }

    /* JADX INFO: renamed from: A */
    public static long m16742A(long j7, long j13) {
        return j7 >= 0 ? j7 / j13 : ((j7 + 1) / j13) - 1;
    }

    /* JADX INFO: renamed from: B */
    public static int m16743B(int i13, long j7) {
        long j13 = i13;
        return (int) (((j7 % j13) + j13) % j13);
    }

    /* JADX INFO: renamed from: C */
    public static Object m16744C(C28664s0 c28664s0, Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, c28664s0);
    }

    /* JADX INFO: renamed from: D */
    public static InterfaceC30061h m16745D(C28664s0 c28664s0, InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(c28664s0, interfaceC30062i);
    }

    /* JADX INFO: renamed from: E */
    public static final List m16746E(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        m16756P(abstractC23811y);
        int iM16792r = m16792r(abstractC23811y);
        if (iM16792r == 0) {
            return C25271y.f99162w;
        }
        List listSubList = abstractC23811y.mo69842X().subList(0, iM16792r);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC23804u0) it.next()).mo69868b());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static final InterfaceC3242e m16747F(AbstractC28669t1 abstractC28669t1, C28655q c28655q) {
        InterfaceC3242e interfaceC3242e = (InterfaceC3242e) c28655q.m87161k(abstractC28669t1);
        return interfaceC3242e == null ? C3238a.m9378a((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)) : interfaceC3242e;
    }

    /* JADX INFO: renamed from: G */
    public static final AbstractC29032k m16748G(C35848f c35848f) {
        if (!c35848f.m113794d() || c35848f.m113793c()) {
            return null;
        }
        C29034m c29034m = C29034m.f117506b;
        C35847e c35847eM113789b = c35848f.m113798i().m113789b();
        String strM113817b = c35848f.m113796g().m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        c29034m.getClass();
        C29033l c29033lM88266a = c29034m.m88266a(strM113817b, c35847eM113789b);
        if (c29033lM88266a != null) {
            return c29033lM88266a.f117504a;
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static final C27430e m16749H() {
        C27430e c27430e = f22103b;
        if (c27430e != null) {
            return c27430e;
        }
        C27428d c27428d = new C27428d("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i13 = AbstractC27433f0.f110561a;
        C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
        C0656u0 c0656u0 = new C0656u0(5);
        ArrayList arrayList = c0656u0.f2286a;
        c0656u0.m1651t(12.0f, 2.0f);
        c0656u0.m1641j(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c0656u0.m1652u(4.48f, 10.0f, 10.0f, 10.0f);
        c0656u0.m1652u(10.0f, -4.48f, 10.0f, -10.0f);
        arrayList.add(new C27444o(17.52f, 2.0f, 12.0f, 2.0f));
        c0656u0.m1640i();
        c0656u0.m1651t(13.0f, 17.0f);
        c0656u0.m1648q(-2.0f);
        c0656u0.m1653v(-6.0f);
        c0656u0.m1648q(2.0f);
        c0656u0.m1653v(6.0f);
        c0656u0.m1640i();
        c0656u0.m1651t(13.0f, 9.0f);
        c0656u0.m1648q(-2.0f);
        c0656u0.m1649r(11.0f, 7.0f);
        c0656u0.m1648q(2.0f);
        c0656u0.m1653v(2.0f);
        c0656u0.m1640i();
        C27428d.m82858a(c27428d, arrayList, c17875c1);
        C27430e c27430eM82859b = c27428d.m82859b();
        f22103b = c27430eM82859b;
        return c27430eM82859b;
    }

    /* JADX INFO: renamed from: I */
    public static final int m16750I(Layout layout, int i13, boolean z4) {
        if (i13 <= 0) {
            return 0;
        }
        if (i13 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i13);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i13 || lineEnd == i13) {
            if (lineStart == i13) {
                if (z4) {
                    return lineForOffset - 1;
                }
            } else if (!z4) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX INFO: renamed from: K */
    public static String m16751K(String str) {
        if (AbstractC39414r.m125890i0(str)) {
            return null;
        }
        String strM125864J0 = AbstractC39414r.m125864J0('#', str, str);
        String strM125864J1 = AbstractC39414r.m125864J0('?', strM125864J0, strM125864J0);
        String strM125860F0 = AbstractC39414r.m125860F0('.', AbstractC39414r.m125860F0('/', strM125864J1, strM125864J1), "");
        if (AbstractC39414r.m125890i0(strM125860F0)) {
            return null;
        }
        String lowerCase = strM125860F0.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        String str2 = (String) AbstractC22496h.f88194a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    /* JADX INFO: renamed from: L */
    public static final AbstractC23811y m16752L(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        m16756P(abstractC23811y);
        if (abstractC23811y.getAnnotations().mo52689T(AbstractC27741m.f111865p) == null) {
            return null;
        }
        return ((AbstractC23804u0) abstractC23811y.mo69842X().get(m16792r(abstractC23811y))).mo69868b();
    }

    /* JADX INFO: renamed from: M */
    public static final AbstractC23811y m16753M(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        m16756P(abstractC23811y);
        AbstractC23811y abstractC23811yMo69868b = ((AbstractC23804u0) AbstractC25265s.m74112P0(abstractC23811y.mo69842X())).mo69868b();
        AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
        return abstractC23811yMo69868b;
    }

    /* JADX INFO: renamed from: N */
    public static final List m16754N(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        m16756P(abstractC23811y);
        List listMo69842X = abstractC23811y.mo69842X();
        return listMo69842X.subList((m16755O(abstractC23811y) ? 1 : 0) + m16792r(abstractC23811y), listMo69842X.size() - 1);
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m16755O(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        return m16756P(abstractC23811y) && abstractC23811y.getAnnotations().mo52689T(AbstractC27741m.f111865p) != null;
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m16756P(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d == null) {
            return false;
        }
        AbstractC29032k abstractC29032kM16748G = ((interfaceC31126hMo1784d instanceof InterfaceC31117e) && AbstractC27736h.m83808J(interfaceC31126hMo1784d)) ? m16748G(AbstractC4393e.m13810h(interfaceC31126hMo1784d)) : null;
        return AbstractC22676k.m65745e(abstractC29032kM16748G, C29028g.f117498c) || AbstractC22676k.m65745e(abstractC29032kM16748G, C29031j.f117501c);
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m16757Q(AbstractC23763c0 abstractC23763c0) {
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23763c0.mo69844i0().mo1784d();
        AbstractC29032k abstractC29032kM16748G = null;
        if (interfaceC31126hMo1784d != null && (interfaceC31126hMo1784d instanceof InterfaceC31117e) && AbstractC27736h.m83808J(interfaceC31126hMo1784d)) {
            abstractC29032kM16748G = m16748G(AbstractC4393e.m13810h(interfaceC31126hMo1784d));
        }
        return AbstractC22676k.m65745e(abstractC29032kM16748G, C29028g.f117498c);
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m16758R(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        AbstractC29032k abstractC29032kM16748G = null;
        if (interfaceC31126hMo1784d != null && (interfaceC31126hMo1784d instanceof InterfaceC31117e) && AbstractC27736h.m83808J(interfaceC31126hMo1784d)) {
            abstractC29032kM16748G = m16748G(AbstractC4393e.m13810h(interfaceC31126hMo1784d));
        }
        return AbstractC22676k.m65745e(abstractC29032kM16748G, C29031j.f117501c);
    }

    /* JADX INFO: renamed from: S */
    public static InterfaceC30063j m16759S(C28664s0 c28664s0, InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(c28664s0, interfaceC30062i);
    }

    /* JADX INFO: renamed from: T */
    public static WindowInsets m16760T(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, FragmentContainerView fragmentContainerView, WindowInsets windowInsets) {
        AbstractC22676k.m65750j(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
        WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(fragmentContainerView, windowInsets);
        AbstractC22676k.m65749i(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
        return windowInsetsOnApplyWindowInsets;
    }

    /* JADX INFO: renamed from: U */
    public static InterfaceC30063j m16761U(C28664s0 c28664s0, InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(c28664s0, interfaceC30063j);
    }

    /* JADX INFO: renamed from: V */
    public static void m16762V(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    /* JADX INFO: renamed from: W */
    public static long m16763W(long j7, long j13) {
        long j14 = j7 + j13;
        if ((j7 ^ j14) >= 0 || (j7 ^ j13) < 0) {
            return j14;
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Addition overflows a long: ", " + ");
        sbM125596b.append(j13);
        throw new ArithmeticException(sbM125596b.toString());
    }

    /* JADX INFO: renamed from: X */
    public static long m16764X(long j7, int i13) {
        if (i13 == -1) {
            if (j7 != Long.MIN_VALUE) {
                return -j7;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j7 + " * " + i13);
        }
        if (i13 == 0) {
            return 0L;
        }
        if (i13 == 1) {
            return j7;
        }
        long j13 = i13;
        long j14 = j7 * j13;
        if (j14 / j13 == j7) {
            return j14;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j7 + " * " + i13);
    }

    /* JADX INFO: renamed from: Y */
    public static long m16765Y(long j7, long j13) {
        if (j13 == 1) {
            return j7;
        }
        if (j7 == 1) {
            return j13;
        }
        if (j7 == 0 || j13 == 0) {
            return 0L;
        }
        long j14 = j7 * j13;
        if (j14 / j13 == j7 && ((j7 != Long.MIN_VALUE || j13 != -1) && (j13 != Long.MIN_VALUE || j7 != -1))) {
            return j14;
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Multiplication overflows a long: ", " * ");
        sbM125596b.append(j13);
        throw new ArithmeticException(sbM125596b.toString());
    }

    /* JADX INFO: renamed from: Z */
    public static int m16766Z(int i13) {
        int i14 = i13 - 1;
        if ((i13 ^ i14) >= 0 || (i13 ^ 1) >= 0) {
            return i14;
        }
        throw new ArithmeticException(AbstractC2875y.m8296i(i13, "Subtraction overflows an int: ", " - 1"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX INFO: renamed from: a */
    public static final void m16767a(int i13, final long j7, Composer composer, InterfaceC4351m interfaceC4351m, InterfaceC28923u1 interfaceC28923u1) {
        List listM118958J;
        Object next;
        C23465k c23465k;
        ?? r10;
        ?? M118958J;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(361732211);
        InterfaceC4351m interfaceC4351m2 = interfaceC4351m;
        int i14 = i13 | (c28655q.m87153g(interfaceC28923u1) ? 4 : 2) | (c28655q.m87151f(j7) ? 32 : 16) | (c28655q.m87157i(interfaceC4351m2) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            if (interfaceC28923u1 instanceof C28920t1) {
                listM118958J = AbstractC37056f.m118958J(new C39176h(j7));
            } else if (interfaceC28923u1 instanceof C28914r1) {
                if (Build.VERSION.SDK_INT >= 31) {
                    c28655q.m87150e0(291633998);
                    Bundle bundle = (Bundle) c28655q.m87161k(AbstractC28909q.f117004a);
                    boolean z4 = (i14 & 112) == 32;
                    Object objM87133R = c28655q.m87133R();
                    if (z4 || objM87133R == C28635l.f115821a) {
                        objM87133R = new InterfaceC4339a() { // from class: p6.o1
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return new C39176h(j7);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i15 = bundle.getInt("appWidgetMinHeight", 0);
                        int i16 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i17 = bundle.getInt("appWidgetMinWidth", 0);
                        int i18 = bundle.getInt("appWidgetMaxWidth", 0);
                        M118958J = (i15 == 0 || i16 == 0 || i17 == 0 || i18 == 0) ? AbstractC37056f.m118958J(interfaceC4339a.invoke()) : AbstractC37056f.m118959K(new C39176h(AbstractC35952b.m114193a(i17, i16)), new C39176h(AbstractC35952b.m114193a(i18, i15)));
                    } else {
                        M118958J = new ArrayList(AbstractC25267u.m74163i0(parcelableArrayList, 10));
                        for (SizeF sizeF : parcelableArrayList) {
                            M118958J.add(new C39176h(AbstractC35952b.m114193a(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    c28655q.m87173q(false);
                    r10 = M118958J;
                } else {
                    c28655q.m87150e0(291738344);
                    List listM113982v = AbstractC35902e.m113982v((Bundle) c28655q.m87161k(AbstractC28909q.f117004a));
                    if (listM113982v.isEmpty()) {
                        listM113982v = AbstractC37056f.m118958J(new C39176h(j7));
                    }
                    c28655q.m87173q(false);
                    r10 = listM113982v;
                }
                listM118958J = (Collection) r10;
            } else {
                if (!(interfaceC28923u1 instanceof C28917s1)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    c28655q.m87150e0(292006649);
                    c28655q.m87173q(false);
                    listM118958J = ((C28917s1) interfaceC28923u1).f117027a;
                } else {
                    c28655q.m87150e0(292075221);
                    Set set = ((C28917s1) interfaceC28923u1).f117027a;
                    long j13 = ((C39176h) AbstractC25265s.m74152u1(set, AbstractC30060g.m92126p(new C28402f(24), new C28402f(25))).get(0)).f168415a;
                    List listM113982v2 = AbstractC35902e.m113982v((Bundle) c28655q.m87161k(AbstractC28909q.f117004a));
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM113982v2, 10));
                    Iterator it = listM113982v2.iterator();
                    while (it.hasNext()) {
                        long j14 = j13;
                        long j15 = ((C39176h) it.next()).f168415a;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = set.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            ArrayList arrayList3 = arrayList2;
                            long j16 = ((C39176h) it3.next()).f168415a;
                            float f13 = 1;
                            if (((float) Math.ceil(C39176h.m124787c(j15))) + f13 <= C39176h.m124787c(j16) || ((float) Math.ceil(C39176h.m124786b(j15))) + f13 <= C39176h.m124786b(j16)) {
                                c23465k = null;
                            } else {
                                C39176h c39176h = new C39176h(j16);
                                float fM124787c = C39176h.m124787c(j15) - C39176h.m124787c(j16);
                                float fM124786b = C39176h.m124786b(j15) - C39176h.m124786b(j16);
                                c23465k = new C23465k(c39176h, Float.valueOf((fM124786b * fM124786b) + (fM124787c * fM124787c)));
                            }
                            if (c23465k != null) {
                                arrayList3.add(c23465k);
                            }
                            arrayList2 = arrayList3;
                        }
                        Iterator it4 = arrayList2.iterator();
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (it4.hasNext()) {
                                float fFloatValue = ((Number) ((C23465k) next).f92938x).floatValue();
                                do {
                                    Object next2 = it4.next();
                                    float fFloatValue2 = ((Number) ((C23465k) next2).f92938x).floatValue();
                                    if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                                        next = next2;
                                        fFloatValue = fFloatValue2;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        C23465k c23465k2 = (C23465k) next;
                        C39176h c39176h2 = c23465k2 != null ? (C39176h) c23465k2.f92937w : null;
                        arrayList.add(new C39176h(c39176h2 != null ? c39176h2.f168415a : j14));
                        j13 = j14;
                    }
                    long j17 = j13;
                    boolean zIsEmpty = arrayList.isEmpty();
                    List listM118959K = arrayList;
                    if (zIsEmpty) {
                        listM118959K = AbstractC37056f.m118959K(new C39176h(j17), new C39176h(j17));
                    }
                    c28655q.m87173q(false);
                    listM118958J = listM118959K;
                }
            }
            List listM74159y0 = AbstractC25265s.m74159y0(listM118958J);
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(listM74159y0, 10));
            Iterator it5 = listM74159y0.iterator();
            while (it5.hasNext()) {
                m16777f((i14 & 896) | ((i14 << 3) & 112), ((C39176h) it5.next()).f168415a, c28655q, interfaceC4351m2, interfaceC28923u1);
                arrayList4.add(C23454a0.f92919a);
                interfaceC4351m2 = interfaceC4351m;
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28908p1(interfaceC28923u1, j7, interfaceC4351m, i13);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static long m16768a0(long j7, long j13) {
        long j14 = j7 - j13;
        if ((j7 ^ j14) >= 0 || (j7 ^ j13) >= 0) {
            return j14;
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Subtraction overflows a long: ", " - ");
        sbM125596b.append(j13);
        throw new ArithmeticException(sbM125596b.toString());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m16769b(String text, Modifier modifier, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        Modifier modifier3;
        boolean z14;
        C28655q c28655q;
        Modifier modifier4;
        boolean z15;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1144298551);
        int i17 = (c28655q2.m87153g(text) ? 4 : 2) | i13;
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i17 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i17 |= i16;
                }
                if ((i17 & 147) == 146 || !c28655q2.m87121F()) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    Modifier modifier5 = modifier3;
                    c28655q = c28655q2;
                    AbstractC15011f9.m43114b(text, modifier5, AbstractC11673r.m31082k(c28655q2).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q2).f56279f, 0L, 0L, null, null, 0L, 0, 0L, new C23255g0(z14), null, 16252927), c28655q, i17 & 126, 0, 65528);
                    modifier4 = modifier5;
                    z15 = z14;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    modifier4 = modifier2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15373j1(text, modifier4, z15, i13, i14, 0);
                }
            }
            i17 |= 384;
            z13 = z4;
            if ((i17 & 147) == 146) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                Modifier modifier6 = modifier3;
                c28655q = c28655q2;
                AbstractC15011f9.m43114b(text, modifier6, AbstractC11673r.m31082k(c28655q2).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q2).f56279f, 0L, 0L, null, null, 0L, 0, 0L, new C23255g0(z14), null, 16252927), c28655q, i17 & 126, 0, 65528);
                modifier4 = modifier6;
                z15 = z14;
            } else {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                Modifier modifier7 = modifier3;
                c28655q = c28655q2;
                AbstractC15011f9.m43114b(text, modifier7, AbstractC11673r.m31082k(c28655q2).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q2).f56279f, 0L, 0L, null, null, 0L, 0, 0L, new C23255g0(z14), null, 16252927), c28655q, i17 & 126, 0, 65528);
                modifier4 = modifier7;
                z15 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15373j1(text, modifier4, z15, i13, i14, 0);
            }
        }
        i17 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i17 |= i16;
            }
            if ((i17 & 147) == 146) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                Modifier modifier8 = modifier3;
                c28655q = c28655q2;
                AbstractC15011f9.m43114b(text, modifier8, AbstractC11673r.m31082k(c28655q2).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q2).f56279f, 0L, 0L, null, null, 0L, 0, 0L, new C23255g0(z14), null, 16252927), c28655q, i17 & 126, 0, 65528);
                modifier4 = modifier8;
                z15 = z14;
            } else {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                Modifier modifier9 = modifier3;
                c28655q = c28655q2;
                AbstractC15011f9.m43114b(text, modifier9, AbstractC11673r.m31082k(c28655q2).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q2).f56279f, 0L, 0L, null, null, 0L, 0, 0L, new C23255g0(z14), null, 16252927), c28655q, i17 & 126, 0, 65528);
                modifier4 = modifier9;
                z15 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15373j1(text, modifier4, z15, i13, i14, 0);
            }
        }
        i17 |= 384;
        z13 = z4;
        if ((i17 & 147) == 146) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i15 != 0) {
                z14 = true;
            } else {
                z14 = z13;
            }
            Modifier modifier10 = modifier3;
            c28655q = c28655q2;
            AbstractC15011f9.m43114b(text, modifier10, AbstractC11673r.m31082k(c28655q2).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q2).f56279f, 0L, 0L, null, null, 0L, 0, 0L, new C23255g0(z14), null, 16252927), c28655q, i17 & 126, 0, 65528);
            modifier4 = modifier10;
            z15 = z14;
        } else {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i15 != 0) {
                z14 = true;
            } else {
                z14 = z13;
            }
            Modifier modifier11 = modifier3;
            c28655q = c28655q2;
            AbstractC15011f9.m43114b(text, modifier11, AbstractC11673r.m31082k(c28655q2).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q2).f56279f, 0L, 0L, null, null, 0L, 0, 0L, new C23255g0(z14), null, 16252927), c28655q, i17 & 126, 0, 65528);
            modifier4 = modifier11;
            z15 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15373j1(text, modifier4, z15, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static int m16770b0(long j7) {
        if (j7 > 2147483647L || j7 < -2147483648L) {
            throw new ArithmeticException(AbstractC11895b.m31994m(j7, "Calculation overflows an int: "));
        }
        return (int) j7;
    }

    /* JADX INFO: renamed from: c */
    public static final void m16771c(Modifier modifier, AbstractC29701y abstractC29701y, InterfaceC22973k1 interfaceC22973k1, EnumC16377d2 enumC16377d2, InterfaceC16439p3 interfaceC16439p3, boolean z4, C13798k c13798k, int i13, float f13, C29680e c29680e, InterfaceC33313a interfaceC33313a, InterfaceC2300f interfaceC2300f, InterfaceC2301g interfaceC2301g, InterfaceC17836n interfaceC17836n, C37816b c37816b, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        C37816b c37816b2;
        Modifier modifier2;
        InterfaceC33313a interfaceC33313a2;
        int i18;
        C28655q c28655q;
        AbstractC29701y abstractC29701y2;
        AbstractC29701y abstractC29701y3;
        InterfaceC2994c0 interfaceC2994c0;
        int i19;
        EnumC16377d2 enumC16377d3;
        InterfaceC21488u interfaceC21488u;
        Modifier modifierM3433a;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-572816025);
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q2.m87153g(modifier) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87153g(abstractC29701y) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87153g(interfaceC22973k1) ? 256 : 128;
        }
        int i24 = i14 & 3072;
        int i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i24 == 0) {
            i16 |= c28655q2.m87155h(false) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i26 = i14 & 24576;
        int i27 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i26 == 0) {
            i16 |= c28655q2.m87149e(enumC16377d2.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        int i28 = i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i28 == 0) {
            i16 |= c28655q2.m87153g(interfaceC16439p3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= c28655q2.m87155h(z4) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= c28655q2.m87153g(c13798k) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= c28655q2.m87149e(i13) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i14 & 805306368) == 0) {
            i16 |= c28655q2.m87147d(f13) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (c28655q2.m87153g(c29680e) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q2.m87157i(interfaceC33313a) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q2.m87157i(null) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            if (c28655q2.m87153g(interfaceC2300f)) {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i17 |= i25;
        }
        if ((i15 & 24576) == 0) {
            if (c28655q2.m87153g(interfaceC2301g)) {
                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i17 |= i27;
        }
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87153g(interfaceC17836n)) {
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            }
            i17 |= i29;
        }
        if ((i15 & 1572864) == 0) {
            c37816b2 = c37816b;
            i17 |= c28655q2.m87157i(c37816b2) ? 1048576 : 524288;
        } else {
            c37816b2 = c37816b;
        }
        int i34 = i17;
        if (c28655q2.m87135U(i16 & 1, ((i16 & 306783379) == 306783378 && (599187 & i34) == 599186) ? false : true)) {
            if (i13 < 0) {
                AbstractC22086a.m63158a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i13);
            }
            int i35 = i16 & 112;
            boolean z13 = i35 == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C29676c(abstractC29701y, 0);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i36 = i16 >> 3;
            int i37 = i36 & 14;
            int i38 = i34 >> 15;
            int i39 = i37 | (i38 & 112) | (i34 & 896);
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(c37816b2, c28655q2);
            InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(null, c28655q2);
            boolean zM87153g = ((((i39 & 14) ^ 6) > 4 && c28655q2.m87153g(abstractC29701y)) || (i39 & 6) == 4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                C28676v0 c28676v1 = C28676v0.f115977z;
                objM87133R2 = new C17177j(0, 7, InterfaceC28670t2.class, AbstractC28683x.m87265s(new C28448b(25, AbstractC28683x.m87265s(new C24685q(interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC4339a), c28676v1), abstractC29701y), c28676v1), "value", "getValue()Ljava/lang/Object;");
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC21488u interfaceC21488u2 = (InterfaceC21488u) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
            boolean z14 = i35 == 32;
            Object objM87133R4 = c28655q2.m87133R();
            if (z14 || objM87133R4 == c28676v0) {
                objM87133R4 = new C29676c(abstractC29701y, 1);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            int i44 = i16 >> 9;
            int i45 = (i16 & 65520) | (i44 & 458752) | (i44 & 3670016) | ((i34 << 21) & 29360128);
            int i46 = i34 << 15;
            int i47 = i45 | (i46 & 234881024) | (i46 & 1879048192);
            boolean zM87153g2 = ((((i47 & 458752) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21) > 131072 && c28655q2.m87149e(i13)) || (i47 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072) | ((((i47 & 896) ^ 384) > 256 && c28655q2.m87153g(interfaceC22973k1)) || (i47 & 384) == 256) | ((((i47 & 112) ^ 48) > 32 && c28655q2.m87153g(abstractC29701y)) || (i47 & 48) == 32) | ((((i47 & 7168) ^ 3072) > 2048 && c28655q2.m87155h(false)) || (i47 & 3072) == 2048) | ((((57344 & i47) ^ 24576) > 16384 && c28655q2.m87149e(enumC16377d2.ordinal())) || (i47 & 24576) == 16384) | ((((i47 & 234881024) ^ 100663296) > 67108864 && c28655q2.m87153g(interfaceC2300f)) || (i47 & 100663296) == 67108864) | ((((i47 & 1879048192) ^ 805306368) > 536870912 && c28655q2.m87153g(interfaceC2301g)) || (i47 & 805306368) == 536870912) | ((((i47 & 3670016) ^ 1572864) > 1048576 && c28655q2.m87147d(f13)) || (i47 & 1572864) == 1048576) | ((((i47 & 29360128) ^ 12582912) > 8388608 && c28655q2.m87153g(c29680e)) || (i47 & 12582912) == 8388608) | ((((i38 & 14) ^ 6) > 4 && c28655q2.m87153g(interfaceC17836n)) || (i38 & 6) == 4) | c28655q2.m87153g(interfaceC4339a2) | c28655q2.m87153g(interfaceC2994c1);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R5 == c28676v0) {
                abstractC29701y3 = abstractC29701y;
                i18 = i13;
                c28655q = c28655q2;
                interfaceC2994c0 = interfaceC2994c1;
                i19 = 4;
                enumC16377d3 = enumC16377d2;
                objM87133R5 = new C29692p(abstractC29701y3, enumC16377d3, interfaceC22973k1, f13, c29680e, interfaceC21488u2, interfaceC4339a2, interfaceC2301g, interfaceC2300f, i18, interfaceC17836n, interfaceC2994c0);
                interfaceC21488u = interfaceC21488u2;
                c28655q.m87172p0(objM87133R5);
            } else {
                abstractC29701y3 = abstractC29701y;
                interfaceC2994c0 = interfaceC2994c1;
                interfaceC21488u = interfaceC21488u2;
                i18 = i13;
                c28655q = c28655q2;
                i19 = 4;
                enumC16377d3 = enumC16377d2;
            }
            InterfaceC28512c0 interfaceC28512c0 = (InterfaceC28512c0) objM87133R5;
            EnumC16377d2 enumC16377d4 = EnumC16377d2.f62971w;
            boolean z15 = enumC16377d3 == enumC16377d4;
            boolean zM87155h = (((i37 ^ 6) > i19 && c28655q.m87153g(abstractC29701y3)) || (i36 & 6) == i19) | c28655q.m87155h(z15);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87155h || objM87133R6 == c28676v0) {
                objM87133R6 = new C26049b(abstractC29701y3, z15, 1);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC28549s0 interfaceC28549s0 = (InterfaceC28549s0) objM87133R6;
            boolean z16 = (i35 == 32) | ((i16 & 458752) == 131072);
            Object objM87133R7 = c28655q.m87133R();
            if (z16 || objM87133R7 == c28676v0) {
                objM87133R7 = new C29681e0(interfaceC16439p3, abstractC29701y3);
                c28655q.m87172p0(objM87133R7);
            }
            C29681e0 c29681e0 = (C29681e0) objM87133R7;
            InterfaceC16450s interfaceC16450s = (InterfaceC16450s) c28655q.m87161k(AbstractC16460u.f63241a);
            boolean zM87153g3 = (i35 == 32) | c28655q.m87153g(interfaceC16450s);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87153g3 || objM87133R8 == c28676v0) {
                objM87133R8 = new C29683g(abstractC29701y3, interfaceC16450s);
                c28655q.m87172p0(objM87133R8);
            }
            C29683g c29683g = (C29683g) objM87133R8;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(-853761213);
                int i48 = i37 | ((i16 >> 21) & 112);
                boolean z17 = ((((i48 & 14) ^ 6) > i19 && c28655q.m87153g(abstractC29701y3)) || (i48 & 6) == i19) | ((((i48 & 112) ^ 48) > 32 && c28655q.m87149e(i18)) || (i48 & 48) == 32);
                Object objM87133R9 = c28655q.m87133R();
                if (z17 || objM87133R9 == c28676v0) {
                    objM87133R9 = new C29682f(abstractC29701y3, i18);
                    c28655q.m87172p0(objM87133R9);
                }
                modifierM3433a = AbstractC1105a.m3433a((C29682f) objM87133R9, abstractC29701y3.f121453x, enumC16377d3);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-853331429);
                c28655q.m87173q(false);
                modifierM3433a = c2314t;
            }
            modifier2 = modifier;
            Modifier modifierM3434b = AbstractC1105a.m3434b(modifier2.mo3471e(abstractC29701y3.f121421A).mo3471e(abstractC29701y3.f121454y), interfaceC21488u, interfaceC28549s0, enumC16377d3, z4);
            Modifier modifierM3365j = AbstractC1092a.m3365j((z4 ? modifierM3434b.mo3471e(AbstractC18032n.m51775c(c2314t, false, new C1023i0(enumC16377d3 == enumC16377d4, abstractC29701y3, interfaceC2994c0, 11))) : modifierM3434b.mo3471e(c2314t)).mo3471e(modifierM3433a), abstractC29701y3, enumC16377d3, z4, c29681e0, abstractC29701y3.f121447r, false, c13798k, c29683g);
            abstractC29701y2 = abstractC29701y3;
            Modifier modifierMo3471e = modifierM3365j.mo3471e(AbstractC34452c0.m108903b(c2314t, abstractC29701y2, new C0107f(abstractC29701y2, 6)));
            interfaceC33313a2 = interfaceC33313a;
            AbstractC28560y.m86876c(interfaceC21488u, AbstractC1129a.m3495a(modifierMo3471e, interfaceC33313a2, null), abstractC29701y2.f121452w, interfaceC28512c0, c28655q, 0);
        } else {
            modifier2 = modifier;
            interfaceC33313a2 = interfaceC33313a;
            i18 = i13;
            c28655q = c28655q2;
            abstractC29701y2 = abstractC29701y;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4632k(modifier2, abstractC29701y2, interfaceC22973k1, enumC16377d2, interfaceC16439p3, z4, c13798k, i18, f13, c29680e, interfaceC33313a2, interfaceC2300f, interfaceC2301g, interfaceC17836n, c37816b, i14, i15);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m16772c0(InterfaceC27805o interfaceC27805o, InterfaceC27798h interfaceC27798h, InterfaceC27798h interfaceC27798h2) {
        if (interfaceC27805o.mo74559g(interfaceC27798h) == interfaceC27805o.mo74559g(interfaceC27798h2) && interfaceC27805o.mo74542R(interfaceC27798h) == interfaceC27805o.mo74542R(interfaceC27798h2) && interfaceC27805o.mo74571m(interfaceC27798h) == interfaceC27805o.mo74571m(interfaceC27798h2) && interfaceC27805o.mo74533H(interfaceC27805o.mo74544T(interfaceC27798h), interfaceC27805o.mo74544T(interfaceC27798h2))) {
            if (interfaceC27805o.mo74546V(interfaceC27798h, interfaceC27798h2)) {
                return true;
            }
            int iMo74559g = interfaceC27805o.mo74559g(interfaceC27798h);
            for (int i13 = 0; i13 < iMo74559g; i13++) {
                InterfaceC27801k interfaceC27801kMo74536K = interfaceC27805o.mo74536K(interfaceC27798h, i13);
                InterfaceC27801k interfaceC27801kMo74536K2 = interfaceC27805o.mo74536K(interfaceC27798h2, i13);
                if (interfaceC27805o.mo74527B(interfaceC27801kMo74536K) == interfaceC27805o.mo74527B(interfaceC27801kMo74536K2)) {
                    if (!interfaceC27805o.mo74527B(interfaceC27801kMo74536K)) {
                        if (interfaceC27805o.mo74563i(interfaceC27801kMo74536K) == interfaceC27805o.mo74563i(interfaceC27801kMo74536K2)) {
                            InterfaceC27797g interfaceC27797gMo74550Z = interfaceC27805o.mo74550Z(interfaceC27801kMo74536K);
                            AbstractC22676k.m65747g(interfaceC27797gMo74550Z);
                            InterfaceC27797g interfaceC27797gMo74550Z2 = interfaceC27805o.mo74550Z(interfaceC27801kMo74536K2);
                            AbstractC22676k.m65747g(interfaceC27797gMo74550Z2);
                            if (!m16776e0(interfaceC27805o, interfaceC27797gMo74550Z, interfaceC27797gMo74550Z2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m16773d(String str, C32077a args, boolean z4, Function1 onFormFieldValuesChanged, List formElements, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Modifier modifier3;
        String strM53370k;
        C17967o c17967o;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        AbstractC23420c defaultViewModelCreationExtras;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC22676k.m65750j(formElements, "formElements");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-254814677);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(args) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onFormFieldValuesChanged) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(formElements) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i16 = i14 & 32;
        if (i16 == 0) {
            if ((196608 & i13) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) == 74898 || !c28655q.m87121F()) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                strM53370k = AbstractC18489d0.m53370k(args.f133022a, "_", str);
                c17967o = new C17967o(formElements, args);
                c28655q.m87152f0(1729797275);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                if (interfaceC1583f2M73844a instanceof InterfaceC1620r) {
                    defaultViewModelCreationExtras = ((InterfaceC1620r) interfaceC1583f2M73844a).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = C23418a.f92771b;
                }
                AbstractC1637w1 abstractC1637w1M88523c0 = AbstractC29125c.m88523c0(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27460e.class), interfaceC1583f2M73844a, strM53370k, c17967o, defaultViewModelCreationExtras, c28655q);
                c28655q.m87173q(false);
                C27460e c27460e = (C27460e) abstractC1637w1M88523c0;
                List list = c27460e.f110664w;
                InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c27460e.f110666y, c28655q, 0);
                InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c27460e.f110663E, c28655q, 0);
                int i17 = i15;
                Modifier modifier4 = modifier3;
                m16775e(args.f133022a, z4, onFormFieldValuesChanged, c27460e.f110667z, (Set) interfaceC28601c1M83597t.getValue(), list, (IdentifierSpec) interfaceC28601c1M83597t2.getValue(), modifier4, c28655q, ((i17 << 6) & 29360128) | ((i17 >> 3) & MessageListItemViewType.GIPHY) | (IdentifierSpec.$stable << 18));
                c28655q = c28655q;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(str, args, z4, onFormFieldValuesChanged, formElements, modifier2, i13, i14, 0);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        if ((74899 & i15) == 74898) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            strM53370k = AbstractC18489d0.m53370k(args.f133022a, "_", str);
            c17967o = new C17967o(formElements, args);
            c28655q.m87152f0(1729797275);
            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
            if (interfaceC1583f2M73844a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            if (interfaceC1583f2M73844a instanceof InterfaceC1620r) {
                defaultViewModelCreationExtras = ((InterfaceC1620r) interfaceC1583f2M73844a).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = C23418a.f92771b;
            }
            AbstractC1637w1 abstractC1637w1M88523c1 = AbstractC29125c.m88523c0(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27460e.class), interfaceC1583f2M73844a, strM53370k, c17967o, defaultViewModelCreationExtras, c28655q);
            c28655q.m87173q(false);
            C27460e c27460e2 = (C27460e) abstractC1637w1M88523c1;
            List list2 = c27460e2.f110664w;
            InterfaceC28601c1 interfaceC28601c1M83597t3 = C27648a.m83597t(c27460e2.f110666y, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t4 = C27648a.m83597t(c27460e2.f110663E, c28655q, 0);
            int i18 = i15;
            Modifier modifier5 = modifier3;
            m16775e(args.f133022a, z4, onFormFieldValuesChanged, c27460e2.f110667z, (Set) interfaceC28601c1M83597t3.getValue(), list2, (IdentifierSpec) interfaceC28601c1M83597t4.getValue(), modifier5, c28655q, ((i18 << 6) & 29360128) | ((i18 >> 3) & MessageListItemViewType.GIPHY) | (IdentifierSpec.$stable << 18));
            c28655q = c28655q;
            modifier2 = modifier5;
        } else {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            strM53370k = AbstractC18489d0.m53370k(args.f133022a, "_", str);
            c17967o = new C17967o(formElements, args);
            c28655q.m87152f0(1729797275);
            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
            if (interfaceC1583f2M73844a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            if (interfaceC1583f2M73844a instanceof InterfaceC1620r) {
                defaultViewModelCreationExtras = ((InterfaceC1620r) interfaceC1583f2M73844a).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = C23418a.f92771b;
            }
            AbstractC1637w1 abstractC1637w1M88523c2 = AbstractC29125c.m88523c0(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27460e.class), interfaceC1583f2M73844a, strM53370k, c17967o, defaultViewModelCreationExtras, c28655q);
            c28655q.m87173q(false);
            C27460e c27460e3 = (C27460e) abstractC1637w1M88523c2;
            List list3 = c27460e3.f110664w;
            InterfaceC28601c1 interfaceC28601c1M83597t5 = C27648a.m83597t(c27460e3.f110666y, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t6 = C27648a.m83597t(c27460e3.f110663E, c28655q, 0);
            int i19 = i15;
            Modifier modifier6 = modifier3;
            m16775e(args.f133022a, z4, onFormFieldValuesChanged, c27460e3.f110667z, (Set) interfaceC28601c1M83597t5.getValue(), list3, (IdentifierSpec) interfaceC28601c1M83597t6.getValue(), modifier6, c28655q, ((i19 << 6) & 29360128) | ((i19 >> 3) & MessageListItemViewType.GIPHY) | (IdentifierSpec.$stable << 18));
            c28655q = c28655q;
            modifier2 = modifier6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(str, args, z4, onFormFieldValuesChanged, formElements, modifier2, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m16774d0(InterfaceC27805o context, InterfaceC27797g a5, InterfaceC27797g b) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        return m16776e0(context, a5, b);
    }

    /* JADX INFO: renamed from: e */
    public static final void m16775e(String paymentMethodCode, boolean z4, Function1 onFormFieldValuesChanged, InterfaceC13058l completeFormValues, Set hiddenIdentifiers, List elements, IdentifierSpec identifierSpec, Modifier modifier, Composer composer, int i13) {
        int i14;
        boolean z13;
        Modifier modifier2;
        AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
        AbstractC22676k.m65750j(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC22676k.m65750j(completeFormValues, "completeFormValues");
        AbstractC22676k.m65750j(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC22676k.m65750j(elements, "elements");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(958947257);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(paymentMethodCode) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            z13 = z4;
            i14 |= c28655q.m87155h(z13) ? 32 : 16;
        } else {
            z13 = z4;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onFormFieldValuesChanged) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(completeFormValues) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(hiddenIdentifiers) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(elements) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= (2097152 & i13) == 0 ? c28655q.m87153g(identifierSpec) : c28655q.m87157i(identifierSpec) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            modifier2 = modifier;
            i14 |= c28655q.m87153g(modifier2) ? 8388608 : 4194304;
        } else {
            modifier2 = modifier;
        }
        if ((4793491 & i14) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-1982410935);
            boolean zM87157i = ((i14 & 896) == 256) | c28655q.m87157i(completeFormValues);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C12473e(completeFormValues, onFormFieldValuesChanged, (InterfaceC30057d) null, 18);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, paymentMethodCode);
            int i15 = ((i14 >> 12) & 14) | (i14 & 112);
            int i16 = i14 >> 9;
            AbstractC32131l.m100070b(hiddenIdentifiers, z13, elements, identifierSpec, modifier2, c28655q, i15 | (i16 & 896) | (IdentifierSpec.$stable << 9) | (i16 & 7168) | (i16 & 57344), 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2509e2(paymentMethodCode, z4, onFormFieldValuesChanged, completeFormValues, hiddenIdentifiers, elements, identifierSpec, modifier, i13);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m16776e0(InterfaceC27805o interfaceC27805o, InterfaceC27797g interfaceC27797g, InterfaceC27797g interfaceC27797g2) {
        if (interfaceC27797g == interfaceC27797g2) {
            return true;
        }
        InterfaceC27798h interfaceC27798hMo74562h0 = interfaceC27805o.mo74562h0(interfaceC27797g);
        InterfaceC27798h interfaceC27798hMo74562h1 = interfaceC27805o.mo74562h0(interfaceC27797g2);
        if (interfaceC27798hMo74562h0 != null && interfaceC27798hMo74562h1 != null) {
            return m16772c0(interfaceC27805o, interfaceC27798hMo74562h0, interfaceC27798hMo74562h1);
        }
        InterfaceC27796f interfaceC27796fMo74581r = interfaceC27805o.mo74581r(interfaceC27797g);
        InterfaceC27796f interfaceC27796fMo74581r2 = interfaceC27805o.mo74581r(interfaceC27797g2);
        return interfaceC27796fMo74581r != null && interfaceC27796fMo74581r2 != null && m16772c0(interfaceC27805o, interfaceC27805o.mo74458b(interfaceC27796fMo74581r), interfaceC27805o.mo74458b(interfaceC27796fMo74581r2)) && m16772c0(interfaceC27805o, interfaceC27805o.mo74457a(interfaceC27796fMo74581r), interfaceC27805o.mo74457a(interfaceC27796fMo74581r2));
    }

    /* JADX INFO: renamed from: f */
    public static final void m16777f(int i13, long j7, Composer composer, InterfaceC4351m interfaceC4351m, InterfaceC28923u1 interfaceC28923u1) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-771692794);
        int i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC28923u1) : c28655q.m87157i(interfaceC28923u1) ? 32 : 16;
        }
        if (((i14 | (c28655q.m87157i(interfaceC4351m) ? 256 : 128)) & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC28683x.m87247a(AbstractC26391h.f104840a.mo86977a(new C39176h(j7)), AbstractC37817c.m121344e(-367769018, c28655q, new C28908p1(interfaceC4351m, j7, interfaceC28923u1)), c28655q, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17956k0(j7, interfaceC28923u1, interfaceC4351m, i13, 4);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final Object m16778f0(StylePropertyValue stylePropertyValue) {
        C11142b c11142b;
        AbstractC22676k.m65750j(stylePropertyValue, "<this>");
        int i13 = AbstractC12382c.f41844a[stylePropertyValue.getKind().ordinal()];
        if (i13 == 1) {
            Value value = stylePropertyValue.getValue();
            AbstractC22676k.m65749i(value, "this.value");
            Serializable serializableM16780g0 = m16780g0(value);
            if (String.class.isInstance(serializableM16780g0)) {
                return serializableM16780g0;
            }
            throw new UnsupportedOperationException("Requested type String doesn't match ".concat(serializableM16780g0.getClass().getSimpleName()));
        }
        if (i13 != 2) {
            if (i13 != 3) {
                if (i13 == 4) {
                    throw new IllegalArgumentException("Property is undefined");
                }
                throw new UnsupportedOperationException("parsing " + stylePropertyValue.getKind() + " is not supported yet");
            }
            Value value2 = stylePropertyValue.getValue();
            AbstractC22676k.m65749i(value2, "this.value");
            C36503d c36503dM16782h0 = m16782h0(value2);
            if (String.class.isInstance(c36503dM16782h0)) {
                return c36503dM16782h0;
            }
            throw new IllegalArgumentException("Requested type String doesn't match ".concat(C36503d.class.getSimpleName()));
        }
        Value value3 = stylePropertyValue.getValue();
        AbstractC22676k.m65749i(value3, "this.value");
        Object contents = value3.getContents();
        if (contents instanceof HashMap) {
            C11457j c11457j = new C11457j(9, false);
            HashMap map = (HashMap) contents;
            Value value4 = (Value) map.get("delay");
            if (value4 != null) {
                Object contents2 = value4.getContents();
                AbstractC22676k.m65748h(contents2, "null cannot be cast to non-null type kotlin.Long");
                c11457j.f36754y = (Long) contents2;
            }
            Value value5 = (Value) map.get(AttachmentExtensionsKt.EXTRA_DURATION);
            if (value5 != null) {
                Object contents3 = value5.getContents();
                AbstractC22676k.m65748h(contents3, "null cannot be cast to non-null type kotlin.Long");
                c11457j.f36753x = (Long) contents3;
            }
            c11142b = new C11142b(c11457j);
        } else {
            if (!(contents instanceof List)) {
                throw new UnsupportedOperationException("unable to unwrap to StyleTransition: " + value3);
            }
            List list = (List) contents;
            C11457j c11457j2 = new C11457j(9, false);
            Object contents4 = ((Value) list.get(0)).getContents();
            AbstractC22676k.m65748h(contents4, "null cannot be cast to non-null type kotlin.Long");
            c11457j2.f36753x = (Long) contents4;
            Object contents5 = ((Value) list.get(1)).getContents();
            AbstractC22676k.m65748h(contents5, "null cannot be cast to non-null type kotlin.Long");
            c11457j2.f36754y = (Long) contents5;
            c11142b = new C11142b(c11457j2);
        }
        if (String.class.isInstance(c11142b)) {
            return c11142b;
        }
        throw new IllegalArgumentException("Requested type String doesn't match ".concat(C11142b.class.getSimpleName()));
    }

    /* JADX INFO: renamed from: g */
    public static final void m16779g(Nudge nudge, SimulationContext simulationContext, C27960g c27960g, C27960g c27960g2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1699761582);
        DebugStatus debugStatusM84396b = AbstractC27975v.m84396b(simulationContext);
        AbstractC37926s0.m121464b("Trigger", debugStatusM84396b, AbstractC37817c.m121341b(-1404719373, c28655q, new C27977x(debugStatusM84396b, simulationContext, nudge, AbstractC27975v.m84395a(nudge), c27960g, c27960g2)), c28655q, 390);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27976w(nudge, simulationContext, c27960g, c27960g2, i13);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Serializable m16780g0(Value value) {
        AbstractC22676k.m65750j(value, "<this>");
        Object contents = value.getContents();
        if (!(contents instanceof Double) && !(contents instanceof Long) && !(contents instanceof Boolean) && !(contents instanceof String) && !(contents instanceof double[]) && !(contents instanceof long[]) && !(contents instanceof boolean[])) {
            if (contents instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) contents).iterator();
                while (it.hasNext()) {
                    arrayList.add(m16780g0((Value) it.next()));
                }
                return arrayList;
            }
            if (!(contents instanceof HashMap)) {
                StringBuilder sb4 = new StringBuilder("unable to unwrap Value of content type: ");
                Object contents2 = value.getContents();
                sb4.append(contents2 != null ? contents2.getClass().getSimpleName() : null);
                throw new UnsupportedOperationException(sb4.toString());
            }
            HashMap map = (HashMap) contents;
            HashMap map2 = new HashMap();
            Set<String> setKeySet = map.keySet();
            AbstractC22676k.m65749i(setKeySet, "valueMap.keys");
            for (String key : setKeySet) {
                Value value2 = (Value) map.get(key);
                if (value2 != null) {
                    AbstractC22676k.m65749i(key, "key");
                    map2.put(key, m16780g0(value2));
                }
            }
            return map2;
        }
        return (Serializable) contents;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public static final Object m16781h(AbstractActivityC14909l abstractActivityC14909l, AbstractC32269c abstractC32269c) {
        C3878f c3878f;
        C3058t c3058tM8707a;
        C3058t c3058t;
        if (abstractC32269c instanceof C3878f) {
            c3878f = (C3878f) abstractC32269c;
            int i13 = c3878f.f15870y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3878f.f15870y = i13 - Integer.MIN_VALUE;
            } else {
                c3878f = new C3878f(abstractC32269c);
            }
        } else {
            c3878f = new C3878f(abstractC32269c);
        }
        C3878f c3878f2 = c3878f;
        Object obj = c3878f2.f15869x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3878f2.f15870y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c3058tM8707a = AbstractC3006f0.m8707a();
            AbstractC1638x lifecycle = abstractActivityC14909l.getLifecycle();
            EnumC1635w enumC1635w = EnumC1635w.f6323E;
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3069w1 abstractC3069w1Mo8825s = AbstractC17182o.f65999a.mo8825s();
            boolean zIsDispatchNeeded = abstractC3069w1Mo8825s.isDispatchNeeded(c3878f2.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() == EnumC1635w.f6325w) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.getCurrentState().compareTo(enumC1635w) >= 0) {
                    c3058tM8707a.m8807L(c23454a0);
                    c3878f2.f15868w = null;
                    c3878f2.f15870y = 2;
                    if (c3058tM8707a.m8817m(c3878f2) != enumC31071a) {
                        return c23454a0;
                    }
                }
                return enumC31071a;
            }
            C2088b c2088b = new C2088b(c3058tM8707a, 3);
            c3878f2.f15868w = c3058tM8707a;
            c3878f2.f15870y = 1;
            if (AbstractC1613o1.m5026p(lifecycle, enumC1635w, zIsDispatchNeeded, abstractC3069w1Mo8825s, c2088b, c3878f2) != enumC31071a) {
                c3058t = c3058tM8707a;
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        c3058t = c3878f2.f15868w;
        AbstractC34132o.m107864I(obj);
        c3058tM8707a = c3058t;
        c3878f2.f15868w = null;
        c3878f2.f15870y = 2;
        if (c3058tM8707a.m8817m(c3878f2) != enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: h0 */
    public static final C36503d m16782h0(Value value) {
        AbstractC22676k.m65750j(value, "<this>");
        Object contents = value.getContents();
        if (contents instanceof Double) {
            return new C36503d(((Number) contents).doubleValue());
        }
        if (contents instanceof Long) {
            return new C36503d(((Number) contents).longValue());
        }
        if (contents instanceof Boolean) {
            Boolean bool = (Boolean) contents;
            C36503d c36503d = new C36503d(bool.booleanValue());
            c36503d.f155940a = bool;
            return c36503d;
        }
        if (contents instanceof String) {
            String str = (String) contents;
            C36503d c36503d2 = new C36503d(str);
            c36503d2.f155940a = str;
            return c36503d2;
        }
        if (!(contents instanceof List)) {
            if (!(contents instanceof HashMap)) {
                throw new UnsupportedOperationException("unable to unwrap to Expression: " + value);
            }
            HashMap map = (HashMap) contents;
            C36503d c36503d3 = new C36503d((HashMap<String, Value>) map);
            c36503d3.f155940a = map;
            return c36503d3;
        }
        List list = (List) contents;
        Object contents2 = ((Value) AbstractC25265s.m74096F0(list)).getContents();
        String str2 = contents2 instanceof String ? (String) contents2 : null;
        if (str2 == null) {
            return new C36503d(list);
        }
        if ("literal".equals(str2)) {
            Object contents3 = ((Value) AbstractC25265s.m74112P0(list)).getContents();
            if (contents3 instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) contents3).iterator();
                while (it.hasNext()) {
                    arrayList.add(m16782h0((Value) it.next()));
                }
                C36500a c36500a = new C36500a("literal");
                c36500a.m116998a(new C36503d(arrayList));
                return c36500a.m116999b();
            }
            if (contents3 instanceof HashMap) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry : ((HashMap) contents3).entrySet()) {
                    map2.put((String) entry.getKey(), m16782h0((Value) entry.getValue()));
                }
                HashMap map3 = new HashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    map3.put((String) entry2.getKey(), AbstractC4482w.m14004n0(entry2.getValue()));
                }
                C36500a c36500a2 = new C36500a("literal");
                C36503d c36503d4 = new C36503d((HashMap<String, Value>) map3);
                c36503d4.f155940a = map3;
                c36500a2.m116998a(c36503d4);
                return c36500a2.m116999b();
            }
        } else if ("image".equals(str2)) {
            C36501b c36501b = new C36501b("image");
            Iterator it3 = AbstractC25265s.m74161z0(list, 1).iterator();
            while (it3.hasNext()) {
                c36501b.m116998a(m16782h0((Value) it3.next()));
            }
            return c36501b.m116999b();
        }
        List listM74161z0 = AbstractC25265s.m74161z0(list, 1);
        C36500a c36500a3 = new C36500a(str2);
        Iterator it4 = listM74161z0.iterator();
        while (it4.hasNext()) {
            c36500a3.m116998a(m16782h0((Value) it4.next()));
        }
        return c36500a3.m116999b();
    }

    /* JADX INFO: renamed from: i */
    public static final int m16783i(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public static final Object m16784j(InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C15095o c15095o;
        if (abstractC32269c instanceof C15095o) {
            c15095o = (C15095o) abstractC32269c;
            int i13 = c15095o.f56540x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15095o.f56540x = i13 - Integer.MIN_VALUE;
            } else {
                c15095o = new C15095o(abstractC32269c);
            }
        } else {
            c15095o = new C15095o(abstractC32269c);
        }
        Object obj = c15095o.f56539w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15095o.f56540x;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C15135s c15135s = new C15135s(interfaceC4339a, interfaceC4351m, null, 0);
                c15095o.f56540x = 1;
                if (AbstractC3006f0.m8719m(c15135s, c15095o) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static C11513a m16785k(MultiTouchViewPager multiTouchViewPager, C24968b c24968b, C15352f4 c15352f4, int i13) {
        if ((i13 & 2) != 0) {
            c24968b = null;
        }
        if ((i13 & 4) != 0) {
            c15352f4 = null;
        }
        AbstractC22676k.m65750j(multiTouchViewPager, "<this>");
        C11513a c11513a = new C11513a(c24968b, c15352f4);
        multiTouchViewPager.m5478c(c11513a);
        return c11513a;
    }

    /* JADX INFO: renamed from: l */
    public static Modifier m16786l(Modifier modifier, C14947a0 c14947a0, EnumC16377d2 enumC16377d2, boolean z4, boolean z13, int i13) {
        boolean z14 = (i13 & 8) != 0 ? false : z13;
        return AbstractC16412k1.m46598a(modifier, c14947a0.f55769f, enumC16377d2, z4, null, c14947a0.f55776m.getValue() != null, null, new C15075m(c14947a0, null), z14, 32);
    }

    /* JADX INFO: renamed from: m */
    public static final Object m16787m(C14947a0 c14947a0, Object obj, float f13, InterfaceC30057d interfaceC30057d) {
        Object objM43067b = c14947a0.m43067b(obj, EnumC13840z0.f49374w, new C15085n(c14947a0, f13, null, 0), interfaceC30057d);
        return objM43067b == EnumC31071a.f128113w ? objM43067b : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static Object m16788n(C14947a0 c14947a0, Object obj, AbstractC32275i abstractC32275i) {
        return m16787m(c14947a0, obj, c14947a0.f55775l.m87022x(), abstractC32275i);
    }

    /* JADX INFO: renamed from: o */
    public static final Object m16789o(Task task, InterfaceC30057d interfaceC30057d) throws Exception {
        if (!task.isComplete()) {
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
            c3033m.m8774s();
            task.addOnCompleteListener(ExecutorC26571a.f105676w, new C13610f(c3033m, 3));
            Object objM8773r = c3033m.m8773r();
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            return objM8773r;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    /* JADX INFO: renamed from: p */
    public static final void m16790p(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    /* JADX INFO: renamed from: q */
    public static int m16791q(long j7, long j13) {
        if (j7 < j13) {
            return -1;
        }
        return j7 > j13 ? 1 : 0;
    }

    /* JADX INFO: renamed from: r */
    public static final int m16792r(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        InterfaceC32300b interfaceC32300bMo52689T = abstractC23811y.getAnnotations().mo52689T(AbstractC27741m.f111866q);
        if (interfaceC32300bMo52689T == null) {
            return 0;
        }
        AbstractC0715g abstractC0715g = (AbstractC0715g) AbstractC25247g0.m73986U(AbstractC27742n.f111880e, interfaceC32300bMo52689T.mo43952a());
        AbstractC22676k.m65748h(abstractC0715g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C0719k) abstractC0715g).f2696a).intValue();
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC23763c0 m16793t(AbstractC27736h abstractC27736h, InterfaceC32307i interfaceC32307i, AbstractC23811y abstractC23811y, List list, ArrayList arrayList, AbstractC23811y abstractC23811y2, boolean z4) {
        InterfaceC31117e interfaceC31117eM83823k;
        int i13 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC23811y != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC20301a.m56346n((AbstractC23811y) it.next()));
        }
        arrayList2.addAll(arrayList3);
        AbstractC34756j.m109751a(arrayList2, abstractC23811y != null ? AbstractC20301a.m56346n(abstractC23811y) : null);
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList2.add(AbstractC20301a.m56346n((AbstractC23811y) obj));
            i14 = i15;
        }
        arrayList2.add(AbstractC20301a.m56346n(abstractC23811y2));
        int size = list.size() + arrayList.size() + (abstractC23811y == null ? 0 : 1);
        if (z4) {
            interfaceC31117eM83823k = abstractC27736h.m83833w(size);
        } else {
            C35850h c35850h = AbstractC27742n.f111876a;
            interfaceC31117eM83823k = abstractC27736h.m83823k("Function" + size);
        }
        InterfaceC32307i c32308j = C32305g.f133684a;
        if (abstractC23811y != null) {
            C35847e c35847e = AbstractC27741m.f111865p;
            if (!interfaceC32307i.mo52688J(c35847e)) {
                ArrayList arrayListM74127e1 = AbstractC25265s.m74127e1(interfaceC32307i, new C32310l(abstractC27736h, c35847e, C25272z.f99163w));
                interfaceC32307i = arrayListM74127e1.isEmpty() ? c32308j : new C32308j(arrayListM74127e1, i13);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            C35847e c35847e2 = AbstractC27741m.f111866q;
            if (!interfaceC32307i.mo52688J(c35847e2)) {
                ArrayList arrayListM74127e2 = AbstractC25265s.m74127e1(interfaceC32307i, new C32310l(abstractC27736h, c35847e2, AbstractC25247g0.m73989X(new C23465k(AbstractC27742n.f111880e, new C0719k(size2)))));
                if (!arrayListM74127e2.isEmpty()) {
                    c32308j = new C32308j(arrayListM74127e2, i13);
                }
                interfaceC32307i = c32308j;
            }
        }
        return AbstractC23791o.m69889h(AbstractC20301a.m56329a0(interfaceC32307i), interfaceC31117eM83823k, arrayList2);
    }

    /* JADX INFO: renamed from: u */
    public static final C23798r0 m16794u(InterfaceC31117e from, InterfaceC31117e to3) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        from.mo60497j().size();
        to3.mo60497j().size();
        List listMo60497j = from.mo60497j();
        AbstractC22676k.m65749i(listMo60497j, "getDeclaredTypeParameters(...)");
        List list = listMo60497j;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC31165x0) it.next()).mo60496e());
        }
        List listMo60497j2 = to3.mo60497j();
        AbstractC22676k.m65749i(listMo60497j2, "getDeclaredTypeParameters(...)");
        List list2 = listMo60497j2;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            AbstractC23763c0 abstractC23763c0Mo60594i = ((InterfaceC31165x0) it3.next()).mo60594i();
            AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
            arrayList2.add(AbstractC20301a.m56346n(abstractC23763c0Mo60594i));
        }
        return new C23798r0(AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, arrayList2)));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m16795v(AbstractC20523b abstractC20523b, String str, InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        if (str.equals("type")) {
            EnumC20524c enumC20524c = (EnumC20524c) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20483i0(3));
            AbstractC29125c.m88510S(enumC20524c, "");
            abstractC20523b.f76900w = enumC20524c;
            return true;
        }
        if (!str.equals("timestamp")) {
            return false;
        }
        abstractC20523b.f76901x = interfaceC20392j3.nextLong();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static final C35850h m16796w(AbstractC23811y abstractC23811y) {
        String str;
        InterfaceC32300b interfaceC32300bMo52689T = abstractC23811y.getAnnotations().mo52689T(AbstractC27741m.f111867r);
        if (interfaceC32300bMo52689T != null) {
            Object objM74144q1 = AbstractC25265s.m74144q1(interfaceC32300bMo52689T.mo43952a().values());
            C0732x c0732x = objM74144q1 instanceof C0732x ? (C0732x) objM74144q1 : null;
            if (c0732x != null && (str = (String) c0732x.f2696a) != null) {
                if (!C35850h.m113815f(str)) {
                    str = null;
                }
                if (str != null) {
                    return C35850h.m113814e(str);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final void m16797x() {
        AbstractC22676k.m65750j(null, "<this>");
    }

    /* JADX INFO: renamed from: y */
    public static final Map m16798y(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            C23465k c23465k = value != null ? new C23465k(key, value) : null;
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return AbstractC25247g0.m74000i0(arrayList);
    }

    /* JADX INFO: renamed from: z */
    public static final AbstractC12939a0 m16799z(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        Dialog dialog;
        Window window;
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        for (AbstractComponentCallbacksC1320m0 parentFragment = abstractComponentCallbacksC1320m0; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).m5094y();
            }
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = parentFragment.getParentFragmentManager().f5697A;
            if (abstractComponentCallbacksC1320m1 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC1320m1).m5094y();
            }
        }
        View view = abstractComponentCallbacksC1320m0.getView();
        if (view != null) {
            return AbstractC12350b.m34598s(view);
        }
        View decorView = null;
        DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = abstractComponentCallbacksC1320m0 instanceof DialogInterfaceOnCancelListenerC1361y ? (DialogInterfaceOnCancelListenerC1361y) abstractComponentCallbacksC1320m0 : null;
        if (dialogInterfaceOnCancelListenerC1361y != null && (dialog = dialogInterfaceOnCancelListenerC1361y.getDialog()) != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            return AbstractC12350b.m34598s(decorView);
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(abstractComponentCallbacksC1320m0, "Fragment ", " does not have a NavController set"));
    }

    /* JADX INFO: renamed from: J */
    public abstract List m16800J();

    /* JADX INFO: renamed from: s */
    public abstract AbstractC18313j mo16801s();

    public String toString() {
        switch (this.f22104a) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if (equals(C21654g.f83168c)) {
                    return "BeginArray";
                }
                if (equals(C21657j.f83171c)) {
                    return "EndArray";
                }
                if (equals(C21655h.f83169c)) {
                    return "BeginObject";
                }
                if (equals(C21659l.f83173c)) {
                    return "EndObject";
                }
                if (this instanceof C21660m) {
                    return AbstractC25012a.m73377j(new StringBuilder("Name("), ((C21660m) this).f83174c, ')');
                }
                if (this instanceof C21663p) {
                    return AbstractC25012a.m73377j(new StringBuilder("String("), ((C21663p) this).f83177c, ')');
                }
                if (this instanceof C21662o) {
                    return AbstractC25012a.m73377j(new StringBuilder("Number("), ((C21662o) this).f83176c, ')');
                }
                if (this instanceof C21656i) {
                    return AbstractC2875y.m8305r(new StringBuilder("Bool("), ((C21656i) this).f83170c, ')');
                }
                if (equals(C21661n.f83175c)) {
                    return "Null";
                }
                if (equals(C21658k.f83172c)) {
                    return "EndDocument";
                }
                throw new NoWhenBranchMatchedException();
            default:
                return super.toString();
        }
    }
}
