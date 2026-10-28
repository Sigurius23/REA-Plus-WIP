package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.expandablestatisticlist.ExpandableStatisticListButtonModel;
import com.whoop.design.models.items.expandablestatisticlist.ExpandableStatisticListHeaderModel;
import com.whoop.design.models.items.expandablestatisticlist.ExpandableStatisticListItemModel;
import com.whoop.design.models.items.expandablestatisticlist.ExpandableStatisticListModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import w51.C36836b;
import w51.C36838d;
import w51.C36840f;
import w51.C36842h;
import w51.EnumC36835a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: lb1.o1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;", "model", "Lw51/h;", "c", "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;)Lw51/h;", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;", "header", "Lw51/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;)Lw51/d;", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;", "item", "Lw51/f;", "i", "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;)Lw51/f;", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;", "button", "Lw51/b;", "g", "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)Lw51/b;", "", "Lw51/a;", "j", "(Ljava/lang/String;)Lw51/a;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "expandableStatisticListMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23684o1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93894a = Function1.m68251a(new C23617e1(13));

    /* JADX INFO: renamed from: lb1.o1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93895w;

        public a(Function1 function1) {
            this.f93895w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93895w.invoke((ExpandableStatisticListModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C36842h m69176c(ExpandableStatisticListModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        int collapsedCount = model.getCollapsedCount();
        C36838d c36838dM69181h = m69181h(model.getHeader());
        List<ExpandableStatisticListItemModel> expandableListItems = model.getExpandableListItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(expandableListItems, 10));
        Iterator<T> it = expandableListItems.iterator();
        while (it.hasNext()) {
            arrayList.add(m69182i((ExpandableStatisticListItemModel) it.next()));
        }
        ExpandableStatisticListButtonModel toggleCardButton = model.getToggleCardButton();
        return new C36842h(id4, false, collapsedCount, c36838dM69181h, arrayList, toggleCardButton != null ? m69180g(toggleCardButton) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69177d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExpandableStatisticListModel.class), new a(new C23617e1(14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C36842h m69178e(ExpandableStatisticListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69176c(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m69179f() {
        return f93894a;
    }

    /* JADX INFO: renamed from: g */
    private static final C36836b m69180g(ExpandableStatisticListButtonModel expandableStatisticListButtonModel) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(expandableStatisticListButtonModel.getCollapsedTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(expandableStatisticListButtonModel.getExpandedTitle());
        String collapsedIcon = expandableStatisticListButtonModel.getCollapsedIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.TINY_CARET_DOWN;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            enumC16313m0 = null;
            if (i13 >= length) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), collapsedIcon)) {
                break;
            }
            i13++;
        }
        EnumC16313m0 enumC16313m3 = enumC16313m1 == null ? enumC16313m2 : enumC16313m1;
        String expandedIcon = expandableStatisticListButtonModel.getExpandedIcon();
        EnumC16313m0 enumC16313m4 = EnumC16313m0.TINY_CARET_UP;
        for (EnumC16313m0 enumC16313m5 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m5.name(), expandedIcon)) {
                enumC16313m0 = enumC16313m5;
                break;
            }
        }
        return new C36836b(textResourceM21278l, textResourceM21278l2, enumC16313m3, enumC16313m0 == null ? enumC16313m4 : enumC16313m0, null);
    }

    /* JADX INFO: renamed from: h */
    private static final C36838d m69181h(ExpandableStatisticListHeaderModel expandableStatisticListHeaderModel) {
        return new C36838d(AbstractC8693b.m21278l(expandableStatisticListHeaderModel.getTitle()), AbstractC8693b.m21278l(expandableStatisticListHeaderModel.getSubtitle()));
    }

    /* JADX INFO: renamed from: i */
    private static final C36840f m69182i(ExpandableStatisticListItemModel expandableStatisticListItemModel) {
        return new C36840f(new AbstractC22403o.c(expandableStatisticListItemModel.getIcon(), 0, 0, EnumC16313m0.ACTIVITY.toWhoopIcon(), 6, null), AbstractC8693b.m21278l(expandableStatisticListItemModel.getActivityNameDisplay()), AbstractC8693b.m21278l(expandableStatisticListItemModel.getAvgStrainDisplay()), AbstractC8693b.m21278l(expandableStatisticListItemModel.getActivityCountDisplay()), (float) expandableStatisticListItemModel.getBarFillPercentage(), m69183j(expandableStatisticListItemModel.getBarFillStyle()));
    }

    /* JADX INFO: renamed from: j */
    private static final EnumC36835a m69183j(String str) {
        if (AbstractC39421y.m125921F(str, "STRAIN", true)) {
            return EnumC36835a.STRAIN;
        }
        if (AbstractC39421y.m125921F(str, "RECOVERY", true)) {
            return EnumC36835a.RECOVERY;
        }
        return AbstractC39421y.m125921F(str, "SLEEP", true) ? EnumC36835a.SLEEP : EnumC36835a.NO_DATA;
    }
}
