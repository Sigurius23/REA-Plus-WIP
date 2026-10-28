package com.iterable.iterableapi;

import android.app.Dialog;
import androidx.fragment.app.AbstractActivityC1340r0;

/* JADX INFO: renamed from: com.iterable.iterableapi.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogC5364q0 extends Dialog {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C5379v0 f21808w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC5364q0(C5379v0 c5379v0, AbstractActivityC1340r0 abstractActivityC1340r0, int i13) {
        super(abstractActivityC1340r0, i13);
        this.f21808w = c5379v0;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C5379v0 c5379v0 = this.f21808w;
        C5341k.f21742r.m16493n(c5379v0.f21863F, "itbl://backButton");
        C5341k.f21742r.m16494o(c5379v0.f21863F, "itbl://backButton", EnumC5342k0.f21760w, C5379v0.f21861P);
        c5379v0.m16534F();
        this.f21808w.m16533E();
    }
}
