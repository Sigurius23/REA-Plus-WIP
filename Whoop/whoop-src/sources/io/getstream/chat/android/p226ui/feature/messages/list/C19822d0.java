package io.getstream.chat.android.p226ui.feature.messages.list;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19822d0 implements MessageListView.OnPollOptionClickListener {
    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnPollOptionClickListener
    public final boolean onPollOptionClick(Message message, Poll poll, Option option) {
        MessageListView.defaultOnPollOptionClickListener$lambda$77(message, poll, option);
        return false;
    }
}
