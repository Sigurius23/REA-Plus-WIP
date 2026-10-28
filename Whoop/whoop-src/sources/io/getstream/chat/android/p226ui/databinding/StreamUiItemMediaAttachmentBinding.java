package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemMediaAttachmentBinding implements InterfaceC13008a {
    public final ConstraintLayout mediaContainer;
    public final ImageView mediaImageView;
    public final CardView playButtonCardView;
    public final ImageView playButtonImageView;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final CardView userAvatarCardView;
    public final UserAvatarView userAvatarView;

    private StreamUiItemMediaAttachmentBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, CardView cardView, ImageView imageView2, ProgressBar progressBar, CardView cardView2, UserAvatarView userAvatarView) {
        this.rootView = constraintLayout;
        this.mediaContainer = constraintLayout2;
        this.mediaImageView = imageView;
        this.playButtonCardView = cardView;
        this.playButtonImageView = imageView2;
        this.progressBar = progressBar;
        this.userAvatarCardView = cardView2;
        this.userAvatarView = userAvatarView;
    }

    public static StreamUiItemMediaAttachmentBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = C19469R.id.mediaImageView;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.playButtonCardView;
            CardView cardView = (CardView) AbstractC34235f.m108203J(view, i13);
            if (cardView != null) {
                i13 = C19469R.id.playButtonImageView;
                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView2 != null) {
                    i13 = C19469R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                    if (progressBar != null) {
                        i13 = C19469R.id.userAvatarCardView;
                        CardView cardView2 = (CardView) AbstractC34235f.m108203J(view, i13);
                        if (cardView2 != null) {
                            i13 = C19469R.id.userAvatarView;
                            UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                            if (userAvatarView != null) {
                                return new StreamUiItemMediaAttachmentBinding(constraintLayout, constraintLayout, imageView, cardView, imageView2, progressBar, cardView2, userAvatarView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemMediaAttachmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemMediaAttachmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_media_attachment, viewGroup, false);
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
