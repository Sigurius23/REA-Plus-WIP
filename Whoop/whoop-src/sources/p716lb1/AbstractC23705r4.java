package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SelectorModel;
import com.whoop.design.models.items.TagSelectorModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import n81.C26448a;
import n81.C26451d;
import n81.C26453f;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: lb1.r4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/models/items/TagSelectorModel;", "model", "Ljb1/a;", "reducer", "Ln81/d;", "style", "Ltr2/n;", "logger", "Ln81/f;", "f", "(Lcom/whoop/design/models/items/TagSelectorModel;Ljb1/a;Ln81/d;Ltr2/n;)Ln81/f;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "tagSelectorMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23705r4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93951a = Function1.m68251a(new C23675m4(7));

    /* JADX INFO: renamed from: lb1.r4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93952w;

        public a(Function1 function1) {
            this.f93952w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93952w.invoke((TagSelectorModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69360c() {
        return f93951a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69361d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TagSelectorModel.class), new a(new C23675m4(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C26453f m69362e(TagSelectorModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69364g(model, AbstractC21537c.m60555e(null, 1, null), null, null, 12, null);
    }

    /* JADX INFO: renamed from: f */
    public static final C26453f m69363f(TagSelectorModel model, C21535a reducer, C26451d style, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(logger, "logger");
        List<SelectorModel> tags = model.getTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tags, 10));
        for (SelectorModel selectorModel : tags) {
            arrayList.add(new C26448a(selectorModel.getNameDisplay(), selectorModel.getId(), selectorModel.getAnalyticEvent()));
        }
        Float horizontalPadding = model.getHorizontalPadding();
        String defaultTag = model.getDefaultTag();
        String selectedTag = model.getSelectedTag();
        Map<String, DesignSystemModel> tagMaps = model.getTagMaps();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, DesignSystemModel> entry : tagMaps.entrySet()) {
            String key = entry.getKey();
            DesignSystemModel value = entry.getValue();
            C23465k c23465k = null;
            if (value instanceof TagSelectorModel) {
                logger.mo85222m(AbstractC11895b.m31996o("Nested TagSelectorModel in tagMaps is not supported; skipping '", key, "' to prevent infinite recursion."), new AbstractC30556a.a[0]);
            } else {
                InterfaceC25312u interfaceC25312uM60544l = reducer.m60544l(value);
                if (interfaceC25312uM60544l != null) {
                    c23465k = new C23465k(key, interfaceC25312uM60544l);
                }
            }
            if (c23465k != null) {
                arrayList2.add(c23465k);
            }
        }
        return new C26453f(arrayList, selectedTag, horizontalPadding, defaultTag, style, AbstractC25247g0.m74000i0(arrayList2));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C26453f m69364g(TagSelectorModel tagSelectorModel, C21535a c21535a, C26451d c26451d, InterfaceC34116n interfaceC34116n, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            c26451d = new C26451d(null, null, null, 7, null);
        }
        if ((i13 & 8) != 0) {
            interfaceC34116n = InterfaceC34116n.INSTANCE.m107848a("TagSelectorMapper");
        }
        return m69363f(tagSelectorModel, c21535a, c26451d, interfaceC34116n);
    }
}
