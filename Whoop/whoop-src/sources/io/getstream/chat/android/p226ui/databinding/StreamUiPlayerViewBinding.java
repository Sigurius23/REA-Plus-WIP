package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.p019ui.PlayerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiPlayerViewBinding implements InterfaceC13008a {
    public final PlayerView playerView;
    private final PlayerView rootView;

    private StreamUiPlayerViewBinding(PlayerView playerView, PlayerView playerView2) {
        this.rootView = playerView;
        this.playerView = playerView2;
    }

    public static StreamUiPlayerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PlayerView playerView = (PlayerView) view;
        return new StreamUiPlayerViewBinding(playerView, playerView);
    }

    public static StreamUiPlayerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_player_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final PlayerView getRoot() {
        return this.rootView;
    }
}
