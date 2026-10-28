package jg2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.startactivity.dropdown.DropdownModel;
import com.whoop.startactivity.dropdown.DropdownOption;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: jg2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "i", "()Ljb1/a;", "dropdownDesignItemReducer", "Lm91/p;", "b", "Lm91/p;", "j", "()Lm91/p;", "dropdownDesignItemViewFactory", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21672d {

    /* JADX INFO: renamed from: a */
    private static final C21535a f83199a = AbstractC21537c.m60554d(new C18689p0(26));

    /* JADX INFO: renamed from: b */
    private static final C25307p f83200b = Function1.m74306g(new C18689p0(27));

    /* JADX INFO: renamed from: jg2.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f83201w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f83201w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f83201w.invoke((DropdownModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m60957e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C18689p0(28));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m60958f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DropdownModel.class), new a(new C18689p0(29)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C21670b m60959g(DropdownModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String label = model.getLabel();
        String placeholder = model.getPlaceholder();
        String selectedOptionId = model.getSelectedOptionId();
        List<DropdownOption> options = model.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        for (DropdownOption dropdownOption : options) {
            String id5 = dropdownOption.getId();
            String label2 = dropdownOption.getLabel();
            String icon = dropdownOption.getIcon();
            EnumC16313m0 enumC16313m0M46379d = null;
            if (icon != null) {
                enumC16313m0M46379d = AbstractC16315n0.m46379d(icon, null, 1, null);
            }
            arrayList.add(new C21670b.a(id5, label2, enumC16313m0M46379d, dropdownOption.getInteraction()));
        }
        return new C21670b(id4, label, placeholder, selectedOptionId, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m60960h(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21670b.class), new C21669a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final C21535a m60961i() {
        return f83199a;
    }

    /* JADX INFO: renamed from: j */
    public static final C25307p m60962j() {
        return f83200b;
    }
}
