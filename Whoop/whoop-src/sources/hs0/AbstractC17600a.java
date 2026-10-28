package hs0;

import com.whoop.communityreactions.domain.model.ReactionCommentModel;
import com.whoop.communityreactions.domain.model.ReactionsArchMiniModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hb1.C17085h;
import is0.C20878e;
import is0.C20919y0;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: hs0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;", "Lis0/y0;", "k", "(Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;)Lis0/y0;", "Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;", "Lis0/e;", "j", "(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;)Lis0/e;", "Ljb1/a;", "a", "Ljb1/a;", "e", "()Ljb1/a;", "reactionsDesignItemReducer", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17600a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f68177a = AbstractC21537c.m60554d(new C17085h(23));

    /* JADX INFO: renamed from: hs0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f68178w;

        public a(Function1 function1) {
            this.f68178w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f68178w.invoke((ReactionsArchMiniModel) it);
        }
    }

    /* JADX INFO: renamed from: hs0.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f68179w;

        public b(Function1 function1) {
            this.f68179w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f68179w.invoke((ReactionCommentModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C21535a m50119e() {
        return f68177a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m50120f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C17085h(24));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m50121g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C17085h c17085h = new C17085h(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ReactionsArchMiniModel.class), new a(c17085h));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ReactionCommentModel.class), new b(new C17085h(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C20919y0 m50122h(ReactionsArchMiniModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m50125k(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C20878e m50123i(ReactionCommentModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m50124j(model);
    }

    /* JADX INFO: renamed from: j */
    private static final C20878e m50124j(ReactionCommentModel reactionCommentModel) {
        String id4 = reactionCommentModel.getId();
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(reactionCommentModel.getAvatar());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(reactionCommentModel.getName());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(reactionCommentModel.getText());
        String badge = reactionCommentModel.getBadge();
        return new C20878e(id4, abstractC22403oM64503l, textResourceM21278l, textResourceM21278l2, badge != null ? AbstractC8693b.m21278l(badge) : null, reactionCommentModel.getRenderStyle(), reactionCommentModel.getLongPressAction(), false);
    }

    /* JADX INFO: renamed from: k */
    private static final C20919y0 m50125k(ReactionsArchMiniModel reactionsArchMiniModel) {
        return new C20919y0(reactionsArchMiniModel.getPath(), reactionsArchMiniModel.getFetchDelayMs());
    }
}
