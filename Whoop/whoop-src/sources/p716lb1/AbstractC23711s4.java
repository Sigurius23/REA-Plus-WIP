package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TextAreaModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.C17772n1;
import l83.C23454a0;
import or2.AbstractC28188o1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import t11.C33308h;

/* JADX INFO: renamed from: lb1.s4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/models/items/TextAreaModel;", "Lt11/h;", "f", "(Lcom/whoop/design/models/items/TextAreaModel;)Lt11/h;", "Lhy0/n1;", "g", "(Lcom/whoop/design/models/items/TextAreaModel;)Lhy0/n1;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "textAreaMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23711s4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93966a = Function1.m68251a(new C23751z2(13));

    /* JADX INFO: renamed from: lb1.s4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93967w;

        public a(Function1 function1) {
            this.f93967w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93967w.invoke((TextAreaModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69410c() {
        return f93966a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69411d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TextAreaModel.class), new a(new C23751z2(14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C17772n1 m69412e(TextAreaModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69414g(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C33308h m69413f(TextAreaModel textAreaModel) {
        AbstractC22676k.m65750j(textAreaModel, "<this>");
        String id4 = textAreaModel.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(textAreaModel.getLabel());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(textAreaModel.getText());
        TextResource hintText = textAreaModel.getHintText();
        String errorMessage = textAreaModel.getErrorMessage();
        return new C33308h(id4, textResourceM21278l, textResourceM21278l2, hintText, errorMessage != null ? AbstractC8693b.m21278l(errorMessage) : null, textAreaModel.getMaxCharacterCount(), textAreaModel.getMaxLines(), 0.0f, false, false, false, null, false, 0.0f, 16256, null);
    }

    /* JADX INFO: renamed from: g */
    public static final C17772n1 m69414g(TextAreaModel textAreaModel) {
        AbstractC22676k.m65750j(textAreaModel, "<this>");
        String label = textAreaModel.getLabel();
        if (label == null) {
            label = "";
        }
        String text = textAreaModel.getText();
        if (text == null) {
            text = "";
        }
        TextResource hintText = textAreaModel.getHintText();
        String errorMessage = textAreaModel.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "";
        }
        return new C17772n1(label, text, hintText, errorMessage, textAreaModel.getMaxCharacterCount(), textAreaModel.getMaxLines(), AbstractC28188o1.m85313c(textAreaModel.getErrorMessage()), false, false, null, false, textAreaModel.getStateUpdateValueKey(), 1920, null);
    }
}
