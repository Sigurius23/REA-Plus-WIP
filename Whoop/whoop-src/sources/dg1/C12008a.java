package dg1;

import ag1.AbstractC0862d;
import ag1.AbstractC0863e;
import ag1.C0860b;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.FlowRowModel;
import com.whoop.filteredlist.domain.model.FilteredListResponse;
import dc0.C11902d;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p736sz0.C33198m;
import u11.C34438d;

/* JADX INFO: renamed from: dg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ldg1/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lag1/b;", "domainState", "Lu11/d;", "c", "(Lag1/b;)Lu11/d;", "a", "Ljb1/a;", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12008a {

    /* JADX INFO: renamed from: b */
    public static final int f39678b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: dg1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            C17750h1 c17750h1M50901b;
            AbstractC22676k.m65750j(it, "it");
            C33198m c33198m = (C33198m) it;
            List<InterfaceC25312u> listM105207e = c33198m.m105207e();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM105207e, 10));
            for (InterfaceC25312u interfaceC25312u : listM105207e) {
                C17750h1 c17750h1 = interfaceC25312u instanceof C17750h1 ? (C17750h1) interfaceC25312u : null;
                if (c17750h1 != null) {
                    C17750h1 c17750h2 = c17750h1.getTagStyle() == EnumC17775o1.JOURNAL ? c17750h1 : null;
                    if (c17750h2 != null && (c17750h1M50901b = C17750h1.m50901b(c17750h2, null, null, null, null, null, null, null, null, false, null, ((float) 1.2d) * 8, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4193279, null)) != null) {
                        interfaceC25312u = c17750h1M50901b;
                    }
                }
                arrayList.add(interfaceC25312u);
            }
            return C33198m.m105204b(c33198m, arrayList, null, 0.0f, 6, null);
        }
    }

    public C12008a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m33119b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33198m.class), new a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final C34438d m33120c(C0860b domainState) {
        List<C25306o> listM60543j;
        List<DesignSystemModel> items;
        List<C25306o> listM60543j2;
        AbstractC22676k.m65750j(domainState, "domainState");
        FilteredListResponse filteredListResponseM2080d = domainState.getData();
        DesignSystemModel filters = filteredListResponseM2080d != null ? filteredListResponseM2080d.getFilters() : null;
        C25306o c25306oM60542i = filters != null ? this.designItemReducer.m60542i(filters) : null;
        DesignSystemModel designSystemModelUnwrap = filters != null ? DesignSystemModelKt.unwrap(filters) : null;
        FlowRowModel flowRowModel = designSystemModelUnwrap instanceof FlowRowModel ? (FlowRowModel) designSystemModelUnwrap : null;
        C25271y c25271y = C25271y.f99162w;
        C25272z c25272z = C25272z.f99163w;
        List<C25306o> list = (flowRowModel == null || (items = flowRowModel.getItems()) == null || (listM60543j2 = this.designItemReducer.m60543j(items, c25272z)) == null) ? c25271y : listM60543j2;
        FilteredListResponse filteredListResponseM2080d2 = domainState.getData();
        List<C25306o> list2 = (filteredListResponseM2080d2 == null || (listM60543j = this.designItemReducer.m60543j(filteredListResponseM2080d2.getItems(), c25272z)) == null) ? c25271y : listM60543j;
        AbstractC0862d abstractC0862dM2081e = domainState.getItemActionState();
        AbstractC0862d.a aVar = abstractC0862dM2081e instanceof AbstractC0862d.a ? (AbstractC0862d.a) abstractC0862dM2081e : null;
        return new C34438d(domainState.getIsLoading(), domainState.getIsError(), domainState.getIsFilterLoading(), c25306oM60542i, list, list2, domainState.getItemActionState() instanceof AbstractC0862d.b, aVar != null ? aVar.getMessage() : null, aVar != null ? aVar.getAction() : null, domainState.getNextPageRequest() != null, domainState.getPaginationState() instanceof AbstractC0863e.c, domainState.getPaginationState() instanceof AbstractC0863e.a, domainState.getPaginationErrorMessage(), domainState.getPaginationRetryActionText(), domainState.getLoadMoreEpoch());
    }

    public /* synthetic */ C12008a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60554d(new C11902d(29)) : c21535a);
    }
}
