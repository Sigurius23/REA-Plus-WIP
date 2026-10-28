package io.getstream.chat.android.p226ui.common.feature.messages.list;

import io.getstream.chat.android.models.Message;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19585a implements DateSeparatorHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74450a;

    public /* synthetic */ C19585a(int i13) {
        this.f74450a = i13;
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.list.DateSeparatorHandler
    public final boolean shouldAddDateSeparator(Message message, Message message2) {
        switch (this.f74450a) {
            case 0:
                return DateSeparatorHandler.Companion.defaultDateSeparatorHandler$lambda$0(message, message2);
            case 1:
                return DateSeparatorHandler.Companion.getDefaultThreadDateSeparatorHandler$lambda$2(message, message2);
            case 2:
                MessageListController.setDateSeparatorHandler$lambda$156(message, message2);
                return false;
            default:
                MessageListController.setThreadDateSeparatorHandler$lambda$157(message, message2);
                return false;
        }
    }
}
