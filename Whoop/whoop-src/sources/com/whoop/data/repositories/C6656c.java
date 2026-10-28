package com.whoop.data.repositories;

import a11.C0129g;
import aa3.C0627i1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3003e1;
import bc3.EnumC2998d0;
import bh3.InterfaceC3260g;
import com.google.android.gms.tasks.Task;
import com.whoop.service.rearchitect.BleWhoopStrapService;
import com.whoop.service.rearchitect.C10013a;
import dk0.C12111k;
import ec3.InterfaceC13058l;
import gt.InterfaceC16166e;
import io.sentry.C20265b7;
import io.sentry.C20314d7;
import io.sentry.C20438n7;
import io.sentry.C20513q6;
import io.sentry.C20637y6;
import io.sentry.C20645z6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20320e4;
import io.sentry.InterfaceC20332f7;
import io.sentry.InterfaceC20406l;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.C20160u0;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC20091g;
import io.sentry.cache.AbstractC20278a;
import io.sentry.cache.C20280c;
import io.sentry.cache.C20283f;
import io.sentry.cache.tape.C20285b;
import io.sentry.cache.tape.C20287d;
import io.sentry.cache.tape.C20292i;
import io.sentry.okhttp.C20452d;
import io.sentry.util.InterfaceC20583e;
import io.sentry.util.network.InterfaceC20595c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jc3.C21607a;
import kg2.C22459e;
import kk0.C22538a;
import m92.C25327j;
import n73.InterfaceC26443b;
import nm1.C26842g;
import od1.C27858u;
import p007a6.C0458v;
import p014aj.C0929d;
import p037bu.C3633d;
import p073cq.InterfaceC11035d;
import p108e4.C12685s;
import p437qt.C30582e;
import p619xl.C38445a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p73.InterfaceC28961b;
import q73.C30022a;
import q73.EnumC30024c;
import q83.C30064k;
import q83.InterfaceC30057d;
import qc1.C30217a;
import qd1.C30294a;
import rd1.C31245d;
import rr2.C31776m;
import td1.C33706d;
import ud3.C34850x0;
import vb1.C35868a;
import vd1.C35908b;
import vd1.C35910d;
import w73.C36919e;
import xg3.InterfaceC38290q;

