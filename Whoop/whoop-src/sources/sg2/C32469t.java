package sg2;

import android.content.Context;
import android.os.Handler;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.whoop.archv2.feature.domain.C6010p;
import com.whoop.cache.persistence.C6101a;
import com.whoop.healthconnect.view.HealthConnectFragment;
import com.whoop.navigation.C9598e;
import i21.C17991a;
import io.sentry.android.replay.video.C20245d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import ld2.C23866a;
import lr.RunnableC24693e;
import ng2.C26687f;
import p077d0.C11335b2;
import p181h2.C16618c;
import p208i2.C17891j;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p294l3.AbstractC23284v;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23275q0;
import p294l3.C23277r0;
import p294l3.C23279s0;
import p294l3.C23286w;
import p31.C28801l;
import p329n0.InterfaceC26064q;
import p353o0.InterfaceC27335s;
import p390p1.C28621h1;
import p390p1.C28624i0;
import p390p1.C28633k1;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p500tb.InterfaceC33687a;
import p510u0.C34349q1;
import p510u0.C34352r1;
import p510u0.C34357t0;
import p510u0.C34360u0;
import p510u0.C34368x0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.C39178j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.time.Duration;
import p739ui0.AbstractC35016r;
import po2.C29404c;
import q83.AbstractC30060g;
import rt1.C31809g;
import rt1.EnumC31808f;
import rt1.InterfaceC31804b;
import rv2.InterfaceC31846d;
import rv2.InterfaceC31850h;
import s90.C32290f;
import so2.AbstractC32849g;
import st1.AbstractC32991l;
import st1.AbstractC32993n;
import su1.AbstractC33020f;
import sv2.AbstractC33042e;
import sv2.C33038a;
import sx0.AbstractC33059a;
import sx0.C33062d;
import sx0.C33064f;
import sx1.AbstractC33074j;
import sy0.C33082e;
import t01.AbstractC33261g;
import t31.AbstractC33526b;
import t31.C33527c;
import t71.AbstractC33576m;
import t71.AbstractC33578o;
import t71.C33573j;
import t71.C33579p;
import td2.C33717h;
import td2.InterfaceC33715f;
import tg2.C33791e;
import tg2.C33799m;
import u40.C34531g;
import ud2.AbstractC34796e;
import uh1.C34967b;
import ux1.C35368b;
import ux1.C35370d;
import vh1.C36045a;

