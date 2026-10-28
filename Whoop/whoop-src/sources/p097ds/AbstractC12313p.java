package p097ds;

import a13.C0150h;
import a20.C0162b;
import a30.C0299i1;
import a30.C0308l1;
import a30.C0311m1;
import a30.C0314n1;
import a30.EnumC0293g1;
import a30.InterfaceC0305k1;
import a41.C0373i;
import a80.C0539c;
import a80.C0542f;
import aa3.C0656u0;
import ad3.AbstractC0757c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.animation.AbstractC1089a;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.glance.appwidget.protobuf.AbstractC1391i;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1930a;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b30.AbstractC2526g3;
import b30.C2596p1;
import b30.C2598p3;
import b30.C2605q2;
import b30.C2612r2;
import b30.C2619s2;
import b30.C2626t2;
import b30.C2630u;
import b30.C2633u2;
import b30.C2640v2;
import b30.C2647w2;
import b30.C2654x2;
import b30.C2661y2;
import b30.C2663y4;
import b30.EnumC2597p2;
import bd3.C3131k0;
import bd3.C3141t;
import c30.C3910a;
import c30.C3911b;
import c51.C4224b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.AbstractC4590k;
import ch.AbstractC4601v;
import ch.C4582c;
import ch.C4583d;
import ch.C4591l;
import ch.C4595p;
import ch.C4597r;
import ch.C4598s;
import cm.AbstractC4803d;
import cm.C4800a;
import cm.C4802c;
import coil.compose.AsyncImagePainter;
import coil.compose.ContentPainterElement;
import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import com.whoop.android.R;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import e10.C12553k;
import e10.InterfaceC12555l;
import e30.AbstractC12605c;
import ec3.InterfaceC13037f2;
import g40.AbstractC15380k2;
import g40.C15356g2;
import g40.C15368i2;
import g40.C15374j2;
import h00.AbstractC16518o;
import h20.C16686k4;
import h20.C16754w0;
import h40.C16839e;
import h40.C16845k;
import io.sentry.InterfaceC20602v0;
import io.sentry.config.AbstractC20301a;
import io.sentry.rrweb.AbstractC20526e;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import jh3.AbstractC21702c;
import kotlin.C2032u;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23797r;
import lb3.AbstractC23811y;
import lb3.EnumC23776g1;
import live.hms.video.utils.AndroidSDKConstants;
import m33.AbstractC25011a;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import m83.C25271y;
import mh.C25542j;
import n33.C26227a;
import n33.C26228b;
import n33.C26231e;
import n33.C26233g;
import n33.C26234h;
import n33.C26235i;
import n33.C26236j;
import n33.C26238l;
import n33.C26244r;
import ng3.C26701n;
import ng3.C26702o;
import no.nordicsemi.android.dfu.DfuBaseService;
import o33.EnumC27516a;
import o33.EnumC27517b;
import o33.EnumC27518c;
import o73.C27648a;
import org.json.JSONObject;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;
import p000.AbstractC11266d;
import p000.C12473e;
import p000.C2175b;
import p000.C22079k;
import p000.C26047n;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p023ay.C2140n;
import p023ay.C2147u;
import p025b1.C2217h;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2464x2;
import p028b4.AbstractC2703n;
import p031b9.AbstractC2875y;
import p037bu.C3632c;
import p040c0.AbstractC3788w0;
import p043c4.InterfaceC3950b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p095dp.AbstractC12240d;
import p132f0.C13821r1;
import p134f2.C14012a;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15067l1;
import p163g1.C14970c1;
import p163g1.EnumC15209z3;
import p180h0.EnumC16377d2;
import p194hg.C17248i;
import p194hg.C17250k;
import p194hg.InterfaceC17253n;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p255jk.C21746d;
import p284ko.InterfaceC22628l;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22998t;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p341nh.C26711e;
import p341nh.InterfaceC26715i;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28606d2;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p409q0.C29693q;
import p474s.AbstractC32004s;
import p477s2.AbstractC32069a;
import p479s4.AbstractC32126g;
import p490t0.AbstractC33253j;
import p512u2.C34450b0;
import p521ue.C34855a;
import p521ue.C34856b;
import p530up.AbstractC35148d;
import p537ux.C35338j;
import p537ux.InterfaceC35322b;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35903f;
import p581we.C37199o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.C39076b0;
import p635y2.InterfaceC39105k;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22669g0;
import p93.C29024c;
import p93.C29027f;
import q20.C29808b;
import q20.EnumC29806a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qc3.InterfaceC30225b;
import qc3.InterfaceC30262o;
import r20.InterfaceC30881s;
import r53.AbstractC30942c;
import r53.C30945f;
import r93.AbstractC31150q;
import r93.C31148p;
import r93.EnumC31106a0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31165x0;
import s93.C32305g;
import sa3.C32331e;
import sc3.C32388b;
import sc3.C32392f;
import sc3.C32402p;
import u93.C34709w0;
import ug.AbstractC34924m;
import v00.C35459c0;
import v00.C35473j0;
import va3.C35845c;
import va3.C35850h;
import w93.C36969b;
import wb3.AbstractC37056f;
import wc3.InterfaceC37145j;
import x30.AbstractC37926s0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ds.p */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12313p {

    /* JADX INFO: renamed from: a */
    public static C27430e f41240a;

    /* JADX INFO: renamed from: A */
    public static final LinkedHashMap m34249A(Map map) {
        AbstractC22676k.m65750j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC25265s.m74097F1((List) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: B */
    public static String m34250B(AbstractC1391i abstractC1391i) {
        StringBuilder sb4 = new StringBuilder(abstractC1391i.size());
        for (int i13 = 0; i13 < abstractC1391i.size(); i13++) {
            byte bMo4335a = abstractC1391i.mo4335a(i13);
            if (bMo4335a == 34) {
                sb4.append("\\\"");
            } else if (bMo4335a == 39) {
                sb4.append("\\'");
            } else if (bMo4335a != 92) {
                switch (bMo4335a) {
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
                        if (bMo4335a < 32 || bMo4335a > 126) {
                            sb4.append('\\');
                            sb4.append((char) (((bMo4335a >>> 6) & 3) + 48));
                            sb4.append((char) (((bMo4335a >>> 3) & 7) + 48));
                            sb4.append((char) ((bMo4335a & 7) + 48));
                        } else {
                            sb4.append((char) bMo4335a);
                        }
                        break;
                }
            } else {
                sb4.append("\\\\");
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: C */
    public static final void m34251C(InterfaceC17253n interfaceC17253n, C17248i c17248i, Object obj, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(interfaceC17253n, "<this>");
        interfaceC17253n.mo30744l(c17248i, new C17250k(obj, interfaceC4351m));
    }

    /* JADX INFO: renamed from: D */
    public static final C36969b m34252D(C0929d c0929d, C35845c classId, C32331e metadataVersion) {
        AbstractC22676k.m65750j(c0929d, "<this>");
        AbstractC22676k.m65750j(classId, "classId");
        AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
        C3632c c3632cM2348h = c0929d.m2348h(classId, metadataVersion);
        if (c3632cM2348h != null) {
            return (C36969b) c3632cM2348h.f14788w;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: E */
    public static AbstractC15380k2 m34253E(String countryCode) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        ?? r10 = AbstractC15380k2.f57814b;
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        C15356g2 c15356g2 = (C15356g2) r10.get(upperCase);
        return c15356g2 != null ? new C15374j2(c15356g2) : new C15368i2(countryCode);
    }

    /* JADX INFO: renamed from: F */
    public static C21746d m34254F(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("branch", null);
        String strOptString2 = jSONObject.optString("source", null);
        String strOptString3 = jSONObject.optString("version", null);
        String strOptString4 = jSONObject.optString("versionId", null);
        C21746d c21746d = new C21746d();
        c21746d.f83657a = strOptString;
        c21746d.f83658b = strOptString2;
        c21746d.f83659c = strOptString3;
        c21746d.f83660d = strOptString4;
        return c21746d;
    }

    /* JADX INFO: renamed from: G */
    public static float m34255G(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        long j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
        if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
            AbstractC17918w0.m51536x(j7);
            return 0.38f;
        }
        AbstractC17918w0.m51536x(j7);
        return 0.38f;
    }

    /* JADX INFO: renamed from: H */
    public static final float m34256H(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* JADX INFO: renamed from: I */
    public static final int m34257I(C29693q c29693q) {
        return (int) (c29693q.f121385e == EnumC16377d2.f62971w ? c29693q.m91154e() & 4294967295L : c29693q.m91154e() >> 32);
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m34258J(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        return abstractC23811y.mo69863p0() instanceof AbstractC23797r;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m34259K(long j7) {
        return (j7 & 2) != 0;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m34260L(long j7) {
        return (j7 & 1) != 0;
    }

    /* JADX INFO: renamed from: M */
    public static final AbstractC23763c0 m34261M(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
            return ((AbstractC23797r) abstractC23773f1Mo69863p0).f94187x;
        }
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23763c0) {
            return (AbstractC23763c0) abstractC23773f1Mo69863p0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: N */
    public static final int m34262N(AbstractC30942c abstractC30942c, int i13) {
        C30945f c30945f = abstractC30942c.f127669x[i13];
        c30945f.getClass();
        Rect rect = abstractC30942c.f127670y;
        return abstractC30942c.mo95188b(i13, c30945f.f127678a, rect.left, rect.top);
    }

    /* JADX INFO: renamed from: O */
    public static final void m34263O(InterfaceC30262o interfaceC30262o, String str, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC30262o, "<this>");
        if (!(interfaceC30262o instanceof InterfaceC30225b)) {
            throw new IllegalStateException("impossible");
        }
        InterfaceC30225b interfaceC30225b = (InterfaceC30225b) interfaceC30262o;
        AbstractC22681m0.m65774e(1, function1);
        C0656u0 c0656u0Mo92501c = interfaceC30225b.mo92501c();
        InterfaceC30225b interfaceC30225bMo92503f = interfaceC30225b.mo92503f();
        function1.invoke(interfaceC30225bMo92503f);
        c0656u0Mo92501c.m1637f(new C32402p(str, new C32392f(interfaceC30225bMo92503f.mo92501c().f2286a)));
    }

    /* JADX INFO: renamed from: P */
    public static final ArrayList m34264P(List authSchemePreference, List authOptions) {
        AbstractC22676k.m65750j(authSchemePreference, "authSchemePreference");
        AbstractC22676k.m65750j(authOptions, "authOptions");
        ArrayList arrayList = new ArrayList();
        Iterator it = authSchemePreference.iterator();
        while (it.hasNext()) {
            String str = ((C34856b) it.next()).f146802a;
            String strM125858D0 = AbstractC39414r.m125858D0('#', str, str);
            Iterator it3 = authOptions.iterator();
            Object obj = null;
            boolean z4 = false;
            Object obj2 = null;
            while (true) {
                if (!it3.hasNext()) {
                    if (!z4) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object next = it3.next();
                String str2 = ((C34855a) next).f146800a;
                if (AbstractC39414r.m125858D0('#', str2, str2).equals(strM125858D0)) {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                    obj2 = next;
                }
            }
            C34855a c34855a = (C34855a) obj;
            if (c34855a != null) {
                arrayList.add(c34855a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : authOptions) {
            if (!arrayList.contains((C34855a) obj3)) {
                arrayList2.add(obj3);
            }
        }
        return AbstractC25265s.m74129g1(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: Q */
    public static void m34265Q(AbstractC20526e abstractC20526e, C37199o c37199o, InterfaceC20602v0 interfaceC20602v0) {
        c37199o.m119207K("source");
        c37199o.m119219Y(interfaceC20602v0, abstractC20526e.f76902y);
    }

    /* JADX INFO: renamed from: R */
    public static final String m34266R(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX INFO: renamed from: S */
    public static final C26228b m34267S(RTCStats rTCStats) {
        String id4 = rTCStats.getId();
        String type = rTCStats.getType();
        Double dValueOf = Double.valueOf(rTCStats.getTimestampUs());
        Object obj = rTCStats.getMembers().get("sdpFmtpLine");
        Object obj2 = null;
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof String)) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g, "RtcParser", AbstractC21702c.m61134e(obj, "[toRtcStats] 'sdpFmtpLine' => expected String but found "), null);
            }
            obj = null;
        }
        String str = (String) obj;
        Object obj3 = rTCStats.getMembers().get("payloadType");
        if (obj3 == null) {
            obj3 = null;
        } else if (!(obj3 instanceof Long)) {
            C2343i c2343i2 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g2, "RtcParser", AbstractC21702c.m61134e(obj3, "[toRtcStats] 'payloadType' => expected Long but found "), null);
            }
            obj3 = null;
        }
        Long l7 = (Long) obj3;
        Object obj4 = rTCStats.getMembers().get("transportId");
        if (obj4 == null) {
            obj4 = null;
        } else if (!(obj4 instanceof String)) {
            C2343i c2343i3 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.WARN;
            if (interfaceC2339e3.isLoggable(enumC2341g3, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g3, "RtcParser", AbstractC21702c.m61134e(obj4, "[toRtcStats] 'transportId' => expected String but found "), null);
            }
            obj4 = null;
        }
        String str2 = (String) obj4;
        Object obj5 = rTCStats.getMembers().get("mimeType");
        if (obj5 == null) {
            obj5 = null;
        } else if (!(obj5 instanceof String)) {
            C2343i c2343i4 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339e4.isLoggable(enumC2341g4, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g4, "RtcParser", AbstractC21702c.m61134e(obj5, "[toRtcStats] 'mimeType' => expected String but found "), null);
            }
            obj5 = null;
        }
        String str3 = (String) obj5;
        Object obj6 = rTCStats.getMembers().get("clockRate");
        if (obj6 != null) {
            if (obj6 instanceof Long) {
                obj2 = obj6;
            } else {
                C2343i c2343i5 = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e5 = C2343i.f9272d;
                EnumC2341g enumC2341g5 = EnumC2341g.WARN;
                if (interfaceC2339e5.isLoggable(enumC2341g5, "RtcParser")) {
                    C2343i.f9271c.log(enumC2341g5, "RtcParser", AbstractC21702c.m61134e(obj6, "[toRtcStats] 'clockRate' => expected Long but found "), null);
                }
            }
        }
        return new C26228b(id4, type, dValueOf, str, l7, str2, str3, (Long) obj2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 n33.c, still in use, count: 2, list:
          (r0v0 n33.c) from 0x0177: MOVE (r16v0 n33.c) = (r0v0 n33.c)
          (r0v0 n33.c) from 0x0179: PHI (r16v2 n33.c) = (r16v0 n33.c), (r0v0 n33.c) binds: [B:67:0x0177, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: T */
    public static final n33.C26229c m34268T(org.webrtc.RTCStats r28) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p097ds.AbstractC12313p.m34268T(org.webrtc.RTCStats):n33.c");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 n33.d, still in use, count: 2, list:
          (r0v0 n33.d) from 0x0177: MOVE (r16v0 n33.d) = (r0v0 n33.d)
          (r0v0 n33.d) from 0x0179: PHI (r16v2 n33.d) = (r16v0 n33.d), (r0v0 n33.d) binds: [B:67:0x0177, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: U */
    public static final n33.C26230d m34269U(org.webrtc.RTCStats r22) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p097ds.AbstractC12313p.m34269U(org.webrtc.RTCStats):n33.d");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0218  */
    /* JADX WARN: Code duplicated, block: B:110:0x024b  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02db  */
    /* JADX WARN: Code duplicated, block: B:148:0x030d  */
    /* JADX WARN: Code duplicated, block: B:158:0x033f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0371  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:198:0x0407  */
    /* JADX WARN: Code duplicated, block: B:208:0x0439  */
    /* JADX WARN: Code duplicated, block: B:218:0x046b  */
    /* JADX WARN: Code duplicated, block: B:228:0x049d  */
    /* JADX WARN: Code duplicated, block: B:238:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:248:0x0501  */
    /* JADX WARN: Code duplicated, block: B:258:0x0533  */
    /* JADX WARN: Code duplicated, block: B:268:0x0565  */
    /* JADX WARN: Code duplicated, block: B:278:0x0597  */
    /* JADX WARN: Code duplicated, block: B:288:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:298:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:308:0x062d  */
    /* JADX WARN: Code duplicated, block: B:318:0x065f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0691  */
    /* JADX WARN: Code duplicated, block: B:338:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:348:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:358:0x0727  */
    /* JADX WARN: Code duplicated, block: B:368:0x0759  */
    /* JADX WARN: Code duplicated, block: B:378:0x078b  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e5  */
    /* JADX INFO: renamed from: V */
    public static final C26231e m34270V(RTCStats rTCStats) {
        String id4 = rTCStats.getId();
        String type = rTCStats.getType();
        double timestampUs = rTCStats.getTimestampUs();
        Object obj = rTCStats.getMembers().get("ssrc");
        Object obj2 = null;
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof Long)) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g, "RtcParser", AbstractC21702c.m61134e(obj, "[toRtcStats] 'ssrc' => expected Long but found "), null);
            }
            obj = null;
        }
        Long l7 = (Long) obj;
        Object obj3 = rTCStats.getMembers().get("kind");
        if (obj3 == null) {
            obj3 = null;
        } else if (!(obj3 instanceof String)) {
            C2343i c2343i2 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g2, "RtcParser", AbstractC21702c.m61134e(obj3, "[toRtcStats] 'kind' => expected String but found "), null);
            }
            obj3 = null;
        }
        String str = (String) obj3;
        Object obj4 = rTCStats.getMembers().get("transportId");
        if (obj4 == null) {
            obj4 = null;
        } else if (!(obj4 instanceof String)) {
            C2343i c2343i3 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.WARN;
            if (interfaceC2339e3.isLoggable(enumC2341g3, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g3, "RtcParser", AbstractC21702c.m61134e(obj4, "[toRtcStats] 'transportId' => expected String but found "), null);
            }
            obj4 = null;
        }
        String str2 = (String) obj4;
        Object obj5 = rTCStats.getMembers().get("codecId");
        if (obj5 == null) {
            obj5 = null;
        } else if (!(obj5 instanceof String)) {
            C2343i c2343i4 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339e4.isLoggable(enumC2341g4, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g4, "RtcParser", AbstractC21702c.m61134e(obj5, "[toRtcStats] 'codecId' => expected String but found "), null);
            }
            obj5 = null;
        }
        String str3 = (String) obj5;
        Object obj6 = rTCStats.getMembers().get("packetsReceived");
        if (obj6 == null) {
            obj6 = null;
        } else if (!(obj6 instanceof Long)) {
            C2343i c2343i5 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e5 = C2343i.f9272d;
            EnumC2341g enumC2341g5 = EnumC2341g.WARN;
            if (interfaceC2339e5.isLoggable(enumC2341g5, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g5, "RtcParser", AbstractC21702c.m61134e(obj6, "[toRtcStats] 'packetsReceived' => expected Long but found "), null);
            }
            obj6 = null;
        }
        Long l12 = (Long) obj6;
        Object obj7 = rTCStats.getMembers().get("packetsLost");
        if (obj7 == null) {
            obj7 = null;
        } else if (!(obj7 instanceof Integer)) {
            C2343i c2343i6 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e6 = C2343i.f9272d;
            EnumC2341g enumC2341g6 = EnumC2341g.WARN;
            if (interfaceC2339e6.isLoggable(enumC2341g6, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g6, "RtcParser", AbstractC21702c.m61134e(obj7, "[toRtcStats] 'packetsLost' => expected Integer but found "), null);
            }
            obj7 = null;
        }
        Integer num = (Integer) obj7;
        Object obj8 = rTCStats.getMembers().get("jitter");
        if (obj8 == null) {
            obj8 = null;
        } else if (!(obj8 instanceof Double)) {
            C2343i c2343i7 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e7 = C2343i.f9272d;
            EnumC2341g enumC2341g7 = EnumC2341g.WARN;
            if (interfaceC2339e7.isLoggable(enumC2341g7, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g7, "RtcParser", AbstractC21702c.m61134e(obj8, "[toRtcStats] 'jitter' => expected Double but found "), null);
            }
            obj8 = null;
        }
        Double d3 = (Double) obj8;
        Object obj9 = rTCStats.getMembers().get("trackIdentifier");
        if (obj9 == null) {
            obj9 = null;
        } else if (obj9 instanceof String) {
            l7 = l7;
        } else {
            C2343i c2343i8 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e8 = C2343i.f9272d;
            EnumC2341g enumC2341g8 = EnumC2341g.WARN;
            if (interfaceC2339e8.isLoggable(enumC2341g8, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g8, "RtcParser", AbstractC21702c.m61134e(obj9, "[toRtcStats] 'trackIdentifier' => expected String but found "), null);
            }
            obj9 = null;
        }
        String str4 = (String) obj9;
        Object obj10 = rTCStats.getMembers().get("mid");
        if (obj10 == null) {
            obj10 = null;
        } else if (obj10 instanceof String) {
            id4 = id4;
        } else {
            C2343i c2343i9 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e9 = C2343i.f9272d;
            EnumC2341g enumC2341g9 = EnumC2341g.WARN;
            if (interfaceC2339e9.isLoggable(enumC2341g9, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g9, "RtcParser", AbstractC21702c.m61134e(obj10, "[toRtcStats] 'mid' => expected String but found "), null);
            }
            obj10 = null;
        }
        String str5 = (String) obj10;
        Object obj11 = rTCStats.getMembers().get("remoteId");
        if (obj11 == null) {
            obj11 = null;
        } else if (obj11 instanceof String) {
            str5 = str5;
        } else {
            C2343i c2343i10 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e10 = C2343i.f9272d;
            EnumC2341g enumC2341g10 = EnumC2341g.WARN;
            if (interfaceC2339e10.isLoggable(enumC2341g10, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g10, "RtcParser", AbstractC21702c.m61134e(obj11, "[toRtcStats] 'remoteId' => expected String but found "), null);
            }
            obj11 = null;
        }
        String str6 = (String) obj11;
        Object obj12 = rTCStats.getMembers().get("lastPacketReceivedTimestamp");
        if (obj12 == null) {
            obj12 = null;
        } else if (obj12 instanceof Double) {
            str6 = str6;
        } else {
            C2343i c2343i11 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e11 = C2343i.f9272d;
            EnumC2341g enumC2341g11 = EnumC2341g.WARN;
            if (interfaceC2339e11.isLoggable(enumC2341g11, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g11, "RtcParser", AbstractC21702c.m61134e(obj12, "[toRtcStats] 'lastPacketReceivedTimestamp' => expected Double but found "), null);
            }
            obj12 = null;
        }
        Double d14 = (Double) obj12;
        Object obj13 = rTCStats.getMembers().get("headerBytesReceived");
        if (obj13 == null) {
            obj13 = null;
        } else if (obj13 instanceof BigInteger) {
            type = type;
        } else {
            C2343i c2343i12 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e12 = C2343i.f9272d;
            EnumC2341g enumC2341g12 = EnumC2341g.WARN;
            if (interfaceC2339e12.isLoggable(enumC2341g12, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g12, "RtcParser", AbstractC21702c.m61134e(obj13, "[toRtcStats] 'headerBytesReceived' => expected BigInteger but found "), null);
            }
            obj13 = null;
        }
        BigInteger bigInteger = (BigInteger) obj13;
        Object obj14 = rTCStats.getMembers().get("packetsDiscarded");
        if (obj14 == null) {
            obj14 = null;
        } else if (obj14 instanceof BigInteger) {
            timestampUs = timestampUs;
        } else {
            C2343i c2343i13 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e13 = C2343i.f9272d;
            EnumC2341g enumC2341g13 = EnumC2341g.WARN;
            if (interfaceC2339e13.isLoggable(enumC2341g13, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g13, "RtcParser", AbstractC21702c.m61134e(obj14, "[toRtcStats] 'packetsDiscarded' => expected BigInteger but found "), null);
            }
            obj14 = null;
        }
        BigInteger bigInteger2 = (BigInteger) obj14;
        Object obj15 = rTCStats.getMembers().get("fecBytesReceived");
        if (obj15 == null) {
            obj15 = null;
        } else if (!(obj15 instanceof BigInteger)) {
            C2343i c2343i14 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e14 = C2343i.f9272d;
            EnumC2341g enumC2341g14 = EnumC2341g.WARN;
            if (interfaceC2339e14.isLoggable(enumC2341g14, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g14, "RtcParser", AbstractC21702c.m61134e(obj15, "[toRtcStats] 'fecBytesReceived' => expected BigInteger but found "), null);
            }
            obj15 = null;
        }
        BigInteger bigInteger3 = (BigInteger) obj15;
        Object obj16 = rTCStats.getMembers().get("fecPacketsReceived");
        if (obj16 == null) {
            obj16 = null;
        } else if (obj16 instanceof BigInteger) {
            bigInteger2 = bigInteger2;
        } else {
            C2343i c2343i15 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e15 = C2343i.f9272d;
            EnumC2341g enumC2341g15 = EnumC2341g.WARN;
            if (interfaceC2339e15.isLoggable(enumC2341g15, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g15, "RtcParser", AbstractC21702c.m61134e(obj16, "[toRtcStats] 'fecPacketsReceived' => expected BigInteger but found "), null);
            }
            obj16 = null;
        }
        BigInteger bigInteger4 = (BigInteger) obj16;
        Object obj17 = rTCStats.getMembers().get("fecPacketsDiscarded");
        if (obj17 == null) {
            obj17 = null;
        } else if (obj17 instanceof BigInteger) {
            bigInteger3 = bigInteger3;
        } else {
            C2343i c2343i16 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e16 = C2343i.f9272d;
            EnumC2341g enumC2341g16 = EnumC2341g.WARN;
            if (interfaceC2339e16.isLoggable(enumC2341g16, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g16, "RtcParser", AbstractC21702c.m61134e(obj17, "[toRtcStats] 'fecPacketsDiscarded' => expected BigInteger but found "), null);
            }
            obj17 = null;
        }
        BigInteger bigInteger5 = (BigInteger) obj17;
        Object obj18 = rTCStats.getMembers().get("bytesReceived");
        if (obj18 == null) {
            obj18 = null;
        } else if (obj18 instanceof BigInteger) {
            bigInteger5 = bigInteger5;
        } else {
            C2343i c2343i17 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e17 = C2343i.f9272d;
            EnumC2341g enumC2341g17 = EnumC2341g.WARN;
            if (interfaceC2339e17.isLoggable(enumC2341g17, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g17, "RtcParser", AbstractC21702c.m61134e(obj18, "[toRtcStats] 'bytesReceived' => expected BigInteger but found "), null);
            }
            obj18 = null;
        }
        BigInteger bigInteger6 = (BigInteger) obj18;
        Object obj19 = rTCStats.getMembers().get("nackCount");
        if (obj19 == null) {
            obj19 = null;
        } else if (obj19 instanceof Long) {
            bigInteger6 = bigInteger6;
        } else {
            C2343i c2343i18 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e18 = C2343i.f9272d;
            EnumC2341g enumC2341g18 = EnumC2341g.WARN;
            if (interfaceC2339e18.isLoggable(enumC2341g18, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g18, "RtcParser", AbstractC21702c.m61134e(obj19, "[toRtcStats] 'nackCount' => expected Long but found "), null);
            }
            obj19 = null;
        }
        Long l13 = (Long) obj19;
        Object obj20 = rTCStats.getMembers().get("totalProcessingDelay");
        if (obj20 == null) {
            obj20 = null;
        } else if (obj20 instanceof Double) {
            l13 = l13;
        } else {
            C2343i c2343i19 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e19 = C2343i.f9272d;
            EnumC2341g enumC2341g19 = EnumC2341g.WARN;
            if (interfaceC2339e19.isLoggable(enumC2341g19, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g19, "RtcParser", AbstractC21702c.m61134e(obj20, "[toRtcStats] 'totalProcessingDelay' => expected Double but found "), null);
            }
            obj20 = null;
        }
        Double d15 = (Double) obj20;
        Object obj21 = rTCStats.getMembers().get("estimatedPlayoutTimestamp");
        if (obj21 == null) {
            obj21 = null;
        } else if (obj21 instanceof Double) {
            d15 = d15;
        } else {
            C2343i c2343i20 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e20 = C2343i.f9272d;
            EnumC2341g enumC2341g20 = EnumC2341g.WARN;
            if (interfaceC2339e20.isLoggable(enumC2341g20, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g20, "RtcParser", AbstractC21702c.m61134e(obj21, "[toRtcStats] 'estimatedPlayoutTimestamp' => expected Double but found "), null);
            }
            obj21 = null;
        }
        Double d16 = (Double) obj21;
        Object obj22 = rTCStats.getMembers().get("jitterBufferDelay");
        if (obj22 == null) {
            obj22 = null;
        } else if (obj22 instanceof Double) {
            d16 = d16;
        } else {
            C2343i c2343i21 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e21 = C2343i.f9272d;
            EnumC2341g enumC2341g21 = EnumC2341g.WARN;
            if (interfaceC2339e21.isLoggable(enumC2341g21, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g21, "RtcParser", AbstractC21702c.m61134e(obj22, "[toRtcStats] 'jitterBufferDelay' => expected Double but found "), null);
            }
            obj22 = null;
        }
        Double d17 = (Double) obj22;
        Object obj23 = rTCStats.getMembers().get("jitterBufferTargetDelay");
        if (obj23 == null) {
            obj23 = null;
        } else if (obj23 instanceof Double) {
            d17 = d17;
        } else {
            C2343i c2343i22 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e22 = C2343i.f9272d;
            EnumC2341g enumC2341g22 = EnumC2341g.WARN;
            if (interfaceC2339e22.isLoggable(enumC2341g22, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g22, "RtcParser", AbstractC21702c.m61134e(obj23, "[toRtcStats] 'jitterBufferTargetDelay' => expected Double but found "), null);
            }
            obj23 = null;
        }
        Double d18 = (Double) obj23;
        Object obj24 = rTCStats.getMembers().get("jitterBufferEmittedCount");
        if (obj24 == null) {
            obj24 = null;
        } else if (obj24 instanceof BigInteger) {
            d18 = d18;
        } else {
            C2343i c2343i23 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e23 = C2343i.f9272d;
            EnumC2341g enumC2341g23 = EnumC2341g.WARN;
            if (interfaceC2339e23.isLoggable(enumC2341g23, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g23, "RtcParser", AbstractC21702c.m61134e(obj24, "[toRtcStats] 'jitterBufferEmittedCount' => expected BigInteger but found "), null);
            }
            obj24 = null;
        }
        BigInteger bigInteger7 = (BigInteger) obj24;
        Object obj25 = rTCStats.getMembers().get("jitterBufferMinimumDelay");
        if (obj25 == null) {
            obj25 = null;
        } else if (obj25 instanceof Double) {
            bigInteger7 = bigInteger7;
        } else {
            C2343i c2343i24 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e24 = C2343i.f9272d;
            EnumC2341g enumC2341g24 = EnumC2341g.WARN;
            if (interfaceC2339e24.isLoggable(enumC2341g24, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g24, "RtcParser", AbstractC21702c.m61134e(obj25, "[toRtcStats] 'jitterBufferMinimumDelay' => expected Double but found "), null);
            }
            obj25 = null;
        }
        Double d19 = (Double) obj25;
        Object obj26 = rTCStats.getMembers().get("decoderImplementation");
        if (obj26 == null) {
            obj26 = null;
        } else if (obj26 instanceof String) {
            d19 = d19;
        } else {
            C2343i c2343i25 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e25 = C2343i.f9272d;
            EnumC2341g enumC2341g25 = EnumC2341g.WARN;
            if (interfaceC2339e25.isLoggable(enumC2341g25, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g25, "RtcParser", AbstractC21702c.m61134e(obj26, "[toRtcStats] 'decoderImplementation' => expected String but found "), null);
            }
            obj26 = null;
        }
        String str7 = (String) obj26;
        Object obj27 = rTCStats.getMembers().get("playoutId");
        if (obj27 == null) {
            obj27 = null;
        } else if (obj27 instanceof String) {
            str7 = str7;
        } else {
            C2343i c2343i26 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e26 = C2343i.f9272d;
            EnumC2341g enumC2341g26 = EnumC2341g.WARN;
            if (interfaceC2339e26.isLoggable(enumC2341g26, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g26, "RtcParser", AbstractC21702c.m61134e(obj27, "[toRtcStats] 'playoutId' => expected String but found "), null);
            }
            obj27 = null;
        }
        String str8 = (String) obj27;
        Object obj28 = rTCStats.getMembers().get("powerEfficientDecoder");
        if (obj28 == null) {
            obj28 = null;
        } else if (obj28 instanceof Boolean) {
            str8 = str8;
        } else {
            C2343i c2343i27 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e27 = C2343i.f9272d;
            EnumC2341g enumC2341g27 = EnumC2341g.WARN;
            if (interfaceC2339e27.isLoggable(enumC2341g27, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g27, "RtcParser", AbstractC21702c.m61134e(obj28, "[toRtcStats] 'powerEfficientDecoder' => expected Boolean but found "), null);
            }
            obj28 = null;
        }
        Boolean bool = (Boolean) obj28;
        Object obj29 = rTCStats.getMembers().get("retransmittedPacketsReceived");
        if (obj29 == null) {
            obj29 = null;
        } else if (obj29 instanceof BigInteger) {
            bool = bool;
        } else {
            C2343i c2343i28 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e28 = C2343i.f9272d;
            EnumC2341g enumC2341g28 = EnumC2341g.WARN;
            if (interfaceC2339e28.isLoggable(enumC2341g28, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g28, "RtcParser", AbstractC21702c.m61134e(obj29, "[toRtcStats] 'retransmittedPacketsReceived' => expected BigInteger but found "), null);
            }
            obj29 = null;
        }
        BigInteger bigInteger8 = (BigInteger) obj29;
        Object obj30 = rTCStats.getMembers().get("retransmittedBytesReceived");
        if (obj30 == null) {
            obj30 = null;
        } else if (obj30 instanceof BigInteger) {
            bigInteger8 = bigInteger8;
        } else {
            C2343i c2343i29 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e29 = C2343i.f9272d;
            EnumC2341g enumC2341g29 = EnumC2341g.WARN;
            if (interfaceC2339e29.isLoggable(enumC2341g29, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g29, "RtcParser", AbstractC21702c.m61134e(obj30, "[toRtcStats] 'retransmittedBytesReceived' => expected BigInteger but found "), null);
            }
            obj30 = null;
        }
        BigInteger bigInteger9 = (BigInteger) obj30;
        Object obj31 = rTCStats.getMembers().get("rtxSsrc");
        if (obj31 == null) {
            obj31 = null;
        } else if (obj31 instanceof Long) {
            bigInteger9 = bigInteger9;
        } else {
            C2343i c2343i30 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e30 = C2343i.f9272d;
            EnumC2341g enumC2341g30 = EnumC2341g.WARN;
            if (interfaceC2339e30.isLoggable(enumC2341g30, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g30, "RtcParser", AbstractC21702c.m61134e(obj31, "[toRtcStats] 'rtxSsrc' => expected Long but found "), null);
            }
            obj31 = null;
        }
        Long l14 = (Long) obj31;
        Object obj32 = rTCStats.getMembers().get("fecSsrc");
        if (obj32 == null) {
            obj32 = null;
        } else if (obj32 instanceof Long) {
            l14 = l14;
        } else {
            C2343i c2343i31 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e31 = C2343i.f9272d;
            EnumC2341g enumC2341g31 = EnumC2341g.WARN;
            if (interfaceC2339e31.isLoggable(enumC2341g31, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g31, "RtcParser", AbstractC21702c.m61134e(obj32, "[toRtcStats] 'fecSsrc' => expected Long but found "), null);
            }
            obj32 = null;
        }
        Long l15 = (Long) obj32;
        Object obj33 = rTCStats.getMembers().get("audioLevel");
        if (obj33 == null) {
            obj33 = null;
        } else if (obj33 instanceof Double) {
            l15 = l15;
        } else {
            C2343i c2343i32 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e32 = C2343i.f9272d;
            EnumC2341g enumC2341g32 = EnumC2341g.WARN;
            if (interfaceC2339e32.isLoggable(enumC2341g32, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g32, "RtcParser", AbstractC21702c.m61134e(obj33, "[toRtcStats] 'audioLevel' => expected Double but found "), null);
            }
            obj33 = null;
        }
        Double d24 = (Double) obj33;
        Object obj34 = rTCStats.getMembers().get("totalAudioEnergy");
        if (obj34 == null) {
            obj34 = null;
        } else if (obj34 instanceof Double) {
            d24 = d24;
        } else {
            C2343i c2343i33 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e33 = C2343i.f9272d;
            EnumC2341g enumC2341g33 = EnumC2341g.WARN;
            if (interfaceC2339e33.isLoggable(enumC2341g33, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g33, "RtcParser", AbstractC21702c.m61134e(obj34, "[toRtcStats] 'totalAudioEnergy' => expected Double but found "), null);
            }
            obj34 = null;
        }
        Double d25 = (Double) obj34;
        Object obj35 = rTCStats.getMembers().get("totalSamplesReceived");
        if (obj35 == null) {
            obj35 = null;
        } else if (obj35 instanceof BigInteger) {
            d25 = d25;
        } else {
            C2343i c2343i34 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e34 = C2343i.f9272d;
            EnumC2341g enumC2341g34 = EnumC2341g.WARN;
            if (interfaceC2339e34.isLoggable(enumC2341g34, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g34, "RtcParser", AbstractC21702c.m61134e(obj35, "[toRtcStats] 'totalSamplesReceived' => expected BigInteger but found "), null);
            }
            obj35 = null;
        }
        BigInteger bigInteger10 = (BigInteger) obj35;
        Object obj36 = rTCStats.getMembers().get("totalSamplesDuration");
        if (obj36 == null) {
            obj36 = null;
        } else if (obj36 instanceof Double) {
            bigInteger10 = bigInteger10;
        } else {
            C2343i c2343i35 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e35 = C2343i.f9272d;
            EnumC2341g enumC2341g35 = EnumC2341g.WARN;
            if (interfaceC2339e35.isLoggable(enumC2341g35, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g35, "RtcParser", AbstractC21702c.m61134e(obj36, "[toRtcStats] 'totalSamplesDuration' => expected Double but found "), null);
            }
            obj36 = null;
        }
        Double d26 = (Double) obj36;
        Object obj37 = rTCStats.getMembers().get("concealedSamples");
        if (obj37 == null) {
            obj37 = null;
        } else if (obj37 instanceof BigInteger) {
            d26 = d26;
        } else {
            C2343i c2343i36 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e36 = C2343i.f9272d;
            EnumC2341g enumC2341g36 = EnumC2341g.WARN;
            if (interfaceC2339e36.isLoggable(enumC2341g36, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g36, "RtcParser", AbstractC21702c.m61134e(obj37, "[toRtcStats] 'concealedSamples' => expected BigInteger but found "), null);
            }
            obj37 = null;
        }
        BigInteger bigInteger11 = (BigInteger) obj37;
        Object obj38 = rTCStats.getMembers().get("silentConcealedSamples");
        if (obj38 == null) {
            obj38 = null;
        } else if (obj38 instanceof BigInteger) {
            bigInteger11 = bigInteger11;
        } else {
            C2343i c2343i37 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e37 = C2343i.f9272d;
            EnumC2341g enumC2341g37 = EnumC2341g.WARN;
            if (interfaceC2339e37.isLoggable(enumC2341g37, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g37, "RtcParser", AbstractC21702c.m61134e(obj38, "[toRtcStats] 'silentConcealedSamples' => expected BigInteger but found "), null);
            }
            obj38 = null;
        }
        BigInteger bigInteger12 = (BigInteger) obj38;
        Object obj39 = rTCStats.getMembers().get("concealmentEvents");
        if (obj39 == null) {
            obj39 = null;
        } else if (obj39 instanceof BigInteger) {
            bigInteger12 = bigInteger12;
        } else {
            C2343i c2343i38 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e38 = C2343i.f9272d;
            EnumC2341g enumC2341g38 = EnumC2341g.WARN;
            if (interfaceC2339e38.isLoggable(enumC2341g38, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g38, "RtcParser", AbstractC21702c.m61134e(obj39, "[toRtcStats] 'concealmentEvents' => expected BigInteger but found "), null);
            }
            obj39 = null;
        }
        BigInteger bigInteger13 = (BigInteger) obj39;
        Object obj40 = rTCStats.getMembers().get("insertedSamplesForDeceleration");
        if (obj40 == null) {
            obj40 = null;
        } else if (obj40 instanceof BigInteger) {
            bigInteger13 = bigInteger13;
        } else {
            C2343i c2343i39 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e39 = C2343i.f9272d;
            EnumC2341g enumC2341g39 = EnumC2341g.WARN;
            if (interfaceC2339e39.isLoggable(enumC2341g39, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g39, "RtcParser", AbstractC21702c.m61134e(obj40, "[toRtcStats] 'insertedSamplesForDeceleration' => expected BigInteger but found "), null);
            }
            obj40 = null;
        }
        BigInteger bigInteger14 = (BigInteger) obj40;
        Object obj41 = rTCStats.getMembers().get("removedSamplesForAcceleration");
        if (obj41 != null) {
            if (obj41 instanceof BigInteger) {
                obj2 = obj41;
            } else {
                C2343i c2343i40 = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e40 = C2343i.f9272d;
                EnumC2341g enumC2341g40 = EnumC2341g.WARN;
                if (interfaceC2339e40.isLoggable(enumC2341g40, "RtcParser")) {
                    C2343i.f9271c.log(enumC2341g40, "RtcParser", AbstractC21702c.m61134e(obj41, "[toRtcStats] 'removedSamplesForAcceleration' => expected BigInteger but found "), null);
                }
            }
        }
        return new C26231e(id4, type, Double.valueOf(timestampUs), l7, str, str2, str3, l12, num, d3, str4, str5, str6, d14, bigInteger, bigInteger6, bigInteger2, bigInteger3, bigInteger4, bigInteger5, d17, d18, bigInteger7, d19, l13, d15, d16, str7, str8, bool, bigInteger8, bigInteger9, l14, l15, d24, d25, bigInteger10, d26, bigInteger11, bigInteger12, bigInteger13, bigInteger14, (BigInteger) obj2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 n33.f, still in use, count: 2, list:
          (r1v1 n33.f) from 0x01dc: MOVE (r18v0 n33.f) = (r1v1 n33.f)
          (r1v1 n33.f) from 0x01de: PHI (r18v2 n33.f) = (r18v0 n33.f), (r1v1 n33.f) binds: [B:86:0x01dc, B:80:0x01bc] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: W */
    public static final n33.C26232f m34271W(org.webrtc.RTCStats r60) {
        /*
            Method dump skipped, instruction units count: 2636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p097ds.AbstractC12313p.m34271W(org.webrtc.RTCStats):n33.f");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0218  */
    /* JADX WARN: Code duplicated, block: B:110:0x024a  */
    /* JADX WARN: Code duplicated, block: B:120:0x027c  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:150:0x0312  */
    /* JADX WARN: Code duplicated, block: B:160:0x0344  */
    /* JADX WARN: Code duplicated, block: B:170:0x0376  */
    /* JADX WARN: Code duplicated, block: B:180:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:198:0x0407  */
    /* JADX WARN: Code duplicated, block: B:208:0x0439  */
    /* JADX WARN: Code duplicated, block: B:218:0x046b  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e6  */
    /* JADX INFO: renamed from: X */
    public static final C26233g m34272X(RTCStats rTCStats) {
        String id4 = rTCStats.getId();
        String type = rTCStats.getType();
        double timestampUs = rTCStats.getTimestampUs();
        Object obj = rTCStats.getMembers().get("trackIdentifier");
        Object obj2 = null;
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof String)) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g, "RtcParser", AbstractC21702c.m61134e(obj, "[toRtcStats] 'trackIdentifier' => expected String but found "), null);
            }
            obj = null;
        }
        String str = (String) obj;
        Object obj3 = rTCStats.getMembers().get("ended");
        if (obj3 == null) {
            obj3 = null;
        } else if (!(obj3 instanceof Boolean)) {
            C2343i c2343i2 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g2, "RtcParser", AbstractC21702c.m61134e(obj3, "[toRtcStats] 'ended' => expected Boolean but found "), null);
            }
            obj3 = null;
        }
        Boolean bool = (Boolean) obj3;
        Object obj4 = rTCStats.getMembers().get("kind");
        if (obj4 == null) {
            obj4 = null;
        } else if (!(obj4 instanceof String)) {
            C2343i c2343i3 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.WARN;
            if (interfaceC2339e3.isLoggable(enumC2341g3, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g3, "RtcParser", AbstractC21702c.m61134e(obj4, "[toRtcStats] 'kind' => expected String but found "), null);
            }
            obj4 = null;
        }
        String str2 = (String) obj4;
        Object obj5 = rTCStats.getMembers().get("priority");
        if (obj5 == null) {
            obj5 = null;
        } else if (!(obj5 instanceof String)) {
            C2343i c2343i4 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339e4.isLoggable(enumC2341g4, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g4, "RtcParser", AbstractC21702c.m61134e(obj5, "[toRtcStats] 'priority' => expected String but found "), null);
            }
            obj5 = null;
        }
        String str3 = (String) obj5;
        Object obj6 = rTCStats.getMembers().get("remoteSource");
        if (obj6 == null) {
            obj6 = null;
        } else if (!(obj6 instanceof Boolean)) {
            C2343i c2343i5 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e5 = C2343i.f9272d;
            EnumC2341g enumC2341g5 = EnumC2341g.WARN;
            if (interfaceC2339e5.isLoggable(enumC2341g5, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g5, "RtcParser", AbstractC21702c.m61134e(obj6, "[toRtcStats] 'remoteSource' => expected Boolean but found "), null);
            }
            obj6 = null;
        }
        Boolean bool2 = (Boolean) obj6;
        Object obj7 = rTCStats.getMembers().get("detached");
        if (obj7 == null) {
            obj7 = null;
        } else if (!(obj7 instanceof Boolean)) {
            C2343i c2343i6 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e6 = C2343i.f9272d;
            EnumC2341g enumC2341g6 = EnumC2341g.WARN;
            if (interfaceC2339e6.isLoggable(enumC2341g6, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g6, "RtcParser", AbstractC21702c.m61134e(obj7, "[toRtcStats] 'detached' => expected Boolean but found "), null);
            }
            obj7 = null;
        }
        Boolean bool3 = (Boolean) obj7;
        Object obj8 = rTCStats.getMembers().get("estimatedPlayoutTimestamp");
        if (obj8 == null) {
            obj8 = null;
        } else if (!(obj8 instanceof Double)) {
            C2343i c2343i7 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e7 = C2343i.f9272d;
            EnumC2341g enumC2341g7 = EnumC2341g.WARN;
            if (interfaceC2339e7.isLoggable(enumC2341g7, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g7, "RtcParser", AbstractC21702c.m61134e(obj8, "[toRtcStats] 'estimatedPlayoutTimestamp' => expected Double but found "), null);
            }
            obj8 = null;
        }
        Double d3 = (Double) obj8;
        Object obj9 = rTCStats.getMembers().get("jitterBufferDelay");
        if (obj9 == null) {
            obj9 = null;
        } else if (obj9 instanceof Double) {
            str = str;
        } else {
            C2343i c2343i8 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e8 = C2343i.f9272d;
            EnumC2341g enumC2341g8 = EnumC2341g.WARN;
            if (interfaceC2339e8.isLoggable(enumC2341g8, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g8, "RtcParser", AbstractC21702c.m61134e(obj9, "[toRtcStats] 'jitterBufferDelay' => expected Double but found "), null);
            }
            obj9 = null;
        }
        Double d14 = (Double) obj9;
        Object obj10 = rTCStats.getMembers().get("jitterBufferEmittedCount");
        if (obj10 == null) {
            obj10 = null;
        } else if (obj10 instanceof Long) {
            id4 = id4;
        } else {
            C2343i c2343i9 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e9 = C2343i.f9272d;
            EnumC2341g enumC2341g9 = EnumC2341g.WARN;
            if (interfaceC2339e9.isLoggable(enumC2341g9, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g9, "RtcParser", AbstractC21702c.m61134e(obj10, "[toRtcStats] 'jitterBufferEmittedCount' => expected Long but found "), null);
            }
            obj10 = null;
        }
        Long l7 = (Long) obj10;
        Object obj11 = rTCStats.getMembers().get("totalAudioEnergy");
        if (obj11 == null) {
            obj11 = null;
        } else if (obj11 instanceof Double) {
            l7 = l7;
        } else {
            C2343i c2343i10 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e10 = C2343i.f9272d;
            EnumC2341g enumC2341g10 = EnumC2341g.WARN;
            if (interfaceC2339e10.isLoggable(enumC2341g10, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g10, "RtcParser", AbstractC21702c.m61134e(obj11, "[toRtcStats] 'totalAudioEnergy' => expected Double but found "), null);
            }
            obj11 = null;
        }
        Double d15 = (Double) obj11;
        Object obj12 = rTCStats.getMembers().get("totalInterruptionDuration");
        if (obj12 == null) {
            obj12 = null;
        } else if (obj12 instanceof Double) {
            type = type;
        } else {
            C2343i c2343i11 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e11 = C2343i.f9272d;
            EnumC2341g enumC2341g11 = EnumC2341g.WARN;
            if (interfaceC2339e11.isLoggable(enumC2341g11, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g11, "RtcParser", AbstractC21702c.m61134e(obj12, "[toRtcStats] 'totalInterruptionDuration' => expected Double but found "), null);
            }
            obj12 = null;
        }
        Double d16 = (Double) obj12;
        Object obj13 = rTCStats.getMembers().get("removedSamplesForAcceleration");
        if (obj13 == null) {
            obj13 = null;
        } else if (obj13 instanceof Long) {
            d16 = d16;
        } else {
            C2343i c2343i12 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e12 = C2343i.f9272d;
            EnumC2341g enumC2341g12 = EnumC2341g.WARN;
            if (interfaceC2339e12.isLoggable(enumC2341g12, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g12, "RtcParser", AbstractC21702c.m61134e(obj13, "[toRtcStats] 'removedSamplesForAcceleration' => expected Long but found "), null);
            }
            obj13 = null;
        }
        Long l12 = (Long) obj13;
        Object obj14 = rTCStats.getMembers().get("audioLevel");
        if (obj14 == null) {
            obj14 = null;
        } else if (obj14 instanceof Double) {
            l12 = l12;
        } else {
            C2343i c2343i13 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e13 = C2343i.f9272d;
            EnumC2341g enumC2341g13 = EnumC2341g.WARN;
            if (interfaceC2339e13.isLoggable(enumC2341g13, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g13, "RtcParser", AbstractC21702c.m61134e(obj14, "[toRtcStats] 'audioLevel' => expected Double but found "), null);
            }
            obj14 = null;
        }
        Double d17 = (Double) obj14;
        Object obj15 = rTCStats.getMembers().get("interruptionCount");
        if (obj15 == null) {
            obj15 = null;
        } else if (obj15 instanceof Long) {
            d17 = d17;
        } else {
            C2343i c2343i14 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e14 = C2343i.f9272d;
            EnumC2341g enumC2341g14 = EnumC2341g.WARN;
            if (interfaceC2339e14.isLoggable(enumC2341g14, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g14, "RtcParser", AbstractC21702c.m61134e(obj15, "[toRtcStats] 'interruptionCount' => expected Long but found "), null);
            }
            obj15 = null;
        }
        Long l13 = (Long) obj15;
        Object obj16 = rTCStats.getMembers().get("relativePacketArrivalDelay");
        if (obj16 == null) {
            obj16 = null;
        } else if (obj16 instanceof Double) {
            l13 = l13;
        } else {
            C2343i c2343i15 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e15 = C2343i.f9272d;
            EnumC2341g enumC2341g15 = EnumC2341g.WARN;
            if (interfaceC2339e15.isLoggable(enumC2341g15, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g15, "RtcParser", AbstractC21702c.m61134e(obj16, "[toRtcStats] 'relativePacketArrivalDelay' => expected Double but found "), null);
            }
            obj16 = null;
        }
        Double d18 = (Double) obj16;
        Object obj17 = rTCStats.getMembers().get("jitterBufferFlushes");
        if (obj17 == null) {
            obj17 = null;
        } else if (obj17 instanceof Long) {
            d18 = d18;
        } else {
            C2343i c2343i16 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e16 = C2343i.f9272d;
            EnumC2341g enumC2341g16 = EnumC2341g.WARN;
            if (interfaceC2339e16.isLoggable(enumC2341g16, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g16, "RtcParser", AbstractC21702c.m61134e(obj17, "[toRtcStats] 'jitterBufferFlushes' => expected Long but found "), null);
            }
            obj17 = null;
        }
        Long l14 = (Long) obj17;
        Object obj18 = rTCStats.getMembers().get("concealedSamples");
        if (obj18 == null) {
            obj18 = null;
        } else if (obj18 instanceof Long) {
            l14 = l14;
        } else {
            C2343i c2343i17 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e17 = C2343i.f9272d;
            EnumC2341g enumC2341g17 = EnumC2341g.WARN;
            if (interfaceC2339e17.isLoggable(enumC2341g17, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g17, "RtcParser", AbstractC21702c.m61134e(obj18, "[toRtcStats] 'concealedSamples' => expected Long but found "), null);
            }
            obj18 = null;
        }
        Long l15 = (Long) obj18;
        Object obj19 = rTCStats.getMembers().get("jitterBufferTargetDelay");
        if (obj19 == null) {
            obj19 = null;
        } else if (obj19 instanceof Double) {
            l15 = l15;
        } else {
            C2343i c2343i18 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e18 = C2343i.f9272d;
            EnumC2341g enumC2341g18 = EnumC2341g.WARN;
            if (interfaceC2339e18.isLoggable(enumC2341g18, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g18, "RtcParser", AbstractC21702c.m61134e(obj19, "[toRtcStats] 'jitterBufferTargetDelay' => expected Double but found "), null);
            }
            obj19 = null;
        }
        Double d19 = (Double) obj19;
        Object obj20 = rTCStats.getMembers().get("totalSamplesDuration");
        if (obj20 == null) {
            obj20 = null;
        } else if (obj20 instanceof Double) {
            d19 = d19;
        } else {
            C2343i c2343i19 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e19 = C2343i.f9272d;
            EnumC2341g enumC2341g19 = EnumC2341g.WARN;
            if (interfaceC2339e19.isLoggable(enumC2341g19, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g19, "RtcParser", AbstractC21702c.m61134e(obj20, "[toRtcStats] 'totalSamplesDuration' => expected Double but found "), null);
            }
            obj20 = null;
        }
        Double d24 = (Double) obj20;
        Object obj21 = rTCStats.getMembers().get("insertedSamplesForDeceleration");
        if (obj21 == null) {
            obj21 = null;
        } else if (obj21 instanceof Long) {
            timestampUs = timestampUs;
        } else {
            C2343i c2343i20 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e20 = C2343i.f9272d;
            EnumC2341g enumC2341g20 = EnumC2341g.WARN;
            if (interfaceC2339e20.isLoggable(enumC2341g20, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g20, "RtcParser", AbstractC21702c.m61134e(obj21, "[toRtcStats] 'insertedSamplesForDeceleration' => expected Long but found "), null);
            }
            obj21 = null;
        }
        Long l16 = (Long) obj21;
        Object obj22 = rTCStats.getMembers().get("delayedPacketOutageSamples");
        if (obj22 == null) {
            obj22 = null;
        } else if (!(obj22 instanceof Long)) {
            C2343i c2343i21 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e21 = C2343i.f9272d;
            EnumC2341g enumC2341g21 = EnumC2341g.WARN;
            if (interfaceC2339e21.isLoggable(enumC2341g21, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g21, "RtcParser", AbstractC21702c.m61134e(obj22, "[toRtcStats] 'delayedPacketOutageSamples' => expected Long but found "), null);
            }
            obj22 = null;
        }
        Long l17 = (Long) obj22;
        Object obj23 = rTCStats.getMembers().get("totalSamplesReceived");
        if (obj23 == null) {
            obj23 = null;
        } else if (obj23 instanceof Long) {
            l16 = l16;
        } else {
            C2343i c2343i22 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e22 = C2343i.f9272d;
            EnumC2341g enumC2341g22 = EnumC2341g.WARN;
            if (interfaceC2339e22.isLoggable(enumC2341g22, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g22, "RtcParser", AbstractC21702c.m61134e(obj23, "[toRtcStats] 'totalSamplesReceived' => expected Long but found "), null);
            }
            obj23 = null;
        }
        Long l18 = (Long) obj23;
        Object obj24 = rTCStats.getMembers().get("concealmentEvents");
        if (obj24 == null) {
            obj24 = null;
        } else if (obj24 instanceof Long) {
            l17 = l17;
        } else {
            C2343i c2343i23 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e23 = C2343i.f9272d;
            EnumC2341g enumC2341g23 = EnumC2341g.WARN;
            if (interfaceC2339e23.isLoggable(enumC2341g23, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g23, "RtcParser", AbstractC21702c.m61134e(obj24, "[toRtcStats] 'concealmentEvents' => expected Long but found "), null);
            }
            obj24 = null;
        }
        Long l19 = (Long) obj24;
        Object obj25 = rTCStats.getMembers().get("silentConcealedSamples");
        if (obj25 != null) {
            if (obj25 instanceof Long) {
                obj2 = obj25;
            } else {
                C2343i c2343i24 = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e24 = C2343i.f9272d;
                EnumC2341g enumC2341g24 = EnumC2341g.WARN;
                if (interfaceC2339e24.isLoggable(enumC2341g24, "RtcParser")) {
                    C2343i.f9271c.log(enumC2341g24, "RtcParser", AbstractC21702c.m61134e(obj25, "[toRtcStats] 'silentConcealedSamples' => expected Long but found "), null);
                }
            }
        }
        return new C26233g(id4, type, Double.valueOf(timestampUs), str, bool, str2, str3, bool2, bool3, d3, d14, l7, d17, d15, d24, d16, l12, l13, d18, l14, l15, d19, l16, l17, l18, l19, (Long) obj2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 n33.k, still in use, count: 2, list:
          (r0v0 n33.k) from 0x0177: MOVE (r16v0 n33.k) = (r0v0 n33.k)
          (r0v0 n33.k) from 0x0179: PHI (r16v2 n33.k) = (r16v0 n33.k), (r0v0 n33.k) binds: [B:67:0x0177, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: Y */
    public static final n33.C26237k m34273Y(org.webrtc.RTCStats r27) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p097ds.AbstractC12313p.m34273Y(org.webrtc.RTCStats):n33.k");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0250  */
    /* JADX WARN: Code duplicated, block: B:118:0x0282  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318  */
    /* JADX WARN: Code duplicated, block: B:158:0x034a  */
    /* JADX WARN: Code duplicated, block: B:168:0x037c  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:198:0x0412  */
    /* JADX WARN: Code duplicated, block: B:208:0x0444  */
    /* JADX WARN: Code duplicated, block: B:218:0x0476  */
    /* JADX WARN: Code duplicated, block: B:228:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:238:0x04da  */
    /* JADX WARN: Code duplicated, block: B:248:0x050c  */
    /* JADX WARN: Code duplicated, block: B:258:0x053e  */
    /* JADX WARN: Code duplicated, block: B:272:0x057d  */
    /* JADX WARN: Code duplicated, block: B:298:0x061e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0651  */
    /* JADX WARN: Code duplicated, block: B:318:0x0684  */
    /* JADX WARN: Code duplicated, block: B:328:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:338:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:98:0x021e  */
    /* JADX INFO: renamed from: Z */
    public static final C26238l m34274Z(RTCStats rTCStats) {
        EnumC27517b enumC27517bM79410n;
        Map mapM74000i0;
        Object obj;
        AbstractC22676k.m65750j(rTCStats, "<this>");
        String id4 = rTCStats.getId();
        String type = rTCStats.getType();
        Double dValueOf = Double.valueOf(rTCStats.getTimestampUs());
        Object obj2 = rTCStats.getMembers().get("ssrc");
        if (obj2 == null) {
            obj2 = null;
        } else if (!(obj2 instanceof Long)) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g, "RtcParser", AbstractC21702c.m61134e(obj2, "[toRtcStats] 'ssrc' => expected Long but found "), null);
            }
            obj2 = null;
        }
        Long l7 = (Long) obj2;
        Object obj3 = rTCStats.getMembers().get("kind");
        if (obj3 == null) {
            obj3 = null;
        } else if (!(obj3 instanceof String)) {
            C2343i c2343i2 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g2, "RtcParser", AbstractC21702c.m61134e(obj3, "[toRtcStats] 'kind' => expected String but found "), null);
            }
            obj3 = null;
        }
        String str = (String) obj3;
        Object obj4 = rTCStats.getMembers().get("transportId");
        if (obj4 == null) {
            obj4 = null;
        } else if (!(obj4 instanceof String)) {
            C2343i c2343i3 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.WARN;
            if (interfaceC2339e3.isLoggable(enumC2341g3, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g3, "RtcParser", AbstractC21702c.m61134e(obj4, "[toRtcStats] 'transportId' => expected String but found "), null);
            }
            obj4 = null;
        }
        String str2 = (String) obj4;
        Object obj5 = rTCStats.getMembers().get("codecId");
        if (obj5 == null) {
            obj5 = null;
        } else if (!(obj5 instanceof String)) {
            C2343i c2343i4 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339e4.isLoggable(enumC2341g4, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g4, "RtcParser", AbstractC21702c.m61134e(obj5, "[toRtcStats] 'codecId' => expected String but found "), null);
            }
            obj5 = null;
        }
        String str3 = (String) obj5;
        Object obj6 = rTCStats.getMembers().get("packetsSent");
        if (obj6 == null) {
            obj6 = null;
        } else if (!(obj6 instanceof BigInteger)) {
            C2343i c2343i5 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e5 = C2343i.f9272d;
            EnumC2341g enumC2341g5 = EnumC2341g.WARN;
            if (interfaceC2339e5.isLoggable(enumC2341g5, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g5, "RtcParser", AbstractC21702c.m61134e(obj6, "[toRtcStats] 'packetsSent' => expected BigInteger but found "), null);
            }
            obj6 = null;
        }
        BigInteger bigInteger = (BigInteger) obj6;
        Object obj7 = rTCStats.getMembers().get("packetsLost");
        if (obj7 == null) {
            obj7 = null;
        } else if (!(obj7 instanceof BigInteger)) {
            C2343i c2343i6 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e6 = C2343i.f9272d;
            EnumC2341g enumC2341g6 = EnumC2341g.WARN;
            if (interfaceC2339e6.isLoggable(enumC2341g6, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g6, "RtcParser", AbstractC21702c.m61134e(obj7, "[toRtcStats] 'packetsLost' => expected BigInteger but found "), null);
            }
            obj7 = null;
        }
        BigInteger bigInteger2 = (BigInteger) obj7;
        Object obj8 = rTCStats.getMembers().get("mid");
        if (obj8 == null) {
            obj8 = null;
        } else if (!(obj8 instanceof String)) {
            C2343i c2343i7 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e7 = C2343i.f9272d;
            EnumC2341g enumC2341g7 = EnumC2341g.WARN;
            if (interfaceC2339e7.isLoggable(enumC2341g7, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g7, "RtcParser", AbstractC21702c.m61134e(obj8, "[toRtcStats] 'mid' => expected String but found "), null);
            }
            obj8 = null;
        }
        String str4 = (String) obj8;
        Object obj9 = rTCStats.getMembers().get("mediaSourceId");
        if (obj9 == null) {
            obj9 = null;
        } else if (obj9 instanceof String) {
            l7 = l7;
        } else {
            C2343i c2343i8 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e8 = C2343i.f9272d;
            EnumC2341g enumC2341g8 = EnumC2341g.WARN;
            if (interfaceC2339e8.isLoggable(enumC2341g8, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g8, "RtcParser", AbstractC21702c.m61134e(obj9, "[toRtcStats] 'mediaSourceId' => expected String but found "), null);
            }
            obj9 = null;
        }
        String str5 = (String) obj9;
        Object obj10 = rTCStats.getMembers().get("remoteId");
        if (obj10 == null) {
            obj10 = null;
        } else if (!(obj10 instanceof String)) {
            C2343i c2343i9 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e9 = C2343i.f9272d;
            EnumC2341g enumC2341g9 = EnumC2341g.WARN;
            if (interfaceC2339e9.isLoggable(enumC2341g9, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g9, "RtcParser", AbstractC21702c.m61134e(obj10, "[toRtcStats] 'remoteId' => expected String but found "), null);
            }
            obj10 = null;
        }
        String str6 = (String) obj10;
        Object obj11 = rTCStats.getMembers().get("headerBytesSent");
        if (obj11 == null) {
            obj11 = null;
        } else if (obj11 instanceof BigInteger) {
            str6 = str6;
        } else {
            C2343i c2343i10 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e10 = C2343i.f9272d;
            EnumC2341g enumC2341g10 = EnumC2341g.WARN;
            if (interfaceC2339e10.isLoggable(enumC2341g10, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g10, "RtcParser", AbstractC21702c.m61134e(obj11, "[toRtcStats] 'headerBytesSent' => expected BigInteger but found "), null);
            }
            obj11 = null;
        }
        BigInteger bigInteger3 = (BigInteger) obj11;
        Object obj12 = rTCStats.getMembers().get("retransmittedPacketsSent");
        if (obj12 == null) {
            obj12 = null;
        } else if (obj12 instanceof BigInteger) {
            id4 = id4;
        } else {
            C2343i c2343i11 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e11 = C2343i.f9272d;
            EnumC2341g enumC2341g11 = EnumC2341g.WARN;
            if (interfaceC2339e11.isLoggable(enumC2341g11, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g11, "RtcParser", AbstractC21702c.m61134e(obj12, "[toRtcStats] 'retransmittedPacketsSent' => expected BigInteger but found "), null);
            }
            obj12 = null;
        }
        BigInteger bigInteger4 = (BigInteger) obj12;
        Object obj13 = rTCStats.getMembers().get("retransmittedBytesSent");
        if (obj13 == null) {
            obj13 = null;
        } else if (obj13 instanceof BigInteger) {
            type = type;
        } else {
            C2343i c2343i12 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e12 = C2343i.f9272d;
            EnumC2341g enumC2341g12 = EnumC2341g.WARN;
            if (interfaceC2339e12.isLoggable(enumC2341g12, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g12, "RtcParser", AbstractC21702c.m61134e(obj13, "[toRtcStats] 'retransmittedBytesSent' => expected BigInteger but found "), null);
            }
            obj13 = null;
        }
        BigInteger bigInteger5 = (BigInteger) obj13;
        Object obj14 = rTCStats.getMembers().get("rtxSsrc");
        if (obj14 == null) {
            obj14 = null;
        } else if (obj14 instanceof Long) {
            bigInteger5 = bigInteger5;
        } else {
            C2343i c2343i13 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e13 = C2343i.f9272d;
            EnumC2341g enumC2341g13 = EnumC2341g.WARN;
            if (interfaceC2339e13.isLoggable(enumC2341g13, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g13, "RtcParser", AbstractC21702c.m61134e(obj14, "[toRtcStats] 'rtxSsrc' => expected Long but found "), null);
            }
            obj14 = null;
        }
        Long l12 = (Long) obj14;
        Object obj15 = rTCStats.getMembers().get("targetBitrate");
        if (obj15 == null) {
            obj15 = null;
        } else if (obj15 instanceof Double) {
            l12 = l12;
        } else {
            C2343i c2343i14 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e14 = C2343i.f9272d;
            EnumC2341g enumC2341g14 = EnumC2341g.WARN;
            if (interfaceC2339e14.isLoggable(enumC2341g14, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g14, "RtcParser", AbstractC21702c.m61134e(obj15, "[toRtcStats] 'targetBitrate' => expected Double but found "), null);
            }
            obj15 = null;
        }
        Double d3 = (Double) obj15;
        Object obj16 = rTCStats.getMembers().get("totalEncodedBytesTarget");
        if (obj16 == null) {
            obj16 = null;
        } else if (obj16 instanceof BigInteger) {
            d3 = d3;
        } else {
            C2343i c2343i15 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e15 = C2343i.f9272d;
            EnumC2341g enumC2341g15 = EnumC2341g.WARN;
            if (interfaceC2339e15.isLoggable(enumC2341g15, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g15, "RtcParser", AbstractC21702c.m61134e(obj16, "[toRtcStats] 'totalEncodedBytesTarget' => expected BigInteger but found "), null);
            }
            obj16 = null;
        }
        BigInteger bigInteger6 = (BigInteger) obj16;
        Object obj17 = rTCStats.getMembers().get("totalEncodeTime");
        if (obj17 == null) {
            obj17 = null;
        } else if (obj17 instanceof Double) {
            bigInteger6 = bigInteger6;
        } else {
            C2343i c2343i16 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e16 = C2343i.f9272d;
            EnumC2341g enumC2341g16 = EnumC2341g.WARN;
            if (interfaceC2339e16.isLoggable(enumC2341g16, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g16, "RtcParser", AbstractC21702c.m61134e(obj17, "[toRtcStats] 'totalEncodeTime' => expected Double but found "), null);
            }
            obj17 = null;
        }
        Double d14 = (Double) obj17;
        Object obj18 = rTCStats.getMembers().get("totalPacketSendDelay");
        if (obj18 == null) {
            obj18 = null;
        } else if (obj18 instanceof Double) {
            d14 = d14;
        } else {
            C2343i c2343i17 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e17 = C2343i.f9272d;
            EnumC2341g enumC2341g17 = EnumC2341g.WARN;
            if (interfaceC2339e17.isLoggable(enumC2341g17, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g17, "RtcParser", AbstractC21702c.m61134e(obj18, "[toRtcStats] 'totalPacketSendDelay' => expected Double but found "), null);
            }
            obj18 = null;
        }
        Double d15 = (Double) obj18;
        Object obj19 = rTCStats.getMembers().get("active");
        if (obj19 == null) {
            obj19 = null;
        } else if (obj19 instanceof Boolean) {
            d15 = d15;
        } else {
            C2343i c2343i18 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e18 = C2343i.f9272d;
            EnumC2341g enumC2341g18 = EnumC2341g.WARN;
            if (interfaceC2339e18.isLoggable(enumC2341g18, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g18, "RtcParser", AbstractC21702c.m61134e(obj19, "[toRtcStats] 'active' => expected Boolean but found "), null);
            }
            obj19 = null;
        }
        Boolean bool = (Boolean) obj19;
        Object obj20 = rTCStats.getMembers().get("rid");
        if (obj20 == null) {
            obj20 = null;
        } else if (obj20 instanceof String) {
            bool = bool;
        } else {
            C2343i c2343i19 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e19 = C2343i.f9272d;
            EnumC2341g enumC2341g19 = EnumC2341g.WARN;
            if (interfaceC2339e19.isLoggable(enumC2341g19, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g19, "RtcParser", AbstractC21702c.m61134e(obj20, "[toRtcStats] 'rid' => expected String but found "), null);
            }
            obj20 = null;
        }
        String str7 = (String) obj20;
        Object obj21 = rTCStats.getMembers().get("frameWidth");
        if (obj21 == null) {
            obj21 = null;
        } else if (obj21 instanceof Long) {
            str7 = str7;
        } else {
            C2343i c2343i20 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e20 = C2343i.f9272d;
            EnumC2341g enumC2341g20 = EnumC2341g.WARN;
            if (interfaceC2339e20.isLoggable(enumC2341g20, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g20, "RtcParser", AbstractC21702c.m61134e(obj21, "[toRtcStats] 'frameWidth' => expected Long but found "), null);
            }
            obj21 = null;
        }
        Long l13 = (Long) obj21;
        Object obj22 = rTCStats.getMembers().get("frameHeight");
        if (obj22 == null) {
            obj22 = null;
        } else if (obj22 instanceof Long) {
            l13 = l13;
        } else {
            C2343i c2343i21 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e21 = C2343i.f9272d;
            EnumC2341g enumC2341g21 = EnumC2341g.WARN;
            if (interfaceC2339e21.isLoggable(enumC2341g21, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g21, "RtcParser", AbstractC21702c.m61134e(obj22, "[toRtcStats] 'frameHeight' => expected Long but found "), null);
            }
            obj22 = null;
        }
        Long l14 = (Long) obj22;
        Object obj23 = rTCStats.getMembers().get("framesPerSecond");
        if (obj23 == null) {
            obj23 = null;
        } else if (obj23 instanceof Double) {
            l14 = l14;
        } else {
            C2343i c2343i22 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e22 = C2343i.f9272d;
            EnumC2341g enumC2341g22 = EnumC2341g.WARN;
            if (interfaceC2339e22.isLoggable(enumC2341g22, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g22, "RtcParser", AbstractC21702c.m61134e(obj23, "[toRtcStats] 'framesPerSecond' => expected Double but found "), null);
            }
            obj23 = null;
        }
        Double d16 = (Double) obj23;
        Object obj24 = rTCStats.getMembers().get("framesSent");
        if (obj24 == null) {
            obj24 = null;
        } else if (obj24 instanceof Long) {
            d16 = d16;
        } else {
            C2343i c2343i23 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e23 = C2343i.f9272d;
            EnumC2341g enumC2341g23 = EnumC2341g.WARN;
            if (interfaceC2339e23.isLoggable(enumC2341g23, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g23, "RtcParser", AbstractC21702c.m61134e(obj24, "[toRtcStats] 'framesSent' => expected Long but found "), null);
            }
            obj24 = null;
        }
        Long l15 = (Long) obj24;
        Object obj25 = rTCStats.getMembers().get("hugeFramesSent");
        if (obj25 == null) {
            obj25 = null;
        } else if (obj25 instanceof Long) {
            l15 = l15;
        } else {
            C2343i c2343i24 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e24 = C2343i.f9272d;
            EnumC2341g enumC2341g24 = EnumC2341g.WARN;
            if (interfaceC2339e24.isLoggable(enumC2341g24, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g24, "RtcParser", AbstractC21702c.m61134e(obj25, "[toRtcStats] 'hugeFramesSent' => expected Long but found "), null);
            }
            obj25 = null;
        }
        Long l16 = (Long) obj25;
        Object obj26 = rTCStats.getMembers().get("framesEncoded");
        if (obj26 == null) {
            obj26 = null;
        } else if (obj26 instanceof Long) {
            l16 = l16;
        } else {
            C2343i c2343i25 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e25 = C2343i.f9272d;
            EnumC2341g enumC2341g25 = EnumC2341g.WARN;
            if (interfaceC2339e25.isLoggable(enumC2341g25, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g25, "RtcParser", AbstractC21702c.m61134e(obj26, "[toRtcStats] 'framesEncoded' => expected Long but found "), null);
            }
            obj26 = null;
        }
        Long l17 = (Long) obj26;
        Object obj27 = rTCStats.getMembers().get("keyFramesEncoded");
        if (obj27 == null) {
            obj27 = null;
        } else if (obj27 instanceof Long) {
            l17 = l17;
        } else {
            C2343i c2343i26 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e26 = C2343i.f9272d;
            EnumC2341g enumC2341g26 = EnumC2341g.WARN;
            if (interfaceC2339e26.isLoggable(enumC2341g26, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g26, "RtcParser", AbstractC21702c.m61134e(obj27, "[toRtcStats] 'keyFramesEncoded' => expected Long but found "), null);
            }
            obj27 = null;
        }
        Long l18 = (Long) obj27;
        Object obj28 = rTCStats.getMembers().get("qpSum");
        if (obj28 == null) {
            obj28 = null;
        } else if (obj28 instanceof BigInteger) {
            l18 = l18;
        } else {
            C2343i c2343i27 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e27 = C2343i.f9272d;
            EnumC2341g enumC2341g27 = EnumC2341g.WARN;
            if (interfaceC2339e27.isLoggable(enumC2341g27, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g27, "RtcParser", AbstractC21702c.m61134e(obj28, "[toRtcStats] 'qpSum' => expected BigInteger but found "), null);
            }
            obj28 = null;
        }
        BigInteger bigInteger7 = (BigInteger) obj28;
        Object obj29 = rTCStats.getMembers().get("qualityLimitationReason");
        if (obj29 == null) {
            obj29 = null;
        } else if (obj29 instanceof String) {
            bigInteger7 = bigInteger7;
        } else {
            C2343i c2343i28 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e28 = C2343i.f9272d;
            EnumC2341g enumC2341g28 = EnumC2341g.WARN;
            if (interfaceC2339e28.isLoggable(enumC2341g28, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g28, "RtcParser", AbstractC21702c.m61134e(obj29, "[toRtcStats] 'qualityLimitationReason' => expected String but found "), null);
            }
            obj29 = null;
        }
        String str8 = (String) obj29;
        if (str8 != null) {
            EnumC27517b.f110802x.getClass();
            enumC27517bM79410n = C26702o.m79410n(str8);
        } else {
            enumC27517bM79410n = null;
        }
        Object obj30 = rTCStats.getMembers().get("qualityLimitationDurations");
        if (obj30 == null) {
            obj30 = null;
        } else if (obj30 instanceof Map) {
            enumC27517bM79410n = enumC27517bM79410n;
        } else {
            C2343i c2343i29 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e29 = C2343i.f9272d;
            EnumC2341g enumC2341g29 = EnumC2341g.WARN;
            if (interfaceC2339e29.isLoggable(enumC2341g29, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g29, "RtcParser", AbstractC21702c.m61134e(obj30, "[toRtcStats] 'qualityLimitationDurations' => expected Map but found "), null);
            }
            obj30 = null;
        }
        Map map = (Map) obj30;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                C26702o c26702o = EnumC27517b.f110802x;
                String str9 = (String) entry.getKey();
                c26702o.getClass();
                arrayList.add(new C23465k(C26702o.m79410n(str9), entry.getValue()));
            }
            mapM74000i0 = AbstractC25247g0.m74000i0(arrayList);
        } else {
            mapM74000i0 = null;
        }
        Object obj31 = rTCStats.getMembers().get("qualityLimitationResolutionChanges");
        if (obj31 == null) {
            obj31 = null;
        } else if (!(obj31 instanceof Long)) {
            C2343i c2343i30 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e30 = C2343i.f9272d;
            EnumC2341g enumC2341g30 = EnumC2341g.WARN;
            if (interfaceC2339e30.isLoggable(enumC2341g30, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g30, "RtcParser", AbstractC21702c.m61134e(obj31, "[toRtcStats] 'qualityLimitationResolutionChanges' => expected Long but found "), null);
            }
            obj31 = null;
        }
        Long l19 = (Long) obj31;
        Object obj32 = rTCStats.getMembers().get("nackCount");
        if (obj32 == null) {
            obj32 = null;
        } else if (obj32 instanceof Long) {
            mapM74000i0 = mapM74000i0;
        } else {
            C2343i c2343i31 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e31 = C2343i.f9272d;
            EnumC2341g enumC2341g31 = EnumC2341g.WARN;
            if (interfaceC2339e31.isLoggable(enumC2341g31, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g31, "RtcParser", AbstractC21702c.m61134e(obj32, "[toRtcStats] 'nackCount' => expected Long but found "), null);
            }
            obj32 = null;
        }
        Long l24 = (Long) obj32;
        Object obj33 = rTCStats.getMembers().get("firCount");
        if (obj33 == null) {
            obj33 = null;
        } else if (obj33 instanceof Long) {
            l19 = l19;
        } else {
            C2343i c2343i32 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e32 = C2343i.f9272d;
            EnumC2341g enumC2341g32 = EnumC2341g.WARN;
            if (interfaceC2339e32.isLoggable(enumC2341g32, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g32, "RtcParser", AbstractC21702c.m61134e(obj33, "[toRtcStats] 'firCount' => expected Long but found "), null);
            }
            obj33 = null;
        }
        Long l25 = (Long) obj33;
        Object obj34 = rTCStats.getMembers().get("pliCount");
        if (obj34 == null) {
            obj34 = null;
        } else if (obj34 instanceof Long) {
            l25 = l25;
        } else {
            C2343i c2343i33 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e33 = C2343i.f9272d;
            EnumC2341g enumC2341g33 = EnumC2341g.WARN;
            if (interfaceC2339e33.isLoggable(enumC2341g33, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g33, "RtcParser", AbstractC21702c.m61134e(obj34, "[toRtcStats] 'pliCount' => expected Long but found "), null);
            }
            obj34 = null;
        }
        Long l26 = (Long) obj34;
        Object obj35 = rTCStats.getMembers().get("encoderImplementation");
        if (obj35 == null) {
            obj35 = null;
        } else if (obj35 instanceof String) {
            l26 = l26;
        } else {
            C2343i c2343i34 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e34 = C2343i.f9272d;
            EnumC2341g enumC2341g34 = EnumC2341g.WARN;
            if (interfaceC2339e34.isLoggable(enumC2341g34, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g34, "RtcParser", AbstractC21702c.m61134e(obj35, "[toRtcStats] 'encoderImplementation' => expected String but found "), null);
            }
            obj35 = null;
        }
        String str10 = (String) obj35;
        Object obj36 = rTCStats.getMembers().get("powerEfficientEncoder");
        if (obj36 == null) {
            obj36 = null;
        } else if (obj36 instanceof Boolean) {
            str10 = str10;
        } else {
            C2343i c2343i35 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e35 = C2343i.f9272d;
            EnumC2341g enumC2341g35 = EnumC2341g.WARN;
            if (interfaceC2339e35.isLoggable(enumC2341g35, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g35, "RtcParser", AbstractC21702c.m61134e(obj36, "[toRtcStats] 'powerEfficientEncoder' => expected Boolean but found "), null);
            }
            obj36 = null;
        }
        Boolean bool2 = (Boolean) obj36;
        Object obj37 = rTCStats.getMembers().get("scalabilityMode");
        if (obj37 == null) {
            l24 = l24;
            obj37 = null;
        } else if (obj37 instanceof String) {
            l24 = l24;
        } else {
            C2343i c2343i36 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e36 = C2343i.f9272d;
            EnumC2341g enumC2341g36 = EnumC2341g.WARN;
            if (interfaceC2339e36.isLoggable(enumC2341g36, "RtcParser")) {
                obj = null;
                C2343i.f9271c.log(enumC2341g36, "RtcParser", AbstractC21702c.m61134e(obj37, "[toRtcStats] 'scalabilityMode' => expected String but found "), null);
            } else {
                obj = null;
            }
            obj37 = obj;
        }
        return new C26238l(id4, type, dValueOf, l7, str, str2, str3, bigInteger, bigInteger2, str4, str5, str6, bigInteger3, bigInteger4, bigInteger5, l12, d3, bigInteger6, d14, d15, bool, str7, l13, l14, d16, l15, l16, l17, l18, bigInteger7, enumC27517bM79410n, mapM74000i0, l19, l24, l25, l26, str10, bool2, (String) obj37);
    }

    /* JADX INFO: renamed from: a */
    public static final void m34275a(boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-102088289);
        if ((((c28655q.m87155h(z4) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
            if (z4) {
                c28655q.m87150e0(-619527114);
                boolean zM87153g = c28655q.m87153g(interfaceC2464x2);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0150h(interfaceC2464x2, null, 5);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3911b(z4, i13, 0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 n33.m, still in use, count: 2, list:
          (r0v0 n33.m) from 0x0177: MOVE (r16v0 n33.m) = (r0v0 n33.m)
          (r0v0 n33.m) from 0x0179: PHI (r16v2 n33.m) = (r16v0 n33.m), (r0v0 n33.m) binds: [B:67:0x0177, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: a0 */
    public static final n33.C26239m m34276a0(org.webrtc.RTCStats r21) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p097ds.AbstractC12313p.m34276a0(org.webrtc.RTCStats):n33.m");
    }

    /* JADX INFO: renamed from: b */
    public static final void m34277b(C16845k state, Modifier modifier, float f13, InterfaceC4339a onDismissed, C37816b c37816b, Composer composer, int i13, int i14) {
        float f14;
        Modifier modifier2;
        C16839e c16839e;
        Modifier modifier3;
        float f15;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onDismissed, "onDismissed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(562638930);
        int i15 = (c28655q.m87157i(state) ? 4 : 2) | i13 | 48;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                f14 = f13;
                int i16 = c28655q.m87147d(f14) ? 256 : 128;
                i15 |= i16;
            } else {
                f14 = f13;
            }
            i15 |= i16;
        } else {
            f14 = f13;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onDismissed) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier3 = modifier;
            f15 = f14;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                int i17 = i14 & 4;
                modifier2 = C2314t.f9131w;
                if (i17 != 0) {
                    f14 = AbstractC11673r.m31083l(c28655q).f37678b;
                    i15 &= -897;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                modifier2 = modifier;
            }
            float f16 = f14;
            c28655q.m87175r();
            C4802c c4802c = AbstractC4803d.f19791b;
            c28655q.m87152f0(-715745933);
            c28655q.m87152f0(1009281237);
            C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4980f;
            ViewParent parent = ((View) c28655q.m87161k(c28674u2)).getParent();
            InterfaceC30057d interfaceC30057d = null;
            InterfaceC3950b0 interfaceC3950b0 = parent instanceof InterfaceC3950b0 ? (InterfaceC3950b0) parent : null;
            Window window = interfaceC3950b0 != null ? interfaceC3950b0.getWindow() : null;
            if (window == null) {
                Context context = ((View) c28655q.m87161k(c28674u2)).getContext();
                AbstractC22676k.m65749i(context, "getContext(...)");
                while (true) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            window = null;
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                            AbstractC22676k.m65749i(context, "getBaseContext(...)");
                        }
                    } else {
                        window = ((Activity) context).getWindow();
                        break;
                    }
                }
            }
            c28655q.m87173q(false);
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            c28655q.m87152f0(-1044852491);
            boolean zM87153g = c28655q.m87153g(view) | c28655q.m87153g(window);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C4800a(view, window);
                c28655q.m87172p0(objM87133R);
            }
            C4800a c4800a = (C4800a) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            long jM51541c = C17919x.m51541c(0.32f, C17919x.f69625b);
            c28655q.m87150e0(769413883);
            long jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
            c28655q.m87150e0(-392358919);
            Object objM87133R2 = c28655q.m87133R();
            float fM51543e = 0.0f;
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C16839e(AbstractC33253j.m105491g(f16, f16, 0.0f, 0.0f, 12), jM43093h, jM51541c);
                c28655q.m87172p0(objM87133R2);
            }
            C16839e c16839e2 = (C16839e) objM87133R2;
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            c28655q.m87150e0(-1310521416);
            int i18 = i15 & 14;
            boolean z4 = i18 == 4 || c28655q.m87157i(state);
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C0150h(state, interfaceC30057d, 16);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            if (state.f64729a.m43222c() == EnumC15209z3.f57107x) {
                fM51543e = C17919x.m51543e(c16839e2.f64711c);
            }
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM51543e, AbstractC11348f.m30574v(0, 0, null, 7), "StatusBarColorAlpha", null, c28655q, 3120, 20);
            Float fValueOf = Float.valueOf(((Number) interfaceC28670t2M30588b.getValue()).floatValue());
            c28655q.m87150e0(-1310508480);
            boolean zM87153g2 = c28655q.m87153g(c4800a) | c28655q.m87157i(c16839e2) | c28655q.m87153g(interfaceC28670t2M30588b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v0) {
                c16839e = c16839e2;
                objM87133R4 = new C2147u(c4800a, c16839e, interfaceC28670t2M30588b, interfaceC30057d, 15);
                c28655q.m87172p0(objM87133R4);
            } else {
                c16839e = c16839e2;
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87254h(c4800a, fValueOf, (InterfaceC4351m) objM87133R4, c28655q);
            c28655q.m87150e0(-1310501978);
            boolean zM87153g3 = c28655q.m87153g(c4800a);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87153g3 || objM87133R5 == c28676v0) {
                objM87133R5 = new C0150h(c4800a, interfaceC30057d, 17);
                c28655q.m87172p0(objM87133R5);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c4800a);
            modifier3 = modifier2;
            AbstractC35785b.m113411f(state, c16839e, modifier3, onDismissed, c37816b, c28655q, (i15 & 7168) | i18 | 392 | 24576);
            f15 = f16;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4224b(state, modifier3, f15, onDismissed, c37816b, i13, i14, 5);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 n33.n, still in use, count: 2, list:
          (r0v0 n33.n) from 0x0177: MOVE (r16v0 n33.n) = (r0v0 n33.n)
          (r0v0 n33.n) from 0x0179: PHI (r16v2 n33.n) = (r16v0 n33.n), (r0v0 n33.n) binds: [B:67:0x0177, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: b0 */
    public static final n33.C26240n m34278b0(org.webrtc.RTCStats r21) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p097ds.AbstractC12313p.m34278b0(org.webrtc.RTCStats):n33.n");
    }

    /* JADX INFO: renamed from: c */
    public static final void m34279c(AbstractC12605c abstractC12605c, InterfaceC41211c interfaceC41211c, C0314n1 c0314n1, InterfaceC0305k1 interfaceC0305k1, InterfaceC41211c interfaceC41211c2, InterfaceC30881s interfaceC30881s, C29808b c29808b, Composer composer, int i13) {
        int i14;
        InterfaceC41211c interfaceC41211c3;
        C0314n1 c0314n2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-131118148);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC12605c) : c28655q.m87157i(abstractC12605c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            interfaceC41211c3 = interfaceC41211c;
            i14 |= c28655q.m87157i(interfaceC41211c3) ? 32 : 16;
        } else {
            interfaceC41211c3 = interfaceC41211c;
        }
        if ((i13 & 384) == 0) {
            c0314n2 = c0314n1;
            i14 |= c28655q.m87157i(c0314n2) ? 256 : 128;
        } else {
            c0314n2 = c0314n1;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(interfaceC0305k1) : c28655q.m87157i(interfaceC0305k1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC41211c2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= (262144 & i13) == 0 ? c28655q.m87153g(interfaceC30881s) : c28655q.m87157i(interfaceC30881s) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= (2097152 & i13) == 0 ? c28655q.m87153g(c29808b) : c28655q.m87157i(c29808b) ? 1048576 : 524288;
        }
        if ((i14 & 599187) == 599186 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            int iOrdinal = interfaceC30881s.mo94929h().ordinal();
            C2314t c2314t = C2314t.f9131w;
            if (iOrdinal == 0) {
                c28655q.m87150e0(-829118703);
                Modifier modifierM3355a = AbstractC1091c.m3355a(c2314t, null, 3);
                c28655q.m87150e0(-480887246);
                m34281d(abstractC12605c, interfaceC41211c, c0314n1, interfaceC0305k1, interfaceC41211c2, interfaceC30881s, c29808b, modifierM3355a, c28655q, 2097160);
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else {
                if (iOrdinal != 1) {
                    throw AbstractC11895b.m32003v(1774366492, c28655q, false);
                }
                c28655q.m87150e0(-828989867);
                Modifier modifierM3355a2 = AbstractC1091c.m3355a(c2314t, null, 3);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3355a2);
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
                c28655q.m87150e0(-480887246);
                m34281d(abstractC12605c, interfaceC41211c3, c0314n2, interfaceC0305k1, interfaceC41211c2, interfaceC30881s, c29808b, c2314t, c28655q, 14680072);
                AbstractC25012a.m73392y(c28655q, false, true, false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(abstractC12605c, interfaceC41211c, c0314n1, interfaceC0305k1, interfaceC41211c2, interfaceC30881s, c29808b, i13);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 n33.o, still in use, count: 2, list:
          (r0v0 n33.o) from 0x0177: MOVE (r16v0 n33.o) = (r0v0 n33.o)
          (r0v0 n33.o) from 0x0179: PHI (r16v2 n33.o) = (r16v0 n33.o), (r0v0 n33.o) binds: [B:67:0x0177, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: c0 */
    public static final n33.C26241o m34280c0(org.webrtc.RTCStats r21) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p097ds.AbstractC12313p.m34280c0(org.webrtc.RTCStats):n33.o");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0228  */
    /* JADX WARN: Code duplicated, block: B:115:0x025f  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:132:0x031a  */
    /* JADX WARN: Code duplicated, block: B:133:0x031e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0339  */
    /* JADX WARN: Code duplicated, block: B:146:0x0354  */
    /* JADX WARN: Code duplicated, block: B:155:0x0399  */
    /* JADX WARN: Code duplicated, block: B:90:0x0159  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x0194  */
    /* JADX WARN: Code duplicated, block: B:99:0x0204  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: d */
    public static final void m34281d(AbstractC12605c abstractC12605c, InterfaceC41211c interfaceC41211c, C0314n1 c0314n1, InterfaceC0305k1 interfaceC0305k1, InterfaceC41211c interfaceC41211c2, InterfaceC30881s interfaceC30881s, C29808b c29808b, Modifier modifier, Composer composer, int i13) {
        int i14;
        C22957g c22957g;
        C2314t c2314t;
        boolean z4;
        C2305k c2305k;
        C0209i c0209i;
        ?? r10;
        ?? r14;
        int iHashCode;
        C0209i c0209i2;
        ?? r15;
        C0209i c0209i3;
        String str;
        int i15;
        int iHashCode2;
        ?? r16;
        boolean z13;
        ?? r17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1193301967);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC12605c) : c28655q.m87157i(abstractC12605c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC41211c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c0314n1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(interfaceC0305k1) : c28655q.m87157i(interfaceC0305k1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC41211c2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= (262144 & i13) == 0 ? c28655q.m87153g(interfaceC30881s) : c28655q.m87157i(interfaceC30881s) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= (2097152 & i13) == 0 ? c28655q.m87153g(c29808b) : c28655q.m87157i(c29808b) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 8388608 : 4194304;
        }
        int i16 = i14;
        if ((i16 & 4793491) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
            r17 = c28655q;
        } else {
            C11669n c11669n = C11671p.f37680a;
            C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
            Modifier modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, interfaceC30881s.mo94930i(), 7);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S) {
                c22957g = c22957g2;
            } else {
                c22957g = c22957g2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                c28655q.m87150e0(994812297);
                c2314t = C2314t.f9131w;
                if (interfaceC41211c == null) {
                    z4 = false;
                } else {
                    z4 = false;
                    AbstractC32004s.m99532a(AbstractC35785b.m113396S(interfaceC41211c, c28655q), AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 16, 7)), c28655q, 0, 0);
                }
                c28655q.m87173q(z4);
                c28655q.m87150e0(994820743);
                if (c0314n1 == null) {
                    c2305k = c2305k2;
                    c0209i = c0209i5;
                    r10 = z4;
                } else {
                    c2305k = c2305k2;
                    c0209i = c0209i5;
                    r10 = 0;
                    m34298p(c0314n1, interfaceC0305k1, c0314n1.f1086h, c0314n1.f1087i, interfaceC30881s.mo94934x(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, interfaceC30881s.mo94934x() - interfaceC30881s.mo94932m(), 7), new C35473j0(abstractC12605c.f43025w.f64413P), c0314n1.f1084f, c28655q, (i16 >> 6) & 112);
                }
                r14 = c28655q;
                r14.m87173q(r10);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, r14, r10);
                iHashCode = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r14.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r14, modifierM3409f);
                r14.m87158i0();
                if (r14.f115903S) {
                    r14.m87163l(c0213j);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i4, c23010xM66775a2);
                C0209i c0209i8 = c0209i;
                AbstractC28683x.m87239G(r14, c0209i8, interfaceC28653p1M87165m2);
                if (r14.f115903S && AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode))) {
                    c0209i2 = c0209i6;
                } else {
                    c0209i2 = c0209i6;
                    AbstractC11266d.m30471y(iHashCode, r14, iHashCode, c0209i2);
                }
                AbstractC28683x.m87239G(r14, c0209i7, modifierM118962N2);
                AbstractC20301a.m56336e(abstractC12605c.f43026x, AbstractC37817c.m121344e(-134733669, r14, new C2140n(interfaceC30881s, 2)), r14, 48);
                r14.m87173q(true);
                r14.m87150e0(994850614);
                if (c29808b == null && c29808b.f121864b) {
                    r15 = 1;
                } else {
                    r15 = r10;
                }
                if (r15 == 0 && interfaceC30881s.mo94933s()) {
                    InterfaceC41211c interfaceC41211c3 = c29808b.f121863a;
                    r14.m87150e0(994855664);
                    String strM113396S = interfaceC41211c3 == null ? null : AbstractC35785b.m113396S(interfaceC41211c3, r14);
                    r14.m87173q(r10);
                    str = "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG";
                    c0209i3 = c0209i2;
                    AbstractC32069a.m99663a(strM113396S, AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1099a.m3393o(c22976l1M31081j, c2314t), 0.0f, 0.0f, 0.0f, 8, 7), "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG"), 0, 0, null, r14, 0, 28);
                } else {
                    c0209i3 = c0209i2;
                    str = "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG";
                }
                r14.m87173q(r10);
                r14.m87150e0(994863825);
                if (interfaceC41211c2 == null) {
                    i15 = 8;
                } else {
                    i15 = 8;
                    AbstractC35903f.m114006a(AbstractC35785b.m113396S(interfaceC41211c2, r14), AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1099a.m3393o(c22976l1M31081j, c2314t), 0.0f, 2, 0.0f, 8, 5), "PAYMENT_SHEET_ERROR"), r14, r10);
                }
                r14.m87173q(r10);
                r14.m87173q(true);
                m34292j(abstractC12605c, r14, (i16 & 14) | i15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, r10);
                iHashCode2 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r14.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r14, modifier);
                r14.m87158i0();
                if (r14.f115903S) {
                    r14.m87163l(c0213j);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i4, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(r14, c0209i8, interfaceC28653p1M87165m3);
                if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(r14, c0209i7, modifierM118962N3);
                r14.m87150e0(994875924);
                if (c29808b != null || c29808b.f121864b) {
                    r16 = r10;
                } else {
                    r16 = 1;
                }
                if (r16 == 0 && interfaceC30881s.mo94933s()) {
                    InterfaceC41211c interfaceC41211c4 = c29808b.f121863a;
                    r14.m87150e0(994881008);
                    String strM113396S2 = interfaceC41211c4 != null ? AbstractC35785b.m113396S(interfaceC41211c4, r14) : null;
                    r14.m87173q(r10);
                    z13 = true;
                    AbstractC32069a.m99663a(strM113396S2, AbstractC1136a.m3599a(AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1099a.m3398t(c2314t, 0.0f, 8, 0.0f, 0.0f, 13)), str), 0, 0, null, r14, 0, 28);
                } else {
                    z13 = true;
                }
                r14.m87173q(r10);
                r14.m87173q(z13);
                r17 = r14;
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N);
            c28655q.m87150e0(994812297);
            c2314t = C2314t.f9131w;
            if (interfaceC41211c == null) {
                z4 = false;
            } else {
                z4 = false;
                AbstractC32004s.m99532a(AbstractC35785b.m113396S(interfaceC41211c, c28655q), AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 16, 7)), c28655q, 0, 0);
            }
            c28655q.m87173q(z4);
            c28655q.m87150e0(994820743);
            if (c0314n1 == null) {
                c2305k = c2305k2;
                c0209i = c0209i5;
                r10 = z4;
            } else {
                c2305k = c2305k2;
                c0209i = c0209i5;
                r10 = 0;
                m34298p(c0314n1, interfaceC0305k1, c0314n1.f1086h, c0314n1.f1087i, interfaceC30881s.mo94934x(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, interfaceC30881s.mo94934x() - interfaceC30881s.mo94932m(), 7), new C35473j0(abstractC12605c.f43025w.f64413P), c0314n1.f1084f, c28655q, (i16 >> 6) & 112);
            }
            r14 = c28655q;
            r14.m87173q(r10);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, r14, r10);
            iHashCode = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = r14.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(r14, modifierM3409f2);
            r14.m87158i0();
            if (r14.f115903S) {
                r14.m87163l(c0213j);
            } else {
                r14.m87178s0();
            }
            AbstractC28683x.m87239G(r14, c0209i4, c23010xM66775a3);
            C0209i c0209i10 = c0209i;
            AbstractC28683x.m87239G(r14, c0209i10, interfaceC28653p1M87165m4);
            if (r14.f115903S) {
                c0209i2 = c0209i6;
                AbstractC11266d.m30471y(iHashCode, r14, iHashCode, c0209i2);
            } else {
                c0209i2 = c0209i6;
                AbstractC11266d.m30471y(iHashCode, r14, iHashCode, c0209i2);
            }
            AbstractC28683x.m87239G(r14, c0209i9, modifierM118962N4);
            AbstractC20301a.m56336e(abstractC12605c.f43026x, AbstractC37817c.m121344e(-134733669, r14, new C2140n(interfaceC30881s, 2)), r14, 48);
            r14.m87173q(true);
            r14.m87150e0(994850614);
            if (c29808b == null) {
                r15 = r10;
            } else {
                r15 = r10;
            }
            if (r15 == 0) {
                c0209i3 = c0209i2;
                str = "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG";
            } else {
                c0209i3 = c0209i2;
                str = "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG";
            }
            r14.m87173q(r10);
            r14.m87150e0(994863825);
            if (interfaceC41211c2 == null) {
                i15 = 8;
            } else {
                i15 = 8;
                AbstractC35903f.m114006a(AbstractC35785b.m113396S(interfaceC41211c2, r14), AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1099a.m3393o(c22976l1M31081j, c2314t), 0.0f, 2, 0.0f, 8, 5), "PAYMENT_SHEET_ERROR"), r14, r10);
            }
            r14.m87173q(r10);
            r14.m87173q(true);
            m34292j(abstractC12605c, r14, (i16 & 14) | i15);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, r10);
            iHashCode2 = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = r14.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(r14, modifier);
            r14.m87158i0();
            if (r14.f115903S) {
                r14.m87163l(c0213j);
            } else {
                r14.m87178s0();
            }
            AbstractC28683x.m87239G(r14, c0209i4, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(r14, c0209i10, interfaceC28653p1M87165m5);
            if (r14.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(r14, c0209i9, modifierM118962N5);
            r14.m87150e0(994875924);
            if (c29808b != null) {
                r16 = r10;
            } else {
                r16 = r10;
            }
            if (r16 == 0) {
                z13 = true;
            } else {
                z13 = true;
            }
            r14.m87173q(r10);
            r14.m87173q(z13);
            r17 = r14;
        }
        C28677v1 c28677v1M87180u = r17.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2630u(abstractC12605c, interfaceC41211c, c0314n1, interfaceC0305k1, interfaceC41211c2, interfaceC30881s, c29808b, modifier, i13, 1);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 n33.p, still in use, count: 2, list:
          (r0v0 n33.p) from 0x0177: MOVE (r16v0 n33.p) = (r0v0 n33.p)
          (r0v0 n33.p) from 0x0179: PHI (r16v2 n33.p) = (r16v0 n33.p), (r0v0 n33.p) binds: [B:67:0x0177, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: d0 */
    public static final n33.C26242p m34282d0(org.webrtc.RTCStats r21) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p097ds.AbstractC12313p.m34282d0(org.webrtc.RTCStats):n33.p");
    }

    /* JADX INFO: renamed from: e */
    public static final void m34283e(float f13, int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1469222463);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            if (i16 != 0) {
                f13 = 0;
            }
            float f14 = C11671p.f37685f.f37647d - f13;
            float f15 = 0;
            if (f14 < f15) {
                f14 = f15;
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3414k(f14, C2314t.f9131w));
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3910a(f13, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0220  */
    /* JADX WARN: Code duplicated, block: B:104:0x0224  */
    /* JADX WARN: Code duplicated, block: B:106:0x0230  */
    /* JADX WARN: Code duplicated, block: B:109:0x024d  */
    /* JADX WARN: Code duplicated, block: B:110:0x024f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0253  */
    /* JADX WARN: Code duplicated, block: B:114:0x025f  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c  */
    /* JADX WARN: Code duplicated, block: B:118:0x027e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0282  */
    /* JADX WARN: Code duplicated, block: B:122:0x028e  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:166:0x039b  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:170:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:174:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:181:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:186:0x0409  */
    /* JADX WARN: Code duplicated, block: B:187:0x040b  */
    /* JADX WARN: Code duplicated, block: B:189:0x040f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066 A[PHI: r21 r22
      0x0066: PHI (r21v16 java.util.HashMap) = 
      (r21v4 java.util.HashMap)
      (r21v5 java.util.HashMap)
      (r21v6 java.util.HashMap)
      (r21v7 java.util.HashMap)
      (r21v8 java.util.HashMap)
      (r21v8 java.util.HashMap)
      (r21v17 java.util.HashMap)
     binds: [B:635:0x0d03, B:614:0x0caa, B:593:0x0c51, B:572:0x0bf8, B:471:0x0a06, B:151:0x0346, B:17:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r22v12 o33.c) = (r22v4 o33.c), (r22v5 o33.c), (r22v6 o33.c), (r22v7 o33.c), (r22v8 o33.c), (r22v8 o33.c), (r22v13 o33.c) binds: [B:635:0x0d03, B:614:0x0caa, B:593:0x0c51, B:572:0x0bf8, B:471:0x0a06, B:151:0x0346, B:17:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x041b  */
    /* JADX WARN: Code duplicated, block: B:194:0x042f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0431  */
    /* JADX WARN: Code duplicated, block: B:197:0x0435  */
    /* JADX WARN: Code duplicated, block: B:199:0x0441  */
    /* JADX WARN: Code duplicated, block: B:202:0x0455  */
    /* JADX WARN: Code duplicated, block: B:203:0x0457  */
    /* JADX WARN: Code duplicated, block: B:205:0x045b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0467  */
    /* JADX WARN: Code duplicated, block: B:210:0x047b  */
    /* JADX WARN: Code duplicated, block: B:211:0x047d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0481  */
    /* JADX WARN: Code duplicated, block: B:215:0x048d  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:219:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:223:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:226:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:229:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:231:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:234:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:235:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:237:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:239:0x050b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0521  */
    /* JADX WARN: Code duplicated, block: B:243:0x0523  */
    /* JADX WARN: Code duplicated, block: B:245:0x0527  */
    /* JADX WARN: Code duplicated, block: B:247:0x0533  */
    /* JADX WARN: Code duplicated, block: B:250:0x0549  */
    /* JADX WARN: Code duplicated, block: B:251:0x054b  */
    /* JADX WARN: Code duplicated, block: B:253:0x054f  */
    /* JADX WARN: Code duplicated, block: B:255:0x055b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0573  */
    /* JADX WARN: Code duplicated, block: B:259:0x0575  */
    /* JADX WARN: Code duplicated, block: B:261:0x0579  */
    /* JADX WARN: Code duplicated, block: B:263:0x0585  */
    /* JADX WARN: Code duplicated, block: B:266:0x059d  */
    /* JADX WARN: Code duplicated, block: B:267:0x059f  */
    /* JADX WARN: Code duplicated, block: B:269:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:271:0x05af  */
    /* JADX WARN: Code duplicated, block: B:274:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:275:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:277:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:279:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:282:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:283:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:285:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:287:0x0603  */
    /* JADX WARN: Code duplicated, block: B:290:0x061b  */
    /* JADX WARN: Code duplicated, block: B:291:0x061d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0621  */
    /* JADX WARN: Code duplicated, block: B:295:0x062d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0645  */
    /* JADX WARN: Code duplicated, block: B:299:0x0647  */
    /* JADX WARN: Code duplicated, block: B:301:0x064b  */
    /* JADX WARN: Code duplicated, block: B:303:0x0657  */
    /* JADX WARN: Code duplicated, block: B:306:0x066f  */
    /* JADX WARN: Code duplicated, block: B:307:0x0671  */
    /* JADX WARN: Code duplicated, block: B:309:0x0675  */
    /* JADX WARN: Code duplicated, block: B:311:0x0681  */
    /* JADX WARN: Code duplicated, block: B:314:0x0699  */
    /* JADX WARN: Code duplicated, block: B:315:0x069b  */
    /* JADX WARN: Code duplicated, block: B:317:0x069f  */
    /* JADX WARN: Code duplicated, block: B:319:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:322:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:323:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:325:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:327:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:330:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:331:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:333:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:335:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:336:0x0707  */
    /* JADX WARN: Code duplicated, block: B:338:0x0715  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:340:0x0727  */
    /* JADX WARN: Code duplicated, block: B:342:0x0743  */
    /* JADX WARN: Code duplicated, block: B:343:0x0745  */
    /* JADX WARN: Code duplicated, block: B:345:0x0749  */
    /* JADX WARN: Code duplicated, block: B:347:0x0755  */
    /* JADX WARN: Code duplicated, block: B:350:0x076e  */
    /* JADX WARN: Code duplicated, block: B:351:0x0770  */
    /* JADX WARN: Code duplicated, block: B:353:0x0774  */
    /* JADX WARN: Code duplicated, block: B:355:0x0780  */
    /* JADX WARN: Code duplicated, block: B:358:0x0799  */
    /* JADX WARN: Code duplicated, block: B:359:0x079b  */
    /* JADX WARN: Code duplicated, block: B:361:0x079f  */
    /* JADX WARN: Code duplicated, block: B:363:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:366:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:367:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:369:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:371:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:374:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:375:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:377:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:379:0x0801  */
    /* JADX WARN: Code duplicated, block: B:382:0x081a  */
    /* JADX WARN: Code duplicated, block: B:383:0x081c  */
    /* JADX WARN: Code duplicated, block: B:385:0x0820  */
    /* JADX WARN: Code duplicated, block: B:387:0x082c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:390:0x0847  */
    /* JADX WARN: Code duplicated, block: B:391:0x0849  */
    /* JADX WARN: Code duplicated, block: B:393:0x084d  */
    /* JADX WARN: Code duplicated, block: B:395:0x0859  */
    /* JADX WARN: Code duplicated, block: B:398:0x0874  */
    /* JADX WARN: Code duplicated, block: B:399:0x0876  */
    /* JADX WARN: Code duplicated, block: B:401:0x087a  */
    /* JADX WARN: Code duplicated, block: B:403:0x0886  */
    /* JADX WARN: Code duplicated, block: B:406:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:407:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:409:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:411:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:414:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:415:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:417:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:419:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:422:0x0901  */
    /* JADX WARN: Code duplicated, block: B:423:0x0903  */
    /* JADX WARN: Code duplicated, block: B:425:0x0907  */
    /* JADX WARN: Code duplicated, block: B:427:0x0913  */
    /* JADX WARN: Code duplicated, block: B:430:0x0930  */
    /* JADX WARN: Code duplicated, block: B:431:0x0932  */
    /* JADX WARN: Code duplicated, block: B:433:0x0936  */
    /* JADX WARN: Code duplicated, block: B:435:0x0942  */
    /* JADX WARN: Code duplicated, block: B:438:0x095f  */
    /* JADX WARN: Code duplicated, block: B:439:0x0961  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:441:0x0965  */
    /* JADX WARN: Code duplicated, block: B:443:0x0971  */
    /* JADX WARN: Code duplicated, block: B:446:0x098e  */
    /* JADX WARN: Code duplicated, block: B:447:0x0990  */
    /* JADX WARN: Code duplicated, block: B:449:0x0994  */
    /* JADX WARN: Code duplicated, block: B:451:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:452:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:454:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:456:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:469:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:472:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:475:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:482:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:485:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:501:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:503:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:506:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:507:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:509:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:511:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:514:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:515:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:517:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:519:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:520:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:523:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:524:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:526:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:528:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:531:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:532:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:534:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:536:0x0b47  */
    /* JADX WARN: Code duplicated, block: B:539:0x0b5f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:540:0x0b61  */
    /* JADX WARN: Code duplicated, block: B:542:0x0b65  */
    /* JADX WARN: Code duplicated, block: B:544:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:547:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:548:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:550:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b9b  */
    /* JADX WARN: Code duplicated, block: B:553:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:80:0x0199  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:98:0x0201  */
    /* JADX INFO: renamed from: e0 */
    public static final HashMap m34284e0(RTCStatsReport rTCStatsReport) {
        EnumC27518c enumC27518c;
        EnumC27518c enumC27518c2;
        Object objM34267S;
        EnumC27516a enumC27516aM79403i;
        EnumC27516a enumC27516aM79403i2;
        EnumC27516a enumC27516aM79403i3;
        EnumC27516a enumC27516aM79403i4;
        EnumC27516a enumC27516aM79403i5;
        String str;
        Object obj;
        Boolean bool;
        Object obj2;
        InterfaceC2339e interfaceC2339e;
        EnumC2341g enumC2341g;
        Object obj3;
        InterfaceC2339e interfaceC2339e2;
        EnumC2341g enumC2341g2;
        Object obj4;
        InterfaceC2339e interfaceC2339e3;
        EnumC2341g enumC2341g3;
        Object obj5;
        InterfaceC2339e interfaceC2339e4;
        EnumC2341g enumC2341g4;
        Object obj6;
        InterfaceC2339e interfaceC2339e5;
        EnumC2341g enumC2341g5;
        Object obj7;
        Object obj8;
        InterfaceC2339e interfaceC2339e6;
        EnumC2341g enumC2341g6;
        Object obj9;
        InterfaceC2339e interfaceC2339e7;
        EnumC2341g enumC2341g7;
        Object obj10;
        InterfaceC2339e interfaceC2339e8;
        EnumC2341g enumC2341g8;
        Object obj11;
        InterfaceC2339e interfaceC2339e9;
        EnumC2341g enumC2341g9;
        Object obj12;
        Object obj13;
        InterfaceC2339e interfaceC2339e10;
        EnumC2341g enumC2341g10;
        Object obj14;
        Boolean bool2;
        String str2;
        Object obj15;
        InterfaceC2339e interfaceC2339e11;
        EnumC2341g enumC2341g11;
        Object obj16;
        InterfaceC2339e interfaceC2339e12;
        EnumC2341g enumC2341g12;
        Object obj17;
        InterfaceC2339e interfaceC2339e13;
        EnumC2341g enumC2341g13;
        Object obj18;
        InterfaceC2339e interfaceC2339e14;
        EnumC2341g enumC2341g14;
        Object obj19;
        InterfaceC2339e interfaceC2339e15;
        EnumC2341g enumC2341g15;
        Object obj20;
        InterfaceC2339e interfaceC2339e16;
        EnumC2341g enumC2341g16;
        Object obj21;
        InterfaceC2339e interfaceC2339e17;
        EnumC2341g enumC2341g17;
        Object obj22;
        InterfaceC2339e interfaceC2339e18;
        EnumC2341g enumC2341g18;
        Object obj23;
        InterfaceC2339e interfaceC2339e19;
        EnumC2341g enumC2341g19;
        Object obj24;
        InterfaceC2339e interfaceC2339e20;
        EnumC2341g enumC2341g20;
        Object obj25;
        InterfaceC2339e interfaceC2339e21;
        EnumC2341g enumC2341g21;
        Object obj26;
        InterfaceC2339e interfaceC2339e22;
        EnumC2341g enumC2341g22;
        Object obj27;
        InterfaceC2339e interfaceC2339e23;
        EnumC2341g enumC2341g23;
        Object obj28;
        Object obj29;
        InterfaceC2339e interfaceC2339e24;
        EnumC2341g enumC2341g24;
        Object obj30;
        Object obj31;
        Object obj32;
        InterfaceC2339e interfaceC2339e25;
        EnumC2341g enumC2341g25;
        Object obj33;
        InterfaceC2339e interfaceC2339e26;
        EnumC2341g enumC2341g26;
        Object obj34;
        InterfaceC2339e interfaceC2339e27;
        EnumC2341g enumC2341g27;
        Object obj35;
        InterfaceC2339e interfaceC2339e28;
        EnumC2341g enumC2341g28;
        Object obj36;
        InterfaceC2339e interfaceC2339e29;
        EnumC2341g enumC2341g29;
        Object obj37;
        InterfaceC2339e interfaceC2339e30;
        EnumC2341g enumC2341g30;
        Object obj38;
        InterfaceC2339e interfaceC2339e31;
        EnumC2341g enumC2341g31;
        Object obj39;
        InterfaceC2339e interfaceC2339e32;
        EnumC2341g enumC2341g32;
        Object obj40;
        InterfaceC2339e interfaceC2339e33;
        EnumC2341g enumC2341g33;
        Object obj41;
        InterfaceC2339e interfaceC2339e34;
        EnumC2341g enumC2341g34;
        Object obj42;
        InterfaceC2339e interfaceC2339e35;
        EnumC2341g enumC2341g35;
        Object obj43;
        InterfaceC2339e interfaceC2339e36;
        EnumC2341g enumC2341g36;
        Object obj44;
        InterfaceC2339e interfaceC2339e37;
        EnumC2341g enumC2341g37;
        Object obj45;
        InterfaceC2339e interfaceC2339e38;
        EnumC2341g enumC2341g38;
        Object obj46;
        InterfaceC2339e interfaceC2339e39;
        EnumC2341g enumC2341g39;
        Object obj47;
        InterfaceC2339e interfaceC2339e40;
        EnumC2341g enumC2341g40;
        Object obj48;
        InterfaceC2339e interfaceC2339e41;
        EnumC2341g enumC2341g41;
        Object obj49;
        InterfaceC2339e interfaceC2339e42;
        EnumC2341g enumC2341g42;
        Object obj50;
        InterfaceC2339e interfaceC2339e43;
        EnumC2341g enumC2341g43;
        Object obj51;
        InterfaceC2339e interfaceC2339e44;
        EnumC2341g enumC2341g44;
        Object obj52;
        Object obj53;
        InterfaceC2339e interfaceC2339e45;
        EnumC2341g enumC2341g45;
        RTCStats rTCStats;
        String str3;
        EnumC27516a enumC27516aM79403i6;
        int i13;
        Object obj54;
        InterfaceC2339e interfaceC2339e46;
        EnumC2341g enumC2341g46;
        Object obj55;
        InterfaceC2339e interfaceC2339e47;
        EnumC2341g enumC2341g47;
        Object obj56;
        InterfaceC2339e interfaceC2339e48;
        EnumC2341g enumC2341g48;
        Object obj57;
        InterfaceC2339e interfaceC2339e49;
        EnumC2341g enumC2341g49;
        Object obj58;
        InterfaceC2339e interfaceC2339e50;
        EnumC2341g enumC2341g50;
        Object obj59;
        InterfaceC2339e interfaceC2339e51;
        EnumC2341g enumC2341g51;
        Object obj60;
        InterfaceC2339e interfaceC2339e52;
        EnumC2341g enumC2341g52;
        Object obj61;
        InterfaceC2339e interfaceC2339e53;
        EnumC2341g enumC2341g53;
        Object obj62;
        InterfaceC2339e interfaceC2339e54;
        EnumC2341g enumC2341g54;
        Object obj63;
        InterfaceC2339e interfaceC2339e55;
        EnumC2341g enumC2341g55;
        Object obj64;
        Object obj65;
        InterfaceC2339e interfaceC2339e56;
        EnumC2341g enumC2341g56;
        HashMap map = new HashMap();
        Iterator<RTCStats> it = rTCStatsReport.getStatsMap().values().iterator();
        while (it.hasNext()) {
            RTCStats next = it.next();
            C26701n c26701n = EnumC27518c.f110806x;
            String type = next.getType();
            c26701n.getClass();
            EnumC27518c[] enumC27518cArrValues = EnumC27518c.values();
            int length = enumC27518cArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 < length) {
                    enumC27518c = enumC27518cArrValues[i14];
                    if (!enumC27518c.f110809w.equals(type)) {
                        i14++;
                    }
                } else {
                    enumC27518c = null;
                }
            }
            if (enumC27518c == null) {
                enumC27518c = EnumC27518c.UNKNOWN;
            }
            it = it;
            switch (enumC27518c.ordinal()) {
                case 1:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    objM34267S = m34267S(next);
                    break;
                case 2:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    objM34267S = m34268T(next);
                    break;
                case 3:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    objM34267S = m34269U(next);
                    break;
                case 4:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    objM34267S = m34269U(next);
                    break;
                case 5:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    Object obj66 = next.getMembers().get("kind");
                    if (obj66 == null) {
                        obj66 = null;
                    } else if (!(obj66 instanceof String)) {
                        C2343i c2343i = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e57 = C2343i.f9272d;
                        EnumC2341g enumC2341g57 = EnumC2341g.WARN;
                        if (interfaceC2339e57.isLoggable(enumC2341g57, "RtcParser")) {
                            AbstractC21702c.m61145p(obj66, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g57, "RtcParser");
                        }
                        obj66 = null;
                    }
                    String str4 = (String) obj66;
                    if (str4 != null) {
                        EnumC27516a.f110798x.getClass();
                        enumC27516aM79403i = C26701n.m79403i(str4);
                    } else {
                        enumC27516aM79403i = null;
                    }
                    int i15 = enumC27516aM79403i != null ? AbstractC25011a.f97850a[enumC27516aM79403i.ordinal()] : -1;
                    if (i15 == 1) {
                        objM34267S = m34276a0(next);
                    } else if (i15 == 2) {
                        objM34267S = m34278b0(next);
                    } else {
                        objM34267S = null;
                    }
                    break;
                case 6:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    Object obj67 = next.getMembers().get("kind");
                    if (obj67 == null) {
                        obj67 = null;
                    } else if (!(obj67 instanceof String)) {
                        C2343i c2343i2 = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e58 = C2343i.f9272d;
                        EnumC2341g enumC2341g58 = EnumC2341g.WARN;
                        if (interfaceC2339e58.isLoggable(enumC2341g58, "RtcParser")) {
                            AbstractC21702c.m61145p(obj67, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g58, "RtcParser");
                        }
                        obj67 = null;
                    }
                    String str5 = (String) obj67;
                    if (str5 != null) {
                        EnumC27516a.f110798x.getClass();
                        enumC27516aM79403i2 = C26701n.m79403i(str5);
                    } else {
                        enumC27516aM79403i2 = null;
                    }
                    int i16 = enumC27516aM79403i2 != null ? AbstractC25011a.f97850a[enumC27516aM79403i2.ordinal()] : -1;
                    if (i16 == 1) {
                        objM34267S = m34280c0(next);
                    } else if (i16 == 2) {
                        objM34267S = m34282d0(next);
                    } else {
                        objM34267S = null;
                    }
                    break;
                case 7:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    Object obj68 = next.getMembers().get("kind");
                    if (obj68 == null) {
                        obj68 = null;
                    } else if (!(obj68 instanceof String)) {
                        C2343i c2343i3 = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e59 = C2343i.f9272d;
                        EnumC2341g enumC2341g59 = EnumC2341g.WARN;
                        if (interfaceC2339e59.isLoggable(enumC2341g59, "RtcParser")) {
                            AbstractC21702c.m61145p(obj68, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g59, "RtcParser");
                        }
                        obj68 = null;
                    }
                    String str6 = (String) obj68;
                    if (str6 != null) {
                        EnumC27516a.f110798x.getClass();
                        enumC27516aM79403i3 = C26701n.m79403i(str6);
                    } else {
                        enumC27516aM79403i3 = null;
                    }
                    int i17 = enumC27516aM79403i3 != null ? AbstractC25011a.f97850a[enumC27516aM79403i3.ordinal()] : -1;
                    if (i17 == 1) {
                        objM34267S = m34270V(next);
                    } else if (i17 == 2) {
                        objM34267S = m34271W(next);
                    } else {
                        objM34267S = null;
                    }
                    break;
                case 8:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    Object obj69 = next.getMembers().get("kind");
                    if (obj69 == null) {
                        obj69 = null;
                    } else if (!(obj69 instanceof String)) {
                        C2343i c2343i4 = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e60 = C2343i.f9272d;
                        EnumC2341g enumC2341g60 = EnumC2341g.WARN;
                        if (interfaceC2339e60.isLoggable(enumC2341g60, "RtcParser")) {
                            AbstractC21702c.m61145p(obj69, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g60, "RtcParser");
                        }
                        obj69 = null;
                    }
                    String str7 = (String) obj69;
                    if (str7 != null) {
                        EnumC27516a.f110798x.getClass();
                        enumC27516aM79403i4 = C26701n.m79403i(str7);
                    } else {
                        enumC27516aM79403i4 = null;
                    }
                    int i18 = enumC27516aM79403i4 != null ? AbstractC25011a.f97850a[enumC27516aM79403i4.ordinal()] : -1;
                    if (i18 == 1) {
                        objM34267S = m34273Y(next);
                    } else if (i18 == 2) {
                        objM34267S = m34274Z(next);
                    } else {
                        objM34267S = null;
                    }
                    break;
                case 9:
                    map = map;
                    Object obj70 = next.getMembers().get("kind");
                    if (obj70 == null) {
                        obj70 = null;
                    } else if (!(obj70 instanceof String)) {
                        C2343i c2343i5 = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e61 = C2343i.f9272d;
                        EnumC2341g enumC2341g61 = EnumC2341g.WARN;
                        if (interfaceC2339e61.isLoggable(enumC2341g61, "RtcParser")) {
                            C2343i.f9271c.log(enumC2341g61, "RtcParser", AbstractC21702c.m61134e(obj70, "[toRtcStats] 'kind' => expected String but found "), null);
                        }
                        obj70 = null;
                    }
                    String str8 = (String) obj70;
                    if (str8 != null) {
                        EnumC27516a.f110798x.getClass();
                        enumC27516aM79403i5 = C26701n.m79403i(str8);
                    } else {
                        enumC27516aM79403i5 = null;
                    }
                    int i19 = enumC27516aM79403i5 != null ? AbstractC25011a.f97850a[enumC27516aM79403i5.ordinal()] : -1;
                    enumC27518c2 = enumC27518c;
                    String str9 = "[toRtcStats] 'detached' => expected Boolean but found ";
                    if (i19 != 1) {
                        if (i19 == 2) {
                            Object obj71 = next.getMembers().get("remoteSource");
                            if (obj71 != null) {
                                if (obj71 instanceof Boolean) {
                                    obj14 = "mediaSourceId";
                                    str9 = "[toRtcStats] 'detached' => expected Boolean but found ";
                                } else {
                                    C2343i c2343i6 = C2343i.f9269a;
                                    InterfaceC2339e interfaceC2339e62 = C2343i.f9272d;
                                    obj14 = "mediaSourceId";
                                    EnumC2341g enumC2341g62 = EnumC2341g.WARN;
                                    if (interfaceC2339e62.isLoggable(enumC2341g62, "RtcParser")) {
                                        C2343i.f9271c.log(enumC2341g62, "RtcParser", AbstractC21702c.m61134e(obj71, "[toRtcStats] 'remoteSource' => expected Boolean but found "), null);
                                    }
                                    obj71 = null;
                                }
                                bool2 = (Boolean) obj71;
                                if (AbstractC22676k.m65745e(bool2, Boolean.TRUE)) {
                                    str2 = str9;
                                    if (AbstractC22676k.m65745e(bool2, Boolean.FALSE)) {
                                        objM34267S = null;
                                    } else {
                                        String id4 = next.getId();
                                        String type2 = next.getType();
                                        Double dValueOf = Double.valueOf(next.getTimestampUs());
                                        obj15 = next.getMembers().get("trackIdentifier");
                                        if (obj15 != null) {
                                            obj15 = null;
                                        } else if (!(obj15 instanceof String)) {
                                            C2343i c2343i7 = C2343i.f9269a;
                                            interfaceC2339e11 = C2343i.f9272d;
                                            enumC2341g11 = EnumC2341g.WARN;
                                            if (interfaceC2339e11.isLoggable(enumC2341g11, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g11, "RtcParser", AbstractC21702c.m61134e(obj15, "[toRtcStats] 'trackIdentifier' => expected String but found "), null);
                                            }
                                            obj15 = null;
                                        }
                                        String str10 = (String) obj15;
                                        obj16 = next.getMembers().get("ended");
                                        if (obj16 != null) {
                                            obj16 = null;
                                        } else if (!(obj16 instanceof Boolean)) {
                                            C2343i c2343i8 = C2343i.f9269a;
                                            interfaceC2339e12 = C2343i.f9272d;
                                            enumC2341g12 = EnumC2341g.WARN;
                                            if (interfaceC2339e12.isLoggable(enumC2341g12, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g12, "RtcParser", AbstractC21702c.m61134e(obj16, "[toRtcStats] 'ended' => expected Boolean but found "), null);
                                            }
                                            obj16 = null;
                                        }
                                        Boolean bool3 = (Boolean) obj16;
                                        obj17 = next.getMembers().get("kind");
                                        if (obj17 != null) {
                                            obj17 = null;
                                        } else if (!(obj17 instanceof String)) {
                                            C2343i c2343i9 = C2343i.f9269a;
                                            interfaceC2339e13 = C2343i.f9272d;
                                            enumC2341g13 = EnumC2341g.WARN;
                                            if (interfaceC2339e13.isLoggable(enumC2341g13, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g13, "RtcParser", AbstractC21702c.m61134e(obj17, "[toRtcStats] 'kind' => expected String but found "), null);
                                            }
                                            obj17 = null;
                                        }
                                        String str11 = (String) obj17;
                                        obj18 = next.getMembers().get("priority");
                                        if (obj18 != null) {
                                            obj18 = null;
                                        } else if (!(obj18 instanceof String)) {
                                            C2343i c2343i10 = C2343i.f9269a;
                                            interfaceC2339e14 = C2343i.f9272d;
                                            enumC2341g14 = EnumC2341g.WARN;
                                            if (interfaceC2339e14.isLoggable(enumC2341g14, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g14, "RtcParser", AbstractC21702c.m61134e(obj18, "[toRtcStats] 'priority' => expected String but found "), null);
                                            }
                                            obj18 = null;
                                        }
                                        String str12 = (String) obj18;
                                        obj19 = next.getMembers().get("remoteSource");
                                        if (obj19 != null) {
                                            obj19 = null;
                                        } else if (!(obj19 instanceof Boolean)) {
                                            C2343i c2343i11 = C2343i.f9269a;
                                            interfaceC2339e15 = C2343i.f9272d;
                                            enumC2341g15 = EnumC2341g.WARN;
                                            if (interfaceC2339e15.isLoggable(enumC2341g15, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g15, "RtcParser", AbstractC21702c.m61134e(obj19, "[toRtcStats] 'remoteSource' => expected Boolean but found "), null);
                                            }
                                            obj19 = null;
                                        }
                                        Boolean bool4 = (Boolean) obj19;
                                        obj20 = next.getMembers().get("detached");
                                        if (obj20 != null) {
                                            obj20 = null;
                                        } else if (!(obj20 instanceof Boolean)) {
                                            C2343i c2343i12 = C2343i.f9269a;
                                            interfaceC2339e16 = C2343i.f9272d;
                                            enumC2341g16 = EnumC2341g.WARN;
                                            if (interfaceC2339e16.isLoggable(enumC2341g16, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g16, "RtcParser", AbstractC21702c.m61134e(obj20, str2), null);
                                            }
                                            obj20 = null;
                                        }
                                        Boolean bool5 = (Boolean) obj20;
                                        obj21 = next.getMembers().get(obj14);
                                        if (obj21 != null) {
                                            obj21 = null;
                                        } else if (!(obj21 instanceof String)) {
                                            C2343i c2343i13 = C2343i.f9269a;
                                            interfaceC2339e17 = C2343i.f9272d;
                                            enumC2341g17 = EnumC2341g.WARN;
                                            if (interfaceC2339e17.isLoggable(enumC2341g17, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g17, "RtcParser", AbstractC21702c.m61134e(obj21, "[toRtcStats] 'mediaSourceId' => expected String but found "), null);
                                            }
                                            obj21 = null;
                                        }
                                        String str13 = (String) obj21;
                                        obj22 = next.getMembers().get("frameHeight");
                                        if (obj22 != null) {
                                            obj22 = null;
                                        } else if (!(obj22 instanceof Long)) {
                                            C2343i c2343i14 = C2343i.f9269a;
                                            interfaceC2339e18 = C2343i.f9272d;
                                            enumC2341g18 = EnumC2341g.WARN;
                                            if (interfaceC2339e18.isLoggable(enumC2341g18, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g18, "RtcParser", AbstractC21702c.m61134e(obj22, "[toRtcStats] 'frameHeight' => expected Long but found "), null);
                                            }
                                            obj22 = null;
                                        }
                                        Long l7 = (Long) obj22;
                                        obj23 = next.getMembers().get("frameWidth");
                                        if (obj23 != null) {
                                            obj23 = null;
                                        } else if (!(obj23 instanceof Long)) {
                                            C2343i c2343i15 = C2343i.f9269a;
                                            interfaceC2339e19 = C2343i.f9272d;
                                            enumC2341g19 = EnumC2341g.WARN;
                                            if (interfaceC2339e19.isLoggable(enumC2341g19, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g19, "RtcParser", AbstractC21702c.m61134e(obj23, "[toRtcStats] 'frameWidth' => expected Long but found "), null);
                                            }
                                            obj23 = null;
                                        }
                                        Long l12 = (Long) obj23;
                                        obj24 = next.getMembers().get("framesPerSecond");
                                        if (obj24 != null) {
                                            obj24 = null;
                                        } else if (!(obj24 instanceof Double)) {
                                            C2343i c2343i16 = C2343i.f9269a;
                                            interfaceC2339e20 = C2343i.f9272d;
                                            enumC2341g20 = EnumC2341g.WARN;
                                            if (interfaceC2339e20.isLoggable(enumC2341g20, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g20, "RtcParser", AbstractC21702c.m61134e(obj24, "[toRtcStats] 'framesPerSecond' => expected Double but found "), null);
                                            }
                                            obj24 = null;
                                        }
                                        Double d3 = (Double) obj24;
                                        obj25 = next.getMembers().get("keyFramesSent");
                                        if (obj25 != null) {
                                            obj25 = null;
                                        } else if (!(obj25 instanceof Long)) {
                                            C2343i c2343i17 = C2343i.f9269a;
                                            interfaceC2339e21 = C2343i.f9272d;
                                            enumC2341g21 = EnumC2341g.WARN;
                                            if (interfaceC2339e21.isLoggable(enumC2341g21, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g21, "RtcParser", AbstractC21702c.m61134e(obj25, "[toRtcStats] 'keyFramesSent' => expected Long but found "), null);
                                            }
                                            obj25 = null;
                                        }
                                        Long l13 = (Long) obj25;
                                        obj26 = next.getMembers().get("framesCaptured");
                                        if (obj26 != null) {
                                            obj26 = null;
                                        } else if (!(obj26 instanceof Long)) {
                                            C2343i c2343i18 = C2343i.f9269a;
                                            interfaceC2339e22 = C2343i.f9272d;
                                            enumC2341g22 = EnumC2341g.WARN;
                                            if (interfaceC2339e22.isLoggable(enumC2341g22, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g22, "RtcParser", AbstractC21702c.m61134e(obj26, "[toRtcStats] 'framesCaptured' => expected Long but found "), null);
                                            }
                                            obj26 = null;
                                        }
                                        Long l14 = (Long) obj26;
                                        obj27 = next.getMembers().get("framesSent");
                                        if (obj27 != null) {
                                            obj27 = null;
                                        } else if (!(obj27 instanceof Long)) {
                                            C2343i c2343i19 = C2343i.f9269a;
                                            interfaceC2339e23 = C2343i.f9272d;
                                            enumC2341g23 = EnumC2341g.WARN;
                                            if (interfaceC2339e23.isLoggable(enumC2341g23, "RtcParser")) {
                                                C2343i.f9271c.log(enumC2341g23, "RtcParser", AbstractC21702c.m61134e(obj27, "[toRtcStats] 'framesSent' => expected Long but found "), null);
                                            }
                                            obj27 = null;
                                        }
                                        Long l15 = (Long) obj27;
                                        obj28 = next.getMembers().get("hugeFramesSent");
                                        if (obj28 == null) {
                                            obj29 = null;
                                        } else if (obj28 instanceof Long) {
                                            obj29 = obj28;
                                        } else {
                                            C2343i c2343i20 = C2343i.f9269a;
                                            interfaceC2339e24 = C2343i.f9272d;
                                            enumC2341g24 = EnumC2341g.WARN;
                                            if (interfaceC2339e24.isLoggable(enumC2341g24, "RtcParser")) {
                                                obj30 = null;
                                                C2343i.f9271c.log(enumC2341g24, "RtcParser", AbstractC21702c.m61134e(obj28, "[toRtcStats] 'hugeFramesSent' => expected Long but found "), null);
                                            } else {
                                                obj30 = null;
                                            }
                                            obj29 = obj30;
                                        }
                                        objM34267S = new C26236j(id4, type2, dValueOf, str10, bool3, str11, str12, bool4, bool5, str13, l7, l12, d3, l13, l14, l15, (Long) obj29);
                                    }
                                } else {
                                    String id5 = next.getId();
                                    String type3 = next.getType();
                                    Double dValueOf2 = Double.valueOf(next.getTimestampUs());
                                    obj31 = next.getMembers().get("trackIdentifier");
                                    if (obj31 == null) {
                                        if (obj31 instanceof String) {
                                            obj32 = "frameWidth";
                                        } else {
                                            C2343i c2343i21 = C2343i.f9269a;
                                            interfaceC2339e25 = C2343i.f9272d;
                                            obj32 = "frameWidth";
                                            enumC2341g25 = EnumC2341g.WARN;
                                            if (interfaceC2339e25.isLoggable(enumC2341g25, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj31, "[toRtcStats] 'trackIdentifier' => expected String but found ", C2343i.f9271c, enumC2341g25, "RtcParser");
                                            }
                                        }
                                        String str14 = (String) obj31;
                                        obj33 = next.getMembers().get("ended");
                                        if (obj33 != null) {
                                            obj33 = null;
                                        } else if (!(obj33 instanceof Boolean)) {
                                            C2343i c2343i22 = C2343i.f9269a;
                                            interfaceC2339e26 = C2343i.f9272d;
                                            enumC2341g26 = EnumC2341g.WARN;
                                            if (interfaceC2339e26.isLoggable(enumC2341g26, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj33, "[toRtcStats] 'ended' => expected Boolean but found ", C2343i.f9271c, enumC2341g26, "RtcParser");
                                            }
                                            obj33 = null;
                                        }
                                        Boolean bool6 = (Boolean) obj33;
                                        obj34 = next.getMembers().get("kind");
                                        if (obj34 != null) {
                                            obj34 = null;
                                        } else if (!(obj34 instanceof String)) {
                                            C2343i c2343i23 = C2343i.f9269a;
                                            interfaceC2339e27 = C2343i.f9272d;
                                            enumC2341g27 = EnumC2341g.WARN;
                                            if (interfaceC2339e27.isLoggable(enumC2341g27, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj34, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g27, "RtcParser");
                                            }
                                            obj34 = null;
                                        }
                                        String str15 = (String) obj34;
                                        obj35 = next.getMembers().get("priority");
                                        if (obj35 != null) {
                                            obj35 = null;
                                        } else if (!(obj35 instanceof String)) {
                                            C2343i c2343i24 = C2343i.f9269a;
                                            interfaceC2339e28 = C2343i.f9272d;
                                            enumC2341g28 = EnumC2341g.WARN;
                                            if (interfaceC2339e28.isLoggable(enumC2341g28, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj35, "[toRtcStats] 'priority' => expected String but found ", C2343i.f9271c, enumC2341g28, "RtcParser");
                                            }
                                            obj35 = null;
                                        }
                                        String str16 = (String) obj35;
                                        obj36 = next.getMembers().get("remoteSource");
                                        if (obj36 != null) {
                                            obj36 = null;
                                        } else if (!(obj36 instanceof Boolean)) {
                                            C2343i c2343i25 = C2343i.f9269a;
                                            interfaceC2339e29 = C2343i.f9272d;
                                            enumC2341g29 = EnumC2341g.WARN;
                                            if (interfaceC2339e29.isLoggable(enumC2341g29, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj36, "[toRtcStats] 'remoteSource' => expected Boolean but found ", C2343i.f9271c, enumC2341g29, "RtcParser");
                                            }
                                            obj36 = null;
                                        }
                                        Boolean bool7 = (Boolean) obj36;
                                        obj37 = next.getMembers().get("detached");
                                        if (obj37 != null) {
                                            obj37 = null;
                                        } else if (!(obj37 instanceof Boolean)) {
                                            C2343i c2343i26 = C2343i.f9269a;
                                            interfaceC2339e30 = C2343i.f9272d;
                                            enumC2341g30 = EnumC2341g.WARN;
                                            if (interfaceC2339e30.isLoggable(enumC2341g30, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj37, str9, C2343i.f9271c, enumC2341g30, "RtcParser");
                                            }
                                            obj37 = null;
                                        }
                                        Boolean bool8 = (Boolean) obj37;
                                        obj38 = next.getMembers().get("estimatedPlayoutTimestamp");
                                        if (obj38 != null) {
                                            obj38 = null;
                                        } else if (!(obj38 instanceof Double)) {
                                            C2343i c2343i27 = C2343i.f9269a;
                                            interfaceC2339e31 = C2343i.f9272d;
                                            enumC2341g31 = EnumC2341g.WARN;
                                            if (interfaceC2339e31.isLoggable(enumC2341g31, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj38, "[toRtcStats] 'estimatedPlayoutTimestamp' => expected Double but found ", C2343i.f9271c, enumC2341g31, "RtcParser");
                                            }
                                            obj38 = null;
                                        }
                                        Double d14 = (Double) obj38;
                                        obj39 = next.getMembers().get("jitterBufferDelay");
                                        if (obj39 != null) {
                                            obj39 = null;
                                        } else if (!(obj39 instanceof Double)) {
                                            C2343i c2343i28 = C2343i.f9269a;
                                            interfaceC2339e32 = C2343i.f9272d;
                                            enumC2341g32 = EnumC2341g.WARN;
                                            if (interfaceC2339e32.isLoggable(enumC2341g32, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj39, "[toRtcStats] 'jitterBufferDelay' => expected Double but found ", C2343i.f9271c, enumC2341g32, "RtcParser");
                                            }
                                            obj39 = null;
                                        }
                                        Double d15 = (Double) obj39;
                                        obj40 = next.getMembers().get("jitterBufferEmittedCount");
                                        if (obj40 != null) {
                                            obj40 = null;
                                        } else if (!(obj40 instanceof Long)) {
                                            C2343i c2343i29 = C2343i.f9269a;
                                            interfaceC2339e33 = C2343i.f9272d;
                                            enumC2341g33 = EnumC2341g.WARN;
                                            if (interfaceC2339e33.isLoggable(enumC2341g33, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj40, "[toRtcStats] 'jitterBufferEmittedCount' => expected Long but found ", C2343i.f9271c, enumC2341g33, "RtcParser");
                                            }
                                            obj40 = null;
                                        }
                                        Long l16 = (Long) obj40;
                                        obj41 = next.getMembers().get("frameHeight");
                                        if (obj41 != null) {
                                            obj41 = null;
                                        } else if (!(obj41 instanceof Long)) {
                                            C2343i c2343i30 = C2343i.f9269a;
                                            interfaceC2339e34 = C2343i.f9272d;
                                            enumC2341g34 = EnumC2341g.WARN;
                                            if (interfaceC2339e34.isLoggable(enumC2341g34, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj41, "[toRtcStats] 'frameHeight' => expected Long but found ", C2343i.f9271c, enumC2341g34, "RtcParser");
                                            }
                                            obj41 = null;
                                        }
                                        Long l17 = (Long) obj41;
                                        obj42 = next.getMembers().get(obj32);
                                        if (obj42 != null) {
                                            obj42 = null;
                                        } else if (!(obj42 instanceof Long)) {
                                            C2343i c2343i31 = C2343i.f9269a;
                                            interfaceC2339e35 = C2343i.f9272d;
                                            enumC2341g35 = EnumC2341g.WARN;
                                            if (interfaceC2339e35.isLoggable(enumC2341g35, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj42, "[toRtcStats] 'frameWidth' => expected Long but found ", C2343i.f9271c, enumC2341g35, "RtcParser");
                                            }
                                            obj42 = null;
                                        }
                                        Long l18 = (Long) obj42;
                                        obj43 = next.getMembers().get("framesPerSecond");
                                        if (obj43 != null) {
                                            obj43 = null;
                                        } else if (!(obj43 instanceof Double)) {
                                            C2343i c2343i32 = C2343i.f9269a;
                                            interfaceC2339e36 = C2343i.f9272d;
                                            enumC2341g36 = EnumC2341g.WARN;
                                            if (interfaceC2339e36.isLoggable(enumC2341g36, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj43, "[toRtcStats] 'framesPerSecond' => expected Double but found ", C2343i.f9271c, enumC2341g36, "RtcParser");
                                            }
                                            obj43 = null;
                                        }
                                        Double d16 = (Double) obj43;
                                        obj44 = next.getMembers().get("framesReceived");
                                        if (obj44 != null) {
                                            obj44 = null;
                                        } else if (!(obj44 instanceof Long)) {
                                            C2343i c2343i33 = C2343i.f9269a;
                                            interfaceC2339e37 = C2343i.f9272d;
                                            enumC2341g37 = EnumC2341g.WARN;
                                            if (interfaceC2339e37.isLoggable(enumC2341g37, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj44, "[toRtcStats] 'framesReceived' => expected Long but found ", C2343i.f9271c, enumC2341g37, "RtcParser");
                                            }
                                            obj44 = null;
                                        }
                                        Long l19 = (Long) obj44;
                                        obj45 = next.getMembers().get("framesDecoded");
                                        if (obj45 != null) {
                                            obj45 = null;
                                        } else if (!(obj45 instanceof Long)) {
                                            C2343i c2343i34 = C2343i.f9269a;
                                            interfaceC2339e38 = C2343i.f9272d;
                                            enumC2341g38 = EnumC2341g.WARN;
                                            if (interfaceC2339e38.isLoggable(enumC2341g38, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj45, "[toRtcStats] 'framesDecoded' => expected Long but found ", C2343i.f9271c, enumC2341g38, "RtcParser");
                                            }
                                            obj45 = null;
                                        }
                                        Long l24 = (Long) obj45;
                                        obj46 = next.getMembers().get("framesDropped");
                                        if (obj46 != null) {
                                            obj46 = null;
                                        } else if (!(obj46 instanceof Long)) {
                                            C2343i c2343i35 = C2343i.f9269a;
                                            interfaceC2339e39 = C2343i.f9272d;
                                            enumC2341g39 = EnumC2341g.WARN;
                                            if (interfaceC2339e39.isLoggable(enumC2341g39, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj46, "[toRtcStats] 'framesDropped' => expected Long but found ", C2343i.f9271c, enumC2341g39, "RtcParser");
                                            }
                                            obj46 = null;
                                        }
                                        Long l25 = (Long) obj46;
                                        obj47 = next.getMembers().get("totalFramesDuration");
                                        if (obj47 != null) {
                                            obj47 = null;
                                        } else if (!(obj47 instanceof Double)) {
                                            C2343i c2343i36 = C2343i.f9269a;
                                            interfaceC2339e40 = C2343i.f9272d;
                                            enumC2341g40 = EnumC2341g.WARN;
                                            if (interfaceC2339e40.isLoggable(enumC2341g40, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj47, "[toRtcStats] 'totalFramesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g40, "RtcParser");
                                            }
                                            obj47 = null;
                                        }
                                        Double d17 = (Double) obj47;
                                        obj48 = next.getMembers().get("totalFreezesDuration");
                                        if (obj48 != null) {
                                            obj48 = null;
                                        } else if (!(obj48 instanceof Double)) {
                                            C2343i c2343i37 = C2343i.f9269a;
                                            interfaceC2339e41 = C2343i.f9272d;
                                            enumC2341g41 = EnumC2341g.WARN;
                                            if (interfaceC2339e41.isLoggable(enumC2341g41, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj48, "[toRtcStats] 'totalFreezesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g41, "RtcParser");
                                            }
                                            obj48 = null;
                                        }
                                        Double d18 = (Double) obj48;
                                        obj49 = next.getMembers().get("freezeCount");
                                        if (obj49 != null) {
                                            obj49 = null;
                                        } else if (!(obj49 instanceof Long)) {
                                            C2343i c2343i38 = C2343i.f9269a;
                                            interfaceC2339e42 = C2343i.f9272d;
                                            enumC2341g42 = EnumC2341g.WARN;
                                            if (interfaceC2339e42.isLoggable(enumC2341g42, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj49, "[toRtcStats] 'freezeCount' => expected Long but found ", C2343i.f9271c, enumC2341g42, "RtcParser");
                                            }
                                            obj49 = null;
                                        }
                                        Long l26 = (Long) obj49;
                                        obj50 = next.getMembers().get("pauseCount");
                                        if (obj50 != null) {
                                            obj50 = null;
                                        } else if (!(obj50 instanceof Long)) {
                                            C2343i c2343i39 = C2343i.f9269a;
                                            interfaceC2339e43 = C2343i.f9272d;
                                            enumC2341g43 = EnumC2341g.WARN;
                                            if (interfaceC2339e43.isLoggable(enumC2341g43, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj50, "[toRtcStats] 'pauseCount' => expected Long but found ", C2343i.f9271c, enumC2341g43, "RtcParser");
                                            }
                                            obj50 = null;
                                        }
                                        Long l27 = (Long) obj50;
                                        obj51 = next.getMembers().get("totalPausesDuration");
                                        if (obj51 != null) {
                                            obj51 = null;
                                        } else if (!(obj51 instanceof Double)) {
                                            C2343i c2343i40 = C2343i.f9269a;
                                            interfaceC2339e44 = C2343i.f9272d;
                                            enumC2341g44 = EnumC2341g.WARN;
                                            if (interfaceC2339e44.isLoggable(enumC2341g44, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj51, "[toRtcStats] 'totalPausesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g44, "RtcParser");
                                            }
                                            obj51 = null;
                                        }
                                        Double d19 = (Double) obj51;
                                        obj52 = next.getMembers().get("sumOfSquaredFramesDuration");
                                        if (obj52 != null) {
                                            obj53 = null;
                                        } else if (obj52 instanceof Double) {
                                            obj53 = obj52;
                                        } else {
                                            C2343i c2343i41 = C2343i.f9269a;
                                            interfaceC2339e45 = C2343i.f9272d;
                                            enumC2341g45 = EnumC2341g.WARN;
                                            if (interfaceC2339e45.isLoggable(enumC2341g45, "RtcParser")) {
                                                AbstractC21702c.m61145p(obj52, "[toRtcStats] 'sumOfSquaredFramesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g45, "RtcParser");
                                            }
                                            obj53 = null;
                                        }
                                        objM34267S = new C26235i(id5, type3, dValueOf2, str14, bool6, str15, str16, bool7, bool8, d14, d15, l16, l17, l18, d16, l19, l24, l25, d17, d18, l26, l27, d19, (Double) obj53);
                                    } else {
                                        obj32 = "frameWidth";
                                    }
                                    obj31 = null;
                                    String str17 = (String) obj31;
                                    obj33 = next.getMembers().get("ended");
                                    if (obj33 != null) {
                                        obj33 = null;
                                    } else if (!(obj33 instanceof Boolean)) {
                                        C2343i c2343i210 = C2343i.f9269a;
                                        interfaceC2339e26 = C2343i.f9272d;
                                        enumC2341g26 = EnumC2341g.WARN;
                                        if (interfaceC2339e26.isLoggable(enumC2341g26, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj33, "[toRtcStats] 'ended' => expected Boolean but found ", C2343i.f9271c, enumC2341g26, "RtcParser");
                                        }
                                        obj33 = null;
                                    }
                                    Boolean bool9 = (Boolean) obj33;
                                    obj34 = next.getMembers().get("kind");
                                    if (obj34 != null) {
                                        obj34 = null;
                                    } else if (!(obj34 instanceof String)) {
                                        C2343i c2343i211 = C2343i.f9269a;
                                        interfaceC2339e27 = C2343i.f9272d;
                                        enumC2341g27 = EnumC2341g.WARN;
                                        if (interfaceC2339e27.isLoggable(enumC2341g27, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj34, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g27, "RtcParser");
                                        }
                                        obj34 = null;
                                    }
                                    String str18 = (String) obj34;
                                    obj35 = next.getMembers().get("priority");
                                    if (obj35 != null) {
                                        obj35 = null;
                                    } else if (!(obj35 instanceof String)) {
                                        C2343i c2343i212 = C2343i.f9269a;
                                        interfaceC2339e28 = C2343i.f9272d;
                                        enumC2341g28 = EnumC2341g.WARN;
                                        if (interfaceC2339e28.isLoggable(enumC2341g28, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj35, "[toRtcStats] 'priority' => expected String but found ", C2343i.f9271c, enumC2341g28, "RtcParser");
                                        }
                                        obj35 = null;
                                    }
                                    String str19 = (String) obj35;
                                    obj36 = next.getMembers().get("remoteSource");
                                    if (obj36 != null) {
                                        obj36 = null;
                                    } else if (!(obj36 instanceof Boolean)) {
                                        C2343i c2343i213 = C2343i.f9269a;
                                        interfaceC2339e29 = C2343i.f9272d;
                                        enumC2341g29 = EnumC2341g.WARN;
                                        if (interfaceC2339e29.isLoggable(enumC2341g29, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj36, "[toRtcStats] 'remoteSource' => expected Boolean but found ", C2343i.f9271c, enumC2341g29, "RtcParser");
                                        }
                                        obj36 = null;
                                    }
                                    Boolean bool10 = (Boolean) obj36;
                                    obj37 = next.getMembers().get("detached");
                                    if (obj37 != null) {
                                        obj37 = null;
                                    } else if (!(obj37 instanceof Boolean)) {
                                        C2343i c2343i214 = C2343i.f9269a;
                                        interfaceC2339e30 = C2343i.f9272d;
                                        enumC2341g30 = EnumC2341g.WARN;
                                        if (interfaceC2339e30.isLoggable(enumC2341g30, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj37, str9, C2343i.f9271c, enumC2341g30, "RtcParser");
                                        }
                                        obj37 = null;
                                    }
                                    Boolean bool11 = (Boolean) obj37;
                                    obj38 = next.getMembers().get("estimatedPlayoutTimestamp");
                                    if (obj38 != null) {
                                        obj38 = null;
                                    } else if (!(obj38 instanceof Double)) {
                                        C2343i c2343i215 = C2343i.f9269a;
                                        interfaceC2339e31 = C2343i.f9272d;
                                        enumC2341g31 = EnumC2341g.WARN;
                                        if (interfaceC2339e31.isLoggable(enumC2341g31, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj38, "[toRtcStats] 'estimatedPlayoutTimestamp' => expected Double but found ", C2343i.f9271c, enumC2341g31, "RtcParser");
                                        }
                                        obj38 = null;
                                    }
                                    Double d110 = (Double) obj38;
                                    obj39 = next.getMembers().get("jitterBufferDelay");
                                    if (obj39 != null) {
                                        obj39 = null;
                                    } else if (!(obj39 instanceof Double)) {
                                        C2343i c2343i216 = C2343i.f9269a;
                                        interfaceC2339e32 = C2343i.f9272d;
                                        enumC2341g32 = EnumC2341g.WARN;
                                        if (interfaceC2339e32.isLoggable(enumC2341g32, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj39, "[toRtcStats] 'jitterBufferDelay' => expected Double but found ", C2343i.f9271c, enumC2341g32, "RtcParser");
                                        }
                                        obj39 = null;
                                    }
                                    Double d111 = (Double) obj39;
                                    obj40 = next.getMembers().get("jitterBufferEmittedCount");
                                    if (obj40 != null) {
                                        obj40 = null;
                                    } else if (!(obj40 instanceof Long)) {
                                        C2343i c2343i217 = C2343i.f9269a;
                                        interfaceC2339e33 = C2343i.f9272d;
                                        enumC2341g33 = EnumC2341g.WARN;
                                        if (interfaceC2339e33.isLoggable(enumC2341g33, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj40, "[toRtcStats] 'jitterBufferEmittedCount' => expected Long but found ", C2343i.f9271c, enumC2341g33, "RtcParser");
                                        }
                                        obj40 = null;
                                    }
                                    Long l110 = (Long) obj40;
                                    obj41 = next.getMembers().get("frameHeight");
                                    if (obj41 != null) {
                                        obj41 = null;
                                    } else if (!(obj41 instanceof Long)) {
                                        C2343i c2343i310 = C2343i.f9269a;
                                        interfaceC2339e34 = C2343i.f9272d;
                                        enumC2341g34 = EnumC2341g.WARN;
                                        if (interfaceC2339e34.isLoggable(enumC2341g34, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj41, "[toRtcStats] 'frameHeight' => expected Long but found ", C2343i.f9271c, enumC2341g34, "RtcParser");
                                        }
                                        obj41 = null;
                                    }
                                    Long l111 = (Long) obj41;
                                    obj42 = next.getMembers().get(obj32);
                                    if (obj42 != null) {
                                        obj42 = null;
                                    } else if (!(obj42 instanceof Long)) {
                                        C2343i c2343i311 = C2343i.f9269a;
                                        interfaceC2339e35 = C2343i.f9272d;
                                        enumC2341g35 = EnumC2341g.WARN;
                                        if (interfaceC2339e35.isLoggable(enumC2341g35, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj42, "[toRtcStats] 'frameWidth' => expected Long but found ", C2343i.f9271c, enumC2341g35, "RtcParser");
                                        }
                                        obj42 = null;
                                    }
                                    Long l112 = (Long) obj42;
                                    obj43 = next.getMembers().get("framesPerSecond");
                                    if (obj43 != null) {
                                        obj43 = null;
                                    } else if (!(obj43 instanceof Double)) {
                                        C2343i c2343i312 = C2343i.f9269a;
                                        interfaceC2339e36 = C2343i.f9272d;
                                        enumC2341g36 = EnumC2341g.WARN;
                                        if (interfaceC2339e36.isLoggable(enumC2341g36, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj43, "[toRtcStats] 'framesPerSecond' => expected Double but found ", C2343i.f9271c, enumC2341g36, "RtcParser");
                                        }
                                        obj43 = null;
                                    }
                                    Double d112 = (Double) obj43;
                                    obj44 = next.getMembers().get("framesReceived");
                                    if (obj44 != null) {
                                        obj44 = null;
                                    } else if (!(obj44 instanceof Long)) {
                                        C2343i c2343i313 = C2343i.f9269a;
                                        interfaceC2339e37 = C2343i.f9272d;
                                        enumC2341g37 = EnumC2341g.WARN;
                                        if (interfaceC2339e37.isLoggable(enumC2341g37, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj44, "[toRtcStats] 'framesReceived' => expected Long but found ", C2343i.f9271c, enumC2341g37, "RtcParser");
                                        }
                                        obj44 = null;
                                    }
                                    Long l113 = (Long) obj44;
                                    obj45 = next.getMembers().get("framesDecoded");
                                    if (obj45 != null) {
                                        obj45 = null;
                                    } else if (!(obj45 instanceof Long)) {
                                        C2343i c2343i314 = C2343i.f9269a;
                                        interfaceC2339e38 = C2343i.f9272d;
                                        enumC2341g38 = EnumC2341g.WARN;
                                        if (interfaceC2339e38.isLoggable(enumC2341g38, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj45, "[toRtcStats] 'framesDecoded' => expected Long but found ", C2343i.f9271c, enumC2341g38, "RtcParser");
                                        }
                                        obj45 = null;
                                    }
                                    Long l28 = (Long) obj45;
                                    obj46 = next.getMembers().get("framesDropped");
                                    if (obj46 != null) {
                                        obj46 = null;
                                    } else if (!(obj46 instanceof Long)) {
                                        C2343i c2343i315 = C2343i.f9269a;
                                        interfaceC2339e39 = C2343i.f9272d;
                                        enumC2341g39 = EnumC2341g.WARN;
                                        if (interfaceC2339e39.isLoggable(enumC2341g39, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj46, "[toRtcStats] 'framesDropped' => expected Long but found ", C2343i.f9271c, enumC2341g39, "RtcParser");
                                        }
                                        obj46 = null;
                                    }
                                    Long l29 = (Long) obj46;
                                    obj47 = next.getMembers().get("totalFramesDuration");
                                    if (obj47 != null) {
                                        obj47 = null;
                                    } else if (!(obj47 instanceof Double)) {
                                        C2343i c2343i316 = C2343i.f9269a;
                                        interfaceC2339e40 = C2343i.f9272d;
                                        enumC2341g40 = EnumC2341g.WARN;
                                        if (interfaceC2339e40.isLoggable(enumC2341g40, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj47, "[toRtcStats] 'totalFramesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g40, "RtcParser");
                                        }
                                        obj47 = null;
                                    }
                                    Double d113 = (Double) obj47;
                                    obj48 = next.getMembers().get("totalFreezesDuration");
                                    if (obj48 != null) {
                                        obj48 = null;
                                    } else if (!(obj48 instanceof Double)) {
                                        C2343i c2343i317 = C2343i.f9269a;
                                        interfaceC2339e41 = C2343i.f9272d;
                                        enumC2341g41 = EnumC2341g.WARN;
                                        if (interfaceC2339e41.isLoggable(enumC2341g41, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj48, "[toRtcStats] 'totalFreezesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g41, "RtcParser");
                                        }
                                        obj48 = null;
                                    }
                                    Double d114 = (Double) obj48;
                                    obj49 = next.getMembers().get("freezeCount");
                                    if (obj49 != null) {
                                        obj49 = null;
                                    } else if (!(obj49 instanceof Long)) {
                                        C2343i c2343i318 = C2343i.f9269a;
                                        interfaceC2339e42 = C2343i.f9272d;
                                        enumC2341g42 = EnumC2341g.WARN;
                                        if (interfaceC2339e42.isLoggable(enumC2341g42, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj49, "[toRtcStats] 'freezeCount' => expected Long but found ", C2343i.f9271c, enumC2341g42, "RtcParser");
                                        }
                                        obj49 = null;
                                    }
                                    Long l210 = (Long) obj49;
                                    obj50 = next.getMembers().get("pauseCount");
                                    if (obj50 != null) {
                                        obj50 = null;
                                    } else if (!(obj50 instanceof Long)) {
                                        C2343i c2343i319 = C2343i.f9269a;
                                        interfaceC2339e43 = C2343i.f9272d;
                                        enumC2341g43 = EnumC2341g.WARN;
                                        if (interfaceC2339e43.isLoggable(enumC2341g43, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj50, "[toRtcStats] 'pauseCount' => expected Long but found ", C2343i.f9271c, enumC2341g43, "RtcParser");
                                        }
                                        obj50 = null;
                                    }
                                    Long l211 = (Long) obj50;
                                    obj51 = next.getMembers().get("totalPausesDuration");
                                    if (obj51 != null) {
                                        obj51 = null;
                                    } else if (!(obj51 instanceof Double)) {
                                        C2343i c2343i42 = C2343i.f9269a;
                                        interfaceC2339e44 = C2343i.f9272d;
                                        enumC2341g44 = EnumC2341g.WARN;
                                        if (interfaceC2339e44.isLoggable(enumC2341g44, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj51, "[toRtcStats] 'totalPausesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g44, "RtcParser");
                                        }
                                        obj51 = null;
                                    }
                                    Double d115 = (Double) obj51;
                                    obj52 = next.getMembers().get("sumOfSquaredFramesDuration");
                                    if (obj52 != null) {
                                        obj53 = null;
                                    } else if (obj52 instanceof Double) {
                                        C2343i c2343i43 = C2343i.f9269a;
                                        interfaceC2339e45 = C2343i.f9272d;
                                        enumC2341g45 = EnumC2341g.WARN;
                                        if (interfaceC2339e45.isLoggable(enumC2341g45, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj52, "[toRtcStats] 'sumOfSquaredFramesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g45, "RtcParser");
                                        }
                                        obj53 = null;
                                    } else {
                                        obj53 = obj52;
                                    }
                                    objM34267S = new C26235i(id5, type3, dValueOf2, str17, bool9, str18, str19, bool10, bool11, d110, d111, l110, l111, l112, d112, l113, l28, l29, d113, d114, l210, l211, d115, (Double) obj53);
                                }
                            } else {
                                obj14 = "mediaSourceId";
                            }
                            obj71 = null;
                            bool2 = (Boolean) obj71;
                            if (AbstractC22676k.m65745e(bool2, Boolean.TRUE)) {
                                str2 = str9;
                                if (AbstractC22676k.m65745e(bool2, Boolean.FALSE)) {
                                    objM34267S = null;
                                } else {
                                    String id6 = next.getId();
                                    String type4 = next.getType();
                                    Double dValueOf3 = Double.valueOf(next.getTimestampUs());
                                    obj15 = next.getMembers().get("trackIdentifier");
                                    if (obj15 != null) {
                                        obj15 = null;
                                    } else if (!(obj15 instanceof String)) {
                                        C2343i c2343i44 = C2343i.f9269a;
                                        interfaceC2339e11 = C2343i.f9272d;
                                        enumC2341g11 = EnumC2341g.WARN;
                                        if (interfaceC2339e11.isLoggable(enumC2341g11, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g11, "RtcParser", AbstractC21702c.m61134e(obj15, "[toRtcStats] 'trackIdentifier' => expected String but found "), null);
                                        }
                                        obj15 = null;
                                    }
                                    String str110 = (String) obj15;
                                    obj16 = next.getMembers().get("ended");
                                    if (obj16 != null) {
                                        obj16 = null;
                                    } else if (!(obj16 instanceof Boolean)) {
                                        C2343i c2343i45 = C2343i.f9269a;
                                        interfaceC2339e12 = C2343i.f9272d;
                                        enumC2341g12 = EnumC2341g.WARN;
                                        if (interfaceC2339e12.isLoggable(enumC2341g12, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g12, "RtcParser", AbstractC21702c.m61134e(obj16, "[toRtcStats] 'ended' => expected Boolean but found "), null);
                                        }
                                        obj16 = null;
                                    }
                                    Boolean bool12 = (Boolean) obj16;
                                    obj17 = next.getMembers().get("kind");
                                    if (obj17 != null) {
                                        obj17 = null;
                                    } else if (!(obj17 instanceof String)) {
                                        C2343i c2343i46 = C2343i.f9269a;
                                        interfaceC2339e13 = C2343i.f9272d;
                                        enumC2341g13 = EnumC2341g.WARN;
                                        if (interfaceC2339e13.isLoggable(enumC2341g13, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g13, "RtcParser", AbstractC21702c.m61134e(obj17, "[toRtcStats] 'kind' => expected String but found "), null);
                                        }
                                        obj17 = null;
                                    }
                                    String str111 = (String) obj17;
                                    obj18 = next.getMembers().get("priority");
                                    if (obj18 != null) {
                                        obj18 = null;
                                    } else if (!(obj18 instanceof String)) {
                                        C2343i c2343i110 = C2343i.f9269a;
                                        interfaceC2339e14 = C2343i.f9272d;
                                        enumC2341g14 = EnumC2341g.WARN;
                                        if (interfaceC2339e14.isLoggable(enumC2341g14, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g14, "RtcParser", AbstractC21702c.m61134e(obj18, "[toRtcStats] 'priority' => expected String but found "), null);
                                        }
                                        obj18 = null;
                                    }
                                    String str112 = (String) obj18;
                                    obj19 = next.getMembers().get("remoteSource");
                                    if (obj19 != null) {
                                        obj19 = null;
                                    } else if (!(obj19 instanceof Boolean)) {
                                        C2343i c2343i111 = C2343i.f9269a;
                                        interfaceC2339e15 = C2343i.f9272d;
                                        enumC2341g15 = EnumC2341g.WARN;
                                        if (interfaceC2339e15.isLoggable(enumC2341g15, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g15, "RtcParser", AbstractC21702c.m61134e(obj19, "[toRtcStats] 'remoteSource' => expected Boolean but found "), null);
                                        }
                                        obj19 = null;
                                    }
                                    Boolean bool13 = (Boolean) obj19;
                                    obj20 = next.getMembers().get("detached");
                                    if (obj20 != null) {
                                        obj20 = null;
                                    } else if (!(obj20 instanceof Boolean)) {
                                        C2343i c2343i112 = C2343i.f9269a;
                                        interfaceC2339e16 = C2343i.f9272d;
                                        enumC2341g16 = EnumC2341g.WARN;
                                        if (interfaceC2339e16.isLoggable(enumC2341g16, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g16, "RtcParser", AbstractC21702c.m61134e(obj20, str2), null);
                                        }
                                        obj20 = null;
                                    }
                                    Boolean bool14 = (Boolean) obj20;
                                    obj21 = next.getMembers().get(obj14);
                                    if (obj21 != null) {
                                        obj21 = null;
                                    } else if (!(obj21 instanceof String)) {
                                        C2343i c2343i113 = C2343i.f9269a;
                                        interfaceC2339e17 = C2343i.f9272d;
                                        enumC2341g17 = EnumC2341g.WARN;
                                        if (interfaceC2339e17.isLoggable(enumC2341g17, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g17, "RtcParser", AbstractC21702c.m61134e(obj21, "[toRtcStats] 'mediaSourceId' => expected String but found "), null);
                                        }
                                        obj21 = null;
                                    }
                                    String str113 = (String) obj21;
                                    obj22 = next.getMembers().get("frameHeight");
                                    if (obj22 != null) {
                                        obj22 = null;
                                    } else if (!(obj22 instanceof Long)) {
                                        C2343i c2343i114 = C2343i.f9269a;
                                        interfaceC2339e18 = C2343i.f9272d;
                                        enumC2341g18 = EnumC2341g.WARN;
                                        if (interfaceC2339e18.isLoggable(enumC2341g18, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g18, "RtcParser", AbstractC21702c.m61134e(obj22, "[toRtcStats] 'frameHeight' => expected Long but found "), null);
                                        }
                                        obj22 = null;
                                    }
                                    Long l34 = (Long) obj22;
                                    obj23 = next.getMembers().get("frameWidth");
                                    if (obj23 != null) {
                                        obj23 = null;
                                    } else if (!(obj23 instanceof Long)) {
                                        C2343i c2343i115 = C2343i.f9269a;
                                        interfaceC2339e19 = C2343i.f9272d;
                                        enumC2341g19 = EnumC2341g.WARN;
                                        if (interfaceC2339e19.isLoggable(enumC2341g19, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g19, "RtcParser", AbstractC21702c.m61134e(obj23, "[toRtcStats] 'frameWidth' => expected Long but found "), null);
                                        }
                                        obj23 = null;
                                    }
                                    Long l114 = (Long) obj23;
                                    obj24 = next.getMembers().get("framesPerSecond");
                                    if (obj24 != null) {
                                        obj24 = null;
                                    } else if (!(obj24 instanceof Double)) {
                                        C2343i c2343i116 = C2343i.f9269a;
                                        interfaceC2339e20 = C2343i.f9272d;
                                        enumC2341g20 = EnumC2341g.WARN;
                                        if (interfaceC2339e20.isLoggable(enumC2341g20, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g20, "RtcParser", AbstractC21702c.m61134e(obj24, "[toRtcStats] 'framesPerSecond' => expected Double but found "), null);
                                        }
                                        obj24 = null;
                                    }
                                    Double d24 = (Double) obj24;
                                    obj25 = next.getMembers().get("keyFramesSent");
                                    if (obj25 != null) {
                                        obj25 = null;
                                    } else if (!(obj25 instanceof Long)) {
                                        C2343i c2343i117 = C2343i.f9269a;
                                        interfaceC2339e21 = C2343i.f9272d;
                                        enumC2341g21 = EnumC2341g.WARN;
                                        if (interfaceC2339e21.isLoggable(enumC2341g21, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g21, "RtcParser", AbstractC21702c.m61134e(obj25, "[toRtcStats] 'keyFramesSent' => expected Long but found "), null);
                                        }
                                        obj25 = null;
                                    }
                                    Long l115 = (Long) obj25;
                                    obj26 = next.getMembers().get("framesCaptured");
                                    if (obj26 != null) {
                                        obj26 = null;
                                    } else if (!(obj26 instanceof Long)) {
                                        C2343i c2343i118 = C2343i.f9269a;
                                        interfaceC2339e22 = C2343i.f9272d;
                                        enumC2341g22 = EnumC2341g.WARN;
                                        if (interfaceC2339e22.isLoggable(enumC2341g22, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g22, "RtcParser", AbstractC21702c.m61134e(obj26, "[toRtcStats] 'framesCaptured' => expected Long but found "), null);
                                        }
                                        obj26 = null;
                                    }
                                    Long l116 = (Long) obj26;
                                    obj27 = next.getMembers().get("framesSent");
                                    if (obj27 != null) {
                                        obj27 = null;
                                    } else if (!(obj27 instanceof Long)) {
                                        C2343i c2343i119 = C2343i.f9269a;
                                        interfaceC2339e23 = C2343i.f9272d;
                                        enumC2341g23 = EnumC2341g.WARN;
                                        if (interfaceC2339e23.isLoggable(enumC2341g23, "RtcParser")) {
                                            C2343i.f9271c.log(enumC2341g23, "RtcParser", AbstractC21702c.m61134e(obj27, "[toRtcStats] 'framesSent' => expected Long but found "), null);
                                        }
                                        obj27 = null;
                                    }
                                    Long l117 = (Long) obj27;
                                    obj28 = next.getMembers().get("hugeFramesSent");
                                    if (obj28 == null) {
                                        obj29 = null;
                                    } else if (obj28 instanceof Long) {
                                        C2343i c2343i218 = C2343i.f9269a;
                                        interfaceC2339e24 = C2343i.f9272d;
                                        enumC2341g24 = EnumC2341g.WARN;
                                        if (interfaceC2339e24.isLoggable(enumC2341g24, "RtcParser")) {
                                            obj30 = null;
                                            C2343i.f9271c.log(enumC2341g24, "RtcParser", AbstractC21702c.m61134e(obj28, "[toRtcStats] 'hugeFramesSent' => expected Long but found "), null);
                                        } else {
                                            obj30 = null;
                                        }
                                        obj29 = obj30;
                                    } else {
                                        obj29 = obj28;
                                    }
                                    objM34267S = new C26236j(id6, type4, dValueOf3, str110, bool12, str111, str112, bool13, bool14, str113, l34, l114, d24, l115, l116, l117, (Long) obj29);
                                }
                            } else {
                                String id7 = next.getId();
                                String type5 = next.getType();
                                Double dValueOf4 = Double.valueOf(next.getTimestampUs());
                                obj31 = next.getMembers().get("trackIdentifier");
                                if (obj31 == null) {
                                    if (obj31 instanceof String) {
                                        C2343i c2343i219 = C2343i.f9269a;
                                        interfaceC2339e25 = C2343i.f9272d;
                                        obj32 = "frameWidth";
                                        enumC2341g25 = EnumC2341g.WARN;
                                        if (interfaceC2339e25.isLoggable(enumC2341g25, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj31, "[toRtcStats] 'trackIdentifier' => expected String but found ", C2343i.f9271c, enumC2341g25, "RtcParser");
                                        }
                                    } else {
                                        obj32 = "frameWidth";
                                    }
                                    String str114 = (String) obj31;
                                    obj33 = next.getMembers().get("ended");
                                    if (obj33 != null) {
                                        obj33 = null;
                                    } else if (!(obj33 instanceof Boolean)) {
                                        C2343i c2343i2110 = C2343i.f9269a;
                                        interfaceC2339e26 = C2343i.f9272d;
                                        enumC2341g26 = EnumC2341g.WARN;
                                        if (interfaceC2339e26.isLoggable(enumC2341g26, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj33, "[toRtcStats] 'ended' => expected Boolean but found ", C2343i.f9271c, enumC2341g26, "RtcParser");
                                        }
                                        obj33 = null;
                                    }
                                    Boolean bool15 = (Boolean) obj33;
                                    obj34 = next.getMembers().get("kind");
                                    if (obj34 != null) {
                                        obj34 = null;
                                    } else if (!(obj34 instanceof String)) {
                                        C2343i c2343i2111 = C2343i.f9269a;
                                        interfaceC2339e27 = C2343i.f9272d;
                                        enumC2341g27 = EnumC2341g.WARN;
                                        if (interfaceC2339e27.isLoggable(enumC2341g27, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj34, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g27, "RtcParser");
                                        }
                                        obj34 = null;
                                    }
                                    String str115 = (String) obj34;
                                    obj35 = next.getMembers().get("priority");
                                    if (obj35 != null) {
                                        obj35 = null;
                                    } else if (!(obj35 instanceof String)) {
                                        C2343i c2343i2112 = C2343i.f9269a;
                                        interfaceC2339e28 = C2343i.f9272d;
                                        enumC2341g28 = EnumC2341g.WARN;
                                        if (interfaceC2339e28.isLoggable(enumC2341g28, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj35, "[toRtcStats] 'priority' => expected String but found ", C2343i.f9271c, enumC2341g28, "RtcParser");
                                        }
                                        obj35 = null;
                                    }
                                    String str116 = (String) obj35;
                                    obj36 = next.getMembers().get("remoteSource");
                                    if (obj36 != null) {
                                        obj36 = null;
                                    } else if (!(obj36 instanceof Boolean)) {
                                        C2343i c2343i2113 = C2343i.f9269a;
                                        interfaceC2339e29 = C2343i.f9272d;
                                        enumC2341g29 = EnumC2341g.WARN;
                                        if (interfaceC2339e29.isLoggable(enumC2341g29, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj36, "[toRtcStats] 'remoteSource' => expected Boolean but found ", C2343i.f9271c, enumC2341g29, "RtcParser");
                                        }
                                        obj36 = null;
                                    }
                                    Boolean bool16 = (Boolean) obj36;
                                    obj37 = next.getMembers().get("detached");
                                    if (obj37 != null) {
                                        obj37 = null;
                                    } else if (!(obj37 instanceof Boolean)) {
                                        C2343i c2343i2114 = C2343i.f9269a;
                                        interfaceC2339e30 = C2343i.f9272d;
                                        enumC2341g30 = EnumC2341g.WARN;
                                        if (interfaceC2339e30.isLoggable(enumC2341g30, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj37, str9, C2343i.f9271c, enumC2341g30, "RtcParser");
                                        }
                                        obj37 = null;
                                    }
                                    Boolean bool17 = (Boolean) obj37;
                                    obj38 = next.getMembers().get("estimatedPlayoutTimestamp");
                                    if (obj38 != null) {
                                        obj38 = null;
                                    } else if (!(obj38 instanceof Double)) {
                                        C2343i c2343i2115 = C2343i.f9269a;
                                        interfaceC2339e31 = C2343i.f9272d;
                                        enumC2341g31 = EnumC2341g.WARN;
                                        if (interfaceC2339e31.isLoggable(enumC2341g31, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj38, "[toRtcStats] 'estimatedPlayoutTimestamp' => expected Double but found ", C2343i.f9271c, enumC2341g31, "RtcParser");
                                        }
                                        obj38 = null;
                                    }
                                    Double d116 = (Double) obj38;
                                    obj39 = next.getMembers().get("jitterBufferDelay");
                                    if (obj39 != null) {
                                        obj39 = null;
                                    } else if (!(obj39 instanceof Double)) {
                                        C2343i c2343i2116 = C2343i.f9269a;
                                        interfaceC2339e32 = C2343i.f9272d;
                                        enumC2341g32 = EnumC2341g.WARN;
                                        if (interfaceC2339e32.isLoggable(enumC2341g32, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj39, "[toRtcStats] 'jitterBufferDelay' => expected Double but found ", C2343i.f9271c, enumC2341g32, "RtcParser");
                                        }
                                        obj39 = null;
                                    }
                                    Double d117 = (Double) obj39;
                                    obj40 = next.getMembers().get("jitterBufferEmittedCount");
                                    if (obj40 != null) {
                                        obj40 = null;
                                    } else if (!(obj40 instanceof Long)) {
                                        C2343i c2343i2117 = C2343i.f9269a;
                                        interfaceC2339e33 = C2343i.f9272d;
                                        enumC2341g33 = EnumC2341g.WARN;
                                        if (interfaceC2339e33.isLoggable(enumC2341g33, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj40, "[toRtcStats] 'jitterBufferEmittedCount' => expected Long but found ", C2343i.f9271c, enumC2341g33, "RtcParser");
                                        }
                                        obj40 = null;
                                    }
                                    Long l118 = (Long) obj40;
                                    obj41 = next.getMembers().get("frameHeight");
                                    if (obj41 != null) {
                                        obj41 = null;
                                    } else if (!(obj41 instanceof Long)) {
                                        C2343i c2343i3110 = C2343i.f9269a;
                                        interfaceC2339e34 = C2343i.f9272d;
                                        enumC2341g34 = EnumC2341g.WARN;
                                        if (interfaceC2339e34.isLoggable(enumC2341g34, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj41, "[toRtcStats] 'frameHeight' => expected Long but found ", C2343i.f9271c, enumC2341g34, "RtcParser");
                                        }
                                        obj41 = null;
                                    }
                                    Long l119 = (Long) obj41;
                                    obj42 = next.getMembers().get(obj32);
                                    if (obj42 != null) {
                                        obj42 = null;
                                    } else if (!(obj42 instanceof Long)) {
                                        C2343i c2343i3111 = C2343i.f9269a;
                                        interfaceC2339e35 = C2343i.f9272d;
                                        enumC2341g35 = EnumC2341g.WARN;
                                        if (interfaceC2339e35.isLoggable(enumC2341g35, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj42, "[toRtcStats] 'frameWidth' => expected Long but found ", C2343i.f9271c, enumC2341g35, "RtcParser");
                                        }
                                        obj42 = null;
                                    }
                                    Long l1110 = (Long) obj42;
                                    obj43 = next.getMembers().get("framesPerSecond");
                                    if (obj43 != null) {
                                        obj43 = null;
                                    } else if (!(obj43 instanceof Double)) {
                                        C2343i c2343i3112 = C2343i.f9269a;
                                        interfaceC2339e36 = C2343i.f9272d;
                                        enumC2341g36 = EnumC2341g.WARN;
                                        if (interfaceC2339e36.isLoggable(enumC2341g36, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj43, "[toRtcStats] 'framesPerSecond' => expected Double but found ", C2343i.f9271c, enumC2341g36, "RtcParser");
                                        }
                                        obj43 = null;
                                    }
                                    Double d118 = (Double) obj43;
                                    obj44 = next.getMembers().get("framesReceived");
                                    if (obj44 != null) {
                                        obj44 = null;
                                    } else if (!(obj44 instanceof Long)) {
                                        C2343i c2343i3113 = C2343i.f9269a;
                                        interfaceC2339e37 = C2343i.f9272d;
                                        enumC2341g37 = EnumC2341g.WARN;
                                        if (interfaceC2339e37.isLoggable(enumC2341g37, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj44, "[toRtcStats] 'framesReceived' => expected Long but found ", C2343i.f9271c, enumC2341g37, "RtcParser");
                                        }
                                        obj44 = null;
                                    }
                                    Long l1111 = (Long) obj44;
                                    obj45 = next.getMembers().get("framesDecoded");
                                    if (obj45 != null) {
                                        obj45 = null;
                                    } else if (!(obj45 instanceof Long)) {
                                        C2343i c2343i3114 = C2343i.f9269a;
                                        interfaceC2339e38 = C2343i.f9272d;
                                        enumC2341g38 = EnumC2341g.WARN;
                                        if (interfaceC2339e38.isLoggable(enumC2341g38, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj45, "[toRtcStats] 'framesDecoded' => expected Long but found ", C2343i.f9271c, enumC2341g38, "RtcParser");
                                        }
                                        obj45 = null;
                                    }
                                    Long l212 = (Long) obj45;
                                    obj46 = next.getMembers().get("framesDropped");
                                    if (obj46 != null) {
                                        obj46 = null;
                                    } else if (!(obj46 instanceof Long)) {
                                        C2343i c2343i3115 = C2343i.f9269a;
                                        interfaceC2339e39 = C2343i.f9272d;
                                        enumC2341g39 = EnumC2341g.WARN;
                                        if (interfaceC2339e39.isLoggable(enumC2341g39, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj46, "[toRtcStats] 'framesDropped' => expected Long but found ", C2343i.f9271c, enumC2341g39, "RtcParser");
                                        }
                                        obj46 = null;
                                    }
                                    Long l213 = (Long) obj46;
                                    obj47 = next.getMembers().get("totalFramesDuration");
                                    if (obj47 != null) {
                                        obj47 = null;
                                    } else if (!(obj47 instanceof Double)) {
                                        C2343i c2343i3116 = C2343i.f9269a;
                                        interfaceC2339e40 = C2343i.f9272d;
                                        enumC2341g40 = EnumC2341g.WARN;
                                        if (interfaceC2339e40.isLoggable(enumC2341g40, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj47, "[toRtcStats] 'totalFramesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g40, "RtcParser");
                                        }
                                        obj47 = null;
                                    }
                                    Double d119 = (Double) obj47;
                                    obj48 = next.getMembers().get("totalFreezesDuration");
                                    if (obj48 != null) {
                                        obj48 = null;
                                    } else if (!(obj48 instanceof Double)) {
                                        C2343i c2343i3117 = C2343i.f9269a;
                                        interfaceC2339e41 = C2343i.f9272d;
                                        enumC2341g41 = EnumC2341g.WARN;
                                        if (interfaceC2339e41.isLoggable(enumC2341g41, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj48, "[toRtcStats] 'totalFreezesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g41, "RtcParser");
                                        }
                                        obj48 = null;
                                    }
                                    Double d1110 = (Double) obj48;
                                    obj49 = next.getMembers().get("freezeCount");
                                    if (obj49 != null) {
                                        obj49 = null;
                                    } else if (!(obj49 instanceof Long)) {
                                        C2343i c2343i3118 = C2343i.f9269a;
                                        interfaceC2339e42 = C2343i.f9272d;
                                        enumC2341g42 = EnumC2341g.WARN;
                                        if (interfaceC2339e42.isLoggable(enumC2341g42, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj49, "[toRtcStats] 'freezeCount' => expected Long but found ", C2343i.f9271c, enumC2341g42, "RtcParser");
                                        }
                                        obj49 = null;
                                    }
                                    Long l214 = (Long) obj49;
                                    obj50 = next.getMembers().get("pauseCount");
                                    if (obj50 != null) {
                                        obj50 = null;
                                    } else if (!(obj50 instanceof Long)) {
                                        C2343i c2343i3119 = C2343i.f9269a;
                                        interfaceC2339e43 = C2343i.f9272d;
                                        enumC2341g43 = EnumC2341g.WARN;
                                        if (interfaceC2339e43.isLoggable(enumC2341g43, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj50, "[toRtcStats] 'pauseCount' => expected Long but found ", C2343i.f9271c, enumC2341g43, "RtcParser");
                                        }
                                        obj50 = null;
                                    }
                                    Long l215 = (Long) obj50;
                                    obj51 = next.getMembers().get("totalPausesDuration");
                                    if (obj51 != null) {
                                        obj51 = null;
                                    } else if (!(obj51 instanceof Double)) {
                                        C2343i c2343i47 = C2343i.f9269a;
                                        interfaceC2339e44 = C2343i.f9272d;
                                        enumC2341g44 = EnumC2341g.WARN;
                                        if (interfaceC2339e44.isLoggable(enumC2341g44, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj51, "[toRtcStats] 'totalPausesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g44, "RtcParser");
                                        }
                                        obj51 = null;
                                    }
                                    Double d1111 = (Double) obj51;
                                    obj52 = next.getMembers().get("sumOfSquaredFramesDuration");
                                    if (obj52 != null) {
                                        obj53 = null;
                                    } else if (obj52 instanceof Double) {
                                        C2343i c2343i48 = C2343i.f9269a;
                                        interfaceC2339e45 = C2343i.f9272d;
                                        enumC2341g45 = EnumC2341g.WARN;
                                        if (interfaceC2339e45.isLoggable(enumC2341g45, "RtcParser")) {
                                            AbstractC21702c.m61145p(obj52, "[toRtcStats] 'sumOfSquaredFramesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g45, "RtcParser");
                                        }
                                        obj53 = null;
                                    } else {
                                        obj53 = obj52;
                                    }
                                    objM34267S = new C26235i(id7, type5, dValueOf4, str114, bool15, str115, str116, bool16, bool17, d116, d117, l118, l119, l1110, d118, l1111, l212, l213, d119, d1110, l214, l215, d1111, (Double) obj53);
                                } else {
                                    obj32 = "frameWidth";
                                }
                                obj31 = null;
                                String str117 = (String) obj31;
                                obj33 = next.getMembers().get("ended");
                                if (obj33 != null) {
                                    obj33 = null;
                                } else if (!(obj33 instanceof Boolean)) {
                                    C2343i c2343i2118 = C2343i.f9269a;
                                    interfaceC2339e26 = C2343i.f9272d;
                                    enumC2341g26 = EnumC2341g.WARN;
                                    if (interfaceC2339e26.isLoggable(enumC2341g26, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj33, "[toRtcStats] 'ended' => expected Boolean but found ", C2343i.f9271c, enumC2341g26, "RtcParser");
                                    }
                                    obj33 = null;
                                }
                                Boolean bool18 = (Boolean) obj33;
                                obj34 = next.getMembers().get("kind");
                                if (obj34 != null) {
                                    obj34 = null;
                                } else if (!(obj34 instanceof String)) {
                                    C2343i c2343i2119 = C2343i.f9269a;
                                    interfaceC2339e27 = C2343i.f9272d;
                                    enumC2341g27 = EnumC2341g.WARN;
                                    if (interfaceC2339e27.isLoggable(enumC2341g27, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj34, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g27, "RtcParser");
                                    }
                                    obj34 = null;
                                }
                                String str118 = (String) obj34;
                                obj35 = next.getMembers().get("priority");
                                if (obj35 != null) {
                                    obj35 = null;
                                } else if (!(obj35 instanceof String)) {
                                    C2343i c2343i21110 = C2343i.f9269a;
                                    interfaceC2339e28 = C2343i.f9272d;
                                    enumC2341g28 = EnumC2341g.WARN;
                                    if (interfaceC2339e28.isLoggable(enumC2341g28, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj35, "[toRtcStats] 'priority' => expected String but found ", C2343i.f9271c, enumC2341g28, "RtcParser");
                                    }
                                    obj35 = null;
                                }
                                String str119 = (String) obj35;
                                obj36 = next.getMembers().get("remoteSource");
                                if (obj36 != null) {
                                    obj36 = null;
                                } else if (!(obj36 instanceof Boolean)) {
                                    C2343i c2343i21111 = C2343i.f9269a;
                                    interfaceC2339e29 = C2343i.f9272d;
                                    enumC2341g29 = EnumC2341g.WARN;
                                    if (interfaceC2339e29.isLoggable(enumC2341g29, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj36, "[toRtcStats] 'remoteSource' => expected Boolean but found ", C2343i.f9271c, enumC2341g29, "RtcParser");
                                    }
                                    obj36 = null;
                                }
                                Boolean bool19 = (Boolean) obj36;
                                obj37 = next.getMembers().get("detached");
                                if (obj37 != null) {
                                    obj37 = null;
                                } else if (!(obj37 instanceof Boolean)) {
                                    C2343i c2343i21112 = C2343i.f9269a;
                                    interfaceC2339e30 = C2343i.f9272d;
                                    enumC2341g30 = EnumC2341g.WARN;
                                    if (interfaceC2339e30.isLoggable(enumC2341g30, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj37, str9, C2343i.f9271c, enumC2341g30, "RtcParser");
                                    }
                                    obj37 = null;
                                }
                                Boolean bool110 = (Boolean) obj37;
                                obj38 = next.getMembers().get("estimatedPlayoutTimestamp");
                                if (obj38 != null) {
                                    obj38 = null;
                                } else if (!(obj38 instanceof Double)) {
                                    C2343i c2343i21113 = C2343i.f9269a;
                                    interfaceC2339e31 = C2343i.f9272d;
                                    enumC2341g31 = EnumC2341g.WARN;
                                    if (interfaceC2339e31.isLoggable(enumC2341g31, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj38, "[toRtcStats] 'estimatedPlayoutTimestamp' => expected Double but found ", C2343i.f9271c, enumC2341g31, "RtcParser");
                                    }
                                    obj38 = null;
                                }
                                Double d1112 = (Double) obj38;
                                obj39 = next.getMembers().get("jitterBufferDelay");
                                if (obj39 != null) {
                                    obj39 = null;
                                } else if (!(obj39 instanceof Double)) {
                                    C2343i c2343i21114 = C2343i.f9269a;
                                    interfaceC2339e32 = C2343i.f9272d;
                                    enumC2341g32 = EnumC2341g.WARN;
                                    if (interfaceC2339e32.isLoggable(enumC2341g32, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj39, "[toRtcStats] 'jitterBufferDelay' => expected Double but found ", C2343i.f9271c, enumC2341g32, "RtcParser");
                                    }
                                    obj39 = null;
                                }
                                Double d1113 = (Double) obj39;
                                obj40 = next.getMembers().get("jitterBufferEmittedCount");
                                if (obj40 != null) {
                                    obj40 = null;
                                } else if (!(obj40 instanceof Long)) {
                                    C2343i c2343i21115 = C2343i.f9269a;
                                    interfaceC2339e33 = C2343i.f9272d;
                                    enumC2341g33 = EnumC2341g.WARN;
                                    if (interfaceC2339e33.isLoggable(enumC2341g33, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj40, "[toRtcStats] 'jitterBufferEmittedCount' => expected Long but found ", C2343i.f9271c, enumC2341g33, "RtcParser");
                                    }
                                    obj40 = null;
                                }
                                Long l1112 = (Long) obj40;
                                obj41 = next.getMembers().get("frameHeight");
                                if (obj41 != null) {
                                    obj41 = null;
                                } else if (!(obj41 instanceof Long)) {
                                    C2343i c2343i31110 = C2343i.f9269a;
                                    interfaceC2339e34 = C2343i.f9272d;
                                    enumC2341g34 = EnumC2341g.WARN;
                                    if (interfaceC2339e34.isLoggable(enumC2341g34, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj41, "[toRtcStats] 'frameHeight' => expected Long but found ", C2343i.f9271c, enumC2341g34, "RtcParser");
                                    }
                                    obj41 = null;
                                }
                                Long l1113 = (Long) obj41;
                                obj42 = next.getMembers().get(obj32);
                                if (obj42 != null) {
                                    obj42 = null;
                                } else if (!(obj42 instanceof Long)) {
                                    C2343i c2343i31111 = C2343i.f9269a;
                                    interfaceC2339e35 = C2343i.f9272d;
                                    enumC2341g35 = EnumC2341g.WARN;
                                    if (interfaceC2339e35.isLoggable(enumC2341g35, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj42, "[toRtcStats] 'frameWidth' => expected Long but found ", C2343i.f9271c, enumC2341g35, "RtcParser");
                                    }
                                    obj42 = null;
                                }
                                Long l1114 = (Long) obj42;
                                obj43 = next.getMembers().get("framesPerSecond");
                                if (obj43 != null) {
                                    obj43 = null;
                                } else if (!(obj43 instanceof Double)) {
                                    C2343i c2343i31112 = C2343i.f9269a;
                                    interfaceC2339e36 = C2343i.f9272d;
                                    enumC2341g36 = EnumC2341g.WARN;
                                    if (interfaceC2339e36.isLoggable(enumC2341g36, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj43, "[toRtcStats] 'framesPerSecond' => expected Double but found ", C2343i.f9271c, enumC2341g36, "RtcParser");
                                    }
                                    obj43 = null;
                                }
                                Double d1114 = (Double) obj43;
                                obj44 = next.getMembers().get("framesReceived");
                                if (obj44 != null) {
                                    obj44 = null;
                                } else if (!(obj44 instanceof Long)) {
                                    C2343i c2343i31113 = C2343i.f9269a;
                                    interfaceC2339e37 = C2343i.f9272d;
                                    enumC2341g37 = EnumC2341g.WARN;
                                    if (interfaceC2339e37.isLoggable(enumC2341g37, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj44, "[toRtcStats] 'framesReceived' => expected Long but found ", C2343i.f9271c, enumC2341g37, "RtcParser");
                                    }
                                    obj44 = null;
                                }
                                Long l1115 = (Long) obj44;
                                obj45 = next.getMembers().get("framesDecoded");
                                if (obj45 != null) {
                                    obj45 = null;
                                } else if (!(obj45 instanceof Long)) {
                                    C2343i c2343i31114 = C2343i.f9269a;
                                    interfaceC2339e38 = C2343i.f9272d;
                                    enumC2341g38 = EnumC2341g.WARN;
                                    if (interfaceC2339e38.isLoggable(enumC2341g38, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj45, "[toRtcStats] 'framesDecoded' => expected Long but found ", C2343i.f9271c, enumC2341g38, "RtcParser");
                                    }
                                    obj45 = null;
                                }
                                Long l216 = (Long) obj45;
                                obj46 = next.getMembers().get("framesDropped");
                                if (obj46 != null) {
                                    obj46 = null;
                                } else if (!(obj46 instanceof Long)) {
                                    C2343i c2343i31115 = C2343i.f9269a;
                                    interfaceC2339e39 = C2343i.f9272d;
                                    enumC2341g39 = EnumC2341g.WARN;
                                    if (interfaceC2339e39.isLoggable(enumC2341g39, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj46, "[toRtcStats] 'framesDropped' => expected Long but found ", C2343i.f9271c, enumC2341g39, "RtcParser");
                                    }
                                    obj46 = null;
                                }
                                Long l217 = (Long) obj46;
                                obj47 = next.getMembers().get("totalFramesDuration");
                                if (obj47 != null) {
                                    obj47 = null;
                                } else if (!(obj47 instanceof Double)) {
                                    C2343i c2343i31116 = C2343i.f9269a;
                                    interfaceC2339e40 = C2343i.f9272d;
                                    enumC2341g40 = EnumC2341g.WARN;
                                    if (interfaceC2339e40.isLoggable(enumC2341g40, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj47, "[toRtcStats] 'totalFramesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g40, "RtcParser");
                                    }
                                    obj47 = null;
                                }
                                Double d1115 = (Double) obj47;
                                obj48 = next.getMembers().get("totalFreezesDuration");
                                if (obj48 != null) {
                                    obj48 = null;
                                } else if (!(obj48 instanceof Double)) {
                                    C2343i c2343i31117 = C2343i.f9269a;
                                    interfaceC2339e41 = C2343i.f9272d;
                                    enumC2341g41 = EnumC2341g.WARN;
                                    if (interfaceC2339e41.isLoggable(enumC2341g41, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj48, "[toRtcStats] 'totalFreezesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g41, "RtcParser");
                                    }
                                    obj48 = null;
                                }
                                Double d1116 = (Double) obj48;
                                obj49 = next.getMembers().get("freezeCount");
                                if (obj49 != null) {
                                    obj49 = null;
                                } else if (!(obj49 instanceof Long)) {
                                    C2343i c2343i31118 = C2343i.f9269a;
                                    interfaceC2339e42 = C2343i.f9272d;
                                    enumC2341g42 = EnumC2341g.WARN;
                                    if (interfaceC2339e42.isLoggable(enumC2341g42, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj49, "[toRtcStats] 'freezeCount' => expected Long but found ", C2343i.f9271c, enumC2341g42, "RtcParser");
                                    }
                                    obj49 = null;
                                }
                                Long l218 = (Long) obj49;
                                obj50 = next.getMembers().get("pauseCount");
                                if (obj50 != null) {
                                    obj50 = null;
                                } else if (!(obj50 instanceof Long)) {
                                    C2343i c2343i31119 = C2343i.f9269a;
                                    interfaceC2339e43 = C2343i.f9272d;
                                    enumC2341g43 = EnumC2341g.WARN;
                                    if (interfaceC2339e43.isLoggable(enumC2341g43, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj50, "[toRtcStats] 'pauseCount' => expected Long but found ", C2343i.f9271c, enumC2341g43, "RtcParser");
                                    }
                                    obj50 = null;
                                }
                                Long l219 = (Long) obj50;
                                obj51 = next.getMembers().get("totalPausesDuration");
                                if (obj51 != null) {
                                    obj51 = null;
                                } else if (!(obj51 instanceof Double)) {
                                    C2343i c2343i49 = C2343i.f9269a;
                                    interfaceC2339e44 = C2343i.f9272d;
                                    enumC2341g44 = EnumC2341g.WARN;
                                    if (interfaceC2339e44.isLoggable(enumC2341g44, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj51, "[toRtcStats] 'totalPausesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g44, "RtcParser");
                                    }
                                    obj51 = null;
                                }
                                Double d1117 = (Double) obj51;
                                obj52 = next.getMembers().get("sumOfSquaredFramesDuration");
                                if (obj52 != null) {
                                    obj53 = null;
                                } else if (obj52 instanceof Double) {
                                    C2343i c2343i410 = C2343i.f9269a;
                                    interfaceC2339e45 = C2343i.f9272d;
                                    enumC2341g45 = EnumC2341g.WARN;
                                    if (interfaceC2339e45.isLoggable(enumC2341g45, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj52, "[toRtcStats] 'sumOfSquaredFramesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g45, "RtcParser");
                                    }
                                    obj53 = null;
                                } else {
                                    obj53 = obj52;
                                }
                                objM34267S = new C26235i(id7, type5, dValueOf4, str117, bool18, str118, str119, bool19, bool110, d1112, d1113, l1112, l1113, l1114, d1114, l1115, l216, l217, d1115, d1116, l218, l219, d1117, (Double) obj53);
                            }
                        } else {
                            objM34267S = null;
                        }
                        break;
                    } else {
                        Object obj72 = next.getMembers().get("remoteSource");
                        if (obj72 != null) {
                            str = "[toRtcStats] 'mediaSourceId' => expected String but found ";
                            if (obj72 instanceof Boolean) {
                                obj = "mediaSourceId";
                            } else {
                                C2343i c2343i50 = C2343i.f9269a;
                                InterfaceC2339e interfaceC2339e63 = C2343i.f9272d;
                                obj = "mediaSourceId";
                                EnumC2341g enumC2341g63 = EnumC2341g.WARN;
                                if (interfaceC2339e63.isLoggable(enumC2341g63, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj72, "[toRtcStats] 'remoteSource' => expected Boolean but found ", C2343i.f9271c, enumC2341g63, "RtcParser");
                                }
                            }
                            bool = (Boolean) obj72;
                            if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
                                objM34267S = m34272X(next);
                            } else if (AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                                objM34267S = null;
                            } else {
                                String id8 = next.getId();
                                String type6 = next.getType();
                                Double dValueOf5 = Double.valueOf(next.getTimestampUs());
                                obj2 = next.getMembers().get("trackIdentifier");
                                if (obj2 != null) {
                                    obj2 = null;
                                } else if (!(obj2 instanceof String)) {
                                    C2343i c2343i51 = C2343i.f9269a;
                                    interfaceC2339e = C2343i.f9272d;
                                    enumC2341g = EnumC2341g.WARN;
                                    if (interfaceC2339e.isLoggable(enumC2341g, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj2, "[toRtcStats] 'trackIdentifier' => expected String but found ", C2343i.f9271c, enumC2341g, "RtcParser");
                                    }
                                    obj2 = null;
                                }
                                String str20 = (String) obj2;
                                obj3 = next.getMembers().get("ended");
                                if (obj3 != null) {
                                    obj3 = null;
                                } else if (!(obj3 instanceof Boolean)) {
                                    C2343i c2343i52 = C2343i.f9269a;
                                    interfaceC2339e2 = C2343i.f9272d;
                                    enumC2341g2 = EnumC2341g.WARN;
                                    if (interfaceC2339e2.isLoggable(enumC2341g2, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj3, "[toRtcStats] 'ended' => expected Boolean but found ", C2343i.f9271c, enumC2341g2, "RtcParser");
                                    }
                                    obj3 = null;
                                }
                                Boolean bool20 = (Boolean) obj3;
                                obj4 = next.getMembers().get("kind");
                                if (obj4 != null) {
                                    obj4 = null;
                                } else if (!(obj4 instanceof String)) {
                                    C2343i c2343i53 = C2343i.f9269a;
                                    interfaceC2339e3 = C2343i.f9272d;
                                    enumC2341g3 = EnumC2341g.WARN;
                                    if (interfaceC2339e3.isLoggable(enumC2341g3, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj4, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g3, "RtcParser");
                                    }
                                    obj4 = null;
                                }
                                String str21 = (String) obj4;
                                obj5 = next.getMembers().get("priority");
                                if (obj5 != null) {
                                    obj5 = null;
                                } else if (!(obj5 instanceof String)) {
                                    C2343i c2343i54 = C2343i.f9269a;
                                    interfaceC2339e4 = C2343i.f9272d;
                                    enumC2341g4 = EnumC2341g.WARN;
                                    if (interfaceC2339e4.isLoggable(enumC2341g4, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj5, "[toRtcStats] 'priority' => expected String but found ", C2343i.f9271c, enumC2341g4, "RtcParser");
                                    }
                                    obj5 = null;
                                }
                                String str22 = (String) obj5;
                                obj6 = next.getMembers().get("remoteSource");
                                if (obj6 != null) {
                                    obj6 = null;
                                } else if (!(obj6 instanceof Boolean)) {
                                    C2343i c2343i55 = C2343i.f9269a;
                                    interfaceC2339e5 = C2343i.f9272d;
                                    enumC2341g5 = EnumC2341g.WARN;
                                    if (interfaceC2339e5.isLoggable(enumC2341g5, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj6, "[toRtcStats] 'remoteSource' => expected Boolean but found ", C2343i.f9271c, enumC2341g5, "RtcParser");
                                    }
                                    obj6 = null;
                                }
                                Boolean bool21 = (Boolean) obj6;
                                obj7 = next.getMembers().get("detached");
                                if (obj7 != null) {
                                    obj8 = null;
                                } else if (obj7 instanceof Boolean) {
                                    obj8 = obj7;
                                } else {
                                    C2343i c2343i56 = C2343i.f9269a;
                                    interfaceC2339e6 = C2343i.f9272d;
                                    enumC2341g6 = EnumC2341g.WARN;
                                    if (interfaceC2339e6.isLoggable(enumC2341g6, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj7, "[toRtcStats] 'detached' => expected Boolean but found ", C2343i.f9271c, enumC2341g6, "RtcParser");
                                    }
                                    obj8 = null;
                                }
                                Boolean bool22 = (Boolean) obj8;
                                obj9 = next.getMembers().get(obj);
                                if (obj9 != null) {
                                    obj9 = null;
                                } else if (!(obj9 instanceof String)) {
                                    C2343i c2343i57 = C2343i.f9269a;
                                    interfaceC2339e7 = C2343i.f9272d;
                                    enumC2341g7 = EnumC2341g.WARN;
                                    if (interfaceC2339e7.isLoggable(enumC2341g7, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj9, str, C2343i.f9271c, enumC2341g7, "RtcParser");
                                    }
                                    obj9 = null;
                                }
                                String str23 = (String) obj9;
                                obj10 = next.getMembers().get("audioLevel");
                                if (obj10 != null) {
                                    obj10 = null;
                                } else if (!(obj10 instanceof Double)) {
                                    C2343i c2343i58 = C2343i.f9269a;
                                    interfaceC2339e8 = C2343i.f9272d;
                                    enumC2341g8 = EnumC2341g.WARN;
                                    if (interfaceC2339e8.isLoggable(enumC2341g8, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj10, "[toRtcStats] 'audioLevel' => expected Double but found ", C2343i.f9271c, enumC2341g8, "RtcParser");
                                    }
                                    obj10 = null;
                                }
                                Double d25 = (Double) obj10;
                                obj11 = next.getMembers().get("totalAudioEnergy");
                                if (obj11 != null) {
                                    obj11 = null;
                                } else if (!(obj11 instanceof Double)) {
                                    C2343i c2343i59 = C2343i.f9269a;
                                    interfaceC2339e9 = C2343i.f9272d;
                                    enumC2341g9 = EnumC2341g.WARN;
                                    if (interfaceC2339e9.isLoggable(enumC2341g9, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj11, "[toRtcStats] 'totalAudioEnergy' => expected Double but found ", C2343i.f9271c, enumC2341g9, "RtcParser");
                                    }
                                    obj11 = null;
                                }
                                Double d26 = (Double) obj11;
                                obj12 = next.getMembers().get("totalSamplesDuration");
                                if (obj12 != null) {
                                    obj13 = null;
                                } else if (obj12 instanceof Double) {
                                    obj13 = obj12;
                                } else {
                                    C2343i c2343i60 = C2343i.f9269a;
                                    interfaceC2339e10 = C2343i.f9272d;
                                    enumC2341g10 = EnumC2341g.WARN;
                                    if (interfaceC2339e10.isLoggable(enumC2341g10, "RtcParser")) {
                                        AbstractC21702c.m61145p(obj12, "[toRtcStats] 'totalSamplesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g10, "RtcParser");
                                    }
                                    obj13 = null;
                                }
                                objM34267S = new C26234h(id8, type6, dValueOf5, str20, bool20, str21, str22, bool21, bool22, str23, d25, d26, (Double) obj13);
                            }
                        } else {
                            obj = "mediaSourceId";
                            str = "[toRtcStats] 'mediaSourceId' => expected String but found ";
                        }
                        obj72 = null;
                        bool = (Boolean) obj72;
                        if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
                            objM34267S = m34272X(next);
                        } else if (AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                            objM34267S = null;
                        } else {
                            String id9 = next.getId();
                            String type7 = next.getType();
                            Double dValueOf6 = Double.valueOf(next.getTimestampUs());
                            obj2 = next.getMembers().get("trackIdentifier");
                            if (obj2 != null) {
                                obj2 = null;
                            } else if (!(obj2 instanceof String)) {
                                C2343i c2343i510 = C2343i.f9269a;
                                interfaceC2339e = C2343i.f9272d;
                                enumC2341g = EnumC2341g.WARN;
                                if (interfaceC2339e.isLoggable(enumC2341g, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj2, "[toRtcStats] 'trackIdentifier' => expected String but found ", C2343i.f9271c, enumC2341g, "RtcParser");
                                }
                                obj2 = null;
                            }
                            String str24 = (String) obj2;
                            obj3 = next.getMembers().get("ended");
                            if (obj3 != null) {
                                obj3 = null;
                            } else if (!(obj3 instanceof Boolean)) {
                                C2343i c2343i511 = C2343i.f9269a;
                                interfaceC2339e2 = C2343i.f9272d;
                                enumC2341g2 = EnumC2341g.WARN;
                                if (interfaceC2339e2.isLoggable(enumC2341g2, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj3, "[toRtcStats] 'ended' => expected Boolean but found ", C2343i.f9271c, enumC2341g2, "RtcParser");
                                }
                                obj3 = null;
                            }
                            Boolean bool23 = (Boolean) obj3;
                            obj4 = next.getMembers().get("kind");
                            if (obj4 != null) {
                                obj4 = null;
                            } else if (!(obj4 instanceof String)) {
                                C2343i c2343i512 = C2343i.f9269a;
                                interfaceC2339e3 = C2343i.f9272d;
                                enumC2341g3 = EnumC2341g.WARN;
                                if (interfaceC2339e3.isLoggable(enumC2341g3, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj4, "[toRtcStats] 'kind' => expected String but found ", C2343i.f9271c, enumC2341g3, "RtcParser");
                                }
                                obj4 = null;
                            }
                            String str25 = (String) obj4;
                            obj5 = next.getMembers().get("priority");
                            if (obj5 != null) {
                                obj5 = null;
                            } else if (!(obj5 instanceof String)) {
                                C2343i c2343i513 = C2343i.f9269a;
                                interfaceC2339e4 = C2343i.f9272d;
                                enumC2341g4 = EnumC2341g.WARN;
                                if (interfaceC2339e4.isLoggable(enumC2341g4, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj5, "[toRtcStats] 'priority' => expected String but found ", C2343i.f9271c, enumC2341g4, "RtcParser");
                                }
                                obj5 = null;
                            }
                            String str26 = (String) obj5;
                            obj6 = next.getMembers().get("remoteSource");
                            if (obj6 != null) {
                                obj6 = null;
                            } else if (!(obj6 instanceof Boolean)) {
                                C2343i c2343i514 = C2343i.f9269a;
                                interfaceC2339e5 = C2343i.f9272d;
                                enumC2341g5 = EnumC2341g.WARN;
                                if (interfaceC2339e5.isLoggable(enumC2341g5, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj6, "[toRtcStats] 'remoteSource' => expected Boolean but found ", C2343i.f9271c, enumC2341g5, "RtcParser");
                                }
                                obj6 = null;
                            }
                            Boolean bool24 = (Boolean) obj6;
                            obj7 = next.getMembers().get("detached");
                            if (obj7 != null) {
                                obj8 = null;
                            } else if (obj7 instanceof Boolean) {
                                C2343i c2343i515 = C2343i.f9269a;
                                interfaceC2339e6 = C2343i.f9272d;
                                enumC2341g6 = EnumC2341g.WARN;
                                if (interfaceC2339e6.isLoggable(enumC2341g6, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj7, "[toRtcStats] 'detached' => expected Boolean but found ", C2343i.f9271c, enumC2341g6, "RtcParser");
                                }
                                obj8 = null;
                            } else {
                                obj8 = obj7;
                            }
                            Boolean bool25 = (Boolean) obj8;
                            obj9 = next.getMembers().get(obj);
                            if (obj9 != null) {
                                obj9 = null;
                            } else if (!(obj9 instanceof String)) {
                                C2343i c2343i516 = C2343i.f9269a;
                                interfaceC2339e7 = C2343i.f9272d;
                                enumC2341g7 = EnumC2341g.WARN;
                                if (interfaceC2339e7.isLoggable(enumC2341g7, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj9, str, C2343i.f9271c, enumC2341g7, "RtcParser");
                                }
                                obj9 = null;
                            }
                            String str27 = (String) obj9;
                            obj10 = next.getMembers().get("audioLevel");
                            if (obj10 != null) {
                                obj10 = null;
                            } else if (!(obj10 instanceof Double)) {
                                C2343i c2343i517 = C2343i.f9269a;
                                interfaceC2339e8 = C2343i.f9272d;
                                enumC2341g8 = EnumC2341g.WARN;
                                if (interfaceC2339e8.isLoggable(enumC2341g8, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj10, "[toRtcStats] 'audioLevel' => expected Double but found ", C2343i.f9271c, enumC2341g8, "RtcParser");
                                }
                                obj10 = null;
                            }
                            Double d27 = (Double) obj10;
                            obj11 = next.getMembers().get("totalAudioEnergy");
                            if (obj11 != null) {
                                obj11 = null;
                            } else if (!(obj11 instanceof Double)) {
                                C2343i c2343i518 = C2343i.f9269a;
                                interfaceC2339e9 = C2343i.f9272d;
                                enumC2341g9 = EnumC2341g.WARN;
                                if (interfaceC2339e9.isLoggable(enumC2341g9, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj11, "[toRtcStats] 'totalAudioEnergy' => expected Double but found ", C2343i.f9271c, enumC2341g9, "RtcParser");
                                }
                                obj11 = null;
                            }
                            Double d28 = (Double) obj11;
                            obj12 = next.getMembers().get("totalSamplesDuration");
                            if (obj12 != null) {
                                obj13 = null;
                            } else if (obj12 instanceof Double) {
                                C2343i c2343i61 = C2343i.f9269a;
                                interfaceC2339e10 = C2343i.f9272d;
                                enumC2341g10 = EnumC2341g.WARN;
                                if (interfaceC2339e10.isLoggable(enumC2341g10, "RtcParser")) {
                                    AbstractC21702c.m61145p(obj12, "[toRtcStats] 'totalSamplesDuration' => expected Double but found ", C2343i.f9271c, enumC2341g10, "RtcParser");
                                }
                                obj13 = null;
                            } else {
                                obj13 = obj12;
                            }
                            objM34267S = new C26234h(id9, type7, dValueOf6, str24, bool23, str25, str26, bool24, bool25, str27, d27, d28, (Double) obj13);
                        }
                    }
                    break;
                case 10:
                    Object obj73 = next.getMembers().get("kind");
                    if (obj73 != null) {
                        if (obj73 instanceof String) {
                            map = map;
                            rTCStats = next;
                        } else {
                            C2343i c2343i62 = C2343i.f9269a;
                            InterfaceC2339e interfaceC2339e64 = C2343i.f9272d;
                            rTCStats = next;
                            EnumC2341g enumC2341g64 = EnumC2341g.WARN;
                            if (interfaceC2339e64.isLoggable(enumC2341g64, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g64, "RtcParser", AbstractC21702c.m61134e(obj73, "[toRtcStats] 'kind' => expected String but found "), null);
                            }
                        }
                        str3 = (String) obj73;
                        if (str3 != null) {
                            EnumC27516a.f110798x.getClass();
                            enumC27516aM79403i6 = C26701n.m79403i(str3);
                        } else {
                            enumC27516aM79403i6 = null;
                        }
                        i13 = enumC27516aM79403i6 != null ? AbstractC25011a.f97850a[enumC27516aM79403i6.ordinal()] : -1;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                objM34267S = m34286f0(rTCStats);
                            }
                            enumC27518c2 = enumC27518c;
                            objM34267S = null;
                        } else {
                            String id10 = rTCStats.getId();
                            String type8 = rTCStats.getType();
                            Double dValueOf7 = Double.valueOf(rTCStats.getTimestampUs());
                            obj54 = rTCStats.getMembers().get("kind");
                            if (obj54 != null) {
                                obj54 = null;
                            } else if (!(obj54 instanceof String)) {
                                C2343i c2343i63 = C2343i.f9269a;
                                interfaceC2339e46 = C2343i.f9272d;
                                enumC2341g46 = EnumC2341g.WARN;
                                if (interfaceC2339e46.isLoggable(enumC2341g46, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g46, "RtcParser", AbstractC21702c.m61134e(obj54, "[toRtcStats] 'kind' => expected String but found "), null);
                                }
                                obj54 = null;
                            }
                            String str28 = (String) obj54;
                            obj55 = rTCStats.getMembers().get("trackIdentifier");
                            if (obj55 != null) {
                                obj55 = null;
                            } else if (!(obj55 instanceof String)) {
                                C2343i c2343i64 = C2343i.f9269a;
                                interfaceC2339e47 = C2343i.f9272d;
                                enumC2341g47 = EnumC2341g.WARN;
                                if (interfaceC2339e47.isLoggable(enumC2341g47, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g47, "RtcParser", AbstractC21702c.m61134e(obj55, "[toRtcStats] 'trackIdentifier' => expected String but found "), null);
                                }
                                obj55 = null;
                            }
                            String str29 = (String) obj55;
                            obj56 = rTCStats.getMembers().get("audioLevel");
                            if (obj56 != null) {
                                obj56 = null;
                            } else if (!(obj56 instanceof Double)) {
                                C2343i c2343i65 = C2343i.f9269a;
                                interfaceC2339e48 = C2343i.f9272d;
                                enumC2341g48 = EnumC2341g.WARN;
                                if (interfaceC2339e48.isLoggable(enumC2341g48, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g48, "RtcParser", AbstractC21702c.m61134e(obj56, "[toRtcStats] 'audioLevel' => expected Double but found "), null);
                                }
                                obj56 = null;
                            }
                            Double d29 = (Double) obj56;
                            obj57 = rTCStats.getMembers().get("totalAudioEnergy");
                            if (obj57 != null) {
                                obj57 = null;
                            } else if (!(obj57 instanceof Double)) {
                                C2343i c2343i66 = C2343i.f9269a;
                                interfaceC2339e49 = C2343i.f9272d;
                                enumC2341g49 = EnumC2341g.WARN;
                                if (interfaceC2339e49.isLoggable(enumC2341g49, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g49, "RtcParser", AbstractC21702c.m61134e(obj57, "[toRtcStats] 'totalAudioEnergy' => expected Double but found "), null);
                                }
                                obj57 = null;
                            }
                            Double d32 = (Double) obj57;
                            obj58 = rTCStats.getMembers().get("totalSamplesDuration");
                            if (obj58 != null) {
                                obj58 = null;
                            } else if (!(obj58 instanceof Double)) {
                                C2343i c2343i67 = C2343i.f9269a;
                                interfaceC2339e50 = C2343i.f9272d;
                                enumC2341g50 = EnumC2341g.WARN;
                                if (interfaceC2339e50.isLoggable(enumC2341g50, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g50, "RtcParser", AbstractC21702c.m61134e(obj58, "[toRtcStats] 'totalSamplesDuration' => expected Double but found "), null);
                                }
                                obj58 = null;
                            }
                            Double d34 = (Double) obj58;
                            obj59 = rTCStats.getMembers().get("echoReturnLoss");
                            if (obj59 != null) {
                                obj59 = null;
                            } else if (!(obj59 instanceof Double)) {
                                C2343i c2343i68 = C2343i.f9269a;
                                interfaceC2339e51 = C2343i.f9272d;
                                enumC2341g51 = EnumC2341g.WARN;
                                if (interfaceC2339e51.isLoggable(enumC2341g51, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g51, "RtcParser", AbstractC21702c.m61134e(obj59, "[toRtcStats] 'echoReturnLoss' => expected Double but found "), null);
                                }
                                obj59 = null;
                            }
                            Double d35 = (Double) obj59;
                            obj60 = rTCStats.getMembers().get("echoReturnLossEnhancement");
                            if (obj60 != null) {
                                obj60 = null;
                            } else if (!(obj60 instanceof Double)) {
                                C2343i c2343i69 = C2343i.f9269a;
                                interfaceC2339e52 = C2343i.f9272d;
                                enumC2341g52 = EnumC2341g.WARN;
                                if (interfaceC2339e52.isLoggable(enumC2341g52, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g52, "RtcParser", AbstractC21702c.m61134e(obj60, "[toRtcStats] 'echoReturnLossEnhancement' => expected Double but found "), null);
                                }
                                obj60 = null;
                            }
                            Double d36 = (Double) obj60;
                            obj61 = rTCStats.getMembers().get("droppedSamplesDuration");
                            if (obj61 != null) {
                                obj61 = null;
                            } else if (!(obj61 instanceof Double)) {
                                C2343i c2343i70 = C2343i.f9269a;
                                interfaceC2339e53 = C2343i.f9272d;
                                enumC2341g53 = EnumC2341g.WARN;
                                if (interfaceC2339e53.isLoggable(enumC2341g53, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g53, "RtcParser", AbstractC21702c.m61134e(obj61, "[toRtcStats] 'droppedSamplesDuration' => expected Double but found "), null);
                                }
                                obj61 = null;
                            }
                            Double d37 = (Double) obj61;
                            obj62 = rTCStats.getMembers().get("droppedSamplesEvents");
                            if (obj62 != null) {
                                obj62 = null;
                            } else if (!(obj62 instanceof Long)) {
                                C2343i c2343i71 = C2343i.f9269a;
                                interfaceC2339e54 = C2343i.f9272d;
                                enumC2341g54 = EnumC2341g.WARN;
                                if (interfaceC2339e54.isLoggable(enumC2341g54, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g54, "RtcParser", AbstractC21702c.m61134e(obj62, "[toRtcStats] 'droppedSamplesEvents' => expected Long but found "), null);
                                }
                                obj62 = null;
                            }
                            Long l35 = (Long) obj62;
                            obj63 = rTCStats.getMembers().get("totalCaptureDelay");
                            if (obj63 != null) {
                                obj63 = null;
                            } else if (!(obj63 instanceof Double)) {
                                C2343i c2343i72 = C2343i.f9269a;
                                interfaceC2339e55 = C2343i.f9272d;
                                enumC2341g55 = EnumC2341g.WARN;
                                if (interfaceC2339e55.isLoggable(enumC2341g55, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g55, "RtcParser", AbstractC21702c.m61134e(obj63, "[toRtcStats] 'totalCaptureDelay' => expected Double but found "), null);
                                }
                                obj63 = null;
                            }
                            Double d38 = (Double) obj63;
                            obj64 = rTCStats.getMembers().get("totalSamplesCaptured");
                            if (obj64 != null) {
                                obj65 = null;
                            } else if (obj64 instanceof Long) {
                                obj65 = obj64;
                            } else {
                                C2343i c2343i73 = C2343i.f9269a;
                                interfaceC2339e56 = C2343i.f9272d;
                                enumC2341g56 = EnumC2341g.WARN;
                                if (interfaceC2339e56.isLoggable(enumC2341g56, "RtcParser")) {
                                    C2343i.f9271c.log(enumC2341g56, "RtcParser", AbstractC21702c.m61134e(obj64, "[toRtcStats] 'totalSamplesCaptured' => expected Long but found "), null);
                                }
                                obj65 = null;
                            }
                            objM34267S = new C26227a(id10, type8, dValueOf7, str28, str29, d29, d32, d34, d35, d36, d37, l35, d38, (Long) obj65);
                        }
                        enumC27518c2 = enumC27518c;
                    } else {
                        rTCStats = next;
                    }
                    obj73 = null;
                    str3 = (String) obj73;
                    if (str3 != null) {
                        EnumC27516a.f110798x.getClass();
                        enumC27516aM79403i6 = C26701n.m79403i(str3);
                    } else {
                        enumC27516aM79403i6 = null;
                    }
                    i13 = enumC27516aM79403i6 != null ? AbstractC25011a.f97850a[enumC27516aM79403i6.ordinal()] : -1;
                    if (i13 != 1) {
                        if (i13 == 2) {
                            objM34267S = m34286f0(rTCStats);
                        }
                        enumC27518c2 = enumC27518c;
                        objM34267S = null;
                    } else {
                        String id11 = rTCStats.getId();
                        String type9 = rTCStats.getType();
                        Double dValueOf8 = Double.valueOf(rTCStats.getTimestampUs());
                        obj54 = rTCStats.getMembers().get("kind");
                        if (obj54 != null) {
                            obj54 = null;
                        } else if (!(obj54 instanceof String)) {
                            C2343i c2343i610 = C2343i.f9269a;
                            interfaceC2339e46 = C2343i.f9272d;
                            enumC2341g46 = EnumC2341g.WARN;
                            if (interfaceC2339e46.isLoggable(enumC2341g46, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g46, "RtcParser", AbstractC21702c.m61134e(obj54, "[toRtcStats] 'kind' => expected String but found "), null);
                            }
                            obj54 = null;
                        }
                        String str210 = (String) obj54;
                        obj55 = rTCStats.getMembers().get("trackIdentifier");
                        if (obj55 != null) {
                            obj55 = null;
                        } else if (!(obj55 instanceof String)) {
                            C2343i c2343i611 = C2343i.f9269a;
                            interfaceC2339e47 = C2343i.f9272d;
                            enumC2341g47 = EnumC2341g.WARN;
                            if (interfaceC2339e47.isLoggable(enumC2341g47, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g47, "RtcParser", AbstractC21702c.m61134e(obj55, "[toRtcStats] 'trackIdentifier' => expected String but found "), null);
                            }
                            obj55 = null;
                        }
                        String str211 = (String) obj55;
                        obj56 = rTCStats.getMembers().get("audioLevel");
                        if (obj56 != null) {
                            obj56 = null;
                        } else if (!(obj56 instanceof Double)) {
                            C2343i c2343i612 = C2343i.f9269a;
                            interfaceC2339e48 = C2343i.f9272d;
                            enumC2341g48 = EnumC2341g.WARN;
                            if (interfaceC2339e48.isLoggable(enumC2341g48, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g48, "RtcParser", AbstractC21702c.m61134e(obj56, "[toRtcStats] 'audioLevel' => expected Double but found "), null);
                            }
                            obj56 = null;
                        }
                        Double d210 = (Double) obj56;
                        obj57 = rTCStats.getMembers().get("totalAudioEnergy");
                        if (obj57 != null) {
                            obj57 = null;
                        } else if (!(obj57 instanceof Double)) {
                            C2343i c2343i613 = C2343i.f9269a;
                            interfaceC2339e49 = C2343i.f9272d;
                            enumC2341g49 = EnumC2341g.WARN;
                            if (interfaceC2339e49.isLoggable(enumC2341g49, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g49, "RtcParser", AbstractC21702c.m61134e(obj57, "[toRtcStats] 'totalAudioEnergy' => expected Double but found "), null);
                            }
                            obj57 = null;
                        }
                        Double d39 = (Double) obj57;
                        obj58 = rTCStats.getMembers().get("totalSamplesDuration");
                        if (obj58 != null) {
                            obj58 = null;
                        } else if (!(obj58 instanceof Double)) {
                            C2343i c2343i614 = C2343i.f9269a;
                            interfaceC2339e50 = C2343i.f9272d;
                            enumC2341g50 = EnumC2341g.WARN;
                            if (interfaceC2339e50.isLoggable(enumC2341g50, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g50, "RtcParser", AbstractC21702c.m61134e(obj58, "[toRtcStats] 'totalSamplesDuration' => expected Double but found "), null);
                            }
                            obj58 = null;
                        }
                        Double d310 = (Double) obj58;
                        obj59 = rTCStats.getMembers().get("echoReturnLoss");
                        if (obj59 != null) {
                            obj59 = null;
                        } else if (!(obj59 instanceof Double)) {
                            C2343i c2343i615 = C2343i.f9269a;
                            interfaceC2339e51 = C2343i.f9272d;
                            enumC2341g51 = EnumC2341g.WARN;
                            if (interfaceC2339e51.isLoggable(enumC2341g51, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g51, "RtcParser", AbstractC21702c.m61134e(obj59, "[toRtcStats] 'echoReturnLoss' => expected Double but found "), null);
                            }
                            obj59 = null;
                        }
                        Double d311 = (Double) obj59;
                        obj60 = rTCStats.getMembers().get("echoReturnLossEnhancement");
                        if (obj60 != null) {
                            obj60 = null;
                        } else if (!(obj60 instanceof Double)) {
                            C2343i c2343i616 = C2343i.f9269a;
                            interfaceC2339e52 = C2343i.f9272d;
                            enumC2341g52 = EnumC2341g.WARN;
                            if (interfaceC2339e52.isLoggable(enumC2341g52, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g52, "RtcParser", AbstractC21702c.m61134e(obj60, "[toRtcStats] 'echoReturnLossEnhancement' => expected Double but found "), null);
                            }
                            obj60 = null;
                        }
                        Double d312 = (Double) obj60;
                        obj61 = rTCStats.getMembers().get("droppedSamplesDuration");
                        if (obj61 != null) {
                            obj61 = null;
                        } else if (!(obj61 instanceof Double)) {
                            C2343i c2343i74 = C2343i.f9269a;
                            interfaceC2339e53 = C2343i.f9272d;
                            enumC2341g53 = EnumC2341g.WARN;
                            if (interfaceC2339e53.isLoggable(enumC2341g53, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g53, "RtcParser", AbstractC21702c.m61134e(obj61, "[toRtcStats] 'droppedSamplesDuration' => expected Double but found "), null);
                            }
                            obj61 = null;
                        }
                        Double d313 = (Double) obj61;
                        obj62 = rTCStats.getMembers().get("droppedSamplesEvents");
                        if (obj62 != null) {
                            obj62 = null;
                        } else if (!(obj62 instanceof Long)) {
                            C2343i c2343i75 = C2343i.f9269a;
                            interfaceC2339e54 = C2343i.f9272d;
                            enumC2341g54 = EnumC2341g.WARN;
                            if (interfaceC2339e54.isLoggable(enumC2341g54, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g54, "RtcParser", AbstractC21702c.m61134e(obj62, "[toRtcStats] 'droppedSamplesEvents' => expected Long but found "), null);
                            }
                            obj62 = null;
                        }
                        Long l36 = (Long) obj62;
                        obj63 = rTCStats.getMembers().get("totalCaptureDelay");
                        if (obj63 != null) {
                            obj63 = null;
                        } else if (!(obj63 instanceof Double)) {
                            C2343i c2343i76 = C2343i.f9269a;
                            interfaceC2339e55 = C2343i.f9272d;
                            enumC2341g55 = EnumC2341g.WARN;
                            if (interfaceC2339e55.isLoggable(enumC2341g55, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g55, "RtcParser", AbstractC21702c.m61134e(obj63, "[toRtcStats] 'totalCaptureDelay' => expected Double but found "), null);
                            }
                            obj63 = null;
                        }
                        Double d314 = (Double) obj63;
                        obj64 = rTCStats.getMembers().get("totalSamplesCaptured");
                        if (obj64 != null) {
                            obj65 = null;
                        } else if (obj64 instanceof Long) {
                            C2343i c2343i77 = C2343i.f9269a;
                            interfaceC2339e56 = C2343i.f9272d;
                            enumC2341g56 = EnumC2341g.WARN;
                            if (interfaceC2339e56.isLoggable(enumC2341g56, "RtcParser")) {
                                C2343i.f9271c.log(enumC2341g56, "RtcParser", AbstractC21702c.m61134e(obj64, "[toRtcStats] 'totalSamplesCaptured' => expected Long but found "), null);
                            }
                            obj65 = null;
                        } else {
                            obj65 = obj64;
                        }
                        objM34267S = new C26227a(id11, type9, dValueOf8, str210, str211, d210, d39, d310, d311, d312, d313, l36, d314, (Long) obj65);
                    }
                    enumC27518c2 = enumC27518c;
                    break;
                default:
                    map = map;
                    enumC27518c2 = enumC27518c;
                    objM34267S = null;
                    break;
            }
            if (objM34267S == null) {
                map = map;
            } else {
                map = map;
                EnumC27518c enumC27518c3 = enumC27518c2;
                Object hashSet = map.get(enumC27518c3);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(enumC27518c3, hashSet);
                }
                ((Set) hashSet).add(objM34267S);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static final void m34285f(AbstractC12605c abstractC12605c, C13821r1 c13821r1, boolean z4, C37816b c37816b, Composer composer, int i13, int i14) {
        boolean z13;
        int i15;
        C37816b c37816b2;
        boolean z14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(691576729);
        int i16 = 2;
        int i17 = i13 | (c28655q.m87157i(abstractC12605c) ? 4 : 2) | (c28655q.m87153g(c13821r1) ? 32 : 16);
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 = i17 | 384;
            z13 = z4;
        } else {
            z13 = z4;
            i15 = i17 | (c28655q.m87155h(z13) ? 256 : 128);
        }
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            c37816b2 = c37816b;
            z14 = z13;
        } else {
            boolean z15 = i18 != 0 ? true : z13;
            int i19 = 0;
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(abstractC12605c.f43013Q, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(abstractC12605c.mo35333q(), c28655q, 0);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            c28655q.m87150e0(-895255746);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            float f13 = AbstractC2526g3.f9822a;
            WeakHashMap weakHashMap = C22944c2.f90553v;
            float fMo43109a = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a() + f13;
            m34275a(((Boolean) interfaceC28601c1M83597t.getValue()).booleanValue(), c28655q, 0);
            c28655q.m87150e0(-895246092);
            boolean zM87153g = c28655q.m87153g(interfaceC39171c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C2619s2(interfaceC39171c, interfaceC28601c1, i19);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1131a.m3500d(C2314t.f9131w, (Function1) objM87133R2), fMo43109a, 0.0f, 2);
            c37816b2 = c37816b;
            AbstractC12240d.m34061a(AbstractC37817c.m121344e(-407364710, c28655q, new C2647w2(i16, abstractC12605c, interfaceC28601c1M83597t)), AbstractC37817c.m121344e(-815388325, c28655q, new C2654x2(z15, c37816b2, i19)), modifierM3413j, c13821r1, c28655q, ((i15 << 6) & 7168) | 54, 0);
            AbstractC1090b.m3351f((z15 && (((InterfaceC0305k1) interfaceC28601c1M83597t2.getValue()) == null || (((InterfaceC0305k1) interfaceC28601c1M83597t2.getValue()) instanceof C0299i1))) ? false : true, null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(2038663105, c28655q, new C2640v2(interfaceC28601c1, z15, interfaceC28601c1M83597t2, i19)), c28655q, 200064, 18);
            c28655q = c28655q;
            z14 = z15;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(abstractC12605c, c13821r1, z14, c37816b2, i13, i14);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final C26244r m34286f0(RTCStats rTCStats) {
        String id4 = rTCStats.getId();
        String type = rTCStats.getType();
        Double dValueOf = Double.valueOf(rTCStats.getTimestampUs());
        Object obj = rTCStats.getMembers().get("kind");
        Object obj2 = null;
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof String)) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g, "RtcParser", AbstractC21702c.m61134e(obj, "[toRtcStats] 'kind' => expected String but found "), null);
            }
            obj = null;
        }
        String str = (String) obj;
        Object obj3 = rTCStats.getMembers().get("trackIdentifier");
        if (obj3 == null) {
            obj3 = null;
        } else if (!(obj3 instanceof String)) {
            C2343i c2343i2 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g2, "RtcParser", AbstractC21702c.m61134e(obj3, "[toRtcStats] 'trackIdentifier' => expected String but found "), null);
            }
            obj3 = null;
        }
        String str2 = (String) obj3;
        Object obj4 = rTCStats.getMembers().get("width");
        if (obj4 == null) {
            obj4 = null;
        } else if (!(obj4 instanceof Long)) {
            C2343i c2343i3 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.WARN;
            if (interfaceC2339e3.isLoggable(enumC2341g3, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g3, "RtcParser", AbstractC21702c.m61134e(obj4, "[toRtcStats] 'width' => expected Long but found "), null);
            }
            obj4 = null;
        }
        Long l7 = (Long) obj4;
        Object obj5 = rTCStats.getMembers().get("height");
        if (obj5 == null) {
            obj5 = null;
        } else if (!(obj5 instanceof Long)) {
            C2343i c2343i4 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339e4.isLoggable(enumC2341g4, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g4, "RtcParser", AbstractC21702c.m61134e(obj5, "[toRtcStats] 'height' => expected Long but found "), null);
            }
            obj5 = null;
        }
        Long l12 = (Long) obj5;
        Object obj6 = rTCStats.getMembers().get("framesPerSecond");
        if (obj6 == null) {
            obj6 = null;
        } else if (!(obj6 instanceof Double)) {
            C2343i c2343i5 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e5 = C2343i.f9272d;
            EnumC2341g enumC2341g5 = EnumC2341g.WARN;
            if (interfaceC2339e5.isLoggable(enumC2341g5, "RtcParser")) {
                C2343i.f9271c.log(enumC2341g5, "RtcParser", AbstractC21702c.m61134e(obj6, "[toRtcStats] 'framesPerSecond' => expected Double but found "), null);
            }
            obj6 = null;
        }
        Double d3 = (Double) obj6;
        Object obj7 = rTCStats.getMembers().get("frames");
        if (obj7 != null) {
            if (obj7 instanceof Long) {
                obj2 = obj7;
            } else {
                C2343i c2343i6 = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e6 = C2343i.f9272d;
                EnumC2341g enumC2341g6 = EnumC2341g.WARN;
                if (interfaceC2339e6.isLoggable(enumC2341g6, "RtcParser")) {
                    C2343i.f9271c.log(enumC2341g6, "RtcParser", AbstractC21702c.m61134e(obj7, "[toRtcStats] 'frames' => expected Long but found "), null);
                }
            }
        }
        return new C26244r(id4, type, dValueOf, str, str2, l7, l12, d3, (Long) obj2);
    }

    /* JADX INFO: renamed from: g */
    public static final void m34287g(C16754w0 viewModel, Composer composer, int i13) {
        C16754w0 c16754w0;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1055407360);
        int i14 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
            c16754w0 = viewModel;
        } else {
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            c16754w0 = viewModel;
            m34285f(c16754w0, c13821r1M92099U, false, AbstractC37817c.m121344e(2045923221, c28655q, new C2647w2(1, viewModel, c13821r1M92099U)), c28655q, (i14 & 14) | 3072, 4);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0539c(c16754w0, i13, 8);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final AbstractC23763c0 m34288g0(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
            return ((AbstractC23797r) abstractC23773f1Mo69863p0).f94188y;
        }
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23763c0) {
            return (AbstractC23763c0) abstractC23773f1Mo69863p0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    public static final void m34289h(C16686k4 viewModel, Composer composer, int i13) {
        C16686k4 c16686k4;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-359505535);
        int i14 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
            c16686k4 = viewModel;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(viewModel.f64176t0, c28655q, 0);
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            c16686k4 = viewModel;
            m34285f(c16686k4, c13821r1M92099U, ((Boolean) interfaceC28601c1M83597t.getValue()).booleanValue(), AbstractC37817c.m121344e(280630614, c28655q, new C2647w2(0, viewModel, c13821r1M92099U)), c28655q, (i14 & 14) | 3072, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0539c(c16686k4, i13, 9);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final JsonElement m34290h0(AbstractC0757c json, Object obj, InterfaceC37145j serializer) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(serializer, "serializer");
        C22669g0 c22669g0 = new C22669g0();
        new C3141t(json, new C3131k0(c22669g0, 0), 1).encodeSerializableValue(serializer, obj);
        Object obj2 = c22669g0.f89336w;
        if (obj2 != null) {
            return (JsonElement) obj2;
        }
        AbstractC22676k.m65757q("result");
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final void m34291i(AbstractC12605c viewModel, EnumC2597p2 enumC2597p2, Modifier modifier, C13821r1 scrollState, Composer composer, int i13) {
        Modifier modifier2;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(scrollState, "scrollState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(795731985);
        int i14 = i13 | (c28655q.m87153g(viewModel) ? 4 : 2) | 384 | (c28655q.m87153g(scrollState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(viewModel.mo35334r(), c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(viewModel.mo35333q(), c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t3 = C27648a.m83597t(viewModel.mo35328j(), c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t4 = C27648a.m83597t(viewModel.f43016T.f64462f, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t5 = C27648a.m83597t(viewModel.f43009M.f127270g, c28655q, 0);
            m34295m(scrollState, (InterfaceC30881s) interfaceC28601c1M83597t5.getValue(), c28655q, (i14 >> 9) & 14);
            InterfaceC30881s interfaceC30881s = (InterfaceC30881s) interfaceC28601c1M83597t5.getValue();
            c28655q.m87150e0(156877261);
            boolean zM87153g = c28655q.m87153g(interfaceC30881s);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = ((InterfaceC30881s) interfaceC28601c1M83597t5.getValue()).mo94928b0(enumC2597p2 == EnumC2597p2.f10103w);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M83597t6 = C27648a.m83597t((InterfaceC13037f2) objM87133R, c28655q, 0);
            C0314n1 c0314n1 = (C0314n1) interfaceC28601c1M83597t.getValue();
            if (!((Boolean) interfaceC28601c1M83597t6.getValue()).booleanValue()) {
                c0314n1 = null;
            }
            InterfaceC30881s interfaceC30881s2 = (InterfaceC30881s) interfaceC28601c1M83597t5.getValue();
            boolean z4 = c0314n1 != null;
            c28655q.m87150e0(156884586);
            boolean zM87153g2 = c28655q.m87153g(interfaceC30881s2) | c28655q.m87155h(z4);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = ((InterfaceC30881s) interfaceC28601c1M83597t5.getValue()).mo94926a0(enumC2597p2 == EnumC2597p2.f10103w, c0314n1 != null);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M83597t7 = C27648a.m83597t((InterfaceC13037f2) objM87133R2, c28655q, 0);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            m34279c(viewModel, (InterfaceC41211c) interfaceC28601c1M83597t7.getValue(), c0314n1, (InterfaceC0305k1) interfaceC28601c1M83597t2.getValue(), (InterfaceC41211c) interfaceC28601c1M83597t3.getValue(), (InterfaceC30881s) interfaceC28601c1M83597t5.getValue(), (C29808b) interfaceC28601c1M83597t4.getValue(), c28655q, 2097160 | (i14 & 14));
            m34283e(0.0f, 0, c28655q, 1);
            c28655q.m87173q(true);
            modifier2 = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2032u(viewModel, enumC2597p2, modifier2, scrollState, i13, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0160  */
    /* JADX WARN: Code duplicated, block: B:65:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:70:0x018f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d6  */
    /* JADX INFO: renamed from: j */
    public static final void m34292j(AbstractC12605c abstractC12605c, Composer composer, int i13) {
        int i14;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        C2598p3 c2598p3;
        boolean z16;
        boolean zM87153g;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1533976193);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC12605c) : c28655q.m87157i(abstractC12605c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(abstractC12605c.mo35332p(), c28655q, 0);
            C11669n c11669n = C11671p.f37680a;
            C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3393o(c22976l1M31081j, c2314t), "PRIMARY_BUTTON");
            c28655q.m87150e0(-1702281508);
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M83597t);
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            int i15 = 1;
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C2175b(interfaceC28601c1M83597t, i15);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3599a, false, (Function1) objM87133R3);
            c28655q.m87150e0(-1702276839);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
            c28655q.m87173q(false);
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            c28655q.m87150e0(797323449);
            int i16 = i14 & 14;
            boolean zM87157i = c28655q.m87157i(context) | (i16 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(abstractC12605c)));
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new C0542f(context, abstractC12605c, interfaceC28601c1, 2);
                c28655q.m87172p0(objM87133R5);
            }
            Function3 function3 = (Function3) objM87133R5;
            c28655q.m87173q(false);
            c28655q.m87150e0(797351961);
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1M83597t);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87153g3 || objM87133R6 == c28676v0) {
                objM87133R6 = new C2612r2(interfaceC28601c1, interfaceC28601c1M83597t);
                c28655q.m87172p0(objM87133R6);
            }
            c28655q.m87173q(false);
            AbstractC2703n.m7582a(function3, modifierM51775c, (Function1) objM87133R6, c28655q, 0);
            c28655q.m87150e0(797356019);
            C2598p3 c2598p4 = (C2598p3) interfaceC28601c1M83597t.getValue();
            if (c2598p4 != null) {
                z4 = true;
                z13 = c2598p4.f10107b;
                if (z13) {
                    c2598p3 = (C2598p3) interfaceC28601c1M83597t.getValue();
                    if (c2598p3 == null && c2598p3.f10110e == z4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        z14 = false;
                    } else {
                        Modifier modifierMo3401b = C1100b.f4583a.mo3401b(AbstractC1136a.m3599a(c2314t, "PRIMARY_BUTTON_DISABLED_OVERLAY"));
                        c28655q.m87150e0(797364675);
                        zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g || objM87133R2 == c28676v0) {
                            objM87133R2 = new C12473e(interfaceC28601c1M83597t, (InterfaceC30057d) null, 19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        z14 = false;
                        c28655q.m87173q(false);
                        AbstractC22989q.m66760a(modifierMo3401b.mo3471e(new SuspendPointerInputElement(C23454a0.f92919a, null, null, new C34450b0((InterfaceC4351m) objM87133R2), 6)), c28655q, 0);
                    }
                } else {
                    z14 = false;
                }
                c28655q.m87173q(z14);
                c28655q.m87173q(true);
                PrimaryButton primaryButton = (PrimaryButton) interfaceC28601c1.getValue();
                c28655q.m87150e0(-1702223951);
                if (i16 != 4 || ((i14 & 8) != 0 && c28655q.m87157i(abstractC12605c))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C12473e(abstractC12605c, interfaceC28601c1, (InterfaceC30057d) null, 20);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                int i17 = PrimaryButton.f22398O;
                AbstractC28683x.m87254h(abstractC12605c, primaryButton, (InterfaceC4351m) objM87133R, c28655q);
            } else {
                z4 = true;
            }
            if (z13) {
                z14 = false;
            } else {
                c2598p3 = (C2598p3) interfaceC28601c1M83597t.getValue();
                if (c2598p3 == null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z16) {
                    Modifier modifierMo3401b2 = C1100b.f4583a.mo3401b(AbstractC1136a.m3599a(c2314t, "PRIMARY_BUTTON_DISABLED_OVERLAY"));
                    c28655q.m87150e0(797364675);
                    zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C12473e(interfaceC28601c1M83597t, (InterfaceC30057d) null, 19);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12473e(interfaceC28601c1M83597t, (InterfaceC30057d) null, 19);
                        c28655q.m87172p0(objM87133R2);
                    }
                    z14 = false;
                    c28655q.m87173q(false);
                    AbstractC22989q.m66760a(modifierMo3401b2.mo3471e(new SuspendPointerInputElement(C23454a0.f92919a, null, null, new C34450b0((InterfaceC4351m) objM87133R2), 6)), c28655q, 0);
                } else {
                    z14 = false;
                }
            }
            c28655q.m87173q(z14);
            c28655q.m87173q(true);
            PrimaryButton primaryButton2 = (PrimaryButton) interfaceC28601c1.getValue();
            c28655q.m87150e0(-1702223951);
            if (i16 != 4) {
                z15 = true;
            } else {
                z15 = true;
            }
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C12473e(abstractC12605c, interfaceC28601c1, (InterfaceC30057d) null, 20);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C12473e(abstractC12605c, interfaceC28601c1, (InterfaceC30057d) null, 20);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            int i18 = PrimaryButton.f22398O;
            AbstractC28683x.m87254h(abstractC12605c, primaryButton2, (InterfaceC4351m) objM87133R, c28655q);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(abstractC12605c, i13, 6);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m34293k(boolean z4, InterfaceC0305k1 interfaceC0305k1, Composer composer, int i13) {
        InterfaceC0305k1 interfaceC0305k2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2128213715);
        int i14 = (c28655q.m87155h(z4) ? 32 : 16) | i13 | (c28655q.m87153g(interfaceC0305k1) ? 256 : 128);
        if ((i14 & 145) == 144 && c28655q.m87121F()) {
            c28655q.m87138X();
            interfaceC0305k2 = interfaceC0305k1;
        } else {
            interfaceC0305k2 = interfaceC0305k1;
            AbstractC1089a.m3344b(interfaceC0305k2, null, null, null, "AnimatedProcessingState", null, AbstractC37817c.m121344e(-1139061802, c28655q, new C2661y2(z4)), c28655q, ((i14 >> 6) & 14) | 1597440, 46);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2626t2(z4, interfaceC0305k2, i13, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m34294l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-16147465);
        if (i13 == 0 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC32126g.m100036a(AbstractC35148d.m111190u(c28655q, R.dimen.stripe_paymentsheet_loading_indicator_stroke_width), 6, ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e(), 0L, c28655q, AbstractC1102d.m3415l(48, C2314t.f9131w));
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26047n(i13, 12);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m34295m(C13821r1 c13821r1, InterfaceC30881s interfaceC30881s, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1456827536);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c13821r1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC30881s) : c28655q.m87157i(interfaceC30881s) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Object[] objArr = new Object[0];
            c28655q.m87150e0(406204198);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C2217h(3);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R, c28655q, 3072, 6);
            String name = interfaceC30881s.getClass().getName();
            if (!name.equals((String) interfaceC28601c1.getValue())) {
                interfaceC28601c1.setValue(name);
                c28655q.m87150e0(406212051);
                boolean z4 = (i14 & 14) == 4;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0162b(c13821r1, null, 9);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC30881s);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(c13821r1, interfaceC30881s, i13, 11);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m34296n(C4591l c4591l, String str, Modifier modifier, Function1 function1, Function1 function2, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-605638725);
        int i16 = i13 | (c28655q.m87153g(c4591l) ? 4 : 2) | (c28655q.m87153g(str) ? 32 : 16) | (c28655q.m87153g(modifier) ? 256 : 128) | (c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87153g(interfaceC2302h) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q.m87153g(interfaceC39105k) ? 1048576 : 524288) | (c28655q.m87147d(1.0f) ? 8388608 : 4194304) | (c28655q.m87153g(null) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE) | (c28655q.m87149e(1) ? 536870912 : 268435456);
        if ((i14 & 14) == 0) {
            i15 = i14 | (c28655q.m87155h(true) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        int i17 = i15;
        if ((1533916891 & i16) == 306783378 && (i17 & 91) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C25542j c25542jM14265c = AbstractC4601v.m14265c(c4591l.f18474a, interfaceC39105k, c28655q);
            int i18 = i16 >> 3;
            int i19 = i16 >> 6;
            int i24 = i16 >> 12;
            AsyncImagePainter asyncImagePainterM14258a = AbstractC4590k.m14258a(c25542jM14265c, c4591l.f18476c, function1, function2, interfaceC39105k, null, c28655q, (i24 & 458752) | (i18 & 7168) | (i18 & 896) | 72 | (i19 & 57344), 64);
            InterfaceC26715i interfaceC26715i = c25542jM14265c.f100132y;
            if (interfaceC26715i instanceof C4595p) {
                c28655q.m87152f0(-2079329304);
                AbstractC22953f.m66714a(modifier, interfaceC2302h, true, AbstractC37817c.m121341b(-888190719, c28655q, new C4598s(interfaceC26715i, c37816b, asyncImagePainterM14258a, str, interfaceC2302h, interfaceC39105k, 0)), c28655q, (i19 & 14) | 3456 | (i24 & 112), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87152f0(-2080018031);
                c28655q.m87152f0(733328855);
                C22998t c22998tM66764e = AbstractC22989q.m66764e(interfaceC2302h, true, c28655q, (((((i19 & 14) | 384) | (i24 & 112)) >> 3) & 14) | 48);
                c28655q.m87152f0(-1323940314);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                C37816b c37816b2 = new C37816b(new C39076b0(0, modifier), true, -511438721);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22998tM66764e);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                c37816b2.invoke(new C28606d2(c28655q), c28655q, 0);
                c28655q.m87152f0(2058660585);
                c37816b.invoke(new C4597r(C1100b.f4583a, asyncImagePainterM14258a, str, interfaceC2302h, interfaceC39105k), c28655q, Integer.valueOf(i17 & 112));
                c28655q.m87173q(false);
                AbstractC2875y.m8286B(c28655q, true, false, false, false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2630u(c4591l, str, modifier, function1, function2, interfaceC2302h, interfaceC39105k, c37816b, i13, i14);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m34297o(C4597r c4597r, Modifier modifier, AbstractC26165a abstractC26165a, String str, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC26165a abstractC26165a2;
        String str2;
        InterfaceC2302h interfaceC2302h2;
        InterfaceC39105k interfaceC39105k2;
        Modifier modifier2;
        float f14;
        boolean z13;
        AbstractC26165a abstractC26165a3;
        Modifier modifier3;
        float f15;
        boolean z14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(880638523);
        if ((i13 & 14) == 0) {
            i14 = (c28655q.m87153g(c4597r) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = i14 | 176;
        if ((i13 & 7168) == 0) {
            i15 = i14 | 1200;
        }
        if ((57344 & i13) == 0) {
            i15 |= DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((458752 & i13) == 0) {
            i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((3670016 & i13) == 0) {
            i15 |= 524288;
        }
        if ((29360128 & i13) == 0) {
            i15 |= 4194304;
        }
        if ((234881024 & i13) == 0) {
            i15 |= AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((191739611 & i15) == 38347922 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier3 = modifier;
            abstractC26165a3 = abstractC26165a;
            str2 = str;
            interfaceC2302h2 = interfaceC2302h;
            interfaceC39105k2 = interfaceC39105k;
            f15 = f13;
            z14 = z4;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                abstractC26165a2 = c4597r.f18487b;
                str2 = c4597r.f18488c;
                interfaceC2302h2 = c4597r.f18489d;
                interfaceC39105k2 = c4597r.f18490e;
                c4597r.getClass();
                c4597r.getClass();
                c4597r.getClass();
                modifier2 = C2314t.f9131w;
                f14 = 1.0f;
                z13 = true;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                abstractC26165a2 = abstractC26165a;
                str2 = str;
                interfaceC2302h2 = interfaceC2302h;
                interfaceC39105k2 = interfaceC39105k;
                f14 = f13;
                z13 = z4;
            }
            c28655q.m87175r();
            C26711e c26711e = AbstractC4601v.f18506b;
            Modifier modifierM51775c = str2 != null ? AbstractC18032n.m51775c(modifier2, false, new C2663y4(str2, 3)) : modifier2;
            if (z13) {
                modifierM51775c = AbstractC37056f.m118995s(modifierM51775c);
            }
            Modifier modifierMo3471e = modifierM51775c.mo3471e(new ContentPainterElement(abstractC26165a2, interfaceC2302h2, interfaceC39105k2, f14));
            C4583d c4583d = C4583d.f18463c;
            c28655q.m87152f0(544976794);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87152f0(1405779621);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(new C4582c(c0213j, 1));
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
            abstractC26165a3 = abstractC26165a2;
            modifier3 = modifier2;
            f15 = f14;
            z14 = z13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2596p1(c4597r, modifier3, abstractC26165a3, str2, interfaceC2302h2, interfaceC39105k2, f15, z14, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX INFO: renamed from: p */
    public static final void m34298p(C0314n1 state, InterfaceC0305k1 interfaceC0305k1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, float f13, Modifier modifier, C35473j0 c35473j0, InterfaceC35322b cardFundingFilter, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a3;
        ?? r10;
        ?? r14;
        InterfaceC41211c interfaceC41211c;
        ?? r15;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1243285696);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC0305k1) : c28655q.m87157i(interfaceC0305k1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            interfaceC4339a3 = interfaceC4339a2;
            i14 |= c28655q.m87157i(interfaceC4339a3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            interfaceC4339a3 = interfaceC4339a2;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(modifier) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(c35473j0) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(cardFundingFilter) ? 8388608 : 4194304;
        }
        if ((4793491 & i14) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
            r15 = c28655q;
        } else {
            C11669n c11669n = C11671p.f37680a;
            Modifier modifierM3393o = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifier);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            EnumC0293g1 enumC0293g1 = EnumC0293g1.f1026w;
            C0308l1 c0308l1M826a = state.m826a(enumC0293g1);
            c28655q.m87150e0(1315094407);
            if (c0308l1M826a == null) {
                r10 = 0;
                r14 = c28655q;
            } else {
                boolean z4 = c0308l1M826a.f1063b;
                EnumC29806a enumC29806a = c0308l1M826a.f1062a;
                C35338j c35338j = c0308l1M826a.f1064c;
                boolean z13 = state.f1082d;
                List list = c0308l1M826a.f1065d;
                int i15 = i14 << 3;
                int i16 = ((i14 << 9) & 458752) | DfuBaseService.ERROR_SERVICE_NOT_FOUND | (i15 & 29360128) | (i15 & 234881024);
                r10 = 0;
                AbstractC37926s0.m121466d(z4, enumC29806a, c35338j, z13, interfaceC4339a, null, c35473j0, cardFundingFilter, list, c28655q, i16);
                r14 = c28655q;
            }
            r14.m87173q(r10);
            C0311m1 c0311m1M827b = state.m827b(enumC0293g1);
            r14.m87150e0(1315116241);
            C2314t c2314t = C2314t.f9131w;
            if (c0311m1M827b != null) {
                r14.m87150e0(1315116628);
                if (state.m826a(enumC0293g1) != null) {
                    AbstractC22953f.m66715b(r14, AbstractC1102d.m3414k(8, c2314t));
                }
                r14.m87173q(r10);
                AbstractC16518o.m46677a(c0311m1M827b.f1072a, state.f1082d, interfaceC4339a3, null, null, r14, (i14 >> 3) & 896);
            }
            r14.m87173q(r10);
            r14.m87150e0(1315126847);
            if ((interfaceC0305k1 instanceof C0299i1) && (interfaceC41211c = ((C0299i1) interfaceC0305k1).f1038a) != null) {
                AbstractC35903f.m114006a(AbstractC35785b.m113396S(interfaceC41211c, r14), AbstractC1099a.m3395q(c2314t, 1, 3), r14, r10);
            }
            r14.m87173q(r10);
            r14.m87150e0(1315137760);
            if (((state.m827b(enumC0293g1) == null && state.m826a(enumC0293g1) == null) ? r10 : 1) != 0) {
                AbstractC22953f.m66715b(r14, AbstractC1102d.m3414k(f13, c2314t));
                AbstractC34924m.m110148i(AbstractC30060g.m92103Y(r14, state.f1083e), r14, r10);
            }
            r14.m87173q(r10);
            r14.m87173q(true);
            r15 = r14;
        }
        C28677v1 c28677v1M87180u = r15.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2605q2(state, interfaceC0305k1, interfaceC4339a, interfaceC4339a2, f13, modifier, c35473j0, cardFundingFilter, i13);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m34299q(InterfaceC30262o interfaceC30262o, Function1[] function1Arr, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC30262o, "<this>");
        if (!(interfaceC30262o instanceof InterfaceC30225b)) {
            throw new IllegalStateException("impossible");
        }
        InterfaceC30225b interfaceC30225b = (InterfaceC30225b) interfaceC30262o;
        Function1[] otherFormats = (Function1[]) Arrays.copyOf(function1Arr, function1Arr.length);
        AbstractC22681m0.m65774e(1, function1);
        AbstractC22676k.m65750j(otherFormats, "otherFormats");
        ArrayList arrayList = new ArrayList(otherFormats.length);
        for (Function1 function2 : otherFormats) {
            InterfaceC30225b interfaceC30225bMo92503f = interfaceC30225b.mo92503f();
            function2.invoke(interfaceC30225bMo92503f);
            arrayList.add(new C32392f(interfaceC30225bMo92503f.mo92501c().f2286a));
        }
        InterfaceC30225b interfaceC30225bMo92503f2 = interfaceC30225b.mo92503f();
        function1.invoke(interfaceC30225bMo92503f2);
        interfaceC30225b.mo92501c().m1637f(new C32388b(new C32392f(interfaceC30225bMo92503f2.mo92501c().f2286a), arrayList));
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC23797r m34300r(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        return (AbstractC23797r) abstractC23811y.mo69863p0();
    }

    /* JADX INFO: renamed from: s */
    public static final Modifier m34301s(float f13, Modifier modifier) {
        float f14 = 0;
        if (Float.compare(f13, f14) > 0) {
            Float.compare(f13, f14);
        }
        return AbstractC1127a.m3486a(modifier, new C14012a(f13, f13, 0, true));
    }

    /* JADX INFO: renamed from: t */
    public static void m34302t(C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
    }

    /* JADX INFO: renamed from: u */
    public static void m34303u(InterfaceC12555l confirmationOption, C12553k confirmationArgs) {
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
    }

    /* JADX INFO: renamed from: v */
    public static final void m34304v(InterfaceC30262o interfaceC30262o, char c3) {
        AbstractC22676k.m65750j(interfaceC30262o, "<this>");
        interfaceC30262o.mo92505a(String.valueOf(c3));
    }

    /* JADX INFO: renamed from: w */
    public static void m34305w(InterfaceC22628l interfaceC22628l) {
        if (interfaceC22628l != null) {
            try {
                interfaceC22628l.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final int m34306x(long j7, long j13) {
        boolean zM34260L = m34260L(j7);
        if (zM34260L != m34260L(j13)) {
            return zM34260L ? -1 : 1;
        }
        int iSignum = (int) Math.signum(m34256H(j7) - m34256H(j13));
        if (Math.min(m34256H(j7), m34256H(j13)) >= 0.0f && m34259K(j7) != m34259K(j13)) {
            return m34259K(j7) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX INFO: renamed from: y */
    public static final Modifier m34307y(Modifier modifier, boolean z4, Function3 function3, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(-2042211002);
        if (z4) {
            modifier = modifier.mo3471e((Modifier) function3.invoke(C2314t.f9131w, c28655q, 6));
        }
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: renamed from: z */
    public static C29027f m34308z(C29024c functionClass, boolean z4) {
        String lowerCase;
        AbstractC22676k.m65750j(functionClass, "functionClass");
        List list = functionClass.f117495K;
        C29027f c29027f = new C29027f(functionClass, null, 1, z4);
        InterfaceC31151q0 interfaceC31151q0Mo95864q0 = functionClass.mo95864q0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC31165x0) obj).getVariance() != EnumC23776g1.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
        Iterator it = c25263qM74105J1.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                AbstractC23763c0 abstractC23763c0Mo60594i = ((InterfaceC31165x0) AbstractC25265s.m74112P0(list)).mo60594i();
                EnumC31106a0 enumC31106a0 = EnumC31106a0.f128307E;
                C31148p c31148p = AbstractC31150q.f128353e;
                C25271y c25271y = C25271y.f99162w;
                c29027f.mo109605O0(null, interfaceC31151q0Mo95864q0, c25271y, c25271y, arrayList2, abstractC23763c0Mo60594i, enumC31106a0, c31148p);
                C29027f c29027f2 = c29027f;
                c29027f2.f146210X = true;
                return c29027f2;
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            int i13 = c25239c0.f99117a;
            InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) c25239c0.f99118b;
            String strM113817b = interfaceC31165x0.getName().m113817b();
            AbstractC22676k.m65749i(strM113817b, "asString(...)");
            if (strM113817b.equals("T")) {
                lowerCase = "instance";
            } else if (strM113817b.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strM113817b.toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            }
            C29027f c29027f3 = c29027f;
            C35850h c35850hM113814e = C35850h.m113814e(lowerCase);
            AbstractC23763c0 abstractC23763c0Mo60594i2 = interfaceC31165x0.mo60594i();
            AbstractC22676k.m65749i(abstractC23763c0Mo60594i2, "getDefaultType(...)");
            arrayList2.add(new C34709w0(c29027f3, null, i13, C32305g.f133684a, c35850hM113814e, abstractC23763c0Mo60594i2, false, false, false, null, InterfaceC31155s0.f128370q));
            c29027f = c29027f3;
        }
    }
}
