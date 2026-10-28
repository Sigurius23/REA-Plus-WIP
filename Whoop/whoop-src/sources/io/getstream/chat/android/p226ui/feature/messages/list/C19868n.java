package io.getstream.chat.android.p226ui.feature.messages.list;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.n */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19868n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74778w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListView f74779x;

    public /* synthetic */ C19868n(MessageListView messageListView, int i13) {
        this.f74778w = i13;
        this.f74779x = messageListView;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74778w) {
            case 0:
                return Boolean.valueOf(MessageListView.initSwipeToReply$lambda$103$lambda$99(this.f74779x, (Message) obj));
            case 1:
                return MessageListView.getLanguageDisplayName$lambda$58(this.f74779x, (String) obj);
            default:
                MessageListView.showMessageOptionsDialog$lambda$48(this.f74779x, (MessageAction) obj);
                return C23454a0.f92919a;
        }
    }
}