/* JADX INFO: renamed from: com.whoop.data.repositories.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6656c implements InterfaceC3260g, InterfaceC16166e, InterfaceC20332f7, InterfaceC20320e4, InterfaceC20583e, InterfaceC20595c, InterfaceC11035d, InterfaceC28961b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25445w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f25446x;

    public /* synthetic */ C6656c(int i13, Object obj, Object obj2) {
        this.f25445w = i13;
        this.f25446x = obj2;
    }

    @Override // io.sentry.util.network.InterfaceC20595c
    /* JADX INFO: renamed from: a */
    public C38445a mo19987a(Object obj) {
        return C20452d.m56649a((C20452d) this.f25446x, (C34850x0) obj);
    }

    @Override // p73.InterfaceC28961b
    public void accept(Object obj) {
        switch (this.f25445w) {
            case 21:
                BleWhoopStrapService.BinderC10003a.m24622e((C10013a) this.f25446x, obj);
                break;
            case 24:
                ((C31245d) this.f25446x).m96223S((C12111k) obj);
                break;
            case 28:
                C35910d.m114047E((C35908b) this.f25446x, obj);
                break;
            default:
                C35910d.m114072z((C35908b) this.f25446x, obj);
                break;
        }
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        switch (this.f25445w) {
            case 0:
                return SmartAlarmTriggerRepository.start$lambda$3((C0129g) this.f25446x, obj);
            case 1:
                return UserStrapsRepository.observeUserAndStrapUpdates$lambda$1((C0129g) this.f25446x, obj);
            case 2:
                return UserStrapsRepository.observeUserAndStrapUpdates$lambda$5((C6659f) this.f25446x, obj);
            case 16:
                return C22538a.m65133l((C22459e) this.f25446x, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C27858u.m84053p((C26842g) this.f25446x, obj);
            case 20:
                return C27858u.m84051m((C26842g) this.f25446x, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C30294a.m92548B((C30217a) this.f25446x, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C30294a.m92550D((C30217a) this.f25446x, obj);
            case 26:
                return C33706d.m106530c0((C30217a) this.f25446x, obj);
            default:
                return C35910d.m114050H((C35868a) this.f25446x, obj);
        }
    }

    @Override // io.sentry.InterfaceC20332f7
    /* JADX INFO: renamed from: c */
    public void mo19988c(C20314d7 c20314d7) {
        C20645z6 c20645z6 = (C20645z6) this.f25446x;
        InterfaceC20406l interfaceC20406l = c20645z6.f77217q;
        if (interfaceC20406l != null) {
            interfaceC20406l.mo56615a(c20314d7);
        }
        C20637y6 c20637y6 = c20645z6.f77206f;
        C20438n7 c20438n7 = c20645z6.f77218r;
        if (c20438n7.f76520g == null) {
            if (c20637y6.f77194a) {
                c20645z6.mo56464v(c20637y6.f77195b, null);
                return;
            }
            return;
        }
        if (c20438n7.f76519f) {
            ListIterator listIterator = c20645z6.f77203c.listIterator();
            while (listIterator.hasNext()) {
                C20314d7 c20314d8 = (C20314d7) listIterator.next();
                if (!c20314d8.f76280g && c20314d8.f76275b == null) {
                    return;
                }
            }
        }
        c20645z6.mo56515r();
    }

    /* JADX INFO: renamed from: d */
    public void m19989d(C36919e c36919e) {
        InterfaceC13058l interfaceC13058l = (InterfaceC13058l) this.f25446x;
        C30022a c30022a = new C30022a(new C21607a(AbstractC3006f0.m8731y(C3003e1.f12012w, AbstractC3050q0.f12078b.plus(C30064k.f122676w), EnumC2998d0.f12006y, new C0458v(interfaceC13058l, c36919e, (InterfaceC30057d) null, 14))));
        while (true) {
            InterfaceC26443b interfaceC26443b = (InterfaceC26443b) c36919e.get();
            if (interfaceC26443b == EnumC30024c.f122536w) {
                c30022a.dispose();
                return;
            }
            do {
                if (c36919e.compareAndSet(interfaceC26443b, c30022a)) {
                    if (interfaceC26443b != null) {
                        interfaceC26443b.dispose();
                        return;
                    }
                    return;
                }
            } while (c36919e.get() == interfaceC26443b);
        }
    }

    /* JADX INFO: renamed from: e */
    public float m19990e(float f13) {
        return ((C12685s) this.f25446x).f43386k.getDensity() * f13;
    }

    @Override // gt.InterfaceC16166e
    /* JADX INFO: renamed from: f */
    public Object mo7223f(C0627i1 c0627i1) {
        return this.f25446x;
    }

    @Override // io.sentry.InterfaceC20320e4
    /* JADX INFO: renamed from: h */
    public void mo11182h(InterfaceC20259b1 it) {
        C20265b7 c20265b7Mo56206q;
        switch (this.f25445w) {
            case 6:
                AtomicLong atomicLong = ((C20160u0) this.f25446x).f75750w;
                if (atomicLong.get() == 0 && (c20265b7Mo56206q = it.mo56206q()) != null && c20265b7Mo56206q.m56221c() != null) {
                    atomicLong.set(c20265b7Mo56206q.m56221c().getTime());
                    break;
                }
                break;
            case 7:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f25446x;
                C20265b7 c20265b7Mo56206q2 = it.mo56206q();
                if (c20265b7Mo56206q2 != null && c20265b7Mo56206q2.m56221c() != null) {
                    atomicBoolean.set(true);
                    break;
                }
                break;
            case 8:
                it.mo56192N(new C3633d(4, (GestureDetectorOnGestureListenerC20091g) this.f25446x, it));
                break;
            case 9:
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.f25446x;
                AbstractC22676k.m65750j(it, "it");
                String canonicalName = abstractComponentCallbacksC1320m0.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = abstractComponentCallbacksC1320m0.getClass().getSimpleName();
                }
                it.mo56186H(canonicalName);
                break;
            case 10:
                C22669g0 c22669g0 = (C22669g0) this.f25446x;
                AbstractC22676k.m65750j(it, "it");
                c22669g0.f89336w = it.mo56203m();
                break;
            default:
                C31776m.m98667n((Function1) this.f25446x, it);
                break;
        }
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public Object mo19991j() {
        C20292i c20292i;
        switch (this.f25445w) {
            case 11:
                return ((C20280c) this.f25446x).f76159w.getSerializer();
            case 12:
                C20283f c20283f = (C20283f) this.f25446x;
                C20513q6 c20513q6 = c20283f.f76165a;
                File fileM56252b = AbstractC20278a.m56252b(c20513q6, ".scope-cache");
                if (fileM56252b == null) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new C20285b();
                }
                File file = new File(fileM56252b, "breadcrumbs.json");
                try {
                    int maxBreadcrumbs = c20513q6.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileM56275m = C20292i.m56275m(file);
                    try {
                        try {
                            c20292i = new C20292i(file, randomAccessFileM56275m, maxBreadcrumbs);
                        } catch (IOException e5) {
                            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to create breadcrumbs queue", e5);
                            return new C20285b();
                        }
                    } catch (Throwable th3) {
                        randomAccessFileM56275m.close();
                        throw th3;
                    }
                    break;
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = c20513q6.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileM56275m2 = C20292i.m56275m(file);
                    try {
                        c20292i = new C20292i(file, randomAccessFileM56275m2, maxBreadcrumbs2);
                    } catch (Throwable th4) {
                        randomAccessFileM56275m2.close();
                        throw th4;
                    }
                    break;
                }
                return new C20287d(c20292i, new C0929d(c20283f));
            default:
                return Boolean.valueOf(C30582e.m93818h((InterfaceC20602v0) this.f25446x, "androidx.core.app.FrameMetricsAggregator"));
        }
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        C25327j.m74393n((InterfaceC38290q) this.f25446x, task);
    }

    public /* synthetic */ C6656c(Object obj, int i13) {
        this.f25445w = i13;
        this.f25446x = obj;
    }
}
