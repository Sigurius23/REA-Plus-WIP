package com.whoop.bot.settings;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import ck1.C4785h;
import ge3.AbstractC15751g;
import hy0.C17748h;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ComposableSingletons$CoachSettingsScreenKt {
    public static final ComposableSingletons$CoachSettingsScreenKt INSTANCE = new ComposableSingletons$CoachSettingsScreenKt();
    private static Function3 lambda$919338267 = new C37816b(new C4785h(2), false, 919338267);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 lambda_919338267$lambda$0(InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            float f13 = 8;
            AbstractC15751g.m44449b(AbstractC1092a.m3358c(AbstractC1099a.m3395q(C2314t.f9131w, 2 * f13, 4 * f13), c38072d.m121949b(c28655q, i14).getWhite10(), new C17748h(f13, null)), c38072d.m121949b(c28655q, i14).getTransparent(), 1, 0.0f, c28655q, 384, 8);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    public final Function3 getLambda$919338267$bot_release() {
        return lambda$919338267;
    }
}
