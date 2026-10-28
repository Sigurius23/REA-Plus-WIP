package zi1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c11.C3838e;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d11.C11469d;
import d11.C11474i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import xi1.InterfaceC38321a;
import y71.C39277j;
import yi1.C39583q;

/* JADX INFO: renamed from: zi1.u */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lzi1/u;", "Lm91/f;", "Ld11/i;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ld11/d;", "a", "Ld11/d;", "ctaTileItem", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40691u implements InterfaceC25297f<C11474i> {

    /* JADX INFO: renamed from: b */
    public static final int f175599b = C11469d.f36809a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C11469d ctaTileItem = new C11469d();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m132133d(Function1 function1, C11474i c11474i) {
        C9598e navigationAction = c11474i.getNavigationAction();
        AbstractC22676k.m65747g(navigationAction);
        function1.invoke(new InterfaceC38321a.e(navigationAction));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132134e(C40691u c40691u, Modifier modifier, C11474i c11474i, Function1 function1, int i13, Composer composer, int i14) {
        c40691u.Compose(modifier, c11474i, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C11474i itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2036850195);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(this) : c28655q.m87157i(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        boolean z4 = true;
        if (!c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q.m87138X();
        } else if (AbstractC22676k.m65745e(itemState.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), C39583q.f170322a)) {
            c28655q.m87150e0(-506058042);
            TextResource title = itemState.getTitle();
            boolean z13 = (i14 & 896) == 256;
            if ((i14 & 112) != 32 && ((i14 & 64) == 0 || !c28655q.m87157i(itemState))) {
                z4 = false;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3838e(onViewEvent, itemState, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC40676f0.m132043d(title, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-505850776);
            this.ctaTileItem.Compose(modifier, itemState, onViewEvent, c28655q, (i14 & 896) | (i14 & 14) | (C11474i.f36854E << 3) | (i14 & 112) | (C11469d.f36809a << 9));
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39277j(this, modifier, itemState, onViewEvent, i13, 21);
        }
    }
}
