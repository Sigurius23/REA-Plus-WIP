package ii2;

import a80.C0542f;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import hy0.C17734d1;
import ig0.C18468h;
import ih1.C18522f;
import java.io.IOException;
import ji2.C21733l;
import l83.C23454a0;
import mi2.AbstractC25580c;
import mi2.AbstractC25589l;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ii2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Leb/u0;", "navController", "Lji2/l;", "viewState", "Lkotlin/Function1;", "Lji2/i;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onBackPressed", "e", "(Leb/u0;Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "strava_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18572a {
    /* JADX INFO: renamed from: e */
    public static final void m53791e(C12991u0 navController, C21733l viewState, Function1 onViewEvent, InterfaceC4339a onBackPressed, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-167599470);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navController) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onBackPressed) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean zM87157i = c28655q.m87157i(viewState) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C18468h(viewState, onViewEvent, onBackPressed, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17269i.m48888e(navController, "SETTINGS", null, (Function1) objM87133R, c28655q, i14 & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17734d1(i13, 15, navController, viewState, onBackPressed, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m53792f(C21733l c21733l, Function1 function1, InterfaceC4339a interfaceC4339a, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "SETTINGS", null, new C37816b(new C0542f((Object) c21733l, function1, (Object) interfaceC4339a, 17), true, 675842199), 6);
        AbstractC12889b.m36291u(NavHost, "SELECTED_ACTIVITIES", null, new C37816b(new C18522f(1, c21733l, function1), true, -943446066), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m53793g(C21733l c21733l, Function1 function1, InterfaceC4339a interfaceC4339a, C12982q it, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(it, "it");
        AbstractC25589l.m75309v(c21733l, function1, interfaceC4339a, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m53794h(C21733l c21733l, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC25580c.m75236y(c21733l, function1, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m53795i(C12991u0 c12991u0, C21733l c21733l, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m53791e(c12991u0, c21733l, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
