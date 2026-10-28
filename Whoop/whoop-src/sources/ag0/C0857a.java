package ag0;

import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.AdvanceLabsPurchaseAddOnsStickyModel;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.PurchaseAddOnsModels;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.PurchaseAddOnsSectionModel;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.PurchaseAddOnsSectionSpacingType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import q31.C29943a;
import q31.C29948f;
import wf0.C37240c;
import wf0.InterfaceC37238a;
import zf0.C40611c;
import zf0.InterfaceC40609a;

/* JADX INFO: renamed from: ag0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\n*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015*\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"¨\u0006#"}, m65681d2 = {"Lag0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lwf0/a$b;", "", "source", "testCount", "Lzf0/c;", "e", "(Lwf0/a$b;Ljava/lang/String;Ljava/lang/String;)Lzf0/c;", "Lwf0/a$e;", "Lzf0/c$c;", "d", "(Lwf0/a$e;)Lzf0/c$c;", "Lwf0/c;", "dialog", "f", "(Lwf0/c;Lzf0/c$c;)Lzf0/c;", "", "Lcom/whoop/design/models/DesignSystemModel;", "models", "Lm91/u;", "a", "(Lwf0/c;Ljava/util/List;)Ljava/util/List;", "spacing", "Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;", "b", "(Ljava/lang/String;)Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;", "domainResult", "c", "(Lwf0/c;)Lzf0/c;", "Ljb1/a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0857a {

    /* JADX INFO: renamed from: b */
    public static final int f3064b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C0857a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC25312u> m2065a(C37240c c37240c, List<? extends DesignSystemModel> list) {
        List<InterfaceC25312u> listM60540g = this.reducer.m60540g(list);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60540g, 10));
        for (Object objM91609b : listM60540g) {
            if (objM91609b instanceof C29948f) {
                C29948f c29948f = (C29948f) objM91609b;
                Iterator<C29943a> it = c29948f.m91612e().iterator();
                int initiallySelectedSegmentIndex = 0;
                while (true) {
                    if (!it.hasNext()) {
                        initiallySelectedSegmentIndex = -1;
                        break;
                    }
                    if (AbstractC22676k.m65745e(it.next().getId(), c37240c.getSelectedSegmentId())) {
                        break;
                    }
                    initiallySelectedSegmentIndex++;
                }
                if (initiallySelectedSegmentIndex < 0) {
                    initiallySelectedSegmentIndex = c29948f.getInitiallySelectedSegmentIndex();
                }
                objM91609b = C29948f.m91609b(c29948f, null, null, initiallySelectedSegmentIndex, null, false, 27, null);
            }
            arrayList.add(objM91609b);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final PurchaseAddOnsSectionSpacingType m2066b(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return PurchaseAddOnsSectionSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? PurchaseAddOnsSectionSpacingType.COMPACT : PurchaseAddOnsSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: d */
    private final C40611c.c m2067d(InterfaceC37238a.e eVar) {
        if (!(eVar instanceof InterfaceC37238a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C40611c.c(AbstractC8693b.m21278l("title"), AbstractC8693b.m21278l("Confirm"), null, AbstractC8693b.m21278l("Cancel"), AbstractC8693b.m21278l("description"), true, true, EnumC21213p.LOTTIE, null, null, 4, null);
    }

    /* JADX INFO: renamed from: e */
    private final C40611c m2068e(InterfaceC37238a.b bVar, String str, String str2) {
        if (bVar instanceof InterfaceC37238a.c) {
            return new C40611c(null, new C40611c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC37238a.d) {
            return new C40611c(null, new C40611c.b(C33205o0.f138451a.m105289c(), new InterfaceC40609a.h(str, str2), null, InterfaceC40609a.d.f174975a, 4, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC37238a.f) {
            return new C40611c(null, new C40611c.b(C33205o0.f138451a.m105291e(), new InterfaceC40609a.h(str, str2), null, InterfaceC40609a.d.f174975a, 4, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX INFO: renamed from: f */
    private final C40611c m2069f(C37240c c37240c, C40611c.c cVar) {
        TextResource textResourceM21267a;
        ?? arrayList;
        List<PurchaseAddOnsSectionModel> sections;
        PurchaseAddOnsSectionSpacingType purchaseAddOnsSectionSpacingTypeM2066b;
        String toolBarTitle;
        Map<String, AdvanceLabsPurchaseAddOnsStickyModel> bottomStickyItems;
        PurchaseAddOnsModels response = c37240c.getResponse();
        AdvanceLabsPurchaseAddOnsStickyModel advanceLabsPurchaseAddOnsStickyModel = (response == null || (bottomStickyItems = response.getBottomStickyItems()) == null) ? null : bottomStickyItems.get(c37240c.getSelectedSegmentId());
        C40611c.e eVar = advanceLabsPurchaseAddOnsStickyModel != null ? new C40611c.e(advanceLabsPurchaseAddOnsStickyModel.getText(), m2065a(c37240c, advanceLabsPurchaseAddOnsStickyModel.getItems())) : null;
        PurchaseAddOnsModels response2 = c37240c.getResponse();
        if (response2 == null || (toolBarTitle = response2.getToolBarTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(toolBarTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        PurchaseAddOnsModels response3 = c37240c.getResponse();
        if (response3 == null || (sections = response3.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<PurchaseAddOnsSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (PurchaseAddOnsSectionModel purchaseAddOnsSectionModel : list) {
                String sectionType = purchaseAddOnsSectionModel.getSectionType();
                if (sectionType == null || (purchaseAddOnsSectionSpacingTypeM2066b = m2066b(sectionType)) == null) {
                    purchaseAddOnsSectionSpacingTypeM2066b = PurchaseAddOnsSectionSpacingType.COMPACT;
                }
                arrayList.add(new C40611c.a(m2065a(c37240c, purchaseAddOnsSectionModel.getItems()), purchaseAddOnsSectionSpacingTypeM2066b));
            }
        }
        return new C40611c(cVar, null, new C40611c.d(textResource, arrayList, !c37240c.getManualRefresh() && c37240c.getDisplayRefreshingSpinner(), eVar, c37240c.getSelectedSegmentId(), c37240c.getSource()), 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final C40611c m2070c(C37240c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC37238a currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC37238a.b) {
            return m2068e((InterfaceC37238a.b) domainResult.getCurrentDialogType(), domainResult.getSource(), domainResult.getSelectedSegmentId());
        }
        return currentDialogType instanceof InterfaceC37238a.e ? m2069f(domainResult, m2067d((InterfaceC37238a.e) domainResult.getCurrentDialogType())) : m2069f(domainResult, null);
    }

    public /* synthetic */ C0857a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC0858b.f3066a : c21535a);
    }
}
