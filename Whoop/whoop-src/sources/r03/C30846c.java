package r03;

import android.os.Build;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bt0.C3617a;
import bt0.C3618b;
import c93.InterfaceC4351m;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.domain.exception.ConsolePacketUploadException;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js0.AbstractC21909c;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23457c;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.C30064k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import retrofit2.HttpException;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import yt0.InterfaceC39762a;
import zt0.C41123a;

/* JADX INFO: renamed from: r03.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001fH\u0082@¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lr03/c;", "Lr03/b;", "Lyt0/a;", "consolePacketsDao", "Lcom/whoop/data/remote/RemoteDataSource;", "remoteDataSource", "Lrr2/c;", "crashReporter", "Ljs0/c;", "configurationRepository", "<init>", "(Lyt0/a;Lcom/whoop/data/remote/RemoteDataSource;Lrr2/c;Ljs0/c;)V", "Lud3/v0;", "gzipBody", "Lzt0/a;", "topRow", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lud3/v0;Lzt0/a;)Z", "", "rows", "", "k", "(Ljava/util/List;)[B", "", "", "j", "(Lzt0/a;)Ljava/util/Map;", "Ll83/a0;", "l", "(Lq83/d;)Ljava/lang/Object;", "Lbt0/b;", "i", "Lic/u;", "a", "Lyt0/a;", "b", "Lcom/whoop/data/remote/RemoteDataSource;", "c", "Lrr2/c;", "d", "Ljs0/c;", "Ltr2/n;", "e", "Ltr2/n;", "log", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C30846c implements InterfaceC30845b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39762a consolePacketsDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RemoteDataSource remoteDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: r03.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploaderImpl$doUpload$1", m100430f = "ConsolePacketUploaderImpl.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f127194w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34846v0 f127196y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C41123a f127197z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC34846v0 abstractC34846v0, C41123a c41123a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f127196y = abstractC34846v0;
            this.f127197z = c41123a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30846c.this.new a(this.f127196y, this.f127197z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f127194w;
            boolean z4 = false;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    RemoteDataSource remoteDataSource = C30846c.this.remoteDataSource;
                    AbstractC34846v0 abstractC34846v0 = this.f127196y;
                    Map<String, String> mapM94878j = C30846c.this.m94878j(this.f127197z);
                    this.f127194w = 1;
                    obj = remoteDataSource.uploadConsoleEventPackets(abstractC34846v0, mapM94878j, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                z4 = ((C29218v0) obj).f118269a.f146788Q;
            } catch (IOException e5) {
                C30846c.this.log.mo85222m(AbstractC11266d.m30461o("Caught a network exception while uploading console logs: ", e5.getMessage()), new AbstractC30556a.a[0]);
            } catch (NullPointerException e13) {
                InterfaceC31766c.m98634e(C30846c.this.crashReporter, new ConsolePacketUploadException(AbstractC11266d.m30461o("Caught a NPE during upload of console logs: ", e13.getMessage()), e13), null, 2, null);
            } catch (HttpException e14) {
                C30846c.this.log.mo85222m(AbstractC11266d.m30461o("Failed to upload console logs ", e14.getMessage()), new AbstractC30556a.a[0]);
            } catch (Exception e15) {
                InterfaceC31766c.m98634e(C30846c.this.crashReporter, new ConsolePacketUploadException("Some error occurred while uploading console logs!", e15), null, 2, null);
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: r03.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploaderImpl", m100430f = "ConsolePacketUploaderImpl.kt", m100431l = {154}, m100432m = "getDayBoundaries", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f127198w;

        /* JADX INFO: renamed from: y */
        int f127200y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f127198w = obj;
            this.f127200y |= Integer.MIN_VALUE;
            return C30846c.this.m94877i(this);
        }
    }

    /* JADX INFO: renamed from: r03.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploaderImpl", m100430f = "ConsolePacketUploaderImpl.kt", m100431l = {143, 147, 149}, m100432m = "removeOlderStrapLogs", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f127202F;

        /* JADX INFO: renamed from: w */
        long f127203w;

        /* JADX INFO: renamed from: x */
        Object f127204x;

        /* JADX INFO: renamed from: y */
        int f127205y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f127206z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f127206z = obj;
            this.f127202F |= Integer.MIN_VALUE;
            return C30846c.this.m94880l(this);
        }
    }

    /* JADX INFO: renamed from: r03.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploaderImpl", m100430f = "ConsolePacketUploaderImpl.kt", m100431l = {38, 41, 43, 50, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "uploadEvents", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f127207E;

        /* JADX INFO: renamed from: F */
        Object f127208F;

        /* JADX INFO: renamed from: G */
        Object f127209G;

        /* JADX INFO: renamed from: H */
        Object f127210H;

        /* JADX INFO: renamed from: I */
        Object f127211I;

        /* JADX INFO: renamed from: J */
        Object f127212J;

        /* JADX INFO: renamed from: K */
        Object f127213K;

        /* JADX INFO: renamed from: L */
        Object f127214L;

        /* JADX INFO: renamed from: M */
        double f127215M;

        /* JADX INFO: renamed from: N */
        boolean f127216N;

        /* JADX INFO: renamed from: O */
        long f127217O;

        /* JADX INFO: renamed from: P */
        /* synthetic */ Object f127218P;

        /* JADX INFO: renamed from: R */
        int f127220R;

        /* JADX INFO: renamed from: w */
        int f127221w;

        /* JADX INFO: renamed from: x */
        Object f127222x;

        /* JADX INFO: renamed from: y */
        Object f127223y;

        /* JADX INFO: renamed from: z */
        Object f127224z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f127218P = obj;
            this.f127220R |= Integer.MIN_VALUE;
            return C30846c.this.mo94869a(this);
        }
    }

    public C30846c(InterfaceC39762a consolePacketsDao, RemoteDataSource remoteDataSource, InterfaceC31766c crashReporter, AbstractC21909c configurationRepository) {
        AbstractC22676k.m65750j(consolePacketsDao, "consolePacketsDao");
        AbstractC22676k.m65750j(remoteDataSource, "remoteDataSource");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        this.consolePacketsDao = consolePacketsDao;
        this.remoteDataSource = remoteDataSource;
        this.crashReporter = crashReporter;
        this.configurationRepository = configurationRepository;
        this.log = InterfaceC34116n.INSTANCE.m107848a("ConsolePacketUploaderImpl");
    }

    /* JADX INFO: renamed from: h */
    private final boolean m94876h(AbstractC34846v0 gzipBody, C41123a topRow) {
        return ((Boolean) AbstractC3006f0.m8699E(C30064k.f122676w, new a(gzipBody, topRow, null))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m94877i(InterfaceC30057d<? super C3618b> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f127200y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f127200y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo127276b = bVar.f127198w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f127200y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo127276b);
            InterfaceC39762a interfaceC39762a = this.consolePacketsDao;
            bVar.f127200y = 1;
            objMo127276b = interfaceC39762a.mo127276b(1, bVar);
            if (objMo127276b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo127276b);
        }
        List list = (List) objMo127276b;
        if (list.size() > 0) {
            return C3617a.f14712a.m10978a(new DateTime(((C41123a) list.get(0)).getPacketTimeStampMillis()));
        }
        this.log.mo85222m("Console packet table is empty. Retry Later!", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final Map<String, String> m94878j(C41123a topRow) {
        return AbstractC25247g0.m73990Y(new C23465k("Content-Type", DfuBaseService.MIME_TYPE_OCTET_STREAM), new C23465k("Content-Encoding", "gzip"), new C23465k("X-WHOOP-Strap-ID", topRow.getStrapId()), new C23465k("X-WHOOP-HW-Version", topRow.getHardwareVersion()), new C23465k("X-WHOOP-FW-Version", topRow.getMaximVersion()), new C23465k("X-WHOOP-DSP-Version", topRow.getDspVersion()), new C23465k("X-WHOOP-Nordic-Version", topRow.getNordicVersion()), new C23465k("X-WHOOP-Device-Model", AbstractC18489d0.m53370k(Build.BRAND, " ", Build.MODEL)), new C23465k("X-WHOOP-Device-OS", Build.VERSION.RELEASE), new C23465k("X-WHOOP-Device-Platform", "ANDROID"));
    }

    /* JADX INFO: renamed from: k */
    private final byte[] m94879k(List<C41123a> rows) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<C41123a> it = rows.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(it.next().getReceivedPacketRaw().array());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC22676k.m65749i(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0178, code lost:
    
        if (r14 == r1) goto L63;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m94880l(q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r03.C30846c.m94880l(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x0273  */
    /* JADX WARN: Code duplicated, block: B:83:0x030c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f0, code lost:
    
        if (r1 == r2) goto L80;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0273, please report this as an issue */
    @Override // r03.InterfaceC30845b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo94869a(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r03.C30846c.mo94869a(q83.d):java.lang.Object");
    }
}
