package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SectionModel;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k81.C22295e;
import k81.EnumC22291a;
import l83.C23454a0;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.e4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/SectionModel;", "Lk81/e;", "g", "(Lcom/whoop/design/models/items/SectionModel;)Lk81/e;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "sectionMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23620e4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93740a = Function1.m68251a(new C23740x3(15));

    /* JADX INFO: renamed from: lb1.e4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93741w;

        public a(Function1 function1) {
            this.f93741w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93741w.invoke((SectionModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.e4$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C27256h.m82144b((C27256h) it, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68711d() {
        return f93740a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68712e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SectionModel.class), new a(new C23740x3(16)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C22295e m68713f(SectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68714g(model);
    }

    /* JADX INFO: renamed from: g */
    public static final C22295e m68714g(SectionModel sectionModel) {
        AbstractC22676k.m65750j(sectionModel, "<this>");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(10));
        String id4 = sectionModel.getId();
        String title = sectionModel.getTitle();
        String subtitle = sectionModel.getSubtitle();
        List listM60536k = C21535a.m60536k(c21535aM60554d, sectionModel.getItems(), null, 2, null);
        EnumC22291a enumC22291a = null;
        float sectionTopPadding = sectionModel.getSectionTopPadding();
        float sectionBottomPadding = sectionModel.getSectionBottomPadding();
        float interItemPadding = sectionModel.getInterItemPadding();
        String alignment = sectionModel.getAlignment();
        if (alignment == null) {
            alignment = "";
        }
        EnumC22291a enumC22291a2 = EnumC22291a.LEADING;
        for (EnumC22291a enumC22291a3 : EnumC22291a.values()) {
            if (AbstractC22676k.m65745e(enumC22291a3.name(), alignment)) {
                enumC22291a = enumC22291a3;
                break;
            }
        }
        if (enumC22291a != null) {
            enumC22291a2 = enumC22291a;
        }
        return new C22295e(id4, title, subtitle, listM60536k, sectionTopPadding, sectionBottomPadding, interItemPadding, enumC22291a2, sectionModel.isVisible());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m68715h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27256h.class), new b());
        return C23454a0.f92919a;
    }
}
