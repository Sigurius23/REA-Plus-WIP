package f01;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9790n;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import h01.AbstractC16537d;
import h01.AbstractC16549p;
import h01.C16551r;
import h01.EnumC16533a;
import kd1.AbstractC22403o;
import kd1.EnumC22400l;
import l83.C23454a0;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f01.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lf01/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Lf01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "a", "Lf01/d;", "fakeActionCardState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13848c {

    /* JADX INFO: renamed from: a */
    private static final C13851d f49397a = new C13851d("", AbstractC8693b.m21278l("New impact unlocked"), AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur."), AbstractC8693b.m21278l("BUTTON TEXT"), null, null, new AbstractC22403o.a(AbstractC16272a.f62152s), EnumC16533a.DEFAULT, false, 48, null);

    /* JADX INFO: renamed from: c */
    public static final void m39217c(C13851d viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-317572040);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            String id4 = viewState.getId();
            TextResource textResourceM39229h = viewState.getTitle();
            TextResource textResourceM39224b = viewState.getBody();
            InterfaceC22973k1 interfaceC22973k1M46721a = AbstractC16537d.m46721a();
            EnumC16533a enumC16533aM39228g = viewState.getStyle();
            EnumC22400l enumC22400l = EnumC22400l.NONE;
            TextResource textResourceM39226e = viewState.getCtaText();
            if (textResourceM39226e == null) {
                textResourceM39226e = AbstractC8693b.m21267a();
            }
            boolean z4 = false;
            AbstractC22403o abstractC22403oM39227f = viewState.getImage();
            EnumC16313m0 enumC16313m0M39225c = viewState.getCtaIcon();
            boolean z13 = (i15 & 112) == 32;
            if ((i15 & 14) == 4) {
                z4 = true;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q2.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C9790n(24, onViewEvent, viewState);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC16549p.m46747A(id4, textResourceM39224b, null, false, interfaceC22973k1M46721a, enumC16533aM39228g, enumC22400l, textResourceM39226e, abstractC22403oM39227f, textResourceM39229h, false, false, null, false, enumC16313m0M39225c, null, (Function1) objM87133R, c28655q, 1573248, ProfileVerifier.CompilationStatus.f6515xf2722a21, 15368);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(viewState, onViewEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m39218d(Function1 function1, C13851d c13851d, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C16551r) {
            function1.invoke(event);
        } else {
            EnumC13893r enumC13893rM39223a = c13851d.getAction();
            if (enumC13893rM39223a != null) {
                function1.invoke(enumC13893rM39223a);
            } else {
                function1.invoke(c13851d.getTitle());
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m39219e(C13851d c13851d, Function1 function1, int i13, Composer composer, int i14) {
        m39217c(c13851d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
