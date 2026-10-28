package p716lb1;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.ButtonCardModel;
import com.whoop.design.models.cards.ButtonCardPriceModel;
import com.whoop.design.models.cards.ButtonCardStyleDtoEnum;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.ToggleCardButtonModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.whoopaction.domain.models.Action;
import f01.C13884o;
import f01.C13890q;
import f01.EnumC13887p;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import hy0.EnumC17729c0;
import hy0.EnumC17775o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21170u;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25265s;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27240b;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import p41.C28833d;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.w */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/design/models/cards/ButtonCardModel;", "Lf01/q;", "i", "(Lcom/whoop/design/models/cards/ButtonCardModel;)Lf01/q;", "Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;", "Lf01/p;", "k", "(Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;)Lf01/p;", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "Lny0/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;", "Lcom/whoop/design/models/items/ToggleCardButtonModel;", "Lp41/d;", "j", "(Lcom/whoop/design/models/items/ToggleCardButtonModel;)Lp41/d;", "Llb1/y0;", "a", "Llb1/y0;", "g", "()Llb1/y0;", "buttonCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23730w {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94033a = Function1.m68251a(new C23587a(28));

    /* JADX INFO: renamed from: lb1.w$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94034a;

        static {
            int[] iArr = new int[ButtonCardStyleDtoEnum.values().length];
            try {
                iArr[ButtonCardStyleDtoEnum.HIGHLIGHTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonCardStyleDtoEnum.TRANSPARENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonCardStyleDtoEnum.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonCardStyleDtoEnum.RAF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f94034a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.w$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94035w;

        public b(Function1 function1) {
            this.f94035w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94035w.invoke((ButtonCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.w$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94036w;

        public c(Function1 function1) {
            this.f94036w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94036w.invoke((ToggleCardButtonModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69598d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23587a c23587a = new C23587a(29);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ButtonCardModel.class), new b(c23587a));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ToggleCardButtonModel.class), new c(new C23724v(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C13890q m69599e(ButtonCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69603i(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C28833d m69600f(ToggleCardButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69604j(model);
    }

    /* JADX INFO: renamed from: g */
    public static final C23743y0 m69601g() {
        return f94033a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX INFO: renamed from: h */
    private static final C27256h m69602h(CardButtonModel cardButtonModel) {
        EnumC27272p enumC27272p;
        EnumC27254g enumC27254g;
        EnumC2888c enumC2888c;
        C39174f c39174f;
        EnumC27240b enumC27240b;
        EnumC2888c enumC2888c2;
        EnumC27254g enumC27254g2;
        TextResource title = cardButtonModel.getTitle();
        C9598e destination = cardButtonModel.getDestination();
        C9598e c9598e = destination == null ? new C9598e(null, null, null, 7, null) : destination;
        String style = cardButtonModel.getStyle();
        EnumC27272p enumC27272p2 = EnumC27272p.HIGHLIGHT;
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
        Action action = cardButtonModel.getAction();
        String size = cardButtonModel.getSize();
        if (size != null) {
            enumC27254g = EnumC27254g.COMPACT;
            EnumC27254g[] enumC27254gArrValues = EnumC27254g.values();
            int length2 = enumC27254gArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC27254g2 = null;
                    break;
                }
                enumC27254g2 = enumC27254gArrValues[i15];
                if (AbstractC22676k.m65745e(enumC27254g2.name(), size)) {
                    break;
                }
                i15++;
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
        String textStyle = cardButtonModel.getTextStyle();
        if (textStyle != null) {
            EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
            int length3 = enumC2888cArrValues.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length3) {
                    enumC2888c2 = null;
                    break;
                }
                enumC2888c2 = enumC2888cArrValues[i16];
                if (AbstractC22676k.m65745e(enumC2888c2.name(), textStyle)) {
                    break;
                }
                i16++;
            }
            enumC2888c = enumC2888c2;
        } else {
            enumC2888c = null;
        }
        String cornerRadius = cardButtonModel.getCornerRadius();
        if (cornerRadius != null) {
            EnumC27240b enumC27240b2 = EnumC27240b.MEDIUM;
            EnumC27240b[] enumC27240bArrValues = EnumC27240b.values();
            int length4 = enumC27240bArrValues.length;
            while (true) {
                if (i13 >= length4) {
                    enumC27240b = null;
                    break;
                }
                enumC27240b = enumC27240bArrValues[i13];
                if (AbstractC22676k.m65745e(enumC27240b.name(), cornerRadius)) {
                    break;
                }
                i13++;
            }
            if (enumC27240b != null) {
                enumC27240b2 = enumC27240b;
            }
            c39174f = new C39174f(AbstractC27249e.m82129l(enumC27240b2));
        } else {
            c39174f = null;
        }
        String id4 = cardButtonModel.getId();
        Boolean boolIsEnabled = cardButtonModel.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        AnyModal modal = cardButtonModel.getModal();
        DismissEventModel dismissEvent = cardButtonModel.getDismissEvent();
        return new C27256h(title, null, null, null, null, null, enumC27272p2, c9598e, action, null, enumC27254g3, enumC2888c, c39174f, false, true, id4, zBooleanValue, false, null, modal, dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null, null, cardButtonModel.getGenericInteraction(), null, null, 27656766, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:121:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[EDGE_INSN: B:122:0x0141->B:78:0x0141 BREAK  A[LOOP:1: B:72:0x012d->B:76:0x013c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x01ad A[EDGE_INSN: B:124:0x01ad->B:98:0x01ad BREAK  A[LOOP:2: B:92:0x0197->B:96:0x01a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[PHI: r3
      0x0071: PHI (r3v24 com.whoop.navigation.e) = (r3v4 com.whoop.navigation.e), (r3v26 com.whoop.navigation.e) binds: [B:31:0x008d, B:25:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x010d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x011b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x013c A[LOOP:1: B:72:0x012d->B:76:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:84:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0183  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188  */
    /* JADX WARN: Code duplicated, block: B:91:0x018f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0199  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6 A[LOOP:2: B:92:0x0197->B:96:0x01a6, LOOP_END] */
    /* JADX INFO: renamed from: i */
    public static final C13890q m69603i(ButtonCardModel buttonCardModel) {
        C27256h c27256h;
        C9598e destination;
        C9598e c9598e;
        EnumC17729c0 enumC17729c0;
        EnumC17729c0 enumC17729c1;
        EnumC17729c0 enumC17729c2;
        TagModel tag;
        C17750h1 c17750h1;
        String dismissIcon;
        EnumC16313m0 enumC16313m0;
        List<DesignSystemModel> expandedItems;
        List listM74093D1;
        Boolean boolIsExpanded;
        boolean zBooleanValue;
        ButtonCardPriceModel price;
        C13884o c13884o;
        EnumC16313m0[] enumC16313m0ArrValues;
        int length;
        int i13;
        EnumC16313m0 enumC16313m1;
        InterfaceC25312u interfaceC25312uM60541h;
        C17750h1 c17750h1M50901b;
        EnumC17775o1 tagStyle;
        String textColor;
        EnumC39333f enumC39333f;
        EnumC39333f[] enumC39333fArrValues;
        int length2;
        int i14;
        EnumC39333f enumC39333f2;
        AbstractC22676k.m65750j(buttonCardModel, "<this>");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        CardButtonModel button = buttonCardModel.getButton();
        C27256h c27256hM69602h = button != null ? m69602h(button) : null;
        List<DesignSystemModel> items = buttonCardModel.getItems();
        List<InterfaceC25312u> listM60540g = items != null ? c21535aM60555e.m60540g(items) : null;
        if (listM60540g != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM60540g) {
                if (obj instanceof C27256h) {
                    arrayList.add(obj);
                }
            }
            c27256h = (C27256h) AbstractC25265s.m74146r1(arrayList);
        } else {
            c27256h = null;
        }
        if (buttonCardModel.getButton() == null || c27256h != null) {
            if (c27256hM69602h == null && c27256h != null) {
                destination = c27256h.getDestination();
                c9598e = AbstractC22676k.m65745e(destination, new C9598e(null, null, null, 7, null)) ? null : destination;
            }
        } else {
            destination = buttonCardModel.getButton().getDestination();
            if (destination == null || destination.equals(new C9598e(null, null, null, 7, null))) {
            }
        }
        String id4 = buttonCardModel.getId();
        String title = buttonCardModel.getTitle();
        String body = buttonCardModel.getBody();
        String imageUrl = buttonCardModel.getImageUrl();
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        if (buttonCardModel.getImageUrl() == null || buttonCardModel.getImageUrlAlignment() != null) {
            if (buttonCardModel.getImageUrlAlignment() != null) {
                String imageUrlAlignment = buttonCardModel.getImageUrlAlignment();
                EnumC17729c0 enumC17729c3 = EnumC17729c0.TRAILING;
                EnumC17729c0[] enumC17729c0ArrValues = EnumC17729c0.values();
                int length3 = enumC17729c0ArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length3) {
                        enumC17729c1 = null;
                        break;
                    }
                    enumC17729c1 = enumC17729c0ArrValues[i15];
                    if (AbstractC22676k.m65745e(enumC17729c1.name(), imageUrlAlignment)) {
                        break;
                    }
                    i15++;
                }
                enumC17729c2 = enumC17729c1 == null ? enumC17729c3 : enumC17729c1;
            } else {
                enumC17729c0 = null;
            }
            Integer imageSize = buttonCardModel.getImageSize();
            tag = buttonCardModel.getTag();
            if (tag != null) {
                interfaceC25312uM60541h = c21535aM60555e.m60541h(tag);
                if (interfaceC25312uM60541h instanceof C17750h1) {
                    c17750h1M50901b = (C17750h1) interfaceC25312uM60541h;
                } else {
                    c17750h1M50901b = null;
                }
                if (c17750h1M50901b != null) {
                    tagStyle = c17750h1M50901b.getTagStyle();
                } else {
                    tagStyle = null;
                }
                if (tagStyle != EnumC17775o1.COACH_RECOMMENDED) {
                    if (c17750h1M50901b != null) {
                        textColor = buttonCardModel.getTag().getTextColor();
                        if (textColor != null) {
                            enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
                            enumC39333fArrValues = EnumC39333f.values();
                            length2 = enumC39333fArrValues.length;
                            i14 = 0;
                            while (true) {
                                if (i14 < length2) {
                                    enumC39333f2 = null;
                                    break;
                                }
                                enumC39333f2 = enumC39333fArrValues[i14];
                                if (AbstractC22676k.m65745e(enumC39333f2.name(), textColor)) {
                                    break;
                                }
                                i14++;
                            }
                            if (enumC39333f2 != null) {
                                enumC39333f = enumC39333f2;
                            }
                            if (enumC39333f == null) {
                                enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
                            }
                        } else {
                            enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
                        }
                        c17750h1M50901b = C17750h1.m50901b(c17750h1M50901b, null, null, EnumC39333f.ACCENT_POSITIVE_TREND_15, null, enumC39333f, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194283, null);
                    } else {
                        c17750h1M50901b = null;
                    }
                }
                c17750h1 = c17750h1M50901b;
            } else {
                c17750h1 = null;
            }
            dismissIcon = buttonCardModel.getDismissIcon();
            if (dismissIcon != null) {
                enumC16313m0 = EnumC16313m0.CROSS;
                enumC16313m0ArrValues = EnumC16313m0.values();
                length = enumC16313m0ArrValues.length;
                i13 = 0;
                while (true) {
                    if (i13 < length) {
                        enumC16313m1 = null;
                        break;
                    }
                    enumC16313m1 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m1.name(), dismissIcon)) {
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
            expandedItems = buttonCardModel.getExpandedItems();
            if (expandedItems != null) {
                listM74093D1 = AbstractC25265s.m74093D1(c21535aM60555e.m60540g(expandedItems));
            } else {
                listM74093D1 = null;
            }
            boolIsExpanded = buttonCardModel.isExpanded();
            if (boolIsExpanded != null) {
                zBooleanValue = boolIsExpanded.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Action dismissAction = buttonCardModel.getDismissAction();
            EnumC13887p enumC13887pM69605k = m69605k(buttonCardModel.getStyle());
            price = buttonCardModel.getPrice();
            if (price != null) {
                c13884o = new C13884o(price.getAmount(), price.getSubtitle());
            } else {
                c13884o = null;
            }
            return new C13890q(id4, title, body, cVar, enumC17729c0, imageSize, c27256hM69602h, c17750h1, listM60540g, listM74093D1, zBooleanValue, enumC16313m0, dismissAction, c9598e, enumC13887pM69605k, c13884o, buttonCardModel.getTitleColor());
        }
        enumC17729c2 = EnumC17729c0.TRAILING;
        enumC17729c0 = enumC17729c2;
        Integer imageSize2 = buttonCardModel.getImageSize();
        tag = buttonCardModel.getTag();
        if (tag != null) {
            interfaceC25312uM60541h = c21535aM60555e.m60541h(tag);
            if (interfaceC25312uM60541h instanceof C17750h1) {
                c17750h1M50901b = (C17750h1) interfaceC25312uM60541h;
            } else {
                c17750h1M50901b = null;
            }
            if (c17750h1M50901b != null) {
                tagStyle = c17750h1M50901b.getTagStyle();
            } else {
                tagStyle = null;
            }
            if (tagStyle != EnumC17775o1.COACH_RECOMMENDED) {
                if (c17750h1M50901b != null) {
                    textColor = buttonCardModel.getTag().getTextColor();
                    if (textColor != null) {
                        enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
                        enumC39333fArrValues = EnumC39333f.values();
                        length2 = enumC39333fArrValues.length;
                        i14 = 0;
                        while (true) {
                            if (i14 < length2) {
                                enumC39333f2 = null;
                                break;
                            }
                            enumC39333f2 = enumC39333fArrValues[i14];
                            if (AbstractC22676k.m65745e(enumC39333f2.name(), textColor)) {
                                break;
                                break;
                            }
                            i14++;
                        }
                        if (enumC39333f2 != null) {
                            enumC39333f = enumC39333f2;
                        }
                        if (enumC39333f == null) {
                            enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
                        }
                    } else {
                        enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
                    }
                    c17750h1M50901b = C17750h1.m50901b(c17750h1M50901b, null, null, EnumC39333f.ACCENT_POSITIVE_TREND_15, null, enumC39333f, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194283, null);
                } else {
                    c17750h1M50901b = null;
                }
            }
            c17750h1 = c17750h1M50901b;
        } else {
            c17750h1 = null;
        }
        dismissIcon = buttonCardModel.getDismissIcon();
        if (dismissIcon != null) {
            enumC16313m0 = EnumC16313m0.CROSS;
            enumC16313m0ArrValues = EnumC16313m0.values();
            length = enumC16313m0ArrValues.length;
            i13 = 0;
            while (true) {
                if (i13 < length) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), dismissIcon)) {
                    break;
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
        expandedItems = buttonCardModel.getExpandedItems();
        if (expandedItems != null) {
            listM74093D1 = AbstractC25265s.m74093D1(c21535aM60555e.m60540g(expandedItems));
        } else {
            listM74093D1 = null;
        }
        boolIsExpanded = buttonCardModel.isExpanded();
        if (boolIsExpanded != null) {
            zBooleanValue = boolIsExpanded.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Action dismissAction2 = buttonCardModel.getDismissAction();
        EnumC13887p enumC13887pM69605k2 = m69605k(buttonCardModel.getStyle());
        price = buttonCardModel.getPrice();
        if (price != null) {
            c13884o = new C13884o(price.getAmount(), price.getSubtitle());
        } else {
            c13884o = null;
        }
        return new C13890q(id4, title, body, cVar, enumC17729c0, imageSize2, c27256hM69602h, c17750h1, listM60540g, listM74093D1, zBooleanValue, enumC16313m0, dismissAction2, c9598e, enumC13887pM69605k2, c13884o, buttonCardModel.getTitleColor());
    }

    /* JADX INFO: renamed from: j */
    public static final C28833d m69604j(ToggleCardButtonModel toggleCardButtonModel) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(toggleCardButtonModel, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(toggleCardButtonModel.getCollapsedTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(toggleCardButtonModel.getExpandedTitle());
        String collapsedIcon = toggleCardButtonModel.getCollapsedIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.CARET_DOWN;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            enumC16313m0 = null;
            if (i13 >= length) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), collapsedIcon)) {
                break;
            }
            i13++;
        }
        EnumC16313m0 enumC16313m3 = enumC16313m1 == null ? enumC16313m2 : enumC16313m1;
        String expandedIcon = toggleCardButtonModel.getExpandedIcon();
        EnumC16313m0 enumC16313m4 = EnumC16313m0.CARET_UP;
        for (EnumC16313m0 enumC16313m5 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m5.name(), expandedIcon)) {
                enumC16313m0 = enumC16313m5;
                break;
            }
        }
        return new C28833d(textResourceM21278l, textResourceM21278l2, enumC16313m3, enumC16313m0 == null ? enumC16313m4 : enumC16313m0, toggleCardButtonModel.getStyle(), false, 32, null);
    }

    /* JADX INFO: renamed from: k */
    private static final EnumC13887p m69605k(ButtonCardStyleDtoEnum buttonCardStyleDtoEnum) {
        int i13 = a.f94034a[buttonCardStyleDtoEnum.ordinal()];
        if (i13 == 1) {
            return EnumC13887p.HIGHLIGHTED;
        }
        if (i13 == 2) {
            return EnumC13887p.TRANSPARENT;
        }
        if (i13 == 3) {
            return EnumC13887p.DEFAULT;
        }
        if (i13 == 4) {
            return EnumC13887p.RAF;
        }
        throw new NoWhenBranchMatchedException();
    }
}
