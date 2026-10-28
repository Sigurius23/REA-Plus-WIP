package oc1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ratingpicker.RatingPickerModel;
import e93.AbstractC12889b;
import g31.C15300d;
import l83.C23454a0;
import o72.C27644e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: oc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "ratingPickerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27817a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f112067a = Function1.m68251a(new C27644e(7));

    /* JADX INFO: renamed from: oc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f112068w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f112068w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f112068w.invoke((RatingPickerModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m83896c() {
        return f112067a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m83897d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(RatingPickerModel.class), new a(new C27644e(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C15300d m83898e(RatingPickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C15300d(model.getMaximum(), AbstractC12889b.m36284n(model.getNumSelected(), 0, model.getMaximum()), model.getStateUpdateValueKey());
    }
}
