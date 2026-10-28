package p716lb1;

import b01.C2182c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BiomarkerModel;
import gz0.AbstractC16315n0;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.t */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "biomarkerItemMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23712t {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93968a = Function1.m68251a(new C23587a(24));

    /* JADX INFO: renamed from: lb1.t$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93969w;

        public a(Function1 function1) {
            this.f93969w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93969w.invoke((BiomarkerModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69418c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(BiomarkerModel.class), new a(new C23587a(25)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C2182c m69419d(BiomarkerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C2182c(model.getId(), model.getName(), AbstractC16315n0.m46377b(model.getTrailingIcon()), model.getModal());
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69420e() {
        return f93968a;
    }
}
