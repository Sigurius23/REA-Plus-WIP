package s40;

import com.stripe.android.view.CardMultilineWidget;

/* JADX INFO: renamed from: s40.n */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC32167n implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133241w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CardMultilineWidget f133242x;

    public /* synthetic */ RunnableC32167n(int i13, CardMultilineWidget cardMultilineWidget) {
        this.f133241w = i13;
        this.f133242x = cardMultilineWidget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f133241w) {
            case 0:
                this.f133242x.cvcEditText.requestFocus();
                break;
            case 1:
                this.f133242x.postalCodeEditText.requestFocus();
                break;
            default:
                this.f133242x.expiryDateEditText.requestFocus();
                break;
        }
    }
}
