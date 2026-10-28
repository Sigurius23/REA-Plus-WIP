package dj1;

import b30.C2656x4;
import c51.C4237n;
import c51.C4242s;
import cj1.C4745a;
import cj1.C4746b;
import cj1.C4748d;
import cj1.C4749e;
import cj1.C4753i;
import cj1.C4757m;
import cj1.C4758n;
import cj1.C4759o;
import cj1.C4760p;
import cj1.C4762r;
import cj1.C4764t;
import cj1.C4765u;
import cj1.C4766v;
import cj1.EnumC4747c;
import cj1.EnumC4761q;
import cj1.EnumC4763s;
import cj1.EnumC4767w;
import cj1.InterfaceC4751g;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DailyTickMarkWidthStyle;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.PregnancyProgressBarModel;
import com.whoop.design.models.items.PregnancyProgressLabelModel;
import com.whoop.design.models.items.PregnancyTilePlot;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.amoeba.AmoebaDomainResult;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.reducers.AmoebaViewStateReducer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.health.domain.models.CardSupplementalInfo;
import com.whoop.health.domain.models.DataVisHeaderModel;
import com.whoop.health.domain.models.DataVisualizationCardBodyModel;
import com.whoop.health.domain.models.DataVisualizationCardModel;
import com.whoop.health.domain.models.EntryPointLockedCardModel;
import com.whoop.health.domain.models.HealthspanHeroMetricModel;
import com.whoop.health.domain.models.HealthspanHeroMetricStyle;
import com.whoop.health.domain.models.HeartScreenerStatus;
import com.whoop.health.domain.models.HeartScreenerUpdatedAtInfoModel;
import com.whoop.health.domain.models.HorizontalRecordsTileFooterModel;
import com.whoop.health.domain.models.HorizontalRecordsTileModel;
import com.whoop.health.domain.models.HorizontalRecordsTileTagModel;
import com.whoop.health.domain.models.ImageVisualizationCardBodyModel;
import com.whoop.health.domain.models.ImageVisualizationTrend;
import com.whoop.health.domain.models.MenstrualCycleInsightsCardBodyModel;
import com.whoop.health.domain.models.MenstrualCycleInsightsCardFooterModel;
import com.whoop.health.domain.models.MenstrualCycleInsightsCardModel;
import com.whoop.health.domain.models.ProgressBarDescriptionCardModel;
import com.whoop.health.domain.models.ProgressPlotDescription;
import com.whoop.health.domain.models.ScreenerStatusTileBodyModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import d11.C11474i;
import dh0.C12040a;
import ej1.C13233c0;
import ej1.C13247j0;
import ej1.C13262y;
import ej1.C13263z;
import ej1.EnumC13241g0;
import f11.C14005e;
import fj1.C14532c;
import fj1.C14538i;
import fj1.C14542m;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import j02.AbstractC21170u;
import j11.EnumC21213p;
import j61.C21372f;
import j61.C21374h;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import ks0.AbstractC22820a;
import l83.C23454a0;
import lz0.AbstractC24818c;
import lz0.C24816a;
import lz0.C24817b;
import lz0.EnumC24819d;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ny0.C27256h;
import oi1.AbstractC27949a;
import or2.C28204u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23593a5;
import p716lb1.AbstractC23632g2;
import p716lb1.AbstractC23707s0;
import p716lb1.AbstractC23713t0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import ri1.InterfaceC31458g;
import rk1.AbstractC31495b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dj1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"", "isHormonalInsightsUpdatesEnabled", "Ljb1/a;", "B", "(Z)Ljb1/a;", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "heartScreenerInfo", "Lm91/u;", "u", "(Ljava/util/List;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Ljava/util/List;", "Lcom/whoop/design/models/items/CardButtonModel;", "logButton", "Lny0/h;", "Q", "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;", "Lcom/whoop/health/domain/models/DataVisHeaderModel;", "model", "Lcj1/b;", "t", "(Lcom/whoop/health/domain/models/DataVisHeaderModel;)Lcj1/b;", "", "samples", "Lj71/c;", "P", "(Ljava/util/List;)Lj71/c;", "Lri1/g$e;", "Lcj1/i$b;", "R", "(Lri1/g$e;)Lcj1/i$b;", "", "shepherdHighWaterMark", "O", "(Ljava/lang/String;)Z", "a", "Ljb1/a;", "designItemReducer", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12090c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f40251a = AbstractC21537c.m60554d(new C12040a(3));

    /* JADX INFO: renamed from: dj1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C27256h.m82144b((C27256h) it, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
        }
    }

    /* JADX INFO: renamed from: dj1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40252w;

        public b(Function1 function1) {
            this.f40252w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40252w.invoke((DataVisualizationCardBodyModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40253w;

        public c(Function1 function1) {
            this.f40253w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40253w.invoke((ImageVisualizationCardBodyModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40254w;

        public d(Function1 function1) {
            this.f40254w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40254w.invoke((ScreenerStatusTileBodyModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40255w;

        public e(Function1 function1) {
            this.f40255w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40255w.invoke((DataVisualizationCardModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40256w;

        public f(Function1 function1) {
            this.f40256w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40256w.invoke((EntryPointLockedCardModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40257w;

        public g(Function1 function1) {
            this.f40257w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40257w.invoke((ProgressBarDescriptionCardModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40258w;

        public h(Function1 function1) {
            this.f40258w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40258w.invoke((MenstrualCycleInsightsCardModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40259w;

        public i(Function1 function1) {
            this.f40259w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40259w.invoke((HorizontalRecordsTileModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40260w;

        public j(Function1 function1) {
            this.f40260w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40260w.invoke((HealthspanHeroMetricModel) it);
        }
    }

    /* JADX INFO: renamed from: dj1.c$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f40261w;

        public k(Function1 function1) {
            this.f40261w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f40261w.invoke((WhoopAgeAmoeba) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m33355A(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final C21535a m33356B(boolean z4) {
        return AbstractC21537c.m60554d(new C2656x4(z4, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m33357C(boolean z4, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C2656x4(z4, 4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m33358D(boolean z4, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C12040a c12040a = new C12040a(8);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DataVisualizationCardModel.class), new e(c12040a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(EntryPointLockedCardModel.class), new f(new C12040a(9)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ProgressBarDescriptionCardModel.class), new g(new C12040a(10)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MenstrualCycleInsightsCardModel.class), new h(new C2656x4(z4, 5)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalRecordsTileModel.class), new i(new C12040a(11)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HealthspanHeroMetricModel.class), new j(new C12040a(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C4749e m33359E(DataVisualizationCardModel model) {
        EnumC4767w enumC4767w;
        AbstractC22676k.m65750j(model, "model");
        C4746b c4746bM33392t = m33392t(model.getHeader());
        List<InterfaceC25312u> listM33393u = m33393u(model.getItems(), model.getHeartScreenerUpdatedAtInfo());
        C9598e navigation = model.getNavigation();
        C4758n c4758n = null;
        enumC4763s = null;
        EnumC4763s enumC4763s = null;
        if (AbstractC22676k.m65745e(navigation != null ? navigation.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9318g6.f27632w)) {
            navigation = null;
        }
        HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfo = model.getHeartScreenerUpdatedAtInfo();
        if (heartScreenerUpdatedAtInfo != null) {
            String shepherdHighWaterMark = heartScreenerUpdatedAtInfo.getShepherdHighWaterMark();
            String labradorHighWaterMark = heartScreenerUpdatedAtInfo.getLabradorHighWaterMark();
            String shepherdState = heartScreenerUpdatedAtInfo.getShepherdState();
            if (shepherdState == null) {
                enumC4767w = null;
                break;
            }
            EnumC4767w[] enumC4767wArrValues = EnumC4767w.values();
            int length = enumC4767wArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC4767w = null;
                    break;
                }
                enumC4767w = enumC4767wArrValues[i13];
                if (AbstractC22676k.m65745e(enumC4767w.name(), shepherdState)) {
                    break;
                }
                i13++;
            }
            String labradorState = heartScreenerUpdatedAtInfo.getLabradorState();
            if (labradorState != null) {
                for (EnumC4763s enumC4763s2 : EnumC4763s.values()) {
                    if (AbstractC22676k.m65745e(enumC4763s2.name(), labradorState)) {
                        enumC4763s = enumC4763s2;
                        break;
                    }
                }
            }
            c4758n = new C4758n(shepherdHighWaterMark, labradorHighWaterMark, enumC4767w, enumC4763s);
        }
        return new C4749e(c4746bM33392t, listM33393u, navigation, c4758n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C14532c m33360F(EntryPointLockedCardModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C12040a(13));
        String cardName = model.getCardName();
        if (cardName == null) {
            cardName = "";
        }
        String str = cardName;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String titleImage = model.getTitleImage();
        AbstractC22403o.c cVar = titleImage != null ? new AbstractC22403o.c(titleImage, 0, EnumC16313m0.WHOOP_LOGO.toWhoopIcon(), 0, 10, null) : null;
        String endIcon = model.getEndIcon();
        if (endIcon != null) {
            EnumC16313m0 enumC16313m2 = EnumC16313m0.CARET_FORWARD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), endIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m1 != null) {
                enumC16313m2 = enumC16313m1;
            }
            enumC16313m0 = enumC16313m2;
        } else {
            enumC16313m0 = null;
        }
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        String backgroundImage = model.getBackgroundImage();
        AbstractC22403o.c cVar2 = backgroundImage != null ? new AbstractC22403o.c(backgroundImage, 0, EnumC16313m0.WHOOP_LOGO.toWhoopIcon(), 0, 10, null) : null;
        String lastUpdated = model.getLastUpdated();
        TextResource textResourceM21278l3 = lastUpdated != null ? AbstractC8693b.m21278l(lastUpdated) : null;
        C9598e destination = model.getDestination();
        TagModel navigationTag = model.getNavigationTag();
        return new C14532c(str, textResourceM21278l, cVar, textResourceM21278l2, enumC16313m0, cVar2, textResourceM21278l3, destination, navigationTag != null ? c21535aM60554d.m60541h(navigationTag) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m33361G(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C14542m m33362H(ProgressBarDescriptionCardModel model) {
        EnumC16313m0 enumC16313m0;
        ArrayList arrayList;
        List<PregnancyProgressLabelModel> labels;
        List<PregnancyProgressBarModel> progressBars;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String endIcon = model.getEndIcon();
        if (endIcon != null) {
            enumC16313m0 = EnumC16313m0.CARET_FORWARD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), endIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m1 != null) {
                enumC16313m0 = enumC16313m1;
            }
        } else {
            enumC16313m0 = null;
        }
        ProgressPlotDescription body = model.getBody();
        ArrayList arrayList2 = null;
        EnumC16313m0 enumC16313m2 = enumC16313m0;
        C14538i c14538i = new C14538i(AbstractC8693b.m21278l(body.getTitle()), AbstractC8693b.m21278l(body.getMetricTitle()), AbstractC24818c.m72732h(body.getStyle()));
        PregnancyTilePlot plot = model.getPlot();
        if (plot == null || (progressBars = plot.getProgressBars()) == null) {
            arrayList = null;
        } else {
            List<PregnancyProgressBarModel> list = progressBars;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (PregnancyProgressBarModel pregnancyProgressBarModel : list) {
                EnumC39333f enumC39333fM72732h = AbstractC24818c.m72732h(pregnancyProgressBarModel.getStyle());
                float rangeMin = (float) pregnancyProgressBarModel.getRangeMin();
                float rangeMax = (float) pregnancyProgressBarModel.getRangeMax();
                Double currentValue = pregnancyProgressBarModel.getCurrentValue();
                arrayList.add(new C24816a(enumC39333fM72732h, rangeMin, rangeMax, currentValue != null ? Float.valueOf((float) currentValue.doubleValue()) : null, false));
            }
        }
        PregnancyTilePlot plot2 = model.getPlot();
        if (plot2 != null && (labels = plot2.getLabels()) != null) {
            List<PregnancyProgressLabelModel> list2 = labels;
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (PregnancyProgressLabelModel pregnancyProgressLabelModel : list2) {
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(pregnancyProgressLabelModel.getLabel());
                float xposition = (float) pregnancyProgressLabelModel.getXposition();
                EnumC24819d style = pregnancyProgressLabelModel.getStyle();
                EnumC24819d enumC24819d = EnumC24819d.INACTIVE;
                arrayList2.add(new C24817b(xposition, textResourceM21278l2, style == enumC24819d ? AbstractC24818c.m72732h(pregnancyProgressLabelModel.getStyle()) : EnumC39333f.BRAND_WHITE, pregnancyProgressLabelModel.getStyle() != enumC24819d));
            }
        }
        return new C14542m(textResourceM21278l, enumC16313m2, c14538i, null, arrayList, arrayList2, model.getDestination(), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static final C4766v m33363I(boolean z4, MenstrualCycleInsightsCardModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        CyclePhaseStyle cyclePhaseStyle;
        C17731c2 c17731c2M68791d;
        C4765u c4765u;
        EnumC16313m0 enumC16313m2;
        EnumC16313m0 enumC16313m3;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String endIcon = model.getEndIcon();
        EnumC16313m0 enumC16313m4 = EnumC16313m0.CARET_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i14];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), endIcon)) {
                break;
            }
            i14++;
        }
        if (enumC16313m0 != null) {
            enumC16313m4 = enumC16313m0;
        }
        MenstrualCycleInsightsCardBodyModel body = model.getBody();
        String title = body.getTitle();
        TextResource textResourceM21278l2 = title != null ? AbstractC8693b.m21278l(title) : null;
        String metricTitle = body.getMetricTitle();
        TextResource textResourceM21278l3 = metricTitle != null ? AbstractC8693b.m21278l(metricTitle) : null;
        String icon = body.getIcon();
        if (icon != null) {
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC16313m3 = null;
                    break;
                }
                enumC16313m3 = enumC16313m0ArrValues2[i15];
                if (AbstractC22676k.m65745e(enumC16313m3.name(), icon)) {
                    break;
                }
                i15++;
            }
            enumC16313m1 = enumC16313m3;
        } else {
            enumC16313m1 = null;
        }
        String statusText = body.getStatusText();
        TextResource textResourceM21278l4 = statusText != null ? AbstractC8693b.m21278l(statusText) : null;
        String status = body.getStatus();
        CyclePhaseStyle[] cyclePhaseStyleArrValues = CyclePhaseStyle.values();
        int length3 = cyclePhaseStyleArrValues.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length3) {
                cyclePhaseStyle = null;
                break;
            }
            cyclePhaseStyle = cyclePhaseStyleArrValues[i16];
            if (AbstractC22676k.m65745e(cyclePhaseStyle.name(), status)) {
                break;
            }
            i16++;
        }
        EnumC39333f enumC39333fM69376a = AbstractC23707s0.m69376a(cyclePhaseStyle);
        String supertitle = body.getSupertitle();
        C4764t c4764t = new C4764t(textResourceM21278l2, supertitle != null ? AbstractC8693b.m21278l(supertitle) : null, textResourceM21278l3, enumC16313m1, textResourceM21278l4, enumC39333fM69376a);
        C14005e c14005eM69422a = AbstractC23713t0.m69422a(DailyTickMarkPlotModel.copy$default(model.getGraph(), null, null, true, null, null, z4 ? DailyTickMarkWidthStyle.HEALTH_TAB_V2 : DailyTickMarkWidthStyle.HEALTH_TAB, null, null, 219, null));
        MenstrualCycleInsightsCardFooterModel footer = model.getFooter();
        if (footer != null) {
            String icon2 = footer.getIcon();
            EnumC16313m0 enumC16313m5 = EnumC16313m0.MENSTRUAL_CYCLE;
            EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
            int length4 = enumC16313m0ArrValues3.length;
            while (true) {
                if (i13 >= length4) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues3[i13];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon2)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m2 != null) {
                enumC16313m5 = enumC16313m2;
            }
            c4765u = new C4765u(enumC16313m5, AbstractC8693b.m21278l(footer.getTitle()));
            c17731c2M68791d = null;
        } else {
            c17731c2M68791d = null;
            c4765u = null;
        }
        C9598e destination = model.getDestination();
        CardButtonModel logButton = model.getLogButton();
        C27256h c27256hM33371Q = logButton != null ? m33371Q(logButton) : c17731c2M68791d;
        ImpactModel trend = model.getTrend();
        if (trend != null) {
            c17731c2M68791d = AbstractC23632g2.m68791d(trend);
        }
        return new C4766v(textResourceM21278l, enumC16313m4, c4764t, c14005eM69422a, c4765u, c27256hM33371Q, destination, c17731c2M68791d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C4762r m33364J(HorizontalRecordsTileModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22403o abstractC22403oM64503l;
        C4760p c4760p;
        EnumC16313m0 enumC16313m1;
        EnumC4761q enumC4761q;
        EnumC16313m0 enumC16313m2;
        EnumC16313m0 enumC16313m3;
        AbstractC22676k.m65750j(model, "model");
        String cardName = model.getCardName();
        String str = cardName == null ? "" : cardName;
        String cardName2 = model.getCardName();
        String str2 = cardName2 == null ? "" : cardName2;
        String endIcon = model.getEndIcon();
        if (endIcon != null) {
            enumC16313m0 = EnumC16313m0.CARET_FORWARD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m3 = null;
                    break;
                }
                enumC16313m3 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m3.name(), endIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m3 != null) {
                enumC16313m0 = enumC16313m3;
            }
        } else {
            enumC16313m0 = null;
        }
        String text = model.getBodyContent().getText();
        if (text == null) {
            text = "";
        }
        String imageUrl = model.getBodyContent().getImageUrl();
        if (imageUrl == null || (abstractC22403oM64503l = AbstractC22404p.m64503l(imageUrl)) == null) {
            abstractC22403oM64503l = AbstractC22403o.b.f87641b;
        }
        C4759o c4759o = new C4759o(text, abstractC22403oM64503l, model.getBodyContent().getPill());
        String title = model.getTitle();
        if (title == null) {
            HorizontalRecordsTileTagModel tag = model.getTag();
            title = tag != null ? tag.getTitle() : null;
        }
        HorizontalRecordsTileFooterModel footer = model.getFooter();
        if (footer != null) {
            String startTitle = footer.getStartTitle();
            if (startTitle == null) {
                startTitle = "";
            }
            String endTitle = footer.getEndTitle();
            String icon = footer.getIcon();
            if (icon != null) {
                enumC16313m1 = EnumC16313m0.TINY_ELLIPSE;
                EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
                int length2 = enumC16313m0ArrValues2.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        enumC16313m2 = null;
                        break;
                    }
                    enumC16313m2 = enumC16313m0ArrValues2[i14];
                    if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                        break;
                    }
                    i14++;
                }
                if (enumC16313m2 != null) {
                    enumC16313m1 = enumC16313m2;
                }
            } else {
                enumC16313m1 = null;
            }
            String status = footer.getStatus();
            String str3 = status != null ? status : "";
            EnumC4761q enumC4761q2 = EnumC4761q.PENDING;
            EnumC4761q[] enumC4761qArrValues = EnumC4761q.values();
            int length3 = enumC4761qArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC4761q = null;
                    break;
                }
                EnumC4761q enumC4761q3 = enumC4761qArrValues[i15];
                if (AbstractC22676k.m65745e(enumC4761q3.name(), str3)) {
                    enumC4761q = enumC4761q3;
                    break;
                }
                i15++;
            }
            if (enumC4761q != null) {
                enumC4761q2 = enumC4761q;
            }
            c4760p = new C4760p(startTitle, endTitle, enumC16313m1, enumC4761q2);
        } else {
            c4760p = null;
        }
        return new C4762r(str, str2, enumC16313m0, c4759o, title, c4760p, model.getCta(), model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C13262y m33365K(HealthspanHeroMetricModel model) {
        boolean z4;
        AbstractC22676k.m65750j(model, "model");
        List<InterfaceC25312u> listM60540g = AbstractC21537c.m60554d(new C12040a(4)).m60540g(model.getItems());
        List<InterfaceC25312u> list = listM60540g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C27256h) {
                arrayList.add(obj);
            }
        }
        C27256h c27256h = (C27256h) AbstractC25265s.m74100H0(arrayList);
        HealthspanHeroMetricStyle healthspanHeroMetricStyle = null;
        C9598e destination = c27256h != null ? c27256h.getDestination() : null;
        boolean zIsCalibrating = model.isCalibrating();
        boolean hasOnboarded = model.getHasOnboarded();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                if (((InterfaceC25312u) it.next()) instanceof C4242s) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        String style = model.getStyle();
        HealthspanHeroMetricStyle healthspanHeroMetricStyle2 = HealthspanHeroMetricStyle.UNLOCKED;
        for (HealthspanHeroMetricStyle healthspanHeroMetricStyle3 : HealthspanHeroMetricStyle.values()) {
            if (AbstractC22676k.m65745e(healthspanHeroMetricStyle3.name(), style)) {
                healthspanHeroMetricStyle = healthspanHeroMetricStyle3;
                break;
            }
        }
        return new C13262y(new C4757m(zIsCalibrating, listM60540g, hasOnboarded, healthspanHeroMetricStyle == null ? healthspanHeroMetricStyle2 : healthspanHeroMetricStyle, destination, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m33366L(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C12040a(5));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m33367M(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopAgeAmoeba.class), new k(new C12040a(6)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C4242s m33368N(WhoopAgeAmoeba amoebaModel) {
        AbstractC22676k.m65750j(amoebaModel, "amoebaModel");
        return new AmoebaViewStateReducer(new C4237n(0.0f, 0.0f, null, null, null, null, null, null, 0.0f, null, null, 2047, null).m13212p(0.75f)).reduce(new AmoebaDomainResult.Result(amoebaModel, null, null, false));
    }

    /* JADX INFO: renamed from: O */
    private static final boolean m33369O(String str) {
        DateTime dateTimeMinusDays = DateTime.now(DateTimeZone.UTC).minusDays(1);
        DateTime dateTime = null;
        if (str != null) {
            try {
                dateTime = DateTime.parse(str, C28204u.INSTANCE.m85363f());
            } catch (Exception unused) {
            }
        }
        return dateTime != null && dateTimeMinusDays.isAfter(dateTime);
    }

    /* JADX INFO: renamed from: P */
    private static final C21395c m33370P(List<Double> list) {
        List listM118959K = AbstractC37056f.m118959K(Float.valueOf(0.2f), Float.valueOf(0.4f), Float.valueOf(0.6f), Float.valueOf(0.8f));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        Iterator it = listM118959K.iterator();
        while (it.hasNext()) {
            arrayList.add(new C21372f(((Number) it.next()).floatValue(), null, null, null, null, null, null, 126, null));
        }
        return new C21395c(new C21374h(null, null, null, null, new C16618c(0.025f, 0.02f, 0.02f, 0.02f), arrayList, null, null, false, false, null, 0L, 0.0f, 8143, null), AbstractC37056f.m118958J(AbstractC31495b.m97034b(list, null, null, 6, null)), null, null, 12, null);
    }

    /* JADX INFO: renamed from: Q */
    private static final C27256h m33371Q(CardButtonModel cardButtonModel) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        TextResource title = cardButtonModel.getTitle();
        String icon = cardButtonModel.getIcon();
        if (icon != null) {
            enumC16313m0 = EnumC16313m0.ADD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m1 != null) {
                enumC16313m0 = enumC16313m1;
            }
        } else {
            enumC16313m0 = null;
        }
        C9598e destination = cardButtonModel.getDestination();
        C9598e c9598e = destination == null ? new C9598e(null, null, null, 7, null) : destination;
        AnyModal modal = cardButtonModel.getModal();
        DismissEventModel dismissEvent = cardButtonModel.getDismissEvent();
        return new C27256h(title, enumC16313m0, null, null, null, null, null, c9598e, null, null, null, null, null, false, true, null, false, false, null, modal, dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null, null, null, null, null, 31956860, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C4753i.b m33372R(InterfaceC31458g.e eVar) {
        if (!(eVar instanceof InterfaceC31458g.a)) {
            throw new NoWhenBranchMatchedException();
        }
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC22820a.f89923d);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC22820a.f89921b);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC22820a.f89922c);
        EnumC21213p enumC21213p = EnumC21213p.LOTTIE;
        InterfaceC4751g.e eVar2 = InterfaceC4751g.e.f19486a;
        return new C4753i.b(c8688bM21277k, c8688bM21277k3, null, null, c8688bM21277k2, true, true, enumC21213p, eVar2, eVar2, 12, null);
    }

    /* JADX INFO: renamed from: t */
    private static final C4746b m33392t(DataVisHeaderModel dataVisHeaderModel) {
        EnumC16313m0 enumC16313m0;
        TextResource title = dataVisHeaderModel.getTitle();
        TextResource subtitle = dataVisHeaderModel.getSubtitle();
        String icon = dataVisHeaderModel.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new C4746b(title, subtitle, enumC16313m1.toWhoopIcon());
    }

    /* JADX INFO: renamed from: u */
    private static final List<InterfaceC25312u> m33393u(List<? extends DesignSystemModel> list, HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel) {
        return AbstractC21537c.m60554d(new C12089b(heartScreenerUpdatedAtInfoModel, 0)).m60540g(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m33394v(HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27256h.class), new a());
        designItemReducer.m60547b(new C12089b(heartScreenerUpdatedAtInfoModel, 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m33395w(HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C12040a c12040a = new C12040a(7);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DataVisualizationCardBodyModel.class), new b(c12040a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImageVisualizationCardBodyModel.class), new c(new C12089b(heartScreenerUpdatedAtInfoModel, 2)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ScreenerStatusTileBodyModel.class), new d(new C12089b(heartScreenerUpdatedAtInfoModel, 3)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX INFO: renamed from: x */
    public static final C4745a m33396x(DataVisualizationCardBodyModel model) {
        C21395c c21395c;
        List<Double> trailingEcgSamples;
        C21395c c21395cM33370P;
        ImpactModel trend;
        C17731c2 c17731c2;
        CtaTileModel prefixCta;
        C4748d c4748d;
        CtaTileModel suffixCta;
        AbstractC22676k.m65750j(model, "model");
        GraphModel graph = model.getGraph();
        C4748d c4748d2 = null;
        if (graph == null) {
            CardSupplementalInfo cardSupplementalInfo = model.getCardSupplementalInfo();
            if (cardSupplementalInfo == null || (trailingEcgSamples = cardSupplementalInfo.getTrailingEcgSamples()) == null) {
                c21395c = null;
            } else {
                c21395cM33370P = !trailingEcgSamples.isEmpty() ? m33370P(trailingEcgSamples) : null;
            }
            trend = model.getTrend();
            if (trend != null) {
                c17731c2 = new C17731c2(AbstractC8693b.m21278l(trend.getTitleDisplay()), trend.getBackgroundEnabled(), trend.getTrend(), false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32752, null);
            } else {
                c17731c2 = null;
            }
            prefixCta = model.getPrefixCta();
            if (prefixCta != null) {
                C11474i c11474iM68356d0 = AbstractC23593a5.m68356d0(prefixCta);
                c4748d = new C4748d(c11474iM68356d0, EnumC4747c.INSTANCE.m14935a(c11474iM68356d0.getType()));
            } else {
                c4748d = null;
            }
            suffixCta = model.getSuffixCta();
            if (suffixCta != null) {
                C11474i c11474iM68356d1 = AbstractC23593a5.m68356d0(suffixCta);
                c4748d2 = new C4748d(c11474iM68356d1, EnumC4747c.INSTANCE.m14935a(c11474iM68356d1.getType()));
            }
            return new C4745a(AbstractC8693b.m21278l(model.getHeading()), AbstractC8693b.m21278l(model.getTitle()), c17731c2, c21395c, c4748d, c4748d2);
        }
        InterfaceC25312u interfaceC25312uM60541h = f40251a.m60541h(graph);
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphState");
        c21395cM33370P = (C21395c) interfaceC25312uM60541h;
        c21395c = c21395cM33370P;
        trend = model.getTrend();
        if (trend != null) {
            c17731c2 = new C17731c2(AbstractC8693b.m21278l(trend.getTitleDisplay()), trend.getBackgroundEnabled(), trend.getTrend(), false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32752, null);
        } else {
            c17731c2 = null;
        }
        prefixCta = model.getPrefixCta();
        if (prefixCta != null) {
            C11474i c11474iM68356d2 = AbstractC23593a5.m68356d0(prefixCta);
            c4748d = new C4748d(c11474iM68356d2, EnumC4747c.INSTANCE.m14935a(c11474iM68356d2.getType()));
        } else {
            c4748d = null;
        }
        suffixCta = model.getSuffixCta();
        if (suffixCta != null) {
            C11474i c11474iM68356d3 = AbstractC23593a5.m68356d0(suffixCta);
            c4748d2 = new C4748d(c11474iM68356d3, EnumC4747c.INSTANCE.m14935a(c11474iM68356d3.getType()));
        }
        return new C4745a(AbstractC8693b.m21278l(model.getHeading()), AbstractC8693b.m21278l(model.getTitle()), c17731c2, c21395c, c4748d, c4748d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C13233c0 m33397y(HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, ImageVisualizationCardBodyModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<ImageVisualizationTrend> listM118958J = m33369O(heartScreenerUpdatedAtInfoModel != null ? heartScreenerUpdatedAtInfoModel.getShepherdHighWaterMark() : null) ? AbstractC37056f.m118958J(new ImageVisualizationTrend(AbstractC8693b.m21277k(AbstractC27949a.f112724c), true, EnumC17727b2.NONE, null)) : model.getTrends();
        TextResource subtitle = model.getSubtitle();
        TextResource title = model.getTitle();
        List<ImageVisualizationTrend> list = listM118958J;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (ImageVisualizationTrend imageVisualizationTrend : list) {
            arrayList.add(new C17731c2(imageVisualizationTrend.getTitleDisplay(), imageVisualizationTrend.getBackgroundEnabled(), imageVisualizationTrend.getTrend(), false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32688, null));
        }
        return new C13233c0(subtitle, title, arrayList, new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[LOOP:2: B:23:0x0087->B:27:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[LOOP:3: B:33:0x00ae->B:37:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0 A[LOOP:4: B:43:0x00d0->B:47:0x00e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009a A[EDGE_INSN: B:61:0x009a->B:29:0x009a BREAK  A[LOOP:2: B:23:0x0087->B:27:0x0096], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1 A[EDGE_INSN: B:63:0x00c1->B:39:0x00c1 BREAK  A[LOOP:3: B:33:0x00ae->B:37:0x00bd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00de A[SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public static final C13247j0 m33398z(HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, ScreenerStatusTileBodyModel model) {
        String icon;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0[] enumC16313m0ArrValues;
        int length;
        int i13;
        EnumC16313m0 enumC16313m1;
        String style;
        EnumC17727b2 enumC17727b2;
        EnumC17727b2[] enumC17727b2ArrValues;
        int length2;
        int i14;
        EnumC17727b2 enumC17727b3;
        String feature;
        EnumC13241g0 enumC13241g0;
        EnumC13241g0[] enumC13241g0ArrValues;
        int length3;
        C13263z c13263z;
        EnumC13241g0 enumC13241g1;
        AbstractC22676k.m65750j(model, "model");
        List<HeartScreenerStatus> heartScreenerStatuses = model.getHeartScreenerStatuses();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(heartScreenerStatuses, 10));
        for (HeartScreenerStatus heartScreenerStatus : heartScreenerStatuses) {
            int i15 = 0;
            EnumC13241g0 enumC13241g2 = null;
            if (!AbstractC22676k.m65745e(heartScreenerStatus.getFeature(), "SHEPHERD")) {
                TextResource description = heartScreenerStatus.getDescription();
                icon = heartScreenerStatus.getMiniStatus().getIcon();
                enumC16313m0 = EnumC16313m0.TINY_ELLIPSE;
                enumC16313m0ArrValues = EnumC16313m0.values();
                length = enumC16313m0ArrValues.length;
                i13 = 0;
                while (true) {
                    if (i13 < length) {
                        enumC16313m1 = null;
                        break;
                    }
                    enumC16313m1 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                        break;
                    }
                    i13++;
                }
                if (enumC16313m1 != null) {
                    enumC16313m0 = enumC16313m1;
                }
                style = heartScreenerStatus.getMiniStatus().getStyle();
                enumC17727b2 = EnumC17727b2.NONE;
                enumC17727b2ArrValues = EnumC17727b2.values();
                length2 = enumC17727b2ArrValues.length;
                i14 = 0;
                while (true) {
                    if (i14 < length2) {
                        enumC17727b3 = null;
                        break;
                    }
                    enumC17727b3 = enumC17727b2ArrValues[i14];
                    if (AbstractC22676k.m65745e(enumC17727b3.name(), style)) {
                        break;
                    }
                    i14++;
                }
                if (enumC17727b3 != null) {
                    enumC17727b2 = enumC17727b3;
                }
                feature = heartScreenerStatus.getFeature();
                enumC13241g0 = EnumC13241g0.LABRADOR;
                enumC13241g0ArrValues = EnumC13241g0.values();
                length3 = enumC13241g0ArrValues.length;
                while (i15 < length3) {
                    enumC13241g1 = enumC13241g0ArrValues[i15];
                    if (AbstractC22676k.m65745e(enumC13241g1.name(), feature)) {
                        enumC13241g2 = enumC13241g1;
                        break;
                    }
                    i15++;
                }
                if (enumC13241g2 != null) {
                    enumC13241g0 = enumC13241g2;
                }
                c13263z = new C13263z(description, enumC13241g0, enumC16313m0, enumC17727b2);
            } else if (m33369O(heartScreenerUpdatedAtInfoModel != null ? heartScreenerUpdatedAtInfoModel.getShepherdHighWaterMark() : null)) {
                TextResource description2 = heartScreenerStatus.getDescription();
                EnumC16313m0 enumC16313m2 = EnumC16313m0.REMOVE;
                EnumC17727b2 enumC17727b4 = EnumC17727b2.NO_CHANGE;
                String feature2 = heartScreenerStatus.getFeature();
                EnumC13241g0 enumC13241g3 = EnumC13241g0.SHEPHERD;
                EnumC13241g0[] enumC13241g0ArrValues2 = EnumC13241g0.values();
                int length4 = enumC13241g0ArrValues2.length;
                while (i15 < length4) {
                    EnumC13241g0 enumC13241g4 = enumC13241g0ArrValues2[i15];
                    if (AbstractC22676k.m65745e(enumC13241g4.name(), feature2)) {
                        enumC13241g2 = enumC13241g4;
                        break;
                    }
                    i15++;
                }
                if (enumC13241g2 != null) {
                    enumC13241g3 = enumC13241g2;
                }
                c13263z = new C13263z(description2, enumC13241g3, enumC16313m2, enumC17727b4);
            } else {
                TextResource description3 = heartScreenerStatus.getDescription();
                icon = heartScreenerStatus.getMiniStatus().getIcon();
                enumC16313m0 = EnumC16313m0.TINY_ELLIPSE;
                enumC16313m0ArrValues = EnumC16313m0.values();
                length = enumC16313m0ArrValues.length;
                i13 = 0;
                while (true) {
                    if (i13 < length) {
                        enumC16313m1 = null;
                        break;
                    }
                    enumC16313m1 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                        break;
                        break;
                    }
                    i13++;
                }
                if (enumC16313m1 != null) {
                    enumC16313m0 = enumC16313m1;
                }
                style = heartScreenerStatus.getMiniStatus().getStyle();
                enumC17727b2 = EnumC17727b2.NONE;
                enumC17727b2ArrValues = EnumC17727b2.values();
                length2 = enumC17727b2ArrValues.length;
                i14 = 0;
                while (true) {
                    if (i14 < length2) {
                        enumC17727b3 = null;
                        break;
                    }
                    enumC17727b3 = enumC17727b2ArrValues[i14];
                    if (AbstractC22676k.m65745e(enumC17727b3.name(), style)) {
                        break;
                        break;
                    }
                    i14++;
                }
                if (enumC17727b3 != null) {
                    enumC17727b2 = enumC17727b3;
                }
                feature = heartScreenerStatus.getFeature();
                enumC13241g0 = EnumC13241g0.LABRADOR;
                enumC13241g0ArrValues = EnumC13241g0.values();
                length3 = enumC13241g0ArrValues.length;
                while (i15 < length3) {
                    enumC13241g1 = enumC13241g0ArrValues[i15];
                    if (AbstractC22676k.m65745e(enumC13241g1.name(), feature)) {
                        enumC13241g2 = enumC13241g1;
                        break;
                    }
                    i15++;
                }
                if (enumC13241g2 != null) {
                    enumC13241g0 = enumC13241g2;
                }
                c13263z = new C13263z(description3, enumC13241g0, enumC16313m0, enumC17727b2);
            }
            arrayList.add(c13263z);
        }
        return new C13247j0(arrayList, model.getSpanningText());
    }
}
