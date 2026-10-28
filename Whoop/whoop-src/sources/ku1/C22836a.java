package ku1;

import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FdaFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.labradorService.network.LabradorNetworkApi;
import hu1.C17644a;
import hu1.C17645b;
import hu1.C17652i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.List;
import js0.AbstractC21909c;
import js0.C21908b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import mh2.C25561a;
import no.nordicsemi.android.dfu.DfuBaseService;
import oh2.C27938a;
import oh2.C27940c;
import oh2.InterfaceC27939b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
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
import ud3.C34818h0;
import ud3.C34844u0;
import ud3.C34850x0;
import vt0.C36484a;
import vt0.C36485b;
import wp0.C37496a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: ku1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001\u001dBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lku1/a;", "", "Ltr2/n;", "logger", "Ljava/io/File;", "androidCacheDir", "Lhu1/i;", "labradorPacketsDbManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljs0/c;", "configurationRepository", "Lcom/whoop/labradorService/network/LabradorNetworkApi;", "labradorNetworkApi", "Lmh2/a;", "strapMetadataDaoInteractor", "Lvt0/a;", "dataPacketUploadFileWriter", "Lmc3/a;", "mutex", "<init>", "(Ltr2/n;Ljava/io/File;Lhu1/i;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Lcom/whoop/labradorService/network/LabradorNetworkApi;Lmh2/a;Lvt0/a;Lmc3/a;)V", "Lhu1/a;", "exportedPacketsMetaData", "", "c", "(Lhu1/a;Lq83/d;)Ljava/lang/Object;", "d", "(Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "b", "Ljava/io/File;", "Lhu1/i;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Ljs0/c;", "f", "Lcom/whoop/labradorService/network/LabradorNetworkApi;", "g", "Lmh2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lvt0/a;", "i", "Lmc3/a;", "j", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22836a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final File androidCacheDir;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17652i labradorPacketsDbManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LabradorNetworkApi labradorNetworkApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C25561a strapMetadataDaoInteractor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C36484a dataPacketUploadFileWriter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: ku1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.uploader.LabradorPacketsUploadManager", m100430f = "LabradorPacketsUploadManager.kt", m100431l = {96}, m100432m = "sendPacketsToBackend", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f90020E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f90021F;

        /* JADX INFO: renamed from: H */
        int f90023H;

        /* JADX INFO: renamed from: w */
        Object f90024w;

        /* JADX INFO: renamed from: x */
        Object f90025x;

        /* JADX INFO: renamed from: y */
        Object f90026y;

        /* JADX INFO: renamed from: z */
        Object f90027z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f90021F = obj;
            this.f90023H |= Integer.MIN_VALUE;
            return C22836a.this.m66221c(null, this);
        }
    }

    /* JADX INFO: renamed from: ku1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.uploader.LabradorPacketsUploadManager", m100430f = "LabradorPacketsUploadManager.kt", m100431l = {122, 48, 53, 56, 68, 70}, m100432m = "uploadPackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f90028E;

        /* JADX INFO: renamed from: F */
        int f90029F;

        /* JADX INFO: renamed from: G */
        int f90030G;

        /* JADX INFO: renamed from: H */
        int f90031H;

        /* JADX INFO: renamed from: I */
        int f90032I;

        /* JADX INFO: renamed from: J */
        boolean f90033J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f90034K;

        /* JADX INFO: renamed from: M */
        int f90036M;

        /* JADX INFO: renamed from: w */
        Object f90037w;

        /* JADX INFO: renamed from: x */
        Object f90038x;

        /* JADX INFO: renamed from: y */
        Object f90039y;

        /* JADX INFO: renamed from: z */
        Object f90040z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f90034K = obj;
            this.f90036M |= Integer.MIN_VALUE;
            return C22836a.this.m66222d(this);
        }
    }

    /* JADX INFO: renamed from: ku1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.uploader.LabradorPacketsUploadManager$uploadPackets$2$tmpFile$1", m100430f = "LabradorPacketsUploadManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lbc3/c0;)Ljava/io/File;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f90041w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22836a.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super File> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f90041w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return File.createTempFile("ecg_packets_exported", "", C22836a.this.androidCacheDir);
        }
    }

    public C22836a(InterfaceC34116n logger, File androidCacheDir, C17652i labradorPacketsDbManager, FeatureFlagChecker featureFlagChecker, AbstractC21909c configurationRepository, LabradorNetworkApi labradorNetworkApi, C25561a strapMetadataDaoInteractor, C36484a dataPacketUploadFileWriter, InterfaceC25435a mutex) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(androidCacheDir, "androidCacheDir");
        AbstractC22676k.m65750j(labradorPacketsDbManager, "labradorPacketsDbManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(labradorNetworkApi, "labradorNetworkApi");
        AbstractC22676k.m65750j(strapMetadataDaoInteractor, "strapMetadataDaoInteractor");
        AbstractC22676k.m65750j(dataPacketUploadFileWriter, "dataPacketUploadFileWriter");
        AbstractC22676k.m65750j(mutex, "mutex");
        this.logger = logger;
        this.androidCacheDir = androidCacheDir;
        this.labradorPacketsDbManager = labradorPacketsDbManager;
        this.featureFlagChecker = featureFlagChecker;
        this.configurationRepository = configurationRepository;
        this.labradorNetworkApi = labradorNetworkApi;
        this.strapMetadataDaoInteractor = strapMetadataDaoInteractor;
        this.dataPacketUploadFileWriter = dataPacketUploadFileWriter;
        this.mutex = mutex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: c */
    public final Object m66221c(C17644a c17644a, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        String strapId;
        InterfaceC27939b firmwareVersion;
        String strMo84319a;
        C27940c hardwareVersion;
        String strM84332d;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f90023H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f90023H = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objUploadEcgData = bVar2.f90021F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f90023H;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objUploadEcgData);
                File fileToBeUploaded = c17644a.getFileToBeUploaded();
                C27938a dataAcquisitionInfo = c17644a.getDataAcquisitionInfo();
                C34844u0 c34844u0 = AbstractC34846v0.Companion;
                C39412p c39412p = C34818h0.f146589e;
                C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J(DfuBaseService.MIME_TYPE_OCTET_STREAM);
                c34844u0.getClass();
                AbstractC34846v0 abstractC34846v0M120179a = C37496a.f160377a.m120179a(C34844u0.m109924a(fileToBeUploaded, c34818h0M5373J));
                LabradorNetworkApi labradorNetworkApi = this.labradorNetworkApi;
                String str = (dataAcquisitionInfo == null || (hardwareVersion = dataAcquisitionInfo.getHardwareVersion()) == null || (strM84332d = hardwareVersion.m84332d()) == null) ? "" : strM84332d;
                String str2 = (dataAcquisitionInfo == null || (firmwareVersion = dataAcquisitionInfo.getFirmwareVersion()) == null || (strMo84319a = firmwareVersion.mo84319a()) == null) ? "" : strMo84319a;
                String str3 = (dataAcquisitionInfo == null || (strapId = dataAcquisitionInfo.getStrapId()) == null) ? "" : strapId;
                String strValueOf = String.valueOf(abstractC34846v0M120179a.contentLength());
                bVar2.f90024w = null;
                bVar2.f90025x = null;
                bVar2.f90026y = null;
                bVar2.f90027z = null;
                bVar2.f90020E = null;
                bVar2.f90023H = 1;
                objUploadEcgData = labradorNetworkApi.uploadEcgData(abstractC34846v0M120179a, "gzip", str3, str, str2, 5, strValueOf, bVar2);
                if (objUploadEcgData == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objUploadEcgData);
            }
            C34850x0 c34850x0 = ((C29218v0) objUploadEcgData).f118269a;
            if (!c34850x0.f146788Q) {
                this.logger.mo85222m("ECG Packets upload unsuccessful - HTTP " + c34850x0.f146792z, new AbstractC30556a.a[0]);
            }
            z4 = ((C29218v0) objUploadEcgData).f118269a.f146788Q;
        } catch (Exception e5) {
            this.logger.mo85230v("Caught an exception when uploading ecg packets", e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0234  */
    /* JADX WARN: Code duplicated, block: B:103:0x0240 A[Catch: all -> 0x004a, Exception -> 0x004d, TryCatch #2 {Exception -> 0x004d, blocks: (B:14:0x0045, B:118:0x02b5, B:120:0x02c0, B:101:0x023c, B:103:0x0240, B:106:0x0268), top: B:138:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0265  */
    /* JADX WARN: Code duplicated, block: B:106:0x0268 A[Catch: all -> 0x004a, Exception -> 0x004d, TRY_LEAVE, TryCatch #2 {Exception -> 0x004d, blocks: (B:14:0x0045, B:118:0x02b5, B:120:0x02c0, B:101:0x023c, B:103:0x0240, B:106:0x0268), top: B:138:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0280  */
    /* JADX WARN: Code duplicated, block: B:112:0x0290 A[Catch: all -> 0x0072, Exception -> 0x0076, TRY_LEAVE, TryCatch #9 {Exception -> 0x0076, all -> 0x0072, blocks: (B:21:0x0066, B:110:0x0287, B:112:0x0290, B:28:0x008c, B:31:0x00a7), top: B:138:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x02df A[Catch: all -> 0x00f9, TRY_ENTER, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[Catch: all -> 0x00f9, TRY_ENTER, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0121 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0129 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013e A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0146 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014b A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0157 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x015f A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0164 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0170 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0178 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x017d A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0189 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0191 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0196 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2 A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ae A[Catch: all -> 0x00f9, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #6 {all -> 0x00f9, blocks: (B:88:0x01cd, B:90:0x01d5, B:93:0x01db, B:43:0x00e9, B:45:0x00f3, B:50:0x00fd, B:52:0x0121, B:54:0x0129, B:84:0x01ae, B:132:0x02df, B:133:0x02e6, B:56:0x0132, B:58:0x013e, B:60:0x0146, B:61:0x014b, B:63:0x0157, B:65:0x015f, B:66:0x0164, B:68:0x0170, B:70:0x0178, B:71:0x017d, B:73:0x0189, B:75:0x0191, B:76:0x0196, B:78:0x01a2), top: B:142:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [ku1.a] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v27, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: d */
    public final Object m66222d(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        c cVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        C21908b configurations;
        String name;
        Object defaultValue;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objM125868N0;
        String str;
        String str2;
        String str3;
        String str4;
        int iIntValue;
        Object objM50293b;
        int i14;
        int i15;
        int i16;
        String str5;
        List<C17645b> list;
        Object objM8705K;
        int i17;
        InterfaceC25435a interfaceC25435a2;
        int i18;
        int i19;
        List<C17645b> list2;
        File file;
        int i24;
        List<C17645b> list3;
        int i25;
        Object objM116916b;
        int i26;
        File file2;
        List<C17645b> list4;
        int i27;
        InterfaceC25435a interfaceC25435a3;
        int i28;
        C36485b c36485b;
        C17644a c17644a;
        boolean zBooleanValue;
        int i29;
        File file3;
        List<C17645b> list5;
        InterfaceC25435a interfaceC25435a4;
        boolean zBooleanValue2;
        InterfaceC25435a interfaceC25435a5;
        C17652i c17652i;
        Object obj;
        InterfaceC25435a interfaceC25435a6;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i34 = cVar.f90036M;
            if ((i34 & Integer.MIN_VALUE) != 0) {
                cVar.f90036M = i34 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM66221c = cVar2.f90034K;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        ?? r10 = 16;
        r10 = 16;
        try {
            try {
                try {
                    switch (cVar2.f90036M) {
                        case 0:
                            AbstractC34132o.m107864I(objM66221c);
                            InterfaceC25435a interfaceC25435a7 = this.mutex;
                            cVar2.f90037w = interfaceC25435a7;
                            cVar2.f90029F = 0;
                            cVar2.f90036M = 1;
                            if (interfaceC25435a7.mo68211b(cVar2) != enumC31071a) {
                                interfaceC25435a = interfaceC25435a7;
                                i13 = 0;
                                try {
                                    if (!this.featureFlagChecker.isFeatureEnabled(FdaFeatureFlagsKt.LABRADOR_FEATURE_ANDROID)) {
                                        Boolean bool = Boolean.TRUE;
                                        interfaceC25435a.mo68214i(null);
                                        return bool;
                                    }
                                    AbstractC21909c abstractC21909c = this.configurationRepository;
                                    Companion.C41924a c41924a = Companion.C41924a.f90019a;
                                    configurations = abstractC21909c.getConfigurations();
                                    name = c41924a.getName();
                                    defaultValue = c41924a.getDefaultValue();
                                    c22673i0 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                                        str5 = (String) configurations.get(name);
                                        if (str5 != null) {
                                            objM125868N0 = AbstractC39421y.m125932Q(str5);
                                        } else {
                                            objM125868N0 = null;
                                        }
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                                        str4 = (String) configurations.get(name);
                                        if (str4 != null) {
                                            objM125868N0 = AbstractC39421y.m125933R(str4);
                                        } else {
                                            objM125868N0 = null;
                                        }
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                                        str3 = (String) configurations.get(name);
                                        if (str3 != null) {
                                            objM125868N0 = AbstractC39420x.m125915y(str3);
                                        } else {
                                            objM125868N0 = null;
                                        }
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                                        str2 = (String) configurations.get(name);
                                        if (str2 != null) {
                                            objM125868N0 = AbstractC39420x.m125914x(str2);
                                        } else {
                                            objM125868N0 = null;
                                        }
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                                        str = (String) configurations.get(name);
                                        if (str != null) {
                                            objM125868N0 = AbstractC39414r.m125868N0(str);
                                        } else {
                                            objM125868N0 = null;
                                        }
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
                                        objM125868N0 = configurations.get(name);
                                    } else {
                                        objM125868N0 = defaultValue;
                                    }
                                    if (objM125868N0 == null) {
                                        defaultValue = objM125868N0;
                                    }
                                    if (defaultValue != null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                    }
                                    iIntValue = ((Integer) defaultValue).intValue();
                                    C17652i c17652i2 = this.labradorPacketsDbManager;
                                    cVar2.f90037w = interfaceC25435a;
                                    cVar2.f90029F = i13;
                                    cVar2.f90030G = 0;
                                    cVar2.f90031H = iIntValue;
                                    cVar2.f90036M = 2;
                                    objM50293b = c17652i2.m50293b(iIntValue, (short) 16, cVar2);
                                    if (objM50293b == enumC31071a) {
                                        i14 = i13;
                                        i15 = iIntValue;
                                        objM66221c = objM50293b;
                                        i16 = 0;
                                        list = (List) objM66221c;
                                        if (list.isEmpty()) {
                                            Boolean bool2 = Boolean.TRUE;
                                            interfaceC25435a.mo68214i(null);
                                            return bool2;
                                        }
                                        try {
                                            C22365e c22365e = AbstractC3050q0.f12077a;
                                            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                                            d dVar = new d(null);
                                            cVar2.f90037w = interfaceC25435a;
                                            cVar2.f90038x = list;
                                            cVar2.f90029F = i14;
                                            cVar2.f90030G = i16;
                                            cVar2.f90031H = i15;
                                            cVar2.f90036M = 3;
                                            objM8705K = AbstractC3006f0.m8705K(executorC22364d, dVar, cVar2);
                                            if (objM8705K != enumC31071a) {
                                                i17 = i15;
                                                interfaceC25435a2 = interfaceC25435a;
                                                i18 = i16;
                                                i19 = i14;
                                                list2 = list;
                                                objM66221c = objM8705K;
                                                try {
                                                    file = (File) objM66221c;
                                                    C36484a c36484a = this.dataPacketUploadFileWriter;
                                                    AbstractC22676k.m65747g(file);
                                                    Integer num = new Integer(16);
                                                    cVar2.f90037w = interfaceC25435a2;
                                                    cVar2.f90038x = list2;
                                                    cVar2.f90039y = file;
                                                    cVar2.f90029F = i19;
                                                    cVar2.f90030G = i18;
                                                    cVar2.f90031H = i17;
                                                    cVar2.f90036M = 4;
                                                    i24 = i19;
                                                    list3 = list2;
                                                    i25 = i18;
                                                    objM116916b = C36484a.m116916b(c36484a, file, list3, num, null, null, cVar2, 24, null);
                                                    if (objM116916b != enumC31071a) {
                                                        i26 = i24;
                                                        objM66221c = objM116916b;
                                                        file2 = file;
                                                        list4 = list3;
                                                        i27 = i17;
                                                        interfaceC25435a3 = interfaceC25435a2;
                                                        i28 = i25;
                                                        c36485b = (C36485b) objM66221c;
                                                        if (c36485b != null) {
                                                            c17644a = new C17644a(this.strapMetadataDaoInteractor.m75170g(c36485b.getVersion()), c36485b.getOutputFile(), c36485b.getOldestTimestamp(), c36485b.getNewestTimestamp(), (int) c36485b.getPacketCount(), 16);
                                                        } else {
                                                            c17644a = null;
                                                        }
                                                        if (c17644a != null) {
                                                            cVar2.f90037w = interfaceC25435a3;
                                                            cVar2.f90038x = list4;
                                                            cVar2.f90039y = file2;
                                                            cVar2.f90040z = null;
                                                            cVar2.f90029F = i26;
                                                            cVar2.f90030G = i28;
                                                            cVar2.f90031H = i27;
                                                            cVar2.f90036M = 5;
                                                            objM66221c = m66221c(c17644a, cVar2);
                                                            if (objM66221c != enumC31071a) {
                                                                InterfaceC25435a interfaceC25435a8 = interfaceC25435a3;
                                                                i29 = i27;
                                                                file3 = file2;
                                                                list5 = list4;
                                                                interfaceC25435a4 = interfaceC25435a8;
                                                                zBooleanValue2 = ((Boolean) objM66221c).booleanValue();
                                                                if (zBooleanValue2) {
                                                                    c17652i = this.labradorPacketsDbManager;
                                                                    cVar2.f90037w = interfaceC25435a4;
                                                                    cVar2.f90038x = null;
                                                                    cVar2.f90039y = file3;
                                                                    cVar2.f90040z = null;
                                                                    cVar2.f90028E = objM66221c;
                                                                    cVar2.f90029F = i26;
                                                                    cVar2.f90030G = i28;
                                                                    cVar2.f90033J = zBooleanValue2;
                                                                    cVar2.f90031H = 0;
                                                                    cVar2.f90032I = i29;
                                                                    cVar2.f90036M = 6;
                                                                    if (c17652i.m50292a(list5, cVar2) != enumC31071a) {
                                                                        obj = objM66221c;
                                                                        interfaceC25435a6 = interfaceC25435a4;
                                                                        objM66221c = obj;
                                                                        interfaceC25435a5 = interfaceC25435a6;
                                                                    }
                                                                } else {
                                                                    interfaceC25435a5 = interfaceC25435a4;
                                                                }
                                                                file3.delete();
                                                                zBooleanValue = ((Boolean) objM66221c).booleanValue();
                                                                r10 = interfaceC25435a5;
                                                            }
                                                        } else {
                                                            zBooleanValue = false;
                                                            r10 = interfaceC25435a3;
                                                        }
                                                        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                                                        r10.mo68214i(null);
                                                        return boolValueOf;
                                                    }
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    r10 = interfaceC25435a2;
                                                    this.logger.mo85230v("Failed to upload ECG packets to backend", e, new AbstractC30556a.a[0]);
                                                    Boolean bool3 = Boolean.FALSE;
                                                    r10.mo68214i(null);
                                                    return bool3;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r10 = interfaceC25435a2;
                                                    r10.mo68214i(null);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            r10 = interfaceC25435a;
                                            this.logger.mo85230v("Failed to upload ECG packets to backend", e, new AbstractC30556a.a[0]);
                                            Boolean bool4 = Boolean.FALSE;
                                            r10.mo68214i(null);
                                            return bool4;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r10 = interfaceC25435a;
                                    r10.mo68214i(null);
                                    throw th;
                                }
                            }
                            return enumC31071a;
                        case 1:
                            i13 = cVar2.f90029F;
                            interfaceC25435a = (InterfaceC25435a) cVar2.f90037w;
                            AbstractC34132o.m107864I(objM66221c);
                            if (!this.featureFlagChecker.isFeatureEnabled(FdaFeatureFlagsKt.LABRADOR_FEATURE_ANDROID)) {
                                Boolean bool5 = Boolean.TRUE;
                                interfaceC25435a.mo68214i(null);
                                return bool5;
                            }
                            AbstractC21909c abstractC21909c2 = this.configurationRepository;
                            Companion.C41924a c41924a2 = Companion.C41924a.f90019a;
                            configurations = abstractC21909c2.getConfigurations();
                            name = c41924a2.getName();
                            defaultValue = c41924a2.getDefaultValue();
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                                str5 = (String) configurations.get(name);
                                if (str5 != null) {
                                    objM125868N0 = AbstractC39421y.m125932Q(str5);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                                str4 = (String) configurations.get(name);
                                if (str4 != null) {
                                    objM125868N0 = AbstractC39421y.m125933R(str4);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                                str3 = (String) configurations.get(name);
                                if (str3 != null) {
                                    objM125868N0 = AbstractC39420x.m125915y(str3);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                                str2 = (String) configurations.get(name);
                                if (str2 != null) {
                                    objM125868N0 = AbstractC39420x.m125914x(str2);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                                str = (String) configurations.get(name);
                                if (str != null) {
                                    objM125868N0 = AbstractC39414r.m125868N0(str);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
                                objM125868N0 = configurations.get(name);
                            } else {
                                objM125868N0 = defaultValue;
                            }
                            if (objM125868N0 == null) {
                                defaultValue = objM125868N0;
                            }
                            if (defaultValue != null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                            iIntValue = ((Integer) defaultValue).intValue();
                            C17652i c17652i3 = this.labradorPacketsDbManager;
                            cVar2.f90037w = interfaceC25435a;
                            cVar2.f90029F = i13;
                            cVar2.f90030G = 0;
                            cVar2.f90031H = iIntValue;
                            cVar2.f90036M = 2;
                            objM50293b = c17652i3.m50293b(iIntValue, (short) 16, cVar2);
                            if (objM50293b == enumC31071a) {
                                i14 = i13;
                                i15 = iIntValue;
                                objM66221c = objM50293b;
                                i16 = 0;
                                list = (List) objM66221c;
                                if (list.isEmpty()) {
                                    Boolean bool6 = Boolean.TRUE;
                                    interfaceC25435a.mo68214i(null);
                                    return bool6;
                                }
                                C22365e c22365e2 = AbstractC3050q0.f12077a;
                                ExecutorC22364d executorC22364d2 = ExecutorC22364d.f87316w;
                                d dVar2 = new d(null);
                                cVar2.f90037w = interfaceC25435a;
                                cVar2.f90038x = list;
                                cVar2.f90029F = i14;
                                cVar2.f90030G = i16;
                                cVar2.f90031H = i15;
                                cVar2.f90036M = 3;
                                objM8705K = AbstractC3006f0.m8705K(executorC22364d2, dVar2, cVar2);
                                if (objM8705K != enumC31071a) {
                                    i17 = i15;
                                    interfaceC25435a2 = interfaceC25435a;
                                    i18 = i16;
                                    i19 = i14;
                                    list2 = list;
                                    objM66221c = objM8705K;
                                    file = (File) objM66221c;
                                    C36484a c36484a2 = this.dataPacketUploadFileWriter;
                                    AbstractC22676k.m65747g(file);
                                    Integer num2 = new Integer(16);
                                    cVar2.f90037w = interfaceC25435a2;
                                    cVar2.f90038x = list2;
                                    cVar2.f90039y = file;
                                    cVar2.f90029F = i19;
                                    cVar2.f90030G = i18;
                                    cVar2.f90031H = i17;
                                    cVar2.f90036M = 4;
                                    i24 = i19;
                                    list3 = list2;
                                    i25 = i18;
                                    objM116916b = C36484a.m116916b(c36484a2, file, list3, num2, null, null, cVar2, 24, null);
                                    if (objM116916b != enumC31071a) {
                                        i26 = i24;
                                        objM66221c = objM116916b;
                                        file2 = file;
                                        list4 = list3;
                                        i27 = i17;
                                        interfaceC25435a3 = interfaceC25435a2;
                                        i28 = i25;
                                        c36485b = (C36485b) objM66221c;
                                        if (c36485b != null) {
                                            c17644a = new C17644a(this.strapMetadataDaoInteractor.m75170g(c36485b.getVersion()), c36485b.getOutputFile(), c36485b.getOldestTimestamp(), c36485b.getNewestTimestamp(), (int) c36485b.getPacketCount(), 16);
                                        } else {
                                            c17644a = null;
                                        }
                                        if (c17644a != null) {
                                            cVar2.f90037w = interfaceC25435a3;
                                            cVar2.f90038x = list4;
                                            cVar2.f90039y = file2;
                                            cVar2.f90040z = null;
                                            cVar2.f90029F = i26;
                                            cVar2.f90030G = i28;
                                            cVar2.f90031H = i27;
                                            cVar2.f90036M = 5;
                                            objM66221c = m66221c(c17644a, cVar2);
                                            if (objM66221c != enumC31071a) {
                                                InterfaceC25435a interfaceC25435a9 = interfaceC25435a3;
                                                i29 = i27;
                                                file3 = file2;
                                                list5 = list4;
                                                interfaceC25435a4 = interfaceC25435a9;
                                                zBooleanValue2 = ((Boolean) objM66221c).booleanValue();
                                                if (zBooleanValue2) {
                                                    c17652i = this.labradorPacketsDbManager;
                                                    cVar2.f90037w = interfaceC25435a4;
                                                    cVar2.f90038x = null;
                                                    cVar2.f90039y = file3;
                                                    cVar2.f90040z = null;
                                                    cVar2.f90028E = objM66221c;
                                                    cVar2.f90029F = i26;
                                                    cVar2.f90030G = i28;
                                                    cVar2.f90033J = zBooleanValue2;
                                                    cVar2.f90031H = 0;
                                                    cVar2.f90032I = i29;
                                                    cVar2.f90036M = 6;
                                                    if (c17652i.m50292a(list5, cVar2) != enumC31071a) {
                                                        obj = objM66221c;
                                                        interfaceC25435a6 = interfaceC25435a4;
                                                        objM66221c = obj;
                                                        interfaceC25435a5 = interfaceC25435a6;
                                                    }
                                                } else {
                                                    interfaceC25435a5 = interfaceC25435a4;
                                                }
                                                file3.delete();
                                                zBooleanValue = ((Boolean) objM66221c).booleanValue();
                                                r10 = interfaceC25435a5;
                                            }
                                        } else {
                                            zBooleanValue = false;
                                            r10 = interfaceC25435a3;
                                        }
                                        Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                                        r10.mo68214i(null);
                                        return boolValueOf2;
                                    }
                                }
                            }
                            return enumC31071a;
                        case 2:
                            i15 = cVar2.f90031H;
                            int i35 = cVar2.f90030G;
                            int i36 = cVar2.f90029F;
                            InterfaceC25435a interfaceC25435a10 = (InterfaceC25435a) cVar2.f90037w;
                            try {
                                AbstractC34132o.m107864I(objM66221c);
                                i16 = i35;
                                interfaceC25435a = interfaceC25435a10;
                                i14 = i36;
                                list = (List) objM66221c;
                                if (list.isEmpty()) {
                                    Boolean bool7 = Boolean.TRUE;
                                    interfaceC25435a.mo68214i(null);
                                    return bool7;
                                }
                                C22365e c22365e3 = AbstractC3050q0.f12077a;
                                ExecutorC22364d executorC22364d3 = ExecutorC22364d.f87316w;
                                d dVar3 = new d(null);
                                cVar2.f90037w = interfaceC25435a;
                                cVar2.f90038x = list;
                                cVar2.f90029F = i14;
                                cVar2.f90030G = i16;
                                cVar2.f90031H = i15;
                                cVar2.f90036M = 3;
                                objM8705K = AbstractC3006f0.m8705K(executorC22364d3, dVar3, cVar2);
                                if (objM8705K != enumC31071a) {
                                    i17 = i15;
                                    interfaceC25435a2 = interfaceC25435a;
                                    i18 = i16;
                                    i19 = i14;
                                    list2 = list;
                                    objM66221c = objM8705K;
                                    file = (File) objM66221c;
                                    C36484a c36484a3 = this.dataPacketUploadFileWriter;
                                    AbstractC22676k.m65747g(file);
                                    Integer num3 = new Integer(16);
                                    cVar2.f90037w = interfaceC25435a2;
                                    cVar2.f90038x = list2;
                                    cVar2.f90039y = file;
                                    cVar2.f90029F = i19;
                                    cVar2.f90030G = i18;
                                    cVar2.f90031H = i17;
                                    cVar2.f90036M = 4;
                                    i24 = i19;
                                    list3 = list2;
                                    i25 = i18;
                                    objM116916b = C36484a.m116916b(c36484a3, file, list3, num3, null, null, cVar2, 24, null);
                                    if (objM116916b != enumC31071a) {
                                        i26 = i24;
                                        objM66221c = objM116916b;
                                        file2 = file;
                                        list4 = list3;
                                        i27 = i17;
                                        interfaceC25435a3 = interfaceC25435a2;
                                        i28 = i25;
                                        c36485b = (C36485b) objM66221c;
                                        if (c36485b != null) {
                                            c17644a = new C17644a(this.strapMetadataDaoInteractor.m75170g(c36485b.getVersion()), c36485b.getOutputFile(), c36485b.getOldestTimestamp(), c36485b.getNewestTimestamp(), (int) c36485b.getPacketCount(), 16);
                                        } else {
                                            c17644a = null;
                                        }
                                        if (c17644a != null) {
                                            cVar2.f90037w = interfaceC25435a3;
                                            cVar2.f90038x = list4;
                                            cVar2.f90039y = file2;
                                            cVar2.f90040z = null;
                                            cVar2.f90029F = i26;
                                            cVar2.f90030G = i28;
                                            cVar2.f90031H = i27;
                                            cVar2.f90036M = 5;
                                            objM66221c = m66221c(c17644a, cVar2);
                                            if (objM66221c != enumC31071a) {
                                                InterfaceC25435a interfaceC25435a11 = interfaceC25435a3;
                                                i29 = i27;
                                                file3 = file2;
                                                list5 = list4;
                                                interfaceC25435a4 = interfaceC25435a11;
                                                zBooleanValue2 = ((Boolean) objM66221c).booleanValue();
                                                if (zBooleanValue2) {
                                                    c17652i = this.labradorPacketsDbManager;
                                                    cVar2.f90037w = interfaceC25435a4;
                                                    cVar2.f90038x = null;
                                                    cVar2.f90039y = file3;
                                                    cVar2.f90040z = null;
                                                    cVar2.f90028E = objM66221c;
                                                    cVar2.f90029F = i26;
                                                    cVar2.f90030G = i28;
                                                    cVar2.f90033J = zBooleanValue2;
                                                    cVar2.f90031H = 0;
                                                    cVar2.f90032I = i29;
                                                    cVar2.f90036M = 6;
                                                    if (c17652i.m50292a(list5, cVar2) != enumC31071a) {
                                                        obj = objM66221c;
                                                        interfaceC25435a6 = interfaceC25435a4;
                                                        objM66221c = obj;
                                                        interfaceC25435a5 = interfaceC25435a6;
                                                    }
                                                } else {
                                                    interfaceC25435a5 = interfaceC25435a4;
                                                }
                                                file3.delete();
                                                zBooleanValue = ((Boolean) objM66221c).booleanValue();
                                                r10 = interfaceC25435a5;
                                            }
                                        } else {
                                            zBooleanValue = false;
                                            r10 = interfaceC25435a3;
                                        }
                                        Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                                        r10.mo68214i(null);
                                        return boolValueOf3;
                                    }
                                }
                                return enumC31071a;
                            } catch (Throwable th5) {
                                th = th5;
                                r10 = interfaceC25435a10;
                                r10.mo68214i(null);
                                throw th;
                            }
                        case 3:
                            int i37 = cVar2.f90031H;
                            int i38 = cVar2.f90030G;
                            int i39 = cVar2.f90029F;
                            list2 = (List) cVar2.f90038x;
                            InterfaceC25435a interfaceC25435a12 = (InterfaceC25435a) cVar2.f90037w;
                            AbstractC34132o.m107864I(objM66221c);
                            i17 = i37;
                            i18 = i38;
                            i19 = i39;
                            interfaceC25435a2 = interfaceC25435a12;
                            file = (File) objM66221c;
                            C36484a c36484a4 = this.dataPacketUploadFileWriter;
                            AbstractC22676k.m65747g(file);
                            Integer num4 = new Integer(16);
                            cVar2.f90037w = interfaceC25435a2;
                            cVar2.f90038x = list2;
                            cVar2.f90039y = file;
                            cVar2.f90029F = i19;
                            cVar2.f90030G = i18;
                            cVar2.f90031H = i17;
                            cVar2.f90036M = 4;
                            i24 = i19;
                            list3 = list2;
                            i25 = i18;
                            objM116916b = C36484a.m116916b(c36484a4, file, list3, num4, null, null, cVar2, 24, null);
                            if (objM116916b != enumC31071a) {
                                i26 = i24;
                                objM66221c = objM116916b;
                                file2 = file;
                                list4 = list3;
                                i27 = i17;
                                interfaceC25435a3 = interfaceC25435a2;
                                i28 = i25;
                                c36485b = (C36485b) objM66221c;
                                if (c36485b != null) {
                                    c17644a = new C17644a(this.strapMetadataDaoInteractor.m75170g(c36485b.getVersion()), c36485b.getOutputFile(), c36485b.getOldestTimestamp(), c36485b.getNewestTimestamp(), (int) c36485b.getPacketCount(), 16);
                                } else {
                                    c17644a = null;
                                }
                                if (c17644a != null) {
                                    cVar2.f90037w = interfaceC25435a3;
                                    cVar2.f90038x = list4;
                                    cVar2.f90039y = file2;
                                    cVar2.f90040z = null;
                                    cVar2.f90029F = i26;
                                    cVar2.f90030G = i28;
                                    cVar2.f90031H = i27;
                                    cVar2.f90036M = 5;
                                    objM66221c = m66221c(c17644a, cVar2);
                                    if (objM66221c != enumC31071a) {
                                        InterfaceC25435a interfaceC25435a13 = interfaceC25435a3;
                                        i29 = i27;
                                        file3 = file2;
                                        list5 = list4;
                                        interfaceC25435a4 = interfaceC25435a13;
                                        zBooleanValue2 = ((Boolean) objM66221c).booleanValue();
                                        if (zBooleanValue2) {
                                            c17652i = this.labradorPacketsDbManager;
                                            cVar2.f90037w = interfaceC25435a4;
                                            cVar2.f90038x = null;
                                            cVar2.f90039y = file3;
                                            cVar2.f90040z = null;
                                            cVar2.f90028E = objM66221c;
                                            cVar2.f90029F = i26;
                                            cVar2.f90030G = i28;
                                            cVar2.f90033J = zBooleanValue2;
                                            cVar2.f90031H = 0;
                                            cVar2.f90032I = i29;
                                            cVar2.f90036M = 6;
                                            if (c17652i.m50292a(list5, cVar2) != enumC31071a) {
                                                obj = objM66221c;
                                                interfaceC25435a6 = interfaceC25435a4;
                                                objM66221c = obj;
                                                interfaceC25435a5 = interfaceC25435a6;
                                            }
                                        } else {
                                            interfaceC25435a5 = interfaceC25435a4;
                                        }
                                        file3.delete();
                                        zBooleanValue = ((Boolean) objM66221c).booleanValue();
                                        r10 = interfaceC25435a5;
                                    }
                                } else {
                                    zBooleanValue = false;
                                    r10 = interfaceC25435a3;
                                }
                                Boolean boolValueOf4 = Boolean.valueOf(zBooleanValue);
                                r10.mo68214i(null);
                                return boolValueOf4;
                            }
                            return enumC31071a;
                        case 4:
                            i27 = cVar2.f90031H;
                            int i44 = cVar2.f90030G;
                            int i45 = cVar2.f90029F;
                            File file4 = (File) cVar2.f90039y;
                            List<C17645b> list6 = (List) cVar2.f90038x;
                            InterfaceC25435a interfaceC25435a14 = (InterfaceC25435a) cVar2.f90037w;
                            AbstractC34132o.m107864I(objM66221c);
                            i28 = i44;
                            interfaceC25435a3 = interfaceC25435a14;
                            list4 = list6;
                            file2 = file4;
                            i26 = i45;
                            c36485b = (C36485b) objM66221c;
                            if (c36485b != null) {
                                c17644a = new C17644a(this.strapMetadataDaoInteractor.m75170g(c36485b.getVersion()), c36485b.getOutputFile(), c36485b.getOldestTimestamp(), c36485b.getNewestTimestamp(), (int) c36485b.getPacketCount(), 16);
                            } else {
                                c17644a = null;
                            }
                            if (c17644a != null) {
                                cVar2.f90037w = interfaceC25435a3;
                                cVar2.f90038x = list4;
                                cVar2.f90039y = file2;
                                cVar2.f90040z = null;
                                cVar2.f90029F = i26;
                                cVar2.f90030G = i28;
                                cVar2.f90031H = i27;
                                cVar2.f90036M = 5;
                                objM66221c = m66221c(c17644a, cVar2);
                                if (objM66221c != enumC31071a) {
                                    InterfaceC25435a interfaceC25435a15 = interfaceC25435a3;
                                    i29 = i27;
                                    file3 = file2;
                                    list5 = list4;
                                    interfaceC25435a4 = interfaceC25435a15;
                                    zBooleanValue2 = ((Boolean) objM66221c).booleanValue();
                                    if (zBooleanValue2) {
                                        c17652i = this.labradorPacketsDbManager;
                                        cVar2.f90037w = interfaceC25435a4;
                                        cVar2.f90038x = null;
                                        cVar2.f90039y = file3;
                                        cVar2.f90040z = null;
                                        cVar2.f90028E = objM66221c;
                                        cVar2.f90029F = i26;
                                        cVar2.f90030G = i28;
                                        cVar2.f90033J = zBooleanValue2;
                                        cVar2.f90031H = 0;
                                        cVar2.f90032I = i29;
                                        cVar2.f90036M = 6;
                                        if (c17652i.m50292a(list5, cVar2) != enumC31071a) {
                                            obj = objM66221c;
                                            interfaceC25435a6 = interfaceC25435a4;
                                            objM66221c = obj;
                                            interfaceC25435a5 = interfaceC25435a6;
                                        }
                                    } else {
                                        interfaceC25435a5 = interfaceC25435a4;
                                    }
                                    file3.delete();
                                    zBooleanValue = ((Boolean) objM66221c).booleanValue();
                                    r10 = interfaceC25435a5;
                                }
                                return enumC31071a;
                            }
                            zBooleanValue = false;
                            r10 = interfaceC25435a3;
                            Boolean boolValueOf5 = Boolean.valueOf(zBooleanValue);
                            r10.mo68214i(null);
                            return boolValueOf5;
                        case 5:
                            int i46 = cVar2.f90031H;
                            int i47 = cVar2.f90030G;
                            int i48 = cVar2.f90029F;
                            File file5 = (File) cVar2.f90039y;
                            list5 = (List) cVar2.f90038x;
                            InterfaceC25435a interfaceC25435a16 = (InterfaceC25435a) cVar2.f90037w;
                            AbstractC34132o.m107864I(objM66221c);
                            i29 = i46;
                            file3 = file5;
                            i26 = i48;
                            i28 = i47;
                            interfaceC25435a4 = interfaceC25435a16;
                            zBooleanValue2 = ((Boolean) objM66221c).booleanValue();
                            if (zBooleanValue2) {
                                c17652i = this.labradorPacketsDbManager;
                                cVar2.f90037w = interfaceC25435a4;
                                cVar2.f90038x = null;
                                cVar2.f90039y = file3;
                                cVar2.f90040z = null;
                                cVar2.f90028E = objM66221c;
                                cVar2.f90029F = i26;
                                cVar2.f90030G = i28;
                                cVar2.f90033J = zBooleanValue2;
                                cVar2.f90031H = 0;
                                cVar2.f90032I = i29;
                                cVar2.f90036M = 6;
                                if (c17652i.m50292a(list5, cVar2) != enumC31071a) {
                                    obj = objM66221c;
                                    interfaceC25435a6 = interfaceC25435a4;
                                    objM66221c = obj;
                                    interfaceC25435a5 = interfaceC25435a6;
                                }
                                return enumC31071a;
                            }
                            interfaceC25435a5 = interfaceC25435a4;
                            file3.delete();
                            zBooleanValue = ((Boolean) objM66221c).booleanValue();
                            r10 = interfaceC25435a5;
                            Boolean boolValueOf6 = Boolean.valueOf(zBooleanValue);
                            r10.mo68214i(null);
                            return boolValueOf6;
                        case 6:
                            obj = cVar2.f90028E;
                            file3 = (File) cVar2.f90039y;
                            InterfaceC25435a interfaceC25435a17 = (InterfaceC25435a) cVar2.f90037w;
                            AbstractC34132o.m107864I(objM66221c);
                            interfaceC25435a6 = interfaceC25435a17;
                            objM66221c = obj;
                            interfaceC25435a5 = interfaceC25435a6;
                            file3.delete();
                            zBooleanValue = ((Boolean) objM66221c).booleanValue();
                            r10 = interfaceC25435a5;
                            Boolean boolValueOf7 = Boolean.valueOf(zBooleanValue);
                            r10.mo68214i(null);
                            return boolValueOf7;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e15) {
            e = e15;
            r10 = interfaceC25435a4;
        } catch (Throwable th7) {
            th = th7;
            r10 = interfaceC25435a4;
        }
    }

    public /* synthetic */ C22836a(InterfaceC34116n interfaceC34116n, File file, C17652i c17652i, FeatureFlagChecker featureFlagChecker, AbstractC21909c abstractC21909c, LabradorNetworkApi labradorNetworkApi, C25561a c25561a, C36484a c36484a, InterfaceC25435a interfaceC25435a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34116n, file, c17652i, featureFlagChecker, abstractC21909c, labradorNetworkApi, c25561a, c36484a, (i13 & 256) != 0 ? AbstractC25438d.m74669a() : interfaceC25435a);
    }
}
