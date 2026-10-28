package rd1;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import iy1.InterfaceC21030c;
import java.time.Instant;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: rd1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lrd1/a;", "", "Ltr2/n;", "logger", "Liy1/c;", "metricsInteractor", "Lbc3/c0;", "coroutineScope", "Lz92/a;", "userInfoAccessor", "Lca2/h;", "rawDataTrackingService", "<init>", "(Ltr2/n;Liy1/c;Lbc3/c0;Lz92/a;Lca2/h;)V", "", "oldestPacketTimeMillis", "Ljava/time/Instant;", "nowInstant", "Ll83/a0;", "e", "(JLjava/time/Instant;)V", "a", "Ltr2/n;", "b", "Liy1/c;", "c", "Lbc3/c0;", "d", "Lz92/a;", "Lca2/h;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31242a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricsInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: rd1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.domain.heartdata.AppBacklogTracker$sendAppBacklogMetricsToDataDog$1", m100430f = "AppBacklogTracker.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER, 30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f128664E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Instant f128666G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ long f128667H;

        /* JADX INFO: renamed from: w */
        int f128668w;

        /* JADX INFO: renamed from: x */
        boolean f128669x;

        /* JADX INFO: renamed from: y */
        Object f128670y;

        /* JADX INFO: renamed from: z */
        Object f128671z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Instant instant, long j7, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128666G = instant;
            this.f128667H = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31242a.this.new a(this.f128666G, this.f128667H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
        
            if (r1.mo58700a(r6, r14) == r0) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v7, types: [int] */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rd1.C31242a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C31242a(InterfaceC34116n logger, InterfaceC21030c metricsInteractor, InterfaceC2994c0 coroutineScope, InterfaceC40205a userInfoAccessor, InterfaceC4368h rawDataTrackingService) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(metricsInteractor, "metricsInteractor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        this.logger = logger;
        this.metricsInteractor = metricsInteractor;
        this.coroutineScope = coroutineScope;
        this.userInfoAccessor = userInfoAccessor;
        this.rawDataTrackingService = rawDataTrackingService;
    }

    /* JADX INFO: renamed from: e */
    public final void m96207e(long oldestPacketTimeMillis, Instant nowInstant) {
        AbstractC22676k.m65750j(nowInstant, "nowInstant");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(nowInstant, oldestPacketTimeMillis, null), 3);
    }
}
