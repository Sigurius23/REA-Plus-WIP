package p716lb1;

import ad3.AbstractC0770m;
import b41.C2717f;
import b41.C2718g;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TextInputModel;
import com.whoop.design.models.items.TextInputValidation;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import gz0.EnumC16313m0;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.t4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/items/TextInputModel;", "Lb41/f;", "g", "(Lcom/whoop/design/models/items/TextInputModel;)Lb41/f;", "Lcom/whoop/design/models/items/TextInputValidation;", "", "input", "", "i", "(Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)Z", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "textInputMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23717t4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93977a = Function1.m68251a(new C23751z2(15));

    /* JADX INFO: renamed from: lb1.t4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93978w;

        public a(Function1 function1) {
            this.f93978w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93978w.invoke((TextInputModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m69434d() {
        return f93977a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69435e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TextInputModel.class), new a(new C23751z2(16)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C2717f m69436f(TextInputModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69437g(model);
    }

    /* JADX INFO: renamed from: g */
    private static final C2717f m69437g(TextInputModel textInputModel) {
        String label = textInputModel.getLabel();
        String text = textInputModel.getText();
        String placeholder = textInputModel.getPlaceholder();
        String icon = textInputModel.getIcon();
        EnumC16313m0 enumC16313m0 = null;
        if (icon != null) {
            for (EnumC16313m0 enumC16313m1 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                    enumC16313m0 = enumC16313m1;
                    break;
                }
            }
        }
        return new C2717f(label, text, placeholder, enumC16313m0, textInputModel.getSuffix(), textInputModel.getCaption(), textInputModel.getKeyboardType().getType(), textInputModel.getMaxLength(), textInputModel.isSecure(), !textInputModel.isDisabled(), textInputModel.getErrorMessage(), textInputModel.getOverrideTapInteraction(), new C2718g(new C19962a(textInputModel, 29)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Action m69438h(TextInputModel textInputModel, String str) {
        String validityKey;
        int i13 = 2;
        boolean z4 = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (str == null || str.length() == 0) {
            String stateUpdateValueKey = textInputModel.getStateUpdateValueKey();
            String errorStateKey = textInputModel.getErrorStateKey();
            TextInputValidation textInputValidation = textInputModel.getTextInputValidation();
            return new StateClearAction(AbstractC25265s.m74092D0(AbstractC25260n.m74059b1(new String[]{stateUpdateValueKey, errorStateKey, textInputValidation != null ? textInputValidation.getValidityKey() : null})), z4, i13, defaultConstructorMarker);
        }
        String stateUpdateValueKey2 = textInputModel.getStateUpdateValueKey();
        if (stateUpdateValueKey2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TextInputValidation textInputValidation2 = textInputModel.getTextInputValidation();
        if (textInputValidation2 != null && (validityKey = textInputValidation2.getValidityKey()) != null) {
            linkedHashMap.put(validityKey, AbstractC0770m.m1839a(Boolean.valueOf(m69439i(textInputValidation2, str))));
        }
        linkedHashMap.put(stateUpdateValueKey2, AbstractC0770m.m1841c(str));
        return new StateUpdateAction((Map) linkedHashMap, false, 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: i */
    private static final boolean m69439i(TextInputValidation textInputValidation, String input) {
        Object objM107888l;
        String validityKey = textInputValidation.getValidityKey();
        if (validityKey == null || validityKey.length() == 0) {
            return true;
        }
        try {
            String pattern = textInputValidation.getRegex();
            AbstractC22676k.m65750j(pattern, "pattern");
            Pattern patternCompile = Pattern.compile(pattern);
            AbstractC22676k.m65749i(patternCompile, "compile(...)");
            AbstractC22676k.m65750j(input, "input");
            objM107888l = Boolean.valueOf(patternCompile.matcher(input).matches());
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (C23468n.m68037a(objM107888l) == null) {
            return ((Boolean) objM107888l).booleanValue();
        }
        return true;
    }
}
