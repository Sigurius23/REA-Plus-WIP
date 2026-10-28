package p720m91;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import p026b2.C2314t;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: m91.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J3\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0017¢\u0006\u0004\b\n\u0010\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lm91/f;", "Lm91/u;", "VS", "", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "Ll83/a0;", "onViewEvent", "Compose", "(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25297f<VS extends InterfaceC25312u> {
    void Compose(Modifier modifier, VS vs3, Function1 function1, Composer composer, int i13);

    default void Compose(VS itemState, Function1 onViewEvent, Composer composer, int i13) {
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1002951623);
        int i14 = i13 << 3;
        Compose(C2314t.f9131w, itemState, onViewEvent, c28655q, (i14 & 112) | 6 | (i14 & 896) | (i14 & 7168));
        c28655q.m87173q(false);
    }
}
