package io.sentry.android.core;

import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.whoop.data.local.room.entity.GpsDto;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import ge3.AbstractC15751g;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.anr.C20056d;
import io.sentry.android.replay.capture.C20190f;
import io.sentry.android.replay.util.RunnableC20237e;
import io.sentry.android.replay.util.ScheduledExecutorServiceC20236d;
import io.sentry.cache.C20283f;
import io.sentry.hints.C20363j;
import io.sentry.protocol.C20501v;
import io.seon.androidsdk.service.C20672i1;
import io.seon.androidsdk.service.C20677k0;
import io.seon.androidsdk.service.C20687p0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import jk0.InterfaceC21750d;
import kx0.C22874a;
import live.hms.video.audio.HMSAudioManagerLegacy;
import live.hms.video.audio.manager.HMSAudioManagerApi31;
import live.hms.video.factories.SafeVariable;
import live.hms.video.media.capturers.camera.CameraControl;
import live.hms.video.sdk.IErrorListener;
import live.hms.videoview.HMSVideoView;
import mo.C25737r;
import no.C26880m;
import p031b9.C2832g;
import p043c4.C3974q;
import p078d1.C11457j;
import p249jc.C21577g;
import p249jc.InterfaceC21571d;
import p284ko.C22632p;
import p299l9.C23526s0;
import p309lo.AbstractC24567y;
import p309lo.C24560r;
import p320m5.C25071o;
import p320m5.InterfaceC25063g;
import p328mj.C25600g;
import p420qc.C30200j;
import p450r5.C30931e;
import p465rm.C31559p;
import p465rm.C31571u;
import p465rm.SurfaceHolderCallbackC31565r;
import p499t9.InterfaceC33627e0;
import p602x1.C37816b;
import p607x8.InterfaceC38049d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p92.C29014c;
import sm.C32709b;
import sm.C32711d;
import sn.C32763v;

