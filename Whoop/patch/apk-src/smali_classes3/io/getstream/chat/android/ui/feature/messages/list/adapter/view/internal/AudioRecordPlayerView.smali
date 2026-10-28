.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u0015\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u000c2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001b\u0010\u0015J\u0015\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000c\u00a2\u0006\u0004\u0008 \u0010!J\r\u0010\"\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\"\u0010!J\r\u0010#\u001a\u00020\u000c\u00a2\u0006\u0004\u0008#\u0010!J\r\u0010$\u001a\u00020\u000c\u00a2\u0006\u0004\u0008$\u0010!J\u0015\u0010&\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020\u0017\u00a2\u0006\u0004\u0008&\u0010\'J\u001b\u0010*\u001a\u00020\u000c2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000c0(\u00a2\u0006\u0004\u0008*\u0010+J\u001b\u0010,\u001a\u00020\u000c2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000c0(\u00a2\u0006\u0004\u0008,\u0010+J/\u00100\u001a\u00020\u000c2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u000c0(2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000c0.\u00a2\u0006\u0004\u00080\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000f\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010C\u00a8\u0006D"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;",
        "Landroidx/appcompat/widget/LinearLayoutCompat;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "init",
        "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;",
        "style",
        "setStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V",
        "",
        "duration",
        "setTotalDuration",
        "(Ljava/lang/String;)V",
        "",
        "",
        "waveBars",
        "setWaveBars",
        "(Ljava/util/List;)V",
        "setDuration",
        "",
        "progress",
        "setProgress",
        "(D)V",
        "setLoading",
        "()V",
        "setPlaying",
        "setIdle",
        "setPaused",
        "speed",
        "setSpeedText",
        "(F)V",
        "Lkotlin/Function0;",
        "listener",
        "setOnPlayButtonClickListener",
        "(Lc93/a;)V",
        "setOnSpeedButtonClickListener",
        "startDrag",
        "Lkotlin/Function1;",
        "stopDrag",
        "setOnSeekbarMoveListeners",
        "(Lc93/a;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "totalDuration",
        "Ljava/lang/String;",
        "audioHash",
        "Ljava/lang/Integer;",
        "getAudioHash$stream_chat_android_ui_components_release",
        "()Ljava/lang/Integer;",
        "setAudioHash$stream_chat_android_ui_components_release",
        "(Ljava/lang/Integer;)V",
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


# static fields
.field public static final synthetic w:I


# instance fields
.field private audioHash:Ljava/lang/Integer;

.field private binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

.field private final logger$delegate:Ll83/h;

.field private style:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

