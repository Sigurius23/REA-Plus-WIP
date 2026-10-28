package io.getstream.chat.android.client;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;

/* JADX INFO: renamed from: io.getstream.chat.android.client.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19073c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73778w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f73779x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f73780y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ QueryChannelRequest f73781z;

    public /* synthetic */ C19073c(String str, String str2, QueryChannelRequest queryChannelRequest, int i13) {
        this.f73778w = i13;
        this.f73779x = str;
        this.f73780y = str2;
        this.f73781z = queryChannelRequest;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iQueryChannelIdentifier;
        int i13 = this.f73778w;
        QueryChannelRequest queryChannelRequest = this.f73781z;
        String str = this.f73780y;
        String str2 = this.f73779x;
        switch (i13) {
            case 0:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                iQueryChannelIdentifier = IdentifiersKt.QueryChannelIdentifier(str2, str, queryChannelRequest);
                break;
            default:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                iQueryChannelIdentifier = IdentifiersKt.QueryChannelIdentifier(str2, str, queryChannelRequest);
                break;
        }
        return Integer.valueOf(iQueryChannelIdentifier);
    }
}
