package io.getstream.chat.android.client.api.internal;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: io.getstream.chat.android.client.api.internal.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19010d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73734w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DistinctChatApi f73735x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f73736y;

    public /* synthetic */ C19010d(DistinctChatApi distinctChatApi, String str, int i13) {
        this.f73734w = i13;
        this.f73735x = distinctChatApi;
        this.f73736y = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73734w) {
            case 0:
                return DistinctChatApi.m54543c(this.f73735x, this.f73736y);
            default:
                return DistinctChatApi.m54551k(this.f73735x, this.f73736y);
        }
    }
}
