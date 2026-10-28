package io.sentry.android.replay.capture;

import f93.InterfaceC14292d;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.util.RunnableC20237e;
import j93.InterfaceC21493z;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p036bq.RunnableC3543b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20186b implements InterfaceC14292d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75826w;

    /* JADX INFO: renamed from: x */
    public final AtomicReference f75827x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC20187c f75828y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC20187c f75829z;

    public C20186b(AbstractC20187c abstractC20187c, AbstractC20187c abstractC20187c2, int i13) {
        this.f75826w = i13;
        switch (i13) {
            case 2:
                this.f75828y = abstractC20187c;
                this.f75829z = abstractC20187c2;
                this.f75827x = new AtomicReference(null);
                break;
            case 3:
                this.f75828y = abstractC20187c;
                this.f75829z = abstractC20187c2;
                this.f75827x = new AtomicReference(null);
                break;
            case 4:
                this.f75828y = abstractC20187c;
                this.f75829z = abstractC20187c2;
                this.f75827x = new AtomicReference(null);
                break;
            case 5:
                this.f75828y = abstractC20187c;
                this.f75829z = abstractC20187c2;
                this.f75827x = new AtomicReference(null);
                break;
            default:
                this.f75828y = abstractC20187c;
                this.f75829z = abstractC20187c2;
                this.f75827x = new AtomicReference(-1);
                break;
        }
    }

    @Override // f93.InterfaceC14291c
    public final Object getValue(Object obj, InterfaceC21493z property) {
        switch (this.f75826w) {
            case 0:
                AbstractC22676k.m65750j(property, "property");
                break;
            case 1:
                AbstractC22676k.m65750j(property, "property");
                break;
            case 2:
                AbstractC22676k.m65750j(property, "property");
                break;
            case 3:
                AbstractC22676k.m65750j(property, "property");
                break;
            case 4:
                AbstractC22676k.m65750j(property, "property");
                break;
            default:
                AbstractC22676k.m65750j(property, "property");
                break;
        }
        return this.f75827x.get();
    }

    @Override // f93.InterfaceC14292d
    public final void setValue(Object obj, InterfaceC21493z property, Object obj2) {
        switch (this.f75826w) {
            case 0:
                AbstractC22676k.m65750j(property, "property");
                Object andSet = this.f75827x.getAndSet(obj2);
                if (!AbstractC22676k.m65745e(andSet, obj2)) {
                    C20185a c20185a = new C20185a(andSet, obj2, this.f75829z, 0);
                    AbstractC20187c abstractC20187c = this.f75828y;
                    C20513q6 c20513q6 = abstractC20187c.f75831a;
                    if (c20513q6.getThreadChecker().mo55996a()) {
                        ((ScheduledExecutorService) abstractC20187c.f75835e.getValue()).submit(new RunnableC20237e(new RunnableC3543b(c20185a, 7), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            c20185a.invoke();
                        } catch (Throwable th3) {
                            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th3);
                            return;
                        }
                    }
                }
                break;
            case 1:
                AbstractC22676k.m65750j(property, "property");
                Object andSet2 = this.f75827x.getAndSet(obj2);
                if (!AbstractC22676k.m65745e(andSet2, obj2)) {
                    C20185a c20185a2 = new C20185a(andSet2, obj2, this.f75829z, 1);
                    AbstractC20187c abstractC20187c2 = this.f75828y;
                    C20513q6 c20513q7 = abstractC20187c2.f75831a;
                    if (c20513q7.getThreadChecker().mo55996a()) {
                        ((ScheduledExecutorService) abstractC20187c2.f75835e.getValue()).submit(new RunnableC20237e(new RunnableC3543b(c20185a2, 8), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            c20185a2.invoke();
                        } catch (Throwable th4) {
                            c20513q7.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th4);
                            return;
                        }
                    }
                }
                break;
            case 2:
                AbstractC22676k.m65750j(property, "property");
                Object andSet3 = this.f75827x.getAndSet(obj2);
                if (!AbstractC22676k.m65745e(andSet3, obj2)) {
                    C20185a c20185a3 = new C20185a(andSet3, obj2, this.f75829z, 2);
                    AbstractC20187c abstractC20187c3 = this.f75828y;
                    C20513q6 c20513q8 = abstractC20187c3.f75831a;
                    if (c20513q8.getThreadChecker().mo55996a()) {
                        ((ScheduledExecutorService) abstractC20187c3.f75835e.getValue()).submit(new RunnableC20237e(new RunnableC3543b(c20185a3, 9), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            c20185a3.invoke();
                        } catch (Throwable th5) {
                            c20513q8.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th5);
                            return;
                        }
                    }
                }
                break;
            case 3:
                AbstractC22676k.m65750j(property, "property");
                Object andSet4 = this.f75827x.getAndSet(obj2);
                if (!AbstractC22676k.m65745e(andSet4, obj2)) {
                    C20185a c20185a4 = new C20185a(andSet4, obj2, this.f75829z, 3);
                    AbstractC20187c abstractC20187c4 = this.f75828y;
                    C20513q6 c20513q9 = abstractC20187c4.f75831a;
                    if (c20513q9.getThreadChecker().mo55996a()) {
                        ((ScheduledExecutorService) abstractC20187c4.f75835e.getValue()).submit(new RunnableC20237e(new RunnableC3543b(c20185a4, 10), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            c20185a4.invoke();
                        } catch (Throwable th6) {
                            c20513q9.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th6);
                            return;
                        }
                    }
                }
                break;
            case 4:
                AbstractC22676k.m65750j(property, "property");
                Object andSet5 = this.f75827x.getAndSet(obj2);
                if (!AbstractC22676k.m65745e(andSet5, obj2)) {
                    C20185a c20185a5 = new C20185a(andSet5, obj2, this.f75829z, 4);
                    AbstractC20187c abstractC20187c5 = this.f75828y;
                    C20513q6 c20513q10 = abstractC20187c5.f75831a;
                    if (c20513q10.getThreadChecker().mo55996a()) {
                        ((ScheduledExecutorService) abstractC20187c5.f75835e.getValue()).submit(new RunnableC20237e(new RunnableC3543b(c20185a5, 11), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            c20185a5.invoke();
                        } catch (Throwable th7) {
                            c20513q10.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th7);
                            return;
                        }
                    }
                }
                break;
            default:
                AbstractC22676k.m65750j(property, "property");
                Object andSet6 = this.f75827x.getAndSet(obj2);
                if (!AbstractC22676k.m65745e(andSet6, obj2)) {
                    C20185a c20185a6 = new C20185a(andSet6, obj2, this.f75829z, 5);
                    AbstractC20187c abstractC20187c6 = this.f75828y;
                    C20513q6 c20513q11 = abstractC20187c6.f75831a;
                    if (c20513q11.getThreadChecker().mo55996a()) {
                        ((ScheduledExecutorService) abstractC20187c6.f75835e.getValue()).submit(new RunnableC20237e(new RunnableC3543b(c20185a6, 12), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            c20185a6.invoke();
                        } catch (Throwable th8) {
                            c20513q11.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th8);
                        }
                    }
                }
                break;
        }
    }

    public C20186b(Object obj, AbstractC20187c abstractC20187c, AbstractC20187c abstractC20187c2) {
        this.f75826w = 0;
        this.f75828y = abstractC20187c;
        this.f75829z = abstractC20187c2;
        this.f75827x = new AtomicReference(obj);
    }
}
