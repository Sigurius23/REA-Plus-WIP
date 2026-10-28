.class final Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/api2/MoshiChatApi;->uploadFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/UploadedFile;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.api2.MoshiChatApi$uploadFile$1"
    f = "MoshiChatApi.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $file:Ljava/io/File;

.field final synthetic $progressCallback:Lio/getstream/chat/android/client/utils/ProgressCallback;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/MoshiChatApi;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/MoshiChatApi;",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->$file:Ljava/io/File;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->$progressCallback:Lio/getstream/chat/android/client/utils/ProgressCallback;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->$file:Ljava/io/File;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->$progressCallback:Lio/getstream/chat/android/client/utils/ProgressCallback;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;-><init>(Lio/getstream/chat/android/client/api2/MoshiChatApi;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->label:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->access$getFileTransformer$p(Lio/getstream/chat/android/client/api2/MoshiChatApi;)Lio/getstream/chat/android/client/uploader/FileTransformer;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->$file:Ljava/io/File;

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/uploader/FileTransformer;->transform(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->$progressCallback:Lio/getstream/chat/android/client/utils/ProgressCallback;

    invoke-static {v0}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->access$getFileUploader$p(Lio/getstream/chat/android/client/api2/MoshiChatApi;)Lio/getstream/chat/android/client/uploader/FileUploader;

    move-result-object v0

    invoke-interface {v0, p1, v1}, Lio/getstream/chat/android/client/uploader/FileUploader;->uploadFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->$progressCallback:Lio/getstream/chat/android/client/utils/ProgressCallback;

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_0

    move-object v2, p1

    check-cast v2, Ln23/g;

    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/UploadedFile;

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/models/UploadedFile;->getFile()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lio/getstream/chat/android/client/utils/ProgressCallback;->onSuccess(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_4

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$uploadFile$1;->$progressCallback:Lio/getstream/chat/android/client/utils/ProgressCallback;

    if-nez v1, :cond_3

    instance-of v1, p1, Ln23/f;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Ln23/f;

    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    if-eqz v0, :cond_3

    invoke-interface {v0, v1}, Lio/getstream/chat/android/client/utils/ProgressCallback;->onError(Ln23/e;)V

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
