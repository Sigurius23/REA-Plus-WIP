package gm1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.design.models.items.PregnancyProgressBarModel;
import com.whoop.design.models.items.PregnancyProgressLabelModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.home.domain.models.CalibrationTimelineCardModel;
import com.whoop.home.domain.models.ChallengeHomeTileModel;
import com.whoop.home.domain.models.CoachActivityTileModel;
import com.whoop.home.domain.models.CustomAnimationContainerModel;
import com.whoop.home.domain.models.CustomAnimationContainerViewState;
import com.whoop.home.domain.models.DayOneTransitionViewState;
import com.whoop.home.domain.models.DayOneTransitionWrapperModel;
import com.whoop.home.domain.models.DayOneTransitionWrapperModelV2;
import com.whoop.home.domain.models.DayZeroCardsModel;
import com.whoop.home.domain.models.DayZeroCardsViewState;
import com.whoop.home.domain.models.JournalHomeTileWrapperModel;
import com.whoop.home.domain.models.MciHomeTileModel;
import com.whoop.home.domain.models.NotificationsWrapperModel;
import com.whoop.home.domain.models.NotificationsWrapperModelV2;
import com.whoop.home.domain.models.NotificationsWrapperModelV3;
import com.whoop.home.domain.models.ProgressPlotTileModel;
import com.whoop.home.domain.models.ScoreGaugeStickyModel;
import com.whoop.home.domain.models.WeeklyPlanHomeTileWrapperModel;
import com.whoop.home.domain.models.WelcomeCardModel;
import com.whoop.home.domain.models.WhatToExpectCardModel;
import com.whoop.home.domain.models.dailyoutlook.CoachEntryPointModel;
import com.whoop.home.domain.models.dailyoutlook.DailyOutlookTileModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import f01.EnumC13892q1;
import f11.C14005e;
import gb1.AbstractC15673b0;
import gt2.AbstractC16205c;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h01.C16550q;
import h01.EnumC16533a;
import hs1.AbstractC17606c;
import ht2.C17634f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21170u;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jm1.C21793d;
import js1.C21922m;
import k31.C22174d;
import k71.C22256m;
import kd1.AbstractC22403o;
import km1.AbstractC22589f;
import km1.C22588e;
import l83.C23454a0;
import lm1.C24514d;
import lm1.EnumC24511a;
import lz0.AbstractC24818c;
import lz0.C24816a;
import lz0.C24817b;
import m83.AbstractC25267u;
import mm1.C25689c;
import mm1.C25692f;
import mm1.C25697k;
import nm1.C26838c;
import nm1.C26840e;
import nm1.C26844i;
import nm1.EnumC26841f;
import ny0.C27256h;
import o01.C27347c;
import p01.C28582b;
import p01.EnumC28588h;
import p031b9.AbstractC2875y;
import p132f0.C13818q1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23602c0;
import p716lb1.AbstractC23673m2;
import p716lb1.AbstractC23713t0;
import p716lb1.AbstractC23720u1;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p741vn1.AbstractC36203g;
import p741vn1.C36213q;
import p745y81.EnumC39333f;
import v71.C35768i;
import wm1.C37390l;
import zm1.C40890a;
import zm1.C40891b;
import zm1.C40895f;

