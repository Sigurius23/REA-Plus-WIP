package p036bq;

import a30.C0332w0;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.health.platform.client.proto.C1533u;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.google.android.gms.common.C4969a;
import com.iterable.iterableapi.C5370s0;
import io.sentry.C20535s;
import io.sentry.android.core.C20123l;
import io.sentry.android.replay.capture.C20185a;
import io.sentry.util.C20579a;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import mx.AbstractC25990c;
import mx.C25989b;
import p073cq.C11046o;
import p073cq.InterfaceC11034c;
import p095dp.AbstractC12240d;
import p098dt.AbstractC12350b;
import p184h5.AbstractC16901p0;
import p184h5.C16913t0;
import p284ko.InterfaceC22609b0;
import p296l5.C23337a;
import p296l5.ViewOnTouchListenerC23340d;
import p312lx.C24782c;
import p314m.C24845i0;
import p314m.C24859r;
import p314m.LayoutInflaterFactory2C24829a0;
import p398p9.InterfaceC28986j;
import p444r.MenuC30818l;
import p450r5.RunnableC30928b;
import p474s.C31974k1;
import p529uo.AbstractC35107c;
import q30.C29934u0;
import so.ServiceConnectionC32796m;
import td3.AbstractC33721a;
import td3.C33733m;
import to.BinderC33978i0;
import to.C34003v;

