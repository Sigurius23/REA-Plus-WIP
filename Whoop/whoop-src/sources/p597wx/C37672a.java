package p597wx;

import c93.InterfaceC4339a;
import com.stripe.android.attestation.AttestationActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: wx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37672a extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f161423w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AttestationActivity f161424x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37672a(AttestationActivity attestationActivity, int i13) {
        super(0);
        this.f161423w = i13;
        this.f161424x = attestationActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f161423w) {
            case 0:
                return this.f161424x.getViewModelStore();
            default:
                return this.f161424x.getDefaultViewModelCreationExtras();
        }
    }
}
