package qc1;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.recommendationtileheader.RecommendationTileHeaderModel;
import i31.C18052g;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: qc1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Ljb1/a;", "a", "Ll83/h;", "e", "()Ljb1/a;", "recommendationTileHeaderNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "d", "()Llb1/y0;", "recommendationTileHeaderMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30218b {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f123747a = AbstractC30060g.m92088H(new C25371a(23));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f123748b = Function1.m68251a(new C30217a(0));

    /* JADX INFO: renamed from: qc1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f123749w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f123749w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f123749w.invoke((RecommendationTileHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m92473d() {
        return f123748b;
    }

    /* JADX INFO: renamed from: e */
    private static final C21535a m92474e() {
        return (C21535a) f123747a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m92475f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(RecommendationTileHeaderModel.class), new a(new C30217a(1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C18052g m92476g(RecommendationTileHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        EnumC2888c titleTypography = model.getTitleTypography();
        if (titleTypography == null) {
            titleTypography = EnumC2888c.SH4;
        }
        EnumC2888c enumC2888c = titleTypography;
        DesignSystemModel leading = model.getLeading();
        InterfaceC25312u interfaceC25312uM60544l = leading != null ? m92474e().m60544l(leading) : null;
        String icon = model.getIcon();
        AbstractC22403o.c cVar = icon != null ? new AbstractC22403o.c(icon, 0, 0, 0, 14, null) : null;
        List<InterfaceC25312u> listM60545m = m92474e().m60545m(model.getDescription());
        DesignSystemModel trailing = model.getTrailing();
        InterfaceC25312u interfaceC25312uM60544l2 = trailing != null ? m92474e().m60544l(trailing) : null;
        DesignSystemModel emoji = model.getEmoji();
        return new C18052g(id4, title, enumC2888c, interfaceC25312uM60544l, cVar, listM60545m, interfaceC25312uM60544l2, emoji != null ? m92474e().m60544l(emoji) : null, false, model.getIconBackgroundEnabled(), model.getInteraction(), 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C21535a m92477h() {
        return AbstractC21537c.m60555e(null, 1, null);
    }
}
