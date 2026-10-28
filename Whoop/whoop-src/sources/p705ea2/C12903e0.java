package p705ea2;

import android.view.View;
import com.whoop.settings.TutorialsFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ea2.e0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12903e0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44404w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TutorialsFragment f44405x;

    public /* synthetic */ C12903e0(TutorialsFragment tutorialsFragment, int i13) {
        this.f44404w = i13;
        this.f44405x = tutorialsFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44404w) {
            case 0:
                return TutorialsFragment.m25292H(this.f44405x, (View) obj);
            case 1:
                return TutorialsFragment.m25295K(this.f44405x, (View) obj);
            default:
                return TutorialsFragment.m25296L(this.f44405x, (View) obj);
        }
    }
}
