package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SplitColumnModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l81.C23450e;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.o4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "splitColumnMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23687o4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93901a = Function1.m68251a(new C23675m4(1));

    /* JADX INFO: renamed from: lb1.o4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93902w;

        public a(Function1 function1) {
            this.f93902w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93902w.invoke((SplitColumnModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m69201d() {
        return f93901a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69202e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SplitColumnModel.class), new a(new C23675m4(2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23450e m69203f(SplitColumnModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(12));
        return new C23450e(c21535aM60554d.m60545m(model.getTopContent()), c21535aM60554d.m60545m(model.getBottomContent()), model.getTopChildPadding(), model.getBottomChildPadding());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m69204g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }
}
