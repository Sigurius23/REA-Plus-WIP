package t23;

import a00.C0072g;
import a30.C0332w0;
import android.content.Context;
import android.os.PowerManager;
import androidx.lifecycle.AbstractC1638x;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b30.C2570m;
import b33.C2689j;
import b33.EnumC2683d;
import b33.EnumC2686g;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3004e2;
import bc3.InterfaceC3027k1;
import com.whoop.service.network.model.UserState;
import d33.AbstractC11611k1;
import d33.C11602h1;
import d33.C11605i1;
import d33.C11608j1;
import d33.C11624r;
import e33.C12638j0;
import e33.C12645n;
import e33.C12662v0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13096w1;
import f53.C14118f;
import ge3.AbstractC15751g;
import hc3.C17171d;
import ih0.AbstractC18489d0;
import io.getstream.android.video.generated.models.Credentials;
import io.getstream.android.video.generated.models.GetCallResponse;
import io.getstream.android.video.generated.models.ICEServer;
import io.getstream.android.video.generated.models.JoinCallResponse;
import io.getstream.android.video.generated.models.VideoEvent;
import io.getstream.video.android.model.User;
import io.sentry.android.replay.video.C20245d;
import j43.C21319c;
import j43.C21323g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import l83.C23471q;
import l83.EnumC23463i;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mc3.AbstractC25438d;
import mc3.C25437c;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import n33.C26243q;
import org.webrtc.EglBase;
import p000.AbstractC11266d;
import p007a6.C0417e0;
import p023ay.C2147u;
import p031b9.AbstractC2875y;
import p031b9.C2817b;
import p045c6.C4258a;
import p078d1.C11457j;
import p088dc.AbstractC11895b;
import p132f0.C13774c;
import p320m5.C25067k;
import p450r5.C30929c;
import p497t7.InterfaceC33561b;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p673z7.C40137a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q33.C29953a;
import q83.AbstractC30060g;
import q83.C30065l;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s93.AbstractC32309k;
import se.AbstractC32416g;
import so.C32800q;
import stream.video.sfu.event.ReconnectDetails;
import stream.video.sfu.models.ClientCapability;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import v23.C35587a;
import v33.C35624i;
import w23.AbstractC36749g;
import w23.C36748f;
import w23.C36750h;
import w23.C36758p;
import w23.C36759q;
import w23.C36760r;
import wb3.AbstractC37056f;
import x23.C37865a;
import x23.C37866b;
import x23.C37869e;
import x23.EnumC37870f;
import yb3.AbstractC39414r;
import z23.C40031a;
import z23.C40033c;
import z33.C40053b;

