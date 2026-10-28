package x43;

import a30.EnumC0304k0;
import aa3.C0656u0;
import aa3.EnumC0647q;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillValue;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.glance.appwidget.AsyncRequestWorker;
import androidx.glance.appwidget.protobuf.AbstractC1411p;
import androidx.glance.appwidget.protobuf.C1406n;
import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1935f;
import aws.sdk.kotlin.runtime.config.profile.AwsConfigParseException;
import b30.C2637v;
import b30.C2649w4;
import b30.C2663y4;
import bc3.C3023j1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import c43.EnumC4206v;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.ElementSelector;
import com.amplitude.android.engagement.types.FormFactor;
import com.amplitude.android.engagement.types.IconMarker;
import com.amplitude.android.engagement.types.ImageMarker;
import com.amplitude.android.engagement.types.Marker;
import com.amplitude.android.engagement.types.MarkerPositioning;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.OffsetValue;
import com.amplitude.android.engagement.types.PinPointerType;
import com.amplitude.android.engagement.types.SimulationContext;
import com.amplitude.android.engagement.types.TooltipFormFactor;
import com.amplitude.android.engagement.types.TooltipPointer;
import com.amplitude.android.engagement.types.TooltipPointerType;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.whoop.android.R;
import d00.C11422a;
import d00.C11423b;
import d00.C11424c;
import d00.C11425d;
import d00.C11426e;
import d00.InterfaceC11427f;
import d40.AbstractC11673r;
import d40.EnumC11663h;
import e93.AbstractC12889b;
import eu.C13617i0;
import eu.InterfaceC13637x;
import g40.C15336d0;
import g40.C15348f0;
import g40.C15397o;
import gb.C15657r;
import hb3.C17134w;
import hg3.AbstractC17269i;
import i93.C18283i;
import i93.C18284j;
import ih0.AbstractC18489d0;
import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import j93.InterfaceC21467g;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLHandshakeException;
import l83.C23454a0;
import l83.C23464j;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n83.C26459b;
import n83.C26460c;
import n83.C26461d;
import n83.C26463f;
import n83.C26464g;
import ng3.C26702o;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p003a1.C0106e;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0230n0;
import p005a3.InterfaceC0221l;
import p023ay.C2140n;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.C2320z;
import p027b3.AbstractC2378g1;
import p027b3.AbstractC2453v1;
import p027b3.C2361d;
import p027b3.InterfaceC2438s1;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p042c2.AbstractC3860e;
import p042c2.C3856a;
import p042c2.C3867l;
import p042c2.C3868m;
import p042c2.EnumC3869n;
import p043c4.C3963i;
import p043c4.C3974q;
import p048ce.AbstractC4466g;
import p048ce.C4459a0;
import p048ce.C4462c;
import p048ce.C4463d;
import p048ce.C4464e;
import p048ce.C4465f;
import p048ce.C4470k;
import p048ce.C4472m;
import p048ce.C4483x;
import p048ce.C4484y;
import p048ce.C4485z;
import p048ce.EnumC4471l;
import p048ce.EnumC4481v;
import p048ce.InterfaceC4461b0;
import p091dg.C12002a;
import p095dp.AbstractC12240d;
import p127ev.C13667h;
import p163g1.AbstractC14959b1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.C15069l3;
import p163g1.C15127r1;
import p181h2.C16618c;
import p184h5.InterfaceC16916u0;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17916v0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.C18027i;
import p212i6.AbstractC18150c;
import p218ic.AbstractC18360h;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.C18392z;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p249jc.AbstractC21598x;
import p249jc.C21596v;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23138n;
import p292l1.AbstractC23149o4;
import p292l1.AbstractC23164r1;
import p292l1.C23120k;
import p292l1.C23132m;
import p315m0.AbstractC24868a;
import p326mf.AbstractC25491k;
import p326mf.AbstractC25492l;
import p326mf.C25490j;
import p326mf.C25494n;
import p326mf.C25495o;
import p326mf.C25500t;
import p326mf.EnumC25496p;
import p326mf.InterfaceC25488h;
import p328mj.AbstractC25611r;
import p328mj.C25598e;
import p328mj.C25609p;
import p331n2.AbstractC26165a;
import p354o1.AbstractC27373l;
import p354o1.EnumC27367f;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p355o2.C27455z;
import p358o6.AbstractC27596d;
import p358o6.C27598f;
import p367of.C27892a;
import p368og.InterfaceC27910g;
import p370oj.AbstractC27955b;
import p370oj.C27957d;
import p370oj.C27958e;
import p370oj.C27959f;
import p370oj.C27962i;
import p370oj.C27963j;
import p370oj.C27964k;
import p390p1.AbstractC28683x;
import p390p1.C28592a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p395p6.AbstractC28935z;
import p401pj.AbstractC29272h0;
import p401pj.C29262c0;
import p401pj.C29266e0;
import p401pj.C29268f0;
import p401pj.C29270g0;
import p423qf.C30318b;
import p451r6.C30947a;
import p451r6.C30960n;
import p457rc.C31222e;
import p459rf.C31341l;
import p459rf.C31349t;
import p459rf.C31352w;
import p459rf.C31353x;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p511u1.C34400g;
import p525uj.AbstractC35029g;
import p550vd.AbstractC35903f;
import p551vf.InterfaceC35936a;
import p557vo.AbstractC36220b;
import p558vp.AbstractC36259c;
import p571w3.C36775k;
import p591wp.C37487h;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39178j;
import p647yf.InterfaceC39508u;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.reflect.jvm.internal.KClassImpl;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p719m22.C24958m;
import pf.AbstractC29125c;
import q30.C29926q0;
import q30.EnumC29940x0;
import q83.AbstractC30060g;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import qg3.C30352d;
import r12.C30856a;
import r30.C30898c;
import r30.C30899d;
import r30.C30900e;
import r30.C30903h;
import r30.EnumC30904i;
import r30.EnumC30905j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32416g;
import ud3.AbstractC34846v0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34844u0;
import ud3.C34850x0;
import v63.AbstractC35744b;
import v63.AbstractC35745c;
import va3.AbstractC35846d;
import wb3.AbstractC37056f;
import wf.C37236a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: x43.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC37978j implements InterfaceC16916u0 {

    /* JADX INFO: renamed from: a */
    public static C27430e f162635a;

    /* JADX INFO: renamed from: b */
    public static Boolean f162636b;

    /* JADX INFO: renamed from: c */
    public static C30352d f162637c;

    /* JADX INFO: renamed from: A */
    public static List m121618A(C0230n0 c0230n0) throws IllegalAccessException, InvocationTargetException {
        Boolean bool = f162636b;
        Boolean bool2 = Boolean.FALSE;
        if (AbstractC22676k.m65745e(bool, bool2)) {
            return c0230n0.getChildren$ui();
        }
        if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
            Method method = (Method) m121619B().f124535x;
            AbstractC22676k.m65747g(method);
            Object objInvoke = method.invoke(c0230n0, null);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.node.LayoutNode>");
            return (List) objInvoke;
        }
        if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            List children$ui = c0230n0.getChildren$ui();
            f162636b = bool2;
            return children$ui;
        } catch (NoSuchMethodError unused) {
            f162636b = Boolean.TRUE;
            Method method2 = (Method) m121619B().f124535x;
            AbstractC22676k.m65747g(method2);
            Object objInvoke2 = method2.invoke(c0230n0, null);
            AbstractC22676k.m65748h(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.node.LayoutNode>");
            return (List) objInvoke2;
        }
    }

    /* JADX INFO: renamed from: B */
    public static C30352d m121619B() {
        Method declaredMethod;
        C30352d c30352d = f162637c;
        if (c30352d != null) {
            return c30352d;
        }
        Method method = null;
        try {
            declaredMethod = C0230n0.class.getDeclaredMethod("getChildren$ui_release", null);
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        try {
            Method declaredMethod2 = C0230n0.class.getDeclaredMethod("getOuterCoordinator$ui_release", null);
            declaredMethod2.setAccessible(true);
            method = declaredMethod2;
        } catch (NoSuchMethodException unused2) {
        }
        C30352d c30352d2 = new C30352d(18, declaredMethod, method);
        f162637c = c30352d2;
        return c30352d2;
    }

    /* JADX INFO: renamed from: C */
    public static C2361d m121620C() {
        if (C2361d.f9322e == null) {
            C2361d.f9322e = new C2361d();
        }
        C2361d c2361d = C2361d.f9322e;
        AbstractC22676k.m65748h(c2361d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
        return c2361d;
    }

    /* JADX INFO: renamed from: D */
    public static final InterfaceC21461d m121621D(InterfaceC21463e interfaceC21463e) {
        Object obj;
        if (interfaceC21463e instanceof InterfaceC21461d) {
            return (InterfaceC21461d) interfaceC21463e;
        }
        if (!(interfaceC21463e instanceof InterfaceC21458b0)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + interfaceC21463e);
        }
        List upperBounds = ((InterfaceC21458b0) interfaceC21463e).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC21463e classifier = ((InterfaceC21456a0) next).getClassifier();
            KClassImpl kClassImpl = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
            if (kClassImpl != null && kClassImpl.getClassKind$kotlin_reflection() != EnumC0647q.INTERFACE && kClassImpl.getClassKind$kotlin_reflection() != EnumC0647q.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        InterfaceC21456a0 interfaceC21456a0 = (InterfaceC21456a0) obj;
        if (interfaceC21456a0 == null) {
            interfaceC21456a0 = (InterfaceC21456a0) AbstractC25265s.m74100H0(upperBounds);
        }
        return interfaceC21456a0 != null ? m121622E(interfaceC21456a0) : AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object.class);
    }

    /* JADX INFO: renamed from: E */
    public static final InterfaceC21461d m121622E(InterfaceC21456a0 interfaceC21456a0) {
        InterfaceC21461d interfaceC21461dM121621D;
        AbstractC22676k.m65750j(interfaceC21456a0, "<this>");
        InterfaceC21463e classifier = interfaceC21456a0.getClassifier();
        if (classifier != null && (interfaceC21461dM121621D = m121621D(classifier)) != null) {
            return interfaceC21461dM121621D;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + interfaceC21456a0);
    }

    /* JADX INFO: renamed from: F */
    public static UUID m121623F(String str, JSONObject jSONObject) throws ChallengeResponseParseException {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || AbstractC39414r.m125890i0(strOptString)) {
            int i13 = ChallengeResponseParseException.f22419z;
            throw C27648a.m83601x(str);
        }
        try {
            UUID uuidFromString = UUID.fromString(strOptString);
            AbstractC22676k.m65749i(uuidFromString, "fromString(...)");
            return uuidFromString;
        } catch (Throwable th3) {
            if (C23468n.m68037a(AbstractC34132o.m107888l(th3)) == null) {
                throw new KotlinNothingValueException();
            }
            int i14 = ChallengeResponseParseException.f22419z;
            throw C27648a.m83600w(str);
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m121624G(JSONObject jSONObject, String str, boolean z4) throws JSONException, ChallengeResponseParseException {
        String string;
        if (!z4) {
            string = jSONObject.has(str) ? jSONObject.getString(str) : null;
        } else {
            if (!jSONObject.has(str)) {
                int i13 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83601x(str);
            }
            string = jSONObject.getString(str);
        }
        if (string == null || C30900e.f127402c0.contains(string)) {
            return "Y".equals(string);
        }
        if (z4 && AbstractC39414r.m125890i0(string)) {
            int i14 = ChallengeResponseParseException.f22419z;
            throw C27648a.m83601x(str);
        }
        int i15 = ChallengeResponseParseException.f22419z;
        throw C27648a.m83600w(str);
    }

    /* JADX INFO: renamed from: H */
    public static int m121625H(int i13, Integer num, Integer num2, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-900915335);
        c28655q.m87150e0(-1136549412);
        c28655q.m87150e0(-1529074886);
        boolean z4 = ((double) AbstractC17918w0.m51536x(AbstractC11673r.m31082k(c28655q).f37668a)) < 0.5d;
        c28655q.m87173q(false);
        if (z4 && num != null) {
            i13 = num.intValue();
        }
        c28655q.m87173q(false);
        int iOrdinal = ((EnumC11663h) c28655q.m87161k(AbstractC11673r.f37715g)).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (num2 != null) {
                i13 = num2.intValue();
            }
        }
        c28655q.m87173q(false);
        return i13;
    }

    /* JADX INFO: renamed from: I */
    public static C21462d0 m121626I(InterfaceC21456a0 type) {
        AbstractC22676k.m65750j(type, "type");
        return new C21462d0(EnumC21464e0.f82426w, type);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m121627J(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2378g1.m7336k(accessibilityManager);
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m121628K(C0230n0 c0230n0) throws IllegalAccessException, InvocationTargetException {
        Boolean bool = f162636b;
        Boolean bool2 = Boolean.FALSE;
        if (AbstractC22676k.m65745e(bool, bool2)) {
            return c0230n0.getOuterCoordinator$ui().m3544o1();
        }
        if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
            Method method = (Method) m121619B().f124536y;
            AbstractC22676k.m65747g(method);
            Object objInvoke = method.invoke(c0230n0, null);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return ((NodeCoordinator) objInvoke).m3544o1();
        }
        if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            boolean zM3544o1 = c0230n0.getOuterCoordinator$ui().m3544o1();
            f162636b = bool2;
            return zM3544o1;
        } catch (NoSuchMethodError unused) {
            f162636b = Boolean.TRUE;
            Method method2 = (Method) m121619B().f124536y;
            AbstractC22676k.m65747g(method2);
            Object objInvoke2 = method2.invoke(c0230n0, null);
            AbstractC22676k.m65748h(objInvoke2, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return ((NodeCoordinator) objInvoke2).m3544o1();
        }
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m121629L(String str) {
        if (str != null && str.length() != 0) {
            for (int i13 = 0; i13 < str.length(); i13++) {
                if (AbstractC35846d.m113784i(str.charAt(i13))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static float m121630M(float f13, float f14, float f15) {
        return AbstractC2875y.m8288a(f14, f13, f15, f13);
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m121631O(Context context, Function1 function1) {
        if (!AbstractC28935z.f117071a.get() && (!AbstractC22676k.m65745e(Build.MANUFACTURER, "vivo") || Build.VERSION.SDK_INT >= 35)) {
            return false;
        }
        C30947a c30947aM95227E = C30960n.m95227E();
        function1.invoke(c30947aM95227E);
        C30960n c30960n = (C30960n) c30947aM95227E.m4552a();
        AbstractC22676k.m65750j(context, "context");
        C21596v c21596vM60637g = C21596v.m60637g(context);
        C18392z c18392z = new C18392z(AsyncRequestWorker.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            int iMo4269b = c30960n.mo4269b(null);
            byte[] bArr = new byte[iMo4269b];
            Logger logger = AbstractC1411p.f5953e;
            C1406n c1406n = new C1406n(bArr, iMo4269b);
            c30960n.m4280m(c1406n);
            if (c1406n.m4467C0() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            linkedHashMap.put("request", AbstractC18360h.m52863b(bArr));
            C18358g c18358g = new C18358g(linkedHashMap);
            AbstractC29125c.m88515X(c18358g);
            c21596vM60637g.m52874c(((C18392z) c18392z.m52882h(c18358g)).m52878b());
            c21596vM60637g.m52876e("updateRequestWorkerKeepEnabled", EnumC18368l.f71504x, (C18347a0) ((C18392z) ((C18392z) new C18392z(AsyncRequestWorker.class).m52881g(3650L, TimeUnit.DAYS)).m52880f(new C18354e(new C31222e(null), EnumC18390x.f71560w, true, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(new LinkedHashSet())))).m52878b());
            return true;
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + C30960n.class.getName() + " to a byte array threw an IOException (should never happen).", e5);
        }
    }

    /* JADX INFO: renamed from: P */
    public static final C27598f m121632P(AbstractC27596d... abstractC27596dArr) {
        ArrayList arrayList = new ArrayList(abstractC27596dArr.length);
        if (abstractC27596dArr.length <= 0) {
            C23465k[] c23465kArr = (C23465k[]) arrayList.toArray(new C23465k[0]);
            return new C27598f(AbstractC25247g0.m73993b0((C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length)));
        }
        AbstractC27596d abstractC27596d = abstractC27596dArr[0];
        throw null;
    }

    /* JADX INFO: renamed from: Q */
    public static final Map m121633Q(InterfaceC27910g logger, EnumC4481v type, String str) {
        Map map;
        InterfaceC4461b0 interfaceC4461b0;
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(type, "type");
        C25272z c25272z = C25272z.f99163w;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return c25272z;
        }
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        List listM125894m0 = AbstractC39414r.m125894m0(str);
        char c3 = '\n';
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125894m0, 10));
        int i13 = 0;
        for (Object obj : listM125894m0) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new C4472m(i14, (String) obj));
            i13 = i14;
        }
        ArrayList<C4472m> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C4472m c4472m = (C4472m) obj2;
            if (!AbstractC39414r.m125890i0(c4472m.f18003b)) {
                String string = AbstractC39414r.m125869O0(c4472m.f18003b).toString();
                if (!AbstractC39421y.m125930O(string, "#", false) && !AbstractC39421y.m125930O(string, ";", false)) {
                    arrayList2.add(obj2);
                }
            }
        }
        C4485z c4485z = null;
        C4484y c4484y = null;
        for (C4472m input : arrayList2) {
            AbstractC22676k.m65750j(input, "input");
            Iterator it = type.f18016x.iterator();
            do {
                if (!it.hasNext()) {
                    interfaceC4461b0 = null;
                    break;
                }
                interfaceC4461b0 = (InterfaceC4461b0) ((Function3) it.next()).invoke(input, c4485z, c4484y);
            } while (interfaceC4461b0 == null);
            if (interfaceC4461b0 == null) {
                throw new AwsConfigParseException(AbstractC3511b.m10386o(Integer.valueOf(input.f18002a), "Encountered unexpected token"));
            }
            if (interfaceC4461b0 instanceof C4485z) {
                c4485z = (C4485z) interfaceC4461b0;
                c4484y = null;
            } else if (interfaceC4461b0 instanceof C4484y) {
                c4484y = (C4484y) interfaceC4461b0;
            }
            c26460cM119000x.add(new C23465k(input, interfaceC4461b0));
        }
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        AbstractC22676k.m65750j(c26460cM118988k, "<this>");
        C26463f c26463f = new C26463f();
        C22669g0 c22669g0 = new C22669g0();
        ListIterator listIterator = c26460cM118988k.listIterator(0);
        C4484y c4484y2 = null;
        LinkedHashMap linkedHashMap = null;
        while (true) {
            C26459b c26459b = (C26459b) listIterator;
            if (!c26459b.hasNext()) {
                C26463f c26463fM78380b = c26463f.m78380b();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Object it3 = ((C26464g) c26463fM78380b.entrySet()).iterator();
                while (((AbstractC18150c) it3).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((C26461d) it3).next();
                    boolean z4 = ((C4485z) entry.getKey()).f18028c;
                    if (!z4) {
                        if (z4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C34400g c34400g = (C34400g) c26463fM78380b.keySet();
                        if (!((C26463f) c34400g.f144618x).isEmpty()) {
                            Iterator it4 = c34400g.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    C4485z c4485z2 = (C4485z) it4.next();
                                    if (c4485z2.f18028c && c4485z2.f18026a.equals(((C4485z) entry.getKey()).f18026a) && c4485z2.f18027b == ((C4485z) entry.getKey()).f18027b) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    arrayList3.add(new C4470k(((C4485z) entry2.getKey()).f18026a, (Map) entry2.getValue(), ((C4485z) entry2.getKey()).f18027b));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (EnumC4471l enumC4471l : EnumC4471l.values()) {
                    ArrayList<C4470k> arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList3) {
                        if (((C4470k) obj3).f17996c == enumC4471l) {
                            arrayList4.add(obj3);
                        }
                    }
                    C26463f c26463f2 = new C26463f();
                    for (C4470k c4470k : arrayList4) {
                        C4470k c4470k2 = (C4470k) c26463f2.get(c4470k.f17994a);
                        if (c4470k2 == null || (map = c4470k2.f17995b) == null) {
                            map = c25272z;
                        }
                        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(map, c4470k.f17995b);
                        String str2 = c4470k.f17994a;
                        c26463f2.put(str2, new C4470k(str2, linkedHashMapM73995d0, c4470k.f17996c));
                    }
                    C26463f c26463fM78380b2 = c26463f2.m78380b();
                    if (!c26463fM78380b2.isEmpty()) {
                        linkedHashMap3.put(enumC4471l, c26463fM78380b2);
                    }
                }
                return linkedHashMap3;
            }
            C23465k c23465k = (C23465k) c26459b.next();
            C4472m c4472m2 = (C4472m) c23465k.f92937w;
            InterfaceC4461b0 interfaceC4461b1 = (InterfaceC4461b0) c23465k.f92938x;
            if (interfaceC4461b1 instanceof C4485z) {
                c22669g0.f89336w = interfaceC4461b1;
                if (!c26463f.containsKey(interfaceC4461b1)) {
                    if (((C4485z) interfaceC4461b1).f18029d) {
                        c26463f.put(interfaceC4461b1, new LinkedHashMap());
                    } else {
                        logger.mo390n(null, new C4462c(c4472m2, interfaceC4461b1, 0));
                    }
                }
                c4484y2 = null;
            } else if (interfaceC4461b1 instanceof C4484y) {
                Object obj4 = c22669g0.f89336w;
                AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                c4484y2 = (C4484y) interfaceC4461b1;
                String str3 = c4484y2.f18024a;
                if (AbstractC3511b.m10362B(str3)) {
                    Object obj5 = c22669g0.f89336w;
                    if (((C4485z) obj5).f18029d) {
                        Object obj6 = c26463f.get(obj5);
                        AbstractC22676k.m65747g(obj6);
                        Map map2 = (Map) obj6;
                        if (map2.containsKey(str3)) {
                            logger.mo390n(null, new C17134w(c4472m2, interfaceC4461b1, c22669g0, 2));
                        }
                        if (map2.containsKey(str3)) {
                            logger.mo390n(null, new C4462c(c4472m2, interfaceC4461b1, 2));
                        }
                        map2.put(str3, new C4465f(c4484y2.f18025b));
                    } else {
                        logger.mo390n(null, new C4463d(0, c4472m2, c22669g0));
                    }
                } else {
                    logger.mo390n(null, new C4462c(c4472m2, interfaceC4461b1, 1));
                }
            } else if (interfaceC4461b1 instanceof C4483x) {
                Object obj7 = c22669g0.f89336w;
                AbstractC22676k.m65748h(obj7, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                AbstractC22676k.m65748h(c4484y2, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Property");
                String str4 = c4484y2.f18024a;
                Object obj8 = c26463f.get(c22669g0.f89336w);
                AbstractC22676k.m65747g(obj8);
                Map map3 = (Map) obj8;
                Object obj9 = map3.get(str4);
                AbstractC22676k.m65748h(obj9, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.AwsConfigValue.String");
                map3.put(str4, new C4465f(((C4465f) obj9).f17987w + c3 + ((C4483x) interfaceC4461b1).f18023a));
            } else {
                if (!(interfaceC4461b1 instanceof C4459a0)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj10 = c22669g0.f89336w;
                AbstractC22676k.m65748h(obj10, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                AbstractC22676k.m65748h(c4484y2, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Property");
                String str5 = c4484y2.f18024a;
                C4459a0 c4459a0 = (C4459a0) interfaceC4461b1;
                String str6 = c4459a0.f17969a;
                if (AbstractC3511b.m10362B(str6)) {
                    Object obj11 = c26463f.get(c22669g0.f89336w);
                    AbstractC22676k.m65747g(obj11);
                    Map map4 = (Map) obj11;
                    AbstractC4466g abstractC4466g = (AbstractC4466g) map4.get(str5);
                    if (abstractC4466g instanceof C4465f) {
                        if (((C4465f) abstractC4466g).f17987w.length() > 0) {
                            logger.mo390n(null, new C4462c(c4472m2, interfaceC4461b1, 4));
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        map4.put(str5, new C4464e(linkedHashMap4));
                        linkedHashMap = linkedHashMap4;
                    }
                    AbstractC22676k.m65747g(linkedHashMap);
                    linkedHashMap.put(str6, c4459a0.f17970b);
                    c3 = '\n';
                } else {
                    logger.mo390n(null, new C4462c(c4472m2, interfaceC4461b1, 3));
                }
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m121634R(C3856a c3856a, SparseArray sparseArray) {
        Function1 function1;
        if (c3856a.f15779b.f15804a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iKeyAt = sparseArray.keyAt(i13);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            if (autofillValue.isText()) {
                C3868m c3868m = c3856a.f15779b;
                String string = autofillValue.getTextValue().toString();
                C3867l c3867l = (C3867l) c3868m.f15804a.get(Integer.valueOf(iKeyAt));
                if (c3867l != null && (function1 = c3867l.f15802c) != null) {
                    function1.invoke(string);
                }
            } else {
                if (autofillValue.isDate()) {
                    throw new C23464j("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValue.isList()) {
                    throw new C23464j("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValue.isToggle()) {
                    throw new C23464j("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static final void m121635S(C3856a c3856a, ViewStructure viewStructure) {
        C3868m c3868m = c3856a.f15779b;
        if (c3868m.f15804a.isEmpty()) {
            return;
        }
        int iAddChildCount = viewStructure.addChildCount(c3868m.f15804a.size());
        for (Map.Entry entry : c3868m.f15804a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            C3867l c3867l = (C3867l) entry.getValue();
            ViewStructure viewStructureNewChild = viewStructure.newChild(iAddChildCount);
            viewStructureNewChild.setAutofillId(c3856a.f15781d, iIntValue);
            viewStructureNewChild.setId(iIntValue, c3856a.f15778a.getContext().getPackageName(), null, null);
            viewStructureNewChild.setAutofillType(1);
            List list = c3867l.f15800a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                String str = (String) AbstractC3860e.f15796a.get((EnumC3869n) list.get(i13));
                if (str == null) {
                    throw new IllegalArgumentException("Unsupported autofill type");
                }
                arrayList.add(str);
            }
            viewStructureNewChild.setAutofillHints((String[]) arrayList.toArray(new String[0]));
            C16618c c16618c = c3867l.f15801b;
            if (c16618c == null) {
                Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
            } else {
                int iRound = Math.round(c16618c.f63939a);
                int iRound2 = Math.round(c16618c.f63940b);
                viewStructureNewChild.setDimens(iRound, iRound2, 0, 0, Math.round(c16618c.f63941c) - iRound, Math.round(c16618c.f63942d) - iRound2);
            }
            iAddChildCount++;
        }
    }

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ String m121636U(EnumC4206v enumC4206v) {
        AbstractC22676k.m65750j(enumC4206v, "<this>");
        int iOrdinal = enumC4206v.ordinal();
        if (iOrdinal == 0) {
            return "publisher";
        }
        if (iOrdinal == 1) {
            return "subscriber";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: V */
    public static final List m121637V(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(AbstractC25265s.m74096F0(list));
        }
        return C25271y.f99162w;
    }

    /* JADX INFO: renamed from: W */
    public static final Map m121638W(Map map) {
        int size = map.size();
        if (size == 0) {
            return C25272z.f99163w;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC25265s.m74094E0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: X */
    public static final EnumC0304k0 m121639X(InterfaceC11427f interfaceC11427f) {
        AbstractC22676k.m65750j(interfaceC11427f, "<this>");
        if (interfaceC11427f instanceof C11426e) {
            return EnumC0304k0.f1045w;
        }
        if (interfaceC11427f instanceof C11423b) {
            return ((C11423b) interfaceC11427f).f36643a != null ? EnumC0304k0.f1047y : EnumC0304k0.f1046x;
        }
        if (interfaceC11427f.equals(C11425d.f36645a)) {
            return EnumC0304k0.f1046x;
        }
        if (interfaceC11427f.equals(C11424c.f36644a) || (interfaceC11427f instanceof C11422a)) {
            return EnumC0304k0.f1048z;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: Y */
    public static final C34832o0 m121640Y(InterfaceC35936a interfaceC35936a, C12002a execContext, InterfaceC30063j callContext, C30318b metrics) {
        Long lMo74901a;
        AbstractC22676k.m65750j(interfaceC35936a, "<this>");
        AbstractC22676k.m65750j(execContext, "execContext");
        AbstractC22676k.m65750j(callContext, "callContext");
        AbstractC22676k.m65750j(metrics, "metrics");
        C34830n0 c34830n0 = new C34830n0();
        C31352w c31352w = new C31352w(execContext, callContext, metrics);
        InterfaceC21461d type = AbstractC21598x.m60666V(C31352w.class);
        AbstractC22676k.m65750j(type, "type");
        c34830n0.f146691e = c34830n0.f146691e.mo113254k(type, c31352w);
        c34830n0.m109905f(interfaceC35936a.getUrl().f18375h);
        InterfaceC25488h headers = interfaceC35936a.getHeaders();
        AbstractC22676k.m65750j(headers, "<this>");
        C22677k0 c22677k0 = new C22677k0(2, false);
        headers.m44480c(new C30856a(c22677k0, 2));
        if (!headers.mo44483f()) {
            c22677k0.m65765f("Accept-Encoding", "identity");
        }
        c34830n0.m109903d(c22677k0.m65766g());
        AbstractC34846v0 c31353x = null;
        c25494n = null;
        AbstractC25492l c25494n = null;
        if (AbstractC37056f.m118969X(interfaceC35936a.getMethod().name())) {
            AbstractC25492l body = interfaceC35936a.getBody();
            if (body instanceof C25490j) {
                AbstractC34846v0.Companion.getClass();
                c31353x = C34844u0.m109926c(null, new byte[0], 0, 0);
            } else if (body instanceof C27892a) {
                byte[] bArr = ((C27892a) body).f112471a;
                C34844u0 c34844u0 = AbstractC34846v0.Companion;
                int length = bArr.length;
                c34844u0.getClass();
                c31353x = C34844u0.m109926c(null, bArr, 0, length);
            } else {
                if (!(body instanceof AbstractC25491k) && !(body instanceof C25494n)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = (String) interfaceC35936a.getHeaders().get("Content-Length");
                if (str != null) {
                    if (body.mo74901a() == null || ((lMo74901a = body.mo74901a()) != null && lMo74901a.longValue() == -1)) {
                        if (body instanceof AbstractC25491k) {
                            InterfaceC39508u interfaceC39508uMo74903d = ((AbstractC25491k) body).mo74903d();
                            Long lValueOf = Long.valueOf(Long.parseLong(str));
                            AbstractC22676k.m65750j(interfaceC39508uMo74903d, "<this>");
                            c25494n = new C25495o(lValueOf, interfaceC39508uMo74903d);
                        } else {
                            if (!(body instanceof C25494n)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c25494n = new C25494n(Long.valueOf(Long.parseLong(str)), ((C25494n) body).f99829b);
                        }
                    }
                    if (c25494n != null) {
                        body = c25494n;
                    }
                }
                c31353x = new C31353x(body, callContext);
            }
        } else if (!(interfaceC35936a.getBody() instanceof C25490j)) {
            throw new IllegalStateException(("unexpected HTTP body for method " + interfaceC35936a.getMethod()).toString());
        }
        c34830n0.m109904e(interfaceC35936a.getMethod().name(), c31353x);
        return new C34832o0(c34830n0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: Z */
    public static final C37236a m121641Z(C34850x0 c34850x0) {
        AbstractC22676k.m65750j(c34850x0, "<this>");
        C31349t c31349t = new C31349t(c34850x0.f146777F);
        AbstractC25492l c25495o = c34850x0.f146778G.mo1941i() == 0 ? C25490j.f99825a : new C25495o(c34850x0);
        C25500t c25500t = C25500t.f99849c;
        int i13 = c34850x0.f146792z;
        C25500t c25500t2 = (C25500t) C25500t.f99855i.get(Integer.valueOf(i13));
        if (c25500t2 == null) {
            c25500t2 = new C25500t(i13, "Unknown HttpStatusCode");
        }
        return new C37236a(c25500t2, c31349t, c25495o);
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m121642a0(Exception exc, String message) {
        AbstractC22676k.m65750j(message, "message");
        if (Log.isLoggable("ServiceConnection", 5)) {
            Log.w("ServiceConnection", message, exc);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m121643d(Modifier modifier, C15336d0 c15336d0, boolean z4, Composer composer, int i13) {
        int i14;
        Object c0106e;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1442026933);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(c15336d0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i15 = i14;
        if ((i15 & 147) == 146 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c15336d0.f57628c, c28655q2, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c15336d0.f57629d, c28655q2, 0);
            boolean zBooleanValue = ((Boolean) interfaceC28601c1M83597t.getValue()).booleanValue();
            c28655q2.m87150e0(677757973);
            boolean zM87157i = c28655q2.m87157i(c15336d0);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                c0106e = new C0106e(1, c15336d0, C15336d0.class, "onValueChange", "onValueChange(Z)V", 0, 26);
                c28655q2.m87172p0(c0106e);
            } else {
                c0106e = objM87133R;
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            m121644e(modifier, zBooleanValue, z4, (Function1) ((InterfaceC21467g) c0106e), new C2140n(c15336d0, 4), new C15397o(interfaceC28601c1M83597t2, 1), c28655q, i15 & 910);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(modifier, c15336d0, z4, i13, 15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m121644e(Modifier modifier, boolean z4, boolean z13, Function1 onValueChange, C2140n c2140n, C15397o c15397o, Composer composer, int i13) {
        int i14;
        long j7;
        C28655q c28655q;
        C15127r1 c15127r1M34081r;
        C28655q c28655q2;
        AbstractC22676k.m65750j(onValueChange, "onValueChange");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-602050013);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q3.m87153g("BACS_MANDATE_CHECKBOX") ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q3.m87157i(onValueChange) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q3.m87157i(c2140n) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q3.m87157i(c15397o) ? 1048576 : 524288;
        }
        int i15 = i14;
        if ((i15 & 599187) == 599186 && c28655q3.m87121F()) {
            c28655q3.m87138X();
            c28655q2 = c28655q3;
        } else {
            String strM92103Y = AbstractC30060g.m92103Y(c28655q3, z4 ? R.string.selected : R.string.not_selected);
            c28655q3.m87150e0(-483761911);
            String str = (String) c15397o.invoke(c28655q3, Integer.valueOf((i15 >> 18) & 14));
            boolean z14 = false;
            c28655q3.m87173q(false);
            long jM43088c = AbstractC11673r.m31082k(c28655q3).f37676i.m43088c();
            c28655q3.m87150e0(-483758193);
            C15127r1 c15127r1M34081r2 = AbstractC12240d.m34081r(jM43088c, jM43088c, jM43088c, 0L, c28655q3, 0, 24);
            c28655q3.m87173q(false);
            c28655q3.m87150e0(-483758171);
            if (c15127r1M34081r2 == null) {
                c15127r1M34081r = AbstractC12240d.m34081r(C15069l3.m43147a(c28655q3).m43091f(), AbstractC11673r.m31082k(c28655q3).f37672e, C15069l3.m43147a(c28655q3).m43093h(), 0L, c28655q3, 0, 24);
                c28655q = c28655q3;
                j7 = jM43088c;
                z14 = false;
            } else {
                j7 = jM43088c;
                c28655q = c28655q3;
                c15127r1M34081r = c15127r1M34081r2;
            }
            c28655q.m87173q(z14);
            c28655q.m87150e0(-483743420);
            boolean zM87153g = c28655q.m87153g(strM92103Y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2663y4(strM92103Y, 24);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
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
            C15127r1 c15127r1 = c15127r1M34081r;
            long j13 = j7;
            C2649w4 c2649w4 = new C2649w4(z4, z13, new C18027i(1), onValueChange, 1);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(AbstractC37056f.m118997u(c2314t, c2649w4), "BACS_MANDATE_CHECKBOX"));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C28655q c28655q4 = c28655q;
            AbstractC14959b1.m43082a(z4, null, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 8, 0.0f, 11), z13, c15127r1, c28655q4, ((i15 >> 3) & 14) | 432 | ((i15 << 3) & 7168), 16);
            AbstractC15011f9.m43114b((String) c2140n.invoke(c28655q4, Integer.valueOf((i15 >> 15) & 14)), null, AbstractC11673r.m31082k(c28655q4).f37674g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C15069l3.m43149c(c28655q4).f56280g, c28655q4, 0, 0, 65530);
            c28655q2 = c28655q4;
            c28655q2.m87173q(true);
            c28655q2.m87150e0(-244078099);
            if (str != null) {
                m121647h(j13, str, c28655q2, 0);
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2637v(modifier, z4, z13, onValueChange, c2140n, c15397o, i13);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m121645f(C4861a c4861a, C2320z c2320z, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C0209i c0209i;
        C0209i c0209i2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1962892300);
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c4861a.f20269j, c28655q, 8);
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3406c = AbstractC1102d.m3406c(0.9f, AbstractC1102d.m3409f(1.0f, c2314t));
        long j7 = AbstractC35029g.f148256e;
        C17916v0 c17916v0 = AbstractC17918w0.f69621a;
        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3406c, j7, c17916v0);
        C2307m c2307m = C2299e.f9114w;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
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
        C0209i c0209i3 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
        C0209i c0209i4 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
        C0209i c0209i5 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
        }
        C0209i c0209i6 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        C22957g c22957g = AbstractC22977m.f90652c;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
        }
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), j7, c17916v0);
        float f13 = AbstractC35029g.f148253b;
        Modifier modifierM3394p = AbstractC1099a.m3394p(f13, modifierM3358c2);
        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
        int iHashCode3 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d2);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
        }
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
        AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(R.drawable.ic_amplitude_full_logo, c28655q, 0);
        Modifier modifierM3411h = AbstractC1102d.m3411h(24, c2314t);
        C2307m c2307m2 = C2299e.f9102E;
        C1100b c1100b = C1100b.f4583a;
        AbstractC29125c.m88522c(abstractC26165aM88500I, "Amplitude Logo", c1100b.mo3400a(modifierM3411h, c2307m2), null, null, 0.0f, null, c28655q, 56, 120);
        int i14 = 1;
        c28655q.m87173q(true);
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3394p(f13, AbstractC30060g.m92116f0(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14)), 0.0f, 0.0f, 0.0f, 80, 7);
        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
        int iHashCode4 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
            c0209i = c0209i5;
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
        } else {
            c0209i = c0209i5;
        }
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
        SimulationContext simulationContext = (SimulationContext) interfaceC28601c1M87261o.getValue();
        Nudge simulatedNudge = simulationContext != null ? simulationContext.getSimulatedNudge() : null;
        boolean zContainsKey = c4861a.f20265f.containsKey(simulatedNudge != null ? Integer.valueOf(simulatedNudge.getVariantId()) : null);
        C0209i c0209i7 = c0209i;
        m121646g("DETAILS", AbstractC37817c.m121341b(1468762082, c28655q, new C27958e(simulatedNudge, interfaceC28601c1M87261o, i14)), c28655q, 54);
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
        m121646g("DEBUG", AbstractC37817c.m121341b(366068811, c28655q, new C27962i(simulatedNudge, zContainsKey, c2320z, i13, c4861a, interfaceC28601c1M87261o, interfaceC4339a)), c28655q, 54);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        Modifier modifierMo3400a = c1100b.mo3400a(c2314t, C2299e.f9105H);
        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
        int iHashCode5 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a3);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m5);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
            c0209i2 = c0209i7;
            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i2);
        } else {
            c0209i2 = c0209i7;
        }
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N5);
        AbstractC23124k3.m67100d(null, 0L, 0.0f, 0, c28655q, 7);
        Modifier modifierM3394p2 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), C17919x.f69629f, c17916v0));
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9107J, c28655q, 6);
        int iHashCode6 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m6);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i2);
        }
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N6);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        int i15 = 1;
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
        boolean zM87153g = c28655q.m87153g(c2320z);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C27959f(c2320z, i15);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM3361f = AbstractC1092a.m3361f(layoutWeightElement, false, null, (InterfaceC4339a) objM87133R, 7);
        float f14 = AbstractC35029g.f148252a;
        Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3361f, 0.0f, f14, 1);
        C2305k c2305k2 = C2299e.f9111N;
        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 48);
        int iHashCode7 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a4);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m7);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i2);
        }
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N7);
        C27430e c27430eM82859b = AbstractC12240d.f40954c;
        if (c27430eM82859b == null) {
            C27428d c27428d = new C27428d("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i16 = AbstractC27433f0.f110561a;
            C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
            C0656u0 c0656u0 = new C0656u0(5);
            ArrayList arrayList = c0656u0.f2286a;
            c0656u0.m1651t(17.65f, 6.35f);
            c0656u0.m1641j(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
            c0656u0.m1642k(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
            c0656u0.m1652u(3.57f, 8.0f, 7.99f, 8.0f);
            c0656u0.m1642k(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
            c0656u0.m1648q(-2.08f);
            c0656u0.m1642k(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
            c0656u0.m1642k(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
            c0656u0.m1652u(2.69f, -6.0f, 6.0f, -6.0f);
            c0656u0.m1642k(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
            c0656u0.m1649r(13.0f, 11.0f);
            c0656u0.m1648q(7.0f);
            arrayList.add(new C27455z(4.0f));
            c0656u0.m1650s(-2.35f, 2.35f);
            c0656u0.m1640i();
            C27428d.m82858a(c27428d, arrayList, c17875c1);
            c27430eM82859b = c27428d.m82859b();
            AbstractC12240d.f40954c = c27430eM82859b;
        }
        float f15 = 20;
        AbstractC23164r1.m67133b(c27430eM82859b, "Restart", AbstractC1102d.m3419p(f15, c2314t), AbstractC35029g.f148272u, r5, 3504, 0);
        float f16 = 4;
        AbstractC22953f.m66715b(r5, AbstractC1102d.m3411h(f16, c2314t));
        long j13 = AbstractC35029g.f148259h;
        C0209i c0209i8 = c0209i2;
        AbstractC23149o4.m67127b("Restart Preview", null, j13, AbstractC35745c.m113246h(12), null, 0L, new C36775k(3), 0L, 0, false, 0, 0, null, c28655q, 3462, 0, 130546);
        c28655q.m87173q(true);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
        boolean zM87153g2 = c28655q.m87153g(c2320z);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C27959f(c2320z, 2);
            c28655q.m87172p0(objM87133R2);
        }
        Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3361f(layoutWeightElement2, false, null, (InterfaceC4339a) objM87133R2, 7), 0.0f, f14, 1);
        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 48);
        int iHashCode8 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a5);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m8);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode8))) {
            AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i8);
        }
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N8);
        AbstractC23164r1.m67133b(C27648a.m83552C(), "Close", AbstractC1102d.m3419p(f15, c2314t), C17919x.f69630g, c28655q, 3504, 0);
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
        AbstractC23149o4.m67127b("Close Preview", null, j13, AbstractC35745c.m113246h(12), null, 0L, new C36775k(3), 0L, 0, false, 0, 0, null, c28655q, 3462, 0, 130546);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C15657r(c4861a, c2320z, interfaceC4339a, i13, 2);
    }

    /* JADX INFO: renamed from: g */
    public static final void m121646g(String str, C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(190783499);
        if ((i13 & 91) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
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
            long j7 = AbstractC35029g.f148254c;
            AbstractC23149o4.m67127b(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, AbstractC35029g.f148253b, 7), AbstractC35029g.f148259h, j7, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, c28655q, 200118, 0, 131024);
            c28655q = c28655q;
            AbstractC18489d0.m53384y(6, c37816b, c28655q, true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3974q(str, c37816b, i13, 5);
    }

    /* JADX INFO: renamed from: h */
    public static final void m121647h(long j7, String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(389677478);
        int i14 = i13 | (c28655q.m87153g(str) ? 4 : 2) | (c28655q.m87151f(j7) ? 32 : 16);
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_material_info, c28655q, 0), null, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11), j7, c28655q, ((i14 << 6) & 7168) | 432, 0);
            AbstractC15011f9.m43114b(str, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, (i14 & 14) | ((i14 << 3) & 896), 0, 131066);
            c28655q = c28655q;
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15348f0(str, j7, i13, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01da  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0205  */
    /* JADX WARN: Code duplicated, block: B:69:0x020a  */
    /* JADX WARN: Code duplicated, block: B:71:0x020d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0210  */
    /* JADX WARN: Code duplicated, block: B:75:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0238  */
    /* JADX WARN: Code duplicated, block: B:83:0x0257  */
    /* JADX WARN: Code duplicated, block: B:87:0x026a  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m121648i(Nudge nudge, NudgeStep step, Composer composer, int i13) {
        String anchor;
        Integer width;
        TooltipFormFactor tooltipFormFactor;
        int i14;
        int i15;
        int iHashCode;
        boolean zM87153g;
        Object objM87133R;
        boolean z4;
        Nudge nudge2;
        NudgeStep nudgeStep;
        C28677v1 c28677v1M87180u;
        TooltipPointer pointer;
        TooltipPointerType type;
        int i16;
        PinPointerType pinPointerType;
        boolean zM87153g2;
        Object objM87133R2;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-743395708);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        C25609p c25609p = (C25609p) c28655q.m87161k(AbstractC25611r.f100476b);
        FormFactor formFactor = step.getFormFactor();
        TooltipFormFactor tooltipFormFactor2 = formFactor instanceof TooltipFormFactor ? (TooltipFormFactor) formFactor : null;
        if (tooltipFormFactor2 == null) {
            C28677v1 c28677v1M87180u2 = c28655q.m87180u();
            if (c28677v1M87180u2 == null) {
                return;
            }
            c28677v1M87180u2.f115982d = new C29268f0(nudge, step, i13, 1);
            return;
        }
        ElementSelector anchorSelector = tooltipFormFactor2.getAnchorSelector();
        if (anchorSelector == null || (anchor = anchorSelector.getSelector()) == null) {
            anchor = tooltipFormFactor2.getAnchor();
        }
        String str = anchor;
        Configuration configuration = context.getResources().getConfiguration();
        int i17 = configuration.screenWidthDp;
        int i18 = configuration.screenHeightDp;
        Marker marker = tooltipFormFactor2.getMarker();
        int iIntValue = 24;
        if (marker instanceof IconMarker) {
            Integer width2 = ((IconMarker) marker).getWidth();
            if (width2 != null) {
                iIntValue = width2.intValue();
            }
        } else if ((marker instanceof ImageMarker) && (width = ((ImageMarker) marker).getWidth()) != null) {
            iIntValue = width.intValue();
        }
        long jM113228a = AbstractC35744b.m113228a(iIntValue, iIntValue);
        Object objM87133R3 = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R3 == c28676v0) {
            objM87133R3 = AbstractC28683x.m87272z(null);
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
        Object objM87133R4 = c28655q.m87133R();
        if (objM87133R4 == c28676v0) {
            objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
        Object objM87133R5 = c28655q.m87133R();
        if (objM87133R5 == c28676v0) {
            C28592a0 c28592a0 = new C28592a0(AbstractC28683x.m87262p(c28655q));
            c28655q.m87172p0(c28592a0);
            objM87133R5 = c28592a0;
        }
        InterfaceC2994c0 interfaceC2994c0 = ((C28592a0) objM87133R5).f115706w;
        C29262c0 c29262c0 = new C29262c0(c25609p, str, tooltipFormFactor2, jM113228a, i17, i18, interfaceC28601c1, null, 0);
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, c29262c0, c23454a0);
        TooltipFormFactor tooltipFormFactor3 = tooltipFormFactor2;
        AbstractC28683x.m87251e(c23454a0, new C29266e0(i17, i18, jM113228a, interfaceC2994c0, tooltipFormFactor3, str, c25609p, interfaceC28601c1), c28655q);
        C39178j c39178j = (C39178j) interfaceC28601c1.getValue();
        if (c39178j == null) {
            C28677v1 c28677v1M87180u3 = c28655q.m87180u();
            if (c28677v1M87180u3 == null) {
                return;
            }
            c28677v1M87180u3.f115982d = new C29268f0(nudge, step, i13, 2);
            return;
        }
        long j7 = c39178j.f168416a;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0, 1);
        C2307m c2307m = C2299e.f9114w;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3392n);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (!c28655q.f115903S) {
            tooltipFormFactor = tooltipFormFactor3;
            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            i14 = (int) (j7 >> 32);
            i15 = (int) (j7 & 4294967295L);
            Modifier modifierM3391m = AbstractC1099a.m3391m(c2314t, i14, i15);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3391m);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Marker marker2 = tooltipFormFactor.getMarker();
            zM87153g = c28655q.m87153g(interfaceC28601c2);
            objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C25598e(7, interfaceC28601c2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32416g.m101154k(marker2, (InterfaceC4339a) objM87133R, c28655q, 0);
            c28655q.m87173q(true);
            c28655q.m87152f0(-572132492);
            if (((Boolean) interfaceC28601c2.getValue()).booleanValue()) {
                pointer = tooltipFormFactor.getPointer();
                if (pointer != null) {
                    type = pointer.getType();
                } else {
                    type = null;
                }
                if (type == null) {
                    i16 = -1;
                } else {
                    i16 = AbstractC29272h0.f118462b[type.ordinal()];
                }
                if (i16 == 1) {
                    pinPointerType = PinPointerType.ARROW;
                } else {
                    pinPointerType = null;
                }
                Rect rect = new Rect(i14, i15, ((int) (jM113228a >> 32)) + i14, ((int) (jM113228a & 4294967295L)) + i15);
                zM87153g2 = c28655q.m87153g(interfaceC28601c2);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C25598e(8, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R2);
                }
                z4 = true;
                nudge2 = nudge;
                nudgeStep = step;
                AbstractC36259c.m115683c(nudge2, nudgeStep, pinPointerType, null, rect, (InterfaceC4339a) objM87133R2, c28655q, 32840, 8);
            } else {
                z4 = true;
                nudge2 = nudge;
                nudgeStep = step;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(z4);
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                return;
            }
            c28677v1M87180u.f115982d = new C29268f0(nudge2, nudgeStep, i13, 0);
        }
        tooltipFormFactor = tooltipFormFactor3;
        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        C0209i c0209i5 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
        i14 = (int) (j7 >> 32);
        i15 = (int) (j7 & 4294967295L);
        Modifier modifierM3391m2 = AbstractC1099a.m3391m(c2314t, i14, i15);
        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
        iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3391m2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        } else {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
        Marker marker3 = tooltipFormFactor.getMarker();
        zM87153g = c28655q.m87153g(interfaceC28601c2);
        objM87133R = c28655q.m87133R();
        if (zM87153g) {
            objM87133R = new C25598e(7, interfaceC28601c2);
            c28655q.m87172p0(objM87133R);
        } else {
            objM87133R = new C25598e(7, interfaceC28601c2);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC32416g.m101154k(marker3, (InterfaceC4339a) objM87133R, c28655q, 0);
        c28655q.m87173q(true);
        c28655q.m87152f0(-572132492);
        if (((Boolean) interfaceC28601c2.getValue()).booleanValue()) {
            pointer = tooltipFormFactor.getPointer();
            if (pointer != null) {
                type = pointer.getType();
            } else {
                type = null;
            }
            if (type == null) {
                i16 = -1;
            } else {
                i16 = AbstractC29272h0.f118462b[type.ordinal()];
            }
            if (i16 == 1) {
                pinPointerType = PinPointerType.ARROW;
            } else {
                pinPointerType = null;
            }
            Rect rect2 = new Rect(i14, i15, ((int) (jM113228a >> 32)) + i14, ((int) (jM113228a & 4294967295L)) + i15);
            zM87153g2 = c28655q.m87153g(interfaceC28601c2);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = new C25598e(8, interfaceC28601c2);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C25598e(8, interfaceC28601c2);
                c28655q.m87172p0(objM87133R2);
            }
            z4 = true;
            nudge2 = nudge;
            nudgeStep = step;
            AbstractC36259c.m115683c(nudge2, nudgeStep, pinPointerType, null, rect2, (InterfaceC4339a) objM87133R2, c28655q, 32840, 8);
        } else {
            z4 = true;
            nudge2 = nudge;
            nudgeStep = step;
        }
        c28655q.m87173q(false);
        c28655q.m87173q(z4);
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C29268f0(nudge2, nudgeStep, i13, 0);
    }

    /* JADX INFO: renamed from: j */
    public static final void m121649j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1606146920);
        if (i13 == 0 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC23124k3.m67100d(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), AbstractC35029g.f148258g, 1, 438, c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27957d(i13);
    }

    /* JADX INFO: renamed from: k */
    public static final void m121650k(C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-320020428);
        if ((i13 & 14) == 0) {
            i14 = (c28655q.m87157i(c37816b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 11) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C33252i c33252iM105489e = AbstractC33253j.m105489e(8);
            long j7 = AbstractC35029g.f148257f;
            long jM67116b = AbstractC23138n.m67116b(j7, c28655q);
            long j13 = C17919x.f69637n;
            long jM51541c = C17919x.m51541c(0.38f, jM67116b);
            C23132m c23132m = (C23132m) c28655q.m87161k(AbstractC23138n.f91494a);
            C23120k c23120k = c23132m.f91435Y;
            if (c23120k == null) {
                EnumC27367f enumC27367f = AbstractC27373l.f109900a;
                c23120k = new C23120k(AbstractC23138n.m67117c(c23132m, enumC27367f), AbstractC23138n.m67115a(c23132m, AbstractC23138n.m67117c(c23132m, enumC27367f)), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27373l.f109904e, AbstractC23138n.m67117c(c23132m, AbstractC27373l.f109902c)), AbstractC23138n.m67117c(c23132m, enumC27367f)), C17919x.m51541c(0.38f, AbstractC23138n.m67115a(c23132m, AbstractC23138n.m67117c(c23132m, enumC27367f))));
                c23132m.f91435Y = c23120k;
            }
            long j14 = j7 != 16 ? j7 : c23120k.f91347a;
            if (jM67116b == 16) {
                jM67116b = c23120k.f91348b;
            }
            long j15 = jM67116b;
            if (j13 == 16) {
                j13 = c23120k.f91349c;
            }
            long j16 = j13;
            if (jM51541c == 16) {
                jM51541c = c23120k.f91350d;
            }
            AbstractC23124k3.m67098b(modifierM3409f, c33252iM105489e, new C23120k(j14, j15, j16, jM51541c), null, AbstractC17269i.m48880a(1, AbstractC35029g.f148258g), AbstractC37817c.m121341b(110974502, c28655q, new C27963j(c37816b, i14)), c28655q, 221190);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27964k(c37816b, i13);
    }

    /* JADX INFO: renamed from: l */
    public static final void m121651l(String str, String str2, Composer composer, int i13) {
        int i14;
        String str3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(892980046);
        if ((i13 & 14) == 0) {
            i14 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        int i15 = i14;
        if ((i15 & 91) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            str3 = str2;
        } else {
            InterfaceC2438s1 interfaceC2438s1 = (InterfaceC2438s1) c28655q.m87161k(AbstractC2453v1.f9566e);
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(AbstractC35029g.f148253b, AbstractC1102d.m3409f(1.0f, c2314t));
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            long j7 = AbstractC35029g.f148255d;
            long j13 = AbstractC35029g.f148259h;
            C23000t1 c23000t1 = C23000t1.f90727a;
            AbstractC23149o4.m67127b(str, c23000t1.mo66772c(c2314t, true, 0.25f), j13, j7, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q, (i15 & 14) | 3456, 0, 131056);
            Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, 0.75f);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC23149o4.m67127b(str2, c23000t1.mo66772c(c2314t, true, 1.0f), AbstractC35029g.f148260i, j7, null, 0L, new C36775k(6), 0L, 0, false, 0, 0, null, c28655q, ((i15 >> 3) & 14) | 3456, 0, 130544);
            str3 = str2;
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(8, c2314t));
            AbstractC23124k3.m67102f(new C13667h(interfaceC2438s1, str3, context, 4), AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27955b.f112750a, c28655q, 196656);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3963i(str, str3, i13, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: m */
    public static final Object m121652m(C25609p c25609p, String str, TooltipFormFactor tooltipFormFactor, long j7, int i13, int i14, InterfaceC28601c1 interfaceC28601c1, AbstractC32269c abstractC32269c) {
        C29270g0 c29270g0;
        TooltipFormFactor tooltipFormFactor2;
        InterfaceC28601c1 interfaceC28601c2;
        long j13;
        int i15;
        int i16;
        Object objM75332b;
        long jM115297a;
        int i17;
        C39178j c39178j;
        int i18;
        if (abstractC32269c instanceof C29270g0) {
            c29270g0 = (C29270g0) abstractC32269c;
            int i19 = c29270g0.f118452G;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                c29270g0.f118452G = i19 - Integer.MIN_VALUE;
            } else {
                c29270g0 = new C29270g0(abstractC32269c);
            }
        } else {
            c29270g0 = new C29270g0(abstractC32269c);
        }
        Object obj = c29270g0.f118451F;
        Object obj2 = EnumC31071a.f128113w;
        int i24 = c29270g0.f118452G;
        if (i24 == 0) {
            AbstractC34132o.m107864I(obj);
            tooltipFormFactor2 = tooltipFormFactor;
            c29270g0.f118453w = tooltipFormFactor2;
            interfaceC28601c2 = interfaceC28601c1;
            c29270g0.f118454x = interfaceC28601c2;
            j13 = j7;
            c29270g0.f118455y = j13;
            i15 = i13;
            c29270g0.f118456z = i15;
            i16 = i14;
            c29270g0.f118450E = i16;
            c29270g0.f118452G = 1;
            objM75332b = c25609p.m75332b(str, c29270g0);
            if (objM75332b == obj2) {
                return obj2;
            }
        } else {
            if (i24 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i25 = c29270g0.f118450E;
            int i26 = c29270g0.f118456z;
            j13 = c29270g0.f118455y;
            InterfaceC28601c1 interfaceC28601c3 = c29270g0.f118454x;
            TooltipFormFactor tooltipFormFactor3 = c29270g0.f118453w;
            AbstractC34132o.m107864I(obj);
            objM75332b = obj;
            tooltipFormFactor2 = tooltipFormFactor3;
            i15 = i26;
            interfaceC28601c2 = interfaceC28601c3;
            i16 = i25;
        }
        Rect rect = (Rect) AbstractC25265s.m74102I0(0, (List) objM75332b);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (rect == null) {
            interfaceC28601c2.setValue(null);
            return c23454a0;
        }
        MarkerPositioning positioning = tooltipFormFactor2.getMarker().getPositioning();
        OffsetValue offset = positioning.getOffset();
        AbstractC22676k.m65750j(offset, "offset");
        try {
            try {
                i17 = Integer.parseInt(offset.getX());
            } catch (NumberFormatException unused) {
                i17 = 0;
            }
            try {
                i18 = Integer.parseInt(offset.getY());
            } catch (NumberFormatException unused2) {
                i18 = 0;
            }
            jM115297a = AbstractC36220b.m115297a(i17, i18);
        } catch (Exception unused3) {
            C4861a.f20259o.m16032K("TooltipView: Error parsing offset");
            jM115297a = AbstractC36220b.m115297a(0, 0);
        }
        int i27 = AbstractC29272h0.f118461a[positioning.getPosition().ordinal()];
        if (i27 == 1) {
            long j14 = jM115297a;
            c39178j = new C39178j(AbstractC36220b.m115297a((rect.left - ((int) (j13 >> 32))) - ((int) (j14 >> 32)), (((rect.height() / 2) + rect.top) + ((int) (j14 & 4294967295L))) - (((int) (j13 & 4294967295L)) / 2)));
        } else if (i27 != 2) {
            c39178j = null;
        } else {
            long j15 = jM115297a;
            c39178j = new C39178j(AbstractC36220b.m115297a(rect.right + ((int) (j15 >> 32)), (((rect.height() / 2) + rect.top) + ((int) (j15 & 4294967295L))) - (((int) (j13 & 4294967295L)) / 2)));
        }
        if (c39178j != null) {
            long j16 = c39178j.f168416a;
            Rect rect2 = new Rect(0, 0, i15, i16);
            interfaceC28601c2.setValue(new C39178j(AbstractC36220b.m115297a(AbstractC12889b.m36284n((int) (j16 >> 32), rect2.left, rect2.right), AbstractC12889b.m36284n((int) (j16 & 4294967295L), rect2.top, rect2.bottom))));
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: n */
    public static final String m121653n(C4485z c4485z) {
        int iOrdinal = c4485z.f18027b.ordinal();
        if (iOrdinal == 0) {
            return "profile";
        }
        if (iOrdinal == 1) {
            return "sso-session";
        }
        if (iOrdinal == 2) {
            return "services";
        }
        if (iOrdinal == 3) {
            return "unknown section";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    public static final C13617i0 m121654o(List list, C37487h c37487h) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC13637x interfaceC13637x = (InterfaceC13637x) next;
            if ((interfaceC13637x instanceof C13617i0) && AbstractC22676k.m65745e(((C13617i0) interfaceC13637x).f48225b, c37487h)) {
                break;
            }
        }
        if (next instanceof C13617i0) {
            return (C13617i0) next;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final String m121655p(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        char[] charArray = str.toCharArray();
        AbstractC22676k.m65749i(charArray, "toCharArray(...)");
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) "");
        int i13 = 0;
        for (char c3 : charArray) {
            i13++;
            if (i13 > 1) {
                sb4.append((CharSequence) " ");
            }
            sb4.append(c3);
        }
        sb4.append((CharSequence) "");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: q */
    public static final Object m121656q(C31341l c31341l, AbstractC32269c abstractC32269c) {
        InterfaceC30061h interfaceC30061h = c31341l.f128961E.get(C3023j1.f12041w);
        InterfaceC3061u interfaceC3061u = interfaceC30061h instanceof InterfaceC3061u ? (InterfaceC3061u) interfaceC30061h : null;
        if (interfaceC3061u != null) {
            interfaceC3061u.complete();
            if (!interfaceC3061u.isCompleted()) {
                InterfaceC30063j interfaceC30063j = c31341l.f128961E;
                String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31341l.class).getQualifiedName();
                if (qualifiedName == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113984B(interfaceC30063j, qualifiedName).mo394s(null, new C24958m(15));
                c31341l.m96421a();
            }
            Object objJoin = interfaceC3061u.join(abstractC32269c);
            if (objJoin == EnumC31071a.f128113w) {
                return objJoin;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m121657r(String str, String message) {
        AbstractC22676k.m65750j(message, "message");
        if (Log.isLoggable(str, 3)) {
            Log.d(str, message);
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m121658s(String str) {
        Object objM107888l;
        if (str == null) {
            return null;
        }
        Parcelable.Creator<C30900e> creator = C30900e.CREATOR;
        try {
            byte[] bArrDecode = Base64.decode(str, 8);
            AbstractC22676k.m65749i(bArrDecode, "decode(...)");
            objM107888l = new String(bArrDecode, AbstractC39397a.f169546a);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        return (String) (objM107888l instanceof C23467m ? null : objM107888l);
    }

    /* JADX INFO: renamed from: t */
    public static final double m121659t(int i13, int i14) {
        return ((((long) i13) << 27) + ((long) i14)) / 9.007199254740992E15d;
    }

    /* JADX INFO: renamed from: u */
    public static final EnumC25496p m121660u(IOException iOException) {
        Object next;
        IOException iOException2;
        Object next2;
        IOException iOException3;
        Object next3;
        String message;
        Object next4;
        String message2;
        boolean z4 = iOException instanceof SocketTimeoutException;
        if (z4) {
            iOException2 = iOException;
        } else if (iOException.getCause() instanceof SocketTimeoutException) {
            Throwable cause = iOException.getCause();
            if (cause == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.SocketTimeoutException");
            }
            iOException2 = (SocketTimeoutException) cause;
        } else {
            Iterator it = AbstractC29125c.m88493B(iOException).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Throwable) next) instanceof SocketTimeoutException));
            if (!(next instanceof SocketTimeoutException)) {
                next = null;
            }
            iOException2 = (SocketTimeoutException) next;
        }
        SocketTimeoutException socketTimeoutException = (SocketTimeoutException) iOException2;
        if (socketTimeoutException != null && (message2 = socketTimeoutException.getMessage()) != null && AbstractC39414r.m125876U(message2, "connect", true)) {
            return EnumC25496p.f99835w;
        }
        String message3 = iOException.getMessage();
        if (message3 != null && AbstractC39414r.m125876U(message3, "unexpected end of stream", false)) {
            Throwable cause2 = iOException.getCause();
            Exception exc = cause2 instanceof Exception ? (Exception) cause2 : null;
            if (exc != null) {
                if (!(exc instanceof EOFException)) {
                    if (exc.getCause() instanceof EOFException) {
                        Throwable cause3 = exc.getCause();
                        if (cause3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.io.EOFException");
                        }
                        exc = (EOFException) cause3;
                    } else {
                        Iterator it3 = AbstractC29125c.m88493B(exc).iterator();
                        do {
                            if (!it3.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it3.next();
                        } while (!(((Throwable) next4) instanceof EOFException));
                        if (!(next4 instanceof EOFException)) {
                            next4 = null;
                        }
                        exc = (EOFException) next4;
                    }
                }
                EOFException eOFException = (EOFException) exc;
                if (eOFException != null && (message = eOFException.getMessage()) != null && AbstractC39414r.m125876U(message, "\\n not found: limit=0", false)) {
                    return EnumC25496p.f99837y;
                }
            }
        }
        if (z4) {
            iOException3 = iOException;
        } else if (iOException.getCause() instanceof SocketTimeoutException) {
            Throwable cause4 = iOException.getCause();
            if (cause4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.SocketTimeoutException");
            }
            iOException3 = (SocketTimeoutException) cause4;
        } else {
            Iterator it4 = AbstractC29125c.m88493B(iOException).iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!(((Throwable) next2) instanceof SocketTimeoutException));
            if (!(next2 instanceof SocketTimeoutException)) {
                next2 = null;
            }
            iOException3 = (SocketTimeoutException) next2;
        }
        if (iOException3 != null) {
            return EnumC25496p.f99838z;
        }
        if (!(iOException instanceof SSLHandshakeException)) {
            if (iOException.getCause() instanceof SSLHandshakeException) {
                Throwable cause5 = iOException.getCause();
                if (cause5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLHandshakeException");
                }
                iOException = (SSLHandshakeException) cause5;
            } else {
                Iterator it5 = AbstractC29125c.m88493B(iOException).iterator();
                do {
                    if (!it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                } while (!(((Throwable) next3) instanceof SSLHandshakeException));
                iOException = (SSLHandshakeException) (next3 instanceof SSLHandshakeException ? next3 : null);
            }
        }
        return iOException != null ? EnumC25496p.f99836x : EnumC25496p.f99833E;
    }

    /* JADX INFO: renamed from: v */
    public static final void m121661v(Exception exc, String str) {
        if (Log.isLoggable("ServiceConnection", 6)) {
            Log.e("ServiceConnection", str, exc);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m121662w(String message) {
        AbstractC22676k.m65750j(message, "message");
        if (Log.isLoggable("ServiceConnection", 6)) {
            Log.e("ServiceConnection", message);
        }
    }

    /* JADX INFO: renamed from: x */
    public static int m121663x(int i13, CharSequence charSequence) {
        boolean z4 = false;
        int i14 = 0;
        int i15 = 0;
        i13 = -1;
        int i16 = 0;
        while (i13 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != ',') {
                if (cCharAt == '[') {
                    i14++;
                } else {
                    if (cCharAt != ']') {
                        if (cCharAt != '`') {
                            if (cCharAt == '{') {
                                i15++;
                            } else if (cCharAt == '}') {
                                i15--;
                                if (i15 >= 0) {
                                }
                            } else if (cCharAt != 8239 && cCharAt != 8287 && cCharAt != 12288) {
                                if (cCharAt == '.') {
                                    continue;
                                } else if (cCharAt != '/') {
                                    if (cCharAt != '>') {
                                        if (cCharAt == '?') {
                                            continue;
                                        } else if (cCharAt != 8232 && cCharAt != 8233) {
                                            switch (cCharAt) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case '\b':
                                                case '\t':
                                                case '\n':
                                                case 11:
                                                case '\f':
                                                case '\r':
                                                case 14:
                                                case 15:
                                                case 16:
                                                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                                case 20:
                                                case 21:
                                                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case ' ':
                                                case '\"':
                                                    break;
                                                case '!':
                                                    continue;
                                                default:
                                                    switch (cCharAt) {
                                                        case '\'':
                                                            boolean z13 = !z4;
                                                            if (z4) {
                                                                i13 = i13;
                                                            }
                                                            z4 = z13;
                                                            continue;
                                                        case '(':
                                                            i16++;
                                                            continue;
                                                        case ')':
                                                            i16--;
                                                            if (i16 < 0) {
                                                            }
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case ':':
                                                                case ';':
                                                                    continue;
                                                                case '<':
                                                                    break;
                                                                default:
                                                                    switch (cCharAt) {
                                                                        case 127:
                                                                        case 128:
                                                                        case 129:
                                                                        case 130:
                                                                        case 131:
                                                                        case 132:
                                                                        case 133:
                                                                        case 134:
                                                                        case 135:
                                                                        case 136:
                                                                        case 137:
                                                                        case 138:
                                                                        case 139:
                                                                        case 140:
                                                                        case 141:
                                                                        case 142:
                                                                        case 143:
                                                                        case 144:
                                                                        case 145:
                                                                        case 146:
                                                                        case 147:
                                                                        case 148:
                                                                        case 149:
                                                                        case 150:
                                                                        case 151:
                                                                        case 152:
                                                                        case 153:
                                                                        case 154:
                                                                        case 155:
                                                                        case 156:
                                                                        case 157:
                                                                        case 158:
                                                                        case 159:
                                                                        case 160:
                                                                            break;
                                                                        default:
                                                                            switch (cCharAt) {
                                                                                case DfuBaseService.ERROR_REMOTE_MASK /* 8192 */:
                                                                                case 8193:
                                                                                case 8194:
                                                                                case 8195:
                                                                                case 8196:
                                                                                case 8197:
                                                                                case 8198:
                                                                                case 8199:
                                                                                case 8200:
                                                                                case 8201:
                                                                                case 8202:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                } else if (i13 == i13 - 1) {
                                }
                            }
                        }
                        return i13;
                    }
                    i14--;
                    if (i14 < 0) {
                        return i13;
                    }
                }
            }
            i13++;
        }
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:130:0x0259  */
    /* JADX WARN: Code duplicated, block: B:235:0x0434  */
    /* JADX WARN: Code duplicated, block: B:236:0x0436  */
    /* JADX WARN: Code duplicated, block: B:257:0x047a  */
    /* JADX WARN: Code duplicated, block: B:259:0x047e  */
    /* JADX WARN: Code duplicated, block: B:261:0x048c  */
    /* JADX WARN: Code duplicated, block: B:264:0x0496  */
    /* JADX WARN: Code duplicated, block: B:267:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:269:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:272:0x04b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:283:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:285:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:287:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:290:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:293:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:298:0x0503  */
    /* JADX WARN: Code duplicated, block: B:300:0x0507  */
    /* JADX WARN: Code duplicated, block: B:302:0x050b  */
    /* JADX WARN: Code duplicated, block: B:309:0x051c  */
    /* JADX WARN: Code duplicated, block: B:343:0x04b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0524 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x04ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [int] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX INFO: renamed from: y */
    public static C30900e m121664y(JSONObject jSONObject) throws JSONException, ChallengeResponseParseException {
        boolean z4;
        ArrayList arrayList;
        ?? r10;
        EnumC30905j enumC30905jM79411o;
        String str;
        boolean z13;
        String strM121658s;
        String str2;
        ArrayList arrayList2;
        String str3;
        List list;
        String str4;
        Set<String> setM74059b1;
        Set setM74059b2;
        Iterator it;
        String str5;
        boolean z14;
        Object obj;
        boolean z15;
        boolean z16;
        Object objM107888l;
        JSONArray jSONArray;
        if (!"CRes".equals(jSONObject.optString("messageType"))) {
            EnumC30904i enumC30904i = EnumC30904i.UnrecognizedCriticalMessageExtensions;
            throw new ChallengeResponseParseException(101, "Message is not CRes", "Invalid Message Type");
        }
        boolean z17 = true;
        boolean zM121624G = m121624G(jSONObject, "challengeCompletionInd", true);
        C29926q0 c29926q0 = new C29926q0(m121623F("sdkTransID", jSONObject));
        String string = m121623F("threeDSServerTransID", jSONObject).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        String string2 = m121623F("acsTransID", jSONObject).toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        String strOptString = jSONObject.optString("messageVersion");
        AbstractC22676k.m65747g(strOptString);
        String str6 = !AbstractC39414r.m125890i0(strOptString) ? strOptString : null;
        if (str6 == null) {
            int i13 = ChallengeResponseParseException.f22419z;
            throw C27648a.m83601x("messageVersion");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messageExtension");
        int i14 = 64;
        if (jSONArrayOptJSONArray == null) {
            z4 = true;
            arrayList = null;
        } else {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            ArrayList<JSONObject> arrayList3 = new ArrayList();
            Iterator it3 = c18284jM36278i0.iterator();
            while (((C18283i) it3).f71138y) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((AbstractC25243e0) it3).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    arrayList3.add(jSONObjectOptJSONObject);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
            for (JSONObject jSONObject2 : arrayList3) {
                String strOptString2 = jSONObject2.optString("name");
                if (strOptString2.length() > i14) {
                    int i15 = ChallengeResponseParseException.f22419z;
                    throw C27648a.m83600w("messageExtension.name");
                }
                String strOptString3 = jSONObject2.optString("id");
                if (strOptString3.length() > i14) {
                    int i16 = ChallengeResponseParseException.f22419z;
                    throw C27648a.m83600w("messageExtension.id");
                }
                HashMap map = new HashMap();
                boolean z18 = z17;
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString4 = jSONObjectOptJSONObject2.optString(next);
                        if (strOptString4.length() > 8059) {
                            int i17 = ChallengeResponseParseException.f22419z;
                            throw C27648a.m83600w("messageExtension.data.value");
                        }
                        map.put(next, strOptString4);
                    }
                }
                arrayList4.add(new C30903h(jSONObject2.optBoolean("criticalityIndicator"), strOptString2, strOptString3, map));
                z17 = z18;
                i14 = 64;
            }
            z4 = z17;
            if (arrayList4.size() > 10) {
                int i18 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83600w("messageExtensions");
            }
            arrayList = arrayList4;
        }
        if (arrayList != null) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((C30903h) obj2).f127448y) {
                    arrayList5.add(obj2);
                }
            }
            if (!arrayList5.isEmpty()) {
                throw new ChallengeResponseParseException(EnumC30904i.UnrecognizedCriticalMessageExtensions, AbstractC25265s.m74110N0(arrayList5, ",", null, null, null, 62));
            }
        }
        boolean zM121624G2 = m121624G(jSONObject, "challengeInfoTextIndicator", false);
        String string3 = jSONObject.has("resendInformationLabel") ? jSONObject.getString("resendInformationLabel") : null;
        if (string3 != null && string3.length() == 0) {
            int i19 = ChallengeResponseParseException.f22419z;
            throw C27648a.m83600w("resendInformationLabel");
        }
        JSONObject jSONObject3 = jSONObject.has("challengeSelectInfo") ? jSONObject : null;
        if (jSONObject3 != null) {
            Parcelable.Creator<C30900e> creator = C30900e.CREATOR;
            try {
                objM107888l = jSONObject3.getJSONArray("challengeSelectInfo");
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            if (C23468n.m68037a(objM107888l) != null) {
                int i24 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83600w("challengeSelectInfo");
            }
            jSONArray = (JSONArray) objM107888l;
        } else {
            r10 = 0;
        }
        if (zM121624G) {
            enumC30905jM79411o = null;
        } else {
            String strOptString5 = jSONObject.optString("acsUiType");
            if (strOptString5 == null || AbstractC39414r.m125890i0(strOptString5)) {
                r10 = jSONArray;
                r10 = jSONArray;
                int i25 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83601x("acsUiType");
            }
            EnumC30905j.f127461y.getClass();
            enumC30905jM79411o = C26702o.m79411o(strOptString5);
            if (enumC30905jM79411o == null) {
                r10 = jSONArray;
                int i26 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83600w("acsUiType");
            }
        }
        if (enumC30905jM79411o != null) {
            Parcelable.Creator<C30900e> creator2 = C30900e.CREATOR;
            String string4 = jSONObject.has("submitAuthenticationLabel") ? jSONObject.getString("submitAuthenticationLabel") : null;
            if (string4 != null) {
                r10 = jSONArray;
                if (AbstractC39414r.m125890i0(string4)) {
                    r10 = jSONArray;
                    r10 = jSONArray;
                    r10 = jSONArray;
                    if (enumC30905jM79411o.f127464x) {
                        int i27 = ChallengeResponseParseException.f22419z;
                        throw C27648a.m83601x("submitAuthenticationLabel");
                    }
                }
            } else {
                r10 = jSONArray;
                r10 = jSONArray;
                r10 = jSONArray;
                if (enumC30905jM79411o.f127464x) {
                    int i28 = ChallengeResponseParseException.f22419z;
                    throw C27648a.m83601x("submitAuthenticationLabel");
                }
            }
            r10 = jSONArray;
            str = string4;
        } else {
            str = null;
        }
        if (enumC30905jM79411o != null) {
            r10 = jSONArray;
            Parcelable.Creator<C30900e> creator3 = C30900e.CREATOR;
            String string5 = jSONObject.has("acsHTML") ? jSONObject.getString("acsHTML") : null;
            if ((string5 == null || AbstractC39414r.m125890i0(string5)) && enumC30905jM79411o == EnumC30905j.Html) {
                int i29 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83601x("acsHTML");
            }
            if (string5 != null) {
                z13 = false;
                if (!AbstractC39414r.m125876U(string5, "\n", false) && !AbstractC39414r.m125876U(string5, " ", false) && !AbstractC39414r.m125876U(string5, "+", false) && !AbstractC39414r.m125876U(string5, "/", false)) {
                    z15 = false;
                }
                if (string5 == null && AbstractC39421y.m125920E(string5, "=", z13)) {
                    z16 = z4;
                } else {
                    z16 = z13;
                }
                if (enumC30905jM79411o != EnumC30905j.Html && (z15 || z16)) {
                    int i34 = ChallengeResponseParseException.f22419z;
                    throw C27648a.m83600w("acsHTML");
                }
                strM121658s = m121658s(string5);
            } else {
                z13 = false;
            }
            z15 = z4;
            if (string5 == null) {
                z16 = z13;
            } else {
                z16 = z13;
            }
            if (enumC30905jM79411o != EnumC30905j.Html) {
            }
            strM121658s = m121658s(string5);
        } else {
            r10 = jSONArray;
            z13 = false;
            strM121658s = null;
        }
        if (enumC30905jM79411o != null) {
            Parcelable.Creator<C30900e> creator4 = C30900e.CREATOR;
            String strOptString6 = jSONObject.optString("oobContinueLabel");
            if ((strOptString6 == null || AbstractC39414r.m125890i0(strOptString6)) && enumC30905jM79411o == EnumC30905j.OutOfBand) {
                int i35 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83601x("oobContinueLabel");
            }
            str2 = strOptString6;
        } else {
            str2 = null;
        }
        if (r10 == 0) {
            arrayList2 = null;
        } else {
            ArrayList arrayList6 = new ArrayList();
            int length = r10.length();
            for (?? r14 = z13; r14 < length; r14++) {
                JSONObject jSONObjectOptJSONObject3 = r10.optJSONObject(r14);
                if (jSONObjectOptJSONObject3 != null) {
                    String next2 = jSONObjectOptJSONObject3.keys().next();
                    String strOptString7 = jSONObjectOptJSONObject3.optString(next2);
                    AbstractC22676k.m65747g(next2);
                    AbstractC22676k.m65747g(strOptString7);
                    arrayList6.add(new C30898c(next2, strOptString7));
                }
            }
            arrayList2 = arrayList6;
        }
        String strM121658s2 = zM121624G ? null : m121658s(jSONObject.optString("acsHTMLRefresh"));
        String strOptString8 = zM121624G ? null : jSONObject.optString("challengeInfoHeader");
        String strOptString9 = zM121624G ? null : jSONObject.optString("challengeInfoLabel");
        String strOptString10 = zM121624G ? null : jSONObject.optString("challengeInfoText");
        String strOptString11 = zM121624G ? null : jSONObject.optString("challengeAddInfo");
        String strOptString12 = zM121624G ? null : jSONObject.optString("whitelistingInfoText");
        String strOptString13 = zM121624G ? null : jSONObject.optString("whyInfoLabel");
        String strOptString14 = zM121624G ? null : jSONObject.optString("whyInfoText");
        String strOptString15 = zM121624G ? null : jSONObject.optString("expandInfoLabel");
        String strOptString16 = zM121624G ? null : jSONObject.optString("expandInfoText");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("issuerImage");
        String str7 = strM121658s;
        C30899d c30899d = jSONObjectOptJSONObject4 != null ? new C30899d(jSONObjectOptJSONObject4.optString("medium"), jSONObjectOptJSONObject4.optString("high"), jSONObjectOptJSONObject4.optString("extraHigh")) : null;
        String strOptString17 = zM121624G ? null : jSONObject.optString("oobAppURL");
        String strOptString18 = zM121624G ? null : jSONObject.optString("oobAppLabel");
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("psImage");
        String str8 = strOptString17;
        C30899d c30899d2 = jSONObjectOptJSONObject5 != null ? new C30899d(jSONObjectOptJSONObject5.optString("medium"), jSONObjectOptJSONObject5.optString("high"), jSONObjectOptJSONObject5.optString("extraHigh")) : null;
        if (zM121624G) {
            String strOptString19 = jSONObject.optString("transStatus");
            if (strOptString19 == null || AbstractC39414r.m125890i0(strOptString19)) {
                int i36 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83601x("transStatus");
            }
            EnumC29940x0.f122266x.getClass();
            Iterator it4 = EnumC29940x0.f122268z.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                Object next3 = it4.next();
                if (((EnumC29940x0) next3).f122269w.equals(strOptString19)) {
                    obj = next3;
                    break;
                }
            }
            EnumC29940x0 enumC29940x0 = (EnumC29940x0) obj;
            if (enumC29940x0 == null) {
                int i37 = ChallengeResponseParseException.f22419z;
                throw C27648a.m83600w("transStatus");
            }
            str3 = enumC29940x0.f122269w;
        } else {
            str3 = "";
        }
        ArrayList arrayList7 = arrayList;
        EnumC30905j enumC30905j = enumC30905jM79411o;
        boolean z19 = false;
        C30900e c30900e = new C30900e(string, string2, str7, strM121658s2, enumC30905j, zM121624G, strOptString8, strOptString9, strOptString10, strOptString11, zM121624G2, arrayList2, strOptString15, strOptString16, c30899d, arrayList7, str6, str8, strOptString18, str2, c30899d2, string3, c29926q0, str, strOptString12, strOptString13, strOptString14, str3);
        String str9 = strOptString8;
        String str10 = str2;
        if (enumC30905j == null) {
            z19 = z4;
            break;
        }
        if (enumC30905j == EnumC30905j.Html) {
            if (str7 == null || AbstractC39414r.m125890i0(str7)) {
                z14 = z4;
            } else {
                z14 = false;
            }
            z19 = !z14;
        } else if (enumC30905j == EnumC30905j.Text || enumC30905j == EnumC30905j.SingleSelect || enumC30905j == EnumC30905j.MultiSelect) {
            Set setM74059b3 = AbstractC25260n.m74059b1(new String[]{str9, strOptString9, strOptString10});
            if (!(setM74059b3 instanceof Collection) || !setM74059b3.isEmpty()) {
                Iterator it5 = setM74059b3.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        String str11 = (String) it5.next();
                        if (str11 == null || AbstractC39414r.m125890i0(str11)) {
                        }
                    } else if (enumC30905j == EnumC30905j.OutOfBand) {
                        setM74059b2 = AbstractC25260n.m74059b1(new String[]{str9, strOptString10});
                        if ((setM74059b2 instanceof Collection) || !setM74059b2.isEmpty()) {
                            it = setM74059b2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    str5 = (String) it.next();
                                    if (str5 != null || AbstractC39414r.m125890i0(str5)) {
                                    }
                                } else if (str10 != null || str10.length() == 0 || ((str9 != null && str9.length() != 0) || (strOptString10 != null && strOptString10.length() != 0))) {
                                    if (enumC30905j == EnumC30905j.OutOfBand) {
                                        setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                                        if ((setM74059b1 instanceof Collection) || !setM74059b1.isEmpty()) {
                                            for (String str12 : setM74059b1) {
                                                if (str12 == null && !AbstractC39414r.m125890i0(str12)) {
                                                    z19 = z4;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if ((enumC30905j == EnumC30905j.SingleSelect && enumC30905j != EnumC30905j.MultiSelect) || ((list = c30900e.f127410L) != null && !list.isEmpty())) {
                                        str4 = c30900e.f127422X;
                                        if (str4 != null || AbstractC39414r.m125890i0(str4)) {
                                            z14 = z4;
                                        } else {
                                            z14 = false;
                                        }
                                        z19 = !z14;
                                    }
                                }
                            }
                        } else if (str10 != null) {
                            if (enumC30905j == EnumC30905j.OutOfBand) {
                                setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                                if (setM74059b1 instanceof Collection) {
                                    while (r0.hasNext()) {
                                        if (str12 == null) {
                                        }
                                    }
                                } else {
                                    while (r0.hasNext()) {
                                        if (str12 == null) {
                                        }
                                    }
                                }
                            } else if (enumC30905j == EnumC30905j.SingleSelect) {
                                str4 = c30900e.f127422X;
                                if (str4 != null) {
                                }
                                z14 = z4;
                                z19 = !z14;
                            } else {
                                str4 = c30900e.f127422X;
                                if (str4 != null) {
                                }
                                z14 = z4;
                                z19 = !z14;
                            }
                        } else if (enumC30905j == EnumC30905j.OutOfBand) {
                            setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                            if (setM74059b1 instanceof Collection) {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            } else {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            }
                        } else if (enumC30905j == EnumC30905j.SingleSelect) {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        } else {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        }
                    } else if (str10 != null) {
                        if (enumC30905j == EnumC30905j.OutOfBand) {
                            setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                            if (setM74059b1 instanceof Collection) {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            } else {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            }
                        } else if (enumC30905j == EnumC30905j.SingleSelect) {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        } else {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        }
                    } else if (enumC30905j == EnumC30905j.OutOfBand) {
                        setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                        if (setM74059b1 instanceof Collection) {
                            while (r0.hasNext()) {
                                if (str12 == null) {
                                }
                            }
                        } else {
                            while (r0.hasNext()) {
                                if (str12 == null) {
                                }
                            }
                        }
                    } else if (enumC30905j == EnumC30905j.SingleSelect) {
                        str4 = c30900e.f127422X;
                        if (str4 != null) {
                        }
                        z14 = z4;
                        z19 = !z14;
                    } else {
                        str4 = c30900e.f127422X;
                        if (str4 != null) {
                        }
                        z14 = z4;
                        z19 = !z14;
                    }
                }
            } else if (enumC30905j == EnumC30905j.OutOfBand) {
                setM74059b2 = AbstractC25260n.m74059b1(new String[]{str9, strOptString10});
                if (setM74059b2 instanceof Collection) {
                    it = setM74059b2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str5 = (String) it.next();
                            if (str5 != null) {
                            }
                        } else if (str10 != null) {
                            if (enumC30905j == EnumC30905j.OutOfBand) {
                                setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                                if (setM74059b1 instanceof Collection) {
                                    while (r0.hasNext()) {
                                        if (str12 == null) {
                                        }
                                    }
                                } else {
                                    while (r0.hasNext()) {
                                        if (str12 == null) {
                                        }
                                    }
                                }
                            } else if (enumC30905j == EnumC30905j.SingleSelect) {
                                str4 = c30900e.f127422X;
                                if (str4 != null) {
                                }
                                z14 = z4;
                                z19 = !z14;
                            } else {
                                str4 = c30900e.f127422X;
                                if (str4 != null) {
                                }
                                z14 = z4;
                                z19 = !z14;
                            }
                        } else if (enumC30905j == EnumC30905j.OutOfBand) {
                            setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                            if (setM74059b1 instanceof Collection) {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            } else {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            }
                        } else if (enumC30905j == EnumC30905j.SingleSelect) {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        } else {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        }
                    }
                } else {
                    it = setM74059b2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str5 = (String) it.next();
                            if (str5 != null) {
                            }
                        } else if (str10 != null) {
                            if (enumC30905j == EnumC30905j.OutOfBand) {
                                setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                                if (setM74059b1 instanceof Collection) {
                                    while (r0.hasNext()) {
                                        if (str12 == null) {
                                        }
                                    }
                                } else {
                                    while (r0.hasNext()) {
                                        if (str12 == null) {
                                        }
                                    }
                                }
                            } else if (enumC30905j == EnumC30905j.SingleSelect) {
                                str4 = c30900e.f127422X;
                                if (str4 != null) {
                                }
                                z14 = z4;
                                z19 = !z14;
                            } else {
                                str4 = c30900e.f127422X;
                                if (str4 != null) {
                                }
                                z14 = z4;
                                z19 = !z14;
                            }
                        } else if (enumC30905j == EnumC30905j.OutOfBand) {
                            setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                            if (setM74059b1 instanceof Collection) {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            } else {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            }
                        } else if (enumC30905j == EnumC30905j.SingleSelect) {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        } else {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        }
                    }
                }
            } else if (str10 != null) {
                if (enumC30905j == EnumC30905j.OutOfBand) {
                    setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                    if (setM74059b1 instanceof Collection) {
                        while (r0.hasNext()) {
                            if (str12 == null) {
                            }
                        }
                    } else {
                        while (r0.hasNext()) {
                            if (str12 == null) {
                            }
                        }
                    }
                } else if (enumC30905j == EnumC30905j.SingleSelect) {
                    str4 = c30900e.f127422X;
                    if (str4 != null) {
                    }
                    z14 = z4;
                    z19 = !z14;
                } else {
                    str4 = c30900e.f127422X;
                    if (str4 != null) {
                    }
                    z14 = z4;
                    z19 = !z14;
                }
            } else if (enumC30905j == EnumC30905j.OutOfBand) {
                setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                if (setM74059b1 instanceof Collection) {
                    while (r0.hasNext()) {
                        if (str12 == null) {
                        }
                    }
                } else {
                    while (r0.hasNext()) {
                        if (str12 == null) {
                        }
                    }
                }
            } else if (enumC30905j == EnumC30905j.SingleSelect) {
                str4 = c30900e.f127422X;
                if (str4 != null) {
                }
                z14 = z4;
                z19 = !z14;
            } else {
                str4 = c30900e.f127422X;
                if (str4 != null) {
                }
                z14 = z4;
                z19 = !z14;
            }
        } else if (enumC30905j == EnumC30905j.OutOfBand) {
            setM74059b2 = AbstractC25260n.m74059b1(new String[]{str9, strOptString10});
            if (setM74059b2 instanceof Collection) {
                it = setM74059b2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        str5 = (String) it.next();
                        if (str5 != null) {
                        }
                    } else if (str10 != null) {
                        if (enumC30905j == EnumC30905j.OutOfBand) {
                            setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                            if (setM74059b1 instanceof Collection) {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            } else {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            }
                        } else if (enumC30905j == EnumC30905j.SingleSelect) {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        } else {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        }
                    } else if (enumC30905j == EnumC30905j.OutOfBand) {
                        setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                        if (setM74059b1 instanceof Collection) {
                            while (r0.hasNext()) {
                                if (str12 == null) {
                                }
                            }
                        } else {
                            while (r0.hasNext()) {
                                if (str12 == null) {
                                }
                            }
                        }
                    } else if (enumC30905j == EnumC30905j.SingleSelect) {
                        str4 = c30900e.f127422X;
                        if (str4 != null) {
                        }
                        z14 = z4;
                        z19 = !z14;
                    } else {
                        str4 = c30900e.f127422X;
                        if (str4 != null) {
                        }
                        z14 = z4;
                        z19 = !z14;
                    }
                }
            } else {
                it = setM74059b2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        str5 = (String) it.next();
                        if (str5 != null) {
                        }
                    } else if (str10 != null) {
                        if (enumC30905j == EnumC30905j.OutOfBand) {
                            setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                            if (setM74059b1 instanceof Collection) {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            } else {
                                while (r0.hasNext()) {
                                    if (str12 == null) {
                                    }
                                }
                            }
                        } else if (enumC30905j == EnumC30905j.SingleSelect) {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        } else {
                            str4 = c30900e.f127422X;
                            if (str4 != null) {
                            }
                            z14 = z4;
                            z19 = !z14;
                        }
                    } else if (enumC30905j == EnumC30905j.OutOfBand) {
                        setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                        if (setM74059b1 instanceof Collection) {
                            while (r0.hasNext()) {
                                if (str12 == null) {
                                }
                            }
                        } else {
                            while (r0.hasNext()) {
                                if (str12 == null) {
                                }
                            }
                        }
                    } else if (enumC30905j == EnumC30905j.SingleSelect) {
                        str4 = c30900e.f127422X;
                        if (str4 != null) {
                        }
                        z14 = z4;
                        z19 = !z14;
                    } else {
                        str4 = c30900e.f127422X;
                        if (str4 != null) {
                        }
                        z14 = z4;
                        z19 = !z14;
                    }
                }
            }
        } else if (str10 != null) {
            if (enumC30905j == EnumC30905j.OutOfBand) {
                setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
                if (setM74059b1 instanceof Collection) {
                    while (r0.hasNext()) {
                        if (str12 == null) {
                        }
                    }
                } else {
                    while (r0.hasNext()) {
                        if (str12 == null) {
                        }
                    }
                }
            } else if (enumC30905j == EnumC30905j.SingleSelect) {
                str4 = c30900e.f127422X;
                if (str4 != null) {
                }
                z14 = z4;
                z19 = !z14;
            } else {
                str4 = c30900e.f127422X;
                if (str4 != null) {
                }
                z14 = z4;
                z19 = !z14;
            }
        } else if (enumC30905j == EnumC30905j.OutOfBand) {
            setM74059b1 = AbstractC25260n.m74059b1(new String[]{c30900e.f127417S, c30900e.f127416R, str10});
            if (setM74059b1 instanceof Collection) {
                while (r0.hasNext()) {
                    if (str12 == null) {
                    }
                }
            } else {
                while (r0.hasNext()) {
                    if (str12 == null) {
                    }
                }
            }
        } else if (enumC30905j == EnumC30905j.SingleSelect) {
            str4 = c30900e.f127422X;
            if (str4 != null) {
            }
            z14 = z4;
            z19 = !z14;
        } else {
            str4 = c30900e.f127422X;
            if (str4 != null) {
            }
            z14 = z4;
            z19 = !z14;
        }
        if (!z19) {
            int i38 = ChallengeResponseParseException.f22419z;
            throw C27648a.m83601x("UI fields missing");
        }
        String str13 = c30900e.f127423Y;
        if (str13 == null || str13.length() <= 64) {
            return c30900e;
        }
        int i39 = ChallengeResponseParseException.f22419z;
        throw C27648a.m83600w("Whitelisting info text exceeds length.");
    }

    /* JADX INFO: renamed from: z */
    public static void m121665z(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i13 = configuration.colorMode & 3;
        int i14 = configuration2.colorMode & 3;
        if (i13 != i14) {
            configuration3.colorMode |= i14;
        }
        int i15 = configuration.colorMode & 12;
        int i16 = configuration2.colorMode & 12;
        if (i15 != i16) {
            configuration3.colorMode |= i16;
        }
    }

    /* JADX INFO: renamed from: N */
    public abstract Object mo2189N();

    /* JADX INFO: renamed from: T */
    public abstract void mo2190T(String str);

    @Override // p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: a */
    public void mo30518a() {
    }

    @Override // p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: b */
    public void mo30519b() {
    }
}
