package tg2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.startactivity.selectactivity.SelectActivityPickerModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import qc1.C30217a;

/* JADX INFO: renamed from: tg2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "e", "()Ljb1/a;", "selectActivityPickerDesignItemReducer", "Lm91/p;", "b", "Lm91/p;", "f", "()Lm91/p;", "selectActivityPickerDesignItemViewFactory", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33792f {

    /* JADX INFO: renamed from: a */
    private static final C21535a f141482a = AbstractC21537c.m60554d(new C30217a(25));

    /* JADX INFO: renamed from: b */
    private static final C25307p f141483b = Function1.m74306g(new C30217a(26));

    /* JADX INFO: renamed from: tg2.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f141484w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f141484w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f141484w.invoke((SelectActivityPickerModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C21535a m106888e() {
        return f141482a;
    }

    /* JADX INFO: renamed from: f */
    public static final C25307p m106889f() {
        return f141483b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m106890g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C30217a(27));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m106891h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SelectActivityPickerModel.class), new a(new C30217a(28)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C33799m m106892i(SelectActivityPickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C33799m(model.getId(), model.getSelectedInternalName(), model.isGpsTrackingEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m106893j(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33799m.class), new C33791e());
        return C23454a0.f92919a;
    }
}
