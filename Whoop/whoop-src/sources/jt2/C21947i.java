package jt2;

import aq0.C1898i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import ls2.AbstractC24716a;
import ls2.C24717b;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import sw0.C33050g;
import sw0.C33052i;
import sw0.C33053j;

/* JADX INFO: renamed from: jt2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018H\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Ljt2/i;", "", "Lls2/b;", "analyticHelper", "<init>", "(Lls2/b;)V", "Ljt2/p$x;", "internalAction", "Ljt2/j;", "domainState", "p", "(Ljt2/p$x;Ljt2/j;)Ljt2/j;", "Ljt2/p$e;", "e", "(Ljt2/p$e;Ljt2/j;)Ljt2/j;", "Ljt2/p$t;", "o", "(Ljt2/p$t;Ljt2/j;)Ljt2/j;", "Ljt2/p$h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljt2/p$h;Ljt2/j;)Ljt2/j;", "Ljt2/p$l;", "i", "(Ljt2/p$l;Ljt2/j;)Ljt2/j;", "Ljt2/c;", "type", "Lsw0/g;", "f", "(Ljt2/c;Ljt2/j;)Lsw0/g;", "Ljt2/p;", "g", "(Ljt2/p;Ljt2/j;)Ljt2/j;", "", "isSelected", "bottomSheetType", "Ll83/a0;", "n", "(ZLjt2/c;)V", "a", "Lls2/b;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21947i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24717b analyticHelper;

    /* JADX INFO: renamed from: jt2.i$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84790a;

        static {
            int[] iArr = new int[EnumC21941c.values().length];
            try {
                iArr[EnumC21941c.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21941c.BEHAVIOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84790a = iArr;
        }
    }

    public C21947i(C24717b analyticHelper) {
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        this.analyticHelper = analyticHelper;
    }

    /* JADX INFO: renamed from: e */
    private final C21948j m62579e(AbstractC21954p.e internalAction, C21948j domainState) {
        C33050g c33050gM62580f = m62580f(internalAction.getBottomSheetType(), domainState);
        String str = c33050gM62580f.m104629d().get(internalAction.getCategoryIndex());
        return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, null, null, internalAction.getBottomSheetType() == EnumC21941c.ACTIVITY ? C33050g.m104626b(c33050gM62580f, null, null, null, null, str, null, null, null, null, null, null, null, 4079, null) : domainState.getAccumulatedStateForVS().getActivitiesBottomSheet(), null, null, internalAction.getBottomSheetType() == EnumC21941c.BEHAVIOR ? C33050g.m104626b(c33050gM62580f, null, null, null, null, str, null, null, null, null, null, null, null, 4079, null) : domainState.getAccumulatedStateForVS().getBehaviorsBottomSheet(), null, null, false, null, false, null, null, null, null, null, null, null, 2096863, null), 1, null);
    }

    /* JADX INFO: renamed from: f */
    private final C33050g m62580f(EnumC21941c type, C21948j domainState) {
        int i13 = a.f84790a[type.ordinal()];
        if (i13 == 1) {
            return domainState.getAccumulatedStateForVS().getActivitiesBottomSheet();
        }
        if (i13 == 2) {
            return domainState.getAccumulatedStateForVS().getBehaviorsBottomSheet();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    private final C21948j m62581h(AbstractC21954p.h internalAction, C21948j domainState) {
        int i13;
        C33050g activitiesBottomSheet;
        C33050g behaviorsBottomSheet;
        C33050g c33050gM62580f = m62580f(internalAction.getBottomSheetType(), domainState);
        List<C33052i> listM104635j = c33050gM62580f.m104635j();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM104635j, 10));
        for (C33052i c33052i : listM104635j) {
            List<C33053j> listM104651f = c33052i.m104651f();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
            for (C33053j c33053j : listM104651f) {
                int i14 = a.f84790a[internalAction.getBottomSheetType().ordinal()];
                boolean z4 = false;
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<C21940b> listM62544k = domainState.getAccumulatedStateForVS().m62544k();
                    if (!(listM62544k instanceof Collection) || !listM62544k.isEmpty()) {
                        Iterator<T> it = listM62544k.iterator();
                        while (it.hasNext()) {
                            if (AbstractC22676k.m65745e(((C21940b) it.next()).getId(), c33053j.getId())) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                } else {
                    List<C21939a> listM62543j = domainState.getAccumulatedStateForVS().m62543j();
                    if (!(listM62543j instanceof Collection) || !listM62543j.isEmpty()) {
                        Iterator<T> it3 = listM62543j.iterator();
                        while (it3.hasNext()) {
                            if (AbstractC22676k.m65745e(((C21939a) it3.next()).getActivityType(), c33053j.getId())) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                }
                arrayList2.add(c33053j.m104653d((65531 & 1) != 0 ? c33053j.id : null, (65531 & 2) != 0 ? c33053j.title : null, (65531 & 4) != 0 ? c33053j.isSelected : z4, (65531 & 8) != 0 ? c33053j.sortPriority : 0, (65531 & 16) != 0 ? c33053j.selectedValue : null, (65531 & 32) != 0 ? c33053j.categories : null, (65531 & 64) != 0 ? c33053j.iconUrl : null, (65531 & 128) != 0 ? c33053j.subtitle : null, (65531 & 256) != 0 ? c33053j.avoidanceText : null, (65531 & 512) != 0 ? c33053j.trend : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33053j.style : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33053j.dayOptions : null, (65531 & 4096) != 0 ? c33053j.bottomSheetInfo : null, (65531 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33053j.weeklyPlanGoal : false, (65531 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33053j.tag : null, (65531 & 32768) != 0 ? c33053j.isCustom : false));
            }
            arrayList.add(C33052i.m104646b(c33052i, null, 0, arrayList2, null, 11, null));
        }
        C21942d accumulatedStateForVS = domainState.getAccumulatedStateForVS();
        if (internalAction.getBottomSheetType() == EnumC21941c.ACTIVITY) {
            List<C21939a> listM62543j2 = domainState.getAccumulatedStateForVS().m62543j();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM62543j2, 10));
            Iterator<T> it4 = listM62543j2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((C21939a) it4.next()).getActivityType());
            }
            i13 = 10;
            activitiesBottomSheet = C33050g.m104626b(c33050gM62580f, null, "", null, null, (String) AbstractC25265s.m74096F0(c33050gM62580f.m104629d()), arrayList, null, arrayList3, null, null, null, null, 3917, null);
        } else {
            i13 = 10;
            activitiesBottomSheet = domainState.getAccumulatedStateForVS().getActivitiesBottomSheet();
        }
        C33050g c33050g = activitiesBottomSheet;
        if (internalAction.getBottomSheetType() == EnumC21941c.BEHAVIOR) {
            List<C21940b> listM62544k2 = domainState.getAccumulatedStateForVS().m62544k();
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(listM62544k2, i13));
            Iterator<T> it5 = listM62544k2.iterator();
            while (it5.hasNext()) {
                arrayList4.add(((C21940b) it5.next()).getId());
            }
            behaviorsBottomSheet = C33050g.m104626b(c33050gM62580f, null, "", null, null, (String) AbstractC25265s.m74096F0(c33050gM62580f.m104629d()), arrayList, null, arrayList4, null, null, null, null, 3917, null);
        } else {
            behaviorsBottomSheet = domainState.getAccumulatedStateForVS().getBehaviorsBottomSheet();
        }
        return C21948j.m62591b(domainState, null, C21942d.m62534b(accumulatedStateForVS, null, null, null, null, null, c33050g, null, null, behaviorsBottomSheet, null, null, false, null, false, null, null, null, null, null, null, null, 2096863, null), 1, null);
    }

    /* JADX INFO: renamed from: i */
    private final C21948j m62582i(final AbstractC21954p.l internalAction, C21948j domainState) {
        C33050g c33050gM62580f = m62580f(internalAction.getBottomSheetType(), domainState);
        final ArrayList<String> arrayList = new ArrayList();
        List<C33052i> listM104635j = c33050gM62580f.m104635j();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104635j, 10));
        Iterator<T> it = listM104635j.iterator();
        while (it.hasNext()) {
            List<C33053j> listM104651f = ((C33052i) it.next()).m104651f();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
            for (C33053j c33053j : listM104651f) {
                if (c33053j.getIsSelected()) {
                    arrayList.add(c33053j.getId());
                }
                arrayList3.add(C23454a0.f92919a);
            }
            arrayList2.add(arrayList3);
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(domainState.getAccumulatedStateForVS().m62543j());
        final int i13 = 0;
        arrayListM74097F1.removeIf(new C1898i(new Function1() { // from class: jt2.h
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zM62583j;
                switch (i13) {
                    case 0:
                        zM62583j = C21947i.m62583j(internalAction, arrayList, (C21939a) obj);
                        break;
                    default:
                        zM62583j = C21947i.m62585l(internalAction, arrayList, (C21940b) obj);
                        break;
                }
                return Boolean.valueOf(zM62583j);
            }
        }, 3));
        ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(domainState.getAccumulatedStateForVS().m62544k());
        final int i14 = 1;
        arrayListM74097F2.removeIf(new C1898i(new Function1() { // from class: jt2.h
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zM62583j;
                switch (i14) {
                    case 0:
                        zM62583j = C21947i.m62583j(internalAction, arrayList, (C21939a) obj);
                        break;
                    default:
                        zM62583j = C21947i.m62585l(internalAction, arrayList, (C21940b) obj);
                        break;
                }
                return Boolean.valueOf(zM62583j);
            }
        }, 4));
        for (String str : arrayList) {
            int i15 = a.f84790a[internalAction.getBottomSheetType().ordinal()];
            if (i15 == 1) {
                if (!arrayListM74097F1.isEmpty()) {
                    Iterator it3 = arrayListM74097F1.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (!AbstractC22676k.m65745e(((C21939a) it3.next()).getActivityType(), str));
                }
                arrayListM74097F1.add(new C21939a(str, true, 1));
                break;
            }
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!arrayListM74097F2.isEmpty()) {
                Iterator it4 = arrayListM74097F2.iterator();
                do {
                    if (it4.hasNext()) {
                    }
                } while (!AbstractC22676k.m65745e(((C21940b) it4.next()).getId(), str));
            }
            arrayListM74097F2.add(new C21940b(str, false, true, 1));
            break;
        }
        return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, null, null, null, arrayListM74097F1, null, null, arrayListM74097F2, null, false, null, false, null, null, null, null, null, null, null, 2096575, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final boolean m62583j(AbstractC21954p.l lVar, ArrayList arrayList, C21939a activity) {
        AbstractC22676k.m65750j(activity, "activity");
        if (lVar.getBottomSheetType() != EnumC21941c.ACTIVITY) {
            return false;
        }
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e((String) it.next(), activity.getActivityType())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final boolean m62584k(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final boolean m62585l(AbstractC21954p.l lVar, ArrayList arrayList, C21940b activity) {
        AbstractC22676k.m65750j(activity, "activity");
        if (lVar.getBottomSheetType() != EnumC21941c.BEHAVIOR) {
            return false;
        }
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e((String) it.next(), activity.getId())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final boolean m62586m(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    private final C21948j m62587o(AbstractC21954p.t internalAction, C21948j domainState) {
        AbstractC21951m abstractC21951m;
        int i13;
        C33050g activitiesBottomSheet;
        C33050g c33050gM62580f = m62580f(internalAction.getBottomSheetType(), domainState);
        List<C33052i> listM104635j = c33050gM62580f.m104635j();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM104635j, 10));
        for (C33052i c33052i : listM104635j) {
            List<C33053j> listM104651f = c33052i.m104651f();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
            for (C33053j c33053jM104653d : listM104651f) {
                if (AbstractC22676k.m65745e(c33053jM104653d.getId(), internalAction.getId())) {
                    boolean isSelected = c33053jM104653d.getIsSelected();
                    boolean z4 = !isSelected;
                    m62590n(z4, internalAction.getBottomSheetType());
                    c33053jM104653d = c33053jM104653d.m104653d((65531 & 1) != 0 ? c33053jM104653d.id : null, (65531 & 2) != 0 ? c33053jM104653d.title : null, (65531 & 4) != 0 ? c33053jM104653d.isSelected : z4, (65531 & 8) != 0 ? c33053jM104653d.sortPriority : 0, (65531 & 16) != 0 ? c33053jM104653d.selectedValue : !isSelected ? 1 : null, (65531 & 32) != 0 ? c33053jM104653d.categories : null, (65531 & 64) != 0 ? c33053jM104653d.iconUrl : null, (65531 & 128) != 0 ? c33053jM104653d.subtitle : null, (65531 & 256) != 0 ? c33053jM104653d.avoidanceText : null, (65531 & 512) != 0 ? c33053jM104653d.trend : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33053jM104653d.style : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33053jM104653d.dayOptions : null, (65531 & 4096) != 0 ? c33053jM104653d.bottomSheetInfo : null, (65531 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33053jM104653d.weeklyPlanGoal : false, (65531 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33053jM104653d.tag : null, (65531 & 32768) != 0 ? c33053jM104653d.isCustom : false);
                }
                arrayList2.add(c33053jM104653d);
            }
            arrayList.add(C33052i.m104646b(c33052i, null, 0, arrayList2, null, 11, null));
        }
        C21942d accumulatedStateForVS = domainState.getAccumulatedStateForVS();
        if (internalAction.getBottomSheetType() == EnumC21941c.ACTIVITY) {
            i13 = 1;
            abstractC21951m = null;
            activitiesBottomSheet = C33050g.m104626b(c33050gM62580f, null, null, null, null, null, arrayList, null, null, null, null, null, null, 4063, null);
        } else {
            abstractC21951m = null;
            i13 = 1;
            activitiesBottomSheet = domainState.getAccumulatedStateForVS().getActivitiesBottomSheet();
        }
        return C21948j.m62591b(domainState, abstractC21951m, C21942d.m62534b(accumulatedStateForVS, null, null, null, null, null, activitiesBottomSheet, null, null, internalAction.getBottomSheetType() == EnumC21941c.BEHAVIOR ? C33050g.m104626b(c33050gM62580f, null, null, null, null, null, arrayList, null, null, null, null, null, null, 4063, null) : domainState.getAccumulatedStateForVS().getBehaviorsBottomSheet(), null, null, false, null, false, null, null, null, null, null, null, null, 2096863, null), i13, abstractC21951m);
    }

    /* JADX INFO: renamed from: p */
    private final C21948j m62588p(AbstractC21954p.x internalAction, C21948j domainState) {
        C33050g c33050gM62580f = m62580f(internalAction.getBottomSheetType(), domainState);
        return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, null, null, internalAction.getBottomSheetType() == EnumC21941c.ACTIVITY ? C33050g.m104626b(c33050gM62580f, null, internalAction.getQuery(), null, null, null, null, null, null, null, null, null, null, 4093, null) : domainState.getAccumulatedStateForVS().getActivitiesBottomSheet(), null, null, internalAction.getBottomSheetType() == EnumC21941c.BEHAVIOR ? C33050g.m104626b(c33050gM62580f, null, internalAction.getQuery(), null, null, null, null, null, null, null, null, null, null, 4093, null) : domainState.getAccumulatedStateForVS().getBehaviorsBottomSheet(), null, null, false, null, false, null, null, null, null, null, null, null, 2096863, null), 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final C21948j m62589g(AbstractC21954p internalAction, C21948j domainState) {
        AbstractC22676k.m65750j(internalAction, "internalAction");
        AbstractC22676k.m65750j(domainState, "domainState");
        if (internalAction instanceof AbstractC21954p.x) {
            return m62588p((AbstractC21954p.x) internalAction, domainState);
        }
        if (internalAction instanceof AbstractC21954p.e) {
            return m62579e((AbstractC21954p.e) internalAction, domainState);
        }
        if (internalAction instanceof AbstractC21954p.t) {
            return m62587o((AbstractC21954p.t) internalAction, domainState);
        }
        if (internalAction instanceof AbstractC21954p.h) {
            return m62581h((AbstractC21954p.h) internalAction, domainState);
        }
        return internalAction instanceof AbstractC21954p.l ? m62582i((AbstractC21954p.l) internalAction, domainState) : domainState;
    }

    /* JADX INFO: renamed from: n */
    public final void m62590n(boolean isSelected, EnumC21941c bottomSheetType) {
        String lowerCase;
        AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
        C24717b c24717b = this.analyticHelper;
        String str = isSelected ? "Add" : "Remove";
        int i13 = a.f84790a[bottomSheetType.ordinal()];
        if (i13 == 1) {
            lowerCase = "Activities".toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lowerCase = "Behaviors".toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        }
        c24717b.m72377q(new AbstractC24716a.d(str, lowerCase));
    }
}
