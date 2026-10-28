package io.getstream.chat.android.client.api2;

import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.api2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19051a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73739w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f73740x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ MoshiChatApi f73741y;

    public /* synthetic */ C19051a(InterfaceC4351m interfaceC4351m, MoshiChatApi moshiChatApi, int i13) {
        this.f73739w = i13;
        this.f73740x = interfaceC4351m;
        this.f73741y = moshiChatApi;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73739w) {
            case 0:
                return MoshiChatApi.flatMapDomain$lambda$128(this.f73740x, this.f73741y, obj);
            default:
                return MoshiChatApi.mapDomain$lambda$125(this.f73740x, this.f73741y, obj);
        }
    }
}
