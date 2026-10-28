package com.whoop.profile.view.components;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.navigation.C9598e;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import v11.C35546d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/profile/view/components/ContextHubTileItem;", "Lm91/f;", "Lcom/whoop/profile/view/components/ContextHubTileViewState;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Compose", "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ContextHubTileItem implements InterfaceC25297f<ContextHubTileViewState> {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 Compose$lambda$0(ContextHubTileItem contextHubTileItem, Modifier modifier, ContextHubTileViewState contextHubTileViewState, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        contextHubTileItem.Compose(modifier, contextHubTileViewState, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    public /* bridge */ void Compose(ContextHubTileViewState contextHubTileViewState, Function1 function1, Composer composer, int i13) {
        super.Compose(contextHubTileViewState, function1, composer, i13);
    }

    @Override // p720m91.InterfaceC25297f
    public void Compose(Modifier modifier, ContextHubTileViewState itemState, Function1 onViewEvent, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1117607807);
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
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            ContextHubTileKt.ContextHubTile(modifier, itemState, onViewEvent, c28655q, (i14 & 896) | (i14 & 14) | (C9598e.f28134d << 3) | (i14 & 112), 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35546d(this, modifier, itemState, onViewEvent, i13, 5);
        }
    }
}
