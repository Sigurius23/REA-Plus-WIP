package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemPollAnswerBinding implements InterfaceC13008a {
    public final UserAvatarView avatarFirstVote;
    public final UserAvatarView avatarSecondVote;
    public final Barrier barrier;
    public final AppCompatImageView check;
    public final AppCompatTextView option;
    private final ConstraintLayout rootView;
    public final AppCompatTextView votes;
    public final LinearProgressIndicator votesPercentage;

    private StreamUiItemPollAnswerBinding(ConstraintLayout constraintLayout, UserAvatarView userAvatarView, UserAvatarView userAvatarView2, Barrier barrier, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearProgressIndicator linearProgressIndicator) {
        this.rootView = constraintLayout;
        this.avatarFirstVote = userAvatarView;
        this.avatarSecondVote = userAvatarView2;
        this.barrier = barrier;
        this.check = appCompatImageView;
        this.option = appCompatTextView;
        this.votes = appCompatTextView2;
        this.votesPercentage = linearProgressIndicator;
    }

    public static StreamUiItemPollAnswerBinding bind(View view) {
        int i13 = C19469R.id.avatarFirstVote;
        UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
        if (userAvatarView != null) {
            i13 = C19469R.id.avatarSecondVote;
            UserAvatarView userAvatarView2 = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
            if (userAvatarView2 != null) {
                i13 = C19469R.id.barrier;
                Barrier barrier = (Barrier) AbstractC34235f.m108203J(view, i13);
                if (barrier != null) {
                    i13 = C19469R.id.check;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC34235f.m108203J(view, i13);
                    if (appCompatImageView != null) {
                        i13 = C19469R.id.option;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                        if (appCompatTextView != null) {
                            i13 = C19469R.id.votes;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                            if (appCompatTextView2 != null) {
                                i13 = C19469R.id.votesPercentage;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) AbstractC34235f.m108203J(view, i13);
                                if (linearProgressIndicator != null) {
                                    return new StreamUiItemPollAnswerBinding((ConstraintLayout) view, userAvatarView, userAvatarView2, barrier, appCompatImageView, appCompatTextView, appCompatTextView2, linearProgressIndicator);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemPollAnswerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemPollAnswerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_poll_answer, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }
}
