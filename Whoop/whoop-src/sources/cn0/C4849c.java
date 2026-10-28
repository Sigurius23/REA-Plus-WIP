package cn0;

import an0.C1056a;
import bn0.C3493a;
import bn0.C3497e;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.calendar.archmini.CalendarDayModel;
import com.whoop.design.models.calendar.archmini.CalendarHeaderModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.FabMenuModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import d13.AbstractC11478a;
import h91.C17027b;
import i11.C17863f;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import k71.C22246d;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23690p1;
import p716lb1.AbstractC23731w0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import vb1.AbstractC35869b;
import vy0.C36570d0;

/* JADX INFO: renamed from: cn0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcn0/c;", "", "Ljb1/a;", "itemReducer", "<init>", "(Ljb1/a;)V", "Lan0/a;", "", "monthIndex", "Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;", "a", "(Lan0/a;I)Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;", "", "Lk71/d;", "b", "(Lan0/a;I)Ljava/util/List;", "domainState", "Lbn0/a;", "accumulator", "Lbn0/e;", "c", "(Lan0/a;Lbn0/a;)Lbn0/e;", "Ljb1/a;", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4849c {

    /* JADX INFO: renamed from: b */
    public static final int f20169b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a itemReducer;

    public C4849c(C21535a itemReducer) {
        AbstractC22676k.m65750j(itemReducer, "itemReducer");
        this.itemReducer = itemReducer;
    }

    /* JADX INFO: renamed from: a */
    private final CalendarHeaderModel m15463a(C1056a c1056a, int i13) {
        CalendarHeaderModel calendarHeaderModel = c1056a.m3125i().get(Integer.valueOf(i13));
        return calendarHeaderModel == null ? c1056a.getHeader() : calendarHeaderModel;
    }

    /* JADX INFO: renamed from: b */
    private final List<C22246d> m15464b(C1056a c1056a, int i13) {
        List<GraphLegendModel> listM3121e = c1056a.m3122f().get(Integer.valueOf(i13));
        if (listM3121e == null) {
            listM3121e = c1056a.m3121e();
        }
        List<GraphLegendModel> list = listM3121e;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC35869b.m113880z((GraphLegendModel) it.next(), EnumC39333f.WHITE_70));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX INFO: renamed from: c */
    public final C3497e m15465c(C1056a domainState, C3493a accumulator) {
        C17027b<CalendarDayModel> c17027b;
        C17863f c17863fM51362b;
        C36570d0 c36570d0M69224f;
        List<DesignSystemModel> trailingItems;
        List<DesignSystemModel> leadingItems;
        C17027b<CalendarDayModel> c17027bM48073b;
        C4849c c4849c = this;
        C1056a domainState2 = domainState;
        AbstractC22676k.m65750j(domainState2, "domainState");
        AbstractC22676k.m65750j(accumulator, "accumulator");
        C17027b<CalendarDayModel> c17027bM3120d = domainState2.m3120d();
        Map map = null;
        if (c17027bM3120d != null) {
            LocalDate selectedDate = accumulator.getSelectedDate();
            if (selectedDate != null && (c17027bM48073b = C17027b.m48073b(c17027bM3120d, null, null, selectedDate, null, null, 0, false, null, 0, 507, null)) != null) {
                c17027bM3120d = c17027bM48073b;
            }
            c17027b = c17027bM3120d;
        } else {
            c17027b = null;
        }
        CalendarHeaderModel calendarHeaderModelM15463a = c4849c.m15463a(domainState2, domainState2.getPageIndex());
        boolean isLoading = domainState2.getIsLoading();
        boolean isError = domainState2.getIsError();
        int pageIndex = domainState2.getPageIndex();
        Integer loadingMonthIndex = domainState2.getLoadingMonthIndex();
        Integer failedMonthIndex = domainState2.getFailedMonthIndex();
        if (calendarHeaderModelM15463a == null || (leadingItems = calendarHeaderModelM15463a.getLeadingItems()) == null) {
            c17863fM51362b = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : leadingItems) {
                if (obj instanceof DateSelectorModel) {
                    arrayList.add(obj);
                }
            }
            DateSelectorModel dateSelectorModel = (DateSelectorModel) AbstractC25265s.m74100H0(arrayList);
            if (dateSelectorModel != null) {
                c17863fM51362b = C17863f.m51362b(AbstractC23731w0.m69613f(dateSelectorModel), null, AbstractC11478a.m30853e(Locale.ROOT, dateSelectorModel.getCurrentDateRange(), "toUpperCase(...)"), false, null, false, null, null, null, null, null, 1021, null);
            } else {
                c17863fM51362b = null;
            }
        }
        if (calendarHeaderModelM15463a == null || (trailingItems = calendarHeaderModelM15463a.getTrailingItems()) == null) {
            c36570d0M69224f = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : trailingItems) {
                if (obj2 instanceof FabMenuModel) {
                    arrayList2.add(obj2);
                }
            }
            FabMenuModel fabMenuModel = (FabMenuModel) AbstractC25265s.m74100H0(arrayList2);
            if (fabMenuModel != null) {
                c36570d0M69224f = AbstractC23690p1.m69224f(fabMenuModel);
            } else {
                c36570d0M69224f = null;
            }
        }
        C21535a c21535a = c4849c.itemReducer;
        List<DesignSystemModel> trailingItems2 = calendarHeaderModelM15463a != null ? calendarHeaderModelM15463a.getTrailingItems() : null;
        if (trailingItems2 == null) {
            trailingItems2 = C25271y.f99162w;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : trailingItems2) {
            if (!(((DesignSystemModel) obj3) instanceof FabMenuModel)) {
                arrayList3.add(obj3);
            }
        }
        List<InterfaceC25312u> listM60545m = c21535a.m60545m(arrayList3);
        if (c17027b != null) {
            LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(Integer.valueOf(domainState2.getPageIndex()), c17027b.m48077e().keySet());
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(linkedHashSetM34555D, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            Iterator it = linkedHashSetM34555D.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int iIntValue = ((Number) next).intValue();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                linkedHashMap2.put(next, AbstractC4848b.m15461b(C17027b.m48073b(c17027b, null, null, null, null, null, 0, false, c4849c.m15464b(domainState2, iIntValue), 0, 383, null), iIntValue));
                domainState2 = domainState;
                it = it;
                linkedHashMap = linkedHashMap2;
                c4849c = this;
            }
            map = linkedHashMap;
        }
        if (map == null) {
            map = C25272z.f99163w;
        }
        return new C3497e(isLoading, isError, pageIndex, loadingMonthIndex, failedMonthIndex, c17863fM51362b, c36570d0M69224f, listM60545m, map);
    }

    public /* synthetic */ C4849c(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a);
    }
}
