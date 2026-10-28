package p027b3;

import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import p390p1.C28679w;
import p390p1.InterfaceC28663s;

/* JADX INFO: renamed from: b3.w3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2460w3 implements InterfaceC28663s, InterfaceC1577e0 {

    /* JADX INFO: renamed from: E */
    public InterfaceC4351m f9603E = AbstractC2448u1.f9554a;

    /* JADX INFO: renamed from: w */
    public final AndroidComposeView f9604w;

    /* JADX INFO: renamed from: x */
    public final C28679w f9605x;

    /* JADX INFO: renamed from: y */
    public boolean f9606y;

    /* JADX INFO: renamed from: z */
    public AbstractC1638x f9607z;

    public C2460w3(AndroidComposeView androidComposeView, C28679w c28679w) {
        this.f9604w = androidComposeView;
        this.f9605x = c28679w;
    }

    /* JADX INFO: renamed from: a */
    public final void m7440a(InterfaceC4351m interfaceC4351m) {
        this.f9604w.setOnViewTreeOwnersAvailable(new C2442t0(4, this, interfaceC4351m));
    }

    @Override // p390p1.InterfaceC28663s
    public final void dispose() {
        if (!this.f9606y) {
            this.f9606y = true;
            this.f9604w.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC1638x abstractC1638x = this.f9607z;
            if (abstractC1638x != null) {
                abstractC1638x.mo4988d(this);
            }
        }
        this.f9605x.dispose();
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        if (enumC1632v == EnumC1632v.ON_DESTROY) {
            dispose();
        } else {
            if (enumC1632v != EnumC1632v.ON_CREATE || this.f9606y) {
                return;
            }
            m7440a(this.f9603E);
        }
    }
}
