package e02;

import c02.AbstractC3811b;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.ExpandableContentModel;
import com.whoop.design.models.items.SegmentedContentModel;
import com.whoop.nativestore.pdp.domain.model.ProductSizeGuideResponse;
import do0.C12229c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import n83.C26460c;
import p392p3.C28780r;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import v51.C35704c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e02.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Le02/h;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;", "", "Lcom/whoop/design/models/DesignSystemModel;", "e", "(Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;)Ljava/util/List;", "Lm91/u;", "c", "(Lm91/u;)Lm91/u;", "Lc02/b;", "domainResult", "Le02/g;", "d", "(Lc02/b;)Le02/g;", "a", "Ljb1/a;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12512h {

    /* JADX INFO: renamed from: b */
    public static final int f42717b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C12512h(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m35156b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC25312u m35157c(InterfaceC25312u interfaceC25312u) {
        if (!(interfaceC25312u instanceof C35704c)) {
            return interfaceC25312u;
        }
        C28780r c28780r = C28780r.f116544x;
        return C35704c.m113165b((C35704c) interfaceC25312u, null, null, null, null, C28780r.f116543J, true, null, false, null, null, null, null, null, 8143, null);
    }

    /* JADX INFO: renamed from: e */
    private final List<DesignSystemModel> m35158e(ProductSizeGuideResponse productSizeGuideResponse) {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        SegmentedContentModel segmentedContentTile = productSizeGuideResponse.getSegmentedContentTile();
        if (segmentedContentTile != null) {
            c26460cM119000x.add(segmentedContentTile);
        }
        DividerModel divider = productSizeGuideResponse.getDivider();
        if (divider != null) {
            c26460cM119000x.add(divider);
        }
        ExpandableContentModel expandableContent = productSizeGuideResponse.getExpandableContent();
        if (expandableContent != null) {
            c26460cM119000x.add(expandableContent);
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: d */
    public final C12511g m35159d(AbstractC3811b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult.equals(AbstractC3811b.c.f15624a)) {
            return new C12511g(true, false, null, 6, null);
        }
        if (domainResult.equals(AbstractC3811b.a.f15621a)) {
            return new C12511g(false, true, null, 5, null);
        }
        if (!(domainResult instanceof AbstractC3811b.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC3811b.b bVar = (AbstractC3811b.b) domainResult;
        List<InterfaceC25312u> listM60545m = this.designItemReducer.m60545m(m35158e(bVar.getResponse()));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60545m, 10));
        Iterator<T> it = listM60545m.iterator();
        while (it.hasNext()) {
            arrayList.add(m35157c((InterfaceC25312u) it.next()));
        }
        if (!arrayList.isEmpty()) {
            return new C12511g(false, false, new C12505a(bVar.getResponse().getTitle(), bVar.getResponse().getSubtitle(), bVar.getResponse().getDescription(), arrayList), 3, null);
        }
        return new C12511g(false, true, null, 5, null);
    }

    public /* synthetic */ C12512h(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60554d(new C12229c(16)) : c21535a);
    }
}
