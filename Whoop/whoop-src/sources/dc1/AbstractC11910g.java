package dc1;

import androidx.health.platform.client.proto.C1533u;
import bp0.C3526n;
import com.whoop.design.models.items.graph.plot.line.DashPattern;
import com.whoop.design.models.items.graph.plot.line.LinePlotStyle;
import com.whoop.design.models.items.graph.plot.line.LinePlotTheme;
import com.whoop.design.models.items.graph.plot.line.LineWidth;
import gb1.AbstractC15693u;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k61.C22230c;
import l83.C23465k;
import or2.AbstractC28145a1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC42793j;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dc1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "style", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "theme", "Ll83/k;", "", "startPoint", "endPoint", "Lk61/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ll83/k;Ll83/k;)Lk61/c;", "d", "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Ll83/k;Ll83/k;)Lk61/c;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11910g {

    /* JADX INFO: renamed from: dc1.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38918a;

        static {
            int[] iArr = new int[LinePlotStyle.values().length];
            try {
                iArr[LinePlotStyle.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinePlotStyle.HARD_HR_ZONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinePlotStyle.BODY_COMPOSITION_FAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LinePlotStyle.HOURS_OF_SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LinePlotStyle.LIGHT_HR_ZONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LinePlotStyle.LIGHT_SLEEP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LinePlotStyle.BODY_COMPOSITION_LEAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LinePlotStyle.MAX_HR_ZONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LinePlotStyle.MODERATE_HR_ZONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LinePlotStyle.OVERVIEW_RECOVERY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LinePlotStyle.OVERVIEW_STRAIN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LinePlotStyle.STRAIN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LinePlotStyle.RECOVERY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LinePlotStyle.RECOVERY_HEART_RATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LinePlotStyle.REM_SLEEP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LinePlotStyle.RESTORATIVE_HR_ZONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LinePlotStyle.SLEEP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LinePlotStyle.SLEEP_CONSISTENCY_WAKETIME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LinePlotStyle.SLEEP_CONSISTENCY_BEDTIME.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LinePlotStyle.SLEEP_HEART_RATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LinePlotStyle.SLEEP_NEED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LinePlotStyle.STRAIN_HEART_RATE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LinePlotStyle.STRESS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LinePlotStyle.STRESS_CALIBRATING.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LinePlotStyle.SWS_SLEEP.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LinePlotStyle.VERY_LIGHT_HR_ZONE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[LinePlotStyle.STRESS_LOW.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[LinePlotStyle.STRESS_MEDIUM.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[LinePlotStyle.STRESS_HIGH.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[LinePlotStyle.FIRST_TRIMESTER.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[LinePlotStyle.SECOND_TRIMESTER.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[LinePlotStyle.THIRD_TRIMESTER.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[LinePlotStyle.POST_PARTUM.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[LinePlotStyle.TILT_MODE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[LinePlotStyle.TILT_MODE_SLEEP.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[LinePlotStyle.TILT_MODE_RECOVERY.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[LinePlotStyle.TILT_MODE_STRAIN.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[LinePlotStyle.CHRONOLOGICAL_AGE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[LinePlotStyle.PACE_OF_AGING.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[LinePlotStyle.MANUAL_ENTRY.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[LinePlotStyle.WHOOP_AGE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[LinePlotStyle.BIOMARKER_DETAILS.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            f38918a = iArr;
        }
    }

    /* JADX INFO: renamed from: dc1.g$a0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a0 f38919w = new a0();

        /* JADX INFO: renamed from: a */
        public final long m32115a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32115a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f38920w = new b();

        /* JADX INFO: renamed from: a */
        public final long m32116a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32116a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$b0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f38921w = new b0();

        /* JADX INFO: renamed from: a */
        public final long m32117a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32117a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f38922w = new c();

        /* JADX INFO: renamed from: a */
        public final long m32118a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32118a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$c0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c0 f38923w = new c0();

        /* JADX INFO: renamed from: a */
        public final long m32119a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepAwake();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32119a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f38924w = new d();

        /* JADX INFO: renamed from: a */
        public final long m32120a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32120a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$d0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d0 f38925w = new d0();

        /* JADX INFO: renamed from: a */
        public final long m32121a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32121a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f38926w = new e();

        /* JADX INFO: renamed from: a */
        public final long m32122a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32122a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$e0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e0 f38927w = new e0();

        /* JADX INFO: renamed from: a */
        public final long m32123a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.5f, colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32123a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f38928w = new f();

        /* JADX INFO: renamed from: a */
        public final long m32124a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32124a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$f0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f0 f38929w = new f0();

        /* JADX INFO: renamed from: a */
        public final long m32125a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone2();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32125a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f38930w = new g();

        /* JADX INFO: renamed from: a */
        public final long m32126a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32126a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$g0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g0 f38931w = new g0();

        /* JADX INFO: renamed from: a */
        public final long m32127a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32127a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f38932w = new h();

        /* JADX INFO: renamed from: a */
        public final long m32128a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32128a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$h0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h0 f38933w = new h0();

        /* JADX INFO: renamed from: a */
        public final long m32129a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32129a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$i */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f38934w = new i();

        /* JADX INFO: renamed from: a */
        public final long m32130a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.5f, colorBackground.getAccentAction());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32130a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$i0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i0 f38935w = new i0();

        /* JADX INFO: renamed from: a */
        public final long m32131a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32131a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f38936w = new j();

        /* JADX INFO: renamed from: a */
        public final long m32132a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32132a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$j0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j0 f38937w = new j0();

        /* JADX INFO: renamed from: a */
        public final long m32133a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.3f, colorBackground.getWhite30());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32133a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$k */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f38938w = new k();

        /* JADX INFO: renamed from: a */
        public final long m32134a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepAwake();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32134a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$k0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k0 f38939w = new k0();

        /* JADX INFO: renamed from: a */
        public final long m32135a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.5f, colorBackground.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32135a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$l */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f38940w = new l();

        /* JADX INFO: renamed from: a */
        public final long m32136a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32136a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$m */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f38941w = new m();

        /* JADX INFO: renamed from: a */
        public final long m32137a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepDeepSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32137a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$n */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f38942w = new n();

        /* JADX INFO: renamed from: a */
        public final long m32138a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32138a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$o */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f38943w = new o();

        /* JADX INFO: renamed from: a */
        public final long m32139a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32139a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$p */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f38944w = new p();

        /* JADX INFO: renamed from: a */
        public final long m32140a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32140a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$q */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f38945w = new q();

        /* JADX INFO: renamed from: a */
        public final long m32141a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32141a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$r */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f38946w = new r();

        /* JADX INFO: renamed from: a */
        public final long m32142a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32142a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$s */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f38947w = new s();

        /* JADX INFO: renamed from: a */
        public final long m32143a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32143a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$t */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f38948w = new t();

        /* JADX INFO: renamed from: a */
        public final long m32144a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32144a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$u */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f38949w = new u();

        /* JADX INFO: renamed from: a */
        public final long m32145a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32145a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$v */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f38950w = new v();

        /* JADX INFO: renamed from: a */
        public final long m32146a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32146a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$w */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f38951w = new w();

        /* JADX INFO: renamed from: a */
        public final long m32147a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32147a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$x */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f38952w = new x();

        /* JADX INFO: renamed from: a */
        public final long m32148a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32148a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$y */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f38953w = new y();

        /* JADX INFO: renamed from: a */
        public final long m32149a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32149a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.g$z */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final z f38954w = new z();

        /* JADX INFO: renamed from: a */
        public final long m32150a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32150a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d */
    private static final C22230c m32110d(LinePlotStyle linePlotStyle, C23465k c23465k, C23465k c23465k2) {
        switch (a.f38918a[linePlotStyle.ordinal()]) {
            case 1:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(k.f38938w), AbstractC42793j.m125436c().getSleepAwake(), false, 38, null);
            case 2:
            case 3:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(u.f38949w), AbstractC42793j.m125436c().getStrainZone4(), false, 38, null);
            case 4:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(e0.f38927w), C17919x.m51541c(0.5f, AbstractC42793j.m125436c().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), false, 39, null);
            case 5:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(f0.f38929w), AbstractC42793j.m125436c().getStrainZone2(), false, 38, null);
            case 6:
            case 7:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(g0.f38931w), AbstractC42793j.m125436c().getSleepLightSleep(), false, 38, null);
            case 8:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(h0.f38933w), AbstractC42793j.m125436c().getStrainZone5(), false, 38, null);
            case 9:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(i0.f38935w), AbstractC42793j.m125436c().getStrainZone3(), false, 38, null);
            case 10:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(j0.f38937w), C17919x.m51541c(0.3f, AbstractC42793j.m125436c().getWhite30()), false, 39, null);
            case 11:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(k0.f38939w), C17919x.m51541c(0.5f, AbstractC42793j.m125436c().getStrain()), false, 39, null);
            case 12:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(b.f38920w), C17919x.m51541c(0.5f, AbstractC42793j.m125436c().getStrain()), false, 39, null);
            case 13:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(c.f38922w), C17919x.m51541c(0.5f, AbstractC42793j.m125436c().getRecovery()), false, 39, null);
            case 14:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(d.f38924w), AbstractC42793j.m125436c().getRecovery(), false, 38, null);
            case 15:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(e.f38926w), C17919x.m51541c(0.3f, AbstractC42793j.m125436c().getSleepRemSleep()), false, 38, null);
            case 16:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(f.f38928w), 0L, false, 54, null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(g.f38930w), C17919x.m51541c(0.5f, AbstractC42793j.m125436c().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), false, 39, null);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52572j(new C11906c(15)), C17919x.m51541c(0.5f, AbstractC42793j.m125436c().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), true, 7, null);
            case 20:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(h.f38932w), AbstractC42793j.m125436c().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), false, 38, null);
            case 21:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(i.f38934w), C17919x.m51541c(0.5f, AbstractC42793j.m125436c().getAccentAction()), false, 39, null);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(j.f38936w), AbstractC42793j.m125436c().getStrain(), false, 38, null);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52572j(new C11906c(16)), 0L, false, 55, null);
            case 24:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(l.f38940w), 0L, false, 55, null);
            case 25:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(m.f38941w), C17919x.m51541c(0.3f, AbstractC42793j.m125436c().getSleepDeepSleep()), false, 38, null);
            case 26:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(n.f38942w), AbstractC42793j.m125436c().getStrainZone1(), false, 38, null);
            case 27:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(o.f38943w), AbstractC42793j.m125436c().getRecovery(), false, 38, null);
            case 28:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(p.f38944w), AbstractC42793j.m125436c().getAccentPositiveTrend(), false, 38, null);
            case 29:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(q.f38945w), AbstractC42793j.m125436c().getAccentNegativeTrend(), false, 38, null);
            case 30:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(r.f38946w), AbstractC42793j.m125436c().getSleepLightSleep(), false, 38, null);
            case 31:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(s.f38947w), AbstractC42793j.m125436c().getSleepAwake(), false, 38, null);
            case 32:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(t.f38948w), AbstractC42793j.m125436c().getStrainZone3(), false, 38, null);
            case 33:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(v.f38950w), AbstractC42793j.m125436c().getRecovery(), false, 38, null);
            case 34:
                return new C22230c((float) 1.5d, 0, 0, AbstractC18249c.m52574l(w.f38951w), AbstractC42793j.m125436c().getWhite30(), false, 38, null);
            case 35:
                return new C22230c((float) 1.5d, 0, 0, AbstractC18249c.m52574l(x.f38952w), AbstractC42793j.m125436c().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), false, 38, null);
            case 36:
                return new C22230c((float) 1.5d, 0, 0, AbstractC18249c.m52574l(y.f38953w), AbstractC42793j.m125436c().getRecovery(), false, 38, null);
            case 37:
                return new C22230c((float) 1.5d, 0, 0, AbstractC18249c.m52574l(z.f38954w), AbstractC42793j.m125436c().getStrain(), false, 38, null);
            case 38:
                return new C22230c((float) 1.5d, 0, 0, AbstractC18249c.m52574l(a0.f38919w), AbstractC42793j.m125436c().getStrain(), false, 38, null);
            case 39:
                return new C22230c((float) 1.5d, 0, 0, AbstractC18249c.m52574l(b0.f38921w), AbstractC42793j.m125436c().getStrain(), false, 38, null);
            case 40:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(c0.f38923w), C17919x.m51541c(0.5f, AbstractC42793j.m125436c().getSleepAwake()), false, 39, null);
            case 41:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52572j(new C3526n(12, c23465k, c23465k2)), 0L, false, 55, null);
            case 42:
                return new C22230c(2, 0, 0, AbstractC18249c.m52574l(d0.f38925w), AbstractC42793j.m125436c().getWhite20(), false, 38, null);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final AbstractC17911t m32111e(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4290363305L))), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4291224543L))), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4292462262L))), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4289964224L)))), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final AbstractC17911t m32112f(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getAccentNegativeTrend()), new C17919x(brushBackground.getAccentPositiveTrend()), new C17919x(brushBackground.getRecovery())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final AbstractC17911t m32113g(C23465k c23465k, C23465k c23465k2, C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return AbstractC15693u.m44155b(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getAccentNegativeTrend()), new C17919x(brushBackground.getWhite20()), new C17919x(brushBackground.getAccentPositiveTrend())), AbstractC28145a1.m85166b(c23465k, c23465k2), 0, AbstractC28145a1.m85165a(c23465k, c23465k2), false, 20, null);
    }

    /* JADX INFO: renamed from: h */
    public static final C22230c m32114h(LinePlotStyle style, LinePlotTheme linePlotTheme, C23465k c23465k, C23465k c23465k2) {
        AbstractC18247a background;
        boolean isDashed;
        AbstractC22676k.m65750j(style, "style");
        C22230c c22230cM32110d = m32110d(style, c23465k, c23465k2);
        EnumC39333f strokeColor = linePlotTheme != null ? linePlotTheme.getStrokeColor() : null;
        LineWidth strokeWidth = linePlotTheme != null ? linePlotTheme.getStrokeWidth() : null;
        DashPattern dashPattern = linePlotTheme != null ? linePlotTheme.getDashPattern() : null;
        if (c22230cM32110d == null && strokeColor == null && strokeWidth == null && dashPattern == null) {
            return null;
        }
        C22230c c22230c = c22230cM32110d == null ? new C22230c(0.0f, 0, 0, null, 0L, false, 63, null) : c22230cM32110d;
        if (strokeColor == null || (background = AbstractC18249c.m52575m(strokeColor)) == null) {
            background = c22230c.getBackground();
        }
        AbstractC18247a abstractC18247a = background;
        float fM32151a = strokeWidth != null ? AbstractC11911h.m32151a(strokeWidth) : c22230c.getWidth();
        if (dashPattern != null) {
            isDashed = dashPattern != DashPattern.SOLID;
        } else {
            isDashed = c22230c.getIsDashed();
        }
        return C22230c.m63731b(c22230c, fM32151a, 0, 0, abstractC18247a, 0L, isDashed, 22, null);
    }
}
