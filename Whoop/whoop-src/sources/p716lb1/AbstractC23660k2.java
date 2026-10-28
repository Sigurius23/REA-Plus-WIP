package p716lb1;

import b91.EnumC2888c;
import c41.C4092p2;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.ExpandableContentModel;
import com.whoop.design.models.items.InsightsItemListModel;
import com.whoop.design.models.items.InsightsItemModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.whoopaction.domain.models.Action;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import j02.AbstractC21170u;
import j02.C21166s;
import j21.C21249h;
import j21.C21250i;
import j21.EnumC21244c;
import j21.EnumC21251j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import ny0.C27256h;
import ny0.EnumC27272p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import v51.C35704c;

/* JADX INFO: renamed from: lb1.k2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/items/InsightsItemModel;", "model", "Lj21/i;", "f", "(Lcom/whoop/design/models/items/InsightsItemModel;)Lj21/i;", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "Lny0/h;", "j", "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;", "Lcom/whoop/design/models/items/InsightsItemListModel;", "Lj21/h;", "e", "(Lcom/whoop/design/models/items/InsightsItemListModel;)Lj21/h;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "insightsItemMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23660k2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93835a = Function1.m68251a(new C23714t1(18));

    /* JADX INFO: renamed from: lb1.k2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93836w;

        public a(Function1 function1) {
            this.f93836w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93836w.invoke((InsightsItemModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.k2$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93837w;

        public b(Function1 function1) {
            this.f93837w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93837w.invoke((InsightsItemListModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68976d() {
        return f93835a;
    }

    /* JADX INFO: renamed from: e */
    public static final C21249h m68977e(InsightsItemListModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<InsightsItemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(m68978f((InsightsItemModel) it.next()));
        }
        return new C21249h(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX INFO: renamed from: f */
    public static final C21250i m68978f(InsightsItemModel model) {
        EnumC39333f enumC39333f;
        EnumC2888c enumC2888c;
        C4092p2 c4092p2;
        EnumC21251j enumC21251j;
        C35704c c35704c;
        C35704c c35704c2;
        EnumC21244c enumC21244c;
        EnumC2888c enumC2888c2;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String id4 = model.getId();
        InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h(model.getTrend());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TrendViewState");
        C17731c2 c17731c2 = (C17731c2) interfaceC25312uM60541h;
        String title = model.getTitle();
        String titleColor = model.getTitleColor();
        if (titleColor == null) {
            enumC39333f = null;
            break;
        }
        EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
        int length = enumC39333fArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC39333f = null;
                break;
            }
            enumC39333f = enumC39333fArrValues[i13];
            if (AbstractC22676k.m65745e(enumC39333f.name(), titleColor)) {
                break;
            }
            i13++;
        }
        String titleStyle = model.getTitleStyle();
        if (titleStyle != null) {
            EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
            int length2 = enumC2888cArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC2888c2 = null;
                    break;
                }
                enumC2888c2 = enumC2888cArrValues[i14];
                if (AbstractC22676k.m65745e(enumC2888c2.name(), titleStyle)) {
                    break;
                }
                i14++;
            }
            enumC2888c = enumC2888c2;
        } else {
            enumC2888c = null;
        }
        String description = model.getDescription();
        String actionRecommendation = model.getActionRecommendation();
        InfoCalloutTileModel callout = model.getCallout();
        if (callout != null) {
            InterfaceC25312u interfaceC25312uM60541h2 = c21535aM60555e.m60541h(callout);
            AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.InfoCalloutState");
            c4092p2 = (C4092p2) interfaceC25312uM60541h2;
        } else {
            c4092p2 = null;
        }
        CardButtonModel actionButton = model.getActionButton();
        C27256h c27256hM68982j = actionButton != null ? m68982j(actionButton) : null;
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getRightIcon());
        C9598e destination = model.getDestination();
        String textAlignment = model.getTextAlignment();
        if (textAlignment != null) {
            EnumC21251j[] enumC21251jArrValues = EnumC21251j.values();
            int length3 = enumC21251jArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC21251j = null;
                    break;
                }
                enumC21251j = enumC21251jArrValues[i15];
                int i16 = i15;
                if (AbstractC22676k.m65745e(enumC21251j.name(), textAlignment)) {
                    break;
                }
                i15 = i16 + 1;
            }
            if (enumC21251j == null) {
                enumC21251j = EnumC21251j.CENTER;
            }
        } else {
            enumC21251j = EnumC21251j.CENTER;
        }
        EnumC21251j enumC21251j2 = enumC21251j;
        ExpandableContentModel expandableContent = model.getExpandableContent();
        if (expandableContent != null) {
            InterfaceC25312u interfaceC25312uM60544l = c21535aM60555e.m60544l(expandableContent);
            if (interfaceC25312uM60544l instanceof C35704c) {
                c35704c = (C35704c) interfaceC25312uM60544l;
            } else {
                c35704c = null;
            }
        } else {
            c35704c = null;
        }
        String iconStyle = model.getIconStyle();
        if (iconStyle != null) {
            EnumC21244c[] enumC21244cArrValues = EnumC21244c.values();
            int length4 = enumC21244cArrValues.length;
            c35704c2 = c35704c;
            int i17 = 0;
            while (true) {
                if (i17 >= length4) {
                    enumC21244c = null;
                    break;
                }
                EnumC21244c enumC21244c2 = enumC21244cArrValues[i17];
                int i18 = i17;
                if (AbstractC22676k.m65745e(enumC21244c2.name(), iconStyle)) {
                    enumC21244c = enumC21244c2;
                    break;
                }
                i17 = i18 + 1;
            }
            if (enumC21244c == null) {
            }
            return new C21250i(id4, c17731c2, title, enumC39333f, enumC2888c, description, actionRecommendation, c4092p2, c27256hM68982j, enumC16313m0M46377b, destination, enumC21251j2, c35704c2, enumC21244c);
        }
        c35704c2 = c35704c;
        enumC21244c = EnumC21244c.MEDIUM;
        return new C21250i(id4, c17731c2, title, enumC39333f, enumC2888c, description, actionRecommendation, c4092p2, c27256hM68982j, enumC16313m0M46377b, destination, enumC21251j2, c35704c2, enumC21244c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m68979g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23714t1 c23714t1 = new C23714t1(19);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(InsightsItemModel.class), new a(c23714t1));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(InsightsItemListModel.class), new b(new C23714t1(20)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C21250i m68980h(InsightsItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68978f(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C21249h m68981i(InsightsItemListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68977e(model);
    }

    /* JADX INFO: renamed from: j */
    private static final C27256h m68982j(CardButtonModel cardButtonModel) {
        EnumC27272p enumC27272p;
        TextResource title = cardButtonModel.getTitle();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(cardButtonModel.getIcon());
        String cardName = cardButtonModel.getCardName();
        String featureType = cardButtonModel.getFeatureType();
        String style = cardButtonModel.getStyle();
        EnumC27272p enumC27272p2 = EnumC27272p.DEFAULT;
        EnumC27272p[] enumC27272pArrValues = EnumC27272p.values();
        int length = enumC27272pArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC27272p = null;
                break;
            }
            enumC27272p = enumC27272pArrValues[i13];
            if (AbstractC22676k.m65745e(enumC27272p.name(), style)) {
                break;
            }
            i13++;
        }
        EnumC27272p enumC27272p3 = enumC27272p == null ? enumC27272p2 : enumC27272p;
        C9598e c9598e = new C9598e(null, null, null, 7, null);
        C21166s c21166sM59413a = null;
        Action action = cardButtonModel.getAction();
        String id4 = cardButtonModel.getId();
        Boolean boolIsEnabled = cardButtonModel.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        AnyModal modal = cardButtonModel.getModal();
        DismissEventModel dismissEvent = cardButtonModel.getDismissEvent();
        if (dismissEvent != null) {
            c21166sM59413a = AbstractC21170u.m59413a(dismissEvent);
        }
        return new C27256h(title, enumC16313m0M46377b, null, null, cardName, featureType, enumC27272p3, c9598e, action, null, null, null, null, false, false, id4, zBooleanValue, false, null, modal, c21166sM59413a, null, cardButtonModel.getGenericInteraction(), null, null, 27688460, null);
    }
}
