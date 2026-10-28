package com.whoop.data.local.room.dao.wipeable;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.wipeable.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6514a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25401w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f25402x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f25403y;

    public /* synthetic */ C6514a(boolean z4, int i13, int i14) {
        this.f25401w = i14;
        this.f25402x = z4;
        this.f25403y = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25401w) {
            case 0:
                return FeatureTeamDao_Impl.lambda$updateBannerStatus$6(this.f25402x, this.f25403y, (InterfaceC33687a) obj);
            case 1:
                return MemberStoryDao_Impl.lambda$updateBannerStatus$7(this.f25402x, this.f25403y, (InterfaceC33687a) obj);
            default:
                return TeamInviteDao_Impl.lambda$updateBadgeStatus$4(this.f25402x, this.f25403y, (InterfaceC33687a) obj);
        }
    }
}
