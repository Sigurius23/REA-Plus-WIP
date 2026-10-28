package p716lb1;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.TextColorGradient;
import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.items.AnnotatedTextModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import l83.C23454a0;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p736sz0.C33168c;
import p736sz0.C33169c0;
import p736sz0.C33194k1;
import p736sz0.EnumC33232y;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.u4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/TitleSubTitleModel;", "Lsz0/k1;", "g", "(Lcom/whoop/design/models/TitleSubTitleModel;)Lsz0/k1;", "Lcom/whoop/design/models/MarkdownTextModel;", "Lsz0/c0;", "f", "(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;", "", "name", "Lw3/k;", "defaultValue", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;I)I", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "textMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23723u4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94013a = Function1.m68251a(new C23675m4(9));

    /* JADX INFO: renamed from: lb1.u4$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94014a;

        static {
            int[] iArr = new int[TextColorGradient.values().length];
            try {
                iArr[TextColorGradient.PROMO_LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f94014a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.u4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94015w;

        public b(Function1 function1) {
            this.f94015w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94015w.invoke((AnnotatedTextModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u4$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94016w;

        public c(Function1 function1) {
            this.f94016w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94016w.invoke((TitleSubTitleModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u4$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94017w;

        public d(Function1 function1) {
            this.f94017w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94017w.invoke((MarkdownTextModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69555e() {
        return f94013a;
    }

    /* JADX INFO: renamed from: f */
    public static final C33169c0 m69556f(MarkdownTextModel markdownTextModel) {
        TextColorGradient textColorGradient;
        AbstractC17911t abstractC17911tM43989I0;
        EnumC2888c enumC2888c;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        EnumC33232y enumC33232y;
        AbstractC22676k.m65750j(markdownTextModel, "<this>");
        String color = markdownTextModel.getColor();
        TextColorGradient[] textColorGradientArrValues = TextColorGradient.values();
        int length = textColorGradientArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                textColorGradient = null;
                break;
            }
            textColorGradient = textColorGradientArrValues[i14];
            if (AbstractC22676k.m65745e(textColorGradient.name(), color)) {
                break;
            }
            i14++;
        }
        int i15 = textColorGradient == null ? -1 : a.f94014a[textColorGradient.ordinal()];
        if (i15 == -1) {
            abstractC17911tM43989I0 = null;
        } else {
            if (i15 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC17911tM43989I0 = AbstractC15673b0.m43989I0();
        }
        String text = markdownTextModel.getText();
        String style = markdownTextModel.getStyle();
        EnumC2888c enumC2888c2 = EnumC2888c.B1;
        EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
        int length2 = enumC2888cArrValues.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length2) {
                enumC2888c = null;
                break;
            }
            enumC2888c = enumC2888cArrValues[i16];
            if (AbstractC22676k.m65745e(enumC2888c.name(), style)) {
                break;
            }
            i16++;
        }
        if (enumC2888c != null) {
            enumC2888c2 = enumC2888c;
        }
        if (abstractC17911tM43989I0 != null) {
            enumC39333f2 = EnumC39333f.BRAND_WHITE;
        } else {
            String color2 = markdownTextModel.getColor();
            EnumC39333f enumC39333f3 = EnumC39333f.WHITE_70;
            EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
            int length3 = enumC39333fArrValues.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length3) {
                    enumC39333f = null;
                    break;
                }
                enumC39333f = enumC39333fArrValues[i17];
                if (AbstractC22676k.m65745e(enumC39333f.name(), color2)) {
                    break;
                }
                i17++;
            }
            enumC39333f2 = enumC39333f == null ? enumC39333f3 : enumC39333f;
        }
        int iM69558h = m69558h(markdownTextModel.getAlignment(), 5);
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(markdownTextModel.getIcon());
        Integer maxLines = markdownTextModel.getMaxLines();
        if (maxLines == null || maxLines.intValue() <= 0) {
            maxLines = null;
        }
        Integer minLines = markdownTextModel.getMinLines();
        if (minLines == null || minLines.intValue() <= 0) {
            minLines = null;
        }
        boolean fillWidth = markdownTextModel.getFillWidth();
        String iconPosition = markdownTextModel.getIconPosition();
        if (iconPosition == null) {
            iconPosition = "";
        }
        String upperCase = iconPosition.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        EnumC33232y enumC33232y2 = EnumC33232y.TRAILING;
        EnumC33232y[] enumC33232yArrValues = EnumC33232y.values();
        int length4 = enumC33232yArrValues.length;
        while (true) {
            if (i13 >= length4) {
                enumC33232y = null;
                break;
            }
            EnumC33232y enumC33232y3 = enumC33232yArrValues[i13];
            if (AbstractC22676k.m65745e(enumC33232y3.name(), upperCase)) {
                enumC33232y = enumC33232y3;
                break;
            }
            i13++;
        }
        if (enumC33232y != null) {
            enumC33232y2 = enumC33232y;
        }
        return new C33169c0(text, enumC2888c2, enumC39333f2, iM69558h, enumC16313m0M46377b, maxLines, minLines, abstractC17911tM43989I0, fillWidth, enumC33232y2, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX INFO: renamed from: g */
    public static final C33194k1 m69557g(TitleSubTitleModel titleSubTitleModel) {
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        EnumC2888c enumC2888c;
        EnumC2888c enumC2888c2;
        EnumC39333f enumC39333f3;
        EnumC39333f enumC39333f4;
        AbstractC22676k.m65750j(titleSubTitleModel, "<this>");
        String id4 = titleSubTitleModel.getId();
        TextResource title = titleSubTitleModel.getTitle();
        TextResource subtitle = titleSubTitleModel.getSubtitle();
        String titleColor = titleSubTitleModel.getTitleColor();
        int i13 = 0;
        if (titleColor != null) {
            enumC39333f = EnumC39333f.BRAND_WHITE;
            EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
            int length = enumC39333fArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    enumC39333f4 = null;
                    break;
                }
                enumC39333f4 = enumC39333fArrValues[i14];
                if (AbstractC22676k.m65745e(enumC39333f4.name(), titleColor)) {
                    break;
                }
                i14++;
            }
            if (enumC39333f4 != null) {
                enumC39333f = enumC39333f4;
            }
            if (enumC39333f == null) {
                enumC39333f = EnumC39333f.BRAND_WHITE;
            }
        } else {
            enumC39333f = EnumC39333f.BRAND_WHITE;
        }
        String subtitleColor = titleSubTitleModel.getSubtitleColor();
        if (subtitleColor != null) {
            enumC39333f2 = EnumC39333f.WHITE_70;
            EnumC39333f[] enumC39333fArrValues2 = EnumC39333f.values();
            int length2 = enumC39333fArrValues2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC39333f3 = null;
                    break;
                }
                enumC39333f3 = enumC39333fArrValues2[i15];
                if (AbstractC22676k.m65745e(enumC39333f3.name(), subtitleColor)) {
                    break;
                }
                i15++;
            }
            if (enumC39333f3 != null) {
                enumC39333f2 = enumC39333f3;
            }
            if (enumC39333f2 == null) {
                enumC39333f2 = EnumC39333f.WHITE_70;
            }
        } else {
            enumC39333f2 = EnumC39333f.WHITE_70;
        }
        String titleStyle = titleSubTitleModel.getTitleStyle();
        if (titleStyle != null) {
            EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
            int length3 = enumC2888cArrValues.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length3) {
                    enumC2888c = null;
                    break;
                }
                enumC2888c = enumC2888cArrValues[i16];
                if (AbstractC22676k.m65745e(enumC2888c.name(), titleStyle)) {
                    break;
                }
                i16++;
            }
            if (enumC2888c == null) {
                enumC2888c = EnumC2888c.T2;
            }
        } else {
            enumC2888c = EnumC2888c.T2;
        }
        String subtitleStyle = titleSubTitleModel.getSubtitleStyle();
        if (subtitleStyle != null) {
            EnumC2888c[] enumC2888cArrValues2 = EnumC2888c.values();
            int length4 = enumC2888cArrValues2.length;
            while (true) {
                if (i13 >= length4) {
                    enumC2888c2 = null;
                    break;
                }
                enumC2888c2 = enumC2888cArrValues2[i13];
                if (AbstractC22676k.m65745e(enumC2888c2.name(), subtitleStyle)) {
                    break;
                }
                i13++;
            }
            if (enumC2888c2 == null) {
                enumC2888c2 = EnumC2888c.B1;
            }
        } else {
            enumC2888c2 = EnumC2888c.B1;
        }
        EnumC2888c enumC2888c3 = enumC2888c2;
        int iM69558h = m69558h(titleSubTitleModel.getAlignment(), 5);
        SecondaryButtonModel trailingButton = titleSubTitleModel.getTrailingButton();
        return new C33194k1(id4, title, subtitle, enumC39333f, enumC39333f2, enumC2888c, enumC2888c3, iM69558h, 0, 0, trailingButton != null ? AbstractC23613d4.m68666p(trailingButton) : null, 768, null);
    }

    /* JADX INFO: renamed from: h */
    private static final int m69558h(String str, int i13) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 768341734) {
                if (iHashCode != 1984282709) {
                    if (iHashCode == 2058686492 && upperCase.equals("TRAILING")) {
                        return 6;
                    }
                } else if (upperCase.equals("CENTER")) {
                    return 3;
                }
            } else if (upperCase.equals("LEADING")) {
                return 5;
            }
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m69559i(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23675m4 c23675m4 = new C23675m4(10);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AnnotatedTextModel.class), new b(c23675m4));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TitleSubTitleModel.class), new c(new C23675m4(11)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MarkdownTextModel.class), new d(new C23675m4(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C33168c m69560j(AnnotatedTextModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C33168c(model.getText(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C33194k1 m69561k(TitleSubTitleModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69557g(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C33169c0 m69562l(MarkdownTextModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69556f(model);
    }
}
