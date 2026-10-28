package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19770a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74619w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PollItemViewHolder f74620x;

    public /* synthetic */ ViewOnClickListenerC19770a(PollItemViewHolder pollItemViewHolder, int i13) {
        this.f74619w = i13;
        this.f74620x = pollItemViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74619w) {
            case 0:
                AddCommentViewHolder.m55478a((AddCommentViewHolder) this.f74620x, view);
                break;
            case 1:
                CloseViewHolder.m55490a((CloseViewHolder) this.f74620x, view);
                break;
            case 2:
                ShowAllOptionsViewHolder.m55533a((ShowAllOptionsViewHolder) this.f74620x, view);
                break;
            case 3:
                SuggestOptionViewHolder.m55534a((SuggestOptionViewHolder) this.f74620x, view);
                break;
            case 4:
                ViewCommentsViewHolder.m55535a((ViewCommentsViewHolder) this.f74620x, view);
                break;
            default:
                ViewResultsViewHolder.m55536a((ViewResultsViewHolder) this.f74620x, view);
                break;
        }
    }
}
