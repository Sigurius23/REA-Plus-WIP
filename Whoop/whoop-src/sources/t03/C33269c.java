package t03;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao;
import com.whoop.data.local.room.entity.SmartAlarmDiagnosticDto;
import com.whoop.domain.exception.ConnectivityException;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p218ic.AbstractC18386u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import retrofit2.HttpException;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;

/* JADX INFO: renamed from: t03.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lt03/c;", "Lt03/b;", "Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;", "smartAlarmDiagnosticDao", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "smartAlarmApi", "Lq83/j;", "ioContext", "Lrr2/c;", "crashReporter", "<init>", "(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lq83/j;Lrr2/c;)V", "", "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;", "smartAlarmDiagnosticDtolist", "", "fromTimeStamp", "toTimeStamp", "Lic/u;", "i", "(Ljava/util/List;JJLq83/d;)Ljava/lang/Object;", "Lud3/v0;", "requestBody", "", "g", "(Lud3/v0;Lq83/d;)Ljava/lang/Object;", "", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/Map;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;", "b", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "c", "Lq83/j;", "d", "Lrr2/c;", "Ltr2/n;", "e", "Ltr2/n;", "log", "", "f", "I", "maxEventsCount", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33269c implements InterfaceC33268b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SmartAlarmDiagnosticDao smartAlarmDiagnosticDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SmartAlarmApi smartAlarmApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int maxEventsCount;

    /* JADX INFO: renamed from: t03.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.smartalarmdiagnosticworkmanager.SmartAlarmDiagnosticUploaderImpl$doUpload$2", m100430f = "SmartAlarmDiagnosticUploader.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138702w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34846v0 f138704y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138704y = abstractC34846v0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33269c.this.new a(this.f138704y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138702w;
            boolean z4 = true;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    SmartAlarmApi smartAlarmApi = C33269c.this.smartAlarmApi;
                    AbstractC34846v0 abstractC34846v0 = this.f138704y;
                    Map<String, String> mapM105549h = C33269c.this.m105549h();
                    this.f138702w = 1;
                    obj = smartAlarmApi.sendSmartAlarmDiagnosticAlarmService(abstractC34846v0, mapM105549h, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C29218v0 c29218v0 = (C29218v0) obj;
                if (!c29218v0.f118269a.f146788Q) {
                    C33269c.this.log.mo85222m("Unable to upload smart alarm diagnostic data - HTTP " + c29218v0.f118269a.f146792z, new AbstractC30556a.a[0]);
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            } catch (IOException e5) {
                C33269c.this.log.mo85222m(AbstractC11266d.m30461o("Caught a network exception while uploading smart alarm diagnostic data: ", e5.getMessage()), new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            } catch (NullPointerException e13) {
                InterfaceC31766c.m98634e(C33269c.this.crashReporter, new ConnectivityException(AbstractC11266d.m30461o("Caught a NPE during upload of smart alarm diagnostic data: ", e13.getMessage()), e13), null, 2, null);
                return Boolean.FALSE;
            } catch (HttpException e14) {
                C33269c.this.log.mo85222m(AbstractC11266d.m30461o("Failed to upload smart alarm diagnostic data ", e14.getMessage()), new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            } catch (Exception e15) {
                InterfaceC31766c.m98634e(C33269c.this.crashReporter, new ConnectivityException("Some error occurred while uploading smart alarm diagnostic data!", e15), null, 2, null);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: t03.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.smartalarmdiagnosticworkmanager.SmartAlarmDiagnosticUploaderImpl", m100430f = "SmartAlarmDiagnosticUploader.kt", m100431l = {32, 45}, m100432m = "uploadEvents", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f138705E;

        /* JADX INFO: renamed from: G */
        int f138707G;

        /* JADX INFO: renamed from: w */
        Object f138708w;

        /* JADX INFO: renamed from: x */
        Object f138709x;

        /* JADX INFO: renamed from: y */
        long f138710y;

        /* JADX INFO: renamed from: z */
        long f138711z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f138705E = obj;
            this.f138707G |= Integer.MIN_VALUE;
            return C33269c.this.mo105542a(this);
        }
    }

    /* JADX INFO: renamed from: t03.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.smartalarmdiagnosticworkmanager.SmartAlarmDiagnosticUploaderImpl", m100430f = "SmartAlarmDiagnosticUploader.kt", m100431l = {52, 55}, m100432m = "uploadSmartAlarmDiagnosticEvents", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f138712E;

        /* JADX INFO: renamed from: F */
        long f138713F;

        /* JADX INFO: renamed from: G */
        boolean f138714G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f138715H;

        /* JADX INFO: renamed from: J */
        int f138717J;

        /* JADX INFO: renamed from: w */
        Object f138718w;

        /* JADX INFO: renamed from: x */
        Object f138719x;

        /* JADX INFO: renamed from: y */
        Object f138720y;

        /* JADX INFO: renamed from: z */
        Object f138721z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f138715H = obj;
            this.f138717J |= Integer.MIN_VALUE;
            return C33269c.this.m105550i(null, 0L, 0L, this);
        }
    }

    public C33269c(SmartAlarmDiagnosticDao smartAlarmDiagnosticDao, SmartAlarmApi smartAlarmApi, InterfaceC30063j ioContext, InterfaceC31766c crashReporter) {
        AbstractC22676k.m65750j(smartAlarmDiagnosticDao, "smartAlarmDiagnosticDao");
        AbstractC22676k.m65750j(smartAlarmApi, "smartAlarmApi");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.smartAlarmDiagnosticDao = smartAlarmDiagnosticDao;
        this.smartAlarmApi = smartAlarmApi;
        this.ioContext = ioContext;
        this.crashReporter = crashReporter;
        this.log = InterfaceC34116n.INSTANCE.m107848a("SmartAlarmDiagnosticUploaderImpl");
        this.maxEventsCount = 100;
    }

    /* JADX INFO: renamed from: g */
    private final Object m105548g(AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.ioContext, new a(abstractC34846v0, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final Map<String, String> m105549h() {
        return AbstractC25247g0.m73990Y(new C23465k("Content-Type", "application/json"), new C23465k("Content-Encoding", "gzip"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
    
        if (r1.delete(r10, r11, r5, r7) == r0) goto L25;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m105550i(java.util.List<com.whoop.data.local.room.entity.SmartAlarmDiagnosticDto> r10, long r11, long r13, q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r15) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t03.C33269c.m105550i(java.util.List, long, long, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // t03.InterfaceC33268b
    /* JADX INFO: renamed from: a */
    public Object mo105542a(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f138707G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f138707G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object all = bVar2.f138705E;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar2.f138707G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(all);
            SmartAlarmDiagnosticDao smartAlarmDiagnosticDao = this.smartAlarmDiagnosticDao;
            bVar2.f138707G = 1;
            all = smartAlarmDiagnosticDao.getAll(bVar2);
            if (all != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(all);
            return all;
        }
        AbstractC34132o.m107864I(all);
        List<SmartAlarmDiagnosticDto> listM74156w1 = (List) all;
        if (listM74156w1.isEmpty()) {
            this.log.mo85228t("No smart alarm diagnostic events to upload", new AbstractC30556a.a[0]);
            return AbstractC18386u.m52885b();
        }
        int size = listM74156w1.size();
        int i15 = this.maxEventsCount;
        if (size > i15) {
            listM74156w1 = AbstractC25265s.m74156w1(listM74156w1, i15);
        }
        long timestamp = ((SmartAlarmDiagnosticDto) AbstractC25265s.m74096F0(listM74156w1)).getTimestamp();
        long timestamp2 = ((SmartAlarmDiagnosticDto) AbstractC25265s.m74112P0(listM74156w1)).getTimestamp();
        bVar2.f138708w = null;
        bVar2.f138709x = null;
        bVar2.f138710y = timestamp;
        bVar2.f138711z = timestamp2;
        bVar2.f138707G = 2;
        Object objM105550i = m105550i(listM74156w1, timestamp, timestamp2, bVar2);
        return objM105550i == obj ? obj : objM105550i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C33269c(SmartAlarmDiagnosticDao smartAlarmDiagnosticDao, SmartAlarmApi smartAlarmApi, InterfaceC30063j interfaceC30063j, InterfaceC31766c interfaceC31766c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        this(smartAlarmDiagnosticDao, smartAlarmApi, interfaceC30063j, interfaceC31766c);
    }
}
