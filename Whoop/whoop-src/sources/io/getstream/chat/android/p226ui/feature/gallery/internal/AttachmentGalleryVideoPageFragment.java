package io.getstream.chat.android.p226ui.feature.gallery.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.media3.common.PlaybackException;
import b30.ViewOnClickListenerC2558k3;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.internal.StreamMediaDataSource;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemAttachmentGalleryVideoBinding;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryViewMediaStyle;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.widgets.internal.StreamPlayerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l83.InterfaceC23462h;
import ou1.C28376a;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p031b9.C2853n;
import p031b9.C2857p;
import p299l9.C23517o;
import p299l9.C23519p;
import p299l9.InterfaceC23485b0;
import p516u8.AbstractC34609o0;
import p516u8.C34581a0;
import p516u8.C34585c0;
import p516u8.C34586d;
import p516u8.C34589e0;
import p516u8.C34591f0;
import p516u8.C34593g0;
import p516u8.C34596i;
import p516u8.C34597i0;
import p516u8.C34619t0;
import p516u8.C34623v0;
import p516u8.C34626x;
import p516u8.C34629y0;
import p516u8.InterfaceC34595h0;
import p516u8.InterfaceC34599j0;
import p576w8.C36933c;
import p674z8.InterfaceC40169e;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29203o;
import q83.AbstractC30060g;
import va3.AbstractC35849g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00105\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u00104R\u001d\u00108\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u00104R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "setupVideoThumbnail", "resetState", "setupPlayButton", "setupPlayButtonIcon", "setupPlayButtonCard", "setupOnPlayButtonClickedListener", "Lu8/j0;", "player", "setupPlayerView", "(Lu8/j0;)V", "createPlayer", "()Lu8/j0;", "Ll9/b0;", "createMediaSourceFactory", "()Ll9/b0;", "onStart", "onPause", "onStop", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;", "style$delegate", "Ll83/h;", "getStyle", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;", "style", "Lu8/j0;", "", "savedPlaybackPosition", "J", "", "thumbUrl$delegate", "getThumbUrl", "()Ljava/lang/String;", "thumbUrl", "assetUrl$delegate", "getAssetUrl", "assetUrl", "Lkotlin/Function0;", "imageClickListener", "Lc93/a;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;", "binding", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryVideoPageFragment extends AbstractComponentCallbacksC1320m0 {
    private static final String ARG_ASSET_URL = "asset_url";
    private static final String ARG_THUMB_URL = "thumb_url";
    private static final int CONTROLLER_SHOW_TIMEOUT = 2000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiItemAttachmentGalleryVideoBinding _binding;

    /* JADX INFO: renamed from: assetUrl$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h assetUrl;
    private InterfaceC4339a imageClickListener = new C28376a(7);
    private InterfaceC34599j0 player;
    private long savedPlaybackPosition;

    /* JADX INFO: renamed from: style$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h style;

    /* JADX INFO: renamed from: thumbUrl$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h thumbUrl;

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;", "", "<init>", "()V", "", "thumbUrl", "assetUrl", "Lkotlin/Function0;", "Ll83/a0;", "imageClickListener", "Landroidx/fragment/app/m0;", "create", "(Ljava/lang/String;Ljava/lang/String;Lc93/a;)Landroidx/fragment/app/m0;", "ARG_THUMB_URL", "Ljava/lang/String;", "ARG_ASSET_URL", "", "CONTROLLER_SHOW_TIMEOUT", "I", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AbstractComponentCallbacksC1320m0 create$default(Companion companion, String str, String str2, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                interfaceC4339a = new C28376a(7);
            }
            return companion.create(str, str2, interfaceC4339a);
        }

        public final AbstractComponentCallbacksC1320m0 create(String thumbUrl, String assetUrl, InterfaceC4339a imageClickListener) {
            AbstractC22676k.m65750j(imageClickListener, "imageClickListener");
            AttachmentGalleryVideoPageFragment attachmentGalleryVideoPageFragment = new AttachmentGalleryVideoPageFragment();
            Bundle bundle = new Bundle();
            bundle.putString(AttachmentGalleryVideoPageFragment.ARG_THUMB_URL, thumbUrl);
            bundle.putString(AttachmentGalleryVideoPageFragment.ARG_ASSET_URL, assetUrl);
            attachmentGalleryVideoPageFragment.setArguments(bundle);
            attachmentGalleryVideoPageFragment.imageClickListener = imageClickListener;
            return attachmentGalleryVideoPageFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AttachmentGalleryVideoPageFragment() {
        final int i13 = 0;
        this.style = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.gallery.internal.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentGalleryVideoPageFragment f74513x;

            {
                this.f74513x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return AttachmentGalleryVideoPageFragment.style_delegate$lambda$0(this.f74513x);
                    case 1:
                        return this.f74513x.requireArguments().getString("thumb_url");
                    default:
                        return this.f74513x.requireArguments().getString("asset_url");
                }
            }
        });
        final int i14 = 1;
        this.thumbUrl = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.gallery.internal.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentGalleryVideoPageFragment f74513x;

            {
                this.f74513x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return AttachmentGalleryVideoPageFragment.style_delegate$lambda$0(this.f74513x);
                    case 1:
                        return this.f74513x.requireArguments().getString("thumb_url");
                    default:
                        return this.f74513x.requireArguments().getString("asset_url");
                }
            }
        });
        final int i15 = 2;
        this.assetUrl = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.gallery.internal.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentGalleryVideoPageFragment f74513x;

            {
                this.f74513x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return AttachmentGalleryVideoPageFragment.style_delegate$lambda$0(this.f74513x);
                    case 1:
                        return this.f74513x.requireArguments().getString("thumb_url");
                    default:
                        return this.f74513x.requireArguments().getString("asset_url");
                }
            }
        });
    }

    private final InterfaceC23485b0 createMediaSourceFactory() {
        CDN cdn = ChatClient.INSTANCE.instance().getCdn();
        StreamMediaDataSource streamMediaDataSource = StreamMediaDataSource.INSTANCE;
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        InterfaceC40169e interfaceC40169eFactory = streamMediaDataSource.factory(contextRequireContext, cdn);
        C23519p c23519p = new C23519p(new C29203o(requireContext(), 10));
        c23519p.f93085b = interfaceC40169eFactory;
        C23517o c23517o = c23519p.f93084a;
        if (interfaceC40169eFactory != ((InterfaceC40169e) c23517o.f93081e)) {
            c23517o.f93081e = interfaceC40169eFactory;
            ((HashMap) c23517o.f93079c).clear();
            ((HashMap) c23517o.f93080d).clear();
        }
        return c23519p;
    }

    private final InterfaceC34599j0 createPlayer() {
        C2857p c2857p = new C2857p(requireContext());
        C23519p c23519p = (C23519p) createMediaSourceFactory();
        AbstractC35849g.m113807i(!c2857p.f11350u);
        c2857p.f11333d = new C2853n(c23519p, 0);
        C2830f0 c2830f0M8250a = c2857p.m8250a();
        c2830f0M8250a.f11118N.m121831a(new InterfaceC34595h0() { // from class: io.getstream.chat.android.ui.feature.gallery.internal.AttachmentGalleryVideoPageFragment.createPlayer.1
            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onAudioAttributesChanged(C34586d c34586d) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onAvailableCommandsChanged(C34591f0 c34591f0) {
            }

            @Override // p516u8.InterfaceC34595h0
            @Deprecated
            public final /* bridge */ /* synthetic */ void onCues(List list) {
            }

            public final /* bridge */ /* synthetic */ void onDeviceInfoChanged(C34596i c34596i) {
            }

            public final /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i13, boolean z4) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onEvents(InterfaceC34599j0 interfaceC34599j0, C34593g0 c34593g0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z4) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z4) {
            }

            @Deprecated
            public final /* bridge */ /* synthetic */ void onLoadingChanged(boolean z4) {
            }

            public final /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j7) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onMediaItemTransition(C34626x c34626x, int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onMediaMetadataChanged(C34581a0 c34581a0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onMetadata(C34585c0 c34585c0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z4, int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlaybackParametersChanged(C34589e0 c34589e0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final void onPlaybackStateChanged(int playbackState) {
                ProgressBar progressBar;
                boolean z4 = playbackState == 2;
                StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = AttachmentGalleryVideoPageFragment.this._binding;
                if (streamUiItemAttachmentGalleryVideoBinding == null || (progressBar = streamUiItemAttachmentGalleryVideoBinding.progressBar) == null) {
                    return;
                }
                progressBar.setVisibility(z4 ? 0 : 8);
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final void onPlayerError(PlaybackException error) {
                AbstractC22676k.m65750j(error, "error");
                Toast.makeText(AttachmentGalleryVideoPageFragment.this.requireContext(), AttachmentGalleryVideoPageFragment.this.requireContext().getString(C19469R.string.stream_ui_attachment_gallery_video_display_error), 0).show();
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            }

            @Override // p516u8.InterfaceC34595h0
            @Deprecated
            public final /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z4, int i13) {
            }

            public final /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(C34581a0 c34581a0) {
            }

            @Deprecated
            public final /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onRepeatModeChanged(int i13) {
            }

            public final /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j7) {
            }

            public final /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j7) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z4) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z4) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i13, int i14) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onTimelineChanged(AbstractC34609o0 abstractC34609o0, int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(C34619t0 c34619t0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onTracksChanged(C34623v0 c34623v0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onVideoSizeChanged(C34629y0 c34629y0) {
            }

            public final /* bridge */ /* synthetic */ void onVolumeChanged(float f13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onCues(C36933c c36933c) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPositionDiscontinuity(C34597i0 c34597i0, C34597i0 c34597i1, int i13) {
            }
        });
        return c2830f0M8250a;
    }

    private final String getAssetUrl() {
        return (String) this.assetUrl.getValue();
    }

    private final StreamUiItemAttachmentGalleryVideoBinding getBinding() {
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
        return streamUiItemAttachmentGalleryVideoBinding;
    }

    private final AttachmentGalleryViewMediaStyle getStyle() {
        return (AttachmentGalleryViewMediaStyle) this.style.getValue();
    }

    private final String getThumbUrl() {
        return (String) this.thumbUrl.getValue();
    }

    private final void resetState() {
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
        streamUiItemAttachmentGalleryVideoBinding.thumbnailImageView.setVisibility(0);
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding2);
        streamUiItemAttachmentGalleryVideoBinding2.playButtonCardView.setVisibility(0);
    }

    private final void setupOnPlayButtonClickedListener() {
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
        streamUiItemAttachmentGalleryVideoBinding.playButtonCardView.setOnClickListener(new ViewOnClickListenerC2558k3(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupOnPlayButtonClickedListener$lambda$10(AttachmentGalleryVideoPageFragment attachmentGalleryVideoPageFragment, View view) {
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = attachmentGalleryVideoPageFragment._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
        InterfaceC34599j0 player = streamUiItemAttachmentGalleryVideoBinding.playerView.getPlayer();
        if (player != null) {
            ((C2830f0) ((AbstractC0152a) player)).m8125z0(true);
        }
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding2 = attachmentGalleryVideoPageFragment._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding2);
        streamUiItemAttachmentGalleryVideoBinding2.thumbnailImageView.setVisibility(8);
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding3 = attachmentGalleryVideoPageFragment._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding3);
        streamUiItemAttachmentGalleryVideoBinding3.playButtonCardView.setVisibility(8);
    }

    private final void setupPlayButton() {
        setupPlayButtonIcon();
        setupPlayButtonCard();
        setupOnPlayButtonClickedListener();
    }

    private final void setupPlayButtonCard() {
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
        CardView cardView = streamUiItemAttachmentGalleryVideoBinding.playButtonCardView;
        cardView.setElevation(getStyle().getViewMediaPlayVideoIconElevation());
        cardView.setCardBackgroundColor(getStyle().getViewMediaPlayVideoIconBackgroundColor());
        cardView.setRadius(getStyle().getViewMediaPlayVideoIconCornerRadius());
    }

    private final void setupPlayButtonIcon() {
        Drawable drawableMutate;
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
        ImageView imageView = streamUiItemAttachmentGalleryVideoBinding.playButtonImageView;
        AbstractC22676k.m65747g(imageView);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = getStyle().getViewMediaPlayVideoIconWidth();
        layoutParams.height = getStyle().getViewMediaPlayVideoIconHeight();
        imageView.setLayoutParams(layoutParams);
        Drawable viewMediaPlayVideoButtonIcon = getStyle().getViewMediaPlayVideoButtonIcon();
        if (viewMediaPlayVideoButtonIcon == null || (drawableMutate = viewMediaPlayVideoButtonIcon.mutate()) == null) {
            drawableMutate = null;
        } else {
            Integer viewMediaPlayVideoIconTint = getStyle().getViewMediaPlayVideoIconTint();
            if (viewMediaPlayVideoIconTint != null) {
                drawableMutate.setTint(viewMediaPlayVideoIconTint.intValue());
            }
        }
        imageView.setImageDrawable(drawableMutate);
        imageView.setPaddingRelative(getStyle().getViewMediaPlayVideoIconPaddingStart(), getStyle().getViewMediaPlayVideoIconPaddingTop(), getStyle().getViewMediaPlayVideoIconPaddingEnd(), getStyle().getViewMediaPlayVideoIconPaddingBottom());
    }

    private final void setupPlayerView(InterfaceC34599j0 player) {
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
        StreamPlayerView streamPlayerView = streamUiItemAttachmentGalleryVideoBinding.playerView;
        streamPlayerView.setPlayer(player);
        streamPlayerView.setControllerShowTimeoutMs(2000);
        streamPlayerView.setControllerAutoShow(false);
        streamPlayerView.setControllerHideOnTouch(true);
        streamPlayerView.setShowPreviousButton(false);
        streamPlayerView.setShowNextButton(false);
        streamPlayerView.setShowBuffering(0);
    }

    private final void setupVideoThumbnail() {
        if (ChatUI.getVideoThumbnailsEnabled()) {
            StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = this._binding;
            AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
            ImageView thumbnailImageView = streamUiItemAttachmentGalleryVideoBinding.thumbnailImageView;
            AbstractC22676k.m65749i(thumbnailImageView, "thumbnailImageView");
            ImageUtilsKt.load$default(thumbnailImageView, getThumbUrl(), (Integer) null, (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 30, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttachmentGalleryViewMediaStyle style_delegate$lambda$0(AttachmentGalleryVideoPageFragment attachmentGalleryVideoPageFragment) {
        AttachmentGalleryViewMediaStyle.Companion companion = AttachmentGalleryViewMediaStyle.INSTANCE;
        Context contextRequireContext = attachmentGalleryVideoPageFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        return companion.invoke(ContextKt.createStreamThemeWrapper(contextRequireContext), (AttributeSet) null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBindingInflate = StreamUiItemAttachmentGalleryVideoBinding.inflate(inflater, null, false);
        this._binding = streamUiItemAttachmentGalleryVideoBindingInflate;
        FrameLayout root = streamUiItemAttachmentGalleryVideoBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onPause() {
        super.onPause();
        InterfaceC34599j0 interfaceC34599j0 = this.player;
        if (interfaceC34599j0 != null) {
            ((C2830f0) ((AbstractC0152a) interfaceC34599j0)).m8125z0(false);
        }
        resetState();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStart() {
        super.onStart();
        InterfaceC34599j0 interfaceC34599j0CreatePlayer = createPlayer();
        C34626x c34626xM109418a = C34626x.m109418a(Uri.parse(getAssetUrl()));
        long j7 = this.savedPlaybackPosition;
        C41060w0 c41060w0M133256r = AbstractC41023g0.m133256r(c34626xM109418a);
        C2830f0 c2830f0 = (C2830f0) ((AbstractC0152a) interfaceC34599j0CreatePlayer);
        c2830f0.m8091L0();
        ArrayList arrayListM8095T = c2830f0.m8095T(c41060w0M133256r);
        c2830f0.m8091L0();
        c2830f0.m8123x0(arrayListM8095T, 0, j7, false);
        ((C2830f0) interfaceC34599j0CreatePlayer).m8116q0();
        setupPlayerView(interfaceC34599j0CreatePlayer);
        this.player = interfaceC34599j0CreatePlayer;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStop() {
        super.onStop();
        InterfaceC34599j0 interfaceC34599j0 = this.player;
        this.savedPlaybackPosition = interfaceC34599j0 != null ? ((C2830f0) interfaceC34599j0).m8102a0() : 0L;
        StreamUiItemAttachmentGalleryVideoBinding streamUiItemAttachmentGalleryVideoBinding = this._binding;
        AbstractC22676k.m65747g(streamUiItemAttachmentGalleryVideoBinding);
        streamUiItemAttachmentGalleryVideoBinding.playerView.setPlayer(null);
        InterfaceC34599j0 interfaceC34599j1 = this.player;
        if (interfaceC34599j1 != null) {
            ((C2830f0) interfaceC34599j1).m8117r0();
        }
        this.player = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupVideoThumbnail();
        setupPlayButton();
    }
}
