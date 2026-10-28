package io.getstream.chat.android.p226ui.feature.gallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.PlaybackException;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.cdn.internal.StreamMediaDataSource;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.databinding.StreamUiActivityAttachmentMediaBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import io.getstream.chat.android.p226ui.widgets.internal.StreamPlayerView;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23462h;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p031b9.C2853n;
import p031b9.C2857p;
import p161g.AbstractC14911n;
import p161g.C14899c0;
import p161g.C14901d0;
import p299l9.C23519p;
import p314m.AbstractActivityC24852m;
import p479s4.AbstractC32122c;
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
import q83.AbstractC30060g;
import va3.AbstractC35849g;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010#\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001d\u0010&\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u00101¨\u00064"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity;", "Lm/m;", "<init>", "()V", "Ll83/a0;", "setupViews", "setupEdgeToEdge", "Lu8/j0;", "createPlayer", "()Lu8/j0;", "player", "setupPlayerView", "(Lu8/j0;)V", "showPlaybackError", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onPause", "onStop", "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;", "", "url$delegate", "Ll83/h;", "getUrl", "()Ljava/lang/String;", "url", "title$delegate", "getTitle", AttachmentMediaActivity.KEY_TITLE, "type$delegate", "getType", AttachmentMediaActivity.KEY_TYPE, "mimeType$delegate", "getMimeType", "mimeType", "Lu8/j0;", "", "savedPlaybackPosition", "J", "", "autoPlay", "Z", "Lb23/k;", "logger$delegate", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentMediaActivity extends AbstractActivityC24852m {
    private static final int CONTROLLER_SHOW_TIMEOUT = 2000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String KEY_MIME_TYPE = "mime_type";
    private static final String KEY_TITLE = "title";
    private static final String KEY_TYPE = "type";
    private static final String KEY_URL = "url";
    private StreamUiActivityAttachmentMediaBinding binding;

    /* JADX INFO: renamed from: mimeType$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h mimeType;
    private InterfaceC34599j0 player;
    private long savedPlaybackPosition;

    /* JADX INFO: renamed from: title$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h title;

    /* JADX INFO: renamed from: type$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h type;

    /* JADX INFO: renamed from: url$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h url;
    private boolean autoPlay = true;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "Chat:AttachmentMediaActivity");

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentMediaActivity$Companion;", "", "<init>", "()V", "KEY_URL", "", "KEY_TITLE", "KEY_MIME_TYPE", "KEY_TYPE", "CONTROLLER_SHOW_TIMEOUT", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "url", AttachmentMediaActivity.KEY_TITLE, "mimeType", AttachmentMediaActivity.KEY_TYPE, "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Intent createIntent$default(Companion companion, Context context, String str, String str2, String str3, String str4, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                str3 = null;
            }
            if ((i13 & 16) != 0) {
                str4 = null;
            }
            return companion.createIntent(context, str, str2, str3, str4);
        }

        public final Intent createIntent(Context context, String url, String title, String mimeType, String type) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(url, "url");
            AbstractC22676k.m65750j(title, "title");
            Intent intent = new Intent(context, (Class<?>) AttachmentMediaActivity.class);
            intent.putExtra("url", url);
            intent.putExtra(AttachmentMediaActivity.KEY_TITLE, title);
            intent.putExtra(AttachmentMediaActivity.KEY_MIME_TYPE, mimeType);
            intent.putExtra(AttachmentMediaActivity.KEY_TYPE, type);
            return intent;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AttachmentMediaActivity() {
        final int i13 = 0;
        this.url = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.gallery.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentMediaActivity f74507x;

            {
                this.f74507x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                AttachmentMediaActivity attachmentMediaActivity = this.f74507x;
                switch (i14) {
                    case 0:
                        AttachmentMediaActivity.Companion companion = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra(QueryParams.URL);
                    case 1:
                        AttachmentMediaActivity.Companion companion2 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("title");
                    case 2:
                        AttachmentMediaActivity.Companion companion3 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("type");
                    default:
                        AttachmentMediaActivity.Companion companion4 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("mime_type");
                }
            }
        });
        final int i14 = 1;
        this.title = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.gallery.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentMediaActivity f74507x;

            {
                this.f74507x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i15 = i14;
                AttachmentMediaActivity attachmentMediaActivity = this.f74507x;
                switch (i15) {
                    case 0:
                        AttachmentMediaActivity.Companion companion = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra(QueryParams.URL);
                    case 1:
                        AttachmentMediaActivity.Companion companion2 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("title");
                    case 2:
                        AttachmentMediaActivity.Companion companion3 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("type");
                    default:
                        AttachmentMediaActivity.Companion companion4 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("mime_type");
                }
            }
        });
        final int i15 = 2;
        this.type = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.gallery.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentMediaActivity f74507x;

            {
                this.f74507x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i16 = i15;
                AttachmentMediaActivity attachmentMediaActivity = this.f74507x;
                switch (i16) {
                    case 0:
                        AttachmentMediaActivity.Companion companion = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra(QueryParams.URL);
                    case 1:
                        AttachmentMediaActivity.Companion companion2 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("title");
                    case 2:
                        AttachmentMediaActivity.Companion companion3 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("type");
                    default:
                        AttachmentMediaActivity.Companion companion4 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("mime_type");
                }
            }
        });
        final int i16 = 3;
        this.mimeType = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.gallery.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AttachmentMediaActivity f74507x;

            {
                this.f74507x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i17 = i16;
                AttachmentMediaActivity attachmentMediaActivity = this.f74507x;
                switch (i17) {
                    case 0:
                        AttachmentMediaActivity.Companion companion = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra(QueryParams.URL);
                    case 1:
                        AttachmentMediaActivity.Companion companion2 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("title");
                    case 2:
                        AttachmentMediaActivity.Companion companion3 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("type");
                    default:
                        AttachmentMediaActivity.Companion companion4 = AttachmentMediaActivity.INSTANCE;
                        return attachmentMediaActivity.getIntent().getStringExtra("mime_type");
                }
            }
        });
    }

    private final InterfaceC34599j0 createPlayer() {
        InterfaceC40169e interfaceC40169eFactory = StreamMediaDataSource.INSTANCE.factory(this, ChatClient.INSTANCE.instance().getCdn());
        C2857p c2857p = new C2857p(this);
        C23519p c23519p = new C23519p(interfaceC40169eFactory);
        AbstractC35849g.m113807i(!c2857p.f11350u);
        c2857p.f11333d = new C2853n(c23519p, 0);
        C2830f0 c2830f0M8250a = c2857p.m8250a();
        c2830f0M8250a.f11118N.m121831a(new InterfaceC34595h0() { // from class: io.getstream.chat.android.ui.feature.gallery.AttachmentMediaActivity.createPlayer.1
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
                boolean z4 = playbackState == 2;
                StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding = AttachmentMediaActivity.this.binding;
                if (streamUiActivityAttachmentMediaBinding == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                ProgressBar progressBar = streamUiActivityAttachmentMediaBinding.progressBar;
                AbstractC22676k.m65749i(progressBar, "progressBar");
                progressBar.setVisibility(z4 ? 0 : 8);
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final void onPlayerError(PlaybackException error) {
                AbstractC22676k.m65750j(error, "error");
                AttachmentMediaActivity.this.showPlaybackError();
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

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final String getMimeType() {
        return (String) this.mimeType.getValue();
    }

    private final String getTitle() {
        return (String) this.title.getValue();
    }

    private final String getType() {
        return (String) this.type.getValue();
    }

    private final String getUrl() {
        return (String) this.url.getValue();
    }

    private final void setupEdgeToEdge() {
        int color = AbstractC32122c.getColor(this, C19469R.color.stream_ui_literal_black);
        C14899c0 c14899c0 = C14899c0.f55571y;
        C14901d0 c14901d0 = new C14901d0(color, color, 2, c14899c0);
        int color2 = AbstractC32122c.getColor(this, C19469R.color.stream_ui_literal_black);
        AbstractC14911n.m43003a(this, c14901d0, new C14901d0(color2, color2, 2, c14899c0));
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding = this.binding;
        if (streamUiActivityAttachmentMediaBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ConstraintLayout root = streamUiActivityAttachmentMediaBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
    }

    private final void setupPlayerView(InterfaceC34599j0 player) {
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding = this.binding;
        if (streamUiActivityAttachmentMediaBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        StreamPlayerView streamPlayerView = streamUiActivityAttachmentMediaBinding.playerView;
        streamPlayerView.setPlayer(player);
        streamPlayerView.setOnClickListener(new ViewOnClickListenerC19658e(this, 0));
        streamPlayerView.setControllerHideOnTouch(true);
        streamPlayerView.setShowBuffering(0);
        streamPlayerView.setArtworkDisplayMode(0);
        streamPlayerView.setUseController(false);
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding2 = this.binding;
        if (streamUiActivityAttachmentMediaBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentMediaBinding2.controls.setPlayer(player);
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding3 = this.binding;
        if (streamUiActivityAttachmentMediaBinding3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentMediaBinding3.controls.setShowTimeoutMs(2000);
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding4 = this.binding;
        if (streamUiActivityAttachmentMediaBinding4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentMediaBinding4.controls.setShowNextButton(false);
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding5 = this.binding;
        if (streamUiActivityAttachmentMediaBinding5 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentMediaBinding5.controls.setShowPreviousButton(false);
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding6 = this.binding;
        if (streamUiActivityAttachmentMediaBinding6 != null) {
            streamUiActivityAttachmentMediaBinding6.controls.m5064e();
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupPlayerView$lambda$8$lambda$7(AttachmentMediaActivity attachmentMediaActivity, View view) {
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding = attachmentMediaActivity.binding;
        if (streamUiActivityAttachmentMediaBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        if (streamUiActivityAttachmentMediaBinding.controls.m5062c()) {
            StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding2 = attachmentMediaActivity.binding;
            if (streamUiActivityAttachmentMediaBinding2 != null) {
                streamUiActivityAttachmentMediaBinding2.controls.m5060a();
                return;
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding3 = attachmentMediaActivity.binding;
        if (streamUiActivityAttachmentMediaBinding3 != null) {
            streamUiActivityAttachmentMediaBinding3.controls.m5064e();
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    private final void setupViews() {
        String mimeType;
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding = this.binding;
        if (streamUiActivityAttachmentMediaBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentMediaBinding.headerLeftActionButton.setOnClickListener(new ViewOnClickListenerC19658e(this, 1));
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding2 = this.binding;
        if (streamUiActivityAttachmentMediaBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentMediaBinding2.headerTitleTextView.setText(getTitle());
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding3 = this.binding;
        if (streamUiActivityAttachmentMediaBinding3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView audioImageView = streamUiActivityAttachmentMediaBinding3.audioImageView;
        AbstractC22676k.m65749i(audioImageView, "audioImageView");
        String type = getType();
        int i13 = 0;
        if ((type == null || !AbstractC39414r.m125876U(type, "audio", false)) && ((mimeType = getMimeType()) == null || !AbstractC39414r.m125876U(mimeType, "audio", false))) {
            i13 = 8;
        }
        audioImageView.setVisibility(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPlaybackError() {
        Toast.makeText(this, C19470R.string.stream_ui_message_list_attachment_display_error, 0).show();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) {
        String mimeType;
        String url;
        super.onCreate(savedInstanceState);
        if (!ChatClient.INSTANCE.isInitialized()) {
            finish();
            return;
        }
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBindingInflate = StreamUiActivityAttachmentMediaBinding.inflate(ContextKt.getStreamThemeInflater(this), null, false);
        this.binding = streamUiActivityAttachmentMediaBindingInflate;
        setContentView(streamUiActivityAttachmentMediaBindingInflate.getRoot());
        String type = getType();
        if (((type != null && type.length() != 0) || ((mimeType = getMimeType()) != null && mimeType.length() != 0)) && (url = getUrl()) != null && url.length() != 0) {
            setupEdgeToEdge();
            setupViews();
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "This file can't be displayed. The TYPE or the URL are null", null);
        }
        showPlaybackError();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onPause() {
        super.onPause();
        InterfaceC34599j0 interfaceC34599j0 = this.player;
        if (interfaceC34599j0 != null) {
            ((C2830f0) ((AbstractC0152a) interfaceC34599j0)).m8125z0(false);
        }
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.binding == null) {
            return;
        }
        InterfaceC34599j0 interfaceC34599j0CreatePlayer = createPlayer();
        C34626x c34626xM109418a = C34626x.m109418a(Uri.parse(getUrl()));
        long j7 = this.savedPlaybackPosition;
        C41060w0 c41060w0M133256r = AbstractC41023g0.m133256r(c34626xM109418a);
        C2830f0 c2830f0 = (C2830f0) ((AbstractC0152a) interfaceC34599j0CreatePlayer);
        c2830f0.m8091L0();
        ArrayList arrayListM8095T = c2830f0.m8095T(c41060w0M133256r);
        c2830f0.m8091L0();
        c2830f0.m8123x0(arrayListM8095T, 0, j7, false);
        C2830f0 c2830f1 = (C2830f0) interfaceC34599j0CreatePlayer;
        c2830f1.m8116q0();
        c2830f1.m8125z0(this.autoPlay);
        setupPlayerView(interfaceC34599j0CreatePlayer);
        this.player = interfaceC34599j0CreatePlayer;
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (this.binding == null) {
            return;
        }
        InterfaceC34599j0 interfaceC34599j0 = this.player;
        this.savedPlaybackPosition = interfaceC34599j0 != null ? ((C2830f0) interfaceC34599j0).m8102a0() : 0L;
        this.autoPlay = false;
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding = this.binding;
        if (streamUiActivityAttachmentMediaBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentMediaBinding.playerView.setPlayer(null);
        StreamUiActivityAttachmentMediaBinding streamUiActivityAttachmentMediaBinding2 = this.binding;
        if (streamUiActivityAttachmentMediaBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentMediaBinding2.controls.setPlayer(null);
        InterfaceC34599j0 interfaceC34599j1 = this.player;
        if (interfaceC34599j1 != null) {
            ((C2830f0) interfaceC34599j1).m8117r0();
        }
        this.player = null;
    }
}
