package io.getstream.chat.android.client;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.models.SendActionRequest;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;

/* JADX INFO: renamed from: io.getstream.chat.android.client.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19087e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SendActionRequest f73790x;

    public /* synthetic */ C19087e(SendActionRequest sendActionRequest, int i13) {
        this.f73789w = i13;
        this.f73790x = sendActionRequest;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iShuffleGiphyIdentifier;
        int i13 = this.f73789w;
        SendActionRequest sendActionRequest = this.f73790x;
        switch (i13) {
            case 0:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                iShuffleGiphyIdentifier = IdentifiersKt.ShuffleGiphyIdentifier(sendActionRequest);
                break;
            default:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                iShuffleGiphyIdentifier = IdentifiersKt.SendGiphyIdentifier(sendActionRequest);
                break;
        }
        return Integer.valueOf(iShuffleGiphyIdentifier);
    }
}
