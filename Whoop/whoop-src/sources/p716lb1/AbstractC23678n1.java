package p716lb1;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ExpandableContentModel;
import com.whoop.design.models.items.TagModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21174w;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import v51.C35704c;

/* JADX INFO: renamed from: lb1.n1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableContentModel;", "Lv51/c;", "i", "(Lcom/whoop/design/models/items/ExpandableContentModel;)Lv51/c;", "Ljb1/a;", "a", "Ll83/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljb1/a;", "expandableContentNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "g", "()Llb1/y0;", "expandableContentMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23678n1 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f93882a = AbstractC30060g.m92088H(new C21174w(20));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f93883b = Function1.m68251a(new C23617e1(11));

    /* JADX INFO: renamed from: lb1.n1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93884w;

        public a(Function1 function1) {
            this.f93884w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93884w.invoke((ExpandableContentModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69131d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExpandableContentModel.class), new a(new C23617e1(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C35704c m69132e(ExpandableContentModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69136i(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C21535a m69133f() {
        return AbstractC21537c.m60555e(null, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public static final C23743y0 m69134g() {
        return f93883b;
    }

    /* JADX INFO: renamed from: h */
    private static final C21535a m69135h() {
        return (C21535a) f93882a.getValue();
    }

    /* JADX INFO: renamed from: i */
    private static final C35704c m69136i(ExpandableContentModel expandableContentModel) {
        String id4 = expandableContentModel.getId();
        String title = expandableContentModel.getTitle();
        EnumC2888c titleTypography = expandableContentModel.getTitleTypography();
        if (titleTypography == null) {
            titleTypography = EnumC2888c.SH4;
        }
        EnumC2888c enumC2888c = titleTypography;
        TagModel tag = expandableContentModel.getTag();
        return new C35704c(id4, title, enumC2888c, null, null, false, tag != null ? AbstractC23699q4.m69314d(tag) : null, expandableContentModel.getInitiallyExpanded(), null, null, expandableContentModel.getItemLayout(), expandableContentModel.getHeaderPosition(), m69135h().m60545m(expandableContentModel.getItems()), 824, null);
    }
}
