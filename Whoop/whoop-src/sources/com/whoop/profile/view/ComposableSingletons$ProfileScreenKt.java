package com.whoop.profile.view;

import androidx.compose.runtime.Composer;
import b91.C2886a;
import ck1.C4785h;
import com.whoop.profile.C9691R;
import l83.C23454a0;
import p291l0.InterfaceC22997s1;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ComposableSingletons$ProfileScreenKt {
    public static final ComposableSingletons$ProfileScreenKt INSTANCE = new ComposableSingletons$ProfileScreenKt();
    private static Function3 lambda$2006682372 = new C37816b(new C4785h(4), false, 2006682372);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 lambda_2006682372$lambda$0(InterfaceC22997s1 DropdownMenuItem, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenuItem, "$this$DropdownMenuItem");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_report_menu_item);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM92103Y, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getP2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    public final Function3 getLambda$2006682372$profile_release() {
        return lambda$2006682372;
    }
}
