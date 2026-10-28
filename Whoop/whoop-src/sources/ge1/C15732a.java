package ge1;

import c41.C4018e5;
import c41.C4103r;
import de1.C11982b;
import de1.InterfaceC11984d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ge1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J5\u0010\u001d\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J+\u0010'\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Lge1/a;", "", "<init>", "()V", "Lde1/b;", "domainState", "Lge1/d$e;", "i", "(Lde1/b;)Lge1/d$e;", "", "Lc41/r;", "activities", "", "", "selectedIds", "a", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "", "d", "(Ljava/util/List;)Ljava/util/List;", "selectedIndices", "", "e", "(Ljava/util/List;)Z", "selectedActivities", "b", "isConsecutive", "maxSelectionExceeded", "durationExceeded", "c", "(Ljava/util/List;ZZZ)Z", "", "maxDurationHours", "f", "(Ljava/util/List;J)Z", "Lm91/u;", "footerState", "deleteEnabled", "mergeEnabled", "g", "(Lm91/u;ZZ)Lm91/u;", "Lge1/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lde1/b;)Lge1/d;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15732a {
    /* JADX INFO: renamed from: a */
    private final List<C4103r> m44341a(List<C4103r> activities, Set<String> selectedIds) {
        List<C4103r> list = activities;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C4103r c4103r : list) {
            arrayList.add(C4103r.m12622b(c4103r, null, null, null, null, null, null, false, null, null, null, null, selectedIds.contains(c4103r.getActivityV2Id()), null, 6143, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m44342b(List<C4103r> selectedActivities) {
        return !selectedActivities.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    private final boolean m44343c(List<C4103r> selectedActivities, boolean isConsecutive, boolean maxSelectionExceeded, boolean durationExceeded) {
        return selectedActivities.size() >= 2 && isConsecutive && !maxSelectionExceeded && !durationExceeded;
    }

    /* JADX INFO: renamed from: d */
    private final List<Integer> m44344d(List<C4103r> activities) {
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : activities) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            Integer numValueOf = ((C4103r) obj).getIsSelected() ? Integer.valueOf(i13) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m44345e(List<Integer> selectedIndices) {
        if (selectedIndices.size() < 2) {
            return !selectedIndices.isEmpty();
        }
        List<Integer> list = selectedIndices;
        return (((Number) AbstractC25265s.m74119W0(list)).intValue() - ((Number) AbstractC25265s.m74123a1(list)).intValue()) + 1 == selectedIndices.size();
    }

    /* JADX INFO: renamed from: f */
    private final boolean m44346f(List<C4103r> selectedActivities, long maxDurationHours) {
        if (selectedActivities.size() < 2) {
            return false;
        }
        List<C4103r> list = selectedActivities;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String startTimeIso = ((C4103r) it.next()).getStartTimeIso();
            if (startTimeIso != null) {
                arrayList.add(startTimeIso);
            }
        }
        String str = (String) AbstractC25265s.m74120X0(arrayList);
        if (str == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            String endTimeIso = ((C4103r) it3.next()).getEndTimeIso();
            if (endTimeIso != null) {
                arrayList2.add(endTimeIso);
            }
        }
        String str2 = (String) AbstractC25265s.m74115S0(arrayList2);
        if (str2 == null) {
            return false;
        }
        try {
            return Duration.between(Instant.parse(str), Instant.parse(str2)).compareTo(Duration.ofHours(maxDurationHours)) > 0;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC25312u m44347g(InterfaceC25312u footerState, boolean deleteEnabled, boolean mergeEnabled) {
        InterfaceC25312u startItem;
        InterfaceC25312u endItem;
        C4018e5 c4018e5 = footerState instanceof C4018e5 ? (C4018e5) footerState : null;
        if (c4018e5 == null) {
            return footerState;
        }
        InterfaceC25312u startItem2 = c4018e5.getStartItem();
        C27256h c27256h = startItem2 instanceof C27256h ? (C27256h) startItem2 : null;
        InterfaceC25312u endItem2 = c4018e5.getEndItem();
        C27256h c27256h2 = endItem2 instanceof C27256h ? (C27256h) endItem2 : null;
        if (c27256h == null || (startItem = C27256h.m82144b(c27256h, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, deleteEnabled, false, null, null, null, null, null, null, null, 33488895, null)) == null) {
            startItem = c4018e5.getStartItem();
        }
        InterfaceC25312u interfaceC25312u = startItem;
        if (c27256h2 == null || (endItem = C27256h.m82144b(c27256h2, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, mergeEnabled, false, null, null, null, null, null, null, null, 33488895, null)) == null) {
            endItem = c4018e5.getEndItem();
        }
        return C4018e5.m12212b(c4018e5, interfaceC25312u, endItem, false, 4, null);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC15735d.e m44348i(C11982b domainState) {
        List<C4103r> listM44341a = m44341a(domainState.m32983c(), AbstractC25265s.m74103I1(domainState.m32991k()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM44341a) {
            if (((C4103r) obj).getIsSelected()) {
                arrayList.add(obj);
            }
        }
        boolean zM44345e = m44345e(m44344d(listM44341a));
        boolean z4 = true;
        boolean z13 = arrayList.size() >= domainState.getMaxActivitiesInSelection();
        boolean zM44346f = m44346f(arrayList, domainState.getMaxDurationHours());
        boolean zM44342b = m44342b(arrayList);
        boolean zM44343c = m44343c(arrayList, zM44345e, z13, zM44346f);
        if (arrayList.isEmpty()) {
            z4 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z4 = false;
                break;
            }
        } while (!((C4103r) it.next()).getIsGpsEnabled());
        InterfaceC25312u interfaceC25312uM44347g = m44347g(domainState.getFooterState(), zM44342b, zM44343c);
        InterfaceC25312u gpsInfoCalloutState = z4 ? domainState.getGpsInfoCalloutState() : null;
        InterfaceC25312u maxDurationInfoCalloutState = domainState.getMaxDurationInfoCalloutState();
        if (!zM44346f || zM44343c) {
            maxDurationInfoCalloutState = null;
        }
        return new InterfaceC15735d.e(listM44341a, interfaceC25312uM44347g, gpsInfoCalloutState, maxDurationInfoCalloutState, z13 ? domainState.getMaxSelectionInfoCalloutState() : null, domainState.getShowDeleteConfirmation());
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC15735d m44349h(C11982b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        InterfaceC11984d screenState = domainState.getScreenState();
        if (screenState instanceof InterfaceC11984d.f) {
            return InterfaceC15735d.f.f59323a;
        }
        if (screenState instanceof InterfaceC11984d.e) {
            return m44348i(domainState);
        }
        if (screenState instanceof InterfaceC11984d.d) {
            return InterfaceC15735d.d.f59316a;
        }
        if (screenState instanceof InterfaceC11984d.b) {
            return InterfaceC15735d.b.f59314a;
        }
        if (screenState instanceof InterfaceC11984d.c) {
            return InterfaceC15735d.c.f59315a;
        }
        if (screenState instanceof InterfaceC11984d.a) {
            return new InterfaceC15735d.a(((InterfaceC11984d.a) domainState.getScreenState()).getTitle(), ((InterfaceC11984d.a) domainState.getScreenState()).getSubtitle());
        }
        if (screenState instanceof InterfaceC11984d.h) {
            return InterfaceC15735d.h.f59326a;
        }
        if (screenState instanceof InterfaceC11984d.i) {
            return InterfaceC15735d.i.f59327a;
        }
        if (screenState instanceof InterfaceC11984d.g) {
            return new InterfaceC15735d.g(((InterfaceC11984d.g) domainState.getScreenState()).getTitle(), ((InterfaceC11984d.g) domainState.getScreenState()).getSubtitle());
        }
        throw new NoWhenBranchMatchedException();
    }
}
