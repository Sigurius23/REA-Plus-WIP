package p185h6;

import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.service.network.model.UserState;
import e61.C12764g;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.sentry.C20274c4;
import io.sentry.C20323e7;
import io.sentry.C20353h7;
import io.sentry.android.ndk.C20177b;
import io.sentry.cache.C20283f;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.C20501v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import live.hms.video.utils.HMSConstantsKt;
import p005a3.C0237p;
import p034bl.C3364d;
import p073cq.C11040i;
import p080d4.C11653l;
import p218ic.C18389w;
import p249jc.C21568b0;
import p249jc.C21577g;
import p249jc.C21578g0;
import p249jc.C21582i0;
import p249jc.C21586l;
import p249jc.C21596v;
import p249jc.CallableC21575f;
import p249jc.InterfaceC21571d;
import p420qc.C30200j;
import p420qc.C30207q;
import p420qc.C30211u;
import p505ts.AbstractC34132o;
import p692zt.AbstractServiceC41104h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h6.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC16957l implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65089w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f65090x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f65091y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f65092z;

    public /* synthetic */ RunnableC16957l(Object obj, Object obj2, Object obj3, int i13) {
        this.f65089w = i13;
        this.f65090x = obj;
        this.f65091y = obj2;
        this.f65092z = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        boolean z4;
        switch (this.f65089w) {
            case 0:
                C3364d c3364d = (C3364d) this.f65090x;
                AbstractC37056f abstractC37056f = (AbstractC37056f) this.f65091y;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f65092z;
                try {
                    C16965t c16965tM107887k = AbstractC34132o.m107887k(c3364d.f13108a);
                    if (c16965tM107887k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C16964s c16964s = (C16964s) c16965tM107887k.f65114a;
                    synchronized (c16964s.f65108d) {
                        c16964s.f65110f = threadPoolExecutor;
                        break;
                    }
                    c16965tM107887k.f65114a.mo9715a(new C16958m(abstractC37056f, threadPoolExecutor));
                    return;
                } catch (Throwable th3) {
                    abstractC37056f.mo47704S(th3);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                QuickJSContext c3 = (QuickJSContext) this.f65090x;
                String js3 = (String) this.f65091y;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f65092z;
                AbstractC22676k.m65750j(c3, "$c");
                AbstractC22676k.m65750j(js3, "$js");
                try {
                    Object objEvaluate = c3.evaluate(js3);
                    if (interfaceC4351m != null) {
                        interfaceC4351m.invoke(objEvaluate, null);
                        return;
                    }
                    return;
                } catch (Exception e5) {
                    if (interfaceC4351m != null) {
                        interfaceC4351m.invoke(null, e5);
                        return;
                    }
                    return;
                }
            case 2:
                C20177b c20177b = (C20177b) this.f65090x;
                String str = (String) this.f65091y;
                String str2 = (String) this.f65092z;
                c20177b.f75785b.getClass();
                NativeScope.nativeSetTag(str, str2);
                return;
            case 3:
                C20283f c20283f = (C20283f) this.f65090x;
                C20323e7 c20323e7 = (C20323e7) this.f65091y;
                C20274c4 c20274c4 = (C20274c4) this.f65092z;
                if (c20323e7 != null) {
                    c20283f.m56268g(c20323e7, "trace.json");
                    return;
                }
                C0237p c0237p = c20274c4.f76141s;
                C20323e7 c20323e8 = new C20323e7((C20501v) c0237p.f812x, (C20353h7) c0237p.f813y, HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, null);
                c20323e8.f76314I = UserState.Sources.AUTO;
                c20283f.m56268g(c20323e8, "trace.json");
                return;
            case 4:
                C21577g c21577g = (C21577g) this.f65090x;
                C11653l c11653l = (C11653l) this.f65091y;
                C21582i0 c21582i0 = (C21582i0) this.f65092z;
                c21577g.getClass();
                try {
                    zBooleanValue = ((Boolean) c11653l.f37634x.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (c21577g.f82749k) {
                    try {
                        C30200j c30200jM48869P = AbstractC17269i.m48869P(c21582i0.f82758a);
                        String str3 = c30200jM48869P.f123603a;
                        if (c21577g.m60621c(str3) == c21582i0) {
                            c21577g.m60620b(str3);
                        }
                        C18389w.m52886d().m52888a(C21577g.f82738l, C21577g.class.getSimpleName() + " " + str3 + " executed; reschedule = " + zBooleanValue);
                        Iterator it = c21577g.f82748j.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC21571d) it.next()).mo5525b(c30200jM48869P, zBooleanValue);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case 5:
                C5101l0 c5101l0 = (C5101l0) this.f65090x;
                C21586l c21586l = (C21586l) this.f65091y;
                C0237p c0237p2 = (C0237p) this.f65092z;
                C21577g c21577g2 = (C21577g) c5101l0.f21443x;
                c21577g2.getClass();
                C30200j c30200j = c21586l.f82778a;
                String str4 = c30200j.f123603a;
                ArrayList arrayList = new ArrayList();
                C30207q c30207q = (C30207q) c21577g2.f82743e.runInTransaction(new CallableC21575f(c21577g2, arrayList, str4));
                if (c30207q == null) {
                    C18389w.m52886d().m52892g(C21577g.f82738l, "Didn't find WorkSpec for id " + c30200j);
                    c21577g2.m60622e(c30200j);
                    return;
                }
                synchronized (c21577g2.f82749k) {
                    try {
                        synchronized (c21577g2.f82749k) {
                            z4 = c21577g2.m60621c(str4) != null;
                            break;
                        }
                        if (z4) {
                            Set set = (Set) c21577g2.f82746h.get(str4);
                            if (((C21586l) set.iterator().next()).f82778a.f123604b == c30200j.f123604b) {
                                set.add(c21586l);
                                C18389w.m52886d().m52888a(C21577g.f82738l, "Work " + c30200j + " is already enqueued for processing");
                            } else {
                                c21577g2.m60622e(c30200j);
                            }
                            return;
                        }
                        if (c30207q.f123653t != c30200j.f123604b) {
                            c21577g2.m60622e(c30200j);
                            return;
                        }
                        C21568b0 c21568b0 = new C21568b0(c21577g2.f82740b, c21577g2.f82741c, c21577g2.f82742d, c21577g2, c21577g2.f82743e, c30207q, arrayList);
                        if (c0237p2 != null) {
                            c21568b0.f82718h = c0237p2;
                        }
                        C21582i0 c21582i1 = new C21582i0(c21568b0);
                        C11653l c11653lM92086F = AbstractC30060g.m92086F(c21582i1.f82762e.f133916b.plus(AbstractC3006f0.m8709c()), new C21578g0(c21582i1, null, 1));
                        c11653lM92086F.f37634x.mo31061a(new RunnableC16957l(c21577g2, c11653lM92086F, c21582i1, 4), c21577g2.f82742d.f133918d);
                        c21577g2.f82745g.put(str4, c21582i1);
                        HashSet hashSet = new HashSet();
                        hashSet.add(c21586l);
                        c21577g2.f82746h.put(str4, hashSet);
                        C18389w.m52886d().m52888a(C21577g.f82738l, C21577g.class.getSimpleName() + ": processing " + c30200j);
                        return;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            case 6:
                WorkDatabase workDatabase = (WorkDatabase) this.f65090x;
                String name = (String) this.f65091y;
                C21596v c21596v = (C21596v) this.f65092z;
                C30211u c30211uMo5521h = workDatabase.mo5521h();
                c30211uMo5521h.getClass();
                AbstractC22676k.m65750j(name, "name");
                Iterator it3 = ((List) AbstractC15751g.m44432L(c30211uMo5521h.f123665a, true, false, new C12764g(name, 11))).iterator();
                while (it3.hasNext()) {
                    AbstractC30060g.m92123m(c21596v, (String) it3.next());
                }
                return;
            default:
                AbstractServiceC41104h abstractServiceC41104h = (AbstractServiceC41104h) this.f65090x;
                Intent intent = (Intent) this.f65091y;
                C11040i c11040i = (C11040i) this.f65092z;
                abstractServiceC41104h.getClass();
                try {
                    abstractServiceC41104h.mo16395d(intent);
                    return;
                } finally {
                    c11040i.m29687b(null);
                }
        }
    }
}
