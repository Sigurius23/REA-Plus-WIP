package com.whoop.util;

import android.content.Context;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.metrics.worker.BaseReportingWorker;
import java.time.Duration;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p218ic.AbstractC18377p0;
import p218ic.AbstractC18386u;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.EnumC18366k;
import p218ic.InterfaceC18355e0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34114l;
import x83.AbstractC38093j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/util/LocalLogExportFileWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "z", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LocalLogExportFileWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.util.LocalLogExportFileWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/util/LocalLogExportFileWorker$a;", "", "<init>", "()V", "Lic/k0;", "a", "()Lic/k0;", "Lic/p0;", "workManager", "Lic/e0;", "b", "(Lic/p0;)Lic/e0;", "", "WORK_NAME", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final C18367k0 m27809a() {
            Duration durationOfDays = Duration.ofDays(1L);
            AbstractC22676k.m65749i(durationOfDays, "ofDays(...)");
            return (C18367k0) new C18365j0(LocalLogExportFileWorker.class, durationOfDays).m52878b();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC18355e0 m27810b(AbstractC18377p0 workManager) {
            AbstractC22676k.m65750j(workManager, "workManager");
            return workManager.mo52875d("delete-past-log-export-files", EnumC18366k.f71499w, m27809a());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.util.LocalLogExportFileWorker$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.LocalLogExportFileWorker", m100430f = "LocalLogExportFileWorker.kt", m100431l = {24}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10696b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f32627w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f32628x;

        /* JADX INFO: renamed from: z */
        int f32630z;

        public C10696b(InterfaceC30057d<? super C10696b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32628x = obj;
            this.f32630z |= Integer.MIN_VALUE;
            return LocalLogExportFileWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.util.LocalLogExportFileWorker$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.LocalLogExportFileWorker$work$2", m100430f = "LocalLogExportFileWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10697c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32631w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC34114l f32632x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LocalLogExportFileWorker f32633y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10697c(InterfaceC34114l interfaceC34114l, LocalLogExportFileWorker localLogExportFileWorker, InterfaceC30057d<? super C10697c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32632x = interfaceC34114l;
            this.f32633y = localLogExportFileWorker;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10697c(this.f32632x, this.f32633y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C10697c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32631w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC34114l interfaceC34114l = this.f32632x;
            Context applicationContext = this.f32633y.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            return Boolean.valueOf(AbstractC38093j.m122038l(interfaceC34114l.mo107845b(applicationContext)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalLogExportFileWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "delete-past-log-export-files";
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
        C10696b c10696b;
        if (interfaceC30057d instanceof C10696b) {
            c10696b = (C10696b) interfaceC30057d;
            int i13 = c10696b.f32630z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10696b.f32630z = i13 - Integer.MIN_VALUE;
            } else {
                c10696b = new C10696b(interfaceC30057d);
            }
        } else {
            c10696b = new C10696b(interfaceC30057d);
        }
        Object obj = c10696b.f32628x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10696b.f32630z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC34114l interfaceC34114l = (InterfaceC34114l) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34114l.class), null);
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            C10697c c10697c = new C10697c(interfaceC34114l, this, null);
            c10696b.f32627w = null;
            c10696b.f32630z = 1;
            if (AbstractC3006f0.m8705K(executorC22364d, c10697c, c10696b) == enumC31071a) {
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
