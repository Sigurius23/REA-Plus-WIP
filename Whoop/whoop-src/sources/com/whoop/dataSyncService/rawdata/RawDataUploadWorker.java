package com.whoop.dataSyncService.rawdata;

import android.content.Context;
import android.database.sqlite.SQLiteOutOfMemoryException;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.metrics.worker.BaseReportingWorker;
import fi0.InterfaceC14515a;
import hx0.InterfaceC17709e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import p218ic.AbstractC18386u;
import p218ic.C18380r;
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
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "exceptionName", "Ll83/a0;", "o", "(Ljava/lang/String;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lhx0/e;", "y", "Ll83/h;", "n", "()Lhx0/e;", "newRawDataUploader", "Lrr2/c;", "z", "m", "()Lrr2/c;", "crashReporter", "Lfi0/a;", "E", "l", "()Lfi0/a;", "baseAnalytics", "F", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RawDataUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h baseAnalytics;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h newRawDataUploader;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: com.whoop.dataSyncService.rawdata.RawDataUploadWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6661a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25456w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25457x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25458y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6661a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25456w = interfaceC27903a;
            this.f25457x = interfaceC35951a;
            this.f25458y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [hx0.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC17709e invoke() {
            InterfaceC27903a interfaceC27903a = this.f25456w;
            InterfaceC35951a interfaceC35951a = this.f25457x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25458y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC17709e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.rawdata.RawDataUploadWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6662b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25459w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25460x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25461y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6662b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25459w = interfaceC27903a;
            this.f25460x = interfaceC35951a;
            this.f25461y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            InterfaceC27903a interfaceC27903a = this.f25459w;
            InterfaceC35951a interfaceC35951a = this.f25460x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25461y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.rawdata.RawDataUploadWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6663c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25462w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25463x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6663c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25462w = interfaceC27903a;
            this.f25463x = interfaceC35951a;
            this.f25464y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            InterfaceC27903a interfaceC27903a = this.f25462w;
            InterfaceC35951a interfaceC35951a = this.f25463x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25464y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.rawdata.RawDataUploadWorker$d */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.RawDataUploadWorker", m100430f = "RawDataUploadWorker.kt", m100431l = {29}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6664d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f25465w;

        /* JADX INFO: renamed from: y */
        int f25467y;

        public C6664d(InterfaceC30057d<? super C6664d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f25465w = obj;
            this.f25467y |= Integer.MIN_VALUE;
            return RawDataUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.rawdata.RawDataUploadWorker$e */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.RawDataUploadWorker$work$2", m100430f = "RawDataUploadWorker.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lic/u;", "<anonymous>", "(Lbc3/c0;)Lic/u;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6665e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25468w;

        public C6665e(InterfaceC30057d<? super C6665e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RawDataUploadWorker.this.new C6665e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
            return ((C6665e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25468w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC17709e interfaceC17709eM19995n = RawDataUploadWorker.this.m19995n();
            this.f25468w = 1;
            Object objMo50696a = interfaceC17709eM19995n.mo50696a(this);
            return objMo50696a == enumC31071a ? enumC31071a : objMo50696a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawDataUploadWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(parameters, "parameters");
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.newRawDataUploader = AbstractC30060g.m92087G(enumC23463i, new C6661a(this, null, null));
        this.crashReporter = AbstractC30060g.m92087G(enumC23463i, new C6662b(this, null, null));
        this.baseAnalytics = AbstractC30060g.m92087G(enumC23463i, new C6663c(this, null, null));
        this.uniqueWorkName = "PERIODIC_RAW_DATA_UPLOAD";
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC14515a m19993l() {
        return (InterfaceC14515a) this.baseAnalytics.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC31766c m19994m() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC17709e m19995n() {
        return (InterfaceC17709e) this.newRawDataUploader.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final void m19996o(String exceptionName) {
        m19993l().mo41428k("Connectivity", null, null, "Upload Raw Packets to API", AbstractC31061c.m95645u("Error", exceptionName));
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) throws Throwable {
        C6664d c6664d;
        if (interfaceC30057d instanceof C6664d) {
            c6664d = (C6664d) interfaceC30057d;
            int i13 = c6664d.f25467y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c6664d.f25467y = i13 - Integer.MIN_VALUE;
            } else {
                c6664d = new C6664d(interfaceC30057d);
            }
        } else {
            c6664d = new C6664d(interfaceC30057d);
        }
        Object obj = c6664d.f25465w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c6664d.f25467y;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C3075y1 c3075y1 = C3075y1.f12109w;
            C6665e c6665e = new C6665e(null);
            c6664d.f25467y = 1;
            Object objM8705K = AbstractC3006f0.m8705K(c3075y1, c6665e, c6664d);
            return objM8705K == enumC31071a ? enumC31071a : objM8705K;
        } catch (SQLiteOutOfMemoryException e5) {
            m22895c().mo85230v("Error uploading raw data", e5, new AbstractC30556a.a[0]);
            m19996o("SQLiteOutOfMemoryException");
            return new C18380r();
        } catch (Exception e13) {
            m19994m().mo98631p(e13);
            m22895c().mo85230v("Error uploading raw data", e13, new AbstractC30556a.a[0]);
            m19996o(e13.getClass().getSimpleName());
            return new C18380r();
        }
    }
}
