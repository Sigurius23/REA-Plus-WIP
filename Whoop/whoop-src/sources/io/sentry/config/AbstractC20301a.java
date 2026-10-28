package io.sentry.config;

import a40.AbstractC0357b;
import a40.AbstractC0359d;
import a40.AbstractC0361f;
import am0.C0998b;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.DragEvent;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1441b2;
import androidx.health.platform.client.proto.C1446c2;
import androidx.health.platform.client.proto.C1533u;
import androidx.health.platform.client.proto.C1543w;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import androidx.room.AbstractC1772c1;
import b30.C2533h2;
import b30.C2539i0;
import b30.C2541i2;
import b30.C2559k4;
import b30.C2567l4;
import b30.C2575m4;
import b30.C2647w2;
import bg.C3211f;
import bg.C3213h;
import bg.C3216k;
import c30.C3912c;
import c30.C3913d;
import c30.C3914e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import cd3.AbstractC4454f;
import com.whoop.profile.view.edit.C9790n;
import d30.C11568w;
import d40.AbstractC11673r;
import d40.C11666k;
import d40.C11671p;
import db3.EnumC11891c;
import e10.C12554k0;
import ec3.C13081r1;
import f01.C13845b;
import fa3.AbstractC14309e;
import fd3.C14408a;
import fk.InterfaceC14544a;
import g40.AbstractC15376j4;
import g40.C15430u2;
import h20.AbstractC16653f1;
import h20.AbstractC16737t1;
import h20.C16636c2;
import h20.C16659g1;
import h20.C16666h2;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16761x1;
import ha3.InterfaceC17060c;
import hg3.AbstractC17269i;
import i20.C17928b;
import ih0.AbstractC18489d0;
import ih0.C18501k;
import in.C18715c;
import in.C18717e;
import io.sentry.C20321e5;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20390j1;
import io.sentry.InterfaceC20602v0;
import io.sentry.config.AbstractC20301a;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20471c0;
import io.sentry.protocol.C20500u;
import io.sentry.util.AbstractC20582d;
import io.sentry.util.C20581c;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21467g;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp1.C21859k;
import k20.C22136a;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23454a0;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23777h;
import lb3.AbstractC23791o;
import lb3.AbstractC23797r;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23774g;
import lb3.C23778h0;
import lb3.C23784k0;
import lb3.C23785l;
import lb3.C23806v0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m40.C25046w;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25271y;
import my.C26027a;
import nb3.C26552i;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import oa3.AbstractC27769l;
import oa3.C27767j;
import oa3.C27768k;
import oa3.C27777t;
import ou1.C28376a;
import p000.AbstractC11266d;
import p000.C22079k;
import p003a1.C0106e;
import p005a3.AbstractC0262w0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0230n0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2415n3;
import p027b3.AbstractC2453v1;
import p028b4.C2696g;
import p095dp.AbstractC12240d;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12667a;
import p132f0.C13825t;
import p133f1.AbstractC13923a2;
import p133f1.C13995y1;
import p157fv.C14801g;
import p161g.C14923z;
import p161g.InterfaceC14897b0;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15044i9;
import p163g1.AbstractC15047j1;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15081m5;
import p163g1.AbstractC15210z4;
import p163g1.C14970c1;
import p163g1.C15033h9;
import p163g1.C15071l5;
import p163g1.C15079m3;
import p179h.AbstractC16350h;
import p179h.C16346d;
import p179h.C16347e;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p262jv.C21965b;
import p262jv.C21966c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p294l3.C23285v0;
import p309lo.AbstractC24543a;
import p341nh.C26707a;
import p341nh.EnumC26713g;
import p355o2.C27430e;
import p386oy.C28467d;
import p386oy.C28470g;
import p386oy.C28471h;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p446r1.C30848b;
import p452r7.C31022l;
import p452r7.C31036s;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p512u2.C34450b0;
import p547v8.AbstractC35785b;
import p549vb.AbstractC35862g;
import p557vo.AbstractC36220b;
import p581we.C37199o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39126r;
import p636y3.C39172d;
import p636y3.InterfaceC39171c;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import pf.AbstractC29125c;
import r93.EnumC31120f;
import r93.InterfaceC31107a1;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31129i;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31147o0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31162w;
import r93.InterfaceC31165x0;
import rb3.AbstractC31193a;
import s63.C32236a;
import s93.InterfaceC32307i;
import se.AbstractC32410a;
import se.AbstractC32411b;
import u93.AbstractC34670d;
import u93.AbstractC34690n;
import u93.AbstractC34711x0;
import u93.C34697q0;
import ub3.C34749c;
import v30.AbstractC35594c;
import va3.C35850h;
import wb3.AbstractC37056f;
import wc3.InterfaceC37138c;
import x30.AbstractC37926s0;
import xc3.AbstractC38195a;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: io.sentry.config.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20301a {

    /* JADX INFO: renamed from: a */
    public static C27430e f76207a;

    /* JADX INFO: renamed from: A */
    public static final ArrayList m56302A(InterfaceC39126r interfaceC39126r) {
        AbstractC22676k.m65748h(interfaceC39126r, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        C0230n0 c0230n0Mo788N0 = ((AbstractC0262w0) interfaceC39126r).mo788N0();
        boolean zM56312K = m56312K(c0230n0Mo788N0);
        List listM639r = c0230n0Mo788N0.m639r();
        C30848b c30848b = (C30848b) listM639r;
        ArrayList arrayList = new ArrayList(c30848b.f127226w.f127229y);
        int size = listM639r.size();
        for (int i13 = 0; i13 < size; i13++) {
            C0230n0 c0230n0 = (C0230n0) c30848b.get(i13);
            arrayList.add(zM56312K ? c0230n0.m634o() : c0230n0.m635p());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static C28633k1 m56303B() {
        return AbstractC2415n3.f9471a;
    }

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ C31036s m56304C(int i13) {
        double d3 = i13;
        C31022l c31022l = C31036s.f128022y;
        return C31022l.m95556a(d3);
    }

    /* JADX INFO: renamed from: D */
    public static final long m56305D(C12554k0 c12554k0) {
        DragEvent dragEvent = (DragEvent) c12554k0.f42881x;
        float x3 = dragEvent.getX();
        float y13 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x3)) << 32) | (((long) Float.floatToRawIntBits(y13)) & 4294967295L);
    }

    /* JADX INFO: renamed from: E */
    public static final AbstractC23811y m56306E(InterfaceC31165x0 interfaceC31165x0) {
        Object obj;
        AbstractC22676k.m65750j(interfaceC31165x0, "<this>");
        List upperBounds = interfaceC31165x0.getUpperBounds();
        AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = interfaceC31165x0.getUpperBounds();
        AbstractC22676k.m65749i(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC31126h interfaceC31126hMo1784d = ((AbstractC23811y) next).mo69844i0().mo1784d();
            InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
            if (interfaceC31117e != null && interfaceC31117e.getKind() != EnumC31120f.f128329x && interfaceC31117e.getKind() != EnumC31120f.f128325E) {
                obj = next;
                break;
            }
        }
        AbstractC23811y abstractC23811y = (AbstractC23811y) obj;
        if (abstractC23811y != null) {
            return abstractC23811y;
        }
        List upperBounds3 = interfaceC31165x0.getUpperBounds();
        AbstractC22676k.m65749i(upperBounds3, "getUpperBounds(...)");
        Object objM74096F0 = AbstractC25265s.m74096F0(upperBounds3);
        AbstractC22676k.m65749i(objM74096F0, "first(...)");
        return (AbstractC23811y) objM74096F0;
    }

    /* JADX INFO: renamed from: F */
    public static String m56307F(int i13) {
        switch (i13) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 21);
                sb4.append("unknown status code: ");
                sb4.append(i13);
                return sb4.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return "API_NOT_CONNECTED";
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return "DEAD_CLIENT";
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    /* JADX INFO: renamed from: G */
    public static final InterfaceC37138c m56308G(Object obj, AbstractC4454f module) {
        AbstractC22676k.m65750j(module, "module");
        if (obj == null) {
            return AbstractC38195a.m122336d(StringSerializer.INSTANCE);
        }
        if (obj instanceof List) {
            return AbstractC38195a.m122333a(m56351u((Collection) obj, module));
        }
        if (obj instanceof Object[]) {
            Object objM74079t0 = AbstractC25260n.m74079t0((Object[]) obj);
            return objM74079t0 != null ? m56308G(objM74079t0, module) : AbstractC38195a.m122333a(StringSerializer.INSTANCE);
        }
        if (obj instanceof Set) {
            return new LinkedHashSetSerializer(m56351u((Collection) obj, module));
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return AbstractC38195a.m122335c(m56351u(map.keySet(), module), m56351u(map.values(), module));
        }
        Class<?> cls = obj.getClass();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC37138c interfaceC37138cMo13924b = module.mo13924b(c22673i0.getOrCreateKotlinClass(cls), C25271y.f99162w);
        return interfaceC37138cMo13924b == null ? AbstractC35862g.m113846i(c22673i0.getOrCreateKotlinClass(obj.getClass())) : interfaceC37138cMo13924b;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m56309H(InterfaceC31165x0 interfaceC31165x0) {
        return m56311J(interfaceC31165x0, null, 6);
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m56310I(InterfaceC31165x0 typeParameter, InterfaceC23796q0 interfaceC23796q0, Set set) {
        AbstractC22676k.m65750j(typeParameter, "typeParameter");
        List upperBounds = typeParameter.getUpperBounds();
        AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
        List<AbstractC23811y> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AbstractC23811y abstractC23811y : list) {
            AbstractC22676k.m65747g(abstractC23811y);
            if (m56349q(abstractC23811y, typeParameter.mo60594i().mo69844i0(), set) && (interfaceC23796q0 == null || AbstractC22676k.m65745e(abstractC23811y.mo69844i0(), interfaceC23796q0))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ boolean m56311J(InterfaceC31165x0 interfaceC31165x0, InterfaceC23796q0 interfaceC23796q0, int i13) {
        if ((i13 & 2) != 0) {
            interfaceC23796q0 = null;
        }
        return m56310I(interfaceC31165x0, interfaceC23796q0, null);
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m56312K(C0230n0 c0230n0) {
        int iOrdinal = c0230n0.m646v().ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                C0230n0 c0230n0M588G = c0230n0.m588G();
                if (c0230n0M588G != null) {
                    return m56312K(c0230n0M588G);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m56313L(C20321e5 c20321e5, C20513q6 c20513q6) {
        long j7;
        InterfaceC20390j1 serializer = c20513q6.getSerializer();
        InterfaceC20602v0 logger = c20513q6.getLogger();
        Charset charset = AbstractC20582d.f77083a;
        try {
            C20581c c20581c = new C20581c();
            serializer.mo56235a(c20581c, c20321e5);
            j7 = c20581c.f77082w;
        } catch (Throwable th3) {
            logger.mo16060j(EnumC20436n5.ERROR, "Could not calculate size of serializable", th3);
            j7 = 0;
        }
        return j7 <= 1048576;
    }

    /* JADX INFO: renamed from: M */
    public static final void m56314M(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        if (abstractC23811y instanceof C23785l) {
        }
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m56315N(AbstractC23763c0 abstractC23763c0) {
        return (abstractC23763c0 instanceof C26552i) && ((C26552i) abstractC23763c0).f105528z.f105563x;
    }

    /* JADX INFO: renamed from: O */
    public static C20321e5 m56316O(C20321e5 c20321e5, C20513q6 c20513q6) {
        try {
            if (c20513q6.isEnableEventSizeLimiting() && !m56313L(c20321e5, c20513q6)) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", c20321e5.f76883w, 1048576L);
                c20513q6.getOnOversizedEvent();
                List list = c20321e5.f76880M;
                if (list != null && !list.isEmpty()) {
                    c20321e5.f76880M = null;
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Removed breadcrumbs to reduce size of event %s", c20321e5.f76883w);
                }
                if (!m56313L(c20321e5, c20513q6)) {
                    m56335d0(c20321e5, c20513q6);
                    if (!m56313L(c20321e5, c20513q6)) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", c20321e5.f76883w);
                        return c20321e5;
                    }
                }
            }
            return c20321e5;
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th3);
            return c20321e5;
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m56317P(Exception exc, InterfaceC14544a logger, String str) {
        AbstractC22676k.m65750j(logger, "logger");
        String message = exc.getMessage();
        if (message != null) {
            logger.error(str + ": " + message);
        }
        if (exc.getStackTrace() != null) {
            logger.error("Stack trace: ".concat(AbstractC29125c.m88514W(exc)));
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final AbstractC23773f1 m56318Q(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        AbstractC23773f1 abstractC23773f1M69851g = AbstractC23767d1.m69851g(abstractC23811y, true);
        AbstractC22676k.m65749i(abstractC23773f1M69851g, "makeNullable(...)");
        return abstractC23773f1M69851g;
    }

    /* JADX INFO: renamed from: R */
    public static final AbstractC27769l m56319R(AbstractC23811y abstractC23811y) {
        return (AbstractC27769l) AbstractC12240d.m34050P(abstractC23811y, C27777t.f111974i, C34749c.f146401w);
    }

    /* JADX INFO: renamed from: S */
    public static final AbstractC23811y m56320S(AbstractC23811y abstractC23811y, InterfaceC32307i interfaceC32307i) {
        return (abstractC23811y.getAnnotations().isEmpty() && interfaceC32307i.isEmpty()) ? abstractC23811y : abstractC23811y.mo69863p0().mo64127t0(m56321T(abstractC23811y.mo69843Y(), interfaceC32307i));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX INFO: renamed from: T */
    public static final C23784k0 m56321T(C23784k0 c23784k0, InterfaceC32307i interfaceC32307i) {
        C23784k0 c23784k0M119197l;
        AbstractC22676k.m65750j(c23784k0, "<this>");
        if (AbstractC23777h.m69871a(c23784k0) == interfaceC32307i) {
            return c23784k0;
        }
        C23774g c23774g = (C23774g) AbstractC23777h.f94157b.getValue(c23784k0, AbstractC23777h.f94156a[0]);
        if (c23774g != null) {
            if (c23784k0.isEmpty()) {
                c23784k0M119197l = c23784k0;
            } else {
                AbstractC31193a abstractC31193a = c23784k0.f128521w;
                ArrayList arrayList = new ArrayList();
                for (Object obj : abstractC31193a) {
                    if (!AbstractC22676k.m65745e((C23774g) obj, c23774g)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == c23784k0.f128521w.mo96145a()) {
                    c23784k0M119197l = c23784k0;
                } else {
                    C23784k0.f94165x.getClass();
                    c23784k0M119197l = C37199o.m119197l(arrayList);
                }
            }
            if (c23784k0M119197l != null) {
                c23784k0 = c23784k0M119197l;
            }
        }
        if (interfaceC32307i.iterator().hasNext() || !interfaceC32307i.isEmpty()) {
            C23774g c23774g2 = new C23774g(interfaceC32307i);
            C37199o c37199o = C23784k0.f94165x;
            InterfaceC21461d kClass = C23774g.m69864b();
            c37199o.getClass();
            AbstractC22676k.m65750j(kClass, "kClass");
            String qualifiedName = kClass.getQualifiedName();
            AbstractC22676k.m65747g(qualifiedName);
            if (c23784k0.f128521w.get(c37199o.m119206I(qualifiedName)) == null) {
                return c23784k0.isEmpty() ? new C23784k0(AbstractC37056f.m118958J(c23774g2)) : C37199o.m119197l(AbstractC25265s.m74128f1(c23774g2, AbstractC25265s.m74093D1(c23784k0)));
            }
        }
        return c23784k0;
    }

    /* JADX INFO: renamed from: U */
    public static final AbstractC23773f1 m56322U(AbstractC23811y abstractC23811y) {
        AbstractC23763c0 abstractC23763c0;
        AbstractC23773f1 abstractC23773f1M101015X;
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
            AbstractC23797r abstractC23797r = (AbstractC23797r) abstractC23773f1Mo69863p0;
            AbstractC23763c0 abstractC23763c0M101015X = abstractC23797r.f94187x;
            if (!abstractC23763c0M101015X.mo69844i0().getParameters().isEmpty() && abstractC23763c0M101015X.mo69844i0().mo1784d() != null) {
                List parameters = abstractC23763c0M101015X.mo69844i0().getParameters();
                AbstractC22676k.m65749i(parameters, "getParameters(...)");
                List list = parameters;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C23778h0((InterfaceC31165x0) it.next()));
                }
                abstractC23763c0M101015X = AbstractC32410a.m101015X(abstractC23763c0M101015X, arrayList, null, 2);
            }
            AbstractC23763c0 abstractC23763c0M101015X2 = abstractC23797r.f94188y;
            if (!abstractC23763c0M101015X2.mo69844i0().getParameters().isEmpty() && abstractC23763c0M101015X2.mo69844i0().mo1784d() != null) {
                List parameters2 = abstractC23763c0M101015X2.mo69844i0().getParameters();
                AbstractC22676k.m65749i(parameters2, "getParameters(...)");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C23778h0((InterfaceC31165x0) it3.next()));
                }
                abstractC23763c0M101015X2 = AbstractC32410a.m101015X(abstractC23763c0M101015X2, arrayList2, null, 2);
            }
            abstractC23773f1M101015X = AbstractC23791o.m69883b(abstractC23763c0M101015X, abstractC23763c0M101015X2);
        } else {
            if (!(abstractC23773f1Mo69863p0 instanceof AbstractC23763c0)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC23763c0 = (AbstractC23763c0) abstractC23773f1Mo69863p0;
            if (!abstractC23763c0.mo69844i0().getParameters().isEmpty() && abstractC23763c0.mo69844i0().mo1784d() != null) {
                abstractC23773f1M101015X = abstractC23763c0;
                abstractC23773f1M101015X = abstractC23763c0;
                List parameters3 = abstractC23763c0.mo69844i0().getParameters();
                AbstractC22676k.m65749i(parameters3, "getParameters(...)");
                List list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new C23778h0((InterfaceC31165x0) it4.next()));
                }
                abstractC23773f1M101015X = AbstractC32410a.m101015X(abstractC23763c0, arrayList3, null, 2);
            }
        }
        abstractC23773f1M101015X = abstractC23763c0;
        abstractC23773f1M101015X = abstractC23763c0;
        abstractC23773f1M101015X = abstractC23763c0;
        return AbstractC23791o.m69885d(abstractC23773f1M101015X, abstractC23773f1Mo69863p0);
    }

    /* JADX INFO: renamed from: V */
    public static TypedValue m56323V(Context context, int i13) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i13, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m56324W(Context context, int i13, boolean z4) {
        TypedValue typedValueM56323V = m56323V(context, i13);
        if (typedValueM56323V == null || typedValueM56323V.type != 18) {
            return z4;
        }
        return typedValueM56323V.data != 0;
    }

    /* JADX INFO: renamed from: X */
    public static TypedValue m56325X(Context context, int i13, String str) {
        TypedValue typedValueM56323V = m56323V(context, i13);
        if (typedValueM56323V != null) {
            return typedValueM56323V;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: Y */
    public static final InterfaceC37138c m56326Y(C32236a typeInfo, AbstractC4454f module) {
        AbstractC22676k.m65750j(typeInfo, "typeInfo");
        InterfaceC21461d interfaceC21461d = typeInfo.f133488a;
        AbstractC22676k.m65750j(module, "module");
        InterfaceC21456a0 interfaceC21456a0 = typeInfo.f133490c;
        InterfaceC37138c interfaceC37138cM115292D = interfaceC21456a0.getArguments().isEmpty() ? null : AbstractC36220b.m115292D(module, interfaceC21456a0, false);
        if (interfaceC37138cM115292D != null) {
            return interfaceC37138cM115292D;
        }
        InterfaceC37138c interfaceC37138cMo13924b = module.mo13924b(interfaceC21461d, C25271y.f99162w);
        if (interfaceC37138cMo13924b != null) {
            return interfaceC21456a0.isMarkedNullable() ? AbstractC38195a.m122336d(interfaceC37138cMo13924b) : interfaceC37138cMo13924b;
        }
        InterfaceC37138c interfaceC37138cM113846i = AbstractC35862g.m113846i(interfaceC21461d);
        return interfaceC21456a0.isMarkedNullable() ? AbstractC38195a.m122336d(interfaceC37138cM113846i) : interfaceC37138cM113846i;
    }

    /* JADX INFO: renamed from: Z */
    public static final ArrayList m56327Z(InterfaceC21461d dataTypeKC, List uidsList) {
        AbstractC22676k.m65750j(dataTypeKC, "dataTypeKC");
        AbstractC22676k.m65750j(uidsList, "uidsList");
        ArrayList arrayList = new ArrayList();
        Iterator it = uidsList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C1441b2 c1441b2M4582r = C1446c2.m4582r();
            C1543w c1543wM35447S = AbstractC12667a.m35447S(dataTypeKC);
            c1441b2M4582r.m4815c();
            C1446c2.m4580p((C1446c2) c1441b2M4582r.f6114x, c1543wM35447S);
            c1441b2M4582r.m4815c();
            C1446c2.m4581q((C1446c2) c1441b2M4582r.f6114x, str);
            arrayList.add(c1441b2M4582r.m4813a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final void m56328a(Modifier modifier, List options, Function1 onOptionClick, Composer composer, int i13) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(onOptionClick, "onOptionClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1326419244);
        int i14 = (c28655q.m87157i(options) ? 32 : 16) | i13 | (c28655q.m87157i(onOptionClick) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC32411b.m101100l(modifier, options, onOptionClick, i14 & 1022, c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21859k(modifier, options, onOptionClick, i13, 16);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final C23784k0 m56329a0(InterfaceC32307i interfaceC32307i) {
        AbstractC22676k.m65750j(interfaceC32307i, "<this>");
        if (interfaceC32307i.isEmpty()) {
            C23784k0.f94165x.getClass();
            return C23784k0.f94166y;
        }
        C37199o c37199o = C23784k0.f94165x;
        List listM118958J = AbstractC37056f.m118958J(new C23774g(interfaceC32307i));
        c37199o.getClass();
        return C37199o.m119197l(listM118958J);
    }

    /* JADX INFO: renamed from: b */
    public static final C21966c m56330b(Function1 function1) {
        C21965b c21965b = new C21965b();
        c21965b.f85010a = true;
        c21965b.f85011b = Color.parseColor("#FF1E8CAB");
        c21965b.f85012c = 8388691;
        c21965b.f85013d = 92.0f;
        c21965b.f85014e = 4.0f;
        c21965b.f85015f = 4.0f;
        c21965b.f85016g = 4.0f;
        c21965b.f85017h = true;
        function1.invoke(c21965b);
        return new C21966c(c21965b.f85010a, c21965b.f85011b, c21965b.f85012c, c21965b.f85013d, c21965b.f85014e, c21965b.f85015f, c21965b.f85016g, c21965b.f85017h);
    }

    /* JADX INFO: renamed from: b0 */
    public static final C3211f m56331b0(InetAddress inetAddress) {
        AbstractC1772c1 c3216k;
        if (inetAddress instanceof Inet4Address) {
            byte[] address = ((Inet4Address) inetAddress).getAddress();
            AbstractC22676k.m65749i(address, "getAddress(...)");
            c3216k = new C3213h(address);
        } else {
            if (!(inetAddress instanceof Inet6Address)) {
                throw new IllegalStateException(("unrecognized InetAddress " + inetAddress).toString());
            }
            byte[] address2 = ((Inet6Address) inetAddress).getAddress();
            AbstractC22676k.m65749i(address2, "getAddress(...)");
            c3216k = new C3216k(null, address2);
        }
        String hostName = inetAddress.getHostName();
        AbstractC22676k.m65749i(hostName, "getHostName(...)");
        return new C3211f(hostName, c3216k);
    }

    /* JADX INFO: renamed from: c */
    public static final void m56332c(InterfaceC4339a interfaceC4339a, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-361453782);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            if (i16 != 0) {
                z4 = true;
            }
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(interfaceC4339a, c28655q);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C16347e(z4, interfaceC28601c1M87238F);
                c28655q.m87172p0(objM87133R);
            }
            C16347e c16347e = (C16347e) objM87133R;
            boolean z13 = (i15 & 14) == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C14801g(c16347e, z4, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R2, c28655q);
            InterfaceC14897b0 interfaceC14897b0M46561a = AbstractC16350h.m46561a(c28655q);
            if (interfaceC14897b0M46561a == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C14923z onBackPressedDispatcher = interfaceC14897b0M46561a.getOnBackPressedDispatcher();
            InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zM87157i = c28655q.m87157i(onBackPressedDispatcher) | c28655q.m87157i(interfaceC1585g0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C2696g(onBackPressedDispatcher, interfaceC1585g0, c16347e, 5);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87250d(interfaceC1585g0, onBackPressedDispatcher, (Function1) objM87133R3, c28655q);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16346d(z4, interfaceC4339a, i13, i14);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final int m56333c0(AbstractC12350b abstractC12350b, EnumC26713g enumC26713g) {
        if (abstractC12350b instanceof C26707a) {
            return ((C26707a) abstractC12350b).f106205a;
        }
        int iOrdinal = enumC26713g.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static final void m56334d(boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1915019481);
        int i14 = (c28655q.m87155h(z4) ? 32 : 16) | i13 | (c28655q.m87155h(z13) ? 256 : 128) | (c28655q.m87157i(interfaceC4339a) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else if (z13 && !z4) {
            Modifier modifierMo3401b = C1100b.f4583a.mo3401b(C2314t.f9131w);
            c28655q.m87150e0(1892188020);
            boolean z14 = (i14 & 7168) == 2048;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C2533h2(interfaceC4339a, null, 2);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC22989q.m66760a(modifierMo3401b.mo3471e(new SuspendPointerInputElement(C23454a0.f92919a, null, null, new C34450b0((InterfaceC4351m) objM87133R), 6)), c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28467d(z4, z13, interfaceC4339a, i13, 0);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m56335d0(C20321e5 c20321e5, C20513q6 c20513q6) {
        ArrayList arrayListM56480d = c20321e5.m56480d();
        if (arrayListM56480d != null) {
            Iterator it = arrayListM56480d.iterator();
            while (it.hasNext()) {
                C20469b0 c20469b0 = ((C20500u) it.next()).f76795E;
                if (c20469b0 != null) {
                    m56337e0(c20469b0, c20321e5, c20513q6, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList arrayListM56481e = c20321e5.m56481e();
        if (arrayListM56481e != null) {
            Iterator it3 = arrayListM56481e.iterator();
            while (it3.hasNext()) {
                C20469b0 c20469b1 = ((C20471c0) it3.next()).f76624I;
                if (c20469b1 != null) {
                    m56337e0(c20469b1, c20321e5, c20513q6, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0112  */
    /* JADX WARN: Code duplicated, block: B:69:0x0119  */
    /* JADX WARN: Code duplicated, block: B:72:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:77:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0175  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179  */
    /* JADX INFO: renamed from: e */
    public static final void m56336e(C22136a eventReporter, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        boolean z4;
        C28676v0 c28676v1;
        C28676v0 c28676v2;
        C28674u2 c28674u2;
        C28674u2 c28674u3;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v3;
        C28676v0 c28676v4;
        C28674u2 c28674u4;
        C28673u1 c28673u1Mo86977a;
        C28674u2 c28674u5;
        boolean z14;
        Object objM87133R2;
        C28674u2 c28674u6;
        C28673u1 c28673u1;
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(388083719);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(eventReporter) : c28655q.m87157i(eventReporter) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        int i15 = i14;
        if ((i15 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C28674u2 c28674u7 = AbstractC15376j4.f57805a;
            c28655q.m87150e0(-1981014842);
            int i16 = i15 & 14;
            boolean z15 = i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(eventReporter));
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v5 = C28635l.f115821a;
            if (z15 || objM87133R3 == c28676v5) {
                c28676v0 = c28676v5;
                z4 = false;
                C0106e c0106e = new C0106e(1, eventReporter, C22136a.class, "onAutofill", "onAutofill(Ljava/lang/String;)V", 0, 14);
                c28655q.m87172p0(c0106e);
                objM87133R3 = c0106e;
            } else {
                z4 = false;
                c28676v0 = c28676v5;
            }
            c28655q.m87173q(z4);
            C28673u1 c28673u1Mo86977a2 = c28674u7.mo86977a((InterfaceC21467g) objM87133R3);
            C28674u2 c28674u8 = AbstractC0361f.f1242a;
            c28655q.m87150e0(-1981012207);
            boolean z16 = (i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(eventReporter))) ? true : z4;
            Object objM87133R4 = c28655q.m87133R();
            if (z16) {
                c28676v1 = c28676v0;
            } else {
                c28676v1 = c28676v0;
                if (objM87133R4 != c28676v1) {
                    c28674u2 = c28674u8;
                    c28676v2 = c28676v1;
                }
                c28655q.m87173q(z4);
                C28673u1 c28673u1Mo86977a3 = c28674u2.mo86977a(new C3914e((InterfaceC4339a) ((InterfaceC21467g) objM87133R4)));
                c28674u3 = AbstractC0359d.f1241a;
                c28655q.m87150e0(-1981009384);
                if (i16 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(eventReporter))) {
                    z13 = true;
                } else {
                    z13 = z4;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    c28676v3 = c28676v2;
                } else {
                    c28676v3 = c28676v2;
                    if (objM87133R == c28676v3) {
                        c28674u4 = c28674u3;
                        c28676v4 = c28676v3;
                    }
                    c28655q.m87173q(z4);
                    c28673u1Mo86977a = c28674u4.mo86977a(new C3913d((Function1) ((InterfaceC21467g) objM87133R)));
                    c28674u5 = AbstractC0357b.f1240a;
                    c28655q.m87150e0(-1981006516);
                    if (i16 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(eventReporter))) {
                        z14 = true;
                    } else {
                        z14 = z4;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (!z14 || objM87133R2 == c28676v4) {
                        c28674u6 = c28674u5;
                        c28673u1 = c28673u1Mo86977a;
                        C0106e c0106e2 = new C0106e(1, eventReporter, C22136a.class, "onAnalyticsEvent", "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V", 0, 16);
                        c28655q.m87172p0(c0106e2);
                        objM87133R2 = c0106e2;
                    } else {
                        c28673u1 = c28673u1Mo86977a;
                        c28674u6 = c28674u5;
                    }
                    c28655q.m87173q(z4);
                    AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a2, c28673u1Mo86977a3, c28673u1, c28674u6.mo86977a(new C3912c((Function1) ((InterfaceC21467g) objM87133R2))), AbstractC35594c.f151360a.mo86977a(eventReporter)}, AbstractC37817c.m121344e(94700359, c28655q, new C2567l4(c37816b, 1)), c28655q, 56);
                }
                c28676v4 = c28676v3;
                c28674u4 = c28674u3;
                C0106e c0106e3 = new C0106e(1, eventReporter, C22136a.class, "onDisallowedCardBrandEntered", "onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V", 0, 15);
                c28655q.m87172p0(c0106e3);
                objM87133R = c0106e3;
                c28655q.m87173q(z4);
                c28673u1Mo86977a = c28674u4.mo86977a(new C3913d((Function1) ((InterfaceC21467g) objM87133R)));
                c28674u5 = AbstractC0357b.f1240a;
                c28655q.m87150e0(-1981006516);
                if (i16 != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    c28674u6 = c28674u5;
                    c28673u1 = c28673u1Mo86977a;
                    C0106e c0106e4 = new C0106e(1, eventReporter, C22136a.class, "onAnalyticsEvent", "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V", 0, 16);
                    c28655q.m87172p0(c0106e4);
                    objM87133R2 = c0106e4;
                } else {
                    c28674u6 = c28674u5;
                    c28673u1 = c28673u1Mo86977a;
                    C0106e c0106e5 = new C0106e(1, eventReporter, C22136a.class, "onAnalyticsEvent", "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V", 0, 16);
                    c28655q.m87172p0(c0106e5);
                    objM87133R2 = c0106e5;
                }
                c28655q.m87173q(z4);
                AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a2, c28673u1Mo86977a3, c28673u1, c28674u6.mo86977a(new C3912c((Function1) ((InterfaceC21467g) objM87133R2))), AbstractC35594c.f151360a.mo86977a(eventReporter)}, AbstractC37817c.m121344e(94700359, c28655q, new C2567l4(c37816b, 1)), c28655q, 56);
            }
            c28676v2 = c28676v1;
            c28674u2 = c28674u8;
            C2539i0 c2539i0 = new C2539i0(0, eventReporter, C22136a.class, "onCardNumberCompleted", "onCardNumberCompleted()V", 0, 4);
            c28655q.m87172p0(c2539i0);
            objM87133R4 = c2539i0;
            c28655q.m87173q(z4);
            C28673u1 c28673u1Mo86977a4 = c28674u2.mo86977a(new C3914e((InterfaceC4339a) ((InterfaceC21467g) objM87133R4)));
            c28674u3 = AbstractC0359d.f1241a;
            c28655q.m87150e0(-1981009384);
            if (i16 != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                c28676v3 = c28676v2;
                if (objM87133R == c28676v3) {
                    c28674u4 = c28674u3;
                    c28676v4 = c28676v3;
                }
                c28655q.m87173q(z4);
                c28673u1Mo86977a = c28674u4.mo86977a(new C3913d((Function1) ((InterfaceC21467g) objM87133R)));
                c28674u5 = AbstractC0357b.f1240a;
                c28655q.m87150e0(-1981006516);
                if (i16 != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    c28674u6 = c28674u5;
                    c28673u1 = c28673u1Mo86977a;
                    C0106e c0106e6 = new C0106e(1, eventReporter, C22136a.class, "onAnalyticsEvent", "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V", 0, 16);
                    c28655q.m87172p0(c0106e6);
                    objM87133R2 = c0106e6;
                } else {
                    c28674u6 = c28674u5;
                    c28673u1 = c28673u1Mo86977a;
                    C0106e c0106e7 = new C0106e(1, eventReporter, C22136a.class, "onAnalyticsEvent", "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V", 0, 16);
                    c28655q.m87172p0(c0106e7);
                    objM87133R2 = c0106e7;
                }
                c28655q.m87173q(z4);
                AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a2, c28673u1Mo86977a4, c28673u1, c28674u6.mo86977a(new C3912c((Function1) ((InterfaceC21467g) objM87133R2))), AbstractC35594c.f151360a.mo86977a(eventReporter)}, AbstractC37817c.m121344e(94700359, c28655q, new C2567l4(c37816b, 1)), c28655q, 56);
            } else {
                c28676v3 = c28676v2;
            }
            c28676v4 = c28676v3;
            c28674u4 = c28674u3;
            C0106e c0106e8 = new C0106e(1, eventReporter, C22136a.class, "onDisallowedCardBrandEntered", "onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V", 0, 15);
            c28655q.m87172p0(c0106e8);
            objM87133R = c0106e8;
            c28655q.m87173q(z4);
            c28673u1Mo86977a = c28674u4.mo86977a(new C3913d((Function1) ((InterfaceC21467g) objM87133R)));
            c28674u5 = AbstractC0357b.f1240a;
            c28655q.m87150e0(-1981006516);
            if (i16 != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                c28674u6 = c28674u5;
                c28673u1 = c28673u1Mo86977a;
                C0106e c0106e9 = new C0106e(1, eventReporter, C22136a.class, "onAnalyticsEvent", "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V", 0, 16);
                c28655q.m87172p0(c0106e9);
                objM87133R2 = c0106e9;
            } else {
                c28674u6 = c28674u5;
                c28673u1 = c28673u1Mo86977a;
                C0106e c0106e10 = new C0106e(1, eventReporter, C22136a.class, "onAnalyticsEvent", "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V", 0, 16);
                c28655q.m87172p0(c0106e10);
                objM87133R2 = c0106e10;
            }
            c28655q.m87173q(z4);
            AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a2, c28673u1Mo86977a4, c28673u1, c28674u6.mo86977a(new C3912c((Function1) ((InterfaceC21467g) objM87133R2))), AbstractC35594c.f151360a.mo86977a(eventReporter)}, AbstractC37817c.m121344e(94700359, c28655q, new C2567l4(c37816b, 1)), c28655q, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(eventReporter, c37816b, i13, 27);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m56337e0(C20469b0 c20469b0, C20321e5 c20321e5, C20513q6 c20513q6, String str) {
        List list = c20469b0.f76614w;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(list.subList(0, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION));
        arrayList.addAll(list.subList(list.size() - AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, list.size()));
        c20469b0.f76614w = arrayList;
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, str, c20321e5.f76883w);
    }

    /* JADX INFO: renamed from: f */
    public static final void m56338f(boolean z4, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(273935381);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(243088591);
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            AbstractC28683x.m87247a(c28674u2.mo86977a(new C39172d(((InterfaceC39171c) c28655q.m87161k(c28674u2)).getDensity(), 1.0f)), AbstractC37817c.m121344e(796961946, c28655q, new C2567l4(c37816b, 0)), c28655q, 56);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(243257727);
            AbstractC18489d0.m53384y((i14 >> 3) & 14, c37816b, c28655q, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(z4, c37816b, i13, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:104:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01df  */
    /* JADX WARN: Code duplicated, block: B:66:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x020b  */
    /* JADX WARN: Code duplicated, block: B:69:0x022e A[PHI: r8
      0x022e: PHI (r8v12 float) = (r8v5 float), (r8v10 float) binds: [B:68:0x022c, B:72:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0230  */
    /* JADX WARN: Code duplicated, block: B:72:0x0237  */
    /* JADX WARN: Code duplicated, block: B:73:0x0239  */
    /* JADX WARN: Code duplicated, block: B:76:0x023f  */
    /* JADX WARN: Code duplicated, block: B:78:0x024a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0256  */
    /* JADX WARN: Code duplicated, block: B:84:0x0259  */
    /* JADX WARN: Code duplicated, block: B:91:0x0292  */
    /* JADX WARN: Code duplicated, block: B:94:0x029c  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e5  */
    /* JADX INFO: renamed from: g */
    public static final void m56339g(C14970c1 c14970c1, C15033h9 c15033h9, C15071l5 c15071l5, C37816b c37816b, Composer composer, int i13, int i14) {
        C15033h9 c15033h10;
        C15071l5 c15071l6;
        int i15;
        boolean z4;
        C37816b c37816b2;
        C28677v1 c28677v1M87180u;
        C15033h9 c15033h11;
        C15033h9 c15033h12;
        C15071l5 c15071l7;
        Object objM87133R;
        C28676v0 c28676v0;
        C14970c1 c14970c2;
        long jM43091f;
        long jM43087b;
        long jM43100a;
        long j7;
        long jM51541c;
        boolean zM87151f;
        Object objM87133R2;
        long j13;
        float fM35465q;
        float fM35465q2;
        float f13;
        float f14;
        float f15;
        int i16;
        long j14;
        float fM35465q3;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(53836214);
        int i18 = (c28655q.m87153g(c14970c1) ? 4 : 2) | i13;
        if ((i14 & 2) == 0) {
            c15033h10 = c15033h9;
            int i19 = c28655q.m87153g(c15033h10) ? 32 : 16;
            int i24 = i18 | i19;
            if ((i14 & 4) == 0) {
                c15071l6 = c15071l5;
                int i25 = c28655q.m87153g(c15071l6) ? 256 : 128;
                i15 = i24 | i25;
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(c37816b)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if ((i14 & 2) != 0) {
                            c15033h11 = (C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b);
                        } else {
                            c15033h11 = c15033h10;
                        }
                        if ((i14 & 4) != 0) {
                            c15033h12 = c15033h11;
                            c15071l7 = (C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a);
                        } else {
                            c15033h12 = c15033h11;
                        }
                        c28655q.m87175r();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = C14970c1.m43086a(c14970c1, 0L, 0L, 0L, 8191);
                            c28655q.m87172p0(objM87133R);
                        }
                        c14970c2 = (C14970c1) objM87133R;
                        C28674u2 c28674u2 = AbstractC14981d1.f55997a;
                        c14970c2.f55893a.setValue(new C17919x(c14970c1.m43091f()));
                        c14970c2.f55894b.setValue(new C17919x(((C17919x) c14970c1.f55894b.getValue()).f69639a));
                        c14970c2.f55895c.setValue(new C17919x(c14970c1.m43092g()));
                        c14970c2.f55896d.setValue(new C17919x(((C17919x) c14970c1.f55896d.getValue()).f69639a));
                        c14970c2.f55897e.setValue(new C17919x(c14970c1.m43087b()));
                        c14970c2.f55898f.setValue(new C17919x(c14970c1.m43093h()));
                        c14970c2.f55899g.setValue(new C17919x(c14970c1.m43088c()));
                        c14970c2.f55900h.setValue(new C17919x(c14970c1.m43089d()));
                        c14970c2.f55901i.setValue(new C17919x(((C17919x) c14970c1.f55901i.getValue()).f69639a));
                        c14970c2.f55902j.setValue(new C17919x(((C17919x) c14970c1.f55902j.getValue()).f69639a));
                        c14970c2.f55903k.setValue(new C17919x(c14970c1.m43090e()));
                        c14970c2.f55904l.setValue(new C17919x(((C17919x) c14970c1.f55904l.getValue()).f69639a));
                        c14970c2.f55905m.setValue(Boolean.valueOf(c14970c1.m43094i()));
                        C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                        jM43091f = c14970c2.m43091f();
                        jM43087b = c14970c2.m43087b();
                        c28655q.m87150e0(-2060761573);
                        jM43100a = AbstractC14981d1.m43100a(c14970c2, jM43087b);
                        if (jM43100a != 16) {
                            j7 = jM43100a;
                        } else {
                            j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        }
                        c28655q.m87173q(false);
                        C15033h9 c15033h13 = c15033h12;
                        long j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        jM51541c = C17919x.m51541c((((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j15)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j15)) <= 0.5d) ? 0.6f : 0.74f, j7);
                        zM87151f = c28655q.m87151f(jM43091f) | c28655q.m87151f(jM43087b) | c28655q.m87151f(jM51541c);
                        objM87133R2 = c28655q.m87133R();
                        float f16 = 1.0f;
                        if (zM87151f || objM87133R2 == c28676v0) {
                            long jM43091f2 = c14970c2.m43091f();
                            j13 = jM43091f;
                            fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                            fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                            f13 = 0.4f;
                            if (fM35465q >= 4.5f) {
                                j14 = j13;
                            } else {
                                f14 = 0.2f;
                                if (fM35465q2 < 4.5f) {
                                    f13 = 0.2f;
                                    j14 = j13;
                                } else {
                                    f15 = 0.4f;
                                    i16 = 0;
                                    while (true) {
                                        if (i16 >= 7) {
                                            j14 = j13;
                                            break;
                                        }
                                        j14 = j13;
                                        fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                                        if (0.0f > fM35465q3 && fM35465q3 <= 0.01f) {
                                            break;
                                        }
                                        if (fM35465q3 < 0.0f) {
                                            f13 = f15;
                                        } else {
                                            f14 = f15;
                                        }
                                        f15 = (f13 + f14) / 2.0f;
                                        i16++;
                                        j13 = j14;
                                    }
                                    f13 = f15;
                                }
                            }
                            objM87133R2 = new C13995y1(jM43091f2, C17919x.m51541c(f13, j14));
                            c28655q.m87172p0(objM87133R2);
                        }
                        C13995y1 c13995y1 = (C13995y1) objM87133R2;
                        C28674u2 c28674u3 = AbstractC14981d1.f55997a;
                        C28673u1 c28673u1Mo86977a = c28674u3.mo86977a(c14970c2);
                        C28596b0 c28596b0 = AbstractC15047j1.f56336a;
                        long j16 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q.m87161k(c28674u3)).m43094i() ? AbstractC17918w0.m51536x(j16) >= 0.5d : AbstractC17918w0.m51536x(j16) <= 0.5d) {
                        }
                        c15033h10 = c15033h13;
                        C28673u1[] c28673u1Arr = {c28673u1Mo86977a, c28596b0.mo86977a(Float.valueOf(f16)), AbstractC1095d.f4515a.mo86977a(c1119dM43228a), AbstractC15081m5.f56461a.mo86977a(c15071l7), AbstractC13923a2.f49638a.mo86977a(c13995y1), AbstractC15044i9.f56319b.mo86977a(c15033h10)};
                        c37816b2 = c37816b;
                        AbstractC28683x.m87248b(c28673u1Arr, AbstractC37817c.m121344e(496803446, c28655q, new C2647w2(7, c15033h10, c37816b2)), c28655q, 56);
                        c15071l6 = c15071l7;
                    } else {
                        c28655q.m87138X();
                        c15033h12 = c15033h10;
                    }
                    c15071l7 = c15071l6;
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = C14970c1.m43086a(c14970c1, 0L, 0L, 0L, 8191);
                        c28655q.m87172p0(objM87133R);
                    }
                    c14970c2 = (C14970c1) objM87133R;
                    C28674u2 c28674u4 = AbstractC14981d1.f55997a;
                    c14970c2.f55893a.setValue(new C17919x(c14970c1.m43091f()));
                    c14970c2.f55894b.setValue(new C17919x(((C17919x) c14970c1.f55894b.getValue()).f69639a));
                    c14970c2.f55895c.setValue(new C17919x(c14970c1.m43092g()));
                    c14970c2.f55896d.setValue(new C17919x(((C17919x) c14970c1.f55896d.getValue()).f69639a));
                    c14970c2.f55897e.setValue(new C17919x(c14970c1.m43087b()));
                    c14970c2.f55898f.setValue(new C17919x(c14970c1.m43093h()));
                    c14970c2.f55899g.setValue(new C17919x(c14970c1.m43088c()));
                    c14970c2.f55900h.setValue(new C17919x(c14970c1.m43089d()));
                    c14970c2.f55901i.setValue(new C17919x(((C17919x) c14970c1.f55901i.getValue()).f69639a));
                    c14970c2.f55902j.setValue(new C17919x(((C17919x) c14970c1.f55902j.getValue()).f69639a));
                    c14970c2.f55903k.setValue(new C17919x(c14970c1.m43090e()));
                    c14970c2.f55904l.setValue(new C17919x(((C17919x) c14970c1.f55904l.getValue()).f69639a));
                    c14970c2.f55905m.setValue(Boolean.valueOf(c14970c1.m43094i()));
                    C1119d c1119dM43228a2 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    jM43091f = c14970c2.m43091f();
                    jM43087b = c14970c2.m43087b();
                    c28655q.m87150e0(-2060761573);
                    jM43100a = AbstractC14981d1.m43100a(c14970c2, jM43087b);
                    if (jM43100a != 16) {
                        j7 = jM43100a;
                    } else {
                        j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    }
                    c28655q.m87173q(false);
                    C15033h9 c15033h14 = c15033h12;
                    long j17 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    jM51541c = C17919x.m51541c((((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j17)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j17)) <= 0.5d) ? 0.6f : 0.74f, j7);
                    zM87151f = c28655q.m87151f(jM43091f) | c28655q.m87151f(jM43087b) | c28655q.m87151f(jM51541c);
                    objM87133R2 = c28655q.m87133R();
                    float f17 = 1.0f;
                    if (zM87151f) {
                        long jM43091f3 = c14970c2.m43091f();
                        j13 = jM43091f;
                        fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                        fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                        f13 = 0.4f;
                        if (fM35465q >= 4.5f) {
                            j14 = j13;
                        } else {
                            f14 = 0.2f;
                            if (fM35465q2 < 4.5f) {
                                f13 = 0.2f;
                                j14 = j13;
                            } else {
                                f15 = 0.4f;
                                i16 = 0;
                                while (true) {
                                    if (i16 >= 7) {
                                        j14 = j13;
                                        break;
                                    }
                                    j14 = j13;
                                    fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                                    if (0.0f > fM35465q3) {
                                    }
                                    if (fM35465q3 < 0.0f) {
                                        f13 = f15;
                                    } else {
                                        f14 = f15;
                                    }
                                    f15 = (f13 + f14) / 2.0f;
                                    i16++;
                                    j13 = j14;
                                }
                                f13 = f15;
                            }
                        }
                        objM87133R2 = new C13995y1(jM43091f3, C17919x.m51541c(f13, j14));
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        long jM43091f4 = c14970c2.m43091f();
                        j13 = jM43091f;
                        fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                        fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                        f13 = 0.4f;
                        if (fM35465q >= 4.5f) {
                            j14 = j13;
                        } else {
                            f14 = 0.2f;
                            if (fM35465q2 < 4.5f) {
                                f13 = 0.2f;
                                j14 = j13;
                            } else {
                                f15 = 0.4f;
                                i16 = 0;
                                while (true) {
                                    if (i16 >= 7) {
                                        j14 = j13;
                                        break;
                                    }
                                    j14 = j13;
                                    fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                                    if (0.0f > fM35465q3) {
                                    }
                                    if (fM35465q3 < 0.0f) {
                                        f13 = f15;
                                    } else {
                                        f14 = f15;
                                    }
                                    f15 = (f13 + f14) / 2.0f;
                                    i16++;
                                    j13 = j14;
                                }
                                f13 = f15;
                            }
                        }
                        objM87133R2 = new C13995y1(jM43091f4, C17919x.m51541c(f13, j14));
                        c28655q.m87172p0(objM87133R2);
                    }
                    C13995y1 c13995y2 = (C13995y1) objM87133R2;
                    C28674u2 c28674u5 = AbstractC14981d1.f55997a;
                    C28673u1 c28673u1Mo86977a2 = c28674u5.mo86977a(c14970c2);
                    C28596b0 c28596b1 = AbstractC15047j1.f56336a;
                    long j18 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    f17 = ((C14970c1) c28655q.m87161k(c28674u5)).m43094i() ? 0.87f : 0.87f;
                    c15033h10 = c15033h14;
                    C28673u1[] c28673u1Arr2 = {c28673u1Mo86977a2, c28596b1.mo86977a(Float.valueOf(f17)), AbstractC1095d.f4515a.mo86977a(c1119dM43228a2), AbstractC15081m5.f56461a.mo86977a(c15071l7), AbstractC13923a2.f49638a.mo86977a(c13995y2), AbstractC15044i9.f56319b.mo86977a(c15033h10)};
                    c37816b2 = c37816b;
                    AbstractC28683x.m87248b(c28673u1Arr2, AbstractC37817c.m121344e(496803446, c28655q, new C2647w2(7, c15033h10, c37816b2)), c28655q, 56);
                    c15071l6 = c15071l7;
                } else {
                    c37816b2 = c37816b;
                    c28655q.m87138X();
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15079m3(c14970c1, c15033h10, c15071l6, c37816b2, i13, i14, 0);
                }
            }
            c15071l6 = c15071l5;
            i15 = i24 | i25;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        c15033h11 = (C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b);
                    } else {
                        c15033h11 = c15033h10;
                    }
                    if ((i14 & 4) != 0) {
                        c15033h12 = c15033h11;
                        c15071l7 = (C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a);
                    } else {
                        c15033h12 = c15033h11;
                        c15071l7 = c15071l6;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        c15033h11 = (C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b);
                    } else {
                        c15033h11 = c15033h10;
                    }
                    if ((i14 & 4) != 0) {
                        c15033h12 = c15033h11;
                        c15071l7 = (C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a);
                    } else {
                        c15033h12 = c15033h11;
                        c15071l7 = c15071l6;
                    }
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = C14970c1.m43086a(c14970c1, 0L, 0L, 0L, 8191);
                    c28655q.m87172p0(objM87133R);
                }
                c14970c2 = (C14970c1) objM87133R;
                C28674u2 c28674u6 = AbstractC14981d1.f55997a;
                c14970c2.f55893a.setValue(new C17919x(c14970c1.m43091f()));
                c14970c2.f55894b.setValue(new C17919x(((C17919x) c14970c1.f55894b.getValue()).f69639a));
                c14970c2.f55895c.setValue(new C17919x(c14970c1.m43092g()));
                c14970c2.f55896d.setValue(new C17919x(((C17919x) c14970c1.f55896d.getValue()).f69639a));
                c14970c2.f55897e.setValue(new C17919x(c14970c1.m43087b()));
                c14970c2.f55898f.setValue(new C17919x(c14970c1.m43093h()));
                c14970c2.f55899g.setValue(new C17919x(c14970c1.m43088c()));
                c14970c2.f55900h.setValue(new C17919x(c14970c1.m43089d()));
                c14970c2.f55901i.setValue(new C17919x(((C17919x) c14970c1.f55901i.getValue()).f69639a));
                c14970c2.f55902j.setValue(new C17919x(((C17919x) c14970c1.f55902j.getValue()).f69639a));
                c14970c2.f55903k.setValue(new C17919x(c14970c1.m43090e()));
                c14970c2.f55904l.setValue(new C17919x(((C17919x) c14970c1.f55904l.getValue()).f69639a));
                c14970c2.f55905m.setValue(Boolean.valueOf(c14970c1.m43094i()));
                C1119d c1119dM43228a3 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                jM43091f = c14970c2.m43091f();
                jM43087b = c14970c2.m43087b();
                c28655q.m87150e0(-2060761573);
                jM43100a = AbstractC14981d1.m43100a(c14970c2, jM43087b);
                if (jM43100a != 16) {
                    j7 = jM43100a;
                } else {
                    j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                }
                c28655q.m87173q(false);
                C15033h9 c15033h15 = c15033h12;
                long j19 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                jM51541c = C17919x.m51541c((((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j19)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j19)) <= 0.5d) ? 0.6f : 0.74f, j7);
                zM87151f = c28655q.m87151f(jM43091f) | c28655q.m87151f(jM43087b) | c28655q.m87151f(jM51541c);
                objM87133R2 = c28655q.m87133R();
                float f18 = 1.0f;
                if (zM87151f) {
                    long jM43091f5 = c14970c2.m43091f();
                    j13 = jM43091f;
                    fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                    fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                    f13 = 0.4f;
                    if (fM35465q >= 4.5f) {
                        j14 = j13;
                    } else {
                        f14 = 0.2f;
                        if (fM35465q2 < 4.5f) {
                            f13 = 0.2f;
                            j14 = j13;
                        } else {
                            f15 = 0.4f;
                            i16 = 0;
                            while (true) {
                                if (i16 >= 7) {
                                    j14 = j13;
                                    break;
                                }
                                j14 = j13;
                                fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                                if (0.0f > fM35465q3) {
                                }
                                if (fM35465q3 < 0.0f) {
                                    f13 = f15;
                                } else {
                                    f14 = f15;
                                }
                                f15 = (f13 + f14) / 2.0f;
                                i16++;
                                j13 = j14;
                            }
                            f13 = f15;
                        }
                    }
                    objM87133R2 = new C13995y1(jM43091f5, C17919x.m51541c(f13, j14));
                    c28655q.m87172p0(objM87133R2);
                } else {
                    long jM43091f6 = c14970c2.m43091f();
                    j13 = jM43091f;
                    fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                    fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                    f13 = 0.4f;
                    if (fM35465q >= 4.5f) {
                        j14 = j13;
                    } else {
                        f14 = 0.2f;
                        if (fM35465q2 < 4.5f) {
                            f13 = 0.2f;
                            j14 = j13;
                        } else {
                            f15 = 0.4f;
                            i16 = 0;
                            while (true) {
                                if (i16 >= 7) {
                                    j14 = j13;
                                    break;
                                }
                                j14 = j13;
                                fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                                if (0.0f > fM35465q3) {
                                }
                                if (fM35465q3 < 0.0f) {
                                    f13 = f15;
                                } else {
                                    f14 = f15;
                                }
                                f15 = (f13 + f14) / 2.0f;
                                i16++;
                                j13 = j14;
                            }
                            f13 = f15;
                        }
                    }
                    objM87133R2 = new C13995y1(jM43091f6, C17919x.m51541c(f13, j14));
                    c28655q.m87172p0(objM87133R2);
                }
                C13995y1 c13995y3 = (C13995y1) objM87133R2;
                C28674u2 c28674u7 = AbstractC14981d1.f55997a;
                C28673u1 c28673u1Mo86977a3 = c28674u7.mo86977a(c14970c2);
                C28596b0 c28596b2 = AbstractC15047j1.f56336a;
                long j110 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(c28674u7)).m43094i()) {
                }
                c15033h10 = c15033h15;
                C28673u1[] c28673u1Arr3 = {c28673u1Mo86977a3, c28596b2.mo86977a(Float.valueOf(f18)), AbstractC1095d.f4515a.mo86977a(c1119dM43228a3), AbstractC15081m5.f56461a.mo86977a(c15071l7), AbstractC13923a2.f49638a.mo86977a(c13995y3), AbstractC15044i9.f56319b.mo86977a(c15033h10)};
                c37816b2 = c37816b;
                AbstractC28683x.m87248b(c28673u1Arr3, AbstractC37817c.m121344e(496803446, c28655q, new C2647w2(7, c15033h10, c37816b2)), c28655q, 56);
                c15071l6 = c15071l7;
            } else {
                c37816b2 = c37816b;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(c14970c1, c15033h10, c15071l6, c37816b2, i13, i14, 0);
            }
        }
        c15033h10 = c15033h9;
        int i26 = i18 | i19;
        if ((i14 & 4) == 0) {
            c15071l6 = c15071l5;
            if (c28655q.m87153g(c15071l6)) {
            }
            i15 = i26 | i25;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        c15033h11 = (C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b);
                    } else {
                        c15033h11 = c15033h10;
                    }
                    if ((i14 & 4) != 0) {
                        c15033h12 = c15033h11;
                        c15071l7 = (C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a);
                    } else {
                        c15033h12 = c15033h11;
                        c15071l7 = c15071l6;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        c15033h11 = (C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b);
                    } else {
                        c15033h11 = c15033h10;
                    }
                    if ((i14 & 4) != 0) {
                        c15033h12 = c15033h11;
                        c15071l7 = (C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a);
                    } else {
                        c15033h12 = c15033h11;
                        c15071l7 = c15071l6;
                    }
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = C14970c1.m43086a(c14970c1, 0L, 0L, 0L, 8191);
                    c28655q.m87172p0(objM87133R);
                }
                c14970c2 = (C14970c1) objM87133R;
                C28674u2 c28674u8 = AbstractC14981d1.f55997a;
                c14970c2.f55893a.setValue(new C17919x(c14970c1.m43091f()));
                c14970c2.f55894b.setValue(new C17919x(((C17919x) c14970c1.f55894b.getValue()).f69639a));
                c14970c2.f55895c.setValue(new C17919x(c14970c1.m43092g()));
                c14970c2.f55896d.setValue(new C17919x(((C17919x) c14970c1.f55896d.getValue()).f69639a));
                c14970c2.f55897e.setValue(new C17919x(c14970c1.m43087b()));
                c14970c2.f55898f.setValue(new C17919x(c14970c1.m43093h()));
                c14970c2.f55899g.setValue(new C17919x(c14970c1.m43088c()));
                c14970c2.f55900h.setValue(new C17919x(c14970c1.m43089d()));
                c14970c2.f55901i.setValue(new C17919x(((C17919x) c14970c1.f55901i.getValue()).f69639a));
                c14970c2.f55902j.setValue(new C17919x(((C17919x) c14970c1.f55902j.getValue()).f69639a));
                c14970c2.f55903k.setValue(new C17919x(c14970c1.m43090e()));
                c14970c2.f55904l.setValue(new C17919x(((C17919x) c14970c1.f55904l.getValue()).f69639a));
                c14970c2.f55905m.setValue(Boolean.valueOf(c14970c1.m43094i()));
                C1119d c1119dM43228a4 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                jM43091f = c14970c2.m43091f();
                jM43087b = c14970c2.m43087b();
                c28655q.m87150e0(-2060761573);
                jM43100a = AbstractC14981d1.m43100a(c14970c2, jM43087b);
                if (jM43100a != 16) {
                    j7 = jM43100a;
                } else {
                    j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                }
                c28655q.m87173q(false);
                C15033h9 c15033h16 = c15033h12;
                long j111 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                jM51541c = C17919x.m51541c((((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j111)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j111)) <= 0.5d) ? 0.6f : 0.74f, j7);
                zM87151f = c28655q.m87151f(jM43091f) | c28655q.m87151f(jM43087b) | c28655q.m87151f(jM51541c);
                objM87133R2 = c28655q.m87133R();
                float f19 = 1.0f;
                if (zM87151f) {
                    long jM43091f7 = c14970c2.m43091f();
                    j13 = jM43091f;
                    fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                    fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                    f13 = 0.4f;
                    if (fM35465q >= 4.5f) {
                        j14 = j13;
                    } else {
                        f14 = 0.2f;
                        if (fM35465q2 < 4.5f) {
                            f13 = 0.2f;
                            j14 = j13;
                        } else {
                            f15 = 0.4f;
                            i16 = 0;
                            while (true) {
                                if (i16 >= 7) {
                                    j14 = j13;
                                    break;
                                }
                                j14 = j13;
                                fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                                if (0.0f > fM35465q3) {
                                }
                                if (fM35465q3 < 0.0f) {
                                    f13 = f15;
                                } else {
                                    f14 = f15;
                                }
                                f15 = (f13 + f14) / 2.0f;
                                i16++;
                                j13 = j14;
                            }
                            f13 = f15;
                        }
                    }
                    objM87133R2 = new C13995y1(jM43091f7, C17919x.m51541c(f13, j14));
                    c28655q.m87172p0(objM87133R2);
                } else {
                    long jM43091f8 = c14970c2.m43091f();
                    j13 = jM43091f;
                    fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                    fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                    f13 = 0.4f;
                    if (fM35465q >= 4.5f) {
                        j14 = j13;
                    } else {
                        f14 = 0.2f;
                        if (fM35465q2 < 4.5f) {
                            f13 = 0.2f;
                            j14 = j13;
                        } else {
                            f15 = 0.4f;
                            i16 = 0;
                            while (true) {
                                if (i16 >= 7) {
                                    j14 = j13;
                                    break;
                                }
                                j14 = j13;
                                fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                                if (0.0f > fM35465q3) {
                                }
                                if (fM35465q3 < 0.0f) {
                                    f13 = f15;
                                } else {
                                    f14 = f15;
                                }
                                f15 = (f13 + f14) / 2.0f;
                                i16++;
                                j13 = j14;
                            }
                            f13 = f15;
                        }
                    }
                    objM87133R2 = new C13995y1(jM43091f8, C17919x.m51541c(f13, j14));
                    c28655q.m87172p0(objM87133R2);
                }
                C13995y1 c13995y4 = (C13995y1) objM87133R2;
                C28674u2 c28674u9 = AbstractC14981d1.f55997a;
                C28673u1 c28673u1Mo86977a4 = c28674u9.mo86977a(c14970c2);
                C28596b0 c28596b3 = AbstractC15047j1.f56336a;
                long j112 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(c28674u9)).m43094i()) {
                }
                c15033h10 = c15033h16;
                C28673u1[] c28673u1Arr4 = {c28673u1Mo86977a4, c28596b3.mo86977a(Float.valueOf(f19)), AbstractC1095d.f4515a.mo86977a(c1119dM43228a4), AbstractC15081m5.f56461a.mo86977a(c15071l7), AbstractC13923a2.f49638a.mo86977a(c13995y4), AbstractC15044i9.f56319b.mo86977a(c15033h10)};
                c37816b2 = c37816b;
                AbstractC28683x.m87248b(c28673u1Arr4, AbstractC37817c.m121344e(496803446, c28655q, new C2647w2(7, c15033h10, c37816b2)), c28655q, 56);
                c15071l6 = c15071l7;
            } else {
                c37816b2 = c37816b;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(c14970c1, c15033h10, c15071l6, c37816b2, i13, i14, 0);
            }
        }
        c15071l6 = c15071l5;
        i15 = i26 | i25;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(c37816b)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    c15033h11 = (C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b);
                } else {
                    c15033h11 = c15033h10;
                }
                if ((i14 & 4) != 0) {
                    c15033h12 = c15033h11;
                    c15071l7 = (C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a);
                } else {
                    c15033h12 = c15033h11;
                    c15071l7 = c15071l6;
                }
            } else {
                if ((i14 & 2) != 0) {
                    c15033h11 = (C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b);
                } else {
                    c15033h11 = c15033h10;
                }
                if ((i14 & 4) != 0) {
                    c15033h12 = c15033h11;
                    c15071l7 = (C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a);
                } else {
                    c15033h12 = c15033h11;
                    c15071l7 = c15071l6;
                }
            }
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = C14970c1.m43086a(c14970c1, 0L, 0L, 0L, 8191);
                c28655q.m87172p0(objM87133R);
            }
            c14970c2 = (C14970c1) objM87133R;
            C28674u2 c28674u10 = AbstractC14981d1.f55997a;
            c14970c2.f55893a.setValue(new C17919x(c14970c1.m43091f()));
            c14970c2.f55894b.setValue(new C17919x(((C17919x) c14970c1.f55894b.getValue()).f69639a));
            c14970c2.f55895c.setValue(new C17919x(c14970c1.m43092g()));
            c14970c2.f55896d.setValue(new C17919x(((C17919x) c14970c1.f55896d.getValue()).f69639a));
            c14970c2.f55897e.setValue(new C17919x(c14970c1.m43087b()));
            c14970c2.f55898f.setValue(new C17919x(c14970c1.m43093h()));
            c14970c2.f55899g.setValue(new C17919x(c14970c1.m43088c()));
            c14970c2.f55900h.setValue(new C17919x(c14970c1.m43089d()));
            c14970c2.f55901i.setValue(new C17919x(((C17919x) c14970c1.f55901i.getValue()).f69639a));
            c14970c2.f55902j.setValue(new C17919x(((C17919x) c14970c1.f55902j.getValue()).f69639a));
            c14970c2.f55903k.setValue(new C17919x(c14970c1.m43090e()));
            c14970c2.f55904l.setValue(new C17919x(((C17919x) c14970c1.f55904l.getValue()).f69639a));
            c14970c2.f55905m.setValue(Boolean.valueOf(c14970c1.m43094i()));
            C1119d c1119dM43228a5 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
            jM43091f = c14970c2.m43091f();
            jM43087b = c14970c2.m43087b();
            c28655q.m87150e0(-2060761573);
            jM43100a = AbstractC14981d1.m43100a(c14970c2, jM43087b);
            if (jM43100a != 16) {
                j7 = jM43100a;
            } else {
                j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
            }
            c28655q.m87173q(false);
            C15033h9 c15033h17 = c15033h12;
            long j113 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
            jM51541c = C17919x.m51541c((((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j113)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j113)) <= 0.5d) ? 0.6f : 0.74f, j7);
            zM87151f = c28655q.m87151f(jM43091f) | c28655q.m87151f(jM43087b) | c28655q.m87151f(jM51541c);
            objM87133R2 = c28655q.m87133R();
            float f110 = 1.0f;
            if (zM87151f) {
                long jM43091f9 = c14970c2.m43091f();
                j13 = jM43091f;
                fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                f13 = 0.4f;
                if (fM35465q >= 4.5f) {
                    j14 = j13;
                } else {
                    f14 = 0.2f;
                    if (fM35465q2 < 4.5f) {
                        f13 = 0.2f;
                        j14 = j13;
                    } else {
                        f15 = 0.4f;
                        i16 = 0;
                        while (true) {
                            if (i16 >= 7) {
                                j14 = j13;
                                break;
                            }
                            j14 = j13;
                            fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                            if (0.0f > fM35465q3) {
                            }
                            if (fM35465q3 < 0.0f) {
                                f13 = f15;
                            } else {
                                f14 = f15;
                            }
                            f15 = (f13 + f14) / 2.0f;
                            i16++;
                            j13 = j14;
                        }
                        f13 = f15;
                    }
                }
                objM87133R2 = new C13995y1(jM43091f9, C17919x.m51541c(f13, j14));
                c28655q.m87172p0(objM87133R2);
            } else {
                long jM43091f10 = c14970c2.m43091f();
                j13 = jM43091f;
                fM35465q = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.4f);
                fM35465q2 = AbstractC12667a.m35465q(j13, jM51541c, jM43087b, 0.2f);
                f13 = 0.4f;
                if (fM35465q >= 4.5f) {
                    j14 = j13;
                } else {
                    f14 = 0.2f;
                    if (fM35465q2 < 4.5f) {
                        f13 = 0.2f;
                        j14 = j13;
                    } else {
                        f15 = 0.4f;
                        i16 = 0;
                        while (true) {
                            if (i16 >= 7) {
                                j14 = j13;
                                break;
                            }
                            j14 = j13;
                            fM35465q3 = (AbstractC12667a.m35465q(j13, jM51541c, jM43087b, f15) / 4.5f) - 1.0f;
                            if (0.0f > fM35465q3) {
                            }
                            if (fM35465q3 < 0.0f) {
                                f13 = f15;
                            } else {
                                f14 = f15;
                            }
                            f15 = (f13 + f14) / 2.0f;
                            i16++;
                            j13 = j14;
                        }
                        f13 = f15;
                    }
                }
                objM87133R2 = new C13995y1(jM43091f10, C17919x.m51541c(f13, j14));
                c28655q.m87172p0(objM87133R2);
            }
            C13995y1 c13995y5 = (C13995y1) objM87133R2;
            C28674u2 c28674u11 = AbstractC14981d1.f55997a;
            C28673u1 c28673u1Mo86977a5 = c28674u11.mo86977a(c14970c2);
            C28596b0 c28596b4 = AbstractC15047j1.f56336a;
            long j114 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
            if (((C14970c1) c28655q.m87161k(c28674u11)).m43094i()) {
            }
            c15033h10 = c15033h17;
            C28673u1[] c28673u1Arr5 = {c28673u1Mo86977a5, c28596b4.mo86977a(Float.valueOf(f110)), AbstractC1095d.f4515a.mo86977a(c1119dM43228a5), AbstractC15081m5.f56461a.mo86977a(c15071l7), AbstractC13923a2.f49638a.mo86977a(c13995y5), AbstractC15044i9.f56319b.mo86977a(c15033h10)};
            c37816b2 = c37816b;
            AbstractC28683x.m87248b(c28673u1Arr5, AbstractC37817c.m121344e(496803446, c28655q, new C2647w2(7, c15033h10, c37816b2)), c28655q, 56);
            c15071l6 = c15071l7;
        } else {
            c37816b2 = c37816b;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(c14970c1, c15033h10, c15071l6, c37816b2, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m56340h(List paymentMethods, int i13, boolean z4, C25046w imageLoader, Modifier modifier, InterfaceC4351m interfaceC4351m, AbstractC16653f1 rowStyle, Composer composer, int i14) {
        boolean z13;
        Modifier modifier2;
        Modifier modifier3;
        InterfaceC4351m interfaceC4351m2 = interfaceC4351m;
        AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1374843577);
        int i15 = (i14 & 6) == 0 ? (c28655q.m87157i(paymentMethods) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z13 = z4;
            i15 |= c28655q.m87155h(z13) ? 256 : 128;
        } else {
            z13 = z4;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? c28655q.m87153g(imageLoader) : c28655q.m87157i(imageLoader) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i15 | 24576;
        if ((196608 & i14) == 0) {
            i16 |= c28655q.m87157i(interfaceC4351m2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i16 |= c28655q.m87153g(rowStyle) ? 1048576 : 524288;
        }
        int i17 = i16;
        if ((599187 & i17) == 599186 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier3 = modifier;
        } else {
            c28655q.m87140Z();
            int i18 = i14 & 1;
            C2314t c2314t = C2314t.f9131w;
            if (i18 == 0 || c28655q.m87118C()) {
                modifier2 = c2314t;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
            }
            c28655q.m87175r();
            Modifier modifierM3599a = AbstractC1136a.m3599a(modifier2, "TEST_TAG_NEW_PAYMENT_METHOD_VERTICAL_LAYOUT_UI");
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
            c28655q.m87150e0(-1479321866);
            int i19 = 0;
            for (Object obj : paymentMethods) {
                int i24 = i19 + 1;
                if (i19 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C11568w c11568w = (C11568w) obj;
                boolean z14 = i19 == i13;
                AbstractC16653f1 abstractC16653f1 = C16659g1.f64059E.f64060w;
                AbstractC22676k.m65750j(rowStyle, "rowStyle");
                C16659g1 c16659g1 = new C16659g1(rowStyle, null, null, null);
                c28655q.m87150e0(-1657631656);
                boolean zM87157i = ((i17 & 458752) == 131072) | c28655q.m87157i(c11568w);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C9790n(9, interfaceC4351m2, c11568w);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC12667a.m35456h(z13, z14, c11568w, imageLoader, AbstractC1131a.m3500d(c2314t, (Function1) objM87133R), c16659g1, c28655q, ((i17 >> 6) & 14) | 4096 | (i17 & 7168));
                z13 = z4;
                modifier2 = modifier2;
                i19 = i24;
                interfaceC4351m2 = interfaceC4351m;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(paymentMethods, i13, z4, imageLoader, modifier3, interfaceC4351m, rowStyle, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0206  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x015f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x018b  */
    /* JADX INFO: renamed from: i */
    public static final void m56341i(String label, boolean z4, InterfaceC4339a onButtonClick, Modifier modifier, boolean z13, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z16;
        int i17;
        int i18;
        boolean z17;
        int i19;
        int i24;
        int i25;
        boolean z18;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z19;
        InterfaceC4339a interfaceC4339a2;
        long j7;
        float f13;
        C28655q c28655q;
        Modifier modifier3;
        boolean z24;
        InterfaceC4339a interfaceC4339a3;
        boolean z25;
        boolean z26;
        Object objM87133R;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(onButtonClick, "onButtonClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1984530772);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(label) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        int i34 = i15 | (c28655q2.m87157i(onButtonClick) ? 256 : 128);
        int i35 = i14 & 8;
        if (i35 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i34 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z16 = z13;
                    if (c28655q2.m87155h(z16)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i34 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    i24 = i34 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z17 = z14;
                } else {
                    z17 = z14;
                    if (c28655q2.m87155h(z17)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i24 = i34 | i19;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    if ((1572864 & i13) == 0) {
                        z18 = z15;
                        if (c28655q2.m87155h(z18)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i24 |= i26;
                    }
                    i27 = i14 & 128;
                    if (i27 != 0) {
                        i29 = i24 | 12582912;
                    } else {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i29 = i24 | i28;
                    }
                    if ((i29 & 4793491) == 4793490 || !c28655q2.m87121F()) {
                        if (i35 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            z19 = false;
                        } else {
                            z19 = z16;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        if (i25 != 0) {
                            z18 = false;
                        }
                        if (i27 != 0) {
                            c28655q2.m87150e0(-987741108);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C28376a(7);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c28655q2.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        long jM51515c = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context));
                        long jM51515c2 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context));
                        C11666k c11666k = C11671p.f37684e;
                        C13825t c13825tM48880a = AbstractC17269i.m48880a(c11666k.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k, context)));
                        C33252i c33252iM105489e = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                        C23285v0 c23285v0M31078g = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                        C28596b0 c28596b0 = AbstractC15047j1.f56336a;
                        if (z4) {
                            c28655q2.m87150e0(-987715090);
                            long j13 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            f13 = (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j13)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j13)) <= 0.5d) ? 0.87f : 1.0f;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-987714350);
                            j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            c28655q2.m87173q(false);
                            f13 = 0.38f;
                        }
                        Modifier modifier4 = modifier2;
                        boolean z27 = z18;
                        boolean z28 = z17;
                        c28655q = c28655q2;
                        AbstractC28683x.m87247a(c28596b0.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier4, onButtonClick, z4, c33252iM105489e, c13825tM48880a, jM51515c, z19, interfaceC4339a2, label, jM51515c2, c23285v0M31078g, z28, z27)), c28655q, 56);
                        modifier3 = modifier4;
                        z24 = z19;
                        interfaceC4339a3 = interfaceC4339a2;
                        z25 = z28;
                        z26 = z27;
                    } else {
                        c28655q2.m87138X();
                        interfaceC4339a3 = interfaceC4339a;
                        c28655q = c28655q2;
                        modifier3 = modifier2;
                        z24 = z16;
                        z25 = z17;
                        z26 = z18;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C18501k(label, z4, onButtonClick, modifier3, z24, z25, z26, interfaceC4339a3, i13, i14);
                    }
                }
                i24 |= 1572864;
                z18 = z15;
                i27 = i14 & 128;
                if (i27 != 0) {
                    i29 = i24 | 12582912;
                } else {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i29 = i24 | i28;
                }
                if ((i29 & 4793491) == 4793490) {
                    if (i35 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    }
                    if (i27 != 0) {
                        c28655q2.m87150e0(-987741108);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C28376a(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    Context context2 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    long jM51515c3 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context2));
                    long jM51515c4 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context2));
                    C11666k c11666k2 = C11671p.f37684e;
                    C13825t c13825tM48880a2 = AbstractC17269i.m48880a(c11666k2.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k2, context2)));
                    C33252i c33252iM105489e2 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                    C23285v0 c23285v0M31078g2 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                    C28596b0 c28596b1 = AbstractC15047j1.f56336a;
                    if (z4) {
                        c28655q2.m87150e0(-987715090);
                        long j14 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        }
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-987714350);
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        c28655q2.m87173q(false);
                        f13 = 0.38f;
                    }
                    Modifier modifier5 = modifier2;
                    boolean z29 = z18;
                    boolean z210 = z17;
                    c28655q = c28655q2;
                    AbstractC28683x.m87247a(c28596b1.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier5, onButtonClick, z4, c33252iM105489e2, c13825tM48880a2, jM51515c3, z19, interfaceC4339a2, label, jM51515c4, c23285v0M31078g2, z210, z29)), c28655q, 56);
                    modifier3 = modifier5;
                    z24 = z19;
                    interfaceC4339a3 = interfaceC4339a2;
                    z25 = z210;
                    z26 = z29;
                } else {
                    if (i35 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    }
                    if (i27 != 0) {
                        c28655q2.m87150e0(-987741108);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C28376a(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    Context context3 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    long jM51515c5 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context3));
                    long jM51515c6 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context3));
                    C11666k c11666k3 = C11671p.f37684e;
                    C13825t c13825tM48880a3 = AbstractC17269i.m48880a(c11666k3.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k3, context3)));
                    C33252i c33252iM105489e3 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                    C23285v0 c23285v0M31078g3 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                    C28596b0 c28596b2 = AbstractC15047j1.f56336a;
                    if (z4) {
                        c28655q2.m87150e0(-987715090);
                        long j15 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        }
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-987714350);
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        c28655q2.m87173q(false);
                        f13 = 0.38f;
                    }
                    Modifier modifier6 = modifier2;
                    boolean z211 = z18;
                    boolean z212 = z17;
                    c28655q = c28655q2;
                    AbstractC28683x.m87247a(c28596b2.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier6, onButtonClick, z4, c33252iM105489e3, c13825tM48880a3, jM51515c5, z19, interfaceC4339a2, label, jM51515c6, c23285v0M31078g3, z212, z211)), c28655q, 56);
                    modifier3 = modifier6;
                    z24 = z19;
                    interfaceC4339a3 = interfaceC4339a2;
                    z25 = z212;
                    z26 = z211;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18501k(label, z4, onButtonClick, modifier3, z24, z25, z26, interfaceC4339a3, i13, i14);
                }
            }
            i34 |= 24576;
            z16 = z13;
            i18 = i14 & 32;
            if (i18 != 0) {
                i24 = i34 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z17 = z14;
            } else {
                z17 = z14;
                if (c28655q2.m87155h(z17)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i24 = i34 | i19;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                if ((1572864 & i13) == 0) {
                    z18 = z15;
                    if (c28655q2.m87155h(z18)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i24 |= i26;
                }
                i27 = i14 & 128;
                if (i27 != 0) {
                    i29 = i24 | 12582912;
                } else {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i29 = i24 | i28;
                }
                if ((i29 & 4793491) == 4793490) {
                    if (i35 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    }
                    if (i27 != 0) {
                        c28655q2.m87150e0(-987741108);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C28376a(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    Context context4 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    long jM51515c7 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context4));
                    long jM51515c8 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context4));
                    C11666k c11666k4 = C11671p.f37684e;
                    C13825t c13825tM48880a4 = AbstractC17269i.m48880a(c11666k4.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k4, context4)));
                    C33252i c33252iM105489e4 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                    C23285v0 c23285v0M31078g4 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                    C28596b0 c28596b3 = AbstractC15047j1.f56336a;
                    if (z4) {
                        c28655q2.m87150e0(-987715090);
                        long j16 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        }
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-987714350);
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        c28655q2.m87173q(false);
                        f13 = 0.38f;
                    }
                    Modifier modifier7 = modifier2;
                    boolean z213 = z18;
                    boolean z214 = z17;
                    c28655q = c28655q2;
                    AbstractC28683x.m87247a(c28596b3.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier7, onButtonClick, z4, c33252iM105489e4, c13825tM48880a4, jM51515c7, z19, interfaceC4339a2, label, jM51515c8, c23285v0M31078g4, z214, z213)), c28655q, 56);
                    modifier3 = modifier7;
                    z24 = z19;
                    interfaceC4339a3 = interfaceC4339a2;
                    z25 = z214;
                    z26 = z213;
                } else {
                    if (i35 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    }
                    if (i27 != 0) {
                        c28655q2.m87150e0(-987741108);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C28376a(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    Context context5 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    long jM51515c9 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context5));
                    long jM51515c10 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context5));
                    C11666k c11666k5 = C11671p.f37684e;
                    C13825t c13825tM48880a5 = AbstractC17269i.m48880a(c11666k5.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k5, context5)));
                    C33252i c33252iM105489e5 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                    C23285v0 c23285v0M31078g5 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                    C28596b0 c28596b4 = AbstractC15047j1.f56336a;
                    if (z4) {
                        c28655q2.m87150e0(-987715090);
                        long j17 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        }
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-987714350);
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        c28655q2.m87173q(false);
                        f13 = 0.38f;
                    }
                    Modifier modifier8 = modifier2;
                    boolean z215 = z18;
                    boolean z216 = z17;
                    c28655q = c28655q2;
                    AbstractC28683x.m87247a(c28596b4.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier8, onButtonClick, z4, c33252iM105489e5, c13825tM48880a5, jM51515c9, z19, interfaceC4339a2, label, jM51515c10, c23285v0M31078g5, z216, z215)), c28655q, 56);
                    modifier3 = modifier8;
                    z24 = z19;
                    interfaceC4339a3 = interfaceC4339a2;
                    z25 = z216;
                    z26 = z215;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18501k(label, z4, onButtonClick, modifier3, z24, z25, z26, interfaceC4339a3, i13, i14);
                }
            }
            i24 |= 1572864;
            z18 = z15;
            i27 = i14 & 128;
            if (i27 != 0) {
                i29 = i24 | 12582912;
            } else {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i29 = i24 | i28;
            }
            if ((i29 & 4793491) == 4793490) {
                if (i35 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                if (i27 != 0) {
                    c28655q2.m87150e0(-987741108);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C28376a(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                Context context6 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                long jM51515c11 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context6));
                long jM51515c12 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context6));
                C11666k c11666k6 = C11671p.f37684e;
                C13825t c13825tM48880a6 = AbstractC17269i.m48880a(c11666k6.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k6, context6)));
                C33252i c33252iM105489e6 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                C23285v0 c23285v0M31078g6 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                C28596b0 c28596b5 = AbstractC15047j1.f56336a;
                if (z4) {
                    c28655q2.m87150e0(-987715090);
                    long j18 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-987714350);
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q2.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier9 = modifier2;
                boolean z217 = z18;
                boolean z218 = z17;
                c28655q = c28655q2;
                AbstractC28683x.m87247a(c28596b5.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier9, onButtonClick, z4, c33252iM105489e6, c13825tM48880a6, jM51515c11, z19, interfaceC4339a2, label, jM51515c12, c23285v0M31078g6, z218, z217)), c28655q, 56);
                modifier3 = modifier9;
                z24 = z19;
                interfaceC4339a3 = interfaceC4339a2;
                z25 = z218;
                z26 = z217;
            } else {
                if (i35 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                if (i27 != 0) {
                    c28655q2.m87150e0(-987741108);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C28376a(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                Context context7 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                long jM51515c13 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context7));
                long jM51515c14 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context7));
                C11666k c11666k7 = C11671p.f37684e;
                C13825t c13825tM48880a7 = AbstractC17269i.m48880a(c11666k7.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k7, context7)));
                C33252i c33252iM105489e7 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                C23285v0 c23285v0M31078g7 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                C28596b0 c28596b6 = AbstractC15047j1.f56336a;
                if (z4) {
                    c28655q2.m87150e0(-987715090);
                    long j19 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-987714350);
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q2.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier10 = modifier2;
                boolean z219 = z18;
                boolean z2110 = z17;
                c28655q = c28655q2;
                AbstractC28683x.m87247a(c28596b6.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier10, onButtonClick, z4, c33252iM105489e7, c13825tM48880a7, jM51515c13, z19, interfaceC4339a2, label, jM51515c14, c23285v0M31078g7, z2110, z219)), c28655q, 56);
                modifier3 = modifier10;
                z24 = z19;
                interfaceC4339a3 = interfaceC4339a2;
                z25 = z2110;
                z26 = z219;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18501k(label, z4, onButtonClick, modifier3, z24, z25, z26, interfaceC4339a3, i13, i14);
            }
        }
        i34 |= 3072;
        modifier2 = modifier;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z16 = z13;
                if (c28655q2.m87155h(z16)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i34 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                i24 = i34 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z17 = z14;
            } else {
                z17 = z14;
                if (c28655q2.m87155h(z17)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i24 = i34 | i19;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                if ((1572864 & i13) == 0) {
                    z18 = z15;
                    if (c28655q2.m87155h(z18)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i24 |= i26;
                }
                i27 = i14 & 128;
                if (i27 != 0) {
                    i29 = i24 | 12582912;
                } else {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i29 = i24 | i28;
                }
                if ((i29 & 4793491) == 4793490) {
                    if (i35 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    }
                    if (i27 != 0) {
                        c28655q2.m87150e0(-987741108);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C28376a(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    Context context8 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    long jM51515c15 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context8));
                    long jM51515c16 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context8));
                    C11666k c11666k8 = C11671p.f37684e;
                    C13825t c13825tM48880a8 = AbstractC17269i.m48880a(c11666k8.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k8, context8)));
                    C33252i c33252iM105489e8 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                    C23285v0 c23285v0M31078g8 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                    C28596b0 c28596b7 = AbstractC15047j1.f56336a;
                    if (z4) {
                        c28655q2.m87150e0(-987715090);
                        long j110 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        }
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-987714350);
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        c28655q2.m87173q(false);
                        f13 = 0.38f;
                    }
                    Modifier modifier11 = modifier2;
                    boolean z2111 = z18;
                    boolean z2112 = z17;
                    c28655q = c28655q2;
                    AbstractC28683x.m87247a(c28596b7.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier11, onButtonClick, z4, c33252iM105489e8, c13825tM48880a8, jM51515c15, z19, interfaceC4339a2, label, jM51515c16, c23285v0M31078g8, z2112, z2111)), c28655q, 56);
                    modifier3 = modifier11;
                    z24 = z19;
                    interfaceC4339a3 = interfaceC4339a2;
                    z25 = z2112;
                    z26 = z2111;
                } else {
                    if (i35 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    }
                    if (i27 != 0) {
                        c28655q2.m87150e0(-987741108);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C28376a(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    Context context9 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    long jM51515c17 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context9));
                    long jM51515c18 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context9));
                    C11666k c11666k9 = C11671p.f37684e;
                    C13825t c13825tM48880a9 = AbstractC17269i.m48880a(c11666k9.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k9, context9)));
                    C33252i c33252iM105489e9 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                    C23285v0 c23285v0M31078g9 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                    C28596b0 c28596b8 = AbstractC15047j1.f56336a;
                    if (z4) {
                        c28655q2.m87150e0(-987715090);
                        long j111 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        }
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-987714350);
                        j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        c28655q2.m87173q(false);
                        f13 = 0.38f;
                    }
                    Modifier modifier12 = modifier2;
                    boolean z2113 = z18;
                    boolean z2114 = z17;
                    c28655q = c28655q2;
                    AbstractC28683x.m87247a(c28596b8.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier12, onButtonClick, z4, c33252iM105489e9, c13825tM48880a9, jM51515c17, z19, interfaceC4339a2, label, jM51515c18, c23285v0M31078g9, z2114, z2113)), c28655q, 56);
                    modifier3 = modifier12;
                    z24 = z19;
                    interfaceC4339a3 = interfaceC4339a2;
                    z25 = z2114;
                    z26 = z2113;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18501k(label, z4, onButtonClick, modifier3, z24, z25, z26, interfaceC4339a3, i13, i14);
                }
            }
            i24 |= 1572864;
            z18 = z15;
            i27 = i14 & 128;
            if (i27 != 0) {
                i29 = i24 | 12582912;
            } else {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i29 = i24 | i28;
            }
            if ((i29 & 4793491) == 4793490) {
                if (i35 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                if (i27 != 0) {
                    c28655q2.m87150e0(-987741108);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C28376a(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                Context context10 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                long jM51515c19 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context10));
                long jM51515c110 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context10));
                C11666k c11666k10 = C11671p.f37684e;
                C13825t c13825tM48880a10 = AbstractC17269i.m48880a(c11666k10.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k10, context10)));
                C33252i c33252iM105489e10 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                C23285v0 c23285v0M31078g10 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                C28596b0 c28596b9 = AbstractC15047j1.f56336a;
                if (z4) {
                    c28655q2.m87150e0(-987715090);
                    long j112 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-987714350);
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q2.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier13 = modifier2;
                boolean z2115 = z18;
                boolean z2116 = z17;
                c28655q = c28655q2;
                AbstractC28683x.m87247a(c28596b9.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier13, onButtonClick, z4, c33252iM105489e10, c13825tM48880a10, jM51515c19, z19, interfaceC4339a2, label, jM51515c110, c23285v0M31078g10, z2116, z2115)), c28655q, 56);
                modifier3 = modifier13;
                z24 = z19;
                interfaceC4339a3 = interfaceC4339a2;
                z25 = z2116;
                z26 = z2115;
            } else {
                if (i35 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                if (i27 != 0) {
                    c28655q2.m87150e0(-987741108);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C28376a(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                Context context11 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                long jM51515c111 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context11));
                long jM51515c112 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context11));
                C11666k c11666k11 = C11671p.f37684e;
                C13825t c13825tM48880a11 = AbstractC17269i.m48880a(c11666k11.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k11, context11)));
                C33252i c33252iM105489e11 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                C23285v0 c23285v0M31078g11 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                C28596b0 c28596b10 = AbstractC15047j1.f56336a;
                if (z4) {
                    c28655q2.m87150e0(-987715090);
                    long j113 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-987714350);
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q2.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier14 = modifier2;
                boolean z2117 = z18;
                boolean z2118 = z17;
                c28655q = c28655q2;
                AbstractC28683x.m87247a(c28596b10.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier14, onButtonClick, z4, c33252iM105489e11, c13825tM48880a11, jM51515c111, z19, interfaceC4339a2, label, jM51515c112, c23285v0M31078g11, z2118, z2117)), c28655q, 56);
                modifier3 = modifier14;
                z24 = z19;
                interfaceC4339a3 = interfaceC4339a2;
                z25 = z2118;
                z26 = z2117;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18501k(label, z4, onButtonClick, modifier3, z24, z25, z26, interfaceC4339a3, i13, i14);
            }
        }
        i34 |= 24576;
        z16 = z13;
        i18 = i14 & 32;
        if (i18 != 0) {
            i24 = i34 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z17 = z14;
        } else {
            z17 = z14;
            if (c28655q2.m87155h(z17)) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i24 = i34 | i19;
        }
        i25 = i14 & 64;
        if (i25 != 0) {
            if ((1572864 & i13) == 0) {
                z18 = z15;
                if (c28655q2.m87155h(z18)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i24 |= i26;
            }
            i27 = i14 & 128;
            if (i27 != 0) {
                i29 = i24 | 12582912;
            } else {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i29 = i24 | i28;
            }
            if ((i29 & 4793491) == 4793490) {
                if (i35 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                if (i27 != 0) {
                    c28655q2.m87150e0(-987741108);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C28376a(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                Context context12 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                long jM51515c113 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context12));
                long jM51515c114 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context12));
                C11666k c11666k12 = C11671p.f37684e;
                C13825t c13825tM48880a12 = AbstractC17269i.m48880a(c11666k12.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k12, context12)));
                C33252i c33252iM105489e12 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                C23285v0 c23285v0M31078g12 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                C28596b0 c28596b11 = AbstractC15047j1.f56336a;
                if (z4) {
                    c28655q2.m87150e0(-987715090);
                    long j114 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-987714350);
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q2.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier15 = modifier2;
                boolean z2119 = z18;
                boolean z21110 = z17;
                c28655q = c28655q2;
                AbstractC28683x.m87247a(c28596b11.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier15, onButtonClick, z4, c33252iM105489e12, c13825tM48880a12, jM51515c113, z19, interfaceC4339a2, label, jM51515c114, c23285v0M31078g12, z21110, z2119)), c28655q, 56);
                modifier3 = modifier15;
                z24 = z19;
                interfaceC4339a3 = interfaceC4339a2;
                z25 = z21110;
                z26 = z2119;
            } else {
                if (i35 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                if (i27 != 0) {
                    c28655q2.m87150e0(-987741108);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C28376a(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                Context context13 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                long jM51515c115 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context13));
                long jM51515c116 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context13));
                C11666k c11666k13 = C11671p.f37684e;
                C13825t c13825tM48880a13 = AbstractC17269i.m48880a(c11666k13.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k13, context13)));
                C33252i c33252iM105489e13 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                C23285v0 c23285v0M31078g13 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
                C28596b0 c28596b12 = AbstractC15047j1.f56336a;
                if (z4) {
                    c28655q2.m87150e0(-987715090);
                    long j115 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-987714350);
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q2.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier16 = modifier2;
                boolean z21111 = z18;
                boolean z21112 = z17;
                c28655q = c28655q2;
                AbstractC28683x.m87247a(c28596b12.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier16, onButtonClick, z4, c33252iM105489e13, c13825tM48880a13, jM51515c115, z19, interfaceC4339a2, label, jM51515c116, c23285v0M31078g13, z21112, z21111)), c28655q, 56);
                modifier3 = modifier16;
                z24 = z19;
                interfaceC4339a3 = interfaceC4339a2;
                z25 = z21112;
                z26 = z21111;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18501k(label, z4, onButtonClick, modifier3, z24, z25, z26, interfaceC4339a3, i13, i14);
            }
        }
        i24 |= 1572864;
        z18 = z15;
        i27 = i14 & 128;
        if (i27 != 0) {
            i29 = i24 | 12582912;
        } else {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i29 = i24 | i28;
        }
        if ((i29 & 4793491) == 4793490) {
            if (i35 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (i16 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (i18 != 0) {
                z17 = false;
            }
            if (i25 != 0) {
                z18 = false;
            }
            if (i27 != 0) {
                c28655q2.m87150e0(-987741108);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C28376a(7);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q2.m87173q(false);
                interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            Context context14 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            long jM51515c117 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context14));
            long jM51515c118 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context14));
            C11666k c11666k14 = C11671p.f37684e;
            C13825t c13825tM48880a14 = AbstractC17269i.m48880a(c11666k14.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k14, context14)));
            C33252i c33252iM105489e14 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
            C23285v0 c23285v0M31078g14 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
            C28596b0 c28596b13 = AbstractC15047j1.f56336a;
            if (z4) {
                c28655q2.m87150e0(-987715090);
                long j116 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                }
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-987714350);
                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j7);
                } else {
                    AbstractC17918w0.m51536x(j7);
                }
                c28655q2.m87173q(false);
                f13 = 0.38f;
            }
            Modifier modifier17 = modifier2;
            boolean z21113 = z18;
            boolean z21114 = z17;
            c28655q = c28655q2;
            AbstractC28683x.m87247a(c28596b13.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier17, onButtonClick, z4, c33252iM105489e14, c13825tM48880a14, jM51515c117, z19, interfaceC4339a2, label, jM51515c118, c23285v0M31078g14, z21114, z21113)), c28655q, 56);
            modifier3 = modifier17;
            z24 = z19;
            interfaceC4339a3 = interfaceC4339a2;
            z25 = z21114;
            z26 = z21113;
        } else {
            if (i35 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (i16 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (i18 != 0) {
                z17 = false;
            }
            if (i25 != 0) {
                z18 = false;
            }
            if (i27 != 0) {
                c28655q2.m87150e0(-987741108);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C28376a(7);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q2.m87173q(false);
                interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            Context context15 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            long jM51515c119 = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(C11671p.f37684e, context15));
            long jM51515c1110 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, context15));
            C11666k c11666k15 = C11671p.f37684e;
            C13825t c13825tM48880a15 = AbstractC17269i.m48880a(c11666k15.f37661c.f37657b, AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k15, context15)));
            C33252i c33252iM105489e15 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
            C23285v0 c23285v0M31078g15 = AbstractC11673r.m31078g(C11671p.f37684e, c28655q2);
            C28596b0 c28596b14 = AbstractC15047j1.f56336a;
            if (z4) {
                c28655q2.m87150e0(-987715090);
                long j117 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                }
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-987714350);
                j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j7);
                } else {
                    AbstractC17918w0.m51536x(j7);
                }
                c28655q2.m87173q(false);
                f13 = 0.38f;
            }
            Modifier modifier18 = modifier2;
            boolean z21115 = z18;
            boolean z21116 = z17;
            c28655q = c28655q2;
            AbstractC28683x.m87247a(c28596b14.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(823672340, c28655q, new C28470g(modifier18, onButtonClick, z4, c33252iM105489e15, c13825tM48880a15, jM51515c119, z19, interfaceC4339a2, label, jM51515c1110, c23285v0M31078g15, z21116, z21115)), c28655q, 56);
            modifier3 = modifier18;
            z24 = z19;
            interfaceC4339a3 = interfaceC4339a2;
            z25 = z21116;
            z26 = z21115;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18501k(label, z4, onButtonClick, modifier3, z24, z25, z26, interfaceC4339a3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m56342j(final String str, final long j7, final C23285v0 c23285v0, final boolean z4, final boolean z13, final boolean z14, Composer composer, final int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(81045877);
        if (((i13 | (c28655q.m87153g(str) ? 4 : 2) | (c28655q.m87151f(j7) ? 32 : 16) | (c28655q.m87153g(c23285v0) ? 256 : 128) | (c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87155h(z14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST)) & 74899) == 74898 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC22953f.m66714a(null, C2299e.f9117z, false, AbstractC37817c.m121344e(1456958795, c28655q, new C28471h(str, j7, c23285v0, z13, z14, AbstractC17918w0.m51515c(AbstractC11673r.m31079h(C11671p.f37684e, (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b))), z4)), c28655q, 3120, 5);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(str, j7, c23285v0, z4, z13, z14, i13) { // from class: oy.e

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ boolean f114776E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ boolean f114777F;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ String f114778w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ long f114779x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ C23285v0 f114780y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ boolean f114781z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(1);
                    AbstractC20301a.m56342j(this.f114778w, this.f114779x, this.f114780y, this.f114781z, this.f114776E, this.f114777F, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m56343k(String text, Modifier modifier, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-987606108);
        int i16 = (c28655q.m87153g(text) ? 4 : 2) | i13;
        int i17 = i14 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 = i16 | 384;
        } else {
            i15 = i16 | (c28655q.m87155h(z4) ? 256 : 128);
        }
        int i19 = i14 & 8;
        if (i19 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            if (i17 != 0) {
                modifier = C2314t.f9131w;
            }
            if (i18 != 0) {
                z4 = true;
            }
            if (i19 != 0) {
                z13 = false;
            }
            m56338f(z13, AbstractC37817c.m121344e(-1648699462, c28655q, new C2575m4(z4, modifier, z13, text)), c28655q, ((i15 >> 9) & 14) | 48);
        }
        Modifier modifier2 = modifier;
        boolean z14 = z4;
        boolean z15 = z13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2559k4(text, modifier2, z14, z15, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m56344l(C15430u2 c15430u2, Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-181120090);
        int i14 = (c28655q.m87157i(c15430u2) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t((C13081r1) c15430u2.f58003e, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c15430u2.f58001c, c28655q, 0);
            boolean zBooleanValue = ((Boolean) interfaceC28601c1M83597t.getValue()).booleanValue();
            String strM113396S = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t2.getValue(), c28655q);
            c28655q.m87150e0(119073301);
            boolean zM87157i = c28655q.m87157i(c15430u2) | c28655q.m87153g(interfaceC28601c1M83597t);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C14408a(18, c15430u2, interfaceC28601c1M83597t);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            modifier2 = modifier;
            AbstractC37926s0.m121463a(modifier2, "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG", zBooleanValue, strM113396S, true, (Function1) objM87133R, c28655q, ((i14 >> 3) & 14) | 24624, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(c15430u2, modifier2, i13, 8);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final C26027a m56345m(C16761x1 c16761x1) {
        AbstractC22676k.m65750j(c16761x1, "<this>");
        String str = c16761x1.f64423w;
        C16636c2 c16636c2 = c16761x1.f64424x;
        C16666h2 c16666h2 = c16761x1.f64425y;
        C16671i1 c16671i1 = c16761x1.f64426z;
        C17928b c17928b = c16761x1.f64402E;
        boolean z4 = c16761x1.f64403F;
        boolean z13 = c16761x1.f64404G;
        C16689l1 c16689l1 = c16761x1.f64407J;
        List list = c16761x1.f64408K;
        boolean z14 = c16761x1.f64409L;
        List list2 = c16761x1.f64410M;
        List list3 = c16761x1.f64411N;
        AbstractC16737t1 abstractC16737t1 = c16761x1.f64413P;
        List list4 = c16761x1.f64415R;
        return new C26027a(str, c16636c2, c16666h2, c16761x1.f64416S, c16671i1, c17928b, z4, z13, c16689l1, list, z14, list2, list3, abstractC16737t1, c16761x1.f64414Q, list4, c16761x1.f64418U, c16761x1.f64419V, null, c16761x1.f64420W, c16761x1.f64417T, c16761x1.f64421X, c16761x1.f64422Y, c16761x1.f64405H);
    }

    /* JADX INFO: renamed from: n */
    public static final C23806v0 m56346n(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        return new C23806v0(abstractC23811y);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static String m56347o(InterfaceC31162w interfaceC31162w, int i13) {
        String strM113817b;
        boolean z4 = (i13 & 1) != 0;
        boolean z13 = (i13 & 2) != 0;
        AbstractC22676k.m65750j(interfaceC31162w, "<this>");
        StringBuilder sb4 = new StringBuilder();
        if (z13) {
            if (interfaceC31162w instanceof InterfaceC31132j) {
                strM113817b = "<init>";
            } else {
                strM113817b = ((AbstractC34690n) interfaceC31162w).getName().m113817b();
                AbstractC22676k.m65749i(strM113817b, "asString(...)");
            }
            sb4.append(strM113817b);
        }
        sb4.append("(");
        InterfaceC31151q0 interfaceC31151q0Mo78667B = interfaceC31162w.mo78667B();
        C34749c c34749c = C34749c.f146401w;
        if (interfaceC31151q0Mo78667B != null) {
            AbstractC23811y type = ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
            AbstractC22676k.m65749i(type, "getType(...)");
            sb4.append((AbstractC27769l) AbstractC12240d.m34050P(type, C27777t.f111974i, c34749c));
        }
        Iterator it = interfaceC31162w.mo78676v().iterator();
        while (it.hasNext()) {
            AbstractC23811y type2 = ((AbstractC34711x0) ((InterfaceC31107a1) it.next())).getType();
            AbstractC22676k.m65749i(type2, "getType(...)");
            sb4.append((AbstractC27769l) AbstractC12240d.m34050P(type2, C27777t.f111974i, c34749c));
        }
        sb4.append(")");
        if (z4) {
            if (interfaceC31162w instanceof InterfaceC31132j) {
                sb4.append("V");
            } else {
                AbstractC23811y returnType = interfaceC31162w.getReturnType();
                AbstractC22676k.m65747g(returnType);
                C35850h c35850h = AbstractC27736h.f111789e;
                if (AbstractC27736h.m83803E(returnType, AbstractC27741m.f111849d)) {
                    AbstractC23811y returnType2 = interfaceC31162w.getReturnType();
                    AbstractC22676k.m65747g(returnType2);
                    if (!AbstractC23767d1.m69849e(returnType2) && !(interfaceC31162w instanceof InterfaceC31147o0)) {
                        sb4.append("V");
                    }
                }
                AbstractC23811y returnType3 = interfaceC31162w.getReturnType();
                AbstractC22676k.m65747g(returnType3);
                sb4.append((AbstractC27769l) AbstractC12240d.m34050P(returnType3, C27777t.f111974i, c34749c));
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: p */
    public static final String m56348p(InterfaceC31108b interfaceC31108b) {
        AbstractC22676k.m65750j(interfaceC31108b, "<this>");
        if (!AbstractC39363f.m125531m(interfaceC31108b)) {
            InterfaceC31135k interfaceC31135kMo60581g = interfaceC31108b.mo60581g();
            InterfaceC31117e interfaceC31117e = interfaceC31135kMo60581g instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135kMo60581g : null;
            if (interfaceC31117e != null && !interfaceC31117e.getName().f152621x) {
                InterfaceC31108b interfaceC31108bMo78660a = interfaceC31108b.mo78660a();
                C34697q0 c34697q0 = interfaceC31108bMo78660a instanceof C34697q0 ? (C34697q0) interfaceC31108bMo78660a : null;
                if (c34697q0 != null) {
                    return AbstractC12667a.m35446R(interfaceC31117e, m56347o(c34697q0, 3));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m56349q(AbstractC23811y abstractC23811y, InterfaceC23796q0 interfaceC23796q0, Set set) {
        boolean zM56349q;
        if (AbstractC22676k.m65745e(abstractC23811y.mo69844i0(), interfaceC23796q0)) {
            return true;
        }
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        InterfaceC31129i interfaceC31129i = interfaceC31126hMo1784d instanceof InterfaceC31129i ? (InterfaceC31129i) interfaceC31126hMo1784d : null;
        List listMo60497j = interfaceC31129i != null ? interfaceC31129i.mo60497j() : null;
        Iterable iterableM74105J1 = AbstractC25265s.m74105J1(abstractC23811y.mo69842X());
        if (!(iterableM74105J1 instanceof Collection) || !((Collection) iterableM74105J1).isEmpty()) {
            Iterator it = iterableM74105J1.iterator();
            do {
                C25241d0 c25241d0 = (C25241d0) it;
                if (c25241d0.f99123x.hasNext()) {
                    C25239c0 c25239c0 = (C25239c0) c25241d0.next();
                    int i13 = c25239c0.f99117a;
                    AbstractC23804u0 abstractC23804u0 = (AbstractC23804u0) c25239c0.f99118b;
                    InterfaceC31165x0 interfaceC31165x0 = listMo60497j != null ? (InterfaceC31165x0) AbstractC25265s.m74102I0(i13, listMo60497j) : null;
                    if ((interfaceC31165x0 == null || set == null || !set.contains(interfaceC31165x0)) && !abstractC23804u0.mo69869c()) {
                        AbstractC23811y abstractC23811yMo69868b = abstractC23804u0.mo69868b();
                        AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                        zM56349q = m56349q(abstractC23811yMo69868b, interfaceC23796q0, set);
                    } else {
                        zM56349q = false;
                    }
                }
            } while (!zM56349q);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static final C23806v0 m56350r(AbstractC23811y type, EnumC23776g1 enumC23776g1, InterfaceC31165x0 interfaceC31165x0) {
        AbstractC22676k.m65750j(type, "type");
        if ((interfaceC31165x0 != null ? interfaceC31165x0.getVariance() : null) == enumC23776g1) {
            enumC23776g1 = EnumC23776g1.INVARIANT;
        }
        return new C23806v0(type, enumC23776g1);
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC37138c m56351u(Collection collection, AbstractC4454f abstractC4454f) {
        Collection collection2 = collection;
        ArrayList arrayListM74092D0 = AbstractC25265s.m74092D0(collection2);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM74092D0, 10));
        Iterator it = arrayListM74092D0.iterator();
        while (it.hasNext()) {
            arrayList.add(m56308G(it.next(), abstractC4454f));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((InterfaceC37138c) obj).getDescriptor().getSerialName())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb4 = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((InterfaceC37138c) it3.next()).getDescriptor().getSerialName());
            }
            sb4.append(arrayList3);
            throw new IllegalStateException(sb4.toString().toString());
        }
        InterfaceC37138c interfaceC37138c = (InterfaceC37138c) AbstractC25265s.m74146r1(arrayList2);
        if (interfaceC37138c == null) {
            interfaceC37138c = StringSerializer.INSTANCE;
        }
        if (!interfaceC37138c.getDescriptor().isNullable() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it4 = collection2.iterator();
            while (it4.hasNext()) {
                if (it4.next() == null) {
                    return AbstractC38195a.m122336d(interfaceC37138c);
                }
            }
        }
        return interfaceC37138c;
    }

    /* JADX INFO: renamed from: v */
    public static final LinkedHashSet m56352v(AbstractC23763c0 abstractC23763c0, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m56353w(abstractC23763c0, abstractC23763c0, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: w */
    public static final void m56353w(AbstractC23811y abstractC23811y, AbstractC23763c0 abstractC23763c0, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d instanceof InterfaceC31165x0) {
            if (!AbstractC22676k.m65745e(abstractC23811y.mo69844i0(), abstractC23763c0.mo69844i0())) {
                linkedHashSet.add(interfaceC31126hMo1784d);
                return;
            }
            for (AbstractC23811y abstractC23811y2 : ((InterfaceC31165x0) interfaceC31126hMo1784d).getUpperBounds()) {
                AbstractC22676k.m65747g(abstractC23811y2);
                m56353w(abstractC23811y2, abstractC23763c0, linkedHashSet, set);
            }
            return;
        }
        InterfaceC31126h interfaceC31126hMo1784d2 = abstractC23811y.mo69844i0().mo1784d();
        InterfaceC31129i interfaceC31129i = interfaceC31126hMo1784d2 instanceof InterfaceC31129i ? (InterfaceC31129i) interfaceC31126hMo1784d2 : null;
        List listMo60497j = interfaceC31129i != null ? interfaceC31129i.mo60497j() : null;
        int i13 = 0;
        for (AbstractC23804u0 abstractC23804u0 : abstractC23811y.mo69842X()) {
            int i14 = i13 + 1;
            InterfaceC31165x0 interfaceC31165x0 = listMo60497j != null ? (InterfaceC31165x0) AbstractC25265s.m74102I0(i13, listMo60497j) : null;
            if ((interfaceC31165x0 == null || set == null || !set.contains(interfaceC31165x0)) && !abstractC23804u0.mo69869c() && !AbstractC25265s.m74155w0(linkedHashSet, abstractC23804u0.mo69868b().mo69844i0().mo1784d()) && !AbstractC22676k.m65745e(abstractC23804u0.mo69868b().mo69844i0(), abstractC23763c0.mo69844i0())) {
                AbstractC23811y abstractC23811yMo69868b = abstractC23804u0.mo69868b();
                AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                m56353w(abstractC23811yMo69868b, abstractC23763c0, linkedHashSet, set);
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: x */
    public static final HashSet m56354x(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set classifierNames = ((InterfaceC22712o) it.next()).getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            AbstractC25265s.m74141p0(hashSet, classifierNames);
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static final boolean m56355y(InterfaceC31162w f13) {
        InterfaceC31162w interfaceC31162wM40918a;
        AbstractC22676k.m65750j(f13, "f");
        if (!AbstractC22676k.m65745e(((AbstractC34690n) f13).getName().m113817b(), "remove") || f13.mo78676v().size() != 1 || (AbstractC4393e.m13813k(f13).mo60581g() instanceof InterfaceC17060c) || AbstractC27736h.m83799A(f13)) {
            return false;
        }
        List listMo78676v = f13.mo78660a().mo78676v();
        AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
        AbstractC23811y type = ((AbstractC34711x0) ((InterfaceC31107a1) AbstractC25265s.m74142p1(listMo78676v))).getType();
        AbstractC22676k.m65749i(type, "getType(...)");
        C27777t c27777t = C27777t.f111974i;
        C34749c c34749c = C34749c.f146401w;
        AbstractC27769l abstractC27769l = (AbstractC27769l) AbstractC12240d.m34050P(type, c27777t, c34749c);
        C27768k c27768k = abstractC27769l instanceof C27768k ? (C27768k) abstractC27769l : null;
        if ((c27768k != null ? c27768k.f111961i : null) != EnumC11891c.INT || (interfaceC31162wM40918a = AbstractC14309e.m40918a(f13)) == null) {
            return false;
        }
        List listMo78676v2 = interfaceC31162wM40918a.mo78660a().mo78676v();
        AbstractC22676k.m65749i(listMo78676v2, "getValueParameters(...)");
        AbstractC23811y type2 = ((AbstractC34711x0) ((InterfaceC31107a1) AbstractC25265s.m74142p1(listMo78676v2))).getType();
        AbstractC22676k.m65749i(type2, "getType(...)");
        AbstractC27769l abstractC27769l2 = (AbstractC27769l) AbstractC12240d.m34050P(type2, c27777t, c34749c);
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31162wM40918a.mo60581g();
        AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
        return AbstractC4393e.m13810h(interfaceC31135kMo60581g).equals(AbstractC27741m.f111827K.f152613a) && (abstractC27769l2 instanceof C27767j) && AbstractC22676k.m65745e(((C27767j) abstractC27769l2).f111960i, "java/lang/Object");
    }

    /* JADX INFO: renamed from: z */
    public static final AbstractC27736h m56356z(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        AbstractC27736h abstractC27736hMo1783c = abstractC23811y.mo69844i0().mo1783c();
        AbstractC22676k.m65749i(abstractC27736hMo1783c, "getBuiltIns(...)");
        return abstractC27736hMo1783c;
    }

    /* JADX INFO: renamed from: s */
    public C18715c m56357s(C18717e c18717e) {
        ByteBuffer byteBuffer = c18717e.f148801z;
        byteBuffer.getClass();
        AbstractC24543a.m71569e(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (c18717e.m1496f(Integer.MIN_VALUE)) {
            return null;
        }
        return mo56358t(c18717e, byteBuffer);
    }

    /* JADX INFO: renamed from: t */
    public abstract C18715c mo56358t(C18717e c18717e, ByteBuffer byteBuffer);
}
