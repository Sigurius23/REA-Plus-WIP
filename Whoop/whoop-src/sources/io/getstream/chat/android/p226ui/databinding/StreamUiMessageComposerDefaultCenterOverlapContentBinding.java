package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.WaveformView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerDefaultCenterOverlapContentBinding implements InterfaceC13008a {
    public final Guideline horizontalGuideline;
    public final ImageView recordingComplete;
    public final ImageView recordingDelete;
    public final ImageView recordingPlayback;
    public final TextView recordingSlider;
    public final ImageView recordingStop;
    public final TextView recordingTimer;
    public final WaveformView recordingWaveform;
    private final View rootView;
    public final Guideline verticalGuideline;

    private StreamUiMessageComposerDefaultCenterOverlapContentBinding(View view, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, ImageView imageView4, TextView textView2, WaveformView waveformView, Guideline guideline2) {
        this.rootView = view;
        this.horizontalGuideline = guideline;
        this.recordingComplete = imageView;
        this.recordingDelete = imageView2;
        this.recordingPlayback = imageView3;
        this.recordingSlider = textView;
        this.recordingStop = imageView4;
        this.recordingTimer = textView2;
        this.recordingWaveform = waveformView;
        this.verticalGuideline = guideline2;
    }

    public static StreamUiMessageComposerDefaultCenterOverlapContentBinding bind(View view) {
        int i13 = C19469R.id.horizontalGuideline;
        Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
        if (guideline != null) {
            i13 = C19469R.id.recordingComplete;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = C19469R.id.recordingDelete;
                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView2 != null) {
                    i13 = C19469R.id.recordingPlayback;
                    ImageView imageView3 = (ImageView) AbstractC34235f.m108203J(view, i13);
                    if (imageView3 != null) {
                        i13 = C19469R.id.recordingSlider;
                        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView != null) {
                            i13 = C19469R.id.recordingStop;
                            ImageView imageView4 = (ImageView) AbstractC34235f.m108203J(view, i13);
                            if (imageView4 != null) {
                                i13 = C19469R.id.recordingTimer;
                                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView2 != null) {
                                    i13 = C19469R.id.recordingWaveform;
                                    WaveformView waveformView = (WaveformView) AbstractC34235f.m108203J(view, i13);
                                    if (waveformView != null) {
                                        i13 = C19469R.id.verticalGuideline;
                                        Guideline guideline2 = (Guideline) AbstractC34235f.m108203J(view, i13);
                                        if (guideline2 != null) {
                                            return new StreamUiMessageComposerDefaultCenterOverlapContentBinding(view, guideline, imageView, imageView2, imageView3, textView, imageView4, textView2, waveformView, guideline2);
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

    public static StreamUiMessageComposerDefaultCenterOverlapContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_default_center_overlap_content, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
