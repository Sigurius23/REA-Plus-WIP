package io.getstream.chat.android.p226ui.widgets.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.p019ui.PlayerView;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import io.getstream.chat.android.p226ui.C19469R;
import p516u8.InterfaceC34599j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0016J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010(\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/media3/ui/PlayerView;", "inflatePlayerView", "()Landroidx/media3/ui/PlayerView;", "showBuffering", "Ll83/a0;", "setShowBuffering", "(I)V", "artworkDisplayMode", "setArtworkDisplayMode", "", "useController", "setUseController", "(Z)V", "autoShow", "setControllerAutoShow", "timeout", "setControllerShowTimeoutMs", "controllerHideOnTouch", "setControllerHideOnTouch", "show", "setShowPreviousButton", "setShowNextButton", "playerView", "Landroidx/media3/ui/PlayerView;", "Lu8/j0;", "value", "getPlayer", "()Lu8/j0;", "setPlayer", "(Lu8/j0;)V", "player", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamPlayerView extends FrameLayout {
    private final PlayerView playerView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamPlayerView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC22676k.m65750j(context, "context");
    }

    @StreamHandsOff(reason = "This method manually inflates the PlayerView layout, because we are overriding the default root layout (player_layout_id) and the default controller layout (controller_layout_id). These layouts are just copies of the 'exo_player_view.xml' and the 'exo_player_control_view.xml' from the ExoPlayer library. They only have a different name (layout ID) to avoid being overridden by layouts with the same name from different versions of the ExoPlayer library (included in integration projects). This ensures that we always use the correct layout for our version of the ExoPlayer library")
    private final PlayerView inflatePlayerView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(C19469R.layout.stream_ui_player_view, (ViewGroup) this, false);
        AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        return (PlayerView) viewInflate;
    }

    public final InterfaceC34599j0 getPlayer() {
        return this.playerView.getPlayer();
    }

    public final void setArtworkDisplayMode(int artworkDisplayMode) {
        this.playerView.setArtworkDisplayMode(artworkDisplayMode);
    }

    public final void setControllerAutoShow(boolean autoShow) {
        this.playerView.setControllerAutoShow(autoShow);
    }

    public final void setControllerHideOnTouch(boolean controllerHideOnTouch) {
        this.playerView.setControllerHideOnTouch(controllerHideOnTouch);
    }

    public final void setControllerShowTimeoutMs(int timeout) {
        this.playerView.setControllerShowTimeoutMs(timeout);
    }

    public final void setPlayer(InterfaceC34599j0 interfaceC34599j0) {
        this.playerView.setPlayer(interfaceC34599j0);
    }

    public final void setShowBuffering(int showBuffering) {
        this.playerView.setShowBuffering(showBuffering);
    }

    public final void setShowNextButton(boolean show) {
        this.playerView.setShowNextButton(show);
    }

    public final void setShowPreviousButton(boolean show) {
        this.playerView.setShowPreviousButton(show);
    }

    public final void setUseController(boolean useController) {
        this.playerView.setUseController(useController);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    public /* synthetic */ StreamPlayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamPlayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        PlayerView playerViewInflatePlayerView = inflatePlayerView();
        this.playerView = playerViewInflatePlayerView;
        addView(playerViewInflatePlayerView);
    }
}
