package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SelectableCellListModel;
import com.whoop.design.models.items.SelectableCellListModelKt;
import com.whoop.design.models.items.SelectableCellListSearchBehavior;
import com.whoop.design.models.items.SelectableCellModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import n01.C26088e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import ry0.C31909d;

/* JADX INFO: renamed from: lb1.g4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n*\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectableCellListModel;", "Ln01/e;", "e", "(Lcom/whoop/design/models/items/SelectableCellListModel;)Ln01/e;", "", "Lcom/whoop/design/models/items/SelectableCellModel;", "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;", "searchBehavior", "", "keyword", "", "c", "(Ljava/util/List;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;Ljava/lang/String;)Ljava/util/Set;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "selectableCellListItemMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23634g4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93773a = Function1.m68251a(new C23740x3(19));

    /* JADX INFO: renamed from: lb1.g4$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93774a;

        static {
            int[] iArr = new int[SelectableCellListSearchBehavior.values().length];
            try {
                iArr[SelectableCellListSearchBehavior.HIDE_WHILE_SEARCHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectableCellListSearchBehavior.MATCHES_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectableCellListSearchBehavior.MATCHES_OR_SELECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93774a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.g4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93775w;

        public b(Function1 function1) {
            this.f93775w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93775w.invoke((SelectableCellListModel) it);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX INFO: renamed from: c */
    private static final Set<String> m68803c(List<SelectableCellModel> list, SelectableCellListSearchBehavior selectableCellListSearchBehavior, String str) {
        ArrayList arrayList;
        SelectableCellModel selectableCellModel;
        if (str == null || str.length() == 0) {
            return C25235a0.f99113w;
        }
        int i13 = selectableCellListSearchBehavior == null ? -1 : a.f93774a[selectableCellListSearchBehavior.ordinal()];
        if (i13 == -1) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                selectableCellModel = (SelectableCellModel) obj;
                if (SelectableCellListModelKt.matchesSearch(selectableCellModel, str) && !selectableCellModel.getSelected()) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        } else if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = new ArrayList();
                while (r3.hasNext()) {
                    selectableCellModel = (SelectableCellModel) obj;
                    if (SelectableCellListModelKt.matchesSearch(selectableCellModel, str)) {
                    }
                }
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!SelectableCellListModelKt.matchesSearch((SelectableCellModel) obj2, str)) {
                        arrayList.add(obj2);
                    }
                }
            }
            list = arrayList;
        }
        List<SelectableCellModel> list2 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SelectableCellModel) it.next()).getId());
        }
        return AbstractC25265s.m74103I1(arrayList2);
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68804d() {
        return f93773a;
    }

    /* JADX INFO: renamed from: e */
    private static final C26088e m68805e(SelectableCellListModel selectableCellListModel) {
        String id4 = selectableCellListModel.getId();
        int maxSelection = selectableCellListModel.getMaxSelection();
        int minSelection = selectableCellListModel.getMinSelection();
        List<SelectableCellModel> cells = selectableCellListModel.getCells();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cells, 10));
        Iterator<T> it = cells.iterator();
        while (it.hasNext()) {
            C31909d c31909dM68845d = AbstractC23641h4.m68845d((SelectableCellModel) it.next());
            arrayList.add(c31909dM68845d.m99205a((32639 & 1) != 0 ? c31909dM68845d.id : null, (32639 & 2) != 0 ? c31909dM68845d.title : null, (32639 & 4) != 0 ? c31909dM68845d.subtitle : null, (32639 & 8) != 0 ? c31909dM68845d.leftIcon : null, (32639 & 16) != 0 ? c31909dM68845d.leftImage : null, (32639 & 32) != 0 ? c31909dM68845d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909dM68845d.selectionStyle : null, (32639 & 128) != 0 ? c31909dM68845d.selected : false, (32639 & 256) != 0 ? c31909dM68845d.showCheckbox : false, (32639 & 512) != 0 ? c31909dM68845d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909dM68845d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909dM68845d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909dM68845d.isDisabled : c31909dM68845d.getIsDisabled() || selectableCellListModel.isDisabled(), (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909dM68845d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909dM68845d.sectionTitle : null));
        }
        return new C26088e(id4, maxSelection, minSelection, arrayList, m68803c(selectableCellListModel.getCells(), selectableCellListModel.getSearchBehavior(), selectableCellListModel.getSearchQuery()), selectableCellListModel.getStateUpdateValueKey(), selectableCellListModel.isDisabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m68806f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SelectableCellListModel.class), new b(new C23740x3(20)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C26088e m68807g(SelectableCellListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68805e(model);
    }
}