/* JADX INFO: renamed from: sg2.t */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32469t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134457w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f134458x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f134459y;

    public /* synthetic */ C32469t(int i13, Object obj, Object obj2) {
        this.f134457w = i13;
        this.f134459y = obj;
        this.f134458x = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C23279s0 c23279s0Mo67353b;
        C23279s0 c23279s0Mo67353b2;
        C23279s0 c23279s0Mo67353b3;
        C23277r0 c23277r0;
        C17891j c17891jM67341j;
        C23275q0 c23275q0;
        switch (this.f134457w) {
            case 0:
                return AbstractC32471v.m101420E((InterfaceC1585g0) this.f134459y, (C26687f) this.f134458x, (C28624i0) obj);
            case 1:
                return AbstractC32471v.m101457y((Context) this.f134459y, (C26687f) this.f134458x, ((Boolean) obj).booleanValue());
            case 2:
                return HealthConnectFragment.m21556J((InterfaceC1585g0) this.f134459y, (HealthConnectFragment) this.f134458x, (C28624i0) obj);
            case 3:
                return AbstractC32849g.m103109k((C29404c.c) this.f134459y, (Function1) this.f134458x, (InterfaceC26064q) obj);
            case 4:
                return AbstractC32991l.m104155G((Function1) this.f134459y, (C31809g) this.f134458x, (InterfaceC31804b) obj);
            case 5:
                return AbstractC32993n.m104211q((Map) this.f134459y, (EnumC31808f) this.f134458x, ((Boolean) obj).booleanValue());
            case 6:
                return AbstractC33020f.m104268p((C28801l) this.f134459y, (Function1) this.f134458x, obj);
            case 7:
                return AbstractC33042e.m104482W0((C33038a) this.f134459y, (InterfaceC23462h) this.f134458x, (InterfaceC31846d) obj);
            case 8:
                return AbstractC33042e.m104456J0((InterfaceC31850h.b) this.f134459y, (Function1) this.f134458x, (InterfaceC27335s) obj);
            case 9:
                return AbstractC33059a.m104683k((C33064f) this.f134459y, (Function1) this.f134458x, (InterfaceC26064q) obj);
            case 10:
                return AbstractC33059a.m104690r((InterfaceC4351m) this.f134459y, (C33062d) this.f134458x, ((Boolean) obj).booleanValue());
            case 11:
                return AbstractC33074j.m104742K((InterfaceC4351m) this.f134459y, (C35368b) this.f134458x, obj);
            case 12:
                return AbstractC33074j.m104733B((C35370d) this.f134459y, (InterfaceC4351m) this.f134458x, (InterfaceC26064q) obj);
            case 13:
                return AbstractC33261g.m105526e((String) this.f134459y, (C33082e) this.f134458x, (InterfaceC18044z) obj);
            case 14:
                return AbstractC33526b.m105902h((Function1) this.f134459y, (C33527c) this.f134458x, obj);
            case 15:
                return AbstractC33576m.m106043m((Function1) this.f134459y, (C33573j) this.f134458x, (C17991a) obj);
            case 16:
                return AbstractC33578o.m106057f((Function1) this.f134459y, (C33579p) this.f134458x, (C17991a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C33791e.m106879f((Function1) this.f134459y, (C33799m) this.f134458x, (String) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C29891y c29891y = (C29891y) this.f134459y;
                Function1 function1 = (Function1) this.f134458x;
                C29891y c29891y2 = (C29891y) obj;
                if (!AbstractC22676k.m65745e(c29891y, c29891y2)) {
                    function1.invoke(c29891y2);
                }
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                ArrayList arrayListM92117g = AbstractC30060g.m92117g((List) this.f134459y, ((C34360u0) this.f134458x).f144369a);
                if (arrayListM92117g != null) {
                    int size = arrayListM92117g.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        C23465k c23465k = (C23465k) arrayListM92117g.get(i13);
                        AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) c23465k.f92937w;
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c23465k.f92938x;
                        AbstractC39101i1.m124623k(abstractC39101i1, abstractC39104j1, interfaceC4339a != null ? ((C39178j) interfaceC4339a.invoke()).f168416a : 0L);
                    }
                }
                return C23454a0.f92919a;
            case 20:
                return new C11335b2(5, (InterfaceC28601c1) this.f134459y, (InterfaceC21083i) this.f134458x);
            case 21:
                C23250e c23250e = (C23250e) this.f134459y;
                C28621h1 c28621h1 = ((C34357t0) this.f134458x).f144353b;
                C34368x0 c34368x0 = (C34368x0) obj;
                AbstractC23284v abstractC23284v = (AbstractC23284v) c23250e.f92125a;
                C23279s0 c23279s0Mo67353b4 = abstractC23284v.mo67353b();
                C23267m0 c23267m0M67328d = null;
                C23267m0 c23267m0 = c23279s0Mo67353b4 != null ? c23279s0Mo67353b4.f92237a : null;
                C23267m0 c23267m0M67328d2 = ((c28621h1.m87024x() & 1) == 0 || (c23279s0Mo67353b3 = abstractC23284v.mo67353b()) == null) ? null : c23279s0Mo67353b3.f92238b;
                if (c23267m0 != null) {
                    c23267m0M67328d2 = c23267m0.m67328d(c23267m0M67328d2);
                }
                C23267m0 c23267m0M67328d3 = ((c28621h1.m87024x() & 2) == 0 || (c23279s0Mo67353b2 = abstractC23284v.mo67353b()) == null) ? null : c23279s0Mo67353b2.f92239c;
                if (c23267m0M67328d2 != null) {
                    c23267m0M67328d3 = c23267m0M67328d2.m67328d(c23267m0M67328d3);
                }
                if ((c28621h1.m87024x() & 4) != 0 && (c23279s0Mo67353b = abstractC23284v.mo67353b()) != null) {
                    c23267m0M67328d = c23279s0Mo67353b.f92240d;
                }
                if (c23267m0M67328d3 != null) {
                    c23267m0M67328d = c23267m0M67328d3.m67328d(c23267m0M67328d);
                }
                c34368x0.f144421b = c34368x0.f144420a.m67317d(new C32290f(new C22659b0(), c23250e, c23267m0M67328d, 14));
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C34352r1 c34352r1 = (C34352r1) this.f134459y;
                C23250e c23250e2 = (C23250e) this.f134458x;
                InterfaceC17886g0 interfaceC17886g0 = (InterfaceC17886g0) obj;
                C23254g c23254g = c34352r1.f144302b;
                C28633k1 c28633k1 = c34352r1.f144301a;
                C23277r0 c23277r1 = (C23277r0) c28633k1.getValue();
                if (AbstractC22676k.m65745e(c23254g, (c23277r1 == null || (c23275q0 = c23277r1.f92227a) == null) ? null : c23275q0.f92216a) && (c23277r0 = (C23277r0) c28633k1.getValue()) != null) {
                    C23286w c23286w = c23277r0.f92228b;
                    C23250e c23250eM108656c = C34352r1.m108656c(c23250e2, c23277r0);
                    if (c23250eM108656c == null) {
                        c17891jM67341j = null;
                    } else {
                        int i14 = c23250eM108656c.f92127c;
                        int i15 = c23250eM108656c.f92126b;
                        c17891jM67341j = c23277r0.m67341j(i15, i14);
                        C16618c c16618cM67333b = c23277r0.m67333b(i15);
                        int i16 = i14 - 1;
                        c17891jM67341j.m51466m(((((long) Float.floatToRawIntBits(c16618cM67333b.f63940b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c23286w.m67374d(i15) == c23286w.m67374d(i16) ? Math.min(c23277r0.m67333b(i16).f63939a, c16618cM67333b.f63939a) : 0.0f)) << 32)) ^ (-9223372034707292160L));
                    }
                } else {
                    c17891jM67341j = null;
                }
                C34349q1 c34349q1 = c17891jM67341j != null ? new C34349q1(c17891jM67341j) : null;
                if (c34349q1 != null) {
                    C17920x0 c17920x0 = (C17920x0) interfaceC17886g0;
                    c17920x0.m51563t(c34349q1);
                    c17920x0.m51554e(true);
                }
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C20245d c20245d = (C20245d) this.f134459y;
                HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) this.f134458x;
                String token = (String) obj;
                AbstractC22676k.m65750j(token, "token");
                long jM134144getTokenExpirationUwyO8pc = hCaptchaConfig.m134144getTokenExpirationUwyO8pc();
                Handler handler = (Handler) c20245d.f76050f;
                handler.postDelayed(new RunnableC24693e(c20245d, 24), Duration.m134273getInWholeMillisecondsimpl(jM134144getTokenExpirationUwyO8pc));
                c20245d.f76045a = new C34531g(handler, token);
                c20245d.m56172o();
                return C23454a0.f92919a;
            case 24:
                return AbstractC34796e.m109828J((Function1) this.f134459y, (C33717h) this.f134458x, (InterfaceC33715f) obj);
            case 25:
                return AbstractC34796e.m109821C((C23866a) this.f134459y, (Function1) this.f134458x, (C9598e) obj);
            case 26:
                return ((C34967b) this.f134459y).m110444o((C36045a) this.f134458x, (InterfaceC33687a) obj);
            case 27:
                return AbstractC35016r.m110639g((InterfaceC4351m) this.f134459y, (C6010p) this.f134458x, (String) obj);
            case 28:
                return C6101a.m18310H("SELECT * FROM cache_entries WHERE uri = ? LIMIT 1", (String) this.f134459y, (C6101a) this.f134458x, (InterfaceC33687a) obj);
            default:
                return C6101a.m18311I((C6101a) this.f134459y, (List) this.f134458x, (InterfaceC33687a) obj);
        }
    }

    public /* synthetic */ C32469t(C34352r1 c34352r1, C23250e c23250e, C34357t0 c34357t0) {
        this.f134457w = 21;
        this.f134459y = c23250e;
        this.f134458x = c34357t0;
    }
}
