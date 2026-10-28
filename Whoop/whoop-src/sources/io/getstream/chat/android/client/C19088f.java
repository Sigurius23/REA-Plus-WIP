package io.getstream.chat.android.client;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;

/* JADX INFO: renamed from: io.getstream.chat.android.client.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19088f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73794w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f73795x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f73796y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f73797z;

    public /* synthetic */ C19088f(String str, int i13, String str2) {
        this.f73795x = str;
        this.f73797z = i13;
        this.f73796y = str2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int newerRepliesIdentifier;
        int i13 = this.f73794w;
        int i14 = this.f73797z;
        String str = this.f73796y;
        String str2 = this.f73795x;
        switch (i13) {
            case 0:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                newerRepliesIdentifier = IdentifiersKt.getNewerRepliesIdentifier(str2, i14, str);
                break;
            default:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                newerRepliesIdentifier = IdentifiersKt.GetRepliesMoreIdentifier(str2, str, i14);
                break;
        }
        return Integer.valueOf(newerRepliesIdentifier);
    }

    public /* synthetic */ C19088f(String str, String str2, int i13) {
        this.f73795x = str;
        this.f73796y = str2;
        this.f73797z = i13;
    }
}
