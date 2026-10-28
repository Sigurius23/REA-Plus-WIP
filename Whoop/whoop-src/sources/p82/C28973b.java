package p82;

import androidx.room.AbstractC1772c1;
import bi2.InterfaceC3287c;
import bi2.InterfaceC3288d;
import c93.InterfaceC4351m;
import ca2.InterfaceC4371k;
import com.whoop.domain.model.MetricsProcessedTime;
import com.whoop.sensorDataUpload.retrofit.SensorDataApi;
import dt0.C12360c;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.time.Instant;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r82.C31070a;
import r83.EnumC31071a;
import rd1.C31242a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34834p0;
import ud3.C34844u0;
import wp0.C37496a;
import yb3.C39412p;
import yh2.C39543b;

/* JADX INFO: renamed from: p82.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102¨\u00063"}, m65681d2 = {"Lp82/b;", "", "Ltr2/n;", "logger", "Lbi2/d;", "heartDataStore", "Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;", "sensorDataApi", "Lca2/k;", "smartAlarmSyncAttemptListener", "Lwp0/a;", "gzipRequestBody", "Lrd1/a;", "appBacklogTracker", "Lr82/a;", "throughputTracker", "Lp82/a;", "processNowAnalyticsReporter", "<init>", "(Ltr2/n;Lbi2/d;Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;Lca2/k;Lwp0/a;Lrd1/a;Lr82/a;Lp82/a;)V", "Lbi2/c;", "heartDataRoomResult", "Lp82/c;", "g", "(Lbi2/c;Lq83/d;)Ljava/lang/Object;", "Lyh2/b;", "exportedHeartData", "j", "(Lyh2/b;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()V", "Ldt0/c;", "eventMetaData", "Lec3/l;", "i", "(Ldt0/c;)Lec3/l;", "a", "Ltr2/n;", "b", "Lbi2/d;", "c", "Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;", "d", "Lca2/k;", "e", "Lwp0/a;", "f", "Lrd1/a;", "Lr82/a;", "Lp82/a;", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28973b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC3288d heartDataStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SensorDataApi sensorDataApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4371k smartAlarmSyncAttemptListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37496a gzipRequestBody;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C31242a appBacklogTracker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C31070a throughputTracker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C28972a processNowAnalyticsReporter;

    /* JADX INFO: renamed from: p82.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.sensorDataUpload.SensorDataUploadInteractor$upload$1", m100430f = "SensorDataUploadInteractor.kt", m100431l = {36, 38, 39, 41, 47, 47, 49, 54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lp82/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f117186E;

        /* JADX INFO: renamed from: F */
        int f117187F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f117188G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C12360c f117189H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C28973b f117190I;

        /* JADX INFO: renamed from: w */
        Object f117191w;

        /* JADX INFO: renamed from: x */
        Object f117192x;

        /* JADX INFO: renamed from: y */
        Object f117193y;

        /* JADX INFO: renamed from: z */
        int f117194z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C12360c c12360c, C28973b c28973b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117189H = c12360c;
            this.f117190I = c28973b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f117189H, this.f117190I, interfaceC30057d);
            aVar.f117188G = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:38:0x0128 A[PHI: r2 r6 r7 r8 r13
          0x0128: PHI (r2v17 int) = (r2v13 int), (r2v18 int) binds: [B:9:0x0042, B:36:0x0125] A[DONT_GENERATE, DONT_INLINE]
          0x0128: PHI (r6v11 int) = (r6v8 int), (r6v12 int) binds: [B:9:0x0042, B:36:0x0125] A[DONT_GENERATE, DONT_INLINE]
          0x0128: PHI (r7v9 p82.b) = (r7v2 p82.b), (r7v12 p82.b) binds: [B:9:0x0042, B:36:0x0125] A[DONT_GENERATE, DONT_INLINE]
          0x0128: PHI (r8v9 bi2.c) = (r8v6 bi2.c), (r8v10 bi2.c) binds: [B:9:0x0042, B:36:0x0125] A[DONT_GENERATE, DONT_INLINE]
          0x0128: PHI (r13v30 java.lang.Object) = (r13v0 java.lang.Object), (r13v37 java.lang.Object) binds: [B:9:0x0042, B:36:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x0140 A[PHI: r2 r6 r8 r13
          0x0140: PHI (r2v16 int) = (r2v14 int), (r2v17 int) binds: [B:8:0x0030, B:39:0x013d] A[DONT_GENERATE, DONT_INLINE]
          0x0140: PHI (r6v10 int) = (r6v9 int), (r6v11 int) binds: [B:8:0x0030, B:39:0x013d] A[DONT_GENERATE, DONT_INLINE]
          0x0140: PHI (r8v8 bi2.c) = (r8v7 bi2.c), (r8v9 bi2.c) binds: [B:8:0x0030, B:39:0x013d] A[DONT_GENERATE, DONT_INLINE]
          0x0140: PHI (r13v26 java.lang.Object) = (r13v0 java.lang.Object), (r13v32 java.lang.Object) binds: [B:8:0x0030, B:39:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x0147  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0145 -> B:46:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0158 -> B:46:0x015b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 398
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p82.C28973b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: p82.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.sensorDataUpload.SensorDataUploadInteractor", m100430f = "SensorDataUploadInteractor.kt", m100431l = {76, 94, 95}, m100432m = "uploadSensorData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f117195E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f117196F;

        /* JADX INFO: renamed from: H */
        int f117198H;

        /* JADX INFO: renamed from: w */
        Object f117199w;

        /* JADX INFO: renamed from: x */
        Object f117200x;

        /* JADX INFO: renamed from: y */
        Object f117201y;

        /* JADX INFO: renamed from: z */
        Object f117202z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117196F = obj;
            this.f117198H |= Integer.MIN_VALUE;
            return C28973b.this.m87999j(null, this);
        }
    }

    /* JADX INFO: renamed from: p82.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.sensorDataUpload.SensorDataUploadInteractor$uploadSensorData$response$1", m100430f = "SensorDataUploadInteractor.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/domain/model/MetricsProcessedTime;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f117203w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34846v0 f117205y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C39543b f117206z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC34846v0 abstractC34846v0, C39543b c39543b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f117205y = abstractC34846v0;
            this.f117206z = c39543b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28973b.this.new c(this.f117205y, this.f117206z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117203w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SensorDataApi sensorDataApi = C28973b.this.sensorDataApi;
            AbstractC34846v0 abstractC34846v0 = this.f117205y;
            String strM84332d = this.f117206z.getHistoryHeartDataVersion().m84345f().m84332d();
            String strMo84319a = this.f117206z.getHistoryHeartDataVersion().m84344e().mo84319a();
            String strM84360f = this.f117206z.getHistoryHeartDataVersion().m84346g().m84360f();
            AbstractC22676k.m65749i(strM84360f, "toSemanticVersionString(...)");
            String strM84347h = this.f117206z.getHistoryHeartDataVersion().m84347h();
            AbstractC22676k.m65749i(strM84347h, "getStrapId(...)");
            byte bM84343d = this.f117206z.getHistoryHeartDataVersion().m84343d();
            byte bM84342c = this.f117206z.getHistoryHeartDataVersion().m84342c();
            this.f117203w = 1;
            Object objUploadMetricsData = sensorDataApi.uploadMetricsData(abstractC34846v0, "gzip", strM84332d, strMo84319a, strM84360f, strM84347h, bM84343d, bM84342c, this);
            return objUploadMetricsData == enumC31071a ? enumC31071a : objUploadMetricsData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MetricsProcessedTime> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C28973b(InterfaceC34116n logger, InterfaceC3288d heartDataStore, SensorDataApi sensorDataApi, InterfaceC4371k smartAlarmSyncAttemptListener, C37496a gzipRequestBody, C31242a appBacklogTracker, C31070a throughputTracker, C28972a processNowAnalyticsReporter) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(heartDataStore, "heartDataStore");
        AbstractC22676k.m65750j(sensorDataApi, "sensorDataApi");
        AbstractC22676k.m65750j(smartAlarmSyncAttemptListener, "smartAlarmSyncAttemptListener");
        AbstractC22676k.m65750j(gzipRequestBody, "gzipRequestBody");
        AbstractC22676k.m65750j(appBacklogTracker, "appBacklogTracker");
        AbstractC22676k.m65750j(throughputTracker, "throughputTracker");
        AbstractC22676k.m65750j(processNowAnalyticsReporter, "processNowAnalyticsReporter");
        this.logger = logger;
        this.heartDataStore = heartDataStore;
        this.sensorDataApi = sensorDataApi;
        this.smartAlarmSyncAttemptListener = smartAlarmSyncAttemptListener;
        this.gzipRequestBody = gzipRequestBody;
        this.appBacklogTracker = appBacklogTracker;
        this.throughputTracker = throughputTracker;
        this.processNowAnalyticsReporter = processNowAnalyticsReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final Object m87997g(InterfaceC3287c interfaceC3287c, InterfaceC30057d<? super InterfaceC28974c> interfaceC30057d) {
        if (interfaceC3287c instanceof InterfaceC3287c.a) {
            return m87999j(((InterfaceC3287c.a) interfaceC3287c).getExportedHeartData(), interfaceC30057d);
        }
        if (interfaceC3287c instanceof InterfaceC3287c.c) {
            return m87999j(((InterfaceC3287c.c) interfaceC3287c).getExportedHeartData(), interfaceC30057d);
        }
        if (interfaceC3287c instanceof InterfaceC3287c.b) {
            return new InterfaceC28974c.b(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m87998h() {
        try {
            this.logger.mo85232x("WakeWindow", "SmartAlarm poll check triggered", new AbstractC30556a.a[0]);
            this.smartAlarmSyncAttemptListener.onSyncAttempted();
        } catch (Exception e5) {
            this.logger.mo85215f("WakeWindow", "SmartAlarm poll failed", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x015e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: j */
    public final Object m87999j(C39543b c39543b, InterfaceC30057d<? super InterfaceC28974c> interfaceC30057d) {
        b bVar;
        C31070a.b bVarM95718h;
        Object objM108729b;
        C39543b c39543b2;
        InterfaceC34385a interfaceC34385a;
        InterfaceC3288d interfaceC3288d;
        C39543b c39543b3;
        C39543b c39543b4 = c39543b;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f117198H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f117198H = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f117196F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f117198H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.logger.mo85216g("Uploading Processed Sensor Data: " + c39543b4, new AbstractC30556a.a[0]);
            C31242a c31242a = this.appBacklogTracker;
            long oldestTimestamp = c39543b4.getOldestTimestamp();
            Instant instantNow = Instant.now();
            AbstractC22676k.m65749i(instantNow, "now(...)");
            c31242a.m96207e(oldestTimestamp, instantNow);
            bVarM95718h = this.throughputTracker.m95718h(c39543b4.getExportedFile());
            C34844u0 c34844u0 = AbstractC34846v0.Companion;
            File exportedFile = c39543b4.getExportedFile();
            C39412p c39412p = C34818h0.f146589e;
            C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J(DfuBaseService.MIME_TYPE_OCTET_STREAM);
            c34844u0.getClass();
            C34834p0 c34834p0M109924a = C34844u0.m109924a(exportedFile, c34818h0M5373J);
            this.logger.mo85216g(AbstractC31061c.m95636l(c34834p0M109924a.f146719b.length(), "Upload body size: ", " bytes"), new AbstractC30556a.a[0]);
            AbstractC34846v0 abstractC34846v0M120179a = this.gzipRequestBody.m120179a(c34834p0M109924a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(abstractC34846v0M120179a, c39543b4, null);
            bVar2.f117199w = c39543b4;
            bVar2.f117200x = bVarM95718h;
            bVar2.f117201y = null;
            bVar2.f117202z = null;
            bVar2.f117198H = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            C31070a.b bVar3 = (C31070a.b) bVar2.f117200x;
            C39543b c39543b5 = (C39543b) bVar2.f117199w;
            AbstractC34132o.m107864I(obj);
            bVarM95718h = bVar3;
            c39543b4 = c39543b5;
            objM108729b = obj;
        } else {
            if (i14 == 2) {
                interfaceC34385a = (InterfaceC34385a) bVar2.f117195E;
                c39543b2 = (C39543b) bVar2.f117199w;
                AbstractC34132o.m107864I(obj);
                interfaceC3288d = this.heartDataStore;
                bVar2.f117199w = c39543b2;
                bVar2.f117200x = null;
                bVar2.f117201y = null;
                bVar2.f117202z = null;
                bVar2.f117195E = interfaceC34385a;
                bVar2.f117198H = 3;
                if (interfaceC3288d.mo9572e(c39543b2, bVar2) != enumC31071a) {
                    c39543b3 = c39543b2;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC34385a = (InterfaceC34385a) bVar2.f117195E;
            c39543b3 = (C39543b) bVar2.f117199w;
            AbstractC34132o.m107864I(obj);
        }
        return new InterfaceC28974c.a(c39543b3, (MetricsProcessedTime) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        this.throughputTracker.m95717e(bVarM95718h);
        if (!(interfaceC34385a2 instanceof InterfaceC34385a.c)) {
            this.logger.mo85222m("uploadMetricsData error : " + interfaceC34385a2, new AbstractC30556a.a[0]);
            return new InterfaceC28974c.b(c39543b4);
        }
        this.logger.mo85216g(AbstractC25012a.m73375h(((InterfaceC34385a.c) interfaceC34385a2).m108735a(), "uploadMetricsData response : "), new AbstractC30556a.a[0]);
        C28972a c28972a = this.processNowAnalyticsReporter;
        long newestTimestamp = c39543b4.getNewestTimestamp();
        bVar2.f117199w = c39543b4;
        bVar2.f117200x = null;
        bVar2.f117201y = null;
        bVar2.f117202z = null;
        bVar2.f117195E = interfaceC34385a2;
        bVar2.f117198H = 2;
        if (c28972a.m87990a(newestTimestamp, bVar2) != enumC31071a) {
            c39543b2 = c39543b4;
            interfaceC34385a = interfaceC34385a2;
            interfaceC3288d = this.heartDataStore;
            bVar2.f117199w = c39543b2;
            bVar2.f117200x = null;
            bVar2.f117201y = null;
            bVar2.f117202z = null;
            bVar2.f117195E = interfaceC34385a;
            bVar2.f117198H = 3;
            if (interfaceC3288d.mo9572e(c39543b2, bVar2) != enumC31071a) {
                c39543b3 = c39543b2;
                return new InterfaceC28974c.a(c39543b3, (MetricsProcessedTime) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m88000i(C12360c eventMetaData) {
        AbstractC22676k.m65750j(eventMetaData, "eventMetaData");
        return new C13084s1(new a(eventMetaData, this, null));
    }
}