/* JADX INFO: renamed from: gm1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0001\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0001\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u00101\u001a\u0002002\u0006\u0010\u0001\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102\u001a\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b6\u00107\u001a\u0017\u0010:\u001a\u0002092\u0006\u0010\u0001\u001a\u000208H\u0000¢\u0006\u0004\b:\u0010;\"\u001a\u0010A\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, m65681d2 = {"Lcom/whoop/home/domain/models/dailyoutlook/CoachEntryPointModel;", "model", "Lnm1/c;", "x", "(Lcom/whoop/home/domain/models/dailyoutlook/CoachEntryPointModel;)Lnm1/c;", "Lcom/whoop/home/domain/models/DayZeroCardsModel;", "Lm91/u;", "B", "(Lcom/whoop/home/domain/models/DayZeroCardsModel;)Lm91/u;", "Lcom/whoop/home/domain/models/CustomAnimationContainerModel;", "y", "(Lcom/whoop/home/domain/models/CustomAnimationContainerModel;)Lm91/u;", "Lcom/whoop/design/models/DesignSystemModel;", "g0", "(Lm91/u;Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;", "Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;", "z", "(Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;)Lm91/u;", "Lcom/whoop/home/domain/models/DayOneTransitionWrapperModelV2;", "A", "(Lcom/whoop/home/domain/models/DayOneTransitionWrapperModelV2;)Lm91/u;", "Lcom/whoop/home/domain/models/WelcomeCardModel;", "Lmm1/k;", "e0", "(Lcom/whoop/home/domain/models/WelcomeCardModel;)Lmm1/k;", "Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "Lvn1/q;", "a0", "(Lcom/whoop/home/domain/models/NotificationsWrapperModel;)Lvn1/q;", "Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;", "b0", "(Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;)Lvn1/q;", "Lcom/whoop/home/domain/models/NotificationsWrapperModelV3;", "c0", "(Lcom/whoop/home/domain/models/NotificationsWrapperModelV3;)Lvn1/q;", "Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;", "Lht2/f;", "d0", "(Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;)Lht2/f;", "Lcom/whoop/home/domain/models/ChallengeHomeTileModel;", "Lkm1/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/home/domain/models/ChallengeHomeTileModel;)Lkm1/e;", "Lcom/whoop/home/domain/models/JournalHomeTileWrapperModel;", "Ljs1/m;", "Y", "(Lcom/whoop/home/domain/models/JournalHomeTileWrapperModel;)Ljs1/m;", "Lcom/whoop/home/domain/models/WhatToExpectCardModel;", "Lzm1/f;", "f0", "(Lcom/whoop/home/domain/models/WhatToExpectCardModel;)Lzm1/f;", "Lcom/whoop/design/models/items/CardButtonModel;", "logButton", "Lny0/h;", "Z", "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;", "Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;", "Ljm1/d;", "v", "(Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;)Ljm1/d;", "Ljb1/a;", "a", "Ljb1/a;", "C", "()Ljb1/a;", "homeDesignItemReducer", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15993c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f60517a = AbstractC21537c.m60554d(new C13818q1(14));

    /* JADX INFO: renamed from: gm1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60518a;

        static {
            int[] iArr = new int[EnumC13892q1.values().length];
            try {
                iArr[EnumC13892q1.HAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13892q1.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60518a = iArr;
        }
    }

    /* JADX INFO: renamed from: gm1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return AbstractC15994d.m45257c((C22256m) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60519w;

        public c(Function1 function1) {
            this.f60519w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60519w.invoke((NotificationsWrapperModelV2) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60520w;

        public d(Function1 function1) {
            this.f60520w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60520w.invoke((NotificationsWrapperModelV3) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60521w;

        public e(Function1 function1) {
            this.f60521w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60521w.invoke((ProgressPlotTileModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60522w;

        public f(Function1 function1) {
            this.f60522w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60522w.invoke((WelcomeCardModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60523w;

        public g(Function1 function1) {
            this.f60523w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60523w.invoke((WhatToExpectCardModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60524w;

        public h(Function1 function1) {
            this.f60524w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60524w.invoke((ScoreGaugeStickyModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60525w;

        public i(Function1 function1) {
            this.f60525w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60525w.invoke((WeeklyPlanHomeTileWrapperModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60526w;

        public j(Function1 function1) {
            this.f60526w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60526w.invoke((CalibrationTimelineCardModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60527w;

        public k(Function1 function1) {
            this.f60527w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60527w.invoke((ChallengeHomeTileModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60528w;

        public l(Function1 function1) {
            this.f60528w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60528w.invoke((JournalHomeTileWrapperModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60529w;

        public m(Function1 function1) {
            this.f60529w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60529w.invoke((CoachActivityTileModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60530w;

        public n(Function1 function1) {
            this.f60530w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60530w.invoke((CoachEntryPointModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60531w;

        public o(Function1 function1) {
            this.f60531w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60531w.invoke((CustomAnimationContainerModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60532w;

        public p(Function1 function1) {
            this.f60532w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60532w.invoke((DayOneTransitionWrapperModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60533w;

        public q(Function1 function1) {
            this.f60533w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60533w.invoke((DayOneTransitionWrapperModelV2) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60534w;

        public r(Function1 function1) {
            this.f60534w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60534w.invoke((DayZeroCardsModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60535w;

        public s(Function1 function1) {
            this.f60535w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60535w.invoke((ItemsCardModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60536w;

        public t(Function1 function1) {
            this.f60536w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60536w.invoke((MciHomeTileModel) it);
        }
    }

    /* JADX INFO: renamed from: gm1.c$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f60537w;

        public u(Function1 function1) {
            this.f60537w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f60537w.invoke((NotificationsWrapperModel) it);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final InterfaceC25312u m45176A(DayOneTransitionWrapperModelV2 model) {
        AbstractC22676k.m65750j(model, "model");
        return new DayOneTransitionViewState(AbstractC23720u1.m69479s(model.getOverviewGauge()), m45205b0(model.getNotificationsWrapper()), m45211e0(model.getWelcomeHomeCard()), false, 8, null);
    }

    /* JADX INFO: renamed from: B */
    public static final InterfaceC25312u m45177B(DayZeroCardsModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<InterfaceC25312u> listM60540g = f60517a.m60540g(model.getList());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM60540g) {
            if (obj instanceof CustomAnimationContainerViewState) {
                arrayList.add(obj);
            }
        }
        return new DayZeroCardsViewState(arrayList);
    }

    /* JADX INFO: renamed from: C */
    public static final C21535a m45178C() {
        return f60517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m45179D(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22256m.class), new b());
        designItemReducer.m60547b(new C13818q1(25));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m45180E(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C13818q1 c13818q1 = new C13818q1(27);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CoachActivityTileModel.class), new m(c13818q1));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CoachEntryPointModel.class), new n(new C13818q1(17)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CustomAnimationContainerModel.class), new o(new C13818q1(18)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DayOneTransitionWrapperModel.class), new p(new C13818q1(19)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DayOneTransitionWrapperModelV2.class), new q(new C13818q1(20)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DayZeroCardsModel.class), new r(new C13818q1(21)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ItemsCardModel.class), new s(new C13818q1(22)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MciHomeTileModel.class), new t(new C13818q1(23)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(NotificationsWrapperModel.class), new u(new C13818q1(24)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(NotificationsWrapperModelV2.class), new c(new C13818q1(26)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(NotificationsWrapperModelV3.class), new d(new C13818q1(28)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ProgressPlotTileModel.class), new e(new C13818q1(29)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(WelcomeCardModel.class), new f(new C15992b(0)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(WhatToExpectCardModel.class), new g(new C15992b(1)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ScoreGaugeStickyModel.class), new h(new C15992b(2)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(WeeklyPlanHomeTileWrapperModel.class), new i(new C15992b(3)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CalibrationTimelineCardModel.class), new j(new C15992b(4)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ChallengeHomeTileModel.class), new k(new C13818q1(15)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(JournalHomeTileWrapperModel.class), new l(new C13818q1(16)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C24514d m45181F(CoachActivityTileModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        String secondaryIcon = model.getSecondaryIcon();
        EnumC24511a enumC24511a = null;
        if (secondaryIcon != null) {
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
                if (AbstractC22676k.m65745e(enumC16313m1.name(), secondaryIcon)) {
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
        String iconUrl = model.getIconUrl();
        AbstractC22403o.c cVar = iconUrl != null ? new AbstractC22403o.c(iconUrl, 0, 0, 0, 14, null) : null;
        String scoreDisplay = model.getScoreDisplay();
        TextResource title = model.getTitle();
        String subtitle = model.getSubtitle();
        String commitmentLevel = model.getCommitmentLevel();
        if (commitmentLevel != null) {
            EnumC24511a enumC24511a2 = EnumC24511a.RECOMMENDED;
            for (EnumC24511a enumC24511a3 : EnumC24511a.values()) {
                if (AbstractC22676k.m65745e(enumC24511a3.name(), commitmentLevel)) {
                    enumC24511a = enumC24511a3;
                    break;
                }
            }
            if (enumC24511a == null) {
                enumC24511a = enumC24511a2;
            }
        }
        return new C24514d(cVar, scoreDisplay, title, subtitle, enumC16313m0, enumC24511a, model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C26838c m45182G(CoachEntryPointModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45232x(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C36213q m45183H(NotificationsWrapperModelV3 model) {
        AbstractC22676k.m65750j(model, "model");
        return m45207c0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C25692f m45184I(ProgressPlotTileModel progressPlotTileModel) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        EnumC16313m0 enumC16313m2;
        EnumC16313m0 enumC16313m3;
        AbstractC22676k.m65750j(progressPlotTileModel, "progressPlotTileModel");
        String pregnancyIcon = progressPlotTileModel.getHeader().getPregnancyIcon();
        int i13 = 0;
        if (pregnancyIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    enumC16313m3 = null;
                    break;
                }
                enumC16313m3 = enumC16313m0ArrValues[i14];
                if (AbstractC22676k.m65745e(enumC16313m3.name(), pregnancyIcon)) {
                    break;
                }
                i14++;
            }
            enumC16313m0 = enumC16313m3;
        } else {
            enumC16313m0 = null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(progressPlotTileModel.getHeader().getTitle());
        String endIcon = progressPlotTileModel.getHeader().getEndIcon();
        if (endIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues2.length;
            while (true) {
                if (i13 >= length2) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues2[i13];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), endIcon)) {
                    break;
                }
                i13++;
            }
            enumC16313m1 = enumC16313m2;
        } else {
            enumC16313m1 = null;
        }
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(progressPlotTileModel.getHeader().getTrimesterDisplay());
        EnumC39333f enumC39333fM72733i = AbstractC24818c.m72733i(progressPlotTileModel.getHeader().getStyle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(progressPlotTileModel.getHeader().getDueDate());
        C9598e destination = progressPlotTileModel.getHeader().getDestination();
        List<PregnancyProgressLabelModel> labels = progressPlotTileModel.getPregnancyTilePlot().getLabels();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(labels, 10));
        for (PregnancyProgressLabelModel pregnancyProgressLabelModel : labels) {
            arrayList.add(new C24817b((float) pregnancyProgressLabelModel.getXposition(), AbstractC8693b.m21278l(pregnancyProgressLabelModel.getLabel()), AbstractC24818c.m72732h(pregnancyProgressLabelModel.getStyle()), false, 8, null));
        }
        List<PregnancyProgressBarModel> progressBars = progressPlotTileModel.getPregnancyTilePlot().getProgressBars();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(progressBars, 10));
        for (PregnancyProgressBarModel pregnancyProgressBarModel : progressBars) {
            EnumC39333f enumC39333fM72732h = AbstractC24818c.m72732h(pregnancyProgressBarModel.getStyle());
            float rangeMin = (float) pregnancyProgressBarModel.getRangeMin();
            float rangeMax = (float) pregnancyProgressBarModel.getRangeMax();
            Double currentValue = pregnancyProgressBarModel.getCurrentValue();
            arrayList2.add(new C24816a(enumC39333fM72732h, rangeMin, rangeMax, currentValue != null ? Float.valueOf((float) currentValue.doubleValue()) : null, pregnancyProgressBarModel.getShowAnnotation()));
        }
        return new C25692f(enumC16313m0, textResourceM21278l, textResourceM21278l2, enumC16313m1, enumC39333fM72733i, textResourceM21278l3, arrayList2, arrayList, destination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C25697k m45185J(WelcomeCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45211e0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C40895f m45186K(WhatToExpectCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45213f0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C37390l m45187L(ScoreGaugeStickyModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC15998h.m45296b(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C17634f m45188M(WeeklyPlanHomeTileWrapperModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45209d0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C21793d m45189N(CalibrationTimelineCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45230v(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C22588e m45190O(ChallengeHomeTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45231w(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C21922m m45191P(JournalHomeTileWrapperModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45200Y(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final InterfaceC25312u m45192Q(CustomAnimationContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45233y(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final InterfaceC25312u m45193R(DayOneTransitionWrapperModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45234z(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final InterfaceC25312u m45194S(DayOneTransitionWrapperModelV2 model) {
        AbstractC22676k.m65750j(model, "model");
        return m45176A(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC25312u m45195T(DayZeroCardsModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45177B(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C35768i m45196U(ItemsCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23673m2.m69083d(model, f60517a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C25689c m45197V(MciHomeTileModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitleDisplay());
        C9598e destination = model.getDestination();
        String destinationIcon = model.getDestinationIcon();
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
            if (AbstractC22676k.m65745e(enumC16313m0.name(), destinationIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        C14005e c14005eM39876b = C14005e.m39876b(AbstractC23713t0.m69422a(model.getDailyTickMarkPlot()), null, true, false, null, null, false, false, 0.0f, 0.0f, false, null, null, 4093, null);
        CardButtonModel logButton = model.getLogButton();
        return new C25689c(textResourceM21278l, destination, enumC16313m1, c14005eM39876b, logButton != null ? m45201Z(logButton) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C36213q m45198W(NotificationsWrapperModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m45203a0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C36213q m45199X(NotificationsWrapperModelV2 model) {
        AbstractC22676k.m65750j(model, "model");
        return m45205b0(model);
    }

    /* JADX INFO: renamed from: Y */
    public static final C21922m m45200Y(JournalHomeTileWrapperModel model) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC17606c.b bVar = AbstractC17606c.b.f68214b;
        String path = model.getPath();
        if (path == null) {
            path = "";
        }
        return new C21922m(bVar, path);
    }

    /* JADX INFO: renamed from: Z */
    public static final C27256h m45201Z(CardButtonModel logButton) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(logButton, "logButton");
        TextResource title = logButton.getTitle();
        String icon = logButton.getIcon();
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
        C9598e destination = logButton.getDestination();
        C9598e c9598e = destination == null ? new C9598e(null, null, null, 7, null) : destination;
        String id4 = logButton.getId();
        AnyModal modal = logButton.getModal();
        DismissEventModel dismissEvent = logButton.getDismissEvent();
        return new C27256h(title, enumC16313m0, null, null, null, null, null, c9598e, null, null, null, null, null, false, true, id4, false, false, null, modal, dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null, null, null, null, null, 31924092, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public static final C36213q m45203a0(NotificationsWrapperModel model) {
        AbstractC22676k.m65750j(model, "model");
        EnumC16313m0 enumC16313m0 = null;
        AbstractC36203g.b bVar = model.getArchitectureMiniComponent() != null ? AbstractC36203g.b.f155006b : null;
        AiChatEntryModel chatEntryPoint = model.getChatEntryPoint();
        C27347c c27347cM68566d = chatEntryPoint != null ? AbstractC23602c0.m68566d(chatEntryPoint) : null;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getReplayText());
        String replayIcon = model.getReplayIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.UNDO;
        for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m2.name(), replayIcon)) {
                enumC16313m0 = enumC16313m2;
                break;
            }
        }
        return new C36213q(bVar, c27347cM68566d, new C22174d(textResourceM21278l, enumC16313m0 == null ? enumC16313m1 : enumC16313m0, model.getChatEntryPoint() == null, false, null, 24, null), false, null, null, 56, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: b0 */
    public static final C36213q m45205b0(NotificationsWrapperModelV2 model) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC36203g.b bVar = model.getArchitectureMiniComponent() != null ? AbstractC36203g.b.f155006b : null;
        AiChatEntryModel chatEntryPoint = model.getChatEntryPoint();
        return new C36213q(bVar, chatEntryPoint != null ? AbstractC23602c0.m68566d(chatEntryPoint) : null, null, false, null, null, 56, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static final C36213q m45207c0(NotificationsWrapperModelV3 model) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC36203g.b bVar = AbstractC36203g.b.f155006b;
        AiChatEntryModel chatEntryPoint = model.getChatEntryPoint();
        return new C36213q(bVar, chatEntryPoint != null ? AbstractC23602c0.m68566d(chatEntryPoint) : null, null, false, model.getPath(), model.getUserCategory(), 8, null);
    }

    /* JADX INFO: renamed from: d0 */
    public static final C17634f m45209d0(WeeklyPlanHomeTileWrapperModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C17634f(model.getArchitectureMiniComponent() != null ? AbstractC16205c.b.f61543b : null, false, 2, null);
    }

    /* JADX INFO: renamed from: e0 */
    public static final C25697k m45211e0(WelcomeCardModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        String dayStrainDisplay = model.getDayStrainDisplay();
        String dayStrainSubtitleDisplay = model.getDayStrainSubtitleDisplay();
        double dayStrainGaugeFillPercentage = model.getDayStrainGaugeFillPercentage();
        String strainHelpIcon = model.getStrainHelpIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_INFORMATION;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), strainHelpIcon)) {
                break;
            }
            i13++;
        }
        return new C25697k(title, dayStrainDisplay, dayStrainSubtitleDisplay, dayStrainGaugeFillPercentage, enumC16313m0 == null ? enumC16313m1 : enumC16313m0, AbstractC16315n0.m46377b(model.getEndIcon()));
    }

    /* JADX INFO: renamed from: f0 */
    public static final C40895f m45213f0(WhatToExpectCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        ArrayList arrayList = new ArrayList();
        int totalCount = model.getDailyProgress().getTotalCount();
        if (1 <= totalCount) {
            int i13 = 1;
            while (true) {
                arrayList.add(new C40891b(AbstractC8693b.m21278l(String.valueOf(i13)), i13 <= model.getDailyProgress().getFilledCount()));
                if (i13 == totalCount) {
                    break;
                }
                i13++;
            }
        }
        return new C40895f(model.getIcon(), model.getTitle(), model.getBody(), new C40890a(model.getDailyProgress().getTitle(), model.getDailyProgress().getFilledCount(), model.getDailyProgress().getTotalCount()), model.getNavigation(), arrayList);
    }

    /* JADX INFO: renamed from: g0 */
    private static final InterfaceC25312u m45215g0(InterfaceC25312u interfaceC25312u, DesignSystemModel designSystemModel) {
        String backgroundStyle;
        if (!(interfaceC25312u instanceof C16550q)) {
            return interfaceC25312u;
        }
        EnumC13892q1 enumC13892q1 = null;
        TextWithIllustrationCardModel textWithIllustrationCardModel = designSystemModel instanceof TextWithIllustrationCardModel ? (TextWithIllustrationCardModel) designSystemModel : null;
        if (textWithIllustrationCardModel == null || (backgroundStyle = textWithIllustrationCardModel.getBackgroundStyle()) == null) {
            return interfaceC25312u;
        }
        for (EnumC13892q1 enumC13892q2 : EnumC13892q1.values()) {
            if (AbstractC22676k.m65745e(enumC13892q2.name(), backgroundStyle)) {
                enumC13892q1 = enumC13892q2;
                break;
            }
        }
        int i13 = enumC13892q1 == null ? -1 : a.f60518a[enumC13892q1.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? interfaceC25312u : C16550q.m46793b((C16550q) interfaceC25312u, null, null, null, null, false, null, EnumC16533a.ONBOARDING_BG_GRADIENT, null, null, null, null, false, false, false, false, null, false, null, null, null, null, 2097087, null);
        }
        return C16550q.m46793b((C16550q) interfaceC25312u, null, null, null, null, false, null, EnumC16533a.HAL, null, null, null, null, false, false, false, false, null, false, null, null, null, null, 2097087, null);
    }

    /* JADX INFO: renamed from: v */
    public static final C21793d m45230v(CalibrationTimelineCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource body = model.getBody();
        C9598e navigation = model.getNavigation();
        String strValueOf = String.valueOf(model.getCircularProgressIndicator().getCurrentProgressSteps().getCurrentStep());
        String strM8295h = AbstractC2875y.m8295h(model.getCircularProgressIndicator().getCurrentProgressSteps().getTotalSteps(), "/");
        int currentStep = model.getCircularProgressIndicator().getCurrentProgressSteps().getCurrentStep();
        return new C21793d(title, body, navigation, strValueOf, strM8295h, new C28582b(model.getCircularProgressIndicator().getCurrentProgressSteps().getTotalSteps(), currentStep, 0.0f, "", null, null, Boolean.FALSE, null, null, null, AbstractC15673b0.m43985G0(), AbstractC15673b0.m43985G0(), 55, 12.0f, 14.0f, false, false, 0L, EnumC28588h.STEPS, null, 754612, null), model.getCircularProgressIndicator().getCurrentProgressSteps().getTotalSteps() == model.getCircularProgressIndicator().getCurrentProgressSteps().getCurrentStep());
    }

    /* JADX INFO: renamed from: w */
    public static final C22588e m45231w(ChallengeHomeTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC22589f.m65480a(model);
    }

    /* JADX INFO: renamed from: x */
    private static final C26838c m45232x(CoachEntryPointModel coachEntryPointModel) {
        C26840e c26840e;
        EnumC26841f enumC26841f;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        EnumC16313m0 enumC16313m2;
        EnumC16313m0 enumC16313m3 = null;
        if (coachEntryPointModel.getCoachPill() != null) {
            String icon = coachEntryPointModel.getCoachPill().getIcon();
            EnumC16313m0 enumC16313m4 = EnumC16313m0.WHOOP_LOGO;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m2 != null) {
                enumC16313m4 = enumC16313m2;
            }
            c26840e = new C26840e(enumC16313m4, coachEntryPointModel.getCoachPill().getDestination());
        } else {
            c26840e = null;
        }
        DailyOutlookTileModel dailyOutlookTile = coachEntryPointModel.getDailyOutlookTile();
        String style = dailyOutlookTile.getStyle();
        EnumC26841f enumC26841f2 = EnumC26841f.GENERAL_CHAT;
        EnumC26841f[] enumC26841fArrValues = EnumC26841f.values();
        int length2 = enumC26841fArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                enumC26841f = null;
                break;
            }
            enumC26841f = enumC26841fArrValues[i14];
            if (AbstractC22676k.m65745e(enumC26841f.name(), style)) {
                break;
            }
            i14++;
        }
        EnumC26841f enumC26841f3 = enumC26841f == null ? enumC26841f2 : enumC26841f;
        boolean hasGradient = dailyOutlookTile.getHasGradient();
        String leftIcon = dailyOutlookTile.getLeftIcon();
        if (leftIcon != null) {
            EnumC16313m0 enumC16313m5 = EnumC16313m0.BEDTIME;
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length3 = enumC16313m0ArrValues2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues2[i15];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), leftIcon)) {
                    break;
                }
                i15++;
            }
            if (enumC16313m1 != null) {
                enumC16313m5 = enumC16313m1;
            }
            enumC16313m0 = enumC16313m5;
        } else {
            enumC16313m0 = null;
        }
        TextResource title = dailyOutlookTile.getTitle();
        String rightIcon = dailyOutlookTile.getRightIcon();
        EnumC16313m0 enumC16313m6 = EnumC16313m0.ARROW_FORWARD;
        for (EnumC16313m0 enumC16313m7 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m7.name(), rightIcon)) {
                enumC16313m3 = enumC16313m7;
                break;
            }
        }
        return new C26838c(c26840e, new C26844i(hasGradient, enumC16313m0, title, enumC16313m3 == null ? enumC16313m6 : enumC16313m3, enumC26841f3, dailyOutlookTile.getDestination()));
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC25312u m45233y(CustomAnimationContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        DesignSystemModel initial = model.getInitial();
        InterfaceC25312u interfaceC25312uM45215g0 = initial != null ? m45215g0(f60517a.m60541h(initial), initial) : null;
        DesignSystemModel completed = model.getCompleted();
        return new CustomAnimationContainerViewState(model.getId(), model.getKey(), model.getFinalIndex(), "INITIAL", interfaceC25312uM45215g0, completed != null ? f60517a.m60541h(completed) : null, false, null, false, model.getStyle(), 448, null);
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC25312u m45234z(DayOneTransitionWrapperModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new DayOneTransitionViewState(AbstractC23720u1.m69479s(model.getOverviewGauge()), m45203a0(model.getNotificationsWrapper()), m45211e0(model.getWelcomeHomeCard()), false, 8, null);
    }
}
