package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.RewardsSectionModel;
import h81.C17014g;
import h81.EnumC17013f;
import j02.C21174w;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: lb1.z3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Ljb1/a;", "a", "Ll83/h;", "e", "()Ljb1/a;", "rewardsSectionNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "d", "()Llb1/y0;", "rewardsSectionMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23752z3 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f94098a = AbstractC30060g.m92088H(new C21174w(22));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f94099b = Function1.m68251a(new C23740x3(1));

    /* JADX INFO: renamed from: lb1.z3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94100w;

        public a(Function1 function1) {
            this.f94100w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94100w.invoke((RewardsSectionModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m69792d() {
        return f94099b;
    }

    /* JADX INFO: renamed from: e */
    private static final C21535a m69793e() {
        return (C21535a) f94098a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m69794f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(RewardsSectionModel.class), new a(new C23740x3(2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C17014g m69795g(RewardsSectionModel model) {
        EnumC17013f enumC17013f;
        AbstractC22676k.m65750j(model, "model");
        C33169c0 c33169c0M69556f = AbstractC23723u4.m69556f(model.getTitle());
        List<InterfaceC25312u> listM60545m = m69793e().m60545m(model.getItems());
        String style = model.getStyle();
        if (style == null) {
            style = "";
        }
        EnumC17013f[] enumC17013fArrValues = EnumC17013f.values();
        int length = enumC17013fArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC17013f = null;
                break;
            }
            enumC17013f = enumC17013fArrValues[i13];
            if (AbstractC22676k.m65745e(enumC17013f.name(), style)) {
                break;
            }
            i13++;
        }
        if (enumC17013f == null) {
            enumC17013f = EnumC17013f.AMERICA_250;
        }
        return new C17014g(c33169c0M69556f, listM60545m, enumC17013f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C21535a m69796h() {
        return AbstractC21537c.m60555e(null, 1, null);
    }
}
