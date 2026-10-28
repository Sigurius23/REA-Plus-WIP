package rg2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.startactivity.presession.domain.model.PreSessionRecentActivitiesRowModel;
import com.whoop.startactivity.presession.domain.model.PreSessionRecentActivityIconModel;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import r61.C30985h;
import sg2.C32459j;
import sg2.C32462m;
import tg2.AbstractC33797k;

/* JADX INFO: renamed from: rg2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007\"\u001a\u0010\u000f\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0018\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, m65681d2 = {"", "Lrg2/h;", "Lm91/u;", "s", "(Ljava/util/List;)Ljava/util/List;", "Ljb1/a;", "a", "Ljb1/a;", "getPreSessionRecentActivityIconDesignItemReducer", "()Ljb1/a;", "preSessionRecentActivityIconDesignItemReducer", "b", "recentActivityIconChildReducer", "c", "getPreSessionRecentActivitiesRowDesignItemReducer", "preSessionRecentActivitiesRowDesignItemReducer", "Lm91/p;", "d", "Lm91/p;", "getPreSessionRecentActivityIconDesignItemViewFactory", "()Lm91/p;", "preSessionRecentActivityIconDesignItemViewFactory", "e", "getPreSessionRecentActivitiesRowDesignItemViewFactory", "preSessionRecentActivitiesRowDesignItemViewFactory", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31393e {

    /* JADX INFO: renamed from: a */
    private static final C21535a f129218a = AbstractC21537c.m60554d(new C30985h(16));

    /* JADX INFO: renamed from: b */
    private static final C21535a f129219b = AbstractC21537c.m60554d(new C30985h(17));

    /* JADX INFO: renamed from: c */
    private static final C21535a f129220c = AbstractC21537c.m60554d(new C30985h(18));

    /* JADX INFO: renamed from: d */
    private static final C25307p f129221d = Function1.m74306g(new C30985h(19));

    /* JADX INFO: renamed from: e */
    private static final C25307p f129222e = Function1.m74306g(new C30985h(20));

    /* JADX INFO: renamed from: rg2.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f129223w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f129223w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f129223w.invoke((PreSessionRecentActivitiesRowModel) it);
        }
    }

    /* JADX INFO: renamed from: rg2.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f129224w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f129224w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f129224w.invoke((PreSessionRecentActivityIconModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m96679j(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C30985h(22));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m96680k(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PreSessionRecentActivitiesRowModel.class), new a(new C30985h(24)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C31395g m96681l(PreSessionRecentActivitiesRowModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C31395g(f129219b.m60540g(model.getItems()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m96682m(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31395g.class), new C32459j());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m96683n(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C30985h(21));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m96684o(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PreSessionRecentActivityIconModel.class), new b(new C30985h(23)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C31397i m96685p(PreSessionRecentActivityIconModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C31397i(model.getInternalName(), model.getIconUrl(), model.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m96686q(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31397i.class), new C32462m());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m96687r(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(f129218a.getModelMapper());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final List<InterfaceC25312u> m96688s(List<C31396h> list) {
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList<C31396h> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC33797k.m106947a(((C31396h) obj).getInternalName())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (C31396h c31396h : arrayList) {
            arrayList2.add(new C31397i(c31396h.getInternalName(), c31396h.getIconUrl(), c31396h.getIsSelected()));
        }
        return arrayList2;
    }
}
