package kg2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.startactivity.goals.CollapsibleToggleContainerModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import ji0.C21714b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: kg2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0002\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "childItemReducer", "b", "i", "()Ljb1/a;", "collapsibleToggleContainerDesignItemReducer", "Lm91/p;", "c", "Lm91/p;", "j", "()Lm91/p;", "collapsibleToggleContainerDesignItemViewFactory", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22457c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f87972a = AbstractC21537c.m60555e(null, 1, null);

    /* JADX INFO: renamed from: b */
    private static final C21535a f87973b = AbstractC21537c.m60554d(new C21714b(26));

    /* JADX INFO: renamed from: c */
    private static final C25307p f87974c = Function1.m74306g(new C21714b(27));

    /* JADX INFO: renamed from: kg2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f87975w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f87975w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f87975w.invoke((CollapsibleToggleContainerModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64860e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C21714b(28));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m64861f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CollapsibleToggleContainerModel.class), new a(new C21714b(29)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C22456b m64862g(CollapsibleToggleContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C22456b(model, f87972a.m60540g(model.getItems()), model.getToggleOnInteraction(), model.getToggleOffInteraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m64863h(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22456b.class), new C22455a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final C21535a m64864i() {
        return f87973b;
    }

    /* JADX INFO: renamed from: j */
    public static final C25307p m64865j() {
        return f87974c;
    }
}
