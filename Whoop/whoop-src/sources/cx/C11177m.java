package cx;

import android.os.Build;
import android.os.Environment;
import ax.InterfaceC2116a;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cx.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C11177m extends AbstractC11165a {
    @Override // cx.InterfaceC11166b
    /* JADX INFO: renamed from: m */
    public final void mo30274m() {
        C11175k c11175k = this.f35749a;
        if (!c11175k.f35778d.contains("android.permission.MANAGE_EXTERNAL_STORAGE") || Build.VERSION.SDK_INT < 30) {
            m30273a();
            return;
        }
        if (Environment.isExternalStorageManager()) {
            m30273a();
            return;
        }
        if (c11175k.f35787m == null) {
            m30273a();
            return;
        }
        ArrayList arrayListM118964P = AbstractC37056f.m118964P("android.permission.MANAGE_EXTERNAL_STORAGE");
        InterfaceC2116a interfaceC2116a = c11175k.f35787m;
        AbstractC22676k.m65747g(interfaceC2116a);
        interfaceC2116a.mo6682a(this.f35751c, arrayListM118964P);
    }

    @Override // cx.InterfaceC11166b
    /* JADX INFO: renamed from: n */
    public final void mo30275n(List list) {
        C11175k c11175k = this.f35749a;
        c11175k.m30282c().m30277B(c11175k, this);
    }
}
