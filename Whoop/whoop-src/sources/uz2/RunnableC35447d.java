package uz2;

import com.whoop.whooplive.selfie.SelfieActivity;

/* JADX INFO: renamed from: uz2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC35447d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150948w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SelfieActivity f150949x;

    public /* synthetic */ RunnableC35447d(SelfieActivity selfieActivity, int i13) {
        this.f150948w = i13;
        this.f150949x = selfieActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f150948w) {
            case 0:
                this.f150949x.m28780O1();
                break;
            case 1:
                this.f150949x.m28771L1();
                break;
            case 2:
                this.f150949x.m28768K1();
                break;
            case 3:
                this.f150949x.m28774M1();
                break;
            default:
                this.f150949x.m28777N1();
                break;
        }
    }
}
