package p716lb1;

import c41.EnumC4142w3;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.FertilityCardBodyModel;
import com.whoop.design.models.cards.FertilityCardModel;
import com.whoop.design.models.cards.FertilityStatusItemModel;
import com.whoop.design.models.items.AnnotatedTextModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.navigation.C9598e;
import g01.C14938a;
import g01.C14941d;
import g01.C14944g;
import gz0.EnumC16313m0;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p736sz0.C33168c;

/* JADX INFO: renamed from: lb1.q1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/cards/FertilityCardModel;", "model", "Lg01/d;", "k", "(Lcom/whoop/design/models/cards/FertilityCardModel;)Lg01/d;", "Lcom/whoop/design/models/cards/FertilityCardBodyModel;", "body", "Lg01/a;", "o", "(Lcom/whoop/design/models/cards/FertilityCardBodyModel;)Lg01/a;", "Lcom/whoop/design/models/cards/FertilityStatusItemModel;", "Lg01/g;", "p", "(Lcom/whoop/design/models/cards/FertilityStatusItemModel;)Lg01/g;", "Llb1/y0;", "a", "Llb1/y0;", "j", "()Llb1/y0;", "fertilityCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23696q1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93918a = Function1.m68251a(new C23617e1(17));

    /* JADX INFO: renamed from: lb1.q1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93919w;

        public a(Function1 function1) {
            this.f93919w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93919w.invoke((FertilityCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.q1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93920w;

        public b(Function1 function1) {
            this.f93920w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93920w.invoke((FertilityStatusItemModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.q1$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93921w;

        public c(Function1 function1) {
            this.f93921w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93921w.invoke((AnnotatedTextModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m69274g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23617e1 c23617e1 = new C23617e1(18);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(FertilityCardModel.class), new a(c23617e1));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(FertilityStatusItemModel.class), new b(new C23617e1(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C14941d m69275h(FertilityCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69278k(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C14944g m69276i(FertilityStatusItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69283p(model);
    }

    /* JADX INFO: renamed from: j */
    public static final C23743y0 m69277j() {
        return f93918a;
    }

    /* JADX INFO: renamed from: k */
    public static final C14941d m69278k(FertilityCardModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23670m(16));
        String cardTitle = model.getCardTitle();
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.EDUCATION;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        C9598e destination = model.getDestination();
        FertilityCardBodyModel body = model.getBody();
        C14938a c14938aM69282o = body != null ? m69282o(body) : null;
        List<InterfaceC25312u> listM60545m = c21535aM60554d.m60545m(model.getItems());
        ImpactModel trend = model.getTrend();
        return new C14941d(cardTitle, enumC16313m1, destination, c14938aM69282o, listM60545m, trend != null ? AbstractC23632g2.m68791d(trend) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m69279l(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C23670m(17));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m69280m(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AnnotatedTextModel.class), new c(new C23670m(18)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C33168c m69281n(AnnotatedTextModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C33168c(model.getText(), false);
    }

    /* JADX INFO: renamed from: o */
    private static final C14938a m69282o(FertilityCardBodyModel fertilityCardBodyModel) {
        String title = fertilityCardBodyModel.getTitle();
        String subtitle = fertilityCardBodyModel.getSubtitle();
        TagModel tag = fertilityCardBodyModel.getTag();
        return new C14938a(title, subtitle, tag != null ? AbstractC23699q4.m69314d(tag) : null);
    }

    /* JADX INFO: renamed from: p */
    public static final C14944g m69283p(FertilityStatusItemModel model) {
        EnumC4142w3 enumC4142w3;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        String startTitle = model.getStartTitle();
        String endTitle = model.getEndTitle();
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_ELLIPSE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            enumC4142w3 = null;
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        String status = model.getStatus();
        EnumC4142w3 enumC4142w4 = EnumC4142w3.CALIBRATING;
        for (EnumC4142w3 enumC4142w5 : EnumC4142w3.values()) {
            if (AbstractC22676k.m65745e(enumC4142w5.name(), status)) {
                enumC4142w3 = enumC4142w5;
                break;
            }
        }
        if (enumC4142w3 != null) {
            enumC4142w4 = enumC4142w3;
        }
        return new C14944g(startTitle, endTitle, enumC16313m1, enumC4142w4);
    }
}
