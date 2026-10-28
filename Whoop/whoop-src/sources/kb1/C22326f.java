package kb1;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayBottomState;
import com.whoop.design.models.calendar.CalendarDayState;
import com.whoop.design.models.calendar.CalendarPhase;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qy0.C30775h;
import qy0.EnumC30774g;

/* JADX INFO: renamed from: kb1.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J#\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J#\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J!\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00022\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00022\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b \u0010\u001fJ!\u0010!\u001a\u00020\u00022\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b!\u0010\u001fJ#\u0010#\u001a\u0004\u0018\u00010\"2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\u0002*\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b\u0003\u0010,¨\u0006-"}, m65681d2 = {"Lkb1/f;", "", "", "isMCICalendarColorsOn", "<init>", "(Z)V", "Lcom/whoop/design/models/calendar/CalendarPhase;", "phase", "isFutureDay", "Ly81/e;", "l", "(Lcom/whoop/design/models/calendar/CalendarPhase;Z)Ly81/e;", "Lkb1/e;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;", "dateArgs", "e", "(Lkb1/e;)Ly81/e;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "a", "Lqy0/g;", "p", "(Lkb1/e;)Lqy0/g;", "b", "c", "Ly3/f;", "d", "(Lkb1/e;)F", "n", "(Lkb1/e;)Z", "o", "j", "", "i", "(Lkb1/e;)Ljava/lang/Float;", "Lcom/whoop/design/models/calendar/CalendarDayState;", "k", "(Lcom/whoop/design/models/calendar/CalendarDayState;)Z", "Lqy0/h;", "m", "(Lkb1/e;)Lqy0/h;", "Z", "()Z", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22326f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isMCICalendarColorsOn;

    /* JADX INFO: renamed from: kb1.f$a0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a0 f87123w = new a0();

        /* JADX INFO: renamed from: a */
        public final long m64176a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64176a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87124a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f87125b;

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
            f87124a = iArr;
            int[] iArr2 = new int[CalendarDayState.values().length];
            try {
                iArr2[CalendarDayState.HIGH_SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CalendarDayState.HIGH_STRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CalendarDayState.HAS_JOURNAL_ENTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CalendarDayState.LOW_RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CalendarDayState.MEDIUM_RECOVERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CalendarDayState.HIGH_RECOVERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CalendarDayState.LOW_SLEEP.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CalendarDayState.LOW_STRAIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CalendarDayState.LOW_STRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CalendarDayState.MEDIUM_STRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CalendarDayState.HIGH_STRESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CalendarDayState.NO_DATA.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CalendarDayState.PERIOD.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CalendarDayState.PREDICTED_PERIOD.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[CalendarDayState.NONE.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[CalendarDayState.WHITE_NO_BACKGROUND.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            f87125b = iArr2;
        }
    }

    /* JADX INFO: renamed from: kb1.f$b0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f87126w = new b0();

        /* JADX INFO: renamed from: a */
        public final long m64177a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64177a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f87127w;

        public c(float f13) {
            this.f87127w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64178a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87127w, whoopColor.getSurfaceMciMenstrual());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64178a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$c0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c0 f87128w = new c0();

        /* JADX INFO: renamed from: a */
        public final long m64179a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciFollicular();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64179a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f87129w;

        public d(float f13) {
            this.f87129w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64180a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87129w, whoopColor.getSurfaceMciFollicular());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64180a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$d0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d0 f87130w = new d0();

        /* JADX INFO: renamed from: a */
        public final long m64181a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciBirthControl();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64181a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f87131w;

        public e(float f13) {
            this.f87131w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64182a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87131w, whoopColor.getSurfaceMciOvulatory());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64182a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$e0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e0 f87132w = new e0();

        /* JADX INFO: renamed from: a */
        public final long m64183a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciLuteal();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64183a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f87133w;

        public f(float f13) {
            this.f87133w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64184a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87133w, whoopColor.getSurfaceMciLuteal());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64184a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$f0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f0 f87134w = new f0();

        /* JADX INFO: renamed from: a */
        public final long m64185a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciMenstrual();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64185a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f87135w;

        public g(float f13) {
            this.f87135w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64186a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87135w, whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64186a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$g0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g0 f87136w = new g0();

        /* JADX INFO: renamed from: a */
        public final long m64187a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciOvulatory();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64187a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f87137w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f87138x;

        public h(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f87137w = c22325e;
            this.f87138x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64188a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87138x, this.f87137w.getIsFutureDay() ? whoopColor.getSurfaceMciMenstrualDim() : whoopColor.getSurfaceMciMenstrual());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64188a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f87139w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f87140x;

        public i(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f87139w = c22325e;
            this.f87140x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64189a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87140x, this.f87139w.getIsFutureDay() ? whoopColor.getSurfaceMciFollicularDim() : whoopColor.getSurfaceMciFollicular());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64189a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f87141w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f87142x;

        public j(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f87141w = c22325e;
            this.f87142x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64190a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87142x, this.f87141w.getIsFutureDay() ? whoopColor.getSurfaceMciOvulatoryDim() : whoopColor.getSurfaceMciOvulatory());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64190a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f87143w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f87144x;

        public k(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f87143w = c22325e;
            this.f87144x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64191a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87144x, this.f87143w.getIsFutureDay() ? whoopColor.getSurfaceMciLutealDim() : whoopColor.getSurfaceMciLuteal());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64191a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f87145w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f87146x;

        public l(C22325e<CalendarDateModel> c22325e, float f13) {
            this.f87145w = c22325e;
            this.f87146x = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m64192a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f87146x, this.f87145w.getIsFutureDay() ? whoopColor.getSurfaceMciBirthControlDim() : whoopColor.getSurfaceMciBirthControl());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64192a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f87147w = new m();

        /* JADX INFO: renamed from: a */
        public final long m64193a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getMciRed();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64193a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f87148w = new n();

        /* JADX INFO: renamed from: a */
        public final long m64194a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64194a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f87149w = new o();

        /* JADX INFO: renamed from: a */
        public final long m64195a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getMciRed();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64195a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f87150w = new p();

        /* JADX INFO: renamed from: a */
        public final long m64196a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64196a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f87151w = new q();

        /* JADX INFO: renamed from: a */
        public final long m64197a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64197a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22325e<CalendarDateModel> f87152w;

        /* JADX INFO: renamed from: kb1.f$r$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f87153a;

            static {
                int[] iArr = new int[CalendarDayState.values().length];
                try {
                    iArr[CalendarDayState.LOW_RECOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CalendarDayState.MEDIUM_RECOVERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CalendarDayState.HIGH_RECOVERY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CalendarDayState.LOW_SLEEP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CalendarDayState.HIGH_SLEEP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CalendarDayState.LOW_STRAIN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CalendarDayState.HIGH_STRAIN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CalendarDayState.LOW_STRESS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[CalendarDayState.MEDIUM_STRESS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[CalendarDayState.HIGH_STRESS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[CalendarDayState.HAS_JOURNAL_ENTRY.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[CalendarDayState.NONE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[CalendarDayState.NO_DATA.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[CalendarDayState.PERIOD.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[CalendarDayState.PREDICTED_PERIOD.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[CalendarDayState.WHITE_NO_BACKGROUND.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                f87153a = iArr;
            }
        }

        public r(C22325e<CalendarDateModel> c22325e) {
            this.f87152w = c22325e;
        }

        /* JADX INFO: renamed from: a */
        public final long m64198a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            CalendarDateModel calendarDateModelM64155g = this.f87152w.m64155g();
            CalendarDayState dayState = calendarDateModelM64155g != null ? calendarDateModelM64155g.getDayState() : null;
            switch (dayState == null ? -1 : a.f87153a[dayState.ordinal()]) {
                case 1:
                    return whoopColor.getRecoveryLowRecovery();
                case 2:
                    return whoopColor.getRecoveryMediumRecovery();
                case 3:
                    return whoopColor.getRecoveryHighRecovery();
                case 4:
                case 5:
                    return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
                case 6:
                    return C17919x.m51541c(0.8f, whoopColor.getStrain());
                case 7:
                    return whoopColor.getStrain();
                case 8:
                    return whoopColor.getRecovery();
                case 9:
                    return whoopColor.getAccentPositiveTrend();
                case 10:
                    return whoopColor.getAccentNegativeTrend();
                case 11:
                    return whoopColor.getAccentPositiveTrend();
                case 12:
                    return whoopColor.getWhite50();
                case 13:
                    return this.f87152w.getIsFutureDay() ? whoopColor.getWhite30() : whoopColor.getWhite50();
                case 14:
                case 15:
                    return this.f87152w.getIsFutureDay() ? whoopColor.getWhite50() : whoopColor.getBrandWhite();
                case 16:
                    return whoopColor.getBrandWhite();
                default:
                    return whoopColor.getWhite30();
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64198a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f87154w = new s();

        /* JADX INFO: renamed from: a */
        public final long m64199a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64199a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f87155w = new t();

        /* JADX INFO: renamed from: a */
        public final long m64200a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64200a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f87156w = new u();

        /* JADX INFO: renamed from: a */
        public final long m64201a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64201a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f87157w = new v();

        /* JADX INFO: renamed from: a */
        public final long m64202a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64202a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f87158w = new w();

        /* JADX INFO: renamed from: a */
        public final long m64203a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64203a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f87159w = new x();

        /* JADX INFO: renamed from: a */
        public final long m64204a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64204a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f87160w = new y();

        /* JADX INFO: renamed from: a */
        public final long m64205a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64205a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kb1.f$z */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final z f87161w = new z();

        /* JADX INFO: renamed from: a */
        public final long m64206a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m64206a((C39336i) obj));
        }
    }

    public C22326f(boolean z4) {
        this.isMCICalendarColorsOn = z4;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC39332e m64160a(C22325e<CalendarDateModel> dateArgs) {
        float f13;
        InterfaceC39332e interfaceC39332eM125323a;
        if (this.isMCICalendarColorsOn) {
            if (dateArgs.getIsFutureDay()) {
                f13 = 0.15f;
            } else {
                CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
                f13 = (calendarDateModelM64155g != null ? calendarDateModelM64155g.getPhase() : null) == CalendarPhase.MENSTRUAL ? 0.8f : 1.0f;
            }
            CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
            CalendarPhase phase = calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getPhase() : null;
            switch (phase == null ? -1 : b.f87124a[phase.ordinal()]) {
                case -1:
                case 6:
                    interfaceC39332eM125323a = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    interfaceC39332eM125323a = p745y81.Function1.m125323a(new i(dateArgs, f13));
                    break;
                case 2:
                    interfaceC39332eM125323a = p745y81.Function1.m125323a(new l(dateArgs, f13));
                    break;
                case 3:
                    interfaceC39332eM125323a = p745y81.Function1.m125323a(new k(dateArgs, f13));
                    break;
                case 4:
                    interfaceC39332eM125323a = p745y81.Function1.m125323a(new h(dateArgs, f13));
                    break;
                case 5:
                    interfaceC39332eM125323a = p745y81.Function1.m125323a(new j(dateArgs, f13));
                    break;
            }
            if (interfaceC39332eM125323a != null) {
                return interfaceC39332eM125323a;
            }
        }
        float f14 = dateArgs.getIsFutureDay() ? 0.3f : 0.7f;
        CalendarDateModel calendarDateModelM64155g3 = dateArgs.m64155g();
        CalendarPhase phase2 = calendarDateModelM64155g3 != null ? calendarDateModelM64155g3.getPhase() : null;
        int i13 = phase2 != null ? b.f87124a[phase2.ordinal()] : -1;
        if (i13 == 1) {
            return p745y81.Function1.m125323a(new d(f14));
        }
        if (i13 == 2) {
            return p745y81.Function1.m125323a(new g(f14));
        }
        if (i13 == 3) {
            return p745y81.Function1.m125323a(new f(f14));
        }
        if (i13 == 4) {
            return p745y81.Function1.m125323a(new c(f14));
        }
        if (i13 != 5) {
            return null;
        }
        return p745y81.Function1.m125323a(new e(f14));
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC39332e m64161b(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        if (!dateArgs.getIsFutureDay()) {
            CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
            if ((calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getDayState() : null) == CalendarDayState.PERIOD) {
                return p745y81.Function1.m125323a(m.f87147w);
            }
        }
        if ((!dateArgs.getIsSelectedDay() && !dateArgs.getIsCurrentDay()) || (calendarDateModelM64155g = dateArgs.m64155g()) == null || (dayState = calendarDateModelM64155g.getDayState()) == null || m64170k(dayState)) {
            return null;
        }
        return p745y81.Function1.m125323a(n.f87148w);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC39332e m64162c(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        CalendarDateModel calendarDateModelM64155g2;
        CalendarDayState dayState2;
        CalendarDateModel calendarDateModelM64155g3 = dateArgs.m64155g();
        if ((calendarDateModelM64155g3 != null ? calendarDateModelM64155g3.getDayState() : null) == CalendarDayState.PREDICTED_PERIOD) {
            return p745y81.Function1.m125323a(o.f87149w);
        }
        if (dateArgs.getIsCurrentDay() && (calendarDateModelM64155g2 = dateArgs.m64155g()) != null && (dayState2 = calendarDateModelM64155g2.getDayState()) != null && !m64170k(dayState2)) {
            return p745y81.Function1.m125323a(p.f87150w);
        }
        if (!dateArgs.getIsSelectedDay() || (calendarDateModelM64155g = dateArgs.m64155g()) == null || (dayState = calendarDateModelM64155g.getDayState()) == null || m64170k(dayState)) {
            return null;
        }
        return p745y81.Function1.m125323a(q.f87151w);
    }

    /* JADX INFO: renamed from: d */
    private final float m64163d(C22325e<CalendarDateModel> dateArgs) {
        CalendarDayState dayState;
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        return (calendarDateModelM64155g == null || (dayState = calendarDateModelM64155g.getDayState()) == null || !m64170k(dayState)) ? (float) 1.5d : 2;
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC39332e m64164e(C22325e<CalendarDateModel> dateArgs) {
        return p745y81.Function1.m125323a(new r(dateArgs));
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC39332e m64165f(C22325e<CalendarDateModel> dateArgs) {
        CalendarDayState dayState;
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if (calendarDateModelM64155g != null && (dayState = calendarDateModelM64155g.getDayState()) != null) {
            if (dateArgs.m64155g().getBottomState() == CalendarDayBottomState.PREDICTED_SYMPTOM) {
                return dateArgs.getIsFutureDay() ? p745y81.Function1.m125323a(s.f87154w) : p745y81.Function1.m125323a(t.f87155w);
            }
            if (m64170k(dayState)) {
                return p745y81.Function1.m125323a(u.f87156w);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC39332e m64166g(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if ((calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null) == CalendarDayBottomState.SYMPTOMS) {
            return p745y81.Function1.m125323a(v.f87157w);
        }
        CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
        if ((calendarDateModelM64155g2 != null ? calendarDateModelM64155g2.getBottomState() : null) == CalendarDayBottomState.PREDICTED_SYMPTOM) {
            return p745y81.Function1.m125323a(w.f87158w);
        }
        CalendarDateModel calendarDateModelM64155g3 = dateArgs.m64155g();
        CalendarDayState dayState = calendarDateModelM64155g3 != null ? calendarDateModelM64155g3.getDayState() : null;
        switch (dayState == null ? -1 : b.f87125b[dayState.ordinal()]) {
            case -1:
            case 4:
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
                return null;
            case 0:
            default:
                return null;
            case 1:
                return p745y81.Function1.m125323a(x.f87159w);
            case 2:
                return p745y81.Function1.m125323a(y.f87160w);
            case 3:
                return p745y81.Function1.m125323a(z.f87161w);
        }
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC39332e m64167h(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if ((calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null) == CalendarDayBottomState.PREDICTED_SYMPTOM) {
            return p745y81.Function1.m125323a(a0.f87123w);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    private final Float m64168i(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if ((calendarDateModelM64155g != null ? calendarDateModelM64155g.getBottomState() : null) != CalendarDayBottomState.PREDICTED_SYMPTOM || dateArgs.getIsSelectedDay()) {
            return null;
        }
        return Float.valueOf(1.0f);
    }

    /* JADX INFO: renamed from: j */
    private final boolean m64169j(C22325e<CalendarDateModel> dateArgs) {
        CalendarDayState dayState;
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        return (calendarDateModelM64155g == null || (dayState = calendarDateModelM64155g.getDayState()) == null || !m64170k(dayState)) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m64170k(CalendarDayState calendarDayState) {
        return AbstractC22327g.m64207a().contains(calendarDayState);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC39332e m64171l(CalendarPhase phase, boolean isFutureDay) {
        if (!this.isMCICalendarColorsOn) {
            return null;
        }
        if (!isFutureDay && phase != CalendarPhase.NONE) {
            return p745y81.Function1.m125323a(b0.f87126w);
        }
        switch (b.f87124a[phase.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(c0.f87128w);
            case 2:
                return p745y81.Function1.m125323a(d0.f87130w);
            case 3:
                return p745y81.Function1.m125323a(e0.f87132w);
            case 4:
                return p745y81.Function1.m125323a(f0.f87134w);
            case 5:
                return p745y81.Function1.m125323a(g0.f87136w);
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: n */
    private final boolean m64172n(C22325e<CalendarDateModel> dateArgs) {
        if (!dateArgs.getIsFutureDay()) {
            return false;
        }
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        return (calendarDateModelM64155g != null ? calendarDateModelM64155g.getDayState() : null) == CalendarDayState.PREDICTED_PERIOD;
    }

    /* JADX INFO: renamed from: o */
    private final boolean m64173o(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        return dateArgs.getIsSelectedDay() && (calendarDateModelM64155g = dateArgs.m64155g()) != null && (dayState = calendarDateModelM64155g.getDayState()) != null && m64170k(dayState);
    }

    /* JADX INFO: renamed from: p */
    private final EnumC30774g m64174p(C22325e<CalendarDateModel> dateArgs) {
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if ((calendarDateModelM64155g != null ? AbstractC22676k.m65745e(calendarDateModelM64155g.getFirstDayOfPhase(), Boolean.TRUE) : false) && AbstractC22676k.m65745e(dateArgs.m64155g().getLastDayOfPhase(), Boolean.TRUE)) {
            return EnumC30774g.ALL;
        }
        CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
        if (calendarDateModelM64155g2 != null ? AbstractC22676k.m65745e(calendarDateModelM64155g2.getFirstDayOfPhase(), Boolean.TRUE) : false) {
            return EnumC30774g.LEFT;
        }
        CalendarDateModel calendarDateModelM64155g3 = dateArgs.m64155g();
        return calendarDateModelM64155g3 != null ? AbstractC22676k.m65745e(calendarDateModelM64155g3.getLastDayOfPhase(), Boolean.TRUE) : false ? EnumC30774g.RIGHT : EnumC30774g.NONE;
    }

    /* JADX INFO: renamed from: m */
    public final C30775h m64175m(C22325e<CalendarDateModel> dateArgs) {
        InterfaceC39332e interfaceC39332eM64164e;
        CalendarDateModel calendarDateModelM64155g;
        CalendarDayState dayState;
        CalendarPhase phase;
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dateArgs.getDayTitle());
        CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
        if (calendarDateModelM64155g2 == null || (phase = calendarDateModelM64155g2.getPhase()) == null || (interfaceC39332eM64164e = m64171l(phase, dateArgs.getIsFutureDay())) == null) {
            interfaceC39332eM64164e = m64164e(dateArgs);
        }
        InterfaceC39332e interfaceC39332e = interfaceC39332eM64164e;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dateArgs.getContentDescription());
        InterfaceC39332e interfaceC39332eM64160a = m64160a(dateArgs);
        EnumC30774g enumC30774gM64174p = m64174p(dateArgs);
        InterfaceC39332e interfaceC39332eM64166g = m64166g(dateArgs);
        InterfaceC39332e interfaceC39332eM64167h = m64167h(dateArgs);
        InterfaceC39332e interfaceC39332eM64165f = m64165f(dateArgs);
        boolean zM64169j = m64169j(dateArgs);
        Float fM64168i = m64168i(dateArgs);
        float fM64163d = m64163d(dateArgs);
        InterfaceC39332e interfaceC39332eM64161b = m64161b(dateArgs);
        InterfaceC39332e interfaceC39332eM64162c = m64162c(dateArgs);
        boolean zM64172n = m64172n(dateArgs);
        boolean zM64173o = m64173o(dateArgs);
        float f13 = 8 * 4;
        boolean z4 = true;
        if (dateArgs.getIsFutureDay() && ((calendarDateModelM64155g = dateArgs.m64155g()) == null || (dayState = calendarDateModelM64155g.getDayState()) == null || !m64170k(dayState))) {
            z4 = false;
        }
        return new C30775h(dateArgs, textResourceM21278l, interfaceC39332e, textResourceM21278l2, interfaceC39332eM64160a, enumC30774gM64174p, interfaceC39332eM64166g, interfaceC39332eM64167h, interfaceC39332eM64165f, zM64169j, fM64168i, interfaceC39332eM64161b, interfaceC39332eM64162c, zM64172n, fM64163d, f13, null, z4, zM64173o, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, null);
    }
}
