package dc1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.graph.plot.line.LinePointStyle;
import com.whoop.design.models.items.graph.plot.line.LinePointTheme;
import com.whoop.design.models.items.graph.plot.line.PointShape;
import com.whoop.design.models.items.graph.plot.line.PointSize;
import com.whoop.design.models.items.graph.plot.line.PointVisibility;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import u61.C34554c;
import u61.EnumC34553b;

/* JADX INFO: renamed from: dc1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;", "linePointStyle", "Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;", "theme", "Lu61/c;", "b", "(Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)Lu61/c;", "Lcom/whoop/design/models/items/graph/plot/line/PointShape;", "Lu61/b;", "c", "(Lcom/whoop/design/models/items/graph/plot/line/PointShape;)Lu61/b;", "a", "(Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;)Lu61/c;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11912i {

    /* JADX INFO: renamed from: dc1.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38956a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f38957b;

        static {
            int[] iArr = new int[PointShape.values().length];
            try {
                iArr[PointShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointShape.DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointShape.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointShape.DIAMOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38956a = iArr;
            int[] iArr2 = new int[LinePointStyle.values().length];
            try {
                iArr2[LinePointStyle.BIOMARKER_NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LinePointStyle.BIOMARKER_NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LinePointStyle.BIOMARKER_POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LinePointStyle.BIOMARKER_SUFFICIENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LinePointStyle.BODY_COMPOSITION_FAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LinePointStyle.BODY_COMPOSITION_LEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LinePointStyle.CALIBRATING.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LinePointStyle.HOURS_OF_SLEEP.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[LinePointStyle.SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[LinePointStyle.RECOVERY.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[LinePointStyle.RECOVERY_LOW.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[LinePointStyle.RECOVERY_MEDIUM.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[LinePointStyle.RECOVERY_HIGH.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[LinePointStyle.SLEEP_NEED.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[LinePointStyle.STRAIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[LinePointStyle.TRENDS_RECOVERY_LOW.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[LinePointStyle.TRENDS_RECOVERY_MEDIUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[LinePointStyle.TRENDS_RECOVERY_HIGH.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[LinePointStyle.WHOOP_AGE_OLDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[LinePointStyle.WHOOP_AGE_YOUNGER.ordinal()] = 20;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[LinePointStyle.MANUAL_ENTRY.ordinal()] = 21;
            } catch (NoSuchFieldError unused25) {
            }
            f38957b = iArr2;
        }
    }

    /* JADX INFO: renamed from: dc1.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f38958w = new b();

        /* JADX INFO: renamed from: a */
        public final long m32155a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32155a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f38959w = new c();

        /* JADX INFO: renamed from: a */
        public final long m32156a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32156a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f38960w = new d();

        /* JADX INFO: renamed from: a */
        public final long m32157a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32157a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f38961w = new e();

        /* JADX INFO: renamed from: a */
        public final long m32158a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32158a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f38962w = new f();

        /* JADX INFO: renamed from: a */
        public final long m32159a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32159a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f38963w = new g();

        /* JADX INFO: renamed from: a */
        public final long m32160a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32160a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f38964w = new h();

        /* JADX INFO: renamed from: a */
        public final long m32161a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32161a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$i */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f38965w = new i();

        /* JADX INFO: renamed from: a */
        public final long m32162a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32162a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f38966w = new j();

        /* JADX INFO: renamed from: a */
        public final long m32163a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32163a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$k */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f38967w = new k();

        /* JADX INFO: renamed from: a */
        public final long m32164a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32164a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$l */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f38968w = new l();

        /* JADX INFO: renamed from: a */
        public final long m32165a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32165a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$m */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f38969w = new m();

        /* JADX INFO: renamed from: a */
        public final long m32166a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepAwake();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32166a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$n */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f38970w = new n();

        /* JADX INFO: renamed from: a */
        public final long m32167a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32167a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$o */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f38971w = new o();

        /* JADX INFO: renamed from: a */
        public final long m32168a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32168a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$p */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f38972w = new p();

        /* JADX INFO: renamed from: a */
        public final long m32169a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSufficientTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32169a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$q */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f38973w = new q();

        /* JADX INFO: renamed from: a */
        public final long m32170a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32170a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$r */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f38974w = new r();

        /* JADX INFO: renamed from: a */
        public final long m32171a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32171a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$s */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f38975w = new s();

        /* JADX INFO: renamed from: a */
        public final long m32172a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32172a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$t */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f38976w = new t();

        /* JADX INFO: renamed from: a */
        public final long m32173a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32173a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: dc1.i$u */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f38977w = new u();

        /* JADX INFO: renamed from: a */
        public final long m32174a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m32174a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    private static final C34554c m32152a(LinePointStyle linePointStyle) {
        switch (a.f38957b[linePointStyle.ordinal()]) {
            case 1:
                return new C34554c(p745y81.Function1.m125323a(l.f38968w), 14, null, 4, null);
            case 2:
                return new C34554c(p745y81.Function1.m125323a(n.f38970w), 14, null, 4, null);
            case 3:
                return new C34554c(p745y81.Function1.m125323a(o.f38971w), 14, null, 4, null);
            case 4:
                return new C34554c(p745y81.Function1.m125323a(p.f38972w), 14, null, 4, null);
            case 5:
                return new C34554c(p745y81.Function1.m125323a(q.f38973w), 0.0f, null, 6, null);
            case 6:
                return new C34554c(p745y81.Function1.m125323a(r.f38974w), 0.0f, null, 6, null);
            case 7:
                return new C34554c(p745y81.Function1.m125323a(s.f38975w), 0.0f, null, 6, null);
            case 8:
            case 9:
                return new C34554c(p745y81.Function1.m125323a(t.f38976w), 0.0f, null, 6, null);
            case 10:
                return new C34554c(p745y81.Function1.m125323a(u.f38977w), 0.0f, null, 6, null);
            case 11:
                return new C34554c(p745y81.Function1.m125323a(b.f38958w), 0.0f, null, 6, null);
            case 12:
                return new C34554c(p745y81.Function1.m125323a(c.f38959w), 0.0f, null, 6, null);
            case 13:
                return new C34554c(p745y81.Function1.m125323a(d.f38960w), 0.0f, null, 6, null);
            case 14:
                return new C34554c(p745y81.Function1.m125323a(e.f38961w), 0.0f, null, 6, null);
            case 15:
                return new C34554c(p745y81.Function1.m125323a(f.f38962w), 0.0f, null, 6, null);
            case 16:
                return new C34554c(p745y81.Function1.m125323a(g.f38963w), 4, null, 4, null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C34554c(p745y81.Function1.m125323a(h.f38964w), 4, null, 4, null);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C34554c(p745y81.Function1.m125323a(i.f38965w), 4, null, 4, null);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C34554c(p745y81.Function1.m125323a(j.f38966w), 4, null, 4, null);
            case 20:
                return new C34554c(p745y81.Function1.m125323a(k.f38967w), 4, null, 4, null);
            case 21:
                return new C34554c(p745y81.Function1.m125323a(m.f38969w), 0.0f, null, 6, null);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C34554c m32153b(LinePointStyle linePointStyle, LinePointTheme linePointTheme) {
        InterfaceC39332e color;
        EnumC34553b shape;
        PointShape pointShape;
        PointSize pointSize;
        AbstractC22676k.m65750j(linePointStyle, "linePointStyle");
        if ((linePointTheme != null ? linePointTheme.getPointVisibility() : null) == PointVisibility.NONE) {
            return null;
        }
        C34554c c34554cM32152a = m32152a(linePointStyle);
        if (c34554cM32152a == null) {
            c34554cM32152a = linePointTheme != null ? new C34554c(null, 0.0f, null, 7, null) : null;
            if (c34554cM32152a == null) {
                return null;
            }
        }
        if (linePointTheme == null || (color = linePointTheme.getPointColor()) == null) {
            color = c34554cM32152a.getColor();
        }
        float size = (linePointTheme == null || (pointSize = linePointTheme.getPointSize()) == null) ? c34554cM32152a.getSize() : AbstractC11913j.m32175a(pointSize);
        if (linePointTheme == null || (pointShape = linePointTheme.getPointShape()) == null || (shape = m32154c(pointShape)) == null) {
            shape = c34554cM32152a.getShape();
        }
        return c34554cM32152a.m109237a(color, size, shape);
    }

    /* JADX INFO: renamed from: c */
    private static final EnumC34553b m32154c(PointShape pointShape) {
        int i13 = a.f38956a[pointShape.ordinal()];
        if (i13 == 1) {
            return EnumC34553b.CIRCLE;
        }
        if (i13 == 2) {
            return EnumC34553b.DOT;
        }
        if (i13 == 3) {
            return EnumC34553b.SQUARE;
        }
        if (i13 == 4) {
            return EnumC34553b.DIAMOND;
        }
        throw new NoWhenBranchMatchedException();
    }
}
