package p249jc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.room.ExecutorC1834u1;
import androidx.work.impl.WorkDatabase;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import c41.C4068m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import hc3.C17171d;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p007a6.C0438l0;
import p037bu.C3632c;
import p098dt.AbstractC12350b;
import p179h.C16354l;
import p218ic.AbstractC18377p0;
import p218ic.C18348b;
import p218ic.C18357f0;
import p218ic.C18367k0;
import p218ic.C18389w;
import p218ic.C18391y;
import p218ic.EnumC18366k;
import p218ic.EnumC18368l;
import p218ic.InterfaceC18355e0;
import p222ij.RunnableC18575a;
import p364oc.C27815i;
import p420qc.C30200j;
import p457rc.AbstractC31225h;
import p457rc.RunnableC31219b;
import p714k80.C22275d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import pf.AbstractC29125c;
import pl0.C29343a;
import sc.C32352b;
import sc.InterfaceC32351a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jc.v */
/* JADX INFO: loaded from: classes.dex */
public final class C21596v extends AbstractC18377p0 {

    /* JADX INFO: renamed from: k */
    public static C21596v f82802k;

    /* JADX INFO: renamed from: l */
    public static C21596v f82803l;

    /* JADX INFO: renamed from: m */
    public static final Object f82804m;

    /* JADX INFO: renamed from: a */
    public final Context f82805a;

    /* JADX INFO: renamed from: b */
    public final C18348b f82806b;

    /* JADX INFO: renamed from: c */
    public final WorkDatabase f82807c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC32351a f82808d;

    /* JADX INFO: renamed from: e */
    public final List f82809e;

    /* JADX INFO: renamed from: f */
    public final C21577g f82810f;

    /* JADX INFO: renamed from: g */
    public final C3632c f82811g;

    /* JADX INFO: renamed from: h */
    public boolean f82812h = false;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f82813i;

    /* JADX INFO: renamed from: j */
    public final C27815i f82814j;

    static {
        C18389w.m52887f("WorkManagerImpl");
        f82802k = null;
        f82803l = null;
        f82804m = new Object();
    }

    public C21596v(Context context, final C18348b c18348b, InterfaceC32351a interfaceC32351a, final WorkDatabase workDatabase, final List list, C21577g c21577g, C27815i c27815i) {
        int i13 = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        C18389w c18389w = new C18389w(c18348b.f71453h);
        synchronized (C18389w.f71554b) {
            try {
                if (C18389w.f71555c == null) {
                    C18389w.f71555c = c18389w;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f82805a = applicationContext;
        this.f82808d = interfaceC32351a;
        this.f82807c = workDatabase;
        this.f82810f = c21577g;
        this.f82814j = c27815i;
        this.f82806b = c18348b;
        this.f82809e = list;
        C32352b c32352b = (C32352b) interfaceC32351a;
        AbstractC3076z abstractC3076z = c32352b.f133916b;
        AbstractC22676k.m65749i(abstractC3076z, "getTaskCoroutineDispatcher(...)");
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(abstractC3076z);
        this.f82811g = new C3632c(workDatabase);
        final ExecutorC1834u1 executorC1834u1 = c32352b.f133915a;
        String str = AbstractC21585k.f82777a;
        c21577g.m60619a(new InterfaceC21571d() { // from class: jc.j
            @Override // p249jc.InterfaceC21571d
            /* JADX INFO: renamed from: b */
            public final void mo5525b(C30200j c30200j, boolean z4) {
                executorC1834u1.execute(new RunnableC18575a(list, c30200j, c18348b, workDatabase, 2));
            }
        });
        interfaceC32351a.m100716a(new RunnableC31219b(applicationContext, this));
        String str2 = AbstractC21588n.f82782a;
        if (AbstractC31225h.m96166a(applicationContext, c18348b)) {
            AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36610t(AbstractC13091v.m36599i(new C13015a0(AbstractC12350b.m34591l(workDatabase.mo5521h().f123665a, new String[]{"workspec"}, new C29343a(27)), new C21587m(4, null)), -1, 2)), new C16354l(applicationContext, null), i13), c17171dM8708b);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C21596v m60637g(Context context) {
        C21596v c21596v;
        Object obj = f82804m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        c21596v = f82802k;
                        if (c21596v == null) {
                            c21596v = f82803l;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return c21596v;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (c21596v != null) {
            return c21596v;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    @Override // p218ic.AbstractC18377p0
    /* JADX INFO: renamed from: b */
    public final C18357f0 mo52873b(String str) {
        C18391y c18391y = this.f82806b.f71458m;
        String strConcat = "CancelWorkByName_".concat(str);
        ExecutorC1834u1 executorC1834u1 = ((C32352b) this.f82808d).f133915a;
        AbstractC22676k.m65749i(executorC1834u1, "getSerialTaskExecutor(...)");
        return AbstractC37056f.m118957I(c18391y, strConcat, executorC1834u1, new C22275d(8, str, this));
    }

    @Override // p218ic.AbstractC18377p0
    /* JADX INFO: renamed from: d */
    public final InterfaceC18355e0 mo52875d(String str, EnumC18366k enumC18366k, C18367k0 workRequest) {
        if (enumC18366k != EnumC18366k.f71500x) {
            return new C21589o(this, str, enumC18366k == EnumC18366k.f71499w ? EnumC18368l.f71504x : EnumC18368l.f71503w, Collections.singletonList(workRequest), 0).m60634U();
        }
        AbstractC22676k.m65750j(workRequest, "workRequest");
        C18391y c18391y = this.f82806b.f71458m;
        String strConcat = "enqueueUniquePeriodic_".concat(str);
        ExecutorC1834u1 executorC1834u1 = ((C32352b) this.f82808d).f133915a;
        AbstractC22676k.m65749i(executorC1834u1, "getSerialTaskExecutor(...)");
        return AbstractC37056f.m118957I(c18391y, strConcat, executorC1834u1, new C4068m(this, str, workRequest, 1));
    }

    /* JADX INFO: renamed from: f */
    public final C18357f0 m60638f(UUID id4) {
        AbstractC22676k.m65750j(id4, "id");
        C18391y c18391y = this.f82806b.f71458m;
        ExecutorC1834u1 executorC1834u1 = ((C32352b) this.f82808d).f133915a;
        AbstractC22676k.m65749i(executorC1834u1, "getSerialTaskExecutor(...)");
        return AbstractC37056f.m118957I(c18391y, "CancelWorkById", executorC1834u1, new C30599e(12, this, id4));
    }

    /* JADX INFO: renamed from: h */
    public final void m60639h() {
        synchronized (f82804m) {
            try {
                this.f82812h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f82813i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f82813i = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m60640i() {
        C18391y c18391y = this.f82806b.f71458m;
        C0438l0 c0438l0 = new C0438l0(this, 26);
        AbstractC22676k.m65750j(c18391y, "<this>");
        boolean zM88496E = AbstractC29125c.m88496E();
        if (zM88496E) {
            try {
                Trace.beginSection(AbstractC29125c.m88517Z("ReschedulingWork"));
            } finally {
                if (zM88496E) {
                    Trace.endSection();
                }
            }
        }
        c0438l0.invoke();
    }
}