.field private totalDuration:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    const-string p3, "Chat:PlayerView"

    invoke-static {p0, p3}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->logger$delegate:Ll83/h;

    .line 5
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;->invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->setStyle(Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V

    return-void
.end method

.method private static final setOnPlayButtonClickListener$lambda$17(Lc93/a;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final setOnSpeedButtonClickListener$lambda$18(Lc93/a;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getAudioHash$stream_chat_android_ui_components_release()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->audioHash:Ljava/lang/Integer;

    return-object v0
.end method

.method public final setAudioHash$stream_chat_android_ui_components_release(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->audioHash:Ljava/lang/Integer;

    return-void
.end method

.method public final setDuration(Ljava/lang/String;)V
    .locals 1

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->duration:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setIdle()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->totalDuration:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->setDuration(Ljava/lang/String;)V

    :cond_0
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->setProgress(D)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v3, "progressBar"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    const-string v4, "playButton"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->style:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedPlayIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v2, "audioSpeedButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioFileIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v1, "audioFileIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setLoading()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v3, "progressBar"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    const-string v1, "playButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setOnPlayButtonClickListener(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setOnSeekbarMoveListeners(Lc93/a;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "startDrag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stopDrag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->setOnStartDragListener$stream_chat_android_ui_components_release(Lc93/a;)V

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->setOnEndDragListener$stream_chat_android_ui_components_release(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setOnSpeedButtonClickListener(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/c;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setPaused()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v3, "progressBar"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    const-string v4, "playButton"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->style:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedPlayIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v2, "audioSpeedButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioFileIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v1, "audioFileIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setPlaying()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v3, "progressBar"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    const-string v4, "playButton"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->style:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedPauseIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v2, "audioSpeedButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioFileIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v1, "audioFileIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setProgress(D)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    const/16 v1, 0x64

    int-to-double v1, v1

    mul-double/2addr p1, v1

    double-to-float p1, p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->setProgress$stream_chat_android_ui_components_release(F)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setSpeedText(F)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[setSpeedText] speed: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p1}, Lio/getstream/chat/android/extensions/FloatExtensionsKt;->isInt(F)Z

    move-result v1

    const/4 v2, 0x1

    const-string v3, "x"

    if-ne v1, v2, :cond_1

    float-to-int p1, p1

    invoke-static {p1, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method

.method public final setStyle(Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V
    .locals 7

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->style:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    const/16 v1, 0x10

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getPadding()Lio/getstream/chat/android/ui/helper/ViewPadding;

    move-result-object v1

    invoke-static {p0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->setPaddingCompat(Landroid/view/View;Lio/getstream/chat/android/ui/helper/ViewPadding;)V

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getHeight()I

    move-result v3

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1;

    invoke-direct {v1, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1;-><init>(Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v1, :cond_a

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playbackProgressContainer:Landroid/widget/FrameLayout;

    const-string v4, "playbackProgressContainer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getPlaybackProgressContainerSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/helper/ViewSize;->getWidth()I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getPlaybackProgressContainerSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/helper/ViewSize;->getHeight()I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedProgressBarDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v4, "progressBar"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getProgressBarSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/helper/ViewSize;->getWidth()I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getProgressBarSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/helper/ViewSize;->getHeight()I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    const-string v4, "playButton"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getPlaybackButtonPadding()Lio/getstream/chat/android/ui/helper/ViewPadding;

    move-result-object v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->setPaddingCompat(Landroid/view/View;Lio/getstream/chat/android/ui/helper/ViewPadding;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedPlayIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedPlaybackButtonBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/appcompat/widget/AppCompatImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getPlaybackButtonElevation()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v5}, Landroid/view/View;->setElevation(F)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getPlaybackButtonSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/helper/ViewSize;->getWidth()I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getPlaybackButtonSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/helper/ViewSize;->getHeight()I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->duration:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v4, "duration"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getDurationTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->duration:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v4, :cond_6

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getDurationTextViewSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/helper/ViewSize;->getWidth()I

    move-result v6

    iput v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getDurationTextViewSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/helper/ViewSize;->getHeight()I

    move-result v6

    iput v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getDurationTextMarginStart()I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getWaveBarColorPlayed()I

    move-result v4

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->setPlayedWaveBarColor(I)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getWaveBarColorFuture()I

    move-result v4

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->setFutureWaveBarColor(I)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedScrubberDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->setScrubberDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getScrubberWidthDefault()I

    move-result v4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getScrubberWidthPressed()I

    move-result v6

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->setScrubberWidth(II)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    const-string v4, "audioSeekBar"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_5

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getWaveBarHeight()I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getWaveBarMarginStart()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioFileIconContainer:Landroid/widget/FrameLayout;

    const-string v4, "audioFileIconContainer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getFileIconContainerWidth()I

    move-result v6

    iput v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioFileIconContainer:Landroid/widget/FrameLayout;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->isFileIconContainerVisible()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const/16 v0, 0x8

    :goto_1
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioFileIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getAudioFileIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v3, "audioSpeedButton"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getSpeedButtonTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v4

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getTintedSpeedButtonBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getSpeedButtonElevation()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0, v4}, Landroid/view/View;->setElevation(F)V

    iget-object v0, v1, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getSpeedButtonSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/helper/ViewSize;->getWidth()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getSpeedButtonSize()Lio/getstream/chat/android/ui/helper/ViewSize;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/helper/ViewSize;->getHeight()I

    move-result p1

    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setTotalDuration(Ljava/lang/String;)V
    .locals 5

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[setTotalDuration] duration: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->totalDuration:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->setDuration(Ljava/lang/String;)V

    return-void
.end method

.method public final setWaveBars(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    const-string v0, "waveBars"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[setWaveBars] value: "

    invoke-static {v1, p1}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->setWaveBars$stream_chat_android_ui_components_release(Ljava/util/List;)V

    return-void

    :cond_1
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method
