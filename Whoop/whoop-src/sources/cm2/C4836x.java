package cm2;

import androidx.health.platform.client.proto.C1533u;
import cj2.C4769a;
import com.whoop.trends.data.model.MetricsTrendKey;
import com.whoop.util.TrendKey;
import gb1.AbstractC15693u;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import or2.EnumC28166h0;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import vl2.EnumC36124q;

/* JADX INFO: renamed from: cm2.x */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lcm2/x;", "", "<init>", "()V", "Lcom/whoop/trends/data/model/MetricsTrendKey;", "metricsTrendKey", "", "value", "", "doesContainTrendPlot", "isCalibrating", "Ly81/e;", "b", "(Lcom/whoop/trends/data/model/MetricsTrendKey;Ljava/lang/Double;ZZ)Ly81/e;", "Lor2/h0;", "graphKey", "i", "(Lor2/h0;Ljava/lang/Double;ZZ)Ly81/e;", "f", "(Ljava/lang/Double;)Ly81/e;", "", "index", "g", "(I)Ly81/e;", "Lvl2/q;", "style", "Li91/a;", "d", "(Lvl2/q;)Li91/a;", "", "color", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Ly81/e;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4836x {

    /* JADX INFO: renamed from: cm2.x$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19919a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f19920b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f19921c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f19922d;

        static {
            int[] iArr = new int[MetricsTrendKey.values().length];
            try {
                iArr[MetricsTrendKey.AVERAGE_HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetricsTrendKey.CALORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MetricsTrendKey.DAY_STRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MetricsTrendKey.STEPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MetricsTrendKey.STRENGTH_ACTIVITY_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MetricsTrendKey.SLEEP_NEED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MetricsTrendKey.SLEEP_HOURS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MetricsTrendKey.SLEEP_PERFORMANCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MetricsTrendKey.IN_SLEEP_EFFICIENCY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MetricsTrendKey.SLEEP_NEED_FROM_SLEEP_DEBT_POST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MetricsTrendKey.RESTORATIVE_SLEEP_PERCENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MetricsTrendKey.SLEEP_CONSISTENCY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MetricsTrendKey.HOURS_V_NEEDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MetricsTrendKey.RESPIRATORY_RATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MetricsTrendKey.RHR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MetricsTrendKey.HRV.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MetricsTrendKey.RECOVERY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MetricsTrendKey.REM_SLEEP_DURATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MetricsTrendKey.REM_SLEEP.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MetricsTrendKey.SLOW_WAVE_SLEEP_DURATION.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MetricsTrendKey.DEEP_SLEEP.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f19919a = iArr;
            int[] iArr2 = new int[TrendKey.values().length];
            try {
                iArr2[TrendKey.AVERAGE_HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[TrendKey.CALORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[TrendKey.DAY_STRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[TrendKey.SLEEP_NEED.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[TrendKey.SLEEP_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[TrendKey.SLEEP_PERFORMANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[TrendKey.IN_SLEEP_EFFICIENCY.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[TrendKey.SLEEP_NEED_FROM_SLEEP_DEBT_POST.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[TrendKey.RESTORATIVE_SLEEP_PERCENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[TrendKey.SLEEP_CONSISTENCY.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[TrendKey.HOURS_V_NEEDED.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[TrendKey.RESPIRATORY_RATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[TrendKey.RHR.ordinal()] = 13;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[TrendKey.HRV.ordinal()] = 14;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[TrendKey.RECOVERY.ordinal()] = 15;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[TrendKey.REM_SLEEP_DURATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[TrendKey.SLOW_WAVE_SLEEP_DURATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused38) {
            }
            f19920b = iArr2;
            int[] iArr3 = new int[EnumC28166h0.values().length];
            try {
                iArr3[EnumC28166h0.HOURS_V_NEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[EnumC28166h0.RESPIRATORY_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[EnumC28166h0.RHR.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[EnumC28166h0.HRV.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[EnumC28166h0.AVERAGE_HR.ordinal()] = 5;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[EnumC28166h0.CALORIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[EnumC28166h0.DAY_STRAIN.ordinal()] = 7;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr3[EnumC28166h0.RECOVERY.ordinal()] = 8;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr3[EnumC28166h0.RESTORATIVE_SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr3[EnumC28166h0.SLEEP_PERFORMANCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[EnumC28166h0.SLEEP_EFFICIENCY.ordinal()] = 11;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr3[EnumC28166h0.SLEEP_DEBT_POST.ordinal()] = 12;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr3[EnumC28166h0.RESTORATIVE_SLEEP_PERCENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr3[EnumC28166h0.SLEEP_CONSISTENCY.ordinal()] = 14;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr3[EnumC28166h0.HOURS_V_NEEDED_PERCENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused53) {
            }
            f19921c = iArr3;
            int[] iArr4 = new int[EnumC36124q.values().length];
            try {
                iArr4[EnumC36124q.DEEP_SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr4[EnumC36124q.REM_SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr4[EnumC36124q.TYPICAL_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr4[EnumC36124q.STRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr4[EnumC36124q.STRESS_HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr4[EnumC36124q.STRESS_MEDIUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr4[EnumC36124q.STRESS_LOW.ordinal()] = 7;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr4[EnumC36124q.LEAN_BODY_MASS.ordinal()] = 8;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr4[EnumC36124q.BODY_FAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr4[EnumC36124q.CHRONOLOGICAL_AGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr4[EnumC36124q.WHOOP_AGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr4[EnumC36124q.MANUAL_ENTRY.ordinal()] = 12;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr4[EnumC36124q.MENSTRUAL_PHASE.ordinal()] = 13;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr4[EnumC36124q.FOLLICULAR_PHASE.ordinal()] = 14;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr4[EnumC36124q.OVULATORY_PHASE.ordinal()] = 15;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr4[EnumC36124q.LUTEAL_PHASE.ordinal()] = 16;
            } catch (NoSuchFieldError unused69) {
            }
            f19922d = iArr4;
        }
    }

    /* JADX INFO: renamed from: cm2.x$a0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a0 f19923w = new a0();

        /* JADX INFO: renamed from: a */
        public final long m15321a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15321a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f19924w = new b();

        /* JADX INFO: renamed from: a */
        public final long m15322a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15322a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$b0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f19925w = new b0();

        /* JADX INFO: renamed from: a */
        public final long m15323a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15323a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f19926w = new c();

        /* JADX INFO: renamed from: a */
        public final long m15324a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15324a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$c0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c0 f19927w = new c0();

        /* JADX INFO: renamed from: a */
        public final long m15325a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15325a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f19928w = new d();

        /* JADX INFO: renamed from: a */
        public final long m15326a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15326a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$d0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d0 f19929w = new d0();

        /* JADX INFO: renamed from: a */
        public final long m15327a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15327a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f19930w = new e();

        /* JADX INFO: renamed from: a */
        public final long m15328a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15328a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$e0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e0 f19931w = new e0();

        /* JADX INFO: renamed from: a */
        public final long m15329a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(1.0f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15329a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f19932w = new f();

        /* JADX INFO: renamed from: a */
        public final long m15330a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15330a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$f0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f0 f19933w = new f0();

        /* JADX INFO: renamed from: a */
        public final long m15331a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.8f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15331a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f19934w = new g();

        /* JADX INFO: renamed from: a */
        public final long m15332a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15332a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$g0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g0 f19935w = new g0();

        /* JADX INFO: renamed from: a */
        public final long m15333a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.6f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15333a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f19936w = new h();

        /* JADX INFO: renamed from: a */
        public final long m15334a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepDeepSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15334a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$h0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h0 f19937w = new h0();

        /* JADX INFO: renamed from: a */
        public final long m15335a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.4f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15335a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$i */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f19938w = new i();

        /* JADX INFO: renamed from: a */
        public final long m15336a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15336a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$i0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i0 f19939w = new i0();

        /* JADX INFO: renamed from: a */
        public final long m15337a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.2f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15337a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$j */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f19940w = new j();

        /* JADX INFO: renamed from: a */
        public final long m15338a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepAwake();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15338a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$j0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j0 f19941w = new j0();

        /* JADX INFO: renamed from: a */
        public final long m15339a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15339a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$k */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f19942w = new k();

        /* JADX INFO: renamed from: a */
        public final long m15340a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getMciRed();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15340a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$k0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f19943w;

        public k0(float f13) {
            this.f19943w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15341a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f19943w, whoopColor.getAccentAction());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15341a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$l */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f19944w = new l();

        /* JADX INFO: renamed from: a */
        public final long m15342a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15342a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$l0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f19945w;

        public l0(float f13) {
            this.f19945w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15343a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f19945w, whoopColor.getRecovery());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15343a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$m */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f19946w = new m();

        /* JADX INFO: renamed from: a */
        public final long m15344a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone2();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15344a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$m0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f19947w;

        public m0(float f13) {
            this.f19947w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15345a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f19947w, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15345a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$n */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f19948w = new n();

        /* JADX INFO: renamed from: a */
        public final long m15346a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15346a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$n0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f19949w;

        public n0(float f13) {
            this.f19949w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m15347a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f19949w, whoopColor.getSleepRemSleep());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15347a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$o */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f19950w = new o();

        /* JADX INFO: renamed from: a */
        public final long m15348a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15348a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$o0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o0 f19951w = new o0();

        /* JADX INFO: renamed from: a */
        public final long m15349a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15349a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$p */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f19952w = new p();

        /* JADX INFO: renamed from: a */
        public final long m15350a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepDeepSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15350a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$q */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f19953w = new q();

        /* JADX INFO: renamed from: a */
        public final long m15351a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15351a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$r */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f19954w = new r();

        /* JADX INFO: renamed from: a */
        public final long m15352a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15352a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$s */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f19955w = new s();

        /* JADX INFO: renamed from: a */
        public final long m15353a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15353a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$t */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f19956w = new t();

        /* JADX INFO: renamed from: a */
        public final long m15354a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15354a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$u */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f19957w = new u();

        /* JADX INFO: renamed from: a */
        public final long m15355a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15355a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$v */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f19958w = new v();

        /* JADX INFO: renamed from: a */
        public final long m15356a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15356a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$w */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f19959w = new w();

        /* JADX INFO: renamed from: a */
        public final long m15357a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15357a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$x */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f19960w = new x();

        /* JADX INFO: renamed from: a */
        public final long m15358a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15358a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$y */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f19961w = new y();

        /* JADX INFO: renamed from: a */
        public final long m15359a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15359a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.x$z */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final z f19962w = new z();

        /* JADX INFO: renamed from: a */
        public final long m15360a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15360a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC39332e m15312c(C4836x c4836x, MetricsTrendKey metricsTrendKey, Double d3, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            d3 = null;
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        return c4836x.m15315b(metricsTrendKey, d3, z4, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final AbstractC17911t m15313e(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k c23465k = new C23465k(Float.valueOf(0.0f), new C17919x(brushBackground.getAccentNegativeTrend()));
        Float fValueOf = Float.valueOf(0.5f);
        return AbstractC15693u.m44157d(c17909s, new C23465k[]{c23465k, new C23465k(fValueOf, new C17919x(brushBackground.getAccentNegativeTrend())), new C23465k(fValueOf, new C17919x(brushBackground.getAccentPositiveTrend())), new C23465k(Float.valueOf(1.0f), new C17919x(brushBackground.getAccentPositiveTrend()))}, 0, 315.0f, false, 10, null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC39332e m15314j(C4836x c4836x, EnumC28166h0 enumC28166h0, Double d3, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            d3 = null;
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        return c4836x.m15320i(enumC28166h0, d3, z4, z13);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC39332e m15315b(MetricsTrendKey metricsTrendKey, Double value, boolean doesContainTrendPlot, boolean isCalibrating) {
        InterfaceC39332e interfaceC39332eM125323a;
        AbstractC22676k.m65750j(metricsTrendKey, "metricsTrendKey");
        if (isCalibrating) {
            return p745y81.Function1.m125323a(b.f19924w);
        }
        switch (a.f19919a[metricsTrendKey.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                interfaceC39332eM125323a = p745y81.Function1.m125323a(c.f19926w);
                break;
            case 6:
                interfaceC39332eM125323a = p745y81.Function1.m125323a(d.f19928w);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                interfaceC39332eM125323a = p745y81.Function1.m125323a(e.f19930w);
                break;
            case 14:
            case 15:
            case 16:
                interfaceC39332eM125323a = p745y81.Function1.m125323a(f.f19932w);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                interfaceC39332eM125323a = m15317f(value);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                interfaceC39332eM125323a = p745y81.Function1.m125323a(g.f19934w);
                break;
            case 20:
            case 21:
                interfaceC39332eM125323a = p745y81.Function1.m125323a(h.f19936w);
                break;
            default:
                interfaceC39332eM125323a = null;
                break;
        }
        if (interfaceC39332eM125323a != null) {
            return doesContainTrendPlot ? p745y81.Function1.m125324b(C17919x.m51541c(0.2f, interfaceC39332eM125323a.getColor())) : interfaceC39332eM125323a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC18247a m15316d(EnumC36124q style) {
        switch (style == null ? -1 : a.f19922d[style.ordinal()]) {
            case 1:
                return AbstractC18249c.m52574l(p.f19952w);
            case 2:
                return AbstractC18249c.m52574l(q.f19953w);
            case 3:
                return AbstractC18249c.m52574l(r.f19954w);
            case 4:
                return AbstractC18249c.m52574l(s.f19955w);
            case 5:
                return AbstractC18249c.m52574l(t.f19956w);
            case 6:
                return AbstractC18249c.m52574l(u.f19957w);
            case 7:
                return AbstractC18249c.m52574l(v.f19958w);
            case 8:
                return AbstractC18249c.m52574l(w.f19959w);
            case 9:
                return AbstractC18249c.m52574l(x.f19960w);
            case 10:
                return AbstractC18249c.m52574l(i.f19938w);
            case 11:
                return AbstractC18249c.m52572j(new C4769a(18));
            case 12:
                return AbstractC18249c.m52574l(j.f19940w);
            case 13:
                return AbstractC18249c.m52574l(k.f19942w);
            case 14:
                return AbstractC18249c.m52574l(l.f19944w);
            case 15:
                return AbstractC18249c.m52574l(m.f19946w);
            case 16:
                return AbstractC18249c.m52574l(n.f19948w);
            default:
                return AbstractC18249c.m52574l(o.f19950w);
        }
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC39332e m15317f(Double value) {
        if (value == null) {
            return null;
        }
        if (((float) value.doubleValue()) < 0.34d) {
            return p745y81.Function1.m125323a(y.f19961w);
        }
        return (((double) ((float) value.doubleValue())) < 0.34d || value.doubleValue() >= 0.67d) ? p745y81.Function1.m125323a(a0.f19923w) : p745y81.Function1.m125323a(z.f19962w);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC39332e m15318g(int index) {
        if (index != 0) {
            return index != 1 ? p745y81.Function1.m125323a(d0.f19929w) : p745y81.Function1.m125323a(c0.f19927w);
        }
        return p745y81.Function1.m125323a(b0.f19925w);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    public final InterfaceC39332e m15319h(String color) {
        AbstractC22676k.m65750j(color, "color");
        int iHashCode = color.hashCode();
        switch (iHashCode) {
            case -1838664331:
                if (color.equals("STRAIN")) {
                    return EnumC39333f.STRAIN;
                }
                break;
            case -848090850:
                if (color.equals("SUFFICIENT")) {
                    return EnumC39333f.WHITE_50;
                }
                break;
            case -531494558:
                if (color.equals("OPTIMAL")) {
                    return EnumC39333f.ACCENT_POSITIVE_TREND;
                }
                break;
            case 2461730:
                if (color.equals("POOR")) {
                    return EnumC39333f.ACCENT_NEGATIVE_TREND;
                }
                break;
            default:
                switch (iHashCode) {
                    case -1724860441:
                        if (color.equals("STRAIN_1")) {
                            return p745y81.Function1.m125323a(e0.f19931w);
                        }
                        break;
                    case -1724860440:
                        if (color.equals("STRAIN_2")) {
                            return p745y81.Function1.m125323a(f0.f19933w);
                        }
                        break;
                    case -1724860439:
                        if (color.equals("STRAIN_3")) {
                            return p745y81.Function1.m125323a(g0.f19935w);
                        }
                        break;
                    case -1724860438:
                        if (color.equals("STRAIN_4")) {
                            return p745y81.Function1.m125323a(h0.f19937w);
                        }
                        break;
                    case -1724860437:
                        if (color.equals("STRAIN_5")) {
                            return p745y81.Function1.m125323a(i0.f19939w);
                        }
                        break;
                    default:
                        switch (iHashCode) {
                            case -1642992547:
                                if (color.equals("ZONE_0")) {
                                    return EnumC39333f.BRAND_WHITE;
                                }
                                break;
                            case -1642992546:
                                if (color.equals("ZONE_1")) {
                                    return EnumC39333f.STRAIN_ZONE_1;
                                }
                                break;
                            case -1642992545:
                                if (color.equals("ZONE_2")) {
                                    return EnumC39333f.STRAIN_ZONE_2;
                                }
                                break;
                            case -1642992544:
                                if (color.equals("ZONE_3")) {
                                    return EnumC39333f.STRAIN_ZONE_3;
                                }
                                break;
                            case -1642992543:
                                if (color.equals("ZONE_4")) {
                                    return EnumC39333f.STRAIN_ZONE_4;
                                }
                                break;
                            case -1642992542:
                                if (color.equals("ZONE_5")) {
                                    return EnumC39333f.STRAIN_ZONE_5;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        for (EnumC39333f enumC39333f2 : EnumC39333f.values()) {
            if (AbstractC22676k.m65745e(enumC39333f2.name(), color)) {
                if (enumC39333f2 == null) {
                    return enumC39333f;
                }
                return enumC39333f2;
            }
        }
        enumC39333f2 = null;
        if (enumC39333f2 == null) {
            return enumC39333f;
        }
        return enumC39333f2;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC39332e m15320i(EnumC28166h0 graphKey, Double value, boolean doesContainTrendPlot, boolean isCalibrating) {
        AbstractC22676k.m65750j(graphKey, "graphKey");
        if (isCalibrating) {
            return p745y81.Function1.m125323a(j0.f19941w);
        }
        float f13 = doesContainTrendPlot ? 0.2f : 1.0f;
        switch (a.f19921c[graphKey.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(new k0(f13));
            case 2:
            case 3:
            case 4:
                return p745y81.Function1.m125323a(new l0(f13));
            case 5:
            case 6:
            case 7:
                return p745y81.Function1.m125323a(new m0(f13));
            case 8:
                return m15317f(value);
            case 9:
                return p745y81.Function1.m125323a(new n0(f13));
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return p745y81.Function1.m125323a(o0.f19951w);
            default:
                return null;
        }
    }
}
