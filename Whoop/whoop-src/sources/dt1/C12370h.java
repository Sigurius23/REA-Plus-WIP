package dt1;

import android.database.sqlite.SQLiteException;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.data.remote.commons.Resource;
import com.whoop.labrador.feature.details.domain.DeleteRequest;
import com.whoop.labrador.feature.details.domain.GetLabradorDetailsRequest;
import com.whoop.labrador.feature.details.domain.UpdateSymptomsRequest;
import com.whoop.labrador.feature.details.domain.UploadSymptomsRequest;
import com.whoop.labrador.feature.details.domain.model.DomainMapperKt;
import com.whoop.labrador.feature.details.domain.model.LabradorDetailsDomainHolder;
import com.whoop.labrador.feature.details.domain.model.LabradorDetailsResponse;
import com.whoop.labrador.feature.reading.domain.models.LabradorDetailsSymptomsAndNotesUpdateRequest;
import com.whoop.labrador.feature.reading.domain.models.LabradorReadingSymptomsUpdateRequest;
import com.whoop.network.exception.DomainException;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import fu1.InterfaceC14783b;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.io.File;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28144a0;
import p007a6.C0456u;
import p218ic.AbstractC18377p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qk1.C30443a;
import qk1.InterfaceC30444b;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import ss1.C32948a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;
import xm0.C38458b;

