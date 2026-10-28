.class public final Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/u;",
        "doWork",
        "(Lq83/d;)Ljava/lang/Object;",
        "Companion",
        "Lb23/k;",
        "logger",
        "stream-chat-android-client_release"
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
.field public static final Companion:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;

.field private static final DATA_CHANNEL_ID:Ljava/lang/String; = "channel_id"

.field private static final DATA_CHANNEL_TYPE:Ljava/lang/String; = "channel_type"

.field private static final DATA_MESSAGE_ID:Ljava/lang/String; = "message_id"

.field private static final ERROR_KEY:Ljava/lang/String; = "error"

.field private static final TAG:Ljava/lang/String; = "Chat:SystemUploadWorker"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;->Companion:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method

.method private static final doWork$lambda$0(Ll83/h;)Lb23/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lb23/k;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb23/k;

    return-object p0
.end method


# virtual methods
.method public final doWork(Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;

    iget v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;-><init>(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    iget-object v2, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v0, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "channel_type"

    invoke-virtual {p1, v2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "channel_id"

    invoke-virtual {p1, v2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "message_id"

    invoke-virtual {p1, v2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v2, "Chat:SystemUploadWorker"

    invoke-static {p0, v2}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v2

    sget-object v5, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v10

    invoke-virtual {v10}, Lio/getstream/chat/android/client/ChatClient;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v9

    new-instance v5, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    invoke-virtual {v10}, Lio/getstream/chat/android/client/ChatClient;->getLogicRegistry()Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-interface {v8, v6, v7}, Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;->channelStateLogic(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    move-result-object v8

    goto :goto_1

    :cond_3
    move-object v8, v4

    :goto_1
    const/16 v12, 0x20

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/attachment/AttachmentUploader;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->L$5:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$doWork$1;->label:I

    invoke-virtual {v5, p1, v0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->uploadAttachmentsForMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, v2

    :goto_2
    check-cast p1, Ln23/h;

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[doWork] #uploader; attachments uploaded successfully"

    invoke-interface {p1, v2, v1, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_8

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->z:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object v1, p1

    check-cast v1, Ln23/f;

    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[doWork] #uploader; error while uploading attachments: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    new-instance v0, Lb0/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb0/b;-><init>(I)V

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "error"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb0/b;->e(Ljava/util/Map;)V

    invoke-virtual {v0}, Lb0/b;->b()Lic/g;

    move-result-object p1

    new-instance v0, Lic/r;

    invoke-direct {v0, p1}, Lic/r;-><init>(Lic/g;)V

    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
