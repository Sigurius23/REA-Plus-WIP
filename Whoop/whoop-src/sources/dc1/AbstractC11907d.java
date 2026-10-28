package dc1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.data.repositories.C6659f;
import com.whoop.design.models.items.graph.plot.line.FillOpacity;
import com.whoop.design.models.items.graph.plot.line.LinePlotStyle;
import com.whoop.design.models.items.graph.plot.line.LinePlotTheme;
import i91.AbstractC18249c;
import k61.C22228a;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dc1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "style", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "theme", "Lk61/a;", "X", "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lk61/a;", "y", "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;)Lk61/a;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11907d {

    /* JADX INFO: renamed from: dc1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38909a;

        static {
            int[] iArr = new int[LinePlotStyle.values().length];
            try {
                iArr[LinePlotStyle.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinePlotStyle.BODY_COMPOSITION_FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinePlotStyle.BODY_COMPOSITION_LEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LinePlotStyle.HARD_HR_ZONE.ordinal()] = 4;
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
                iArr[LinePlotStyle.MAX_HR_ZONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LinePlotStyle.MODERATE_HR_ZONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LinePlotStyle.RECOVERY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LinePlotStyle.RECOVERY_HEART_RATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LinePlotStyle.REM_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LinePlotStyle.RESTORATIVE_HR_ZONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LinePlotStyle.SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LinePlotStyle.SLEEP_HEART_RATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LinePlotStyle.STRAIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LinePlotStyle.MANUAL_ENTRY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LinePlotStyle.STRAIN_HEART_RATE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LinePlotStyle.SWS_SLEEP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LinePlotStyle.VERY_LIGHT_HR_ZONE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LinePlotStyle.STRESS_LOW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LinePlotStyle.STRESS_MEDIUM.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LinePlotStyle.STRESS_HIGH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LinePlotStyle.BIOMARKER_DETAILS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            f38909a = iArr;
        }
    }

    /* JADX INFO: renamed from: dc1.d$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f38910w = new b();

        /* JADX INFO: renamed from: a */
        public final long m32096a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C11905b.f38904a.m32044b();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32096a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.d$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f38911w = new c();

        /* JADX INFO: renamed from: a */
        public final long m32097a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C11905b.f38904a.m32044b();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32097a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.d$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f38912w = new d();

        /* JADX INFO: renamed from: a */
        public final long m32098a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C11905b.f38904a.m32045c();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32098a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.d$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f38913w = new e();

        /* JADX INFO: renamed from: a */
        public final long m32099a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C11905b.f38904a.m32045c();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32099a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.d$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f38914w = new f();

        /* JADX INFO: renamed from: a */
        public final long m32100a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C11905b.f38904a.m32043a();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32100a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.d$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f38915w = new g();

        /* JADX INFO: renamed from: a */
        public final long m32101a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C11905b.f38904a.m32043a();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32101a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.d$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f38916w = new h();

        /* JADX INFO: renamed from: a */
        public final long m32102a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32102a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.d$i */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f38917w = new i();

        /* JADX INFO: renamed from: a */
        public final long m32103a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32103a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final AbstractC17911t m32046A(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getSleepAwake())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final AbstractC17911t m32047B(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getRecovery())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final AbstractC17911t m32048C(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, brushBackground.getRecovery())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final AbstractC17911t m32049D(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.5f, brushBackground.getSleepRemSleep())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final AbstractC17911t m32050E(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.7f, brushBackground.getBrandWhite())), new C17919x(C17919x.m51541c(0.3f, brushBackground.getBrandWhite())), new C17919x(brushBackground.getBlack20())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final AbstractC17911t m32051F(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final AbstractC17911t m32052G(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final AbstractC17911t m32053H(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final AbstractC17911t m32054I(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getStrain())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final AbstractC17911t m32055J(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getStrain())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final AbstractC17911t m32056K(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getSleepAwake())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final AbstractC17911t m32057L(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, brushBackground.getStrainZone4())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final AbstractC17911t m32058M(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getSleepAwake())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final AbstractC17911t m32059N(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, brushBackground.getStrain())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final AbstractC17911t m32060O(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.5f, brushBackground.getSleepDeepSleep())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final AbstractC17911t m32061P(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.7f, brushBackground.getStrainZone1())), new C17919x(C17919x.m51541c(0.3f, brushBackground.getStrainZone1())), new C17919x(brushBackground.getBlack20())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final AbstractC17911t m32062Q(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, brushBackground.getSleepLightSleep())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final AbstractC17911t m32063R(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.7f, brushBackground.getStrainZone4())), new C17919x(C17919x.m51541c(0.3f, brushBackground.getStrainZone4())), new C17919x(brushBackground.getBlack20())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final AbstractC17911t m32064S(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.7f, brushBackground.getStrainZone2())), new C17919x(C17919x.m51541c(0.3f, brushBackground.getStrainZone2())), new C17919x(brushBackground.getBlack20())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final AbstractC17911t m32065T(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, brushBackground.getSleepLightSleep())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final AbstractC17911t m32066U(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.7f, brushBackground.getStrainZone5())), new C17919x(C17919x.m51541c(0.3f, brushBackground.getStrainZone5())), new C17919x(brushBackground.getBlack20())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final AbstractC17911t m32067V(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.7f, brushBackground.getStrainZone3())), new C17919x(C17919x.m51541c(0.3f, brushBackground.getStrainZone3())), new C17919x(brushBackground.getBlack20())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final AbstractC17911t m32068W(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getRecovery())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: X */
    public static final C22228a m32069X(LinePlotStyle style, LinePlotTheme linePlotTheme) {
        EnumC39333f fillColor;
        AbstractC22676k.m65750j(style, "style");
        if (linePlotTheme == null || (fillColor = linePlotTheme.getFillColor()) == null) {
            return m32094y(style);
        }
        FillOpacity fillOpacity = linePlotTheme.getFillOpacity();
        return new C22228a(AbstractC18249c.m52576n(fillColor, Float.valueOf(fillOpacity != null ? AbstractC11904a.m32042a(fillOpacity) : 1.0f)), null, 2, null);
    }

    /* JADX INFO: renamed from: y */
    private static final C22228a m32094y(LinePlotStyle linePlotStyle) {
        switch (a.f38909a[linePlotStyle.ordinal()]) {
            case 1:
                return new C22228a(AbstractC18249c.m52572j(new C6659f(21)), AbstractC18249c.m52572j(new C6659f(23)));
            case 2:
                return new C22228a(AbstractC18249c.m52572j(new C6659f(28)), null, 2, null);
            case 3:
                return new C22228a(AbstractC18249c.m52572j(new C6659f(29)), null, 2, null);
            case 4:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(0)), null, 2, null);
            case 5:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(1)), null, 2, null);
            case 6:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(3)), null, 2, null);
            case 7:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(4)), null, 2, null);
            case 8:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(5)), null, 2, null);
            case 9:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(6)), AbstractC18249c.m52572j(new C11906c(2)));
            case 10:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(7)), null, 2, null);
            case 11:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(8)), AbstractC18249c.m52577o(AbstractC17918w0.m51517e(4281410629L)));
            case 12:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(9)), null, 2, null);
            case 13:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(10)), AbstractC18249c.m52572j(new C11906c(11)));
            case 14:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(12)), null, 2, null);
            case 15:
                return new C22228a(AbstractC18249c.m52572j(new C11906c(13)), AbstractC18249c.m52572j(new C11906c(14)));
            case 16:
                return new C22228a(AbstractC18249c.m52572j(new C6659f(22)), AbstractC18249c.m52572j(new C6659f(24)));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C22228a(AbstractC18249c.m52572j(new C6659f(25)), null, 2, null);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C22228a(AbstractC18249c.m52572j(new C6659f(26)), AbstractC18249c.m52577o(AbstractC17918w0.m51517e(4282462536L)));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C22228a(AbstractC18249c.m52572j(new C6659f(27)), null, 2, null);
            case 20:
                return new C22228a(AbstractC18249c.m52574l(b.f38910w), AbstractC18249c.m52574l(c.f38911w));
            case 21:
                return new C22228a(AbstractC18249c.m52574l(d.f38912w), AbstractC18249c.m52574l(e.f38913w));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C22228a(AbstractC18249c.m52574l(f.f38914w), AbstractC18249c.m52574l(g.f38915w));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C22228a(AbstractC18249c.m52574l(h.f38916w), AbstractC18249c.m52574l(i.f38917w));
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final AbstractC17911t m32095z(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, brushBackground.getSleepAwake())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }
}
