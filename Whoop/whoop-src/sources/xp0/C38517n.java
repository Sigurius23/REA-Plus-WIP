package xp0;

import android.graphics.Bitmap;
import android.text.Editable;
import android.view.View;
import com.whoop.community.CommunityManageTeamFragment;
import p715kotlin.jvm.functions.Function1;
import rq0.C31655c0;

/* JADX INFO: renamed from: xp0.n */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38517n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165773w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityManageTeamFragment f165774x;

    public /* synthetic */ C38517n(CommunityManageTeamFragment communityManageTeamFragment, int i13) {
        this.f165773w = i13;
        this.f165774x = communityManageTeamFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165773w) {
            case 0:
                return CommunityManageTeamFragment.m19028L0(this.f165774x, (C31655c0) obj);
            case 1:
                return CommunityManageTeamFragment.m19016F0(this.f165774x, (Bitmap) obj);
            case 2:
                return CommunityManageTeamFragment.m19042S0(this.f165774x, ((Integer) obj).intValue());
            case 3:
                return CommunityManageTeamFragment.m19070r0(this.f165774x, (Editable) obj);
            case 4:
                return CommunityManageTeamFragment.m19075w0(this.f165774x, (View) obj);
            default:
                return CommunityManageTeamFragment.m19071s0(this.f165774x, (Editable) obj);
        }
    }
}
