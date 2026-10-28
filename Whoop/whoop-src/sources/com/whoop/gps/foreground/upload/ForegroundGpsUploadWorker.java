package com.whoop.gps.foreground.upload;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import ei1.InterfaceC13220a;
import fi1.InterfaceC14521b;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lei1/a;", "z", "Ll83/h;", "k", "()Lei1/a;", "foregroundGpsRouteStorage", "Lfi1/b;", "E", "l", "()Lfi1/b;", "foregroundGpsUploader", "F", "a", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ForegroundGpsUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: G */
    public static final int f26114G = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h foregroundGpsUploader;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h foregroundGpsRouteStorage;

    /* JADX INFO: renamed from: com.whoop.gps.foreground.upload.ForegroundGpsUploadWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8767b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26118w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26119x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26120y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8767b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26118w = interfaceC27903a;
            this.f26119x = interfaceC35951a;
            this.f26120y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [ei1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC13220a invoke() {
            InterfaceC27903a interfaceC27903a = this.f26118w;
            InterfaceC35951a interfaceC35951a = this.f26119x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26120y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC13220a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.gps.foreground.upload.ForegroundGpsUploadWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8768c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26121w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26122x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8768c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26121w = interfaceC27903a;
            this.f26122x = interfaceC35951a;
            this.f26123y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [fi1.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14521b invoke() {
            InterfaceC27903a interfaceC27903a = this.f26121w;
            InterfaceC35951a interfaceC35951a = this.f26122x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26123y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14521b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.gps.foreground.upload.ForegroundGpsUploadWorker$d */
    @InterfaceC32271e(m100429c = "com.whoop.gps.foreground.upload.ForegroundGpsUploadWorker", m100430f = "ForegroundGpsUploadWorker.kt", m100431l = {24, 29, 31}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8769d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f26124E;

        /* JADX INFO: renamed from: F */
        int f26125F;

        /* JADX INFO: renamed from: G */
        boolean f26126G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f26127H;

        /* JADX INFO: renamed from: J */
        int f26129J;

        /* JADX INFO: renamed from: w */
        long f26130w;

        /* JADX INFO: renamed from: x */
        long f26131x;

        /* JADX INFO: renamed from: y */
        Object f26132y;

        /* JADX INFO: renamed from: z */
        Object f26133z;

        public C8769d(InterfaceC30057d<? super C8769d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26127H = obj;
            this.f26129J |= Integer.MIN_VALUE;
            return ForegroundGpsUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForegroundGpsUploadWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "ForegroundGpsUploadWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.foregroundGpsRouteStorage = AbstractC30060g.m92087G(enumC23463i, new C8767b(this, null, null));
        this.foregroundGpsUploader = AbstractC30060g.m92087G(enumC23463i, new C8768c(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC13220a m21472k() {
        return (InterfaceC13220a) this.foregroundGpsRouteStorage.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC14521b m21473l() {
        return (InterfaceC14521b) this.foregroundGpsUploader.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:41:0x0134  */
    /* JADX WARN: Code duplicated, block: B:42:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0134 -> B:30:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x013b -> B:30:0x00c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r27) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.gps.foreground.upload.ForegroundGpsUploadWorker.mo18568j(q83.d):java.lang.Object");
    }
}
