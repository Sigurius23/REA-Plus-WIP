package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ArchMiniCommunityFollowerLookupModel;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import w01.C36683h;

/* JADX INFO: renamed from: lb1.j0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "communityFollowerLookupWrapperMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23651j0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93811a = Function1.m68251a(new C23724v(29));

    /* JADX INFO: renamed from: lb1.j0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93812w;

        public a(Function1 function1) {
            this.f93812w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93812w.invoke((ArchMiniCommunityFollowerLookupModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68909c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ArchMiniCommunityFollowerLookupModel.class), new a(new C23644i0(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C36683h m68910d(ArchMiniCommunityFollowerLookupModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C36683h(model.getPath(), model.getScope());
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68911e() {
        return f93811a;
    }
}
