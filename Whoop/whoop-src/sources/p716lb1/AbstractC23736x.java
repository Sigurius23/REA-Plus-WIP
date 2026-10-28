package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ButtonCellModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d01.C11441f;
import d01.EnumC11436a;
import d01.EnumC11442g;
import d01.EnumC11443h;
import gz0.EnumC16313m0;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.x */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/ButtonCellModel;", "model", "Ld01/f;", "e", "(Lcom/whoop/design/models/items/ButtonCellModel;)Ld01/f;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "buttonCellMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23736x {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94047a = Function1.m68251a(new C23724v(1));

    /* JADX INFO: renamed from: lb1.x$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94048w;

        public a(Function1 function1) {
            this.f94048w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94048w.invoke((ButtonCellModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69629c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ButtonCellModel.class), new a(new C23724v(2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C11441f m69630d(ButtonCellModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69631e(model);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0103  */
    /* JADX INFO: renamed from: e */
    public static final C11441f m69631e(ButtonCellModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC11436a enumC11436a;
        EnumC11443h enumC11443h;
        EnumC16313m0 enumC16313m1;
        EnumC11442g enumC11442g;
        EnumC16313m0 enumC16313m2;
        EnumC11443h enumC11443h2;
        EnumC16313m0 enumC16313m3;
        AbstractC22676k.m65750j(model, "model");
        String trailingIcon = model.getTrailingIcon();
        EnumC11442g enumC11442g2 = null;
        if (trailingIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m3 = null;
                    break;
                }
                enumC16313m3 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m3.name(), trailingIcon)) {
                    break;
                }
                i13++;
            }
            enumC16313m0 = enumC16313m3;
        } else {
            enumC16313m0 = null;
        }
        if (enumC16313m0 != null) {
            enumC11436a = EnumC11436a.ICON;
        } else {
            String message = model.getMessage();
            enumC11436a = (message == null || message.length() == 0) ? EnumC11436a.NONE : EnumC11436a.MESSAGE;
        }
        EnumC11436a enumC11436a2 = enumC11436a;
        List<AbstractC22403o> listM69208c = AbstractC23688p.m69208c(model.getAvatars(), 3);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String subtitle = model.getSubtitle();
        TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        String titleType = model.getTitleType();
        if (titleType != null) {
            enumC11443h = EnumC11443h.UPPERCASE;
            EnumC11443h[] enumC11443hArrValues = EnumC11443h.values();
            int length2 = enumC11443hArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC11443h2 = null;
                    break;
                }
                enumC11443h2 = enumC11443hArrValues[i14];
                if (AbstractC22676k.m65745e(enumC11443h2.name(), titleType)) {
                    break;
                }
                i14++;
            }
            if (enumC11443h2 != null) {
                enumC11443h = enumC11443h2;
            }
            if (enumC11443h == null) {
                enumC11443h = EnumC11443h.UPPERCASE;
            }
        } else {
            enumC11443h = EnumC11443h.UPPERCASE;
        }
        EnumC11443h enumC11443h3 = enumC11443h;
        String leadingIcon = model.getLeadingIcon();
        if (leadingIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length3 = enumC16313m0ArrValues2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues2[i15];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), leadingIcon)) {
                    break;
                }
                i15++;
            }
            enumC16313m1 = enumC16313m2;
        } else {
            enumC16313m1 = null;
        }
        String leadingImageUrl = model.getLeadingImageUrl();
        AbstractC22403o abstractC22403oM64503l = leadingImageUrl != null ? AbstractC22404p.m64503l(leadingImageUrl) : null;
        String message2 = model.getMessage();
        TextResource textResourceM21278l3 = message2 != null ? AbstractC8693b.m21278l(message2) : null;
        EnumC39333f tintColor = model.getTintColor();
        boolean enabled = model.getEnabled();
        C9598e destination = model.getDestination();
        String style = model.getStyle();
        if (style != null) {
            enumC11442g = EnumC11442g.DEFAULT;
            for (EnumC11442g enumC11442g3 : EnumC11442g.values()) {
                if (AbstractC22676k.m65745e(enumC11442g3.name(), style)) {
                    enumC11442g2 = enumC11442g3;
                    break;
                }
            }
            if (enumC11442g2 != null) {
                enumC11442g = enumC11442g2;
            }
            if (enumC11442g == null) {
                enumC11442g = EnumC11442g.DEFAULT;
            }
        } else {
            enumC11442g = EnumC11442g.DEFAULT;
        }
        return new C11441f(textResourceM21278l, textResourceM21278l2, enumC11443h3, enumC11436a2, enumC16313m1, abstractC22403oM64503l, enumC16313m0, textResourceM21278l3, listM69208c, tintColor, enabled, destination, enumC11442g, model.getModal());
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m69632f() {
        return f94047a;
    }
}
