package pl0;

import ah0.AbstractC0883d;
import ah0.C0888i;
import am0.C1001e;
import am0.C1002f;
import am0.C1003g;
import bm0.C3399b;
import bm0.C3400c;
import bm0.C3401d;
import bm0.C3410m;
import bm0.C3416s;
import bm0.C3417t;
import c41.C4067l5;
import cm0.C4804a;
import cm0.C4808e;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.MetricEventModel;
import com.whoop.bot.models.conversation.ActionButton;
import com.whoop.bot.models.conversation.ActivityRecommendationCta;
import com.whoop.bot.models.conversation.ActivityRecommendationModel;
import com.whoop.bot.models.conversation.ActivityRecommendationSubtitle;
import com.whoop.bot.models.conversation.ActivityRecommendationTargetZones;
import com.whoop.bot.models.conversation.AdditionalContextModel;
import com.whoop.bot.models.conversation.AdditionalContextStyle;
import com.whoop.bot.models.conversation.AlarmModel;
import com.whoop.bot.models.conversation.BedtimeRecommendationTileModel;
import com.whoop.bot.models.conversation.ChatMiniArchWidgetModel;
import com.whoop.bot.models.conversation.CommittedWorkoutRecommendationModel;
import com.whoop.bot.models.conversation.CommittedWorkoutRecommendationModelKt;
import com.whoop.bot.models.conversation.FormWidgetModel;
import com.whoop.bot.models.conversation.HpmlBrowserWidgetModel;
import com.whoop.bot.models.conversation.MxmCreateCaseTileModel;
import com.whoop.bot.models.conversation.RecommendationCarouselModel;
import com.whoop.bot.models.conversation.SleepBoundModel;
import com.whoop.bot.models.conversation.StrengthTrainerWidgetModel;
import com.whoop.bot.models.conversation.SummaryConfirmationWidgetModel;
import com.whoop.bot.models.conversation.WorkoutListModel;
import com.whoop.bot.models.conversation.WorkoutModel;
import com.whoop.bot.models.conversation.WorkoutRecommendationZone;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.items.ActionButtonStyle;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.HorizontalScrollContainerModel;
import com.whoop.design.models.items.IconMarkdownCalloutModel;
import com.whoop.design.models.items.IconSize;
import com.whoop.design.models.items.SingleSelectModel;
import com.whoop.design.models.items.StartTurnButtonModel;
import com.whoop.design.models.items.TagBackgroundStyle;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationButtonModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel;
import com.whoop.design.models.items.activityrecommendation.TargetZonesModel;
import com.whoop.design.models.items.activityrecommendation.ZoneInfoModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.p057ai.chat.models.Attachment;
import com.whoop.p057ai.chat.models.AttachmentType;
import com.whoop.p057ai.chat.models.ChatAttachmentCarouselModel;
import com.whoop.p057ai.chat.models.ContextDetailsHeaderModel;
import com.whoop.p057ai.chat.models.ContextDetailsHeaderTagModel;
import com.whoop.p057ai.chat.models.ContextStatusToggleModel;
import com.whoop.p057ai.chat.models.HealthSnapshotTileModel;
import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import e31.C12612d;
import eh0.C13195d;
import f21.C14028d;
import f21.EnumC14025a;
import fh0.C14486h;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hh0.C17281a;
import hh0.C17283c;
import ih0.AbstractC18489d0;
import ih0.C18497h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jh0.C21695c;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import m83.C25271y;
import ma1.C25371a;
import mh0.C25556h;
import nh0.AbstractC26718b;
import nh0.C26719c;
import nm1.C26842g;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27273p0;
import oh0.C27935c;
import ol0.C28013c;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p395p6.C28884h1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23699q4;
import p716lb1.AbstractC23723u4;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import r71.C31053c;
import t31.C33527c;
import tl0.C33916c;
import ul0.C35059a;
import ul0.C35062d;
import ul0.C35063e;
import uz0.C35415i;
import uz0.C35418l;
import uz0.C35421o;
import uz0.C35422p;
import uz0.EnumC35408b;
import uz0.EnumC35417k;
import vl0.C36102e;
import wk0.AbstractC37335a;
import x81.C38072d;
import xl0.C38450d;
import y71.C39274g;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: pl0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001b\u0010\u0014\u001a\u00020\u000f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "Li2/t;", "colorBrush", "Loh0/c;", "Y", "(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Li2/t;)Loh0/c;", "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "model", "Lbm0/s;", "W", "(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "Luz0/i;", "X", "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;", "Ljb1/a;", "a", "Ll83/h;", "U", "()Ljb1/a;", "aiConversationDesignItemReducer", "Llb1/y0;", "b", "Llb1/y0;", "V", "()Llb1/y0;", "botDesignModelMapper", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29345c {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f118907a = AbstractC30060g.m92088H(new C25371a(16));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f118908b;

    /* JADX INFO: renamed from: pl0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f118909w = new a();

        /* JADX INFO: renamed from: a */
        public final long m89395a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89395a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pl0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C27273p0 c27273p0 = (C27273p0) it;
            return c27273p0.m82257a((15359 & 1) != 0 ? c27273p0.text : null, (15359 & 2) != 0 ? c27273p0.navigationAction : null, (15359 & 4) != 0 ? c27273p0.leftIcon : null, (15359 & 8) != 0 ? c27273p0.rightIcon : new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), (15359 & 16) != 0 ? c27273p0.tint : p745y81.Function1.m125323a(a.f118909w), (15359 & 32) != 0 ? c27273p0.tintGradient : null, (15359 & 64) != 0 ? c27273p0.useTextPadding : false, (15359 & 128) != 0 ? c27273p0.actionArgument : null, (15359 & 256) != 0 ? c27273p0.analyticEvent : null, (15359 & 512) != 0 ? c27273p0.dismissEvent : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27273p0.alignment : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27273p0.trimStartGutter : false, (15359 & 4096) != 0 ? c27273p0.style : null, (15359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c27273p0.enabled : false);
        }
    }

    /* JADX INFO: renamed from: pl0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118910w;

        public c(Function1 function1) {
            this.f118910w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118910w.invoke((SingleSelectModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f118911w = new d();

        /* JADX INFO: renamed from: a */
        public final long m89398a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCoachBlue();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89398a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pl0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AdditionalContextStyle f118912w;

        /* JADX INFO: renamed from: pl0.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f118913a;

            static {
                int[] iArr = new int[AdditionalContextStyle.values().length];
                try {
                    iArr[AdditionalContextStyle.STRAIN_ACTIVITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdditionalContextStyle.RECOVERY_ACTIVITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AdditionalContextStyle.SLEEP_ACTIVITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AdditionalContextStyle.HIGH_STRESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AdditionalContextStyle.MEDIUM_STRESS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AdditionalContextStyle.LOW_STRESS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AdditionalContextStyle.OVERVIEW.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f118913a = iArr;
            }
        }

        public e(AdditionalContextStyle additionalContextStyle) {
            this.f118912w = additionalContextStyle;
        }

        /* JADX INFO: renamed from: a */
        public final long m89399a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            switch (a.f118913a[this.f118912w.ordinal()]) {
                case 1:
                    return whoopColor.getStrain();
                case 2:
                    return whoopColor.getRecoveryHighRecovery();
                case 3:
                    return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
                case 4:
                    return whoopColor.getAccentPositiveTrend();
                case 5:
                    return whoopColor.getAccentNegativeTrend();
                case 6:
                    return whoopColor.getRecovery();
                case 7:
                    return whoopColor.getBrandWhite();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89399a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pl0.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118914w;

        public f(Function1 function1) {
            this.f118914w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118914w.invoke((MxmCreateCaseTileModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118915w;

        public g(Function1 function1) {
            this.f118915w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118915w.invoke((IconMarkdownCalloutModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118916w;

        public h(Function1 function1) {
            this.f118916w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118916w.invoke((HpmlBrowserWidgetModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118917w;

        public i(Function1 function1) {
            this.f118917w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118917w.invoke((ContextDetailsHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118918w;

        public j(Function1 function1) {
            this.f118918w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118918w.invoke((HealthSnapshotTileModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118919w;

        public k(Function1 function1) {
            this.f118919w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118919w.invoke((ContextStatusToggleModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118920w;

        public l(Function1 function1) {
            this.f118920w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118920w.invoke((StartTurnButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118921w;

        public m(Function1 function1) {
            this.f118921w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118921w.invoke((ChatMiniArchWidgetModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118922w;

        public n(Function1 function1) {
            this.f118922w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118922w.invoke((FormWidgetModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$o */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118923w;

        public o(Function1 function1) {
            this.f118923w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118923w.invoke((BedtimeRecommendationTileModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118924w;

        public p(Function1 function1) {
            this.f118924w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118924w.invoke((HorizontalScrollContainerModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118925w;

        public q(Function1 function1) {
            this.f118925w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118925w.invoke((ChatAttachmentCarouselModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118926w;

        public r(Function1 function1) {
            this.f118926w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118926w.invoke((MarkdownTextWidget) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118927w;

        public s(Function1 function1) {
            this.f118927w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118927w.invoke((SummaryConfirmationWidgetModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118928w;

        public t(Function1 function1) {
            this.f118928w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118928w.invoke((StrengthTrainerWidgetModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118929w;

        public u(Function1 function1) {
            this.f118929w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118929w.invoke((AdditionalContextModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118930w;

        public v(Function1 function1) {
            this.f118930w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118930w.invoke((ActivityRecommendationModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118931w;

        public w(Function1 function1) {
            this.f118931w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118931w.invoke((RecommendationCarouselModel) it);
        }
    }

    /* JADX INFO: renamed from: pl0.c$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f118932w;

        public x(Function1 function1) {
            this.f118932w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f118932w.invoke((CommittedWorkoutRecommendationModel) it);
        }
    }

    static {
        C23749z0 c23749z0 = new C23749z0();
        C26842g c26842g = new C26842g(28);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalScrollContainerModel.class), new p(c26842g));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ChatAttachmentCarouselModel.class), new q(new C26842g(29)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(MarkdownTextWidget.class), new r(new C29343a(0)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(SummaryConfirmationWidgetModel.class), new s(new C29343a(1)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(StrengthTrainerWidgetModel.class), new t(new C29343a(2)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(AdditionalContextModel.class), new u(new C29343a(3)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ActivityRecommendationModel.class), new v(new C29343a(4)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(RecommendationCarouselModel.class), new w(new C29343a(5)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(CommittedWorkoutRecommendationModel.class), new x(new C29343a(6)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(MxmCreateCaseTileModel.class), new f(new C29343a(7)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(IconMarkdownCalloutModel.class), new g(new C29343a(8)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(HpmlBrowserWidgetModel.class), new h(new C29343a(9)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ContextDetailsHeaderModel.class), new i(new C29343a(10)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(HealthSnapshotTileModel.class), new j(new C29343a(11)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ContextStatusToggleModel.class), new k(new C29343a(12)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(StartTurnButtonModel.class), new l(new C29343a(13)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ChatMiniArchWidgetModel.class), new m(new C29343a(14)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(FormWidgetModel.class), new n(new C29343a(15)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(BedtimeRecommendationTileModel.class), new o(new C26842g(27)));
        f118908b = c23749z0.m69766b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C33527c m89343A(SingleSelectModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C33527c(model.getId(), model.getSelectionId(), m89363U().m60545m(model.getItems()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C31053c m89344B(HorizontalScrollContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        return new C31053c(id4, title != null ? AbstractC8693b.m21278l(title) : null, m89363U().m60540g(model.getItems()), model.getAccessibilityLabel(), model.getScrollBehavior(), model.getPagingIndicatorEnabled(), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C17281a m89345C(ChatAttachmentCarouselModel model) {
        String strConcat;
        AbstractC22676k.m65750j(model, "model");
        List<Attachment> attachments = model.getAttachments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (((Attachment) obj).getType() == AttachmentType.IMAGE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new AbstractC22403o.c(((Attachment) it.next()).getUrl(), 0, 0, 0, 14, null));
        }
        List<Attachment> attachments2 = model.getAttachments();
        ArrayList<Attachment> arrayList3 = new ArrayList();
        for (Object obj2 : attachments2) {
            if (((Attachment) obj2).getType() == AttachmentType.PDF) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        for (Attachment attachment : arrayList3) {
            String title = attachment.getTitle();
            if (title == null) {
                String strM125862H0 = AbstractC39414r.m125862H0(attachment.getUrl(), '?');
                title = AbstractC39414r.m125860F0('/', strM125862H0, strM125862H0);
                if (title.length() == 0) {
                    title = "document.pdf";
                }
            }
            String date = attachment.getDate();
            if (date == null || (strConcat = " - ".concat(date)) == null) {
                strConcat = "";
            }
            arrayList4.add(new C17283c(attachment.getUrl(), title, "PDF".concat(strConcat)));
        }
        return new C17281a(arrayList2, arrayList4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C14028d m89346D(IconMarkdownCalloutModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String bodyIcon = model.getBodyIcon();
        EnumC14025a enumC14025a = null;
        Integer numM46376a = bodyIcon != null ? AbstractC16315n0.m46376a(bodyIcon) : null;
        String bodyText = model.getBodyText();
        String style = model.getStyle();
        if (style == null) {
            style = "";
        }
        EnumC14025a enumC14025a2 = EnumC14025a.COMPACT;
        for (EnumC14025a enumC14025a3 : EnumC14025a.values()) {
            if (AbstractC22676k.m65745e(enumC14025a3.name(), style)) {
                enumC14025a = enumC14025a3;
                break;
            }
        }
        if (enumC14025a != null) {
            enumC14025a2 = enumC14025a;
        }
        return new C14028d(id4, numM46376a, bodyText, enumC14025a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C38450d m89347E(HpmlBrowserWidgetModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C38450d(model.getPage(), AbstractC8693b.m21278l(model.getTitle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C13195d m89348F(ContextDetailsHeaderModel model) {
        TagBackgroundStyle tagBackgroundStyle;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        MarkdownTextModel description = model.getDescription();
        C33169c0 c33169c0M69556f = description != null ? AbstractC23723u4.m69556f(description) : null;
        List<ContextDetailsHeaderTagModel> tags = model.getTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tags, 10));
        for (ContextDetailsHeaderTagModel contextDetailsHeaderTagModel : tags) {
            String title = contextDetailsHeaderTagModel.getTitle();
            String tagStyle = contextDetailsHeaderTagModel.getTagStyle();
            TagBackgroundStyle tagBackgroundStyle2 = TagBackgroundStyle.CONTEXT_DEFAULT;
            TagBackgroundStyle[] tagBackgroundStyleArrValues = TagBackgroundStyle.values();
            int length = tagBackgroundStyleArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    tagBackgroundStyle = null;
                    break;
                }
                tagBackgroundStyle = tagBackgroundStyleArrValues[i13];
                if (AbstractC22676k.m65745e(tagBackgroundStyle.name(), tagStyle)) {
                    break;
                }
                i13++;
            }
            arrayList.add(AbstractC23699q4.m69314d(new TagModel((String) null, title, (String) null, tagBackgroundStyle == null ? tagBackgroundStyle2 : tagBackgroundStyle, (String) null, (String) null, (C9598e) null, (Action) null, (String) null, (String) null, (List) null, (IconSize) null, (GenericInteraction) null, 8181, (DefaultConstructorMarker) null)));
        }
        return new C13195d(textResourceM21278l, textResourceM21278l2, c33169c0M69556f, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C21695c m89349G(HealthSnapshotTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C21695c(AbstractC8693b.m21278l(model.getTitle()), AbstractC22676k.m65745e(model.getStartIcon(), "COACH_HISTORY") ? Integer.valueOf(AbstractC37335a.f159600b) : AbstractC16315n0.m46376a(model.getStartIcon()), model.getModal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX INFO: renamed from: H */
    public static final C14486h m89350H(ContextStatusToggleModel model) {
        TextResource textResourceM21278l;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getActiveState().getTitle());
        String subtitle = model.getActiveState().getSubtitle();
        TextResource textResourceM21278l3 = null;
        if (subtitle == null) {
            textResourceM21278l = null;
        } else {
            if (AbstractC39414r.m125890i0(subtitle)) {
                subtitle = null;
            }
            if (subtitle != null) {
                textResourceM21278l = AbstractC8693b.m21278l(subtitle);
            } else {
                textResourceM21278l = null;
            }
        }
        UpdateAction updateAction = new UpdateAction(new Request(model.getActiveState().getRequest().getPath(), model.getActiveState().getRequest().getMethod(), model.getActiveState().getRequest().getBody(), model.getActiveState().getRequest().getTimeoutMillis()), (C9598e) null, (DismissEventModel) null, (MetricEventModel) null, (Map) null, 24, (DefaultConstructorMarker) null);
        AnalyticEventModel analyticEvent = model.getActiveState().getAnalyticEvent();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getInactiveState().getTitle());
        String subtitle2 = model.getInactiveState().getSubtitle();
        if (subtitle2 != null) {
            if (AbstractC39414r.m125890i0(subtitle2)) {
                subtitle2 = null;
            }
            if (subtitle2 != null) {
                textResourceM21278l3 = AbstractC8693b.m21278l(subtitle2);
            }
        }
        return new C14486h(textResourceM21278l2, textResourceM21278l, updateAction, analyticEvent, textResourceM21278l4, textResourceM21278l3, new UpdateAction(new Request(model.getInactiveState().getRequest().getPath(), model.getInactiveState().getRequest().getMethod(), model.getInactiveState().getRequest().getBody(), model.getInactiveState().getRequest().getTimeoutMillis()), (C9598e) null, (DismissEventModel) null, (MetricEventModel) null, (Map) null, 24, (DefaultConstructorMarker) null), model.getInactiveState().getAnalyticEvent(), AbstractC39421y.m125921F(model.getCurrentState(), "ACTIVE", true), AbstractC8693b.m21278l(model.getErrorState().getErrorMessageText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C25556h m89351I(StartTurnButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m0 = null;
        if (icon != null) {
            for (EnumC16313m0 enumC16313m1 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                    enumC16313m0 = enumC16313m1;
                    break;
                }
            }
        }
        EnumC16313m0 enumC16313m2 = enumC16313m0;
        ActionButtonStyle buttonType = model.getStyle().getButtonType();
        EnumC39333f foregroundColor = model.getStyle().getForegroundColor();
        if (foregroundColor == null) {
            foregroundColor = EnumC39333f.BRAND_BLACK;
        }
        EnumC39333f enumC39333f = foregroundColor;
        EnumC39333f iconColor = model.getStyle().getIconColor();
        if (iconColor == null) {
            iconColor = EnumC39333f.BRAND_BLACK;
        }
        EnumC39333f enumC39333f2 = iconColor;
        EnumC39333f backgroundColor = model.getStyle().getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = EnumC39333f.BRAND_WHITE;
        }
        return new C25556h(textResourceM21278l, enumC16313m2, buttonType, enumC39333f, enumC39333f2, backgroundColor, model.getRequest());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C36102e m89352J(ChatMiniArchWidgetModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C36102e(new C28013c(new C28013c.a(C12612d.f43056a.m35366a(), null, 2, null), null, 2, null), model.getPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public static final C18497h0 m89353K(FormWidgetModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C18497h0(new C0888i(null, AbstractC0883d.m2145b(model, 0, null, null, 7, null), false, false, null, null, 61, null), model.getKey(), null, null, model, 12, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C35062d m89354L(BedtimeRecommendationTileModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        TextResource title = model.getTitle();
        List<SleepBoundModel> sleepBounds = model.getSleepBounds();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sleepBounds, 10));
        for (SleepBoundModel sleepBoundModel : sleepBounds) {
            String icon = sleepBoundModel.getIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.SLEEP;
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
            EnumC16313m0 enumC16313m2 = enumC16313m0 == null ? enumC16313m1 : enumC16313m0;
            TextResource label = sleepBoundModel.getLabel();
            TextResource predictedTime = sleepBoundModel.getPredictedTime();
            TextResource timeUnit = sleepBoundModel.getTimeUnit();
            TextResource typicalTitle = sleepBoundModel.getTypicalTitle();
            TextResource typicalTime = sleepBoundModel.getTypicalTime();
            AlarmModel alarm = sleepBoundModel.getAlarm();
            arrayList.add(new C35063e(label, enumC16313m2, predictedTime, timeUnit, typicalTitle, typicalTime, alarm != null ? new C35059a(alarm.isEnabled(), alarm.getLabel()) : null));
        }
        return new C35062d(title, arrayList, model.getPredictionTitle(), c21535aM60555e.m60541h(model.getHoursOfSleepStat()), c21535aM60555e.m60541h(model.getConsistencyStat()), c21535aM60555e.m60541h(model.getEditButton()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C27935c m89355M(MarkdownTextWidget model) {
        AbstractC22676k.m65750j(model, "model");
        return m89368Z(model, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C26719c m89356N(SummaryConfirmationWidgetModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        MarkdownTextWidget title = model.getTitle();
        C27935c c27935cM89368Z = title != null ? m89368Z(title, null, 1, null) : null;
        MarkdownTextWidget summary = model.getSummary();
        C27935c c27935cM89367Y = summary != null ? m89367Y(summary, AbstractC15673b0.m43972A()) : null;
        C21535a c21535aM89363U = m89363U();
        FooterModel footer = model.getFooter();
        List<DesignSystemModel> items = footer != null ? footer.getItems() : null;
        if (items == null) {
            items = C25271y.f99162w;
        }
        List<InterfaceC25312u> listM60545m = c21535aM89363U.m60545m(items);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60545m, 10));
        Iterator<T> it = listM60545m.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC26718b.m79441p((InterfaceC25312u) it.next()));
        }
        return new C26719c(id4, c27935cM89368Z, c27935cM89367Y, arrayList, model.getAnalyticEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C1001e m89357O(StrengthTrainerWidgetModel it) {
        AbstractC22676k.m65750j(it, "it");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(it.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(it.getSubtitle());
        List<WorkoutListModel> workoutList = it.getWorkoutList();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(workoutList, 10));
        for (WorkoutListModel workoutListModel : workoutList) {
            boolean superset = workoutListModel.getSuperset();
            List<WorkoutModel> workouts = workoutListModel.getWorkouts();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(workouts, 10));
            for (WorkoutModel workoutModel : workouts) {
                arrayList2.add(new C1003g(AbstractC8693b.m21278l(workoutModel.getTitle()), AbstractC8693b.m21278l(workoutModel.getSubtitle())));
            }
            arrayList.add(new C1002f(superset, arrayList2));
        }
        InterfaceC25312u interfaceC25312uM60541h = m89363U().m60541h(it.getNavigationButton());
        if (interfaceC25312uM60541h instanceof C27273p0) {
            C27273p0 c27273p0 = (C27273p0) interfaceC25312uM60541h;
            interfaceC25312uM60541h = c27273p0.m82257a((15359 & 1) != 0 ? c27273p0.text : null, (15359 & 2) != 0 ? c27273p0.navigationAction : null, (15359 & 4) != 0 ? c27273p0.leftIcon : null, (15359 & 8) != 0 ? c27273p0.rightIcon : null, (15359 & 16) != 0 ? c27273p0.tint : p745y81.Function1.m125323a(d.f118911w), (15359 & 32) != 0 ? c27273p0.tintGradient : null, (15359 & 64) != 0 ? c27273p0.useTextPadding : false, (15359 & 128) != 0 ? c27273p0.actionArgument : null, (15359 & 256) != 0 ? c27273p0.analyticEvent : null, (15359 & 512) != 0 ? c27273p0.dismissEvent : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27273p0.alignment : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27273p0.trimStartGutter : false, (15359 & 4096) != 0 ? c27273p0.style : null, (15359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c27273p0.enabled : false);
        }
        return new C1001e(textResourceM21278l, textResourceM21278l2, arrayList, interfaceC25312uM60541h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C33916c m89358P(AdditionalContextModel it) {
        AdditionalContextStyle additionalContextStyle;
        AbstractC22403o aVar;
        AbstractC22676k.m65750j(it, "it");
        String style = it.getStyle();
        if (style == null) {
            style = "";
        }
        AdditionalContextStyle additionalContextStyle2 = AdditionalContextStyle.STRAIN_ACTIVITY;
        AdditionalContextStyle[] additionalContextStyleArrValues = AdditionalContextStyle.values();
        int length = additionalContextStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                additionalContextStyle = null;
                break;
            }
            additionalContextStyle = additionalContextStyleArrValues[i13];
            if (AbstractC22676k.m65745e(additionalContextStyle.name(), style)) {
                break;
            }
            i13++;
        }
        if (additionalContextStyle != null) {
            additionalContextStyle2 = additionalContextStyle;
        }
        if (it.getS3IconUrl() != null) {
            aVar = new AbstractC22403o.c(it.getS3IconUrl(), 0, 0, 0, 14, null);
        } else {
            aVar = it.getIcon() != null ? new AbstractC22403o.a(it.getIcon().toWhoopIcon()) : new AbstractC22403o.a(EnumC16313m0.OTHER.toWhoopIcon());
        }
        return new C33916c(aVar, AbstractC8693b.m21278l(it.getTitle()), AbstractC8693b.m21278l(it.getSubtitle()), AbstractC8693b.m21278l(it.getValue()), p745y81.Function1.m125323a(new e(additionalContextStyle2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C3416s m89359Q(ActivityRecommendationModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m89365W(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C3410m m89360R(RecommendationCarouselModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        List<DesignSystemModel> recommendations = model.getRecommendations();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(recommendations, 10));
        for (DesignSystemModel designSystemModel : recommendations) {
            arrayList.add(designSystemModel instanceof ActivityRecommendationModel ? m89365W((ActivityRecommendationModel) designSystemModel) : AbstractC21537c.m60555e(null, 1, null).m60541h(designSystemModel));
        }
        return new C3410m(title, arrayList, model.getActionTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C4808e m89361S(CommittedWorkoutRecommendationModel model) {
        AbstractC22676k.m65750j(model, "model");
        C3416s c3416sM89365W = model.getActivityRecommendation() != null ? m89365W(model.getActivityRecommendation()) : null;
        C35415i c35415iM89366X = m89366X(model.getActivityRecommendationV2());
        C4804a actionButtonState$default = CommittedWorkoutRecommendationModelKt.toActionButtonState$default(model.getStartActivityButton(), null, 1, null);
        C4804a actionButtonState$default2 = CommittedWorkoutRecommendationModelKt.toActionButtonState$default(model.getGenerateAlternativeButton(), null, 1, null);
        ActionButton decommitButton = model.getDecommitButton();
        ActivityRecommendationModel activityRecommendation = model.getActivityRecommendation();
        return new C4808e(c3416sM89365W, c35415iM89366X, actionButtonState$default, actionButtonState$default2, CommittedWorkoutRecommendationModelKt.toActionButtonState(decommitButton, activityRecommendation != null ? activityRecommendation.getRecommendationId() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC25312u m89362T(MxmCreateCaseTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        if (!model.getCompleted()) {
            return new C4067l5(model.getId(), 0, AbstractC8693b.m21278l(model.getTitle()), 2, null);
        }
        return new C27935c(model.getConfirmationMessage(), model.getConfirmationMessage().hashCode(), false, false, null, 28, null);
    }

    /* JADX INFO: renamed from: U */
    public static final C21535a m89363U() {
        return (C21535a) f118907a.getValue();
    }

    /* JADX INFO: renamed from: V */
    public static final C23743y0 m89364V() {
        return f118908b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: W */
    private static final C3416s m89365W(ActivityRecommendationModel activityRecommendationModel) {
        ?? arrayList;
        C3400c c3400c;
        EnumC39333f enumC39333f;
        String recommendationId = activityRecommendationModel.getRecommendationId();
        AbstractC22403o.c cVar = new AbstractC22403o.c(activityRecommendationModel.getIcon(), 0, 0, 0, 14, null);
        TextResource title = activityRecommendationModel.getTitle();
        List<ActivityRecommendationSubtitle> subtitles = activityRecommendationModel.getSubtitles();
        if (subtitles != null) {
            List<ActivityRecommendationSubtitle> list = subtitles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (ActivityRecommendationSubtitle activityRecommendationSubtitle : list) {
                arrayList.add(new C3399b(activityRecommendationSubtitle.getLabel(), activityRecommendationSubtitle.getValue()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C25271y.f99162w;
        }
        ActivityRecommendationTargetZones targetZones = activityRecommendationModel.getTargetZones();
        if (targetZones != null) {
            Float indicatorPosition = targetZones.getIndicatorPosition();
            TextResource targetZonesTitle = targetZones.getTargetZonesTitle();
            List<WorkoutRecommendationZone> targetZones2 = targetZones.getTargetZones();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(targetZones2, 10));
            for (WorkoutRecommendationZone workoutRecommendationZone : targetZones2) {
                String style = workoutRecommendationZone.getStyle();
                EnumC39333f enumC39333f2 = EnumC39333f.STRAIN_ZONE_2;
                EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
                int length = enumC39333fArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC39333f = null;
                        break;
                    }
                    enumC39333f = enumC39333fArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC39333f.name(), style)) {
                        break;
                    }
                    i13++;
                }
                if (enumC39333f != null) {
                    enumC39333f2 = enumC39333f;
                }
                arrayList2.add(new C3417t(workoutRecommendationZone.getSize(), enumC39333f2, workoutRecommendationZone.getTitle(), AbstractC8693b.m21278l(workoutRecommendationZone.getSubtitle())));
            }
            c3400c = new C3400c(indicatorPosition, targetZonesTitle, arrayList2);
        } else {
            c3400c = null;
        }
        ?? r10 = arrayList;
        boolean zIsSelected = activityRecommendationModel.isSelected();
        ActivityRecommendationCta cta = activityRecommendationModel.getCta();
        C3401d c3401d = cta != null ? new C3401d(cta.isSelectedCtaTitle(), cta.getNotSelectedCtaTitle()) : null;
        DesignSystemModel content = activityRecommendationModel.getContent();
        return new C3416s(recommendationId, cVar, title, r10, c3400c, zIsSelected, c3401d, content != null ? AbstractC21537c.m60555e(null, 1, null).m60541h(content) : null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX INFO: renamed from: X */
    private static final C35415i m89366X(ActivityRecommendationTileModel activityRecommendationTileModel) {
        String str;
        C35421o c35421o;
        EnumC35408b enumC35408b;
        EnumC35408b enumC35408b2;
        EnumC35417k enumC35417k;
        if (activityRecommendationTileModel == null) {
            return null;
        }
        String id4 = activityRecommendationTileModel.getId();
        boolean zIsSelected = activityRecommendationTileModel.isSelected();
        String iconUrl = activityRecommendationTileModel.getIconUrl();
        AbstractC22403o cVar = iconUrl != null ? new AbstractC22403o.c(iconUrl, 0, 0, 0, 14, null) : new AbstractC22403o.a(EnumC16313m0.ACTIVITY.toWhoopIcon());
        String activityTitle = activityRecommendationTileModel.getActivityTitle();
        String activityStrain = activityRecommendationTileModel.getActivityStrain();
        String activityDuration = activityRecommendationTileModel.getActivityDuration();
        String activityDurationUnit = activityRecommendationTileModel.getActivityDurationUnit();
        String activityDurationLabel = activityRecommendationTileModel.getActivityDurationLabel();
        TargetZonesModel targetZones = activityRecommendationTileModel.getTargetZones();
        if (targetZones != null) {
            Float indicatorPosition = targetZones.getIndicatorPosition();
            float fFloatValue = indicatorPosition != null ? indicatorPosition.floatValue() : 0.0f;
            String targetZoneStyle = targetZones.getTargetZoneStyle();
            String targetZoneTitle = targetZones.getTargetZoneTitle();
            if (targetZoneTitle == null) {
                targetZoneTitle = "";
            }
            List<ZoneInfoModel> targetZones2 = targetZones.getTargetZones();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(targetZones2, 10));
            Iterator it = targetZones2.iterator();
            while (it.hasNext()) {
                ZoneInfoModel zoneInfoModel = (ZoneInfoModel) it.next();
                float size = zoneInfoModel.getSize();
                String style = zoneInfoModel.getStyle();
                EnumC35417k enumC35417k2 = EnumC35417k.STRAIN_ZONE_2;
                Iterator it3 = it;
                EnumC35417k[] enumC35417kArrValues = EnumC35417k.values();
                String str2 = id4;
                int length = enumC35417kArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC35417k = null;
                        break;
                    }
                    enumC35417k = enumC35417kArrValues[i13];
                    int i14 = i13;
                    if (AbstractC22676k.m65745e(enumC35417k.name(), style)) {
                        break;
                    }
                    i13 = i14 + 1;
                }
                arrayList.add(new C35422p(size, enumC35417k == null ? enumC35417k2 : enumC35417k, zoneInfoModel.getTitle()));
                it = it3;
                id4 = str2;
            }
            str = id4;
            c35421o = new C35421o(fFloatValue, targetZoneStyle, targetZoneTitle, arrayList);
        } else {
            str = id4;
            c35421o = null;
        }
        String intensityStyle = activityRecommendationTileModel.getIntensityStyle();
        if (intensityStyle != null) {
            String upperCase = intensityStyle.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != -2024701067) {
                if (iHashCode != 75572) {
                    if (iHashCode == 2217378 && upperCase.equals("HIGH")) {
                        enumC35408b2 = EnumC35408b.HIGH;
                    } else {
                        enumC35408b2 = EnumC35408b.UNKNOWN;
                    }
                } else if (upperCase.equals("LOW")) {
                    enumC35408b2 = EnumC35408b.LOW;
                } else {
                    enumC35408b2 = EnumC35408b.UNKNOWN;
                }
            } else if (upperCase.equals("MEDIUM")) {
                enumC35408b2 = EnumC35408b.MEDIUM;
            } else {
                enumC35408b2 = EnumC35408b.UNKNOWN;
            }
            enumC35408b = enumC35408b2;
        } else {
            enumC35408b = null;
        }
        String intensityTitle = activityRecommendationTileModel.getIntensityTitle();
        String intensitySubtitle = activityRecommendationTileModel.getIntensitySubtitle();
        ActivityRecommendationButtonModel buttonViewState = activityRecommendationTileModel.getButtonViewState();
        C35418l c35418l = buttonViewState != null ? new C35418l(buttonViewState.isSelectedCtaTitle(), buttonViewState.getNotSelectedCtaTitle()) : null;
        DesignSystemModel content = activityRecommendationTileModel.getContent();
        return new C35415i(str, zIsSelected, cVar, activityTitle, activityStrain, activityDuration, activityDurationUnit, activityDurationLabel, c35421o, enumC35408b, intensityTitle, intensitySubtitle, c35418l, content != null ? AbstractC21537c.m60555e(null, 1, null).m60541h(content) : null);
    }

    /* JADX INFO: renamed from: Y */
    private static final C27935c m89367Y(MarkdownTextWidget markdownTextWidget, AbstractC17911t abstractC17911t) {
        return new C27935c(markdownTextWidget.getText(), markdownTextWidget.getTextHash(), false, markdownTextWidget.getFadeInReveal(), abstractC17911t, 4, null);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ C27935c m89368Z(MarkdownTextWidget markdownTextWidget, AbstractC17911t abstractC17911t, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC17911t = null;
        }
        return m89367Y(markdownTextWidget, abstractC17911t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C21535a m89392x() {
        return AbstractC21537c.m60554d(new C28884h1(28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m89393y(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27273p0.class), new b());
        designItemReducer.m60547b(new C28884h1(29));
        designItemReducer.m60548c(f118908b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m89394z(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SingleSelectModel.class), new c(new C29344b(0)));
        return C23454a0.f92919a;
    }
}
