package o11;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import no0.C26960m0;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: o11.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lo11/b;", "Lm91/f;", "Lo11/h;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Lo11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27396b implements InterfaceC25297f<InterfaceC27402h> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m82556c(C27396b c27396b, Modifier modifier, InterfaceC27402h interfaceC27402h, Function1 function1, int i13, Composer composer, int i14) {
        c27396b.Compose(modifier, interfaceC27402h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, InterfaceC27402h itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1444264920);
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
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (itemState instanceof InterfaceC27402h.b) {
            c28655q.m87150e0(886345016);
            InterfaceC27402h.b bVar = (InterfaceC27402h.b) itemState;
            AbstractC27401g.m82560C(bVar.m82629m(), bVar.getInfoText(), bVar.getVolumeLabelText(), bVar.getHideAllBottomControls(), bVar.getEnableDeleteButton(), bVar.getOnAddSetClickEvent(), bVar.getOnRemoveSetClickEvent(), bVar.getShowAddAndRemoveSetButtons(), bVar.getEnableAddSetButton(), bVar.getEnableRemoveSetButton(), bVar.getOnDeleteExerciseClickEvent(), bVar.m82632p(), onViewEvent, c28655q, 0, i14 & 896, 0);
            c28655q.m87173q(false);
        } else if (itemState instanceof InterfaceC27402h.c) {
            c28655q.m87150e0(887238405);
            InterfaceC27402h.c cVar = (InterfaceC27402h.c) itemState;
            AbstractC27401g.m82568K(cVar.getLeftStat(), cVar.getMiddleStat(), cVar.getRightStat(), cVar.getUseDividers(), modifier, c28655q, (i14 << 12) & 57344);
            c28655q.m87173q(false);
        } else {
            if (!(itemState instanceof InterfaceC27402h.a)) {
                throw AbstractC11895b.m32003v(-664145676, c28655q, false);
            }
            c28655q.m87150e0(887626215);
            InterfaceC27402h.a aVar = (InterfaceC27402h.a) itemState;
            TextResource volumeTitleDisplay = aVar.getVolumeTitleDisplay();
            TextResource weightTitleDisplay = aVar.getWeightTitleDisplay();
            TextResource avgHrTitleDisplay = aVar.getAvgHrTitleDisplay();
            TextResource tonnageUnitsDisplay = aVar.getTonnageUnitsDisplay();
            TextResource hrUnitsDisplay = aVar.getHrUnitsDisplay();
            TextResource tonnageDisplay = aVar.getTonnageDisplay();
            TextResource repsDisplay = aVar.getRepsDisplay();
            TextResource intensityDisplay = aVar.getIntensityDisplay();
            TextResource intensityTitleDisplay = aVar.getIntensityTitleDisplay();
            TextResource intensityUnitsDisplay = aVar.getIntensityUnitsDisplay();
            TextResource weightLabelDisplay = aVar.getWeightLabelDisplay();
            TextResource intensityLabelDisplay = aVar.getIntensityLabelDisplay();
            AbstractC27401g.m82599y(volumeTitleDisplay, weightTitleDisplay, avgHrTitleDisplay, tonnageUnitsDisplay, hrUnitsDisplay, tonnageDisplay, repsDisplay, aVar.getTotalsDisplay(), aVar.m82609j(), aVar.getIsOneRepMaxIntensityEnabled(), aVar.getHasSessionIntensity(), intensityTitleDisplay, intensityUnitsDisplay, intensityDisplay, weightLabelDisplay, intensityLabelDisplay, c28655q, 0, 0, 0);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(this, modifier, itemState, onViewEvent, i13, 21);
        }
    }
}
