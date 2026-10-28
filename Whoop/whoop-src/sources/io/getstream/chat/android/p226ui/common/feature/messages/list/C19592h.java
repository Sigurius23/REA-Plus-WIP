package io.getstream.chat.android.p226ui.common.feature.messages.list;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessagePosition;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19592h implements MessagePositionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f74465a;

    public /* synthetic */ C19592h(long j7) {
        this.f74465a = j7;
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.list.MessagePositionHandler
    public final MessagePosition handleMessagePosition(Message message, Message message2, Message message3, boolean z4, boolean z13, boolean z14) {
        return MessagePositionHandler.Companion.defaultHandler$lambda$0(this.f74465a, message, message2, message3, z4, z13, z14);
    }
}
