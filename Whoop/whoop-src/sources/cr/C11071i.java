package cr;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p477s2.AbstractC32073e;
import p531uq.C35159d;

/* JADX INFO: renamed from: cr.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C11071i extends AbstractC32073e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35023a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35024b;

    public /* synthetic */ C11071i(Object obj, int i13) {
        this.f35023a = i13;
        this.f35024b = obj;
    }

    /* JADX INFO: renamed from: k0 */
    private final void m29861k0(int i13) {
    }

    @Override // p477s2.AbstractC32073e
    /* JADX INFO: renamed from: Q */
    public final void mo29862Q(int i13) {
        switch (this.f35023a) {
            case 0:
                C11073k c11073k = (C11073k) this.f35024b;
                c11073k.f35029e = true;
                InterfaceC11072j interfaceC11072j = (InterfaceC11072j) c11073k.f35030f.get();
                if (interfaceC11072j != null) {
                    interfaceC11072j.mo29864a();
                }
                break;
        }
    }

    @Override // p477s2.AbstractC32073e
    /* JADX INFO: renamed from: R */
    public final void mo29863R(Typeface typeface, boolean z4) {
        switch (this.f35023a) {
            case 0:
                if (!z4) {
                    C11073k c11073k = (C11073k) this.f35024b;
                    c11073k.f35029e = true;
                    InterfaceC11072j interfaceC11072j = (InterfaceC11072j) c11073k.f35030f.get();
                    if (interfaceC11072j != null) {
                        interfaceC11072j.mo29864a();
                    }
                    break;
                }
                break;
            default:
                Chip chip = (Chip) this.f35024b;
                C35159d c35159d = chip.f20870E;
                chip.setText(c35159d.f149207d1 ? c35159d.f149210f0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
