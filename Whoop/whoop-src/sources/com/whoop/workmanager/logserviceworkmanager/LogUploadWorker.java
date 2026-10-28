package com.whoop.workmanager.logserviceworkmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import p218ic.AbstractC18386u;
import p218ic.C18382s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import vr2.InterfaceC36310c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lvr2/c;", "y", "Ll83/h;", "k", "()Lvr2/c;", "logEventUploader", "", "e", "()Ljava/lang/String;", "uniqueWorkName", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LogUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h logEventUploader;

    /* JADX INFO: renamed from: com.whoop.workmanager.logserviceworkmanager.LogUploadWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10931a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33815w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33816x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33817y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10931a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33815w = interfaceC27903a;
            this.f33816x = interfaceC35951a;
            this.f33817y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, vr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC36310c invoke() {
            InterfaceC27903a interfaceC27903a = this.f33815w;
            InterfaceC35951a interfaceC35951a = this.f33816x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33817y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC36310c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.workmanager.logserviceworkmanager.LogUploadWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.logserviceworkmanager.LogUploadWorker", m100430f = "LogUploadWorker.kt", m100431l = {27}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10932b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f33818w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33819x;

        /* JADX INFO: renamed from: z */
        int f33821z;

        public C10932b(InterfaceC30057d<? super C10932b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33819x = obj;
            this.f33821z |= Integer.MIN_VALUE;
            return LogUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogUploadWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.logEventUploader = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10931a(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC36310c m28984k() {
        return (InterfaceC36310c) this.logEventUploader.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e */
    public String getUniqueWorkName() {
        return getInputData().m52858a("FORCE_UPLOAD_ALL_LOGS", false) ? "ONE_TIME_CONNECTED_UPLOAD_LOGS" : "PERIODIC_CONNECTED_UPLOAD_LOGS";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C10932b c10932b;
        if (interfaceC30057d instanceof C10932b) {
            c10932b = (C10932b) interfaceC30057d;
            int i13 = c10932b.f33821z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10932b.f33821z = i13 - Integer.MIN_VALUE;
            } else {
                c10932b = new C10932b(interfaceC30057d);
            }
        } else {
            c10932b = new C10932b(interfaceC30057d);
        }
        Object objMo116098a = c10932b.f33819x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10932b.f33821z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo116098a);
                boolean zM52858a = getInputData().m52858a("FORCE_UPLOAD_ALL_LOGS", false);
                m22895c().mo85228t("Force upload set to " + zM52858a, new AbstractC30556a.a[0]);
                InterfaceC36310c interfaceC36310cM28984k = m28984k();
                c10932b.f33818w = zM52858a;
                c10932b.f33821z = 1;
                objMo116098a = interfaceC36310cM28984k.mo116098a(zM52858a, c10932b);
                if (objMo116098a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo116098a);
            }
            return (AbstractC18386u) objMo116098a;
        } catch (Exception e5) {
            m22895c().mo85222m("Error uploading logs: " + e5.getStackTrace(), new AbstractC30556a.a[0]);
            return new C18382s();
        }
    }
}
