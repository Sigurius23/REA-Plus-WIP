package tw0;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.GoalSettingsTileTagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import km0.C22580d;
import km0.C22581e;
import km0.C22582f;
import km0.C22583g;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23699q4;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import sw0.C33045b;
import sw0.C33050g;
import sw0.C33052i;
import sw0.C33053j;
import wb3.AbstractC37056f;
import wr2.AbstractC37575c;

/* JADX INFO: renamed from: tw0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0010JW\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ltw0/a;", "", "<init>", "()V", "Lsw0/g;", "", "category", "", "Lsw0/i;", "a", "(Lsw0/g;Ljava/lang/String;)Ljava/util/List;", "", "d", "(Lsw0/g;Ljava/lang/String;)Z", "bottomSheet", "b", "(Lsw0/g;)Ljava/util/List;", "c", "searchedGroupedToggles", "searchedPagedGroupedToggles", "performFuzzySearch", "Lsw0/j;", "removedWeeklyPlanBehaviors", "Lkm0/e;", "e", "(Lsw0/g;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lkm0/e;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34215a {

    /* JADX INFO: renamed from: tw0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((C33052i) t14).getGroupPriority()), Integer.valueOf(((C33052i) t15).getGroupPriority()));
        }
    }

    /* JADX INFO: renamed from: tw0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(((C33053j) t14).m104665r(), ((C33053j) t15).m104665r());
        }
    }

    /* JADX INFO: renamed from: tw0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((C33053j) t14).getSortPriority()), Integer.valueOf(((C33053j) t15).getSortPriority()));
        }
    }

    /* JADX INFO: renamed from: tw0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Comparator f143523w;

        public d(Comparator comparator) {
            this.f143523w = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            int iCompare = this.f143523w.compare(t14, t15);
            return iCompare != 0 ? iCompare : AbstractC30060g.m92127q(((C33053j) t14).m104665r(), ((C33053j) t15).m104665r());
        }
    }

    /* JADX INFO: renamed from: a */
    private final List<C33052i> m108142a(C33050g c33050g, String str) {
        DesignSystemModel customBehaviorsEmptyState = c33050g.getCustomBehaviorsEmptyState();
        C25271y c25271y = C25271y.f99162w;
        if (customBehaviorsEmptyState != null) {
            if (!m108143d(c33050g, str)) {
                customBehaviorsEmptyState = null;
            }
            if (customBehaviorsEmptyState != null) {
                return AbstractC37056f.m118958J(new C33052i(AbstractC8693b.m21267a(), 0, c25271y, customBehaviorsEmptyState));
            }
        }
        return c25271y;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m108143d(C33050g c33050g, String str) {
        List<C33052i> listM104635j = c33050g.m104635j();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM104635j.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C33052i) it.next()).m104651f());
        }
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((C33053j) it3.next()).getIsCustom()) {
                    return false;
                }
            }
        }
        Object obj = null;
        Object obj2 = null;
        for (Object obj3 : c33050g.m104629d()) {
            String str2 = (String) obj3;
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (((C33053j) it4.next()).m104656i().contains(str2)) {
                        }
                    }
                }
            }
            if (z4) {
                return AbstractC22676k.m65745e(obj, str);
            }
            z4 = true;
            obj2 = obj3;
        }
        if (z4) {
            obj = obj2;
        }
        return AbstractC22676k.m65745e(obj, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C22581e m108144f(C34215a c34215a, C33050g c33050g, List list, List list2, String str, List list3, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            list2 = null;
        }
        if ((i13 & 8) != 0) {
            str = null;
        }
        if ((i13 & 16) != 0) {
            list3 = C25271y.f99162w;
        }
        return c34215a.m108147e(c33050g, list, list2, str, list3);
    }

    /* JADX INFO: renamed from: b */
    public final List<C33052i> m108145b(C33050g bottomSheet) {
        List list;
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = bottomSheet.m104635j().iterator();
        while (it.hasNext()) {
            List<C33053j> listM104651f = ((C33052i) it.next()).m104651f();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listM104651f) {
                C33053j c33053j = (C33053j) obj;
                if (c33053j.m104656i().contains(bottomSheet.getCurrentCategory()) && bottomSheet.m104636k().contains(c33053j.getId())) {
                    arrayList3.add(obj);
                }
            }
            List listM74152u1 = AbstractC25265s.m74152u1(arrayList3, new b());
            if (!bottomSheet.m104634i().isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : listM74152u1) {
                    C33053j c33053j2 = (C33053j) obj2;
                    List<Integer> listM104634i = bottomSheet.m104634i();
                    ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(listM104634i, 10));
                    Iterator<T> it3 = listM104634i.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(String.valueOf(((Number) it3.next()).intValue()));
                    }
                    if (arrayList5.contains(c33053j2.getId())) {
                        arrayList4.add(obj2);
                    }
                }
                listM74152u1 = arrayList4;
            } else if (bottomSheet.getSearchQuery().length() > 0) {
                listM74152u1 = AbstractC37575c.m120636o(listM74152u1, bottomSheet.getSearchQuery(), null, 2, null);
            }
            arrayList.addAll(listM74152u1);
        }
        if (!arrayList.isEmpty()) {
            arrayList2.add(new C33052i(AbstractC8693b.m21267a(), -1, arrayList, null, 8, null));
        }
        List<C33052i> listM104635j = bottomSheet.m104635j();
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(listM104635j, 10));
        for (C33052i c33052i : listM104635j) {
            List<C33053j> listM104651f2 = c33052i.m104651f();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : listM104651f2) {
                C33053j c33053j3 = (C33053j) obj3;
                if (c33053j3.m104656i().contains(bottomSheet.getCurrentCategory()) && !bottomSheet.m104636k().contains(c33053j3.getId())) {
                    arrayList7.add(obj3);
                }
            }
            List listM74152u2 = AbstractC25265s.m74152u1(arrayList7, new d(new c()));
            if (bottomSheet.m104634i().isEmpty()) {
                if (bottomSheet.getSearchQuery().length() > 0) {
                    listM74152u2 = AbstractC37575c.m120636o(listM74152u2, bottomSheet.getSearchQuery(), null, 2, null);
                }
                list = listM74152u2;
            } else {
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : listM74152u2) {
                    C33053j c33053j4 = (C33053j) obj4;
                    List<Integer> listM104634i2 = bottomSheet.m104634i();
                    ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(listM104634i2, 10));
                    Iterator<T> it4 = listM104634i2.iterator();
                    while (it4.hasNext()) {
                        arrayList9.add(String.valueOf(((Number) it4.next()).intValue()));
                    }
                    if (arrayList9.contains(c33053j4.getId())) {
                        arrayList8.add(obj4);
                    }
                }
                list = arrayList8;
            }
            if (!list.isEmpty()) {
                arrayList2.add(new C33052i(c33052i.getTitle(), c33052i.getGroupPriority(), list, null, 8, null));
            }
            arrayList6.add(C23454a0.f92919a);
        }
        return arrayList2.isEmpty() ? m108142a(bottomSheet, bottomSheet.getCurrentCategory()) : AbstractC25265s.m74152u1(arrayList2, new a());
    }

    /* JADX INFO: renamed from: c */
    public final List<List<C33052i>> m108146c(C33050g bottomSheet) {
        C33050g bottomSheet2 = bottomSheet;
        AbstractC22676k.m65750j(bottomSheet2, "bottomSheet");
        List<String> listM104629d = bottomSheet2.m104629d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM104629d, 10));
        for (Iterator it = listM104629d.iterator(); it.hasNext(); it = it) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(m108145b(C33050g.m104626b(bottomSheet2, null, null, null, null, (String) it.next(), null, null, null, null, null, null, null, 4079, null)));
            bottomSheet2 = bottomSheet;
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: e */
    public final C22581e m108147e(C33050g bottomSheet, List<C33052i> searchedGroupedToggles, List<? extends List<C33052i>> searchedPagedGroupedToggles, String performFuzzySearch, List<C33053j> removedWeeklyPlanBehaviors) {
        ?? arrayList;
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        AbstractC22676k.m65750j(searchedGroupedToggles, "searchedGroupedToggles");
        AbstractC22676k.m65750j(removedWeeklyPlanBehaviors, "removedWeeklyPlanBehaviors");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bottomSheet.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bottomSheet.getSearchQuery());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(bottomSheet.getSearchTitle());
        List<String> listM104629d = bottomSheet.m104629d();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104629d, 10));
        Iterator it = listM104629d.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC8693b.m21278l((String) it.next()));
        }
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(bottomSheet.getCurrentCategory());
        List<C33052i> list = searchedGroupedToggles;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C33052i c33052i = (C33052i) it3.next();
            TextResource title = c33052i.getTitle();
            DesignSystemModel emptyState = c33052i.getEmptyState();
            InterfaceC25312u interfaceC25312uM60544l = emptyState != null ? AbstractC34216b.f143526c.m60544l(emptyState) : null;
            List<C33053j> listM104651f = c33052i.m104651f();
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
            for (C33053j c33053j : listM104651f) {
                GoalSettingsTileTagModel tag = c33053j.getTag();
                C17750h1 c17750h1M69323m = tag != null ? AbstractC23699q4.m69323m(tag) : null;
                String id4 = c33053j.getId();
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(c33053j.m104665r());
                boolean isSelected = c33053j.getIsSelected();
                String iconUrl = c33053j.getIconUrl();
                AbstractC22403o.c cVar = iconUrl != null ? new AbstractC22403o.c(iconUrl, 0, 0, 0, 14, null) : null;
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(c33053j.getSubtitle());
                Iterator it4 = it3;
                List<String> listM104656i = c33053j.m104656i();
                TextResource textResource = textResourceM21278l4;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(listM104656i, 10));
                Iterator it5 = listM104656i.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(AbstractC8693b.m21278l((String) it5.next()));
                }
                arrayList4.add(new C22580d(id4, textResourceM21278l5, isSelected, cVar, textResourceM21278l6, arrayList5, AbstractC8693b.m21278l(c33053j.getAvoidanceText()), c33053j.getWeeklyPlanGoal(), c17750h1M69323m, AbstractC34216b.m108150c(c33053j, c17750h1M69323m)));
                textResourceM21278l4 = textResource;
                it3 = it4;
            }
            arrayList3.add(new C22583g(title, arrayList4, interfaceC25312uM60544l));
            it3 = it3;
        }
        TextResource textResource2 = textResourceM21278l4;
        if (searchedPagedGroupedToggles != null) {
            List<? extends List<C33052i>> list2 = searchedPagedGroupedToggles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                List list3 = (List) it6.next();
                ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                Iterator it7 = list3.iterator();
                while (it7.hasNext()) {
                    C33052i c33052i2 = (C33052i) it7.next();
                    TextResource title2 = c33052i2.getTitle();
                    DesignSystemModel emptyState2 = c33052i2.getEmptyState();
                    InterfaceC25312u interfaceC25312uM60544l2 = emptyState2 != null ? AbstractC34216b.f143526c.m60544l(emptyState2) : null;
                    List<C33053j> listM104651f2 = c33052i2.m104651f();
                    ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(listM104651f2, 10));
                    for (C33053j c33053j2 : listM104651f2) {
                        GoalSettingsTileTagModel tag2 = c33053j2.getTag();
                        C17750h1 c17750h1M69323m2 = tag2 != null ? AbstractC23699q4.m69323m(tag2) : null;
                        String id5 = c33053j2.getId();
                        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(c33053j2.m104665r());
                        boolean isSelected2 = c33053j2.getIsSelected();
                        String iconUrl2 = c33053j2.getIconUrl();
                        AbstractC22403o.c cVar2 = iconUrl2 != null ? new AbstractC22403o.c(iconUrl2, 0, 0, 0, 14, null) : null;
                        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(c33053j2.getSubtitle());
                        Iterator it8 = it6;
                        List<String> listM104656i2 = c33053j2.m104656i();
                        Iterator it9 = it7;
                        ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(listM104656i2, 10));
                        Iterator it10 = listM104656i2.iterator();
                        while (it10.hasNext()) {
                            arrayList8.add(AbstractC8693b.m21278l((String) it10.next()));
                        }
                        C17750h1 c17750h1 = c17750h1M69323m2;
                        arrayList7.add(new C22580d(id5, textResourceM21278l7, isSelected2, cVar2, textResourceM21278l8, arrayList8, AbstractC8693b.m21278l(c33053j2.getAvoidanceText()), c33053j2.getWeeklyPlanGoal(), c17750h1, AbstractC34216b.m108150c(c33053j2, c17750h1)));
                        it6 = it8;
                        it7 = it9;
                    }
                    arrayList6.add(new C22583g(title2, arrayList7, interfaceC25312uM60544l2));
                    it6 = it6;
                }
                arrayList.add(arrayList6);
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        ?? r10 = arrayList;
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(bottomSheet.getButtonTitle());
        C33045b confirmationModal = bottomSheet.getConfirmationModal();
        C22582f c22582f = confirmationModal != null ? new C22582f(confirmationModal.getTitle(), confirmationModal.getSubtitle(), AbstractC8693b.m21278l(confirmationModal.getPrimaryButtonText()), AbstractC8693b.m21278l(confirmationModal.getSecondaryButtonText())) : null;
        List<C33053j> list4 = removedWeeklyPlanBehaviors;
        ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        for (C33053j c33053j3 : list4) {
            String id6 = c33053j3.getId();
            TextResource textResourceM21278l10 = AbstractC8693b.m21278l(c33053j3.m104665r());
            boolean isSelected3 = c33053j3.getIsSelected();
            String iconUrl3 = c33053j3.getIconUrl();
            AbstractC22403o.c cVar3 = iconUrl3 != null ? new AbstractC22403o.c(iconUrl3, 0, 0, 0, 14, null) : null;
            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(c33053j3.getSubtitle());
            List<String> listM104656i3 = c33053j3.m104656i();
            ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(listM104656i3, 10));
            Iterator it11 = listM104656i3.iterator();
            while (it11.hasNext()) {
                arrayList10.add(AbstractC8693b.m21278l((String) it11.next()));
            }
            arrayList9.add(new C22580d(id6, textResourceM21278l10, isSelected3, cVar3, textResourceM21278l11, arrayList10, AbstractC8693b.m21278l(c33053j3.getAvoidanceText()), c33053j3.getWeeklyPlanGoal(), null, AbstractC34216b.m108150c(c33053j3, null), 256, null));
        }
        DesignSystemModel customBehaviorsWidget = bottomSheet.getCustomBehaviorsWidget();
        return new C22581e(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, arrayList2, textResource2, arrayList3, r10, textResourceM21278l9, null, c22582f, performFuzzySearch, arrayList9, customBehaviorsWidget != null ? AbstractC34216b.f143526c.m60544l(customBehaviorsWidget) : null, 256, null);
    }
}
