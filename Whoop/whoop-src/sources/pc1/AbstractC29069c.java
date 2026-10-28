package pc1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileLayoutStyle;
import com.whoop.design.models.items.recommendationtile.RecommendationTileModel;
import h31.C16824q;
import h31.EnumC16821n;
import i31.C18052g;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ma1.C25371a;
import nm1.C26842g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: pc1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lm91/u;", "", "isSelected", "i", "(Lm91/u;Z)Lm91/u;", "Ljb1/a;", "a", "Ll83/h;", "e", "()Ljb1/a;", "recommendationTileNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "d", "()Llb1/y0;", "recommendationTileMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29069c {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f117607a = AbstractC30060g.m92088H(new C25371a(15));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f117608b = Function1.m68251a(new C26842g(24));

    /* JADX INFO: renamed from: pc1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f117609w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f117609w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f117609w.invoke((RecommendationTileModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m88368d() {
        return f117608b;
    }

    /* JADX INFO: renamed from: e */
    private static final C21535a m88369e() {
        return (C21535a) f117607a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m88370f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(RecommendationTileModel.class), new a(new C26842g(25)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C16824q m88371g(RecommendationTileModel model) {
        InterfaceC25312u interfaceC25312uM60544l;
        AbstractC22676k.m65750j(model, "model");
        String recommendationId = model.getRecommendationId();
        EnumC16821n enumC16821nM88379e = AbstractC29070d.m88379e(model.getStatus());
        DesignSystemModel header = model.getHeader();
        InterfaceC25312u interfaceC25312uM88373i = (header == null || (interfaceC25312uM60544l = m88369e().m60544l(header)) == null) ? null : m88373i(interfaceC25312uM60544l, model.isSelected());
        List<InterfaceC25312u> listM60545m = m88369e().m60545m(model.getBody());
        DesignSystemModel cta = model.getCta();
        InterfaceC25312u interfaceC25312uM60544l2 = cta != null ? m88369e().m60544l(cta) : null;
        boolean zIsExpanded = model.isExpanded();
        boolean zIsSelected = model.isSelected();
        RecommendationTileLayoutStyle style = model.getStyle();
        return new C16824q(recommendationId, enumC16821nM88379e, interfaceC25312uM88373i, listM60545m, interfaceC25312uM60544l2, zIsExpanded, zIsSelected, style != null ? AbstractC29070d.m88378d(style) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C21535a m88372h() {
        return AbstractC21537c.m60555e(null, 1, null);
    }

    /* JADX INFO: renamed from: i */
    private static final InterfaceC25312u m88373i(InterfaceC25312u interfaceC25312u, boolean z4) {
        C18052g c18052gM51840b;
        C18052g c18052g = interfaceC25312u instanceof C18052g ? (C18052g) interfaceC25312u : null;
        return (c18052g == null || (c18052gM51840b = C18052g.m51840b(c18052g, null, null, null, null, null, null, null, null, z4, false, null, 1791, null)) == null) ? interfaceC25312u : c18052gM51840b;
    }
}
