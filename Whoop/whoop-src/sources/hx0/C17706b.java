package hx0;

import android.content.SharedPreferences;
import com.whoop.dataSyncService.retrofit.DataSyncApi;
import com.whoop.researchPacket.api.ResearchMetricsApi;
import cu0.C11113a;
import cu0.InterfaceC11114b;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ix0.InterfaceC21012a;
import ix0.InterfaceC21015d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import js0.AbstractC21909c;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import org.joda.time.DateTimeConstants;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import y82.EnumC39339b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: hx0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\u0010\n\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0001,BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010 \u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001dH\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+H\u0096@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010A¨\u0006C"}, m65681d2 = {"Lhx0/b;", "Lhx0/e;", "Ltr2/n;", "logger", "Lcom/whoop/dataSyncService/retrofit/DataSyncApi;", "dataSyncApi", "Lcom/whoop/researchPacket/api/ResearchMetricsApi;", "researchMetricsApi", "Lcu0/b;", "rawDataRepository", "Ljs0/c;", "configurationRepository", "Lfi0/a;", "baseAnalytics", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lzr2/a;", "dateAndTimeProvider", "Lix0/d;", "rev2RawDataUploader", "Lix0/a;", "dataSettingsUploader", "<init>", "(Ltr2/n;Lcom/whoop/dataSyncService/retrofit/DataSyncApi;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Lcu0/b;Ljs0/c;Lfi0/a;Landroid/content/SharedPreferences;Lzr2/a;Lix0/d;Lix0/a;)V", "Lcu0/a;", "metadata", "", "k", "(Lcu0/a;Lq83/d;)Ljava/lang/Object;", "", "Lud3/v0;", "requestBodyList", "j", "(Ljava/util/List;Lcu0/a;Lq83/d;)Ljava/lang/Object;", "", "", "i", "(Lcu0/a;)Ljava/util/Map;", "Lhx0/f;", "uploadInfo", "Ll83/a0;", "l", "(Ljava/util/List;)V", "Lic/u;", "a", "(Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "b", "Lcom/whoop/dataSyncService/retrofit/DataSyncApi;", "c", "Lcom/whoop/researchPacket/api/ResearchMetricsApi;", "d", "Lcu0/b;", "e", "Ljs0/c;", "f", "Lfi0/a;", "g", "Landroid/content/SharedPreferences;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lzr2/a;", "Lix0/d;", "Lix0/a;", "", "", "Ljava/util/Set;", "revisionsToUpload", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17706b implements InterfaceC17709e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DataSyncApi dataSyncApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ResearchMetricsApi researchMetricsApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC11114b rawDataRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC21015d rev2RawDataUploader;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC21012a dataSettingsUploader;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Set<Short> revisionsToUpload;

    /* JADX INFO: renamed from: hx0.b$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.NewRawDataUploaderImpl", m100430f = "NewRawDataUploaderImpl.kt", m100431l = {122}, m100432m = "makeApiCall", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f68791E;

        /* JADX INFO: renamed from: G */
        int f68793G;

        /* JADX INFO: renamed from: w */
        Object f68794w;

        /* JADX INFO: renamed from: x */
        Object f68795x;

        /* JADX INFO: renamed from: y */
        Object f68796y;

        /* JADX INFO: renamed from: z */
        Object f68797z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68791E = obj;
            this.f68793G |= Integer.MIN_VALUE;
            return C17706b.this.m50691j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: hx0.b$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.NewRawDataUploaderImpl$makeApiCall$response$1", m100430f = "NewRawDataUploaderImpl.kt", m100431l = {124, 125, 126}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f68798w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11113a f68799x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17706b f68800y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC34846v0 f68801z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C11113a c11113a, C17706b c17706b, AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f68799x = c11113a;
            this.f68800y = c17706b;
            this.f68801z = abstractC34846v0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f68799x, this.f68800y, this.f68801z, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        
            if (r6 == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            if (r6 == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
        
            if (r6 == r0) goto L28;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f68798w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L86
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L6a
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L4a
            L24:
                p505ts.AbstractC34132o.m107864I(r6)
                cu0.a r6 = r5.f68799x
                short r6 = r6.getRevision()
                r1 = 20
                if (r6 != r1) goto L4d
                hx0.b r6 = r5.f68800y
                com.whoop.researchPacket.api.ResearchMetricsApi r6 = hx0.C17706b.m50687f(r6)
                ud3.v0 r1 = r5.f68801z
                hx0.b r2 = r5.f68800y
                cu0.a r3 = r5.f68799x
                java.util.Map r2 = hx0.C17706b.m50685d(r2, r3)
                r5.f68798w = r4
                java.lang.Object r6 = r6.uploadR20RawData(r1, r2, r5)
                if (r6 != r0) goto L4a
                goto L85
            L4a:
                pg3.v0 r6 = (pg3.C29218v0) r6
                return r6
            L4d:
                r1 = 21
                if (r6 != r1) goto L6d
                hx0.b r6 = r5.f68800y
                com.whoop.researchPacket.api.ResearchMetricsApi r6 = hx0.C17706b.m50687f(r6)
                ud3.v0 r1 = r5.f68801z
                hx0.b r2 = r5.f68800y
                cu0.a r4 = r5.f68799x
                java.util.Map r2 = hx0.C17706b.m50685d(r2, r4)
                r5.f68798w = r3
                java.lang.Object r6 = r6.uploadR21RawData(r1, r2, r5)
                if (r6 != r0) goto L6a
                goto L85
            L6a:
                pg3.v0 r6 = (pg3.C29218v0) r6
                return r6
            L6d:
                hx0.b r6 = r5.f68800y
                com.whoop.dataSyncService.retrofit.DataSyncApi r6 = hx0.C17706b.m50686e(r6)
                ud3.v0 r1 = r5.f68801z
                hx0.b r3 = r5.f68800y
                cu0.a r4 = r5.f68799x
                java.util.Map r3 = hx0.C17706b.m50685d(r3, r4)
                r5.f68798w = r2
                java.lang.Object r6 = r6.uploadRawData(r1, r3, r5)
                if (r6 != r0) goto L86
            L85:
                return r0
            L86:
                pg3.v0 r6 = (pg3.C29218v0) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hx0.C17706b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: hx0.b$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.NewRawDataUploaderImpl", m100430f = "NewRawDataUploaderImpl.kt", m100431l = {95, 108, 110}, m100432m = "processRawData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f68802E;

        /* JADX INFO: renamed from: F */
        Object f68803F;

        /* JADX INFO: renamed from: G */
        Object f68804G;

        /* JADX INFO: renamed from: H */
        int f68805H;

        /* JADX INFO: renamed from: I */
        int f68806I;

        /* JADX INFO: renamed from: J */
        int f68807J;

        /* JADX INFO: renamed from: K */
        int f68808K;

        /* JADX INFO: renamed from: L */
        int f68809L;

        /* JADX INFO: renamed from: M */
        boolean f68810M;

        /* JADX INFO: renamed from: N */
        /* synthetic */ Object f68811N;

        /* JADX INFO: renamed from: P */
        int f68813P;

        /* JADX INFO: renamed from: w */
        Object f68814w;

        /* JADX INFO: renamed from: x */
        Object f68815x;

        /* JADX INFO: renamed from: y */
        Object f68816y;

        /* JADX INFO: renamed from: z */
        Object f68817z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68811N = obj;
            this.f68813P |= Integer.MIN_VALUE;
            return C17706b.this.m50692k(null, this);
        }
    }

    /* JADX INFO: renamed from: hx0.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.NewRawDataUploaderImpl", m100430f = "NewRawDataUploaderImpl.kt", m100431l = {63, 65, 78, 79}, m100432m = "uploadRawData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f68818E;

        /* JADX INFO: renamed from: F */
        Object f68819F;

        /* JADX INFO: renamed from: G */
        Object f68820G;

        /* JADX INFO: renamed from: H */
        Object f68821H;

        /* JADX INFO: renamed from: I */
        Object f68822I;

        /* JADX INFO: renamed from: J */
        Object f68823J;

        /* JADX INFO: renamed from: K */
        Object f68824K;

        /* JADX INFO: renamed from: L */
        int f68825L;

        /* JADX INFO: renamed from: M */
        int f68826M;

        /* JADX INFO: renamed from: N */
        int f68827N;

        /* JADX INFO: renamed from: O */
        int f68828O;

        /* JADX INFO: renamed from: P */
        int f68829P;

        /* JADX INFO: renamed from: Q */
        short f68830Q;

        /* JADX INFO: renamed from: R */
        /* synthetic */ Object f68831R;

        /* JADX INFO: renamed from: T */
        int f68833T;

        /* JADX INFO: renamed from: w */
        Object f68834w;

        /* JADX INFO: renamed from: x */
        Object f68835x;

        /* JADX INFO: renamed from: y */
        Object f68836y;

        /* JADX INFO: renamed from: z */
        Object f68837z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68831R = obj;
            this.f68833T |= Integer.MIN_VALUE;
            return C17706b.this.mo50696a(this);
        }
    }

    public C17706b(InterfaceC34116n logger, DataSyncApi dataSyncApi, ResearchMetricsApi researchMetricsApi, InterfaceC11114b rawDataRepository, AbstractC21909c configurationRepository, InterfaceC14515a baseAnalytics, SharedPreferences sharedPreferences, InterfaceC41070a dateAndTimeProvider, InterfaceC21015d rev2RawDataUploader, InterfaceC21012a dataSettingsUploader) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dataSyncApi, "dataSyncApi");
        AbstractC22676k.m65750j(researchMetricsApi, "researchMetricsApi");
        AbstractC22676k.m65750j(rawDataRepository, "rawDataRepository");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(rev2RawDataUploader, "rev2RawDataUploader");
        AbstractC22676k.m65750j(dataSettingsUploader, "dataSettingsUploader");
        this.logger = logger;
        this.dataSyncApi = dataSyncApi;
        this.researchMetricsApi = researchMetricsApi;
        this.rawDataRepository = rawDataRepository;
        this.configurationRepository = configurationRepository;
        this.baseAnalytics = baseAnalytics;
        this.sharedPreferences = sharedPreferences;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.rev2RawDataUploader = rev2RawDataUploader;
        this.dataSettingsUploader = dataSettingsUploader;
        this.revisionsToUpload = AbstractC25260n.m74059b1(new Short[]{7, 10, 11, 20, 21});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Map<String, String> m50690i(C11113a metadata) {
        return AbstractC25247g0.m73990Y(new C23465k("Content-Encoding", "gzip"), new C23465k("X-WHOOP-HW-VERSION", metadata.getHardwareVersion()), new C23465k("X-WHOOP-FW-Version", metadata.getMaximVersion()), new C23465k("X-WHOOP-DSP-Version", metadata.getDspVersion()), new C23465k("X-WHOOP-Strap-Id", metadata.getStrapId()), new C23465k("X-WHOOP-Binary-Version", String.valueOf(metadata.getBinaryVersion())), new C23465k("X-WHOOP-Binary-Flags", String.valueOf(metadata.getBinaryFlags())), new C23465k("X-WHOOP-Raw-Binary-Version", metadata.getRawDataVersion()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007b -> B:20:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public final java.lang.Object m50691j(java.util.List<? extends ud3.AbstractC34846v0> r13, cu0.C11113a r14, q83.InterfaceC30057d<? super java.lang.Boolean> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof hx0.C17706b.b
            if (r0 == 0) goto L13
            r0 = r15
            hx0.b$b r0 = (hx0.C17706b.b) r0
            int r1 = r0.f68793G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68793G = r1
            goto L18
        L13:
            hx0.b$b r0 = new hx0.b$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f68791E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f68793G
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r13 = r0.f68797z
            ud3.v0 r13 = (ud3.AbstractC34846v0) r13
            java.lang.Object r13 = r0.f68796y
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r0.f68795x
            cu0.a r14 = (cu0.C11113a) r14
            java.lang.Object r2 = r0.f68794w
            java.util.List r2 = (java.util.List) r2
            p505ts.AbstractC34132o.m107864I(r15)
            r9 = r0
            goto L7e
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            p505ts.AbstractC34132o.m107864I(r15)
            java.util.Iterator r13 = r13.iterator()
            r9 = r0
        L48:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L9d
            java.lang.Object r15 = r13.next()
            ud3.v0 r15 = (ud3.AbstractC34846v0) r15
            u02.a$a r4 = u02.InterfaceC34385a.INSTANCE
            tr2.n r5 = r12.logger
            java.lang.String r0 = r14.getRawDataVersion()
            java.lang.String r2 = "Something went wrong uploading "
            java.lang.String r6 = " packets"
            java.lang.String r7 = p088dc.AbstractC11895b.m31996o(r2, r0, r6)
            hx0.b$c r8 = new hx0.b$c
            r0 = 0
            r8.<init>(r14, r12, r15, r0)
            r9.f68794w = r0
            r9.f68795x = r14
            r9.f68796y = r13
            r9.f68797z = r0
            r9.f68793G = r3
            r6 = 0
            r10 = 2
            r11 = 0
            java.lang.Object r15 = u02.InterfaceC34385a.Companion.m108729b(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r15 != r1) goto L7e
            return r1
        L7e:
            u02.a r15 = (u02.InterfaceC34385a) r15
            boolean r0 = r15 instanceof u02.InterfaceC34385a.b
            if (r0 == 0) goto L48
            tr2.n r13 = r12.logger
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Response - "
            r14.<init>(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r15 = 0
            qr2.a$a[] r15 = new qr2.AbstractC30556a.a[r15]
            r13.mo85222m(r14, r15)
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L9d:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: hx0.C17706b.m50691j(java.util.List, cu0.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:107:0x02db  */
    /* JADX WARN: Code duplicated, block: B:111:0x032b  */
    /* JADX WARN: Code duplicated, block: B:114:0x033c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0364  */
    /* JADX WARN: Code duplicated, block: B:119:0x038f  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0200  */
    /* JADX WARN: Code duplicated, block: B:70:0x020a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0212  */
    /* JADX WARN: Code duplicated, block: B:73:0x0217  */
    /* JADX WARN: Code duplicated, block: B:75:0x0221  */
    /* JADX WARN: Code duplicated, block: B:77:0x0229  */
    /* JADX WARN: Code duplicated, block: B:78:0x022e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0238  */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:83:0x0245  */
    /* JADX WARN: Code duplicated, block: B:85:0x024f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0254  */
    /* JADX WARN: Code duplicated, block: B:89:0x0259  */
    /* JADX WARN: Code duplicated, block: B:91:0x025d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0289  */
    /* JADX WARN: Code duplicated, block: B:94:0x028e  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0364 -> B:118:0x036f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: k */
    public final java.lang.Object m50692k(cu0.C11113a r27, q83.InterfaceC30057d<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx0.C17706b.m50692k(cu0.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: l */
    private final void m50693l(List<C17710f> uploadInfo) {
        long j7 = this.sharedPreferences.getLong("raw-data-upload-last-attempt", 0L);
        if (j7 != 0) {
            Map mapM95645u = AbstractC31061c.m95645u("Frequency", String.valueOf((this.dateAndTimeProvider.mo133363b() - j7) / ((long) DateTimeConstants.MILLIS_PER_MINUTE)));
            List<C17710f> list = uploadInfo;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (C17710f c17710f : list) {
                linkedHashMap.put(AbstractC2875y.m8299l(c17710f.getRevision(), " Upload Status"), c17710f.getUploadSuccess() ? EnumC39339b.RESULT_SUCCESS : "Fail");
            }
            this.baseAnalytics.mo41428k("Connectivity", null, null, "Upload Raw Packets to API", AbstractC25247g0.m73995d0(mapM95645u, linkedHashMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final CharSequence m50694m(C17710f it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getRevision() + " status: " + it.getUploadSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final CharSequence m50695n(C17710f it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getRevision() + " status: " + it.getUploadSuccess();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0119  */
    /* JADX WARN: Code duplicated, block: B:29:0x0127  */
    /* JADX WARN: Code duplicated, block: B:32:0x0154  */
    /* JADX WARN: Code duplicated, block: B:37:0x016f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0154 -> B:33:0x0159). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x016a -> B:34:0x0164). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // hx0.InterfaceC17709e
    /* JADX INFO: renamed from: a */
    public java.lang.Object mo50696a(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r19) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx0.C17706b.mo50696a(q83.d):java.lang.Object");
    }
}
