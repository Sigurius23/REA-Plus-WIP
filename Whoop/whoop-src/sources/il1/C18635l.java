package il1;

import com.mapbox.common.HttpHeaders;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.HomeTimedRefreshStateResetMillis;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import em1.EnumC13344r;
import fm1.EnumC14603g;
import j02.InterfaceC21164r;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.time.LocalDate;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: il1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0015\u0013\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001d"}, m65681d2 = {"Lil1/l;", "", "Ljava/time/Clock;", "clock", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljs0/c;", "configurationRepository", "Lj02/r;", "deviceHomeDestinationSource", "<init>", "(Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Lj02/r;)V", "Lec3/l;", "Lil1/u;", "upstream", "e", "(Lec3/l;)Lec3/l;", "a", "Ljava/time/Clock;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Ljs0/c;", "d", "Lj02/r;", "Lil1/l$c;", "Lil1/l$c;", "initial", "f", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18635l {

    /* JADX INFO: renamed from: g */
    public static final int f72892g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21164r deviceHomeDestinationSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final c initial;

    /* JADX INFO: renamed from: il1.l$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lil1/l$b;", "", "Ljava/time/LocalDate;", HttpHeaders.DATE, "Lem1/r;", "refreshType", "<init>", "(Ljava/time/LocalDate;Lem1/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Lem1/r;", "()Lem1/r;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC13344r refreshType;

        public b(LocalDate date, EnumC13344r refreshType) {
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(refreshType, "refreshType");
            this.date = date;
            this.refreshType = refreshType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC13344r getRefreshType() {
            return this.refreshType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.date, bVar.date) && this.refreshType == bVar.refreshType;
        }

        public int hashCode() {
            return this.refreshType.hashCode() + (this.date.hashCode() * 31);
        }

        public String toString() {
            return "DateAndRefreshType(date=" + this.date + ", refreshType=" + this.refreshType + ")";
        }
    }

    /* JADX INFO: renamed from: il1.l$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f72904w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18635l f72905x;

        /* JADX INFO: renamed from: il1.l$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f72906w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18635l f72907x;

            /* JADX INFO: renamed from: il1.l$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeActionReducer$reduce$$inlined$filter$1$2", m100430f = "HomeActionReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41750a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f72909F;

                /* JADX INFO: renamed from: G */
                Object f72910G;

                /* JADX INFO: renamed from: H */
                int f72911H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f72912w;

                /* JADX INFO: renamed from: x */
                int f72913x;

                /* JADX INFO: renamed from: y */
                Object f72914y;

                /* JADX INFO: renamed from: z */
                Object f72915z;

                public C41750a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f72912w = obj;
                    this.f72913x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18635l c18635l) {
                this.f72906w = interfaceC13062m;
                this.f72907x = c18635l;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41750a c41750a;
                if (interfaceC30057d instanceof C41750a) {
                    c41750a = (C41750a) interfaceC30057d;
                    int i13 = c41750a.f72913x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41750a.f72913x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41750a = new C41750a(interfaceC30057d);
                    }
                } else {
                    c41750a = new C41750a(interfaceC30057d);
                }
                Object obj2 = c41750a.f72912w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41750a.f72913x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f72906w;
                    if (((AbstractC18644u) obj) instanceof AbstractC18644u.c ? ((Boolean) this.f72907x.deviceHomeDestinationSource.isAvailable().getValue()).booleanValue() : true) {
                        c41750a.f72914y = null;
                        c41750a.f72915z = null;
                        c41750a.f72909F = null;
                        c41750a.f72910G = null;
                        c41750a.f72911H = 0;
                        c41750a.f72913x = 1;
                        if (interfaceC13062m.emit(obj, c41750a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l, C18635l c18635l) {
            this.f72904w = interfaceC13058l;
            this.f72905x = c18635l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f72904w.collect(new a(interfaceC13062m, this.f72905x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: il1.l$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f72916w;

        /* JADX INFO: renamed from: il1.l$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f72917w;

            /* JADX INFO: renamed from: il1.l$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeActionReducer$reduce$$inlined$map$1$2", m100430f = "HomeActionReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41751a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f72918E;

                /* JADX INFO: renamed from: F */
                Object f72919F;

                /* JADX INFO: renamed from: G */
                Object f72920G;

                /* JADX INFO: renamed from: H */
                int f72921H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f72922w;

                /* JADX INFO: renamed from: x */
                int f72923x;

                /* JADX INFO: renamed from: y */
                Object f72924y;

                public C41751a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f72922w = obj;
                    this.f72923x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f72917w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41751a c41751a;
                if (interfaceC30057d instanceof C41751a) {
                    c41751a = (C41751a) interfaceC30057d;
                    int i13 = c41751a.f72923x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41751a.f72923x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41751a = new C41751a(interfaceC30057d);
                    }
                } else {
                    c41751a = new C41751a(interfaceC30057d);
                }
                Object obj2 = c41751a.f72922w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41751a.f72923x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f72917w;
                    AbstractC18644u homePillarAction = ((c) obj).getHomePillarAction();
                    c41751a.f72924y = null;
                    c41751a.f72918E = null;
                    c41751a.f72919F = null;
                    c41751a.f72920G = null;
                    c41751a.f72921H = 0;
                    c41751a.f72923x = 1;
                    if (interfaceC13062m.emit(homePillarAction, c41751a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public e(InterfaceC13058l interfaceC13058l) {
            this.f72916w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f72916w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: il1.l$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeActionReducer$reduce$1", m100430f = "HomeActionReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lil1/l$c;", "accumulator", "Lil1/u;", "action", "<anonymous>", "(Lil1/l$c;Lil1/u;)Lil1/l$c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f72926w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f72927x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f72928y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, AbstractC18644u abstractC18644u, InterfaceC30057d<? super c> interfaceC30057d) {
            f fVar = C18635l.this.new f(interfaceC30057d);
            fVar.f72927x = cVar;
            fVar.f72928y = abstractC18644u;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            c cVar = (c) this.f72927x;
            AbstractC18644u abstractC18644u = (AbstractC18644u) this.f72928y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f72926w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC18644u instanceof AbstractC18644u.b) {
                AbstractC18644u.b bVar2 = (AbstractC18644u.b) abstractC18644u;
                EnumC14603g pillarType = bVar2.getPillarType();
                if (pillarType == null) {
                    pillarType = cVar.getLastKnownPillarType();
                }
                EnumC14603g enumC14603g = pillarType;
                return c.m53930b(cVar, null, 0L, enumC14603g, bVar2.m54051a(enumC14603g), 3, null);
            }
            if (abstractC18644u instanceof AbstractC18644u.a) {
                return c.m53930b(cVar, null, 0L, null, abstractC18644u, 7, null);
            }
            if (!(abstractC18644u instanceof AbstractC18644u.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC18644u.c cVar2 = (AbstractC18644u.c) abstractC18644u;
            if (cVar2.getRefreshType() == EnumC13344r.AUTO_REFRESH && C18635l.this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_REDESIGN_REFRESH_FIX)) {
                if (C18635l.this.clock.millis() - cVar.getLastKnownDateTimeStamp() >= 600000) {
                    LocalDate localDateNow = LocalDate.now(C18635l.this.clock);
                    AbstractC22676k.m65749i(localDateNow, "now(...)");
                    return new c(localDateNow, C18635l.this.clock.millis(), null, null, 12, null);
                }
                EnumC14603g pillarType2 = cVar2.getPillarType();
                if (pillarType2 == null) {
                    pillarType2 = cVar.getLastKnownPillarType();
                }
                return c.m53930b(cVar, null, 0L, null, AbstractC18644u.c.m54053b(cVar2, null, pillarType2, false, null, 9, null), 7, null);
            }
            AbstractC21909c abstractC21909c = C18635l.this.configurationRepository;
            HomeTimedRefreshStateResetMillis homeTimedRefreshStateResetMillis = HomeTimedRefreshStateResetMillis.INSTANCE;
            C21908b configurations = abstractC21909c.getConfigurations();
            String name = homeTimedRefreshStateResetMillis.getName();
            Object defaultValue = homeTimedRefreshStateResetMillis.getDefaultValue();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
            Object objM125868N0 = null;
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                String str = (String) configurations.get(name);
                if (str != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                String str2 = (String) configurations.get(name);
                if (str2 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str2);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                String str3 = (String) configurations.get(name);
                if (str3 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str3);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                String str4 = (String) configurations.get(name);
                if (str4 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str4);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                String str5 = (String) configurations.get(name);
                if (str5 != null) {
                    objM125868N0 = AbstractC39414r.m125868N0(str5);
                }
            } else {
                objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
            }
            if (objM125868N0 != null) {
                defaultValue = objM125868N0;
            }
            if (defaultValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            long jLongValue = ((Long) defaultValue).longValue();
            long jMillis = C18635l.this.clock.millis();
            if (jMillis - cVar.getLastKnownDateTimeStamp() >= jLongValue) {
                LocalDate localDateNow2 = LocalDate.now(C18635l.this.clock);
                AbstractC22676k.m65749i(localDateNow2, "now(...)");
                bVar = new b(localDateNow2, EnumC13344r.OVERRIDE);
            } else {
                LocalDate requestDate = cVar2.getRequestDate();
                if (requestDate == null) {
                    requestDate = cVar.getLastRequestedDate();
                }
                bVar = new b(requestDate, cVar2.getRefreshType());
            }
            LocalDate date = bVar.getDate();
            LocalDate date2 = bVar.getDate();
            EnumC14603g pillarType3 = cVar2.getPillarType();
            if (pillarType3 == null) {
                pillarType3 = cVar.getLastKnownPillarType();
            }
            return c.m53930b(cVar, date, jMillis, null, cVar2.m54054a(date2, pillarType3, true, bVar.getRefreshType()), 4, null);
        }
    }

    public C18635l(Clock clock, FeatureFlagChecker featureFlagChecker, AbstractC21909c configurationRepository, InterfaceC21164r deviceHomeDestinationSource) {
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(deviceHomeDestinationSource, "deviceHomeDestinationSource");
        this.clock = clock;
        this.featureFlagChecker = featureFlagChecker;
        this.configurationRepository = configurationRepository;
        this.deviceHomeDestinationSource = deviceHomeDestinationSource;
        LocalDate localDateNow = LocalDate.now(clock);
        AbstractC22676k.m65749i(localDateNow, "now(...)");
        this.initial = new c(localDateNow, clock.millis(), null, null, 12, null);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m53927e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new d(new e(new C13060l1(this.initial, upstream, new f(null))), this);
    }

    /* JADX INFO: renamed from: il1.l$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, m65681d2 = {"Lil1/l$c;", "", "Ljava/time/LocalDate;", "lastRequestedDate", "", "lastKnownDateTimeStamp", "Lfm1/g;", "lastKnownPillarType", "Lil1/u;", "homePillarAction", "<init>", "(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)V", "a", "(Ljava/time/LocalDate;JLfm1/g;Lil1/u;)Lil1/l$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "f", "()Ljava/time/LocalDate;", "b", "J", "d", "()J", "c", "Lfm1/g;", "e", "()Lfm1/g;", "Lil1/u;", "()Lil1/u;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate lastRequestedDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long lastKnownDateTimeStamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC14603g lastKnownPillarType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AbstractC18644u homePillarAction;

        public c(LocalDate lastRequestedDate, long j7, EnumC14603g lastKnownPillarType, AbstractC18644u homePillarAction) {
            AbstractC22676k.m65750j(lastRequestedDate, "lastRequestedDate");
            AbstractC22676k.m65750j(lastKnownPillarType, "lastKnownPillarType");
            AbstractC22676k.m65750j(homePillarAction, "homePillarAction");
            this.lastRequestedDate = lastRequestedDate;
            this.lastKnownDateTimeStamp = j7;
            this.lastKnownPillarType = lastKnownPillarType;
            this.homePillarAction = homePillarAction;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m53930b(c cVar, LocalDate localDate, long j7, EnumC14603g enumC14603g, AbstractC18644u abstractC18644u, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                localDate = cVar.lastRequestedDate;
            }
            if ((i13 & 2) != 0) {
                j7 = cVar.lastKnownDateTimeStamp;
            }
            if ((i13 & 4) != 0) {
                enumC14603g = cVar.lastKnownPillarType;
            }
            if ((i13 & 8) != 0) {
                abstractC18644u = cVar.homePillarAction;
            }
            return cVar.m53931a(localDate, j7, enumC14603g, abstractC18644u);
        }

        /* JADX INFO: renamed from: a */
        public final c m53931a(LocalDate lastRequestedDate, long lastKnownDateTimeStamp, EnumC14603g lastKnownPillarType, AbstractC18644u homePillarAction) {
            AbstractC22676k.m65750j(lastRequestedDate, "lastRequestedDate");
            AbstractC22676k.m65750j(lastKnownPillarType, "lastKnownPillarType");
            AbstractC22676k.m65750j(homePillarAction, "homePillarAction");
            return new c(lastRequestedDate, lastKnownDateTimeStamp, lastKnownPillarType, homePillarAction);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC18644u getHomePillarAction() {
            return this.homePillarAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getLastKnownDateTimeStamp() {
            return this.lastKnownDateTimeStamp;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC14603g getLastKnownPillarType() {
            return this.lastKnownPillarType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.lastRequestedDate, cVar.lastRequestedDate) && this.lastKnownDateTimeStamp == cVar.lastKnownDateTimeStamp && this.lastKnownPillarType == cVar.lastKnownPillarType && AbstractC22676k.m65745e(this.homePillarAction, cVar.homePillarAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final LocalDate getLastRequestedDate() {
            return this.lastRequestedDate;
        }

        public int hashCode() {
            return this.homePillarAction.hashCode() + ((this.lastKnownPillarType.hashCode() + AbstractC11266d.m30451e(this.lastRequestedDate.hashCode() * 31, this.lastKnownDateTimeStamp, 31)) * 31);
        }

        public String toString() {
            return "HomeAccumulatedAction(lastRequestedDate=" + this.lastRequestedDate + ", lastKnownDateTimeStamp=" + this.lastKnownDateTimeStamp + ", lastKnownPillarType=" + this.lastKnownPillarType + ", homePillarAction=" + this.homePillarAction + ")";
        }

        public /* synthetic */ c(LocalDate localDate, long j7, EnumC14603g enumC14603g, AbstractC18644u abstractC18644u, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(localDate, j7, (i13 & 4) != 0 ? EnumC14603g.OVERVIEW : enumC14603g, (i13 & 8) != 0 ? new AbstractC18644u.c(null, null, false, null, 15, null) : abstractC18644u);
        }
    }
}
