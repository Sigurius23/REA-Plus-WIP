package vr1;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayBottomState;
import com.whoop.design.models.calendar.CalendarOverlay;
import com.whoop.design.models.calendar.CalendarPhase;
import com.whoop.design.util.TextResource;
import com.whoop.journal.interactors.p062v2.calendar.JournalCalendar;
import com.whoop.journal.interactors.p062v2.calendar.JournalCalendarApi;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h91.C17027b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
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

/* JADX INFO: renamed from: vr1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 02\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00050\u0001:\u0001&B1\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0006\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J1\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00050\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lvr1/d;", "Lod1/g;", "Lvr1/c;", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;", "api", "Ltr2/n;", "logger", "Lzr2/a;", "dateAndTimeProvider", "Ljava/util/Locale;", "locale", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;Ltr2/n;Lzr2/a;Ljava/util/Locale;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lvr1/e;", "ongoingPreparationAccumulator", "currentAction", "l", "(Lvr1/e;Lvr1/c;)Lvr1/e;", "accumulator", "Lec3/l;", "Lvr1/b;", "o", "(Lvr1/e;)Lec3/l;", "Lvr1/a;", "state", "n", "(Lvr1/a;Lvr1/b;Lq83/d;)Ljava/lang/Object;", "data", "m", "(Lvr1/a;)Lh91/b;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;", "b", "Ltr2/n;", "c", "Lzr2/a;", "d", "Ljava/util/Locale;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36306d implements InterfaceC27844g<AbstractC36305c, C17027b<CalendarDateModel>> {

    /* JADX INFO: renamed from: f */
    private static final a f155576f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final int f155577g = 8;

    /* JADX INFO: renamed from: h */
    private static final DateTimeFormatter f155578h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final JournalCalendarApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: vr1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lvr1/d$a;", "", "<init>", "()V", "Lorg/joda/time/format/DateTimeFormatter;", "FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "a", "()Lorg/joda/time/format/DateTimeFormatter;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final DateTimeFormatter m116087a() {
            return C36306d.f155578h;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vr1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f155584w;

        /* JADX INFO: renamed from: vr1.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f155585w;

            /* JADX INFO: renamed from: vr1.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$interact$$inlined$filter$1$2", m100430f = "JournalCalendarInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42562a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f155587F;

                /* JADX INFO: renamed from: G */
                Object f155588G;

                /* JADX INFO: renamed from: H */
                int f155589H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f155590w;

                /* JADX INFO: renamed from: x */
                int f155591x;

                /* JADX INFO: renamed from: y */
                Object f155592y;

                /* JADX INFO: renamed from: z */
                Object f155593z;

                public C42562a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f155590w = obj;
                    this.f155591x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f155585w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42562a c42562a;
                if (interfaceC30057d instanceof C42562a) {
                    c42562a = (C42562a) interfaceC30057d;
                    int i13 = c42562a.f155591x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42562a.f155591x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42562a = new C42562a(interfaceC30057d);
                    }
                } else {
                    c42562a = new C42562a(interfaceC30057d);
                }
                Object obj2 = c42562a.f155590w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42562a.f155591x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f155585w;
                    if (((C36307e) obj).getAction() != null) {
                        c42562a.f155592y = null;
                        c42562a.f155593z = null;
                        c42562a.f155587F = null;
                        c42562a.f155588G = null;
                        c42562a.f155589H = 0;
                        c42562a.f155591x = 1;
                        if (interfaceC13062m.emit(obj, c42562a) == enumC31071a) {
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
            this.f155584w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f155584w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vr1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$interact$$inlined$flatMapLatest$1", m100430f = "JournalCalendarInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155594w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155595x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155596y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36306d f155597z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C36306d c36306d) {
            super(3, interfaceC30057d);
            this.f155597z = c36306d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C36307e c36307e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f155597z);
            cVar.f155595x = interfaceC13062m;
            cVar.f155596y = c36307e;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155594w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155595x;
                InterfaceC13058l interfaceC13058lM116086o = this.f155597z.m116086o((C36307e) this.f155596y);
                this.f155595x = null;
                this.f155596y = null;
                this.f155594w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM116086o, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C36307e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vr1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f155598w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36306d f155599x;

        /* JADX INFO: renamed from: vr1.d$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f155600w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36306d f155601x;

            /* JADX INFO: renamed from: vr1.d$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$interact$$inlined$map$1$2", m100430f = "JournalCalendarInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42563a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f155602E;

                /* JADX INFO: renamed from: F */
                Object f155603F;

                /* JADX INFO: renamed from: G */
                Object f155604G;

                /* JADX INFO: renamed from: H */
                int f155605H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f155606w;

                /* JADX INFO: renamed from: x */
                int f155607x;

                /* JADX INFO: renamed from: y */
                Object f155608y;

                public C42563a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f155606w = obj;
                    this.f155607x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36306d c36306d) {
                this.f155600w = interfaceC13062m;
                this.f155601x = c36306d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42563a c42563a;
                if (interfaceC30057d instanceof C42563a) {
                    c42563a = (C42563a) interfaceC30057d;
                    int i13 = c42563a.f155607x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42563a.f155607x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42563a = new C42563a(interfaceC30057d);
                    }
                } else {
                    c42563a = new C42563a(interfaceC30057d);
                }
                Object obj2 = c42563a.f155606w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42563a.f155607x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f155600w;
                    C17027b c17027bM116084m = this.f155601x.m116084m((C36303a) obj);
                    c42563a.f155608y = null;
                    c42563a.f155602E = null;
                    c42563a.f155603F = null;
                    c42563a.f155604G = null;
                    c42563a.f155605H = 0;
                    c42563a.f155607x = 1;
                    if (interfaceC13062m.emit(c17027bM116084m, c42563a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C36306d c36306d) {
            this.f155598w = interfaceC13058l;
            this.f155599x = c36306d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f155598w.collect(new a(interfaceC13062m, this.f155599x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vr1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$interact$1", m100430f = "JournalCalendarInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvr1/e;", "ongoingAccumulator", "Lvr1/c;", "currentAction", "<anonymous>", "(Lvr1/e;Lvr1/c;)Lvr1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155610w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f155611x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155612y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C36307e c36307e, AbstractC36305c abstractC36305c, InterfaceC30057d<? super C36307e> interfaceC30057d) {
            e eVar = C36306d.this.new e(interfaceC30057d);
            eVar.f155611x = c36307e;
            eVar.f155612y = abstractC36305c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C36307e c36307e = (C36307e) this.f155611x;
            AbstractC36305c abstractC36305c = (AbstractC36305c) this.f155612y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155610w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C36306d.this.m116083l(c36307e, abstractC36305c);
        }
    }

    /* JADX INFO: renamed from: vr1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$interact$4", m100430f = "JournalCalendarInteractor.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvr1/a;", "accumulator", "Lvr1/b;", "state", "<anonymous>", "(Lvr1/a;Lvr1/b;)Lvr1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155614w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f155615x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155616y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C36303a c36303a, AbstractC36304b abstractC36304b, InterfaceC30057d<? super C36303a> interfaceC30057d) {
            f fVar = C36306d.this.new f(interfaceC30057d);
            fVar.f155615x = c36303a;
            fVar.f155616y = abstractC36304b;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C36303a c36303a = (C36303a) this.f155615x;
            AbstractC36304b abstractC36304b = (AbstractC36304b) this.f155616y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155614w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C36306d c36306d = C36306d.this;
            this.f155615x = null;
            this.f155616y = null;
            this.f155614w = 1;
            Object objM116085n = c36306d.m116085n(c36303a, abstractC36304b, this);
            return objM116085n == enumC31071a ? enumC31071a : objM116085n;
        }
    }

    /* JADX INFO: renamed from: vr1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor", m100430f = "JournalCalendarInteractor.kt", m100431l = {129, 150}, m100432m = "interactingStateToDomainData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f155618E;

        /* JADX INFO: renamed from: w */
        Object f155619w;

        /* JADX INFO: renamed from: x */
        Object f155620x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155621y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155621y = obj;
            this.f155618E |= Integer.MIN_VALUE;
            return C36306d.this.m116085n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vr1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$interactingStateToDomainData$2", m100430f = "JournalCalendarInteractor.kt", m100431l = {130}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f155623w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC36304b f155625y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC36304b abstractC36304b, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f155625y = abstractC36304b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36306d.this.new h(this.f155625y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155623w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JournalCalendarApi journalCalendarApi = C36306d.this.api;
            String specificDate = ((AbstractC36304b.c) this.f155625y).getSpecificDate();
            this.f155623w = 1;
            Object journalCalendar = journalCalendarApi.getJournalCalendar(specificDate, this);
            return journalCalendar == enumC31071a ? enumC31071a : journalCalendar;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JournalCalendar> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vr1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$interactingStateToDomainData$4", m100430f = "JournalCalendarInteractor.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f155626w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC36304b f155628y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC36304b abstractC36304b, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f155628y = abstractC36304b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36306d.this.new i(this.f155628y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155626w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JournalCalendarApi journalCalendarApi = C36306d.this.api;
            String specificDate = ((AbstractC36304b.a) this.f155628y).getSpecificDate();
            this.f155626w = 1;
            Object journalCalendar = journalCalendarApi.getJournalCalendar(specificDate, this);
            return journalCalendar == enumC31071a ? enumC31071a : journalCalendar;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JournalCalendar> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vr1.d$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$preparationToInteractingState$1", m100430f = "JournalCalendarInteractor.kt", m100431l = {84, 89, 93, 116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvr1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f155629E;

        /* JADX INFO: renamed from: F */
        Object f155630F;

        /* JADX INFO: renamed from: G */
        int f155631G;

        /* JADX INFO: renamed from: H */
        int f155632H;

        /* JADX INFO: renamed from: I */
        private /* synthetic */ Object f155633I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C36307e f155634J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ C36306d f155635K;

        /* JADX INFO: renamed from: w */
        Object f155636w;

        /* JADX INFO: renamed from: x */
        Object f155637x;

        /* JADX INFO: renamed from: y */
        Object f155638y;

        /* JADX INFO: renamed from: z */
        Object f155639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C36307e c36307e, C36306d c36306d, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155634J = c36307e;
            this.f155635K = c36306d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f155634J, this.f155635K, interfaceC30057d);
            jVar.f155633I = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
        
            if (r0.emit(r3, r11) == r1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
        
            if (r0.emit(r2, r11) == r1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0199, code lost:
        
            if (r0.emit(r2, r11) == r1) goto L38;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 421
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vr1.C36306d.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        f155578h = dateTimeFormatterForPattern;
    }

    public C36306d(JournalCalendarApi api, InterfaceC34116n logger, InterfaceC41070a dateAndTimeProvider, Locale locale, FeatureFlagChecker featureFlagChecker) {
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
    /* JADX INFO: renamed from: l */
    public final C36307e m116083l(C36307e ongoingPreparationAccumulator, AbstractC36305c currentAction) {
        if (currentAction instanceof AbstractC36305c.a) {
            int i13 = ((AbstractC36305c.a) currentAction).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String();
            if (ongoingPreparationAccumulator.m116092c().contains(Integer.valueOf(i13))) {
                return new C36307e(ongoingPreparationAccumulator.m116092c(), currentAction, false);
            }
            return new C36307e(AbstractC12350b.m34555D(Integer.valueOf(i13), ongoingPreparationAccumulator.m116092c()), currentAction, true);
        }
        if (AbstractC22676k.m65745e(currentAction, AbstractC36305c.b.f155574a)) {
            return new C36307e(AbstractC12350b.m34570S(0), currentAction, true);
        }
        if (currentAction instanceof AbstractC36305c.c) {
            return new C36307e(ongoingPreparationAccumulator.m116092c(), currentAction, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C17027b<CalendarDateModel> m116084m(C36303a data) {
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        java.time.LocalDate localDateOf = java.time.LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        C17027b.Companion companion = C17027b.INSTANCE;
        Locale locale = this.locale;
        AbstractC22676k.m65747g(localDateOf);
        java.time.LocalDate selectedDate = data.getSelectedDate();
        return C17027b.Companion.m48086b(companion, locale, localDateOf, selectedDate == null ? localDateOf : selectedDate, localDateOf, data.m116065c(), data.getIsLoading(), null, 0, 192, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2 A[LOOP:1: B:38:0x00cc->B:40:0x00d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af A[LOOP:0: B:66:0x01a9->B:68:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: n */
    public final Object m116085n(C36303a c36303a, AbstractC36304b abstractC36304b, InterfaceC30057d<? super C36303a> interfaceC30057d) {
        g gVar;
        C36303a c36303a2;
        C36303a c36303a3;
        InterfaceC34385a interfaceC34385a;
        ArrayList arrayList;
        InterfaceC34385a interfaceC34385a2;
        ArrayList arrayList2;
        AbstractC36304b abstractC36304b2 = abstractC36304b;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f155618E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f155618E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f155621y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f155618E;
        if (i14 != 0) {
            if (i14 == 1) {
                abstractC36304b2 = (AbstractC36304b) gVar2.f155620x;
                C36303a c36303a4 = (C36303a) gVar2.f155619w;
                AbstractC34132o.m107864I(obj);
                c36303a3 = c36303a4;
                interfaceC34385a = (InterfaceC34385a) obj;
                if ((interfaceC34385a instanceof InterfaceC34385a.b.a) && !(interfaceC34385a instanceof InterfaceC34385a.b.C42432b)) {
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<CalendarDateModel> daysOfMonth = ((JournalCalendar) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getDaysOfMonth();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth, 10));
                    for (CalendarDateModel calendarDateModel : daysOfMonth) {
                        arrayList.add(new CalendarDateModel((TextResource) null, false, calendarDateModel.getCycleId(), calendarDateModel.getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2035, (DefaultConstructorMarker) null));
                    }
                    AbstractC36304b.c cVar = (AbstractC36304b.c) abstractC36304b2;
                    return c36303a3.m116064a(AbstractC25247g0.m73995d0(c36303a3.m116065c(), AbstractC25247g0.m73989X(new C23465k(new Integer(cVar.getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList))), java.time.LocalDate.parse(cVar.getSpecificDate()), false);
                }
                return C36303a.m116063b(c36303a3, null, null, false, 3, null);
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC36304b2 = (AbstractC36304b) gVar2.f155620x;
            C36303a c36303a5 = (C36303a) gVar2.f155619w;
            AbstractC34132o.m107864I(obj);
            c36303a2 = c36303a5;
            interfaceC34385a2 = (InterfaceC34385a) obj;
            if ((interfaceC34385a2 instanceof InterfaceC34385a.b.a) && !(interfaceC34385a2 instanceof InterfaceC34385a.b.C42432b)) {
                if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth2 = ((JournalCalendar) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).getDaysOfMonth();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth2, 10));
                for (CalendarDateModel calendarDateModel2 : daysOfMonth2) {
                    arrayList2.add(new CalendarDateModel((TextResource) null, false, calendarDateModel2.getCycleId(), calendarDateModel2.getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2035, (DefaultConstructorMarker) null));
                }
                return C36303a.m116063b(c36303a2, AbstractC25247g0.m73995d0(c36303a2.m116065c(), AbstractC25247g0.m73989X(new C23465k(new Integer(((AbstractC36304b.a) abstractC36304b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList2))), null, false, 2, null);
            }
            return C36303a.m116063b(c36303a2, null, null, false, 3, null);
        }
        AbstractC34132o.m107864I(obj);
        if (AbstractC22676k.m65745e(abstractC36304b2, AbstractC36304b.b.f155570a)) {
            return C36303a.m116063b(c36303a, null, null, true, 3, null);
        }
        if (abstractC36304b2 instanceof AbstractC36304b.c) {
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(abstractC36304b2, null);
            gVar2.f155619w = c36303a;
            gVar2.f155620x = abstractC36304b2;
            gVar2.f155618E = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "InteractingState.RefreshSpecificDate", hVar, gVar2, 2, null);
            if (objM108729b != enumC31071a) {
                c36303a3 = c36303a;
                obj = objM108729b;
                interfaceC34385a = (InterfaceC34385a) obj;
                if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                    return C36303a.m116063b(c36303a3, null, null, false, 3, null);
                }
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth3 = ((JournalCalendar) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getDaysOfMonth();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth3, 10));
                while (r2.hasNext()) {
                    arrayList.add(new CalendarDateModel((TextResource) null, false, calendarDateModel.getCycleId(), calendarDateModel.getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2035, (DefaultConstructorMarker) null));
                }
                AbstractC36304b.c cVar2 = (AbstractC36304b.c) abstractC36304b2;
                return c36303a3.m116064a(AbstractC25247g0.m73995d0(c36303a3.m116065c(), AbstractC25247g0.m73989X(new C23465k(new Integer(cVar2.getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList))), java.time.LocalDate.parse(cVar2.getSpecificDate()), false);
            }
        } else {
            if (!(abstractC36304b2 instanceof AbstractC36304b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (c36303a.m116065c().containsKey(new Integer(((AbstractC36304b.a) abstractC36304b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()))) {
                return C36303a.m116063b(c36303a, null, null, false, 3, null);
            }
            InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n2 = this.logger;
            i iVar = new i(abstractC36304b2, null);
            gVar2.f155619w = c36303a;
            gVar2.f155620x = abstractC36304b2;
            gVar2.f155618E = 2;
            Object objM108729b2 = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, "InteractingState.CalendarPaged", iVar, gVar2, 2, null);
            if (objM108729b2 != enumC31071a) {
                c36303a2 = c36303a;
                obj = objM108729b2;
                interfaceC34385a2 = (InterfaceC34385a) obj;
                if (interfaceC34385a2 instanceof InterfaceC34385a.b.a) {
                    return C36303a.m116063b(c36303a2, null, null, false, 3, null);
                }
                if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth4 = ((JournalCalendar) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).getDaysOfMonth();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth4, 10));
                while (r2.hasNext()) {
                    arrayList2.add(new CalendarDateModel((TextResource) null, false, calendarDateModel2.getCycleId(), calendarDateModel2.getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2035, (DefaultConstructorMarker) null));
                }
                return C36303a.m116063b(c36303a2, AbstractC25247g0.m73995d0(c36303a2.m116065c(), AbstractC25247g0.m73989X(new C23465k(new Integer(((AbstractC36304b.a) abstractC36304b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList2))), null, false, 2, null);
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m116086o(C36307e accumulator) {
        return new C13084s1(new j(accumulator, this, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new d(AbstractC13091v.m36610t(new C13060l1(new C36303a(null, null, true, 3, null), AbstractC13091v.m36590P(new b(new C13060l1(new C36307e(null, null, false, 7, null), upstream, new e(null))), new c(null, this)), new f(null))), this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C36306d(JournalCalendarApi journalCalendarApi, InterfaceC34116n interfaceC34116n, InterfaceC41070a interfaceC41070a, Locale locale, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 8) != 0) {
            locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
        }
        this(journalCalendarApi, interfaceC34116n, interfaceC41070a, locale, featureFlagChecker);
    }
}
