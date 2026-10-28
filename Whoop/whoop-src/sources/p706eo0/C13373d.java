package p706eo0;

import c93.InterfaceC4339a;
import com.whoop.changepassword.view.reset.PasswordResetFragment;

/* JADX INFO: renamed from: eo0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C13373d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46786w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PasswordResetFragment f46787x;

    public /* synthetic */ C13373d(PasswordResetFragment passwordResetFragment, int i13) {
        this.f46786w = i13;
        this.f46787x = passwordResetFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f46786w) {
            case 0:
                return PasswordResetFragment.m18444T(this.f46787x);
            case 1:
                return PasswordResetFragment.m18445U(this.f46787x);
            case 2:
                return PasswordResetFragment.m18437M(this.f46787x);
            case 3:
                return PasswordResetFragment.m18440P(this.f46787x);
            default:
                return PasswordResetFragment.m18442R(this.f46787x);
        }
    }
}
