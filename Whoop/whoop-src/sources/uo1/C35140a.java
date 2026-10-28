package uo1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayBottomState;
import com.whoop.design.models.calendar.CalendarDayState;
import com.whoop.design.models.calendar.CalendarPhase;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import do1.C12234a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kb1.AbstractC22327g;
import kb1.C22325e;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qy0.EnumC30774g;
import xo1.C38494c;

/* JADX INFO: renamed from: uo1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\nJ#\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ!\u0010\u0014\u001a\u00020\u00132\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\nJ#\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0018\u001a\u00020\r2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\r2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J#\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\nJ#\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\nJ#\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\nJ#\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\r*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020$2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(¨\u0006*"}, m65681d2 = {"Luo1/a;", "", "<init>", "()V", "Lkb1/e;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;", "dateArgs", "Ly81/e;", "c", "(Lkb1/e;)Ly81/e;", "Lcom/whoop/design/models/calendar/CalendarPhase;", "phase", "", "isFutureDay", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/calendar/CalendarPhase;Z)Ly81/e;", "d", "f", "Lqy0/g;", "g", "(Lkb1/e;)Lqy0/g;", "a", "b", "j", "(Lkb1/e;)Z", "k", "m", "n", "l", "", "o", "(Lkb1/e;)Ljava/lang/Float;", "Lcom/whoop/design/models/calendar/CalendarDayState;", "e", "(Lcom/whoop/design/models/calendar/CalendarDayState;)Z", "Lxo1/c;", "i", "(Lkb1/e;)Lxo1/c;", "Ldo1/a;", "Ldo1/a;", "fertilityCalendarDateReducer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35140a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12234a fertilityCalendarDateReducer = new C12234a();

    /* JADX INFO: renamed from: uo1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f149094a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f149095b;

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
            f149094a = iArr;
            int[] iArr2 = new int[CalendarDayBottomState.values().length];
            try {
                iArr2[CalendarDayBottomState.SYMPTOMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CalendarDayBottomState.PREDICTED_SYMPTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f149095b = iArr2;
        }
    }

    /* JADX INFO: renamed from: uo1.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f149096w = new c();

        /* JADX INFO: renamed from: a */
        public final long m111117a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getMciRed();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111117a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f149097w = new d();

        /* JADX INFO: renamed from: a */
        public final long m111118a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111118a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f149098w = new e();

        /* JADX INFO: renamed from: a */
        public final long m111119a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getMciRed();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111119a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f149099w = new f();

        /* JADX INFO: renamed from: a */
        public final long m111120a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111120a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f149100w = new g();

        /* JADX INFO: renamed from: a */
        public final long m111121a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111121a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f149101w;

        /* JADX INFO: renamed from: uo1.a$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f149102a;

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
                try {
                    iArr[CalendarDayState.NO_DATA.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CalendarDayState.LOW_RECOVERY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CalendarDayState.MEDIUM_RECOVERY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CalendarDayState.HIGH_RECOVERY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[CalendarDayState.LOW_SLEEP.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[CalendarDayState.HIGH_SLEEP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[CalendarDayState.LOW_STRAIN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[CalendarDayState.HIGH_STRAIN.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[CalendarDayState.LOW_STRESS.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[CalendarDayState.MEDIUM_STRESS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[CalendarDayState.HIGH_STRESS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[CalendarDayState.HAS_JOURNAL_ENTRY.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[CalendarDayState.OVULATION.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                f149102a = iArr;
            }
        }

        public h(C22325e<CalendarDateModel> c22325e) {
            this.f149101w = c22325e;
        }

        /* JADX INFO: renamed from: a */
        public final long m111122a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            CalendarDateModel calendarDateModelM64155g = this.f149101w.m64155g();
            CalendarDayState dayState = calendarDateModelM64155g != null ? calendarDateModelM64155g.getDayState() : null;
            switch (dayState == null ? -1 : a.f149102a[dayState.ordinal()]) {
                case -1:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    return whoopColor.getWhite30();
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                    return this.f149101w.getIsFutureDay() ? whoopColor.getWhite50() : whoopColor.getBrandWhite();
                case 3:
                    return whoopColor.getWhite50();
                case 4:
                    return whoopColor.getBrandWhite();
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111122a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f149103w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f149104x;

        public i(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f149103w = c22325e;
            this.f149104x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m111123a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f149104x, this.f149103w.getIsFutureDay() ? whoopColor.getSurfaceMciMenstrualDim() : whoopColor.getSurfaceMciMenstrual());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111123a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f149105w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f149106x;

        public j(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f149105w = c22325e;
            this.f149106x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m111124a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f149106x, this.f149105w.getIsFutureDay() ? whoopColor.getSurfaceMciFollicularDim() : whoopColor.getSurfaceMciFollicular());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111124a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f149107w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f149108x;

        public k(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f149107w = c22325e;
            this.f149108x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m111125a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f149108x, this.f149107w.getIsFutureDay() ? whoopColor.getSurfaceMciOvulatoryDim() : whoopColor.getSurfaceMciOvulatory());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111125a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f149109w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f149110x;

        public l(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f149109w = c22325e;
            this.f149110x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m111126a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f149110x, this.f149109w.getIsFutureDay() ? whoopColor.getSurfaceMciLutealDim() : whoopColor.getSurfaceMciLuteal());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111126a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f149111w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f149112x;

        public m(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f149111w = c22325e;
            this.f149112x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m111127a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f149112x, this.f149111w.getIsFutureDay() ? whoopColor.getSurfaceMciBirthControlDim() : whoopColor.getSurfaceMciBirthControl());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111127a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f149113w = new n();

        /* JADX INFO: renamed from: a */
        public final long m111128a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111128a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f149114w = new o();

        /* JADX INFO: renamed from: a */
        public final long m111129a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciFollicular();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111129a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f149115w = new p();

        /* JADX INFO: renamed from: a */
        public final long m111130a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciBirthControl();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111130a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f149116w = new q();

        /* JADX INFO: renamed from: a */
        public final long m111131a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciLuteal();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111131a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f149117w = new r();

        /* JADX INFO: renamed from: a */
        public final long m111132a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciMenstrual();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111132a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f149118w = new s();

        /* JADX INFO: renamed from: a */
        public final long m111133a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciOvulatory();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111133a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f149119w = new t();

        /* JADX INFO: renamed from: a */
        public final long m111134a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111134a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f149120w = new u();

        /* JADX INFO: renamed from: a */
        public final long m111135a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111135a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f149121w = new v();

        /* JADX INFO: renamed from: a */
        public final long m111136a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111136a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f149122w = new w();

        /* JADX INFO: renamed from: a */
        public final long m111137a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111137a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f149123w = new x();

        /* JADX INFO: renamed from: a */
        public final long m111138a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111138a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uo1.a$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f149124w = new y();

        /* JADX INFO: renamed from: a */
        public final long m111139a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111139a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC39332e m111102a(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        if (!dateArgs.getIsFutureDay()) {
            CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
            if ((calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getDayState() : null) == CalendarDayState.PERIOD) {
                return p745y81.Function1.m125323a(c.f149096w);
            }
        }
        if ((!dateArgs.getIsSelectedDay() && !dateArgs.getIsCurrentDay()) || (calendarDateModelM64155g = dateArgs.m64155g()) == null || (dayState = calendarDateModelM64155g.getDayState()) == null || m111106e(dayState)) {
            return null;
        }
        return p745y81.Function1.m125323a(d.f149097w);
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC39332e m111103b(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        CalendarDateModel calendarDateModelM64155g2;
        CalendarDayState dayState2;
        CalendarDateModel calendarDateModelM64155g3 = dateArgs.m64155g();
        if ((calendarDateModelM64155g3 != null ? calendarDateModelM64155g3.getDayState() : null) == CalendarDayState.PREDICTED_PERIOD) {
            return p745y81.Function1.m125323a(e.f149098w);
        }
        if (dateArgs.getIsCurrentDay() && (calendarDateModelM64155g2 = dateArgs.m64155g()) != null && (dayState2 = calendarDateModelM64155g2.getDayState()) != null && !m111106e(dayState2)) {
            return p745y81.Function1.m125323a(f.f149099w);
        }
        if (!dateArgs.getIsSelectedDay() || (calendarDateModelM64155g = dateArgs.m64155g()) == null || (dayState = calendarDateModelM64155g.getDayState()) == null || m111106e(dayState)) {
            return null;
        }
        return p745y81.Function1.m125323a(g.f149100w);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC39332e m111104c(C22325e<CalendarDateModel> dateArgs) {
        CalendarPhase phase;
        InterfaceC39332e interfaceC39332eM111109h;
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        return (calendarDateModelM64155g == null || (phase = calendarDateModelM64155g.getPhase()) == null || (interfaceC39332eM111109h = m111109h(phase, dateArgs.getIsFutureDay())) == null) ? m111105d(dateArgs) : interfaceC39332eM111109h;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC39332e m111105d(C22325e<CalendarDateModel> dateArgs) {
        return p745y81.Function1.m125323a(new h(dateArgs));
    }

    /* JADX INFO: renamed from: e */
    private final boolean m111106e(CalendarDayState calendarDayState) {
        return AbstractC22327g.m64207a().contains(calendarDayState);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC39332e m111107f(C22325e<CalendarDateModel> dateArgs) {
        float f13;
        if (dateArgs.getIsFutureDay()) {
            f13 = 0.15f;
        } else {
            CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
            f13 = (calendarDateModelM64155g != null ? calendarDateModelM64155g.getPhase() : null) == CalendarPhase.MENSTRUAL ? 0.8f : 1.0f;
        }
        CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
        CalendarPhase phase = calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getPhase() : null;
        switch (phase == null ? -1 : b.f149094a[phase.ordinal()]) {
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
    private final EnumC30774g m111108g(C22325e<CalendarDateModel> dateArgs) {
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
    private final InterfaceC39332e m111109h(CalendarPhase phase, boolean isFutureDay) {
        if (!isFutureDay && phase != CalendarPhase.NONE) {
            return p745y81.Function1.m125323a(n.f149113w);
        }
        switch (b.f149094a[phase.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(o.f149114w);
            case 2:
                return p745y81.Function1.m125323a(p.f149115w);
            case 3:
                return p745y81.Function1.m125323a(q.f149116w);
            case 4:
                return p745y81.Function1.m125323a(r.f149117w);
            case 5:
                return p745y81.Function1.m125323a(s.f149118w);
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: j */
    private final boolean m111110j(C22325e<CalendarDateModel> dateArgs) {
        if (!dateArgs.getIsFutureDay()) {
            return false;
        }
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        return (calendarDateModelM64155g != null ? calendarDateModelM64155g.getDayState() : null) == CalendarDayState.PREDICTED_PERIOD;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m111111k(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        return dateArgs.getIsSelectedDay() && (calendarDateModelM64155g = dateArgs.m64155g()) != null && (dayState = calendarDateModelM64155g.getDayState()) != null && m111106e(dayState);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC39332e m111112l(C22325e<CalendarDateModel> dateArgs) {
        CalendarDayState dayState;
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if (calendarDateModelM64155g != null && (dayState = calendarDateModelM64155g.getDayState()) != null) {
            CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
            if ((calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getBottomState() : null) == CalendarDayBottomState.PREDICTED_SYMPTOM) {
                return dateArgs.getIsFutureDay() ? p745y81.Function1.m125323a(t.f149119w) : p745y81.Function1.m125323a(u.f149120w);
            }
            if (m111106e(dayState)) {
                return p745y81.Function1.m125323a(v.f149121w);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC39332e m111113m(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        CalendarDayBottomState bottomState = calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null;
        int i13 = bottomState == null ? -1 : b.f149095b[bottomState.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(w.f149122w);
        }
        if (i13 != 2) {
            return null;
        }
        return p745y81.Function1.m125323a(x.f149123w);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC39332e m111114n(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if ((calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null) == CalendarDayBottomState.PREDICTED_SYMPTOM) {
            return p745y81.Function1.m125323a(y.f149124w);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private final Float m111115o(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if ((calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null) != CalendarDayBottomState.PREDICTED_SYMPTOM || dateArgs.getIsSelectedDay()) {
            return null;
        }
        return Float.valueOf(1.0f);
    }

    /* JADX INFO: renamed from: i */
    public final C38494c m111116i(C22325e<CalendarDateModel> dateArgs) {
        TextResource textResource;
        boolean z4;
        boolean z13;
        CalendarDayState dayState;
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dateArgs.getDayTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dateArgs.getContentDescription());
        InterfaceC39332e interfaceC39332eM111104c = m111104c(dateArgs);
        InterfaceC39332e interfaceC39332eM111107f = m111107f(dateArgs);
        EnumC30774g enumC30774gM111108g = m111108g(dateArgs);
        InterfaceC39332e interfaceC39332eM111102a = m111102a(dateArgs);
        InterfaceC39332e interfaceC39332eM111103b = m111103b(dateArgs);
        float f13 = 2;
        boolean zM111110j = m111110j(dateArgs);
        boolean zM111111k = m111111k(dateArgs);
        InterfaceC39332e interfaceC39332eM111113m = m111113m(dateArgs);
        InterfaceC39332e interfaceC39332eM111114n = m111114n(dateArgs);
        InterfaceC39332e interfaceC39332eM111112l = m111112l(dateArgs);
        Float fM111115o = m111115o(dateArgs);
        float f14 = 8 * 4;
        if (dateArgs.getIsFutureDay()) {
            CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
            if (calendarDateModelM64155g != null && (dayState = calendarDateModelM64155g.getDayState()) != null) {
                textResource = textResourceM21278l;
                z4 = true;
                if (m111106e(dayState)) {
                }
                return new C38494c(dateArgs, textResource, interfaceC39332eM111104c, textResourceM21278l2, interfaceC39332eM111107f, enumC30774gM111108g, interfaceC39332eM111102a, interfaceC39332eM111103b, f13, zM111110j, zM111111k, interfaceC39332eM111113m, interfaceC39332eM111114n, interfaceC39332eM111112l, fM111115o, f14, z13, this.fertilityCalendarDateReducer.m34025a(dateArgs), null);
            }
            textResource = textResourceM21278l;
            z13 = false;
            return new C38494c(dateArgs, textResource, interfaceC39332eM111104c, textResourceM21278l2, interfaceC39332eM111107f, enumC30774gM111108g, interfaceC39332eM111102a, interfaceC39332eM111103b, f13, zM111110j, zM111111k, interfaceC39332eM111113m, interfaceC39332eM111114n, interfaceC39332eM111112l, fM111115o, f14, z13, this.fertilityCalendarDateReducer.m34025a(dateArgs), null);
        }
        textResource = textResourceM21278l;
        z4 = true;
        z13 = z4;
        return new C38494c(dateArgs, textResource, interfaceC39332eM111104c, textResourceM21278l2, interfaceC39332eM111107f, enumC30774gM111108g, interfaceC39332eM111102a, interfaceC39332eM111103b, f13, zM111110j, zM111111k, interfaceC39332eM111113m, interfaceC39332eM111114n, interfaceC39332eM111112l, fM111115o, f14, z13, this.fertilityCalendarDateReducer.m34025a(dateArgs), null);
    }
}
