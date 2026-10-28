package xp0;

import android.text.Editable;
import android.view.View;
import com.whoop.community.CommunityAddMemberFragment;
import p715kotlin.jvm.functions.Function1;
import rq0.C31679l;

/* JADX INFO: renamed from: xp0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38502c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165557w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityAddMemberFragment f165558x;

    public /* synthetic */ C38502c(CommunityAddMemberFragment communityAddMemberFragment, int i13) {
        this.f165557w = i13;
        this.f165558x = communityAddMemberFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165557w) {
            case 0:
                return CommunityAddMemberFragment.m18816c0(this.f165558x, (Editable) obj);
            case 1:
                return CommunityAddMemberFragment.m18817d0(this.f165558x, (View) obj);
            case 2:
                return CommunityAddMemberFragment.m18818e0(this.f165558x, (View) obj);
            case 3:
                return CommunityAddMemberFragment.m18819f0(this.f165558x, (View) obj);
            case 4:
                return CommunityAddMemberFragment.m18822i0(this.f165558x, (View) obj);
            case 5:
                return CommunityAddMemberFragment.m18824k0(this.f165558x, (View) obj);
            default:
                return CommunityAddMemberFragment.m18826m0(this.f165558x, (C31679l) obj);
        }
    }
}
