package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import io.getstream.chat.android.p226ui.common.feature.messages.poll.PollOptionVotesViewEvent;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollOptionVotesViewState;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19856e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74763w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PollOptionVotesDialogFragment f74764x;

    public /* synthetic */ C19856e(PollOptionVotesDialogFragment pollOptionVotesDialogFragment, int i13) {
        this.f74763w = i13;
        this.f74764x = pollOptionVotesDialogFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74763w) {
            case 0:
                PollOptionVotesDialogFragment.observeEvents$lambda$10(this.f74764x, (PollOptionVotesViewEvent) obj);
                break;
            default:
                PollOptionVotesDialogFragment.observeState$lambda$8(this.f74764x, (PollOptionVotesViewState) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
