package yu0;

import android.database.sqlite.SQLiteException;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import hg3.AbstractC17269i;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.List;
import jy1.C22047a;
import l83.C23454a0;
import m83.AbstractC25265s;
import mu0.InterfaceC25949a;
import nu0.C27136a;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: yu0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lyu0/b;", "", "Liy1/c;", "metricWriter", "Lmu0/a;", "metricsDataDao", "Ljava/time/Clock;", "clock", "La6/g;", "Lf6/f;", "dataStore", "Ltr2/n;", "logger", "<init>", "(Liy1/c;Lmu0/a;Ljava/time/Clock;La6/g;Ltr2/n;)V", "Ll83/a0;", "b", "(Lq83/d;)Ljava/lang/Object;", "", "a", "", "foregroundCrash", "c", "(Ljava/lang/Boolean;Lq83/d;)Ljava/lang/Object;", "Liy1/c;", "Lmu0/a;", "Ljava/time/Clock;", "d", "La6/g;", "e", "Ltr2/n;", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39785b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25949a metricsDataDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: yu0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.DataBacklogReporter", m100430f = "DataBacklogReporter.kt", m100431l = {40}, m100432m = "getBacklogMinutes", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171398w;

        /* JADX INFO: renamed from: y */
        int f171400y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171398w = obj;
            this.f171400y |= Integer.MIN_VALUE;
            return C39785b.this.m127494a(this);
        }
    }

    /* JADX INFO: renamed from: yu0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.DataBacklogReporter", m100430f = "DataBacklogReporter.kt", m100431l = {25, 30, 36}, m100432m = "report", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f171402F;

        /* JADX INFO: renamed from: w */
        double f171403w;

        /* JADX INFO: renamed from: x */
        Object f171404x;

        /* JADX INFO: renamed from: y */
        Object f171405y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f171406z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171406z = obj;
            this.f171402F |= Integer.MIN_VALUE;
            return C39785b.this.m127495b(this);
        }
    }

    /* JADX INFO: renamed from: yu0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.DataBacklogReporter$setForegroundCrashStatus$2", m100430f = "DataBacklogReporter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171407w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171408x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Boolean f171409y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171409y = bool;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f171409y, interfaceC30057d);
            cVar.f171408x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f171408x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171407w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(AbstractC39786c.f171412a, this.f171409y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yu0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.DataBacklogReporter$setForegroundCrashStatus$3", m100430f = "DataBacklogReporter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171410w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171411x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f171411x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f171411x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171410w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(AbstractC39786c.f171412a);
            return C23454a0.f92919a;
        }
    }

    public C39785b(InterfaceC21030c metricWriter, InterfaceC25949a metricsDataDao, Clock clock, InterfaceC0422g dataStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(metricsDataDao, "metricsDataDao");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.metricWriter = metricWriter;
        this.metricsDataDao = metricsDataDao;
        this.clock = clock;
        this.dataStore = dataStore;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m127494a(InterfaceC30057d<? super Double> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f171400y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f171400y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo76794e = aVar.f171398w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f171400y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo76794e);
            InterfaceC25949a interfaceC25949a = this.metricsDataDao;
            aVar.f171400y = 1;
            objMo76794e = interfaceC25949a.mo76794e(1, aVar);
            if (objMo76794e == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo76794e);
        }
        C27136a c27136a = (C27136a) AbstractC25265s.m74100H0((List) objMo76794e);
        long jMillis = this.clock.millis();
        return new Double(Math.max(0L, jMillis - (c27136a != null ? c27136a.getTimestamp() : jMillis)) / 60000.0d);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m127495b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        double d3;
        C22047a c22047a;
        InterfaceC21030c interfaceC21030c;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f171402F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f171402F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM127494a = bVar.f171406z;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f171402F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM127494a);
                bVar.f171402F = 1;
                objM127494a = m127494a(bVar);
                if (objM127494a == obj) {
                }
                return obj;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM127494a);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objM127494a);
                    return c23454a0;
                }
                d3 = bVar.f171403w;
                AbstractC34132o.m107864I(objM127494a);
            }
            Boolean bool = (Boolean) ((AbstractC14134f) objM127494a).mo40227b(AbstractC39786c.f171412a);
            c22047a = new C22047a(0, "crash.data.backlog", new Double(d3), AbstractC37056f.m118958J("foreground_crash:" + bool), null, 17, null);
            interfaceC21030c = this.metricWriter;
            bVar.f171404x = null;
            bVar.f171405y = null;
            bVar.f171403w = d3;
            bVar.f171402F = 3;
            if (interfaceC21030c.mo58700a(c22047a, bVar) != obj) {
                return obj;
            }
            return c23454a0;
            double dDoubleValue = ((Number) objM127494a).doubleValue();
            InterfaceC13058l data = this.dataStore.getData();
            bVar.f171403w = dDoubleValue;
            bVar.f171402F = 2;
            objM127494a = AbstractC13091v.m36575A(data, bVar);
            if (objM127494a != obj) {
                d3 = dDoubleValue;
                Boolean bool2 = (Boolean) ((AbstractC14134f) objM127494a).mo40227b(AbstractC39786c.f171412a);
                c22047a = new C22047a(0, "crash.data.backlog", new Double(d3), AbstractC37056f.m118958J("foreground_crash:" + bool2), null, 17, null);
                interfaceC21030c = this.metricWriter;
                bVar.f171404x = null;
                bVar.f171405y = null;
                bVar.f171403w = d3;
                bVar.f171402F = 3;
                if (interfaceC21030c.mo58700a(c22047a, bVar) != obj) {
                    return c23454a0;
                }
            }
            return obj;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Failed to get oldest metric data", e5, new AbstractC30556a.a[0]);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m127496c(Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (bool != null) {
            Object objM48861G = AbstractC17269i.m48861G(this.dataStore, new c(bool, null), interfaceC30057d);
            return objM48861G == EnumC31071a.f128113w ? objM48861G : c23454a0;
        }
        Object objM48861G2 = AbstractC17269i.m48861G(this.dataStore, new d(null), interfaceC30057d);
        return objM48861G2 == EnumC31071a.f128113w ? objM48861G2 : c23454a0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C39785b(InterfaceC21030c interfaceC21030c, InterfaceC25949a interfaceC25949a, Clock clock, InterfaceC0422g interfaceC0422g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(interfaceC21030c, interfaceC25949a, clock, interfaceC0422g, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DataBacklogReporter") : interfaceC34116n);
    }
}
