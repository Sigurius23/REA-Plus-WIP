package bw2;

import bs1.C3595n;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.weightlifting.feature.onerepmax.measuremententry.models.MeasurementEntryItemModel;
import cw2.C11160a;
import cw2.C11164e;
import gz0.AbstractC16315n0;
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

/* JADX INFO: renamed from: bw2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;", "Lcw2/e;", "k", "(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;)Lcw2/e;", "Ljb1/a;", "a", "Ljb1/a;", "e", "()Ljb1/a;", "measurementEntryDesignItemReducer", "Lm91/p;", "b", "Lm91/p;", "f", "()Lm91/p;", "measurementEntryDesignItemViewFactory", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3685a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f15052a = AbstractC21537c.m60554d(new C3595n(15));

    /* JADX INFO: renamed from: b */
    private static final C25307p f15053b = Function1.m74306g(new C3595n(16));

    /* JADX INFO: renamed from: bw2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f15054w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f15054w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f15054w.invoke((MeasurementEntryItemModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C21535a m11460e() {
        return f15052a;
    }

    /* JADX INFO: renamed from: f */
    public static final C25307p m11461f() {
        return f15053b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11462g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C3595n(17));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m11463h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MeasurementEntryItemModel.class), new a(new C3595n(18)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C11164e m11464i(MeasurementEntryItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m11466k(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m11465j(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11164e.class), new C11160a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final C11164e m11466k(MeasurementEntryItemModel measurementEntryItemModel) {
        AbstractC22676k.m65750j(measurementEntryItemModel, "<this>");
        return new C11164e(measurementEntryItemModel.getTitle(), measurementEntryItemModel.getTitleSuffix(), measurementEntryItemModel.getSubtitle(), measurementEntryItemModel.getSubtitleSuffix(), AbstractC16315n0.m46377b(measurementEntryItemModel.getLeadingIcon()), measurementEntryItemModel.getLeadingIconColor(), measurementEntryItemModel.getSubtitleColor(), AbstractC16315n0.m46377b(measurementEntryItemModel.getTrailingIcon()), measurementEntryItemModel.getTrailingIconColor(), measurementEntryItemModel.getGenericInteraction());
    }
}
