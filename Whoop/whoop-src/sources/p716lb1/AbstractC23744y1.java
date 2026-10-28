package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.GroupedItemsPanelModel;
import j02.C21174w;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l71.C23393d;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: lb1.y1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Ljb1/a;", "a", "Ll83/h;", "e", "()Ljb1/a;", "groupedItemsPanelNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "d", "()Llb1/y0;", "groupedItemsPanelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23744y1 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f94071a = AbstractC30060g.m92088H(new C21174w(21));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f94072b = Function1.m68251a(new C23714t1(2));

    /* JADX INFO: renamed from: lb1.y1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94073w;

        public a(Function1 function1) {
            this.f94073w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94073w.invoke((GroupedItemsPanelModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m69696d() {
        return f94072b;
    }

    /* JADX INFO: renamed from: e */
    private static final C21535a m69697e() {
        return (C21535a) f94071a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m69698f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(GroupedItemsPanelModel.class), new a(new C23714t1(3)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23393d m69699g(GroupedItemsPanelModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23393d(model.getId(), m69697e().m60545m(model.getItems()), model.getBottomContentInsetDp(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C21535a m69700h() {
        return AbstractC21537c.m60555e(null, 1, null);
    }
}
