package yi1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ShepherdAboutModel;
import com.whoop.navigation.ShepherdSettingsModel;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import ti1.AbstractC33852d;
import vi1.InterfaceC36060c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: yi1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lyi1/e;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lvi1/c$c;", "state", "Lyi1/d;", "c", "(Lvi1/c$c;)Lyi1/d;", "", "Lm91/u;", "items", "Lyi1/m;", "shepherdItem", "", "shepherdOnboarded", "a", "(Ljava/util/List;Lyi1/m;Z)Lyi1/d;", "Lvi1/c;", "domainState", "b", "(Lvi1/c;)Lyi1/d;", "Ljb1/a;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39571e {

    /* JADX INFO: renamed from: b */
    public static final int f170268b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C39571e(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC39570d m126377a(List<? extends InterfaceC25312u> items, C39579m shepherdItem, boolean shepherdOnboarded) {
        C39579m c39579mM126457a = shepherdItem.m126457a(new C39578l(AbstractC8693b.m21277k(AbstractC33852d.f141782o), AbstractC8693b.m21267a(), shepherdOnboarded ? new C9598e(AppScreen.C9317g5.f27629w, ShepherdAboutModel.INSTANCE, null, 4, null) : null, 1, EnumC16313m0.EDUCATION.toWhoopIcon()), AbstractC8693b.m21277k(AbstractC33852d.f141781n), shepherdOnboarded ? AbstractC37056f.m118958J(new C39582p(new C39581o(AbstractC8693b.m21277k(AbstractC33852d.f141780m), null, EnumC16313m0.LIST.toWhoopIcon(), EnumC16313m0.CARET_FORWARD.toWhoopIcon(), new C9598e(AppScreen.C9357l5.f27754w, ShepherdSettingsModel.INSTANCE, null, 4, null)), EnumC39580n.AllNotifications)) : C25271y.f99162w);
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(items);
        arrayListM74097F1.set(items.indexOf(shepherdItem), c39579mM126457a);
        return new InterfaceC39570d.c(arrayListM74097F1);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC39570d m126378c(InterfaceC36060c.c state) {
        List<InterfaceC25312u> listM60540g = this.reducer.m60540g(state.getBffData().getItems());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM60540g) {
            if (obj instanceof C39579m) {
                arrayList.add(obj);
            }
        }
        C39579m c39579m = (C39579m) AbstractC25265s.m74100H0(arrayList);
        if (c39579m == null) {
            return new InterfaceC39570d.c(listM60540g);
        }
        List<InterfaceC25312u> listM126459c = c39579m.m126459c();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM126459c) {
            if (obj2 instanceof C39582p) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((C39582p) it.next()).getIconState() == EnumC39580n.ErrorConnection) {
                    return m126377a(listM60540g, c39579m, state.getShepherdOnboarded());
                }
            }
        }
        return new InterfaceC39570d.c(listM60540g);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC39570d m126379b(InterfaceC36060c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.equals(InterfaceC36060c.a.f153925a)) {
            return InterfaceC39570d.b.f170266a;
        }
        if (domainState.equals(InterfaceC36060c.b.f153926a)) {
            return new InterfaceC39570d.a(null, null, null, 7, null);
        }
        if (domainState instanceof InterfaceC36060c.c) {
            return m126378c((InterfaceC36060c.c) domainState);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C39571e(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC39572f.f170272c : c21535a);
    }
}
