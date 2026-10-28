package j52;

import androidx.room.AbstractC1772c1;
import com.whoop.pulseinformationpacket.network.PulseInformationMetricsApi;
import hu0.C17643d;
import hu0.InterfaceC17640a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import js0.AbstractC21909c;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import mh2.C25561a;
import no.nordicsemi.android.dfu.DfuBaseService;
import oh2.C27941d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34844u0;
import vt0.C36484a;
import vt0.C36485b;
import wp0.C37496a;
import yb3.C39412p;

/* JADX INFO: renamed from: j52.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, m65681d2 = {"Lj52/c;", "Lj52/b;", "Ltr2/n;", "logger", "Ljava/io/File;", "androidCacheDir", "Lcom/whoop/pulseinformationpacket/network/PulseInformationMetricsApi;", "pipMetricsApi", "Lhu0/a;", "dataPacketDao", "Ljs0/c;", "configurationRepository", "Lmh2/a;", "strapMetadataDaoInteractor", "Lvt0/a;", "dataPacketUploadFileWriter", "<init>", "(Ltr2/n;Ljava/io/File;Lcom/whoop/pulseinformationpacket/network/PulseInformationMetricsApi;Lhu0/a;Ljs0/c;Lmh2/a;Lvt0/a;)V", "", "revision", "", "Lhu0/d;", "packets", "", "f", "(SLjava/util/List;Lq83/d;)Ljava/lang/Object;", "Loh2/d;", "strapData", "", "", "e", "(Loh2/d;S)Ljava/util/Map;", "Lic/u;", "a", "(Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "b", "Ljava/io/File;", "c", "Lcom/whoop/pulseinformationpacket/network/PulseInformationMetricsApi;", "d", "Lhu0/a;", "Ljs0/c;", "Lmh2/a;", "g", "Lvt0/a;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Set;", "revisionsToUpload", "i", "pulseInformationPacket_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21342c implements InterfaceC21341b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final File androidCacheDir;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final PulseInformationMetricsApi pipMetricsApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC17640a dataPacketDao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C25561a strapMetadataDaoInteractor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C36484a dataPacketUploadFileWriter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Set<Short> revisionsToUpload;

    /* JADX INFO: renamed from: j52.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.pulseinformationpacket.network.PipUploaderImpl", m100430f = "PipUploader.kt", m100431l = {45, 50}, m100432m = "upload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f81622E;

        /* JADX INFO: renamed from: F */
        Object f81623F;

        /* JADX INFO: renamed from: G */
        Object f81624G;

        /* JADX INFO: renamed from: H */
        Object f81625H;

        /* JADX INFO: renamed from: I */
        Object f81626I;

        /* JADX INFO: renamed from: J */
        Object f81627J;

        /* JADX INFO: renamed from: K */
        Object f81628K;

        /* JADX INFO: renamed from: L */
        short f81629L;

        /* JADX INFO: renamed from: M */
        /* synthetic */ Object f81630M;

        /* JADX INFO: renamed from: O */
        int f81632O;

        /* JADX INFO: renamed from: w */
        int f81633w;

        /* JADX INFO: renamed from: x */
        int f81634x;

        /* JADX INFO: renamed from: y */
        int f81635y;

        /* JADX INFO: renamed from: z */
        int f81636z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81630M = obj;
            this.f81632O |= Integer.MIN_VALUE;
            return C21342c.this.mo59944a(this);
        }
    }

    /* JADX INFO: renamed from: j52.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.pulseinformationpacket.network.PipUploaderImpl", m100430f = "PipUploader.kt", m100431l = {68, 76, 87}, m100432m = "uploadByRevision", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f81637E;

        /* JADX INFO: renamed from: F */
        Object f81638F;

        /* JADX INFO: renamed from: G */
        Object f81639G;

        /* JADX INFO: renamed from: H */
        int f81640H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f81641I;

        /* JADX INFO: renamed from: K */
        int f81643K;

        /* JADX INFO: renamed from: w */
        short f81644w;

        /* JADX INFO: renamed from: x */
        Object f81645x;

        /* JADX INFO: renamed from: y */
        Object f81646y;

        /* JADX INFO: renamed from: z */
        Object f81647z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81641I = obj;
            this.f81643K |= Integer.MIN_VALUE;
            return C21342c.this.m59949f((short) 0, null, this);
        }
    }

    /* JADX INFO: renamed from: j52.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.pulseinformationpacket.network.PipUploaderImpl$uploadByRevision$2", m100430f = "PipUploader.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ short f81648E;

        /* JADX INFO: renamed from: w */
        int f81649w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC34846v0 f81650x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C27941d f81651y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21342c f81652z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC34846v0 abstractC34846v0, C27941d c27941d, C21342c c21342c, short s13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f81650x = abstractC34846v0;
            this.f81651y = c27941d;
            this.f81652z = c21342c;
            this.f81648E = s13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f81650x, this.f81651y, this.f81652z, this.f81648E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81649w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f81650x != null && this.f81651y != null) {
                    PulseInformationMetricsApi pulseInformationMetricsApi = this.f81652z.pipMetricsApi;
                    AbstractC34846v0 abstractC34846v0 = this.f81650x;
                    Map<String, String> mapM59948e = this.f81652z.m59948e(this.f81651y, this.f81648E);
                    this.f81649w = 1;
                    if (pulseInformationMetricsApi.uploadPipRawData(abstractC34846v0, mapM59948e, this) == enumC31071a) {
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
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C21342c(InterfaceC34116n logger, File androidCacheDir, PulseInformationMetricsApi pipMetricsApi, InterfaceC17640a dataPacketDao, AbstractC21909c configurationRepository, C25561a strapMetadataDaoInteractor, C36484a dataPacketUploadFileWriter) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(androidCacheDir, "androidCacheDir");
        AbstractC22676k.m65750j(pipMetricsApi, "pipMetricsApi");
        AbstractC22676k.m65750j(dataPacketDao, "dataPacketDao");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(strapMetadataDaoInteractor, "strapMetadataDaoInteractor");
        AbstractC22676k.m65750j(dataPacketUploadFileWriter, "dataPacketUploadFileWriter");
        this.logger = logger;
        this.androidCacheDir = androidCacheDir;
        this.pipMetricsApi = pipMetricsApi;
        this.dataPacketDao = dataPacketDao;
        this.configurationRepository = configurationRepository;
        this.strapMetadataDaoInteractor = strapMetadataDaoInteractor;
        this.dataPacketUploadFileWriter = dataPacketUploadFileWriter;
        this.revisionsToUpload = AbstractC25260n.m74059b1(new Short[]{25, 26});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final Map<String, String> m59948e(C27941d strapData, short revision) {
        return AbstractC25247g0.m73990Y(new C23465k("Content-Encoding", "gzip"), new C23465k("X-WHOOP-HW-VERSION", strapData.m84345f().m84332d()), new C23465k("X-WHOOP-FW-Version", strapData.m84344e().mo84319a()), new C23465k("X-WHOOP-DSP-Version", strapData.m84346g().m84360f()), new C23465k("X-WHOOP-Strap-Id", strapData.m84347h()), new C23465k("X-WHOOP-Binary-Version", String.valueOf((int) strapData.m84343d())), new C23465k("X-WHOOP-Binary-Flags", String.valueOf((int) strapData.m84342c())), new C23465k("X-WHOOP-Raw-Binary-Version", String.valueOf((int) revision)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:116:0x024f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0255  */
    /* JADX WARN: Code duplicated, block: B:138:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0102 A[Catch: all -> 0x011c, Exception -> 0x0120, TryCatch #15 {Exception -> 0x0120, all -> 0x011c, blocks: (B:48:0x00fc, B:50:0x0102, B:58:0x0128), top: B:138:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0128 A[Catch: all -> 0x011c, Exception -> 0x0120, TRY_LEAVE, TryCatch #15 {Exception -> 0x0120, all -> 0x011c, blocks: (B:48:0x00fc, B:50:0x0102, B:58:0x0128), top: B:138:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x018b A[Catch: all -> 0x0058, Exception -> 0x01de, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x01de, blocks: (B:68:0x0183, B:71:0x018b), top: B:125:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce A[Catch: all -> 0x0058, Exception -> 0x01d8, TryCatch #5 {Exception -> 0x01d8, blocks: (B:78:0x01ce, B:80:0x01d4, B:89:0x0213, B:73:0x01aa, B:86:0x01e1, B:88:0x01e6, B:93:0x021d, B:94:0x0222), top: B:123:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01e1 A[Catch: all -> 0x0058, Exception -> 0x01d8, TryCatch #5 {Exception -> 0x01d8, blocks: (B:78:0x01ce, B:80:0x01d4, B:89:0x0213, B:73:0x01aa, B:86:0x01e1, B:88:0x01e6, B:93:0x021d, B:94:0x0222), top: B:123:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e6 A[Catch: all -> 0x0058, Exception -> 0x01d8, TryCatch #5 {Exception -> 0x01d8, blocks: (B:78:0x01ce, B:80:0x01d4, B:89:0x0213, B:73:0x01aa, B:86:0x01e1, B:88:0x01e6, B:93:0x021d, B:94:0x0222), top: B:123:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0219  */
    /* JADX WARN: Code duplicated, block: B:93:0x021d A[Catch: all -> 0x0058, Exception -> 0x01d8, TRY_ENTER, TryCatch #5 {Exception -> 0x01d8, blocks: (B:78:0x01ce, B:80:0x01d4, B:89:0x0213, B:73:0x01aa, B:86:0x01e1, B:88:0x01e6, B:93:0x021d, B:94:0x0222), top: B:123:0x002f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x018b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x01e6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final Object m59949f(short s13, List<C17643d> list, InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        c cVar;
        int i13;
        File file;
        boolean z4;
        c cVar2;
        AbstractC34846v0 abstractC34846v0M120179a;
        boolean z13;
        short s14;
        Object obj;
        File file2;
        List<C17643d> list2;
        File file3;
        C36485b c36485b;
        File outputFile;
        EnumC31071a enumC31071a;
        C27941d c27941dM75171h;
        short s15;
        List<C17643d> list3;
        AbstractC34846v0 abstractC34846v0;
        EnumC31071a enumC31071a2;
        Object objM108729b;
        c cVar3;
        List<C17643d> list4;
        C36485b c36485b2;
        short s16;
        InterfaceC34385a interfaceC34385a;
        boolean z14;
        InterfaceC17640a interfaceC17640a;
        C36485b c36485b3;
        File outputFile2;
        String str = "Uploading of ";
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i14 = cVar.f81643K;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f81643K = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar4 = cVar;
        Object obj2 = cVar4.f81641I;
        EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
        int i15 = cVar4.f81643K;
        File file4 = null;
        try {
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        short s17 = cVar4.f81644w;
                        file3 = (File) cVar4.f81646y;
                        List<C17643d> list5 = (List) cVar4.f81645x;
                        try {
                            try {
                                AbstractC34132o.m107864I(obj2);
                                file2 = file3;
                                z13 = true;
                                list2 = list5;
                                cVar2 = cVar4;
                                s14 = s17;
                                obj = obj2;
                                abstractC34846v0M120179a = null;
                                try {
                                    c36485b = (C36485b) obj;
                                    try {
                                        if (c36485b != null) {
                                            try {
                                                outputFile = c36485b.getOutputFile();
                                                if (outputFile != null) {
                                                    C34844u0 c34844u0 = AbstractC34846v0.Companion;
                                                    C39412p c39412p = C34818h0.f146589e;
                                                    C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J(DfuBaseService.MIME_TYPE_OCTET_STREAM);
                                                    c34844u0.getClass();
                                                    abstractC34846v0M120179a = C37496a.f160377a.m120179a(C34844u0.m109924a(outputFile, c34818h0M5373J));
                                                }
                                                if (c36485b != null) {
                                                    c27941dM75171h = this.strapMetadataDaoInteractor.m75171h(c36485b.getVersion());
                                                    enumC31071a = enumC31071a3;
                                                } else {
                                                    enumC31071a = enumC31071a3;
                                                    c27941dM75171h = abstractC34846v0M120179a;
                                                }
                                                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                                                InterfaceC34116n interfaceC34116n = this.logger;
                                                EnumC31071a enumC31071a4 = enumC31071a;
                                                AbstractC34846v0 abstractC34846v1 = abstractC34846v0M120179a;
                                                d dVar = new d(abstractC34846v0M120179a, c27941dM75171h, this, s14, null);
                                                cVar2.f81645x = list2;
                                                cVar2.f81646y = file2;
                                                cVar2.f81647z = c36485b;
                                                cVar2.f81637E = abstractC34846v1;
                                                cVar2.f81638F = abstractC34846v1;
                                                cVar2.f81644w = s14;
                                                cVar2.f81643K = 2;
                                                file3 = file2;
                                                s15 = s14;
                                                c cVar5 = cVar2;
                                                list3 = list2;
                                                abstractC34846v0 = abstractC34846v1;
                                                enumC31071a2 = enumC31071a4;
                                                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upload pip", dVar, cVar5, 2, null);
                                                cVar3 = cVar5;
                                                if (objM108729b == enumC31071a2) {
                                                    return enumC31071a2;
                                                }
                                                list4 = list3;
                                                file4 = file3;
                                                c36485b2 = c36485b;
                                                s16 = s15;
                                                interfaceC34385a = (InterfaceC34385a) objM108729b;
                                                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                                                    this.logger.mo85228t("Uploading of " + list4.size() + " R" + ((int) s16) + " pulse info packets was successful.", new AbstractC30556a.a[0]);
                                                    interfaceC17640a = this.dataPacketDao;
                                                    cVar3.f81645x = abstractC34846v0;
                                                    cVar3.f81646y = file4;
                                                    cVar3.f81647z = c36485b2;
                                                    cVar3.f81637E = abstractC34846v0;
                                                    cVar3.f81638F = abstractC34846v0;
                                                    cVar3.f81639G = abstractC34846v0;
                                                    cVar3.f81644w = s16;
                                                    cVar3.f81640H = 0;
                                                    cVar3.f81643K = 3;
                                                    if (interfaceC17640a.mo50259a(list4, cVar3) == enumC31071a2) {
                                                        return enumC31071a2;
                                                    }
                                                    c36485b3 = c36485b2;
                                                    if (c36485b3 != null) {
                                                        outputFile2.delete();
                                                    }
                                                    z14 = z13;
                                                } else {
                                                    if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    this.logger.mo85228t("Error while uploading " + list4.size() + " R" + ((int) s16) + " pulse info packets, " + ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), new AbstractC30556a.a[0]);
                                                    z14 = false;
                                                }
                                                Boolean boolValueOf = Boolean.valueOf(z14);
                                                if (file4 != null) {
                                                    file4.delete();
                                                }
                                                return boolValueOf;
                                            } catch (Exception e5) {
                                                e = e5;
                                                file4 = file2;
                                                i13 = 0;
                                                this.logger.mo85230v("Failed to upload pulse info packets to backend", e, new AbstractC30556a.a[i13]);
                                                Boolean bool = Boolean.FALSE;
                                                if (file4 != null) {
                                                    file4.delete();
                                                }
                                                return bool;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                file4 = file2;
                                                if (file4 != null) {
                                                    file4.delete();
                                                }
                                                throw th;
                                            }
                                        }
                                        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upload pip", dVar, cVar5, 2, null);
                                        cVar3 = cVar5;
                                        if (objM108729b == enumC31071a2) {
                                            return enumC31071a2;
                                        }
                                        list4 = list3;
                                        file4 = file3;
                                        c36485b2 = c36485b;
                                        s16 = s15;
                                        interfaceC34385a = (InterfaceC34385a) objM108729b;
                                        if (interfaceC34385a instanceof InterfaceC34385a.c) {
                                            this.logger.mo85228t("Uploading of " + list4.size() + " R" + ((int) s16) + " pulse info packets was successful.", new AbstractC30556a.a[0]);
                                            interfaceC17640a = this.dataPacketDao;
                                            cVar3.f81645x = abstractC34846v0;
                                            cVar3.f81646y = file4;
                                            cVar3.f81647z = c36485b2;
                                            cVar3.f81637E = abstractC34846v0;
                                            cVar3.f81638F = abstractC34846v0;
                                            cVar3.f81639G = abstractC34846v0;
                                            cVar3.f81644w = s16;
                                            cVar3.f81640H = 0;
                                            cVar3.f81643K = 3;
                                            if (interfaceC17640a.mo50259a(list4, cVar3) == enumC31071a2) {
                                                return enumC31071a2;
                                            }
                                            c36485b3 = c36485b2;
                                            if (c36485b3 != null) {
                                                outputFile2.delete();
                                            }
                                            z14 = z13;
                                        } else {
                                            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            this.logger.mo85228t("Error while uploading " + list4.size() + " R" + ((int) s16) + " pulse info packets, " + ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), new AbstractC30556a.a[0]);
                                            z14 = false;
                                        }
                                        Boolean boolValueOf2 = Boolean.valueOf(z14);
                                        if (file4 != null) {
                                            file4.delete();
                                        }
                                        return boolValueOf2;
                                    } catch (Exception e13) {
                                        e = e13;
                                        i13 = 0;
                                        file4 = file3;
                                        this.logger.mo85230v("Failed to upload pulse info packets to backend", e, new AbstractC30556a.a[i13]);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (file4 != null) {
                                            file4.delete();
                                        }
                                        return bool2;
                                    }
                                    if (c36485b != null) {
                                        c27941dM75171h = this.strapMetadataDaoInteractor.m75171h(c36485b.getVersion());
                                        enumC31071a = enumC31071a3;
                                    } else {
                                        enumC31071a = enumC31071a3;
                                        c27941dM75171h = abstractC34846v0M120179a;
                                    }
                                    InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
                                    InterfaceC34116n interfaceC34116n2 = this.logger;
                                    EnumC31071a enumC31071a5 = enumC31071a;
                                    AbstractC34846v0 abstractC34846v2 = abstractC34846v0M120179a;
                                    d dVar2 = new d(abstractC34846v0M120179a, c27941dM75171h, this, s14, null);
                                    cVar2.f81645x = list2;
                                    cVar2.f81646y = file2;
                                    cVar2.f81647z = c36485b;
                                    cVar2.f81637E = abstractC34846v2;
                                    cVar2.f81638F = abstractC34846v2;
                                    cVar2.f81644w = s14;
                                    cVar2.f81643K = 2;
                                    file3 = file2;
                                    s15 = s14;
                                    c cVar6 = cVar2;
                                    list3 = list2;
                                    abstractC34846v0 = abstractC34846v2;
                                    enumC31071a2 = enumC31071a5;
                                } catch (Exception e14) {
                                    e = e14;
                                    file3 = file2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    file3 = file2;
                                    file4 = file3;
                                    if (file4 != null) {
                                        file4.delete();
                                    }
                                    throw th;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                file4 = file3;
                                i13 = 0;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            file4 = file3;
                            if (file4 != null) {
                                file4.delete();
                            }
                            throw th;
                        }
                    } else if (i15 == 2) {
                        short s18 = cVar4.f81644w;
                        c36485b2 = (C36485b) cVar4.f81647z;
                        File file5 = (File) cVar4.f81646y;
                        list4 = (List) cVar4.f81645x;
                        try {
                            AbstractC34132o.m107864I(obj2);
                            s16 = s18;
                            enumC31071a2 = enumC31071a3;
                            objM108729b = obj2;
                            abstractC34846v0 = null;
                            file4 = file5;
                            z13 = true;
                            cVar3 = cVar4;
                            try {
                                interfaceC34385a = (InterfaceC34385a) objM108729b;
                                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                                    this.logger.mo85228t("Uploading of " + list4.size() + " R" + ((int) s16) + " pulse info packets was successful.", new AbstractC30556a.a[0]);
                                    interfaceC17640a = this.dataPacketDao;
                                    cVar3.f81645x = abstractC34846v0;
                                    cVar3.f81646y = file4;
                                    cVar3.f81647z = c36485b2;
                                    cVar3.f81637E = abstractC34846v0;
                                    cVar3.f81638F = abstractC34846v0;
                                    cVar3.f81639G = abstractC34846v0;
                                    cVar3.f81644w = s16;
                                    cVar3.f81640H = 0;
                                    cVar3.f81643K = 3;
                                    if (interfaceC17640a.mo50259a(list4, cVar3) == enumC31071a2) {
                                        return enumC31071a2;
                                    }
                                    c36485b3 = c36485b2;
                                    if (c36485b3 != null) {
                                        outputFile2.delete();
                                    }
                                    z14 = z13;
                                } else {
                                    if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.logger.mo85228t("Error while uploading " + list4.size() + " R" + ((int) s16) + " pulse info packets, " + ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), new AbstractC30556a.a[0]);
                                    z14 = false;
                                }
                                Boolean boolValueOf3 = Boolean.valueOf(z14);
                                if (file4 != null) {
                                    file4.delete();
                                }
                                return boolValueOf3;
                            } catch (Exception e16) {
                                e = e16;
                                i13 = 0;
                                this.logger.mo85230v("Failed to upload pulse info packets to backend", e, new AbstractC30556a.a[i13]);
                                Boolean bool3 = Boolean.FALSE;
                                if (file4 != null) {
                                    file4.delete();
                                }
                                return bool3;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            file4 = file5;
                        } catch (Throwable th6) {
                            th = th6;
                            file4 = file5;
                            if (file4 != null) {
                                file4.delete();
                            }
                            throw th;
                        }
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c36485b3 = (C36485b) cVar4.f81647z;
                        file4 = (File) cVar4.f81646y;
                        try {
                            AbstractC34132o.m107864I(obj2);
                            z13 = true;
                            if (c36485b3 != null && (outputFile2 = c36485b3.getOutputFile()) != null) {
                                outputFile2.delete();
                            }
                            z14 = z13;
                            Boolean boolValueOf4 = Boolean.valueOf(z14);
                            if (file4 != null) {
                                file4.delete();
                            }
                            return boolValueOf4;
                        } catch (Exception e18) {
                            e = e18;
                        }
                    }
                    i13 = 0;
                    this.logger.mo85230v("Failed to upload pulse info packets to backend", e, new AbstractC30556a.a[i13]);
                    Boolean bool4 = Boolean.FALSE;
                    if (file4 != null) {
                        file4.delete();
                    }
                    return bool4;
                }
                AbstractC34132o.m107864I(obj2);
                try {
                    File fileCreateTempFile = File.createTempFile("pulse_info_packets_exported", "", this.androidCacheDir);
                    try {
                        C36484a c36484a = this.dataPacketUploadFileWriter;
                        AbstractC22676k.m65747g(fileCreateTempFile);
                        Integer num = new Integer(s13);
                        cVar4.f81645x = list;
                        cVar4.f81646y = fileCreateTempFile;
                        cVar4.f81644w = s13;
                        cVar4.f81643K = 1;
                        cVar2 = cVar4;
                        file = fileCreateTempFile;
                        abstractC34846v0M120179a = null;
                        z13 = true;
                        try {
                            Object objM116916b = C36484a.m116916b(c36484a, file, list, num, null, null, cVar2, 24, null);
                            if (objM116916b == enumC31071a3) {
                                return enumC31071a3;
                            }
                            s14 = s13;
                            obj = objM116916b;
                            file2 = file;
                            list2 = list;
                            c36485b = (C36485b) obj;
                            if (c36485b != null) {
                                outputFile = c36485b.getOutputFile();
                                if (outputFile != null) {
                                    C34844u0 c34844u1 = AbstractC34846v0.Companion;
                                    C39412p c39412p2 = C34818h0.f146589e;
                                    C34818h0 c34818h0M5373J2 = AbstractC1772c1.m5373J(DfuBaseService.MIME_TYPE_OCTET_STREAM);
                                    c34844u1.getClass();
                                    abstractC34846v0M120179a = C37496a.f160377a.m120179a(C34844u0.m109924a(outputFile, c34818h0M5373J2));
                                }
                                if (c36485b != null) {
                                    c27941dM75171h = this.strapMetadataDaoInteractor.m75171h(c36485b.getVersion());
                                    enumC31071a = enumC31071a3;
                                } else {
                                    enumC31071a = enumC31071a3;
                                    c27941dM75171h = abstractC34846v0M120179a;
                                }
                                InterfaceC34385a.Companion companion3 = InterfaceC34385a.INSTANCE;
                                InterfaceC34116n interfaceC34116n3 = this.logger;
                                EnumC31071a enumC31071a6 = enumC31071a;
                                AbstractC34846v0 abstractC34846v3 = abstractC34846v0M120179a;
                                d dVar3 = new d(abstractC34846v0M120179a, c27941dM75171h, this, s14, null);
                                cVar2.f81645x = list2;
                                cVar2.f81646y = file2;
                                cVar2.f81647z = c36485b;
                                cVar2.f81637E = abstractC34846v3;
                                cVar2.f81638F = abstractC34846v3;
                                cVar2.f81644w = s14;
                                cVar2.f81643K = 2;
                                file3 = file2;
                                s15 = s14;
                                c cVar7 = cVar2;
                                list3 = list2;
                                abstractC34846v0 = abstractC34846v3;
                                enumC31071a2 = enumC31071a6;
                                objM108729b = InterfaceC34385a.Companion.m108729b(companion3, interfaceC34116n3, null, "Failed to upload pip", dVar3, cVar7, 2, null);
                                cVar3 = cVar7;
                                if (objM108729b == enumC31071a2) {
                                    return enumC31071a2;
                                }
                                list4 = list3;
                                file4 = file3;
                                c36485b2 = c36485b;
                                s16 = s15;
                                interfaceC34385a = (InterfaceC34385a) objM108729b;
                                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                                    this.logger.mo85228t("Uploading of " + list4.size() + " R" + ((int) s16) + " pulse info packets was successful.", new AbstractC30556a.a[0]);
                                    interfaceC17640a = this.dataPacketDao;
                                    cVar3.f81645x = abstractC34846v0;
                                    cVar3.f81646y = file4;
                                    cVar3.f81647z = c36485b2;
                                    cVar3.f81637E = abstractC34846v0;
                                    cVar3.f81638F = abstractC34846v0;
                                    cVar3.f81639G = abstractC34846v0;
                                    cVar3.f81644w = s16;
                                    cVar3.f81640H = 0;
                                    cVar3.f81643K = 3;
                                    if (interfaceC17640a.mo50259a(list4, cVar3) == enumC31071a2) {
                                        return enumC31071a2;
                                    }
                                    c36485b3 = c36485b2;
                                    if (c36485b3 != null) {
                                        outputFile2.delete();
                                    }
                                    z14 = z13;
                                } else {
                                    if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.logger.mo85228t("Error while uploading " + list4.size() + " R" + ((int) s16) + " pulse info packets, " + ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), new AbstractC30556a.a[0]);
                                    z14 = false;
                                }
                                Boolean boolValueOf5 = Boolean.valueOf(z14);
                                if (file4 != null) {
                                    file4.delete();
                                }
                                return boolValueOf5;
                            }
                            if (c36485b != null) {
                                c27941dM75171h = this.strapMetadataDaoInteractor.m75171h(c36485b.getVersion());
                                enumC31071a = enumC31071a3;
                            } else {
                                enumC31071a = enumC31071a3;
                                c27941dM75171h = abstractC34846v0M120179a;
                            }
                            InterfaceC34385a.Companion companion4 = InterfaceC34385a.INSTANCE;
                            InterfaceC34116n interfaceC34116n4 = this.logger;
                            EnumC31071a enumC31071a7 = enumC31071a;
                            AbstractC34846v0 abstractC34846v4 = abstractC34846v0M120179a;
                            d dVar4 = new d(abstractC34846v0M120179a, c27941dM75171h, this, s14, null);
                            cVar2.f81645x = list2;
                            cVar2.f81646y = file2;
                            cVar2.f81647z = c36485b;
                            cVar2.f81637E = abstractC34846v4;
                            cVar2.f81638F = abstractC34846v4;
                            cVar2.f81644w = s14;
                            cVar2.f81643K = 2;
                            file3 = file2;
                            s15 = s14;
                            c cVar8 = cVar2;
                            list3 = list2;
                            abstractC34846v0 = abstractC34846v4;
                            enumC31071a2 = enumC31071a7;
                            objM108729b = InterfaceC34385a.Companion.m108729b(companion4, interfaceC34116n4, null, "Failed to upload pip", dVar4, cVar8, 2, null);
                            cVar3 = cVar8;
                            if (objM108729b == enumC31071a2) {
                                return enumC31071a2;
                            }
                            list4 = list3;
                            file4 = file3;
                            c36485b2 = c36485b;
                            s16 = s15;
                            interfaceC34385a = (InterfaceC34385a) objM108729b;
                            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                                this.logger.mo85228t("Uploading of " + list4.size() + " R" + ((int) s16) + " pulse info packets was successful.", new AbstractC30556a.a[0]);
                                interfaceC17640a = this.dataPacketDao;
                                cVar3.f81645x = abstractC34846v0;
                                cVar3.f81646y = file4;
                                cVar3.f81647z = c36485b2;
                                cVar3.f81637E = abstractC34846v0;
                                cVar3.f81638F = abstractC34846v0;
                                cVar3.f81639G = abstractC34846v0;
                                cVar3.f81644w = s16;
                                cVar3.f81640H = 0;
                                cVar3.f81643K = 3;
                                if (interfaceC17640a.mo50259a(list4, cVar3) == enumC31071a2) {
                                    return enumC31071a2;
                                }
                                c36485b3 = c36485b2;
                                if (c36485b3 != null) {
                                    outputFile2.delete();
                                }
                                z14 = z13;
                            } else {
                                if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.logger.mo85228t("Error while uploading " + list4.size() + " R" + ((int) s16) + " pulse info packets, " + ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), new AbstractC30556a.a[0]);
                                z14 = false;
                            }
                            Boolean boolValueOf6 = Boolean.valueOf(z14);
                            if (file4 != null) {
                                file4.delete();
                            }
                            return boolValueOf6;
                        } catch (Exception e19) {
                            e = e19;
                            z4 = false;
                            file4 = file;
                            i13 = z4;
                        } catch (Throwable th7) {
                            th = th7;
                            file4 = file;
                            if (file4 != null) {
                                file4.delete();
                            }
                            throw th;
                        }
                    } catch (Exception e22) {
                        e = e22;
                        file = fileCreateTempFile;
                        z4 = false;
                    } catch (Throwable th8) {
                        th = th8;
                        file = fileCreateTempFile;
                    }
                } catch (Exception e24) {
                    e = e24;
                    i13 = 0;
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Exception e25) {
                e = e25;
                i13 = str;
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x0184  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0197 -> B:60:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01ce -> B:64:0x01d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // j52.InterfaceC21341b
    /* JADX INFO: renamed from: a */
    public java.lang.Object mo59944a(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r17) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j52.C21342c.mo59944a(q83.d):java.lang.Object");
    }
}
