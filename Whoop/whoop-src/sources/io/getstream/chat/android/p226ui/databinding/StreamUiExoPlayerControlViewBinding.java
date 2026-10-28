package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whoop.android.R;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiExoPlayerControlViewBinding implements InterfaceC13008a {
    public final LinearLayout exoBasicControls;
    public final FrameLayout exoBottomBar;
    public final LinearLayout exoCenterControls;
    public final View exoControlsBackground;
    public final TextView exoDuration;
    public final LinearLayout exoExtraControls;
    public final HorizontalScrollView exoExtraControlsScrollView;
    public final ImageButton exoFullscreen;
    public final LinearLayout exoMinimalControls;
    public final ImageButton exoMinimalFullscreen;
    public final ImageButton exoNext;
    public final ImageButton exoOverflowHide;
    public final ImageButton exoOverflowShow;
    public final ImageButton exoPlayPause;
    public final TextView exoPosition;
    public final ImageButton exoPrev;
    public final View exoProgressPlaceholder;
    public final ImageButton exoRepeatToggle;
    public final ImageButton exoSettings;
    public final ImageButton exoShuffle;
    public final ImageButton exoSubtitle;
    public final LinearLayout exoTime;
    public final ImageButton exoVr;
    private final View rootView;

    private StreamUiExoPlayerControlViewBinding(View view, LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, View view2, TextView textView, LinearLayout linearLayout3, HorizontalScrollView horizontalScrollView, ImageButton imageButton, LinearLayout linearLayout4, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, TextView textView2, ImageButton imageButton7, View view3, ImageButton imageButton8, ImageButton imageButton9, ImageButton imageButton10, ImageButton imageButton11, LinearLayout linearLayout5, ImageButton imageButton12) {
        this.rootView = view;
        this.exoBasicControls = linearLayout;
        this.exoBottomBar = frameLayout;
        this.exoCenterControls = linearLayout2;
        this.exoControlsBackground = view2;
        this.exoDuration = textView;
        this.exoExtraControls = linearLayout3;
        this.exoExtraControlsScrollView = horizontalScrollView;
        this.exoFullscreen = imageButton;
        this.exoMinimalControls = linearLayout4;
        this.exoMinimalFullscreen = imageButton2;
        this.exoNext = imageButton3;
        this.exoOverflowHide = imageButton4;
        this.exoOverflowShow = imageButton5;
        this.exoPlayPause = imageButton6;
        this.exoPosition = textView2;
        this.exoPrev = imageButton7;
        this.exoProgressPlaceholder = view3;
        this.exoRepeatToggle = imageButton8;
        this.exoSettings = imageButton9;
        this.exoShuffle = imageButton10;
        this.exoSubtitle = imageButton11;
        this.exoTime = linearLayout5;
        this.exoVr = imageButton12;
    }

    public static StreamUiExoPlayerControlViewBinding bind(View view) {
        int i13 = R.id.exo_basic_controls;
        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, R.id.exo_basic_controls);
        if (linearLayout != null) {
            i13 = R.id.exo_bottom_bar;
            FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, R.id.exo_bottom_bar);
            if (frameLayout != null) {
                i13 = R.id.exo_center_controls;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC34235f.m108203J(view, R.id.exo_center_controls);
                if (linearLayout2 != null) {
                    i13 = R.id.exo_controls_background;
                    View viewM108203J = AbstractC34235f.m108203J(view, R.id.exo_controls_background);
                    if (viewM108203J != null) {
                        i13 = R.id.exo_duration;
                        TextView textView = (TextView) AbstractC34235f.m108203J(view, R.id.exo_duration);
                        if (textView != null) {
                            i13 = R.id.exo_extra_controls;
                            LinearLayout linearLayout3 = (LinearLayout) AbstractC34235f.m108203J(view, R.id.exo_extra_controls);
                            if (linearLayout3 != null) {
                                i13 = R.id.exo_extra_controls_scroll_view;
                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) AbstractC34235f.m108203J(view, R.id.exo_extra_controls_scroll_view);
                                if (horizontalScrollView != null) {
                                    i13 = R.id.exo_fullscreen;
                                    ImageButton imageButton = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_fullscreen);
                                    if (imageButton != null) {
                                        i13 = R.id.exo_minimal_controls;
                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC34235f.m108203J(view, R.id.exo_minimal_controls);
                                        if (linearLayout4 != null) {
                                            i13 = R.id.exo_minimal_fullscreen;
                                            ImageButton imageButton2 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_minimal_fullscreen);
                                            if (imageButton2 != null) {
                                                i13 = R.id.exo_next;
                                                ImageButton imageButton3 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_next);
                                                if (imageButton3 != null) {
                                                    i13 = R.id.exo_overflow_hide;
                                                    ImageButton imageButton4 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_overflow_hide);
                                                    if (imageButton4 != null) {
                                                        i13 = R.id.exo_overflow_show;
                                                        ImageButton imageButton5 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_overflow_show);
                                                        if (imageButton5 != null) {
                                                            i13 = R.id.exo_play_pause;
                                                            ImageButton imageButton6 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_play_pause);
                                                            if (imageButton6 != null) {
                                                                i13 = R.id.exo_position;
                                                                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, R.id.exo_position);
                                                                if (textView2 != null) {
                                                                    i13 = R.id.exo_prev;
                                                                    ImageButton imageButton7 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_prev);
                                                                    if (imageButton7 != null) {
                                                                        i13 = R.id.exo_progress_placeholder;
                                                                        View viewM108203J2 = AbstractC34235f.m108203J(view, R.id.exo_progress_placeholder);
                                                                        if (viewM108203J2 != null) {
                                                                            i13 = R.id.exo_repeat_toggle;
                                                                            ImageButton imageButton8 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_repeat_toggle);
                                                                            if (imageButton8 != null) {
                                                                                i13 = R.id.exo_settings;
                                                                                ImageButton imageButton9 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_settings);
                                                                                if (imageButton9 != null) {
                                                                                    i13 = R.id.exo_shuffle;
                                                                                    ImageButton imageButton10 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_shuffle);
                                                                                    if (imageButton10 != null) {
                                                                                        i13 = R.id.exo_subtitle;
                                                                                        ImageButton imageButton11 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_subtitle);
                                                                                        if (imageButton11 != null) {
                                                                                            i13 = R.id.exo_time;
                                                                                            LinearLayout linearLayout5 = (LinearLayout) AbstractC34235f.m108203J(view, R.id.exo_time);
                                                                                            if (linearLayout5 != null) {
                                                                                                i13 = R.id.exo_vr;
                                                                                                ImageButton imageButton12 = (ImageButton) AbstractC34235f.m108203J(view, R.id.exo_vr);
                                                                                                if (imageButton12 != null) {
                                                                                                    return new StreamUiExoPlayerControlViewBinding(view, linearLayout, frameLayout, linearLayout2, viewM108203J, textView, linearLayout3, horizontalScrollView, imageButton, linearLayout4, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, textView2, imageButton7, viewM108203J2, imageButton8, imageButton9, imageButton10, imageButton11, linearLayout5, imageButton12);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiExoPlayerControlViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_exo_player_control_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
