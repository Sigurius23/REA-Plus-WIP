package pc1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileButtonModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import h31.C16814g;
import h31.EnumC16810c;
import h31.EnumC16813f;
import l83.C23454a0;
import nm1.C26842g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: pc1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "recommendationTileButtonMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29067a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f117602a = Function1.m68251a(new C26842g(22));

    /* JADX INFO: renamed from: pc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f117603w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f117603w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f117603w.invoke((RecommendationTileButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m88352c() {
        return f117602a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m88353d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(RecommendationTileButtonModel.class), new a(new C26842g(23)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C16814g m88354e(RecommendationTileButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        EnumC16813f enumC16813fM88376b = model.isLoading() ? EnumC16813f.LOADING : AbstractC29070d.m88376b(model.getStatus());
        EnumC16810c enumC16810cM88375a = AbstractC29070d.m88375a(model.getStyle());
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
        Boolean boolIsEnabled = model.isEnabled();
        return new C16814g(textResourceM21278l, enumC16813fM88376b, enumC16810cM88375a, enumC16313m2, boolIsEnabled != null ? boolIsEnabled.booleanValue() : true, model.getInteraction());
    }
}