/* JADX INFO: renamed from: bq.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC3543b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14262w;

    /* JADX INFO: renamed from: x */
    public final Object f14263x;

    public /* synthetic */ RunnableC3543b(Object obj, int i13) {
        this.f14262w = i13;
        this.f14263x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i13 = 0;
        switch (this.f14262w) {
            case 0:
                C3542a c3542a = (C3542a) this.f14263x;
                synchronized (c3542a.f14249a) {
                    try {
                        if (c3542a.m10576b()) {
                            Log.e("WakeLock", String.valueOf(c3542a.f14258j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            c3542a.m10578d();
                            if (c3542a.m10576b()) {
                                c3542a.f14251c = 1;
                                c3542a.m10579e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 1:
                ComponentCallbacks2C4966h componentCallbacks2C4966h = (ComponentCallbacks2C4966h) this.f14263x;
                componentCallbacks2C4966h.f20336y.mo7696h(componentCallbacks2C4966h);
                return;
            case 2:
                AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Orientation changed, triggering resize");
                ((C5370s0) this.f14263x).f21824b.m16535G();
                return;
            case 3:
                C11046o c11046o = (C11046o) this.f14263x;
                synchronized (c11046o.f34659y) {
                    try {
                        InterfaceC11034c interfaceC11034c = (InterfaceC11034c) c11046o.f34660z;
                        if (interfaceC11034c != null) {
                            interfaceC11034c.mo2320d();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case 4:
                ViewPager viewPager = (ViewPager) this.f14263x;
                viewPager.setScrollState(0);
                viewPager.m5498w();
                return;
            case 5:
                try {
                    ((Runnable) this.f14263x).run();
                    return;
                } catch (Exception e5) {
                    AbstractC12240d.m34035A("Executor", "Background execution failure.", e5);
                    return;
                }
            case 6:
                ((C20123l) this.f14263x).mo854d(5000L);
                return;
            case 7:
                ((C20185a) this.f14263x).invoke();
                return;
            case 8:
                ((C20185a) this.f14263x).invoke();
                return;
            case 9:
                ((C20185a) this.f14263x).invoke();
                return;
            case 10:
                ((C20185a) this.f14263x).invoke();
                return;
            case 11:
                ((C20185a) this.f14263x).invoke();
                return;
            case 12:
                ((C20185a) this.f14263x).invoke();
                return;
            case 13:
                C0332w0 c0332w0 = (C0332w0) this.f14263x;
                do {
                    c0332w0.m861q();
                } while (((ConcurrentLinkedQueue) c0332w0.f1170z).size() >= 100);
                C20535s c20535sM56711a = ((C20579a) c0332w0.f1165F).m56711a();
                try {
                    if (!((ConcurrentLinkedQueue) c0332w0.f1170z).isEmpty()) {
                        c0332w0.m863u(false);
                        break;
                    }
                    c20535sM56711a.close();
                    return;
                } catch (Throwable th5) {
                    try {
                        c20535sM56711a.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            case 14:
                ((InterfaceC22609b0) this.f14263x).mo65552g();
                return;
            case 15:
                ViewOnTouchListenerC23340d viewOnTouchListenerC23340d = (ViewOnTouchListenerC23340d) this.f14263x;
                C31974k1 c31974k1 = viewOnTouchListenerC23340d.f92552y;
                C23337a c23337a = viewOnTouchListenerC23340d.f92550w;
                if (viewOnTouchListenerC23340d.f92547O) {
                    if (viewOnTouchListenerC23340d.f92545M) {
                        viewOnTouchListenerC23340d.f92545M = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c23337a.f92531e = jCurrentAnimationTimeMillis;
                        c23337a.f92533g = -1L;
                        c23337a.f92532f = jCurrentAnimationTimeMillis;
                        c23337a.f92534h = 0.5f;
                    }
                    if ((c23337a.f92533g > 0 && AnimationUtils.currentAnimationTimeMillis() > c23337a.f92533g + ((long) c23337a.f92535i)) || !viewOnTouchListenerC23340d.m67577e()) {
                        viewOnTouchListenerC23340d.f92547O = false;
                        return;
                    }
                    if (viewOnTouchListenerC23340d.f92546N) {
                        viewOnTouchListenerC23340d.f92546N = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c31974k1.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c23337a.f92532f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM67568a = c23337a.m67568a(jCurrentAnimationTimeMillis2);
                    long j7 = jCurrentAnimationTimeMillis2 - c23337a.f92532f;
                    c23337a.f92532f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC23340d.f92549Q.scrollListBy((int) (j7 * ((fM67568a * 4.0f) + ((-4.0f) * fM67568a * fM67568a)) * c23337a.f92530d));
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    c31974k1.postOnAnimation(this);
                    return;
                }
                return;
            case 16:
                ((C25989b) ((C24782c) this.f14263x).f96960b).notifyDataSetChanged();
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) this.f14263x;
                layoutInflaterFactory2C24829a0.f97221W.showAtLocation(layoutInflaterFactory2C24829a0.f97220V, 55, 0, 0);
                C16913t0 c16913t0 = layoutInflaterFactory2C24829a0.f97223Y;
                if (c16913t0 != null) {
                    c16913t0.m47608b();
                }
                if (!layoutInflaterFactory2C24829a0.f97224Z || (viewGroup = layoutInflaterFactory2C24829a0.f97225a0) == null || !viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C24829a0.f97220V.setAlpha(1.0f);
                    layoutInflaterFactory2C24829a0.f97220V.setVisibility(0);
                    return;
                }
                layoutInflaterFactory2C24829a0.f97220V.setAlpha(0.0f);
                C16913t0 c16913t0M47570a = AbstractC16901p0.m47570a(layoutInflaterFactory2C24829a0.f97220V);
                c16913t0M47570a.m47607a(1.0f);
                layoutInflaterFactory2C24829a0.f97223Y = c16913t0M47570a;
                c16913t0M47570a.m47610d(new C24859r(this, i13));
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C24845i0 c24845i0 = (C24845i0) this.f14263x;
                Window.Callback callback = c24845i0.f97327b;
                Menu menuM72852z = c24845i0.m72852z();
                MenuC30818l menuC30818l = menuM72852z instanceof MenuC30818l ? (MenuC30818l) menuM72852z : null;
                if (menuC30818l != null) {
                    menuC30818l.m94828z();
                }
                try {
                    menuM72852z.clear();
                    if (!callback.onCreatePanelMenu(0, menuM72852z) || !callback.onPreparePanel(0, null, menuM72852z)) {
                        menuM72852z.clear();
                    }
                    if (menuC30818l != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (menuC30818l != null) {
                        menuC30818l.m94827y();
                    }
                }
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((AbstractC25990c) this.f14263x).mo72637G();
                return;
            case 20:
                ((InterfaceC28986j) this.f14263x).mo68103g();
                return;
            case 21:
                C31974k1 c31974k2 = (C31974k1) this.f14263x;
                c31974k2.f132738L = null;
                c31974k2.drawableStateChanged();
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f14263x;
                if (searchView$SearchAutoComplete.f4349F) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f4349F = false;
                    return;
                }
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Toolbar) this.f14263x).m3306J();
                return;
            case 24:
                ((ServiceConnectionC32796m) this.f14263x).m102848a("Service disconnected");
                return;
            case 25:
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                synchronized (((AbstractC33721a) this.f14263x).f141038a) {
                    try {
                        Iterator it = ((AbstractC33721a) this.f14263x).f141049l.values().iterator();
                        while (it.hasNext()) {
                            C33733m c33733m = (C33733m) it.next();
                            if (c33733m.f141100z < jElapsedRealtimeNanos - ((AbstractC33721a) this.f14263x).f141044g.f141107K) {
                                it.remove();
                                ((AbstractC33721a) this.f14263x).f141046i.post(new RunnableC30928b(12, this, c33733m));
                            }
                        }
                        if (!((AbstractC33721a) this.f14263x).f141049l.isEmpty()) {
                            AbstractC33721a abstractC33721a = (AbstractC33721a) this.f14263x;
                            abstractC33721a.f141046i.postDelayed(this, abstractC33721a.f141044g.f141108L);
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                    break;
                }
                return;
            case 26:
                ((C34003v) this.f14263x).m107475a();
                return;
            case 27:
                C34003v c34003v = (C34003v) ((C29934u0) this.f14263x).f122249x;
                ((AbstractC35107c) c34003v.f142495g).m111059f(c34003v.f142495g.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            default:
                ((BinderC33978i0) this.f14263x).f142446m.m13937K(new C4969a(4));
                return;
        }
    }
}
