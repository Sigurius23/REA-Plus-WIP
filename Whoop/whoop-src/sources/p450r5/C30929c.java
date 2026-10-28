package p450r5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import com.mapbox.common.location.DeviceLocationProvider;
import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.C5576g;
import ec3.C13045h2;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import l83.C23454a0;
import m63.C25126d;
import ng3.C26702o;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p026b2.AbstractC2316v;
import p320m5.C25059c;
import p33.C28820m;
import p470rv.C31828h;
import p470rv.C31829i;
import p470rv.C31830j;
import p480s5.C32198a;
import p512u2.C34453d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import rf3.C31364c;
import sv.AbstractC33028d;
import t23.C33358a2;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33388f3;
import t23.C33391g1;
import t23.C33402i2;
import t23.C33426n1;
import t23.C33450s0;
import t23.C33477x2;
import t23.InterfaceC33400i0;
import w23.C36759q;
import w23.C36760r;
import xf3.C38266c;
import y33.C39200c;
import z33.C40053b;

/* JADX INFO: renamed from: r5.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C30929c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127627w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f127628x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f127629y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30929c(int i13, Object obj, Object obj2) {
        super(0);
        this.f127627w = i13;
        this.f127628x = obj;
        this.f127629y = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, l83.h] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() throws IllegalAccessException, InstantiationException {
        C38266c c38266c;
        Object value;
        switch (this.f127627w) {
            case 0:
                C30931e c30931e = (C30931e) this.f127628x;
                c30931e.m95140f().execute(new RunnableC30928b(1, c30931e, (GetCredentialUnknownException) this.f127629y));
                return C23454a0.f92919a;
            case 1:
                C31364c c31364c = (C31364c) this.f127628x;
                C0237p c0237p = (C0237p) this.f127629y;
                HashMap map = c31364c.f129024b;
                String str = null;
                if (c0237p != null && (c38266c = (C38266c) c0237p.f813y) != null) {
                    str = c38266c.f164059b;
                }
                if (map.get(str) == null) {
                    c31364c.f129024b.put(((C38266c) c0237p.f813y).f164059b, c31364c.mo96460a(c0237p));
                }
                return C23454a0.f92919a;
            case 2:
                ((DeviceLocationProvider) this.f127628x).removeLocationObserver((C31829i) this.f127629y);
                return C23454a0.f92919a;
            case 3:
                C31830j c31830j = (C31830j) ((C25126d) this.f127628x).f98484x;
                C31828h c31828h = (C31828h) this.f127629y;
                c31830j.getClass();
                LinkedHashSet linkedHashSet = c31830j.f131868c;
                if (linkedHashSet.remove(c31828h) && linkedHashSet.isEmpty()) {
                    SensorManager sensorManager = c31830j.f131867b;
                    Sensor sensor = c31830j.f131870e;
                    if (sensor != null) {
                        sensorManager.unregisterListener(c31830j, sensor);
                    } else {
                        sensorManager.unregisterListener(c31830j, c31830j.f131871f);
                        sensorManager.unregisterListener(c31830j, c31830j.f131872g);
                    }
                }
                return C23454a0.f92919a;
            case 4:
                C32198a c32198a = (C32198a) this.f127628x;
                Executor executor = c32198a.f133336f;
                if (executor != null) {
                    executor.execute(new RunnableC30928b(9, c32198a, (C25059c) this.f127629y));
                    return C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("executor");
                throw null;
            case 5:
                ValueAnimator valueAnimator = (ValueAnimator) this.f127628x;
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC33028d abstractC33028d = (AbstractC33028d) this.f127629y;
                abstractC33028d.mo104295c(animatedValue, valueAnimator.getAnimatedFraction());
                Function1 function1 = abstractC33028d.f137567w;
                if (function1 != null) {
                    function1.invoke(animatedValue);
                }
                return C23454a0.f92919a;
            case 6:
                C33368c0 c33368c0 = (C33368c0) this.f127628x;
                C2996c2 c2996c2 = c33368c0.f139285T;
                String str2 = c33368c0.f139289c;
                C33366b4 c33366b4 = c33368c0.f139287a;
                C33391g1 c33391g1 = c33366b4.f139248U;
                InterfaceC30057d interfaceC30057d = null;
                if (c2996c2 != null) {
                    c2996c2.cancel((CancellationException) null);
                }
                C2996c2 c2996c3 = c33368c0.f139284S;
                if (c2996c3 != null) {
                    c2996c3.cancel((CancellationException) null);
                }
                C36760r c36760r = c33368c0.f139276K.f151341d.f157314g;
                InterfaceC3027k1 interfaceC3027k1 = ((C36759q) c36760r.f157322b.f45200w.getValue()).f157316a;
                if (interfaceC3027k1 != null) {
                    interfaceC3027k1.cancel((CancellationException) null);
                }
                C13045h2 c13045h2 = c36760r.f157321a;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C36759q.m117872a((C36759q) value, null, null, null, null, null, 30)));
                c33368c0.f139284S = null;
                c33368c0.f139285T = null;
                C2996c2 c2996c4 = c33368c0.f139280O;
                if (c2996c4 != null) {
                    c2996c4.cancel((CancellationException) null);
                }
                ((C40053b) c33368c0.f139303q.getValue()).m128403e(c33368c0.f139279N);
                C2996c2 c2996c5 = c33368c0.f139286U;
                if (c2996c5 != null) {
                    c2996c5.cancel((CancellationException) null);
                }
                C13045h2 c13045h3 = c33368c0.f139302p.f139650g;
                c13045h3.getClass();
                c13045h3.m36571k(null, C33402i2.f139475a);
                C2345k c2345kM105816g = c33368c0.m105816g();
                InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
                String str3 = c2345kM105816g.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
                    c2345kM105816g.f9274b.log(enumC2341g, str3, "[leave] #ringing; call_id = ".concat(str2), null);
                }
                if (c33368c0.f139267B) {
                    C2345k c2345kM105816g2 = c33368c0.m105816g();
                    InterfaceC2339e interfaceC2339e2 = c2345kM105816g2.f9275c;
                    String str4 = c2345kM105816g2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.WARN;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str4)) {
                        c2345kM105816g2.f9274b.log(enumC2341g2, str4, "[leave] #ringing; Call already destroyed, ignoring", null);
                    }
                } else {
                    c33368c0.f139267B = true;
                    C33388f3 c33388f3 = (C33388f3) c33368c0.f139307u.getValue();
                    C13045h2 c13045h4 = c33388f3.f139386b;
                    c13045h4.getClass();
                    c13045h4.m36571k(null, C33426n1.f139555a);
                    C13045h2 c13045h5 = c33388f3.f139388d;
                    Boolean bool = Boolean.FALSE;
                    c13045h5.getClass();
                    c13045h5.m36571k(null, bool);
                    c33368c0.m105814e().m105834c();
                    C33358a2.m105787a(c33368c0.m105818i());
                    C33368c0 c33368c1 = (C33368c0) c33391g1.f139405h.getValue();
                    if (str2.equals(c33368c1 != null ? c33368c1.f139289c : null)) {
                        C13045h2 c13045h6 = c33391g1.f139403f;
                        C13045h2 c13045h7 = c33391g1.f139405h;
                        C2345k c2345kM105845a = c33391g1.m105845a();
                        InterfaceC2339e interfaceC2339e3 = c2345kM105845a.f9275c;
                        String str5 = c2345kM105845a.f9273a;
                        EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                        if (interfaceC2339e3.isLoggable(enumC2341g3, str5)) {
                            InterfaceC2344j interfaceC2344j = c2345kM105845a.f9274b;
                            C33368c0 c33368c2 = (C33368c0) c13045h7.getValue();
                            interfaceC2344j.log(enumC2341g3, str5, AbstractC11266d.m30462p("[removeActiveCall] call.id == activeCall.value?.id :", str2.equals(c33368c2 != null ? c33368c2.f139289c : null)), null);
                        }
                        C33368c0 c33368c3 = (C33368c0) c13045h7.getValue();
                        if (str2.equals(c33368c3 != null ? c33368c3.f139289c : null)) {
                            C33368c0 c33368c4 = (C33368c0) c13045h6.getValue();
                            if (c33368c4 != null) {
                                c33391g1.m105847c(c33368c4);
                            }
                            c13045h6.m36570j(null);
                            c33391g1.m105848d(c33368c0);
                        }
                    }
                    C33368c0 c33368c5 = (C33368c0) c33391g1.f139404g.getValue();
                    if (str2.equals(c33368c5 != null ? c33368c5.f139289c : null)) {
                        c33391g1.m105848d(c33368c0);
                    }
                    Context context = c33366b4.f139259w;
                    AbstractC22676k.m65750j(context, "context");
                    new C26702o(16);
                    C26702o.m79409m(c33366b4.f139238K.m9548b(c33368c0.f139288b), context);
                    c33366b4.m105802t(c33368c0);
                    AbstractC3006f0.m8732z(c33368c0.f139293g.f139260x, null, null, new C28820m((InterfaceC33400i0) this.f127629y, c33368c0, interfaceC30057d, 6), 3);
                }
                return C23454a0.f92919a;
            case 7:
                C33450s0 c33450s0 = (C33450s0) this.f127628x;
                C13045h2 c13045h8 = c33450s0.f139617F;
                C33477x2 c33477x2 = (C33477x2) this.f127629y;
                c13045h8.getClass();
                c13045h8.m36571k(null, c33477x2);
                c33450s0.f139689z0.m105843c();
                return C23454a0.f92919a;
            case 8:
                Class cls = (Class) this.f127628x;
                if (cls.isAssignableFrom(C5576g.class)) {
                    return new C5576g((Class) this.f127629y);
                }
                Object objNewInstance = cls.newInstance();
                AbstractC22676k.m65749i(objNewInstance, "{\n      builderType.newInstance()\n    }");
                return (AbstractC5579j) objNewInstance;
            case 9:
                ((C34453d) this.f127628x).m108909d((AbstractC2316v) this.f127629y);
                return C23454a0.f92919a;
            default:
                InterfaceC2994c0 interfaceC2994c0 = ((C39200c) this.f127628x).f168474b;
                Object systemService = ((Context) this.f127629y).getSystemService("connectivity");
                AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return new C40053b(interfaceC2994c0, (ConnectivityManager) systemService);
        }
    }
}