/* JADX INFO: renamed from: io.sentry.android.core.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC20151r0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75696w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f75697x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f75698y;

    public /* synthetic */ RunnableC20151r0(int i13, Object obj, Object obj2) {
        this.f75696w = i13;
        this.f75697x = obj;
        this.f75698y = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13;
        switch (this.f75696w) {
            case 0:
                FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.f75697x;
                Runnable runnable = (Runnable) this.f75698y;
                feedbackShakeIntegration.f75249E = false;
                feedbackShakeIntegration.f75253y.getFeedbackOptions().f76410h = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                feedbackShakeIntegration.f75250F = null;
                return;
            case 1:
                AlertDialogC20134o1 alertDialogC20134o1 = (AlertDialogC20134o1) this.f75697x;
                Activity activity = (Activity) this.f75698y;
                alertDialogC20134o1.getClass();
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                alertDialogC20134o1.show();
                return;
            case 2:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.f75697x;
                C20056d c20056d = (C20056d) this.f75698y;
                anrProfilingIntegration.getClass();
                if (c20056d == null) {
                    return;
                }
                try {
                    c20056d.close();
                    return;
                } catch (IOException unused) {
                    anrProfilingIntegration.f75327I.mo16066m(EnumC20436n5.WARNING, "Failed to close AnrProfileManager", new Object[0]);
                    return;
                }
            case 3:
                File file = (File) this.f75697x;
                C20190f c20190f = (C20190f) this.f75698y;
                AbstractC15751g.m44465r(file);
                c20190f.m56110k(-1);
                return;
            case 4:
                RunnableC20277c7 runnableC20277c7 = (RunnableC20277c7) this.f75697x;
                C20513q6 c20513q6 = (C20513q6) this.f75698y;
                try {
                    runnableC20277c7.run();
                    return;
                } catch (Throwable th3) {
                    c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th3);
                    return;
                }
            case 5:
                Runnable runnable2 = (Runnable) this.f75698y;
                ScheduledExecutorServiceC20236d scheduledExecutorServiceC20236d = (ScheduledExecutorServiceC20236d) this.f75697x;
                try {
                    runnable2.run();
                    return;
                } catch (Throwable th4) {
                    InterfaceC20602v0 logger = scheduledExecutorServiceC20236d.f76023x.getLogger();
                    EnumC20436n5 enumC20436n5 = EnumC20436n5.ERROR;
                    StringBuilder sb4 = new StringBuilder("Failed to execute task ");
                    sb4.append(runnable2 instanceof RunnableC20237e ? ((RunnableC20237e) runnable2).f76024w : "");
                    logger.mo16060j(enumC20436n5, sb4.toString(), th4);
                    return;
                }
            case 6:
                ((C20283f) this.f75697x).m56268g((C20501v) this.f75698y, "replay.json");
                return;
            case 7:
                C20687p0 c20687p0 = (C20687p0) this.f75697x;
                List<String> list = (List) this.f75698y;
                c20687p0.getClass();
                for (String str : list) {
                    c20687p0.f77426h.requestLocationUpdates(str, c20687p0.m56866h(str), 0.0f, c20687p0);
                    c20687p0.f77433o = true;
                }
                return;
            case 8:
                C20672i1 c20672i1 = (C20672i1) this.f75697x;
                ExecutorService executorService = (ExecutorService) this.f75698y;
                C20677k0 c20677k0 = new C20677k0(c20672i1.f77337a);
                C20363j c20363j = c20672i1.f77338b.f77361h.f77424f;
                if (c20363j != null) {
                    c20677k0.f77361h.m56867i(c20363j);
                }
                c20672i1.f77344h.lock();
                try {
                    c20672i1.f77338b = c20677k0;
                    c20672i1.f77346j = false;
                    c20672i1.f77345i.signalAll();
                    c20672i1.f77344h.unlock();
                    executorService.shutdown();
                    return;
                } catch (Throwable th5) {
                    c20672i1.f77344h.unlock();
                    throw th5;
                }
            case 9:
                C21577g c21577g = (C21577g) this.f75697x;
                C30200j c30200j = (C30200j) this.f75698y;
                synchronized (c21577g.f82749k) {
                    try {
                        Iterator it = c21577g.f82748j.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC21571d) it.next()).mo5525b(c30200j, false);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                    break;
                }
                return;
            case 10:
                C22874a.m66463k((C22874a) this.f75697x, (Runnable) this.f75698y);
                return;
            case 11:
                ((InterfaceC38049d) this.f75697x).accept(this.f75698y);
                return;
            case 12:
                ((C23526s0) this.f75697x).m68098D((InterfaceC33627e0) this.f75698y);
                return;
            case 13:
                ((HMSAudioManagerLegacy) this.f75697x).lambda$initTelephony$0((IErrorListener) this.f75698y);
                return;
            case 14:
                HMSAudioManagerApi31.initTelephony$lambda$2$lambda$1((HMSAudioManagerApi31) this.f75697x, (IErrorListener) this.f75698y);
                return;
            case 15:
                SafeVariable.initialize$lambda$4((InterfaceC4339a) this.f75697x, (SafeVariable) this.f75698y);
                return;
            case 16:
                CameraControl.resetZoom$lambda$6((CameraControl) this.f75697x, (String) this.f75698y);
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                HMSVideoView.C244102.onFrame$lambda$0((HMSVideoView) this.f75697x, (HMSVideoView.C244102) this.f75698y);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C24560r c24560r = (C24560r) this.f75697x;
                C22632p c22632p = (C22632p) this.f75698y;
                synchronized (c24560r.f95853w) {
                    i13 = c24560r.f95854x;
                    break;
                }
                c22632p.m65568a(i13);
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C25600g c25600g = (C25600g) this.f75697x;
                Activity activity2 = (Activity) this.f75698y;
                ComposeView composeView = c25600g.f100436b;
                if ((composeView != null ? composeView.getParent() : null) != null) {
                    return;
                }
                if (c25600g.f100436b == null) {
                    ComposeView composeView2 = new ComposeView(activity2, null, 6);
                    composeView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    composeView2.setElevation(100.0f);
                    composeView2.setContent(new C37816b(new C3974q(4, c25600g, composeView2), true, -1306375451));
                    composeView2.post(new RunnableC20151r0(20, activity2, composeView2));
                    c25600g.f100436b = composeView2;
                }
                View decorView = activity2.getWindow().getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    viewGroup.addView(c25600g.f100436b);
                    return;
                }
                return;
            case 20:
                Activity activity3 = (Activity) this.f75697x;
                ComposeView view = (ComposeView) this.f75698y;
                AbstractC22676k.m65750j(activity3, "$activity");
                AbstractC22676k.m65750j(view, "$view");
                View decorView2 = activity3.getWindow().getDecorView();
                AbstractC22676k.m65749i(decorView2, "activity.window.decorView");
                view.setX((decorView2.getWidth() - view.getWidth()) / 2.0f);
                view.setY((decorView2.getHeight() - view.getHeight()) - 150.0f);
                return;
            case 21:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f75697x;
                JobParameters jobParameters = (JobParameters) this.f75698y;
                int i14 = JobInfoSchedulerService.f20364w;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C11457j c11457j = (C11457j) this.f75697x;
                C25737r c25737r = (C25737r) this.f75698y;
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = (SurfaceHolderCallbackC31565r) c11457j.f36754y;
                int i15 = AbstractC24567y.f95875a;
                C31571u c31571u = surfaceHolderCallbackC31565r.f130359w;
                c31571u.f130388I0 = c25737r;
                c31571u.f130395M.m31625i(25, new C31559p(c25737r, 3));
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C11457j c11457j2 = (C11457j) this.f75697x;
                synchronized (((C2832g) this.f75698y)) {
                }
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r2 = (SurfaceHolderCallbackC31565r) c11457j2.f36754y;
                int i16 = AbstractC24567y.f95875a;
                C32711d c32711d = surfaceHolderCallbackC31565r2.f130359w.f130402S;
                c32711d.m102668z(c32711d.m102665v((C32763v) c32711d.f135994z.f1165F), 1020, new C32709b(19));
                return;
            case 24:
                C26880m c26880m = (C26880m) this.f75697x;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f75698y;
                SurfaceTexture surfaceTexture2 = c26880m.f107283G;
                Surface surface = c26880m.f107284H;
                Surface surface2 = new Surface(surfaceTexture);
                c26880m.f107283G = surfaceTexture;
                c26880m.f107284H = surface2;
                Iterator it3 = c26880m.f107288w.iterator();
                while (it3.hasNext()) {
                    ((SurfaceHolderCallbackC31565r) it3.next()).f130359w.m97228w0(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 25:
                ((InterfaceC25063g) this.f75697x).mo38428a(new ClearCredentialUnknownException(((Exception) this.f75698y).getMessage()));
                return;
            case 26:
                C29014c.m88162h((C29014c) this.f75697x, (GpsDto) this.f75698y);
                return;
            case 27:
                InterfaceC25063g callback = (InterfaceC25063g) this.f75697x;
                Object exception = this.f75698y;
                AbstractC22676k.m65750j(callback, "$callback");
                AbstractC22676k.m65750j(exception, "$exception");
                callback.mo38428a(exception);
                return;
            case 28:
                BleConnectStrapActivity.m27090d1((BleConnectStrapActivity) this.f75697x, (InterfaceC21750d) this.f75698y);
                return;
            default:
                C30931e this$0 = (C30931e) this.f75697x;
                C25071o response = (C25071o) this.f75698y;
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65750j(response, "$response");
                this$0.m95139e().onResult(response);
                return;
        }
    }

    public /* synthetic */ RunnableC20151r0(Runnable runnable, ScheduledExecutorServiceC20236d scheduledExecutorServiceC20236d) {
        this.f75696w = 5;
        this.f75698y = runnable;
        this.f75697x = scheduledExecutorServiceC20236d;
    }
}
