package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.CompactButtonCardModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import f01.C13843a0;
import j02.AbstractC21170u;
import l83.C23454a0;
import ny0.C27256h;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.l0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/cards/CompactButtonCardModel;", "model", "Lf01/a0;", "g", "(Lcom/whoop/design/models/cards/CompactButtonCardModel;)Lf01/a0;", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "Lny0/h;", "f", "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "compactButtonCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23665l0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93844a = Function1.m68251a(new C23644i0(7));

    /* JADX INFO: renamed from: lb1.l0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93845w;

        public a(Function1 function1) {
            this.f93845w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93845w.invoke((CompactButtonCardModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69010c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CompactButtonCardModel.class), new a(new C23644i0(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C13843a0 m69011d(CompactButtonCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69014g(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69012e() {
        return f93844a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX INFO: renamed from: f */
    private static final C27256h m69013f(CardButtonModel cardButtonModel) {
        EnumC27272p enumC27272p;
        EnumC27254g enumC27254g;
        EnumC27254g enumC27254g2;
        TextResource title = cardButtonModel.getTitle();
        C9598e destination = cardButtonModel.getDestination();
        C9598e c9598e = destination == null ? new C9598e(null, null, null, 7, null) : destination;
        String style = cardButtonModel.getStyle();
        EnumC27272p enumC27272p2 = EnumC27272p.DEFAULT;
        EnumC27272p[] enumC27272pArrValues = EnumC27272p.values();
        int length = enumC27272pArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC27272p = null;
                break;
            }
            enumC27272p = enumC27272pArrValues[i14];
            if (AbstractC22676k.m65745e(enumC27272p.name(), style)) {
                break;
            }
            i14++;
        }
        if (enumC27272p != null) {
            enumC27272p2 = enumC27272p;
        }
        String size = cardButtonModel.getSize();
        if (size != null) {
            enumC27254g = EnumC27254g.COMPACT;
            EnumC27254g[] enumC27254gArrValues = EnumC27254g.values();
            int length2 = enumC27254gArrValues.length;
            while (true) {
                if (i13 >= length2) {
                    enumC27254g2 = null;
                    break;
                }
                enumC27254g2 = enumC27254gArrValues[i13];
                if (AbstractC22676k.m65745e(enumC27254g2.name(), size)) {
                    break;
                }
                i13++;
            }
            if (enumC27254g2 != null) {
                enumC27254g = enumC27254g2;
            }
            if (enumC27254g == null) {
                enumC27254g = EnumC27254g.COMPACT;
            }
        } else {
            enumC27254g = EnumC27254g.COMPACT;
        }
        EnumC27254g enumC27254g3 = enumC27254g;
        String id4 = cardButtonModel.getId();
        Boolean boolIsEnabled = cardButtonModel.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        DismissEventModel dismissEvent = cardButtonModel.getDismissEvent();
        return new C27256h(title, null, null, null, null, null, enumC27272p2, c9598e, null, null, enumC27254g3, null, null, false, false, id4, zBooleanValue, false, null, null, dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null, null, cardButtonModel.getGenericInteraction(), null, null, 28187454, null);
    }

    /* JADX INFO: renamed from: g */
    public static final C13843a0 m69014g(CompactButtonCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C13843a0(model.getId(), model.getTitle(), model.getDescription(), m69013f(model.getButton()));
    }
}
