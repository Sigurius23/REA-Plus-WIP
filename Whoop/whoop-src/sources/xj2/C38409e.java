package xj2;

import c93.InterfaceC4351m;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayBottomState;
import com.whoop.design.models.calendar.CalendarOverlay;
import com.whoop.design.models.calendar.CalendarPhase;
import com.whoop.design.util.TextResource;
import com.whoop.tiltgraph.api.TiltGraphApi;
import com.whoop.tiltgraph.domain.models.TiltGraphCalendar;
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

/* JADX INFO: renamed from: xj2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001$B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u001d0\u001cj\u0002`\u001e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e0\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lxj2/e;", "", "Lcom/whoop/tiltgraph/api/TiltGraphApi;", "api", "Ltr2/n;", "logger", "Lzr2/a;", "dateAndTimeProvider", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/whoop/tiltgraph/api/TiltGraphApi;Ltr2/n;Lzr2/a;Ljava/util/Locale;)V", "Lxj2/c;", "ongoingPreparationAccumulator", "Lxj2/d;", "currentAction", "j", "(Lxj2/c;Lxj2/d;)Lxj2/c;", "accumulator", "Lec3/l;", "Lxj2/b;", "n", "(Lxj2/c;)Lec3/l;", "Lxj2/a;", "state", "m", "(Lxj2/a;Lxj2/b;Lq83/d;)Ljava/lang/Object;", "data", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "k", "(Lxj2/a;)Lh91/b;", "upstream", "l", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/tiltgraph/api/TiltGraphApi;", "b", "Ltr2/n;", "c", "Lzr2/a;", "d", "Ljava/util/Locale;", "e", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38409e {

    /* JADX INFO: renamed from: e */
    private static final a f164409e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f164410f = 8;

    /* JADX INFO: renamed from: g */
    private static final DateTimeFormatter f164411g;

    /* JADX INFO: renamed from: h */
    private static final java.time.format.DateTimeFormatter f164412h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TiltGraphApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: xj2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lxj2/e$a;", "", "<init>", "()V", "Lorg/joda/time/format/DateTimeFormatter;", "FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "b", "()Lorg/joda/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_FORMATTER", "Ljava/time/format/DateTimeFormatter;", "a", "()Ljava/time/format/DateTimeFormatter;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final java.time.format.DateTimeFormatter m123035a() {
            return C38409e.f164412h;
        }

        /* JADX INFO: renamed from: b */
        public final DateTimeFormatter m123036b() {
            return C38409e.f164411g;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: xj2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f164417w;

        /* JADX INFO: renamed from: xj2.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f164418w;

            /* JADX INFO: renamed from: xj2.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$interact$$inlined$filter$1$2", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42649a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f164420F;

                /* JADX INFO: renamed from: G */
                Object f164421G;

                /* JADX INFO: renamed from: H */
                int f164422H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f164423w;

                /* JADX INFO: renamed from: x */
                int f164424x;

                /* JADX INFO: renamed from: y */
                Object f164425y;

                /* JADX INFO: renamed from: z */
                Object f164426z;

                public C42649a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f164423w = obj;
                    this.f164424x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f164418w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42649a c42649a;
                if (interfaceC30057d instanceof C42649a) {
                    c42649a = (C42649a) interfaceC30057d;
                    int i13 = c42649a.f164424x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42649a.f164424x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42649a = new C42649a(interfaceC30057d);
                    }
                } else {
                    c42649a = new C42649a(interfaceC30057d);
                }
                Object obj2 = c42649a.f164423w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42649a.f164424x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f164418w;
                    if (((C38407c) obj).getAction() != null) {
                        c42649a.f164425y = null;
                        c42649a.f164426z = null;
                        c42649a.f164420F = null;
                        c42649a.f164421G = null;
                        c42649a.f164422H = 0;
                        c42649a.f164424x = 1;
                        if (interfaceC13062m.emit(obj, c42649a) == enumC31071a) {
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
            this.f164417w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f164417w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xj2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f164427w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f164428x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f164429y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38409e f164430z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C38409e c38409e) {
            super(3, interfaceC30057d);
            this.f164430z = c38409e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C38407c c38407c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f164430z);
            cVar.f164428x = interfaceC13062m;
            cVar.f164429y = c38407c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164427w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f164428x;
                InterfaceC13058l interfaceC13058lM123033n = this.f164430z.m123033n((C38407c) this.f164429y);
                this.f164428x = null;
                this.f164429y = null;
                this.f164427w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM123033n, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C38407c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: xj2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f164431w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38409e f164432x;

        /* JADX INFO: renamed from: xj2.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f164433w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38409e f164434x;

            /* JADX INFO: renamed from: xj2.e$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$interact$$inlined$map$1$2", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42650a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f164435E;

                /* JADX INFO: renamed from: F */
                Object f164436F;

                /* JADX INFO: renamed from: G */
                Object f164437G;

                /* JADX INFO: renamed from: H */
                int f164438H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f164439w;

                /* JADX INFO: renamed from: x */
                int f164440x;

                /* JADX INFO: renamed from: y */
                Object f164441y;

                public C42650a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f164439w = obj;
                    this.f164440x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38409e c38409e) {
                this.f164433w = interfaceC13062m;
                this.f164434x = c38409e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42650a c42650a;
                if (interfaceC30057d instanceof C42650a) {
                    c42650a = (C42650a) interfaceC30057d;
                    int i13 = c42650a.f164440x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42650a.f164440x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42650a = new C42650a(interfaceC30057d);
                    }
                } else {
                    c42650a = new C42650a(interfaceC30057d);
                }
                Object obj2 = c42650a.f164439w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42650a.f164440x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f164433w;
                    C17027b c17027bM123031k = this.f164434x.m123031k((C38405a) obj);
                    c42650a.f164441y = null;
                    c42650a.f164435E = null;
                    c42650a.f164436F = null;
                    c42650a.f164437G = null;
                    c42650a.f164438H = 0;
                    c42650a.f164440x = 1;
                    if (interfaceC13062m.emit(c17027bM123031k, c42650a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C38409e c38409e) {
            this.f164431w = interfaceC13058l;
            this.f164432x = c38409e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f164431w.collect(new a(interfaceC13062m, this.f164432x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xj2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$interact$1", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lxj2/c;", "ongoingAccumulator", "Lxj2/d;", "currentAction", "<anonymous>", "(Lxj2/c;Lxj2/d;)Lxj2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f164443w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f164444x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f164445y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38407c c38407c, AbstractC38408d abstractC38408d, InterfaceC30057d<? super C38407c> interfaceC30057d) {
            e eVar = C38409e.this.new e(interfaceC30057d);
            eVar.f164444x = c38407c;
            eVar.f164445y = abstractC38408d;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C38407c c38407c = (C38407c) this.f164444x;
            AbstractC38408d abstractC38408d = (AbstractC38408d) this.f164445y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f164443w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C38409e.this.m123030j(c38407c, abstractC38408d);
        }
    }

    /* JADX INFO: renamed from: xj2.e$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$interact$4", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lxj2/a;", "accumulator", "Lxj2/b;", "state", "<anonymous>", "(Lxj2/a;Lxj2/b;)Lxj2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f164447w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f164448x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f164449y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38405a c38405a, AbstractC38406b abstractC38406b, InterfaceC30057d<? super C38405a> interfaceC30057d) {
            f fVar = C38409e.this.new f(interfaceC30057d);
            fVar.f164448x = c38405a;
            fVar.f164449y = abstractC38406b;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C38405a c38405a = (C38405a) this.f164448x;
            AbstractC38406b abstractC38406b = (AbstractC38406b) this.f164449y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164447w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C38409e c38409e = C38409e.this;
            this.f164448x = null;
            this.f164449y = null;
            this.f164447w = 1;
            Object objM123032m = c38409e.m123032m(c38405a, abstractC38406b, this);
            return objM123032m == enumC31071a ? enumC31071a : objM123032m;
        }
    }

    /* JADX INFO: renamed from: xj2.e$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {119, 140}, m100432m = "interactingStateToDomainData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f164451E;

        /* JADX INFO: renamed from: w */
        Object f164452w;

        /* JADX INFO: renamed from: x */
        Object f164453x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f164454y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164454y = obj;
            this.f164451E |= Integer.MIN_VALUE;
            return C38409e.this.m123032m(null, null, this);
        }
    }

    /* JADX INFO: renamed from: xj2.e$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$interactingStateToDomainData$2", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/tiltgraph/domain/models/TiltGraphCalendar;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f164456w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC38406b f164458y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC38406b abstractC38406b, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f164458y = abstractC38406b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38409e.this.new h(this.f164458y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164456w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TiltGraphApi tiltGraphApi = C38409e.this.api;
            String str = C38409e.f164409e.m123035a().format(((AbstractC38406b.c) this.f164458y).getSpecificDate());
            AbstractC22676k.m65749i(str, "format(...)");
            this.f164456w = 1;
            Object tiltGraphCalendar = tiltGraphApi.getTiltGraphCalendar(str, this);
            return tiltGraphCalendar == enumC31071a ? enumC31071a : tiltGraphCalendar;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TiltGraphCalendar> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: xj2.e$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$interactingStateToDomainData$4", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/tiltgraph/domain/models/TiltGraphCalendar;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f164459w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC38406b f164461y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC38406b abstractC38406b, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f164461y = abstractC38406b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38409e.this.new i(this.f164461y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164459w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            TiltGraphApi tiltGraphApi = C38409e.this.api;
            String specificDate = ((AbstractC38406b.a) this.f164461y).getSpecificDate();
            this.f164459w = 1;
            Object tiltGraphCalendar = tiltGraphApi.getTiltGraphCalendar(specificDate, this);
            return tiltGraphCalendar == enumC31071a ? enumC31071a : tiltGraphCalendar;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TiltGraphCalendar> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: xj2.e$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$preparationToInteractingState$1", m100430f = "TiltGraphCalendarInteractor.kt", m100431l = {85, 90, 94, 106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxj2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f164462E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f164463F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C38407c f164464G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C38409e f164465H;

        /* JADX INFO: renamed from: w */
        Object f164466w;

        /* JADX INFO: renamed from: x */
        Object f164467x;

        /* JADX INFO: renamed from: y */
        Object f164468y;

        /* JADX INFO: renamed from: z */
        int f164469z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C38407c c38407c, C38409e c38409e, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164464G = c38407c;
            this.f164465H = c38409e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f164464G, this.f164465H, interfaceC30057d);
            jVar.f164463F = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
        
            if (r0.emit(r3, r9) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
        
            if (r0.emit(r2, r9) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0129, code lost:
        
            if (r0.emit(r4, r9) == r1) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xj2.C38409e.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        f164411g = dateTimeFormatterForPattern;
        f164412h = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    public C38409e(TiltGraphApi api, InterfaceC34116n logger, InterfaceC41070a dateAndTimeProvider, Locale locale) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(locale, "locale");
        this.api = api;
        this.logger = logger;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.locale = locale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C38407c m123030j(C38407c ongoingPreparationAccumulator, AbstractC38408d currentAction) {
        if (currentAction instanceof AbstractC38408d.a) {
            int i13 = ((AbstractC38408d.a) currentAction).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String();
            if (ongoingPreparationAccumulator.m123018c().contains(Integer.valueOf(i13))) {
                return new C38407c(ongoingPreparationAccumulator.m123018c(), currentAction, false);
            }
            return new C38407c(AbstractC12350b.m34555D(Integer.valueOf(i13), ongoingPreparationAccumulator.m123018c()), currentAction, true);
        }
        if (AbstractC22676k.m65745e(currentAction, AbstractC38408d.b.f164407a)) {
            return new C38407c(AbstractC12350b.m34570S(0), currentAction, true);
        }
        if (currentAction instanceof AbstractC38408d.c) {
            return new C38407c(ongoingPreparationAccumulator.m123018c(), currentAction, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C17027b<CalendarDateModel> m123031k(C38405a data) {
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        java.time.LocalDate localDateOf = java.time.LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        C17027b.Companion companion = C17027b.INSTANCE;
        Locale locale = this.locale;
        AbstractC22676k.m65747g(localDateOf);
        java.time.LocalDate selectedDate = data.getSelectedDate();
        return C17027b.Companion.m48086b(companion, locale, localDateOf, selectedDate == null ? localDateOf : selectedDate, localDateOf, data.m123009c(), data.getIsLoading(), null, 0, 192, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2 A[LOOP:1: B:38:0x00cc->B:40:0x00d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a8 A[LOOP:0: B:66:0x01a2->B:68:0x01a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: m */
    public final Object m123032m(C38405a c38405a, AbstractC38406b abstractC38406b, InterfaceC30057d<? super C38405a> interfaceC30057d) {
        g gVar;
        C38405a c38405a2;
        C38405a c38405a3;
        InterfaceC34385a interfaceC34385a;
        ArrayList arrayList;
        Iterator<T> it;
        InterfaceC34385a interfaceC34385a2;
        ArrayList arrayList2;
        Iterator<T> it3;
        AbstractC38406b abstractC38406b2 = abstractC38406b;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f164451E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f164451E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f164454y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f164451E;
        if (i14 != 0) {
            if (i14 == 1) {
                abstractC38406b2 = (AbstractC38406b) gVar2.f164453x;
                C38405a c38405a4 = (C38405a) gVar2.f164452w;
                AbstractC34132o.m107864I(obj);
                c38405a3 = c38405a4;
                interfaceC34385a = (InterfaceC34385a) obj;
                if ((interfaceC34385a instanceof InterfaceC34385a.b.a) && !(interfaceC34385a instanceof InterfaceC34385a.b.C42432b)) {
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<CalendarDateModel> daysOfMonth = ((TiltGraphCalendar) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getDaysOfMonth();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth, 10));
                    it = daysOfMonth.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new CalendarDateModel((TextResource) null, false, (Long) null, ((CalendarDateModel) it.next()).getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2039, (DefaultConstructorMarker) null));
                    }
                    AbstractC38406b.c cVar = (AbstractC38406b.c) abstractC38406b2;
                    return c38405a3.m123008a(AbstractC25247g0.m73995d0(c38405a3.m123009c(), AbstractC25247g0.m73989X(new C23465k(new Integer(cVar.getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList))), cVar.getSpecificDate(), false);
                }
                return C38405a.m123007b(c38405a3, null, null, false, 3, null);
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC38406b2 = (AbstractC38406b) gVar2.f164453x;
            C38405a c38405a5 = (C38405a) gVar2.f164452w;
            AbstractC34132o.m107864I(obj);
            c38405a2 = c38405a5;
            interfaceC34385a2 = (InterfaceC34385a) obj;
            if ((interfaceC34385a2 instanceof InterfaceC34385a.b.a) && !(interfaceC34385a2 instanceof InterfaceC34385a.b.C42432b)) {
                if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth2 = ((TiltGraphCalendar) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).getDaysOfMonth();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth2, 10));
                it3 = daysOfMonth2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new CalendarDateModel((TextResource) null, false, (Long) null, ((CalendarDateModel) it3.next()).getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2039, (DefaultConstructorMarker) null));
                }
                return C38405a.m123007b(c38405a2, AbstractC25247g0.m73995d0(c38405a2.m123009c(), AbstractC25247g0.m73989X(new C23465k(new Integer(((AbstractC38406b.a) abstractC38406b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList2))), null, false, 2, null);
            }
            return C38405a.m123007b(c38405a2, null, null, false, 3, null);
        }
        AbstractC34132o.m107864I(obj);
        if (AbstractC22676k.m65745e(abstractC38406b2, AbstractC38406b.b.f164400a)) {
            return C38405a.m123007b(c38405a, null, null, true, 3, null);
        }
        if (abstractC38406b2 instanceof AbstractC38406b.c) {
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(abstractC38406b2, null);
            gVar2.f164452w = c38405a;
            gVar2.f164453x = abstractC38406b2;
            gVar2.f164451E = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "InteractingState.RefreshSpecificDate", hVar, gVar2, 2, null);
            if (objM108729b != enumC31071a) {
                c38405a3 = c38405a;
                obj = objM108729b;
                interfaceC34385a = (InterfaceC34385a) obj;
                if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                    return C38405a.m123007b(c38405a3, null, null, false, 3, null);
                }
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth3 = ((TiltGraphCalendar) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getDaysOfMonth();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth3, 10));
                it = daysOfMonth3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new CalendarDateModel((TextResource) null, false, (Long) null, ((CalendarDateModel) it.next()).getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2039, (DefaultConstructorMarker) null));
                }
                AbstractC38406b.c cVar2 = (AbstractC38406b.c) abstractC38406b2;
                return c38405a3.m123008a(AbstractC25247g0.m73995d0(c38405a3.m123009c(), AbstractC25247g0.m73989X(new C23465k(new Integer(cVar2.getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList))), cVar2.getSpecificDate(), false);
            }
        } else {
            if (!(abstractC38406b2 instanceof AbstractC38406b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (c38405a.m123009c().containsKey(new Integer(((AbstractC38406b.a) abstractC38406b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()))) {
                return C38405a.m123007b(c38405a, null, null, false, 3, null);
            }
            InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n2 = this.logger;
            i iVar = new i(abstractC38406b2, null);
            gVar2.f164452w = c38405a;
            gVar2.f164453x = abstractC38406b2;
            gVar2.f164451E = 2;
            Object objM108729b2 = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, "InteractingState.CalendarPaged", iVar, gVar2, 2, null);
            if (objM108729b2 != enumC31071a) {
                c38405a2 = c38405a;
                obj = objM108729b2;
                interfaceC34385a2 = (InterfaceC34385a) obj;
                if (interfaceC34385a2 instanceof InterfaceC34385a.b.a) {
                    return C38405a.m123007b(c38405a2, null, null, false, 3, null);
                }
                if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
                    throw new NoWhenBranchMatchedException();
                }
                List<CalendarDateModel> daysOfMonth4 = ((TiltGraphCalendar) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).getDaysOfMonth();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(daysOfMonth4, 10));
                it3 = daysOfMonth4.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new CalendarDateModel((TextResource) null, false, (Long) null, ((CalendarDateModel) it3.next()).getDayState(), (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2039, (DefaultConstructorMarker) null));
                }
                return C38405a.m123007b(c38405a2, AbstractC25247g0.m73995d0(c38405a2.m123009c(), AbstractC25247g0.m73989X(new C23465k(new Integer(((AbstractC38406b.a) abstractC38406b2).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()), arrayList2))), null, false, 2, null);
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m123033n(C38407c accumulator) {
        return new C13084s1(new j(accumulator, this, null));
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m123034l(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new d(AbstractC13091v.m36610t(new C13060l1(new C38405a(null, null, true, 3, null), AbstractC13091v.m36590P(new b(new C13060l1(new C38407c(null, null, false, 7, null), upstream, new e(null))), new c(null, this)), new f(null))), this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C38409e(TiltGraphApi tiltGraphApi, InterfaceC34116n interfaceC34116n, InterfaceC41070a interfaceC41070a, Locale locale, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 8) != 0) {
            locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
        }
        this(tiltGraphApi, interfaceC34116n, interfaceC41070a, locale);
    }
}
