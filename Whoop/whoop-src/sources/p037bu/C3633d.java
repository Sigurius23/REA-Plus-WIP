package p037bu;

import aa3.C0627i1;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Trace;
import b23.C2342h;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.whoop.realtime.service.C9907b;
import com.whoop.service.network.model.UserState;
import gt.C16163b;
import gt.InterfaceC16166e;
import i92.AbstractC18263h;
import io.sentry.C20269c;
import io.sentry.C20318e2;
import io.sentry.C20339g2;
import io.sentry.C20513q6;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20262b4;
import io.sentry.InterfaceC20320e4;
import io.sentry.InterfaceC20432n1;
import io.sentry.InterfaceC20435n4;
import io.sentry.InterfaceC20632y1;
import io.sentry.InterfaceC20642z3;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C20073f;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC20091g;
import io.sentry.protocol.C20501v;
import p002a0.C0022g;
import p005a3.C0237p;
import p014aj.C0929d;
import p073cq.InterfaceC11033b;
import p692zt.C41106j;
import p73.InterfaceC28961b;
import p92.C29017f;
import yq1.C39711a;

/* JADX INFO: renamed from: bu.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3633d implements InterfaceC16166e, InterfaceC20632y1, InterfaceC20320e4, InterfaceC20262b4, InterfaceC20642z3, InterfaceC28961b, InterfaceC20435n4, InterfaceC11033b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14790x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f14791y;

    public /* synthetic */ C3633d(int i13, Object obj, Object obj2) {
        this.f14789w = i13;
        this.f14790x = obj;
        this.f14791y = obj2;
    }

    @Override // p073cq.InterfaceC11033b
    /* JADX INFO: renamed from: a */
    public Object mo11178a(Task task) {
        C41106j c41106j = (C41106j) this.f14791y;
        String str = (String) this.f14790x;
        synchronized (c41106j) {
            ((C0022g) c41106j.f177206b).remove(str);
        }
        return task;
    }

    @Override // p73.InterfaceC28961b
    public void accept(Object obj) throws Exception {
        C9907b.m24238C((C29017f) this.f14790x, (Context) this.f14791y, (AbstractC18263h) obj);
    }

    @Override // io.sentry.InterfaceC20435n4
    /* JADX INFO: renamed from: b */
    public void mo11179b(C20513q6 c20513q6) {
        C39711a.m127083e((Context) this.f14790x, (C39711a) this.f14791y, (SentryAndroidOptions) c20513q6);
    }

    @Override // io.sentry.InterfaceC20642z3
    /* JADX INFO: renamed from: c */
    public void mo11180c(C0237p c0237p) {
        InterfaceC20259b1 interfaceC20259b1 = (InterfaceC20259b1) this.f14790x;
        C20513q6 c20513q6 = (C20513q6) this.f14791y;
        C20269c c20269c = (C20269c) c0237p.f814z;
        if (c20269c.f76118f) {
            C0237p c0237pMo56185G = interfaceC20259b1.mo56185G();
            C20501v c20501vMo56208s = interfaceC20259b1.mo56208s();
            c20269c.m56227c("sentry-trace_id", ((C20501v) c0237pMo56185G.f812x).toString());
            c20269c.m56227c("sentry-public_key", c20513q6.retrieveParsedDsn().f77182b);
            c20269c.m56227c("sentry-release", c20513q6.getRelease());
            c20269c.m56227c("sentry-environment", c20513q6.getEnvironment());
            if (!C20501v.f76802x.equals(c20501vMo56208s)) {
                c20269c.m56227c("sentry-replay_id", c20501vMo56208s.toString());
            }
            c20269c.m56227c("sentry-org_id", c20513q6.getEffectiveOrgId());
            c20269c.m56227c("sentry-transaction", null);
            if (c20269c.f76118f) {
                c20269c.f76115c = null;
            }
            c20269c.m56227c("sentry-sampled", null);
            c20269c.f76118f = false;
        }
    }

    @Override // io.sentry.InterfaceC20632y1
    /* JADX INFO: renamed from: d */
    public Object mo11181d() {
        C20318e2 c20318e2 = (C20318e2) this.f14790x;
        C20339g2 c20339g2 = (C20339g2) this.f14791y;
        c20318e2.getClass();
        try {
            try {
                return Integer.valueOf(c20339g2.nextInt());
            } catch (Exception unused) {
                return Long.valueOf(c20339g2.nextLong());
            }
        } catch (Exception unused2) {
            return Double.valueOf(c20339g2.nextDouble());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // gt.InterfaceC16166e
    /* JADX INFO: renamed from: f */
    public Object mo7223f(C0627i1 c0627i1) {
        String strValueOf;
        switch (this.f14789w) {
            case 0:
                String str = (String) this.f14790x;
                C2342h c2342h = (C2342h) this.f14791y;
                Context context = (Context) c0627i1.mo1617a(Context.class);
                switch (c2342h.f9268w) {
                    case 6:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 7:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 8:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = UserState.Sources.AUTO;
                        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "";
                        } else {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = FirebaseCommonRegistrar.m16377a(installerPackageName);
                        }
                        break;
                }
                return new C3630a(str, strValueOf);
            default:
                String str2 = (String) this.f14790x;
                C16163b c16163b = (C16163b) this.f14791y;
                try {
                    Trace.beginSection(str2);
                    return c16163b.f61433f.mo7223f(c0627i1);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // io.sentry.InterfaceC20262b4
    /* JADX INFO: renamed from: g */
    public void mo8622g(InterfaceC20432n1 interfaceC20432n1) {
        GestureDetectorOnGestureListenerC20091g gestureDetectorOnGestureListenerC20091g = (GestureDetectorOnGestureListenerC20091g) this.f14790x;
        InterfaceC20259b1 interfaceC20259b1 = (InterfaceC20259b1) this.f14791y;
        if (interfaceC20432n1 == gestureDetectorOnGestureListenerC20091g.f75467E) {
            interfaceC20259b1.mo56183E();
        }
    }

    @Override // io.sentry.InterfaceC20320e4
    /* JADX INFO: renamed from: h */
    public void mo11182h(InterfaceC20259b1 interfaceC20259b1) {
        switch (this.f14789w) {
            case 3:
                interfaceC20259b1.mo56192N(new C20073f((ActivityLifecycleIntegration) this.f14790x, interfaceC20259b1, (InterfaceC20432n1) this.f14791y));
                break;
            default:
                ((C0929d) this.f14790x).f3422w = interfaceC20259b1.mo56191M(new C3633d(6, interfaceC20259b1, (C20513q6) this.f14791y));
                break;
        }
    }

    public /* synthetic */ C3633d(C41106j c41106j, String str) {
        this.f14789w = 9;
        this.f14791y = c41106j;
        this.f14790x = str;
    }
}
