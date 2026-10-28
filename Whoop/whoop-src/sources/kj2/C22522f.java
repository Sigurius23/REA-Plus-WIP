package kj2;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayBottomState;
import com.whoop.design.models.calendar.CalendarOverlay;
import com.whoop.design.models.calendar.CalendarPhase;
import com.whoop.design.util.TextResource;
import com.whoop.stress.domain.StressMonitorApi;
import com.whoop.stress.domain.model.StressCalendar;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h91.C17027b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: kj2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 02\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\f\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` 2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001ej\u0004\u0018\u0001` 0\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lkj2/f;", "", "Lcom/whoop/stress/domain/StressMonitorApi;", "api", "Ltr2/n;", "logger", "Lzr2/a;", "dateAndTimeProvider", "Ljava/util/Locale;", "locale", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/stress/domain/StressMonitorApi;Ltr2/n;Lzr2/a;Ljava/util/Locale;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lkj2/d;", "ongoingPreparationAccumulator", "Lkj2/e;", "currentAction", "i", "(Lkj2/d;Lkj2/e;)Lkj2/d;", "accumulator", "Lec3/l;", "Lkj2/b;", "m", "(Lkj2/d;)Lec3/l;", "Lkj2/a;", "state", "l", "(Lkj2/a;Lkj2/b;Lq83/d;)Ljava/lang/Object;", "data", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "j", "(Lkj2/a;)Lh91/b;", "upstream", "k", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/stress/domain/StressMonitorApi;", "b", "Ltr2/n;", "c", "Lzr2/a;", "d", "Ljava/util/Locale;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22522f {

    /* JADX INFO: renamed from: f */
    private static final a f88288f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final int f88289g = 8;

    /* JADX INFO: renamed from: h */
    private static final DateTimeFormatter f88290h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StressMonitorApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: kj2.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkj2/f$a;", "", "<init>", "()V", "Lorg/joda/time/format/DateTimeFormatter;", "FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "a", "()Lorg/joda/time/format/DateTimeFormatter;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final DateTimeFormatter m65051a() {
            return C22522f.f88290h;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: kj2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88296w;

        /* JADX INFO: renamed from: kj2.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88297w;

            /* JADX INFO: renamed from: kj2.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor$interact$$inlined$filter$1$2", m100430f = "StressCalendarInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41903a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f88299F;

                /* JADX INFO: renamed from: G */
                Object f88300G;

                /* JADX INFO: renamed from: H */
                int f88301H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88302w;

                /* JADX INFO: renamed from: x */
                int f88303x;

                /* JADX INFO: renamed from: y */
                Object f88304y;

                /* JADX INFO: renamed from: z */
                Object f88305z;

                public C41903a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88302w = obj;
                    this.f88303x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f88297w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41903a c41903a;
                if (interfaceC30057d instanceof C41903a) {
                    c41903a = (C41903a) interfaceC30057d;
                    int i13 = c41903a.f88303x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41903a.f88303x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41903a = new C41903a(interfaceC30057d);
                    }
                } else {
                    c41903a = new C41903a(interfaceC30057d);
                }
                Object obj2 = c41903a.f88302w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41903a.f88303x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88297w;
                    if (((C22520d) obj).getAction() != null) {
                        c41903a.f88304y = null;
                        c41903a.f88305z = null;
                        c41903a.f88299F = null;
                        c41903a.f88300G = null;
                        c41903a.f88301H = 0;
                        c41903a.f88303x = 1;
                        if (interfaceC13062m.emit(obj, c41903a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f88296w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88296w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kj2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor$interact$$inlined$flatMapLatest$1", m100430f = "StressCalendarInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88306w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88307x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88308y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22522f f88309z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C22522f c22522f) {
            super(3, interfaceC30057d);
            this.f88309z = c22522f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C22520d c22520d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f88309z);
            cVar.f88307x = interfaceC13062m;
            cVar.f88308y = c22520d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88306w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f88307x;
                InterfaceC13058l interfaceC13058lM65049m = this.f88309z.m65049m((C22520d) this.f88308y);
                this.f88307x = null;
                this.f88308y = null;
                this.f88306w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM65049m, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C22520d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kj2.f$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88310w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22522f f88311x;

        /* JADX INFO: renamed from: kj2.f$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88312w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22522f f88313x;

            /* JADX INFO: renamed from: kj2.f$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor$interact$$inlined$map$1$2", m100430f = "StressCalendarInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41904a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88314E;

                /* JADX INFO: renamed from: F */
                Object f88315F;

                /* JADX INFO: renamed from: G */
                Object f88316G;

                /* JADX INFO: renamed from: H */
                int f88317H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88318w;

                /* JADX INFO: renamed from: x */
                int f88319x;

                /* JADX INFO: renamed from: y */
                Object f88320y;

                public C41904a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88318w = obj;
                    this.f88319x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22522f c22522f) {
                this.f88312w = interfaceC13062m;
                this.f88313x = c22522f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41904a c41904a;
                if (interfaceC30057d instanceof C41904a) {
                    c41904a = (C41904a) interfaceC30057d;
                    int i13 = c41904a.f88319x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41904a.f88319x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41904a = new C41904a(interfaceC30057d);
                    }
                } else {
                    c41904a = new C41904a(interfaceC30057d);
                }
                Object obj2 = c41904a.f88318w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41904a.f88319x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88312w;
                    C17027b c17027bM65047j = this.f88313x.m65047j((C22517a) obj);
                    c41904a.f88320y = null;
                    c41904a.f88314E = null;
                    c41904a.f88315F = null;
                    c41904a.f88316G = null;
                    c41904a.f88317H = 0;
                    c41904a.f88319x = 1;
                    if (interfaceC13062m.emit(c17027bM65047j, c41904a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C22522f c22522f) {
            this.f88310w = interfaceC13058l;
            this.f88311x = c22522f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88310w.collect(new a(interfaceC13062m, this.f88311x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kj2.f$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor$interact$1", m100430f = "StressCalendarInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkj2/d;", "ongoingAccumulator", "Lkj2/e;", "currentAction", "<anonymous>", "(Lkj2/d;Lkj2/e;)Lkj2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88322w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88323x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88324y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22520d c22520d, AbstractC22521e abstractC22521e, InterfaceC30057d<? super C22520d> interfaceC30057d) {
            e eVar = C22522f.this.new e(interfaceC30057d);
            eVar.f88323x = c22520d;
            eVar.f88324y = abstractC22521e;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22520d c22520d = (C22520d) this.f88323x;
            AbstractC22521e abstractC22521e = (AbstractC22521e) this.f88324y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88322w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C22522f.this.m65046i(c22520d, abstractC22521e);
        }
    }

    /* JADX INFO: renamed from: kj2.f$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor$interact$4", m100430f = "StressCalendarInteractor.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkj2/a;", "accumulator", "Lkj2/b;", "state", "<anonymous>", "(Lkj2/a;Lkj2/b;)Lkj2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88326w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88327x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88328y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22517a c22517a, AbstractC22518b abstractC22518b, InterfaceC30057d<? super C22517a> interfaceC30057d) {
            f fVar = C22522f.this.new f(interfaceC30057d);
            fVar.f88327x = c22517a;
            fVar.f88328y = abstractC22518b;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22517a c22517a = (C22517a) this.f88327x;
            AbstractC22518b abstractC22518b = (AbstractC22518b) this.f88328y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88326w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C22522f c22522f = C22522f.this;
            this.f88327x = null;
            this.f88328y = null;
            this.f88326w = 1;
            Object objM65048l = c22522f.m65048l(c22517a, abstractC22518b, this);
            return objM65048l == enumC31071a ? enumC31071a : objM65048l;
        }
    }

    /* JADX INFO: renamed from: kj2.f$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor", m100430f = "StressCalendarInteractor.kt", m100431l = {124, 145}, m100432m = "interactingStateToDomainData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f88330E;

        /* JADX INFO: renamed from: w */
        Object f88331w;

        /* JADX INFO: renamed from: x */
        Object f88332x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88333y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f88333y = obj;
            this.f88330E |= Integer.MIN_VALUE;
            return C22522f.this.m65048l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kj2.f$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor$interactingStateToDomainData$2", m100430f = "StressCalendarInteractor.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/stress/domain/model/StressCalendar;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f88335w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22518b f88337y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC22518b abstractC22518b, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f88337y = abstractC22518b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22522f.this.new h(this.f88337y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88335w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StressMonitorApi stressMonitorApi = C22522f.this.api;
            String specificDate = ((AbstractC22518b.c) this.f88337y).getSpecificDate();
            this.f88335w = 1;
            Object stressCalendar = stressMonitorApi.getStressCalendar(specificDate, this);
            return stressCalendar == enumC31071a ? enumC31071a : stressCalendar;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StressCalendar> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: kj2.f$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor$interactingStateToDomainData$4", m100430f = "StressCalendarInteractor.kt", m100431l = {146}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/stress/domain/model/StressCalendar;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f88338w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22518b f88340y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC22518b abstractC22518b, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f88340y = abstractC22518b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22522f.this.new i(this.f88340y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88338w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StressMonitorApi stressMonitorApi = C22522f.this.api;
            String specificDate = ((AbstractC22518b.a) this.f88340y).getSpecificDate();
            this.f88338w = 1;
            Object stressCalendar = stressMonitorApi.getStressCalendar(specificDate, this);
            return stressCalendar == enumC31071a ? enumC31071a : stressCalendar;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StressCalendar> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: kj2.f$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressCalendarInteractor$preparationToInteractingState$1", m100430f = "StressCalendarInteractor.kt", m100431l = {87, 92, 96, 111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lkj2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f88341E;

        /* JADX INFO: renamed from: F */
        int f88342F;

        /* JADX INFO: renamed from: G */
        int f88343G;

        /* JADX INFO: renamed from: H */
        private /* synthetic */ Object f88344H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C22520d f88345I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C22522f f88346J;

        /* JADX INFO: renamed from: w */
        Object f88347w;

        /* JADX INFO: renamed from: x */
        Object f88348x;

        /* JADX INFO: renamed from: y */
        Object f88349y;

        /* JADX INFO: renamed from: z */
        Object f88350z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C22520d c22520d, C22522f c22522f, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88345I = c22520d;
            this.f88346J = c22522f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f88345I, this.f88346J, interfaceC30057d);
            jVar.f88344H = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
        
            if (r0.emit(r3, r10) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
        
            if (r0.emit(r2, r10) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x015a, code lost:
        
            if (r0.emit(r4, r10) == r1) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kj2.C22522f.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        f88290h = dateTimeFormatterForPattern;
    }

    public C22522f(StressMonitorApi api, InterfaceC34116n logger, InterfaceC41070a dateAndTimeProvider, Locale locale, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.api = api;
        this.logger = logger;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.locale = locale;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C22520d m65046i(C22520d ongoingPreparationAccumulator, AbstractC22521e currentAction) {
        if (currentAction instanceof AbstractC22521e.a) {
            int i13 = ((AbstractC22521e.a) currentAction).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String();
            if (ongoingPreparationAccumulator.m65035c().contains(Integer.valueOf(i13))) {
                return new C22520d(ongoingPreparationAccumulator.m65035c(), currentAction, false);
            }
            return new C22520d(AbstractC12350b.m34555D(Integer.valueOf(i13), ongoingPreparationAccumulator.m65035c()), currentAction, true);
        }
        if (AbstractC22676k.m65745e(currentAction, AbstractC22521e.b.f88286a)) {
            return new C22520d(AbstractC12350b.m34570S(0), currentAction, true);
        }
        if (currentAction instanceof AbstractC22521e.c) {
            return new C22520d(ongoingPreparationAccumulator.m65035c(), currentAction, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C17027b<CalendarDateModel> m65047j(C22517a data) {
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        java.time.LocalDate localDateOf = java.time.LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        C17027b.Companion companion = C17027b.INSTANCE;
        Locale locale = this.locale;
        AbstractC22676k.m65747g(localDateOf);
        java.time.LocalDate selectedDate = data.getSelectedDate();
        return C17027b.Companion.m48086b(companion, locale, localDateOf, selectedDate == null ? localDateOf : selectedDate, localDateOf, data.m65025c(), data.getIsLoading(), null, 0, 192, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2 A[LOOP:1: B:38:0x00cc->B:40:0x00d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:65:0x018b  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ac A[LOOP:0: B:66:0x01a6->B:68:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: l */
    public final Object m65048l(C22517a c22517a, AbstractC22518b abstractC22518b, InterfaceC30057d<? super C22517a> interfaceC30057d) {
        g gVar;
        C22517a c22517a2;
        C22517a c22517a3;
        InterfaceC34385a interfaceC34385a;
        ArrayList arrayList;
        Iterator<T> it;
        InterfaceC34385a interfaceC34385a2;
        ArrayList arrayList2;
        Iterator<T> it3;
        AbstractC22518b abstractC22518b2 = abstractC22518b;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f88330E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f88330E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f88333y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f88330E;
        if (i14 != 0) {
            if (i14 == 1) {
                abstractC22518b2 = (AbstractC22518b) gVar2.f88332x;
                C22517a c22517a4 = (C22517a) gVar2.f88331w;
                AbstractC34132o.m107864I(obj);
                c22517a3 = c22517a4;
                interfaceC34385a = (InterfaceC34385a) obj;
                if ((interfaceC34385a instanceof InterfaceC34385a.b.a) && !(interfaceC34385a instanceof InterfaceC34385a.b.C42432b)) {
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<CalendarDateModel> daysOfMonth = ((StressCalendar) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getDaysOfMonth();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth, 10));
                    it = daysOfMonth.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new CalendarDateModel((TextResource) null, false, (Long) null, ((CalendarDateModel) it.next()).getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2039, (DefaultConstructorMarker) null));
                    }
                    AbstractC22518b.c cVar = (AbstractC22518b.c) abstractC22518b2;
                    return c22517a3.m65024a(AbstractC25247g0.m73995d0(c22517a3.m65025c(), AbstractC25247g0.m73989X(new C23465k(new Integer(cVar.getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList))), java.time.LocalDate.parse(cVar.getSpecificDate()), false);
                }
                return C22517a.m65023b(c22517a3, null, null, false, 3, null);
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC22518b2 = (AbstractC22518b) gVar2.f88332x;
            C22517a c22517a5 = (C22517a) gVar2.f88331w;
            AbstractC34132o.m107864I(obj);
            c22517a2 = c22517a5;
            interfaceC34385a2 = (InterfaceC34385a) obj;
            if ((interfaceC34385a2 instanceof InterfaceC34385a.b.a) && !(interfaceC34385a2 instanceof InterfaceC34385a.b.C42432b)) {
                if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth2 = ((StressCalendar) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).getDaysOfMonth();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth2, 10));
                it3 = daysOfMonth2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new CalendarDateModel((TextResource) null, false, (Long) null, ((CalendarDateModel) it3.next()).getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2039, (DefaultConstructorMarker) null));
                }
                return C22517a.m65023b(c22517a2, AbstractC25247g0.m73995d0(c22517a2.m65025c(), AbstractC25247g0.m73989X(new C23465k(new Integer(((AbstractC22518b.a) abstractC22518b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList2))), null, false, 2, null);
            }
            return C22517a.m65023b(c22517a2, null, null, false, 3, null);
        }
        AbstractC34132o.m107864I(obj);
        if (AbstractC22676k.m65745e(abstractC22518b2, AbstractC22518b.b.f88276a)) {
            return C22517a.m65023b(c22517a, null, null, true, 3, null);
        }
        if (abstractC22518b2 instanceof AbstractC22518b.c) {
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(abstractC22518b2, null);
            gVar2.f88331w = c22517a;
            gVar2.f88332x = abstractC22518b2;
            gVar2.f88330E = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "InteractingState.RefreshSpecificDate", hVar, gVar2, 2, null);
            if (objM108729b != enumC31071a) {
                c22517a3 = c22517a;
                obj = objM108729b;
                interfaceC34385a = (InterfaceC34385a) obj;
                if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                    return C22517a.m65023b(c22517a3, null, null, false, 3, null);
                }
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth3 = ((StressCalendar) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getDaysOfMonth();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth3, 10));
                it = daysOfMonth3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new CalendarDateModel((TextResource) null, false, (Long) null, ((CalendarDateModel) it.next()).getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2039, (DefaultConstructorMarker) null));
                }
                AbstractC22518b.c cVar2 = (AbstractC22518b.c) abstractC22518b2;
                return c22517a3.m65024a(AbstractC25247g0.m73995d0(c22517a3.m65025c(), AbstractC25247g0.m73989X(new C23465k(new Integer(cVar2.getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList))), java.time.LocalDate.parse(cVar2.getSpecificDate()), false);
            }
        } else {
            if (!(abstractC22518b2 instanceof AbstractC22518b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (c22517a.m65025c().containsKey(new Integer(((AbstractC22518b.a) abstractC22518b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()))) {
                return C22517a.m65023b(c22517a, null, null, false, 3, null);
            }
            InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n2 = this.logger;
            i iVar = new i(abstractC22518b2, null);
            gVar2.f88331w = c22517a;
            gVar2.f88332x = abstractC22518b2;
            gVar2.f88330E = 2;
            Object objM108729b2 = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, "InteractingState.CalendarPaged", iVar, gVar2, 2, null);
            if (objM108729b2 != enumC31071a) {
                c22517a2 = c22517a;
                obj = objM108729b2;
                interfaceC34385a2 = (InterfaceC34385a) obj;
                if (interfaceC34385a2 instanceof InterfaceC34385a.b.a) {
                    return C22517a.m65023b(c22517a2, null, null, false, 3, null);
                }
                if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth4 = ((StressCalendar) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).getDaysOfMonth();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth4, 10));
                it3 = daysOfMonth4.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new CalendarDateModel((TextResource) null, false, (Long) null, ((CalendarDateModel) it3.next()).getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2039, (DefaultConstructorMarker) null));
                }
                return C22517a.m65023b(c22517a2, AbstractC25247g0.m73995d0(c22517a2.m65025c(), AbstractC25247g0.m73989X(new C23465k(new Integer(((AbstractC22518b.a) abstractC22518b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList2))), null, false, 2, null);
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m65049m(C22520d accumulator) {
        return new C13084s1(new j(accumulator, this, null));
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m65050k(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new d(AbstractC13091v.m36610t(new C13060l1(new C22517a(null, null, true, 3, null), AbstractC13091v.m36590P(new b(new C13060l1(new C22520d(null, null, false, 7, null), upstream, new e(null))), new c(null, this)), new f(null))), this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C22522f(StressMonitorApi stressMonitorApi, InterfaceC34116n interfaceC34116n, InterfaceC41070a interfaceC41070a, Locale locale, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 8) != 0) {
            locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
        }
        this(stressMonitorApi, interfaceC34116n, interfaceC41070a, locale, featureFlagChecker);
    }
}
