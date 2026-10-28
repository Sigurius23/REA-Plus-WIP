package xb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.graph.plot.GraphPlotLabelStyle;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: xb1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;", "graphPlotLabelStyle", "Ly81/e;", "a", "(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38163b {

    /* JADX INFO: renamed from: xb1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f163426a;

        static {
            int[] iArr = new int[GraphPlotLabelStyle.values().length];
            try {
                iArr[GraphPlotLabelStyle.BIOMARKER_NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GraphPlotLabelStyle.BIOMARKER_NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GraphPlotLabelStyle.BIOMARKER_SUFFICIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GraphPlotLabelStyle.BIOMARKER_POSITIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GraphPlotLabelStyle.FAT_MASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GraphPlotLabelStyle.HOURS_OF_SLEEP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GraphPlotLabelStyle.MANUAL_ENTRY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GraphPlotLabelStyle.LEAN_MASS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GraphPlotLabelStyle.RECOVERY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GraphPlotLabelStyle.RECOVERY_HIGH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GraphPlotLabelStyle.RECOVERY_LOW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GraphPlotLabelStyle.RECOVERY_MEDIUM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[GraphPlotLabelStyle.SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[GraphPlotLabelStyle.SLEEP_FAILED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[GraphPlotLabelStyle.SLEEP_NEED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[GraphPlotLabelStyle.STRAIN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[GraphPlotLabelStyle.STRAIN_FAILED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[GraphPlotLabelStyle.STRESS_LOW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[GraphPlotLabelStyle.STRESS_MEDIUM.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[GraphPlotLabelStyle.STRESS_HIGH.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f163426a = iArr;
        }
    }

    /* JADX INFO: renamed from: xb1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f163427w = new b();

        /* JADX INFO: renamed from: a */
        public final long m122238a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122238a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f163428w = new c();

        /* JADX INFO: renamed from: a */
        public final long m122239a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122239a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f163429w = new d();

        /* JADX INFO: renamed from: a */
        public final long m122240a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122240a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f163430w = new e();

        /* JADX INFO: renamed from: a */
        public final long m122241a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122241a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f163431w = new f();

        /* JADX INFO: renamed from: a */
        public final long m122242a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.5f, whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122242a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f163432w = new g();

        /* JADX INFO: renamed from: a */
        public final long m122243a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122243a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f163433w = new h();

        /* JADX INFO: renamed from: a */
        public final long m122244a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122244a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$i */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f163434w = new i();

        /* JADX INFO: renamed from: a */
        public final long m122245a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.5f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122245a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f163435w = new j();

        /* JADX INFO: renamed from: a */
        public final long m122246a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122246a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$k */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f163436w = new k();

        /* JADX INFO: renamed from: a */
        public final long m122247a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122247a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$l */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f163437w = new l();

        /* JADX INFO: renamed from: a */
        public final long m122248a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122248a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$m */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f163438w = new m();

        /* JADX INFO: renamed from: a */
        public final long m122249a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122249a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$n */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f163439w = new n();

        /* JADX INFO: renamed from: a */
        public final long m122250a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122250a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$o */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f163440w = new o();

        /* JADX INFO: renamed from: a */
        public final long m122251a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122251a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$p */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f163441w = new p();

        /* JADX INFO: renamed from: a */
        public final long m122252a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSufficientTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122252a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$q */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f163442w = new q();

        /* JADX INFO: renamed from: a */
        public final long m122253a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122253a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$r */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f163443w = new r();

        /* JADX INFO: renamed from: a */
        public final long m122254a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122254a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$s */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f163444w = new s();

        /* JADX INFO: renamed from: a */
        public final long m122255a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122255a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$t */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f163445w = new t();

        /* JADX INFO: renamed from: a */
        public final long m122256a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepAwake();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122256a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$u */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f163446w = new u();

        /* JADX INFO: renamed from: a */
        public final long m122257a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122257a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xb1.b$v */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f163447w = new v();

        /* JADX INFO: renamed from: a */
        public final long m122258a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122258a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39332e m122237a(GraphPlotLabelStyle graphPlotLabelStyle) {
        AbstractC22676k.m65750j(graphPlotLabelStyle, "graphPlotLabelStyle");
        switch (a.f163426a[graphPlotLabelStyle.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(l.f163437w);
            case 2:
                return p745y81.Function1.m125323a(o.f163440w);
            case 3:
                return p745y81.Function1.m125323a(p.f163441w);
            case 4:
                return p745y81.Function1.m125323a(q.f163442w);
            case 5:
                return p745y81.Function1.m125323a(r.f163443w);
            case 6:
                return p745y81.Function1.m125323a(s.f163444w);
            case 7:
                return p745y81.Function1.m125323a(t.f163445w);
            case 8:
                return p745y81.Function1.m125323a(u.f163446w);
            case 9:
                return p745y81.Function1.m125323a(v.f163447w);
            case 10:
                return p745y81.Function1.m125323a(b.f163427w);
            case 11:
                return p745y81.Function1.m125323a(c.f163428w);
            case 12:
                return p745y81.Function1.m125323a(d.f163429w);
            case 13:
                return p745y81.Function1.m125323a(e.f163430w);
            case 14:
                return p745y81.Function1.m125323a(f.f163431w);
            case 15:
                return p745y81.Function1.m125323a(g.f163432w);
            case 16:
                return p745y81.Function1.m125323a(h.f163433w);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return p745y81.Function1.m125323a(i.f163434w);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return p745y81.Function1.m125323a(j.f163435w);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return p745y81.Function1.m125323a(k.f163436w);
            case 20:
                return p745y81.Function1.m125323a(m.f163438w);
            default:
                return p745y81.Function1.m125323a(n.f163439w);
        }
    }
}
