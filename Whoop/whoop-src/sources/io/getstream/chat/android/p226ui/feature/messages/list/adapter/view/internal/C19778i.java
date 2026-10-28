package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19778i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74637w;

    public /* synthetic */ C19778i(int i13) {
        this.f74637w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74637w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                FileAttachmentsAdapter.onDetachedFromRecyclerView$lambda$2((FileAttachmentViewHolder) obj);
                break;
            case 1:
                ((Integer) obj).getClass();
                int i14 = AudioWavesSeekBar.f74614w;
                break;
            case 2:
                PollView.onSuggestOptionClick$lambda$4((Poll) obj);
                break;
            case 3:
                PollView.onAddCommentClick$lambda$5((Poll) obj);
                break;
            case 4:
                PollView.onViewCommentsClick$lambda$6((Poll) obj);
                break;
            case 5:
                PollView.onOptionClick$lambda$0((Option) obj);
                break;
            case 6:
                PollView.onClosePollClick$lambda$1((Poll) obj);
                break;
            case 7:
                PollView.onViewPollResultsClick$lambda$2((Poll) obj);
                break;
            default:
                ((Float) obj).getClass();
                int i15 = WaveformView.f74618w;
                break;
        }
        return c23454a0;
    }
}
