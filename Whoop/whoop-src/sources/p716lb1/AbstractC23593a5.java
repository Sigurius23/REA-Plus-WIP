package p716lb1;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import b21.AbstractC2333f;
import b91.EnumC2888c;
import c21.C3891d;
import c21.C3892e;
import c41.AbstractC4075n;
import c41.AbstractC4076n0;
import c41.AbstractC4125u0;
import c41.AbstractC4145x;
import c41.C4002c3;
import c41.C4015e2;
import c41.C4018e5;
import c41.C4036h2;
import c41.C4037h3;
import c41.C4042i1;
import c41.C4044i3;
import c41.C4046i5;
import c41.C4049j1;
import c41.C4064l2;
import c41.C4067l5;
import c41.C4069m0;
import c41.C4077n1;
import c41.C4079n3;
import c41.C4082o;
import c41.C4092p2;
import c41.C4094p4;
import c41.C4108r4;
import c41.C4109r5;
import c41.C4115s4;
import c41.C4118t0;
import c41.C4138w;
import c41.C4151x5;
import c41.C4160z1;
import c41.EnumC4009d3;
import c41.EnumC4022f2;
import c41.EnumC4029g2;
import c41.EnumC4038h4;
import c41.EnumC4040i;
import c41.EnumC4073m4;
import c41.EnumC4142w3;
import com.whoop.design.atomic.atom.TrendTypeEnum;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ImpactMagnitudeTileModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.models.items.ActivityModel;
import com.whoop.design.models.items.AddActivity;
import com.whoop.design.models.items.AlarmStatus;
import com.whoop.design.models.items.AlertTileModel;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.ArticleTileCarouselStyleDtoEnum;
import com.whoop.design.models.items.ArticleTileModel;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.models.items.ArticleTileTypeDtoEnum;
import com.whoop.design.models.items.BarGraph;
import com.whoop.design.models.items.BatteryStatus;
import com.whoop.design.models.items.BehaviorCountTileModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CoachingTileModel;
import com.whoop.design.models.items.CollapsableHeaderModel;
import com.whoop.design.models.items.ContributorTileLegend;
import com.whoop.design.models.items.ContributorTileModel;
import com.whoop.design.models.items.CtaState;
import com.whoop.design.models.items.CtaSupplementalInfo;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CurrentPlanTileModel;
import com.whoop.design.models.items.DetectedActivityMetadata;
import com.whoop.design.models.items.During;
import com.whoop.design.models.items.GlassTileModel;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.models.items.HeaderIconConfig;
import com.whoop.design.models.items.HeaderItemsCardModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderStyle;
import com.whoop.design.models.items.HealthMonitorCardModel;
import com.whoop.design.models.items.HealthMonitorMetricModel;
import com.whoop.design.models.items.HealthMonitorModel;
import com.whoop.design.models.items.HeartRateTileId;
import com.whoop.design.models.items.HeartRateZone;
import com.whoop.design.models.items.HorizontalMetricTileFooter;
import com.whoop.design.models.items.HorizontalMetricTileMetric;
import com.whoop.design.models.items.HorizontalMetricTileModel;
import com.whoop.design.models.items.ImageAndIconModel;
import com.whoop.design.models.items.ImpactLabelModel;
import com.whoop.design.models.items.ImpactStyle;
import com.whoop.design.models.items.ImpactTileModel;
import com.whoop.design.models.items.InsufficientImpactTileModel;
import com.whoop.design.models.items.ItemVisibilityStateEnum;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.design.models.items.KeyStatisticModel;
import com.whoop.design.models.items.ListItemTileModel;
import com.whoop.design.models.items.LockedImpactOnRecoveryModel;
import com.whoop.design.models.items.LogoNavModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.MetricEducationModel;
import com.whoop.design.models.items.MetricStatusTileModel;
import com.whoop.design.models.items.MiniMonitorCardModel;
import com.whoop.design.models.items.MiniMonitorStatusType;
import com.whoop.design.models.items.PlanStyle;
import com.whoop.design.models.items.PlanTileModel;
import com.whoop.design.models.items.ProfileInfoTileListModel;
import com.whoop.design.models.items.ProfileInfoTileModel;
import com.whoop.design.models.items.RangeModal;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SleepPlannerAlarmCardModel;
import com.whoop.design.models.items.SleepPlannerAlarmCardStatus;
import com.whoop.design.models.items.SleepPlannerCardModel;
import com.whoop.design.models.items.SplitContainerCardModel;
import com.whoop.design.models.items.StatusTileModel;
import com.whoop.design.models.items.StepperBarModel;
import com.whoop.design.models.items.StepperComponentModel;
import com.whoop.design.models.items.SupportActionTileModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TileBorderStyle;
import com.whoop.design.models.items.TitleTileModel;
import com.whoop.design.models.items.UnlockedImpactOnRecoveryModel;
import com.whoop.design.models.items.VowCtaModel;
import com.whoop.design.models.items.VowModel;
import com.whoop.design.models.items.WhoopCoachEntryPoint;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.service.network.model.cycles.Period;
import com.whoop.util.TrendKey;
import d11.C11467b;
import d11.C11468c;
import d11.C11474i;
import d11.EnumC11472g;
import d11.InterfaceC11466a;
import d41.AbstractC11683i;
import d41.AbstractC11684j;
import d41.C11682h;
import d41.EnumC11681g;
import e11.C12584d;
import f01.EnumC13892q1;
import f41.C14067e;
import g41.C15461e;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import gz0.AbstractC16315n0;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import h51.C16934f;
import hy0.C17750h1;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import j01.C21127d;
import j02.AbstractC21128a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k01.C22093e;
import k01.EnumC22089a;
import k01.EnumC22094f;
import k51.C22204c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.EnumC22400l;
import l51.C23357g;
import l51.C23358h;
import l83.C23454a0;
import l83.C23465k;
import l83.C23471q;
import m71.C25201d;
import m83.AbstractC25267u;
import m83.C25271y;
import mc1.AbstractC25418c;
import mc1.EnumC25417b;
import n21.C26191e;
import n21.EnumC26195i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p31.AbstractC28805p;
import p31.C28801l;
import p31.EnumC28798i;
import p31.EnumC28807r;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import r21.C30885c;
import r21.EnumC30883a;
import rz0.EnumC31927f;
import s01.C32048d;
import s01.EnumC32047c;
import s71.C32241c;
import t71.C33565b;
import t71.C33569f;
import t71.C33573j;
import t71.C33579p;
import t71.InterfaceC33570g;
import v31.C35605a;
import v31.C35611g;
import v31.EnumC35606b;
import v31.EnumC35612h;
import v71.C35768i;
import wb3.AbstractC37056f;
import x71.C38042d;
import x81.C38072d;
import y11.C39059l;
import y11.C39065r;
import y11.EnumC39048a;
import y71.C39274g;
import y71.C39282o;
import y71.EnumC39284q;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.a5 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001d\u0010\u001e\u001a%\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100\u001a\u0017\u00101\u001a\u00020.2\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\b1\u00100\u001a\u0017\u00103\u001a\u00020\"2\u0006\u00102\u001a\u00020\u001fH\u0000¢\u0006\u0004\b3\u00104\u001a\u0017\u00105\u001a\u00020\"2\u0006\u00102\u001a\u00020\u001fH\u0000¢\u0006\u0004\b5\u00104\u001a\u001f\u00108\u001a\u00020\"2\u0006\u00107\u001a\u0002062\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b8\u00109\u001a\u0017\u0010;\u001a\u00020:2\u0006\u0010\n\u001a\u00020\u0015H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010?\u001a\u00020>2\u0006\u0010\n\u001a\u00020=H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010C\u001a\u00020B2\u0006\u0010\n\u001a\u00020AH\u0000¢\u0006\u0004\bC\u0010D\u001a\u0017\u0010G\u001a\u00020F2\u0006\u0010\n\u001a\u00020EH\u0000¢\u0006\u0004\bG\u0010H\u001a\u0013\u0010K\u001a\u00020J*\u00020IH\u0002¢\u0006\u0004\bK\u0010L\u001a\u0017\u0010P\u001a\u00020O2\u0006\u0010N\u001a\u00020MH\u0000¢\u0006\u0004\bP\u0010Q\u001a\u0017\u0010S\u001a\u00020O2\u0006\u0010\n\u001a\u00020RH\u0000¢\u0006\u0004\bS\u0010T\u001a\u001f\u0010W\u001a\u00020O2\u0006\u0010\n\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0010H\u0000¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010[\u001a\u00020\"2\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b[\u0010\\\u001a\u0013\u0010_\u001a\u00020^*\u00020]H\u0002¢\u0006\u0004\b_\u0010`\u001a\u0015\u0010c\u001a\u00020b2\u0006\u0010\n\u001a\u00020a¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010g\u001a\u00020\u00102\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010h\u001a\u0017\u0010i\u001a\u00020.2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bi\u0010j\u001a\u0013\u0010m\u001a\u00020l*\u00020kH\u0002¢\u0006\u0004\bm\u0010n\"\u001a\u0010t\u001a\u00020o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s¨\u0006u"}, m65681d2 = {"Ly71/q;", "z0", "(Ly71/q;)Ly71/q;", "Lcom/whoop/design/models/items/ProfileInfoTileModel;", "Ljb1/a;", "reducer", "Lc41/r4;", "x0", "(Lcom/whoop/design/models/items/ProfileInfoTileModel;Ljb1/a;)Lc41/r4;", "Lcom/whoop/design/models/items/MetricEducationModel;", "model", "Lr21/c;", "y0", "(Lcom/whoop/design/models/items/MetricEducationModel;)Lr21/c;", "Lcom/whoop/design/models/items/ImpactLabelModel;", "impactLabelModel", "", "isLeft", "Lt71/b;", "v0", "(Lcom/whoop/design/models/items/ImpactLabelModel;Z)Lt71/b;", "Lcom/whoop/design/models/items/ActivityModel;", "Lc41/o;", "e0", "(Lcom/whoop/design/models/items/ActivityModel;)Lc41/o;", "", "Lcom/whoop/design/models/items/HealthMonitorMetricModel;", "metricList", "Lc21/e;", "m0", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/design/models/items/ImpactStyle;", "noStyle", "yesStyle", "Ly81/f;", "s0", "(Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactStyle;)Ljava/util/List;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "w0", "(Ljava/lang/String;)Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "propertyType", "", "I1", "(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)I", "Ly81/e;", "G1", "(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Ly81/e;", "H1", "impactStyle", "u0", "(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;", "t0", "Lcom/whoop/navigation/ActivityDetailType;", "type", "r0", "(Lcom/whoop/navigation/ActivityDetailType;Ljava/lang/String;)Ly81/f;", "Lc41/x;", "f0", "(Lcom/whoop/design/models/items/ActivityModel;)Lc41/x;", "Lcom/whoop/design/models/items/AlertTileModel;", "Lc41/m0;", "g0", "(Lcom/whoop/design/models/items/AlertTileModel;)Lc41/m0;", "Lcom/whoop/design/models/items/HeaderModel;", "Lp31/l;", "n0", "(Lcom/whoop/design/models/items/HeaderModel;)Lp31/l;", "Lcom/whoop/design/models/items/CollapsableHeaderModel;", "Ll51/g;", "k0", "(Lcom/whoop/design/models/items/CollapsableHeaderModel;)Ll51/g;", "Lcom/whoop/design/models/items/ArticleTileModel;", "Ld41/j;", "E1", "(Lcom/whoop/design/models/items/ArticleTileModel;)Ld41/j;", "Lcom/whoop/design/models/items/VowCtaModel;", "vowCtaModel", "Lc41/t0;", "j0", "(Lcom/whoop/design/models/items/VowCtaModel;)Lc41/t0;", "Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;", "i0", "(Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;)Lc41/t0;", "Lcom/whoop/design/models/items/CoachingTileModel;", "isEmbedded", "h0", "(Lcom/whoop/design/models/items/CoachingTileModel;Z)Lc41/t0;", "Lcom/whoop/design/models/items/AlarmStatus;", "alarmStatus", "p0", "(Lcom/whoop/design/models/items/AlarmStatus;)Ly81/f;", "Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;", "Ld41/i;", "D1", "(Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;)Ld41/i;", "Lcom/whoop/design/models/items/CtaTileModel;", "Ld11/i;", "d0", "(Lcom/whoop/design/models/items/CtaTileModel;)Ld11/i;", "Lcom/whoop/design/models/items/PlanStyle;", "planStyle", "q0", "(Lcom/whoop/design/models/items/PlanStyle;)Z", "l0", "(Lcom/whoop/design/models/items/PlanStyle;)Ly81/e;", "Lcom/whoop/design/models/items/HeartRateTileId;", "Lmc1/b;", "F1", "(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;", "Llb1/y0;", "a", "Llb1/y0;", "o0", "()Llb1/y0;", "tileMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23593a5 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93580a = Function1.m68251a(new C23675m4(13));

    /* JADX INFO: renamed from: lb1.a5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93581a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f93582b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f93583c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f93584d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f93585e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f93586f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f93587g;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int[] f93588h;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ int[] f93589i;

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ int[] f93590j;

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f93591k;

        /* JADX INFO: renamed from: l */
        public static final /* synthetic */ int[] f93592l;

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ int[] f93593m;

        static {
            int[] iArr = new int[ArticleTileCarouselStyleDtoEnum.values().length];
            try {
                iArr[ArticleTileCarouselStyleDtoEnum.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArticleTileCarouselStyleDtoEnum.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93581a = iArr;
            int[] iArr2 = new int[ArticleTileCarouselEventEnum.values().length];
            try {
                iArr2[ArticleTileCarouselEventEnum.DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ArticleTileCarouselEventEnum.VIEW_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ArticleTileCarouselEventEnum.MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f93582b = iArr2;
            int[] iArr3 = new int[MiniMonitorStatusType.values().length];
            try {
                iArr3[MiniMonitorStatusType.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[MiniMonitorStatusType.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[MiniMonitorStatusType.ALERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[MiniMonitorStatusType.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[MiniMonitorStatusType.MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[MiniMonitorStatusType.HIGH.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[MiniMonitorStatusType.CALIBRATING.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[MiniMonitorStatusType.NO_DATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[MiniMonitorStatusType.DATA_HIDDEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[MiniMonitorStatusType.PENDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            f93583c = iArr3;
            int[] iArr4 = new int[EnumC39284q.values().length];
            try {
                iArr4[EnumC39284q.RAF_MENU_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[EnumC39284q.SHOP_PROMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[EnumC39284q.SHOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[EnumC39284q.ALERT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[EnumC39284q.REFER_A_FRIEND.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            f93584d = iArr4;
            int[] iArr5 = new int[LegendStyle.values().length];
            try {
                iArr5[LegendStyle.POSITIVE_TREND_TARGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[LegendStyle.NEGATIVE_TREND_TARGET.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[LegendStyle.NEUTRAL_TREND_TARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            f93585e = iArr5;
            int[] iArr6 = new int[TrendTypeEnum.values().length];
            try {
                iArr6[TrendTypeEnum.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[TrendTypeEnum.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[TrendTypeEnum.POSITIVE_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[TrendTypeEnum.CONCERN_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[TrendTypeEnum.ALERT_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused28) {
            }
            f93586f = iArr6;
            int[] iArr7 = new int[ImpactStyle.values().length];
            try {
                iArr7[ImpactStyle.INELIGIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[ImpactStyle.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            f93587g = iArr7;
            int[] iArr8 = new int[EnumC22400l.values().length];
            try {
                iArr8[EnumC22400l.CARD_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr8[EnumC22400l.CARD_EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr8[EnumC22400l.NO_CARD_ON_FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr8[EnumC22400l.PAYMENT_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr8[EnumC22400l.MEMBERSHIP_EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[EnumC22400l.MEMBERSHIP_EXPIRED_V2.ordinal()] = 6;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[EnumC22400l.MEMBERSHIP_EXPIRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr8[EnumC22400l.MEMBERSHIP_PAUSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr8[EnumC22400l.STRAP_GEN_DEPRECATED.ordinal()] = 9;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[EnumC22400l.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[EnumC22400l.MEMBERSHIP_MISMATCH_UPGRADE_TO_LIFE_TIER.ordinal()] = 11;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr8[EnumC22400l.MEMBERSHIP_MISMATCH_DEVICE_UPGRADE_REQUIRED.ordinal()] = 12;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr8[EnumC22400l.CRITICAL_OUTAGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr8[EnumC22400l.MAJOR_OUTAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused44) {
            }
            f93588h = iArr8;
            int[] iArr9 = new int[ArticleTileTypeDtoEnum.values().length];
            try {
                iArr9[ArticleTileTypeDtoEnum.TITLE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr9[ArticleTileTypeDtoEnum.TITLE_WITH_PARAGRAPH.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr9[ArticleTileTypeDtoEnum.DISCOVER_MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr9[ArticleTileTypeDtoEnum.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr9[ArticleTileTypeDtoEnum.VIDEO_NO_OVERLAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr9[ArticleTileTypeDtoEnum.IMAGE_ONLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused50) {
            }
            f93589i = iArr9;
            int[] iArr10 = new int[BatteryStatus.values().length];
            try {
                iArr10[BatteryStatus.CHARGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr10[BatteryStatus.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            f93590j = iArr10;
            int[] iArr11 = new int[AlarmStatus.values().length];
            try {
                iArr11[AlarmStatus.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr11[AlarmStatus.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr11[AlarmStatus.EXACT_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr11[AlarmStatus.GREEN_RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr11[AlarmStatus.SLEEP_PERFORMANCE_100.ordinal()] = 5;
            } catch (NoSuchFieldError unused57) {
            }
            f93591k = iArr11;
            int[] iArr12 = new int[PlanStyle.values().length];
            try {
                iArr12[PlanStyle.JANUARY0.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr12[PlanStyle.JANUARY1.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr12[PlanStyle.JANUARY2.ordinal()] = 3;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr12[PlanStyle.JANUARY3.ordinal()] = 4;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr12[PlanStyle.TRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr12[PlanStyle.MAINTAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr12[PlanStyle.RECOVER.ordinal()] = 7;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr12[PlanStyle.GET_BY.ordinal()] = 8;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr12[PlanStyle.PRIORITIZE_SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr12[PlanStyle.REST.ordinal()] = 10;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr12[PlanStyle.SLEEP_CONSISTENTLY.ordinal()] = 11;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr12[PlanStyle.SLEEP_DEEPER.ordinal()] = 12;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr12[PlanStyle.SLEEP_LONGER.ordinal()] = 13;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr12[PlanStyle.WITHINGS_BODY_COMP.ordinal()] = 14;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr12[PlanStyle.GLP1_COMPANION.ordinal()] = 15;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr12[PlanStyle.TEST.ordinal()] = 16;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr12[PlanStyle.CUSTOM.ordinal()] = 17;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr12[PlanStyle.NONE.ordinal()] = 18;
            } catch (NoSuchFieldError unused75) {
            }
            f93592l = iArr12;
            int[] iArr13 = new int[HeartRateTileId.values().length];
            try {
                iArr13[HeartRateTileId.MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr13[HeartRateTileId.HARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr13[HeartRateTileId.MODERATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr13[HeartRateTileId.VERY_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr13[HeartRateTileId.LIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr13[HeartRateTileId.RESTORATIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr13[HeartRateTileId.INHALE.ordinal()] = 7;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr13[HeartRateTileId.EXHALE.ordinal()] = 8;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr13[HeartRateTileId.HOLD.ordinal()] = 9;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr13[HeartRateTileId.NONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr13[HeartRateTileId.LIGHT_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr13[HeartRateTileId.REM_SLEEP.ordinal()] = 12;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr13[HeartRateTileId.SWS_SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr13[HeartRateTileId.AWAKE.ordinal()] = 14;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr13[HeartRateTileId.HIGH_STRESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr13[HeartRateTileId.LOW_STRESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr13[HeartRateTileId.MEDIUM_STRESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused92) {
            }
            f93593m = iArr13;
        }
    }

    /* JADX INFO: renamed from: lb1.a5$a0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a0 f93594w = new a0();

        /* JADX INFO: renamed from: a */
        public final long m68424a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlertTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68424a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$a1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93595w;

        public a1(Function1 function1) {
            this.f93595w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93595w.invoke((ImpactTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$a2 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a2 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93596w;

        public a2(Function1 function1) {
            this.f93596w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93596w.invoke((WhoopCoachVowModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f93597w = new b();

        /* JADX INFO: renamed from: a */
        public final long m68427a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return AbstractC17918w0.m51517e(4287543701L);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68427a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$b0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f93598w = new b0();

        /* JADX INFO: renamed from: a */
        public final long m68428a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68428a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$b1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93599w;

        public b1(Function1 function1) {
            this.f93599w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93599w.invoke((InfoCalloutTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f93600w = new c();

        /* JADX INFO: renamed from: a */
        public final long m68430a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return AbstractC17918w0.m51517e(4290885278L);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68430a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$c0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c0 f93601w = new c0();

        /* JADX INFO: renamed from: a */
        public final long m68431a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68431a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$c1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93602w;

        public c1(Function1 function1) {
            this.f93602w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93602w.invoke((InsufficientImpactTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f93603w = new d();

        /* JADX INFO: renamed from: a */
        public final long m68433a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return AbstractC17918w0.m51517e(4286942399L);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68433a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$d0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d0 f93604w = new d0();

        /* JADX INFO: renamed from: a */
        public final long m68434a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68434a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$d1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93605w;

        public d1(Function1 function1) {
            this.f93605w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93605w.invoke((ArticleTileCarouselModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f93606w = new e();

        /* JADX INFO: renamed from: a */
        public final long m68436a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return AbstractC17918w0.m51517e(4290284982L);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68436a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$e0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e0 f93607w = new e0();

        /* JADX INFO: renamed from: a */
        public final long m68437a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68437a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$e1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93608w;

        public e1(Function1 function1) {
            this.f93608w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93608w.invoke((MetricEducationModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f93609w = new f();

        /* JADX INFO: renamed from: a */
        public final long m68439a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWithingsPlan();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68439a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$f0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f0 f93610w = new f0();

        /* JADX INFO: renamed from: a */
        public final long m68440a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68440a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$f1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93611w;

        public f1(Function1 function1) {
            this.f93611w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93611w.invoke((LockedImpactOnRecoveryModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f93612w = new g();

        /* JADX INFO: renamed from: a */
        public final long m68442a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTextMciFollicular();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68442a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$g0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g0 f93613w = new g0();

        /* JADX INFO: renamed from: a */
        public final long m68443a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68443a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$g1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93614w;

        public g1(Function1 function1) {
            this.f93614w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93614w.invoke((UnlockedImpactOnRecoveryModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f93615w = new h();

        /* JADX INFO: renamed from: a */
        public final long m68445a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68445a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$h0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h0 f93616w = new h0();

        /* JADX INFO: renamed from: a */
        public final long m68446a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68446a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$h1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93617w;

        public h1(Function1 function1) {
            this.f93617w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93617w.invoke((ListItemTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$i */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f93618w = new i();

        /* JADX INFO: renamed from: a */
        public final long m68448a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68448a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$i0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93619w;

        public i0(Function1 function1) {
            this.f93619w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93619w.invoke((ActivityModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$i1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93620w;

        public i1(Function1 function1) {
            this.f93620w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93620w.invoke((TitleTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f93621w = new j();

        /* JADX INFO: renamed from: a */
        public final long m68451a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68451a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$j0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93622w;

        public j0(Function1 function1) {
            this.f93622w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93622w.invoke((HealthMonitorCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$j1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93623w;

        public j1(Function1 function1) {
            this.f93623w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93623w.invoke((HeaderItemsCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$k */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f93624w = new k();

        /* JADX INFO: renamed from: a */
        public final long m68454a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68454a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$k0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93625w;

        public k0(Function1 function1) {
            this.f93625w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93625w.invoke((HealthMonitorModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$k1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93626w;

        public k1(Function1 function1) {
            this.f93626w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93626w.invoke((ItemsCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$l */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f93627w = new l();

        /* JADX INFO: renamed from: a */
        public final long m68457a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68457a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$l0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93628w;

        public l0(Function1 function1) {
            this.f93628w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93628w.invoke((HorizontalMetricTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$l1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93629w;

        public l1(Function1 function1) {
            this.f93629w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93629w.invoke((PlanTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$m */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f93630w = new m();

        /* JADX INFO: renamed from: a */
        public final long m68460a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68460a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$m0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93631w;

        public m0(Function1 function1) {
            this.f93631w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93631w.invoke((SupportActionTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$m1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93632w;

        public m1(Function1 function1) {
            this.f93632w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93632w.invoke((HeartRateZone) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$n */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f93633w = new n();

        /* JADX INFO: renamed from: a */
        public final long m68463a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone2();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68463a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$n0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93634w;

        public n0(Function1 function1) {
            this.f93634w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93634w.invoke((StatusTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$n1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93635w;

        public n1(Function1 function1) {
            this.f93635w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93635w.invoke((ProfileInfoTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$o */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f93636w = new o();

        /* JADX INFO: renamed from: a */
        public final long m68466a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68466a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$o0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93637w;

        public o0(Function1 function1) {
            this.f93637w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93637w.invoke((MetricStatusTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$o1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93638w;

        public o1(Function1 function1) {
            this.f93638w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93638w.invoke((ArticleTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$p */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f93639w = new p();

        /* JADX INFO: renamed from: a */
        public final long m68469a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68469a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$p0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93640w;

        public p0(Function1 function1) {
            this.f93640w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93640w.invoke((KeyStatisticModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$p1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93641w;

        public p1(Function1 function1) {
            this.f93641w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93641w.invoke((ProfileInfoTileListModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$q */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f93642w = new q();

        /* JADX INFO: renamed from: a */
        public final long m68472a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68472a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$q0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93643w;

        public q0(Function1 function1) {
            this.f93643w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93643w.invoke((HeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$q1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93644w;

        public q1(Function1 function1) {
            this.f93644w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93644w.invoke((SplitContainerCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$r */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f93645w = new r();

        /* JADX INFO: renamed from: a */
        public final long m68475a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepDeepSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68475a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$r0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93646w;

        public r0(Function1 function1) {
            this.f93646w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93646w.invoke((CollapsableHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$r1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93647w;

        public r1(Function1 function1) {
            this.f93647w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93647w.invoke((MiniMonitorCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$s */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f93648w = new s();

        /* JADX INFO: renamed from: a */
        public final long m68478a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68478a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$s0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93649w;

        public s0(Function1 function1) {
            this.f93649w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93649w.invoke((AlertTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$s1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93650w;

        public s1(Function1 function1) {
            this.f93650w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93650w.invoke((MenuItemModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$t */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f93651w = new t();

        /* JADX INFO: renamed from: a */
        public final long m68481a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68481a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$t0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93652w;

        public t0(Function1 function1) {
            this.f93652w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93652w.invoke((CtaTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$t1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93653w;

        public t1(Function1 function1) {
            this.f93653w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93653w.invoke((ContributorTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$u */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f93654w = new u();

        /* JADX INFO: renamed from: a */
        public final long m68484a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68484a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$u0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93655w;

        public u0(Function1 function1) {
            this.f93655w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93655w.invoke((CurrentPlanTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$u1 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93656w;

        public u1(Function1 function1) {
            this.f93656w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93656w.invoke((StepperComponentModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$v */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f93657w = new v();

        /* JADX INFO: renamed from: a */
        public final long m68487a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68487a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$v0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93658w;

        public v0(Function1 function1) {
            this.f93658w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93658w.invoke((BehaviorCountTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$v1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93659w;

        public v1(Function1 function1) {
            this.f93659w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93659w.invoke((GlassTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$w */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f93660w = new w();

        /* JADX INFO: renamed from: a */
        public final long m68490a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentOnboardingAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68490a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$w0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93661w;

        public w0(Function1 function1) {
            this.f93661w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93661w.invoke((GoalSettingsTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$w1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93662w;

        public w1(Function1 function1) {
            this.f93662w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93662w.invoke((VowModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$x */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f93663w = new x();

        /* JADX INFO: renamed from: a */
        public final long m68493a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68493a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$x0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93664w;

        public x0(Function1 function1) {
            this.f93664w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93664w.invoke((ImageAndIconModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$x1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93665w;

        public x1(Function1 function1) {
            this.f93665w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93665w.invoke((SleepPlannerCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$y */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f93666w = new y();

        /* JADX INFO: renamed from: a */
        public final long m68496a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68496a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$y0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93667w;

        public y0(Function1 function1) {
            this.f93667w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93667w.invoke((LogoNavModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$y1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93668w;

        public y1(Function1 function1) {
            this.f93668w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93668w.invoke((SleepPlannerAlarmCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$z */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final z f93669w = new z();

        /* JADX INFO: renamed from: a */
        public final long m68499a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getNeutral15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m68499a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.a5$z0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93670w;

        public z0(Function1 function1) {
            this.f93670w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93670w.invoke((ImpactMagnitudeTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a5$z1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z1 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93671w;

        public z1(Function1 function1) {
            this.f93671w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93671w.invoke((VowCtaModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m68286A0(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23675m4 c23675m4 = new C23675m4(24);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AlertTileModel.class), new s0(c23675m4));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArticleTileCarouselModel.class), new d1(new C23675m4(16)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArticleTileModel.class), new o1(new C23675m4(28)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GlassTileModel.class), new v1(new C23747y4(10)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(VowModel.class), new w1(new C23747y4(17)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SleepPlannerCardModel.class), new x1(new C23747y4(18)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SleepPlannerAlarmCardModel.class), new y1(new C23747y4(19)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(VowCtaModel.class), new z1(new C23747y4(20)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(WhoopCoachVowModel.class), new a2(new C23747y4(21)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ActivityModel.class), new i0(new C23747y4(22)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HealthMonitorCardModel.class), new j0(new C23747y4(5)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HealthMonitorModel.class), new k0(new C23747y4(16)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalMetricTileModel.class), new l0(new C23747y4(25)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SupportActionTileModel.class), new m0(new C23747y4(26)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(StatusTileModel.class), new n0(new C23747y4(27)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MetricStatusTileModel.class), new o0(new C23747y4(28)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(KeyStatisticModel.class), new p0(new C23747y4(29)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeaderModel.class), new q0(new C23753z4(0)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CollapsableHeaderModel.class), new r0(new C23675m4(14)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CtaTileModel.class), new t0(new C23675m4(15)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CurrentPlanTileModel.class), new u0(new C23675m4(17)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(BehaviorCountTileModel.class), new v0(new C23675m4(18)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GoalSettingsTileModel.class), new w0(new C23675m4(19)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImageAndIconModel.class), new x0(new C23675m4(20)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(LogoNavModel.class), new y0(new C23675m4(21)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImpactMagnitudeTileModel.class), new z0(new C23675m4(22)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImpactTileModel.class), new a1(new C23675m4(23)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(InfoCalloutTileModel.class), new b1(new C23675m4(25)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(InsufficientImpactTileModel.class), new c1(new C23675m4(26)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MetricEducationModel.class), new e1(new C23675m4(27)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(LockedImpactOnRecoveryModel.class), new f1(new C23675m4(29)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(UnlockedImpactOnRecoveryModel.class), new g1(new C23747y4(0)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ListItemTileModel.class), new h1(new C23747y4(1)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TitleTileModel.class), new i1(new C23747y4(2)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeaderItemsCardModel.class), new j1(new C23747y4(3)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ItemsCardModel.class), new k1(new C23747y4(4)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PlanTileModel.class), new l1(new C23747y4(6)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeartRateZone.class), new m1(new C23747y4(7)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ProfileInfoTileModel.class), new n1(new C23747y4(8)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ProfileInfoTileListModel.class), new p1(new C23747y4(9)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SplitContainerCardModel.class), new q1(new C23747y4(11)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MiniMonitorCardModel.class), new r1(new C23747y4(12)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MenuItemModel.class), new s1(new C23747y4(13)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ContributorTileModel.class), new t1(new C23747y4(14)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(StepperComponentModel.class), new u1(new C23747y4(15)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final C4118t0 m68287A1(VowCtaModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68374j0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C4069m0 m68289B0(AlertTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68365g0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX INFO: renamed from: B1 */
    public static final C32048d m68290B1(WhoopCoachVowModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC32047c enumC32047c;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        String style = model.getStyle();
        EnumC32047c enumC32047c2 = EnumC32047c.NORMAL;
        EnumC32047c[] enumC32047cArrValues = EnumC32047c.values();
        int length = enumC32047cArrValues.length;
        int i13 = 0;
        while (true) {
            enumC16313m0 = null;
            if (i13 >= length) {
                enumC32047c = null;
                break;
            }
            enumC32047c = enumC32047cArrValues[i13];
            if (AbstractC22676k.m65745e(enumC32047c.name(), style)) {
                break;
            }
            i13++;
        }
        EnumC32047c enumC32047c3 = enumC32047c == null ? enumC32047c2 : enumC32047c;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getVow());
        WhoopCoachEntryPoint entryPoint = model.getEntryPoint();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(entryPoint != null ? entryPoint.getEntryText() : null);
        WhoopCoachEntryPoint entryPoint2 = model.getEntryPoint();
        String signature = entryPoint2 != null ? entryPoint2.getSignature() : null;
        if (signature == null) {
            signature = "";
        }
        String str = signature;
        C9598e destination = model.getDestination();
        String header = model.getHeader();
        TextResource textResourceM21278l3 = header != null ? AbstractC8693b.m21278l(header) : null;
        String icon = model.getIcon();
        if (icon != null) {
            enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            if (enumC16313m1 == null) {
                enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
            }
        } else {
            enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
        }
        return new C32048d(textResourceM21278l, textResourceM21278l2, enumC16313m1, str, destination, textResourceM21278l3, enumC32047c3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C16934f m68292C0(ArticleTileCarouselModel model) {
        C23471q c23471q;
        C23465k c23465k;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(21));
        int i13 = a.f93581a[model.getStyle().ordinal()];
        if (i13 == 1) {
            c23471q = new C23471q(AbstractC18249c.m52574l(t.f93651w), p745y81.Function1.m125323a(u.f93654w), AbstractC18249c.m52574l(v.f93657w));
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c23471q = new C23471q(AbstractC18249c.m52574l(w.f93660w), p745y81.Function1.m125323a(x.f93663w), AbstractC18249c.m52572j(new C23751z2(22)));
        }
        AbstractC18247a abstractC18247a = (AbstractC18247a) c23471q.f92947w;
        InterfaceC39332e interfaceC39332e = (InterfaceC39332e) c23471q.f92948x;
        AbstractC18247a abstractC18247a2 = (AbstractC18247a) c23471q.f92949y;
        ArticleTileCarouselEventEnum cta = model.getCta();
        if (cta != null) {
            int i14 = a.f93582b[cta.ordinal()];
            if (i14 == 1) {
                c23465k = new C23465k(new TextResource.C8688b(AbstractC16277f.f62393w2, null, 2, null), new C39274g(AbstractC16319p0.m46430a().getAction().getCross(), null, 2, null));
            } else if (i14 == 2) {
                c23465k = new C23465k(new TextResource.C8688b(AbstractC16277f.f62401y2, null, 2, null), new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), null, 2, null));
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c23465k = new C23465k(new TextResource.C8688b(AbstractC16277f.f62397x2, null, 2, null), new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), null, 2, null));
            }
        } else {
            c23465k = new C23465k(AbstractC8693b.m21267a(), null);
        }
        TextResource textResource = (TextResource) c23465k.f92937w;
        C39274g c39274g = (C39274g) c23465k.f92938x;
        Object cta2 = model.getCta();
        if (cta2 == null) {
            cta2 = C23454a0.f92919a;
        }
        Object obj = cta2;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        boolean z4 = model.getCta() != null;
        List<ArticleTileModel> articleList = model.getArticleList();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(articleList, 10));
        for (ArticleTileModel articleTileModel : articleList) {
            arrayList.add(articleTileModel.copy((61439 & 1) != 0 ? articleTileModel.id : null, (61439 & 2) != 0 ? articleTileModel.title : null, (61439 & 4) != 0 ? articleTileModel.subText : null, (61439 & 8) != 0 ? articleTileModel.imageUrl : null, (61439 & 16) != 0 ? articleTileModel.type : null, (61439 & 32) != 0 ? articleTileModel.size : null, (61439 & 64) != 0 ? articleTileModel.icon : null, (61439 & 128) != 0 ? articleTileModel.paragraph : null, (61439 & 256) != 0 ? articleTileModel.publishDate : null, (61439 & 512) != 0 ? articleTileModel.tag : null, (61439 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? articleTileModel.articleUrl : null, (61439 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? articleTileModel.cta : null, (61439 & 4096) != 0 ? articleTileModel.index : Integer.valueOf(model.getArticleList().indexOf(articleTileModel)), (61439 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? articleTileModel.borderStyle : null, (61439 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? articleTileModel.genericInteraction : null, (61439 & 32768) != 0 ? articleTileModel.analyticEvent : null));
        }
        return new C16934f(obj, textResourceM21278l, abstractC18247a, null, textResource, c39274g, z4, !AbstractC22676k.m65745e(model.getHideHeader(), Boolean.TRUE) && (model.getTitle().length() > 0 || model.getCta() != null), c21535aM60554d.m60540g(arrayList), interfaceC39332e, abstractC18247a2, null, false, 6152, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final C4138w m68293C1(ActivityModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String str = id4 == null ? "" : id4;
        TextResource title = model.getTitle();
        C4082o c4082oM68359e0 = m68359e0(model);
        AbstractC4145x abstractC4145xM68362f0 = m68362f0(model);
        ActivityDetailType activityDetailTypeM58959a = AbstractC21128a.m58959a(model.getType());
        During during = model.getDuring();
        Period period = during != null ? new Period(during.getLowerEndpoint(), during.getUpperEndpoint()) : null;
        String activityV2Id = model.getActivityV2Id();
        String str2 = activityV2Id == null ? "" : activityV2Id;
        DetectedActivityMetadata detectedActivityMetadata = model.getDetectedActivityMetadata();
        return new C4138w(str, title, c4082oM68359e0, abstractC4145xM68362f0, activityDetailTypeM58959a, period, null, null, str2, null, detectedActivityMetadata != null ? new C4077n1(detectedActivityMetadata.getStartAt(), -1, false) : null, AbstractC22676k.m65745e(model.getStatus(), "EMPTY"), AbstractC22676k.m65745e(model.getCtaState(), "SHOW_ONBOARDING") ? EnumC4029g2.SHOW_ONBOARDING : EnumC4029g2.NORMAL, model.getDestination(), 704, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m68295D0(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D1 */
    private static final AbstractC11683i m68296D1(ArticleTileTypeDtoEnum articleTileTypeDtoEnum) {
        return AbstractC22676k.m65745e(articleTileTypeDtoEnum.name(), "TITLE_ONLY") ? AbstractC11683i.a.f37764a : AbstractC11683i.b.f37765a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final AbstractC17911t m68298E0(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return AbstractC15673b0.m43987H0();
    }

    /* JADX INFO: renamed from: E1 */
    private static final AbstractC11684j m68299E1(ArticleTileModel articleTileModel) {
        Integer numValueOf;
        TextResource textResource;
        TextResource textResourceM21267a;
        EnumC16313m0 enumC16313m0;
        TextResource textResource2;
        TextResource textResourceM21267a2;
        switch (a.f93589i[articleTileModel.getType().ordinal()]) {
            case 1:
            case 2:
                TextResource textResourceM21278l = null;
                String id4 = articleTileModel.getId();
                AbstractC22403o.c cVar = new AbstractC22403o.c(articleTileModel.getImageUrl(), C38072d.f163053a.m121951d().getLogo().getWhoop(), 0, 0, 12, null);
                String icon = articleTileModel.getIcon();
                if (icon != null) {
                    EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                    int length = enumC16313m0ArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            enumC16313m0 = enumC16313m0ArrValues[i13];
                            if (!AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                                i13++;
                            }
                        } else {
                            enumC16313m0 = null;
                        }
                    }
                    numValueOf = enumC16313m0 != null ? Integer.valueOf(enumC16313m0.toWhoopIcon()) : null;
                } else {
                    numValueOf = null;
                }
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(articleTileModel.getTitle());
                String subText = articleTileModel.getSubText();
                if (subText == null || (textResourceM21278l = AbstractC8693b.m21278l(subText)) == null) {
                    String publishDate = articleTileModel.getPublishDate();
                    if (publishDate != null) {
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(publishDate);
                        textResource = textResourceM21278l3;
                    } else {
                        textResource = null;
                    }
                } else {
                    textResource = textResourceM21278l3;
                }
                String paragraph = articleTileModel.getParagraph();
                if (paragraph == null || (textResourceM21267a = AbstractC8693b.m21278l(paragraph)) == null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource3 = textResourceM21267a;
                String tag = articleTileModel.getTag();
                if (tag != null) {
                    textResourceM21278l = AbstractC8693b.m21278l(tag);
                }
                return new AbstractC11684j.c(id4, cVar, null, numValueOf, textResourceM21278l2, textResource, textResource3, textResourceM21278l, m68296D1(articleTileModel.getType()));
            case 3:
                return AbstractC11684j.a.f37766a;
            case 4:
                AbstractC22403o.c cVar2 = new AbstractC22403o.c(articleTileModel.getImageUrl(), 0, 0, 0, 14, null);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(articleTileModel.getTitle());
                String subText2 = articleTileModel.getSubText();
                if (subText2 == null || (textResourceM21278l = AbstractC8693b.m21278l(subText2)) == null) {
                    String publishDate2 = articleTileModel.getPublishDate();
                    if (publishDate2 != null) {
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(publishDate2);
                        textResource2 = textResourceM21278l5;
                    } else {
                        textResource2 = null;
                    }
                } else {
                    textResource2 = textResourceM21278l5;
                }
                String paragraph2 = articleTileModel.getParagraph();
                if (paragraph2 == null || (textResourceM21267a2 = AbstractC8693b.m21278l(paragraph2)) == null) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                TextResource textResource4 = textResourceM21267a2;
                String tag2 = articleTileModel.getTag();
                return new AbstractC11684j.d(cVar2, textResourceM21278l4, textResource2, textResource4, tag2 != null ? AbstractC8693b.m21278l(tag2) : null);
            case 5:
                return new AbstractC11684j.e(new AbstractC22403o.c(articleTileModel.getImageUrl(), 0, 0, 0, 14, null));
            case 6:
                return new AbstractC11684j.b(new AbstractC22403o.c(articleTileModel.getImageUrl(), 0, 0, 0, 14, null), articleTileModel.getId());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C3891d m68301F0(HealthMonitorCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C3891d(model.getTitle(), m68383m0(model.getMetrics()), model.getDestination());
    }

    /* JADX INFO: renamed from: F1 */
    private static final EnumC25417b m68302F1(HeartRateTileId heartRateTileId) {
        switch (a.f93593m[heartRateTileId.ordinal()]) {
            case 1:
                return EnumC25417b.MAX;
            case 2:
                return EnumC25417b.HARD;
            case 3:
                return EnumC25417b.MODERATE;
            case 4:
                return EnumC25417b.VERY_LIGHT;
            case 5:
                return EnumC25417b.LIGHT;
            case 6:
                return EnumC25417b.RESTORATIVE;
            case 7:
                return EnumC25417b.INHALE;
            case 8:
                return EnumC25417b.EXHALE;
            case 9:
                return EnumC25417b.HOLD;
            case 10:
                return EnumC25417b.NONE;
            case 11:
                return EnumC25417b.LIGHT_SLEEP;
            case 12:
                return EnumC25417b.REM_SLEEP;
            case 13:
                return EnumC25417b.SWS_SLEEP;
            case 14:
                return EnumC25417b.AWAKE;
            case 15:
                return EnumC25417b.HIGH_STRESS;
            case 16:
                return EnumC25417b.LOW_STRESS;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumC25417b.MEDIUM_STRESS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX INFO: renamed from: G0 */
    public static final C4015e2 m68304G0(HealthMonitorModel model) {
        EnumC4022f2 enumC4022f2;
        int attention;
        AbstractC22676k.m65750j(model, "model");
        String status = model.getStatus();
        int iHashCode = status.hashCode();
        if (iHashCode != -1437628568) {
            if (iHashCode != 2524) {
                if (iHashCode == 163769603 && status.equals("MODERATE")) {
                    enumC4022f2 = EnumC4022f2.NEGATIVE;
                    attention = AbstractC16319p0.m46430a().getTinyIcons().getAttention();
                } else {
                    enumC4022f2 = EnumC4022f2.ALERT;
                    attention = AbstractC16319p0.m46430a().getTinyIcons().getAttention();
                }
            } else if (status.equals("OK")) {
                enumC4022f2 = EnumC4022f2.POSITIVE;
                attention = AbstractC16319p0.m46430a().getTinyIcons().getCheckmark();
            } else {
                enumC4022f2 = EnumC4022f2.ALERT;
                attention = AbstractC16319p0.m46430a().getTinyIcons().getAttention();
            }
        } else if (status.equals("NO_DATA")) {
            enumC4022f2 = EnumC4022f2.NO_DATA;
            attention = AbstractC16319p0.m46430a().getTinyIcons().getAttention();
        } else {
            enumC4022f2 = EnumC4022f2.ALERT;
            attention = AbstractC16319p0.m46430a().getTinyIcons().getAttention();
        }
        EnumC4022f2 enumC4022f3 = enumC4022f2;
        int i13 = attention;
        boolean z4 = !AbstractC22676k.m65745e(model.getStatus(), "NO_DATA");
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        return new C4015e2(z4, i13, title, subtitle != null ? AbstractC8693b.m21278l(subtitle) : null, enumC4022f3, null, 32, null);
    }

    /* JADX INFO: renamed from: G1 */
    private static final InterfaceC39332e m68305G1(TrendTypeEnum trendTypeEnum) {
        int i13 = a.f93586f[trendTypeEnum.ordinal()];
        if (i13 == 3) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        if (i13 != 4) {
            return i13 != 5 ? EnumC39333f.BRAND_WHITE : EnumC39333f.ACCENT_ALERT;
        }
        return EnumC39333f.ACCENT_NEGATIVE_TREND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C4064l2 m68307H0(HorizontalMetricTileModel model) {
        EnumC16313m0 enumC16313m0;
        C4036h2 c4036h2;
        EnumC16313m0 enumC16313m1;
        EnumC4142w3 enumC4142w3;
        EnumC16313m0 enumC16313m2;
        EnumC4142w3 enumC4142w4;
        EnumC16313m0 enumC16313m3;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        TextResource title = model.getTitle();
        String endIcon = model.getEndIcon();
        EnumC16313m0 enumC16313m4 = EnumC16313m0.CARET_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), endIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m4 = enumC16313m0;
        }
        List<HorizontalMetricTileMetric> metrics = model.getMetrics();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(metrics, 10));
        for (HorizontalMetricTileMetric horizontalMetricTileMetric : metrics) {
            TextResource text = horizontalMetricTileMetric.getText();
            String statusIcon = horizontalMetricTileMetric.getStatusIcon();
            EnumC16313m0 enumC16313m5 = EnumC16313m0.HRV;
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues2[i14];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), statusIcon)) {
                    break;
                }
                i14++;
            }
            if (enumC16313m2 != null) {
                enumC16313m5 = enumC16313m2;
            }
            String status = horizontalMetricTileMetric.getStatus();
            EnumC4142w3 enumC4142w5 = EnumC4142w3.NO_DATA;
            EnumC4142w3[] enumC4142w3ArrValues = EnumC4142w3.values();
            int length3 = enumC4142w3ArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC4142w4 = null;
                    break;
                }
                enumC4142w4 = enumC4142w3ArrValues[i15];
                if (AbstractC22676k.m65745e(enumC4142w4.name(), status)) {
                    break;
                }
                i15++;
            }
            if (enumC4142w4 != null) {
                enumC4142w5 = enumC4142w4;
            }
            String icon = horizontalMetricTileMetric.getIcon();
            EnumC16313m0 enumC16313m6 = EnumC16313m0.REMOVE;
            EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
            int length4 = enumC16313m0ArrValues3.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length4) {
                    enumC16313m3 = null;
                    break;
                }
                enumC16313m3 = enumC16313m0ArrValues3[i16];
                if (AbstractC22676k.m65745e(enumC16313m3.name(), icon)) {
                    break;
                }
                i16++;
            }
            if (enumC16313m3 != null) {
                enumC16313m6 = enumC16313m3;
            }
            arrayList.add(new C4079n3(text, enumC16313m6, enumC16313m5, enumC4142w5));
        }
        HorizontalMetricTileFooter footer = model.getFooter();
        if (footer != null) {
            TextResource startTitle = footer.getStartTitle();
            TextResource endTitle = footer.getEndTitle();
            String icon2 = footer.getIcon();
            EnumC16313m0 enumC16313m7 = EnumC16313m0.REMOVE;
            EnumC16313m0[] enumC16313m0ArrValues4 = EnumC16313m0.values();
            int length5 = enumC16313m0ArrValues4.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length5) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues4[i17];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon2)) {
                    break;
                }
                i17++;
            }
            if (enumC16313m1 != null) {
                enumC16313m7 = enumC16313m1;
            }
            String status2 = footer.getStatus();
            EnumC4142w3 enumC4142w6 = EnumC4142w3.NO_DATA;
            EnumC4142w3[] enumC4142w3ArrValues2 = EnumC4142w3.values();
            int length6 = enumC4142w3ArrValues2.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length6) {
                    enumC4142w3 = null;
                    break;
                }
                enumC4142w3 = enumC4142w3ArrValues2[i18];
                if (AbstractC22676k.m65745e(enumC4142w3.name(), status2)) {
                    break;
                }
                i18++;
            }
            if (enumC4142w3 != null) {
                enumC4142w6 = enumC4142w3;
            }
            c4036h2 = new C4036h2(startTitle, endTitle, enumC16313m7, enumC4142w6);
        } else {
            c4036h2 = null;
        }
        C9598e destination = model.getDestination();
        List<DesignSystemModel> subItems = model.getSubItems();
        return new C4064l2(title, enumC16313m4, arrayList, c4036h2, destination, subItems != null ? c21535aM60555e.m60540g(subItems) : null);
    }

    /* JADX INFO: renamed from: H1 */
    private static final InterfaceC39332e m68308H1(TrendTypeEnum trendTypeEnum) {
        int i13 = a.f93586f[trendTypeEnum.ordinal()];
        if (i13 == 3) {
            return EnumC39333f.ACCENT_POSITIVE_TREND_15;
        }
        if (i13 != 4) {
            return i13 != 5 ? EnumC39333f.WHITE_10 : EnumC39333f.ACCENT_ALERT_TREND_15;
        }
        return EnumC39333f.ACCENT_NEGATIVE_TREND_15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C4067l5 m68310I0(SupportActionTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C4067l5(model.getId(), EnumC16313m0.WHOOP_HELP.toWhoopIcon(), model.getTitle());
    }

    /* JADX INFO: renamed from: I1 */
    private static final int m68311I1(TrendTypeEnum trendTypeEnum) {
        int i13 = a.f93586f[trendTypeEnum.ordinal()];
        if (i13 == 1) {
            return C38072d.f163053a.m121951d().getTinyIcons().getTriangleUp();
        }
        if (i13 == 2) {
            return C38072d.f163053a.m121951d().getTinyIcons().getTriangleDown();
        }
        if (i13 != 3) {
            return (i13 == 4 || i13 == 5) ? AbstractC18489d0.m53362c(C38072d.f163053a) : C38072d.f163053a.m121951d().getAction().getRemove();
        }
        return AbstractC2875y.m8290c(C38072d.f163053a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C4046i5 m68313J0(StatusTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource subtitle = model.getSubtitle();
        if (subtitle == null) {
            subtitle = AbstractC8693b.m21267a();
        }
        TextResource textResource = subtitle;
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getIcon());
        C9598e destination = model.getDestination();
        boolean completed = model.getCompleted();
        CardButtonModel cta = model.getCta();
        return new C4046i5(title, textResource, enumC16313m0M46377b, completed, cta != null ? AbstractC23613d4.m68662l(cta, null, 1, null) : null, destination, null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C4037h3 m68315K0(MetricStatusTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource subtitle = model.getSubtitle();
        TextResource value = model.getValue();
        TextResource valueSuffix = model.getValueSuffix();
        TagModel status = model.getStatus();
        C17750h1 c17750h1M69314d = status != null ? AbstractC23699q4.m69314d(status) : null;
        SecondaryButtonModel updateButton = model.getUpdateButton();
        return new C4037h3(title, subtitle, value, valueSuffix, c17750h1M69314d, updateButton != null ? AbstractC23613d4.m68666p(updateButton) : null, null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
    /* JADX INFO: renamed from: L0 */
    public static final C4151x5 m68317L0(KeyStatisticModel model) {
        EnumC39333f enumC39333f;
        boolean z4;
        C39274g c39274g;
        EnumC39333f enumC39333f2;
        C39274g c39274g2;
        EnumC16313m0 enumC16313m0;
        EnumC31927f enumC31927f;
        AbstractC22676k.m65750j(model, "model");
        EnumC31927f enumC31927f2 = null;
        switch (model.getState()) {
            case "HIGHER_POSITIVE":
                enumC39333f2 = EnumC39333f.ACCENT_POSITIVE_TREND;
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowUp(), null, 2, null);
                enumC39333f = enumC39333f2;
                c39274g = c39274g2;
                z4 = false;
                break;
            case "HIGHER_NEGATIVE":
                enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowUp(), null, 2, null);
                enumC39333f = enumC39333f2;
                c39274g = c39274g2;
                z4 = false;
                break;
            case "EQUAL":
                enumC39333f2 = EnumC39333f.WHITE_50;
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getTinyIcons().getEllipse(), null, 2, null);
                enumC39333f = enumC39333f2;
                c39274g = c39274g2;
                z4 = false;
                break;
            case "HIGHER_NEUTRAL":
                enumC39333f2 = EnumC39333f.WHITE_50;
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowUp(), null, 2, null);
                enumC39333f = enumC39333f2;
                c39274g = c39274g2;
                z4 = false;
                break;
            case "LOWER_POSITIVE":
                enumC39333f2 = EnumC39333f.ACCENT_POSITIVE_TREND;
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowDown(), null, 2, null);
                enumC39333f = enumC39333f2;
                c39274g = c39274g2;
                z4 = false;
                break;
            case "LOWER_NEGATIVE":
                enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowDown(), null, 2, null);
                enumC39333f = enumC39333f2;
                c39274g = c39274g2;
                z4 = false;
                break;
            case "LOWER_NEUTRAL":
                enumC39333f2 = EnumC39333f.WHITE_50;
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowDown(), null, 2, null);
                enumC39333f = enumC39333f2;
                c39274g = c39274g2;
                z4 = false;
                break;
            default:
                enumC39333f = EnumC39333f.WHITE_50;
                z4 = true;
                c39274g = null;
                break;
        }
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 < length) {
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (!AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                    i13++;
                }
            } else {
                enumC16313m0 = null;
            }
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        C39274g c39274g3 = new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null);
        TextResource title = model.getTitle();
        TextResource currentValueDisplay = model.getCurrentValueDisplay();
        TextResource thirtyDayValueDisplay = model.getThirtyDayValueDisplay();
        TrendKey trendKey = model.getTrendKey();
        if (trendKey == null) {
            trendKey = TrendKey.NONE;
        }
        TrendKey trendKey2 = trendKey;
        String style = model.getStyle();
        EnumC31927f enumC31927f3 = EnumC31927f.DEFAULT;
        for (EnumC31927f enumC31927f4 : EnumC31927f.values()) {
            if (AbstractC22676k.m65745e(enumC31927f4.name(), style)) {
                enumC31927f2 = enumC31927f4;
                if (enumC31927f2 == null) {
                    enumC31927f = enumC31927f3;
                } else {
                    enumC31927f = enumC31927f2;
                }
                return new C4151x5(null, c39274g3, title, currentValueDisplay, thirtyDayValueDisplay, c39274g, enumC39333f, z4, trendKey2, enumC31927f, null, 1025, null);
            }
        }
        if (enumC31927f2 == null) {
            enumC31927f = enumC31927f3;
        } else {
            enumC31927f = enumC31927f2;
        }
        return new C4151x5(null, c39274g3, title, currentValueDisplay, thirtyDayValueDisplay, c39274g, enumC39333f, z4, trendKey2, enumC31927f, null, 1025, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C28801l m68319M0(HeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68386n0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23357g m68321N0(CollapsableHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68377k0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C11474i m68323O0(CtaTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68356d0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C11682h m68325P0(ArticleTileModel model) {
        EnumC11681g enumC11681g;
        Object url;
        Object image;
        Object obj;
        AbstractC22676k.m65750j(model, "model");
        AbstractC11684j abstractC11684jM68299E1 = m68299E1(model);
        String size = model.getSize();
        EnumC11681g enumC11681g2 = EnumC11681g.SMALL;
        EnumC11681g[] enumC11681gArrValues = EnumC11681g.values();
        int length = enumC11681gArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC11681g = null;
                break;
            }
            enumC11681g = enumC11681gArrValues[i13];
            if (AbstractC22676k.m65745e(enumC11681g.name(), size)) {
                break;
            }
            i13++;
        }
        EnumC11681g enumC11681g3 = enumC11681g == null ? enumC11681g2 : enumC11681g;
        TileBorderStyle borderStyle = model.getBorderStyle();
        if (borderStyle == null) {
            borderStyle = TileBorderStyle.NONE;
        }
        InterfaceC11466a interfaceC11466aM69626a = AbstractC23735w4.m69626a(borderStyle);
        if (model.getGenericInteraction() == null) {
            if (model.getCta() != null) {
                url = new ArticleTileModelEvent.Cta(model.getCta(), model.getId(), model.getTitle(), model.getIndex(), model.getAnalyticEvent());
            } else if (model.getArticleUrl() != null) {
                url = new ArticleTileModelEvent.Url(model.getArticleUrl(), model.getTitle(), model.getTag(), model.getIndex(), model.getType(), model.getId(), model.getAnalyticEvent());
            } else if (abstractC11684jM68299E1 instanceof AbstractC11684j.b) {
                image = new ArticleTileModelEvent.Image(model.getImageUrl(), model.getAnalyticEvent());
            } else {
                url = new ArticleTileModelEvent.Url("", model.getTitle(), model.getTag(), model.getIndex(), model.getType(), model.getId(), model.getAnalyticEvent());
            }
            obj = url;
            return new C11682h(obj, enumC11681g3, interfaceC11466aM69626a, abstractC11684jM68299E1, false, 16, null);
        }
        image = new DesignItemInteraction(model.getGenericInteraction(), model.getAnalyticEvent());
        obj = image;
        return new C11682h(obj, enumC11681g3, interfaceC11466aM69626a, abstractC11684jM68299E1, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C12584d m68327Q0(CurrentPlanTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource titleDisplay = model.getTitleDisplay();
        TextResource subtitleDisplay = model.getSubtitleDisplay();
        int iM46381f = AbstractC16315n0.m46381f(model.getLeadingIcon(), null, 1, null);
        String trailingIcon = model.getTrailingIcon();
        return new C12584d(titleDisplay, subtitleDisplay, iM46381f, trailingIcon != null ? AbstractC16315n0.m46377b(trailingIcon) : null, model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C4049j1 m68329R0(BehaviorCountTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<EnumC39333f> listM68401s0 = m68401s0(model.getDetailsNoAnswers().getAnswerCountImpactStyle(), model.getDetailsYesAnswers().getAnswerCountImpactStyle());
        TextResource detailsCountTitleDisplay = model.getDetailsCountTitleDisplay();
        TextResource detailsCountSubtitleDisplay = model.getDetailsCountSubtitleDisplay();
        C38072d c38072d = C38072d.f163053a;
        int cross = c38072d.m121951d().getTinyIcons().getCross();
        EnumC39333f enumC39333f = listM68401s0.get(0);
        return new C4049j1(detailsCountTitleDisplay, detailsCountSubtitleDisplay, model.getDetailsNoAnswers().getAnswerCountTextDisplay(), enumC39333f, cross, model.getDetailsYesAnswers().getAnswerCountTextDisplay(), listM68401s0.get(1), AbstractC2875y.m8290c(c38072d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C14067e m68331S0(GoalSettingsTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23726v1.m69575b(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C38042d m68333T0(ImageAndIconModel model) {
        AbstractC22676k.m65750j(model, "model");
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getIcon());
        String url = model.getUrl();
        return new C38042d(enumC16313m0M46377b, url != null ? new AbstractC22403o.c(url, 0, 0, 0, 14, null) : null, model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C38042d m68335U0(LogoNavModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C38042d(null, new AbstractC22403o.c(model.getUrl(), 0, 0, 0, 14, null), model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C32241c m68337V0(ImpactMagnitudeTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23625f2.m68745a(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C33573j m68339W0(ImpactTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<InterfaceC25312u> listM60540g = AbstractC21537c.m60554d(new C23751z2(18)).m60540g(model.getImpactCards());
        AbstractC22676k.m65748h(listM60540g, "null cannot be cast to non-null type kotlin.collections.List<com.whoop.design.atomic.molecule.impactcard.ImpactCardState>");
        return new C33573j(null, listM60540g, model.getImpactHeader().getImpactLabelCenter(), m68410v0(model.getImpactHeader().getImpactLabelLeft(), true), m68410v0(model.getImpactHeader().getImpactLabelRight(), false), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C23454a0 m68341X0(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C4092p2 m68343Y0(InfoCalloutTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23653j2.m68922b(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C33579p m68345Z0(InsufficientImpactTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(17));
        TextResource insufficientAnswersTitleDisplay = model.getInsufficientAnswersTitleDisplay();
        TextResource insufficientAnswersSubtitleDisplay = model.getInsufficientAnswersSubtitleDisplay();
        List<InterfaceC25312u> listM60540g = c21535aM60554d.m60540g(model.getImpactCards());
        AbstractC22676k.m65748h(listM60540g, "null cannot be cast to non-null type kotlin.collections.List<com.whoop.design.atomic.molecule.impactcard.ImpactCardState>");
        return new C33579p(null, insufficientAnswersTitleDisplay, insufficientAnswersSubtitleDisplay, listM60540g, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C23454a0 m68348a1(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C30885c m68351b1(MetricEducationModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68419y0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C4160z1 m68354c1(GlassTileModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource description = model.getDescription();
        String icon = model.getIcon();
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
        return new C4160z1(title, description, enumC16313m0 != null ? Integer.valueOf(enumC16313m0.toWhoopIcon()) : null);
    }

    /* JADX INFO: renamed from: d0 */
    public static final C11474i m68356d0(CtaTileModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC22400l enumC22400l;
        C11468c c11468c;
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(model, "model");
        String buttonIcon = model.getButtonIcon();
        if (buttonIcon == null) {
            buttonIcon = "";
        }
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_CARET_FORWARD;
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
            if (AbstractC22676k.m65745e(enumC16313m0.name(), buttonIcon)) {
                break;
            }
            i14++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        int whoopIcon = enumC16313m1.toWhoopIcon();
        String tileCta = model.getTileCta();
        EnumC22400l enumC22400l2 = EnumC22400l.JOURNAL;
        EnumC22400l[] enumC22400lArrValues = EnumC22400l.values();
        int length2 = enumC22400lArrValues.length;
        while (true) {
            if (i13 >= length2) {
                enumC22400l = null;
                break;
            }
            enumC22400l = enumC22400lArrValues[i13];
            if (AbstractC22676k.m65745e(enumC22400l.name(), tileCta)) {
                break;
            }
            i13++;
        }
        if (enumC22400l != null) {
            enumC22400l2 = enumC22400l;
        }
        EnumC22400l enumC22400lM69671k = AbstractC23741x4.m69671k(enumC22400l2);
        C39274g c39274gM69668h = AbstractC23741x4.m69668h(enumC22400lM69671k, model.getIcon());
        TextResource buttonText = model.getButtonText();
        C11467b c11467b = buttonText != null ? new C11467b(buttonText, AbstractC23741x4.m69661a(enumC22400lM69671k), new C39274g(whoopIcon, null, 2, null), AbstractC23741x4.m69664d(enumC22400lM69671k)) : null;
        CtaSupplementalInfo ctaSupplementalInfo = model.getCtaSupplementalInfo();
        if (ctaSupplementalInfo != null) {
            AddActivity addActivity = ctaSupplementalInfo.getAddActivity();
            c11468c = new C11468c(addActivity != null ? addActivity.getInternalName() : null);
        } else {
            c11468c = null;
        }
        EnumC11472g enumC11472g = EnumC11472g.TILE_CLICKED;
        String backgroundImageUrl = model.getBackgroundImageUrl();
        AbstractC22403o.c cVar = backgroundImageUrl != null ? new AbstractC22403o.c(backgroundImageUrl, 0, 0, 0, 14, null) : null;
        InterfaceC21430b interfaceC21430bM69662b = AbstractC23741x4.m69662b(enumC22400lM69671k);
        AbstractC18247a abstractC18247aM69663c = AbstractC23741x4.m69663c(enumC22400lM69671k);
        String startImageUrl = model.getStartImageUrl();
        if (startImageUrl == null) {
            startImageUrl = model.getLeftImageUrl();
        }
        String str = startImageUrl;
        AbstractC22403o.c cVar2 = str != null ? new AbstractC22403o.c(str, 0, 0, 0, 14, null) : null;
        String endImageUrl = model.getEndImageUrl();
        AbstractC22403o.c cVar3 = endImageUrl != null ? new AbstractC22403o.c(endImageUrl, 0, 0, 0, 14, null) : null;
        boolean enabled = model.getEnabled();
        String subtitle = model.getSubtitle();
        if (subtitle == null || (textResourceM21267a = AbstractC8693b.m21278l(subtitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        return new C11474i(enumC11472g, enumC22400lM69671k, null, model.getTitle(), textResourceM21267a, null, c39274gM69668h, cVar, cVar2, cVar3, null, enabled, false, AbstractC23735w4.m69626a(model.getBorderStyle()), AbstractC23741x4.m69666f(enumC22400lM69671k), c11467b, model.getShowCaretIcon(), model.getDismissible(), c11468c, abstractC18247aM69663c, interfaceC21430bM69662b, null, AbstractC23741x4.m69670j(enumC22400lM69671k), AbstractC23741x4.m69669i(enumC22400lM69671k), AbstractC23741x4.m69665e(enumC22400lM69671k), 0.0f, AbstractC23741x4.m69667g(enumC22400lM69671k), EnumC11472g.TILE_DISMISSED, model.getDestination(), 35656740, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C33569f m68357d1(LockedImpactOnRecoveryModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C33569f(AbstractC8693b.m21278l(model.getTitle()), null, AbstractC8693b.m21278l(model.getDescription()), null, new InterfaceC33570g.a(AbstractC8693b.m21278l(model.getValue()), null, AbstractC37056f.m118959K(new C4115s4(model.getDetailsYesAnswers().getAnswerCountTextDisplay(), model.getDetailsYesAnswers().getTotalCountTextDisplay(), AbstractC16272a.f61965N, m68407u0(model.getDetailsYesAnswers().getAnswerCountImpactStyle()), m68404t0(model.getDetailsYesAnswers().getAnswerCountImpactStyle()), true, false, 64, null), new C4115s4(model.getDetailsNoAnswers().getAnswerCountTextDisplay(), model.getDetailsNoAnswers().getTotalCountTextDisplay(), AbstractC16272a.f62085g4, m68407u0(model.getDetailsNoAnswers().getAnswerCountImpactStyle()), m68404t0(model.getDetailsNoAnswers().getAnswerCountImpactStyle()), true, false, 64, null)), 2, null), AbstractC8693b.m21278l(model.getCtaButtonLabel()), 10, null);
    }

    /* JADX INFO: renamed from: e0 */
    public static final C4082o m68359e0(ActivityModel model) {
        AbstractC22676k.m65750j(model, "model");
        boolean z4 = !AbstractC22676k.m65745e(model.getStatus(), "COMPLETE");
        EnumC39333f enumC39333fM68398r0 = m68398r0(AbstractC21128a.m58959a(model.getType()), model.getStatus());
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(model.getIconUrl());
        TextResource scoreDisplay = model.getScoreDisplay();
        String secondaryIconUrl = model.getSecondaryIconUrl();
        EnumC16313m0 enumC16313m0 = null;
        if (secondaryIconUrl != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.OTHER;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), secondaryIconUrl)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 == null) {
                enumC16313m0 = enumC16313m1;
            }
        }
        return new C4082o(z4, enumC39333fM68398r0, abstractC22403oM64503l, scoreDisplay, enumC16313m0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C33569f m68360e1(UnlockedImpactOnRecoveryModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(20));
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getBehaviorImpactDescription());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getCtaButtonLabel());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getValue());
        EnumC39333f enumC39333fM68831b = C23639h2.f93783a.m68831b(model.getStyle());
        InterfaceC25312u interfaceC25312uM60544l = c21535aM60554d.m60544l(model.getImpactBarSegment());
        AbstractC22676k.m65748h(interfaceC25312uM60544l, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.graphing.HorizontalImpactBarViewState");
        return new C33569f(textResourceM21278l, null, textResourceM21278l2, null, new InterfaceC33570g.b(textResourceM21278l4, enumC39333fM68831b, (C39065r) interfaceC25312uM60544l), textResourceM21278l3, 10, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f0 */
    public static final AbstractC4145x m68362f0(ActivityModel model) {
        AbstractC22676k.m65750j(model, "model");
        String status = model.getStatus();
        switch (status.hashCode()) {
            case -1938208570:
                if (status.equals("PROCESS_NOW")) {
                    return new AbstractC4145x.a(new TextResource.C8688b(AbstractC16277f.f62217B, null, 2, null), null, EnumC4040i.PROCESS_NOW, false, AbstractC22676k.m65745e(model.getCtaState(), "SHOW_ONBOARDING") ? AbstractC4075n.m12513r() : null, 2, null);
                }
                break;
            case -248942215:
                if (status.equals("ADD_SLEEP")) {
                    return new AbstractC4145x.a(new TextResource.C8688b(AbstractC16277f.f62402z, null, 2, null), null, EnumC4040i.ADD_SLEEP, false, null, 26, null);
                }
                break;
            case 35394935:
                if (status.equals("PENDING")) {
                    return new AbstractC4145x.b(new TextResource.C8688b(AbstractC16277f.f62213A, null, 2, null), false);
                }
                break;
            case 183181625:
                if (status.equals("COMPLETE")) {
                    TextResource startTimeText = model.getStartTimeText();
                    if (startTimeText == null) {
                        startTimeText = AbstractC8693b.m21278l("");
                    }
                    TextResource endTimeText = model.getEndTimeText();
                    if (endTimeText == null) {
                        endTimeText = AbstractC8693b.m21278l("");
                    }
                    return new AbstractC4145x.c(startTimeText, endTimeText, m68398r0(AbstractC21128a.m58959a(model.getType()), model.getStatus()));
                }
                break;
        }
        TextResource startTimeText2 = model.getStartTimeText();
        if (startTimeText2 == null) {
            startTimeText2 = AbstractC8693b.m21278l("");
        }
        TextResource endTimeText2 = model.getEndTimeText();
        if (endTimeText2 == null) {
            endTimeText2 = AbstractC8693b.m21278l("");
        }
        return new AbstractC4145x.c(startTimeText2, endTimeText2, m68398r0(AbstractC21128a.m58959a(model.getType()), model.getStatus()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C23454a0 m68363f1(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final C4069m0 m68365g0(AlertTileModel model) {
        EnumC39333f enumC39333f;
        EnumC22400l enumC22400l;
        AbstractC4076n0 aVar;
        AbstractC22676k.m65750j(model, "model");
        String reason = model.getReason();
        EnumC22400l enumC22400l2 = EnumC22400l.UNKNOWN;
        EnumC22400l[] enumC22400lArrValues = EnumC22400l.values();
        int length = enumC22400lArrValues.length;
        int i13 = 0;
        while (true) {
            enumC39333f = null;
            if (i13 >= length) {
                enumC22400l = null;
                break;
            }
            enumC22400l = enumC22400lArrValues[i13];
            if (AbstractC22676k.m65745e(enumC22400l.name(), reason)) {
                break;
            }
            i13++;
        }
        if (enumC22400l != null) {
            enumC22400l2 = enumC22400l;
        }
        switch (a.f93588h[enumC22400l2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            case 13:
            case 14:
                enumC39333f = EnumC39333f.BRAND_WHITE;
                break;
            default:
                enumC22400l2 = EnumC22400l.UNKNOWN;
                break;
        }
        EnumC22400l enumC22400l3 = enumC22400l2;
        String type = model.getType();
        Locale locale = Locale.ROOT;
        String upperCase = type.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        String upperCase2 = "error".toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
        if (upperCase.equals(upperCase2) && enumC22400l3 == EnumC22400l.MEMBERSHIP_EXPIRED_V2) {
            aVar = AbstractC4076n0.b.f16557d;
        } else {
            String upperCase3 = model.getType().toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
            String upperCase4 = "warning".toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
            if (upperCase3.equals(upperCase4)) {
                aVar = new AbstractC4076n0.e(enumC39333f);
            } else {
                String upperCase5 = model.getType().toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase5, "toUpperCase(...)");
                String upperCase6 = "success".toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase6, "toUpperCase(...)");
                aVar = upperCase5.equals(upperCase6) ? AbstractC4076n0.d.f16560d : new AbstractC4076n0.a(enumC39333f);
            }
        }
        return new C4069m0(model.getTitle(), model.getSubtitle(), aVar, enumC22400l3, model.getDestination(), model.getTracking(), model.getDismissalId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C4002c3 m68366g1(ListItemTileModel model) {
        EnumC4009d3 enumC4009d3;
        AbstractC22676k.m65750j(model, "model");
        String tileType = model.getTileType();
        EnumC4009d3 enumC4009d4 = EnumC4009d3.ARTICLE;
        EnumC4009d3[] enumC4009d3ArrValues = EnumC4009d3.values();
        int length = enumC4009d3ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC4009d3 = null;
                break;
            }
            enumC4009d3 = enumC4009d3ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC4009d3.name(), tileType)) {
                break;
            }
            i13++;
        }
        return new C4002c3(enumC4009d3 == null ? enumC4009d4 : enumC4009d3, AbstractC22404p.m64503l(model.getTileImageUrl()), AbstractC8693b.m21278l(model.getTileTitle()), AbstractC8693b.m21278l(model.getSubText()), model.getCtaUrl(), model.getName());
    }

    /* JADX INFO: renamed from: h0 */
    public static final C4118t0 m68368h0(CoachingTileModel model, boolean z4) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
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
        return new C4118t0(null, null, new AbstractC4125u0.e(enumC16313m1.toWhoopIcon(), model.getAlarmState() == AlarmStatus.OFF ? EnumC39333f.WHITE_50 : EnumC39333f.BRAND_WHITE, AbstractC8693b.m21278l(model.getTitle()), model.getSubtitle() != null ? AbstractC8693b.m21278l(model.getSubtitle()) : null, AbstractC8693b.m21278l(model.getCtaText())), null, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C4109r5 m68369h1(TitleTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C4109r5(model.getText());
    }

    /* JADX INFO: renamed from: i0 */
    public static final C4118t0 m68371i0(SleepPlannerAlarmCardStatus model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
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
        return new C4118t0(null, null, new AbstractC4125u0.a(enumC16313m1.toWhoopIcon(), EnumC39333f.BRAND_WHITE, AbstractC8693b.m21278l(model.getLeftText()), null, AbstractC8693b.m21278l(model.getRightText()), 8, null), null, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C25201d m68372i1(HeaderItemsCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        TextResource title = model.getTitle();
        String titleIcon = model.getTitleIcon();
        return new C25201d(title, titleIcon != null ? Integer.valueOf(AbstractC16315n0.m46380e(titleIcon, EnumC16313m0.WHOOP_LOGO_CIRCLE)) : null, model.getStyle(), c21535aM60555e.m60540g(model.getItems()));
    }

    /* JADX INFO: renamed from: j0 */
    public static final C4118t0 m68374j0(VowCtaModel vowCtaModel) {
        EnumC22400l enumC22400l;
        EnumC22400l enumC22400l2;
        EnumC16313m0 enumC16313m0;
        EnumC22400l enumC22400l3;
        EnumC16313m0 enumC16313m1;
        EnumC22400l enumC22400l4;
        EnumC16313m0 enumC16313m2;
        AbstractC22676k.m65750j(vowCtaModel, "vowCtaModel");
        String cta = vowCtaModel.getCta();
        EnumC22400l enumC22400l5 = EnumC22400l.NONE;
        EnumC22400l[] enumC22400lArrValues = EnumC22400l.values();
        int length = enumC22400lArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC22400l = null;
                break;
            }
            enumC22400l = enumC22400lArrValues[i14];
            if (AbstractC22676k.m65745e(enumC22400l.name(), cta)) {
                break;
            }
            i14++;
        }
        if (enumC22400l != null) {
            enumC22400l5 = enumC22400l;
        }
        if (enumC22400l5 != EnumC22400l.SLEEP_COACH) {
            String cta2 = vowCtaModel.getCta();
            EnumC22400l enumC22400l6 = EnumC22400l.NONE;
            EnumC22400l[] enumC22400lArrValues2 = EnumC22400l.values();
            int length2 = enumC22400lArrValues2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC22400l2 = null;
                    break;
                }
                enumC22400l2 = enumC22400lArrValues2[i15];
                if (AbstractC22676k.m65745e(enumC22400l2.name(), cta2)) {
                    break;
                }
                i15++;
            }
            EnumC22400l enumC22400l7 = enumC22400l2 == null ? enumC22400l6 : enumC22400l2;
            String icon = vowCtaModel.getIcon();
            EnumC16313m0 enumC16313m3 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length3 = enumC16313m0ArrValues.length;
            while (true) {
                if (i13 >= length3) {
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
                enumC16313m3 = enumC16313m0;
            }
            int whoopIcon = enumC16313m3.toWhoopIcon();
            EnumC39333f enumC39333f = EnumC39333f.WHITE_50;
            TextResource title = vowCtaModel.getTitle();
            TextResource text = vowCtaModel.getCtaText().getText();
            String subtitle = vowCtaModel.getSubtitle();
            return new C4118t0(null, enumC22400l7, new AbstractC4125u0.e(whoopIcon, enumC39333f, title, subtitle != null ? AbstractC8693b.m21278l(subtitle) : null, text), null, 9, null);
        }
        int i16 = a.f93590j[vowCtaModel.getCtaText().getBatteryState().ordinal()];
        if (i16 == 1) {
            String cta3 = vowCtaModel.getCta();
            EnumC22400l enumC22400l8 = EnumC22400l.NONE;
            EnumC22400l[] enumC22400lArrValues3 = EnumC22400l.values();
            int length4 = enumC22400lArrValues3.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length4) {
                    enumC22400l3 = null;
                    break;
                }
                enumC22400l3 = enumC22400lArrValues3[i17];
                if (AbstractC22676k.m65745e(enumC22400l3.name(), cta3)) {
                    break;
                }
                i17++;
            }
            EnumC22400l enumC22400l9 = enumC22400l3 == null ? enumC22400l8 : enumC22400l3;
            String icon2 = vowCtaModel.getIcon();
            EnumC16313m0 enumC16313m4 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length5 = enumC16313m0ArrValues2.length;
            while (true) {
                if (i13 >= length5) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues2[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon2)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m1 != null) {
                enumC16313m4 = enumC16313m1;
            }
            int whoopIcon2 = enumC16313m4.toWhoopIcon();
            EnumC39333f enumC39333fM68392p0 = m68392p0(vowCtaModel.getAlarmState());
            TextResource title2 = vowCtaModel.getTitle();
            TextResource text2 = vowCtaModel.getCtaText().getText();
            String subtitle2 = vowCtaModel.getSubtitle();
            return new C4118t0(null, enumC22400l9, new AbstractC4125u0.e(whoopIcon2, enumC39333fM68392p0, title2, subtitle2 != null ? AbstractC8693b.m21278l(subtitle2) : null, text2), null, 9, null);
        }
        if (i16 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String cta4 = vowCtaModel.getCta();
        EnumC22400l enumC22400l10 = EnumC22400l.NONE;
        EnumC22400l[] enumC22400lArrValues4 = EnumC22400l.values();
        int length6 = enumC22400lArrValues4.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length6) {
                enumC22400l4 = null;
                break;
            }
            enumC22400l4 = enumC22400lArrValues4[i18];
            if (AbstractC22676k.m65745e(enumC22400l4.name(), cta4)) {
                break;
            }
            i18++;
        }
        EnumC22400l enumC22400l11 = enumC22400l4 == null ? enumC22400l10 : enumC22400l4;
        String icon3 = vowCtaModel.getIcon();
        EnumC16313m0 enumC16313m5 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
        int length7 = enumC16313m0ArrValues3.length;
        while (true) {
            if (i13 >= length7) {
                enumC16313m2 = null;
                break;
            }
            enumC16313m2 = enumC16313m0ArrValues3[i13];
            if (AbstractC22676k.m65745e(enumC16313m2.name(), icon3)) {
                break;
            }
            i13++;
        }
        if (enumC16313m2 != null) {
            enumC16313m5 = enumC16313m2;
        }
        int whoopIcon3 = enumC16313m5.toWhoopIcon();
        EnumC39333f enumC39333fM68392p1 = m68392p0(vowCtaModel.getAlarmState());
        TextResource title3 = vowCtaModel.getTitle();
        TextResource text3 = vowCtaModel.getCtaText().getText();
        String subtitle3 = vowCtaModel.getSubtitle();
        return new C4118t0(null, enumC22400l11, new AbstractC4125u0.b(whoopIcon3, enumC39333fM68392p1, title3, subtitle3 != null ? AbstractC8693b.m21278l(subtitle3) : null, text3, true), null, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C35768i m68375j1(ItemsCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23673m2.m69083d(model, AbstractC21537c.m60555e(null, 1, null));
    }

    /* JADX INFO: renamed from: k0 */
    public static final C23357g m68377k0(CollapsableHeaderModel model) {
        C23358h c23358h;
        AbstractC22676k.m65750j(model, "model");
        HeaderIconConfig startNavigationButton = model.getStartNavigationButton();
        HeaderIconConfig endNavigationButton = model.getEndNavigationButton();
        String backgroundUrl = model.getBackgroundUrl();
        EnumC2888c enumC2888c = null;
        AbstractC22403o.c cVar = backgroundUrl != null ? new AbstractC22403o.c(backgroundUrl, AbstractC16272a.f62056c, 0, 0, 12, null) : null;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String subtitle = model.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(subtitle);
        String icon = startNavigationButton.getIcon();
        if (icon == null) {
            icon = "CARET_BACKWARD";
        }
        C23358h c23358h2 = new C23358h(AbstractC16315n0.m46376a(icon), startNavigationButton.getInteraction());
        if (endNavigationButton != null) {
            String icon2 = endNavigationButton.getIcon();
            c23358h = new C23358h(icon2 != null ? AbstractC16315n0.m46376a(icon2) : null, endNavigationButton.getInteraction());
        } else {
            c23358h = null;
        }
        String subtitleTypography = model.getSubtitleTypography();
        if (subtitleTypography != null) {
            for (EnumC2888c enumC2888c2 : EnumC2888c.values()) {
                if (AbstractC22676k.m65745e(enumC2888c2.name(), subtitleTypography)) {
                    enumC2888c = enumC2888c2;
                    break;
                }
            }
        }
        return new C23357g(textResourceM21278l, textResourceM21278l2, c23358h2, c23358h, cVar, enumC2888c, model.getSubtitleStickOnScroll(), false, null, 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C15461e m68378k1(PlanTileModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        boolean z4 = (model.getStyle() == PlanStyle.NONE && model.getLocked()) ? false : true;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitleDisplay());
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
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
        int whoopIcon = enumC16313m1.toWhoopIcon();
        String backgroundImage = model.getBackgroundImage();
        return new C15461e(textResourceM21278l, textResourceM21278l2, m68380l0(model.getStyle()), whoopIcon, model.getLocked(), model.getStyle() == PlanStyle.NONE, m68395q0(model.getStyle()), backgroundImage != null ? new AbstractC22403o.c(backgroundImage, 0, 0, 0, 14, null) : null, model.getDestination(), z4);
    }

    /* JADX INFO: renamed from: l0 */
    private static final InterfaceC39332e m68380l0(PlanStyle planStyle) {
        switch (a.f93592l[planStyle.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(b.f93597w);
            case 2:
                return p745y81.Function1.m125323a(c.f93600w);
            case 3:
                return p745y81.Function1.m125323a(d.f93603w);
            case 4:
                return p745y81.Function1.m125323a(e.f93606w);
            case 5:
                return p745y81.Function1.m125323a(k.f93624w);
            case 6:
                return p745y81.Function1.m125323a(l.f93627w);
            case 7:
                return p745y81.Function1.m125323a(m.f93630w);
            case 8:
                return p745y81.Function1.m125323a(n.f93633w);
            case 9:
                return p745y81.Function1.m125323a(o.f93636w);
            case 10:
                return p745y81.Function1.m125323a(p.f93639w);
            case 11:
                return p745y81.Function1.m125323a(q.f93642w);
            case 12:
                return p745y81.Function1.m125323a(r.f93645w);
            case 13:
                return p745y81.Function1.m125323a(s.f93648w);
            case 14:
                return p745y81.Function1.m125323a(f.f93609w);
            case 15:
                return p745y81.Function1.m125323a(g.f93612w);
            case 16:
                return p745y81.Function1.m125323a(h.f93615w);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return p745y81.Function1.m125323a(i.f93618w);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return p745y81.Function1.m125323a(j.f93621w);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x008d  */
    /* JADX INFO: renamed from: l1 */
    public static final C39059l m68381l1(HeartRateZone model) {
        List listM7193a;
        C23465k c23465k;
        RangeModal graphRangeEndpoints;
        AbstractC22676k.m65750j(model, "model");
        EnumC25417b enumC25417bM68302F1 = m68302F1(model.getId());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getBarGraphTileTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getBarGraphTileSubtitleDisplay());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getBarGraphTilePercentageDisplay());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getBarGraphTileTimeDisplay());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(model.getBarGraphTileTimeSuffixDisplay());
        EnumC39048a enumC39048aM74610c = AbstractC25418c.m74610c(model.getTileStyle());
        BarGraph barGraph = model.getBarGraph();
        if (barGraph != null) {
            List<RangeModal> timeBoundRanges = barGraph.getTimeBoundRanges();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(timeBoundRanges, 10));
            for (RangeModal rangeModal : timeBoundRanges) {
                float f13 = 100;
                arrayList.add(new C23465k(Float.valueOf(rangeModal.getLowerEndpoint() * f13), Float.valueOf(rangeModal.getUpperEndpoint() * f13)));
            }
            listM7193a = AbstractC2333f.m7193a(arrayList);
            if (listM7193a == null) {
                listM7193a = C25271y.f99162w;
            }
        } else {
            listM7193a = C25271y.f99162w;
        }
        List list = listM7193a;
        BarGraph barGraph2 = model.getBarGraph();
        if (barGraph2 == null || (graphRangeEndpoints = barGraph2.getGraphRangeEndpoints()) == null) {
            c23465k = null;
        } else {
            float f14 = 100;
            c23465k = new C23465k(Float.valueOf(graphRangeEndpoints.getLowerEndpoint() * f14), Float.valueOf(graphRangeEndpoints.getUpperEndpoint() * f14));
        }
        return new C39059l(enumC25417bM68302F1, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, enumC39048aM74610c, null, false, false, list, false, c23465k, false, false, null, 60288, null);
    }

    /* JADX INFO: renamed from: m0 */
    public static final List<C3892e> m68383m0(List<HealthMonitorMetricModel> metricList) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(metricList, "metricList");
        List<HealthMonitorMetricModel> list = metricList;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (HealthMonitorMetricModel healthMonitorMetricModel : list) {
            TrendTypeEnum trendTypeEnumM68413w0 = m68413w0(healthMonitorMetricModel.getStatus());
            String title = healthMonitorMetricModel.getTitle();
            String icon = healthMonitorMetricModel.getIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
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
            arrayList.add(new C3892e(enumC16313m1.toWhoopIcon(), title, m68311I1(trendTypeEnumM68413w0), m68305G1(trendTypeEnumM68413w0), m68308H1(trendTypeEnumM68413w0)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C4108r4 m68384m1(ProfileInfoTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68416x0(model, AbstractC21537c.m60554d(new C23747y4(23)));
    }

    /* JADX INFO: renamed from: n0 */
    public static final C28801l m68386n0(HeaderModel model) {
        CtaState ctaState;
        EnumC28798i enumC28798i;
        EnumC28807r enumC28807r;
        EnumC2888c enumC2888c;
        EnumC2888c enumC2888c2;
        AbstractC28805p aVar;
        EnumC22400l enumC22400l;
        AbstractC28805p eVar;
        EnumC2888c enumC2888c3;
        EnumC28807r enumC28807r2;
        AbstractC22676k.m65750j(model, "model");
        Integer numM46376a = AbstractC16315n0.m46376a(model.getIcon());
        String ctaState2 = model.getCtaState();
        if (ctaState2 == null) {
            ctaState2 = "";
        }
        CtaState ctaState3 = CtaState.NORMAL;
        CtaState[] ctaStateArrValues = CtaState.values();
        int length = ctaStateArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                ctaState = null;
                break;
            }
            ctaState = ctaStateArrValues[i14];
            if (AbstractC22676k.m65745e(ctaState.name(), ctaState2)) {
                break;
            }
            i14++;
        }
        if (ctaState != null) {
            ctaState3 = ctaState;
        }
        boolean z4 = ctaState3 == CtaState.SHOW_ONBOARDING;
        boolean z13 = ctaState3 == CtaState.SHOW_AI;
        String subtitleLocation = model.getSubtitleLocation();
        if (subtitleLocation == null) {
            enumC28798i = null;
            break;
        }
        EnumC28798i[] enumC28798iArrValues = EnumC28798i.values();
        int length2 = enumC28798iArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length2) {
                enumC28798i = null;
                break;
            }
            enumC28798i = enumC28798iArrValues[i15];
            if (AbstractC22676k.m65745e(enumC28798i.name(), subtitleLocation)) {
                break;
            }
            i15++;
        }
        HeaderStyle style = model.getStyle();
        if (style != null) {
            String strName = style.name();
            EnumC28807r[] enumC28807rArrValues = EnumC28807r.values();
            int length3 = enumC28807rArrValues.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length3) {
                    enumC28807r2 = null;
                    break;
                }
                enumC28807r2 = enumC28807rArrValues[i16];
                if (AbstractC22676k.m65745e(enumC28807r2.name(), strName)) {
                    break;
                }
                i16++;
            }
            enumC28807r = enumC28807r2;
        } else {
            enumC28807r = null;
        }
        String typography = model.getTypography();
        if (typography != null) {
            EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
            int length4 = enumC2888cArrValues.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length4) {
                    enumC2888c3 = null;
                    break;
                }
                enumC2888c3 = enumC2888cArrValues[i17];
                if (AbstractC22676k.m65745e(enumC2888c3.name(), typography)) {
                    break;
                }
                i17++;
            }
            enumC2888c = enumC2888c3;
        } else {
            enumC2888c = null;
        }
        boolean z14 = (model.getSubtitle() == null || AbstractC22676k.m65745e(model.getSubtitle(), AbstractC8693b.m21267a())) ? false : true;
        if (z14 || numM46376a == null) {
            EnumC28807r enumC28807r3 = enumC28807r;
            EnumC2888c enumC2888c4 = enumC2888c;
            if (z14 && enumC28798i != EnumC28798i.BELOW) {
                if (model.getSubtitleEnd() != null) {
                    String id4 = model.getId();
                    aVar = new AbstractC28805p.c(id4 == null ? "" : id4, model.getTitle(), model.getSubtitle(), model.getSubtitleEnd(), enumC28807r3, enumC2888c4);
                } else if (numM46376a == null) {
                    eVar = new AbstractC28805p.d(model.getTitle(), model.getSubtitle(), enumC28807r3);
                } else {
                    TextResource title = model.getTitle();
                    TextResource subtitle = model.getSubtitle();
                    int iIntValue = numM46376a.intValue();
                    String cta = model.getCta();
                    String str = cta != null ? cta : "";
                    EnumC22400l enumC22400l2 = EnumC22400l.NONE;
                    EnumC22400l[] enumC22400lArrValues = EnumC22400l.values();
                    int length5 = enumC22400lArrValues.length;
                    while (true) {
                        if (i13 >= length5) {
                            enumC22400l = null;
                            break;
                        }
                        enumC22400l = enumC22400lArrValues[i13];
                        if (AbstractC22676k.m65745e(enumC22400l.name(), str)) {
                            break;
                        }
                        i13++;
                    }
                    eVar = new AbstractC28805p.e(title, subtitle, iIntValue, enumC22400l == null ? enumC22400l2 : enumC22400l, z4, z13, 0, false, enumC28807r3, enumC2888c4, model.getDestination(), model.getTitleEnd(), 192, null);
                }
                return new C28801l(eVar, null, 2, null);
            }
            TextResource title2 = model.getTitle();
            TextResource subtitle2 = enumC28798i == EnumC28798i.BELOW ? model.getSubtitle() : null;
            String subtitleTypography = model.getSubtitleTypography();
            if (subtitleTypography == null) {
                enumC2888c2 = null;
                break;
            }
            EnumC2888c[] enumC2888cArrValues2 = EnumC2888c.values();
            int length6 = enumC2888cArrValues2.length;
            while (true) {
                if (i13 >= length6) {
                    enumC2888c2 = null;
                    break;
                }
                enumC2888c2 = enumC2888cArrValues2[i13];
                if (AbstractC22676k.m65745e(enumC2888c2.name(), subtitleTypography)) {
                    break;
                }
                i13++;
            }
            aVar = new AbstractC28805p.a(title2, subtitle2, enumC28807r3, enumC2888c4, enumC2888c2, enumC28798i, model.getLeadingButton(), false, null, model.getTitleEnd(), 384, null);
        } else {
            aVar = new AbstractC28805p.b(model.getTitle(), numM46376a.intValue(), 0, enumC28807r, enumC2888c, model.getDestination(), 4, null);
        }
        eVar = aVar;
        return new C28801l(eVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C23454a0 m68387n1(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final C23743y0 m68389o0() {
        return f93580a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C4094p4 m68390o1(ProfileInfoTileListModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23747y4(24));
        List<ProfileInfoTileModel> tiles = model.getTiles();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(C4108r4.m12654b(m68416x0((ProfileInfoTileModel) it.next(), c21535aM60554d), null, EnumC4073m4.LIST, null, null, null, null, null, null, null, null, null, null, 4093, null));
        }
        return new C4094p4(arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    public static final EnumC39333f m68392p0(AlarmStatus alarmStatus) {
        AbstractC22676k.m65750j(alarmStatus, "alarmStatus");
        int i13 = a.f93591k[alarmStatus.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return EnumC39333f.BRAND_WHITE;
        }
        if (i13 == 4) {
            return EnumC39333f.RECOVERY_HIGH_RECOVERY;
        }
        if (i13 == 5) {
            return EnumC39333f.ACCENT_ACTION;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m68393p1(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    private static final boolean m68395q0(PlanStyle planStyle) {
        int i13 = a.f93592l[planStyle.ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C22204c m68396q1(VowModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        String icon = model.getIcon();
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
        Integer numValueOf = enumC16313m0 != null ? Integer.valueOf(enumC16313m0.toWhoopIcon()) : null;
        TextResource title = model.getTitle();
        TextResource body = model.getBody();
        VowCtaModel vowCta = model.getVowCta();
        return new C22204c(numValueOf, title, body, vowCta != null ? m68374j0(vowCta) : null);
    }

    /* JADX INFO: renamed from: r0 */
    public static final EnumC39333f m68398r0(ActivityDetailType type, String status) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(status, "status");
        if (status.equals("INCOMPLETE") && type == ActivityDetailType.SLEEP) {
            return EnumC39333f.SLEEP;
        }
        if (!status.equals("COMPLETE")) {
            return EnumC39333f.BLACK_20;
        }
        if (type == ActivityDetailType.CARDIO || type == ActivityDetailType.WEIGHTLIFTING_MSK) {
            return EnumC39333f.STRAIN;
        }
        if (type == ActivityDetailType.RECOVERY) {
            return EnumC39333f.RECOVERY;
        }
        return type == ActivityDetailType.SLEEP ? EnumC39333f.SLEEP : EnumC39333f.BLACK_20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final C4018e5 m68399r1(SplitContainerCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(19));
        return new C4018e5(c21535aM60554d.m60541h(model.getStartItem()), c21535aM60554d.m60541h(model.getEndItem()), model.getShowDivider());
    }

    /* JADX INFO: renamed from: s0 */
    public static final List<EnumC39333f> m68401s0(ImpactStyle noStyle, ImpactStyle yesStyle) {
        AbstractC22676k.m65750j(noStyle, "noStyle");
        AbstractC22676k.m65750j(yesStyle, "yesStyle");
        ImpactStyle impactStyle = ImpactStyle.ELIGIBLE;
        if (noStyle == impactStyle && yesStyle == impactStyle) {
            return AbstractC37056f.m118959K(EnumC39333f.BRAND_WHITE, EnumC39333f.RECOVERY);
        }
        if (noStyle == impactStyle && yesStyle == ImpactStyle.INELIGIBLE) {
            return AbstractC37056f.m118959K(EnumC39333f.BRAND_WHITE, EnumC39333f.WHITE_50);
        }
        if (noStyle == ImpactStyle.INELIGIBLE && yesStyle == impactStyle) {
            EnumC39333f enumC39333f = EnumC39333f.WHITE_50;
            return AbstractC37056f.m118959K(enumC39333f, enumC39333f);
        }
        EnumC39333f enumC39333f2 = EnumC39333f.WHITE_50;
        return AbstractC37056f.m118959K(enumC39333f2, enumC39333f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m68402s1(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t0 */
    public static final EnumC39333f m68404t0(ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        int i13 = a.f93587g[impactStyle.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? EnumC39333f.BRAND_WHITE : EnumC39333f.NEUTRAL_15;
        }
        return EnumC39333f.WHITE_10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C4044i3 m68405t1(MiniMonitorCardModel model) {
        EnumC4142w3 enumC4142w3;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getEndIcon());
        TextResource title2 = model.getBody().getTitle();
        TextResource subtitle = model.getBody().getSubtitle();
        TextResource magnitude = model.getBody().getMagnitude();
        EnumC16313m0 enumC16313m0M46377b2 = AbstractC16315n0.m46377b(model.getBody().getIcon());
        switch (a.f93583c[model.getBody().getStatus().ordinal()]) {
            case 1:
                enumC4142w3 = EnumC4142w3.OK;
                break;
            case 2:
                enumC4142w3 = EnumC4142w3.WARNING;
                break;
            case 3:
                enumC4142w3 = EnumC4142w3.ALERT;
                break;
            case 4:
                enumC4142w3 = EnumC4142w3.LOW;
                break;
            case 5:
                enumC4142w3 = EnumC4142w3.MEDIUM;
                break;
            case 6:
                enumC4142w3 = EnumC4142w3.HIGH;
                break;
            case 7:
                enumC4142w3 = EnumC4142w3.CALIBRATING;
                break;
            case 8:
                enumC4142w3 = EnumC4142w3.NO_DATA;
                break;
            case 9:
                enumC4142w3 = EnumC4142w3.DATA_HIDDEN;
                break;
            case 10:
                enumC4142w3 = EnumC4142w3.PENDING;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new C4044i3(title, enumC16313m0M46377b, title2, subtitle, magnitude, enumC16313m0M46377b2, enumC4142w3, model.getDestination());
    }

    /* JADX INFO: renamed from: u0 */
    public static final EnumC39333f m68407u0(ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        int i13 = a.f93587g[impactStyle.ordinal()];
        if (i13 != 1 && i13 == 2) {
            return EnumC39333f.RECOVERY;
        }
        return EnumC39333f.BRAND_WHITE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX INFO: renamed from: u1 */
    public static final C39282o m68408u1(MenuItemModel model) {
        EnumC39284q enumC39284qM68422z0;
        InterfaceC39332e interfaceC39332eM125323a;
        boolean z4;
        EnumC39284q enumC39284q;
        AbstractC22676k.m65750j(model, "model");
        String style = model.getStyle();
        if (style != null) {
            EnumC39284q[] enumC39284qArrValues = EnumC39284q.values();
            int length = enumC39284qArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC39284q = null;
                    break;
                }
                enumC39284q = enumC39284qArrValues[i13];
                if (AbstractC22676k.m65745e(enumC39284q.name(), style)) {
                    break;
                }
                i13++;
            }
            if (enumC39284q != null) {
                enumC39284qM68422z0 = m68422z0(enumC39284q);
            } else {
                enumC39284qM68422z0 = null;
            }
        } else {
            enumC39284qM68422z0 = null;
        }
        InterfaceC39332e interfaceC39332eM125323a2 = (enumC39284qM68422z0 == null ? -1 : a.f93584d[enumC39284qM68422z0.ordinal()]) == 1 ? p745y81.Function1.m125323a(g0.f93613w) : p745y81.Function1.m125323a(h0.f93616w);
        InterfaceC39332e interfaceC39332eM125323a3 = (enumC39284qM68422z0 == null ? -1 : a.f93584d[enumC39284qM68422z0.ordinal()]) == 1 ? p745y81.Function1.m125323a(c0.f93601w) : p745y81.Function1.m125323a(d0.f93604w);
        InterfaceC39332e interfaceC39332eM125323a4 = (enumC39284qM68422z0 == null ? -1 : a.f93584d[enumC39284qM68422z0.ordinal()]) == 1 ? p745y81.Function1.m125323a(e0.f93607w) : p745y81.Function1.m125323a(f0.f93610w);
        EnumC39333f enumC39333f = (enumC39284qM68422z0 == null ? -1 : a.f93584d[enumC39284qM68422z0.ordinal()]) == 1 ? EnumC39333f.BRAND_BLACK : EnumC39333f.BRAND_WHITE;
        int i14 = enumC39284qM68422z0 != null ? a.f93584d[enumC39284qM68422z0.ordinal()] : -1;
        if (i14 == 1 || i14 == 2) {
            interfaceC39332eM125323a = p745y81.Function1.m125323a(y.f93666w);
        } else if (i14 != 3) {
            interfaceC39332eM125323a = i14 != 4 ? p745y81.Function1.m125323a(b0.f93598w) : p745y81.Function1.m125323a(a0.f93594w);
        } else {
            interfaceC39332eM125323a = p745y81.Function1.m125323a(z.f93669w);
        }
        InterfaceC39332e interfaceC39332e = interfaceC39332eM125323a;
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        String leftIcon = model.getLeftIcon();
        C39274g c39274g = leftIcon != null ? new C39274g(AbstractC16315n0.m46381f(leftIcon, null, 1, null), null, 2, null) : null;
        String rightIcon = model.getRightIcon();
        C39274g c39274g2 = rightIcon != null ? new C39274g(AbstractC16315n0.m46381f(rightIcon, null, 1, null), null, 2, null) : null;
        ItemVisibilityStateEnum menuItemState = model.getMenuItemState();
        if (menuItemState != null) {
            z4 = menuItemState == ItemVisibilityStateEnum.ENABLED;
        } else {
            z4 = true;
        }
        return C39282o.Companion.m125229d(companion, textResourceM21278l, interfaceC39332eM125323a2, null, textResourceM21278l2, interfaceC39332eM125323a4, c39274g, interfaceC39332eM125323a3, c39274g2, enumC39333f, null, null, AbstractC8693b.m21278l(model.getSuffixTitle()), null, interfaceC39332e, z4, false, model.getDestination(), (model.getDestination() == null || enumC39284qM68422z0 == EnumC39284q.OUTLINED || enumC39284qM68422z0 == EnumC39284q.RAF_MENU_ITEM) ? false : true, model.getTrackingId(), enumC39284qM68422z0, null, false, model.getGenericInteraction(), 3184132, null);
    }

    /* JADX INFO: renamed from: v0 */
    public static final C33565b m68410v0(ImpactLabelModel impactLabelModel, boolean z4) {
        AbstractC22676k.m65750j(impactLabelModel, "impactLabelModel");
        C23639h2 c23639h2 = C23639h2.f93783a;
        EnumC39333f enumC39333fM68830a = c23639h2.m68830a(impactLabelModel.getImpactStyle());
        return new C33565b(z4 ? C38072d.f163053a.m121951d().getTinyIcons().getTriangleDown() : C38072d.f163053a.m121951d().getTinyIcons().getTriangleUp(), c23639h2.m68832c(impactLabelModel.getImpactStyle()), impactLabelModel.getImpactHeaderTitleTextDisplay(), c23639h2.m68833d(impactLabelModel.getImpactStyle()), enumC39333fM68830a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final C4042i1 m68411v1(ContributorTileModel model) {
        ArrayList arrayList;
        LegendStyle legendStyle;
        AbstractC18247a abstractC18247aM52575m;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(23));
        String id4 = model.getId();
        List<InterfaceC25312u> listM60540g = c21535aM60554d.m60540g(model.getMetrics());
        List<ContributorTileLegend> legend = model.getLegend();
        if (legend != null) {
            List<ContributorTileLegend> list = legend;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (ContributorTileLegend contributorTileLegend : list) {
                String style = contributorTileLegend.getStyle();
                LegendStyle legendStyle2 = LegendStyle.NO_TREND_TARGET;
                LegendStyle[] legendStyleArrValues = LegendStyle.values();
                int length = legendStyleArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        legendStyle = null;
                        break;
                    }
                    legendStyle = legendStyleArrValues[i13];
                    if (AbstractC22676k.m65745e(legendStyle.name(), style)) {
                        break;
                    }
                    i13++;
                }
                if (legendStyle != null) {
                    legendStyle2 = legendStyle;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(contributorTileLegend.getTitle());
                int i14 = a.f93585e[legendStyle2.ordinal()];
                if (i14 == 1) {
                    abstractC18247aM52575m = AbstractC18249c.m52575m(EnumC39333f.ACCENT_POSITIVE_TREND);
                } else if (i14 != 2) {
                    abstractC18247aM52575m = i14 != 3 ? AbstractC18249c.m52575m(EnumC39333f.WHITE_10) : AbstractC18249c.m52575m(EnumC39333f.WHITE_50);
                } else {
                    abstractC18247aM52575m = AbstractC18249c.m52575m(EnumC39333f.ACCENT_NEGATIVE_TREND);
                }
                arrayList2.add(new C26191e(null, abstractC18247aM52575m, textResourceM21278l, EnumC26195i.RECTANGLE_SMALL, null, EnumC39333f.WHITE_70, null, EnumC2888c.B3, 81, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C4042i1(id4, listM60540g, arrayList, model.getTileLegend() != null ? c21535aM60554d.m60544l(model.getTileLegend()) : null, c21535aM60554d.m60540g(model.getFooter().getItems()), 0.0f, 32, null);
    }

    /* JADX INFO: renamed from: w0 */
    public static final TrendTypeEnum m68413w0(String status) {
        AbstractC22676k.m65750j(status, "status");
        int iHashCode = status.hashCode();
        if (iHashCode != -1852393868) {
            if (iHashCode != 2524) {
                if (iHashCode == 163769603 && status.equals("MODERATE")) {
                    return TrendTypeEnum.CONCERN_RANGE;
                }
            } else if (status.equals("OK")) {
                return TrendTypeEnum.POSITIVE_RANGE;
            }
        } else if (status.equals("SEVERE")) {
            return TrendTypeEnum.ALERT_RANGE;
        }
        return TrendTypeEnum.NEUTRAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final C23454a0 m68414w1(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX INFO: renamed from: x0 */
    private static final C4108r4 m68416x0(ProfileInfoTileModel profileInfoTileModel, C21535a c21535a) {
        EnumC4073m4 enumC4073m4;
        AbstractC22403o.c cVar;
        EnumC16313m0 enumC16313m0;
        InterfaceC25312u interfaceC25312u;
        EnumC4038h4 enumC4038h4;
        EnumC16313m0 enumC16313m1;
        String id4 = profileInfoTileModel.getId();
        String layoutStyle = profileInfoTileModel.getLayoutStyle();
        EnumC4073m4 enumC4073m5 = EnumC4073m4.SINGLE;
        EnumC4073m4[] enumC4073m4ArrValues = EnumC4073m4.values();
        int length = enumC4073m4ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC4073m4 = null;
                break;
            }
            enumC4073m4 = enumC4073m4ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC4073m4.name(), layoutStyle)) {
                break;
            }
            i13++;
        }
        if (enumC4073m4 != null) {
            enumC4073m5 = enumC4073m4;
        }
        String title = profileInfoTileModel.getTitle();
        TextResource textResourceM21278l = title != null ? AbstractC8693b.m21278l(title) : null;
        String image = profileInfoTileModel.getImage();
        if (image == null) {
            cVar = null;
        } else {
            String str = !AbstractC39414r.m125890i0(image) ? image : null;
            if (str != null) {
                cVar = new AbstractC22403o.c(str, C38072d.f163053a.m121951d().getLogo().getWhoop(), 0, 0, 12, null);
            } else {
                cVar = null;
            }
        }
        DesignSystemModel topItem = profileInfoTileModel.getTopItem();
        InterfaceC25312u interfaceC25312uM60544l = topItem != null ? c21535a.m60544l(topItem) : null;
        String endIcon = profileInfoTileModel.getEndIcon();
        if (endIcon != null) {
            EnumC16313m0 enumC16313m2 = EnumC16313m0.CARET_FORWARD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i14];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), endIcon)) {
                    break;
                }
                i14++;
            }
            if (enumC16313m1 != null) {
                enumC16313m2 = enumC16313m1;
            }
            enumC16313m0 = enumC16313m2;
        } else {
            enumC16313m0 = null;
        }
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(profileInfoTileModel.getSubtitle());
        String familyPlanId = profileInfoTileModel.getFamilyPlanId();
        Long userId = profileInfoTileModel.getUserId();
        String strValueOf = userId != null ? String.valueOf(userId.longValue()) : null;
        C9598e destination = profileInfoTileModel.getDestination();
        String str2 = strValueOf;
        GenericInteraction interaction = profileInfoTileModel.getInteraction();
        String imageStyle = profileInfoTileModel.getImageStyle();
        if (imageStyle == null) {
            imageStyle = "";
        }
        EnumC4038h4 enumC4038h5 = EnumC4038h4.SQUARE;
        EnumC4038h4[] enumC4038h4ArrValues = EnumC4038h4.values();
        int length3 = enumC4038h4ArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length3) {
                interfaceC25312u = interfaceC25312uM60544l;
                enumC4038h4 = null;
                break;
            }
            enumC4038h4 = enumC4038h4ArrValues[i15];
            interfaceC25312u = interfaceC25312uM60544l;
            if (AbstractC22676k.m65745e(enumC4038h4.name(), imageStyle)) {
                break;
            }
            i15++;
            interfaceC25312uM60544l = interfaceC25312u;
        }
        return new C4108r4(id4, enumC4073m5, textResourceM21278l, cVar, interfaceC25312u, enumC16313m0, textResourceM21278l2, familyPlanId, str2, destination, interaction, enumC4038h4 == null ? enumC4038h5 : enumC4038h4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final C35611g m68417x1(StepperComponentModel model) {
        C35605a c35605a;
        EnumC35606b enumC35606b;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        StepperBarModel progressBar = model.getProgressBar();
        EnumC35612h enumC35612h = null;
        if (progressBar != null) {
            String type = progressBar.getType();
            EnumC35606b enumC35606b2 = EnumC35606b.DISCRETE;
            EnumC35606b[] enumC35606bArrValues = EnumC35606b.values();
            int length = enumC35606bArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC35606b = null;
                    break;
                }
                enumC35606b = enumC35606bArrValues[i13];
                if (AbstractC22676k.m65745e(enumC35606b.name(), type)) {
                    break;
                }
                i13++;
            }
            if (enumC35606b != null) {
                enumC35606b2 = enumC35606b;
            }
            c35605a = new C35605a(enumC35606b2, progressBar.getDiscreteStepTotal(), progressBar.getDiscreteFilledTotal(), progressBar.getContinuousProgress());
        } else {
            c35605a = null;
        }
        EnumC16313m0 closeIcon = model.getCloseIcon();
        String style = model.getStyle();
        EnumC35612h enumC35612h2 = EnumC35612h.DEFAULT;
        for (EnumC35612h enumC35612h3 : EnumC35612h.values()) {
            if (AbstractC22676k.m65745e(enumC35612h3.name(), style)) {
                enumC35612h = enumC35612h3;
                break;
            }
        }
        if (enumC35612h != null) {
            enumC35612h2 = enumC35612h;
        }
        return new C35611g(title, c35605a, closeIcon, enumC35612h2);
    }

    /* JADX INFO: renamed from: y0 */
    public static final C30885c m68419y0(MetricEducationModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        TextResource detailsEducationTitleDisplay = model.getDetailsEducationTitleDisplay();
        TextResource detailsEducationContentDisplay = model.getDetailsEducationContentDisplay();
        if (detailsEducationContentDisplay == null) {
            detailsEducationContentDisplay = AbstractC8693b.m21267a();
        }
        TextResource textResource = detailsEducationContentDisplay;
        EnumC30883a style = model.getStyle();
        String icon = model.getIcon();
        C39274g c39274g = null;
        if (icon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.ADVICE;
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
            c39274g = new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null);
        }
        Boolean hasCloseButton = model.getHasCloseButton();
        return new C30885c(detailsEducationTitleDisplay, textResource, style, c39274g, hasCloseButton != null ? hasCloseButton.booleanValue() : false, null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C21127d m68420y1(SleepPlannerCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C21127d(model.getTitle(), model.getBedtimeValue(), model.getBedtimeLabel(), model.getTimeInBedValue(), model.getTimeInBedLabel(), model.getWaketimeValue(), model.getWaketimeLabel(), m68368h0(model.getAlarmStatus(), false), model.getDestination());
    }

    /* JADX INFO: renamed from: z0 */
    private static final EnumC39284q m68422z0(EnumC39284q enumC39284q) {
        return a.f93584d[enumC39284q.ordinal()] == 5 ? EnumC39284q.RAF_MENU_ITEM : enumC39284q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C22093e m68423z1(SleepPlannerAlarmCardModel model) {
        EnumC16313m0 enumC16313m0;
        Integer numValueOf;
        EnumC16313m0 enumC16313m1;
        EnumC16313m0 enumC16313m2;
        EnumC13892q1 enumC13892q1;
        AbstractC22676k.m65750j(model, "model");
        C4118t0 c4118t0M68371i0 = (model.getCtaButtonText() != null || model.getCtaText() == null) ? null : m68371i0(model.getCtaText());
        TextResource title = model.getTitle();
        String leftIcon = model.getLeftIcon();
        EnumC16313m0 enumC16313m3 = EnumC16313m0.SLEEP_COACH;
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
            if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                break;
            }
            i14++;
        }
        if (enumC16313m0 != null) {
            enumC16313m3 = enumC16313m0;
        }
        int whoopIcon = enumC16313m3.toWhoopIcon();
        String rightIcon = model.getRightIcon();
        if (rightIcon != null) {
            Integer numM46376a = AbstractC16315n0.m46376a(rightIcon);
            numValueOf = Integer.valueOf(numM46376a != null ? numM46376a.intValue() : AbstractC11895b.m31981D(C38072d.f163053a));
        } else {
            numValueOf = null;
        }
        String bedtimeIcon = model.getBedtimeIcon();
        EnumC16313m0 enumC16313m4 = EnumC16313m0.BEDTIME;
        EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
        int length2 = enumC16313m0ArrValues2.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length2) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues2[i15];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), bedtimeIcon)) {
                break;
            }
            i15++;
        }
        if (enumC16313m1 != null) {
            enumC16313m4 = enumC16313m1;
        }
        int whoopIcon2 = enumC16313m4.toWhoopIcon();
        TextResource bedtimeTitle = model.getBedtimeTitle();
        TextResource bedtimeDisplay = model.getBedtimeDisplay();
        TextResource bedtimePeriodDisplay = model.getBedtimePeriodDisplay();
        String waketimeIcon = model.getWaketimeIcon();
        EnumC16313m0 enumC16313m5 = EnumC16313m0.STRAP_VIBRATION;
        EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
        int length3 = enumC16313m0ArrValues3.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length3) {
                enumC16313m2 = null;
                break;
            }
            enumC16313m2 = enumC16313m0ArrValues3[i16];
            if (AbstractC22676k.m65745e(enumC16313m2.name(), waketimeIcon)) {
                break;
            }
            i16++;
        }
        if (enumC16313m2 != null) {
            enumC16313m5 = enumC16313m2;
        }
        int whoopIcon3 = enumC16313m5.toWhoopIcon();
        TextResource waketimeTitle = model.getWaketimeTitle();
        TextResource waketimeDisplay = model.getWaketimeDisplay();
        TextResource waketimeSubtitle = model.getWaketimeSubtitle();
        EnumC22094f waketimeLabelStyle = model.getWaketimeLabelStyle();
        TextResource waketimePeriodDisplay = model.getWaketimePeriodDisplay();
        EnumC22089a heightStyle = model.getHeightStyle();
        if (heightStyle == null) {
            heightStyle = EnumC22089a.DEFAULT;
        }
        EnumC22089a enumC22089a = heightStyle;
        String backgroundStyle = model.getBackgroundStyle();
        EnumC13892q1 enumC13892q2 = EnumC13892q1.NONE;
        EnumC13892q1[] enumC13892q1ArrValues = EnumC13892q1.values();
        int length4 = enumC13892q1ArrValues.length;
        while (true) {
            if (i13 >= length4) {
                enumC13892q1 = null;
                break;
            }
            enumC13892q1 = enumC13892q1ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC13892q1.name(), backgroundStyle)) {
                break;
            }
            i13++;
        }
        if (enumC13892q1 == null) {
            enumC13892q1 = enumC13892q2;
        }
        C9598e destination = model.getDestination();
        TextResource waketimeSubtitle2 = model.getWaketimeSubtitle();
        String ctaButtonText = model.getCtaButtonText();
        String ctaButtonIcon = model.getCtaButtonIcon();
        return new C22093e(null, title, EnumC39333f.BRAND_WHITE, whoopIcon, numValueOf, null, whoopIcon2, bedtimeTitle, bedtimeDisplay, bedtimePeriodDisplay, c4118t0M68371i0, waketimeTitle, waketimeDisplay, waketimeSubtitle, waketimeLabelStyle, waketimePeriodDisplay, enumC22089a, whoopIcon3, enumC13892q1, destination, waketimeSubtitle2, EnumC39333f.WHITE_5, ctaButtonText, ctaButtonIcon != null ? AbstractC16315n0.m46376a(ctaButtonIcon) : null, 33, null);
    }
}
