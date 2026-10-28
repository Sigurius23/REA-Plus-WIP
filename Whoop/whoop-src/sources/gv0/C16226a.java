package gv0;

import bt0.C3617a;
import bt0.C3618b;
import com.whoop.consolePackets.data.api.ConsolePacketsApi;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.Clock;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js0.AbstractC21909c;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28162g;
import org.joda.time.DateTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import yt0.InterfaceC39765d;
import zt0.C41124b;

/* JADX INFO: renamed from: gv0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001f\u0010\u0013J\u0012\u0010!\u001a\u0004\u0018\u00010 H\u0082@¢\u0006\u0004\b!\u0010\u0013J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@¢\u0006\u0004\b\"\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u0018\u00100\u001a\u00020\u0017*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lgv0/a;", "", "Lyt0/d;", "newConsolePacketsDao", "Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;", "consolePacketsApi", "Ljs0/c;", "configurationRepository", "Ljava/time/Clock;", "clock", "Lor2/g;", "buildConfigProvider", "Ltr2/n;", "logger", "<init>", "(Lyt0/d;Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;Ljs0/c;Ljava/time/Clock;Lor2/g;Ltr2/n;)V", "Ll83/n;", "Ll83/a0;", "l", "(Lq83/d;)Ljava/lang/Object;", "Lzt0/b;", "topRow", "", "", "g", "(Lzt0/b;)Ljava/util/Map;", "", "rows", "", "i", "(Ljava/util/List;)[B", "j", "Lbt0/b;", "f", "k", "a", "Lyt0/d;", "b", "Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;", "c", "Ljs0/c;", "d", "Ljava/time/Clock;", "e", "Lor2/g;", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lor2/g;)Ljava/lang/String;", "modelHeader", "console-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16226a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39765d newConsolePacketsDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConsolePacketsApi consolePacketsApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: gv0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.consolePackets.data.NewConsolePacketUploader", m100430f = "NewConsolePacketUploader.kt", m100431l = {134}, m100432m = "getDayBoundaries", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f61633w;

        /* JADX INFO: renamed from: y */
        int f61635y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f61633w = obj;
            this.f61635y |= Integer.MIN_VALUE;
            return C16226a.this.m45926f(this);
        }
    }

    /* JADX INFO: renamed from: gv0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.consolePackets.data.NewConsolePacketUploader", m100430f = "NewConsolePacketUploader.kt", m100431l = {119, 123, 125}, m100432m = "removeOlderStrapLogs", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f61636E;

        /* JADX INFO: renamed from: G */
        int f61638G;

        /* JADX INFO: renamed from: w */
        long f61639w;

        /* JADX INFO: renamed from: x */
        long f61640x;

        /* JADX INFO: renamed from: y */
        Object f61641y;

        /* JADX INFO: renamed from: z */
        int f61642z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f61636E = obj;
            this.f61638G |= Integer.MIN_VALUE;
            return C16226a.this.m45930j(this);
        }
    }

    /* JADX INFO: renamed from: gv0.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.consolePackets.data.NewConsolePacketUploader", m100430f = "NewConsolePacketUploader.kt", m100431l = {37, 38}, m100432m = "uploadPackets-IoAF18A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f61643w;

        /* JADX INFO: renamed from: y */
        int f61645y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f61643w = obj;
            this.f61645y |= Integer.MIN_VALUE;
            Object objM45932k = C16226a.this.m45932k(this);
            return objM45932k == EnumC31071a.f128113w ? objM45932k : new C23468n(objM45932k);
        }
    }

    /* JADX INFO: renamed from: gv0.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.consolePackets.data.NewConsolePacketUploader", m100430f = "NewConsolePacketUploader.kt", m100431l = {44, 46, 49, 59, 69}, m100432m = "uploadSavedPackets-IoAF18A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f61646E;

        /* JADX INFO: renamed from: F */
        Object f61647F;

        /* JADX INFO: renamed from: G */
        Object f61648G;

        /* JADX INFO: renamed from: H */
        Object f61649H;

        /* JADX INFO: renamed from: I */
        Object f61650I;

        /* JADX INFO: renamed from: J */
        long f61651J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f61652K;

        /* JADX INFO: renamed from: M */
        int f61654M;

        /* JADX INFO: renamed from: w */
        int f61655w;

        /* JADX INFO: renamed from: x */
        Object f61656x;

        /* JADX INFO: renamed from: y */
        Object f61657y;

        /* JADX INFO: renamed from: z */
        Object f61658z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f61652K = obj;
            this.f61654M |= Integer.MIN_VALUE;
            Object objM45931l = C16226a.this.m45931l(this);
            return objM45931l == EnumC31071a.f128113w ? objM45931l : new C23468n(objM45931l);
        }
    }

    /* JADX INFO: renamed from: gv0.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.consolePackets.data.NewConsolePacketUploader$uploadSavedPackets$response$1", m100430f = "NewConsolePacketUploader.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f61659w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34846v0 f61661y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<C41124b> f61662z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC34846v0 abstractC34846v0, List<C41124b> list, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f61661y = abstractC34846v0;
            this.f61662z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C16226a.this.new e(this.f61661y, this.f61662z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f61659w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ConsolePacketsApi consolePacketsApi = C16226a.this.consolePacketsApi;
            AbstractC34846v0 abstractC34846v0 = this.f61661y;
            Map<String, String> mapM45927g = C16226a.this.m45927g(this.f61662z.get(0));
            this.f61659w = 1;
            Object objUploadConsoleEventPackets = consolePacketsApi.uploadConsoleEventPackets(abstractC34846v0, mapM45927g, this);
            return objUploadConsoleEventPackets == enumC31071a ? enumC31071a : objUploadConsoleEventPackets;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C16226a(InterfaceC39765d newConsolePacketsDao, ConsolePacketsApi consolePacketsApi, AbstractC21909c configurationRepository, Clock clock, C28162g buildConfigProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(newConsolePacketsDao, "newConsolePacketsDao");
        AbstractC22676k.m65750j(consolePacketsApi, "consolePacketsApi");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.newConsolePacketsDao = newConsolePacketsDao;
        this.consolePacketsApi = consolePacketsApi;
        this.configurationRepository = configurationRepository;
        this.clock = clock;
        this.buildConfigProvider = buildConfigProvider;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m45926f(InterfaceC30057d<? super C3618b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f61635y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f61635y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo127293b = aVar.f61633w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f61635y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo127293b);
            InterfaceC39765d interfaceC39765d = this.newConsolePacketsDao;
            aVar.f61635y = 1;
            objMo127293b = interfaceC39765d.mo127293b(1, aVar);
            if (objMo127293b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo127293b);
        }
        List list = (List) objMo127293b;
        if (list.isEmpty()) {
            this.logger.mo85222m("Console packet table is empty. Retry Later!", new AbstractC30556a.a[0]);
            return null;
        }
        return C3617a.f14712a.m10978a(new DateTime(((C41124b) list.get(0)).getPacketTimeStampUtcMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final Map<String, String> m45927g(C41124b topRow) {
        return AbstractC25247g0.m73990Y(new C23465k("Content-Type", DfuBaseService.MIME_TYPE_OCTET_STREAM), new C23465k("Content-Encoding", "gzip"), new C23465k("X-WHOOP-Strap-ID", topRow.getConsolePacketsMetadata().getStrapId()), new C23465k("X-WHOOP-HW-Version", topRow.getConsolePacketsMetadata().getHardwareVersion()), new C23465k("X-WHOOP-FW-Version", topRow.getConsolePacketsMetadata().getMaximVersion()), new C23465k("X-WHOOP-DSP-Version", topRow.getConsolePacketsMetadata().getDspVersion()), new C23465k("X-WHOOP-Binary-Version", String.valueOf(topRow.getConsolePacketsMetadata().getBinaryVersion())), new C23465k("X-WHOOP-Device-Model", m45928h(this.buildConfigProvider)), new C23465k("X-WHOOP-Device-OS", this.buildConfigProvider.getRelease()), new C23465k("X-WHOOP-Device-Platform", "ANDROID"));
    }

    /* JADX INFO: renamed from: h */
    private final String m45928h(C28162g c28162g) {
        return AbstractC18489d0.m53370k(c28162g.getBrand(), " ", c28162g.getModel());
    }

    /* JADX INFO: renamed from: i */
    private final byte[] m45929i(List<C41124b> rows) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<C41124b> it = rows.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(it.next().getReceivedPacketRaw().array());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC22676k.m65749i(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        if (r0 == r6) goto L72;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m45930j(q83.InterfaceC30057d<? super l83.C23454a0> r19) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gv0.C16226a.m45930j(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:104:0x02c5 A[Catch: Exception -> 0x02c3, TryCatch #1 {Exception -> 0x02c3, blocks: (B:100:0x02a9, B:95:0x023d, B:97:0x0243, B:104:0x02c5, B:106:0x02c9, B:108:0x02d4, B:109:0x02d9, B:88:0x01df, B:84:0x01d4, B:112:0x02dd, B:113:0x02e5), top: B:118:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02c9 A[Catch: Exception -> 0x02c3, TryCatch #1 {Exception -> 0x02c3, blocks: (B:100:0x02a9, B:95:0x023d, B:97:0x0243, B:104:0x02c5, B:106:0x02c9, B:108:0x02d4, B:109:0x02d9, B:88:0x01df, B:84:0x01d4, B:112:0x02dd, B:113:0x02e5), top: B:118:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02d4 A[Catch: Exception -> 0x02c3, TryCatch #1 {Exception -> 0x02c3, blocks: (B:100:0x02a9, B:95:0x023d, B:97:0x0243, B:104:0x02c5, B:106:0x02c9, B:108:0x02d4, B:109:0x02d9, B:88:0x01df, B:84:0x01d4, B:112:0x02dd, B:113:0x02e5), top: B:118:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01da  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0236  */
    /* JADX WARN: Code duplicated, block: B:97:0x0243 A[Catch: Exception -> 0x02c3, TryCatch #1 {Exception -> 0x02c3, blocks: (B:100:0x02a9, B:95:0x023d, B:97:0x0243, B:104:0x02c5, B:106:0x02c9, B:108:0x02d4, B:109:0x02d9, B:88:0x01df, B:84:0x01d4, B:112:0x02dd, B:113:0x02e5), top: B:118:0x0031 }] */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a6, code lost:
    
        if (r0 == r4) goto L99;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x0243, please report this as an issue */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m45931l(q83.InterfaceC30057d<? super l83.C23468n> r22) {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gv0.C16226a.m45931l(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m45932k(InterfaceC30057d<? super C23468n> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f61645y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f61645y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f61643w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = cVar.f61645y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            cVar.f61645y = 1;
            if (m45930j(cVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        cVar.f61645y = 2;
        Object objM45931l = m45931l(cVar);
        return objM45931l == obj2 ? obj2 : objM45931l;
    }

    public /* synthetic */ C16226a(InterfaceC39765d interfaceC39765d, ConsolePacketsApi consolePacketsApi, AbstractC21909c abstractC21909c, Clock clock, C28162g c28162g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39765d, consolePacketsApi, abstractC21909c, clock, c28162g, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("NewConsolePacketUploader") : interfaceC34116n);
    }
}
