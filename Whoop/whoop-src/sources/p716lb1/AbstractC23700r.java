package p716lb1;

import com.whoop.design.models.BinaryIconModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BinaryFeedbackModel;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33180g;
import p736sz0.C33183h;
import p736sz0.EnumC33177f;

/* JADX INFO: renamed from: lb1.r */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/BinaryFeedbackModel;", "Lsz0/g;", "g", "(Lcom/whoop/design/models/items/BinaryFeedbackModel;)Lsz0/g;", "Lcom/whoop/design/models/BinaryIconModel;", "Lsz0/h;", "f", "(Lcom/whoop/design/models/BinaryIconModel;)Lsz0/h;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "binaryFeedbackMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23700r {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93938a = Function1.m68251a(new C23587a(20));

    /* JADX INFO: renamed from: lb1.r$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93939w;

        public a(Function1 function1) {
            this.f93939w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93939w.invoke((BinaryFeedbackModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69330c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(BinaryFeedbackModel.class), new a(new C23587a(21)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C33180g m69331d(BinaryFeedbackModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69334g(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69332e() {
        return f93938a;
    }

    /* JADX INFO: renamed from: f */
    private static final C33183h m69333f(BinaryIconModel binaryIconModel) {
        return new C33183h(binaryIconModel.getSelectedIcon().getIcon().toWhoopIcon(), binaryIconModel.getSelectedIcon().getContentDescription(), binaryIconModel.getUnselectedIcon().getIcon().toWhoopIcon(), binaryIconModel.getUnselectedIcon().getContentDescription(), binaryIconModel.getUnselectedIcon().getGenericInteraction());
    }

    /* JADX INFO: renamed from: g */
    private static final C33180g m69334g(BinaryFeedbackModel binaryFeedbackModel) {
        EnumC33177f enumC33177f;
        String text = binaryFeedbackModel.getText();
        String selection = binaryFeedbackModel.getSelection();
        EnumC33177f enumC33177f2 = EnumC33177f.NONE;
        EnumC33177f[] enumC33177fArrValues = EnumC33177f.values();
        int length = enumC33177fArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC33177f = null;
                break;
            }
            enumC33177f = enumC33177fArrValues[i13];
            if (AbstractC22676k.m65745e(enumC33177f.name(), selection)) {
                break;
            }
            i13++;
        }
        if (enumC33177f != null) {
            enumC33177f2 = enumC33177f;
        }
        return new C33180g(text, enumC33177f2, m69333f(binaryFeedbackModel.getBinaryIconPositive()), m69333f(binaryFeedbackModel.getBinaryIconNegative()));
    }
}
