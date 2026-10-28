package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DividerModel;
import hy0.C17736e;
import hy0.EnumC17740f;
import hy0.EnumC17744g;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.f1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/DividerModel;", "Lhy0/e;", "e", "(Lcom/whoop/design/models/items/DividerModel;)Lhy0/e;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "dividerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23624f1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93752a = Function1.m68251a(new C23644i0(29));

    /* JADX INFO: renamed from: lb1.f1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93753w;

        public a(Function1 function1) {
            this.f93753w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93753w.invoke((DividerModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68740c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DividerModel.class), new a(new C23617e1(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C17736e m68741d(DividerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68742e(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C17736e m68742e(DividerModel dividerModel) {
        EnumC17740f enumC17740f;
        AbstractC22676k.m65750j(dividerModel, "<this>");
        EnumC17744g enumC17744g = AbstractC22676k.m65745e(dividerModel.getDividerType(), "DOTTED") ? EnumC17744g.DOTTED : EnumC17744g.SOLID;
        String headerPosition = dividerModel.getHeaderPosition();
        if (AbstractC22676k.m65745e(headerPosition, "TRAILING")) {
            enumC17740f = EnumC17740f.RIGHT;
        } else {
            enumC17740f = AbstractC22676k.m65745e(headerPosition, "CENTER") ? EnumC17740f.CENTERED : EnumC17740f.LEFT;
        }
        return new C17736e(enumC17744g, enumC17740f, dividerModel.getTitle());
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m68743f() {
        return f93752a;
    }
}
