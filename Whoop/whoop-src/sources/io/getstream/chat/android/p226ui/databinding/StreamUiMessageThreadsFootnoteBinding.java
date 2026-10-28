package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageThreadsFootnoteBinding implements InterfaceC13008a {
    public final Guideline bottomLine;
    public final UserAvatarView firstMineUserImage;
    public final UserAvatarView firstTheirUserImage;
    private final ConstraintLayout rootView;
    public final UserAvatarView secondMineUserImage;
    public final UserAvatarView secondTheirUserImage;
    public final TextView threadRepliesButton;
    public final ConstraintLayout threadsFootnoteContainer;
    public final AppCompatImageView threadsOrnamentLeft;
    public final AppCompatImageView threadsOrnamentRight;

    private StreamUiMessageThreadsFootnoteBinding(ConstraintLayout constraintLayout, Guideline guideline, UserAvatarView userAvatarView, UserAvatarView userAvatarView2, UserAvatarView userAvatarView3, UserAvatarView userAvatarView4, TextView textView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.rootView = constraintLayout;
        this.bottomLine = guideline;
        this.firstMineUserImage = userAvatarView;
        this.firstTheirUserImage = userAvatarView2;
        this.secondMineUserImage = userAvatarView3;
        this.secondTheirUserImage = userAvatarView4;
        this.threadRepliesButton = textView;
        this.threadsFootnoteContainer = constraintLayout2;
        this.threadsOrnamentLeft = appCompatImageView;
        this.threadsOrnamentRight = appCompatImageView2;
    }

    public static StreamUiMessageThreadsFootnoteBinding bind(View view) {
        int i13 = C19469R.id.bottomLine;
        Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
        if (guideline != null) {
            i13 = C19469R.id.firstMineUserImage;
            UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
            if (userAvatarView != null) {
                i13 = C19469R.id.firstTheirUserImage;
                UserAvatarView userAvatarView2 = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                if (userAvatarView2 != null) {
                    i13 = C19469R.id.secondMineUserImage;
                    UserAvatarView userAvatarView3 = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                    if (userAvatarView3 != null) {
                        i13 = C19469R.id.secondTheirUserImage;
                        UserAvatarView userAvatarView4 = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                        if (userAvatarView4 != null) {
                            i13 = C19469R.id.threadRepliesButton;
                            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i13 = C19469R.id.threadsOrnamentLeft;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC34235f.m108203J(view, i13);
                                if (appCompatImageView != null) {
                                    i13 = C19469R.id.threadsOrnamentRight;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC34235f.m108203J(view, i13);
                                    if (appCompatImageView2 != null) {
                                        return new StreamUiMessageThreadsFootnoteBinding(constraintLayout, guideline, userAvatarView, userAvatarView2, userAvatarView3, userAvatarView4, textView, constraintLayout, appCompatImageView, appCompatImageView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageThreadsFootnoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMessageThreadsFootnoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_message_threads_footnote, viewGroup, false);
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
