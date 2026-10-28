package vd1;

import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao;
import com.whoop.data.local.room.entity.SmartAlarmDiagnosticDto;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.domain.exception.ConnectivityException;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.service.network.model.MobileEventMetaData;
import ek0.C13274b0;
import f82.EnumC14250a;
import f82.EnumC14251b;
import g82.InterfaceC15574a;
import ih0.AbstractC18489d0;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import oh2.InterfaceC27939b;
import or2.C28210w;
import org.joda.time.DateTime;
import ot0.C28323a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import zj0.AbstractC40712c;
import zj0.C40727h;

/* JADX INFO: renamed from: vd1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J;\u0010'\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0014\u0010J\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010ER\u0014\u0010M\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, m65681d2 = {"Lvd1/a;", "Lg82/a;", "Lbc3/c0;", "Lin2/d;", "dispatcherFactory", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Ltd1/b;", "whoopStrapProxy", "Lor2/w;", "deviceStateLogger", "Lrr2/c;", "crashReporter", "Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;", "smartAlarmDiagnosticDao", "<init>", "(Lin2/d;Lcom/whoop/data/repositories/FeatureFlagRepository;Ltd1/b;Lor2/w;Lrr2/c;Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;)V", "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;", "smartAlarmDiagnosticDto", "Ll83/a0;", "m", "(Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;)V", "", "phoneSetAlarmTimeMillis", "Lzj0/h;", "responsePacket", "", "isSuccess", "Lcom/whoop/service/network/model/MobileEventMetaData;", "g", "(Ljava/lang/String;Lzj0/h;Z)Lcom/whoop/service/network/model/MobileEventMetaData;", "Lf82/a;", "smartAlarmEventType", "Lot0/a;", "eventPacket", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lf82/a;Lot0/a;)Lcom/whoop/service/network/model/MobileEventMetaData;", "Lf82/b;", "smartAlarmTrigger", "b", "(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;Z)V", "a", "(Lf82/a;Lot0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lin2/d;", "x", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "y", "Ltd1/b;", "z", "Lor2/w;", "E", "Lrr2/c;", "F", "Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;", "Ltr2/n;", "G", "Ltr2/n;", "logger", "H", "Ljava/lang/String;", "model", "I", "os", "Lbc3/u;", "J", "Lbc3/u;", "job", "j", "()Ljava/lang/String;", "strapId", "f", "maximVersion", "i", "nordicVersion", "k", "()Z", "isBatteryOptimizationOn", "l", "isStrapConnected", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35907a implements InterfaceC15574a, InterfaceC2994c0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final SmartAlarmDiagnosticDao smartAlarmDiagnosticDao;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String model;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String os;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC3061u job;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28210w deviceStateLogger;

    /* JADX INFO: renamed from: vd1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f152874a;

        static {
            int[] iArr = new int[EnumC14250a.values().length];
            try {
                iArr[EnumC14250a.STRAP_DRIVEN_ALARM_SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14250a.STRAP_DRIVEN_ALARM_EXECUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14250a.APP_DRIVEN_ALARM_EXECUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14250a.STRAP_DRIVEN_ALARM_DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f152874a = iArr;
        }
    }

    /* JADX INFO: renamed from: vd1.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.strapalarm.SmartAlarmDiagnosticDbHelperImpl$saveToLocalStorage$1", m100430f = "SmartAlarmDiagnosticDbHelperImpl.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152875w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ SmartAlarmDiagnosticDto f152877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SmartAlarmDiagnosticDto smartAlarmDiagnosticDto, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152877y = smartAlarmDiagnosticDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35907a.this.new b(this.f152877y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152875w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    SmartAlarmDiagnosticDao smartAlarmDiagnosticDao = C35907a.this.smartAlarmDiagnosticDao;
                    SmartAlarmDiagnosticDto smartAlarmDiagnosticDto = this.f152877y;
                    this.f152875w = 1;
                    if (smartAlarmDiagnosticDao.insert(smartAlarmDiagnosticDto, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (SQLiteFullException e5) {
                C35907a.this.logger.mo85222m("Caught a SQLiteFullException: " + e5, new AbstractC30556a.a[0]);
            } catch (SQLiteException e13) {
                InterfaceC31766c.m98634e(C35907a.this.crashReporter, new ConnectivityException("Caught a SQLiteException when trying to store Smart Alarm Diagnostic Data", e13), null, 2, null);
            }
            return C23454a0.f92919a;
        }
    }

    public C35907a(InterfaceC18732d dispatcherFactory, FeatureFlagRepository featureFlagRepository, InterfaceC33704b whoopStrapProxy, C28210w deviceStateLogger, InterfaceC31766c crashReporter, SmartAlarmDiagnosticDao smartAlarmDiagnosticDao) {
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(deviceStateLogger, "deviceStateLogger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(smartAlarmDiagnosticDao, "smartAlarmDiagnosticDao");
        this.dispatcherFactory = dispatcherFactory;
        this.featureFlagRepository = featureFlagRepository;
        this.whoopStrapProxy = whoopStrapProxy;
        this.deviceStateLogger = deviceStateLogger;
        this.crashReporter = crashReporter;
        this.smartAlarmDiagnosticDao = smartAlarmDiagnosticDao;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("SmartAlarmDiagnosticDbHelperImpl");
        String BRAND = Build.BRAND;
        AbstractC22676k.m65749i(BRAND, "BRAND");
        String string = AbstractC39414r.m125869O0(BRAND).toString();
        String MODEL = Build.MODEL;
        AbstractC22676k.m65749i(MODEL, "MODEL");
        this.model = AbstractC18489d0.m53370k(string, " ", AbstractC39414r.m125869O0(MODEL).toString());
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC22676k.m65749i(RELEASE, "RELEASE");
        this.os = RELEASE;
        this.job = AbstractC3006f0.m8710d();
    }

    /* JADX INFO: renamed from: f */
    private final String m114034f() {
        InterfaceC27939b maximVersion;
        WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
        String strMo84319a = (whoopStrapInfoMo106493f == null || (maximVersion = whoopStrapInfoMo106493f.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
        return strMo84319a == null ? "" : strMo84319a;
    }

    /* JADX INFO: renamed from: g */
    private final MobileEventMetaData m114035g(String phoneSetAlarmTimeMillis, C40727h responsePacket, boolean isSuccess) {
        AbstractC40712c abstractC40712c = responsePacket instanceof AbstractC40712c ? (AbstractC40712c) responsePacket : null;
        return new MobileEventMetaData(Boolean.valueOf(isSuccess), null, this.os, this.model, m114038j(), m114034f(), m114037i(), m114039k(), phoneSetAlarmTimeMillis, String.valueOf(abstractC40712c != null ? Long.valueOf(abstractC40712c.m132186c0()) : null), Boolean.valueOf(m114040l()), 2, null);
    }

    /* JADX INFO: renamed from: h */
    private final MobileEventMetaData m114036h(EnumC14250a smartAlarmEventType, C28323a eventPacket) {
        int i13 = a.f152874a[smartAlarmEventType.ordinal()];
        if (i13 == 1) {
            AbstractC22676k.m65748h(eventPacket, "null cannot be cast to non-null type com.whoop.ble.packets.eventpackets.StrapDrivenAlarmSetEventPacket");
            return new MobileEventMetaData(null, null, this.os, this.model, m114038j(), m114034f(), m114037i(), m114039k(), null, String.valueOf(((C13274b0) eventPacket).m37329a0()), Boolean.valueOf(m114040l()), 2, null);
        }
        if (i13 == 2 || i13 == 3 || i13 == 4) {
            return new MobileEventMetaData(null, null, this.os, this.model, m114038j(), m114034f(), m114037i(), m114039k(), null, null, Boolean.valueOf(m114040l()), 2, null);
        }
        throw new IllegalStateException("This method is only valid for Event packets. Call method getMetaDataForCommands for Smart Alarm Commands case!");
    }

    /* JADX INFO: renamed from: i */
    private final String m114037i() {
        InterfaceC27939b bluetoothVersion;
        WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
        String strMo84319a = (whoopStrapInfoMo106493f == null || (bluetoothVersion = whoopStrapInfoMo106493f.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
        return strMo84319a == null ? "" : strMo84319a;
    }

    /* JADX INFO: renamed from: j */
    private final String m114038j() {
        WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
        String serialNumber = whoopStrapInfoMo106493f != null ? whoopStrapInfoMo106493f.getSerialNumber() : null;
        return serialNumber == null ? "" : serialNumber;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m114039k() {
        return !this.deviceStateLogger.m85395e();
    }

    /* JADX INFO: renamed from: l */
    private final boolean m114040l() {
        return this.whoopStrapProxy.mo106484A().isReady();
    }

    /* JADX INFO: renamed from: m */
    private final void m114041m(SmartAlarmDiagnosticDto smartAlarmDiagnosticDto) {
        AbstractC3006f0.m8732z(this, null, null, new b(smartAlarmDiagnosticDto, null), 3);
    }

    @Override // g82.InterfaceC15574a
    /* JADX INFO: renamed from: a */
    public void mo43870a(EnumC14250a smartAlarmEventType, C28323a eventPacket) {
        AbstractC22676k.m65750j(smartAlarmEventType, "smartAlarmEventType");
        AbstractC22676k.m65750j(eventPacket, "eventPacket");
        m114041m(new SmartAlarmDiagnosticDto(smartAlarmEventType, m114036h(smartAlarmEventType, eventPacket), null, DateTime.now().getMillis()));
    }

    @Override // g82.InterfaceC15574a
    /* JADX INFO: renamed from: b */
    public void mo43871b(EnumC14250a smartAlarmEventType, EnumC14251b smartAlarmTrigger, String phoneSetAlarmTimeMillis, C40727h responsePacket, boolean isSuccess) {
        AbstractC22676k.m65750j(smartAlarmEventType, "smartAlarmEventType");
        AbstractC22676k.m65750j(phoneSetAlarmTimeMillis, "phoneSetAlarmTimeMillis");
        m114041m(new SmartAlarmDiagnosticDto(smartAlarmEventType, m114035g(phoneSetAlarmTimeMillis, responsePacket, isSuccess), smartAlarmTrigger != null ? smartAlarmTrigger.name() : null, DateTime.now().getMillis()));
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.mo54465b().plus(this.job);
    }
}
