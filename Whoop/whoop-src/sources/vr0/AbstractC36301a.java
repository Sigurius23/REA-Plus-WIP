package vr0;

import b91.C2886a;
import b91.EnumC2888c;
import com.whoop.communitymoments.domain.models.ArchMiniCommunityMomentsModel;
import com.whoop.communitymoments.domain.models.MenuAnchorButtonModel;
import com.whoop.communitymoments.domain.models.MenuAnchorButtonStyle;
import com.whoop.communitymoments.domain.models.MomentCaptionBarModel;
import com.whoop.communitymoments.domain.models.MomentCardFillMode;
import com.whoop.communitymoments.domain.models.MomentCardModel;
import com.whoop.communitymoments.domain.models.MomentCompactScoreGaugeModel;
import com.whoop.communitymoments.domain.models.MomentContainerModel;
import com.whoop.communitymoments.domain.models.MomentStackModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j81.C21425i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23690p1;
import p716lb1.AbstractC23703r2;
import p716lb1.AbstractC23720u1;
import p716lb1.C23596b1;
import p716lb1.C23749z0;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import vo1.C36244s;
import vy0.C36570d0;
import wr0.C37517a0;
import wr0.C37519b0;
import wr0.C37525e0;
import wr0.C37530h;
import wr0.C37537k0;
import wr0.C37539l0;
import wr0.C37542n;
import wr0.C37554t;
import wr0.C37556u;
import wr0.C37558v;
import wr0.C37560w;
import wr0.C37563x0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vr0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;", "Lwr0/e0;", "z", "(Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;)Lwr0/e0;", "Lcom/whoop/communitymoments/domain/models/MomentCardModel;", "Lwr0/b0;", "y", "(Lcom/whoop/communitymoments/domain/models/MomentCardModel;)Lwr0/b0;", "Lcom/whoop/communitymoments/domain/models/MomentStackModel;", "Lwr0/x0;", "C", "(Lcom/whoop/communitymoments/domain/models/MomentStackModel;)Lwr0/x0;", "Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;", "Lwr0/h;", "D", "(Lcom/whoop/communitymoments/domain/models/ArchMiniCommunityMomentsModel;)Lwr0/h;", "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;", "Lwr0/n;", "v", "(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;)Lwr0/n;", "Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;", "Lwr0/t;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;)Lwr0/t;", "Lcom/whoop/communitymoments/domain/models/MomentContainerModel;", "Lwr0/k0;", "A", "(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;)Lwr0/k0;", "Ljb1/a;", "a", "Ljb1/a;", "u", "()Ljb1/a;", "communityMomentsDesignItemReducer", "community-moments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36301a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f155556a = AbstractC21537c.m60554d(new C36244s(17));

    /* JADX INFO: renamed from: vr0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155557w;

        public a(Function1 function1) {
            this.f155557w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f155557w.invoke((MenuAnchorButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: vr0.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155558w;

        public b(Function1 function1) {
            this.f155558w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f155558w.invoke((MomentCaptionBarModel) it);
        }
    }

    /* JADX INFO: renamed from: vr0.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155559w;

        public c(Function1 function1) {
            this.f155559w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f155559w.invoke((MomentCardModel) it);
        }
    }

    /* JADX INFO: renamed from: vr0.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155560w;

        public d(Function1 function1) {
            this.f155560w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f155560w.invoke((MomentStackModel) it);
        }
    }

    /* JADX INFO: renamed from: vr0.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155561w;

        public e(Function1 function1) {
            this.f155561w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f155561w.invoke((ArchMiniCommunityMomentsModel) it);
        }
    }

    /* JADX INFO: renamed from: vr0.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155562w;

        public f(Function1 function1) {
            this.f155562w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f155562w.invoke((MomentContainerModel) it);
        }
    }

    /* JADX INFO: renamed from: vr0.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155563w;

        public g(Function1 function1) {
            this.f155563w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f155563w.invoke((MomentCompactScoreGaugeModel) it);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX INFO: renamed from: A */
    private static final C37537k0 m116023A(MomentContainerModel momentContainerModel) {
        AbstractC22403o.c cVar;
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C36244s(18));
        String id4 = momentContainerModel.getId();
        String backgroundImageUrl = momentContainerModel.getBackgroundImageUrl();
        if (backgroundImageUrl == null) {
            cVar = null;
        } else {
            String str = !AbstractC39414r.m125890i0(backgroundImageUrl) ? backgroundImageUrl : null;
            if (str != null) {
                cVar = new AbstractC22403o.c(str, 0, 0, 0, 14, null);
            } else {
                cVar = null;
            }
        }
        float fM36283m = AbstractC12889b.m36283m(momentContainerModel.getPhotoRevealFraction(), 0.0f, 1.0f);
        List<DesignSystemModel> items = momentContainerModel.getItems();
        C37539l0 c37539l0 = null;
        AbstractC22403o.c cVar2 = cVar;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            C25306o c25306oM60542i = c21535aM60554d.m60542i((DesignSystemModel) it.next());
            if (c25306oM60542i != null) {
                arrayList.add(c25306oM60542i);
            }
        }
        MomentContainerModel.HeaderLeadingButton headerLeadingButton = momentContainerModel.getHeaderLeadingButton();
        if (headerLeadingButton != null) {
            c37539l0 = new C37539l0(AbstractC16315n0.m46381f(headerLeadingButton.getIcon(), null, 1, null), headerLeadingButton.getAction());
        }
        return new C37537k0(id4, cVar2, fM36283m, arrayList, c37539l0, c21535aM60554d.m60545m(momentContainerModel.getHeaderTrailingItems()), c21535aM60554d.m60545m(momentContainerModel.getFooterOverlayItems()), momentContainerModel.getAchievementBackgroundStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m116024B(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final C37563x0 m116025C(MomentStackModel momentStackModel) {
        String id4 = momentStackModel.getId();
        String accessibilityLabel = momentStackModel.getAccessibilityLabel();
        List<DesignSystemModel> items = momentStackModel.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap((DesignSystemModel) it.next());
            MomentCardModel momentCardModel = designSystemModelUnwrap instanceof MomentCardModel ? (MomentCardModel) designSystemModelUnwrap : null;
            C37519b0 c37519b0M116051y = momentCardModel != null ? m116051y(momentCardModel) : null;
            if (c37519b0M116051y != null) {
                arrayList.add(c37519b0M116051y);
            }
        }
        return new C37563x0(id4, accessibilityLabel, arrayList);
    }

    /* JADX INFO: renamed from: D */
    private static final C37530h m116026D(ArchMiniCommunityMomentsModel archMiniCommunityMomentsModel) {
        return new C37530h(archMiniCommunityMomentsModel.getId(), archMiniCommunityMomentsModel.getPath(), archMiniCommunityMomentsModel.getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m116038l(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C36244s(19));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m116039m(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C36244s c36244s = new C36244s(20);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MenuAnchorButtonModel.class), new a(c36244s));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MomentCaptionBarModel.class), new b(new C36244s(21)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MomentCardModel.class), new c(new C36244s(22)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MomentStackModel.class), new d(new C36244s(23)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArchMiniCommunityMomentsModel.class), new e(new C36244s(24)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MomentContainerModel.class), new f(new C36244s(25)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MomentCompactScoreGaugeModel.class), new g(new C36244s(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C37542n m116040n(MenuAnchorButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m116048v(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C37554t m116041o(MomentCaptionBarModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m116049w(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C37519b0 m116042p(MomentCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m116051y(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C37563x0 m116043q(MomentStackModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m116025C(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C37530h m116044r(ArchMiniCommunityMomentsModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m116026D(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C37537k0 m116045s(MomentContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m116023A(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C37525e0 m116046t(MomentCompactScoreGaugeModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m116052z(model);
    }

    /* JADX INFO: renamed from: u */
    public static final C21535a m116047u() {
        return f155556a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX INFO: renamed from: v */
    private static final C37542n m116048v(MenuAnchorButtonModel menuAnchorButtonModel) {
        AbstractC22403o.c cVar;
        EnumC16313m0 enumC16313m0M46378c = AbstractC16315n0.m46378c(menuAnchorButtonModel.getIcon(), EnumC16313m0.PENCIL);
        String contentDescription = menuAnchorButtonModel.getContentDescription();
        String iconUrl = menuAnchorButtonModel.getIconUrl();
        if (iconUrl == null) {
            cVar = null;
        } else {
            String str = !AbstractC39414r.m125890i0(iconUrl) ? iconUrl : null;
            if (str != null) {
                cVar = new AbstractC22403o.c(str, 0, 0, 0, 14, null);
            } else {
                cVar = null;
            }
        }
        C36570d0 c36570d0M69224f = AbstractC23690p1.m69224f(menuAnchorButtonModel.getMenu());
        MenuAnchorButtonStyle style = menuAnchorButtonModel.getStyle();
        if (style == null) {
            style = MenuAnchorButtonStyle.CONTAINED;
        }
        return new C37542n(enumC16313m0M46378c, contentDescription, cVar, c36570d0M69224f, style);
    }

    /* JADX INFO: renamed from: w */
    private static final C37554t m116049w(MomentCaptionBarModel momentCaptionBarModel) {
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C36244s(27));
        String id4 = momentCaptionBarModel.getId();
        DesignSystemModel leading = momentCaptionBarModel.getLeading();
        InterfaceC25312u interfaceC25312uM60544l = leading != null ? c21535aM60554d.m60544l(leading) : null;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(momentCaptionBarModel.getPlaceholder());
        String stateUpdateValueKey = momentCaptionBarModel.getStateUpdateValueKey();
        C27270o c27270o = new C27270o(AbstractC27274q.b.f109138f, AbstractC16315n0.m46380e(momentCaptionBarModel.getSaveIcon(), EnumC16313m0.ARROW_FORWARD), null, null, null, true, false, false, 0.0f, false, 988, null);
        String saveContentDescription = momentCaptionBarModel.getSaveContentDescription();
        if (saveContentDescription == null) {
            saveContentDescription = "";
        }
        return new C37554t(id4, interfaceC25312uM60544l, textResourceM21278l, "", stateUpdateValueKey, c27270o, saveContentDescription, momentCaptionBarModel.getSubmitInteraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m116050x(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX INFO: renamed from: y */
    private static final C37519b0 m116051y(MomentCardModel momentCardModel) {
        AbstractC22403o.c cVar;
        C37517a0 c37517a0;
        C37560w c37560w;
        AbstractC22403o.c cVar2;
        AbstractC22403o.c cVar3;
        String id4 = momentCardModel.getId();
        MomentCardFillMode fillMode = momentCardModel.getFillMode();
        if (fillMode == null) {
            fillMode = MomentCardFillMode.FIT_CONTENT;
        }
        MomentCardFillMode momentCardFillMode = fillMode;
        String imageUrl = momentCardModel.getImageUrl();
        if (imageUrl == null) {
            cVar = null;
        } else {
            String str = !AbstractC39414r.m125890i0(imageUrl) ? imageUrl : null;
            if (str != null) {
                cVar = new AbstractC22403o.c(str, 0, 0, 0, 14, null);
            } else {
                cVar = null;
            }
        }
        MomentCardModel.DateBadge dateBadge = momentCardModel.getDateBadge();
        C37558v c37558v = dateBadge != null ? new C37558v(AbstractC8693b.m21278l(dateBadge.getDateDay()), AbstractC8693b.m21278l(dateBadge.getDateMonth())) : null;
        MomentCardModel.Profile profile = momentCardModel.getProfile();
        if (profile != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(profile.getTitle());
            String subtitle = profile.getSubtitle();
            TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
            String avatar = profile.getAvatar();
            if (avatar == null) {
                cVar3 = null;
            } else {
                String str2 = !AbstractC39414r.m125890i0(avatar) ? avatar : null;
                if (str2 != null) {
                    cVar3 = new AbstractC22403o.c(str2, 0, 0, 0, 14, null);
                } else {
                    cVar3 = null;
                }
            }
            c37517a0 = new C37517a0(textResourceM21278l, textResourceM21278l2, cVar3, profile.getAction());
        } else {
            c37517a0 = null;
        }
        MomentCardModel.Badge badge = momentCardModel.getBadge();
        C37556u c37556u = badge != null ? new C37556u(AbstractC8693b.m21278l(badge.getText())) : null;
        MomentCardModel.Footer footer = momentCardModel.getFooter();
        if (footer != null) {
            String iconUrl = footer.getIconUrl();
            if (iconUrl == null) {
                cVar2 = null;
            } else {
                String str3 = !AbstractC39414r.m125890i0(iconUrl) ? iconUrl : null;
                if (str3 != null) {
                    cVar2 = new AbstractC22403o.c(str3, 0, 0, 0, 14, null);
                } else {
                    cVar2 = null;
                }
            }
            String title = footer.getTitle();
            TextResource textResourceM21278l3 = title != null ? AbstractC8693b.m21278l(title) : null;
            String subtitle2 = footer.getSubtitle();
            TextResource textResourceM21278l4 = subtitle2 != null ? AbstractC8693b.m21278l(subtitle2) : null;
            EnumC2888c titleTypography = footer.getTitleTypography();
            C2886a c2886aM8402a = titleTypography != null ? EnumC2888c.INSTANCE.m8402a(titleTypography) : null;
            EnumC2888c subtitleTypography = footer.getSubtitleTypography();
            c37560w = new C37560w(cVar2, textResourceM21278l3, textResourceM21278l4, c2886aM8402a, subtitleTypography != null ? EnumC2888c.INSTANCE.m8402a(subtitleTypography) : null);
        } else {
            c37560w = null;
        }
        return new C37519b0(id4, momentCardFillMode, cVar, c37558v, c37517a0, c37556u, c37560w, momentCardModel.getInteraction());
    }

    /* JADX INFO: renamed from: z */
    private static final C37525e0 m116052z(MomentCompactScoreGaugeModel momentCompactScoreGaugeModel) {
        String id4 = momentCompactScoreGaugeModel.getId();
        C21425i c21425iM69478r = AbstractC23720u1.m69478r(momentCompactScoreGaugeModel.getScoreGauge());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(momentCompactScoreGaugeModel.getTitle());
        String subtitle = momentCompactScoreGaugeModel.getSubtitle();
        ArrayList arrayList = null;
        TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        List<LegendStyle> barStyles = momentCompactScoreGaugeModel.getBarStyles();
        if (barStyles != null) {
            List<LegendStyle> list = barStyles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC23703r2.m69349a((LegendStyle) it.next()));
            }
        }
        return new C37525e0(id4, c21425iM69478r, textResourceM21278l, textResourceM21278l2, arrayList);
    }
}
