package to1;

import ad3.AbstractC0757c;
import am2.C1023i0;
import bq1.C3549a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.FabMenuModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.BackToTodayModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CalendarTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CurrentCycleTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CycleJournalItemModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CycleJournalTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternButtonModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternType;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.GraphButton;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogDataButtonModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LoggedDataModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LoggedDataStyle;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciHeaderModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciMedicalDisclaimerModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciTileSectionModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciTrendsGraphModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MenstrualPhaseStateSection;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PossibleSymptomsCardModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.TileWithTitleModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.TypicalCycleStat;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.TypicalCycleTileModel;
import com.whoop.hormonalinsights.naturalcycles.domain.models.NaturalCyclesFertilityCardModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import d13.AbstractC11478a;
import f11.C14005e;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h51.C16934f;
import h91.C17027b;
import hy0.C17731c2;
import hy0.C17750h1;
import hy0.EnumC17753i0;
import j61.C21374h;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m81.C25232g;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import np1.C27025c;
import np1.C27033k;
import oo1.AbstractC28062h;
import p181h2.C16618c;
import p392p3.C28761b0;
import p459rf.C31345p;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23690p1;
import p716lb1.AbstractC23707s0;
import p716lb1.AbstractC23713t0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import so1.C32802a;
import so1.C32804b;
import so1.C32806c;
import so1.C32808d;
import so1.C32809d0;
import so1.C32810e;
import so1.C32811e0;
import so1.C32821j0;
import so1.C32825l0;
import so1.C32826m;
import so1.C32827m0;
import so1.C32828n;
import so1.C32829n0;
import so1.C32835s;
import so1.C32837u;
import so1.C32841y;
import so1.C32842z;
import vb1.AbstractC35869b;
import wo1.C37439b0;
import wo1.C37440c;
import wo1.C37448g;
import wo1.C37463n0;
import xn1.AbstractC38480c;
import yo1.C39691d;

