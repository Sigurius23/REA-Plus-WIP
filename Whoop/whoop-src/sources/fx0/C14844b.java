package fx0;

import ca2.InterfaceC4368h;
import iy1.InterfaceC21030c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: fx0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lfx0/b;", "", "Liy1/c;", "metricsInteractor", "Lca2/h;", "rawDataTrackingService", "<init>", "(Liy1/c;Lca2/h;)V", "Lfx0/a;", "dataSyncMetric", "Ll83/a0;", "a", "(Lfx0/a;Lq83/d;)Ljava/lang/Object;", "Liy1/c;", "b", "Lca2/h;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14844b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricsInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: fx0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.metrics.DataSyncServiceMetrics", m100430f = "DataSyncServiceMetrics.kt", m100431l = {43, 44, 60, 76, 92}, m100432m = "sendDataSyncMetric", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f55326E;

        /* JADX INFO: renamed from: F */
        int f55327F;

        /* JADX INFO: renamed from: G */
        boolean f55328G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f55329H;

        /* JADX INFO: renamed from: J */
        int f55331J;

        /* JADX INFO: renamed from: w */
        Object f55332w;

        /* JADX INFO: renamed from: x */
        Object f55333x;

        /* JADX INFO: renamed from: y */
        Object f55334y;

        /* JADX INFO: renamed from: z */
        Object f55335z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55329H = obj;
            this.f55331J |= Integer.MIN_VALUE;
            return C14844b.this.m42719a(null, this);
        }
    }

    public C14844b(InterfaceC21030c metricsInteractor, InterfaceC4368h rawDataTrackingService) {
        AbstractC22676k.m65750j(metricsInteractor, "metricsInteractor");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        this.metricsInteractor = metricsInteractor;
        this.rawDataTrackingService = rawDataTrackingService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ff, code lost:
    
        if (r2.mo58700a(r6, r3) == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0136, code lost:
    
        if (r1.mo58700a(r12, r3) == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0170, code lost:
    
        if (r1.mo58700a(r12, r3) == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a5, code lost:
    
        if (r1.mo58700a(r12, r3) == r4) goto L44;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m42719a(fx0.InterfaceC14843a r21, q83.InterfaceC30057d<? super l83.C23454a0> r22) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fx0.C14844b.m42719a(fx0.a, q83.d):java.lang.Object");
    }
}
