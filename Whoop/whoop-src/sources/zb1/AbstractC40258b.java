package zb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.graph.plot.bar.BarStyle;
import com.whoop.design.models.items.graph.plot.bar.BarTheme;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: zb1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;", "style", "Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;", "theme", "Li91/a;", "a", "(Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)Li91/a;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40258b {

    /* JADX INFO: renamed from: zb1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f174129a;

        static {
            int[] iArr = new int[BarStyle.values().length];
            try {
                iArr[BarStyle.CALIBRATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarStyle.DEEP_SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarStyle.HR_ZONE_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BarStyle.HR_ZONE_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BarStyle.HR_ZONE_2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BarStyle.HR_ZONE_3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BarStyle.HR_ZONE_4.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BarStyle.HR_ZONE_5.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BarStyle.LIGHT_SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BarStyle.MENSTRUAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BarStyle.NO_PHASE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BarStyle.RECOVERY_LOW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BarStyle.RECOVERY_MEDIUM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BarStyle.RECOVERY_HIGH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BarStyle.REM_SLEEP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BarStyle.SAGE_ELEVATED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BarStyle.SAGE_HIGH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BarStyle.SAGE_NORMAL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BarStyle.SAGE_ELEVATED_RANGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BarStyle.SAGE_HIGH_RANGE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BarStyle.SAGE_NORMAL_RANGE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BarStyle.SLEEP.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BarStyle.SLEEP_CONSISTENCY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BarStyle.STRAIN.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BarStyle.STRESS_LOW.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BarStyle.STRESS_MEDIUM.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BarStyle.STRESS_HIGH.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BarStyle.SLEEP_FAILED.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BarStyle.STRAIN_FAILED.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[BarStyle.HIDDEN.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            f174129a = iArr;
        }
    }

    /* JADX INFO: renamed from: zb1.b$a0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a0 f174130w = new a0();

        /* JADX INFO: renamed from: a */
        public final long m129271a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129271a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f174131w = new b();

        /* JADX INFO: renamed from: a */
        public final long m129272a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129272a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$b0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f174132w = new b0();

        /* JADX INFO: renamed from: a */
        public final long m129273a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129273a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f174133w = new c();

        /* JADX INFO: renamed from: a */
        public final long m129274a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSurfaceMciMenstrual();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129274a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$c0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c0 f174134w = new c0();

        /* JADX INFO: renamed from: a */
        public final long m129275a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone2();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129275a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f174135w = new d();

        /* JADX INFO: renamed from: a */
        public final long m129276a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129276a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$d0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d0 f174136w = new d0();

        /* JADX INFO: renamed from: a */
        public final long m129277a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129277a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f174137w = new e();

        /* JADX INFO: renamed from: a */
        public final long m129278a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129278a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$e0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e0 f174138w = new e0();

        /* JADX INFO: renamed from: a */
        public final long m129279a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129279a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f174139w = new f();

        /* JADX INFO: renamed from: a */
        public final long m129280a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129280a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$f0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f0 f174140w = new f0();

        /* JADX INFO: renamed from: a */
        public final long m129281a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrainZone5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129281a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f174141w = new g();

        /* JADX INFO: renamed from: a */
        public final long m129282a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129282a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f174142w = new h();

        /* JADX INFO: renamed from: a */
        public final long m129283a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129283a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f174143w = new i();

        /* JADX INFO: renamed from: a */
        public final long m129284a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentFocus();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129284a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f174144w = new j();

        /* JADX INFO: renamed from: a */
        public final long m129285a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129285a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f174145w = new k();

        /* JADX INFO: renamed from: a */
        public final long m129286a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129286a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f174146w = new l();

        /* JADX INFO: renamed from: a */
        public final long m129287a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129287a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f174147w = new m();

        /* JADX INFO: renamed from: a */
        public final long m129288a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129288a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f174148w = new n();

        /* JADX INFO: renamed from: a */
        public final long m129289a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129289a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f174149w = new o();

        /* JADX INFO: renamed from: a */
        public final long m129290a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129290a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f174150w = new p();

        /* JADX INFO: renamed from: a */
        public final long m129291a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129291a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f174151w = new q();

        /* JADX INFO: renamed from: a */
        public final long m129292a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129292a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f174152w = new r();

        /* JADX INFO: renamed from: a */
        public final long m129293a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129293a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f174153w = new s();

        /* JADX INFO: renamed from: a */
        public final long m129294a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129294a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f174154w = new t();

        /* JADX INFO: renamed from: a */
        public final long m129295a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129295a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f174155w = new u();

        /* JADX INFO: renamed from: a */
        public final long m129296a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.5f, colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129296a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f174156w = new v();

        /* JADX INFO: renamed from: a */
        public final long m129297a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getGreyL3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129297a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f174157w = new w();

        /* JADX INFO: renamed from: a */
        public final long m129298a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.5f, colorBackground.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129298a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f174158w = new x();

        /* JADX INFO: renamed from: a */
        public final long m129299a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129299a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f174159w = new y();

        /* JADX INFO: renamed from: a */
        public final long m129300a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129300a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zb1.b$z */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final z f174160w = new z();

        /* JADX INFO: renamed from: a */
        public final long m129301a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepDeepSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129301a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC18247a m129270a(BarStyle barStyle, BarTheme barTheme) {
        EnumC39333f barColor;
        if (barTheme != null && (barColor = barTheme.getBarColor()) != null) {
            return AbstractC18249c.m52575m(barColor);
        }
        switch (barStyle == null ? -1 : a.f174129a[barStyle.ordinal()]) {
            case 1:
                return AbstractC18249c.m52574l(v.f174156w);
            case 2:
                return AbstractC18249c.m52574l(z.f174160w);
            case 3:
                return AbstractC18249c.m52574l(a0.f174130w);
            case 4:
                return AbstractC18249c.m52574l(b0.f174132w);
            case 5:
                return AbstractC18249c.m52574l(c0.f174134w);
            case 6:
                return AbstractC18249c.m52574l(d0.f174136w);
            case 7:
                return AbstractC18249c.m52574l(e0.f174138w);
            case 8:
                return AbstractC18249c.m52574l(f0.f174140w);
            case 9:
                return AbstractC18249c.m52574l(b.f174131w);
            case 10:
                return AbstractC18249c.m52574l(c.f174133w);
            case 11:
                return AbstractC18249c.m52574l(d.f174135w);
            case 12:
                return AbstractC18249c.m52574l(e.f174137w);
            case 13:
                return AbstractC18249c.m52574l(f.f174139w);
            case 14:
                return AbstractC18249c.m52574l(g.f174141w);
            case 15:
                return AbstractC18249c.m52574l(h.f174142w);
            case 16:
                return AbstractC18249c.m52574l(i.f174143w);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18249c.m52574l(j.f174144w);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC18249c.m52574l(k.f174145w);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18249c.m52574l(l.f174146w);
            case 20:
                return AbstractC18249c.m52574l(m.f174147w);
            case 21:
                return AbstractC18249c.m52574l(n.f174148w);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC18249c.m52574l(o.f174149w);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC18249c.m52574l(p.f174150w);
            case 24:
                return AbstractC18249c.m52574l(q.f174151w);
            case 25:
                return AbstractC18249c.m52574l(r.f174152w);
            case 26:
                return AbstractC18249c.m52574l(s.f174153w);
            case 27:
                return AbstractC18249c.m52574l(t.f174154w);
            case 28:
                return AbstractC18249c.m52574l(u.f174155w);
            case 29:
                return AbstractC18249c.m52574l(w.f174157w);
            case 30:
                return AbstractC18249c.m52574l(x.f174158w);
            default:
                return AbstractC18249c.m52574l(y.f174159w);
        }
    }
}
