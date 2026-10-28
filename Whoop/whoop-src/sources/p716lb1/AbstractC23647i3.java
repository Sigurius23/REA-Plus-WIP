package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardIconButtonModel;
import com.whoop.design.models.items.MultipleButtonContainerModel;
import e01.C12504c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.i3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/MultipleButtonContainerModel;", "Le01/c;", "f", "(Lcom/whoop/design/models/items/MultipleButtonContainerModel;)Le01/c;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "multipleButtonContainerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23647i3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93803a = Function1.m68251a(new C23715t2(28));

    /* JADX INFO: renamed from: lb1.i3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93804w;

        public a(Function1 function1) {
            this.f93804w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93804w.invoke((MultipleButtonContainerModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68877c() {
        return f93803a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68878d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MultipleButtonContainerModel.class), new a(new C23715t2(29)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C12504c m68879e(MultipleButtonContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68880f(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C12504c m68880f(MultipleButtonContainerModel multipleButtonContainerModel) {
        AbstractC22676k.m65750j(multipleButtonContainerModel, "<this>");
        List<CardIconButtonModel> iconButtons = multipleButtonContainerModel.getIconButtons();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iconButtons, 10));
        Iterator<T> it = iconButtons.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC23613d4.m68663m((CardIconButtonModel) it.next()));
        }
        return new C12504c(arrayList, AbstractC23613d4.m68662l(multipleButtonContainerModel.getPrimaryButton(), null, 1, null));
    }
}
