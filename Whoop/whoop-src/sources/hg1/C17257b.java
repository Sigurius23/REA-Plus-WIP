package hg1;

import android.os.Build;
import com.whoop.firmwareEvents.api.FirmwareEventsApi;
import l83.C23454a0;
import m83.AbstractC25265s;
import oh2.C27938a;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p007a6.InterfaceC0422g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: hg1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, m65681d2 = {"Lhg1/b;", "Lhg1/a;", "Ltr2/n;", "logger", "Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;", "firmwareEventsApi", "", "releaseVersion", "La6/g;", "Lf6/f;", "dataStorePreferences", "<init>", "(Ltr2/n;Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;Ljava/lang/String;La6/g;)V", "Lfg1/b;", "exportedStrapEventsMetaData", "", "a", "(Lfg1/b;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "b", "Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;", "c", "Ljava/lang/String;", "d", "La6/g;", "e", "modelString", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17257b implements InterfaceC17256a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FirmwareEventsApi firmwareEventsApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String releaseVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String modelString;

    /* JADX INFO: renamed from: hg1.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.uploader.StrapEventsUploaderToApiImpl", m100430f = "StrapEventsUploaderToApi.kt", m100431l = {37, 38}, m100432m = "uploadToCloud", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f66289E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f66290F;

        /* JADX INFO: renamed from: H */
        int f66292H;

        /* JADX INFO: renamed from: w */
        Object f66293w;

        /* JADX INFO: renamed from: x */
        Object f66294x;

        /* JADX INFO: renamed from: y */
        Object f66295y;

        /* JADX INFO: renamed from: z */
        Object f66296z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f66290F = obj;
            this.f66292H |= Integer.MIN_VALUE;
            return C17257b.this.mo48833a(null, this);
        }
    }

    /* JADX INFO: renamed from: hg1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.uploader.StrapEventsUploaderToApiImpl$uploadToCloud$2", m100430f = "StrapEventsUploaderToApi.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f66297E;

        /* JADX INFO: renamed from: w */
        int f66298w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34846v0 f66300y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27938a f66301z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC34846v0 abstractC34846v0, C27938a c27938a, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f66300y = abstractC34846v0;
            this.f66301z = c27938a;
            this.f66297E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17257b.this.new b(this.f66300y, this.f66301z, this.f66297E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strM84332d;
            String strMo84319a;
            String strMo84319a2;
            String strM84360f;
            String strapId;
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            InterfaceC27939b firmwareVersion;
            C27940c hardwareVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f66298w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FirmwareEventsApi firmwareEventsApi = C17257b.this.firmwareEventsApi;
            AbstractC34846v0 abstractC34846v0 = this.f66300y;
            C27938a c27938a = this.f66301z;
            String str = "";
            if (c27938a == null || (hardwareVersion = c27938a.getHardwareVersion()) == null || (strM84332d = hardwareVersion.m84332d()) == null) {
                strM84332d = "";
            }
            C27938a c27938a2 = this.f66301z;
            if (c27938a2 == null || (firmwareVersion = c27938a2.getFirmwareVersion()) == null || (strMo84319a = firmwareVersion.mo84319a()) == null) {
                strMo84319a = "";
            }
            C27938a c27938a3 = this.f66301z;
            if (c27938a3 == null || (bluetoothVersion = c27938a3.getBluetoothVersion()) == null || (strMo84319a2 = bluetoothVersion.mo84319a()) == null) {
                strMo84319a2 = "";
            }
            C27938a c27938a4 = this.f66301z;
            if (c27938a4 == null || (sigProcVersion = c27938a4.getSigProcVersion()) == null || (strM84360f = sigProcVersion.m84360f()) == null) {
                strM84360f = "";
            }
            C27938a c27938a5 = this.f66301z;
            if (c27938a5 != null && (strapId = c27938a5.getStrapId()) != null) {
                str = strapId;
            }
            String str2 = C17257b.this.releaseVersion;
            String str3 = C17257b.this.modelString;
            C27938a c27938a6 = this.f66301z;
            byte version = c27938a6 != null ? c27938a6.getVersion() : (byte) 4;
            String str4 = this.f66297E;
            this.f66298w = 1;
            Object objUploadFirmwareEvents = firmwareEventsApi.uploadFirmwareEvents(abstractC34846v0, strM84332d, strMo84319a, strMo84319a2, strM84360f, str, str2, str3, version, str4, this);
            return objUploadFirmwareEvents == enumC31071a ? enumC31071a : objUploadFirmwareEvents;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C17257b(InterfaceC34116n logger, FirmwareEventsApi firmwareEventsApi, String releaseVersion, InterfaceC0422g dataStorePreferences) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(firmwareEventsApi, "firmwareEventsApi");
        AbstractC22676k.m65750j(releaseVersion, "releaseVersion");
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        this.logger = logger;
        this.firmwareEventsApi = firmwareEventsApi;
        this.releaseVersion = releaseVersion;
        this.dataStorePreferences = dataStorePreferences;
        this.modelString = AbstractC25265s.m74110N0(AbstractC37056f.m118959K(Build.BRAND, Build.MANUFACTURER, Build.MODEL, Build.DEVICE), "|", null, null, null, 62);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (r15 == r0) goto L26;
     */
    @Override // hg1.InterfaceC17256a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo48833a(fg1.C14456b r14, q83.InterfaceC30057d<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hg1.C17257b.mo48833a(fg1.b, q83.d):java.lang.Object");
    }
}
