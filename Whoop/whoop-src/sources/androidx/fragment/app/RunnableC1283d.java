package androidx.fragment.app;

import a30.C0332w0;
import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.ActionMode;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.platform.client.proto.C1533u;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import com.mapbox.common.LifecycleMonitorAndroid;
import com.mapbox.common.LifecycleMonitoringState;
import com.mapbox.maps.C5538l;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.webview.HCaptchaWebView;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import gm.C15980h;
import gm.C15981i;
import hm.InterfaceC17419f;
import hms.webrtc.EglBase;
import hms.webrtc.EglRenderer;
import hms.webrtc.VideoFileRenderer;
import hms.webrtc.VideoFrame;
import io.sentry.C20444o3;
import io.sentry.C20457p3;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.android.core.C20067d;
import io.sentry.android.core.C20079h;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.screenshot.C20228h;
import io.sentry.android.replay.viewhierarchy.AbstractC20252g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import jk0.InterfaceC21750d;
import md3.InterfaceC25456b;
import nd3.C26591a;
import p031b9.C2830f0;
import p031b9.C2864s0;
import p032bc.C2953i;
import p043c4.C3967k;
import p046c8.BinderC4296a;
import p046c8.C4299d;
import p047c9.C4317h;
import p087db.C11852h0;
import p100dw.InterfaceC12401f;
import p122em.C13323c;
import p128ew.C13716c;
import p128ew.RunnableC13719f;
import p197hj.C17334q;
import p281kj.C22508c;
import p281kj.C22512g;
import p299l9.C23488c0;
import p299l9.C23537y;
import p307lm.C24504a;
import p344nm.C26827i;
import p465rm.C31552m1;
import p465rm.C31560p0;
import p465rm.C31571u;
import p465rm.InterfaceC31519b1;
import p516u8.C34605m0;
import p516u8.InterfaceC34599j0;
import p667z0.ActionModeCallbackC39928j;
import p667z0.C39922d;
import p667z0.C39923e;
import p667z0.C39924f;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import pg3.C29205p;
import pg3.C29207q;
import pg3.C29218v0;
import pg3.InterfaceC29189h;
import q30.C29938w0;
import sm.C32711d;
import sn.C32763v;
import sn.C32770z;
import sn.InterfaceC32722a0;
import u40.EnumC34528d;
import y40.C39209f;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC1283d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5580w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f5581x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f5582y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f5583z;

    public /* synthetic */ RunnableC1283d(Object obj, Object obj2, Object obj3, int i13) {
        this.f5580w = i13;
        this.f5581x = obj;
        this.f5582y = obj2;
        this.f5583z = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C17334q c17334q;
        int i13 = this.f5580w;
        Object obj = this.f5583z;
        Object obj2 = this.f5582y;
        Object obj3 = this.f5581x;
        switch (i13) {
            case 0:
                ViewGroup container = (ViewGroup) obj3;
                C1291f this$0 = (C1291f) obj;
                AbstractC22676k.m65750j(container, "$container");
                AbstractC22676k.m65750j(this$0, "this$0");
                container.endViewTransition((View) obj2);
                this$0.f5596c.f5663a.m4202c(this$0);
                return;
            case 1:
                C1335q this$1 = (C1335q) obj;
                AbstractC22676k.m65750j(this$1, "this$0");
                AbstractC1286d2.m4076a(((C1334p2) obj3).f5751c, ((C1334p2) obj2).f5751c, this$1.f5773o, this$1.f5772n, false);
                return;
            case 2:
                C23488c0 c23488c0 = (C23488c0) obj;
                C4317h c4317h = ((C2864s0) obj3).f11386c;
                C41060w0 c41060w0M133239f = ((C41014d0) obj2).m133239f();
                C0332w0 c0332w0 = c4317h.f17523z;
                InterfaceC34599j0 interfaceC34599j0 = c4317h.f17517G;
                interfaceC34599j0.getClass();
                c0332w0.getClass();
                c0332w0.f1169y = AbstractC41023g0.m133252m(c41060w0M133239f);
                if (!c41060w0M133239f.isEmpty()) {
                    c0332w0.f1165F = (C23488c0) c41060w0M133239f.get(0);
                    c23488c0.getClass();
                    c0332w0.f1166G = c23488c0;
                }
                if (((C23488c0) c0332w0.f1164E) == null) {
                    c0332w0.f1164E = C0332w0.m834o(interfaceC34599j0, (AbstractC41023g0) c0332w0.f1169y, (C23488c0) c0332w0.f1165F, (C34605m0) c0332w0.f1168x);
                }
                c0332w0.m850N(((C2830f0) interfaceC34599j0).m8104c0());
                return;
            case 3:
                C4299d c4299d = (C4299d) obj;
                ((BinderC4296a) obj3).f17415f.getSharedPreferences("PermissionTokenManager.healthdata", 0).edit().putString("token", (String) obj2).commit();
                try {
                    c4299d.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                        c4299d.f17419f.transact(1, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e5) {
                    Log.e("a", "HealthDataSdkService#setPermissionToken failed: " + e5.getMessage());
                    return;
                }
            case 4:
                LifecycleMonitorAndroid.notifyObservers$lambda$4$lambda$2$lambda$1((Map.Entry) obj3, (LifecycleMonitoringState) obj2, (String) obj);
                return;
            case 5:
                C11852h0.m31810a((C11852h0) obj3, (SurfaceView) obj2, (RunnableC1319m) obj);
                return;
            case 6:
                RunnableC13719f this$2 = (RunnableC13719f) obj3;
                C22665e0 chunksSent = (C22665e0) obj2;
                C13716c c13716c = (C13716c) obj;
                AbstractC22676k.m65750j(this$2, "this$0");
                AbstractC22676k.m65750j(chunksSent, "$chunksSent");
                InterfaceC12401f interfaceC12401f = this$2.f48696E;
                Long lM128686f = this$2.f48697F.m128686f();
                long jLongValue = lM128686f != null ? lM128686f.longValue() : 10L;
                interfaceC12401f.mo34835a(jLongValue, chunksSent.f89334w, new Exception("Request failed " + c13716c));
                return;
            case 7:
                ((EglRenderer) obj3).lambda$removeFrameListener$4((CountDownLatch) obj2, (EglRenderer.FrameListener) obj);
                return;
            case 8:
                ((EglRenderer) obj3).lambda$init$0((EglBase.Context) obj2, (int[]) obj);
                return;
            case 9:
                ((VideoFileRenderer) obj3).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj2, (VideoFrame) obj);
                return;
            case 10:
                AtomicReference atomicReference = (AtomicReference) obj;
                try {
                    ((C3967k) obj3).invoke((QuickJSContext) obj2);
                    return;
                } catch (Exception e13) {
                    atomicReference.set(e13);
                    return;
                }
            case 11:
                C20067d c20067d = (C20067d) obj3;
                Runnable runnable = (Runnable) obj2;
                String str = (String) obj;
                c20067d.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        ((SentryAndroidOptions) c20067d.f75378c).getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 12:
                C20079h c20079h = (C20079h) obj3;
                C20513q6 c20513q6 = (C20513q6) obj2;
                InterfaceC20308d1 interfaceC20308d1 = (InterfaceC20308d1) obj;
                ArrayList<C20444o3> arrayList = c20079h.f75415M;
                if (c20079h.f75418P.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                C20535s c20535sM56711a = c20079h.f75425W.m56711a();
                try {
                    for (C20444o3 c20444o3 : arrayList) {
                        arrayList2.add(new C20457p3(c20444o3.f76526a, c20444o3.f76527b, c20444o3.f76529d, c20444o3.f76528c, Double.valueOf(c20444o3.f76530e), c20444o3.f76531f, c20513q6));
                    }
                    arrayList.clear();
                    c20535sM56711a.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        interfaceC20308d1.mo56434n((C20457p3) it.next());
                    }
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
            case 13:
                ((C20228h) obj3).m56147d((View) obj2, (AbstractC20252g) obj);
                return;
            case 14:
                C22508c c22508c = (C22508c) obj2;
                C22512g tapData = (C22512g) obj;
                AbstractC22676k.m65750j(tapData, "$tapData");
                View rootView = ((Activity) obj3).getWindow().getDecorView().getRootView();
                AbstractC22676k.m65749i(rootView, "rootView");
                View viewM65010a = C22508c.m65010a(rootView, (int) tapData.f88232b, (int) tapData.f88233c);
                if (viewM65010a != null) {
                    Object tag = viewM65010a.getTag();
                    if (!(tag instanceof String) || (c17334q = c22508c.f88215a) == null) {
                        return;
                    }
                    c17334q.invoke(tag);
                    return;
                }
                return;
            case 15:
                C24504a c24504a = (C24504a) obj3;
                C15981i c15981i = (C15981i) obj2;
                String str2 = c15981i.f60488a;
                C15980h c15980h = (C15980h) obj;
                c24504a.getClass();
                Logger logger = C24504a.f95597f;
                try {
                    InterfaceC17419f interfaceC17419fM49437a = c24504a.f95600c.m49437a(str2);
                    if (interfaceC17419fM49437a == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        new IllegalArgumentException(str3);
                    } else {
                        ((C26827i) c24504a.f95602e).m80062s(new C2953i(c24504a, c15981i, ((C13323c) interfaceC17419fM49437a).m37430a(c15980h), 9));
                    }
                    return;
                } catch (Exception e14) {
                    logger.warning("Error scheduling event " + e14.getMessage());
                    return;
                }
            case 16:
                try {
                    ((InterfaceC25456b) obj3).mo74863a((BluetoothDevice) obj2, (C26591a) obj);
                    return;
                } catch (Throwable th5) {
                    Log.e("k0", "Exception in Value callback", th5);
                    return;
                }
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC29189h interfaceC29189h = (InterfaceC29189h) obj2;
                C29218v0 c29218v0 = (C29218v0) obj;
                C29207q c29207q = (C29207q) ((C29205p) obj3).f118205y;
                if (c29207q.f118207x.mo88672F0()) {
                    interfaceC29189h.mo2329r(c29207q, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC29189h.mo2323g(c29207q, c29218v0);
                    return;
                }
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((InterfaceC29189h) obj2).mo2329r((C29207q) ((C29205p) obj3).f118205y, (Throwable) obj);
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                BleConnectStrapActivity.m27086b1((BleConnectStrapActivity) obj3, (InterfaceC21750d) obj2, (InterfaceC21750d) obj);
                return;
            case 20:
                C32763v c32763v = (C32763v) obj;
                C32711d c32711d = ((C31560p0) obj3).f130340c;
                C41060w0 c41060w0M133239f2 = ((C41014d0) obj2).m133239f();
                C0332w0 c0332w1 = c32711d.f135994z;
                InterfaceC31519b1 interfaceC31519b1 = c32711d.f135988G;
                interfaceC31519b1.getClass();
                c0332w1.getClass();
                c0332w1.f1169y = AbstractC41023g0.m133252m(c41060w0M133239f2);
                if (!c41060w0M133239f2.isEmpty()) {
                    c0332w1.f1165F = (C32763v) c41060w0M133239f2.get(0);
                    c32763v.getClass();
                    c0332w1.f1166G = c32763v;
                }
                if (((C32763v) c0332w1.f1164E) == null) {
                    c0332w1.f1164E = C0332w0.m835p(interfaceC31519b1, (AbstractC41023g0) c0332w1.f1169y, (C32763v) c0332w1.f1165F, (C31552m1) c0332w1.f1168x);
                }
                c0332w1.m848L(((C31571u) interfaceC31519b1).m97209b0());
                return;
            case 21:
                C32770z c32770z = (C32770z) obj3;
                ((InterfaceC32722a0) obj2).mo91116h(c32770z.f136275a, c32770z.f136276b, (C23537y) obj);
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) ((C29938w0) obj3).f122262z;
                hCaptchaWebView.removeJavascriptInterface("JSInterface");
                hCaptchaWebView.removeJavascriptInterface("JSDI");
                ((C39209f) obj2).f168502b.f145151y.invoke(new HCaptchaException(EnumC34528d.INSECURE_HTTP_REQUEST_ERROR, "Insecure resource " + ((Uri) obj) + " requested"));
                return;
            default:
                C39924f c39924f = (C39924f) obj3;
                C39923e c39923e = (C39923e) obj;
                ActionMode actionModeStartActionMode = c39924f.f172350a.startActionMode(new ActionModeCallbackC39928j((C39922d) obj2), 1);
                AbstractC22676k.m65745e(c39924f.f172357h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    c39923e.close();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC1283d(C24504a c24504a, C15981i c15981i, C5538l c5538l, C15980h c15980h) {
        this.f5580w = 15;
        this.f5581x = c24504a;
        this.f5582y = c15981i;
        this.f5583z = c15980h;
    }
}
