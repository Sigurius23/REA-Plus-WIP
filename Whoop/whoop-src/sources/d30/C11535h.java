package d30;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import ec3.C13045h2;
import ec3.C13081r1;
import hc3.AbstractC17182o;
import hc3.C17171d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kc3.C22365e;
import n53.C26318e;
import p012ab.C0680g0;
import p031b9.AbstractC2875y;
import p085d9.C11780a0;
import p085d9.C11781b;
import p085d9.C11783c;
import p085d9.C11785d;
import p085d9.C11787e;
import p085d9.C11807x;
import p097ds.AbstractC12313p;
import p361o9.C27677q;
import p516u8.C34586d;
import p607x8.AbstractC38065t;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import ro.C31624i;
import v00.C35459c0;

/* JADX INFO: renamed from: d30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C11535h {

    /* JADX INFO: renamed from: a */
    public boolean f37184a;

    /* JADX INFO: renamed from: b */
    public final Object f37185b;

    /* JADX INFO: renamed from: c */
    public final Object f37186c;

    /* JADX INFO: renamed from: d */
    public final Object f37187d;

    /* JADX INFO: renamed from: e */
    public final Object f37188e;

    /* JADX INFO: renamed from: f */
    public final Object f37189f;

    /* JADX INFO: renamed from: g */
    public final Object f37190g;

    /* JADX INFO: renamed from: h */
    public Object f37191h;

    /* JADX INFO: renamed from: i */
    public Object f37192i;

    /* JADX INFO: renamed from: j */
    public Object f37193j;

    public C11535h(Context context, C0680g0 c0680g0, C34586d c34586d, C31624i c31624i) {
        Context applicationContext = context.getApplicationContext();
        this.f37185b = applicationContext;
        this.f37186c = c0680g0;
        this.f37193j = c34586d;
        this.f37192i = c31624i;
        int i13 = AbstractC38065t.f163031a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f37187d = handler;
        int i14 = 0;
        this.f37188e = AbstractC38065t.f163031a >= 23 ? new C11783c(this, i14) : null;
        this.f37189f = new C11787e(this, i14);
        C11781b c11781b = C11781b.f38191c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f37190g = uriFor != null ? new C11785d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [c93.a, kotlin.jvm.internal.i] */
    /* JADX INFO: renamed from: a */
    public void m30991a(AbstractC12313p abstractC12313p) {
        if (abstractC12313p instanceof C11572y) {
            ((Function1) this.f37188e).invoke(((C11572y) abstractC12313p).f37349b);
            if (((AtomicBoolean) this.f37192i).getAndSet(true)) {
                return;
            }
            ((Function1) this.f37190g).invoke(Boolean.TRUE);
            return;
        }
        if (abstractC12313p instanceof C11515a0) {
            ((Function1) this.f37189f).invoke(((C11515a0) abstractC12313p).f37089b);
        } else {
            if (!abstractC12313p.equals(C11574z.f37352b)) {
                throw new NoWhenBranchMatchedException();
            }
            ((C22672i) this.f37187d).invoke();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m30992b(C11781b c11781b) {
        C27677q c27677q;
        if (!this.f37184a || c11781b.equals((C11781b) this.f37191h)) {
            return;
        }
        this.f37191h = c11781b;
        C11807x c11807x = (C11807x) ((C0680g0) this.f37186c).f2413x;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = c11807x.f38374f0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(AbstractC2875y.m8300m("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        C11781b c11781b2 = c11807x.f38394w;
        if (c11781b2 == null || c11781b.equals(c11781b2)) {
            return;
        }
        c11807x.f38394w = c11781b;
        C31624i c31624i = c11807x.f38389r;
        if (c31624i != null) {
            C11780a0 c11780a0 = (C11780a0) c31624i.f130665x;
            synchronized (c11780a0.f11094w) {
                c27677q = c11780a0.f11093Q;
            }
            if (c27677q != null) {
                synchronized (c27677q.f111423d) {
                    c27677q.f111426g.getClass();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m30993c(AudioDeviceInfo audioDeviceInfo) {
        C31624i c31624i = (C31624i) this.f37192i;
        if (Objects.equals(audioDeviceInfo, c31624i == null ? null : (AudioDeviceInfo) c31624i.f130665x)) {
            return;
        }
        C31624i c31624i2 = audioDeviceInfo != null ? new C31624i(audioDeviceInfo, 24) : null;
        this.f37192i = c31624i2;
        m30992b(C11781b.m31593c((Context) this.f37185b, (C34586d) this.f37193j, c31624i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11535h(C26318e paymentMethods, C35459c0 paymentMethodMetadata, C13081r1 selection, C13045h2 editing, C26318e canEdit, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Function1 function3, C26318e defaultPaymentMethodId) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 dispatcher = AbstractC17182o.f65999a;
        AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(selection, "selection");
        AbstractC22676k.m65750j(editing, "editing");
        AbstractC22676k.m65750j(canEdit, "canEdit");
        AbstractC22676k.m65750j(defaultPaymentMethodId, "defaultPaymentMethodId");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        this.f37185b = paymentMethods;
        this.f37186c = paymentMethodMetadata;
        this.f37187d = (C22672i) interfaceC4339a;
        this.f37188e = function1;
        this.f37189f = function2;
        this.f37190g = function3;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(dispatcher.plus(AbstractC3006f0.m8710d()));
        this.f37191h = c17171dM8708b;
        int i13 = 0;
        this.f37192i = new AtomicBoolean(false);
        C26318e c26318eM9509p = AbstractC3269g.m9509p(paymentMethods, defaultPaymentMethodId, new C11517b(this));
        this.f37184a = paymentMethodMetadata.f150996w.mo124338q0();
        this.f37193j = AbstractC3269g.m9510q(c26318eM9509p, selection, editing, canEdit, new C11520c(i13));
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C11526e(this, interfaceC30057d, i13), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C11526e(this, interfaceC30057d, 1), 3);
    }
}
