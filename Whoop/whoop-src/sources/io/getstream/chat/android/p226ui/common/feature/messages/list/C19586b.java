package io.getstream.chat.android.p226ui.common.feature.messages.list;

import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19586b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74451w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListController f74452x;

    public /* synthetic */ C19586b(MessageListController messageListController, int i13) {
        this.f74451w = i13;
        this.f74452x = messageListController;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74451w) {
            case 0:
                return MessageListController.originalTranslationsStore_delegate$lambda$0(this.f74452x);
            default:
                MessageListController.m55042f(this.f74452x);
                return C23454a0.f92919a;
        }
    }
}
