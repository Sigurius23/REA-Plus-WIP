package com.whoop.metrics.worker;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jy1.C22047a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25262p;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p000.AbstractC11266d;
import p218ic.AbstractC18386u;
import p218ic.C18370m;
import p218ic.C18380r;
import p218ic.C18382s;
import p218ic.C18384t;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tH¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0084@¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0018\u0010\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroidx/work/CoroutineWorker;", "Lof3/a;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "result", "", "startTime", "", "throwable", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lic/u;JLjava/lang/Throwable;Lq83/d;)Ljava/lang/Object;", "", "i", "(Lic/u;Ljava/lang/Throwable;)Ljava/lang/String;", "j", "(Lq83/d;)Ljava/lang/Object;", "g", "doWork", "Liy1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "d", "()Liy1/c;", "metricWriter", "Ltr2/n;", "x", "c", "()Ltr2/n;", "logger", "e", "()Ljava/lang/String;", "uniqueWorkName", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class BaseReportingWorker extends CoroutineWorker implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h metricWriter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: com.whoop.metrics.worker.BaseReportingWorker$a */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.worker.BaseReportingWorker", m100430f = "BaseReportingWorker.kt", m100431l = {55, 56, 60}, m100432m = "doWork$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9147a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f27370F;

        /* JADX INFO: renamed from: w */
        Object f27371w;

        /* JADX INFO: renamed from: x */
        Object f27372x;

        /* JADX INFO: renamed from: y */
        long f27373y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f27374z;

        public C9147a(InterfaceC30057d<? super C9147a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f27374z = obj;
            this.f27370F |= Integer.MIN_VALUE;
            return BaseReportingWorker.m22890b(BaseReportingWorker.this, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.metrics.worker.BaseReportingWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.worker.BaseReportingWorker", m100430f = "BaseReportingWorker.kt", m100431l = {46, 46}, m100432m = "promoteToForegroundIfNeeded", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9148b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f27375w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f27376x;

        /* JADX INFO: renamed from: z */
        int f27378z;

        public C9148b(InterfaceC30057d<? super C9148b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f27376x = obj;
            this.f27378z |= Integer.MIN_VALUE;
            return BaseReportingWorker.this.m22896g(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.metrics.worker.BaseReportingWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9149c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f27379w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27380x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27381y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9149c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27379w = interfaceC27903a;
            this.f27380x = interfaceC35951a;
            this.f27381y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            InterfaceC27903a interfaceC27903a = this.f27379w;
            InterfaceC35951a interfaceC35951a = this.f27380x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f27381y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), interfaceC35951a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseReportingWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(params, "params");
        this.metricWriter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9149c(this, null, null));
        this.logger = AbstractC30060g.m92088H(new C25262p(this, 6));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static Object m22890b(BaseReportingWorker baseReportingWorker, InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) throws Throwable {
        C9147a c9147a;
        long jNanoTime;
        BaseReportingWorker baseReportingWorker2;
        Throwable th3;
        Throwable th4;
        AbstractC18386u abstractC18386u;
        if (interfaceC30057d instanceof C9147a) {
            c9147a = (C9147a) interfaceC30057d;
            int i13 = c9147a.f27370F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c9147a.f27370F = i13 - Integer.MIN_VALUE;
            } else {
                c9147a = baseReportingWorker.new C9147a(interfaceC30057d);
            }
        } else {
            c9147a = baseReportingWorker.new C9147a(interfaceC30057d);
        }
        C9147a c9147a2 = c9147a;
        Object objMo18568j = c9147a2.f27374z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c9147a2.f27370F;
        if (i14 != 0) {
            if (i14 == 1) {
                long j7 = c9147a2.f27373y;
                baseReportingWorker = (BaseReportingWorker) c9147a2.f27371w;
                try {
                    AbstractC34132o.m107864I(objMo18568j);
                    jNanoTime = j7;
                    try {
                        abstractC18386u = (AbstractC18386u) objMo18568j;
                        c9147a2.f27371w = baseReportingWorker;
                        c9147a2.f27372x = abstractC18386u;
                        c9147a2.f27373y = jNanoTime;
                        c9147a2.f27370F = 2;
                        baseReportingWorker2 = baseReportingWorker;
                        try {
                            if (baseReportingWorker2.m22893h(abstractC18386u, jNanoTime, null, c9147a2) == enumC31071a) {
                                return abstractC18386u;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            th4 = th;
                            th3 = th4;
                            baseReportingWorker2.m22895c().mo85230v("Worker threw an exception", th3, new AbstractC30556a.a[0]);
                            c9147a2.f27371w = null;
                            c9147a2.f27372x = th3;
                            c9147a2.f27373y = jNanoTime;
                            c9147a2.f27370F = 3;
                            if (baseReportingWorker2.m22893h(null, jNanoTime, th3, c9147a2) != enumC31071a) {
                                throw th3;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        baseReportingWorker2 = baseReportingWorker;
                    }
                } catch (Throwable th7) {
                    baseReportingWorker2 = baseReportingWorker;
                    th3 = th7;
                    jNanoTime = j7;
                    baseReportingWorker2.m22895c().mo85230v("Worker threw an exception", th3, new AbstractC30556a.a[0]);
                    c9147a2.f27371w = null;
                    c9147a2.f27372x = th3;
                    c9147a2.f27373y = jNanoTime;
                    c9147a2.f27370F = 3;
                    if (baseReportingWorker2.m22893h(null, jNanoTime, th3, c9147a2) != enumC31071a) {
                        throw th3;
                    }
                }
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th8 = (Throwable) c9147a2.f27372x;
                    AbstractC34132o.m107864I(objMo18568j);
                    throw th8;
                }
                long j13 = c9147a2.f27373y;
                AbstractC18386u abstractC18386u2 = (AbstractC18386u) c9147a2.f27372x;
                BaseReportingWorker baseReportingWorker3 = (BaseReportingWorker) c9147a2.f27371w;
                try {
                    AbstractC34132o.m107864I(objMo18568j);
                    return abstractC18386u2;
                } catch (Throwable th9) {
                    th4 = th9;
                    baseReportingWorker2 = baseReportingWorker3;
                    jNanoTime = j13;
                }
            }
            th3 = th4;
            baseReportingWorker2.m22895c().mo85230v("Worker threw an exception", th3, new AbstractC30556a.a[0]);
            c9147a2.f27371w = null;
            c9147a2.f27372x = th3;
            c9147a2.f27373y = jNanoTime;
            c9147a2.f27370F = 3;
            if (baseReportingWorker2.m22893h(null, jNanoTime, th3, c9147a2) != enumC31071a) {
                throw th3;
            }
        } else {
            AbstractC34132o.m107864I(objMo18568j);
            baseReportingWorker.m22895c().mo85216g(AbstractC11266d.m30461o("Starting work for ", baseReportingWorker.getUniqueWorkName()), new AbstractC30556a.a[0]);
            jNanoTime = System.nanoTime();
            try {
                c9147a2.f27371w = baseReportingWorker;
                c9147a2.f27373y = jNanoTime;
                c9147a2.f27370F = 1;
                objMo18568j = baseReportingWorker.mo18568j(c9147a2);
                if (objMo18568j != enumC31071a) {
                    abstractC18386u = (AbstractC18386u) objMo18568j;
                    c9147a2.f27371w = baseReportingWorker;
                    c9147a2.f27372x = abstractC18386u;
                    c9147a2.f27373y = jNanoTime;
                    c9147a2.f27370F = 2;
                    baseReportingWorker2 = baseReportingWorker;
                    if (baseReportingWorker2.m22893h(abstractC18386u, jNanoTime, null, c9147a2) == enumC31071a) {
                        return abstractC18386u;
                    }
                }
            } catch (Throwable th10) {
                baseReportingWorker2 = baseReportingWorker;
                th3 = th10;
                baseReportingWorker2.m22895c().mo85230v("Worker threw an exception", th3, new AbstractC30556a.a[0]);
                c9147a2.f27371w = null;
                c9147a2.f27372x = th3;
                c9147a2.f27373y = jNanoTime;
                c9147a2.f27370F = 3;
                if (baseReportingWorker2.m22893h(null, jNanoTime, th3, c9147a2) != enumC31071a) {
                    throw th3;
                }
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC21030c m22891d() {
        return (InterfaceC21030c) this.metricWriter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC34116n m22892f(BaseReportingWorker baseReportingWorker) {
        return InterfaceC34116n.INSTANCE.m107848a(baseReportingWorker.getUniqueWorkName());
    }

    /* JADX INFO: renamed from: h */
    private final Object m22893h(AbstractC18386u abstractC18386u, long j7, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        long jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - j7, TimeUnit.NANOSECONDS);
        String strM22894i = m22894i(abstractC18386u, th3);
        m22895c().mo85216g(AbstractC31061c.m95640p("Ending work for ", getUniqueWorkName(), " with outcome ", strM22894i), new AbstractC30556a.a[0]);
        Object objMo58700a = m22891d().mo58700a(new C22047a(0, "workmanager.worker.run.outcome", new Double(jConvert), AbstractC37056f.m118959K(AbstractC11266d.m30461o("worker_type:", getUniqueWorkName()), AbstractC11266d.m30461o("outcome:", strM22894i)), null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private final String m22894i(AbstractC18386u result, Throwable throwable) {
        if (result == null) {
            return throwable instanceof CancellationException ? "cancellation_exception" : "exception";
        }
        C18384t c18384t = new C18384t(result.mo52883a());
        C18380r c18380r = new C18380r(result.mo52883a());
        C18382s c18382s = new C18382s();
        if (result.equals(c18384t)) {
            return "success";
        }
        if (result.equals(c18380r)) {
            return "failure";
        }
        return result.equals(c18382s) ? "retry" : "unknown";
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC34116n m22895c() {
        return (InterfaceC34116n) this.logger.getValue();
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        return m22890b(this, interfaceC30057d);
    }

    /* JADX INFO: renamed from: e */
    public abstract String getUniqueWorkName();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m22896g(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C9148b c9148b;
        BaseReportingWorker baseReportingWorker;
        if (interfaceC30057d instanceof C9148b) {
            c9148b = (C9148b) interfaceC30057d;
            int i13 = c9148b.f27378z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c9148b.f27378z = i13 - Integer.MIN_VALUE;
            } else {
                c9148b = new C9148b(interfaceC30057d);
            }
        } else {
            c9148b = new C9148b(interfaceC30057d);
        }
        Object foregroundInfo = c9148b.f27376x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c9148b.f27378z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 == 1) {
                baseReportingWorker = (BaseReportingWorker) c9148b.f27375w;
                AbstractC34132o.m107864I(foregroundInfo);
                c9148b.f27375w = null;
                c9148b.f27378z = 2;
                if (baseReportingWorker.setForeground((C18370m) foregroundInfo, c9148b) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(foregroundInfo);
            }
            return c23454a0;
        }
        AbstractC34132o.m107864I(foregroundInfo);
        if (Build.VERSION.SDK_INT <= 30) {
            c9148b.f27375w = this;
            c9148b.f27378z = 1;
            foregroundInfo = getForegroundInfo(c9148b);
            if (foregroundInfo != enumC31071a) {
                baseReportingWorker = this;
                c9148b.f27375w = null;
                c9148b.f27378z = 2;
                if (baseReportingWorker.setForeground((C18370m) foregroundInfo, c9148b) == enumC31071a) {
                }
            }
            return enumC31071a;
        }
        return c23454a0;
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d);
}
