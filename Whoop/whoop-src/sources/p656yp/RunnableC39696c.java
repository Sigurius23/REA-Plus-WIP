package p656yp;

import com.google.android.gms.oss.licenses.OssLicensesActivity;
import p573w5.C36833d;

/* JADX INFO: renamed from: yp.c */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC39696c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170859w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f170860x;

    public /* synthetic */ RunnableC39696c(Object obj, int i13) {
        this.f170859w = i13;
        this.f170860x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f170859w) {
            case 0:
                OssLicensesActivity ossLicensesActivity = (OssLicensesActivity) this.f170860x;
                ossLicensesActivity.f20623y.scrollTo(0, ossLicensesActivity.f20624z.getLayout().getLineTop(ossLicensesActivity.f20624z.getLayout().getLineForOffset(ossLicensesActivity.f20618E)));
                break;
            default:
                ((C36833d) this.f170860x).m118084n(0);
                break;
        }
    }
}
