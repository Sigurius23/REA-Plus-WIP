package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.p019ui.AspectRatioFrameLayout;
import androidx.media3.p019ui.SubtitleView;
import com.whoop.android.R;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiExoPlayerViewBinding implements InterfaceC13008a {
    public final FrameLayout exoAdOverlay;
    public final ImageView exoArtwork;
    public final ProgressBar exoBuffering;
    public final AspectRatioFrameLayout exoContentFrame;
    public final View exoControllerPlaceholder;
    public final TextView exoErrorMessage;
    public final ImageView exoImage;
    public final FrameLayout exoOverlay;
    public final View exoShutter;
    public final SubtitleView exoSubtitles;
    private final View rootView;

    private StreamUiExoPlayerViewBinding(View view, FrameLayout frameLayout, ImageView imageView, ProgressBar progressBar, AspectRatioFrameLayout aspectRatioFrameLayout, View view2, TextView textView, ImageView imageView2, FrameLayout frameLayout2, View view3, SubtitleView subtitleView) {
        this.rootView = view;
        this.exoAdOverlay = frameLayout;
        this.exoArtwork = imageView;
        this.exoBuffering = progressBar;
        this.exoContentFrame = aspectRatioFrameLayout;
        this.exoControllerPlaceholder = view2;
        this.exoErrorMessage = textView;
        this.exoImage = imageView2;
        this.exoOverlay = frameLayout2;
        this.exoShutter = view3;
        this.exoSubtitles = subtitleView;
    }

    public static StreamUiExoPlayerViewBinding bind(View view) {
        int i13 = R.id.exo_ad_overlay;
        FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, R.id.exo_ad_overlay);
        if (frameLayout != null) {
            i13 = R.id.exo_artwork;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, R.id.exo_artwork);
            if (imageView != null) {
                i13 = R.id.exo_buffering;
                ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, R.id.exo_buffering);
                if (progressBar != null) {
                    i13 = R.id.exo_content_frame;
                    AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) AbstractC34235f.m108203J(view, R.id.exo_content_frame);
                    if (aspectRatioFrameLayout != null) {
                        i13 = R.id.exo_controller_placeholder;
                        View viewM108203J = AbstractC34235f.m108203J(view, R.id.exo_controller_placeholder);
                        if (viewM108203J != null) {
                            i13 = R.id.exo_error_message;
                            TextView textView = (TextView) AbstractC34235f.m108203J(view, R.id.exo_error_message);
                            if (textView != null) {
                                i13 = R.id.exo_image;
                                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, R.id.exo_image);
                                if (imageView2 != null) {
                                    i13 = R.id.exo_overlay;
                                    FrameLayout frameLayout2 = (FrameLayout) AbstractC34235f.m108203J(view, R.id.exo_overlay);
                                    if (frameLayout2 != null) {
                                        i13 = R.id.exo_shutter;
                                        View viewM108203J2 = AbstractC34235f.m108203J(view, R.id.exo_shutter);
                                        if (viewM108203J2 != null) {
                                            i13 = R.id.exo_subtitles;
                                            SubtitleView subtitleView = (SubtitleView) AbstractC34235f.m108203J(view, R.id.exo_subtitles);
                                            if (subtitleView != null) {
                                                return new StreamUiExoPlayerViewBinding(view, frameLayout, imageView, progressBar, aspectRatioFrameLayout, viewM108203J, textView, imageView2, frameLayout2, viewM108203J2, subtitleView);
                                            }
                                        }
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

    public static StreamUiExoPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_exo_player_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
