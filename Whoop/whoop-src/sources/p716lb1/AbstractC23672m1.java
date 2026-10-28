package p716lb1;

import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ExerciseRecordHeaderModel;
import com.whoop.design.models.items.ExpandableCardModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21174w;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p11.C28705f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: lb1.m1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableCardModel;", "Lp11/f;", "i", "(Lcom/whoop/design/models/items/ExpandableCardModel;)Lp11/f;", "Lcom/whoop/design/models/DesignSystemModel;", "model", "j", "(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;", "Ljb1/a;", "a", "Ll83/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljb1/a;", "expandableCardNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "g", "()Llb1/y0;", "expandableCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23672m1 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f93862a = AbstractC30060g.m92088H(new C21174w(19));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f93863b = Function1.m68251a(new C23617e1(9));

    /* JADX INFO: renamed from: lb1.m1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93864w;

        public a(Function1 function1) {
            this.f93864w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93864w.invoke((ExpandableCardModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69072d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExpandableCardModel.class), new a(new C23617e1(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C28705f m69073e(ExpandableCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69077i(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C21535a m69074f() {
        return AbstractC21537c.m60555e(null, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public static final C23743y0 m69075g() {
        return f93863b;
    }

    /* JADX INFO: renamed from: h */
    private static final C21535a m69076h() {
        return (C21535a) f93862a.getValue();
    }

    /* JADX INFO: renamed from: i */
    private static final C28705f m69077i(ExpandableCardModel expandableCardModel) {
        InterfaceC25312u interfaceC25312uM60544l;
        DesignSystemModel designSystemModelM69078j = m69078j(expandableCardModel.getHeaderContent());
        if (designSystemModelM69078j instanceof ExerciseRecordHeaderModel) {
            interfaceC25312uM60544l = AbstractC23666l1.m69021f((ExerciseRecordHeaderModel) designSystemModelM69078j);
        } else {
            interfaceC25312uM60544l = m69076h().m60544l(designSystemModelM69078j);
            if (interfaceC25312uM60544l == null) {
                interfaceC25312uM60544l = new C25292c0(0.0f, 0.0f, 3, null);
            }
        }
        return new C28705f(expandableCardModel.getIconCollapsed(), expandableCardModel.getIconExpanded(), interfaceC25312uM60544l, m69076h().m60545m(expandableCardModel.getExpandedContent()));
    }

    /* JADX INFO: renamed from: j */
    private static final DesignSystemModel m69078j(DesignSystemModel designSystemModel) {
        return designSystemModel instanceof DesignModelWrapper ? ((DesignModelWrapper) designSystemModel).getModel() : designSystemModel;
    }
}
