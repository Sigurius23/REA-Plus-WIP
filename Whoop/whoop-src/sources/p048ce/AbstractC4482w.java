package p048ce;

import a00.C0076k;
import a30.C0294h;
import al.AbstractC0954a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.SizeF;
import android.view.View;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.datastore.preferences.protobuf.C1218h;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1581f0;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2161b;
import b01.C2185f;
import b10.C2222b;
import b20.C2327g;
import b30.C2509e2;
import b30.C2533h2;
import b30.C2548j1;
import b30.C2663y4;
import bc3.C3033m;
import bi.AbstractC3269g;
import c20.C3873a;
import c20.C3874b;
import c20.C3879g;
import c20.C3887o;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import ch.AbstractC4590k;
import ch.AbstractC4601v;
import ch.C4580a;
import ch.C4582c;
import ch.C4583d;
import ch.C4591l;
import ch.C4595p;
import coil.compose.AsyncImagePainter;
import coil.compose.ContentPainterElement;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.SimulationContext;
import com.google.gson.JsonPrimitive;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.TileCacheBudget;
import com.squareup.wire.AbstractC5583n;
import com.whoop.android.R;
import cv.C11142b;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import e20.AbstractC12595c;
import e20.C12593a;
import e20.C12594b;
import e93.AbstractC12889b;
import g00.AbstractC14936g;
import g00.C14931b;
import g00.C14932c;
import g00.C14934e;
import g40.C15449y1;
import ge3.AbstractC15751g;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.sentry.AbstractC20445o4;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.profiling.InterfaceC20464a;
import io.sentry.profiling.InterfaceC20465b;
import ja3.C21506d0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ki.C22493e;
import ki.C22494f;
import kr.C22786e;
import l83.C23454a0;
import l83.C23465k;
import lb3.AbstractC23811y;
import lb3.C23792o0;
import lb3.C23794p0;
import live.hms.video.utils.AndroidSDKConstants;
import m40.C25046w;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mh.C25542j;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import o93.AbstractC27736h;
import o93.C27733e;
import ob3.InterfaceC27794d;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27798h;
import ob3.InterfaceC27802l;
import ob3.InterfaceC27805o;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;
import ou1.C28376a;
import p000.AbstractC11266d;
import p000.C17820i;
import p002a0.C0023g0;
import p002a0.C0047q0;
import p004a2.C0160i;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p008a7.AbstractC0514e;
import p008a7.C0513d;
import p008a7.C0515f;
import p021av.AbstractC2092f;
import p023ay.C2149w;
import p025b1.C2217h;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p027b3.C2403l1;
import p027b3.C2408m1;
import p027b3.InterfaceC2398k1;
import p032bc.AbstractC2952h0;
import p035bp.AbstractC3511b;
import p048ce.AbstractC4482w;
import p079d2.AbstractC11480b;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15011f9;
import p163g1.C15069l3;
import p194hg.C17248i;
import p194hg.InterfaceC17243d;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p251jg.C21652e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p335n6.C26384a;
import p335n6.C26389f;
import p335n6.C26393j;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;
import p335n6.InterfaceC26401r;
import p341nh.C26711e;
import p341nh.InterfaceC26715i;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p355o2.C27438i;
import p355o2.C27442m;
import p355o2.C27448s;
import p355o2.C27449t;
import p355o2.C27454y;
import p370oj.C27961h;
import p370oj.C27966m;
import p390p1.AbstractC28622h2;
import p390p1.AbstractC28659r;
import p390p1.AbstractC28667t;
import p390p1.AbstractC28683x;
import p390p1.C28591a;
import p390p1.C28610e2;
import p390p1.C28614f2;
import p390p1.C28626i2;
import p390p1.C28635l;
import p390p1.C28643n;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p395p6.AbstractC28869c1;
import p395p6.C28861a;
import p395p6.C28896l1;
import p395p6.C28899m1;
import p395p6.C28914r1;
import p395p6.C28917s1;
import p395p6.C28919t0;
import p395p6.C28920t1;
import p395p6.C28927w;
import p395p6.C28931x0;
import p395p6.C28932x1;
import p395p6.C28936z0;
import p395p6.EnumC28881g1;
import p395p6.InterfaceC28923u1;
import p477s2.AbstractC32073e;
import p484s9.AbstractC32281f;
import p496t6.C33547a;
import p499t9.C33623c0;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p512u2.C34450b0;
import p545v6.C35712a;
import p545v6.C35713b;
import p545v6.C35714c;
import p545v6.C35720i;
import p545v6.C35721j;
import p545v6.C35722k;
import p545v6.C35723l;
import p545v6.C35724m;
import p545v6.C35725n;
import p545v6.C35733v;
import p550vd.AbstractC35903f;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39105k;
import p635y2.InterfaceC39127r0;
import p636y3.C39176h;
import p636y3.C39183o;
import p672z6.C40118a;
import p672z6.C40119b;
import p672z6.C40120c;
import p672z6.C40123f;
import p693zu.C41146a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import q20.C29810c;
import q83.InterfaceC30063j;
import q93.C30078b;
import r83.EnumC31071a;
import r93.EnumC31120f;
import r93.InterfaceC31107a1;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import s20.C32077a;
import s83.AbstractC32269c;
import s93.InterfaceC32307i;
import se.AbstractC32410a;
import se.AbstractC32416g;
import t20.C33333n;
import u00.C34378f;
import u93.AbstractC34690n;
import u93.AbstractC34692o;
import u93.C34709w0;
import ub3.C34754h;
import v03.C35515b;
import v03.C35516c;
import v03.C35518e;
import v03.C35519f;
import v03.C35520g;
import v03.InterfaceC35521h;
import va3.AbstractC35846d;
import va3.C35850h;
import vu.C36503d;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import y00.C38782a8;
import y00.C38851h7;
import y00.C38871j7;
import y00.C38881k7;
import y00.C38891l7;
import y00.C38900m7;
import y00.C38909n7;
import y00.C38945r7;
import y00.C38954s7;
import y00.C38981v7;
import y00.C38999x7;
import y00.EnumC38828f4;
import ya3.AbstractC39363f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ce.w */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4482w implements InterfaceC26698k {

    /* JADX INFO: renamed from: E */
    public static int f18018E = 5;

    /* JADX INFO: renamed from: w */
    public static boolean f18019w = true;

    /* JADX INFO: renamed from: x */
    public static Field f18020x;

    /* JADX INFO: renamed from: y */
    public static boolean f18021y;

    /* JADX INFO: renamed from: z */
    public static C27430e f18022z;

    /* JADX INFO: renamed from: A */
    public static boolean m13965A(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m13966B(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    /* JADX INFO: renamed from: C */
    public static void m13967C(Map extras) {
        AbstractC22676k.m65750j(extras, "extras");
    }

    /* JADX INFO: renamed from: D */
    public static final C4483x m13968D(C4472m input, C4484y c4484y) {
        AbstractC22676k.m65750j(input, "input");
        String str = input.f18003b;
        if (!AbstractC35846d.m113784i(AbstractC39414r.m125882a0(str))) {
            return null;
        }
        String strSubstring = str.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        if (AbstractC39414r.m125890i0(strSubstring) || c4484y == null || c4484y.f18025b.length() == 0) {
            return null;
        }
        return new C4483x(AbstractC39414r.m125869O0(str).toString());
    }

    /* JADX INFO: renamed from: E */
    public static final ArrayList m13969E(ArrayList arrayList, Collection oldValueParameters, InterfaceC31162w interfaceC31162w) {
        AbstractC22676k.m65750j(oldValueParameters, "oldValueParameters");
        arrayList.size();
        oldValueParameters.size();
        ArrayList<C23465k> arrayListM74107K1 = AbstractC25265s.m74107K1(arrayList, oldValueParameters);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74107K1, 10));
        for (C23465k c23465k : arrayListM74107K1) {
            AbstractC23811y abstractC23811y = (AbstractC23811y) c23465k.f92937w;
            Object obj = (InterfaceC31107a1) c23465k.f92938x;
            C34709w0 c34709w0 = (C34709w0) obj;
            int i13 = c34709w0.f146186G;
            InterfaceC32307i annotations = ((AbstractC0954a) obj).getAnnotations();
            C35850h name = ((AbstractC34690n) obj).getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            boolean zM109625J0 = c34709w0.m109625J0();
            boolean z4 = c34709w0.f146188I;
            boolean z13 = c34709w0.f146189J;
            AbstractC23811y abstractC23811yM83818f = c34709w0.f146190K != null ? AbstractC4393e.m13812j(interfaceC31162w).mo78661c().m83818f(abstractC23811y) : null;
            InterfaceC31155s0 source = ((AbstractC34692o) obj).getSource();
            AbstractC22676k.m65749i(source, "getSource(...)");
            arrayList2.add(new C34709w0(interfaceC31162w, null, i13, annotations, name, abstractC23811y, zM109625J0, z4, z13, abstractC23811yM83818f, source));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: F */
    public static C3873a m13970F(Context context, C2222b c2222b, boolean z4, InterfaceC30063j interfaceC30063j, InterfaceC30063j interfaceC30063j2, InterfaceC4339a interfaceC4339a, Set productUsage, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(productUsage, "productUsage");
        C22786e c22786e = new C22786e(24);
        C33647p c33647p = new C33647p(7);
        Boolean boolValueOf = Boolean.valueOf(z4);
        Boolean boolValueOf2 = Boolean.valueOf(z13);
        Boolean boolValueOf3 = Boolean.valueOf(z14);
        C35515b c35515b = new C35515b();
        int i13 = 0;
        InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C12594b(c35515b, i13));
        InterfaceC35521h interfaceC35521hM112678b2 = C35516c.m112678b(new C0294h(interfaceC35521hM112678b, 9));
        C0294h c0294h = new C0294h(c22786e, C35516c.m112678b(new C0294h(interfaceC35521hM112678b, 10)), 15);
        C35518e c35518eM112679a = C35518e.m112679a(context);
        InterfaceC35521h interfaceC35521hM112678b3 = C35516c.m112678b(new C3879g(c35518eM112679a, 1));
        InterfaceC35521h interfaceC35521hM112678b4 = C35516c.m112678b(new C12593a(c35515b, interfaceC35521hM112678b3, i13));
        C35518e c35518eM112679a2 = C35518e.m112679a(boolValueOf);
        InterfaceC35521h interfaceC35521hM112678b5 = C35516c.m112678b(new C12593a(c33647p, c35518eM112679a2, 5));
        C35518e c35518eM112679a3 = C35518e.m112679a(interfaceC30063j);
        C2327g c2327g = new C2327g(interfaceC35521hM112678b5, c35518eM112679a3, 11);
        C35518e c35518eM112679a4 = C35518e.m112679a(c2222b);
        C35518e c35518eM112679a5 = C35518e.m112679a(interfaceC30063j2);
        C35518e c35518eM112679a6 = C35518e.m112679a(interfaceC4339a);
        InterfaceC35521h interfaceC35521hM112678b6 = C35516c.m112678b(new C3887o(interfaceC35521hM112678b4, c2327g, c35518eM112679a4, c35518eM112679a2, c35518eM112679a5, c35518eM112679a6, C35518e.m112679a(boolValueOf2), interfaceC35521hM112678b3, new C3879g(c35518eM112679a3, i13)));
        InterfaceC35521h interfaceC35521hM112678b7 = C35516c.m112678b(new C0076k(interfaceC35521hM112678b6, interfaceC35521hM112678b2, c35518eM112679a));
        C35518e c35518eM112679a7 = C35518e.m112679a(productUsage);
        C2149w c2149w = new C2149w(c35518eM112679a6, c35518eM112679a7, c35518eM112679a5, i13);
        InterfaceC35521h interfaceC35521hM112678b8 = C35516c.m112678b(new C3874b(C35516c.m112678b(AbstractC12595c.f42982a), c35518eM112679a2, c35518eM112679a6, c35518eM112679a7));
        int i14 = C35520g.f151139x;
        C35519f c35519f = new C35519f();
        c35519f.m112680a(C38782a8.class, c0294h);
        c35519f.m112680a(C38945r7.class, interfaceC35521hM112678b6);
        c35519f.m112680a(C38851h7.class, interfaceC35521hM112678b6);
        c35519f.m112680a(C38900m7.class, interfaceC35521hM112678b7);
        c35519f.m112680a(C38909n7.class, interfaceC35521hM112678b7);
        c35519f.m112680a(C38891l7.class, interfaceC35521hM112678b7);
        c35519f.m112680a(C38881k7.class, interfaceC35521hM112678b7);
        c35519f.m112680a(C38871j7.class, interfaceC35521hM112678b6);
        c35519f.m112680a(C38999x7.class, interfaceC35521hM112678b6);
        c35519f.m112680a(C38954s7.class, c2149w);
        c35519f.m112680a(C38981v7.class, interfaceC35521hM112678b8);
        C35515b.m112676a(c35515b, C35516c.m112678b(new C3874b(0, c35518eM112679a, interfaceC35521hM112678b2, new C35520g(c35519f.f151138a), C35518e.m112679a(boolValueOf3))));
        return (C3873a) c35515b.get();
    }

    /* JADX INFO: renamed from: G */
    public static void m13971G(Serializable serializable) {
        if (f18018E > 0) {
            Log.e("RootBeer", m13982R() + String.valueOf(serializable));
            Log.e("QLog", m13982R() + String.valueOf(serializable));
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m13972H(C1218h c1218h) {
        StringBuilder sb4 = new StringBuilder(c1218h.size());
        for (int i13 = 0; i13 < c1218h.size(); i13++) {
            byte bMo3797a = c1218h.mo3797a(i13);
            if (bMo3797a == 34) {
                sb4.append("\\\"");
            } else if (bMo3797a == 39) {
                sb4.append("\\'");
            } else if (bMo3797a != 92) {
                switch (bMo3797a) {
                    case 7:
                        sb4.append("\\a");
                        break;
                    case 8:
                        sb4.append("\\b");
                        break;
                    case 9:
                        sb4.append("\\t");
                        break;
                    case 10:
                        sb4.append("\\n");
                        break;
                    case 11:
                        sb4.append("\\v");
                        break;
                    case 12:
                        sb4.append("\\f");
                        break;
                    case 13:
                        sb4.append("\\r");
                        break;
                    default:
                        if (bMo3797a < 32 || bMo3797a > 126) {
                            sb4.append('\\');
                            sb4.append((char) (((bMo3797a >>> 6) & 3) + 48));
                            sb4.append((char) (((bMo3797a >>> 3) & 7) + 48));
                            sb4.append((char) ((bMo3797a & 7) + 48));
                        } else {
                            sb4.append((char) bMo3797a);
                        }
                        break;
                }
            } else {
                sb4.append("\\\\");
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: I */
    public static final Integer m13973I(C28614f2 c28614f2, AbstractC28667t abstractC28667t) {
        C28610e2 c28610e2M87016d = c28614f2.m87016d();
        try {
            return m13974J(c28610e2M87016d, abstractC28667t, 0, c28610e2M87016d.f115740c);
        } finally {
            c28610e2M87016d.m86991c();
        }
    }

    /* JADX INFO: renamed from: J */
    public static final Integer m13974J(C28610e2 c28610e2, AbstractC28667t abstractC28667t, int i13, int i14) {
        Integer numM13974J;
        int[] iArr = c28610e2.f115739b;
        while (true) {
            if (i13 >= i14) {
                return null;
            }
            int i15 = iArr[(i13 * 5) + 3] + i13;
            if (c28610e2.m86998j(i13) && c28610e2.m86997i(i13) == 206 && AbstractC22676k.m65745e(c28610e2.m87004p(iArr, i13), AbstractC28659r.f115943e)) {
                Object objM86996h = c28610e2.m86996h(i13, 0);
                C28643n c28643n = objM86996h instanceof C28643n ? (C28643n) objM86996h : null;
                if (c28643n != null && c28643n.f115849w.equals(abstractC28667t)) {
                    return Integer.valueOf(i13);
                }
            }
            if (c28610e2.m86992d(i13) && (numM13974J = m13974J(c28610e2, abstractC28667t, i13 + 1, i15)) != null) {
                return Integer.valueOf(numM13974J.intValue());
            }
            i13 = i15;
        }
    }

    /* JADX INFO: renamed from: K */
    public static C14931b m13975K(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-443512897);
        C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
        c28655q.m87173q(false);
        return c14931b;
    }

    /* JADX INFO: renamed from: L */
    public static final C27430e m13976L() {
        C27430e c27430e = f18022z;
        if (c27430e != null) {
            return c27430e;
        }
        C27428d c27428d = new C27428d("Filled.FlashOn", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i13 = AbstractC27433f0.f110561a;
        C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C27442m(7.0f, 2.0f));
        arrayList.add(new C27454y(11.0f));
        arrayList.add(new C27448s(3.0f));
        arrayList.add(new C27454y(9.0f));
        arrayList.add(new C27449t(7.0f, -12.0f));
        arrayList.add(new C27448s(-4.0f));
        arrayList.add(new C27449t(4.0f, -8.0f));
        arrayList.add(C27438i.f110602c);
        C27428d.m82858a(c27428d, arrayList, c17875c1);
        C27430e c27430eM82859b = c27428d.m82859b();
        f18022z = c27430eM82859b;
        return c27430eM82859b;
    }

    /* JADX INFO: renamed from: M */
    public static C27733e m13977M() {
        return (C27733e) C27733e.f111784f.getValue();
    }

    /* JADX INFO: renamed from: N */
    public static C30078b m13978N() {
        return C30078b.f122755f;
    }

    /* JADX INFO: renamed from: O */
    public static final C21506d0 m13979O(InterfaceC31117e interfaceC31117e) {
        InterfaceC31117e interfaceC31117e2;
        AbstractC22676k.m65750j(interfaceC31117e, "<this>");
        int i13 = AbstractC4393e.f17737a;
        Iterator it = interfaceC31117e.mo60594i().mo69844i0().getSupertypes().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC31117e2 = null;
                break;
            }
            AbstractC23811y abstractC23811y = (AbstractC23811y) it.next();
            if (!AbstractC27736h.m83813y(abstractC23811y)) {
                InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
                int i14 = AbstractC39363f.f169413a;
                if (AbstractC39363f.m125530l(interfaceC31126hMo1784d, EnumC31120f.f128328w) || AbstractC39363f.m125530l(interfaceC31126hMo1784d, EnumC31120f.f128330y)) {
                    AbstractC22676k.m65748h(interfaceC31126hMo1784d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC31117e2 = (InterfaceC31117e) interfaceC31126hMo1784d;
                    break;
                }
            }
        }
        if (interfaceC31117e2 == null) {
            return null;
        }
        InterfaceC22712o interfaceC22712oMo60494V = interfaceC31117e2.mo60494V();
        C21506d0 c21506d0 = interfaceC22712oMo60494V instanceof C21506d0 ? (C21506d0) interfaceC22712oMo60494V : null;
        return c21506d0 == null ? m13979O(interfaceC31117e2) : c21506d0;
    }

    /* JADX INFO: renamed from: P */
    public static final String m13980P(C17248i c17248i) {
        Object next;
        AbstractC22676k.m65750j(c17248i, "<this>");
        Iterator it = c17248i.f66268c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC17243d) next).getClass() != C21652e.class);
        InterfaceC17243d interfaceC17243d = (InterfaceC17243d) next;
        if (interfaceC17243d != null) {
            return ((C21652e) interfaceC17243d).f83166a;
        }
        throw new IllegalArgumentException(("Expected to find trait " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21652e.class) + " in " + c17248i + " but was not present.").toString());
    }

    /* JADX INFO: renamed from: Q */
    public static C14932c m13981Q(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1165442303);
        C14932c c14932c = (C14932c) c28655q.m87161k(AbstractC14936g.f55707d);
        c28655q.m87173q(false);
        return c14932c;
    }

    /* JADX INFO: renamed from: R */
    public static String m13982R() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    /* JADX INFO: renamed from: T */
    public static C14934e m13983T(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1418551394);
        C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
        c28655q.m87173q(false);
        return c14934e;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m13984U(C23794p0 c23794p0, InterfaceC27798h type, AbstractC32073e abstractC32073e) {
        C23792o0 c23792o0 = C23792o0.f94173c;
        AbstractC22676k.m65750j(c23794p0, "<this>");
        AbstractC22676k.m65750j(type, "type");
        InterfaceC27805o interfaceC27805o = c23794p0.f94180c;
        if ((interfaceC27805o.mo74565j(type) && !interfaceC27805o.mo74542R(type)) || interfaceC27805o.mo74571m(type)) {
            return true;
        }
        c23794p0.m69905c();
        ArrayDeque arrayDeque = c23794p0.f94184g;
        AbstractC22676k.m65747g(arrayDeque);
        C34754h c34754h = c23794p0.f94185h;
        AbstractC22676k.m65747g(c34754h);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            InterfaceC27798h interfaceC27798h = (InterfaceC27798h) arrayDeque.pop();
            AbstractC22676k.m65747g(interfaceC27798h);
            if (c34754h.add(interfaceC27798h)) {
                AbstractC32073e abstractC32073e2 = interfaceC27805o.mo74542R(interfaceC27798h) ? c23792o0 : abstractC32073e;
                if (abstractC32073e2.equals(c23792o0)) {
                    abstractC32073e2 = null;
                }
                if (abstractC32073e2 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC27805o.mo74582s(interfaceC27805o.mo74544T(interfaceC27798h)).iterator();
                    while (it.hasNext()) {
                        InterfaceC27798h interfaceC27798hMo69898i0 = abstractC32073e2.mo69898i0(c23794p0, (InterfaceC27797g) it.next());
                        if ((interfaceC27805o.mo74565j(interfaceC27798hMo69898i0) && !interfaceC27805o.mo74542R(interfaceC27798hMo69898i0)) || interfaceC27805o.mo74571m(interfaceC27798hMo69898i0)) {
                            c23794p0.m69903a();
                            return true;
                        }
                        arrayDeque.add(interfaceC27798hMo69898i0);
                    }
                }
            }
        }
        c23794p0.m69903a();
        return false;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m13985V(C23794p0 c23794p0, InterfaceC27798h interfaceC27798h, InterfaceC27802l interfaceC27802l) {
        InterfaceC27805o interfaceC27805o = c23794p0.f94180c;
        if (interfaceC27805o.mo74561h(interfaceC27798h)) {
            return true;
        }
        if (interfaceC27805o.mo74542R(interfaceC27798h)) {
            return false;
        }
        if (c23794p0.f94179b) {
            interfaceC27805o.mo74551a0(interfaceC27798h);
        }
        return interfaceC27805o.mo74533H(interfaceC27805o.mo74544T(interfaceC27798h), interfaceC27802l);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m13986W(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: X */
    public static boolean m13987X(C23794p0 c23794p0, InterfaceC27798h subType, InterfaceC27798h superType) {
        AbstractC22676k.m65750j(subType, "subType");
        AbstractC22676k.m65750j(superType, "superType");
        C23792o0 c23792o0 = C23792o0.f94172b;
        InterfaceC27805o interfaceC27805o = c23794p0.f94180c;
        if (!interfaceC27805o.mo74542R(superType) && !interfaceC27805o.mo74575o(subType) && !interfaceC27805o.mo74571m(subType) && ((!(subType instanceof InterfaceC27794d) || !interfaceC27805o.mo74554d0((InterfaceC27794d) subType)) && !m13984U(c23794p0, subType, c23792o0))) {
            if (interfaceC27805o.mo74571m(superType) || m13984U(c23794p0, superType, C23792o0.f94174d) || interfaceC27805o.mo74565j(subType)) {
                return false;
            }
            InterfaceC27802l end = interfaceC27805o.mo74544T(superType);
            C23792o0 c23792o1 = C23792o0.f94173c;
            AbstractC22676k.m65750j(end, "end");
            if (!m13985V(c23794p0, subType, end)) {
                c23794p0.m69905c();
                ArrayDeque arrayDeque = c23794p0.f94184g;
                AbstractC22676k.m65747g(arrayDeque);
                C34754h c34754h = c23794p0.f94185h;
                AbstractC22676k.m65747g(c34754h);
                arrayDeque.push(subType);
                while (!arrayDeque.isEmpty()) {
                    InterfaceC27798h interfaceC27798h = (InterfaceC27798h) arrayDeque.pop();
                    AbstractC22676k.m65747g(interfaceC27798h);
                    if (c34754h.add(interfaceC27798h)) {
                        C23792o0 c23792o2 = interfaceC27805o.mo74542R(interfaceC27798h) ? c23792o1 : c23792o0;
                        if (c23792o2.equals(c23792o1)) {
                            c23792o2 = null;
                        }
                        if (c23792o2 == null) {
                            continue;
                        } else {
                            Iterator it = interfaceC27805o.mo74582s(interfaceC27805o.mo74544T(interfaceC27798h)).iterator();
                            while (it.hasNext()) {
                                InterfaceC27798h interfaceC27798hMo69898i0 = c23792o2.mo69898i0(c23794p0, (InterfaceC27797g) it.next());
                                if (m13985V(c23794p0, interfaceC27798hMo69898i0, end)) {
                                    c23794p0.m69903a();
                                    return true;
                                }
                                arrayDeque.add(interfaceC27798hMo69898i0);
                            }
                        }
                    }
                }
                c23794p0.m69903a();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public static void m13988Y(InterfaceC20602v0 interfaceC20602v0) {
        try {
            Iterator it = ServiceLoader.load(InterfaceC20464a.class).iterator();
            if ((it.hasNext() ? it.next() : null) != null) {
                throw new ClassCastException();
            }
            interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
        } catch (Throwable th3) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th3);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m13989Z() {
        InterfaceC20602v0 logger = AbstractC20445o4.f76534c.f76134l.getLogger();
        try {
            Iterator it = ServiceLoader.load(InterfaceC20465b.class).iterator();
            if ((it.hasNext() ? it.next() : null) != null) {
                throw new ClassCastException();
            }
            logger.mo16066m(EnumC20436n5.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
        } catch (Throwable th3) {
            logger.mo16060j(EnumC20436n5.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th3);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final C4484y m13990a0(C4472m input, C4485z c4485z) {
        AbstractC22676k.m65750j(input, "input");
        String str = input.f18003b;
        if (AbstractC35846d.m113784i(AbstractC39414r.m125882a0(str)) || !AbstractC3269g.m9481J(str) || c4485z == null) {
            return null;
        }
        C23465k c23465kM10368H = AbstractC3511b.m10368H(str);
        String str2 = (String) c23465kM10368H.f92937w;
        String str3 = (String) c23465kM10368H.f92938x;
        AbstractC22676k.m65750j(str3, "<this>");
        return new C4484y(str2, AbstractC3511b.m10369I(AbstractC3511b.m10369I(str3, " #"), " ;"));
    }

    /* JADX INFO: renamed from: b0 */
    public static final Activity m13991b0(InterfaceC4339a errorMessage, C28655q c28655q) {
        Activity activity;
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        c28655q.m87150e0(-374531514);
        Context baseContext = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        c28655q.m87150e0(2117163906);
        boolean zM87153g = c28655q.m87153g(baseContext);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            objM87133R = activity;
            if (objM87133R == null) {
                throw new IllegalArgumentException(errorMessage.invoke().toString());
            }
            c28655q.m87172p0(objM87133R);
        }
        Activity activity2 = (Activity) objM87133R;
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        return activity2;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Object m13992c0(Set set, Enum r10, Enum r14, Enum r15, boolean z4) {
        Enum r16;
        if (!z4) {
            if (r15 != null) {
                set = AbstractC25265s.m74103I1(AbstractC12350b.m34555D(r15, set));
            }
            return AbstractC25265s.m74144q1(set);
        }
        if (set.contains(r10)) {
            r16 = r10;
        } else {
            r16 = set.contains(r14) ? r14 : null;
        }
        if (AbstractC22676k.m65745e(r16, r10) && AbstractC22676k.m65745e(r15, r14)) {
            return null;
        }
        return r15 == null ? r16 : r15;
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m13993d0(RemoteViews remoteViews, C28932x1 c28932x1, C28931x0 c28931x0, List list) {
        int i13 = 0;
        for (Object obj : AbstractC25265s.m74156w1(list, 10)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            m13999k0(remoteViews, c28932x1.m87841b(c28931x0, i13), (InterfaceC26392i) obj);
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final C4459a0 m13994g0(C4472m input, C4484y c4484y) {
        CharSequence charSequenceSubSequence;
        AbstractC22676k.m65750j(input, "input");
        String str = input.f18003b;
        if (!AbstractC35846d.m113784i(AbstractC39414r.m125882a0(str))) {
            return null;
        }
        int length = str.length();
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!AbstractC35846d.m113784i(str.charAt(i13))) {
                charSequenceSubSequence = str.subSequence(i13, str.length());
                break;
            }
            i13++;
        }
        if (!AbstractC3269g.m9481J(charSequenceSubSequence.toString()) || c4484y == null || c4484y.f18025b.length() > 0) {
            return null;
        }
        C23465k c23465kM10368H = AbstractC3511b.m10368H(str);
        return new C4459a0((String) c23465kM10368H.f92937w, (String) c23465kM10368H.f92938x);
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m13995h0(C35714c c35714c) {
        int i13 = c35714c.f151949a;
        int i14 = 8388611;
        if (i13 != 0) {
            if (i13 == 2) {
                i14 = 8388613;
            } else if (i13 == 1) {
                i14 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) C35712a.m113184b(i13)));
            }
        }
        int i15 = c35714c.f151950b;
        int i16 = 48;
        if (i15 != 0) {
            if (i15 == 2) {
                i16 = 80;
            } else if (i15 == 1) {
                i16 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) C35713b.m113186b(i15)));
            }
        }
        return i14 | i16;
    }

    /* JADX INFO: renamed from: i0 */
    public static String m13996i0(Map map) {
        return AbstractC25265s.m74110N0(map.entrySet(), " ", null, null, new C15449y1(22), 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a2.a, a2.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: j0 */
    public static final ArrayList m13997j0(C28610e2 c28610e2, int i13, Integer num) {
        ?? c0160i = new C0160i(c28610e2);
        i13 = c28610e2.m87005q(i13);
        C28591a c28591aM86989a = c28610e2.m86989a(i13);
        while (i13 >= 0) {
            c0160i.m371E(c28610e2.f115738a.m87019j(i13), num);
            if (i13 >= 0) {
                C28591a c28591a = c28591aM86989a;
                c28591aM86989a = c28610e2.m86989a(i13);
                i13 = c28610e2.m87005q(i13);
                num = c28591a;
            } else {
                num = c28591aM86989a;
            }
        }
        return (ArrayList) c0160i.f475x;
    }

    /* JADX INFO: renamed from: k */
    public static final void m13998k(C4591l c4591l, String str, Modifier modifier, Function1 function1, Function1 function2, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-421592773);
        if ((i13 & 14) == 0) {
            i15 = (c28655q.m87153g(c4591l) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            function3 = function1;
            i15 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            function3 = function1;
        }
        if ((i13 & 57344) == 0) {
            i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & 458752) == 0) {
            i15 |= c28655q.m87153g(interfaceC2302h) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 3670016) == 0) {
            i15 |= c28655q.m87153g(interfaceC39105k) ? 1048576 : 524288;
        }
        if ((i13 & 29360128) == 0) {
            i15 |= c28655q.m87147d(f13) ? 8388608 : 4194304;
        }
        if ((234881024 & i13) == 0) {
            i15 |= c28655q.m87153g(null) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((1879048192 & i13) == 0) {
            i15 |= c28655q.m87149e(1) ? 536870912 : 268435456;
        }
        if ((i14 & 14) == 0) {
            i16 = i14 | (c28655q.m87155h(true) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((1533916891 & i15) == 306783378 && (i16 & 11) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C25542j c25542jM14265c = AbstractC4601v.m14265c(c4591l.f18474a, interfaceC39105k, c28655q);
            int i17 = i15 >> 3;
            int i18 = (i17 & 896) | 72 | (i17 & 7168);
            int i19 = i15 >> 6;
            int i24 = i19 & 57344;
            AsyncImagePainter asyncImagePainterM14258a = AbstractC4590k.m14258a(c25542jM14265c, c4591l.f18476c, function3, function2, interfaceC39105k, c4591l.f18475b, c28655q, i18 | i24 | ((i15 >> 12) & 458752), 0);
            InterfaceC26715i interfaceC26715i = c25542jM14265c.f100132y;
            m14000l(interfaceC26715i instanceof C4595p ? modifier.mo3471e((Modifier) interfaceC26715i) : modifier, asyncImagePainterM14258a, str, interfaceC2302h, interfaceC39105k, f13, c28655q, ((i15 << 3) & 896) | (i19 & 7168) | i24 | (i19 & 458752) | (i19 & 3670016) | ((i16 << 21) & 29360128));
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4580a(c4591l, str, modifier, function1, function2, interfaceC2302h, interfaceC39105k, f13, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0363  */
    /* JADX INFO: renamed from: k0 */
    public static final void m13999k0(RemoteViews remoteViews, C28932x1 c28932x1, InterfaceC26392i interfaceC26392i) {
        EnumC28881g1 enumC28881g1;
        boolean z4;
        C28932x1 c28932x2;
        Layout.Alignment alignment;
        if (interfaceC26392i instanceof C35721j) {
            C35721j c35721j = (C35721j) interfaceC26392i;
            ArrayList<InterfaceC26392i> arrayList = c35721j.f104849b;
            EnumC28881g1 enumC28881g2 = EnumC28881g1.f116908y;
            int size = arrayList.size();
            InterfaceC26398o interfaceC26398o = c35721j.f151962c;
            C35714c c35714c = c35721j.f151963d;
            C28931x0 c28931x0M87788b = AbstractC28869c1.m87788b(remoteViews, c28932x1, enumC28881g2, size, interfaceC26398o, new C35712a(c35714c.f151949a), new C35713b(c35714c.f151950b));
            AbstractC35903f.m114010e(c28932x1, remoteViews, c35721j.f151962c, c28931x0M87788b);
            for (InterfaceC26392i interfaceC26392i2 : arrayList) {
                interfaceC26392i2.mo78104b(interfaceC26392i2.mo78105c().mo78107d(new C28861a(c35721j.f151963d)));
            }
            m13993d0(remoteViews, c28932x1, c28931x0M87788b, arrayList);
            return;
        }
        if (interfaceC26392i instanceof C35723l) {
            C35723l c35723l = (C35723l) interfaceC26392i;
            EnumC28881g1 enumC28881g3 = (Build.VERSION.SDK_INT < 31 || !AbstractC3511b.m10361A(c35723l.f151967c)) ? EnumC28881g1.f116906w : EnumC28881g1.f116903b0;
            ArrayList arrayList2 = c35723l.f104849b;
            C28931x0 c28931x0M87788b2 = AbstractC28869c1.m87788b(remoteViews, c28932x1, enumC28881g3, arrayList2.size(), c35723l.f151967c, null, new C35713b(c35723l.f151969e));
            remoteViews.setInt(c28931x0M87788b2.f117046a, "setGravity", m13995h0(new C35714c(c35723l.f151968d, c35723l.f151969e)));
            AbstractC35903f.m114010e(C28932x1.m87840a(c28932x1, 0, null, null, null, 0L, null, 61439), remoteViews, c35723l.f151967c, c28931x0M87788b2);
            m13993d0(remoteViews, c28932x1, c28931x0M87788b2, arrayList2);
            if (AbstractC3511b.m10361A(c35723l.f151967c)) {
                m14013w(arrayList2);
                return;
            }
            return;
        }
        if (interfaceC26392i instanceof C35722k) {
            C35722k c35722k = (C35722k) interfaceC26392i;
            EnumC28881g1 enumC28881g4 = (Build.VERSION.SDK_INT < 31 || !AbstractC3511b.m10361A(c35722k.f151964c)) ? EnumC28881g1.f116907x : EnumC28881g1.f116904c0;
            ArrayList arrayList3 = c35722k.f104849b;
            C28931x0 c28931x0M87788b3 = AbstractC28869c1.m87788b(remoteViews, c28932x1, enumC28881g4, arrayList3.size(), c35722k.f151964c, new C35712a(c35722k.f151966e), null);
            remoteViews.setInt(c28931x0M87788b3.f117046a, "setGravity", m13995h0(new C35714c(c35722k.f151966e, c35722k.f151965d)));
            AbstractC35903f.m114010e(C28932x1.m87840a(c28932x1, 0, null, null, null, 0L, null, 61439), remoteViews, c35722k.f151964c, c28931x0M87788b3);
            m13993d0(remoteViews, c28932x1, c28931x0M87788b3, arrayList3);
            if (AbstractC3511b.m10361A(c35722k.f151964c)) {
                m14013w(arrayList3);
                return;
            }
            return;
        }
        if (!(interfaceC26392i instanceof C40118a)) {
            if (interfaceC26392i instanceof C35724m) {
                C35724m c35724m = (C35724m) interfaceC26392i;
                AbstractC35903f.m114010e(c28932x1, remoteViews, c35724m.f151970a, AbstractC28869c1.m87789c(remoteViews, c28932x1, EnumC28881g1.f116884I, c35724m.f151970a));
                return;
            }
            if (!(interfaceC26392i instanceof C26393j)) {
                if (!(interfaceC26392i instanceof C28927w)) {
                    throw new IllegalArgumentException("Unknown element type " + interfaceC26392i.getClass().getCanonicalName());
                }
                ArrayList arrayList4 = ((C28927w) interfaceC26392i).f104849b;
                if (arrayList4.size() > 1) {
                    throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList4.size() + ". The normalization of the composition tree failed.").toString());
                }
                InterfaceC26392i interfaceC26392i3 = (InterfaceC26392i) AbstractC25265s.m74100H0(arrayList4);
                if (interfaceC26392i3 != null) {
                    m13999k0(remoteViews, c28932x1, interfaceC26392i3);
                    return;
                }
                return;
            }
            C26393j c26393j = (C26393j) interfaceC26392i;
            boolean zM83564O = C27648a.m83564O(c26393j);
            int i13 = c26393j.f104847d;
            if (i13 == 0) {
                enumC28881g1 = zM83564O ? EnumC28881g1.f116898W : EnumC28881g1.f116895T;
            } else if (i13 == 1) {
                enumC28881g1 = zM83564O ? EnumC28881g1.f116899X : EnumC28881g1.f116896U;
            } else if (i13 == 2) {
                enumC28881g1 = zM83564O ? EnumC28881g1.f116900Y : EnumC28881g1.f116897V;
            } else {
                Log.w("GlanceAppWidget", "Unsupported ContentScale user: " + ((Object) C35720i.m113188a(c26393j.f104847d)));
                enumC28881g1 = EnumC28881g1.f116896U;
            }
            C28931x0 c28931x0M87789c = AbstractC28869c1.m87789c(remoteViews, c28932x1, enumC28881g1, c26393j.f104844a);
            int i14 = c28931x0M87789c.f117046a;
            InterfaceC26401r interfaceC26401r = c26393j.f104845b;
            if (interfaceC26401r instanceof C26384a) {
                remoteViews.setImageViewResource(i14, ((C26384a) interfaceC26401r).f104834a);
            } else {
                if (!(interfaceC26401r instanceof C26389f)) {
                    throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
                }
                remoteViews.setImageViewBitmap(i14, ((C26389f) interfaceC26401r).f104837a);
            }
            Float f13 = c26393j.f104846c;
            if (f13 != null) {
                z4 = false;
                remoteViews.setInt(i14, "setImageAlpha", AbstractC12889b.m36284n((int) Math.rint(AbstractC12889b.m36283m(f13.floatValue(), 0.0f, 1.0f) * 255), 0, 255));
            } else {
                z4 = false;
            }
            AbstractC35903f.m114010e(c28932x1, remoteViews, c26393j.f104844a, c28931x0M87789c);
            if (c26393j.f104847d == 1) {
                C35733v c35733v = (C35733v) c26393j.f104844a.mo78097a(null, C33547a.f140014x);
                AbstractC0514e abstractC0514e = c35733v != null ? c35733v.f151984a : null;
                C0513d c0513d = C0513d.f1722a;
                if (AbstractC22676k.m65745e(abstractC0514e, c0513d)) {
                    z4 = true;
                } else {
                    C35725n c35725n = (C35725n) c26393j.f104844a.mo78097a(null, C33547a.f140015y);
                    if (AbstractC22676k.m65745e(c35725n != null ? c35725n.f151971a : null, c0513d)) {
                        z4 = true;
                    }
                }
            }
            remoteViews.setBoolean(i14, "setAdjustViewBounds", z4);
            return;
        }
        C40118a c40118a = (C40118a) interfaceC26392i;
        C28931x0 c28931x0M87789c2 = AbstractC28869c1.m87789c(remoteViews, c28932x1, EnumC28881g1.f116909z, c40118a.f173165d);
        int i15 = c28931x0M87789c2.f117046a;
        CharSequence charSequence = c40118a.f173162a;
        C40123f c40123f = c40118a.f173163b;
        int i16 = c40118a.f173164c;
        Context context = c28932x1.f117049a;
        if (i16 != Integer.MAX_VALUE) {
            remoteViews.setInt(i15, "setMaxLines", i16);
        }
        if (c40123f == null) {
            remoteViews.setTextViewText(i15, charSequence);
            c28932x2 = c28932x1;
        } else {
            SpannableString spannableString = new SpannableString(charSequence);
            int length = spannableString.length();
            C39183o c39183o = c40123f.f173171b;
            if (c39183o != null) {
                long j7 = c39183o.f168429a;
                if ((j7 & 1095216660480L) != 4294967296L) {
                    throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
                }
                remoteViews.setTextViewTextSize(i15, 2, C39183o.m124805c(j7));
            }
            ArrayList arrayList5 = new ArrayList();
            C40119b c40119b = c40123f.f173172c;
            if (c40119b != null) {
                int i17 = c40119b.f173166a;
                arrayList5.add(new TextAppearanceSpan(context, i17 == 700 ? R.style.Glance_AppWidget_TextAppearance_Bold : i17 == 500 ? R.style.Glance_AppWidget_TextAppearance_Medium : R.style.Glance_AppWidget_TextAppearance_Normal));
            }
            C40120c c40120c = c40123f.f173173d;
            if (c40120c != null) {
                int i18 = c40120c.f173167a;
                int i19 = Build.VERSION.SDK_INT;
                int i24 = 5;
                if (i19 >= 31) {
                    if (i18 == 3) {
                        i24 = 1;
                    } else if (i18 == 1) {
                        i24 = 3;
                    } else if (i18 != 2) {
                        if (i18 == 4) {
                            i24 = 8388611;
                        } else if (i18 == 5) {
                            i24 = 8388613;
                        } else {
                            Log.w("GlanceAppWidget", "Unknown TextAlign: " + ((Object) C40120c.m128661a(i18)));
                            i24 = 8388611;
                        }
                    }
                    int i25 = i24 | 48;
                    if (i19 < 31) {
                        throw new IllegalArgumentException("setGravity is only available on SDK 31 and higher");
                    }
                    remoteViews.setInt(i15, "setGravity", i25);
                    c28932x2 = c28932x1;
                } else {
                    c28932x2 = c28932x1;
                    boolean z13 = c28932x2.f117051c;
                    if (i18 == 3) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (i18 == 1) {
                        alignment = z13 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else if (i18 == 2) {
                        alignment = z13 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    } else if (i18 == 4) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else if (i18 == 5) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    } else {
                        Log.w("GlanceAppWidget", "Unknown TextAlign: " + ((Object) C40120c.m128661a(i18)));
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                    arrayList5.add(new AlignmentSpan.Standard(alignment));
                }
            } else {
                c28932x2 = c28932x1;
            }
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
            }
            remoteViews.setTextViewText(i15, spannableString);
            C0515f c0515f = c40123f.f173170a;
            if (c0515f != null) {
                remoteViews.setTextColor(i15, AbstractC17918w0.m51506H(c0515f.f1723a));
            } else {
                Log.w("GlanceAppWidget", "Unexpected text color: " + c0515f);
            }
        }
        AbstractC35903f.m114010e(c28932x2, remoteViews, c40118a.f173165d, c28931x0M87789c2);
    }

    /* JADX INFO: renamed from: l */
    public static final void m14000l(final Modifier modifier, final AsyncImagePainter asyncImagePainter, final String str, final InterfaceC2302h interfaceC2302h, final InterfaceC39105k interfaceC39105k, final float f13, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(777774312);
        if ((i13 & 14) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= c28655q.m87153g(asyncImagePainter) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= c28655q.m87153g(interfaceC2302h) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((57344 & i13) == 0) {
            i14 |= c28655q.m87153g(interfaceC39105k) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((458752 & i13) == 0) {
            i14 |= c28655q.m87147d(f13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((3670016 & i13) == 0) {
            i14 |= c28655q.m87153g(null) ? 1048576 : 524288;
        }
        if ((29360128 & i13) == 0) {
            i14 |= c28655q.m87155h(true) ? 8388608 : 4194304;
        }
        if ((i14 & 23967451) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C26711e c26711e = AbstractC4601v.f18506b;
            int i15 = 0;
            Modifier modifierMo3471e = AbstractC37056f.m118995s(str != null ? AbstractC18032n.m51775c(modifier, false, new C2663y4(str, 3)) : modifier).mo3471e(new ContentPainterElement(asyncImagePainter, interfaceC2302h, interfaceC39105k, f13));
            C4583d c4583d = C4583d.f18462b;
            c28655q.m87152f0(544976794);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87152f0(1405779621);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(new C4582c(c0213j, i15));
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c4583d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC25012a.m73392y(c28655q, true, false, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4482w.m14000l(modifier, asyncImagePainter, str, interfaceC2302h, interfaceC39105k, f13, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final RemoteViews m14001l0(Context context, int i13, C28899m1 c28899m1, C28936z0 c28936z0, int i14, ComponentName componentName, C28919t0 c28919t0) {
        int i15 = 0;
        boolean z4 = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            z4 = false;
        }
        C28932x1 c28932x1 = new C28932x1(context, i13, z4, c28936z0, -1, false, new AtomicInteger(-1), new C28931x0(i15, null, i15, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName, c28919t0);
        ArrayList<InterfaceC26392i> arrayList = c28899m1.f104849b;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((InterfaceC26392i) it.next()) instanceof C28927w)) {
                    InterfaceC26392i interfaceC26392i = (InterfaceC26392i) AbstractC25265s.m74142p1(arrayList);
                    C28896l1 c28896l1M87787a = AbstractC28869c1.m87787a(c28932x1, interfaceC26392i.mo78105c(), i14);
                    RemoteViews remoteViews = c28896l1M87787a.f116969a;
                    m13999k0(remoteViews, C28932x1.m87840a(c28932x1.m87841b(c28896l1M87787a.f116970b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, null, 65215), interfaceC26392i);
                    return remoteViews;
                }
            }
        }
        Object objM74096F0 = AbstractC25265s.m74096F0(arrayList);
        AbstractC22676k.m65748h(objM74096F0, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        InterfaceC28923u1 interfaceC28923u1 = ((C28927w) objM74096F0).f117043d;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (InterfaceC26392i interfaceC26392i2 : arrayList) {
            AbstractC22676k.m65748h(interfaceC26392i2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            C28927w c28927w = (C28927w) interfaceC26392i2;
            long j7 = c28927w.f117042c;
            C28896l1 c28896l1M87787a2 = AbstractC28869c1.m87787a(c28932x1, c28927w.mo78105c(), i14);
            RemoteViews remoteViews2 = c28896l1M87787a2.f116969a;
            m13999k0(remoteViews2, C28932x1.m87840a(c28932x1.m87841b(c28896l1M87787a2.f116970b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), j7, null, 64703), interfaceC26392i2);
            arrayList2.add(new C23465k(new SizeF(C39176h.m124787c(j7), C39176h.m124786b(j7)), remoteViews2));
        }
        if (interfaceC28923u1 instanceof C28920t1) {
            return (RemoteViews) ((C23465k) AbstractC25265s.m74142p1(arrayList2)).f92938x;
        }
        if (!(interfaceC28923u1 instanceof C28917s1) && !AbstractC22676k.m65745e(interfaceC28923u1, C28914r1.f117020a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC11480b.m30878d(AbstractC25247g0.m74000i0(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add((RemoteViews) ((C23465k) it3.next()).f92938x);
        }
        int size = arrayList3.size();
        if (size == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }

    /* JADX INFO: renamed from: m0 */
    public static void m14002m0(String str) {
        if (f18018E > 4) {
            Log.v("RootBeer", m13982R() + String.valueOf(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final void m14003n(boolean z4, String selectedPaymentMethodCode, List formElements, C32077a formArguments, C33333n usBankAccountFormArguments, C22976l1 c22976l1, Function1 onFormFieldValuesChanged, InterfaceC4339a onInteractionEvent, Composer composer, int i13) {
        int i14;
        boolean z13;
        boolean z14;
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC22676k.m65750j(formElements, "formElements");
        AbstractC22676k.m65750j(formArguments, "formArguments");
        AbstractC22676k.m65750j(usBankAccountFormArguments, "usBankAccountFormArguments");
        AbstractC22676k.m65750j(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC22676k.m65750j(onInteractionEvent, "onInteractionEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(768610840);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(selectedPaymentMethodCode) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(formElements) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(formArguments) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(usBankAccountFormArguments) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(c22976l1) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(onFormFieldValuesChanged) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(onInteractionEvent) ? 8388608 : 4194304;
        }
        if ((4793491 & i14) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Object[] objArr = new Object[0];
            c28655q.m87150e0(-1853071744);
            Object objM87133R = c28655q.m87133R();
            int i15 = 1;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C2217h(i15);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            Object objM124459e = AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R, c28655q, 3072, 6);
            AbstractC22676k.m65749i(objM124459e, "rememberSaveable(...)");
            String str = (String) objM124459e;
            Object[] objArr2 = new Object[0];
            c28655q.m87150e0(-1853059623);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C2217h(2);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr2, null, (InterfaceC4339a) objM87133R2, c28655q, 3072, 6);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "FORM_ELEMENT_UI");
            c28655q.m87150e0(-1853054425);
            int i16 = 29360128 & i14;
            boolean z15 = i16 == 8388608;
            Object objM87133R3 = c28655q.m87133R();
            if (z15 || objM87133R3 == c28676v0) {
                z13 = false;
                objM87133R3 = new C2533h2(onInteractionEvent, null, 0 == true ? 1 : 0);
                c28655q.m87172p0(objM87133R3);
            } else {
                z13 = false;
            }
            c28655q.m87173q(z13);
            Modifier modifierMo3471e = modifierM3599a.mo3471e(new SuspendPointerInputElement("AddPaymentMethod", null, null, new C34450b0((InterfaceC4351m) objM87133R3), 6));
            c28655q.m87150e0(-1853044231);
            boolean z16 = i16 == 8388608;
            Object objM87133R4 = c28655q.m87133R();
            if (z16 || objM87133R4 == c28676v0) {
                objM87133R4 = new C2161b(onInteractionEvent, 4);
                c28655q.m87172p0(objM87133R4);
            }
            c28655q.m87173q(false);
            Modifier modifierM3484c = AbstractC1126a.m3484c(modifierMo3471e, (Function1) objM87133R4);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3484c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C33623c0 c33623c0 = EnumC38828f4.f167088G;
            if (selectedPaymentMethodCode.equals("us_bank_account") || selectedPaymentMethodCode.equals("link")) {
                c28655q = c28655q;
                z14 = true;
                c28655q.m87150e0(-753685306);
                c28655q.m87150e0(1361166126);
                boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(usBankAccountFormArguments);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87153g || objM87133R5 == c28676v0) {
                    objM87133R5 = new C17820i(17, usBankAccountFormArguments, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R5);
                }
                c28655q.m87173q(false);
                AbstractC32281f.m100448n(formArguments, usBankAccountFormArguments, (InterfaceC4339a) objM87133R5, AbstractC1099a.m3393o(c22976l1, c2314t), z4, c28655q, ((i14 >> 9) & 126) | (57344 & (i14 << 12)));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-753148882);
                int i17 = i14 << 6;
                z14 = true;
                AbstractC5583n.m16773d(str, formArguments, z4, onFormFieldValuesChanged, formElements, AbstractC1099a.m3393o(c22976l1, c2314t), c28655q, ((i14 >> 6) & 112) | (i17 & 896) | ((i14 >> 9) & 7168) | (57344 & i17), 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2509e2(z4, selectedPaymentMethodCode, formElements, formArguments, usBankAccountFormArguments, c22976l1, onFormFieldValuesChanged, onInteractionEvent, i13);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static Value m14004n0(Object value) {
        AbstractC22676k.m65750j(value, "value");
        if (!(value instanceof Value) && !(value instanceof C36503d)) {
            if (value instanceof C11142b) {
                C11142b c11142b = (C11142b) value;
                HashMap map = new HashMap();
                map.put("delay", new Value(0L));
                map.put(AttachmentExtensionsKt.EXTRA_DURATION, new Value(0L));
                Long l7 = c11142b.f35595b;
                if (l7 != null) {
                    map.put("delay", new Value(l7.longValue()));
                }
                Long l12 = c11142b.f35594a;
                if (l12 != null) {
                    map.put(AttachmentExtensionsKt.EXTRA_DURATION, new Value(l12.longValue()));
                }
                return new Value((HashMap<String, Value>) map);
            }
            if (value instanceof C41146a) {
                return new Value("round");
            }
            if (value instanceof TileCacheBudget) {
                TileCacheBudget tileCacheBudget = (TileCacheBudget) value;
                HashMap map2 = new HashMap();
                TileCacheBudget.Type typeInfo = tileCacheBudget.getTypeInfo();
                int i13 = typeInfo == null ? -1 : AbstractC2092f.f8263a[typeInfo.ordinal()];
                if (i13 == 1) {
                    map2.put("megabytes", new Value(tileCacheBudget.getTileCacheBudgetInMegabytes().getSize()));
                } else {
                    if (i13 != 2) {
                        throw new MapboxStyleException("Failed to parse TileCacheBudget: " + tileCacheBudget);
                    }
                    map2.put("tiles", new Value(tileCacheBudget.getTileCacheBudgetInTiles().getSize()));
                }
                return new Value((HashMap<String, Value>) map2);
            }
            if (value instanceof Integer) {
                return new Value(((Number) value).intValue());
            }
            if (value instanceof String) {
                return new Value((String) value);
            }
            if (value instanceof Boolean) {
                return new Value(((Boolean) value).booleanValue());
            }
            if (value instanceof Double) {
                Number number = (Number) value;
                double dDoubleValue = number.doubleValue();
                if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                    throw new IllegalArgumentException("Value can not be Double.NaN, Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY");
                }
                return new Value(number.doubleValue());
            }
            if (value instanceof Float) {
                Number number2 = (Number) value;
                float fFloatValue = number2.floatValue();
                if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue)) {
                    throw new IllegalArgumentException("Value can not be Float.NaN, Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY");
                }
                return new Value(number2.floatValue());
            }
            if (value instanceof Long) {
                return new Value(((Number) value).longValue());
            }
            int i14 = 0;
            if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                ArrayList arrayList = new ArrayList(iArr.length);
                int length = iArr.length;
                while (i14 < length) {
                    arrayList.add(m14004n0(Long.valueOf(iArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList);
            }
            if (value instanceof boolean[]) {
                boolean[] zArr = (boolean[]) value;
                ArrayList arrayList2 = new ArrayList(zArr.length);
                int length2 = zArr.length;
                while (i14 < length2) {
                    arrayList2.add(m14004n0(Boolean.valueOf(zArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList2);
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                ArrayList arrayList3 = new ArrayList(dArr.length);
                int length3 = dArr.length;
                while (i14 < length3) {
                    arrayList3.add(m14004n0(Double.valueOf(dArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList3);
            }
            if (value instanceof float[]) {
                float[] fArr = (float[]) value;
                ArrayList arrayList4 = new ArrayList(fArr.length);
                int length4 = fArr.length;
                while (i14 < length4) {
                    arrayList4.add(m14004n0(Double.valueOf(fArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList4);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                ArrayList arrayList5 = new ArrayList(jArr.length);
                int length5 = jArr.length;
                while (i14 < length5) {
                    arrayList5.add(m14004n0(Long.valueOf(jArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList5);
            }
            if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                ArrayList arrayList6 = new ArrayList(objArr.length);
                int length6 = objArr.length;
                while (i14 < length6) {
                    Object obj = objArr[i14];
                    arrayList6.add(obj != null ? m14004n0(obj) : null);
                    i14++;
                }
                return new Value((List<Value>) arrayList6);
            }
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    arrayList7.add(next != null ? m14004n0(next) : null);
                }
                return new Value((List<Value>) arrayList7);
            }
            if (value instanceof HashMap) {
                HashMap map3 = new HashMap();
                HashMap map4 = (HashMap) value;
                Set<String> setKeySet = map4.keySet();
                AbstractC22676k.m65749i(setKeySet, "castedValue.keys");
                for (String key : setKeySet) {
                    AbstractC22676k.m65749i(key, "key");
                    Object obj2 = map4.get(key);
                    AbstractC22676k.m65747g(obj2);
                    map3.put(key, m14004n0(obj2));
                }
                return new Value((HashMap<String, Value>) map3);
            }
            if (!(value instanceof JsonPrimitive)) {
                throw new UnsupportedOperationException("Wrapping \"" + value.getClass().getSimpleName() + "\" is not supported.");
            }
            JsonPrimitive jsonPrimitive = (JsonPrimitive) value;
            if (jsonPrimitive.isBoolean()) {
                return new Value(jsonPrimitive.getAsBoolean());
            }
            if (jsonPrimitive.isNumber()) {
                return new Value(jsonPrimitive.getAsDouble());
            }
            if (jsonPrimitive.isString()) {
                return new Value(jsonPrimitive.getAsString());
            }
            throw new IllegalArgumentException(AbstractC25012a.m73375h(value, "Failed to parse JsonPrimitive: "));
        }
        return (Value) value;
    }

    /* JADX INFO: renamed from: o */
    public static final void m14005o(String text, Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-214069769);
        int i16 = i13 | (c28655q2.m87153g(text) ? 4 : 2);
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 = i16 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i15 = i16 | (c28655q2.m87153g(modifier2) ? 32 : 16);
        }
        if ((i15 & 19) == 18 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
            modifier3 = modifier2;
        } else {
            c28655q = c28655q2;
            modifier3 = i17 != 0 ? C2314t.f9131w : modifier2;
            AbstractC15011f9.m43114b(text, modifier3, AbstractC11673r.m31082k(c28655q2).f37674g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C15069l3.m43149c(c28655q2).f56280g, c28655q, i15 & 126, 0, 65528);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2548j1(text, modifier3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m14006p(final boolean z4, final List supportedPaymentMethods, final String selectedItemCode, C29810c c29810c, final List formElements, final Function1 onItemSelectedListener, final C32077a formArguments, final C33333n usBankAccountFormArguments, final Function1 onFormFieldValuesChanged, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        int i17;
        Function1 function2;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        Function1 function3;
        C28655q c28655q;
        C34378f c34378f;
        InterfaceC4339a interfaceC4339a3;
        Modifier modifier3;
        boolean z14;
        C29810c c29810c2;
        int i18;
        C28655q c28655q2;
        final InterfaceC4339a interfaceC4339a4;
        final Function1 function4;
        AbstractC22676k.m65750j(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC22676k.m65750j(selectedItemCode, "selectedItemCode");
        AbstractC22676k.m65750j(formElements, "formElements");
        AbstractC22676k.m65750j(onItemSelectedListener, "onItemSelectedListener");
        AbstractC22676k.m65750j(formArguments, "formArguments");
        AbstractC22676k.m65750j(usBankAccountFormArguments, "usBankAccountFormArguments");
        AbstractC22676k.m65750j(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-294653858);
        int i19 = (c28655q3.m87155h(z4) ? 4 : 2) | i13 | (c28655q3.m87157i(supportedPaymentMethods) ? 32 : 16) | (c28655q3.m87153g(selectedItemCode) ? 256 : 128);
        if ((i13 & 3072) == 0) {
            i19 |= (i13 & 4096) == 0 ? c28655q3.m87153g(c29810c) : c28655q3.m87157i(c29810c) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i24 = i19 | (c28655q3.m87157i(formElements) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q3.m87157i(onItemSelectedListener) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q3.m87157i(formArguments) ? 1048576 : 524288) | (c28655q3.m87157i(usBankAccountFormArguments) ? 8388608 : 4194304) | (c28655q3.m87157i(onFormFieldValuesChanged) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE);
        int i25 = i14 & 512;
        if (i25 != 0) {
            i15 = i24 | 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i15 = i24 | (c28655q3.m87153g(modifier2) ? 536870912 : 268435456);
        }
        int i26 = i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i26 != 0) {
            i16 = 6;
        } else {
            i16 = c28655q3.m87157i(function1) ? 4 : 2;
        }
        int i27 = i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i27 != 0) {
            i17 = i16 | 48;
        } else {
            i17 = i16 | (c28655q3.m87157i(interfaceC4339a) ? 32 : 16);
        }
        int i28 = 18;
        if ((i15 & 306783379) == 306783378 && (i17 & 19) == 18 && c28655q3.m87121F()) {
            c28655q3.m87138X();
            function4 = function1;
            interfaceC4339a4 = interfaceC4339a;
            c29810c2 = c29810c;
            modifier3 = modifier2;
            c28655q2 = c28655q3;
        } else {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i25 != 0 ? c2314t : modifier2;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                c28655q3.m87150e0(-779265456);
                Object objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C2185f(i28);
                    c28655q3.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
                c28655q3.m87173q(false);
            } else {
                function2 = function1;
            }
            if (i27 != 0) {
                c28655q3.m87150e0(-779264144);
                Object objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C28376a(7);
                    c28655q3.m87172p0(objM87133R2);
                }
                c28655q3.m87173q(false);
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            Context context = (Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q3.m87150e0(-779261868);
            Object objM87133R3 = c28655q3.m87133R();
            if (objM87133R3 == c28676v0) {
                Context applicationContext = context.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                objM87133R3 = new C25046w(applicationContext, 30);
                c28655q3.m87172p0(objM87133R3);
            }
            C25046w c25046w = (C25046w) objM87133R3;
            c28655q3.m87173q(false);
            C11669n c11669n = C11671p.f37680a;
            C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
            c28655q3.m87150e0(-779256749);
            boolean zM87153g = ((i15 & 896) == 256) | c28655q3.m87153g(supportedPaymentMethods);
            Object objM87133R4 = c28655q3.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                List list = supportedPaymentMethods;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C34378f) it.next()).f144467a);
                }
                objM87133R4 = Integer.valueOf(arrayList.indexOf(selectedItemCode));
                c28655q3.m87172p0(objM87133R4);
            }
            int iIntValue = ((Number) objM87133R4).intValue();
            c28655q3.m87173q(false);
            c28655q3.m87150e0(-779251755);
            boolean zM87149e = c28655q3.m87149e(iIntValue) | c28655q3.m87153g(supportedPaymentMethods);
            Object objM87133R5 = c28655q3.m87133R();
            if (zM87149e || objM87133R5 == c28676v0) {
                objM87133R5 = (C34378f) supportedPaymentMethods.get(iIntValue);
                c28655q3.m87172p0(objM87133R5);
            }
            C34378f c34378f2 = (C34378f) objM87133R5;
            c28655q3.m87173q(false);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            Modifier modifier5 = modifier4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (supportedPaymentMethods.size() > 1) {
                c28655q3.m87150e0(-903556058);
                int i29 = i15 >> 3;
                c28655q = c28655q3;
                z13 = true;
                c34378f = c34378f2;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier5;
                i18 = i15;
                AbstractC3511b.m10373b(supportedPaymentMethods, iIntValue, z4, c29810c, onItemSelectedListener, c25046w, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 12, 7), function2, null, c28655q, (i29 & 57344) | (i29 & 14) | 1572864 | ((i15 << 6) & 896) | (i15 & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION | ((i17 << 21) & 29360128));
                z14 = z4;
                c29810c2 = c29810c;
                function3 = function2;
                c28655q.m87173q(false);
            } else {
                z13 = true;
                function3 = function2;
                c28655q = c28655q3;
                c34378f = c34378f2;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier5;
                z14 = z4;
                c29810c2 = c29810c;
                i18 = i15;
                if (AbstractC32410a.m101007P(supportedPaymentMethods)) {
                    c28655q.m87150e0(-903010024);
                    AbstractC32416g.m101155l(z14, ((C34378f) AbstractC25265s.m74096F0(supportedPaymentMethods)).m108679a(c29810c2), c28655q, i18 & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-902889899);
                    c28655q.m87173q(false);
                }
            }
            int i34 = i18 >> 6;
            int i35 = i18 >> 9;
            InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
            C28655q c28655q4 = c28655q;
            m14003n(z14, c34378f.f144467a, formElements, formArguments, usBankAccountFormArguments, c22976l1M31081j, onFormFieldValuesChanged, interfaceC4339a5, c28655q4, (i18 & 14) | (i34 & 896) | (i35 & 7168) | (i35 & 57344) | (i34 & 3670016) | ((i17 << 18) & 29360128));
            c28655q2 = c28655q4;
            c28655q2.m87173q(z13);
            interfaceC4339a4 = interfaceC4339a5;
            function4 = function3;
        }
        C28677v1 c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            final C29810c c29810c3 = c29810c2;
            final Modifier modifier6 = modifier3;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: b30.f2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    AbstractC4482w.m14006p(z4, supportedPaymentMethods, selectedItemCode, c29810c3, formElements, onItemSelectedListener, formArguments, usBankAccountFormArguments, onFormFieldValuesChanged, modifier6, function4, interfaceC4339a4, (Composer) obj, iM87244L, i14);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m14007q(Nudge nudge, SimulationContext simulationContext, C4861a c4861a, boolean z4, Composer composer, int i13) {
        DebugStatus debugStatus;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1474486442);
        boolean bypassCustomThrottles = simulationContext != null ? simulationContext.getBypassCustomThrottles() : false;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        if (simulationContext == null) {
            debugStatus = DebugStatus.ERROR;
        } else {
            debugStatus = (bypassCustomThrottles || simulationContext.getPassesCustomThrottles() || z4) ? DebugStatus.SUCCESS : DebugStatus.WARNING;
        }
        DebugStatus debugStatus2 = debugStatus;
        AbstractC37926s0.m121464b("Throttle", debugStatus2, AbstractC37817c.m121341b(1195148983, c28655q, new C27961h(debugStatus2, nudge, simulationContext, interfaceC28601c1, bypassCustomThrottles, c4861a)), c28655q, 390);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27966m(nudge, simulationContext, c4861a, z4, i13);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public static final Object m14008r(AbstractC1638x abstractC1638x, AbstractC32269c abstractC32269c) throws Throwable {
        C22493e c22493e;
        AbstractC1638x abstractC1638x2;
        C22669g0 c22669g0;
        Throwable th3;
        InterfaceC1581f0 interfaceC1581f0;
        InterfaceC1581f0 interfaceC1581f1;
        if (abstractC32269c instanceof C22493e) {
            c22493e = (C22493e) abstractC32269c;
            int i13 = c22493e.f88190z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c22493e.f88190z = i13 - Integer.MIN_VALUE;
            } else {
                c22493e = new C22493e(abstractC32269c);
            }
        } else {
            c22493e = new C22493e(abstractC32269c);
        }
        Object obj = c22493e.f88189y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c22493e.f88190z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c22493e.f88188x;
            abstractC1638x2 = c22493e.f88187w;
            try {
                AbstractC34132o.m107864I(obj);
                interfaceC1581f1 = (InterfaceC1581f0) c22669g0.f89336w;
                if (interfaceC1581f1 != null) {
                    abstractC1638x2.mo4988d(interfaceC1581f1);
                }
                return c23454a0;
            } catch (Throwable th4) {
                th3 = th4;
                interfaceC1581f0 = (InterfaceC1581f0) c22669g0.f89336w;
                if (interfaceC1581f0 != null) {
                    abstractC1638x2.mo4988d(interfaceC1581f0);
                }
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj);
        if (abstractC1638x.getCurrentState().compareTo(EnumC1635w.f6328z) >= 0) {
            return c23454a0;
        }
        C22669g0 c22669g1 = new C22669g0();
        try {
            c22493e.f88187w = abstractC1638x;
            c22493e.f88188x = c22669g1;
            c22493e.f88190z = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c22493e));
            c3033m.m8774s();
            C22494f c22494f = new C22494f(c3033m, 0);
            c22669g1.f89336w = c22494f;
            abstractC1638x.mo4986a(c22494f);
            if (c3033m.m8773r() == enumC31071a) {
                return enumC31071a;
            }
            abstractC1638x2 = abstractC1638x;
            c22669g0 = c22669g1;
            interfaceC1581f1 = (InterfaceC1581f0) c22669g0.f89336w;
            if (interfaceC1581f1 != null) {
                abstractC1638x2.mo4988d(interfaceC1581f1);
            }
            return c23454a0;
        } catch (Throwable th5) {
            abstractC1638x2 = abstractC1638x;
            c22669g0 = c22669g1;
            th3 = th5;
            interfaceC1581f0 = (InterfaceC1581f0) c22669g0.f89336w;
            if (interfaceC1581f0 != null) {
                abstractC1638x2.mo4988d(interfaceC1581f0);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final List m14009s(C28610e2 c28610e2) {
        if (c28610e2.f115743f || c28610e2.f115740c == 0) {
            return C25271y.f99162w;
        }
        C0160i c0160i = new C0160i(c28610e2);
        int iM87005q = c28610e2.f115746i;
        Object objValueOf = Integer.valueOf(c28610e2.f115749l - AbstractC28622h2.m87028c(c28610e2.f115739b, iM87005q));
        while (iM87005q >= 0) {
            c0160i.m371E(c28610e2.f115738a.m87019j(iM87005q), objValueOf);
            objValueOf = c28610e2.m86989a(iM87005q);
            iM87005q = c28610e2.m87005q(iM87005q);
        }
        return (ArrayList) c0160i.f475x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a2.a, a2.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [p1.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: t */
    public static final List m14010t(C28626i2 c28626i2, Integer num, int i13, Integer num2) {
        int iM87039D;
        C0047q0 c0047q0;
        if (c28626i2.f115803w || c28626i2.m87070p() == 0) {
            return C25271y.f99162w;
        }
        ?? c0160i = new C0160i(c28626i2);
        if (num2 != null) {
            iM87039D = num2.intValue();
        } else {
            iM87039D = c28626i2.f115802v;
            if (iM87039D < 0) {
                iM87039D = c28626i2.m87039D(c28626i2.f115782b, i13);
            }
        }
        if (num == 0) {
            int iM87048M = c28626i2.f115789i - c28626i2.m87048M(c28626i2.f115782b, c28626i2.m87072r(i13));
            C0023g0 c0023g0 = c28626i2.f115799s;
            num = Integer.valueOf(iM87048M + ((c0023g0 == null || (c0047q0 = (C0047q0) c0023g0.m121b(i13)) == null) ? 0 : c0047q0.f137b));
        }
        while (i13 >= 0) {
            c0160i.m371E(c28626i2.m87049N(i13), num);
            num = c28626i2.m87057b(i13);
            if (iM87039D >= 0) {
                int i14 = iM87039D;
                iM87039D = c28626i2.m87039D(c28626i2.f115782b, iM87039D);
                i13 = i14;
            } else {
                i13 = iM87039D;
            }
        }
        return (ArrayList) c0160i.f475x;
    }

    /* JADX INFO: renamed from: u */
    public static List m14011u(C28626i2 c28626i2) {
        return m14010t(c28626i2, null, c28626i2.f115800t, null);
    }

    /* JADX INFO: renamed from: v */
    public static final long m14012v(AndroidComposeView androidComposeView) {
        Activity activity;
        int iRound;
        long j7;
        InterfaceC2398k1 interfaceC2398k1;
        Context context = androidComposeView.getContext();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof Activity)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            } else {
                activity = (Activity) baseContext;
                break;
            }
        }
        if (activity != null) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                interfaceC2398k1 = C2408m1.f9463a;
            } else {
                interfaceC2398k1 = i13 >= 29 ? C2403l1.f9455c : C2403l1.f9454b;
            }
            Rect rectMo7396a = interfaceC2398k1.mo7396a(activity);
            int iWidth = rectMo7396a.width();
            iRound = rectMo7396a.height();
            j7 = iWidth;
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            float f13 = context.getResources().getDisplayMetrics().density;
            int iRound2 = Math.round(configuration.screenWidthDp * f13);
            iRound = Math.round(configuration.screenHeightDp * f13);
            j7 = iRound2;
        }
        return (((long) iRound) & 4294967295L) | (j7 << 32);
    }

    /* JADX INFO: renamed from: w */
    public static final void m14013w(List list) {
        List<InterfaceC26392i> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (InterfaceC26392i interfaceC26392i : list2) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m14014x(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m14015y(Canvas canvas, float f13, float f14, float f15, float f16) {
        return canvas.clipOutRect(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m14016z(Canvas canvas, int i13, int i14, int i15, int i16) {
        return canvas.clipOutRect(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: S */
    public float mo8633S(View view) {
        if (f18019w) {
            try {
                return AbstractC2952h0.m8616a(view);
            } catch (NoSuchMethodError unused) {
                f18019w = false;
            }
        }
        return view.getAlpha();
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79389a(this);
        }
        if (mo60986a(interfaceC26700m)) {
            return ((EnumC26688a) interfaceC26700m).f106174x;
        }
        throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
    }

    /* JADX INFO: renamed from: e0 */
    public void mo8634e0(View view, float f13) {
        if (f18019w) {
            try {
                AbstractC2952h0.m8617b(view, f13);
                return;
            } catch (NoSuchMethodError unused) {
                f18019w = false;
            }
        }
        view.setAlpha(f13);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public int mo14018f(InterfaceC26700m interfaceC26700m) {
        return mo14017d(interfaceC26700m).m79420a(mo60987h(interfaceC26700m), interfaceC26700m);
    }

    /* JADX INFO: renamed from: f0 */
    public void mo8629f0(View view, int i13) {
        if (!f18021y) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f18020x = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f18021y = true;
        }
        Field field = f18020x;
        if (field != null) {
            try {
                f18020x.setInt(view, i13 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106195b || interfaceC26704q == AbstractC26703p.f106196c) {
            return null;
        }
        return interfaceC26704q.mo43799l(this);
    }
}
