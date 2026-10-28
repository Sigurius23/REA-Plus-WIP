package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiAudioRecordListBinding implements InterfaceC13008a {
    public final LinearLayoutCompat audioRecordingsContainer;
    private final LinearLayoutCompat rootView;

    private StreamUiAudioRecordListBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = linearLayoutCompat;
        this.audioRecordingsContainer = linearLayoutCompat2;
    }

    public static StreamUiAudioRecordListBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        return new StreamUiAudioRecordListBinding(linearLayoutCompat, linearLayoutCompat);
    }

    public static StreamUiAudioRecordListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiAudioRecordListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_audio_record_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
