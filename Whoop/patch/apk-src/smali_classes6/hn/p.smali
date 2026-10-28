.class public final synthetic Lhn/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/t;
.implements Lg40/z;
.implements Li9/r;
.implements Lo23/a;
.implements Lpg3/n;
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;
.implements Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;
.implements Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;
.implements Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;
.implements Ll5/g;
.implements Lio/sentry/e4;
.implements Lio/sentry/util/e;
.implements Lio/sentry/android/core/h1;
.implements Lio/sentry/z3;
.implements Lc23/h;
.implements Lbh3/g;
.implements Llive/hms/video/sdk/IErrorListener;
.implements Llive/hms/video/audio/BluetoothErrors;
.implements Lhms/webrtc/RTCStatsCollectorCallback;
.implements Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;
.implements Lom/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/n1;)V
    .locals 0

    .line 1
    const/16 p1, 0xe

    iput p1, p0, Lhn/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lhn/p;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lhn/p;->w:I

    iput-object p1, p0, Lhn/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 4

    iget v0, p0, Lhn/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lu8/p;

    check-cast p1, Li9/m;

    iget-object v1, p1, Li9/m;->b:Ljava/lang/String;

    iget-object v2, v0, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-static {v0}, Li9/s;->b(Lu8/p;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p1, v0, v3}, Li9/m;->c(Lu8/p;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Li9/m;->d(Lu8/p;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x1

    :cond_1
    return v3

    :pswitch_0
    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lrm/c0;

    check-cast p1, Lhn/l;

    :try_start_0
    invoke-virtual {p1, v0}, Lhn/l;->c(Lrm/c0;)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/exoplayer2/mediacodec/MediaCodecUtil$DecoderQueryException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, -0x1

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhn/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Llc0/c;

    invoke-static {v0, p1}, Lm92/j;->d(Llc0/c;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lkf0/d;

    invoke-static {v0, p1}, Lkk0/b;->b(Lkf0/d;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public c(La3/p;)V
    .locals 2

    iget-object p1, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/b1;

    new-instance v0, La3/p;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, La3/p;-><init>(I)V

    invoke-interface {p1, v0}, Lio/sentry/b1;->x(La3/p;)V

    return-void
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Ltg3/c;

    check-cast p1, Lud3/a1;

    invoke-virtual {v0, p1}, Ltg3/c;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public create()Lg40/a0;
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, Li20/j1;

    return-object v0
.end method

.method public e()V
    .locals 4

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/FeedbackShakeIntegration;

    iget-object v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    iget-object v2, v2, Lio/sentry/android/core/e0;->z:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    iget-object v3, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    if-nez v3, :cond_1

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, La8/c;

    const/16 v3, 0x1d

    invoke-direct {v2, v3, v0, v1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public execute()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lnm/c;

    check-cast v0, Lnm/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Ljm/a;->e:I

    new-instance v1, La00/g;

    const/16 v2, 0x13

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, La00/g;-><init>(IZ)V

    const/4 v2, 0x0

    iput-object v2, v1, La00/g;->x:Ljava/lang/Object;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, La00/g;->y:Ljava/lang/Object;

    iput-object v2, v1, La00/g;->z:Ljava/lang/Object;

    const-string v2, ""

    iput-object v2, v1, La00/g;->E:Ljava/lang/Object;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v4, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped"

    invoke-virtual {v0}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {v5, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    new-instance v4, Lbc/i;

    const/16 v6, 0xc

    invoke-direct {v4, v0, v2, v1, v6}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v3, v4}, Lnm/i;->J(Landroid/database/Cursor;Lnm/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljm/a;

    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public h(Lio/sentry/b1;)V
    .locals 4

    iget v0, p0, Lhn/p;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/o;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/c;->g()Lio/sentry/protocol/v;

    move-result-object v1

    invoke-interface {p1, v1}, Lio/sentry/b1;->t(Lio/sentry/protocol/v;)V

    invoke-interface {p1}, Lio/sentry/b1;->A()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/16 v1, 0x2e

    invoke-static {v1, p1, p1}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->l:Lio/sentry/android/replay/capture/b;

    sget-object v2, Lio/sentry/android/replay/capture/c;->q:[Lj93/z;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v0, v2, p1}, Lio/sentry/android/replay/capture/b;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void

    :sswitch_0
    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/f;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/c;->g()Lio/sentry/protocol/v;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/sentry/b1;->t(Lio/sentry/protocol/v;)V

    return-void

    :sswitch_1
    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/n1;

    new-instance v1, Lc9/c;

    const/16 v2, 0xf

    invoke-direct {v1, v2, v0, p1}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lio/sentry/b1;->N(Lio/sentry/b4;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method

.method public handleCompatUserLookup(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lc93/a;
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt;->a(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lou1/a;

    move-result-object p1

    return-object p1
.end method

.method public j()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhn/p;->w:I

    iget-object v1, p0, Lhn/p;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lio/sentry/h5;

    sget v0, Lio/sentry/android/core/SentryPerformanceProvider;->F:I

    return-object v1

    :pswitch_0
    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v1}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public onBluetoothError(Llive/hms/video/audio/BluetoothErrorType;)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/audio/HMSAudioManagerLegacy;

    invoke-static {v0, p1}, Llive/hms/video/audio/HMSAudioManagerLegacy;->b(Llive/hms/video/audio/HMSAudioManagerLegacy;Llive/hms/video/audio/BluetoothErrorType;)V

    return-void
.end method

.method public onClick(I)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;->A(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;I)V

    return-void
.end method

.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/IErrorListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public onLinkPreviewClick(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public onLoadMoreRequested()V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;->loadMore()V

    return-void
.end method

.method public onMediaAttachmentClick(I)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->a(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V

    return-void
.end method

.method public onReactionClick(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->q(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Ljava/lang/String;)V

    return-void
.end method

.method public onResult(Ln23/h;)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/helpers/AppSettingManager;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/helpers/AppSettingManager;->a(Lio/getstream/chat/android/client/helpers/AppSettingManager;Ln23/h;)V

    return-void
.end method

.method public onScrollToBottom()V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->d(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)V

    return-void
.end method

.method public onSetupDone(Lhms/webrtc/CameraSession;)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {v0, p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->a(Llive/hms/video/media/capturers/HMSCameraCapturer;Lhms/webrtc/CameraSession;)V

    return-void
.end method

.method public onStatsDelivered(Lhms/webrtc/RTCStatsReport;)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/t;

    invoke-static {v0, p1}, Llive/hms/video/connection/HMSConnection;->a(Lbc3/t;Lhms/webrtc/RTCStatsReport;)V

    return-void
.end method

.method public onUserReactionClick(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V
    .locals 1

    iget-object v0, p0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->a(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V

    return-void
.end method
