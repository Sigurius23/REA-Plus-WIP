package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SelectableCellModel;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import ry0.C31909d;
import ry0.EnumC31908c;

/* JADX INFO: renamed from: lb1.h4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectableCellModel;", "Lry0/d;", "d", "(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "selectableCellItemMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23641h4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93788a = Function1.m68251a(new C23740x3(21));

    /* JADX INFO: renamed from: lb1.h4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93789w;

        public a(Function1 function1) {
            this.f93789w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93789w.invoke((SelectableCellModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68844c() {
        return f93788a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: d */
    public static final C31909d m68845d(SelectableCellModel selectableCellModel) {
        EnumC31908c enumC31908c;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(selectableCellModel, "<this>");
        String selectionStyle = selectableCellModel.getSelectionStyle();
        int i13 = 0;
        if (selectionStyle != null) {
            EnumC31908c[] enumC31908cArrValues = EnumC31908c.values();
            int length = enumC31908cArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    enumC31908c = null;
                    break;
                }
                enumC31908c = enumC31908cArrValues[i14];
                if (AbstractC22676k.m65745e(enumC31908c.name(), selectionStyle)) {
                    break;
                }
                i14++;
            }
            if (enumC31908c == null) {
                enumC31908c = EnumC31908c.DEFAULT;
            }
        } else {
            enumC31908c = EnumC31908c.DEFAULT;
        }
        EnumC31908c enumC31908c2 = enumC31908c;
        String id4 = selectableCellModel.getId();
        String title = selectableCellModel.getTitle();
        String subtitle = selectableCellModel.getSubtitle();
        String leftIcon = selectableCellModel.getLeftIcon();
        if (leftIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues.length;
            while (true) {
                if (i13 >= length2) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), leftIcon)) {
                    break;
                }
                i13++;
            }
            enumC16313m0 = enumC16313m1;
        } else {
            enumC16313m0 = null;
        }
        String leftImageUrl = selectableCellModel.getLeftImageUrl();
        AbstractC22403o.c cVar = leftImageUrl != null ? new AbstractC22403o.c(leftImageUrl, 0, 0, 0, 14, null) : null;
        boolean shouldTintLeftImage = selectableCellModel.getShouldTintLeftImage();
        boolean selected = selectableCellModel.getSelected();
        boolean showCheckbox = selectableCellModel.getShowCheckbox();
        boolean zIsDisabled = selectableCellModel.isDisabled();
        Object interaction = selectableCellModel.getInteraction();
        if (interaction == null) {
            interaction = selectableCellModel.getAction();
        }
        Object obj = interaction;
        Action deselectAction = selectableCellModel.getDeselectAction();
        Double fixedHeightSize = selectableCellModel.getFixedHeightSize();
        return new C31909d(id4, title, subtitle, enumC16313m0, cVar, shouldTintLeftImage, enumC31908c2, selected, showCheckbox, obj, deselectAction, false, zIsDisabled, fixedHeightSize != null ? new C39174f((float) fixedHeightSize.doubleValue()) : null, selectableCellModel.getSectionTitle(), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68846e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SelectableCellModel.class), new a(new C23740x3(22)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C31909d m68847f(SelectableCellModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68845d(model);
    }
}
