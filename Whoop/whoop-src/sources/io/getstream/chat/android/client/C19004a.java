package io.getstream.chat.android.client;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import io.getstream.chat.android.models.EventType;

/* JADX INFO: renamed from: io.getstream.chat.android.client.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19004a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73710w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f73711x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f73712y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f73713z;

    public /* synthetic */ C19004a(int i13, String str, String str2, String str3) {
        this.f73710w = i13;
        this.f73711x = str;
        this.f73712y = str2;
        this.f73713z = str3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iDeleteReactionIdentifier;
        int i13 = this.f73710w;
        String str = this.f73713z;
        String str2 = this.f73712y;
        String str3 = this.f73711x;
        switch (i13) {
            case 0:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                iDeleteReactionIdentifier = IdentifiersKt.DeleteReactionIdentifier(str3, str2, str);
                break;
            case 1:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                iDeleteReactionIdentifier = IdentifiersKt.SendEventIdentifier(EventType.TYPING_START, str3, str2, str);
                break;
            default:
                ChatClient.Companion companion3 = ChatClient.INSTANCE;
                iDeleteReactionIdentifier = IdentifiersKt.SendEventIdentifier(EventType.TYPING_STOP, str3, str2, str);
                break;
        }
        return Integer.valueOf(iDeleteReactionIdentifier);
    }
}
