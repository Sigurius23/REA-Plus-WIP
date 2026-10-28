package com.whoop.profile.view.memberlevels;

import android.view.View;
import java.util.List;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.profile.view.memberlevels.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9815a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28572w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MemberLevelsFragment f28573x;

    public /* synthetic */ C9815a(MemberLevelsFragment memberLevelsFragment, int i13) {
        this.f28572w = i13;
        this.f28573x = memberLevelsFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28572w) {
            case 0:
                return MemberLevelsFragment.initViews$lambda$0$0(this.f28573x, (List) obj);
            default:
                return MemberLevelsFragment.onViewCreated$lambda$0(this.f28573x, (View) obj);
        }
    }
}
