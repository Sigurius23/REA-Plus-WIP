package io.getstream.chat.android.p226ui.feature.messages.list;

import io.getstream.chat.android.models.Poll;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19828g0 implements MessageListView.OnViewPollResultClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74743b;

    public /* synthetic */ C19828g0(Object obj, int i13) {
        this.f74742a = i13;
        this.f74743b = obj;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnViewPollResultClickListener
    public final boolean onViewPollResultClick(Poll poll) {
        switch (this.f74742a) {
            case 0:
                return MessageListView.defaultOnViewPollResultClickListener$lambda$82((MessageListView) this.f74743b, poll);
            default:
                return MessageListView.setOnViewPollResultClickListener$lambda$132((MessageListView.OnViewPollResultClickListener) this.f74743b, poll);
        }
    }
}
