package p027b3;

import android.view.View;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p411q2.InterfaceC29805a;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: b3.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2458w1 implements InterfaceC29805a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9599a;

    /* JADX INFO: renamed from: b */
    public final View f9600b;

    public /* synthetic */ C2458w1(View view, int i13) {
        this.f9599a = i13;
        this.f9600b = view;
    }

    @Override // p411q2.InterfaceC29805a
    /* JADX INFO: renamed from: a */
    public final void mo7428a(int i13) {
        switch (this.f9599a) {
            case 0:
                boolean zM108202I = AbstractC34235f.m108202I(i13, 16);
                View view = this.f9600b;
                if (zM108202I) {
                    view.performHapticFeedback(16);
                } else if (AbstractC34235f.m108202I(i13, 6)) {
                    view.performHapticFeedback(6);
                } else if (AbstractC34235f.m108202I(i13, 13)) {
                    view.performHapticFeedback(13);
                } else if (AbstractC34235f.m108202I(i13, 23)) {
                    view.performHapticFeedback(23);
                } else if (AbstractC34235f.m108202I(i13, 3)) {
                    view.performHapticFeedback(3);
                } else if (AbstractC34235f.m108202I(i13, 0)) {
                    view.performHapticFeedback(0);
                } else if (AbstractC34235f.m108202I(i13, 17)) {
                    view.performHapticFeedback(17);
                } else if (AbstractC34235f.m108202I(i13, 27)) {
                    view.performHapticFeedback(27);
                } else if (AbstractC34235f.m108202I(i13, 26)) {
                    view.performHapticFeedback(26);
                } else if (AbstractC34235f.m108202I(i13, 9)) {
                    view.performHapticFeedback(9);
                } else if (AbstractC34235f.m108202I(i13, 22)) {
                    view.performHapticFeedback(22);
                } else if (AbstractC34235f.m108202I(i13, 21)) {
                    view.performHapticFeedback(21);
                } else if (AbstractC34235f.m108202I(i13, 1)) {
                    view.performHapticFeedback(1);
                }
                break;
            default:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f9600b;
                if (AbstractC34235f.m108202I(i13, 16)) {
                    androidComposeView.performHapticFeedback(16);
                } else if (AbstractC34235f.m108202I(i13, 6)) {
                    androidComposeView.performHapticFeedback(6);
                } else if (AbstractC34235f.m108202I(i13, 13)) {
                    androidComposeView.performHapticFeedback(13);
                } else if (AbstractC34235f.m108202I(i13, 23)) {
                    androidComposeView.performHapticFeedback(23);
                } else if (AbstractC34235f.m108202I(i13, 3)) {
                    androidComposeView.performHapticFeedback(3);
                } else if (AbstractC34235f.m108202I(i13, 0)) {
                    androidComposeView.performHapticFeedback(0);
                } else if (AbstractC34235f.m108202I(i13, 17)) {
                    androidComposeView.performHapticFeedback(17);
                } else if (AbstractC34235f.m108202I(i13, 27)) {
                    androidComposeView.performHapticFeedback(27);
                } else if (AbstractC34235f.m108202I(i13, 26)) {
                    androidComposeView.performHapticFeedback(26);
                } else if (AbstractC34235f.m108202I(i13, 9)) {
                    androidComposeView.performHapticFeedback(9);
                } else if (AbstractC34235f.m108202I(i13, 22)) {
                    androidComposeView.performHapticFeedback(22);
                } else if (AbstractC34235f.m108202I(i13, 21)) {
                    androidComposeView.performHapticFeedback(21);
                } else if (AbstractC34235f.m108202I(i13, 1)) {
                    androidComposeView.performHapticFeedback(1);
                }
                break;
        }
    }
}