/* JADX INFO: renamed from: t23.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33368c0 {

    /* JADX INFO: renamed from: A */
    public final C13045h2 f139266A;

    /* JADX INFO: renamed from: B */
    public boolean f139267B;

    /* JADX INFO: renamed from: C */
    public final C13045h2 f139268C;

    /* JADX INFO: renamed from: D */
    public String f139269D;

    /* JADX INFO: renamed from: E */
    public final String f139270E;

    /* JADX INFO: renamed from: F */
    public final ConcurrentHashMap.KeySetView f139271F;

    /* JADX INFO: renamed from: G */
    public long f139272G;

    /* JADX INFO: renamed from: H */
    public long f139273H;

    /* JADX INFO: renamed from: I */
    public final C23470p f139274I;

    /* JADX INFO: renamed from: J */
    public C12638j0 f139275J;

    /* JADX INFO: renamed from: K */
    public final C35587a f139276K;

    /* JADX INFO: renamed from: L */
    public final ConcurrentHashMap f139277L;

    /* JADX INFO: renamed from: M */
    public final C23470p f139278M;

    /* JADX INFO: renamed from: N */
    public final C14118f f139279N;

    /* JADX INFO: renamed from: O */
    public C2996c2 f139280O;

    /* JADX INFO: renamed from: P */
    public long f139281P;

    /* JADX INFO: renamed from: Q */
    public int f139282Q;

    /* JADX INFO: renamed from: R */
    public final C25437c f139283R;

    /* JADX INFO: renamed from: S */
    public C2996c2 f139284S;

    /* JADX INFO: renamed from: T */
    public C2996c2 f139285T;

    /* JADX INFO: renamed from: U */
    public C2996c2 f139286U;

    /* JADX INFO: renamed from: a */
    public final C33366b4 f139287a;

    /* JADX INFO: renamed from: b */
    public final String f139288b;

    /* JADX INFO: renamed from: c */
    public final String f139289c;

    /* JADX INFO: renamed from: d */
    public String f139290d;

    /* JADX INFO: renamed from: e */
    public final Set f139291e;

    /* JADX INFO: renamed from: f */
    public int f139292f;

    /* JADX INFO: renamed from: g */
    public final C33366b4 f139293g;

    /* JADX INFO: renamed from: h */
    public final C2817b f139294h;

    /* JADX INFO: renamed from: i */
    public C4258a f139295i;

    /* JADX INFO: renamed from: j */
    public final C23470p f139296j;

    /* JADX INFO: renamed from: k */
    public final C3004e2 f139297k;

    /* JADX INFO: renamed from: l */
    public C2996c2 f139298l;

    /* JADX INFO: renamed from: m */
    public final PowerManager f139299m;

    /* JADX INFO: renamed from: n */
    public final C17171d f139300n;

    /* JADX INFO: renamed from: o */
    public final C13096w1 f139301o;

    /* JADX INFO: renamed from: p */
    public final C33450s0 f139302p;

    /* JADX INFO: renamed from: q */
    public final C23470p f139303q;

    /* JADX INFO: renamed from: r */
    public final Object f139304r;

    /* JADX INFO: renamed from: s */
    public final Object f139305s;

    /* JADX INFO: renamed from: t */
    public final Object f139306t;

    /* JADX INFO: renamed from: u */
    public final Object f139307u;

    /* JADX INFO: renamed from: v */
    public final String f139308v;

    /* JADX INFO: renamed from: w */
    public C29953a f139309w;

    /* JADX INFO: renamed from: x */
    public final C0072g f139310x;

    /* JADX INFO: renamed from: y */
    public final C40137a f139311y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f139312z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    public C33368c0(C33366b4 c33366b4, String type, String str, User user) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user, "user");
        this.f139287a = c33366b4;
        this.f139288b = type;
        this.f139289c = str;
        this.f139291e = Collections.synchronizedSet(new LinkedHashSet());
        this.f139293g = c33366b4;
        this.f139294h = new C2817b(c33366b4.f139260x);
        this.f139295i = new C4258a(1);
        this.f139296j = AbstractC1772c1.m5382S(this, "Call:" + type + ":" + str);
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        this.f139297k = c3004e2M8710d;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(c33366b4.f139260x.getCoroutineContext().plus(c3004e2M8710d));
        this.f139300n = c17171dM8708b;
        int i13 = 0;
        PowerManager powerManager = 0;
        powerManager = 0;
        powerManager = 0;
        this.f139301o = AbstractC13091v.m36592b(0, 150, null, 5);
        C33450s0 c33450s0 = new C33450s0(c33366b4, this, user, c17171dM8708b);
        this.f139302p = c33450s0;
        this.f139303q = AbstractC30060g.m92088H(new C33414l(this, 3));
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this.f139304r = AbstractC30060g.m92087G(enumC23463i, new C33414l(this, i13));
        this.f139305s = AbstractC30060g.m92087G(enumC23463i, new C33414l(this, 2));
        this.f139306t = AbstractC30060g.m92087G(enumC23463i, new C33414l(this, 9));
        this.f139307u = AbstractC30060g.m92087G(enumC23463i, new C33414l(this, 7));
        this.f139308v = AbstractC18489d0.m53370k(type, ":", str);
        this.f139310x = new C0072g(new C33414l(this, 8));
        this.f139311y = new C40137a(3);
        this.f139312z = AbstractC13091v.m36593c(null);
        this.f139266A = AbstractC13091v.m36593c(AbstractC37056f.m118959K(0, 0, 0));
        this.f139268C = AbstractC13091v.m36593c(null);
        this.f139269D = AbstractC11895b.m31995n("toString(...)");
        this.f139270E = AbstractC11895b.m31995n("toString(...)");
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        AbstractC22676k.m65749i(keySetViewNewKeySet, "newKeySet(...)");
        this.f139271F = keySetViewNewKeySet;
        this.f139274I = AbstractC30060g.m92088H(C33424n.f139550x);
        this.f139276K = new C35587a(c33366b4.f139259w, str, type, c33450s0.f139662m, c33450s0.f139652h, c33450s0.f139680v.f81695j, c33366b4.f139248U.f139408k, c17171dM8708b);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("CLIENT_CAPABILITY_SUBSCRIBER_VIDEO_PAUSE", ClientCapability.CLIENT_CAPABILITY_SUBSCRIBER_VIDEO_PAUSE);
        this.f139277L = concurrentHashMap;
        this.f139278M = AbstractC30060g.m92088H(new C33444r(this));
        this.f139279N = new C14118f(this, 1);
        this.f139282Q = InterfaceC33561b.INVALID_OWNERSHIP;
        this.f139283R = AbstractC25438d.m74669a();
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C33399i(this, powerManager, i13), 3);
        try {
            Object systemService = c33366b4.f139259w.getSystemService("power");
            if (systemService instanceof PowerManager) {
                powerManager = (PowerManager) systemService;
            }
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
        this.f139299m = powerManager;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m105807o(C33368c0 c33368c0, C33421m1 c33421m1, String str, String str2, Boolean bool, C37865a c37865a, AbstractC32269c abstractC32269c, int i13) {
        return c33368c0.m105822n((i13 & 1) != 0 ? null : c33421m1, str, (i13 & 4) != 0 ? null : str2, false, false, (i13 & 64) != 0 ? null : bool, c37865a, abstractC32269c);
    }

    /* JADX INFO: renamed from: q */
    public static void m105808q(C33368c0 c33368c0) {
        C2345k c2345kM105816g = c33368c0.m105816g();
        InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM105816g.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM105816g.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[leave] #ringing; no args, call_cid:", c33368c0.f139308v), null);
        }
        c33368c0.f139295i.m13289a(new C30929c(6, c33368c0, new C33380e0(UserState.Sources.USER)));
    }

    /* JADX INFO: renamed from: r */
    public static void m105809r(C33368c0 c33368c0, JoinCallResponse joinCallResponse) {
        Object value;
        Object value2;
        C2996c2 c2996c2 = c33368c0.f139286U;
        C13045h2 session = c33368c0.f139268C;
        C35587a c35587a = c33368c0.f139276K;
        C17171d c17171d = c33368c0.f139300n;
        InterfaceC30057d interfaceC30057d = null;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        long reportingIntervalMs = joinCallResponse.getStatsOptions().getReportingIntervalMs();
        C2996c2 c2996c3 = c33368c0.f139298l;
        if (c2996c3 != null) {
            c2996c3.cancel((CancellationException) null);
        }
        c33368c0.f139298l = AbstractC3006f0.m8732z(c17171d, null, null, new C13774c(reportingIntervalMs, c33368c0, (InterfaceC30057d) null), 3);
        c33368c0.f139286U = AbstractC3006f0.m8732z(c17171d, null, null, new C33399i(c33368c0, interfaceC30057d, 3), 3);
        C2996c2 c2996c4 = c33368c0.f139284S;
        if (c2996c4 != null) {
            c2996c4.cancel((CancellationException) null);
        }
        C36758p c36758p = c35587a.f151341d;
        c36758p.getClass();
        C36760r c36760r = c36758p.f157314g;
        AbstractC22676k.m65750j(session, "session");
        InterfaceC3027k1 interfaceC3027k1 = ((C36759q) c36760r.f157322b.f45200w.getValue()).f157316a;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        C13045h2 c13045h2 = c36760r.f157321a;
        do {
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C36759q.m117872a((C36759q) value, null, null, null, null, null, 30)));
        InterfaceC3027k1 interfaceC3027k2 = ((C36759q) c36760r.f157322b.f45200w.getValue()).f157316a;
        if (interfaceC3027k2 != null) {
            interfaceC3027k2.cancel((CancellationException) null);
        }
        C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(c36758p.f157310c, null, null, new C2147u(c36758p, session, interfaceC30057d, 25), 3);
        C13045h2 c13045h3 = c36760r.f157321a;
        do {
            value2 = c13045h3.getValue();
        } while (!c13045h3.m36569i(value2, C36759q.m117872a((C36759q) value2, c2996c2M8732z, null, null, null, null, 30)));
        C20245d c20245d = c35587a.f151343f;
        C13045h2 participants = c33368c0.f139302p.f139680v.f81695j;
        c20245d.getClass();
        AbstractC22676k.m65750j(participants, "participants");
        C2996c2 c2996c5 = (C2996c2) c20245d.f76052h;
        if (c2996c5 != null) {
            c2996c5.cancel((CancellationException) null);
        }
        c20245d.f76052h = AbstractC3006f0.m8732z((C17171d) c20245d.f76050f, null, null, new C36748f(session, participants, c20245d, null), 3);
        c33368c0.f139284S = AbstractC3006f0.m8732z(c17171d, null, null, new C33464v(c33368c0, null), 3);
        C2996c2 c2996c6 = c33368c0.f139285T;
        if (c2996c6 != null) {
            c2996c6.cancel((CancellationException) null);
        }
        c33368c0.f139285T = AbstractC3006f0.m8732z(c17171d, null, null, new C33399i(c33368c0, interfaceC30057d, 4), 3);
        ((C40053b) c33368c0.f139303q.getValue()).m128402d(c33368c0.f139279N);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:53:0x0174 A[LOOP:0: B:51:0x016e->B:53:0x0174, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0203  */
    /* JADX WARN: Code duplicated, block: B:71:0x0211  */
    /* JADX WARN: Code duplicated, block: B:74:0x021a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x021c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0252  */
    /* JADX WARN: Code duplicated, block: B:81:0x0257  */
    /* JADX WARN: Code duplicated, block: B:82:0x0261  */
    /* JADX WARN: Code duplicated, block: B:84:0x0265  */
    /* JADX WARN: Code duplicated, block: B:86:0x026d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0294  */
    /* JADX WARN: Code duplicated, block: B:93:0x029c  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:98:0x02af  */
    /* JADX INFO: renamed from: a */
    public final Object m105810a(boolean z4, C33421m1 c33421m1, Boolean bool, C37865a c37865a, AbstractC32269c abstractC32269c) {
        C33409k c33409k;
        Boolean bool2;
        C37865a c37865a2;
        C33368c0 c33368c0;
        C33368c0 c33368c1;
        AbstractC26205h abstractC26205h;
        ArrayList arrayList;
        Iterator<T> it;
        C11602h1 c11602h1;
        C11602h1 c11602h2;
        AbstractC11611k1 abstractC11611k1;
        C33368c0 c33368c2;
        AbstractC26205h abstractC26205h2;
        C33391g1 c33391g1;
        C17171d c17171d;
        C33450s0 c33450s0;
        InterfaceC33377d3 interfaceC33377d3;
        C21319c c21319cM9548b;
        boolean z13;
        C2345k c2345kM105845a;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        String message;
        boolean z14 = z4;
        C33421m1 c33421m2 = c33421m1;
        if (abstractC32269c instanceof C33409k) {
            c33409k = (C33409k) abstractC32269c;
            int i13 = c33409k.f139487H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33409k.f139487H = i13 - Integer.MIN_VALUE;
            } else {
                c33409k = new C33409k(this, abstractC32269c);
            }
        } else {
            c33409k = new C33409k(this, abstractC32269c);
        }
        C33409k c33409k2 = c33409k;
        Object objM105807o = c33409k2.f139485F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33409k2.f139487H;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM105807o);
            this.f139292f = 0;
            C2996c2 c2996c2 = this.f139286U;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            if (this.f139268C.getValue() != null) {
                return new C26203f(new C26198a(AbstractC11895b.m31996o("Call ", this.f139308v, " has already been joined")));
            }
            C2345k c2345kM105816g = m105816g();
            InterfaceC2339e interfaceC2339e2 = c2345kM105816g.f9275c;
            String str2 = c2345kM105816g.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM105816g.f9274b.log(enumC2341g2, str2, "[joinInternal] #track; create: " + z14 + ", ring: false, notify: false, createOptions: " + c33421m2, null);
            }
            this.f139272G = System.currentTimeMillis();
            c33409k2.f139488w = this;
            c33409k2.f139489x = c33421m2;
            c33409k2.f139490y = bool;
            c33409k2.f139491z = c37865a;
            c33409k2.f139484E = z14;
            c33409k2.f139487H = 1;
            Object objM105798p = this.f139293g.m105798p(c33409k2);
            if (objM105798p != enumC31071a) {
                bool2 = bool;
                c37865a2 = c37865a;
                objM105807o = objM105798p;
                c33368c0 = this;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            z14 = c33409k2.f139484E;
            C37865a c37865a3 = c33409k2.f139491z;
            Boolean bool3 = c33409k2.f139490y;
            C33421m1 c33421m3 = (C33421m1) c33409k2.f139489x;
            C33368c0 c33368c3 = c33409k2.f139488w;
            AbstractC34132o.m107864I(objM105807o);
            c37865a2 = c37865a3;
            bool2 = bool3;
            c33421m2 = c33421m3;
            c33368c0 = c33368c3;
        } else {
            if (i14 == 2) {
                c33368c1 = c33409k2.f139488w;
                AbstractC34132o.m107864I(objM105807o);
                abstractC26205h = (AbstractC26205h) objM105807o;
                if (!(abstractC26205h instanceof C26204g)) {
                    AbstractC22676k.m65748h(abstractC26205h, "null cannot be cast to non-null type io.getstream.result.Result.Failure");
                    return (C26203f) abstractC26205h;
                }
                JoinCallResponse joinCallResponse = (JoinCallResponse) ((C26204g) abstractC26205h).f103919a;
                String token = joinCallResponse.getCredentials().getToken();
                String url = joinCallResponse.getCredentials().getServer().getUrl();
                String wsEndpoint = joinCallResponse.getCredentials().getServer().getWsEndpoint();
                String edgeName = joinCallResponse.getCredentials().getServer().getEdgeName();
                List<ICEServer> iceServers = joinCallResponse.getCredentials().getIceServers();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(iceServers, 10));
                it = iceServers.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC32416g.m101143L((ICEServer) it.next()));
                }
                String str3 = c33368c1.f139269D;
                C33366b4 c33366b4 = c33368c1.f139293g;
                String str4 = c33366b4.f139261y;
                AbstractC1638x abstractC1638x = c33366b4.f139232E.f168476d;
                C33366b4 c33366b5 = c33368c1.f139287a;
                PowerManager powerManager = c33368c1.f139299m;
                C2570m c2570m = c33368c1.f139276K.f151340c;
                ((C0332w0) c2570m.f9985F).m851O(edgeName);
                C11602h1 c11602h3 = new C11602h1(c33366b5, 0, powerManager, c33368c1, str3, str4, abstractC1638x, url, wsEndpoint, token, edgeName, arrayList, c2570m, 3141634);
                C13045h2 c13045h2 = c33368c1.f139268C;
                c13045h2.getClass();
                c13045h2.m36571k(null, c11602h3);
                c11602h1 = (C11602h1) c13045h2.getValue();
                if (c11602h1 != null) {
                    C13045h2 c13045h3 = c33368c1.f139302p.f139650g;
                    C33417l2 c33417l2 = new C33417l2(c11602h1);
                    c13045h3.getClass();
                    c13045h3.m36571k(null, c33417l2);
                }
                c11602h2 = (C11602h1) c13045h2.getValue();
                if (c11602h2 != null) {
                    c33409k2.f139488w = c33368c1;
                    c33409k2.f139489x = abstractC26205h;
                    c33409k2.f139487H = 3;
                    objM105807o = c11602h2.m31037m(null, null, null, c33409k2);
                    if (objM105807o != enumC31071a) {
                        c33368c2 = c33368c1;
                        abstractC26205h2 = abstractC26205h;
                    }
                    return enumC31071a;
                }
                abstractC11611k1 = null;
                if (!(abstractC11611k1 instanceof C11605i1)) {
                    if (abstractC11611k1 instanceof C11608j1) {
                        message = ((C11608j1) abstractC11611k1).f37473a.getMessage();
                        if (message == null) {
                            message = "RtcSession error occurred.";
                        }
                        return new C26203f(new C26198a(message));
                    }
                    if (abstractC11611k1 == null) {
                        return new C26203f(new C26198a("RtcSession was null during connect"));
                    }
                }
                c33391g1 = c33368c1.f139287a.f139248U;
                c33391g1.getClass();
                c17171d = c33368c1.f139300n;
                C13045h2 c13045h4 = c33391g1.f139403f;
                c13045h4.getClass();
                c13045h4.m36571k(null, c33368c1);
                c33450s0 = c33368c1.f139302p;
                interfaceC33377d3 = (InterfaceC33377d3) c33450s0.f139618G.getValue();
                c21319cM9548b = c33391g1.f139406i.m9548b(c33368c1.f139288b);
                z13 = c21319cM9548b.f81521a;
                if (interfaceC33377d3 instanceof C33487z2) {
                    c33391g1.m105849e(c33368c1);
                    if (z13) {
                        AbstractC3006f0.m8732z(c17171d, null, null, new C33386f1(c33391g1, c33368c1, interfaceC30057d, 0), 3);
                    }
                } else if (interfaceC33377d3 instanceof C33359a3) {
                    if (!c33450s0.f139613B0.get()) {
                        c33391g1.m105849e(c33368c1);
                    }
                    boolean zM59854d = new C21323g(0).m59854d(c33391g1.f139398a.f139259w, c21319cM9548b.f81524d);
                    if (z13 && !zM59854d) {
                        c2345kM105845a = c33391g1.m105845a();
                        interfaceC2339e = c2345kM105845a.f9275c;
                        str = c2345kM105845a.f9273a;
                        enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                            c2345kM105845a.f9274b.log(enumC2341g, str, "Outgoing call service should already be running", null);
                        }
                    }
                } else {
                    c33391g1.m105848d(c33368c1);
                    if (z13) {
                        AbstractC3006f0.m8732z(c17171d, null, null, new C33386f1(c33391g1, c33368c1, interfaceC30057d, 1), 3);
                    } else if (interfaceC33377d3 instanceof C33482y2) {
                        c33450s0.m105868k(null);
                    }
                }
                m105809r(c33368c1, (JoinCallResponse) ((C26204g) abstractC26205h).f103919a);
                Object value = c33368c1.f139268C.getValue();
                AbstractC22676k.m65747g(value);
                return new C26204g(value);
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC26205h2 = (AbstractC26205h) c33409k2.f139489x;
            c33368c2 = c33409k2.f139488w;
            AbstractC34132o.m107864I(objM105807o);
        }
        abstractC11611k1 = (AbstractC11611k1) objM105807o;
        C33368c0 c33368c4 = c33368c2;
        abstractC26205h = abstractC26205h2;
        c33368c1 = c33368c4;
        if (!(abstractC11611k1 instanceof C11605i1)) {
            if (abstractC11611k1 instanceof C11608j1) {
                message = ((C11608j1) abstractC11611k1).f37473a.getMessage();
                if (message == null) {
                    message = "RtcSession error occurred.";
                }
                return new C26203f(new C26198a(message));
            }
            if (abstractC11611k1 == null) {
                return new C26203f(new C26198a("RtcSession was null during connect"));
            }
        }
        c33391g1 = c33368c1.f139287a.f139248U;
        c33391g1.getClass();
        c17171d = c33368c1.f139300n;
        C13045h2 c13045h5 = c33391g1.f139403f;
        c13045h5.getClass();
        c13045h5.m36571k(null, c33368c1);
        c33450s0 = c33368c1.f139302p;
        interfaceC33377d3 = (InterfaceC33377d3) c33450s0.f139618G.getValue();
        c21319cM9548b = c33391g1.f139406i.m9548b(c33368c1.f139288b);
        z13 = c21319cM9548b.f81521a;
        if (interfaceC33377d3 instanceof C33487z2) {
            c33391g1.m105849e(c33368c1);
            if (z13) {
                AbstractC3006f0.m8732z(c17171d, null, null, new C33386f1(c33391g1, c33368c1, interfaceC30057d, 0), 3);
            }
        } else if (interfaceC33377d3 instanceof C33359a3) {
            if (!c33450s0.f139613B0.get()) {
                c33391g1.m105849e(c33368c1);
            }
            boolean zM59854d2 = new C21323g(0).m59854d(c33391g1.f139398a.f139259w, c21319cM9548b.f81524d);
            if (z13) {
                c2345kM105845a = c33391g1.m105845a();
                interfaceC2339e = c2345kM105845a.f9275c;
                str = c2345kM105845a.f9273a;
                enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM105845a.f9274b.log(enumC2341g, str, "Outgoing call service should already be running", null);
                }
            }
        } else {
            c33391g1.m105848d(c33368c1);
            if (z13) {
                AbstractC3006f0.m8732z(c17171d, null, null, new C33386f1(c33391g1, c33368c1, interfaceC30057d, 1), 3);
            } else if (interfaceC33377d3 instanceof C33482y2) {
                c33450s0.m105868k(null);
            }
        }
        m105809r(c33368c1, (JoinCallResponse) ((C26204g) abstractC26205h).f103919a);
        Object value2 = c33368c1.f139268C.getValue();
        AbstractC22676k.m65747g(value2);
        return new C26204g(value2);
        AbstractC26205h abstractC26205h3 = (AbstractC26205h) objM105807o;
        if (!(abstractC26205h3 instanceof C26204g)) {
            AbstractC22676k.m65748h(abstractC26205h3, "null cannot be cast to non-null type io.getstream.result.Result.Failure");
            return (C26203f) abstractC26205h3;
        }
        String str5 = (String) ((C26204g) abstractC26205h3).f103919a;
        c33368c0.f139290d = str5;
        if (c33421m2 == null) {
            c33421m2 = z14 ? new C33421m1() : null;
        }
        c33409k2.f139488w = c33368c0;
        c33409k2.f139489x = null;
        c33409k2.f139490y = null;
        c33409k2.f139491z = null;
        c33409k2.f139487H = 2;
        objM105807o = m105807o(c33368c0, c33421m2, str5, null, bool2, c37865a2, c33409k2, 12);
        if (objM105807o != enumC31071a) {
            c33368c1 = c33368c0;
            abstractC26205h = (AbstractC26205h) objM105807o;
            if (!(abstractC26205h instanceof C26204g)) {
                AbstractC22676k.m65748h(abstractC26205h, "null cannot be cast to non-null type io.getstream.result.Result.Failure");
                return (C26203f) abstractC26205h;
            }
            JoinCallResponse joinCallResponse2 = (JoinCallResponse) ((C26204g) abstractC26205h).f103919a;
            String token2 = joinCallResponse2.getCredentials().getToken();
            String url2 = joinCallResponse2.getCredentials().getServer().getUrl();
            String wsEndpoint2 = joinCallResponse2.getCredentials().getServer().getWsEndpoint();
            String edgeName2 = joinCallResponse2.getCredentials().getServer().getEdgeName();
            List<ICEServer> iceServers2 = joinCallResponse2.getCredentials().getIceServers();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(iceServers2, 10));
            it = iceServers2.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC32416g.m101143L((ICEServer) it.next()));
            }
            String str6 = c33368c1.f139269D;
            C33366b4 c33366b6 = c33368c1.f139293g;
            String str7 = c33366b6.f139261y;
            AbstractC1638x abstractC1638x2 = c33366b6.f139232E.f168476d;
            C33366b4 c33366b7 = c33368c1.f139287a;
            PowerManager powerManager2 = c33368c1.f139299m;
            C2570m c2570m2 = c33368c1.f139276K.f151340c;
            ((C0332w0) c2570m2.f9985F).m851O(edgeName2);
            C11602h1 c11602h4 = new C11602h1(c33366b7, 0, powerManager2, c33368c1, str6, str7, abstractC1638x2, url2, wsEndpoint2, token2, edgeName2, arrayList, c2570m2, 3141634);
            C13045h2 c13045h6 = c33368c1.f139268C;
            c13045h6.getClass();
            c13045h6.m36571k(null, c11602h4);
            c11602h1 = (C11602h1) c13045h6.getValue();
            if (c11602h1 != null) {
                C13045h2 c13045h7 = c33368c1.f139302p.f139650g;
                C33417l2 c33417l3 = new C33417l2(c11602h1);
                c13045h7.getClass();
                c13045h7.m36571k(null, c33417l3);
            }
            c11602h2 = (C11602h1) c13045h6.getValue();
            if (c11602h2 != null) {
                c33409k2.f139488w = c33368c1;
                c33409k2.f139489x = abstractC26205h;
                c33409k2.f139487H = 3;
                objM105807o = c11602h2.m31037m(null, null, null, c33409k2);
                if (objM105807o != enumC31071a) {
                    c33368c2 = c33368c1;
                    abstractC26205h2 = abstractC26205h;
                    abstractC11611k1 = (AbstractC11611k1) objM105807o;
                    C33368c0 c33368c5 = c33368c2;
                    abstractC26205h = abstractC26205h2;
                    c33368c1 = c33368c5;
                }
            } else {
                abstractC11611k1 = null;
            }
            if (!(abstractC11611k1 instanceof C11605i1)) {
                if (abstractC11611k1 instanceof C11608j1) {
                    message = ((C11608j1) abstractC11611k1).f37473a.getMessage();
                    if (message == null) {
                        message = "RtcSession error occurred.";
                    }
                    return new C26203f(new C26198a(message));
                }
                if (abstractC11611k1 == null) {
                    return new C26203f(new C26198a("RtcSession was null during connect"));
                }
            }
            c33391g1 = c33368c1.f139287a.f139248U;
            c33391g1.getClass();
            c17171d = c33368c1.f139300n;
            C13045h2 c13045h8 = c33391g1.f139403f;
            c13045h8.getClass();
            c13045h8.m36571k(null, c33368c1);
            c33450s0 = c33368c1.f139302p;
            interfaceC33377d3 = (InterfaceC33377d3) c33450s0.f139618G.getValue();
            c21319cM9548b = c33391g1.f139406i.m9548b(c33368c1.f139288b);
            z13 = c21319cM9548b.f81521a;
            if (interfaceC33377d3 instanceof C33487z2) {
                c33391g1.m105849e(c33368c1);
                if (z13) {
                    AbstractC3006f0.m8732z(c17171d, null, null, new C33386f1(c33391g1, c33368c1, interfaceC30057d, 0), 3);
                }
            } else if (interfaceC33377d3 instanceof C33359a3) {
                if (!c33450s0.f139613B0.get()) {
                    c33391g1.m105849e(c33368c1);
                }
                boolean zM59854d3 = new C21323g(0).m59854d(c33391g1.f139398a.f139259w, c21319cM9548b.f81524d);
                if (z13) {
                    c2345kM105845a = c33391g1.m105845a();
                    interfaceC2339e = c2345kM105845a.f9275c;
                    str = c2345kM105845a.f9273a;
                    enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        c2345kM105845a.f9274b.log(enumC2341g, str, "Outgoing call service should already be running", null);
                    }
                }
            } else {
                c33391g1.m105848d(c33368c1);
                if (z13) {
                    AbstractC3006f0.m8732z(c17171d, null, null, new C33386f1(c33391g1, c33368c1, interfaceC30057d, 1), 3);
                } else if (interfaceC33377d3 instanceof C33482y2) {
                    c33450s0.m105868k(null);
                }
            }
            m105809r(c33368c1, (JoinCallResponse) ((C26204g) abstractC26205h).f103919a);
            Object value3 = c33368c1.f139268C.getValue();
            AbstractC22676k.m65747g(value3);
            return new C26204g(value3);
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e A[Catch: all -> 0x00d8, TryCatch #4 {all -> 0x00d8, blocks: (B:46:0x0094, B:48:0x009e, B:50:0x00ae), top: B:89:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #4 {all -> 0x00d8, blocks: (B:46:0x0094, B:48:0x009e, B:50:0x00ae), top: B:89:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:76:0x011d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m105811b(AbstractC32269c abstractC32269c) {
        C33419m c33419m;
        C33368c0 c33368c0;
        Object objM107888l;
        C26243q c26243q;
        C26243q c26243q2;
        Throwable th3;
        C33368c0 c33368c1;
        C11602h1 c11602h1;
        Object objM107888l2;
        C12662v0 c12662v0;
        Object objM92140a;
        Object objM107888l3;
        Throwable thM68037a;
        C13045h2 c13045h2;
        C2345k c2345kM105816g;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        if (abstractC32269c instanceof C33419m) {
            c33419m = (C33419m) abstractC32269c;
            int i13 = c33419m.f139540E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33419m.f139540E = i13 - Integer.MIN_VALUE;
            } else {
                c33419m = new C33419m(this, abstractC32269c);
            }
        } else {
            c33419m = new C33419m(this, abstractC32269c);
        }
        Object objM92140a2 = c33419m.f139543y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33419m.f139540E;
        int i15 = 10;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objM92140a2);
                    try {
                        C11602h1 c11602h2 = (C11602h1) this.f139268C.getValue();
                        if (c11602h2 == null) {
                            c33368c0 = this;
                            objM107888l = null;
                            if (objM107888l instanceof C23467m) {
                                objM107888l = null;
                            }
                            c26243q = (C26243q) objM107888l;
                            c11602h1 = (C11602h1) c33368c0.f139268C.getValue();
                            if (c11602h1 != null) {
                                c33419m.f139541w = c33368c0;
                                c33419m.f139542x = c26243q;
                                c33419m.f139540E = 2;
                                c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                                if (c12662v0 != null) {
                                    C30065l c30065l = new C30065l(AbstractC15751g.m44424D(c33419m));
                                    c12662v0.m35416e().getStats(new C11457j(i15, c12662v0, c30065l));
                                    objM92140a = c30065l.m92140a();
                                    EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                                } else {
                                    objM92140a = null;
                                }
                                if (objM92140a != enumC31071a) {
                                    c26243q2 = c26243q;
                                    objM92140a2 = objM92140a;
                                    c33368c1 = c33368c0;
                                    objM107888l2 = (C26243q) objM92140a2;
                                    c33368c0 = c33368c1;
                                }
                            } else {
                                c26243q2 = c26243q;
                                objM107888l2 = null;
                            }
                            if (objM107888l2 instanceof C23467m) {
                                objM107888l2 = null;
                            }
                            C26243q c26243q3 = (C26243q) objM107888l2;
                            c33368c0.f139302p.f139674s.m105870a(c26243q2, true);
                            c33368c0.f139302p.f139674s.m105870a(c26243q3, false);
                            c33368c0.f139302p.f139674s.m105871b();
                            objM107888l3 = C23454a0.f92919a;
                            thM68037a = C23468n.m68037a(objM107888l3);
                            if (thM68037a != null) {
                                c2345kM105816g = c33368c0.m105816g();
                                interfaceC2339e = c2345kM105816g.f9275c;
                                str = c2345kM105816g.f9273a;
                                enumC2341g = EnumC2341g.WARN;
                                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                    c2345kM105816g.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[collectStats] Failed to update stats: ", thM68037a.getMessage()), null);
                                }
                            }
                            C33450s0 c33450s0 = c33368c0.f139302p;
                            c13045h2 = c33368c0.f139266A;
                            C33451s1 c33451s1 = (C33451s1) c33450s0.f139674s.f139709e.getValue();
                            C33455t0 c33455t0 = c33368c0.f139302p.f139674s;
                            C33460u0 c33460u0 = new C33460u0(c26243q2, c26243q3, c33451s1, c33455t0);
                            C13045h2 c13045h3 = c33368c0.f139312z;
                            c13045h3.getClass();
                            c13045h3.m36571k(null, c33460u0);
                            c13045h2.m36571k(null, AbstractC25265s.m74128f1(((C13045h2) c33455t0.f139707c.f98485y).getValue(), (Collection) c13045h2.getValue()));
                            if (((List) c13045h2.getValue()).size() > 20) {
                                List listM74158x1 = AbstractC25265s.m74158x1(20, (List) c13045h2.getValue());
                                c13045h2.getClass();
                                c13045h2.m36571k(null, listM74158x1);
                            }
                            return c33460u0;
                        }
                        c33419m.f139541w = this;
                        c33419m.f139540E = 1;
                        C12645n c12645n = (C12645n) c11602h2.f37421A.getValue();
                        if (c12645n != null) {
                            C30065l c30065l2 = new C30065l(AbstractC15751g.m44424D(c33419m));
                            c12645n.m35416e().getStats(new C11457j(i15, c12645n, c30065l2));
                            objM92140a2 = c30065l2.m92140a();
                        } else {
                            objM92140a2 = null;
                        }
                        if (objM92140a2 != enumC31071a) {
                            c33368c0 = this;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c33368c0 = this;
                        objM107888l = AbstractC34132o.m107888l(th);
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c26243q2 = c33419m.f139542x;
                    c33368c1 = c33419m.f139541w;
                    try {
                        AbstractC34132o.m107864I(objM92140a2);
                        objM107888l2 = (C26243q) objM92140a2;
                    } catch (Throwable th5) {
                        th3 = th5;
                        objM107888l2 = AbstractC34132o.m107888l(th3);
                    }
                    c33368c0 = c33368c1;
                    if (objM107888l2 instanceof C23467m) {
                        objM107888l2 = null;
                    }
                    C26243q c26243q4 = (C26243q) objM107888l2;
                    c33368c0.f139302p.f139674s.m105870a(c26243q2, true);
                    c33368c0.f139302p.f139674s.m105870a(c26243q4, false);
                    c33368c0.f139302p.f139674s.m105871b();
                    objM107888l3 = C23454a0.f92919a;
                    thM68037a = C23468n.m68037a(objM107888l3);
                    if (thM68037a != null) {
                        c2345kM105816g = c33368c0.m105816g();
                        interfaceC2339e = c2345kM105816g.f9275c;
                        str = c2345kM105816g.f9273a;
                        enumC2341g = EnumC2341g.WARN;
                        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                            c2345kM105816g.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[collectStats] Failed to update stats: ", thM68037a.getMessage()), null);
                        }
                    }
                    C33450s0 c33450s1 = c33368c0.f139302p;
                    c13045h2 = c33368c0.f139266A;
                    C33451s1 c33451s2 = (C33451s1) c33450s1.f139674s.f139709e.getValue();
                    C33455t0 c33455t1 = c33368c0.f139302p.f139674s;
                    C33460u0 c33460u1 = new C33460u0(c26243q2, c26243q4, c33451s2, c33455t1);
                    C13045h2 c13045h4 = c33368c0.f139312z;
                    c13045h4.getClass();
                    c13045h4.m36571k(null, c33460u1);
                    c13045h2.m36571k(null, AbstractC25265s.m74128f1(((C13045h2) c33455t1.f139707c.f98485y).getValue(), (Collection) c13045h2.getValue()));
                    if (((List) c13045h2.getValue()).size() > 20) {
                        List listM74158x2 = AbstractC25265s.m74158x1(20, (List) c13045h2.getValue());
                        c13045h2.getClass();
                        c13045h2.m36571k(null, listM74158x2);
                    }
                    return c33460u1;
                }
                c33368c0 = c33419m.f139541w;
                try {
                    AbstractC34132o.m107864I(objM92140a2);
                } catch (Throwable th6) {
                    th = th6;
                    objM107888l = AbstractC34132o.m107888l(th);
                }
                c11602h1 = (C11602h1) c33368c0.f139268C.getValue();
                if (c11602h1 != null) {
                    c33419m.f139541w = c33368c0;
                    c33419m.f139542x = c26243q;
                    c33419m.f139540E = 2;
                    c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                    if (c12662v0 != null) {
                        C30065l c30065l3 = new C30065l(AbstractC15751g.m44424D(c33419m));
                        c12662v0.m35416e().getStats(new C11457j(i15, c12662v0, c30065l3));
                        objM92140a = c30065l3.m92140a();
                        EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                    } else {
                        objM92140a = null;
                    }
                    if (objM92140a != enumC31071a) {
                        c26243q2 = c26243q;
                        objM92140a2 = objM92140a;
                        c33368c1 = c33368c0;
                        objM107888l2 = (C26243q) objM92140a2;
                        c33368c0 = c33368c1;
                    }
                    return enumC31071a;
                }
                c26243q2 = c26243q;
                objM107888l2 = null;
            } catch (Throwable th7) {
                c26243q2 = c26243q;
                th3 = th7;
                c33368c1 = c33368c0;
                objM107888l2 = AbstractC34132o.m107888l(th3);
            }
            c33368c0.f139302p.f139674s.m105870a(c26243q2, true);
            c33368c0.f139302p.f139674s.m105870a(c26243q4, false);
            c33368c0.f139302p.f139674s.m105871b();
            objM107888l3 = C23454a0.f92919a;
        } catch (Throwable th8) {
            objM107888l3 = AbstractC34132o.m107888l(th8);
        }
        objM107888l = (C26243q) objM92140a2;
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        c26243q = (C26243q) objM107888l;
        if (objM107888l2 instanceof C23467m) {
            objM107888l2 = null;
        }
        C26243q c26243q5 = (C26243q) objM107888l2;
        thM68037a = C23468n.m68037a(objM107888l3);
        if (thM68037a != null) {
            c2345kM105816g = c33368c0.m105816g();
            interfaceC2339e = c2345kM105816g.f9275c;
            str = c2345kM105816g.f9273a;
            enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM105816g.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[collectStats] Failed to update stats: ", thM68037a.getMessage()), null);
            }
        }
        C33450s0 c33450s2 = c33368c0.f139302p;
        c13045h2 = c33368c0.f139266A;
        C33451s1 c33451s3 = (C33451s1) c33450s2.f139674s.f139709e.getValue();
        C33455t0 c33455t2 = c33368c0.f139302p.f139674s;
        C33460u0 c33460u2 = new C33460u0(c26243q2, c26243q5, c33451s3, c33455t2);
        C13045h2 c13045h5 = c33368c0.f139312z;
        c13045h5.getClass();
        c13045h5.m36571k(null, c33460u2);
        c13045h2.m36571k(null, AbstractC25265s.m74128f1(((C13045h2) c33455t2.f139707c.f98485y).getValue(), (Collection) c13045h2.getValue()));
        if (((List) c13045h2.getValue()).size() > 20) {
            List listM74158x3 = AbstractC25265s.m74158x1(20, (List) c13045h2.getValue());
            c13045h2.getClass();
            c13045h2.m36571k(null, listM74158x3);
        }
        return c33460u2;
    }

    /* JADX INFO: renamed from: c */
    public final void m105812c(VideoEvent event) {
        AbstractC22676k.m65750j(event, "event");
        Set subscriptions = this.f139291e;
        AbstractC22676k.m65749i(subscriptions, "subscriptions");
        synchronized (subscriptions) {
            try {
                Set<C33446r1> subscriptions2 = this.f139291e;
                AbstractC22676k.m65749i(subscriptions2, "subscriptions");
                for (C33446r1 c33446r1 : subscriptions2) {
                    c33446r1.getClass();
                    c33446r1.f139603a.m93345b(event);
                }
                if (!this.f139301o.mo36564a(event)) {
                    C2345k c2345kM105816g = m105816g();
                    InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
                    EnumC2341g enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, c2345kM105816g.f9273a)) {
                        c2345kM105816g.f9274b.log(enumC2341g, c2345kM105816g.f9273a, "Failed to emit event to observers: [event: " + event + "]", null);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m105813d(AbstractC32269c abstractC32269c) {
        C33429o c33429o;
        C33368c0 c33368c0;
        if (abstractC32269c instanceof C33429o) {
            c33429o = (C33429o) abstractC32269c;
            int i13 = c33429o.f139564z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33429o.f139564z = i13 - Integer.MIN_VALUE;
            } else {
                c33429o = new C33429o(this, abstractC32269c);
            }
        } else {
            c33429o = new C33429o(this, abstractC32269c);
        }
        Object objM105795m = c33429o.f139562x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33429o.f139564z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM105795m);
            c33429o.f139561w = this;
            c33429o.f139564z = 1;
            C33366b4 c33366b4 = this.f139293g;
            c33366b4.getClass();
            objM105795m = c33366b4.m105795m(new C33453s3(c33366b4, this.f139288b, this.f139289c, null), c33429o);
            if (objM105795m == enumC31071a) {
                return enumC31071a;
            }
            c33368c0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33368c0 = c33429o.f139561w;
            AbstractC34132o.m107864I(objM105795m);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM105795m;
        if (!(abstractC26205h instanceof C26204g)) {
            if (abstractC26205h instanceof C26203f) {
                return abstractC26205h;
            }
            throw new NoWhenBranchMatchedException();
        }
        GetCallResponse response = (GetCallResponse) ((C26204g) abstractC26205h).f103919a;
        C33450s0 c33450s0 = c33368c0.f139302p;
        c33450s0.getClass();
        AbstractC22676k.m65750j(response, "response");
        c33450s0.m105866h(response.getCall());
        c33450s0.f139623L.m36570j(response.getOwnCapabilities());
        c33450s0.m105861c(response.getMembers());
        return abstractC26205h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: e */
    public final C33381e1 m105814e() {
        return (C33381e1) this.f139304r.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final EglBase m105815f() {
        Object value = this.f139274I.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (EglBase) value;
    }

    /* JADX INFO: renamed from: g */
    public final C2345k m105816g() {
        return (C2345k) this.f139296j.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final C33476x1 m105817h() {
        return (C33476x1) this.f139278M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: i */
    public final C33358a2 m105818i() {
        return (C33358a2) this.f139305s.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final C12638j0 m105819j() {
        if (this.f139275J == null) {
            C33366b4 c33366b4 = this.f139293g;
            Context context = c33366b4.f139259w;
            c33366b4.f139238K.m9548b(this.f139288b);
            this.f139275J = new C12638j0(context, new C33414l(this, 4), new C33414l(this, 5), new C33414l(this, 6), c33366b4.f139242O.f10732c);
        }
        C12638j0 c12638j0 = this.f139275J;
        AbstractC22676k.m65747g(c12638j0);
        return c12638j0;
    }

    /* JADX INFO: renamed from: k */
    public final void m105820k(VideoEvent event) {
        AbstractC22676k.m65750j(event, "event");
        C2345k c2345kM105816g = m105816g();
        InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = c2345kM105816g.f9273a;
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM105816g.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[call handleEvent] #sfu; event.type: ", event.getType()), null);
        }
        if (event instanceof C35624i) {
            AbstractC3006f0.m8732z(this.f139300n, null, null, new C33399i(this, interfaceC30057d, 1), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x04db  */
    /* JADX WARN: Code duplicated, block: B:154:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:157:0x050c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0548  */
    /* JADX WARN: Code duplicated, block: B:166:0x0569  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0314  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0569 -> B:84:0x02f1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: l */
    public final java.lang.Object m105821l(boolean r56, s83.AbstractC32269c r57) {
        /*
            Method dump skipped, instruction units count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33368c0.m105821l(boolean, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: n */
    public final Object m105822n(C33421m1 c33421m1, String str, String str2, boolean z4, boolean z13, Boolean bool, C37865a c37865a, AbstractC32269c abstractC32269c) {
        C33439q c33439q;
        C13045h2 c13045h2;
        String str3;
        EnumC31071a enumC31071a;
        Object value;
        C33368c0 c33368c0;
        Object value2;
        String str4;
        C37865a joinAnalyticsModel = c37865a;
        if (abstractC32269c instanceof C33439q) {
            c33439q = (C33439q) abstractC32269c;
            int i13 = c33439q.f139589E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33439q.f139589E = i13 - Integer.MIN_VALUE;
            } else {
                c33439q = new C33439q(this, abstractC32269c);
            }
        } else {
            c33439q = new C33439q(this, abstractC32269c);
        }
        Object objM105801s = c33439q.f139592y;
        EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
        int i14 = c33439q.f139589E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM105801s);
            List listM74093D1 = AbstractC25265s.m74093D1(this.f139271F);
            List list = !listM74093D1.isEmpty() ? listM74093D1 : null;
            C2570m c2570m = this.f139276K.f151339b;
            AbstractC32309k abstractC32309k = joinAnalyticsModel.f162178b;
            C32800q c32800q = (C32800q) c2570m.f9984E;
            C13081r1 c13081r1 = (C13081r1) c32800q.f136505x;
            C13045h2 c13045h3 = (C13045h2) c32800q.f136504w;
            String str5 = "toString(...)";
            if (!AbstractC22676k.m65745e(abstractC32309k, C37866b.f162179w)) {
                String strM31995n = AbstractC11895b.m31995n("toString(...)");
                do {
                    value2 = c13045h3.getValue();
                } while (!c13045h3.m36569i(value2, C36750h.m117871a((C36750h) value2, null, strM31995n, null, null, null, 29)));
            }
            int iOrdinal = ((C36750h) c13081r1.f45200w.getValue()).f157284d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 2) {
                while (true) {
                    Object value3 = c13045h3.getValue();
                    c13045h2 = c13045h3;
                    str3 = str5;
                    enumC31071a = enumC31071a2;
                    if (c13045h2.m36569i(value3, C36750h.m117871a((C36750h) value3, abstractC32309k, null, null, null, null, 30))) {
                        break;
                    }
                    str5 = str3;
                    c13045h3 = c13045h2;
                    enumC31071a2 = enumC31071a;
                }
                C40033c c40033c = (C40033c) c2570m.f9989z;
                String callType = (String) c2570m.f9988y;
                String str6 = (String) c2570m.f9987x;
                String str7 = ((C36750h) c13081r1.f45200w.getValue()).f157282b;
                if (str7 == null) {
                    str7 = "unknown";
                }
                String str8 = str7;
                if (abstractC32309k == null) {
                    abstractC32309k = C37869e.f162182w;
                }
                AbstractC32309k abstractC32309k2 = abstractC32309k;
                c40033c.getClass();
                AbstractC22676k.m65750j(callType, "callType");
                String string = UUID.randomUUID().toString();
                AbstractC22676k.m65749i(string, str3);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ConcurrentHashMap concurrentHashMap = c40033c.f172742d;
                EnumC2683d enumC2683d = EnumC2683d.COORDINATOR_JOIN;
                concurrentHashMap.put(string, new C2689j(str6, callType, string, enumC2683d, jCurrentTimeMillis, str8, abstractC32309k2, null, null, null, false, 3968));
                c40033c.f172739a.m927P(C40031a.m128361a(c40033c.f172741c, str6, callType, enumC2683d, EnumC2686g.INITIATED, string, abstractC32309k2, str8, null, null, null, null, null, null, null, null, null, null, null, null, 8388480));
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C36750h.m117871a((C36750h) value, null, null, string, null, null, 27)));
                c32800q.m102865i(EnumC37870f.f162184x);
            } else {
                enumC31071a = enumC31071a2;
            }
            boolean z14 = c33421m1 != null;
            ArrayList arrayList = c33421m1 != null ? new ArrayList() : null;
            c33439q.f139590w = this;
            c33439q.f139591x = joinAnalyticsModel;
            c33439q.f139589E = 1;
            C33439q c33439q2 = c33439q;
            EnumC31071a enumC31071a3 = enumC31071a;
            objM105801s = this.f139293g.m105801s(this.f139288b, this.f139289c, z14, arrayList, null, null, null, null, z4, z13, str, str2, list, bool, c33439q2);
            if (objM105801s == enumC31071a3) {
                return enumC31071a3;
            }
            c33368c0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            joinAnalyticsModel = c33439q.f139591x;
            c33368c0 = c33439q.f139590w;
            AbstractC34132o.m107864I(objM105801s);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM105801s;
        if (!(abstractC26205h instanceof C26204g)) {
            if (abstractC26205h instanceof C26203f) {
                return abstractC26205h;
            }
            throw new NoWhenBranchMatchedException();
        }
        JoinCallResponse joinCallResponse = (JoinCallResponse) ((C26204g) abstractC26205h).f103919a;
        C2570m c2570m2 = c33368c0.f139276K.f151339b;
        String currentSessionId = joinCallResponse.getCall().getCurrentSessionId();
        c2570m2.getClass();
        AbstractC22676k.m65750j(joinAnalyticsModel, "joinAnalyticsModel");
        AbstractC22676k.m65750j(currentSessionId, "currentSessionId");
        C32800q c32800q2 = (C32800q) c2570m2.f9984E;
        C13081r1 c13081r2 = (C13081r1) c32800q2.f136505x;
        if (AbstractC36749g.f157280a[((C36750h) c13081r2.f45200w.getValue()).f157284d.ordinal()] == 3) {
            C13045h2 c13045h4 = (C13045h2) c32800q2.f136504w;
            while (true) {
                Object value4 = c13045h4.getValue();
                str4 = currentSessionId;
                if (c13045h4.m36569i(value4, C36750h.m117871a((C36750h) value4, null, null, null, null, str4, 15))) {
                    break;
                }
                currentSessionId = str4;
            }
            if (((C36750h) c13081r2.f45200w.getValue()).f157283c.length() > 0) {
                C40033c.m128363b((C40033c) c2570m2.f9989z, ((C36750h) c13081r2.f45200w.getValue()).f157283c, true, joinAnalyticsModel.f162177a, null, null, str4, 24);
                ((C25067k) c2570m2.f9985F).invoke();
            }
            c32800q2.m102865i(EnumC37870f.f162185y);
        }
        C33450s0 c33450s0 = c33368c0.f139302p;
        c33450s0.getClass();
        c33450s0.f139623L.m36570j(joinCallResponse.getOwnCapabilities());
        c33450s0.m105861c(joinCallResponse.getMembers());
        c33450s0.m105866h(joinCallResponse.getCall());
        return abstractC26205h;
    }

    /* JADX INFO: renamed from: p */
    public final void m105823p(InterfaceC33400i0 interfaceC33400i0) {
        C2345k c2345kM105816g = m105816g();
        InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM105816g.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM105816g.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[leave] #ringing; call_cid:", this.f139308v), null);
        }
        this.f139295i.m13289a(new C30929c(6, this, interfaceC33400i0));
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0090: MOVE (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:22:0x008f */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0091: MOVE (r8 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:22:0x008f */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x05c4 -> B:261:0x05c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: s */
    public final java.lang.Object m105824s(stream.video.sfu.models.WebsocketReconnectStrategy r27, java.lang.String r28, s83.AbstractC32269c r29) {
        /*
            Method dump skipped, instruction units count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33368c0.m105824s(stream.video.sfu.models.WebsocketReconnectStrategy, java.lang.String, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[PHI: r3 r4 r5
      0x0049: PHI (r3v9 d33.h1) = (r3v8 d33.h1), (r3v12 d33.h1) binds: [B:48:0x0121, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v9 java.lang.String) binds: [B:48:0x0121, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r5v7 t23.c0) = (r5v6 t23.c0), (r5v11 t23.c0) binds: [B:48:0x0121, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
    
        if (r1 == r2) goto L52;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m105825t(java.lang.String r25, s83.AbstractC32269c r26) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33368c0.m105825t(java.lang.String, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0236 A[LOOP:0: B:65:0x0230->B:67:0x0236, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0297  */
    /* JADX WARN: Code duplicated, block: B:75:0x029e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:16:0x003d, B:73:0x0298, B:75:0x029e, B:76:0x02ad, B:78:0x02b1, B:85:0x02cf, B:86:0x02d4, B:69:0x0278), top: B:92:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ad A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:16:0x003d, B:73:0x0298, B:75:0x029e, B:76:0x02ad, B:78:0x02b1, B:85:0x02cf, B:86:0x02d4, B:69:0x0278), top: B:92:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x02b1 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:16:0x003d, B:73:0x0298, B:75:0x029e, B:76:0x02ad, B:78:0x02b1, B:85:0x02cf, B:86:0x02d4, B:69:0x0278), top: B:92:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x02cf A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:16:0x003d, B:73:0x0298, B:75:0x029e, B:76:0x02ad, B:78:0x02b1, B:85:0x02cf, B:86:0x02d4, B:69:0x0278), top: B:92:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r3v0, types: [d33.h1] */
    /* JADX INFO: renamed from: u */
    public final Object m105826u(C37865a c37865a, AbstractC32269c abstractC32269c) {
        C33356a0 c33356a0;
        C33368c0 c33368c0;
        C37865a c37865a2;
        C11602h1 c11602h1;
        AbstractC26205h abstractC26205h;
        C33368c0 c33368c1;
        List list;
        ReconnectDetails reconnectDetails;
        Credentials credentials;
        C37865a c37865a3;
        AbstractC26205h abstractC26205h2;
        C11602h1 c11602h2;
        C33460u0 c33460u0;
        Credentials credentials2;
        AbstractC26205h abstractC26205h3;
        C37865a c37865a4;
        C33368c0 c33368c2;
        ArrayList arrayList;
        Iterator<T> it;
        C33368c0 c33368c3;
        AbstractC26205h abstractC26205h4;
        AbstractC11611k1 abstractC11611k1;
        Object c33452s2;
        C2996c2 c2996c2;
        if (abstractC32269c instanceof C33356a0) {
            c33356a0 = (C33356a0) abstractC32269c;
            int i13 = c33356a0.f139184J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33356a0.f139184J = i13 - Integer.MIN_VALUE;
            } else {
                c33356a0 = new C33356a0(this, abstractC32269c);
            }
        } else {
            c33356a0 = new C33356a0(this, abstractC32269c);
        }
        C33356a0 c33356a1 = c33356a0;
        Object objM105807o = c33356a1.f139182H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33356a1.f139184J;
        ?? r10 = 1;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM105807o);
                C2345k c2345kM105816g = m105816g();
                InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
                String str = c2345kM105816g.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM105816g.f9274b.log(enumC2341g, str, "[reconnectMigrate] Migrating", null);
                }
                C13045h2 c13045h2 = this.f139302p.f139650g;
                c13045h2.getClass();
                c13045h2.m36571k(null, C33422m2.f139547a);
                String str2 = this.f139290d;
                if (str2 == null) {
                    return new C33462u2("No location available for migrate");
                }
                C11602h1 c11602h3 = (C11602h1) this.f139268C.getValue();
                if (c11602h3 == null) {
                    return new C33462u2("No active session for migrate");
                }
                this.f139273H = System.currentTimeMillis();
                String str3 = c11602h3.f37445g;
                if (!AbstractC39414r.m125890i0(str3)) {
                    this.f139271F.add(str3);
                }
                String str4 = c11602h3.f37445g;
                c33356a1.f139185w = this;
                c33356a1.f139186x = c37865a;
                c33356a1.f139187y = c11602h3;
                c33356a1.f139184J = 1;
                objM105807o = m105807o(this, null, str2, str4, null, c37865a, c33356a1, 121);
                if (objM105807o != enumC31071a) {
                    c33368c0 = this;
                    c37865a2 = c37865a;
                    c11602h1 = c11602h3;
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                C11602h1 c11602h4 = (C11602h1) c33356a1.f139187y;
                c37865a2 = (C37865a) c33356a1.f139186x;
                C33368c0 c33368c4 = c33356a1.f139185w;
                AbstractC34132o.m107864I(objM105807o);
                c11602h1 = c11602h4;
                c33368c0 = c33368c4;
            } else {
                if (i14 == 2) {
                    reconnectDetails = c33356a1.f139181G;
                    List list2 = c33356a1.f139180F;
                    Credentials credentials3 = c33356a1.f139179E;
                    abstractC26205h = c33356a1.f139188z;
                    c11602h1 = (C11602h1) c33356a1.f139187y;
                    C37865a c37865a5 = (C37865a) c33356a1.f139186x;
                    C33368c0 c33368c5 = c33356a1.f139185w;
                    AbstractC34132o.m107864I(objM105807o);
                    list = list2;
                    credentials = credentials3;
                    c33368c1 = c33368c5;
                    c37865a3 = c37865a5;
                    abstractC26205h2 = abstractC26205h;
                    c11602h2 = c11602h1;
                    c33460u0 = (C33460u0) objM105807o;
                    c33356a1.f139185w = c33368c1;
                    c33356a1.f139186x = c37865a3;
                    c33356a1.f139187y = c11602h2;
                    c33356a1.f139188z = abstractC26205h2;
                    c33356a1.f139179E = credentials;
                    c33356a1.f139180F = list;
                    c33356a1.f139181G = reconnectDetails;
                    c33356a1.f139184J = 3;
                    if (C11602h1.m31014B(c11602h2, c33460u0, null, null, c33356a1, 6) != enumC31071a) {
                        credentials2 = credentials;
                        abstractC26205h3 = abstractC26205h2;
                        c37865a4 = c37865a3;
                        c33368c2 = c33368c1;
                        c11602h2.m31036k(false);
                        C33366b4 c33366b4 = c33368c2.f139293g;
                        int i15 = c33368c2.f139292f;
                        PowerManager powerManager = c33368c2.f139299m;
                        String str5 = c33368c2.f139269D;
                        String str6 = c33366b4.f139261y;
                        AbstractC1638x abstractC1638x = c33366b4.f139232E.f168476d;
                        String url = credentials2.getServer().getUrl();
                        String wsEndpoint = credentials2.getServer().getWsEndpoint();
                        String token = credentials2.getToken();
                        String edgeName = credentials2.getServer().getEdgeName();
                        List<ICEServer> iceServers = credentials2.getIceServers();
                        Credentials credentials4 = credentials2;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(iceServers, 10));
                        it = iceServers.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC32416g.m101143L((ICEServer) it.next()));
                        }
                        C2570m c2570m = c33368c2.f139276K.f151340c;
                        ((C0332w0) c2570m.f9985F).m851O(credentials4.getServer().getEdgeName());
                        C33368c0 c33368c6 = c33368c2;
                        C11602h1 c11602h5 = new C11602h1(c33366b4, i15, powerManager, c33368c6, str5, str6, abstractC1638x, url, wsEndpoint, token, edgeName, arrayList, c2570m, 3141632);
                        c33368c3 = c33368c6;
                        C13045h2 c13045h3 = c33368c3.f139268C;
                        c13045h3.getClass();
                        c13045h3.m36571k(null, c11602h5);
                        C37865a c37865a6 = new C37865a(c37865a4.f162177a, null);
                        c33356a1.f139185w = c33368c3;
                        c33356a1.f139186x = c11602h2;
                        c33356a1.f139187y = abstractC26205h3;
                        c33356a1.f139188z = null;
                        c33356a1.f139179E = null;
                        c33356a1.f139180F = null;
                        c33356a1.f139181G = null;
                        c33356a1.f139184J = 4;
                        objM105807o = c11602h5.m31037m(reconnectDetails, list, c37865a6, c33356a1);
                        if (objM105807o != enumC31071a) {
                            abstractC26205h4 = abstractC26205h3;
                        }
                    }
                    return enumC31071a;
                }
                if (i14 == 3) {
                    reconnectDetails = c33356a1.f139181G;
                    List list3 = c33356a1.f139180F;
                    credentials2 = c33356a1.f139179E;
                    abstractC26205h3 = c33356a1.f139188z;
                    C11602h1 c11602h6 = (C11602h1) c33356a1.f139187y;
                    c37865a4 = (C37865a) c33356a1.f139186x;
                    c33368c2 = c33356a1.f139185w;
                    AbstractC34132o.m107864I(objM105807o);
                    list = list3;
                    c11602h2 = c11602h6;
                    c11602h2.m31036k(false);
                    C33366b4 c33366b5 = c33368c2.f139293g;
                    int i16 = c33368c2.f139292f;
                    PowerManager powerManager2 = c33368c2.f139299m;
                    String str7 = c33368c2.f139269D;
                    String str8 = c33366b5.f139261y;
                    AbstractC1638x abstractC1638x2 = c33366b5.f139232E.f168476d;
                    String url2 = credentials2.getServer().getUrl();
                    String wsEndpoint2 = credentials2.getServer().getWsEndpoint();
                    String token2 = credentials2.getToken();
                    String edgeName2 = credentials2.getServer().getEdgeName();
                    List<ICEServer> iceServers2 = credentials2.getIceServers();
                    Credentials credentials5 = credentials2;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(iceServers2, 10));
                    it = iceServers2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC32416g.m101143L((ICEServer) it.next()));
                    }
                    C2570m c2570m2 = c33368c2.f139276K.f151340c;
                    ((C0332w0) c2570m2.f9985F).m851O(credentials5.getServer().getEdgeName());
                    C33368c0 c33368c7 = c33368c2;
                    C11602h1 c11602h7 = new C11602h1(c33366b5, i16, powerManager2, c33368c7, str7, str8, abstractC1638x2, url2, wsEndpoint2, token2, edgeName2, arrayList, c2570m2, 3141632);
                    c33368c3 = c33368c7;
                    C13045h2 c13045h4 = c33368c3.f139268C;
                    c13045h4.getClass();
                    c13045h4.m36571k(null, c11602h7);
                    C37865a c37865a7 = new C37865a(c37865a4.f162177a, null);
                    c33356a1.f139185w = c33368c3;
                    c33356a1.f139186x = c11602h2;
                    c33356a1.f139187y = abstractC26205h3;
                    c33356a1.f139188z = null;
                    c33356a1.f139179E = null;
                    c33356a1.f139180F = null;
                    c33356a1.f139181G = null;
                    c33356a1.f139184J = 4;
                    objM105807o = c11602h7.m31037m(reconnectDetails, list, c37865a7, c33356a1);
                    if (objM105807o != enumC31071a) {
                        abstractC26205h4 = abstractC26205h3;
                    }
                    return enumC31071a;
                }
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC26205h4 = (AbstractC26205h) c33356a1.f139187y;
                c11602h2 = (C11602h1) c33356a1.f139186x;
                c33368c3 = c33356a1.f139185w;
                AbstractC34132o.m107864I(objM105807o);
            }
            abstractC11611k1 = (AbstractC11611k1) objM105807o;
            if (abstractC11611k1 instanceof C11605i1) {
                JoinCallResponse joinCallResponse = (JoinCallResponse) ((C26204g) abstractC26205h4).f103919a;
                c33368c3.getClass();
                m105809r(c33368c3, joinCallResponse);
                c33452s2 = C33467v2.f139739a;
            } else {
                if (abstractC11611k1 instanceof C11608j1) {
                    throw new NoWhenBranchMatchedException();
                }
                c33452s2 = new C33452s2(((C11608j1) abstractC11611k1).f37473a);
            }
            c2996c2 = c11602h2.f37456r;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            c11602h2.f37432L.m13289a(new C11624r(c11602h2, 1));
            return c33452s2;
            abstractC26205h = (AbstractC26205h) objM105807o;
            if (!(abstractC26205h instanceof C26204g)) {
                return new C33452s2(new Exception("Failed to get join response during migration: " + abstractC26205h.m77815a()));
            }
            Credentials credentials6 = ((JoinCallResponse) ((C26204g) abstractC26205h).f103919a).getCredentials();
            C12645n c12645n = (C12645n) c11602h1.f37421A.getValue();
            List listM35401q = c12645n != null ? c12645n.m35401q() : null;
            String str9 = c11602h1.f37445g;
            C2345k c2345kM105816g2 = c33368c0.m105816g();
            InterfaceC2339e interfaceC2339e2 = c2345kM105816g2.f9275c;
            String str10 = c2345kM105816g2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.INFO;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str10)) {
                c2345kM105816g2.f9274b.log(enumC2341g2, str10, AbstractC31061c.m95640p("[reconnectMigrate] Migrate SFU ", str9, " to ", credentials6.getServer().getEdgeName()), null);
            }
            C23471q c23471qM31039o = c11602h1.m31039o();
            ReconnectDetails reconnectDetails2 = new ReconnectDetails(WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_MIGRATE, (List) c23471qM31039o.f92949y, (List) c23471qM31039o.f92948x, c33368c0.f139292f, str9, "", null, null, 192, null);
            c33356a1.f139185w = c33368c0;
            c33356a1.f139186x = c37865a2;
            c33356a1.f139187y = c11602h1;
            c33356a1.f139188z = abstractC26205h;
            c33356a1.f139179E = credentials6;
            c33356a1.f139180F = listM35401q;
            c33356a1.f139181G = reconnectDetails2;
            c33356a1.f139184J = 2;
            Object objM105811b = c33368c0.m105811b(c33356a1);
            if (objM105811b != enumC31071a) {
                c33368c1 = c33368c0;
                list = listM35401q;
                reconnectDetails = reconnectDetails2;
                credentials = credentials6;
                c37865a3 = c37865a2;
                objM105807o = objM105811b;
                abstractC26205h2 = abstractC26205h;
                c11602h2 = c11602h1;
                c33460u0 = (C33460u0) objM105807o;
                c33356a1.f139185w = c33368c1;
                c33356a1.f139186x = c37865a3;
                c33356a1.f139187y = c11602h2;
                c33356a1.f139188z = abstractC26205h2;
                c33356a1.f139179E = credentials;
                c33356a1.f139180F = list;
                c33356a1.f139181G = reconnectDetails;
                c33356a1.f139184J = 3;
                if (C11602h1.m31014B(c11602h2, c33460u0, null, null, c33356a1, 6) != enumC31071a) {
                    credentials2 = credentials;
                    abstractC26205h3 = abstractC26205h2;
                    c37865a4 = c37865a3;
                    c33368c2 = c33368c1;
                    c11602h2.m31036k(false);
                    C33366b4 c33366b6 = c33368c2.f139293g;
                    int i17 = c33368c2.f139292f;
                    PowerManager powerManager3 = c33368c2.f139299m;
                    String str11 = c33368c2.f139269D;
                    String str12 = c33366b6.f139261y;
                    AbstractC1638x abstractC1638x3 = c33366b6.f139232E.f168476d;
                    String url3 = credentials2.getServer().getUrl();
                    String wsEndpoint3 = credentials2.getServer().getWsEndpoint();
                    String token3 = credentials2.getToken();
                    String edgeName3 = credentials2.getServer().getEdgeName();
                    List<ICEServer> iceServers3 = credentials2.getIceServers();
                    Credentials credentials7 = credentials2;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(iceServers3, 10));
                    it = iceServers3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC32416g.m101143L((ICEServer) it.next()));
                    }
                    C2570m c2570m3 = c33368c2.f139276K.f151340c;
                    ((C0332w0) c2570m3.f9985F).m851O(credentials7.getServer().getEdgeName());
                    C33368c0 c33368c8 = c33368c2;
                    C11602h1 c11602h8 = new C11602h1(c33366b6, i17, powerManager3, c33368c8, str11, str12, abstractC1638x3, url3, wsEndpoint3, token3, edgeName3, arrayList, c2570m3, 3141632);
                    c33368c3 = c33368c8;
                    C13045h2 c13045h5 = c33368c3.f139268C;
                    c13045h5.getClass();
                    c13045h5.m36571k(null, c11602h8);
                    C37865a c37865a8 = new C37865a(c37865a4.f162177a, null);
                    c33356a1.f139185w = c33368c3;
                    c33356a1.f139186x = c11602h2;
                    c33356a1.f139187y = abstractC26205h3;
                    c33356a1.f139188z = null;
                    c33356a1.f139179E = null;
                    c33356a1.f139180F = null;
                    c33356a1.f139181G = null;
                    c33356a1.f139184J = 4;
                    objM105807o = c11602h8.m31037m(reconnectDetails, list, c37865a8, c33356a1);
                    if (objM105807o != enumC31071a) {
                        abstractC26205h4 = abstractC26205h3;
                        abstractC11611k1 = (AbstractC11611k1) objM105807o;
                        if (abstractC11611k1 instanceof C11605i1) {
                            JoinCallResponse joinCallResponse2 = (JoinCallResponse) ((C26204g) abstractC26205h4).f103919a;
                            c33368c3.getClass();
                            m105809r(c33368c3, joinCallResponse2);
                            c33452s2 = C33467v2.f139739a;
                        } else {
                            if (abstractC11611k1 instanceof C11608j1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c33452s2 = new C33452s2(((C11608j1) abstractC11611k1).f37473a);
                        }
                        c2996c2 = c11602h2.f37456r;
                        if (c2996c2 != null) {
                            c2996c2.cancel((CancellationException) null);
                        }
                        c11602h2.f37432L.m13289a(new C11624r(c11602h2, 1));
                        return c33452s2;
                    }
                }
            }
            return enumC31071a;
        } catch (Throwable th3) {
            C2996c2 c2996c3 = 1.f37456r;
            if (c2996c3 != null) {
                c2996c3.cancel((CancellationException) null);
            }
            1.f37432L.m13289a(new C11624r(r10, 1));
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0219 A[LOOP:0: B:51:0x0213->B:53:0x0219, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0278  */
    /* JADX WARN: Code duplicated, block: B:60:0x0282  */
    /* JADX WARN: Code duplicated, block: B:62:0x0296  */
    /* JADX WARN: Code duplicated, block: B:64:0x029a  */
    /* JADX WARN: Code duplicated, block: B:66:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: v */
    public final Object m105827v(String str, C37865a c37865a, AbstractC32269c abstractC32269c) {
        C33362b0 c33362b0;
        C33368c0 c33368c0;
        C37865a c37865a2;
        C11602h1 c11602h1;
        String str2;
        Credentials credentials;
        String str3;
        C33368c0 c33368c1;
        C37865a c37865a3;
        ReconnectDetails reconnectDetails;
        List list;
        AbstractC26205h abstractC26205h;
        ArrayList arrayList;
        Iterator<T> it;
        C33368c0 c33368c2;
        C11602h1 c11602h2;
        Object objM31037m;
        String str4;
        C11602h1 c11602h3;
        C33368c0 c33368c3;
        AbstractC11611k1 abstractC11611k1;
        if (abstractC32269c instanceof C33362b0) {
            c33362b0 = (C33362b0) abstractC32269c;
            int i13 = c33362b0.f139222J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33362b0.f139222J = i13 - Integer.MIN_VALUE;
            } else {
                c33362b0 = new C33362b0(this, abstractC32269c);
            }
        } else {
            c33362b0 = new C33362b0(this, abstractC32269c);
        }
        C33362b0 c33362b1 = c33362b0;
        Object objM105807o = c33362b1.f139220H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33362b1.f139222J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM105807o);
            C2345k c2345kM105816g = m105816g();
            InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
            String str5 = c2345kM105816g.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                c2345kM105816g.f9274b.log(enumC2341g, str5, AbstractC2875y.m8295h(this.f139292f, "[reconnectRejoin] reconnectAttempts="), null);
            }
            C13045h2 c13045h2 = this.f139302p.f139650g;
            c13045h2.getClass();
            c13045h2.m36571k(null, C33432o2.f139567a);
            String str6 = this.f139290d;
            if (str6 == null) {
                return new C33462u2("No location available for rejoin");
            }
            C11602h1 c11602h4 = (C11602h1) this.f139268C.getValue();
            if (c11602h4 == null) {
                return new C33462u2("No active session for rejoin");
            }
            this.f139273H = System.currentTimeMillis();
            c33362b1.f139223w = this;
            c33362b1.f139224x = str;
            c33362b1.f139225y = c37865a;
            c33362b1.f139226z = c11602h4;
            c33362b1.f139222J = 1;
            objM105807o = m105807o(this, null, str6, null, null, c37865a, c33362b1, 125);
            if (objM105807o != enumC31071a) {
                c33368c0 = this;
                c37865a2 = c37865a;
                c11602h1 = c11602h4;
                str2 = str;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c11602h1 = (C11602h1) c33362b1.f139226z;
            c37865a2 = (C37865a) c33362b1.f139225y;
            String str7 = c33362b1.f139224x;
            C33368c0 c33368c4 = c33362b1.f139223w;
            AbstractC34132o.m107864I(objM105807o);
            str2 = str7;
            c33368c0 = c33368c4;
        } else {
            if (i14 == 2) {
                reconnectDetails = c33362b1.f139219G;
                List list2 = c33362b1.f139218F;
                credentials = c33362b1.f139217E;
                AbstractC26205h abstractC26205h2 = (AbstractC26205h) c33362b1.f139226z;
                c37865a3 = (C37865a) c33362b1.f139225y;
                String str8 = c33362b1.f139224x;
                c33368c1 = c33362b1.f139223w;
                AbstractC34132o.m107864I(objM105807o);
                list = list2;
                abstractC26205h = abstractC26205h2;
                str3 = str8;
                C33366b4 c33366b4 = c33368c1.f139293g;
                int i15 = c33368c1.f139292f;
                PowerManager powerManager = c33368c1.f139299m;
                String str9 = c33368c1.f139269D;
                String str10 = c33366b4.f139261y;
                AbstractC1638x abstractC1638x = c33366b4.f139232E.f168476d;
                String url = credentials.getServer().getUrl();
                String wsEndpoint = credentials.getServer().getWsEndpoint();
                String token = credentials.getToken();
                String edgeName = credentials.getServer().getEdgeName();
                List<ICEServer> iceServers = credentials.getIceServers();
                Credentials credentials2 = credentials;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(iceServers, 10));
                it = iceServers.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC32416g.m101143L((ICEServer) it.next()));
                }
                C2570m c2570m = c33368c1.f139276K.f151340c;
                ((C0332w0) c2570m.f9985F).m851O(credentials2.getServer().getEdgeName());
                c33368c2 = c33368c1;
                c11602h2 = new C11602h1(c33366b4, i15, powerManager, c33368c2, str9, str10, abstractC1638x, url, wsEndpoint, token, edgeName, arrayList, c2570m, 3141632);
                C13045h2 c13045h3 = c33368c2.f139268C;
                c13045h3.getClass();
                c13045h3.m36571k(null, c11602h2);
                C37865a c37865a4 = new C37865a(c37865a3.f162177a, null);
                c33362b1.f139223w = c33368c2;
                c33362b1.f139224x = str3;
                c33362b1.f139225y = abstractC26205h;
                c33362b1.f139226z = c11602h2;
                c33362b1.f139217E = null;
                c33362b1.f139218F = null;
                c33362b1.f139219G = null;
                c33362b1.f139222J = 3;
                objM31037m = c11602h2.m31037m(reconnectDetails, list, c37865a4, c33362b1);
                if (objM31037m != enumC31071a) {
                    str4 = str3;
                    c11602h3 = c11602h2;
                    c33368c3 = c33368c2;
                    objM105807o = objM31037m;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11602h3 = (C11602h1) c33362b1.f139226z;
            abstractC26205h = (AbstractC26205h) c33362b1.f139225y;
            str4 = c33362b1.f139224x;
            c33368c3 = c33362b1.f139223w;
            AbstractC34132o.m107864I(objM105807o);
        }
        abstractC11611k1 = (AbstractC11611k1) objM105807o;
        if (abstractC11611k1 instanceof C11605i1) {
            if (abstractC11611k1 instanceof C11608j1) {
                return new C33452s2(((C11608j1) abstractC11611k1).f37473a);
            }
            throw new NoWhenBranchMatchedException();
        }
        c11602h3.f37452n.m67653b(str4, "rejoin");
        JoinCallResponse joinCallResponse = (JoinCallResponse) ((C26204g) abstractC26205h).f103919a;
        c33368c3.getClass();
        m105809r(c33368c3, joinCallResponse);
        return C33467v2.f139739a;
        AbstractC26205h abstractC26205h3 = (AbstractC26205h) objM105807o;
        if (!(abstractC26205h3 instanceof C26204g)) {
            return new C33452s2(new Exception("Failed to get join response: " + abstractC26205h3.m77815a()));
        }
        credentials = ((JoinCallResponse) ((C26204g) abstractC26205h3).f103919a).getCredentials();
        C12645n c12645n = (C12645n) c11602h1.f37421A.getValue();
        List listM35401q = c12645n != null ? c12645n.m35401q() : null;
        C2345k c2345kM105816g2 = c33368c0.m105816g();
        InterfaceC2339e interfaceC2339e2 = c2345kM105816g2.f9275c;
        String str11 = c2345kM105816g2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str11)) {
            c2345kM105816g2.f9274b.log(enumC2341g2, str11, AbstractC31061c.m95640p("Rejoin SFU ", c11602h1.f37443e, " to ", credentials.getServer().getUrl()), null);
        }
        c33368c0.f139269D = AbstractC11895b.m31995n("toString(...)");
        C23471q c23471qM31039o = c11602h1.m31039o();
        String sessionId = (String) c23471qM31039o.f92947w;
        ReconnectDetails reconnectDetails2 = new ReconnectDetails(WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_REJOIN, (List) c23471qM31039o.f92949y, (List) c23471qM31039o.f92948x, c33368c0.f139292f, null, sessionId, str2, null, 144, null);
        str3 = str2;
        C33450s0 c33450s0 = c33368c0.f139302p;
        c33450s0.getClass();
        AbstractC22676k.m65750j(sessionId, "sessionId");
        ConcurrentHashMap concurrentHashMap = c33450s0.f139654i;
        concurrentHashMap.remove(sessionId);
        C13045h2 c13045h4 = c33450s0.f139656j;
        HashMap map = new HashMap(concurrentHashMap);
        c13045h4.getClass();
        c13045h4.m36571k(null, map);
        c33362b1.f139223w = c33368c0;
        c33362b1.f139224x = str3;
        c33362b1.f139225y = c37865a2;
        c33362b1.f139226z = abstractC26205h3;
        c33362b1.f139217E = credentials;
        c33362b1.f139218F = listM35401q;
        c33362b1.f139219G = reconnectDetails2;
        c33362b1.f139222J = 2;
        if (c11602h1.m31048x("rejoin", c33362b1) != enumC31071a) {
            c33368c1 = c33368c0;
            c37865a3 = c37865a2;
            reconnectDetails = reconnectDetails2;
            list = listM35401q;
            abstractC26205h = abstractC26205h3;
            C33366b4 c33366b5 = c33368c1.f139293g;
            int i16 = c33368c1.f139292f;
            PowerManager powerManager2 = c33368c1.f139299m;
            String str12 = c33368c1.f139269D;
            String str13 = c33366b5.f139261y;
            AbstractC1638x abstractC1638x2 = c33366b5.f139232E.f168476d;
            String url2 = credentials.getServer().getUrl();
            String wsEndpoint2 = credentials.getServer().getWsEndpoint();
            String token2 = credentials.getToken();
            String edgeName2 = credentials.getServer().getEdgeName();
            List<ICEServer> iceServers2 = credentials.getIceServers();
            Credentials credentials3 = credentials;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(iceServers2, 10));
            it = iceServers2.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC32416g.m101143L((ICEServer) it.next()));
            }
            C2570m c2570m2 = c33368c1.f139276K.f151340c;
            ((C0332w0) c2570m2.f9985F).m851O(credentials3.getServer().getEdgeName());
            c33368c2 = c33368c1;
            c11602h2 = new C11602h1(c33366b5, i16, powerManager2, c33368c2, str12, str13, abstractC1638x2, url2, wsEndpoint2, token2, edgeName2, arrayList, c2570m2, 3141632);
            C13045h2 c13045h5 = c33368c2.f139268C;
            c13045h5.getClass();
            c13045h5.m36571k(null, c11602h2);
            C37865a c37865a5 = new C37865a(c37865a3.f162177a, null);
            c33362b1.f139223w = c33368c2;
            c33362b1.f139224x = str3;
            c33362b1.f139225y = abstractC26205h;
            c33362b1.f139226z = c11602h2;
            c33362b1.f139217E = null;
            c33362b1.f139218F = null;
            c33362b1.f139219G = null;
            c33362b1.f139222J = 3;
            objM31037m = c11602h2.m31037m(reconnectDetails, list, c37865a5, c33362b1);
            if (objM31037m != enumC31071a) {
                str4 = str3;
                c11602h3 = c11602h2;
                c33368c3 = c33368c2;
                objM105807o = objM31037m;
                abstractC11611k1 = (AbstractC11611k1) objM105807o;
                if (abstractC11611k1 instanceof C11605i1) {
                    if (abstractC11611k1 instanceof C11608j1) {
                        return new C33452s2(((C11608j1) abstractC11611k1).f37473a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c11602h3.f37452n.m67653b(str4, "rejoin");
                JoinCallResponse joinCallResponse2 = (JoinCallResponse) ((C26204g) abstractC26205h).f103919a;
                c33368c3.getClass();
                m105809r(c33368c3, joinCallResponse2);
                return C33467v2.f139739a;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: w */
    public final Object m105828w(AbstractC34235f abstractC34235f, InterfaceC30057d interfaceC30057d) {
        C2345k c2345kM105816g = m105816g();
        InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM105816g.f9273a;
        boolean zIsLoggable = interfaceC2339e.isLoggable(enumC2341g, str);
        String str2 = this.f139289c;
        if (zIsLoggable) {
            c2345kM105816g.f9274b.log(enumC2341g, str, "[reject] #ringing; rejectReason: " + abstractC34235f + ", call_id:" + str2, null);
        }
        C33366b4 c33366b4 = this.f139293g;
        c33366b4.getClass();
        return c33366b4.m105795m(new C0417e0(c33366b4, this.f139288b, str2, abstractC34235f, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: x */
    public final Object m105829x(String str, AbstractC34235f abstractC34235f, AbstractC32269c abstractC32269c) {
        C2345k c2345kM105816g = m105816g();
        InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = c2345kM105816g.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM105816g.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[reject] source: ", str), null);
        }
        return m105828w(abstractC34235f, abstractC32269c);
    }
}
