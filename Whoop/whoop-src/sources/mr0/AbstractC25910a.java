package mr0;

import com.whoop.communityhighlights.domain.models.ArchMiniCommunityHighlightsModel;
import com.whoop.communityhighlights.domain.models.HighlightCardBadgeModel;
import com.whoop.communityhighlights.domain.models.HighlightCardFooterModel;
import com.whoop.communityhighlights.domain.models.HighlightCardLabelModel;
import com.whoop.communityhighlights.domain.models.HighlightCardModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import j93.InterfaceC21461d;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import lr0.EnumC24694a;
import lr0.EnumC24695b;
import md0.C25447b;
import nr0.C27071d;
import nr0.C27074g;
import nr0.C27075h;
import nr0.C27077j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: mr0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;", "Lnr0/g;", "n", "(Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;)Lnr0/g;", "Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;", "Lnr0/j;", "m", "(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)Lnr0/j;", "Ljb1/a;", "a", "Ljb1/a;", "k", "()Ljb1/a;", "communityHighlightsDesignItemReducer", "Lm91/p;", "b", "Lm91/p;", "l", "()Lm91/p;", "communityHighlightsDesignItemViewFactory", "community-highlights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25910a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f102280a = AbstractC21537c.m60554d(new C25447b(19));

    /* JADX INFO: renamed from: b */
    private static final C25307p f102281b = Function1.m74306g(new C25447b(20));

    /* JADX INFO: renamed from: mr0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102282a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f102283b;

        static {
            int[] iArr = new int[EnumC24695b.values().length];
            try {
                iArr[EnumC24695b.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f102282a = iArr;
            int[] iArr2 = new int[EnumC24694a.values().length];
            try {
                iArr2[EnumC24694a.ACCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f102283b = iArr2;
        }
    }

    /* JADX INFO: renamed from: mr0.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f102284w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f102284w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f102284w.invoke((HighlightCardModel) it);
        }
    }

    /* JADX INFO: renamed from: mr0.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f102285w;

        public c(p715kotlin.jvm.functions.Function1 function1) {
            this.f102285w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f102285w.invoke((ArchMiniCommunityHighlightsModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m76625f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C25447b(21));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m76626g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C25447b c25447b = new C25447b(22);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HighlightCardModel.class), new b(c25447b));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArchMiniCommunityHighlightsModel.class), new c(new C25447b(23)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C27077j m76627h(HighlightCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m76632m(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C27074g m76628i(ArchMiniCommunityHighlightsModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m76633n(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m76629j(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C27077j.class), new C27075h());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C27074g.class), new C27071d());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final C21535a m76630k() {
        return f102280a;
    }

    /* JADX INFO: renamed from: l */
    public static final C25307p m76631l() {
        return f102281b;
    }

    /* JADX INFO: renamed from: m */
    private static final C27077j m76632m(HighlightCardModel highlightCardModel) {
        EnumC24695b style;
        EnumC24694a style2;
        String avatarUrl;
        String text;
        String text2;
        String text3;
        HighlightCardLabelModel label = highlightCardModel.getLabel();
        if (label == null || (style = label.getStyle()) == null) {
            style = EnumC24695b.DARK;
        }
        HighlightCardBadgeModel badge = highlightCardModel.getBadge();
        if (badge == null || (style2 = badge.getStyle()) == null) {
            style2 = EnumC24694a.ACCENT;
        }
        boolean z4 = highlightCardModel.getBadge() != null;
        String id4 = highlightCardModel.getId();
        HighlightCardLabelModel label2 = highlightCardModel.getLabel();
        TextResource textResourceM21278l = (label2 == null || (text3 = label2.getText()) == null) ? null : AbstractC8693b.m21278l(text3);
        int[] iArr = a.f102282a;
        if (iArr[style.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        if (iArr[style.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_BLACK;
        HighlightCardBadgeModel badge2 = highlightCardModel.getBadge();
        TextResource textResourceM21278l2 = (badge2 == null || (text2 = badge2.getText()) == null) ? null : AbstractC8693b.m21278l(text2);
        int[] iArr2 = a.f102283b;
        if (iArr2[style2.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (iArr2[style2.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC39333f enumC39333f3 = EnumC39333f.RECOVERY;
        String backgroundImageUrl = highlightCardModel.getBackgroundImageUrl();
        AbstractC22403o cVar = backgroundImageUrl != null ? new AbstractC22403o.c(backgroundImageUrl, 0, 0, 0, 14, null) : AbstractC22403o.b.f87641b;
        EnumC39333f enumC39333f4 = z4 ? enumC39333f3 : EnumC39333f.WHITE_10;
        float f13 = z4 ? (float) 1.5d : 1;
        HighlightCardFooterModel footer = highlightCardModel.getFooter();
        TextResource textResourceM21278l3 = (footer == null || (text = footer.getText()) == null) ? null : AbstractC8693b.m21278l(text);
        HighlightCardFooterModel footer2 = highlightCardModel.getFooter();
        return new C27077j(id4, textResourceM21278l, enumC39333f, enumC39333f2, textResourceM21278l2, enumC39333f2, enumC39333f3, cVar, enumC39333f4, f13, textResourceM21278l3, (footer2 == null || (avatarUrl = footer2.getAvatarUrl()) == null) ? null : new AbstractC22403o.c(avatarUrl, 0, 0, 0, 14, null), highlightCardModel.getInteraction(), null);
    }

    /* JADX INFO: renamed from: n */
    private static final C27074g m76633n(ArchMiniCommunityHighlightsModel archMiniCommunityHighlightsModel) {
        return new C27074g(archMiniCommunityHighlightsModel.getPath(), archMiniCommunityHighlightsModel.getScope());
    }
}
