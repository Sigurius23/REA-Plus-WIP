package i11;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import hy0.C17734d1;
import l83.C23454a0;
import p291l0.InterfaceC22965i;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: i11.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Li11/a;", "Lm91/f;", "Li11/f;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Li11/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17858a implements InterfaceC25297f<C17863f> {

    /* JADX INFO: renamed from: a */
    public static final int f69479a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m51340c(C17858a c17858a, Modifier modifier, C17863f c17863f, Function1 function1, int i13, Composer composer, int i14) {
        c17858a.Compose(modifier, c17863f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C17863f itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(844036750);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            InterfaceC22965i arrangement = itemState.getArrangement();
            TextResource text = itemState.getText();
            boolean backButtonEnabled = itemState.getBackButtonEnabled();
            boolean forwardButtonEnabled = itemState.getForwardButtonEnabled();
            String backDate = itemState.getBackDate();
            String forwardDate = itemState.getForwardDate();
            GenericInteraction previousInteraction = itemState.getPreviousInteraction();
            GenericInteraction nextInteraction = itemState.getNextInteraction();
            GenericInteraction labelInteraction = itemState.getLabelInteraction();
            C17864g dateStrip = itemState.getDateStrip();
            int i15 = GenericInteraction.$stable;
            AbstractC17862e.m51358q(modifier, false, arrangement, text, backButtonEnabled, forwardButtonEnabled, backDate, forwardDate, previousInteraction, nextInteraction, labelInteraction, dateStrip, onViewEvent, c28655q, (i14 & 14) | (i15 << 24) | (i15 << 27), i15 | (i14 & 896), 2);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17734d1(this, modifier, itemState, onViewEvent, i13, 6);
        }
    }
}
