package k30;

import android.view.View;
import android.widget.ScrollView;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import ec.InterfaceC13008a;

/* JADX INFO: renamed from: k30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C22169b implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    public final ScrollView f85982a;

    /* JADX INFO: renamed from: b */
    public final BrandZoneView f85983b;

    /* JADX INFO: renamed from: c */
    public final ChallengeZoneView f85984c;

    /* JADX INFO: renamed from: d */
    public final InformationZoneView f85985d;

    public C22169b(ScrollView scrollView, BrandZoneView brandZoneView, ChallengeZoneView challengeZoneView, InformationZoneView informationZoneView) {
        this.f85982a = scrollView;
        this.f85983b = brandZoneView;
        this.f85984c = challengeZoneView;
        this.f85985d = informationZoneView;
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.f85982a;
    }
}
