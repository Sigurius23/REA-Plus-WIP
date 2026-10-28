package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioWavesSeekBar;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiAudioRecordPlayerBinding implements InterfaceC13008a {
    public final AppCompatImageView audioFileIcon;
    public final FrameLayout audioFileIconContainer;
    public final AudioWavesSeekBar audioSeekBar;
    public final AppCompatTextView audioSpeedButton;
    public final AppCompatTextView duration;
    public final AppCompatImageButton playButton;
    public final FrameLayout playbackProgressContainer;
    public final ProgressBar progressBar;
    private final View rootView;

    private StreamUiAudioRecordPlayerBinding(View view, AppCompatImageView appCompatImageView, FrameLayout frameLayout, AudioWavesSeekBar audioWavesSeekBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageButton appCompatImageButton, FrameLayout frameLayout2, ProgressBar progressBar) {
        this.rootView = view;
        this.audioFileIcon = appCompatImageView;
        this.audioFileIconContainer = frameLayout;
        this.audioSeekBar = audioWavesSeekBar;
        this.audioSpeedButton = appCompatTextView;
        this.duration = appCompatTextView2;
        this.playButton = appCompatImageButton;
        this.playbackProgressContainer = frameLayout2;
        this.progressBar = progressBar;
    }

    public static StreamUiAudioRecordPlayerBinding bind(View view) {
        int i13 = C19469R.id.audioFileIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC34235f.m108203J(view, i13);
        if (appCompatImageView != null) {
            i13 = C19469R.id.audioFileIconContainer;
            FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
            if (frameLayout != null) {
                i13 = C19469R.id.audioSeekBar;
                AudioWavesSeekBar audioWavesSeekBar = (AudioWavesSeekBar) AbstractC34235f.m108203J(view, i13);
                if (audioWavesSeekBar != null) {
                    i13 = C19469R.id.audioSpeedButton;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                    if (appCompatTextView != null) {
                        i13 = C19469R.id.duration;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                        if (appCompatTextView2 != null) {
                            i13 = C19469R.id.playButton;
                            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) AbstractC34235f.m108203J(view, i13);
                            if (appCompatImageButton != null) {
                                i13 = C19469R.id.playbackProgressContainer;
                                FrameLayout frameLayout2 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                                if (frameLayout2 != null) {
                                    i13 = C19469R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                                    if (progressBar != null) {
                                        return new StreamUiAudioRecordPlayerBinding(view, appCompatImageView, frameLayout, audioWavesSeekBar, appCompatTextView, appCompatTextView2, appCompatImageButton, frameLayout2, progressBar);
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

    public static StreamUiAudioRecordPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_audio_record_player, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
