package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.p019ui.LegacyPlayerControlView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.internal.StreamPlayerView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiActivityAttachmentMediaBinding implements InterfaceC13008a {
    public final ImageView audioImageView;
    public final FrameLayout contentContainer;
    public final LegacyPlayerControlView controls;
    public final ConstraintLayout header;
    public final ImageView headerLeftActionButton;
    public final TextView headerTitleTextView;
    public final StreamPlayerView playerView;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;

    private StreamUiActivityAttachmentMediaBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, LegacyPlayerControlView legacyPlayerControlView, ConstraintLayout constraintLayout2, ImageView imageView2, TextView textView, StreamPlayerView streamPlayerView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.audioImageView = imageView;
        this.contentContainer = frameLayout;
        this.controls = legacyPlayerControlView;
        this.header = constraintLayout2;
        this.headerLeftActionButton = imageView2;
        this.headerTitleTextView = textView;
        this.playerView = streamPlayerView;
        this.progressBar = progressBar;
    }

    public static StreamUiActivityAttachmentMediaBinding bind(View view) {
        int i13 = C19469R.id.audioImageView;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.contentContainer;
            FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
            if (frameLayout != null) {
                i13 = C19469R.id.controls;
                LegacyPlayerControlView legacyPlayerControlView = (LegacyPlayerControlView) AbstractC34235f.m108203J(view, i13);
                if (legacyPlayerControlView != null) {
                    i13 = C19469R.id.header;
                    ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                    if (constraintLayout != null) {
                        i13 = C19469R.id.headerLeftActionButton;
                        ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                        if (imageView2 != null) {
                            i13 = C19469R.id.headerTitleTextView;
                            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView != null) {
                                i13 = C19469R.id.playerView;
                                StreamPlayerView streamPlayerView = (StreamPlayerView) AbstractC34235f.m108203J(view, i13);
                                if (streamPlayerView != null) {
                                    i13 = C19469R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                                    if (progressBar != null) {
                                        return new StreamUiActivityAttachmentMediaBinding((ConstraintLayout) view, imageView, frameLayout, legacyPlayerControlView, constraintLayout, imageView2, textView, streamPlayerView, progressBar);
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

    public static StreamUiActivityAttachmentMediaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiActivityAttachmentMediaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_activity_attachment_media, viewGroup, false);
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
