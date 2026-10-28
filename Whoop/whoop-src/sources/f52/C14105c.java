package f52;

import android.database.sqlite.SQLiteException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;
import js0.AbstractC21909c;
import js0.C21908b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import or2.C28207v;
import or2.InterfaceC28148b0;
import ou0.InterfaceC28370a;
import ou0.InterfaceC28374e;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pu0.AbstractC29549c;
import pu0.C29548b;
import pu0.C29550d;
import pu0.InterfaceC29551e;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import va3.AbstractC35854l;
import wb3.AbstractC37056f;
import x42.C37965b;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: f52.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001*BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b&\u0010\u001bJ \u0010(\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00108R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00109¨\u0006:"}, m65681d2 = {"Lf52/c;", "", "Ltr2/n;", "logger", "Ljs0/c;", "configurationRepository", "Ljava/nio/file/Path;", "androidCacheDir", "Lor2/b0;", "fileProvider", "Lou0/a;", "consoleLogDao", "Lou0/e;", "firmwareEventsDao", "", "maxFileSize", "Lx42/b;", "batteryPackMetricWriter", "Lq83/j;", "ioContext", "<init>", "(Ltr2/n;Ljs0/c;Ljava/nio/file/Path;Lor2/b0;Lou0/a;Lou0/e;ILx42/b;Lq83/j;)V", "", "isConsole", "", "Lpu0/e;", "i", "(ZLq83/d;)Ljava/lang/Object;", "packets", "Ll83/k;", "", "l", "(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;", "Ljava/io/OutputStream;", "outputStream", "k", "(Ljava/util/List;Ljava/io/OutputStream;)[J", "Lf52/i;", "j", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "([JZLq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "b", "Ljs0/c;", "c", "Ljava/nio/file/Path;", "d", "Lor2/b0;", "e", "Lou0/a;", "f", "Lou0/e;", "g", "I", "Lx42/b;", "Lq83/j;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14105c {

    /* JADX INFO: renamed from: k */
    private static final StandardOpenOption[] f50656k = {StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Path androidCacheDir;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28148b0 fileProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC28370a consoleLogDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC28374e firmwareEventsDao;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int maxFileSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C37965b batteryPackMetricWriter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: f52.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatteryPackRelativeEventsFileExporter", m100430f = "BatteryPackRelativeEventsFileExporter.kt", m100431l = {52, 54, 58}, m100432m = "deleteBatteryPackRelativeEvents", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f50668F;

        /* JADX INFO: renamed from: w */
        Object f50669w;

        /* JADX INFO: renamed from: x */
        Object f50670x;

        /* JADX INFO: renamed from: y */
        boolean f50671y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f50672z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f50672z = obj;
            this.f50668F |= Integer.MIN_VALUE;
            return C14105c.this.m40189h(null, false, this);
        }
    }

    /* JADX INFO: renamed from: f52.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatteryPackRelativeEventsFileExporter", m100430f = "BatteryPackRelativeEventsFileExporter.kt", m100431l = {68, 71, 73, 76, 79}, m100432m = "getBatteryPackRelativeConsoleLogsToUpload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f50673E;

        /* JADX INFO: renamed from: G */
        int f50675G;

        /* JADX INFO: renamed from: w */
        boolean f50676w;

        /* JADX INFO: renamed from: x */
        int f50677x;

        /* JADX INFO: renamed from: y */
        Object f50678y;

        /* JADX INFO: renamed from: z */
        Object f50679z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f50673E = obj;
            this.f50675G |= Integer.MIN_VALUE;
            return C14105c.this.m40186i(false, this);
        }
    }

    /* JADX INFO: renamed from: f52.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatteryPackRelativeEventsFileExporter", m100430f = "BatteryPackRelativeEventsFileExporter.kt", m100431l = {37, 39, 44}, m100432m = "getBatteryPackRelativeEventsExport", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f50681F;

        /* JADX INFO: renamed from: w */
        boolean f50682w;

        /* JADX INFO: renamed from: x */
        Object f50683x;

        /* JADX INFO: renamed from: y */
        Object f50684y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f50685z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f50685z = obj;
            this.f50681F |= Integer.MIN_VALUE;
            return C14105c.this.m40190j(false, this);
        }
    }

    /* JADX INFO: renamed from: f52.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatteryPackRelativeEventsFileExporter$writePacketsToTempFile$2", m100430f = "BatteryPackRelativeEventsFileExporter.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Ll83/k;", "Ljava/nio/file/Path;", "", "<anonymous>", "(Lbc3/c0;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14105c f50686E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ List<InterfaceC29551e> f50687F;

        /* JADX INFO: renamed from: w */
        Object f50688w;

        /* JADX INFO: renamed from: x */
        Object f50689x;

        /* JADX INFO: renamed from: y */
        int f50690y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f50691z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z4, C14105c c14105c, List<? extends InterfaceC29551e> list, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f50691z = z4;
            this.f50686E = c14105c;
            this.f50687F = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f50691z, this.f50686E, this.f50687F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23465k> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f50690y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str = this.f50691z ? "bp_console_packets" : "bp_firmware_packets";
                try {
                    Path pathM85175a = InterfaceC28148b0.m85175a(this.f50686E.fileProvider, this.f50686E.androidCacheDir, str, null, new FileAttribute[0], 4, null);
                    StandardOpenOption[] standardOpenOptionArr = C14105c.f50656k;
                    OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
                    OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM85175a, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
                    AbstractC22676k.m65749i(outputStreamNewOutputStream, "newOutputStream(...)");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStreamNewOutputStream);
                    try {
                        long[] jArrM40187k = this.f50686E.m40187k(this.f50687F, bufferedOutputStream);
                        bufferedOutputStream.close();
                        return new C23465k(pathM85175a, jArrM40187k);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(bufferedOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (IOException e5) {
                    this.f50686E.logger.mo85230v("Error creating temp file for ".concat(str), e5, new AbstractC30556a.a[0]);
                    C37965b c37965b = this.f50686E.batteryPackMetricWriter;
                    this.f50688w = null;
                    this.f50689x = null;
                    this.f50690y = 1;
                    if (c37965b.m121603j(this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return null;
        }
    }

    public C14105c(InterfaceC34116n logger, AbstractC21909c configurationRepository, Path androidCacheDir, InterfaceC28148b0 fileProvider, InterfaceC28370a consoleLogDao, InterfaceC28374e firmwareEventsDao, int i13, C37965b batteryPackMetricWriter, InterfaceC30063j ioContext) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(androidCacheDir, "androidCacheDir");
        AbstractC22676k.m65750j(fileProvider, "fileProvider");
        AbstractC22676k.m65750j(consoleLogDao, "consoleLogDao");
        AbstractC22676k.m65750j(firmwareEventsDao, "firmwareEventsDao");
        AbstractC22676k.m65750j(batteryPackMetricWriter, "batteryPackMetricWriter");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        this.logger = logger;
        this.configurationRepository = configurationRepository;
        this.androidCacheDir = androidCacheDir;
        this.fileProvider = fileProvider;
        this.consoleLogDao = consoleLogDao;
        this.firmwareEventsDao = firmwareEventsDao;
        this.maxFileSize = i13;
        this.batteryPackMetricWriter = batteryPackMetricWriter;
        this.ioContext = ioContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x01f1 A[Catch: SQLiteException -> 0x01a7, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01a7, blocks: (B:97:0x01d6, B:99:0x01da, B:101:0x01f1, B:80:0x018c, B:82:0x0190, B:86:0x01a9, B:77:0x017a, B:94:0x01c4), top: B:116:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0205  */
    /* JADX WARN: Code duplicated, block: B:110:0x021d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190 A[Catch: SQLiteException -> 0x01a7, TryCatch #1 {SQLiteException -> 0x01a7, blocks: (B:97:0x01d6, B:99:0x01da, B:101:0x01f1, B:80:0x018c, B:82:0x0190, B:86:0x01a9, B:77:0x017a, B:94:0x01c4), top: B:116:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9 A[Catch: SQLiteException -> 0x01a7, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01a7, blocks: (B:97:0x01d6, B:99:0x01da, B:101:0x01f1, B:80:0x018c, B:82:0x0190, B:86:0x01a9, B:77:0x017a, B:94:0x01c4), top: B:116:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01da A[Catch: SQLiteException -> 0x01a7, TryCatch #1 {SQLiteException -> 0x01a7, blocks: (B:97:0x01d6, B:99:0x01da, B:101:0x01f1, B:80:0x018c, B:82:0x0190, B:86:0x01a9, B:77:0x017a, B:94:0x01c4), top: B:116:0x0031 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x0190, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x01da, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: i */
    public final Object m40186i(boolean z4, InterfaceC30057d<? super List<? extends InterfaceC29551e>> interfaceC30057d) {
        c cVar;
        ?? r10;
        SQLiteException sQLiteException;
        ?? r14;
        C37965b c37965b;
        Object objM125868N0;
        int iIntValue;
        String str;
        ?? r15;
        C29550d c29550d;
        ?? r16;
        C29548b c29548b;
        ?? r17 = z4;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f50675G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f50675G = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo86059c = cVar.f50673E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f50675G;
        ?? r18 = 5;
        C25271y c25271y = C25271y.f99162w;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objMo86059c);
                    AbstractC21909c abstractC21909c = this.configurationRepository;
                    Companion.C41578a c41578a = Companion.C41578a.f50666a;
                    C21908b configurations = abstractC21909c.getConfigurations();
                    String name = c41578a.getName();
                    Object defaultValue = c41578a.getDefaultValue();
                    C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                        String str2 = (String) configurations.get(name);
                        if (str2 != null) {
                            objM125868N0 = AbstractC39421y.m125932Q(str2);
                        } else {
                            objM125868N0 = null;
                        }
                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                        String str3 = (String) configurations.get(name);
                        if (str3 != null) {
                            objM125868N0 = AbstractC39421y.m125933R(str3);
                        } else {
                            objM125868N0 = null;
                        }
                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                        String str4 = (String) configurations.get(name);
                        if (str4 != null) {
                            objM125868N0 = AbstractC39420x.m125915y(str4);
                        } else {
                            objM125868N0 = null;
                        }
                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                        String str5 = (String) configurations.get(name);
                        if (str5 != null) {
                            objM125868N0 = AbstractC39420x.m125914x(str5);
                        } else {
                            objM125868N0 = null;
                        }
                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                        String str6 = (String) configurations.get(name);
                        if (str6 != null) {
                            objM125868N0 = AbstractC39414r.m125868N0(str6);
                        } else {
                            objM125868N0 = null;
                        }
                    } else {
                        objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
                    }
                    if (objM125868N0 != null) {
                        defaultValue = objM125868N0;
                    }
                    if (defaultValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    iIntValue = ((Integer) defaultValue).intValue();
                    str = r17 != 0 ? "console log" : "firmware event";
                    if (r17 != 0) {
                        InterfaceC28370a interfaceC28370a = this.consoleLogDao;
                        cVar.f50678y = str;
                        cVar.f50676w = r17;
                        cVar.f50677x = iIntValue;
                        cVar.f50675G = 1;
                        objMo86059c = interfaceC28370a.mo86042c(cVar);
                        if (objMo86059c == enumC31071a) {
                            r16 = r17;
                        } else {
                            r16 = r17;
                            c29548b = (C29548b) objMo86059c;
                            if (c29548b == null) {
                                this.logger.mo85228t("No " + str + " packets to upload", new AbstractC30556a.a[0]);
                                return c25271y;
                            }
                            InterfaceC28370a interfaceC28370a2 = this.consoleLogDao;
                            cVar.f50678y = str;
                            cVar.f50679z = null;
                            cVar.f50676w = r16;
                            cVar.f50677x = iIntValue;
                            cVar.f50675G = 2;
                            objMo86059c = interfaceC28370a2.mo86043e(c29548b, iIntValue, cVar);
                            if (objMo86059c != enumC31071a) {
                                return (List) objMo86059c;
                            }
                        }
                    } else {
                        InterfaceC28374e interfaceC28374e = this.firmwareEventsDao;
                        cVar.f50678y = str;
                        cVar.f50676w = r17;
                        cVar.f50677x = iIntValue;
                        cVar.f50675G = 3;
                        objMo86059c = interfaceC28374e.mo86059c(cVar);
                        if (objMo86059c == enumC31071a) {
                            r15 = r17;
                        } else {
                            r15 = r17;
                            c29550d = (C29550d) objMo86059c;
                            if (c29550d == null) {
                                this.logger.mo85228t("No " + str + " packets to upload", new AbstractC30556a.a[0]);
                                return c25271y;
                            }
                            InterfaceC28374e interfaceC28374e2 = this.firmwareEventsDao;
                            cVar.f50678y = str;
                            cVar.f50679z = null;
                            cVar.f50676w = r15;
                            cVar.f50677x = iIntValue;
                            cVar.f50675G = 4;
                            objMo86059c = interfaceC28374e2.mo86060e(c29550d, iIntValue, cVar);
                            if (objMo86059c != enumC31071a) {
                                return (List) objMo86059c;
                            }
                        }
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    try {
                        if (i14 == 2) {
                            int i15 = cVar.f50677x;
                            boolean z13 = cVar.f50676w;
                            AbstractC34132o.m107864I(objMo86059c);
                            return (List) objMo86059c;
                        }
                        if (i14 == 3) {
                            int i16 = cVar.f50677x;
                            boolean z14 = cVar.f50676w;
                            String str7 = (String) cVar.f50678y;
                            try {
                                AbstractC34132o.m107864I(objMo86059c);
                                iIntValue = i16;
                                r15 = z14;
                                str = str7;
                                r15 = r17;
                                c29550d = (C29550d) objMo86059c;
                                if (c29550d == null) {
                                    this.logger.mo85228t("No " + str + " packets to upload", new AbstractC30556a.a[0]);
                                    return c25271y;
                                }
                                InterfaceC28374e interfaceC28374e3 = this.firmwareEventsDao;
                                cVar.f50678y = str;
                                cVar.f50679z = null;
                                cVar.f50676w = r15;
                                cVar.f50677x = iIntValue;
                                cVar.f50675G = 4;
                                objMo86059c = interfaceC28374e3.mo86060e(c29550d, iIntValue, cVar);
                                if (objMo86059c != enumC31071a) {
                                }
                                return enumC31071a;
                            } catch (SQLiteException e5) {
                                e = e5;
                                i14 = i16;
                                r14 = z14;
                                r18 = str7;
                                c37965b = this.batteryPackMetricWriter;
                                cVar.f50678y = r18;
                                cVar.f50679z = e;
                                cVar.f50676w = r14;
                                cVar.f50677x = i14;
                                cVar.f50675G = 5;
                                if (c37965b.m121601h(cVar) != enumC31071a) {
                                    sQLiteException = e;
                                    r10 = r18;
                                    this.logger.mo85218i(AbstractC11895b.m31996o("Error fetching ", r10, " packets"), sQLiteException, new AbstractC30556a.a[0]);
                                    return c25271y;
                                }
                            }
                        } else {
                            if (i14 != 4) {
                                if (i14 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sQLiteException = (SQLiteException) cVar.f50679z;
                                String str8 = (String) cVar.f50678y;
                                AbstractC34132o.m107864I(objMo86059c);
                                r10 = str8;
                                this.logger.mo85218i(AbstractC11895b.m31996o("Error fetching ", r10, " packets"), sQLiteException, new AbstractC30556a.a[0]);
                                return c25271y;
                            }
                            int i17 = cVar.f50677x;
                            boolean z15 = cVar.f50676w;
                            AbstractC34132o.m107864I(objMo86059c);
                        }
                        return (List) objMo86059c;
                    } catch (SQLiteException e13) {
                        e = e13;
                        i14 = r17 == true ? 1 : 0;
                        r17 = i14;
                        r18 = " packets to upload";
                        r14 = r17;
                    }
                } else {
                    int i18 = cVar.f50677x;
                    boolean z16 = cVar.f50676w;
                    String str9 = (String) cVar.f50678y;
                    try {
                        AbstractC34132o.m107864I(objMo86059c);
                        iIntValue = i18;
                        r16 = z16;
                        str = str9;
                        r16 = r17;
                        c29548b = (C29548b) objMo86059c;
                        if (c29548b == null) {
                            this.logger.mo85228t("No " + str + " packets to upload", new AbstractC30556a.a[0]);
                            return c25271y;
                        }
                        InterfaceC28370a interfaceC28370a3 = this.consoleLogDao;
                        cVar.f50678y = str;
                        cVar.f50679z = null;
                        cVar.f50676w = r16;
                        cVar.f50677x = iIntValue;
                        cVar.f50675G = 2;
                        objMo86059c = interfaceC28370a3.mo86043e(c29548b, iIntValue, cVar);
                        if (objMo86059c != enumC31071a) {
                            return (List) objMo86059c;
                        }
                        return enumC31071a;
                    } catch (SQLiteException e14) {
                        e = e14;
                        i14 = i18;
                        r14 = z16;
                        r18 = str9;
                        c37965b = this.batteryPackMetricWriter;
                        cVar.f50678y = r18;
                        cVar.f50679z = e;
                        cVar.f50676w = r14;
                        cVar.f50677x = i14;
                        cVar.f50675G = 5;
                        if (c37965b.m121601h(cVar) != enumC31071a) {
                            sQLiteException = e;
                            r10 = r18;
                            this.logger.mo85218i(AbstractC11895b.m31996o("Error fetching ", r10, " packets"), sQLiteException, new AbstractC30556a.a[0]);
                            return c25271y;
                        }
                    }
                }
                c37965b = this.batteryPackMetricWriter;
                cVar.f50678y = r18;
                cVar.f50679z = e;
                cVar.f50676w = r14;
                cVar.f50677x = i14;
                cVar.f50675G = 5;
                if (c37965b.m121601h(cVar) != enumC31071a) {
                    sQLiteException = e;
                    r10 = r18;
                    this.logger.mo85218i(AbstractC11895b.m31996o("Error fetching ", r10, " packets"), sQLiteException, new AbstractC30556a.a[0]);
                    return c25271y;
                }
                return enumC31071a;
            } catch (SQLiteException e15) {
                e = e15;
                r14 = r17;
            }
        } catch (SQLiteException e16) {
            e = e16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final long[] m40187k(List<? extends InterfaceC29551e> packets, OutputStream outputStream) throws IOException {
        InterfaceC29551e interfaceC29551e = (InterfaceC29551e) AbstractC25265s.m74096F0(packets);
        long[] jArr = new long[packets.size()];
        int i13 = 0;
        int i14 = 0;
        int length = 0;
        for (Object obj : packets) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC29551e interfaceC29551e2 = (InterfaceC29551e) obj;
            int i16 = this.maxFileSize;
            if (length >= i16) {
                this.logger.mo85228t(AbstractC2875y.m8296i(i16, "Reached max file size of ", " bytes, stopping write"), new AbstractC30556a.a[0]);
                return AbstractC25260n.m74071l0(jArr, i13);
            }
            if (!AbstractC29549c.m90504a(interfaceC29551e2, interfaceC29551e)) {
                this.logger.mo85222m(AbstractC2875y.m8295h(i14, "found non matching packet at index "), new AbstractC30556a.a[0]);
                return AbstractC25260n.m74071l0(jArr, i13);
            }
            byte[] bArrArray = interfaceC29551e2.getPacketData().array();
            length += bArrArray.length;
            jArr[i13] = interfaceC29551e2.getId();
            outputStream.write(bArrArray);
            i14 = i15;
            i13++;
        }
        return AbstractC25260n.m74071l0(jArr, i13);
    }

    /* JADX INFO: renamed from: l */
    private final Object m40188l(boolean z4, List<? extends InterfaceC29551e> list, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.ioContext, new e(z4, this, list, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: h */
    public final Object m40189h(long[] jArr, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        SQLiteException sQLiteException;
        boolean z13;
        long[] jArr2 = jArr;
        boolean z14 = z4;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f50668F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f50668F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo86057a = bVar.f50672z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f50668F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo86057a);
                if (jArr2.length == 0) {
                    return c23454a0;
                }
                if (z14) {
                    InterfaceC28370a interfaceC28370a = this.consoleLogDao;
                    bVar.f50669w = jArr2;
                    bVar.f50671y = z14;
                    bVar.f50668F = 1;
                    objMo86057a = interfaceC28370a.mo86040a(jArr2, bVar);
                    if (objMo86057a == enumC31071a) {
                    }
                    ((Number) objMo86057a).intValue();
                } else {
                    InterfaceC28374e interfaceC28374e = this.firmwareEventsDao;
                    bVar.f50669w = jArr2;
                    bVar.f50671y = z14;
                    bVar.f50668F = 2;
                    objMo86057a = interfaceC28374e.mo86057a(jArr2, bVar);
                    if (objMo86057a == enumC31071a) {
                    }
                    ((Number) objMo86057a).intValue();
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                z14 = bVar.f50671y;
                jArr2 = (long[]) bVar.f50669w;
                AbstractC34132o.m107864I(objMo86057a);
                ((Number) objMo86057a).intValue();
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z13 = bVar.f50671y;
                    sQLiteException = (SQLiteException) bVar.f50670x;
                    AbstractC34132o.m107864I(objMo86057a);
                    this.logger.mo85230v(AbstractC11895b.m31996o("Error deleting battery pack relative ", z13 ? "console" : "firmware", " events"), sQLiteException, new AbstractC30556a.a[0]);
                    return c23454a0;
                }
                z14 = bVar.f50671y;
                jArr2 = (long[]) bVar.f50669w;
                AbstractC34132o.m107864I(objMo86057a);
                ((Number) objMo86057a).intValue();
            }
            this.logger.mo85228t("Deleted " + jArr2.length + " battery pack relative " + (z14 ? "console" : "firmware") + " events", new AbstractC30556a.a[0]);
        } catch (SQLiteException e5) {
            C37965b c37965b = this.batteryPackMetricWriter;
            bVar.f50669w = null;
            bVar.f50670x = e5;
            bVar.f50671y = z14;
            bVar.f50668F = 3;
            if (c37965b.m121599f(bVar) != enumC31071a) {
                boolean z15 = z14;
                sQLiteException = e5;
                z13 = z15;
            }
            return enumC31071a;
        }
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m40190j(boolean z4, InterfaceC30057d<? super C14111i> interfaceC30057d) {
        d dVar;
        C14104b c14104b;
        C23465k c23465k;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f50681F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f50681F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM40186i = dVar.f50685z;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f50681F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40186i);
            dVar.f50682w = z4;
            dVar.f50681F = 1;
            objM40186i = m40186i(z4, dVar);
            if (objM40186i != obj) {
            }
            return obj;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                AbstractC34132o.m107864I(objM40186i);
                return null;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c14104b = (C14104b) dVar.f50684y;
            AbstractC34132o.m107864I(objM40186i);
            c23465k = (C23465k) objM40186i;
            if (c23465k == null) {
                return null;
            }
            return new C14111i((Path) c23465k.f92937w, c14104b, (long[]) c23465k.f92938x);
        }
        z4 = dVar.f50682w;
        AbstractC34132o.m107864I(objM40186i);
        List<? extends InterfaceC29551e> list = (List) objM40186i;
        if (list.isEmpty()) {
            C37965b c37965b = this.batteryPackMetricWriter;
            dVar.f50683x = null;
            dVar.f50682w = z4;
            dVar.f50681F = 2;
            if (c37965b.m121596c(z4, dVar) != obj) {
                return null;
            }
        } else {
            C14104b c14104bM40178a = C14104b.INSTANCE.m40178a(((InterfaceC29551e) AbstractC25265s.m74096F0(list)).getMetaData());
            dVar.f50683x = null;
            dVar.f50684y = c14104bM40178a;
            dVar.f50682w = z4;
            dVar.f50681F = 3;
            objM40186i = m40188l(z4, list, dVar);
            if (objM40186i != obj) {
                c14104b = c14104bM40178a;
                c23465k = (C23465k) objM40186i;
                if (c23465k == null) {
                    return null;
                }
                return new C14111i((Path) c23465k.f92937w, c14104b, (long[]) c23465k.f92938x);
            }
        }
        return obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14105c(InterfaceC34116n interfaceC34116n, AbstractC21909c abstractC21909c, Path path, InterfaceC28148b0 interfaceC28148b0, InterfaceC28370a interfaceC28370a, InterfaceC28374e interfaceC28374e, int i13, C37965b c37965b, InterfaceC30063j interfaceC30063j, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC34116n = (i14 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BatteryPackRelativeEventsFileExporter") : interfaceC34116n;
        interfaceC28148b0 = (i14 & 8) != 0 ? new C28207v() : interfaceC28148b0;
        if ((i14 & 256) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        this(interfaceC34116n, abstractC21909c, path, interfaceC28148b0, interfaceC28370a, interfaceC28374e, i13, c37965b, interfaceC30063j);
    }
}
