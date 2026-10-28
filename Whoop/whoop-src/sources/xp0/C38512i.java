package xp0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whoop.community.CommunityLandingHostFragment;
import eq0.AbstractC13522r0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xp0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38512i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165758w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BottomSheetBehavior f165759x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CommunityLandingHostFragment f165760y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC13522r0 f165761z;

    public /* synthetic */ C38512i(BottomSheetBehavior bottomSheetBehavior, CommunityLandingHostFragment communityLandingHostFragment, AbstractC13522r0 abstractC13522r0) {
        this.f165759x = bottomSheetBehavior;
        this.f165760y = communityLandingHostFragment;
        this.f165761z = abstractC13522r0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165758w) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = this.f165759x;
                return CommunityLandingHostFragment.m18899B1(this.f165760y, bottomSheetBehavior, this.f165761z, (View) obj);
            default:
                return CommunityLandingHostFragment.m18901C1(this.f165759x, this.f165760y, this.f165761z, (View) obj);
        }
    }

    public /* synthetic */ C38512i(CommunityLandingHostFragment communityLandingHostFragment, BottomSheetBehavior bottomSheetBehavior, AbstractC13522r0 abstractC13522r0) {
        this.f165760y = communityLandingHostFragment;
        this.f165759x = bottomSheetBehavior;
        this.f165761z = abstractC13522r0;
    }
}
