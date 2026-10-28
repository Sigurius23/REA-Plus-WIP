package p009a8;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1314k2;
import androidx.fragment.app.C1334p2;
import androidx.fragment.app.C1335q;
import androidx.fragment.app.C1339r;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.p019ui.PlayerView;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import com.google.crypto.tink.internal.C5101l0;
import com.iterable.iterableapi.AsyncTaskC5389y1;
import com.iterable.iterableapi.C5315d1;
import com.iterable.iterableapi.C5326g0;
import com.iterable.iterableapi.C5339j1;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.C5359o1;
import com.iterable.iterableapi.C5369s;
import com.iterable.iterableapi.C5386x1;
import com.iterable.iterableapi.InterfaceC5348l2;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BatteryMonitorObserver;
import com.mapbox.common.LifecycleMonitorAndroid;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementModeObserver;
import com.mapbox.common.battery.AndroidBatteryMonitor;
import com.mapbox.common.movement.AndroidMovementMonitor;
import com.mapbox.maps.renderer.RendererError;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.whoop.data.remote.commons.ApiSuccessResponse;
import cq0.AbstractC11057e;
import hm.C17417d;
import hn.C17498f;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.MessageListScrollHelper;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsView;
import io.sentry.C20350h4;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20347h1;
import io.sentry.android.core.AlertDialogC20134o1;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.RunnableC20151r0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Callable;
import p000.AbstractC30802r;
import p005a3.C0237p;
import p012ab.C0704y;
import p014aj.C0928c;
import p031b9.C2822c1;
import p031b9.C2827e0;
import p031b9.C2830f0;
import p031b9.C2832g;
import p031b9.C2837h1;
import p031b9.SurfaceHolderCallbackC2821c0;
import p046c8.BinderC4296a;
import p046c8.C4298c;
import p047c9.C4313d;
import p047c9.C4317h;
import p047c9.C4321l;
import p079d2.AbstractC11480b;
import p079d2.ViewOnAttachStateChangeListenerC11482d;
import p085d9.C11780a0;
import p085d9.C11793j;
import p085d9.RunnableC11791h;
import p097ds.C12320w;
import p098dt.AbstractC12350b;
import p128ew.RunnableC13719f;
import p299l9.C23488c0;
import p328mj.C25609p;
import p516u8.AbstractC34609o0;
import p516u8.C34605m0;
import p607x8.AbstractC38065t;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import ro.C31624i;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: a8.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0533c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1845w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1846x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f1847y;

    public /* synthetic */ RunnableC0533c(int i13, Object obj, Object obj2) {
        this.f1845w = i13;
        this.f1846x = obj;
        this.f1847y = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final void m1301a() {
        C17498f c17498f = (C17498f) this.f1846x;
        MediaCodec mediaCodec = (MediaCodec) this.f1847y;
        synchronized (c17498f.f67633a) {
            try {
                if (c17498f.f67644l) {
                    return;
                }
                long j7 = c17498f.f67643k - 1;
                c17498f.f67643k = j7;
                if (j7 > 0) {
                    return;
                }
                if (j7 < 0) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    synchronized (c17498f.f67633a) {
                        c17498f.f67645m = illegalStateException;
                    }
                    return;
                }
                c17498f.m49689b();
                if (mediaCodec != null) {
                    try {
                        try {
                            mediaCodec.start();
                        } catch (Exception e5) {
                            IllegalStateException illegalStateException2 = new IllegalStateException(e5);
                            synchronized (c17498f.f67633a) {
                                c17498f.f67645m = illegalStateException2;
                            }
                        }
                    } catch (IllegalStateException e13) {
                        synchronized (c17498f.f67633a) {
                            c17498f.f67645m = e13;
                        }
                    }
                }
                return;
                throw th;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j7;
        boolean z4;
        Timer timer;
        boolean z13 = true;
        int i13 = 0;
        switch (this.f1845w) {
            case 0:
                C0534d c0534d = (C0534d) this.f1846x;
                C12320w c12320w = (C12320w) this.f1847y;
                synchronized (c0534d.f1848a) {
                    c0534d.f1848a.remove(c12320w);
                    break;
                }
                return;
            case 1:
                AbstractC1314k2.m4112j((View) this.f1846x, (Rect) this.f1847y);
                return;
            case 2:
                C1335q c1335q = (C1335q) this.f1846x;
                ViewGroup container = (ViewGroup) this.f1847y;
                AbstractC22676k.m65750j(container, "$container");
                Iterator it = c1335q.f5761c.iterator();
                while (it.hasNext()) {
                    C1334p2 c1334p2 = ((C1339r) it.next()).f5663a;
                    View view = c1334p2.f5751c.getView();
                    if (view != null) {
                        AbstractC30802r.m94752a(c1334p2.f5749a, view, container);
                    }
                }
                return;
            case 3:
                C2830f0 c2830f0 = (C2830f0) this.f1846x;
                C0704y c0704y = (C0704y) this.f1847y;
                int i14 = c2830f0.f11140j0 - c0704y.f2663b;
                c2830f0.f11140j0 = i14;
                if (c0704y.f2665d) {
                    c2830f0.f11141k0 = c0704y.f2667f;
                    c2830f0.f11142l0 = true;
                }
                if (i14 == 0) {
                    AbstractC34609o0 abstractC34609o0 = ((C2822c1) c0704y.f2666e).f11045a;
                    if (!c2830f0.f11111I0.f11045a.m109408p() && abstractC34609o0.m109408p()) {
                        c2830f0.f11113J0 = -1;
                        c2830f0.f11115K0 = 0L;
                    }
                    if (!abstractC34609o0.m109408p()) {
                        List listAsList = Arrays.asList(((C2837h1) abstractC34609o0).f11196h);
                        AbstractC35849g.m113807i(listAsList.size() == c2830f0.f11121Q.size());
                        for (int i15 = 0; i15 < listAsList.size(); i15++) {
                            ((C2827e0) c2830f0.f11121Q.get(i15)).f11080b = (AbstractC34609o0) listAsList.get(i15);
                        }
                    }
                    long j13 = -9223372036854775807L;
                    if (c2830f0.f11142l0) {
                        if (((C2822c1) c0704y.f2666e).f11046b.equals(c2830f0.f11111I0.f11046b) && ((C2822c1) c0704y.f2666e).f11048d == c2830f0.f11111I0.f11063s) {
                            z13 = false;
                        }
                        if (z13) {
                            if (abstractC34609o0.m109408p() || ((C2822c1) c0704y.f2666e).f11046b.m68054b()) {
                                j13 = ((C2822c1) c0704y.f2666e).f11048d;
                            } else {
                                C2822c1 c2822c1 = (C2822c1) c0704y.f2666e;
                                C23488c0 c23488c0 = c2822c1.f11046b;
                                long j14 = c2822c1.f11048d;
                                Object obj = c23488c0.f92976a;
                                C34605m0 c34605m0 = c2830f0.f11120P;
                                abstractC34609o0.mo8135g(obj, c34605m0);
                                j13 = j14 + c34605m0.f145695e;
                            }
                        }
                        j7 = j13;
                        z4 = z13;
                    } else {
                        j7 = -9223372036854775807L;
                        z4 = false;
                    }
                    c2830f0.f11142l0 = false;
                    c2830f0.m8089J0((C2822c1) c0704y.f2666e, 1, z4, c2830f0.f11141k0, j7, -1, false);
                    return;
                }
                return;
            case 4:
                BinderC4296a binderC4296a = (BinderC4296a) this.f1846x;
                C4298c c4298c = (C4298c) this.f1847y;
                binderC4296a.getClass();
                try {
                    String string = binderC4296a.f17415f.getSharedPreferences("PermissionTokenManager.healthdata", 0).getString("token", null);
                    if (string == null) {
                        string = "";
                    }
                    c4298c.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
                        parcelObtain.writeString(string);
                        c4298c.f17418f.transact(1, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e5) {
                    Log.e("a", "HealthDataSdkService#getPermissionToken failed: " + e5.getMessage());
                    return;
                }
            case 5:
                ((C4321l) this.f1846x).f17548d.reportTrackChangeEvent((TrackChangeEvent) this.f1847y);
                return;
            case 6:
                ((C4321l) this.f1846x).f17548d.reportNetworkEvent((NetworkEvent) this.f1847y);
                return;
            case 7:
                ((C4321l) this.f1846x).f17548d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f1847y);
                return;
            case 8:
                ((C4321l) this.f1846x).f17548d.reportPlaybackMetrics((PlaybackMetrics) this.f1847y);
                return;
            case 9:
                ((C4321l) this.f1846x).f17548d.reportPlaybackStateEvent((PlaybackStateEvent) this.f1847y);
                return;
            case 10:
                C5341k c5341k = (C5341k) this.f1846x;
                String str = (String) this.f1847y;
                C5326g0 c5326g0 = c5341k.f21744b.f21882h;
                String str2 = c5341k.f21746d;
                if (str2 != null && str2.equals(str)) {
                    c5341k.f21744b.getClass();
                    return;
                }
                if (c5341k.f21746d == null && c5341k.f21747e == null && str == null) {
                    return;
                }
                c5341k.f21744b.getClass();
                if (c5341k.m16489i() && c5341k.m16482a()) {
                    String str3 = c5341k.f21746d;
                    String str4 = c5341k.f21747e;
                    String str5 = c5341k.f21749g;
                    String packageName = c5341k.f21744b.f21875a;
                    if (packageName == null) {
                        packageName = c5341k.f21743a.getPackageName();
                    }
                    new AsyncTaskC5389y1().execute(new C5386x1(str3, str4, str5, packageName, 2));
                }
                C5315d1 c5315d1 = c5341k.f21754l;
                if (c5315d1 != null) {
                    AbstractC12350b.m34557F();
                    C0237p c0237p = c5315d1.f21667y;
                    Iterator it3 = c0237p.m719z().iterator();
                    while (it3.hasNext()) {
                        c0237p.m680K((C5339j1) it3.next());
                    }
                    c5315d1.m16422e();
                }
                if (c5341k.f21755m != null) {
                    new LinkedHashMap();
                }
                C5369s c5369s = c5341k.f21756n;
                if (c5369s != null && (timer = c5369s.f21821y) != null) {
                    timer.cancel();
                    c5369s.f21821y = null;
                    c5369s.f21817E = false;
                }
                C5101l0 c5101l0 = c5341k.f21752j;
                InterfaceC5348l2 interfaceC5348l2M16040T = c5101l0.m16040T();
                C0928c c0928c = (C0928c) c5101l0.f21443x;
                interfaceC5348l2M16040T.mo16477a();
                AbstractC12350b.m34593n("IterableApi", "Resetting authToken");
                ((C5341k) c0928c.f3421x).f21749g = null;
                c5341k.f21746d = str;
                c5341k.f21747e = null;
                c5341k.f21744b.getClass();
                c5341k.f21744b.getClass();
                if (str == null) {
                    c5341k.f21753k.getClass();
                    c5341k.f21748f = null;
                    Context context = c5341k.f21743a;
                    if (context != null) {
                        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.iterable.iterableapi", 0).edit();
                        editorEdit.remove("itbl_consent_logged");
                        editorEdit.apply();
                    }
                }
                if (c5341k.f21743a != null) {
                    C5359o1 c5359o1M16487g = c5341k.m16487g();
                    if (c5359o1M16487g != null) {
                        c5359o1M16487g.m16505c("iterable-email", c5341k.f21746d);
                        c5359o1M16487g.m16505c("iterable-user-id", c5341k.f21747e);
                        c5359o1M16487g.m16505c("iterable-unknown-user-id", c5341k.f21748f);
                        c5359o1M16487g.m16505c("iterable-auth-token", c5341k.f21749g);
                    } else {
                        AbstractC12350b.m34595p("IterableApi", "Shared preference creation failed. ");
                    }
                }
                if (!c5341k.m16489i()) {
                    c5341k.m16491l(false);
                    return;
                }
                c5341k.m16484c().getClass();
                C5369s c5369sM16484c = c5341k.m16484c();
                synchronized (c5369sM16484c) {
                    synchronized (c5369sM16484c) {
                        C5341k.f21742r.m16491l(true);
                    }
                    return;
                }
                return;
            case 11:
                LifecycleMonitorAndroid.notifyObservers$lambda$8$lambda$6$lambda$5((Map.Entry) this.f1846x, (LifecycleState) this.f1847y);
                return;
            case 12:
                AndroidBatteryMonitor.notifyObservers$lambda$2$lambda$1((BatteryMonitorObserver) this.f1846x, (Expected) this.f1847y);
                return;
            case 13:
                AndroidMovementMonitor.notifyObservers$lambda$2$lambda$1((MovementModeObserver) this.f1846x, (MovementInfo) this.f1847y);
                return;
            case 14:
                EGLCore.notifyListeners$lambda$5((HashSet) this.f1846x, (RendererError) this.f1847y);
                return;
            case 15:
                EGLCore.addRendererStateListener$lambda$3((LinkedList) this.f1846x, (RendererSetupErrorListener) this.f1847y);
                return;
            case 16:
                AbstractC11057e.m29736q((AbstractC11057e) this.f1846x, (ApiSuccessResponse) this.f1847y);
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC11480b.m30879e((ViewOnAttachStateChangeListenerC11482d) this.f1846x, (LongSparseArray) this.f1847y);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C20378c c20378c = (C20378c) this.f1846x;
                synchronized (((C2832g) this.f1847y)) {
                }
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i16 = AbstractC38065t.f163031a;
                C4317h c4317h = surfaceHolderCallbackC2821c0.f11043w.f11124T;
                c4317h.m13602l(c4317h.m13598h((C23488c0) c4317h.f17523z.f1165F), MessageListItemViewType.MEDIA_ATTACHMENT, new C4313d(15));
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C31624i c31624i = (C31624i) this.f1846x;
                C11793j c11793j = (C11793j) this.f1847y;
                C20378c c20378c2 = ((C11780a0) c31624i.f130665x).f38178d1;
                Handler handler = (Handler) c20378c2.f76422x;
                if (handler != null) {
                    handler.post(new RunnableC11791h(c20378c2, c11793j, 2));
                    return;
                }
                return;
            case 20:
                PlayerView.m5072a((PlayerView) this.f1846x, (Bitmap) this.f1847y);
                return;
            case 21:
                RunnableC13719f this$0 = (RunnableC13719f) this.f1846x;
                C22665e0 chunksSent = (C22665e0) this.f1847y;
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65750j(chunksSent, "$chunksSent");
                this$0.f48696E.mo34836b(chunksSent.f89334w);
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m1301a();
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                Callable callable = (Callable) this.f1846x;
                C17417d c17417d = (C17417d) this.f1847y;
                try {
                    c17417d.m49435r(callable.call());
                    return;
                } catch (Exception e13) {
                    c17417d.m49436s(e13);
                    return;
                }
            case 24:
                C25609p c25609p = (C25609p) ((C4861a) this.f1846x).f20265f.remove(Integer.valueOf(((Nudge) this.f1847y).getVariantId()));
                if (c25609p != null) {
                    c25609p.m75331a();
                    return;
                }
                return;
            case 25:
                MessageListScrollHelper.scrollToMessage$lambda$12((MessageListScrollHelper) this.f1846x, (Message) this.f1847y);
                return;
            case 26:
                ViewReactionsView.setMessage$lambda$1((ViewReactionsView) this.f1846x, (InterfaceC4339a) this.f1847y);
                return;
            case 27:
                ((InterfaceC20347h1) this.f1847y).mo56216a(((C20350h4) this.f1846x).mo56432l().getShutdownTimeoutMillis());
                return;
            case 28:
                AnrIntegration anrIntegration = (AnrIntegration) this.f1846x;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f1847y;
                C20535s c20535sM56711a = anrIntegration.f75231y.m56711a();
                try {
                    if (!anrIntegration.f75230x) {
                        anrIntegration.m55896b(sentryAndroidOptions);
                        break;
                    }
                    c20535sM56711a.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        c20535sM56711a.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            default:
                FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.f1846x;
                Activity activity = (Activity) this.f1847y;
                if (feedbackShakeIntegration.f75249E || activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                try {
                    feedbackShakeIntegration.f75249E = true;
                    Runnable runnable = feedbackShakeIntegration.f75253y.getFeedbackOptions().f76410h;
                    feedbackShakeIntegration.f75250F = runnable;
                    feedbackShakeIntegration.f75253y.getFeedbackOptions().f76410h = new RunnableC20151r0(i13, feedbackShakeIntegration, runnable);
                    new AlertDialogC20134o1(activity).show();
                    return;
                } catch (Throwable th5) {
                    feedbackShakeIntegration.f75249E = false;
                    feedbackShakeIntegration.f75253y.getFeedbackOptions().f76410h = feedbackShakeIntegration.f75250F;
                    feedbackShakeIntegration.f75250F = null;
                    feedbackShakeIntegration.f75253y.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to show feedback dialog on shake.", th5);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0533c(AbstractC1314k2 abstractC1314k2, View view, Rect rect) {
        this.f1845w = 1;
        this.f1846x = view;
        this.f1847y = rect;
    }
}
