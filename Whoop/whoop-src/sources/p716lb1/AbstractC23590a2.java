package p716lb1;

import com.whoop.design.atomic.organism.historylistitem.HistoryListItemStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.HistoryListItemExpandedContentModel;
import com.whoop.design.models.items.HistoryListItemModel;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p71.C28957c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.a2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/HistoryListItemModel;", "Lp71/c;", "f", "(Lcom/whoop/design/models/items/HistoryListItemModel;)Lp71/c;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "historyListItemMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23590a2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93569a = Function1.m68251a(new C23670m(21));

    /* JADX INFO: renamed from: lb1.a2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93570w;

        public a(Function1 function1) {
            this.f93570w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93570w.invoke((HistoryListItemModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68254c() {
        return f93569a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68255d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(HistoryListItemModel.class), new a(new C23670m(22)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C28957c m68256e(HistoryListItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68257f(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    private static final C28957c m68257f(HistoryListItemModel historyListItemModel) {
        EnumC16313m0 enumC16313m0;
        ?? arrayList;
        List<HistoryListItemModel> children;
        String id4 = historyListItemModel.getId();
        String title = historyListItemModel.getTitle();
        String subtitle = historyListItemModel.getSubtitle();
        String trailingText = historyListItemModel.getTrailingText();
        String leftIcon = historyListItemModel.getLeftIcon();
        EnumC16313m0 enumC16313m1 = null;
        if (leftIcon == null) {
            enumC16313m0 = null;
            break;
        }
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                break;
            }
            i13++;
        }
        String imageUrl = historyListItemModel.getImageUrl();
        AbstractC22403o abstractC22403oM64503l = imageUrl != null ? AbstractC22404p.m64503l(imageUrl) : null;
        String rightIcon = historyListItemModel.getRightIcon();
        if (rightIcon != null) {
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), rightIcon)) {
                    enumC16313m1 = enumC16313m2;
                    break;
                }
            }
        }
        EnumC16313m0 enumC16313m3 = enumC16313m1;
        HistoryListItemStyle style = historyListItemModel.getStyle();
        String warning = historyListItemModel.getWarning();
        EnumC16313m0 enumC16313m4 = enumC16313m0;
        C9598e destination = historyListItemModel.getDestination();
        String caption = historyListItemModel.getCaption();
        HistoryListItemExpandedContentModel expandedContent = historyListItemModel.getExpandedContent();
        if (expandedContent == null || (children = expandedContent.getChildren()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<HistoryListItemModel> list = children;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m68257f((HistoryListItemModel) it.next()));
            }
        }
        return new C28957c(id4, title, subtitle, trailingText, enumC16313m4, abstractC22403oM64503l, enumC16313m3, style, warning, destination, caption, arrayList, false, 4096, null);
    }
}
