package ly0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import lf0.C23956p1;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p745y81.EnumC39333f;
import y71.C39274g;

/* JADX INFO: renamed from: ly0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lly0/b;", "Lm91/f;", "Lly0/f;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Lly0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24798b implements InterfaceC25297f<C24802f> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m72678d(C24798b c24798b, Modifier modifier, C24802f c24802f, Function1 function1, int i13, Composer composer, int i14) {
        c24798b.Compose(modifier, c24802f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C24802f itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(809120020);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            TextResource currentStatText = itemState.getCurrentStatText();
            C2886a currentStatTextStyle = itemState.getCurrentStatTextStyle();
            TextResource historicStatText = itemState.getHistoricStatText();
            C24797a arrowStatIconState = itemState.getArrowStatIconState();
            C17919x c17919xM31989h = null;
            C39274g arrowIcon = arrowStatIconState != null ? arrowStatIconState.getArrowIcon() : null;
            C24797a arrowStatIconState2 = itemState.getArrowStatIconState();
            EnumC39333f arrowTint = arrowStatIconState2 != null ? arrowStatIconState2.getArrowTint() : null;
            if (arrowTint == null) {
                c28655q.m87150e0(1138501626);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(175273191);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, arrowTint.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            AbstractC24801e.m72687g(modifier, currentStatText, currentStatTextStyle, historicStatText, arrowIcon, c17919xM31989h != null ? c17919xM31989h.f69639a : C17919x.f69636m, itemState.getIsEndAligned(), c28655q, i15 & 14, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23956p1(i13, 16, this, modifier, itemState, onViewEvent);
        }
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void Compose(C24802f c24802f, Function1 function1, Composer composer, int i13) {
        super.Compose(c24802f, function1, composer, i13);
    }
}
