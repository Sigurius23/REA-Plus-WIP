package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordPlayerView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiAudioRecordPlayerPreviewBinding implements InterfaceC13008a {
    public final AudioRecordPlayerView playerView;
    public final ImageButton removeButton;
    private final FrameLayout rootView;

    private StreamUiAudioRecordPlayerPreviewBinding(FrameLayout frameLayout, AudioRecordPlayerView audioRecordPlayerView, ImageButton imageButton) {
        this.rootView = frameLayout;
        this.playerView = audioRecordPlayerView;
        this.removeButton = imageButton;
    }

    public static StreamUiAudioRecordPlayerPreviewBinding bind(View view) {
        int i13 = C19469R.id.playerView;
        AudioRecordPlayerView audioRecordPlayerView = (AudioRecordPlayerView) AbstractC34235f.m108203J(view, i13);
        if (audioRecordPlayerView != null) {
            i13 = C19469R.id.removeButton;
            ImageButton imageButton = (ImageButton) AbstractC34235f.m108203J(view, i13);
            if (imageButton != null) {
                return new StreamUiAudioRecordPlayerPreviewBinding((FrameLayout) view, audioRecordPlayerView, imageButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiAudioRecordPlayerPreviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiAudioRecordPlayerPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_audio_record_player_preview, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final FrameLayout getRoot() {
        return this.rootView;
    }
}
