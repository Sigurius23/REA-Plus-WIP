package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import j02.AbstractC21170u;
import jb1.AbstractC21537c;
import jb1.C21535a;
import k11.C22123f;
import k11.EnumC22118a;
import kd1.AbstractC22403o;
import l83.C23454a0;
import ny0.C27256h;
import ny0.EnumC27272p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.i1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/tiles/EmptyTileModel;", "model", "Lk11/f;", "c", "(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "Lny0/h;", "g", "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "emptyTileMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23645i1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93796a = Function1.m68251a(new C23617e1(1));

    /* JADX INFO: renamed from: lb1.i1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93797w;

        public a(Function1 function1) {
            this.f93797w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93797w.invoke((EmptyTileModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C22123f m68864c(EmptyTileModel model) {
        C17750h1 c17750h1;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String id4 = model.getId();
        String title = model.getTitle();
        String body = model.getBody();
        String imageUrl = model.getImageUrl();
        String str = imageUrl.length() > 0 ? imageUrl : null;
        AbstractC22403o.c cVar = str != null ? new AbstractC22403o.c(str, 0, 0, 0, 14, null) : null;
        TagModel tag = model.getTag();
        if (tag != null) {
            InterfaceC25312u interfaceC25312uM60544l = c21535aM60555e.m60544l(tag);
            c17750h1 = interfaceC25312uM60544l instanceof C17750h1 ? (C17750h1) interfaceC25312uM60544l : null;
        } else {
            c17750h1 = null;
        }
        CardButtonModel primaryButton = model.getPrimaryButton();
        C27256h c27256hM68868g = primaryButton != null ? m68868g(primaryButton) : null;
        CardButtonModel secondaryButton = model.getSecondaryButton();
        C27256h c27256hM68868g2 = secondaryButton != null ? m68868g(secondaryButton) : null;
        EnumC22118a buttonConfiguration = model.getButtonConfiguration();
        if (buttonConfiguration == null) {
            buttonConfiguration = EnumC22118a.VERTICAL;
        }
        return new C22123f(id4, title, body, cVar, c17750h1, c27256hM68868g, c27256hM68868g2, null, buttonConfiguration, false, false, model.getViewedAnalyticEvent(), 0.0f, 5760, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68865d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(EmptyTileModel.class), new a(new C23617e1(2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C22123f m68866e(EmptyTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68864c(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m68867f() {
        return f93796a;
    }

    /* JADX INFO: renamed from: g */
    private static final C27256h m68868g(CardButtonModel cardButtonModel) {
        EnumC27272p enumC27272p;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
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
        String icon = cardButtonModel.getIcon();
        if (icon != null) {
            enumC16313m0 = EnumC16313m0.ADD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues.length;
            while (true) {
                if (i13 >= length2) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m1 != null) {
                enumC16313m0 = enumC16313m1;
            }
        } else {
            enumC16313m0 = null;
        }
        Action action = cardButtonModel.getAction();
        String id4 = cardButtonModel.getId();
        Boolean boolIsEnabled = cardButtonModel.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        AnyModal modal = cardButtonModel.getModal();
        DismissEventModel dismissEvent = cardButtonModel.getDismissEvent();
        return new C27256h(title, enumC16313m0, null, null, null, null, enumC27272p2, c9598e, action, cardButtonModel.getAnalyticEvent(), null, null, null, false, true, id4, zBooleanValue, false, null, modal, dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null, null, null, null, null, 31857724, null);
    }
}
