.class public final Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001a\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001c\u0010\u0016J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001f\u0010\u0016R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R(\u0010(\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Landroidx/media3/ui/PlayerView;",
        "inflatePlayerView",
        "()Landroidx/media3/ui/PlayerView;",
        "showBuffering",
        "Ll83/a0;",
        "setShowBuffering",
        "(I)V",
        "artworkDisplayMode",
        "setArtworkDisplayMode",
        "",
        "useController",
        "setUseController",
        "(Z)V",
        "autoShow",
        "setControllerAutoShow",
        "timeout",
        "setControllerShowTimeoutMs",
        "controllerHideOnTouch",
        "setControllerHideOnTouch",
        "show",
        "setShowPreviousButton",
        "setShowNextButton",
        "playerView",
        "Landroidx/media3/ui/PlayerView;",
        "Lu8/j0;",
        "value",
        "getPlayer",
        "()Lu8/j0;",
        "setPlayer",
        "(Lu8/j0;)V",
        "player",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final playerView:Landroidx/media3/ui/PlayerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->inflatePlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final inflatePlayerView()Landroidx/media3/ui/PlayerView;
    .locals 3
    .annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
        reason = "This method manually inflates the PlayerView layout, because we are overriding the default root layout (player_layout_id) and the default controller layout (controller_layout_id). These layouts are just copies of the \'exo_player_view.xml\' and the \'exo_player_control_view.xml\' from the ExoPlayer library. They only have a different name (layout ID) to avoid being overridden by layouts with the same name from different versions of the ExoPlayer library (included in integration projects). This ensures that we always use the correct layout for our version of the ExoPlayer library"
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$layout;->stream_ui_player_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.media3.ui.PlayerView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/media3/ui/PlayerView;

    return-object v0
.end method


# virtual methods
.method public final getPlayer()Lu8/j0;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->getPlayer()Lu8/j0;

    move-result-object v0

    return-object v0
.end method

.method public final setArtworkDisplayMode(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setArtworkDisplayMode(I)V

    return-void
.end method

.method public final setControllerAutoShow(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setControllerAutoShow(Z)V

    return-void
.end method

.method public final setControllerHideOnTouch(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setControllerHideOnTouch(Z)V

    return-void
.end method

.method public final setControllerShowTimeoutMs(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setControllerShowTimeoutMs(I)V

    return-void
.end method

.method public final setPlayer(Lu8/j0;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setPlayer(Lu8/j0;)V

    return-void
.end method

.method public final setShowBuffering(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setShowBuffering(I)V

    return-void
.end method

.method public final setShowNextButton(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setShowNextButton(Z)V

    return-void
.end method

.method public final setShowPreviousButton(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setShowPreviousButton(Z)V

    return-void
.end method

.method public final setUseController(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;->playerView:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    return-void
.end method
