package p716lb1;

import b91.AbstractC2890e;
import b91.C2886a;
import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CheckboxModel;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p026b2.C2299e;
import p026b2.InterfaceC2300f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import sy0.AbstractC33088k;
import sy0.C33078a;
import sy0.C33082e;

/* JADX INFO: renamed from: lb1.d0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/design/models/items/CheckboxModel;", "Lsy0/e;", "i", "(Lcom/whoop/design/models/items/CheckboxModel;)Lsy0/e;", "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;", "Ly81/f;", "e", "(Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;)Ly81/f;", "Lb91/c;", "labelStyle", "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;", "alignment", "Lsy0/k;", "g", "(Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Lb91/c;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;)Lsy0/k;", "Lb2/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;)Lb2/f;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "checkboxMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23609d0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93708a = Function1.m68251a(new C23724v(23));

    /* JADX INFO: renamed from: lb1.d0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93709a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f93710b;

        static {
            int[] iArr = new int[CheckboxModel.CheckboxStyle.values().length];
            try {
                iArr[CheckboxModel.CheckboxStyle.V2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckboxModel.CheckboxStyle.V2_NO_LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckboxModel.CheckboxStyle.MARKDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckboxModel.CheckboxStyle.TRADITIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckboxModel.CheckboxStyle.TOGGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckboxModel.CheckboxStyle.NO_LABEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f93709a = iArr;
            int[] iArr2 = new int[CheckboxModel.CheckboxAlignment.values().length];
            try {
                iArr2[CheckboxModel.CheckboxAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CheckboxModel.CheckboxAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CheckboxModel.CheckboxAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f93710b = iArr2;
        }
    }

    /* JADX INFO: renamed from: lb1.d0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93711w;

        public b(Function1 function1) {
            this.f93711w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93711w.invoke((CheckboxModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68619c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CheckboxModel.class), new b(new C23724v(24)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C33082e m68620d(CheckboxModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68625i(model);
    }

    /* JADX INFO: renamed from: e */
    private static final EnumC39333f m68621e(CheckboxModel.CheckboxStyle checkboxStyle) {
        switch (checkboxStyle == null ? -1 : a.f93709a[checkboxStyle.ordinal()]) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
                return EnumC39333f.BRAND_WHITE;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
                return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m68622f() {
        return f93708a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private static final AbstractC33088k m68623g(CheckboxModel.CheckboxStyle checkboxStyle, EnumC2888c enumC2888c, CheckboxModel.CheckboxAlignment checkboxAlignment) {
        C2886a b6;
        C2886a formLabel;
        C2886a formLabel2;
        switch (checkboxStyle == null ? -1 : a.f93709a[checkboxStyle.ordinal()]) {
            case -1:
            case 3:
                if (enumC2888c == null || (b6 = EnumC2888c.INSTANCE.m8402a(enumC2888c)) == null) {
                    b6 = AbstractC2890e.m8450e().getB1();
                }
                return new AbstractC33088k.a(null, b6, m68624h(checkboxAlignment), checkboxAlignment == CheckboxModel.CheckboxAlignment.LEADING, 1, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (enumC2888c == null || (formLabel = EnumC2888c.INSTANCE.m8402a(enumC2888c)) == null) {
                    formLabel = AbstractC2890e.m8450e().getFormLabel();
                }
                return new AbstractC33088k.i(formLabel);
            case 2:
                return AbstractC33088k.h.f137995b;
            case 4:
                if (enumC2888c == null || (formLabel2 = EnumC2888c.INSTANCE.m8402a(enumC2888c)) == null) {
                    formLabel2 = AbstractC2890e.m8450e().getFormLabel();
                }
                return new AbstractC33088k.g(formLabel2, null, 2, 0 == true ? 1 : 0);
            case 5:
                return AbstractC33088k.e.f137988b;
            case 6:
                return AbstractC33088k.c.f137984b;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final InterfaceC2300f m68624h(CheckboxModel.CheckboxAlignment checkboxAlignment) {
        int i13 = checkboxAlignment == null ? -1 : a.f93710b[checkboxAlignment.ordinal()];
        if (i13 == -1) {
            return null;
        }
        if (i13 == 1) {
            return C2299e.f9110M;
        }
        if (i13 == 2) {
            return C2299e.f9111N;
        }
        if (i13 == 3) {
            return C2299e.f9112O;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    private static final C33082e m68625i(CheckboxModel checkboxModel) {
        GenericInteraction toggleOnInteraction = checkboxModel.getToggleOnInteraction();
        GenericInteraction toggleOffInteraction = checkboxModel.getToggleOffInteraction();
        C33078a c33078a = (toggleOnInteraction == null || toggleOffInteraction == null) ? null : new C33078a(toggleOnInteraction, toggleOffInteraction);
        AbstractC33088k abstractC33088kM68623g = m68623g(checkboxModel.getStyle(), checkboxModel.getLabelStyle(), checkboxModel.getAlignment());
        String id4 = checkboxModel.getId();
        String label = checkboxModel.getLabel();
        boolean zIsToggled = checkboxModel.isToggled();
        Integer spacerSize = checkboxModel.getSpacerSize();
        EnumC39333f toggledOnColor = checkboxModel.getToggledOnColor();
        if (toggledOnColor == null) {
            toggledOnColor = m68621e(checkboxModel.getStyle());
        }
        return new C33082e(id4, label, zIsToggled, abstractC33088kM68623g, c33078a, spacerSize, toggledOnColor);
    }
}
