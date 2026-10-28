package n62;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.referafriend.domain.models.BasicRafStyle;
import com.whoop.referafriend.domain.models.Promotion;
import com.whoop.referafriend.domain.models.PromotionCard;
import com.whoop.referafriend.domain.models.PromotionRewardModalContentModel;
import com.whoop.referafriend.domain.models.PromotionTermsModalContentModel;
import com.whoop.referafriend.domain.models.RafHowItWorksInstructionModel;
import com.whoop.referafriend.domain.models.RafHowItWorksModel;
import com.whoop.referafriend.domain.models.RafHubCTA;
import com.whoop.referafriend.domain.models.RafHubDomainState;
import com.whoop.referafriend.domain.models.TrialsTutorialLineModel;
import com.whoop.referafriend.domain.models.TrialsTutorialModel;
import f62.AbstractC14151a;
import f62.AbstractC14152b;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j62.AbstractC21378c;
import j62.AbstractC21381f;
import j62.C21377b;
import j62.C21382g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23464j;
import live.hms.video.media.tracks.HMSTrackSource;
import m62.AbstractC25118i;
import m62.C25111b;
import m62.C25112c;
import m62.C25113d;
import m62.C25114e;
import m62.C25115f;
import m62.C25120k;
import m62.C25121l;
import m62.C25122m;
import m62.EnumC25110a;
import m62.InterfaceC25116g;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n62.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u0004\u0018\u00010\"*\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010+\u001a\u00020**\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010/\u001a\u00020.*\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00103\u001a\u000202*\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0013\u00107\u001a\u000206*\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, m65681d2 = {"Ln62/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagRepository", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/referafriend/domain/models/RafHubDomainState;", HMSTrackSource.SCREEN, "Lj62/f;", "modal", "", "source", "Lm62/g;", "e", "(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Lj62/f;Ljava/lang/String;)Lm62/g;", "Lcom/whoop/referafriend/domain/models/RafHubCTA;", "primaryCta", "secondaryCta", "Lm62/f;", "b", "(Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)Lm62/f;", "c", "j", "(Lcom/whoop/referafriend/domain/models/RafHubCTA;)Lm62/f;", "Lcom/whoop/referafriend/domain/models/Promotion;", "Lm62/e;", "i", "(Lcom/whoop/referafriend/domain/models/Promotion;)Lm62/e;", "Lcom/whoop/referafriend/domain/models/PromotionCard;", "", "isComplete", "Lm62/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/referafriend/domain/models/PromotionCard;Z)Lm62/d;", "Lm62/i;", "k", "(Lj62/f;)Lm62/i;", "Lj62/g;", "Lm62/k;", "l", "(Lj62/g;)Lm62/k;", "Lcom/whoop/referafriend/domain/models/TrialsTutorialLineModel;", "Lm62/l;", "m", "(Lcom/whoop/referafriend/domain/models/TrialsTutorialLineModel;)Lm62/l;", "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;", "Lm62/m;", "n", "(Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;)Lm62/m;", "Lcom/whoop/referafriend/domain/models/RafHowItWorksModel;", "Lm62/c;", "g", "(Lcom/whoop/referafriend/domain/models/RafHowItWorksModel;)Lm62/c;", "Lcom/whoop/referafriend/domain/models/RafHowItWorksInstructionModel;", "Lm62/b;", "f", "(Lcom/whoop/referafriend/domain/models/RafHowItWorksInstructionModel;)Lm62/b;", "Lkd1/o;", "a", "(Ljava/lang/String;)Lkd1/o;", "Lj62/b;", "result", "d", "(Lj62/b;)Lm62/g;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "getFeatureFlagRepository", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26408a {

    /* JADX INFO: renamed from: b */
    private static final a f104881b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f104882c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagRepository;

    /* JADX INFO: renamed from: n62.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ln62/a$a;", "", "<init>", "()V", "", "AL_EARLY_ACCESS_SOURCE", "Ljava/lang/String;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: n62.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f104884a;

        static {
            int[] iArr = new int[BasicRafStyle.values().length];
            try {
                iArr[BasicRafStyle.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BasicRafStyle.YEAR_IN_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f104884a = iArr;
        }
    }

    public C26408a(FeatureFlagChecker featureFlagRepository) {
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        this.featureFlagRepository = featureFlagRepository;
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC22403o m78125a(String source) {
        return AbstractC22676k.m65745e(source, "advanced_labs_early_access") ? new AbstractC22403o.a(AbstractC14151a.f50974a) : new AbstractC22403o.a(AbstractC14151a.f50976c);
    }

    /* JADX INFO: renamed from: b */
    private final C25115f m78126b(RafHubCTA primaryCta, RafHubCTA secondaryCta) {
        if (!AbstractC22676k.m65745e(m78133j(primaryCta).getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            return m78133j(primaryCta);
        }
        if (secondaryCta != null) {
            return m78133j(secondaryCta);
        }
        throw new C23464j("An operation is not implemented: Remove it when RAF Contacts is implemented");
    }

    /* JADX INFO: renamed from: c */
    private final C25115f m78127c(RafHubCTA primaryCta, RafHubCTA secondaryCta) {
        C25115f c25115fM78133j;
        C9598e destination;
        AppScreen appScreen = m78133j(primaryCta).getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        AppScreen.C9318g6 c9318g6 = AppScreen.C9318g6.f27632w;
        if (!AbstractC22676k.m65745e(appScreen, c9318g6)) {
            if (((secondaryCta == null || (c25115fM78133j = m78133j(secondaryCta)) == null || (destination = c25115fM78133j.getDestination()) == null) ? null : destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()) != c9318g6 && secondaryCta != null) {
                return m78133j(secondaryCta);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0163  */
    /* JADX WARN: Code duplicated, block: B:55:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [m62.f] */
    /* JADX WARN: Type inference failed for: r18v0, types: [m62.i] */
    /* JADX INFO: renamed from: e */
    private final InterfaceC25116g m78128e(RafHubDomainState screen, AbstractC21381f modal, String source) {
        String str;
        Object next;
        String continueCtaText;
        C25115f c25115f;
        C25115f c25115fM78133j;
        Promotion promotion;
        C25114e c25114eM78132i;
        RafHowItWorksModel howItWorks;
        C25112c c25112cM78130g;
        EnumC25110a enumC25110a;
        Object objM78133j = null;
        if (screen.getBasic() != null) {
            int i13 = b.f104884a[screen.getBasic().getStyle().ordinal()];
            if (i13 == 1) {
                enumC25110a = EnumC25110a.STANDARD;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC25110a = EnumC25110a.YEAR_IN_REVIEW;
            }
            EnumC25110a enumC25110a2 = enumC25110a;
            EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(screen.getBasic().getIcon());
            AbstractC22676k.m65747g(enumC16313m0M46377b);
            String title = screen.getBasic().getTitle();
            String subtitle = screen.getBasic().getSubtitle();
            C25115f c25115fM78126b = this.featureFlagRepository.isFeatureEnabled("hide-unknown-destinations-android") ? m78126b(screen.getBasic().getPrimaryCta(), screen.getBasic().getSecondaryCta()) : m78133j(screen.getBasic().getPrimaryCta());
            if (this.featureFlagRepository.isFeatureEnabled("hide-unknown-destinations-android")) {
                objM78133j = m78127c(screen.getBasic().getPrimaryCta(), screen.getBasic().getSecondaryCta());
            } else {
                RafHubCTA secondaryCta = screen.getBasic().getSecondaryCta();
                if (secondaryCta != null) {
                    objM78133j = m78133j(secondaryCta);
                }
            }
            return new InterfaceC25116g.a(enumC25110a2, enumC16313m0M46377b, title, subtitle, c25115fM78126b, objM78133j);
        }
        if (screen.getFull() != null) {
            String header = screen.getFull().getHeader();
            String navigationBarText = screen.getFull().getNavigationBarText();
            EnumC16313m0 enumC16313m0M46377b2 = AbstractC16315n0.m46377b(screen.getFull().getIcon());
            if (enumC16313m0M46377b2 == null) {
                enumC16313m0M46377b2 = EnumC16313m0.REFER_A_FRIEND;
            }
            EnumC16313m0 enumC16313m0 = enumC16313m0M46377b2;
            String title2 = screen.getFull().getTitle();
            String subtitle2 = screen.getFull().getSubtitle();
            C25115f c25115fM78126b2 = this.featureFlagRepository.isFeatureEnabled("hide-unknown-destinations-android") ? m78126b(screen.getFull().getPrimaryCta(), screen.getFull().getSecondaryCta()) : m78133j(screen.getFull().getPrimaryCta());
            if (!this.featureFlagRepository.isFeatureEnabled("hide-unknown-destinations-android")) {
                RafHubCTA secondaryCta2 = screen.getFull().getSecondaryCta();
                if (secondaryCta2 != null) {
                    c25115fM78133j = m78133j(secondaryCta2);
                } else {
                    c25115f = null;
                }
                promotion = screen.getFull().getPromotion();
                if (promotion != null) {
                    c25114eM78132i = m78132i(promotion);
                } else {
                    c25114eM78132i = null;
                }
                howItWorks = screen.getFull().getHowItWorks();
                if (howItWorks != null) {
                    c25112cM78130g = m78130g(howItWorks);
                } else {
                    c25112cM78130g = null;
                }
                return new InterfaceC25116g.c(header, navigationBarText, enumC16313m0, title2, subtitle2, c25115fM78126b2, c25115f, c25114eM78132i, c25112cM78130g, m78125a(source), modal != null ? m78134k(modal) : null);
            }
            c25115fM78133j = m78127c(screen.getFull().getPrimaryCta(), screen.getFull().getSecondaryCta());
            c25115f = c25115fM78133j;
            promotion = screen.getFull().getPromotion();
            if (promotion != null) {
                c25114eM78132i = m78132i(promotion);
            } else {
                c25114eM78132i = null;
            }
            howItWorks = screen.getFull().getHowItWorks();
            if (howItWorks != null) {
                c25112cM78130g = m78130g(howItWorks);
            } else {
                c25112cM78130g = null;
            }
            return new InterfaceC25116g.c(header, navigationBarText, enumC16313m0, title2, subtitle2, c25115fM78126b2, c25115f, c25114eM78132i, c25112cM78130g, m78125a(source), modal != null ? m78134k(modal) : null);
        }
        if (screen.getTrials() == null) {
            return new InterfaceC25116g.b(source);
        }
        String title3 = screen.getTrials().getTitle();
        List<C21382g> listM60027d = screen.getTrials().m60027d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60027d, 10));
        Iterator it = listM60027d.iterator();
        while (it.hasNext()) {
            arrayList.add(m78135l((C21382g) it.next()));
        }
        C25122m c25122mM78137n = m78137n(screen.getTrials().getTutorialContent());
        String skipCtaText = screen.getTrials().getSkipCtaText();
        List<C21382g> listM60027d2 = screen.getTrials().m60027d();
        if (!(listM60027d2 instanceof Collection) || !listM60027d2.isEmpty()) {
            Iterator it3 = listM60027d2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    str = null;
                    break;
                }
                if (!((C21382g) it3.next()).getIsShared()) {
                    str = skipCtaText;
                    break;
                }
            }
        } else {
            str = null;
            break;
        }
        Iterator it4 = screen.getTrials().m60027d().iterator();
        do {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
        } while (((C21382g) next).getIsShared());
        C21382g c21382g = (C21382g) next;
        if (c21382g == null || (continueCtaText = c21382g.getBottomCtaText()) == null) {
            continueCtaText = screen.getTrials().getContinueCtaText();
        }
        String str2 = continueCtaText;
        for (Object obj : screen.getTrials().m60027d()) {
            if (!((C21382g) obj).getIsShared()) {
                objM78133j = obj;
                break;
            }
        }
        return new InterfaceC25116g.e(title3, arrayList, c25122mM78137n, str, str2, objM78133j == null);
    }

    /* JADX INFO: renamed from: f */
    private final C25111b m78129f(RafHowItWorksInstructionModel rafHowItWorksInstructionModel) {
        String text = rafHowItWorksInstructionModel.getText();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(rafHowItWorksInstructionModel.getIcon());
        if (enumC16313m0M46377b == null) {
            enumC16313m0M46377b = EnumC16313m0.REFER_A_FRIEND;
        }
        return new C25111b(text, enumC16313m0M46377b);
    }

    /* JADX INFO: renamed from: g */
    private final C25112c m78130g(RafHowItWorksModel rafHowItWorksModel) {
        String title = rafHowItWorksModel.getTitle();
        List<RafHowItWorksInstructionModel> instructions = rafHowItWorksModel.getInstructions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(instructions, 10));
        Iterator<T> it = instructions.iterator();
        while (it.hasNext()) {
            arrayList.add(m78129f((RafHowItWorksInstructionModel) it.next()));
        }
        return new C25112c(title, arrayList);
    }

    /* JADX INFO: renamed from: h */
    private final C25113d m78131h(PromotionCard promotionCard, boolean z4) {
        return new C25113d(promotionCard.getTitle(), promotionCard.getBody(), promotionCard.getReferralsCompleted(), promotionCard.getReferralsNeeded(), promotionCard.getReferralProgressText(), promotionCard.getDaysLeftText(), z4 ? AbstractC14152b.f50983e : AbstractC14152b.f50982d);
    }

    /* JADX INFO: renamed from: i */
    private final C25114e m78132i(Promotion promotion) {
        return new C25114e(promotion.getComplete(), m78131h(promotion.getCard(), promotion.getComplete()));
    }

    /* JADX INFO: renamed from: j */
    private final C25115f m78133j(RafHubCTA rafHubCTA) {
        return new C25115f(rafHubCTA.getTitle(), rafHubCTA.getDestination());
    }

    /* JADX INFO: renamed from: k */
    private final AbstractC25118i m78134k(AbstractC21381f abstractC21381f) {
        if (abstractC21381f instanceof AbstractC21381f.a) {
            PromotionRewardModalContentModel content = ((AbstractC21381f.a) abstractC21381f).getContent();
            if (content != null) {
                return new AbstractC25118i.a(content.getCode(), content.getTitle(), content.getBody(), m78133j(content.getCta()));
            }
            return null;
        }
        if (!(abstractC21381f instanceof AbstractC21381f.b)) {
            throw new NoWhenBranchMatchedException();
        }
        PromotionTermsModalContentModel content2 = ((AbstractC21381f.b) abstractC21381f).getContent();
        if (content2 != null) {
            return new AbstractC25118i.b(content2.getTitle(), content2.getBody(), content2.getCloseCtaText());
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private final C25120k m78135l(C21382g c21382g) {
        return new C25120k(c21382g.getCode(), c21382g.getShareCtaText(), c21382g.getSharedText(), c21382g.getShareMessage(), c21382g.getBottomCtaText(), c21382g.getIsShared());
    }

    /* JADX INFO: renamed from: m */
    private final C25121l m78136m(TrialsTutorialLineModel trialsTutorialLineModel) {
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(trialsTutorialLineModel.getIcon());
        if (enumC16313m0M46377b == null) {
            enumC16313m0M46377b = EnumC16313m0.REFER_A_FRIEND;
        }
        return new C25121l(enumC16313m0M46377b, trialsTutorialLineModel.getText());
    }

    /* JADX INFO: renamed from: n */
    private final C25122m m78137n(TrialsTutorialModel trialsTutorialModel) {
        String title = trialsTutorialModel.getTitle();
        List<TrialsTutorialLineModel> lineItems = trialsTutorialModel.getLineItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(lineItems, 10));
        Iterator<T> it = lineItems.iterator();
        while (it.hasNext()) {
            arrayList.add(m78136m((TrialsTutorialLineModel) it.next()));
        }
        return new C25122m(title, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC25116g m78138d(C21377b result) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC21378c state = result.getState();
        if (AbstractC22676k.m65745e(state, AbstractC21378c.c.f81771a)) {
            return InterfaceC25116g.d.f98436a;
        }
        if (state instanceof AbstractC21378c.b) {
            return m78128e(((AbstractC21378c.b) result.getState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), ((AbstractC21378c.b) result.getState()).getModal(), ((AbstractC21378c.b) result.getState()).getSource());
        }
        if (state instanceof AbstractC21378c.a) {
            return new InterfaceC25116g.b(((AbstractC21378c.a) result.getState()).getSource());
        }
        throw new NoWhenBranchMatchedException();
    }
}
