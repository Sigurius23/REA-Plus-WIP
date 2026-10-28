package lg1;

import com.whoop.firmwareUpdateService.data.api.OtaFirmwareUpdateApi;
import com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion;
import com.whoop.firmwareUpdateService.data.models.DesiredDeviceFirmwareConfig;
import com.whoop.firmwareUpdateService.data.models.DesiredDeviceFirmwareUpdate;
import com.whoop.firmwareUpdateService.data.models.DownloadFwFilePayload;
import com.whoop.firmwareUpdateService.data.models.ReportFwUpdateResultPayload;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tg1.AbstractC33786c;
import tg1.EnumC33784a;
import tg1.EnumC33785b;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: lg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006\""}, m65681d2 = {"Llg1/a;", "", "Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;Ltr2/n;)V", "", "Ltg1/b;", "", "deviceChipVersionMap", "Ltg1/a;", "whoopDevice", "Ll83/n;", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;", "b", "(Ljava/util/Map;Ltg1/a;Lq83/d;)Ljava/lang/Object;", "currentDeviceChipVersionMap", "", "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;", "chipFirmwareUpgrade", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;", "c", "(Ljava/util/Map;Ljava/util/List;Ltg1/a;Lq83/d;)Ljava/lang/Object;", "", "isSuccessful", "auxiliaryDeviceId", "Ll83/a0;", "d", "(Ljava/util/Map;ZLtg1/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;", "Ltr2/n;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24035a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final OtaFirmwareUpdateApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: lg1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.api.OtaFwUpdateApiWrapper", m100430f = "OtaFwUpdateApiWrapper.kt", m100431l = {20}, m100432m = "checkForFirmwareUpdate-0E7RQCE", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f94961F;

        /* JADX INFO: renamed from: w */
        Object f94962w;

        /* JADX INFO: renamed from: x */
        Object f94963x;

        /* JADX INFO: renamed from: y */
        Object f94964y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f94965z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f94965z = obj;
            this.f94961F |= Integer.MIN_VALUE;
            Object objM70898b = C24035a.this.m70898b(null, null, this);
            return objM70898b == EnumC31071a.f128113w ? objM70898b : new C23468n(objM70898b);
        }
    }

    /* JADX INFO: renamed from: lg1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.api.OtaFwUpdateApiWrapper$checkForFirmwareUpdate$response$1", m100430f = "OtaFwUpdateApiWrapper.kt", m100431l = {21}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f94966w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC33784a f94968y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<ChipFirmwareVersion> f94969z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC33784a enumC33784a, List<ChipFirmwareVersion> list, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f94968y = enumC33784a;
            this.f94969z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C24035a.this.new b(this.f94968y, this.f94969z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94966w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            OtaFirmwareUpdateApi otaFirmwareUpdateApi = C24035a.this.api;
            String serializedValue = this.f94968y.getSerializedValue();
            List<ChipFirmwareVersion> list = this.f94969z;
            this.f94966w = 1;
            Object desiredDeviceFirmwareConfig = otaFirmwareUpdateApi.getDesiredDeviceFirmwareConfig(serializedValue, list, this);
            return desiredDeviceFirmwareConfig == enumC31071a ? enumC31071a : desiredDeviceFirmwareConfig;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super DesiredDeviceFirmwareConfig> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: lg1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.api.OtaFwUpdateApiWrapper", m100430f = "OtaFwUpdateApiWrapper.kt", m100431l = {35}, m100432m = "downloadFirmwareUpdate-BWLJW6A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f94970E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f94971F;

        /* JADX INFO: renamed from: H */
        int f94973H;

        /* JADX INFO: renamed from: w */
        Object f94974w;

        /* JADX INFO: renamed from: x */
        Object f94975x;

        /* JADX INFO: renamed from: y */
        Object f94976y;

        /* JADX INFO: renamed from: z */
        Object f94977z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f94971F = obj;
            this.f94973H |= Integer.MIN_VALUE;
            Object objM70899c = C24035a.this.m70899c(null, null, null, this);
            return objM70899c == EnumC31071a.f128113w ? objM70899c : new C23468n(objM70899c);
        }
    }

    /* JADX INFO: renamed from: lg1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.api.OtaFwUpdateApiWrapper$downloadFirmwareUpdate$response$1", m100430f = "OtaFwUpdateApiWrapper.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f94978w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC33784a f94980y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ DownloadFwFilePayload f94981z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC33784a enumC33784a, DownloadFwFilePayload downloadFwFilePayload, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f94980y = enumC33784a;
            this.f94981z = downloadFwFilePayload;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C24035a.this.new d(this.f94980y, this.f94981z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94978w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            OtaFirmwareUpdateApi otaFirmwareUpdateApi = C24035a.this.api;
            String serializedValue = this.f94980y.getSerializedValue();
            DownloadFwFilePayload downloadFwFilePayload = this.f94981z;
            this.f94978w = 1;
            Object objDownloadFirmwareUpdate = otaFirmwareUpdateApi.downloadFirmwareUpdate(serializedValue, downloadFwFilePayload, this);
            return objDownloadFirmwareUpdate == enumC31071a ? enumC31071a : objDownloadFirmwareUpdate;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super DesiredDeviceFirmwareUpdate> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: lg1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.api.OtaFwUpdateApiWrapper", m100430f = "OtaFwUpdateApiWrapper.kt", m100431l = {52}, m100432m = "reportFirmwareUpdateResult-yxL6bBk", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f94982E;

        /* JADX INFO: renamed from: F */
        Object f94983F;

        /* JADX INFO: renamed from: G */
        boolean f94984G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f94985H;

        /* JADX INFO: renamed from: J */
        int f94987J;

        /* JADX INFO: renamed from: w */
        Object f94988w;

        /* JADX INFO: renamed from: x */
        Object f94989x;

        /* JADX INFO: renamed from: y */
        Object f94990y;

        /* JADX INFO: renamed from: z */
        Object f94991z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f94985H = obj;
            this.f94987J |= Integer.MIN_VALUE;
            Object objM70900d = C24035a.this.m70900d(null, false, null, null, this);
            return objM70900d == EnumC31071a.f128113w ? objM70900d : new C23468n(objM70900d);
        }
    }

    /* JADX INFO: renamed from: lg1.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.api.OtaFwUpdateApiWrapper$reportFirmwareUpdateResult$response$1", m100430f = "OtaFwUpdateApiWrapper.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f94992E;

        /* JADX INFO: renamed from: w */
        int f94993w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC33784a f94995y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ReportFwUpdateResultPayload f94996z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC33784a enumC33784a, ReportFwUpdateResultPayload reportFwUpdateResultPayload, String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f94995y = enumC33784a;
            this.f94996z = reportFwUpdateResultPayload;
            this.f94992E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C24035a.this.new f(this.f94995y, this.f94996z, this.f94992E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94993w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            OtaFirmwareUpdateApi otaFirmwareUpdateApi = C24035a.this.api;
            String serializedValue = this.f94995y.getSerializedValue();
            ReportFwUpdateResultPayload reportFwUpdateResultPayload = this.f94996z;
            String str = this.f94992E;
            this.f94993w = 1;
            Object objReportFirmwareUpdateResult = otaFirmwareUpdateApi.reportFirmwareUpdateResult(serializedValue, reportFwUpdateResultPayload, str, this);
            return objReportFirmwareUpdateResult == enumC31071a ? enumC31071a : objReportFirmwareUpdateResult;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C24035a(OtaFirmwareUpdateApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m70898b(Map<EnumC33785b, String> map, EnumC33784a enumC33784a, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f94961F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f94961F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f94965z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f94961F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            List<ChipFirmwareVersion> listM106851a = AbstractC33786c.m106851a(map);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(enumC33784a, listM106851a, null);
            aVar2.f94962w = null;
            aVar2.f94963x = null;
            aVar2.f94964y = null;
            aVar2.f94961F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to check for firmware updates", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC34132o.m107888l(((InterfaceC34385a.b) interfaceC34385a).getException());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m70899c(Map<EnumC33785b, String> map, List<ChipFirmwareVersion> list, EnumC33784a enumC33784a, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f94973H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f94973H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f94971F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f94973H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            DownloadFwFilePayload downloadFwFilePayload = new DownloadFwFilePayload(AbstractC33786c.m106851a(map), list);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(enumC33784a, downloadFwFilePayload, null);
            cVar2.f94974w = null;
            cVar2.f94975x = null;
            cVar2.f94976y = null;
            cVar2.f94977z = null;
            cVar2.f94970E = null;
            cVar2.f94973H = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to download firmware file", dVar, cVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC34132o.m107888l(((InterfaceC34385a.b) interfaceC34385a).getException());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    public final Object m70900d(Map<EnumC33785b, String> map, boolean z4, EnumC33784a enumC33784a, String str, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f94987J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f94987J = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f94985H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f94987J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            ReportFwUpdateResultPayload reportFwUpdateResultPayload = new ReportFwUpdateResultPayload(AbstractC33786c.m106851a(map), z4);
            String str2 = enumC33784a == EnumC33784a.PUFFIN ? str : null;
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(enumC33784a, reportFwUpdateResultPayload, str2, null);
            eVar2.f94988w = null;
            eVar2.f94989x = null;
            eVar2.f94990y = null;
            eVar2.f94991z = null;
            eVar2.f94982E = null;
            eVar2.f94983F = null;
            eVar2.f94984G = z4;
            eVar2.f94987J = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to report firmware update result", fVar, eVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return C23454a0.f92919a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC34132o.m107888l(((InterfaceC34385a.b) interfaceC34385a).getException());
        }
        throw new NoWhenBranchMatchedException();
    }
}
