package fa2;

import android.view.View;
import com.whoop.settings.about.AboutFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fa2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C14298a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52210w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AboutFragment f52211x;

    public /* synthetic */ C14298a(AboutFragment aboutFragment, int i13) {
        this.f52210w = i13;
        this.f52211x = aboutFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f52210w) {
            case 0:
                return AboutFragment.m25322K(this.f52211x, (View) obj);
            case 1:
                return AboutFragment.m25323L(this.f52211x, (View) obj);
            case 2:
                return AboutFragment.m25324M(this.f52211x, (View) obj);
            case 3:
                return AboutFragment.m25325N(this.f52211x, (View) obj);
            case 4:
                return AboutFragment.m25326O(this.f52211x, (View) obj);
            case 5:
                return AboutFragment.m25327P(this.f52211x, (View) obj);
            case 6:
                return AboutFragment.m25328Q(this.f52211x, (View) obj);
            default:
                return AboutFragment.m25330S(this.f52211x, (String) obj);
        }
    }
}