/* JADX INFO: renamed from: dt1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\b\u0012\u0004\u0012\u00020#0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J;\u00100\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010'\u001a\u00020&2\u0006\u0010,\u001a\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020&0-2\u0006\u0010/\u001a\u00020&H\u0002¢\u0006\u0004\b0\u00101J3\u00102\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010,\u001a\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020&0-2\u0006\u0010/\u001a\u00020&H\u0002¢\u0006\u0004\b2\u00103J;\u00104\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010'\u001a\u00020&2\u0006\u0010,\u001a\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020&0-2\u0006\u0010/\u001a\u00020&H\u0002¢\u0006\u0004\b4\u00101J'\u00105\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010,\u001a\u00020+2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b9\u00108J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020(0 H\u0082@¢\u0006\u0004\b:\u0010;J\u0012\u0010=\u001a\u0004\u0018\u00010<H\u0082@¢\u0006\u0004\b=\u0010;J\u0018\u0010?\u001a\u00020(2\u0006\u0010>\u001a\u00020<H\u0082@¢\u0006\u0004\b?\u0010@J\u0018\u0010C\u001a\u00020A2\u0006\u0010B\u001a\u00020AH\u0082@¢\u0006\u0004\bC\u0010DJ\"\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010F\u001a\u00020E2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\bH\u0010IJ\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020E0K2\u0006\u0010J\u001a\u00020&H\u0082@¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006j"}, m65681d2 = {"Ldt1/h;", "", "Lnm0/e;", "cachedApiSource", "Lu02/c;", "apiClient", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "fileDownloaderApi", "Lqk1/b;", "dao", "Lxm0/b;", "cacheUpdater", "Ltr2/n;", "logger", "Lss1/a;", "analytics", "Ljava/time/ZoneId;", "zone", "Lci2/b;", "whoopStrapProvider", "Lic/p0;", "workManager", "Lor2/a0;", "fileManager", "Lq83/j;", "ioContext", "Lfu1/b;", "labradorService", "Ljava/time/format/DateTimeFormatter;", "customFormatter", "<init>", "(Lnm0/e;Lu02/c;Lcom/whoop/data/remote/api/FileDownloaderApi;Lqk1/b;Lxm0/b;Ltr2/n;Lss1/a;Ljava/time/ZoneId;Lci2/b;Lic/p0;Lor2/a0;Lq83/j;Lfu1/b;Ljava/time/format/DateTimeFormatter;)V", "Lec3/l;", "Ldt1/e;", "upstream", "Ldt1/g;", "y", "(Lec3/l;)Lec3/l;", "", "id", "Ldt1/b;", "x", "(Ljava/lang/String;)Lec3/l;", "Ljava/time/Instant;", "timestamp", "", "symptoms", "notes", "B", "(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;", "D", "(Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;", "C", "r", "(Ljava/time/Instant;Ljava/lang/String;)Lec3/l;", "s", "(Ljava/time/Instant;)Lec3/l;", "t", "A", "(Lq83/d;)Ljava/lang/Object;", "Lqk1/a;", "v", "reading", "u", "(Lqk1/a;Lq83/d;)Ljava/lang/Object;", "Ldt1/g$g;", "loadedState", "q", "(Ldt1/g$g;Lq83/d;)Ljava/lang/Object;", "Lud3/a1;", "rawData", "Ljava/io/File;", "z", "(Lud3/a1;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "healthReportUrl", "Lcom/whoop/data/remote/commons/Resource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lnm0/e;", "b", "Lu02/c;", "c", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "d", "Lqk1/b;", "e", "Lxm0/b;", "f", "Ltr2/n;", "g", "Lss1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/time/ZoneId;", "i", "Lci2/b;", "j", "Lic/p0;", "k", "Lor2/a0;", "l", "Lq83/j;", "m", "Lfu1/b;", "n", "Ljava/time/format/DateTimeFormatter;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12370h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FileDownloaderApi fileDownloaderApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC30444b dao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C32948a analytics;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ZoneId zone;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C28144a0 fileManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC14783b labradorService;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final DateTimeFormatter customFormatter;

    /* JADX INFO: renamed from: dt1.h$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor", m100430f = "LabradorDetailsInteractor.kt", m100431l = {363, 366}, m100432m = "applyPdfPath", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f41634E;

        /* JADX INFO: renamed from: G */
        int f41636G;

        /* JADX INFO: renamed from: w */
        Object f41637w;

        /* JADX INFO: renamed from: x */
        Object f41638x;

        /* JADX INFO: renamed from: y */
        Object f41639y;

        /* JADX INFO: renamed from: z */
        int f41640z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f41634E = obj;
            this.f41636G |= Integer.MIN_VALUE;
            return C12370h.this.m34687q(null, this);
        }
    }

    /* JADX INFO: renamed from: dt1.h$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$deleteLocal$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {268, 270, 271, 273}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12370h f41641E;

        /* JADX INFO: renamed from: w */
        Object f41642w;

        /* JADX INFO: renamed from: x */
        int f41643x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f41644y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Instant f41645z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Instant instant, C12370h c12370h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41645z = instant;
            this.f41641E = c12370h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f41645z, this.f41641E, interfaceC30057d);
            bVar.f41644y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f41644y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f41643x
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L32
                if (r2 == r6) goto L2e
                if (r2 == r5) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r8.f41642w
                java.lang.Exception r0 = (java.lang.Exception) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L80
            L1e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L26:
                p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L6b
                goto L80
            L2a:
                p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L6b
                goto L5e
            L2e:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L47
            L32:
                p505ts.AbstractC34132o.m107864I(r9)
                dt1.b$b r9 = new dt1.b$b
                java.time.Instant r2 = r8.f41645z
                r9.<init>(r2)
                r8.f41644y = r0
                r8.f41643x = r6
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L47
                goto L7f
            L47:
                dt1.h r9 = r8.f41641E     // Catch: java.lang.Exception -> L6b
                qk1.b r9 = dt1.C12370h.m34678h(r9)     // Catch: java.lang.Exception -> L6b
                java.time.Instant r2 = r8.f41645z     // Catch: java.lang.Exception -> L6b
                long r6 = r2.toEpochMilli()     // Catch: java.lang.Exception -> L6b
                r8.f41644y = r0     // Catch: java.lang.Exception -> L6b
                r8.f41643x = r5     // Catch: java.lang.Exception -> L6b
                java.lang.Object r9 = r9.mo93127c(r6, r8)     // Catch: java.lang.Exception -> L6b
                if (r9 != r1) goto L5e
                goto L7f
            L5e:
                dt1.b$d r9 = dt1.InterfaceC12364b.d.f41554a     // Catch: java.lang.Exception -> L6b
                r8.f41644y = r0     // Catch: java.lang.Exception -> L6b
                r8.f41643x = r4     // Catch: java.lang.Exception -> L6b
                java.lang.Object r9 = r0.emit(r9, r8)     // Catch: java.lang.Exception -> L6b
                if (r9 != r1) goto L80
                goto L7f
            L6b:
                dt1.b$c r9 = new dt1.b$c
                java.time.Instant r2 = r8.f41645z
                r9.<init>(r2)
                r2 = 0
                r8.f41644y = r2
                r8.f41642w = r2
                r8.f41643x = r3
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L80
            L7f:
                return r1
            L80:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dt1.h$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$deleteRemoteAndLocal$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {281, 282, 289, 290, 291, 295}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12370h f41646E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f41647F;

        /* JADX INFO: renamed from: w */
        Object f41648w;

        /* JADX INFO: renamed from: x */
        int f41649x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f41650y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Instant f41651z;

        /* JADX INFO: renamed from: dt1.h$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$deleteRemoteAndLocal$1$result$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {DfuBaseService.NOTIFICATION_ID}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lu02/a;", "Lf63/c;", "<anonymous>", "(Lbc3/c0;)Lu02/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f41652w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12370h f41653x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Instant f41654y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f41655z;

            /* JADX INFO: renamed from: dt1.h$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$deleteRemoteAndLocal$1$result$1$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {284}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41488a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f41656w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C12370h f41657x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ String f41658y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41488a(C12370h c12370h, String str, InterfaceC30057d<? super C41488a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f41657x = c12370h;
                    this.f41658y = str;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C41488a(this.f41657x, this.f41658y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f41656w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    C34387c c34387c = this.f41657x.apiClient;
                    String str = this.f41658y;
                    AbstractC22676k.m65747g(str);
                    DeleteRequest deleteRequest = new DeleteRequest(str);
                    InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                    this.f41656w = 1;
                    Object objM108748d = c34387c.m108748d(deleteRequest, c32236aM44445Y, this);
                    return objM108748d == enumC31071a ? enumC31071a : objM108748d;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
                    return ((C41488a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12370h c12370h, Instant instant, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f41653x = c12370h;
                this.f41654y = instant;
                this.f41655z = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f41653x, this.f41654y, this.f41655z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC34385a<? extends AbstractC14155c>> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f41652w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f41653x.logger;
                String str = "Failed to delete reading with ts " + this.f41654y;
                C41488a c41488a = new C41488a(this.f41653x, this.f41655z, null);
                this.f41652w = 1;
                Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, str, c41488a, this, 2, null);
                return objM108729b == enumC31071a ? enumC31071a : objM108729b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Instant instant, C12370h c12370h, String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41651z = instant;
            this.f41646E = c12370h;
            this.f41647F = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f41651z, this.f41646E, this.f41647F, interfaceC30057d);
            cVar.f41650y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0066 A[PHI: r7
          0x0066: PHI (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v0 java.lang.Object) binds: [B:15:0x0063, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x006c  */
        /* JADX WARN: Code duplicated, block: B:22:0x0082  */
        /* JADX WARN: Code duplicated, block: B:25:0x009c  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L32;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dt1.h$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor", m100430f = "LabradorDetailsInteractor.kt", m100431l = {336, 343, 344}, m100432m = "doUpload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f41659E;

        /* JADX INFO: renamed from: F */
        Object f41660F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f41661G;

        /* JADX INFO: renamed from: I */
        int f41663I;

        /* JADX INFO: renamed from: w */
        Object f41664w;

        /* JADX INFO: renamed from: x */
        Object f41665x;

        /* JADX INFO: renamed from: y */
        Object f41666y;

        /* JADX INFO: renamed from: z */
        Object f41667z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f41661G = obj;
            this.f41663I |= Integer.MIN_VALUE;
            return C12370h.this.m34691u(null, this);
        }
    }

    /* JADX INFO: renamed from: dt1.h$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$doUpload$result$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {337}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lu02/a;", "Lf63/c;", "<anonymous>", "(Lbc3/c0;)Lu02/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41668w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LabradorReadingSymptomsUpdateRequest f41670y;

        /* JADX INFO: renamed from: dt1.h$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$doUpload$result$1$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {338}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f41671w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12370h f41672x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ LabradorReadingSymptomsUpdateRequest f41673y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12370h c12370h, LabradorReadingSymptomsUpdateRequest labradorReadingSymptomsUpdateRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f41672x = c12370h;
                this.f41673y = labradorReadingSymptomsUpdateRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f41672x, this.f41673y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f41671w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C34387c c34387c = this.f41672x.apiClient;
                UploadSymptomsRequest uploadSymptomsRequest = new UploadSymptomsRequest(this.f41673y);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(LabradorReadingSymptomsUpdateRequest.class);
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(LabradorReadingSymptomsUpdateRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
                this.f41671w = 1;
                Object objM108748d = c34387c.m108748d(uploadSymptomsRequest, c32236aM44445Y, this);
                return objM108748d == enumC31071a ? enumC31071a : objM108748d;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LabradorReadingSymptomsUpdateRequest labradorReadingSymptomsUpdateRequest, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41670y = labradorReadingSymptomsUpdateRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12370h.this.new e(this.f41670y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC34385a<? extends AbstractC14155c>> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41668w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = C12370h.this.logger;
            a aVar = new a(C12370h.this, this.f41670y, null);
            this.f41668w = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upload ECG reading symptoms", aVar, this, 2, null);
            return objM108729b == enumC31071a ? enumC31071a : objM108729b;
        }
    }

    /* JADX INFO: renamed from: dt1.h$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor", m100430f = "LabradorDetailsInteractor.kt", m100431l = {320}, m100432m = "fetchLatestReadingFromCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f41674w;

        /* JADX INFO: renamed from: y */
        int f41676y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f41674w = obj;
            this.f41676y |= Integer.MIN_VALUE;
            return C12370h.this.m34692v(this);
        }
    }

    /* JADX INFO: renamed from: dt1.h$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor", m100430f = "LabradorDetailsInteractor.kt", m100431l = {392}, m100432m = "getPdf", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f41677w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f41678x;

        /* JADX INFO: renamed from: z */
        int f41680z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f41678x = obj;
            this.f41680z |= Integer.MIN_VALUE;
            return C12370h.this.m34693w(null, this);
        }
    }

    /* JADX INFO: renamed from: dt1.h$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$getPdf$responseBody$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {393}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lud3/a1;", "<anonymous>", "(Lbc3/c0;)Lud3/a1;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41681w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f41683y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41683y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12370h.this.new h(this.f41683y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41681w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FileDownloaderApi fileDownloaderApi = C12370h.this.fileDownloaderApi;
            String str = this.f41683y;
            this.f41681w = 1;
            Object objDownloadFile = fileDownloaderApi.downloadFile(str, this);
            return objDownloadFile == enumC31071a ? enumC31071a : objDownloadFile;
        }
    }

    /* JADX INFO: renamed from: dt1.h$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$getReading$$inlined$cacheAPI$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f41684w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41685x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41686y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f41687z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f41687z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i iVar = new i(interfaceC30057d, this.f41687z);
            iVar.f41685x = interfaceC13062m;
            iVar.f41686y = c26832c;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41684w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41685x;
                C26832c c26832c = (C26832c) this.f41686y;
                InterfaceC26834e interfaceC26834e = this.f41687z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(LabradorDetailsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(LabradorDetailsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f41685x = null;
                this.f41686y = null;
                this.f41684w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dt1.h$j */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41688w;

        /* JADX INFO: renamed from: dt1.h$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41689w;

            /* JADX INFO: renamed from: dt1.h$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$getReading$$inlined$map$1$2", m100430f = "LabradorDetailsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41489a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41690E;

                /* JADX INFO: renamed from: F */
                Object f41691F;

                /* JADX INFO: renamed from: G */
                Object f41692G;

                /* JADX INFO: renamed from: H */
                int f41693H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41694w;

                /* JADX INFO: renamed from: x */
                int f41695x;

                /* JADX INFO: renamed from: y */
                Object f41696y;

                public C41489a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41694w = obj;
                    this.f41695x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f41689w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41489a c41489a;
                Object oVar;
                if (interfaceC30057d instanceof C41489a) {
                    c41489a = (C41489a) interfaceC30057d;
                    int i13 = c41489a.f41695x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41489a.f41695x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41489a = new C41489a(interfaceC30057d);
                    }
                } else {
                    c41489a = new C41489a(interfaceC30057d);
                }
                Object obj2 = c41489a.f41694w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41489a.f41695x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41689w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        oVar = new InterfaceC12364b.o((LabradorDetailsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        oVar = InterfaceC12364b.i.f41559a;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                        oVar = InterfaceC12364b.h.f41558a;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        oVar = new InterfaceC12364b.o((LabradorDetailsResponse) ((InterfaceC29354a.d) interfaceC29354a).getData());
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oVar = InterfaceC12364b.i.f41559a;
                    }
                    c41489a.f41696y = null;
                    c41489a.f41690E = null;
                    c41489a.f41691F = null;
                    c41489a.f41692G = null;
                    c41489a.f41693H = 0;
                    c41489a.f41695x = 1;
                    if (interfaceC13062m.emit(oVar, c41489a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public j(InterfaceC13058l interfaceC13058l) {
            this.f41688w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41688w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dt1.h$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {196, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f41698E;

        /* JADX INFO: renamed from: F */
        Object f41699F;

        /* JADX INFO: renamed from: G */
        Object f41700G;

        /* JADX INFO: renamed from: H */
        int f41701H;

        /* JADX INFO: renamed from: w */
        int f41702w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41703x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41704y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12370h f41705z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC30057d interfaceC30057d, C12370h c12370h) {
            super(3, interfaceC30057d);
            this.f41705z = c12370h;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC12367e interfaceC12367e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            k kVar = new k(interfaceC30057d, this.f41705z);
            kVar.f41703x = interfaceC13062m;
            kVar.f41704y = interfaceC12367e;
            return kVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r9, r8) == r0) goto L39;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC12367e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dt1.h$l */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41706w;

        /* JADX INFO: renamed from: dt1.h$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41707w;

            /* JADX INFO: renamed from: dt1.h$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$interact$$inlined$map$1$2", m100430f = "LabradorDetailsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41490a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41708E;

                /* JADX INFO: renamed from: F */
                Object f41709F;

                /* JADX INFO: renamed from: G */
                Object f41710G;

                /* JADX INFO: renamed from: H */
                int f41711H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41712w;

                /* JADX INFO: renamed from: x */
                int f41713x;

                /* JADX INFO: renamed from: y */
                Object f41714y;

                public C41490a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41712w = obj;
                    this.f41713x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f41707w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41490a c41490a;
                if (interfaceC30057d instanceof C41490a) {
                    c41490a = (C41490a) interfaceC30057d;
                    int i13 = c41490a.f41713x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41490a.f41713x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41490a = new C41490a(interfaceC30057d);
                    }
                } else {
                    c41490a = new C41490a(interfaceC30057d);
                }
                Object obj2 = c41490a.f41712w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41490a.f41713x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41707w;
                    InterfaceC12369g state = ((C12371i) obj).getState();
                    c41490a.f41714y = null;
                    c41490a.f41708E = null;
                    c41490a.f41709F = null;
                    c41490a.f41710G = null;
                    c41490a.f41711H = 0;
                    c41490a.f41713x = 1;
                    if (interfaceC13062m.emit(state, c41490a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public l(InterfaceC13058l interfaceC13058l) {
            this.f41706w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41706w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dt1.h$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$interact$2", m100430f = "LabradorDetailsInteractor.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldt1/i;", "internalState", "Ldt1/b;", "internalEvent", "<anonymous>", "(Ldt1/i;Ldt1/b;)Ldt1/i;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        Object f41717w;

        /* JADX INFO: renamed from: x */
        int f41718x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41719y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f41720z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12371i c12371i, InterfaceC12364b interfaceC12364b, InterfaceC30057d<? super C12371i> interfaceC30057d) {
            m mVar = C12370h.this.new m(interfaceC30057d);
            mVar.f41719y = c12371i;
            mVar.f41720z = interfaceC12364b;
            return mVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            LabradorDetailsDomainHolder labradorDetailsDomainHolder;
            C12371i c12371i = (C12371i) this.f41719y;
            InterfaceC12364b interfaceC12364b = (InterfaceC12364b) this.f41720z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41718x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.i.f41559a)) {
                    return C12371i.m34698b(c12371i, InterfaceC12369g.h.f41613a, null, null, 6, null);
                }
                if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.h.f41558a)) {
                    C12370h.this.analytics.m104042p();
                    return C12371i.m34698b(c12371i, new InterfaceC12369g.d(null, 1, null), null, null, 6, null);
                }
                if (!(interfaceC12364b instanceof InterfaceC12364b.o)) {
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.m.f41562a)) {
                        return C12371i.m34698b(c12371i, InterfaceC12369g.j.f41615a, null, null, 6, null);
                    }
                    if (interfaceC12364b instanceof InterfaceC12364b.p) {
                        C12370h.this.analytics.m104048w();
                        InterfaceC12364b.p pVar = (InterfaceC12364b.p) interfaceC12364b;
                        return C12371i.m34698b(c12371i, new InterfaceC12369g.k(pVar.getId(), pVar.getTimestamp(), pVar.m34634c(), pVar.getNotes()), null, null, 6, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.l.f41561a)) {
                        C12370h.this.analytics.m104049x();
                        return C12371i.m34698b(c12371i, InterfaceC12369g.i.f41614a, null, null, 2, null);
                    }
                    if (interfaceC12364b instanceof InterfaceC12364b.b) {
                        return C12371i.m34698b(c12371i, new InterfaceC12369g.c(((InterfaceC12364b.b) interfaceC12364b).getTimestamp()), null, (InterfaceC12364b.j) interfaceC12364b, 2, null);
                    }
                    if (interfaceC12364b instanceof InterfaceC12364b.c) {
                        C12370h.this.analytics.m104029c();
                        return C12371i.m34698b(c12371i, new InterfaceC12369g.a(((InterfaceC12364b.c) interfaceC12364b).getTimestamp()), null, null, 6, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.d.f41554a)) {
                        C12370h.this.analytics.m104040n();
                        return C12371i.m34698b(c12371i, InterfaceC12369g.b.f41604a, null, null, 6, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.e.f41555a)) {
                        return C12371i.m34698b(c12371i, c12371i.getState() instanceof InterfaceC12369g.d ? new InterfaceC12369g.d(null) : new InterfaceC12369g.g(c12371i.getDomainHolder(), null, null, false, 12, null), null, null, 6, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.n.f41563a)) {
                        C12370h.this.analytics.m104031e();
                        return C12371i.m34698b(c12371i, c12371i.getState() instanceof InterfaceC12369g.d ? new InterfaceC12369g.d(new C12363a(c12371i.getDomainHolder().getId(), c12371i.getDomainHolder().getTimestamp())) : new InterfaceC12369g.g(c12371i.getDomainHolder(), new C12363a(c12371i.getDomainHolder().getId(), c12371i.getDomainHolder().getTimestamp()), null, false, 12, null), null, null, 6, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.g.f41557a)) {
                        return C12371i.m34698b(c12371i, InterfaceC12369g.f.f41608a, null, null, 6, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.f.f41556a)) {
                        return C12371i.m34698b(c12371i, InterfaceC12369g.e.f41607a, null, null, 6, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.k.f41560a)) {
                        C12370h.this.analytics.m104038l();
                        return C12371i.m34698b(c12371i, new InterfaceC12369g.g(c12371i.getDomainHolder(), null, c12371i.getState() instanceof InterfaceC12369g.g ? ((InterfaceC12369g.g) c12371i.getState()).getPdfPath() : null, true, 2, null), null, null, 6, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC12364b, InterfaceC12364b.a.f41551a)) {
                        return C12371i.m34698b(c12371i, new InterfaceC12369g.g(c12371i.getDomainHolder(), null, c12371i.getState() instanceof InterfaceC12369g.g ? ((InterfaceC12369g.g) c12371i.getState()).getPdfPath() : null, false, 2, null), null, null, 6, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                LabradorDetailsDomainHolder domainHolder = DomainMapperKt.toDomainHolder(((InterfaceC12364b.o) interfaceC12364b).getResponse());
                C12370h c12370h = C12370h.this;
                InterfaceC12369g.g gVar = new InterfaceC12369g.g(domainHolder, null, null, false, 14, null);
                this.f41719y = null;
                this.f41720z = null;
                this.f41717w = domainHolder;
                this.f41718x = 1;
                obj = c12370h.m34687q(gVar, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
                labradorDetailsDomainHolder = domainHolder;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LabradorDetailsDomainHolder labradorDetailsDomainHolder2 = (LabradorDetailsDomainHolder) this.f41717w;
                AbstractC34132o.m107864I(obj);
                labradorDetailsDomainHolder = labradorDetailsDomainHolder2;
            }
            return new C12371i((InterfaceC12369g.g) obj, labradorDetailsDomainHolder, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: dt1.h$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$savePdf$2", m100430f = "LabradorDetailsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ljava/io/File;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41721w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f41723y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC34799a1 f41724z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, AbstractC34799a1 abstractC34799a1, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41723y = str;
            this.f41724z = abstractC34799a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12370h.this.new n(this.f41723y, this.f41724z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super File> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f41721w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                return C12370h.this.fileManager.m85164h("ECG Reading " + this.f41723y + ".pdf", this.f41724z);
            } catch (Exception e5) {
                C12370h.this.logger.mo85230v("Failed to save pdf file", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: dt1.h$o */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41725w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12370h f41726x;

        /* JADX INFO: renamed from: dt1.h$o$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41727w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12370h f41728x;

            /* JADX INFO: renamed from: dt1.h$o$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$saveReading$$inlined$map$1$2", m100430f = "LabradorDetailsInteractor.kt", m100431l = {51, 55, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41491a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41729E;

                /* JADX INFO: renamed from: F */
                Object f41730F;

                /* JADX INFO: renamed from: G */
                Object f41731G;

                /* JADX INFO: renamed from: H */
                Object f41732H;

                /* JADX INFO: renamed from: I */
                Object f41733I;

                /* JADX INFO: renamed from: J */
                Object f41734J;

                /* JADX INFO: renamed from: K */
                Object f41735K;

                /* JADX INFO: renamed from: L */
                int f41736L;

                /* JADX INFO: renamed from: M */
                int f41737M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41738w;

                /* JADX INFO: renamed from: x */
                int f41739x;

                /* JADX INFO: renamed from: y */
                Object f41740y;

                public C41491a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41738w = obj;
                    this.f41739x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12370h c12370h) {
                this.f41727w = interfaceC13062m;
                this.f41728x = c12370h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
            
                if (r5.emit(r11, r0) == r1) goto L32;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, q83.InterfaceC30057d r11) {
                /*
                    Method dump skipped, instruction units count: 235
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.o.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public o(InterfaceC13058l interfaceC13058l, C12370h c12370h) {
            this.f41725w = interfaceC13058l;
            this.f41726x = c12370h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41725w.collect(new a(interfaceC13062m, this.f41726x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dt1.h$p */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$saveReading$2", m100430f = "LabradorDetailsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lts0/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41742w;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12370h.this.new p(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f41742w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12370h.this.analytics.m104037k();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dt1.h$q */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$saveReading$4", m100430f = "LabradorDetailsInteractor.kt", m100431l = {317}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41744w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41745x;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            q qVar = new q(interfaceC30057d);
            qVar.f41745x = obj;
            return qVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41745x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41744w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC12364b.m mVar = InterfaceC12364b.m.f41562a;
                this.f41745x = null;
                this.f41744w = 1;
                if (interfaceC13062m.emit(mVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dt1.h$r */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$updateSymptomsAndNotesForExistingReading$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {228, 229, 231, 238, 239, 240, 241, 252}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Instant f41747F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f41748G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ List<String> f41749H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f41750I;

        /* JADX INFO: renamed from: w */
        Object f41751w;

        /* JADX INFO: renamed from: x */
        Object f41752x;

        /* JADX INFO: renamed from: y */
        int f41753y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f41754z;

        /* JADX INFO: renamed from: dt1.h$r$a */
        @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$updateSymptomsAndNotesForExistingReading$1$result$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {232}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lu02/a;", "Lf63/c;", "<anonymous>", "(Lbc3/c0;)Lu02/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f41755w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12370h f41756x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ UpdateSymptomsRequest f41757y;

            /* JADX INFO: renamed from: dt1.h$r$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$updateSymptomsAndNotesForExistingReading$1$result$1$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41492a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f41758w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C12370h f41759x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ UpdateSymptomsRequest f41760y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41492a(C12370h c12370h, UpdateSymptomsRequest updateSymptomsRequest, InterfaceC30057d<? super C41492a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f41759x = c12370h;
                    this.f41760y = updateSymptomsRequest;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C41492a(this.f41759x, this.f41760y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f41758w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    C34387c c34387c = this.f41759x.apiClient;
                    UpdateSymptomsRequest updateSymptomsRequest = this.f41760y;
                    InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(LabradorDetailsSymptomsAndNotesUpdateRequest.class);
                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(LabradorDetailsSymptomsAndNotesUpdateRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
                    this.f41758w = 1;
                    Object objM108748d = c34387c.m108748d(updateSymptomsRequest, c32236aM44445Y, this);
                    return objM108748d == enumC31071a ? enumC31071a : objM108748d;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
                    return ((C41492a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12370h c12370h, UpdateSymptomsRequest updateSymptomsRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f41756x = c12370h;
                this.f41757y = updateSymptomsRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f41756x, this.f41757y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC34385a<? extends AbstractC14155c>> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f41755w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f41756x.logger;
                C41492a c41492a = new C41492a(this.f41756x, this.f41757y, null);
                this.f41755w = 1;
                Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to update symptoms and notes", c41492a, this, 2, null);
                return objM108729b == enumC31071a ? enumC31071a : objM108729b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Instant instant, String str, List<String> list, String str2, InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41747F = instant;
            this.f41748G = str;
            this.f41749H = list;
            this.f41750I = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            r rVar = C12370h.this.new r(this.f41747F, this.f41748G, this.f41749H, this.f41750I, interfaceC30057d);
            rVar.f41754z = obj;
            return rVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0089  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b1 A[PHI: r0
          0x00b1: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v24 java.lang.Object) binds: [B:20:0x00ad, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:27:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:33:0x010c  */
        /* JADX WARN: Code duplicated, block: B:36:0x011e  */
        /* JADX WARN: Code duplicated, block: B:38:0x0122  */
        /* JADX WARN: Code duplicated, block: B:43:0x015c  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
        
            if (r6.emit(r0, r17) == r7) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0156, code lost:
        
            if (r6.emit(r0, r17) == r7) goto L40;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dt1.h$s */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$updateSymptomsAndNotesForUnsavedReading$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {209, 210}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldt1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List<String> f41761E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f41762F;

        /* JADX INFO: renamed from: w */
        int f41763w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41764x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Instant f41766z;

        /* JADX INFO: renamed from: dt1.h$s$a */
        @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$updateSymptomsAndNotesForUnsavedReading$1$1", m100430f = "LabradorDetailsInteractor.kt", m100431l = {212, 213, 214, 217}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ List<String> f41767E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ String f41768F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ InterfaceC13062m f41769G;

            /* JADX INFO: renamed from: w */
            Object f41770w;

            /* JADX INFO: renamed from: x */
            int f41771x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C12370h f41772y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ Instant f41773z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12370h c12370h, Instant instant, List<String> list, String str, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f41772y = c12370h;
                this.f41773z = instant;
                this.f41767E = list;
                this.f41768F = str;
                this.f41769G = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f41772y, this.f41773z, this.f41767E, this.f41768F, this.f41769G, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
            
                if (r13.emit(r0, r12) == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
            
                if (r13.emit(r0, r12) == r1) goto L36;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r0 = r12.f41771x
                    r2 = 0
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r0 == 0) goto L36
                    if (r0 == r6) goto L32
                    if (r0 == r5) goto L2d
                    if (r0 == r4) goto L23
                    if (r0 != r3) goto L1b
                    java.lang.Object r0 = r12.f41770w
                    android.database.sqlite.SQLiteException r0 = (android.database.sqlite.SQLiteException) r0
                    p505ts.AbstractC34132o.m107864I(r13)
                    goto L26
                L1b:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L23:
                    p505ts.AbstractC34132o.m107864I(r13)     // Catch: android.database.sqlite.SQLiteException -> L29
                L26:
                    r11 = r12
                    goto La4
                L29:
                    r0 = move-exception
                    r13 = r0
                    r11 = r12
                    goto L7c
                L2d:
                    p505ts.AbstractC34132o.m107864I(r13)     // Catch: android.database.sqlite.SQLiteException -> L29
                    r11 = r12
                    goto L69
                L32:
                    p505ts.AbstractC34132o.m107864I(r13)     // Catch: android.database.sqlite.SQLiteException -> L29
                    goto L4f
                L36:
                    p505ts.AbstractC34132o.m107864I(r13)
                    dt1.h r13 = r12.f41772y     // Catch: android.database.sqlite.SQLiteException -> L79
                    qk1.b r13 = dt1.C12370h.m34678h(r13)     // Catch: android.database.sqlite.SQLiteException -> L79
                    java.time.Instant r0 = r12.f41773z     // Catch: android.database.sqlite.SQLiteException -> L79
                    long r7 = r0.toEpochMilli()     // Catch: android.database.sqlite.SQLiteException -> L79
                    r12.f41771x = r6     // Catch: android.database.sqlite.SQLiteException -> L79
                    java.lang.Object r13 = r13.mo93128d(r7, r2, r12)     // Catch: android.database.sqlite.SQLiteException -> L79
                    if (r13 != r1) goto L4f
                    r11 = r12
                    goto La3
                L4f:
                    dt1.h r13 = r12.f41772y     // Catch: android.database.sqlite.SQLiteException -> L79
                    qk1.b r6 = dt1.C12370h.m34678h(r13)     // Catch: android.database.sqlite.SQLiteException -> L79
                    java.time.Instant r13 = r12.f41773z     // Catch: android.database.sqlite.SQLiteException -> L79
                    long r7 = r13.toEpochMilli()     // Catch: android.database.sqlite.SQLiteException -> L79
                    java.util.List<java.lang.String> r9 = r12.f41767E     // Catch: android.database.sqlite.SQLiteException -> L79
                    java.lang.String r10 = r12.f41768F     // Catch: android.database.sqlite.SQLiteException -> L79
                    r12.f41771x = r5     // Catch: android.database.sqlite.SQLiteException -> L79
                    r11 = r12
                    java.lang.Object r13 = r6.mo93125a(r7, r9, r10, r11)     // Catch: android.database.sqlite.SQLiteException -> L76
                    if (r13 != r1) goto L69
                    goto La3
                L69:
                    ec3.m r13 = r11.f41769G     // Catch: android.database.sqlite.SQLiteException -> L76
                    dt1.b$l r0 = dt1.InterfaceC12364b.l.f41561a     // Catch: android.database.sqlite.SQLiteException -> L76
                    r11.f41771x = r4     // Catch: android.database.sqlite.SQLiteException -> L76
                    java.lang.Object r13 = r13.emit(r0, r12)     // Catch: android.database.sqlite.SQLiteException -> L76
                    if (r13 != r1) goto La4
                    goto La3
                L76:
                    r0 = move-exception
                L77:
                    r13 = r0
                    goto L7c
                L79:
                    r0 = move-exception
                    r11 = r12
                    goto L77
                L7c:
                    dt1.h r0 = r11.f41772y
                    tr2.n r0 = dt1.C12370h.m34681k(r0)
                    java.lang.String r4 = "Failed to locally save symptoms and notes for brand new reading"
                    qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r2]
                    r0.mo85230v(r4, r13, r2)
                    ec3.m r13 = r11.f41769G
                    dt1.b$p r0 = new dt1.b$p
                    java.time.Instant r2 = r11.f41773z
                    java.util.List<java.lang.String> r4 = r11.f41767E
                    java.lang.String r5 = r11.f41768F
                    java.lang.String r6 = ""
                    r0.<init>(r6, r2, r4, r5)
                    r2 = 0
                    r11.f41770w = r2
                    r11.f41771x = r3
                    java.lang.Object r13 = r13.emit(r0, r12)
                    if (r13 != r1) goto La4
                La3:
                    return r1
                La4:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Instant instant, List<String> list, String str, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41766z = instant;
            this.f41761E = list;
            this.f41762F = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            s sVar = C12370h.this.new s(this.f41766z, this.f41761E, this.f41762F, interfaceC30057d);
            sVar.f41764x = obj;
            return sVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r1, r9) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f41764x
                r6 = r0
                ec3.m r6 = (ec3.InterfaceC13062m) r6
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r9.f41763w
                r8 = 2
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 == r2) goto L1d
                if (r1 != r8) goto L15
                p505ts.AbstractC34132o.m107864I(r10)
                goto L4d
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L31
            L21:
                p505ts.AbstractC34132o.m107864I(r10)
                dt1.b$m r10 = dt1.InterfaceC12364b.m.f41562a
                r9.f41764x = r6
                r9.f41763w = r2
                java.lang.Object r10 = r6.emit(r10, r9)
                if (r10 != r0) goto L31
                goto L4c
            L31:
                dt1.h$s$a r1 = new dt1.h$s$a
                dt1.h r2 = dt1.C12370h.this
                java.time.Instant r3 = r9.f41766z
                java.util.List<java.lang.String> r4 = r9.f41761E
                java.lang.String r5 = r9.f41762F
                r7 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r10 = 0
                r9.f41764x = r10
                r9.f41763w = r8
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r10 = or2.AbstractC28190p0.m85321a(r2, r1, r9)
                if (r10 != r0) goto L4d
            L4c:
                return r0
            L4d:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12370h(InterfaceC26834e cachedApiSource, C34387c apiClient, FileDownloaderApi fileDownloaderApi, InterfaceC30444b dao, C38458b cacheUpdater, InterfaceC34116n logger, C32948a analytics, ZoneId zone, InterfaceC4733b whoopStrapProvider, AbstractC18377p0 workManager, C28144a0 fileManager, InterfaceC30063j ioContext, InterfaceC14783b labradorService, DateTimeFormatter customFormatter) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(fileDownloaderApi, "fileDownloaderApi");
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(zone, "zone");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(labradorService, "labradorService");
        AbstractC22676k.m65750j(customFormatter, "customFormatter");
        this.cachedApiSource = cachedApiSource;
        this.apiClient = apiClient;
        this.fileDownloaderApi = fileDownloaderApi;
        this.dao = dao;
        this.cacheUpdater = cacheUpdater;
        this.logger = logger;
        this.analytics = analytics;
        this.zone = zone;
        this.whoopStrapProvider = whoopStrapProvider;
        this.workManager = workManager;
        this.fileManager = fileManager;
        this.ioContext = ioContext;
        this.labradorService = labradorService;
        this.customFormatter = customFormatter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final Object m34667A(InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13015a0(new q(null), new o(new C13015a0(new p(null), this.labradorService.mo42419d()), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC13058l m34668B(String id4, Instant timestamp, List<String> symptoms, String notes) {
        return id4.length() == 0 ? m34670D(timestamp, symptoms, notes) : m34669C(id4, timestamp, symptoms, notes);
    }

    /* JADX INFO: renamed from: C */
    private final InterfaceC13058l m34669C(String id4, Instant timestamp, List<String> symptoms, String notes) {
        return new C13084s1(new r(timestamp, id4, symptoms, notes, null));
    }

    /* JADX INFO: renamed from: D */
    private final InterfaceC13058l m34670D(Instant timestamp, List<String> symptoms, String notes) {
        return new C13084s1(new s(timestamp, symptoms, notes, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r15 == r1) goto L33;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m34687q(dt1.InterfaceC12369g.g r14, q83.InterfaceC30057d<? super dt1.InterfaceC12369g.g> r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof dt1.C12370h.a
            if (r0 == 0) goto L13
            r0 = r15
            dt1.h$a r0 = (dt1.C12370h.a) r0
            int r1 = r0.f41636G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41636G = r1
            goto L18
        L13:
            dt1.h$a r0 = new dt1.h$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f41634E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f41636G
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r14 = r0.f41639y
            ud3.a1 r14 = (ud3.AbstractC34799a1) r14
            java.lang.Object r14 = r0.f41638x
            com.whoop.data.remote.commons.Resource r14 = (com.whoop.data.remote.commons.Resource) r14
            java.lang.Object r14 = r0.f41637w
            dt1.g$g r14 = (dt1.InterfaceC12369g.g) r14
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> Lb3
        L36:
            r6 = r14
            goto L9a
        L38:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L40:
            java.lang.Object r14 = r0.f41637w
            dt1.g$g r14 = (dt1.InterfaceC12369g.g) r14
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> Lb3
            goto L6e
        L48:
            p505ts.AbstractC34132o.m107864I(r15)
            com.whoop.labrador.feature.details.domain.model.LabradorDetailsDomainHolder r15 = r14.getDomain()
            java.lang.String r15 = r15.getPdfPresignedUrl()
            if (r15 == 0) goto Lb3
            java.lang.String r15 = r14.getPdfPath()
            if (r15 != 0) goto Lb3
            com.whoop.labrador.feature.details.domain.model.LabradorDetailsDomainHolder r15 = r14.getDomain()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r15 = r15.getPdfPresignedUrl()     // Catch: java.lang.Exception -> Lb3
            r0.f41637w = r14     // Catch: java.lang.Exception -> Lb3
            r0.f41636G = r4     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r15 = r13.m34693w(r15, r0)     // Catch: java.lang.Exception -> Lb3
            if (r15 != r1) goto L6e
            goto L99
        L6e:
            com.whoop.data.remote.commons.Resource r15 = (com.whoop.data.remote.commons.Resource) r15     // Catch: java.lang.Exception -> Lb3
            com.whoop.data.remote.commons.Status r2 = r15.getStatus()     // Catch: java.lang.Exception -> Lb3
            com.whoop.data.remote.commons.Status r4 = com.whoop.data.remote.commons.Status.SUCCESS     // Catch: java.lang.Exception -> Lb3
            if (r2 != r4) goto Lb3
            java.lang.Object r15 = r15.getData()     // Catch: java.lang.Exception -> Lb3
            ud3.a1 r15 = (ud3.AbstractC34799a1) r15     // Catch: java.lang.Exception -> Lb3
            if (r15 == 0) goto Lb3
            com.whoop.labrador.feature.details.domain.model.LabradorDetailsDomainHolder r2 = r14.getDomain()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r2 = r2.getId()     // Catch: java.lang.Exception -> Lb3
            r0.f41637w = r14     // Catch: java.lang.Exception -> Lb3
            r0.f41638x = r5     // Catch: java.lang.Exception -> Lb3
            r0.f41639y = r5     // Catch: java.lang.Exception -> Lb3
            r4 = 0
            r0.f41640z = r4     // Catch: java.lang.Exception -> Lb3
            r0.f41636G = r3     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r15 = r13.m34695z(r15, r2, r0)     // Catch: java.lang.Exception -> Lb3
            if (r15 != r1) goto L36
        L99:
            return r1
        L9a:
            java.io.File r15 = (java.io.File) r15     // Catch: java.lang.Exception -> La3
            if (r15 == 0) goto La5
            java.lang.String r5 = r15.getPath()     // Catch: java.lang.Exception -> La3
            goto La5
        La3:
            r14 = r6
            goto Lb3
        La5:
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> La3
            r11 = 11
            r12 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            dt1.g$g r14 = dt1.InterfaceC12369g.g.m34657b(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> La3
        Lb3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.m34687q(dt1.g$g, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m34688r(Instant timestamp, String id4) {
        return (id4 == null || id4.length() == 0) ? m34689s(timestamp) : m34690t(timestamp);
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC13058l m34689s(Instant timestamp) {
        return new C13084s1(new b(timestamp, this, null));
    }

    /* JADX INFO: renamed from: t */
    private final InterfaceC13058l m34690t(Instant timestamp) {
        return new C13084s1(new c(timestamp, this, this.customFormatter.format(OffsetDateTime.ofInstant(timestamp, this.zone)), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011f, code lost:
    
        if (r12.m123247a("labradorrefreshscope", r0) == r1) goto L38;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m34691u(qk1.C30443a r12, q83.InterfaceC30057d<? super dt1.InterfaceC12364b> r13) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.C12370h.m34691u(qk1.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m34692v(InterfaceC30057d<? super C30443a> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f41676y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f41676y = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objMo93126b = fVar.f41674w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f41676y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo93126b);
                InterfaceC30444b interfaceC30444b = this.dao;
                fVar.f41676y = 1;
                objMo93126b = interfaceC30444b.mo93126b(fVar);
                if (objMo93126b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo93126b);
            }
            return (C30443a) objMo93126b;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Failed to get local stored copy of recently completed reading", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: w */
    public final Object m34693w(String str, InterfaceC30057d<? super Resource<? extends AbstractC34799a1>> interfaceC30057d) throws Throwable {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f41680z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f41680z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM8705K = gVar2.f41678x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f41680z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                InterfaceC30063j interfaceC30063j = this.ioContext;
                h hVar = new h(str, null);
                gVar2.f41677w = null;
                gVar2.f41680z = 1;
                objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, hVar, gVar2);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8705K);
            }
            return Resource.INSTANCE.success((AbstractC34799a1) objM8705K);
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(gVar2.getContext());
            return Resource.Companion.error$default(Resource.INSTANCE, String.valueOf(e5.getMessage()), null, null, new DomainException(DomainException.EnumC9607c.NOT_FOUND, null, 2, null), 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final InterfaceC13058l m34694x(String id4) {
        return id4.length() == 0 ? new C0456u(InterfaceC12364b.h.f41558a, 1) : new j(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetLabradorDetailsRequest(id4), 1), null, null, 3, null), new i(null, this.cachedApiSource)));
    }

    /* JADX INFO: renamed from: z */
    private final Object m34695z(AbstractC34799a1 abstractC34799a1, String str, InterfaceC30057d<? super File> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.ioContext, new n(str, abstractC34799a1, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: y */
    public final InterfaceC13058l m34696y(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new l(AbstractC13091v.m36612v(new C13060l1(new C12371i(InterfaceC12369g.h.f41613a, new LabradorDetailsDomainHolder(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null), null, 4, null), AbstractC13091v.m36590P(upstream, new k(null, this)), new m(null)), 1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12370h(InterfaceC26834e interfaceC26834e, C34387c c34387c, FileDownloaderApi fileDownloaderApi, InterfaceC30444b interfaceC30444b, C38458b c38458b, InterfaceC34116n interfaceC34116n, C32948a c32948a, ZoneId zoneId, InterfaceC4733b interfaceC4733b, AbstractC18377p0 abstractC18377p0, C28144a0 c28144a0, InterfaceC30063j interfaceC30063j, InterfaceC14783b interfaceC14783b, DateTimeFormatter dateTimeFormatter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        ZoneId zoneId2;
        DateTimeFormatter dateTimeFormatter2;
        InterfaceC34116n interfaceC34116nM107848a = (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EcgDetailsInteractor") : interfaceC34116n;
        if ((i13 & 128) != 0) {
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            AbstractC22676k.m65749i(zoneIdSystemDefault, "systemDefault(...)");
            zoneId2 = zoneIdSystemDefault;
        } else {
            zoneId2 = zoneId;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            AbstractC22676k.m65749i(dateTimeFormatterOfPattern, "ofPattern(...)");
            dateTimeFormatter2 = dateTimeFormatterOfPattern;
        } else {
            dateTimeFormatter2 = dateTimeFormatter;
        }
        this(interfaceC26834e, c34387c, fileDownloaderApi, interfaceC30444b, c38458b, interfaceC34116nM107848a, c32948a, zoneId2, interfaceC4733b, abstractC18377p0, c28144a0, interfaceC30063j, interfaceC14783b, dateTimeFormatter2);
    }
}
