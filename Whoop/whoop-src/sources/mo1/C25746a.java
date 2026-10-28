package mo1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.anchorSelector.AnchorSectionModel;
import com.whoop.design.models.anchorSelector.AnchorSectionModelMappingKt;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.anchorSelector.SegmentedControlDisplayModel;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.models.items.SelectableCellListModel;
import com.whoop.design.models.items.SelectableCellModel;
import com.whoop.design.models.items.TrackedBehaviorModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse;
import com.whoop.hormonalinsights.logsymptoms.domain.models.NavigationBarButton;
import e51.C12729e;
import e51.C12738n;
import e51.C12740p;
import e51.EnumC12728d;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io1.C20745f;
import io1.InterfaceC20743d;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import lo1.C24618c;
import lo1.InterfaceC24616a;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mm1.C25694h;
import n83.C26463f;
import ny0.C27238a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import v41.AbstractC35667g0;

/* JADX INFO: renamed from: mo1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u001c*\u00020\u001b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006'"}, m65681d2 = {"Lmo1/a;", "", "Lmo1/d;", "trackedBehaviorReducer", "<init>", "(Lmo1/d;)V", "Lio1/d$b;", "Llo1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lio1/d$b;)Llo1/c;", "Lio1/d$e;", "Llo1/c$b;", "g", "(Lio1/d$e;)Llo1/c$b;", "Lio1/f;", "dialog", "i", "(Lio1/f;Llo1/c$b;)Llo1/c;", "", "", "b", "(Lio1/f;)Ljava/util/Map;", "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "selectionOverrides", "Le51/n;", "f", "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/Map;)Le51/n;", "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "Le51/e;", "e", "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/util/Map;)Le51/e;", "domainResult", "d", "(Lio1/f;)Llo1/c;", "a", "Lmo1/d;", "Ljb1/a;", "Ljb1/a;", "defaultReducer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25746a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25749d trackedBehaviorReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a defaultReducer;

    public C25746a(C25749d trackedBehaviorReducer) {
        AbstractC22676k.m65750j(trackedBehaviorReducer, "trackedBehaviorReducer");
        this.trackedBehaviorReducer = trackedBehaviorReducer;
        this.defaultReducer = AbstractC21537c.m60554d(new C25694h(20));
    }

    /* JADX INFO: renamed from: b */
    private final Map<String, String> m75955b(C20745f c20745f) {
        C26463f c26463f = new C26463f();
        String menstruation = c20745f.getMenstruation();
        if (menstruation != null) {
        }
        String cervicalMucus = c20745f.getCervicalMucus();
        if (cervicalMucus != null) {
            c26463f.put("cervical_mucus", cervicalMucus);
        }
        return c26463f.m78380b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m75956c(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00cc  */
    /* JADX INFO: renamed from: e */
    private final C12729e m75957e(AnchorSectionModel anchorSectionModel, Map<String, String> map) {
        EnumC12728d enumC12728d;
        InterfaceC25312u interfaceC25312uM60544l;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(anchorSectionModel.getTitle());
        String type = anchorSectionModel.getType();
        List<DesignSystemModel> items = anchorSectionModel.getItems();
        ArrayList arrayList = new ArrayList();
        for (DesignSystemModel designSystemModel : items) {
            if (designSystemModel instanceof TrackedBehaviorModel) {
                interfaceC25312uM60544l = this.trackedBehaviorReducer.m75978h((TrackedBehaviorModel) designSystemModel);
            } else if (designSystemModel instanceof SelectableCellListModel) {
                SelectableCellListModel selectableCellListModel = (SelectableCellListModel) designSystemModel;
                if (map.containsKey(selectableCellListModel.getId())) {
                    String str = map.get(selectableCellListModel.getId());
                    List<SelectableCellModel> cells = selectableCellListModel.getCells();
                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(cells, 10));
                    for (SelectableCellModel selectableCellModel : cells) {
                        arrayList2.add(SelectableCellModel.copy$default(selectableCellModel, null, null, null, null, null, false, null, AbstractC22676k.m65745e(selectableCellModel.getId(), str), false, false, null, null, null, null, null, null, null, null, 262015, null));
                    }
                    interfaceC25312uM60544l = this.defaultReducer.m60544l(SelectableCellListModel.copy$default(selectableCellListModel, null, 0, 0, arrayList2, null, null, null, null, false, null, null, null, 4087, null));
                } else {
                    interfaceC25312uM60544l = this.defaultReducer.m60544l(designSystemModel);
                }
            } else {
                interfaceC25312uM60544l = this.defaultReducer.m60544l(designSystemModel);
            }
            if (interfaceC25312uM60544l != null) {
                arrayList.add(interfaceC25312uM60544l);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC35667g0.m112970l((InterfaceC25312u) it.next(), true));
        }
        String spacingType = anchorSectionModel.getSpacingType();
        if (spacingType == null) {
            spacingType = "";
        }
        EnumC12728d enumC12728d2 = EnumC12728d.NORMAL;
        EnumC12728d[] enumC12728dArrValues = EnumC12728d.values();
        int length = enumC12728dArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC12728d = null;
                break;
            }
            enumC12728d = enumC12728dArrValues[i13];
            if (AbstractC22676k.m65745e(enumC12728d.name(), spacingType)) {
                break;
            }
            i13++;
        }
        return new C12729e(textResourceM21278l, type, arrayList3, enumC12728d == null ? enumC12728d2 : enumC12728d, AnchorSectionModelMappingKt.resolveTitleTypography(anchorSectionModel), AnchorSectionModelMappingKt.resolveAnchorSectionHeaderState(anchorSectionModel), AnchorSectionModelMappingKt.resolveLeadingPadding(anchorSectionModel), AnchorSectionModelMappingKt.resolveTrailingPadding(anchorSectionModel), null);
    }

    /* JADX INFO: renamed from: f */
    private final C12738n m75958f(AnchorSelectorModel anchorSelectorModel, Map<String, String> map) {
        List<SegmentedControlDisplayModel> tags = anchorSelectorModel.getTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tags, 10));
        for (SegmentedControlDisplayModel segmentedControlDisplayModel : tags) {
            arrayList.add(new C12740p(segmentedControlDisplayModel.getNameDisplay(), segmentedControlDisplayModel.getId(), null, 4, null));
        }
        List<AnchorSectionModel> items = anchorSelectorModel.getItems();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList2.add(m75957e((AnchorSectionModel) it.next(), map));
        }
        SegmentedControlDisplayModel segmentedControlDisplayModel2 = (SegmentedControlDisplayModel) AbstractC25265s.m74100H0(anchorSelectorModel.getTags());
        return new C12738n(arrayList, arrayList2, segmentedControlDisplayModel2 != null ? segmentedControlDisplayModel2.getId() : null, null, 0.0f, 24, null);
    }

    /* JADX INFO: renamed from: g */
    private final C24618c.b m75959g(InterfaceC20743d.e eVar) {
        if (!(eVar instanceof InterfaceC20743d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C24618c.b(AbstractC8693b.m21278l("title"), AbstractC8693b.m21278l("Confirm"), null, AbstractC8693b.m21278l("Cancel"), AbstractC8693b.m21278l("description"), true, true, EnumC21213p.LOTTIE, null, null, 4, null);
    }

    /* JADX INFO: renamed from: h */
    private final C24618c m75960h(InterfaceC20743d.b bVar) {
        if (bVar instanceof InterfaceC20743d.c) {
            return new C24618c(null, new C24618c.a(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC20743d.d) {
            return new C24618c(null, new C24618c.a(C33205o0.f138451a.m105289c(), new InterfaceC24616a.g(null), null, InterfaceC24616a.d.f96255a, 4, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC20743d.f) {
            return new C24618c(null, new C24618c.a(C33205o0.f138451a.m105291e(), new InterfaceC24616a.g(null), null, InterfaceC24616a.d.f96255a, 4, null), null, 5, null);
        }
        if (!(bVar instanceof InterfaceC20743d.g)) {
            throw new NoWhenBranchMatchedException();
        }
        C33211q0 c33211q0M105293g = C33205o0.f138451a.m105293g();
        InterfaceC24616a.d dVar = InterfaceC24616a.d.f96255a;
        return new C24618c(null, new C24618c.a(c33211q0M105293g, dVar, null, dVar, 4, null), null, 5, null);
    }

    /* JADX INFO: renamed from: i */
    private final C24618c m75961i(C20745f c20745f, C24618c.b bVar) {
        C24618c.e eVar;
        LogSymptomsResponse response = c20745f.getResponse();
        C24618c.d dVar = null;
        EnumC16313m0 enumC16313m0 = null;
        if (response != null) {
            String title = response.getNavigationBar().getTitle();
            NavigationBarButton rightButton = response.getNavigationBar().getRightButton();
            boolean z4 = false;
            if (rightButton != null) {
                String icon = rightButton.getIcon();
                for (EnumC16313m0 enumC16313m1 : EnumC16313m0.values()) {
                    if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                        enumC16313m0 = enumC16313m1;
                        break;
                    }
                }
                dVar = new C24618c.d(enumC16313m0);
            }
            C24618c.c cVar = new C24618c.c(title, dVar);
            String title2 = response.getTitle();
            C12738n c12738nM75958f = m75958f(response.getCategorySelector(), m75955b(c20745f));
            CyclePhaseStyle style = response.getStyle();
            C27238a0 c27238a0 = new C27238a0(AbstractC8693b.m21278l(response.getPrimaryButton().getTextDisplay()), null, null, null, 0.0f, null, null, null, false, false, 1022, null);
            if (!c20745f.getManualRefresh() && c20745f.getDisplayRefreshingSpinner()) {
                z4 = true;
            }
            eVar = new C24618c.e(cVar, title2, c12738nM75958f, style, c27238a0, z4);
        } else {
            eVar = null;
        }
        return new C24618c(bVar, null, eVar, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final C24618c m75962d(C20745f domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC20743d currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC20743d.b) {
            return m75960h((InterfaceC20743d.b) domainResult.getCurrentDialogType());
        }
        return currentDialogType instanceof InterfaceC20743d.e ? m75961i(domainResult, m75959g((InterfaceC20743d.e) domainResult.getCurrentDialogType())) : m75961i(domainResult, null);
    }
}
