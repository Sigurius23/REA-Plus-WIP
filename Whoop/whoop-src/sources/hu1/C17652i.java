package hu1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.time.Clock;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25271y;
import mh2.C25561a;
import oh2.C27941d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: hu1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 +2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b \u0010!J\u001e\u0010#\u001a\u00020\u00142\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lhu1/i;", "", "Ltr2/n;", "logger", "Lhu1/d;", "labradorPacketsDao", "Lmh2/a;", "strapMetadataDaoInteractor", "Lfi0/a;", "baseAnalytics", "Ljava/time/Clock;", "clock", "<init>", "(Ltr2/n;Lhu1/d;Lmh2/a;Lfi0/a;Ljava/time/Clock;)V", "", "action", "", "timeDiff", "", "numberOfPackets", "Ll83/a0;", "d", "(Ljava/lang/String;JI)V", "Lhu1/c;", "labradorPacketsBatch", "", "c", "(Lhu1/c;Lq83/d;)Ljava/lang/Object;", "", "packetRevision", "", "Lhu1/b;", "b", "(ISLq83/d;)Ljava/lang/Object;", "labradorPacketDtoList", "a", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Lhu1/d;", "Lmh2/a;", "Lfi0/a;", "e", "Ljava/time/Clock;", "f", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17652i {

    /* JADX INFO: renamed from: f */
    private static final a f68434f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC17647d labradorPacketsDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C25561a strapMetadataDaoInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: hu1.i$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"Lhu1/i$a;", "", "<init>", "()V", "", "SAVE", "Ljava/lang/String;", "GET", "DELETE", "ECG", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: hu1.i$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.data.LabradorPacketsDbManager", m100430f = "LabradorPacketsDbManager.kt", m100431l = {63}, m100432m = "deletePackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f68440E;

        /* JADX INFO: renamed from: w */
        Object f68441w;

        /* JADX INFO: renamed from: x */
        long f68442x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f68443y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68443y = obj;
            this.f68440E |= Integer.MIN_VALUE;
            return C17652i.this.m50292a(null, this);
        }
    }

    /* JADX INFO: renamed from: hu1.i$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.data.LabradorPacketsDbManager", m100430f = "LabradorPacketsDbManager.kt", m100431l = {49}, m100432m = "getEcgPackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f68445E;

        /* JADX INFO: renamed from: G */
        int f68447G;

        /* JADX INFO: renamed from: w */
        int f68448w;

        /* JADX INFO: renamed from: x */
        short f68449x;

        /* JADX INFO: renamed from: y */
        long f68450y;

        /* JADX INFO: renamed from: z */
        long f68451z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68445E = obj;
            this.f68447G |= Integer.MIN_VALUE;
            return C17652i.this.m50293b(0, (short) 0, this);
        }
    }

    /* JADX INFO: renamed from: hu1.i$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.data.LabradorPacketsDbManager", m100430f = "LabradorPacketsDbManager.kt", m100431l = {34}, m100432m = ProfileAnalyticsKt.SAVE, m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f68452E;

        /* JADX INFO: renamed from: G */
        int f68454G;

        /* JADX INFO: renamed from: w */
        Object f68455w;

        /* JADX INFO: renamed from: x */
        Object f68456x;

        /* JADX INFO: renamed from: y */
        long f68457y;

        /* JADX INFO: renamed from: z */
        int f68458z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68452E = obj;
            this.f68454G |= Integer.MIN_VALUE;
            return C17652i.this.m50294c(null, this);
        }
    }

    public C17652i(InterfaceC34116n logger, InterfaceC17647d labradorPacketsDao, C25561a strapMetadataDaoInteractor, InterfaceC14515a baseAnalytics, Clock clock) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(labradorPacketsDao, "labradorPacketsDao");
        AbstractC22676k.m65750j(strapMetadataDaoInteractor, "strapMetadataDaoInteractor");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(clock, "clock");
        this.logger = logger;
        this.labradorPacketsDao = labradorPacketsDao;
        this.strapMetadataDaoInteractor = strapMetadataDaoInteractor;
        this.baseAnalytics = baseAnalytics;
        this.clock = clock;
    }

    /* JADX INFO: renamed from: d */
    private final void m50291d(String action, long timeDiff, int numberOfPackets) {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Connectivity", null, null, "DB Query Performance", null, AbstractC25247g0.m73993b0(new C23465k("Feature", "ECG"), new C23465k("Number Of Records", String.valueOf(numberOfPackets)), new C23465k(action, String.valueOf(timeDiff))), 22, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m50292a(List<C17645b> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        b bVar;
        long j7;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f68440E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f68440E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f68443y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f68440E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            long jMillis = this.clock.millis();
            try {
                InterfaceC17647d interfaceC17647d = this.labradorPacketsDao;
                bVar.f68441w = list;
                bVar.f68442x = jMillis;
                bVar.f68440E = 1;
                if (interfaceC17647d.mo50278a(list, bVar) == enumC31071a) {
                    return enumC31071a;
                }
                j7 = jMillis;
            } catch (Exception unused) {
                j7 = jMillis;
                this.logger.mo85222m("Error deleting ECG packets from database", new AbstractC30556a.a[0]);
            } catch (Throwable th3) {
                th = th3;
                j7 = jMillis;
                m50291d("Delete", this.clock.millis() - j7, list.size());
                throw th;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = bVar.f68442x;
            list = (List) bVar.f68441w;
            try {
                try {
                    AbstractC34132o.m107864I(obj);
                } catch (Exception unused2) {
                    this.logger.mo85222m("Error deleting ECG packets from database", new AbstractC30556a.a[0]);
                }
            } catch (Throwable th4) {
                th = th4;
                m50291d("Delete", this.clock.millis() - j7, list.size());
                throw th;
            }
        }
        m50291d("Delete", this.clock.millis() - j7, list.size());
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m50293b(int i13, short s13, InterfaceC30057d<? super List<C17645b>> interfaceC30057d) {
        c cVar;
        long j7;
        List list;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i14 = cVar.f68447G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f68447G = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo50279b = cVar.f68445E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = cVar.f68447G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objMo50279b);
                long jMillis = this.clock.millis();
                try {
                    InterfaceC17647d interfaceC17647d = this.labradorPacketsDao;
                    cVar.f68448w = i13;
                    cVar.f68449x = s13;
                    cVar.f68450y = jMillis;
                    cVar.f68451z = 0L;
                    cVar.f68447G = 1;
                    objMo50279b = interfaceC17647d.mo50279b(i13, s13, cVar);
                    if (objMo50279b == enumC31071a) {
                        return enumC31071a;
                    }
                    j7 = jMillis;
                } catch (Exception e5) {
                    e = e5;
                    j7 = jMillis;
                    this.logger.mo85230v("Could not read from ecg database", e, new AbstractC30556a.a[0]);
                    list = C25271y.f99162w;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = cVar.f68450y;
                try {
                    AbstractC34132o.m107864I(objMo50279b);
                } catch (Exception e13) {
                    e = e13;
                    this.logger.mo85230v("Could not read from ecg database", e, new AbstractC30556a.a[0]);
                    list = C25271y.f99162w;
                }
            }
            list = (List) objMo50279b;
            m50291d("Get", this.clock.millis() - j7, list.size());
            return list;
        } catch (Throwable th3) {
            this.clock.millis();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m50294c(C17646c c17646c, InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        d dVar;
        long j7;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f68454G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f68454G = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f68452E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f68454G;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (c17646c.m50277c().isEmpty()) {
                return Boolean.TRUE;
            }
            long jMillis = this.clock.millis();
            try {
                C27941d c27941dM84340i = C27941d.m84340i(c17646c.getAcquisitionInfo());
                C25561a c25561a = this.strapMetadataDaoInteractor;
                AbstractC22676k.m65747g(c27941dM84340i);
                int iM75172j = c25561a.m75172j(c27941dM84340i);
                InterfaceC17647d interfaceC17647d = this.labradorPacketsDao;
                List<C17645b> listM50295a = AbstractC17653j.m50295a(c17646c.m50277c(), iM75172j);
                dVar.f68455w = c17646c;
                dVar.f68456x = null;
                dVar.f68457y = jMillis;
                dVar.f68458z = iM75172j;
                dVar.f68454G = 1;
                if (interfaceC17647d.insertList(listM50295a, dVar) == enumC31071a) {
                    return enumC31071a;
                }
                j7 = jMillis;
            } catch (Exception unused) {
                j7 = jMillis;
                z4 = false;
                this.logger.mo85222m("Failed to save " + c17646c.m50277c().size() + " number of Raw ECG packets in the database", new AbstractC30556a.a[0]);
            } catch (Throwable th3) {
                th = th3;
                j7 = jMillis;
                m50291d("Save", this.clock.millis() - j7, c17646c.m50277c().size());
                throw th;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = dVar.f68457y;
            c17646c = (C17646c) dVar.f68455w;
            try {
                try {
                    AbstractC34132o.m107864I(obj);
                } catch (Exception unused2) {
                    z4 = false;
                    this.logger.mo85222m("Failed to save " + c17646c.m50277c().size() + " number of Raw ECG packets in the database", new AbstractC30556a.a[0]);
                }
            } catch (Throwable th4) {
                th = th4;
                m50291d("Save", this.clock.millis() - j7, c17646c.m50277c().size());
                throw th;
            }
        }
        m50291d("Save", this.clock.millis() - j7, c17646c.m50277c().size());
        return Boolean.valueOf(z4);
    }
}
