package io.getstream.chat.android.client;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: io.getstream.chat.android.client.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19092i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73803w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f73804x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f73805y;

    public /* synthetic */ C19092i(int i13, String str) {
        this.f73804x = i13;
        this.f73805y = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f73803w;
        String str = this.f73805y;
        int i14 = this.f73804x;
        switch (i13) {
            case 0:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.GetRepliesIdentifier(str, i14));
            default:
                return AbstractC11266d.m30456j(i14, "Command completed with nonzero exit code ", ": ", str);
        }
    }

    public /* synthetic */ C19092i(String str, int i13) {
        this.f73805y = str;
        this.f73804x = i13;
    }
}
