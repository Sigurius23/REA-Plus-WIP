package w62;

import com.whoop.researchPacket.api.ResearchMetricsApi;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import js0.AbstractC21909c;
import l83.C23454a0;
import l83.C23468n;
import mh2.C25561a;
import no.nordicsemi.android.dfu.DfuBaseService;
import oh2.C27940c;
import oh2.C27941d;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import vt0.C36484a;
import y62.C39263b;

/* JADX INFO: renamed from: w62.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u001cBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lw62/a;", "", "Ljava/io/File;", "androidCacheDir", "Ly62/b;", "researchPacketDbManager", "Lcom/whoop/researchPacket/api/ResearchMetricsApi;", "researchMetricsApi", "Ljs0/c;", "configurationRepository", "Lmh2/a;", "strapMetadataDaoInteractor", "Lvt0/a;", "dataPacketUploadFileWriter", "Ltr2/n;", "logger", "<init>", "(Ljava/io/File;Ly62/b;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Lmh2/a;Lvt0/a;Ltr2/n;)V", "", "revision", "", "numberOfPacketsToUpload", "Ll83/n;", "Ll83/a0;", "c", "(SILq83/d;)Ljava/lang/Object;", "d", "(Lq83/d;)Ljava/lang/Object;", "a", "Ljava/io/File;", "b", "Ly62/b;", "Lcom/whoop/researchPacket/api/ResearchMetricsApi;", "Ljs0/c;", "e", "Lmh2/a;", "f", "Lvt0/a;", "g", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "research-packet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36865a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final File androidCacheDir;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39263b researchPacketDbManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ResearchMetricsApi researchMetricsApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C25561a strapMetadataDaoInteractor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C36484a dataPacketUploadFileWriter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w62.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.researchPacket.data.ResearchPacketsUploader", m100430f = "ResearchPacketsUploader.kt", m100431l = {53, 59, 65, 84}, m100432m = "uploadPacketsByRevision-0E7RQCE", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f157669E;

        /* JADX INFO: renamed from: F */
        Object f157670F;

        /* JADX INFO: renamed from: G */
        Object f157671G;

        /* JADX INFO: renamed from: H */
        Object f157672H;

        /* JADX INFO: renamed from: I */
        Object f157673I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f157674J;

        /* JADX INFO: renamed from: L */
        int f157676L;

        /* JADX INFO: renamed from: w */
        short f157677w;

        /* JADX INFO: renamed from: x */
        int f157678x;

        /* JADX INFO: renamed from: y */
        Object f157679y;

        /* JADX INFO: renamed from: z */
        Object f157680z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f157674J = obj;
            this.f157676L |= Integer.MIN_VALUE;
            Object objM118242c = C36865a.this.m118242c((short) 0, 0, this);
            return objM118242c == EnumC31071a.f128113w ? objM118242c : new C23468n(objM118242c);
        }
    }

    /* JADX INFO: renamed from: w62.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.researchPacket.data.ResearchPacketsUploader$uploadPacketsByRevision$response$1", m100430f = "ResearchPacketsUploader.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f157681w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC34846v0 f157682x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36865a f157683y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27941d f157684z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC34846v0 abstractC34846v0, C36865a c36865a, C27941d c27941d, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f157682x = abstractC34846v0;
            this.f157683y = c36865a;
            this.f157684z = c27941d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f157682x, this.f157683y, this.f157684z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e c27942eM84346g;
            String strM84360f;
            InterfaceC27939b interfaceC27939bM84344e;
            String strMo84319a;
            C27940c c27940cM84345f;
            String strM84332d;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f157681w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f157682x != null) {
                    ResearchMetricsApi researchMetricsApi = this.f157683y.researchMetricsApi;
                    AbstractC34846v0 abstractC34846v0 = this.f157682x;
                    C27941d c27941d = this.f157684z;
                    String str = (c27941d == null || (c27940cM84345f = c27941d.m84345f()) == null || (strM84332d = c27940cM84345f.m84332d()) == null) ? "" : strM84332d;
                    C27941d c27941d2 = this.f157684z;
                    String str2 = (c27941d2 == null || (interfaceC27939bM84344e = c27941d2.m84344e()) == null || (strMo84319a = interfaceC27939bM84344e.mo84319a()) == null) ? "" : strMo84319a;
                    C27941d c27941d3 = this.f157684z;
                    String str3 = (c27941d3 == null || (c27942eM84346g = c27941d3.m84346g()) == null || (strM84360f = c27942eM84346g.m84360f()) == null) ? "" : strM84360f;
                    C27941d c27941d4 = this.f157684z;
                    String strValueOf = String.valueOf(c27941d4 != null ? Byte.valueOf(c27941d4.m84342c()) : null);
                    C27941d c27941d5 = this.f157684z;
                    String strValueOf2 = String.valueOf(c27941d5 != null ? Byte.valueOf(c27941d5.m84343d()) : null);
                    this.f157681w = 1;
                    if (researchMetricsApi.uploadResearchPackets(abstractC34846v0, DfuBaseService.MIME_TYPE_OCTET_STREAM, "gzip", str2, strValueOf2, str3, strValueOf, str, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: w62.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.researchPacket.data.ResearchPacketsUploader", m100430f = "ResearchPacketsUploader.kt", m100431l = {39}, m100432m = "uploadResearchPackets-IoAF18A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f157685E;

        /* JADX INFO: renamed from: F */
        Object f157686F;

        /* JADX INFO: renamed from: G */
        Object f157687G;

        /* JADX INFO: renamed from: H */
        Object f157688H;

        /* JADX INFO: renamed from: I */
        Object f157689I;

        /* JADX INFO: renamed from: J */
        Object f157690J;

        /* JADX INFO: renamed from: K */
        short f157691K;

        /* JADX INFO: renamed from: L */
        /* synthetic */ Object f157692L;

        /* JADX INFO: renamed from: N */
        int f157694N;

        /* JADX INFO: renamed from: w */
        int f157695w;

        /* JADX INFO: renamed from: x */
        int f157696x;

        /* JADX INFO: renamed from: y */
        int f157697y;

        /* JADX INFO: renamed from: z */
        int f157698z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f157692L = obj;
            this.f157694N |= Integer.MIN_VALUE;
            Object objM118243d = C36865a.this.m118243d(this);
            return objM118243d == EnumC31071a.f128113w ? objM118243d : new C23468n(objM118243d);
        }
    }

    public C36865a(File androidCacheDir, C39263b researchPacketDbManager, ResearchMetricsApi researchMetricsApi, AbstractC21909c configurationRepository, C25561a strapMetadataDaoInteractor, C36484a dataPacketUploadFileWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(androidCacheDir, "androidCacheDir");
        AbstractC22676k.m65750j(researchPacketDbManager, "researchPacketDbManager");
        AbstractC22676k.m65750j(researchMetricsApi, "researchMetricsApi");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(strapMetadataDaoInteractor, "strapMetadataDaoInteractor");
        AbstractC22676k.m65750j(dataPacketUploadFileWriter, "dataPacketUploadFileWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.androidCacheDir = androidCacheDir;
        this.researchPacketDbManager = researchPacketDbManager;
        this.researchMetricsApi = researchMetricsApi;
        this.configurationRepository = configurationRepository;
        this.strapMetadataDaoInteractor = strapMetadataDaoInteractor;
        this.dataPacketUploadFileWriter = dataPacketUploadFileWriter;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104 A[Catch: all -> 0x0212, Exception -> 0x0215, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x0215, all -> 0x0212, blocks: (B:50:0x00f8, B:54:0x0104), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b A[Catch: all -> 0x0060, Exception -> 0x0156, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x005b, B:113:0x0221, B:82:0x01a4, B:84:0x01aa, B:86:0x01af, B:91:0x01d4, B:93:0x01d9, B:96:0x0201, B:97:0x0206, B:60:0x0137, B:62:0x013b, B:64:0x0141, B:70:0x015b, B:73:0x0165, B:75:0x0171, B:77:0x019a), top: B:118:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x015b A[Catch: all -> 0x0060, Exception -> 0x0156, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x005b, B:113:0x0221, B:82:0x01a4, B:84:0x01aa, B:86:0x01af, B:91:0x01d4, B:93:0x01d9, B:96:0x0201, B:97:0x0206, B:60:0x0137, B:62:0x013b, B:64:0x0141, B:70:0x015b, B:73:0x0165, B:75:0x0171, B:77:0x019a), top: B:118:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x0165 A[Catch: all -> 0x0060, Exception -> 0x0156, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x005b, B:113:0x0221, B:82:0x01a4, B:84:0x01aa, B:86:0x01af, B:91:0x01d4, B:93:0x01d9, B:96:0x0201, B:97:0x0206, B:60:0x0137, B:62:0x013b, B:64:0x0141, B:70:0x015b, B:73:0x0165, B:75:0x0171, B:77:0x019a), top: B:118:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa A[Catch: all -> 0x0060, Exception -> 0x0156, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x005b, B:113:0x0221, B:82:0x01a4, B:84:0x01aa, B:86:0x01af, B:91:0x01d4, B:93:0x01d9, B:96:0x0201, B:97:0x0206, B:60:0x0137, B:62:0x013b, B:64:0x0141, B:70:0x015b, B:73:0x0165, B:75:0x0171, B:77:0x019a), top: B:118:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d4 A[Catch: all -> 0x0060, Exception -> 0x01d2, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x005b, B:113:0x0221, B:82:0x01a4, B:84:0x01aa, B:86:0x01af, B:91:0x01d4, B:93:0x01d9, B:96:0x0201, B:97:0x0206, B:60:0x0137, B:62:0x013b, B:64:0x0141, B:70:0x015b, B:73:0x0165, B:75:0x0171, B:77:0x019a), top: B:118:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d9 A[Catch: all -> 0x0060, Exception -> 0x01d2, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x005b, B:113:0x0221, B:82:0x01a4, B:84:0x01aa, B:86:0x01af, B:91:0x01d4, B:93:0x01d9, B:96:0x0201, B:97:0x0206, B:60:0x0137, B:62:0x013b, B:64:0x0141, B:70:0x015b, B:73:0x0165, B:75:0x0171, B:77:0x019a), top: B:118:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0201 A[Catch: all -> 0x0060, Exception -> 0x01d2, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x005b, B:113:0x0221, B:82:0x01a4, B:84:0x01aa, B:86:0x01af, B:91:0x01d4, B:93:0x01d9, B:96:0x0201, B:97:0x0206, B:60:0x0137, B:62:0x013b, B:64:0x0141, B:70:0x015b, B:73:0x0165, B:75:0x0171, B:77:0x019a), top: B:118:0x0034 }] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cf, code lost:
    
        if (r5.m125055a(r8, r13) == r6) goto L88;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01d9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [ud3.v0] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [ud3.v0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [oh2.d] */
    /* JADX WARN: Type inference failed for: r7v2, types: [y62.b] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v9, types: [wp0.a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m118242c(short r22, int r23, q83.InterfaceC30057d<? super l83.C23468n> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w62.C36865a.m118242c(short, int, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0165 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0166  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0166 -> B:55:0x0167). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m118243d(q83.InterfaceC30057d<? super l83.C23468n> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w62.C36865a.m118243d(q83.d):java.lang.Object");
    }

    public /* synthetic */ C36865a(File file, C39263b c39263b, ResearchMetricsApi researchMetricsApi, AbstractC21909c abstractC21909c, C25561a c25561a, C36484a c36484a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, c39263b, researchMetricsApi, abstractC21909c, c25561a, c36484a, (i13 & 64) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ResearchPacketsUploader") : interfaceC34116n);
    }
}
