package lx0;

import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.data.repositories.FeatureFlagChecker;
import java.time.Clock;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: lx0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ<\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Llx0/f;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/time/Clock;Ltr2/n;)V", "T", "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "triggerSource", "Lkotlin/Function1;", "Lq83/d;", "block", "a", "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Ljava/time/Clock;", "c", "Ltr2/n;", "Lmc3/a;", "d", "Lmc3/a;", "mutex", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24789f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: lx0.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.upload.UploadPipelineGate", m100430f = "UploadPipelineGate.kt", m100431l = {32, 52, 42}, m100432m = "withUploadLock$data_sync_service_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f97013E;

        /* JADX INFO: renamed from: F */
        int f97014F;

        /* JADX INFO: renamed from: G */
        int f97015G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f97016H;

        /* JADX INFO: renamed from: J */
        int f97018J;

        /* JADX INFO: renamed from: w */
        Object f97019w;

        /* JADX INFO: renamed from: x */
        Object f97020x;

        /* JADX INFO: renamed from: y */
        Object f97021y;

        /* JADX INFO: renamed from: z */
        long f97022z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f97016H = obj;
            this.f97018J |= Integer.MIN_VALUE;
            return C24789f.this.m72654a(null, null, this);
        }
    }

    public C24789f(FeatureFlagChecker featureFlagChecker, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.featureFlagChecker = featureFlagChecker;
        this.clock = clock;
        this.logger = logger;
        this.mutex = AbstractC25438d.m74669a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final <T> Object m72654a(DeviceTriggerSource deviceTriggerSource, Function1 function1, InterfaceC30057d<? super T> interfaceC30057d) throws Throwable {
        a aVar;
        long j7;
        DeviceTriggerSource deviceTriggerSource2;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Function1 function2 = function1;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f97018J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f97018J = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objInvoke = aVar.f97016H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar.f97018J;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objInvoke);
                if (this.featureFlagChecker.isFeatureEnabled("droid-sequential-upload-pipeline")) {
                    long jMillis = this.clock.millis();
                    InterfaceC25435a interfaceC25435a3 = this.mutex;
                    aVar.f97019w = deviceTriggerSource;
                    aVar.f97020x = function2;
                    aVar.f97021y = interfaceC25435a3;
                    aVar.f97022z = jMillis;
                    aVar.f97014F = 0;
                    aVar.f97018J = 2;
                    if (interfaceC25435a3.mo68211b(aVar) != enumC31071a) {
                        j7 = jMillis;
                        deviceTriggerSource2 = deviceTriggerSource;
                        interfaceC25435a = interfaceC25435a3;
                        i13 = 0;
                    }
                } else {
                    aVar.f97019w = null;
                    aVar.f97020x = null;
                    aVar.f97018J = 1;
                    Object objInvoke2 = function2.invoke(aVar);
                    if (objInvoke2 != enumC31071a) {
                        return objInvoke2;
                    }
                }
                return enumC31071a;
            }
            if (i15 == 1) {
                AbstractC34132o.m107864I(objInvoke);
                return objInvoke;
            }
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) aVar.f97021y;
                try {
                    AbstractC34132o.m107864I(objInvoke);
                    interfaceC25435a2.mo68214i(null);
                    return objInvoke;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC25435a2.mo68214i(null);
                    throw th;
                }
            }
            int i16 = aVar.f97014F;
            j7 = aVar.f97022z;
            interfaceC25435a = (InterfaceC25435a) aVar.f97021y;
            Function1 function3 = (Function1) aVar.f97020x;
            deviceTriggerSource2 = (DeviceTriggerSource) aVar.f97019w;
            AbstractC34132o.m107864I(objInvoke);
            i13 = i16;
            function2 = function3;
            long jMillis2 = this.clock.millis() - j7;
            if (jMillis2 > 0) {
                this.logger.mo85216g("Upload gate acquired for " + deviceTriggerSource2 + " after " + jMillis2 + "ms wait", new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85228t("Upload gate acquired for " + deviceTriggerSource2, new AbstractC30556a.a[0]);
            }
            aVar.f97019w = null;
            aVar.f97020x = null;
            aVar.f97021y = interfaceC25435a;
            aVar.f97022z = j7;
            aVar.f97014F = i13;
            aVar.f97015G = 0;
            aVar.f97013E = jMillis2;
            aVar.f97018J = 3;
            objInvoke = function2.invoke(aVar);
            if (objInvoke != enumC31071a) {
                interfaceC25435a2 = interfaceC25435a;
                interfaceC25435a2.mo68214i(null);
                return objInvoke;
            }
            return enumC31071a;
        } catch (Throwable th4) {
            th = th4;
            interfaceC25435a2 = interfaceC25435a;
            interfaceC25435a2.mo68214i(null);
            throw th;
        }
    }
}
