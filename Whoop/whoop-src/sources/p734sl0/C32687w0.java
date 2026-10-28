package p734sl0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import h51.AbstractC16932d;
import h51.C16934f;
import java.util.List;
import l83.C23454a0;
import ml0.AbstractC25669a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import r90.C31095b;
import y71.C39274g;

/* JADX INFO: renamed from: sl0.w0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lsl0/w0;", "Lm91/f;", "Lh51/f;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32687w0 implements InterfaceC25297f<C16934f> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m102564d(Function1 function1) {
        function1.invoke(AbstractC25669a.g.f100946a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m102565e(C32687w0 c32687w0, Modifier modifier, C16934f c16934f, Function1 function1, int i13, Composer composer, int i14) {
        c32687w0.Compose(modifier, c16934f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C16934f itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1946959301);
        if ((i13 & 48) == 0) {
            i14 = ((i13 & 64) == 0 ? c28655q2.m87153g(itemState) : c28655q2.m87157i(itemState) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 145) != 144)) {
            TextResource title = itemState.getTitle();
            C39274g actionButtonIcon = itemState.getActionButtonIcon();
            TextResource actionButtonText = itemState.getActionButtonText();
            boolean showActionButton = itemState.getShowActionButton();
            List<InterfaceC25312u> listM47683h = itemState.m47683h();
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C32644n(onViewEvent, 3);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i15 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC16932d.m47649m(title, null, null, actionButtonText, actionButtonIcon, showActionButton, false, listM47683h, null, null, null, null, null, onViewEvent, interfaceC4339a, false, c28655q, i15 | (i15 << 9) | (C39274g.f168929c << 12), (i14 << 3) & 7168, 40774);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31095b((InterfaceC25297f) this, modifier, (InterfaceC25312u) itemState, onViewEvent, i13, 27);
        }
    }
}
