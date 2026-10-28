package p027b3;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p048ce.AbstractC4482w;
import p636y3.C39180l;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2456w extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9594w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AndroidComposeView f9595x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2456w(AndroidComposeView androidComposeView, int i13) {
        super(0);
        this.f9594w = i13;
        this.f9595x = androidComposeView;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int actionMasked;
        switch (this.f9594w) {
            case 0:
                return new C39180l(AbstractC4482w.m14012v(this.f9595x));
            case 1:
                AndroidComposeView androidComposeView = this.f9595x;
                MotionEvent motionEvent = androidComposeView.f4925S0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.f4927T0 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.f4935Y0);
                }
                return C23454a0.f92919a;
            default:
                return this.f9595x.get_viewTreeOwners();
        }
    }
}
