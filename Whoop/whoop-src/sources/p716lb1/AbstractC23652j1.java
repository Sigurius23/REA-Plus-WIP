package p716lb1;

import b91.C2886a;
import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.EndpointButtonModel;
import gz0.EnumC16313m0;
import l11.C23223e;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.j1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"", "Lgz0/m0;", "f", "(Ljava/lang/String;)Lgz0/m0;", "Lb91/a;", "g", "(Ljava/lang/String;)Lb91/a;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "endpointButtonMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23652j1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93813a = Function1.m68251a(new C23617e1(3));

    /* JADX INFO: renamed from: lb1.j1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93814w;

        public a(Function1 function1) {
            this.f93814w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93814w.invoke((EndpointButtonModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68915c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(EndpointButtonModel.class), new a(new C23617e1(4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23223e m68916d(EndpointButtonModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String buttonText = model.getButtonText();
        String successText = model.getSuccessText();
        EnumC16313m0 enumC16313m0M68918f = m68918f(model.getLeadingIcon());
        String successIcon = model.getSuccessIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CHECKMARK;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), successIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        EnumC16313m0 enumC16313m0M68918f2 = m68918f(model.getErrorIcon());
        String errorText = model.getErrorText();
        C2886a c2886aM68919g = null;
        boolean showLoading = model.getShowLoading();
        String path = model.getPath();
        String prefixText = model.getPrefixText();
        String textStyle = model.getTextStyle();
        if (textStyle != null) {
            c2886aM68919g = m68919g(textStyle);
        }
        return new C23223e(id4, buttonText, successText, enumC16313m0M68918f, enumC16313m1, errorText, enumC16313m0M68918f2, null, showLoading, path, prefixText, c2886aM68919g, 128, null);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68917e() {
        return f93813a;
    }

    /* JADX INFO: renamed from: f */
    private static final EnumC16313m0 m68918f(String str) {
        if (AbstractC39414r.m125890i0(str)) {
            return null;
        }
        for (EnumC16313m0 enumC16313m0 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m0.name(), str)) {
                return enumC16313m0;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[RETURN] */
    /* JADX INFO: renamed from: g */
    private static final C2886a m68919g(String str) {
        for (EnumC2888c enumC2888c : EnumC2888c.values()) {
            if (AbstractC22676k.m65745e(enumC2888c.name(), str)) {
                if (enumC2888c != null) {
                    return EnumC2888c.INSTANCE.m8402a(enumC2888c);
                }
                return null;
            }
        }
        enumC2888c = null;
        if (enumC2888c != null) {
            return EnumC2888c.INSTANCE.m8402a(enumC2888c);
        }
        return null;
    }
}
