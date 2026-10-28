package com.whoop.startactivity.goals.targetcard;

import com.whoop.design.models.DesignSystemModel;
import gz0.AbstractC16315n0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l72.C23399f;
import l83.C23454a0;
import l83.InterfaceC23462h;
import lc0.C23825g;
import lg2.C24036a;
import lg2.C24037b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: com.whoop.startactivity.goals.targetcard.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Ljb1/a;", "a", "Ll83/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljb1/a;", "targetCardNestedReducer", "b", "Ljb1/a;", "f", "targetCardDesignItemReducer", "Lm91/p;", "c", "Lm91/p;", "g", "()Lm91/p;", "targetCardDesignItemViewFactory", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10241a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f30942a = AbstractC30060g.m92088H(new C23399f(21));

    /* JADX INFO: renamed from: b */
    private static final C21535a f30943b = AbstractC21537c.m60554d(new C23825g(20));

    /* JADX INFO: renamed from: c */
    private static final C25307p f30944c = Function1.m74306g(new C23825g(21));

    /* JADX INFO: renamed from: com.whoop.startactivity.goals.targetcard.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f30945w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f30945w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f30945w.invoke((TargetCardModel) it);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C21535a m26047f() {
        return f30943b;
    }

    /* JADX INFO: renamed from: g */
    public static final C25307p m26048g() {
        return f30944c;
    }

    /* JADX INFO: renamed from: h */
    private static final C21535a m26049h() {
        return (C21535a) f30942a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m26050i(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C23825g(22));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m26051j(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TargetCardModel.class), new a(new C23825g(23)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C24037b m26052k(TargetCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C24037b(model.getHeader().getTitle(), model.getHeader().getShowToggle(), model.getHeader().isToggleOn(), AbstractC16315n0.m46377b(model.getHeader().getEndIcon()), model.getHeader().getEndIconAction(), m26049h().m60545m(model.getBody()), m26049h().m60545m(model.getFooter()), model.getToggleOnInteraction(), model.getToggleOffInteraction(), model.getOnAppearInteraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m26053l(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24037b.class), new C24036a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C21535a m26054m() {
        return AbstractC21537c.m60555e(null, 1, null);
    }
}
