package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollResultsViewState;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19854c implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74756w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC1717o2 f74757x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74758y;

    public /* synthetic */ ViewOnClickListenerC19854c(AbstractC1717o2 abstractC1717o2, Object obj, int i13) {
        this.f74756w = i13;
        this.f74757x = abstractC1717o2;
        this.f74758y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74756w) {
            case 0:
                AllPollOptionsDialogFragment.OptionsAdapter.OptionViewHolder.m55619a((AllPollOptionsDialogFragment.OptionsAdapter.OptionViewHolder) this.f74757x, (AllPollOptionsDialogFragment.OptionsAdapter.OptionItem) this.f74758y, view);
                break;
            default:
                PollResultsDialogFragment.ResultsAdapter.ResultViewHolder.m55631a((PollResultsDialogFragment.ResultsAdapter.ResultViewHolder) this.f74757x, (PollResultsViewState.ResultItem) this.f74758y, view);
                break;
        }
    }
}
