package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.searchable.SearchableListModel;
import com.whoop.design.models.items.searchable.SearchableRowModel;
import com.whoop.design.models.items.searchable.SearchableSectionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import m31.C24997c;
import m31.C25000f;
import m31.C25004j;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.c4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/design/models/items/searchable/SearchableRowModel;", "Lm31/f;", "k", "(Lcom/whoop/design/models/items/searchable/SearchableRowModel;)Lm31/f;", "Lcom/whoop/design/models/items/searchable/SearchableSectionModel;", "Lm31/j;", "l", "(Lcom/whoop/design/models/items/searchable/SearchableSectionModel;)Lm31/j;", "Lcom/whoop/design/models/items/searchable/SearchableListModel;", "Lm31/c;", "j", "(Lcom/whoop/design/models/items/searchable/SearchableListModel;)Lm31/c;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "searchableMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23606c4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93701a = Function1.m68251a(new C23740x3(7));

    /* JADX INFO: renamed from: lb1.c4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93702w;

        public a(Function1 function1) {
            this.f93702w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93702w.invoke((SearchableRowModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.c4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93703w;

        public b(Function1 function1) {
            this.f93703w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93703w.invoke((SearchableSectionModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.c4$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93704w;

        public c(Function1 function1) {
            this.f93704w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93704w.invoke((SearchableListModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68591e() {
        return f93701a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m68592f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23740x3 c23740x3 = new C23740x3(8);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SearchableRowModel.class), new a(c23740x3));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SearchableSectionModel.class), new b(new C23740x3(9)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SearchableListModel.class), new c(new C23740x3(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C25000f m68593g(SearchableRowModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68597k(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C25004j m68594h(SearchableSectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68598l(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C24997c m68595i(SearchableListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68596j(model);
    }

    /* JADX INFO: renamed from: j */
    public static final C24997c m68596j(SearchableListModel searchableListModel) {
        AbstractC22676k.m65750j(searchableListModel, "<this>");
        InterfaceC25312u interfaceC25312uM60544l = AbstractC21537c.m60555e(null, 1, null).m60544l(searchableListModel.getEmptyResultsItem());
        List<SearchableSectionModel> sections = searchableListModel.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(m68598l((SearchableSectionModel) it.next()));
        }
        Boolean boolIsSearchActive = searchableListModel.isSearchActive();
        return new C24997c(interfaceC25312uM60544l, arrayList, boolIsSearchActive != null ? boolIsSearchActive.booleanValue() : false);
    }

    /* JADX INFO: renamed from: k */
    public static final C25000f m68597k(SearchableRowModel searchableRowModel) {
        AbstractC22676k.m65750j(searchableRowModel, "<this>");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        List<String> searchKeys = searchableRowModel.getSearchKeys();
        List<DesignSystemModel> items = searchableRowModel.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60544l = c21535aM60555e.m60544l((DesignSystemModel) it.next());
            if (interfaceC25312uM60544l != null) {
                arrayList.add(interfaceC25312uM60544l);
            }
        }
        return new C25000f(searchKeys, arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static final C25004j m68598l(SearchableSectionModel searchableSectionModel) {
        AbstractC22676k.m65750j(searchableSectionModel, "<this>");
        List<InterfaceC25312u> listM60545m = AbstractC21537c.m60555e(null, 1, null).m60545m(searchableSectionModel.getHeaderItems());
        List<SearchableRowModel> rows = searchableSectionModel.getRows();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(rows, 10));
        Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            arrayList.add(m68597k((SearchableRowModel) it.next()));
        }
        return new C25004j(listM60545m, arrayList, false, 4, null);
    }
}
