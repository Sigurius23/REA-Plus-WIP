package io.getstream.chat.android.client.api.internal;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: io.getstream.chat.android.client.api.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19007a implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f73715E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73716w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DistinctChatApi f73717x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f73718y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f73719z;

    public /* synthetic */ C19007a(DistinctChatApi distinctChatApi, String str, int i13, String str2) {
        this.f73717x = distinctChatApi;
        this.f73718y = str;
        this.f73715E = i13;
        this.f73719z = str2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73716w) {
            case 0:
                return DistinctChatApi.m54542b(this.f73717x, this.f73718y, this.f73715E, this.f73719z);
            default:
                String str = this.f73719z;
                return DistinctChatApi.m54548h(this.f73717x, this.f73718y, this.f73715E, str);
        }
    }

    public /* synthetic */ C19007a(DistinctChatApi distinctChatApi, String str, String str2, int i13) {
        this.f73717x = distinctChatApi;
        this.f73718y = str;
        this.f73719z = str2;
        this.f73715E = i13;
    }
}
