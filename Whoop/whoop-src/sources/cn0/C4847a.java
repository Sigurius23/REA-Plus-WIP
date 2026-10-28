package cn0;

import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayBottomState;
import com.whoop.design.models.calendar.CalendarDayState;
import com.whoop.design.models.calendar.CalendarPhase;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import dn0.C12209i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import kb1.AbstractC22327g;
import kb1.C22325e;
import l83.C23454a0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qy0.EnumC30774g;

/* JADX INFO: renamed from: cn0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\nJ#\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ!\u0010\u0014\u001a\u00020\u00132\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\nJ#\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0018\u001a\u00020\r2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\r2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J#\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\nJ#\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\nJ#\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\nJ#\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\r*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J+\u0010'\u001a\u00020&2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lcn0/a;", "", "<init>", "()V", "Lkb1/e;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;", "dateArgs", "Ly81/e;", "c", "(Lkb1/e;)Ly81/e;", "Lcom/whoop/design/models/calendar/CalendarPhase;", "phase", "", "isFutureDay", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/calendar/CalendarPhase;Z)Ly81/e;", "d", "f", "Lqy0/g;", "g", "(Lkb1/e;)Lqy0/g;", "a", "b", "j", "(Lkb1/e;)Z", "k", "m", "n", "l", "", "o", "(Lkb1/e;)Ljava/lang/Float;", "Lcom/whoop/design/models/calendar/CalendarDayState;", "e", "(Lcom/whoop/design/models/calendar/CalendarDayState;)Z", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "Ldn0/i;", "i", "(Lkb1/e;Lcom/whoop/navigation/models/GenericInteraction;)Ldn0/i;", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4847a {

    /* JADX INFO: renamed from: a */
    private static final a f20137a = new a(null);

    /* JADX INFO: renamed from: cn0.a$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, m65681d2 = {"Lcn0/a$a;", "", "<init>", "()V", "", "FUTURE_DAY_ALPHA", "F", "PAST_DAY_ALPHA", "PAST_DAY_MENSTRUAL_ALPHA", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: cn0.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20138a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f20139b;

        static {
            int[] iArr = new int[CalendarPhase.values().length];
            try {
                iArr[CalendarPhase.FOLLICULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarPhase.HORMONAL_BIRTH_CONTROL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalendarPhase.LUTEAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CalendarPhase.MENSTRUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CalendarPhase.OVULATORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CalendarPhase.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f20138a = iArr;
            int[] iArr2 = new int[CalendarDayBottomState.values().length];
            try {
                iArr2[CalendarDayBottomState.SYMPTOMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CalendarDayBottomState.PREDICTED_SYMPTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f20139b = iArr2;
        }
    }

    /* JADX INFO: renamed from: cn0.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f20140w = new c();

        /* JADX INFO: renamed from: a */
        public final long m15437a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getMciRed();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15437a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f20141w = new d();

        /* JADX INFO: renamed from: a */
        public final long m15438a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15438a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f20142w = new e();

        /* JADX INFO: renamed from: a */
        public final long m15439a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getMciRed();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15439a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f20143w = new f();

        /* JADX INFO: renamed from: a */
        public final long m15440a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15440a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f20144w = new g();

        /* JADX INFO: renamed from: a */
        public final long m15441a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15441a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f20145w;

        /* JADX INFO: renamed from: cn0.a$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f20146a;

            static {
                int[] iArr = new int[CalendarDayState.values().length];
                try {
                    iArr[CalendarDayState.PERIOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CalendarDayState.PREDICTED_PERIOD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CalendarDayState.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CalendarDayState.WHITE_NO_BACKGROUND.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f20146a = iArr;
            }
        }

        public h(C22325e<CalendarDateModel> c22325e) {
            this.f20145w = c22325e;
        }

        /* JADX INFO: renamed from: a */
        public final long m15442a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            CalendarDateModel calendarDateModelM64155g = this.f20145w.m64155g();
            CalendarDayState dayState = calendarDateModelM64155g != null ? calendarDateModelM64155g.getDayState() : null;
            int i13 = dayState == null ? -1 : a.f20146a[dayState.ordinal()];
            if (i13 == 1 || i13 == 2) {
                return this.f20145w.getIsFutureDay() ? whoopColor.getWhite50() : whoopColor.getBrandWhite();
            }
            if (i13 != 3) {
                return i13 != 4 ? whoopColor.getWhite30() : whoopColor.getBrandWhite();
            }
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15442a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f20147w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f20148x;

        public i(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f20147w = c22325e;
            this.f20148x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15443a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f20148x, this.f20147w.getIsFutureDay() ? whoopColor.getSurfaceMciMenstrualDim() : whoopColor.getSurfaceMciMenstrual());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15443a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f20149w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f20150x;

        public j(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f20149w = c22325e;
            this.f20150x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15444a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f20150x, this.f20149w.getIsFutureDay() ? whoopColor.getSurfaceMciFollicularDim() : whoopColor.getSurfaceMciFollicular());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15444a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f20151w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f20152x;

        public k(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f20151w = c22325e;
            this.f20152x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15445a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f20152x, this.f20151w.getIsFutureDay() ? whoopColor.getSurfaceMciOvulatoryDim() : whoopColor.getSurfaceMciOvulatory());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15445a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f20153w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f20154x;

        public l(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f20153w = c22325e;
            this.f20154x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15446a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f20154x, this.f20153w.getIsFutureDay() ? whoopColor.getSurfaceMciLutealDim() : whoopColor.getSurfaceMciLuteal());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15446a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f20155w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f20156x;

        public m(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f20155w = c22325e;
            this.f20156x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15447a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f20156x, this.f20155w.getIsFutureDay() ? whoopColor.getSurfaceMciBirthControlDim() : whoopColor.getSurfaceMciBirthControl());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15447a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f20157w = new n();

        /* JADX INFO: renamed from: a */
        public final long m15448a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15448a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f20158w = new o();

        /* JADX INFO: renamed from: a */
        public final long m15449a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciFollicular();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15449a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f20159w = new p();

        /* JADX INFO: renamed from: a */
        public final long m15450a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciBirthControl();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15450a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f20160w = new q();

        /* JADX INFO: renamed from: a */
        public final long m15451a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciLuteal();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15451a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f20161w = new r();

        /* JADX INFO: renamed from: a */
        public final long m15452a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciMenstrual();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15452a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f20162w = new s();

        /* JADX INFO: renamed from: a */
        public final long m15453a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciOvulatory();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15453a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f20163w = new t();

        /* JADX INFO: renamed from: a */
        public final long m15454a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15454a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f20164w = new u();

        /* JADX INFO: renamed from: a */
        public final long m15455a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15455a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f20165w = new v();

        /* JADX INFO: renamed from: a */
        public final long m15456a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15456a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f20166w = new w();

        /* JADX INFO: renamed from: a */
        public final long m15457a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15457a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f20167w = new x();

        /* JADX INFO: renamed from: a */
        public final long m15458a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15458a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cn0.a$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f20168w = new y();

        /* JADX INFO: renamed from: a */
        public final long m15459a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15459a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC39332e m15422a(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        if (!dateArgs.getIsFutureDay()) {
            CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
            if ((calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getDayState() : null) == CalendarDayState.PERIOD) {
                return p745y81.Function1.m125323a(c.f20140w);
            }
        }
        if ((!dateArgs.getIsSelectedDay() && !dateArgs.getIsCurrentDay()) || (calendarDateModelM64155g = dateArgs.m64155g()) == null || (dayState = calendarDateModelM64155g.getDayState()) == null || m15426e(dayState)) {
            return null;
        }
        return p745y81.Function1.m125323a(d.f20141w);
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC39332e m15423b(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        CalendarDateModel calendarDateModelM64155g2;
        CalendarDayState dayState2;
        CalendarDateModel calendarDateModelM64155g3 = dateArgs.m64155g();
        if ((calendarDateModelM64155g3 != null ? calendarDateModelM64155g3.getDayState() : null) == CalendarDayState.PREDICTED_PERIOD) {
            return p745y81.Function1.m125323a(e.f20142w);
        }
        if (dateArgs.getIsCurrentDay() && (calendarDateModelM64155g2 = dateArgs.m64155g()) != null && (dayState2 = calendarDateModelM64155g2.getDayState()) != null && !m15426e(dayState2)) {
            return p745y81.Function1.m125323a(f.f20143w);
        }
        if (!dateArgs.getIsSelectedDay() || (calendarDateModelM64155g = dateArgs.m64155g()) == null || (dayState = calendarDateModelM64155g.getDayState()) == null || m15426e(dayState)) {
            return null;
        }
        return p745y81.Function1.m125323a(g.f20144w);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC39332e m15424c(C22325e<CalendarDateModel> dateArgs) {
        CalendarPhase phase;
        InterfaceC39332e interfaceC39332eM15429h;
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        return (calendarDateModelM64155g == null || (phase = calendarDateModelM64155g.getPhase()) == null || (interfaceC39332eM15429h = m15429h(phase, dateArgs.getIsFutureDay())) == null) ? m15425d(dateArgs) : interfaceC39332eM15429h;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC39332e m15425d(C22325e<CalendarDateModel> dateArgs) {
        return p745y81.Function1.m125323a(new h(dateArgs));
    }

    /* JADX INFO: renamed from: e */
    private final boolean m15426e(CalendarDayState calendarDayState) {
        return AbstractC22327g.m64207a().contains(calendarDayState);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC39332e m15427f(C22325e<CalendarDateModel> dateArgs) {
        float f13;
        if (dateArgs.getIsFutureDay()) {
            f13 = 0.15f;
        } else {
            CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
            f13 = (calendarDateModelM64155g != null ? calendarDateModelM64155g.getPhase() : null) == CalendarPhase.MENSTRUAL ? 0.8f : 1.0f;
        }
        CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
        CalendarPhase phase = calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getPhase() : null;
        switch (phase == null ? -1 : b.f20138a[phase.ordinal()]) {
            case -1:
            case 6:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return p745y81.Function1.m125323a(new j(dateArgs, f13));
            case 2:
                return p745y81.Function1.m125323a(new m(dateArgs, f13));
            case 3:
                return p745y81.Function1.m125323a(new l(dateArgs, f13));
            case 4:
                return p745y81.Function1.m125323a(new i(dateArgs, f13));
            case 5:
                return p745y81.Function1.m125323a(new k(dateArgs, f13));
        }
    }

    /* JADX INFO: renamed from: g */
    private final EnumC30774g m15428g(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if (calendarDateModelM64155g != null ? AbstractC22676k.m65745e(calendarDateModelM64155g.getFirstDayOfPhase(), Boolean.TRUE) : false) {
            CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
            if (calendarDateModelM64155g2 != null ? AbstractC22676k.m65745e(calendarDateModelM64155g2.getLastDayOfPhase(), Boolean.TRUE) : false) {
                return EnumC30774g.ALL;
            }
        }
        CalendarDateModel calendarDateModelM64155g3 = dateArgs.m64155g();
        if (calendarDateModelM64155g3 != null ? AbstractC22676k.m65745e(calendarDateModelM64155g3.getFirstDayOfPhase(), Boolean.TRUE) : false) {
            return EnumC30774g.LEFT;
        }
        CalendarDateModel calendarDateModelM64155g4 = dateArgs.m64155g();
        return calendarDateModelM64155g4 != null ? AbstractC22676k.m65745e(calendarDateModelM64155g4.getLastDayOfPhase(), Boolean.TRUE) : false ? EnumC30774g.RIGHT : EnumC30774g.NONE;
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC39332e m15429h(CalendarPhase phase, boolean isFutureDay) {
        if (!isFutureDay && phase != CalendarPhase.NONE) {
            return p745y81.Function1.m125323a(n.f20157w);
        }
        switch (b.f20138a[phase.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(o.f20158w);
            case 2:
                return p745y81.Function1.m125323a(p.f20159w);
            case 3:
                return p745y81.Function1.m125323a(q.f20160w);
            case 4:
                return p745y81.Function1.m125323a(r.f20161w);
            case 5:
                return p745y81.Function1.m125323a(s.f20162w);
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: j */
    private final boolean m15430j(C22325e<CalendarDateModel> dateArgs) {
        if (!dateArgs.getIsFutureDay()) {
            return false;
        }
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        return (calendarDateModelM64155g != null ? calendarDateModelM64155g.getDayState() : null) == CalendarDayState.PREDICTED_PERIOD;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m15431k(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        return dateArgs.getIsSelectedDay() && (calendarDateModelM64155g = dateArgs.m64155g()) != null && (dayState = calendarDateModelM64155g.getDayState()) != null && m15426e(dayState);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC39332e m15432l(C22325e<CalendarDateModel> dateArgs) {
        CalendarDayState dayState;
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if (calendarDateModelM64155g != null && (dayState = calendarDateModelM64155g.getDayState()) != null) {
            CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
            if ((calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getBottomState() : null) == CalendarDayBottomState.PREDICTED_SYMPTOM) {
                return dateArgs.getIsFutureDay() ? p745y81.Function1.m125323a(t.f20163w) : p745y81.Function1.m125323a(u.f20164w);
            }
            if (m15426e(dayState)) {
                return p745y81.Function1.m125323a(v.f20165w);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC39332e m15433m(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        CalendarDayBottomState bottomState = calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null;
        int i13 = bottomState == null ? -1 : b.f20139b[bottomState.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(w.f20166w);
        }
        if (i13 != 2) {
            return null;
        }
        return p745y81.Function1.m125323a(x.f20167w);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC39332e m15434n(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if ((calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null) == CalendarDayBottomState.PREDICTED_SYMPTOM) {
            return p745y81.Function1.m125323a(y.f20168w);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private final Float m15435o(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if ((calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null) != CalendarDayBottomState.PREDICTED_SYMPTOM || dateArgs.getIsSelectedDay()) {
            return null;
        }
        return Float.valueOf(1.0f);
    }

    /* JADX INFO: renamed from: i */
    public final C12209i m15436i(C22325e<CalendarDateModel> dateArgs, GenericInteraction interaction) {
        Object obj;
        CalendarDayState dayState;
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dateArgs.getDayTitle());
        Object obj2 = interaction == null ? C23454a0.f92919a : interaction;
        LocalDate localDate = dateArgs.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        if (interaction == null) {
            localDate = null;
        }
        LocalDate localDate2 = localDate;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dateArgs.getContentDescription());
        InterfaceC39332e interfaceC39332eM15424c = m15424c(dateArgs);
        InterfaceC39332e interfaceC39332eM15427f = m15427f(dateArgs);
        EnumC30774g enumC30774gM15428g = m15428g(dateArgs);
        InterfaceC39332e interfaceC39332eM15422a = m15422a(dateArgs);
        InterfaceC39332e interfaceC39332eM15423b = m15423b(dateArgs);
        float f13 = 2;
        boolean zM15430j = m15430j(dateArgs);
        boolean zM15431k = m15431k(dateArgs);
        InterfaceC39332e interfaceC39332eM15433m = m15433m(dateArgs);
        InterfaceC39332e interfaceC39332eM15434n = m15434n(dateArgs);
        InterfaceC39332e interfaceC39332eM15432l = m15432l(dateArgs);
        Float fM15435o = m15435o(dateArgs);
        float f14 = 8 * 4;
        boolean z4 = true;
        if (dateArgs.getIsFutureDay()) {
            CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
            if (calendarDateModelM64155g == null || (dayState = calendarDateModelM64155g.getDayState()) == null) {
                obj = obj2;
            } else {
                obj = obj2;
                if (!m15426e(dayState)) {
                }
            }
            z4 = false;
        } else {
            obj = obj2;
        }
        return new C12209i(obj, localDate2, textResourceM21278l, interfaceC39332eM15424c, textResourceM21278l2, interfaceC39332eM15427f, enumC30774gM15428g, interfaceC39332eM15422a, interfaceC39332eM15423b, f13, zM15430j, zM15431k, interfaceC39332eM15433m, interfaceC39332eM15434n, interfaceC39332eM15432l, fM15435o, f14, z4, null);
    }
}
