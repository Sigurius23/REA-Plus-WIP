package og1;

import com.mapbox.maps.MapboxMap;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion;
import ct0.InterfaceC11107b;
import gt0.InterfaceC16182d;
import ht0.EnumC17623a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23468n;
import lg1.C24035a;
import mg1.C25529b;
import mg1.C25530c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import sg1.InterfaceC32449a;
import tg1.EnumC33784a;
import tg1.EnumC33785b;
import tt0.AbstractC34157b;

/* JADX INFO: renamed from: og1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J&\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b-\u0010,J\u0018\u0010.\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b.\u0010,J(\u00102\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b2\u00103J \u00104\u001a\u0002002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b6\u00107J\u0018\u00109\u001a\u0002082\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b9\u00107J \u0010;\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010:\u001a\u000208H\u0096@¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u0002082\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b=\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010B¨\u0006C"}, m65681d2 = {"Log1/a;", "Lsg1/a;", "Lct0/b;", "base64", "Lmg1/b;", "firmwareFilesHelper", "Lmg1/c;", "firmwarePrefs", "Llg1/a;", "otaFwUpdateApiWrapper", "Lgt0/d;", "firmwareAnalyticsHelper", "<init>", "(Lct0/b;Lmg1/b;Lmg1/c;Llg1/a;Lgt0/d;)V", "", "serial", "", "Ltg1/b;", "deviceChipVersionMap", "", "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;", "chipFirmwareList", "Ltg1/a;", "whoopDevice", "Lgt0/h;", "o", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ltg1/a;Lq83/d;)Ljava/lang/Object;", "expectedFirmwareList", "", "n", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "key", "Lht0/a;", "chip", "a", "(Ljava/lang/String;Lht0/a;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "isSuccessful", "Ll83/n;", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;ZLq83/d;)Ljava/lang/Object;", "k", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;", "i", "d", "firmwareVersion", "", MapboxMap.QFE_OFFSET, "f", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "j", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "e", "time", "c", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "g", "Lct0/b;", "Lmg1/b;", "Lmg1/c;", "Llg1/a;", "Lgt0/d;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27918a implements InterfaceC32449a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC11107b base64;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25529b firmwareFilesHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C25530c firmwarePrefs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C24035a otaFwUpdateApiWrapper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC16182d firmwareAnalyticsHelper;

    /* JADX INFO: renamed from: og1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl", m100430f = "FirmwareRepoImpl.kt", m100431l = {72, 74, 77}, m100432m = "checkAndDownloadUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f112570E;

        /* JADX INFO: renamed from: F */
        int f112571F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f112572G;

        /* JADX INFO: renamed from: I */
        int f112574I;

        /* JADX INFO: renamed from: w */
        Object f112575w;

        /* JADX INFO: renamed from: x */
        Object f112576x;

        /* JADX INFO: renamed from: y */
        Object f112577y;

        /* JADX INFO: renamed from: z */
        Object f112578z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112572G = obj;
            this.f112574I |= Integer.MIN_VALUE;
            return C27918a.this.mo84254k(null, this);
        }
    }

    /* JADX INFO: renamed from: og1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl", m100430f = "FirmwareRepoImpl.kt", m100431l = {83}, m100432m = "checkIfFirmwareFilesExist", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f112579w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f112580x;

        /* JADX INFO: renamed from: z */
        int f112582z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112580x = obj;
            this.f112582z |= Integer.MIN_VALUE;
            return C27918a.this.mo84252i(null, this);
        }
    }

    /* JADX INFO: renamed from: og1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl", m100430f = "FirmwareRepoImpl.kt", m100431l = {122}, m100432m = "checkIfFirmwareFilesExist", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f112583E;

        /* JADX INFO: renamed from: w */
        Object f112584w;

        /* JADX INFO: renamed from: x */
        Object f112585x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f112586y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112586y = obj;
            this.f112583E |= Integer.MIN_VALUE;
            return C27918a.this.m84242n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: og1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl", m100430f = "FirmwareRepoImpl.kt", m100431l = {88, 89, 90, 91}, m100432m = "deleteFirmwareFiles", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f112588w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f112589x;

        /* JADX INFO: renamed from: z */
        int f112591z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112589x = obj;
            this.f112591z |= Integer.MIN_VALUE;
            return C27918a.this.mo84247d(null, this);
        }
    }

    /* JADX INFO: renamed from: og1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl", m100430f = "FirmwareRepoImpl.kt", m100431l = {37, 40, 43, 44, 45}, m100432m = "downloadFwUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f112592E;

        /* JADX INFO: renamed from: F */
        Object f112593F;

        /* JADX INFO: renamed from: G */
        int f112594G;

        /* JADX INFO: renamed from: H */
        boolean f112595H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f112596I;

        /* JADX INFO: renamed from: K */
        int f112598K;

        /* JADX INFO: renamed from: w */
        Object f112599w;

        /* JADX INFO: renamed from: x */
        Object f112600x;

        /* JADX INFO: renamed from: y */
        Object f112601y;

        /* JADX INFO: renamed from: z */
        Object f112602z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112596I = obj;
            this.f112598K |= Integer.MIN_VALUE;
            return C27918a.this.m84243o(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: og1.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl", m100430f = "FirmwareRepoImpl.kt", m100431l = {61}, m100432m = "getLatestDownloadedFirmware", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f112603E;

        /* JADX INFO: renamed from: w */
        Object f112604w;

        /* JADX INFO: renamed from: x */
        Object f112605x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f112606y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112606y = obj;
            this.f112603E |= Integer.MIN_VALUE;
            return C27918a.this.mo84244a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: og1.a$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl", m100430f = "FirmwareRepoImpl.kt", m100431l = {66}, m100432m = "reportFirmwareUpdateStatus-0E7RQCE", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f112608E;

        /* JADX INFO: renamed from: G */
        int f112610G;

        /* JADX INFO: renamed from: w */
        Object f112611w;

        /* JADX INFO: renamed from: x */
        Object f112612x;

        /* JADX INFO: renamed from: y */
        Object f112613y;

        /* JADX INFO: renamed from: z */
        boolean f112614z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112608E = obj;
            this.f112610G |= Integer.MIN_VALUE;
            Object objMo84251h = C27918a.this.mo84251h(null, false, this);
            return objMo84251h == EnumC31071a.f128113w ? objMo84251h : new C23468n(objMo84251h);
        }
    }

    public C27918a(InterfaceC11107b base64, C25529b firmwareFilesHelper, C25530c firmwarePrefs, C24035a otaFwUpdateApiWrapper, InterfaceC16182d firmwareAnalyticsHelper) {
        AbstractC22676k.m65750j(base64, "base64");
        AbstractC22676k.m65750j(firmwareFilesHelper, "firmwareFilesHelper");
        AbstractC22676k.m65750j(firmwarePrefs, "firmwarePrefs");
        AbstractC22676k.m65750j(otaFwUpdateApiWrapper, "otaFwUpdateApiWrapper");
        AbstractC22676k.m65750j(firmwareAnalyticsHelper, "firmwareAnalyticsHelper");
        this.base64 = base64;
        this.firmwareFilesHelper = firmwareFilesHelper;
        this.firmwarePrefs = firmwarePrefs;
        this.otaFwUpdateApiWrapper = otaFwUpdateApiWrapper;
        this.firmwareAnalyticsHelper = firmwareAnalyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m84242n(String str, List<ChipFirmwareVersion> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f112583E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f112583E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM75094c = cVar.f112586y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f112583E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM75094c);
            C25530c c25530c = this.firmwarePrefs;
            cVar.f112584w = null;
            cVar.f112585x = list;
            cVar.f112583E = 1;
            objM75094c = c25530c.m75094c(str, cVar);
            if (objM75094c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) cVar.f112585x;
            AbstractC34132o.m107864I(objM75094c);
        }
        return Boolean.valueOf(AbstractC34157b.m107934a((List) objM75094c, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0132  */
    /* JADX WARN: Code duplicated, block: B:36:0x0164  */
    /* JADX WARN: Code duplicated, block: B:40:0x018a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0197  */
    /* JADX WARN: Code duplicated, block: B:44:0x019c  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c0, code lost:
    
        if (r3.m75104m(r8, r9, r4) == r5) goto L47;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84243o(java.lang.String r24, java.util.Map<tg1.EnumC33785b, java.lang.String> r25, java.util.List<com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion> r26, tg1.EnumC33784a r27, q83.InterfaceC30057d<? super gt0.InterfaceC16186h> r28) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og1.C27918a.m84243o(java.lang.String, java.util.Map, java.util.List, tg1.a, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: a */
    public Object mo84244a(String str, EnumC17623a enumC17623a, InterfaceC30057d<? super ChipFirmwareVersion> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f112603E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f112603E = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM75094c = fVar.f112606y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f112603E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM75094c);
            C25530c c25530c = this.firmwarePrefs;
            fVar.f112604w = null;
            fVar.f112605x = enumC17623a;
            fVar.f112603E = 1;
            objM75094c = c25530c.m75094c(str, fVar);
            if (objM75094c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC17623a = (EnumC17623a) fVar.f112605x;
            AbstractC34132o.m107864I(objM75094c);
        }
        for (Object obj : (Iterable) objM75094c) {
            if (AbstractC22676k.m65745e(((ChipFirmwareVersion) obj).getChipName(), enumC17623a.name())) {
                return obj;
            }
        }
        return null;
    }

    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: b */
    public Object mo84245b(String str, String str2, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return this.firmwarePrefs.m75093b(str, str2, interfaceC30057d);
    }

    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: c */
    public Object mo84246c(String str, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM75105n = this.firmwarePrefs.m75105n(str, j7, interfaceC30057d);
        return objM75105n == EnumC31071a.f128113w ? objM75105n : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[PHI: r8
      0x0094: PHI (r8v3 com.whoop.connectivityCore.firmware.models.WhoopFwDevice) = 
      (r8v2 com.whoop.connectivityCore.firmware.models.WhoopFwDevice)
      (r8v12 com.whoop.connectivityCore.firmware.models.WhoopFwDevice)
     binds: [B:27:0x0091, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r9.m75100i(r8, r0) == r1) goto L31;
     */
    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo84247d(com.whoop.connectivityCore.firmware.models.WhoopFwDevice r8, q83.InterfaceC30057d<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof og1.C27918a.d
            if (r0 == 0) goto L13
            r0 = r9
            og1.a$d r0 = (og1.C27918a.d) r0
            int r1 = r0.f112591z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112591z = r1
            goto L18
        L13:
            og1.a$d r0 = new og1.a$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f112589x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f112591z
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L55
            if (r2 == r6) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r8 = r0.f112588w
            com.whoop.connectivityCore.firmware.models.WhoopFwDevice r8 = (com.whoop.connectivityCore.firmware.models.WhoopFwDevice) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto La6
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            java.lang.Object r8 = r0.f112588w
            com.whoop.connectivityCore.firmware.models.WhoopFwDevice r8 = (com.whoop.connectivityCore.firmware.models.WhoopFwDevice) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L94
        L45:
            java.lang.Object r8 = r0.f112588w
            com.whoop.connectivityCore.firmware.models.WhoopFwDevice r8 = (com.whoop.connectivityCore.firmware.models.WhoopFwDevice) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L83
        L4d:
            java.lang.Object r8 = r0.f112588w
            com.whoop.connectivityCore.firmware.models.WhoopFwDevice r8 = (com.whoop.connectivityCore.firmware.models.WhoopFwDevice) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L72
        L55:
            p505ts.AbstractC34132o.m107864I(r9)
            mg1.b r9 = r7.firmwareFilesHelper
            java.lang.String r2 = r8.getSerial()
            r9.m75086f(r2)
            mg1.c r9 = r7.firmwarePrefs
            java.lang.String r2 = r8.getSerial()
            r0.f112588w = r8
            r0.f112591z = r6
            java.lang.Object r9 = r9.m75092a(r2, r0)
            if (r9 != r1) goto L72
            goto La5
        L72:
            mg1.c r9 = r7.firmwarePrefs
            java.lang.String r2 = r8.getSerial()
            r0.f112588w = r8
            r0.f112591z = r5
            java.lang.Object r9 = r9.m75098g(r2, r0)
            if (r9 != r1) goto L83
            goto La5
        L83:
            mg1.c r9 = r7.firmwarePrefs
            java.lang.String r2 = r8.getSerial()
            r0.f112588w = r8
            r0.f112591z = r4
            java.lang.Object r9 = r9.m75099h(r2, r0)
            if (r9 != r1) goto L94
            goto La5
        L94:
            mg1.c r9 = r7.firmwarePrefs
            java.lang.String r8 = r8.getSerial()
            r2 = 0
            r0.f112588w = r2
            r0.f112591z = r3
            java.lang.Object r8 = r9.m75100i(r8, r0)
            if (r8 != r1) goto La6
        La5:
            return r1
        La6:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: og1.C27918a.mo84247d(com.whoop.connectivityCore.firmware.models.WhoopFwDevice, q83.d):java.lang.Object");
    }

    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: e */
    public Object mo84248e(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        return this.firmwarePrefs.m75097f(str, interfaceC30057d);
    }

    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: f */
    public Object mo84249f(String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM75101j = this.firmwarePrefs.m75101j(str, str2, i13, interfaceC30057d);
        return objM75101j == EnumC31071a.f128113w ? objM75101j : C23454a0.f92919a;
    }

    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: g */
    public Object mo84250g(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        return this.firmwarePrefs.m75096e(str, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: h */
    public Object mo84251h(WhoopFwDevice whoopFwDevice, boolean z4, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f112610G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f112610G = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f112608E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f112610G;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        Map<EnumC33785b, String> mapM84258d = AbstractC27919b.m84258d(whoopFwDevice.getChips());
        EnumC33784a enumC33784aM84257c = AbstractC27919b.m84257c(whoopFwDevice.getDeviceName());
        C24035a c24035a = this.otaFwUpdateApiWrapper;
        String serial = whoopFwDevice.getSerial();
        gVar2.f112611w = null;
        gVar2.f112612x = null;
        gVar2.f112613y = null;
        gVar2.f112614z = z4;
        gVar2.f112610G = 1;
        Object objM70900d = c24035a.m70900d(mapM84258d, z4, enumC33784aM84257c, serial, gVar2);
        return objM70900d == enumC31071a ? enumC31071a : objM70900d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: i */
    public Object mo84252i(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f112582z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f112582z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM75094c = bVar.f112580x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f112582z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM75094c);
            C25530c c25530c = this.firmwarePrefs;
            String serial = whoopFwDevice.getSerial();
            bVar.f112579w = null;
            bVar.f112582z = 1;
            objM75094c = c25530c.m75094c(serial, bVar);
            if (objM75094c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM75094c);
        }
        return Boolean.valueOf(!((Collection) objM75094c).isEmpty());
    }

    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: j */
    public Object mo84253j(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.firmwarePrefs.m75095d(str, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
    
        if (r13 == r0) goto L37;
     */
    @Override // sg1.InterfaceC32449a
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo84254k(com.whoop.connectivityCore.firmware.models.WhoopFwDevice r12, q83.InterfaceC30057d<? super gt0.InterfaceC16186h> r13) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og1.C27918a.mo84254k(com.whoop.connectivityCore.firmware.models.WhoopFwDevice, q83.d):java.lang.Object");
    }
}
