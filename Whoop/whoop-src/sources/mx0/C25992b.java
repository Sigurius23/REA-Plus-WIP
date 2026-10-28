package mx0;

import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.dataSyncService.workmanager.DataSyncWorker;
import dt0.C12359b;
import java.time.Clock;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import jx0.C21998a;
import jx0.C22003f;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18392z;
import p218ic.EnumC18363i0;
import p218ic.EnumC18366k;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p420qc.C30207q;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: mx0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lmx0/b;", "", "Lic/p0;", "workManager", "Ltr2/n;", "logger", "Ljx0/f;", "dataSyncWorkDatabaseManager", "Ljava/time/Clock;", "clock", "<init>", "(Lic/p0;Ltr2/n;Ljx0/f;Ljava/time/Clock;)V", "Ljava/util/UUID;", "id", "Ldt0/b;", "request", "Ll83/a0;", "b", "(Ljava/util/UUID;Ldt0/b;Lq83/d;)Ljava/lang/Object;", "e", "(Ldt0/b;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "triggerSource", "", "d", "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lq83/d;)Ljava/lang/Object;", "a", "Lic/p0;", "c", "()Lic/p0;", "Ltr2/n;", "getLogger", "()Ltr2/n;", "Ljx0/f;", "getDataSyncWorkDatabaseManager", "()Ljx0/f;", "Ljava/time/Clock;", "getClock", "()Ljava/time/Clock;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25992b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22003f dataSyncWorkDatabaseManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: mx0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncScheduler", m100430f = "DataSyncScheduler.kt", m100431l = {112}, m100432m = "addJobToDatabase", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f102756F;

        /* JADX INFO: renamed from: w */
        Object f102757w;

        /* JADX INFO: renamed from: x */
        Object f102758x;

        /* JADX INFO: renamed from: y */
        Object f102759y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f102760z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f102760z = obj;
            this.f102756F |= Integer.MIN_VALUE;
            return C25992b.this.m77138b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncScheduler", m100430f = "DataSyncScheduler.kt", m100431l = {89}, m100432m = "isWorkScheduled$data_sync_service_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f102761w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f102762x;

        /* JADX INFO: renamed from: z */
        int f102764z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f102762x = obj;
            this.f102764z |= Integer.MIN_VALUE;
            return C25992b.this.m77140d(null, this);
        }
    }

    public C25992b(AbstractC18377p0 workManager, InterfaceC34116n logger, C22003f dataSyncWorkDatabaseManager, Clock clock) {
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dataSyncWorkDatabaseManager, "dataSyncWorkDatabaseManager");
        AbstractC22676k.m65750j(clock, "clock");
        this.workManager = workManager;
        this.logger = logger;
        this.dataSyncWorkDatabaseManager = dataSyncWorkDatabaseManager;
        this.clock = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public final Object m77138b(UUID uuid, C12359b c12359b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        C12359b c12359b2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f102756F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f102756F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f102760z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f102756F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                String string = uuid.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                C21998a c21998a = new C21998a(string, c12359b.getDataSyncEventMetaData().getTriggerSource().name(), c12359b.getDataSyncEventMetaData().getTriggerTimestamp(), 0L, 0, 0);
                C22003f c22003f = this.dataSyncWorkDatabaseManager;
                aVar.f102757w = null;
                c12359b2 = c12359b;
                try {
                    aVar.f102758x = c12359b2;
                    aVar.f102759y = null;
                    aVar.f102756F = 1;
                    if (c22003f.m62882d(c21998a, aVar) == enumC31071a) {
                        return enumC31071a;
                    }
                } catch (Exception e5) {
                    e = e5;
                    this.logger.mo85230v(AbstractC11266d.m30461o("Couldn't insert new data sync request to db. Source: ", c12359b2.getDataSyncEventMetaData().getTriggerSource().name()), e, new AbstractC30556a.a[0]);
                }
            } catch (Exception e13) {
                e = e13;
                c12359b2 = c12359b;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C12359b c12359b3 = (C12359b) aVar.f102758x;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e14) {
                e = e14;
                c12359b2 = c12359b3;
                this.logger.mo85230v(AbstractC11266d.m30461o("Couldn't insert new data sync request to db. Source: ", c12359b2.getDataSyncEventMetaData().getTriggerSource().name()), e, new AbstractC30556a.a[0]);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC18377p0 getWorkManager() {
        return this.workManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m77140d(DeviceTriggerSource deviceTriggerSource, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        boolean z4;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f102764z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f102764z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM62880b = bVar.f102762x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f102764z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM62880b);
                C22003f c22003f = this.dataSyncWorkDatabaseManager;
                String strName = deviceTriggerSource.name();
                long jMillis = this.clock.millis();
                Duration.Companion companion = Duration.INSTANCE;
                long jM134273getInWholeMillisecondsimpl = jMillis - Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(15, DurationUnit.MINUTES));
                bVar.f102761w = null;
                bVar.f102764z = 1;
                objM62880b = c22003f.m62880b(strName, jM134273getInWholeMillisecondsimpl, bVar);
                if (objM62880b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM62880b);
            }
            z4 = !((Collection) objM62880b).isEmpty();
        } catch (Exception e5) {
            this.logger.mo85230v("Could not read from data sync database", e5, new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: e */
    public final Object m77141e(C12359b c12359b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C18354e c18354e = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
        if (c12359b.getDataSyncEventMetaData().getTriggerSource() == DeviceTriggerSource.APP) {
            C18365j0 c18365j0 = (C18365j0) ((C18365j0) new C18365j0(DataSyncWorker.class).m52881g(5L, TimeUnit.MINUTES)).m52877a("DATA_SYNC_INTERVAL_TAG");
            c18365j0.f71544c.f123657x = "DATA_SYNC_INTERVAL_TAG";
            C18367k0 c18367k0 = (C18367k0) ((C18365j0) c18365j0.m52880f(c18354e)).m52878b();
            this.workManager.mo52875d("DATA_SYNC_INTERVAL_TAG", EnumC18366k.f71500x, c18367k0);
            Object objM77138b = m77138b(c18367k0.f71547a, c12359b, interfaceC30057d);
            if (objM77138b == EnumC31071a.f128113w) {
                return objM77138b;
            }
        } else if (DeviceTriggerSource.INSTANCE.isProcessNow(c12359b.getDataSyncEventMetaData().getTriggerSource())) {
            C18392z c18392z = (C18392z) new C18392z(DataSyncWorker.class).m52877a("DATA_SYNC_PROCESS_NOW_TAG");
            c18392z.f71544c.f123657x = "DATA_SYNC_PROCESS_NOW_TAG";
            EnumC18363i0 enumC18363i0 = EnumC18363i0.f71494w;
            C30207q c30207q = c18392z.f71544c;
            c30207q.f123650q = true;
            c30207q.f123651r = enumC18363i0;
            C18347a0 c18347a0 = (C18347a0) ((C18392z) c18392z.m52880f(c18354e)).m52878b();
            AbstractC18377p0 abstractC18377p0 = this.workManager;
            EnumC18368l enumC18368l = EnumC18368l.f71503w;
            abstractC18377p0.m52872a("DATA_SYNC_PROCESS_NOW_TAG", c18347a0).m60634U();
            Object objM77138b2 = m77138b(c18347a0.f71547a, c12359b, interfaceC30057d);
            if (objM77138b2 == EnumC31071a.f128113w) {
                return objM77138b2;
            }
        } else {
            C18392z c18392z2 = (C18392z) new C18392z(DataSyncWorker.class).m52877a("DATA_SYNC_UPLOAD_TAG");
            c18392z2.f71544c.f123657x = "DATA_SYNC_UPLOAD_TAG";
            EnumC18363i0 enumC18363i1 = EnumC18363i0.f71494w;
            C30207q c30207q2 = c18392z2.f71544c;
            c30207q2.f123650q = true;
            c30207q2.f123651r = enumC18363i1;
            C18347a0 c18347a1 = (C18347a0) ((C18392z) c18392z2.m52880f(c18354e)).m52878b();
            AbstractC18377p0 abstractC18377p1 = this.workManager;
            EnumC18368l enumC18368l2 = EnumC18368l.f71503w;
            abstractC18377p1.m52872a("DATA_SYNC_UPLOAD_TAG", c18347a1).m60634U();
            Object objM77138b3 = m77138b(c18347a1.f71547a, c12359b, interfaceC30057d);
            if (objM77138b3 == EnumC31071a.f128113w) {
                return objM77138b3;
            }
        }
        return C23454a0.f92919a;
    }
}
