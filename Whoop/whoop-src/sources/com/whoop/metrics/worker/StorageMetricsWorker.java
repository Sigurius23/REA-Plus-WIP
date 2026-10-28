package com.whoop.metrics.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import ny1.C27297d;
import p218ic.AbstractC18386u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/metrics/worker/StorageMetricsWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StorageMetricsWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.metrics.worker.StorageMetricsWorker$a */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.worker.StorageMetricsWorker", m100430f = "StorageMetricsWorker.kt", m100431l = {16}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9151a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f27387w;

        /* JADX INFO: renamed from: y */
        int f27389y;

        public C9151a(InterfaceC30057d<? super C9151a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f27387w = obj;
            this.f27389y |= Integer.MIN_VALUE;
            return StorageMetricsWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageMetricsWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "StorageMetricsWorker";
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C9151a c9151a;
        if (interfaceC30057d instanceof C9151a) {
            c9151a = (C9151a) interfaceC30057d;
            int i13 = c9151a.f27389y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c9151a.f27389y = i13 - Integer.MIN_VALUE;
            } else {
                c9151a = new C9151a(interfaceC30057d);
            }
        } else {
            c9151a = new C9151a(interfaceC30057d);
        }
        Object obj = c9151a.f27387w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c9151a.f27389y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C27297d c27297d = (C27297d) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27297d.class), null);
            c9151a.f27389y = 1;
            if (c27297d.m82356d(c9151a) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return AbstractC18386u.m52885b();
    }
}