/* JADX INFO: renamed from: to1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\"\u001a\u00020!*\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Llb1/z0;", "Lad3/c;", "json", "Loo1/h$a;", "graphLocalState", "", "hideSectionTitle", "Ljb1/a;", "sectionItemsReducer", "isMciTrendTileV2Enabled", "Ll83/a0;", "x", "(Llb1/z0;Lad3/c;Loo1/h$a;ZLjb1/a;Z)V", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "", "index", "isMciCalendarCodeSeparationFFOn", "O", "(Lad3/c;Lh91/b;Ljava/lang/Integer;Loo1/h$a;ZZZ)Ljb1/a;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;", "content", "", "cycleId", "trendId", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;", "V", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;", "reducer", "Ly81/f;", "legendTextColor", "Lso1/d0;", "Z", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;Ljb1/a;Ly81/f;)Lso1/d0;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalItemModel;", "Lwo1/c;", "a0", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalItemModel;)Lwo1/c;", "a", "Ljb1/a;", "mciTileSectionItemsReducer", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34019l {

    /* JADX INFO: renamed from: a */
    private static final C21535a f142592a = AbstractC21537c.m60554d(new C34015h(8));

    /* JADX INFO: renamed from: to1.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142593w;

        public a(Function1 function1) {
            this.f142593w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142593w.invoke((DailyTickMarkPlotModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142594w;

        public b(Function1 function1) {
            this.f142594w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142594w.invoke((PhaseCoachingTileModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142595w;

        public c(Function1 function1) {
            this.f142595w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142595w.invoke((MciTileSectionModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142596w;

        public d(Function1 function1) {
            this.f142596w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142596w.invoke((PossibleSymptomsCardModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142597w;

        public e(Function1 function1) {
            this.f142597w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142597w.invoke((NaturalCyclesFertilityCardModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142598w;

        public f(Function1 function1) {
            this.f142598w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142598w.invoke((CycleJournalTileModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142599w;

        public g(Function1 function1) {
            this.f142599w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142599w.invoke((CyclePatternTileModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142600w;

        public h(Function1 function1) {
            this.f142600w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142600w.invoke((HormonalInsightsLoaderModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142601w;

        public i(Function1 function1) {
            this.f142601w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142601w.invoke((MciMedicalDisclaimerModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142602w;

        public j(Function1 function1) {
            this.f142602w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142602w.invoke((TypicalCycleTileModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142603w;

        public k(Function1 function1) {
            this.f142603w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142603w.invoke((CurrentCycleTileModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142604w;

        public l(Function1 function1) {
            this.f142604w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142604w.invoke((MciHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142605w;

        public m(Function1 function1) {
            this.f142605w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142605w.invoke((LogDataButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142606w;

        public n(Function1 function1) {
            this.f142606w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142606w.invoke((TileWithTitleModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C21395c c21395c = (C21395c) it;
            C21374h plane = c21395c.getPlane();
            return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : new C16618c(0.02f, 0.04f, 0.02f, 0.04f), (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: to1.l$p */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class p {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f142607a;

        static {
            int[] iArr = new int[LoggedDataStyle.values().length];
            try {
                iArr[LoggedDataStyle.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggedDataStyle.OVULATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggedDataStyle.PERIOD_LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggedDataStyle.PERIOD_MEDIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoggedDataStyle.PERIOD_HEAVY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f142607a = iArr;
        }
    }

    /* JADX INFO: renamed from: to1.l$q */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C16934f.m47677b((C16934f) it, null, null, null, null, null, null, false, false, null, null, null, null, false, 8063, null);
        }
    }

    /* JADX INFO: renamed from: to1.l$r */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142608w;

        public r(Function1 function1) {
            this.f142608w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142608w.invoke((CalendarTileModel) it);
        }
    }

    /* JADX INFO: renamed from: to1.l$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f142609w;

        public s(Function1 function1) {
            this.f142609w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f142609w.invoke((CycleJournalTileModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C37448g m107518A(CycleJournalTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<CycleJournalItemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(m107545a0((CycleJournalItemModel) it.next()));
        }
        return new C37448g(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C14005e m107519B(DailyTickMarkPlotModel model) {
        AbstractC22676k.m65750j(model, "model");
        return C14005e.m39876b(AbstractC23713t0.m69422a(model), null, false, false, null, null, false, false, 0.0f, 0.0f, false, null, null, 4093, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C32811e0 m107520C(PhaseCoachingTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitleDisplay());
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        List<MenstrualPhaseStateSection> stats = model.getStats();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(stats, 10));
        for (MenstrualPhaseStateSection menstrualPhaseStateSection : stats) {
            arrayList.add(new C32821j0(AbstractC8693b.m21278l(menstrualPhaseStateSection.getTitleDisplay()), AbstractC16315n0.m46376a(menstrualPhaseStateSection.getIcon()), new C17731c2(AbstractC8693b.m21278l(menstrualPhaseStateSection.getTrend().getTitleDisplay()), menstrualPhaseStateSection.getTrend().getBackgroundEnabled(), menstrualPhaseStateSection.getTrend().getTrend(), false, AbstractC16315n0.m46377b(menstrualPhaseStateSection.getTrend().getIcon()), null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null)));
        }
        return new C32811e0(textResourceM21278l, textResourceM21278l2, cVar, arrayList, model.getDestination(), model.getAnalyticEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C37439b0 m107521D(C21535a c21535a, MciTileSectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        String subtitle = model.getSubtitle();
        List<DesignSystemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(c21535a.m60541h((DesignSystemModel) it.next()));
        }
        return new C37439b0(title, subtitle, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C37463n0 m107522E(PossibleSymptomsCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String title = model.getTitle();
        List<TagModel> symptomsTags = model.getSymptomsTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(symptomsTags, 10));
        Iterator<T> it = symptomsTags.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h((TagModel) it.next());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TagState");
            arrayList.add((C17750h1) interfaceC25312uM60541h);
        }
        String rightIcon = model.getRightIcon();
        return new C37463n0(title, arrayList, rightIcon != null ? AbstractC16315n0.m46377b(rightIcon) : null, model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C39691d m107523F(AbstractC0757c abstractC0757c, NaturalCyclesFertilityCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String cardTitle = model.getCardTitle();
        String icon = model.getIcon();
        String title = model.getTitle();
        String subtitle = model.getSubtitle();
        String description = model.getDescription();
        ImpactModel trend = model.getTrend();
        return new C39691d(cardTitle, icon, title, subtitle, description, trend != null ? new C17731c2(AbstractC8693b.m21278l(trend.getTitleDisplay()), trend.getBackgroundEnabled(), trend.getTrend(), false, AbstractC16315n0.m46377b(trend.getIcon()), null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null) : null, GenericInteractionDecoderKt.toDecodedGenericInteraction(model.getInteraction(), abstractC0757c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C32810e m107524G(AbstractC0757c abstractC0757c, C21535a c21535a, CyclePatternTileModel model) {
        AnalyticEventModel analyticEvent;
        CyclePatternType cyclePatternType;
        C32808d c32808d;
        DecodedGenericInteraction decodedGenericInteraction;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        String type = model.getType();
        CyclePatternType cyclePatternType2 = CyclePatternType.YOUR_CYCLES;
        CyclePatternType[] cyclePatternTypeArrValues = CyclePatternType.values();
        int length = cyclePatternTypeArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            analyticEvent = null;
            if (i14 >= length) {
                cyclePatternType = null;
                break;
            }
            cyclePatternType = cyclePatternTypeArrValues[i14];
            if (AbstractC22676k.m65745e(cyclePatternType.name(), type)) {
                break;
            }
            i14++;
        }
        if (cyclePatternType != null) {
            cyclePatternType2 = cyclePatternType;
        }
        List<DailyTickMarkPlotModel> cycles = model.getCycles();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cycles, 10));
        Iterator<T> it = cycles.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC23713t0.m69422a((DailyTickMarkPlotModel) it.next()));
        }
        boolean showDividers = model.getShowDividers();
        Integer todayIndex = model.getTodayIndex();
        CyclePatternButtonModel button = model.getButton();
        if (button != null) {
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(button.getButtonTitle());
            String buttonIcon = button.getButtonIcon();
            if (buttonIcon == null) {
                enumC16313m0 = null;
                break;
            }
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues.length;
            while (true) {
                if (i13 >= length2) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), buttonIcon)) {
                    break;
                }
                i13++;
            }
            c32808d = new C32808d(textResourceM21278l2, enumC16313m0, button.getButtonDestination(), button.getAnalyticEvent());
        } else {
            c32808d = null;
        }
        DesignSystemModel emptyState = model.getEmptyState();
        InterfaceC25312u interfaceC25312uM60541h = emptyState != null ? c21535a.m60541h(emptyState) : null;
        GenericInteraction genericInteraction = model.getGenericInteraction();
        GenericInteraction genericInteraction2 = model.getGenericInteraction();
        if (genericInteraction2 != null && (decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteraction2, abstractC0757c)) != null) {
            analyticEvent = decodedGenericInteraction.getAnalyticEvent();
        }
        return new C32810e(textResourceM21278l, cyclePatternType2, arrayList, todayIndex, showDividers, c32808d, interfaceC25312uM60541h, genericInteraction, analyticEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C32826m m107525H(HormonalInsightsLoaderModel model) {
        TextResource c8688b;
        AbstractC22676k.m65750j(model, "model");
        boolean zIsPresented = model.isPresented();
        String text = model.getText();
        if (text == null || (c8688b = AbstractC8693b.m21278l(text)) == null) {
            c8688b = new TextResource.C8688b(AbstractC38480c.f164875v, null, 2, null);
        }
        return new C32826m(zIsPresented, c8688b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C32842z m107526I(MciMedicalDisclaimerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C32842z(AbstractC8693b.m21278l(model.getTopTitle()), AbstractC8693b.m21278l(model.getTopContent()), AbstractC8693b.m21278l(model.getBottomTitle()), AbstractC8693b.m21278l(model.getBottomContent()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C32829n0 m107527J(boolean z4, TypicalCycleTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getTileTitleDisplay());
        List<TypicalCycleStat> stats = model.getStats();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(stats, 10));
        for (TypicalCycleStat typicalCycleStat : stats) {
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(typicalCycleStat.getTitleDisplay());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(typicalCycleStat.getValueDisplay());
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(typicalCycleStat.getVariance());
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(typicalCycleStat.getUnits());
            ImpactModel trend = typicalCycleStat.getTrend();
            arrayList.add(new C32827m0(textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, trend != null ? new C17731c2(AbstractC8693b.m21278l(trend.getTitleDisplay()), trend.getBackgroundEnabled(), trend.getTrend(), false, AbstractC16315n0.m46377b(trend.getIcon()), null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null) : null));
        }
        return new C32829n0(textResourceM21278l, textResourceM21278l2, arrayList, model.getInfoDestination(), !z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C32806c m107528K(boolean z4, boolean z13, AbstractC28062h.a aVar, C21535a c21535a, CurrentCycleTileModel model) {
        String selectedButtonId;
        String segmentedControlDisplayId;
        GraphModel graph;
        String str;
        Map linkedHashMap;
        String str2;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        List<GraphButton> buttons = model.getButtons();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(buttons, 10));
        for (GraphButton graphButton : buttons) {
            String buttonId = graphButton.getButtonId();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(graphButton.getLabel());
            String icon = graphButton.getIcon();
            if (icon != null) {
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC16313m1 = null;
                        break;
                    }
                    EnumC16313m0 enumC16313m2 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                        enumC16313m1 = enumC16313m2;
                        break;
                    }
                    i13++;
                }
                enumC16313m0 = enumC16313m1;
            } else {
                enumC16313m0 = null;
            }
            arrayList.add(new C25232g(buttonId, enumC16313m0, textResourceM21278l, null, 8, null));
        }
        List<SegmentControlDisplay> segmentedControlDisplays = model.getSegmentedControlDisplays();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(segmentedControlDisplays, 10));
        for (SegmentControlDisplay segmentControlDisplay : segmentedControlDisplays) {
            arrayList2.add(new C27033k(segmentControlDisplay.getNameDisplay(), segmentControlDisplay.getId()));
        }
        List arrayList3 = C25271y.f99162w;
        if (!z4) {
            if (aVar == null || (selectedButtonId = aVar.getTrendId()) == null) {
                selectedButtonId = model.getSelectedButtonId();
            }
            String str3 = selectedButtonId;
            if (aVar == null || (segmentedControlDisplayId = aVar.getCycleId()) == null) {
                segmentedControlDisplayId = model.getSegmentedControlDisplayId();
            }
            String str4 = segmentedControlDisplayId;
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getTitleDisplay());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getDescriptionDisplay());
            Map<String, String> bottomLabels = model.getBottomLabels();
            TextResource textResourceM21278l4 = (bottomLabels == null || (str = bottomLabels.get(str4)) == null) ? null : AbstractC8693b.m21278l(str);
            MciTrendsGraphModel mciTrendsGraphModelM107539V = m107539V(model, str4, str3);
            if (mciTrendsGraphModelM107539V != null) {
                List<GraphLegendModel> graphLegends = mciTrendsGraphModelM107539V.getGraphLegends();
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(graphLegends, 10));
                Iterator<T> it = graphLegends.iterator();
                while (it.hasNext()) {
                    arrayList3.add(AbstractC35869b.m113880z((GraphLegendModel) it.next(), enumC39333f));
                }
            }
            MciTrendsGraphModel mciTrendsGraphModelM107539V2 = m107539V(model, str4, str3);
            C9598e destination = mciTrendsGraphModelM107539V2 != null ? mciTrendsGraphModelM107539V2.getDestination() : null;
            MciTrendsGraphModel mciTrendsGraphModelM107539V3 = m107539V(model, str4, str3);
            InterfaceC25312u interfaceC25312uM60544l = (mciTrendsGraphModelM107539V3 == null || (graph = mciTrendsGraphModelM107539V3.getGraph()) == null) ? null : c21535a.m60544l(graph);
            return new C32806c(textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, arrayList, str3, str4, arrayList2, arrayList3, destination, interfaceC25312uM60544l instanceof C21395c ? (C21395c) interfaceC25312uM60544l : null, null, null, null, false, !z13, 7168, null);
        }
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(model.getTitleDisplay());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(model.getDescriptionDisplay());
        Map<String, String> bottomLabels2 = model.getBottomLabels();
        TextResource textResourceM21278l7 = (bottomLabels2 == null || (str2 = bottomLabels2.get(model.getSegmentedControlDisplayId())) == null) ? null : AbstractC8693b.m21278l(str2);
        String selectedButtonId2 = model.getSelectedButtonId();
        String segmentedControlDisplayId2 = model.getSegmentedControlDisplayId();
        Map<String, MciTrendsGraphModel> currentCycleGraphs = model.getCurrentCycleGraphs();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(currentCycleGraphs.size()));
        Iterator<T> it3 = currentCycleGraphs.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap2.put(entry.getKey(), m107543Z((MciTrendsGraphModel) entry.getValue(), c21535a, enumC39333f));
        }
        Map<String, MciTrendsGraphModel> lastSixCycleGraphs = model.getLastSixCycleGraphs();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(lastSixCycleGraphs.size()));
        Iterator<T> it4 = lastSixCycleGraphs.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it4.next();
            linkedHashMap3.put(entry2.getKey(), m107543Z((MciTrendsGraphModel) entry2.getValue(), c21535a, enumC39333f));
        }
        Map<String, String> bottomLabels3 = model.getBottomLabels();
        if (bottomLabels3 != null) {
            linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(bottomLabels3.size()));
            Iterator<T> it5 = bottomLabels3.entrySet().iterator();
            while (it5.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it5.next();
                linkedHashMap.put(entry3.getKey(), AbstractC8693b.m21278l((String) entry3.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = C25272z.f99163w;
        }
        return new C32806c(textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, arrayList, selectedButtonId2, segmentedControlDisplayId2, arrayList2, arrayList3, null, null, linkedHashMap2, linkedHashMap3, linkedHashMap, true, !z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C32841y m107529L(MciHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitleDisplay());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getDescriptionDisplay());
        String style = model.getStyle();
        CyclePhaseStyle cyclePhaseStyle = null;
        if (style != null) {
            CyclePhaseStyle cyclePhaseStyle2 = CyclePhaseStyle.NO_PHASE;
            for (CyclePhaseStyle cyclePhaseStyle3 : CyclePhaseStyle.values()) {
                if (AbstractC22676k.m65745e(cyclePhaseStyle3.name(), style)) {
                    cyclePhaseStyle = cyclePhaseStyle3;
                    break;
                }
            }
            if (cyclePhaseStyle == null) {
                cyclePhaseStyle = cyclePhaseStyle2;
            }
        }
        return new C32841y(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, AbstractC23707s0.m69376a(cyclePhaseStyle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: M */
    public static final C32835s m107530M(LogDataButtonModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        ?? arrayList;
        LoggedDataStyle loggedDataStyle;
        EnumC39333f enumC39333f;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String titleIcon = model.getTitleIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.MENSTRUAL_CYCLE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), titleIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m2 = enumC16313m0;
        }
        String fabIcon = model.getFabIcon();
        EnumC16313m0 enumC16313m3 = EnumC16313m0.ADD;
        EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
        int length2 = enumC16313m0ArrValues2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues2[i14];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), fabIcon)) {
                break;
            }
            i14++;
        }
        if (enumC16313m1 != null) {
            enumC16313m3 = enumC16313m1;
        }
        List<LoggedDataModel> loggedDataStates = model.getLoggedDataStates();
        if (loggedDataStates != null) {
            List<LoggedDataModel> list = loggedDataStates;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (LoggedDataModel loggedDataModel : list) {
                String style = loggedDataModel.getStyle();
                LoggedDataStyle loggedDataStyle2 = LoggedDataStyle.NONE;
                LoggedDataStyle[] loggedDataStyleArrValues = LoggedDataStyle.values();
                int length3 = loggedDataStyleArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length3) {
                        loggedDataStyle = null;
                        break;
                    }
                    loggedDataStyle = loggedDataStyleArrValues[i15];
                    if (AbstractC22676k.m65745e(loggedDataStyle.name(), style)) {
                        break;
                    }
                    i15++;
                }
                if (loggedDataStyle != null) {
                    loggedDataStyle2 = loggedDataStyle;
                }
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(loggedDataModel.getDisplay());
                int i16 = p.f142607a[loggedDataStyle2.ordinal()];
                if (i16 == 1) {
                    enumC39333f = EnumC39333f.BRAND_WHITE;
                } else if (i16 == 2) {
                    enumC39333f = EnumC39333f.SURFACE_MCI_OVULATORY;
                } else {
                    if (i16 != 3 && i16 != 4 && i16 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enumC39333f = EnumC39333f.SURFACE_MCI_MENSTRUAL;
                }
                arrayList.add(new C32837u(textResourceM21278l2, enumC39333f));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return new C32835s(textResourceM21278l, enumC16313m2, enumC16313m3, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C32825l0 m107531N(TileWithTitleModel model) {
        AbstractC22676k.m65750j(model, "model");
        EnumC16313m0 enumC16313m0 = null;
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String titleDisplay = model.getTitleDisplay();
        InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h(model.getTile());
        String buttonIcon = model.getInfoButton().getButtonIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_ATTENTION;
        for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m2.name(), buttonIcon)) {
                enumC16313m0 = enumC16313m2;
                break;
            }
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new C32825l0(titleDisplay, interfaceC25312uM60541h, new C32828n(model.getInfoButton().getButtonDestination(), enumC16313m1), model.getShowTileBackground());
    }

    /* JADX INFO: renamed from: O */
    public static final C21535a m107532O(AbstractC0757c json, C17027b<CalendarDateModel> calendarDomainState, Integer num, AbstractC28062h.a aVar, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
        return AbstractC21537c.m60554d(new C34018k(json, aVar, z13, AbstractC21537c.m60554d(new C34014g(json, aVar, z13, z14, 0)), z14, calendarDomainState, num, z4, 0));
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ C21535a m107533P(AbstractC0757c abstractC0757c, C17027b c17027b, Integer num, AbstractC28062h.a aVar, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z4 = false;
        }
        if ((i13 & 32) != 0) {
            z13 = false;
        }
        if ((i13 & 64) != 0) {
            z14 = false;
        }
        return m107532O(abstractC0757c, c17027b, num, aVar, z4, z13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m107534Q(AbstractC0757c abstractC0757c, AbstractC28062h.a aVar, boolean z4, boolean z13, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C34014g(abstractC0757c, aVar, z4, z13, 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m107535R(AbstractC0757c abstractC0757c, AbstractC28062h.a aVar, boolean z4, boolean z13, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        m107569y(addModelMapper, abstractC0757c, aVar, z4, null, z13, 8, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m107536S(AbstractC0757c abstractC0757c, AbstractC28062h.a aVar, boolean z4, C21535a c21535a, boolean z13, C17027b c17027b, Integer num, boolean z14, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C34018k(abstractC0757c, aVar, z4, c21535a, z13, c17027b, num, z14, 1));
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16934f.class), new q());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m107537T(AbstractC0757c abstractC0757c, AbstractC28062h.a aVar, boolean z4, C21535a c21535a, boolean z13, C17027b c17027b, Integer num, boolean z14, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        m107568x(addModelMapper, abstractC0757c, aVar, z4, c21535a, z13);
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CalendarTileModel.class), new r(new C1023i0(c17027b, num, z14, 13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C32804b m107538U(C17027b c17027b, Integer num, boolean z4, CalendarTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        String nextDateTime = model.getDatePicker().getNextDateTime();
        if (nextDateTime == null) {
            nextDateTime = "";
        }
        TextResource textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, model.getDatePicker().getCurrentDateRange(), "toUpperCase(...)");
        String prevDateTime = model.getDatePicker().getPrevDateTime();
        C27025c c27025c = new C27025c(nextDateTime, prevDateTime != null ? prevDateTime : "", textResourceM30853e);
        BackToTodayModel backToToday = model.getBackToToday();
        C32802a c32802a = backToToday != null ? new C32802a(backToToday.getTitle(), backToToday.getIcon()) : null;
        List<GraphLegendModel> calendarKey = model.getCalendar().getCalendarKey();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(calendarKey, 10));
        Iterator<T> it = calendarKey.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC35869b.m113880z((GraphLegendModel) it.next(), EnumC39333f.WHITE_70));
        }
        C17027b c17027bM48073b = C17027b.m48073b(c17027b, null, null, null, null, null, 0, false, arrayList, 0, 383, null);
        EnumC17753i0 enumC17753i0 = EnumC17753i0.BACKEND_DRIVEN;
        FabMenuModel fabMenu = model.getFabMenu();
        return new C32804b(c27025c, c32802a, num, c17027bM48073b, enumC17753i0, fabMenu != null ? AbstractC23690p1.m69224f(fabMenu) : null, z4);
    }

    /* JADX INFO: renamed from: V */
    private static final MciTrendsGraphModel m107539V(CurrentCycleTileModel currentCycleTileModel, String str, String str2) {
        if (AbstractC22676k.m65745e(str, "CURRENT_CYCLE")) {
            return currentCycleTileModel.getCurrentCycleGraphs().get(str2);
        }
        if (AbstractC22676k.m65745e(str, "LAST_SIX_CYCLE")) {
            return currentCycleTileModel.getLastSixCycleGraphs().get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m107540W(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C34015h(9));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m107541X(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CycleJournalTileModel.class), new s(new C34015h(7)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C37448g m107542Y(CycleJournalTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<CycleJournalItemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(m107545a0((CycleJournalItemModel) it.next()));
        }
        return new C37448g(arrayList);
    }

    /* JADX INFO: renamed from: Z */
    private static final C32809d0 m107543Z(MciTrendsGraphModel mciTrendsGraphModel, C21535a c21535a, EnumC39333f enumC39333f) {
        GraphModel graph = mciTrendsGraphModel.getGraph();
        InterfaceC25312u interfaceC25312uM60544l = graph != null ? c21535a.m60544l(graph) : null;
        C21395c c21395c = interfaceC25312uM60544l instanceof C21395c ? (C21395c) interfaceC25312uM60544l : null;
        List<GraphLegendModel> graphLegends = mciTrendsGraphModel.getGraphLegends();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(graphLegends, 10));
        Iterator<T> it = graphLegends.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC35869b.m113880z((GraphLegendModel) it.next(), enumC39333f));
        }
        return new C32809d0(c21395c, arrayList, mciTrendsGraphModel.getDestination());
    }

    /* JADX INFO: renamed from: a0 */
    private static final C37440c m107545a0(CycleJournalItemModel cycleJournalItemModel) {
        ArrayList arrayList = null;
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String title = cycleJournalItemModel.getTitle();
        List<TagModel> tags = cycleJournalItemModel.getTags();
        if (tags != null) {
            List<TagModel> list = tags;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h((TagModel) it.next());
                AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TagState");
                arrayList.add((C17750h1) interfaceC25312uM60541h);
            }
        }
        ArrayList arrayList2 = arrayList;
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(cycleJournalItemModel.getRightIcon());
        Boolean boolIsEnabled = cycleJournalItemModel.isEnabled();
        return new C37440c(title, arrayList2, enumC16313m0M46377b, boolIsEnabled != null ? boolIsEnabled.booleanValue() : true, cycleJournalItemModel.getDestination(), cycleJournalItemModel.getAction(), cycleJournalItemModel.getAnalyticsModel());
    }

    /* JADX INFO: renamed from: x */
    public static final void m107568x(C23749z0 c23749z0, AbstractC0757c json, final AbstractC28062h.a aVar, final boolean z4, C21535a sectionItemsReducer, final boolean z13) {
        AbstractC22676k.m65750j(c23749z0, "<this>");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(sectionItemsReducer, "sectionItemsReducer");
        final C21535a c21535aM60554d = AbstractC21537c.m60554d(new C34015h(10));
        C34015h c34015h = new C34015h(1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(CycleJournalTileModel.class), new f(c34015h));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(CyclePatternTileModel.class), new g(new C28761b0(11, json, c21535aM60554d)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(HormonalInsightsLoaderModel.class), new h(new C34015h(2)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(MciMedicalDisclaimerModel.class), new i(new C34015h(3)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(TypicalCycleTileModel.class), new j(new Function1() { // from class: to1.i
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC34019l.m107527J(z4, (TypicalCycleTileModel) obj);
            }
        }));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(CurrentCycleTileModel.class), new k(new Function1() { // from class: to1.j
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC34019l.m107528K(z13, z4, aVar, c21535aM60554d, (CurrentCycleTileModel) obj);
            }
        }));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(MciHeaderModel.class), new l(new C34015h(4)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(LogDataButtonModel.class), new m(new C34015h(5)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(TileWithTitleModel.class), new n(new C34015h(6)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(DailyTickMarkPlotModel.class), new a(new C34015h(11)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(PhaseCoachingTileModel.class), new b(new C34015h(12)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(MciTileSectionModel.class), new c(new C31345p(sectionItemsReducer, 3)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(PossibleSymptomsCardModel.class), new d(new C34015h(0)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(NaturalCyclesFertilityCardModel.class), new e(new C3549a(json, 2)));
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m107569y(C23749z0 c23749z0, AbstractC0757c abstractC0757c, AbstractC28062h.a aVar, boolean z4, C21535a c21535a, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            aVar = null;
        }
        AbstractC28062h.a aVar2 = aVar;
        boolean z14 = (i13 & 4) != 0 ? false : z4;
        if ((i13 & 8) != 0) {
            c21535a = f142592a;
        }
        m107568x(c23749z0, abstractC0757c, aVar2, z14, c21535a, (i13 & 16) != 0 ? false : z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m107570z(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21395c.class), new o());
        return C23454a0.f92919a;
    }
}
