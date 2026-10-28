.class final Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->downloadAttachment(Lio/getstream/chat/android/client/ChatClient;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)Lo23/d;
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
        "Ll83/a0;",
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
    c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$downloadAttachment$2"
    f = "ChatClientStateExtensions.kt"
    l = {
        0x150,
        0x150
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $attachment:Lio/getstream/chat/android/models/Attachment;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $this_downloadAttachment:Lio/getstream/chat/android/client/ChatClient;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$this_downloadAttachment:Lio/getstream/chat/android/client/ChatClient;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Ll83/h;)Lb23/k;
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
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$context:Landroid/content/Context;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$this_downloadAttachment:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;-><init>(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const-string v0, "Downloading attachment. Name: "

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->label:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$5:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/cdn/CDN;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$3:Ljava/lang/Object;

    check-cast v2, Landroid/net/Uri;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$2:Ljava/lang/Object;

    check-cast v3, Landroid/app/DownloadManager;

    iget-object v4, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$1:Ljava/lang/Object;

    check-cast v4, Ll83/h;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$5:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/cdn/CDN;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$3:Ljava/lang/Object;

    check-cast v2, Landroid/net/Uri;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$2:Ljava/lang/Object;

    check-cast v3, Landroid/app/DownloadManager;

    iget-object v4, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$1:Ljava/lang/Object;

    check-cast v4, Ll83/h;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p1, "Chat:DownloadAttachment"

    invoke-static {v1, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    :try_start_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$context:Landroid/content/Context;

    const-string v3, "download"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type android.app.DownloadManager"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Landroid/app/DownloadManager;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :catch_1
    move-exception v0

    goto/16 :goto_b

    :cond_3
    :goto_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v7, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    iget-object v7, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    iget-object v7, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-static {v7}, Lio/getstream/chat/android/client/internal/state/extensions/internal/AttachmentKt;->parseAttachmentNameFromUrl(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    invoke-static {}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->access$createAttachmentFallbackName()Ljava/lang/String;

    move-result-object v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_4
    :try_start_3
    iget-object v8, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$this_downloadAttachment:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v8}, Lio/getstream/chat/android/client/ChatClient;->getCdn()Lio/getstream/chat/android/client/cdn/CDN;

    move-result-object v8

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "toString(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-static {v10}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v10

    if-eqz v10, :cond_7

    if-eqz v8, :cond_6

    iput-object v6, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$2:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$3:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$4:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$5:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$6:Ljava/lang/Object;

    iput v5, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->label:I

    invoke-interface {v8, v9, p0}, Lio/getstream/chat/android/client/cdn/CDN;->imageRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, v4

    move-object v4, p1

    move-object p1, v2

    move-object v2, v1

    move-object v1, v7

    goto :goto_3

    :goto_1
    move-object v7, v1

    move-object v1, v2

    goto :goto_8

    :catch_2
    move-exception v2

    move-object v4, p1

    move-object p1, v2

    move-object v2, v1

    move-object v1, v7

    goto :goto_4

    :cond_6
    move-object v4, p1

    goto :goto_7

    :cond_7
    if-eqz v8, :cond_6

    iput-object v6, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$2:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$3:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$4:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$5:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->L$6:Ljava/lang/Object;

    iput v4, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;->label:I

    invoke-interface {v8, v9, p0}, Lio/getstream/chat/android/client/cdn/CDN;->fileRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-ne v4, v2, :cond_8

    :goto_2
    return-object v2

    :cond_8
    move-object v2, v4

    move-object v4, p1

    move-object p1, v2

    move-object v2, v1

    move-object v1, v7

    :goto_3
    :try_start_4
    check-cast p1, Lio/getstream/chat/android/client/cdn/CDNRequest;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :goto_4
    :try_start_5
    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb23/k;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :try_start_6
    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    sget-object v9, Lb23/g;->F:Lb23/g;

    iget-object v10, v7, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v9, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    iget-object v8, v7, Lb23/k;->b:Lb23/j;

    iget-object v7, v7, Lb23/k;->a:Ljava/lang/String;

    const-string v10, "CDN request failed for attachment. Falling back to original URL."

    invoke-interface {v8, v9, v7, v10, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :catch_3
    move-exception v0

    :goto_5
    move-object p1, v4

    goto/16 :goto_b

    :cond_9
    :goto_6
    move-object v7, v1

    move-object v1, v2

    :goto_7
    move-object p1, v6

    :goto_8
    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lio/getstream/chat/android/client/cdn/CDNRequest;->getUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    if-nez v2, :cond_a

    goto :goto_9

    :cond_a
    move-object v1, v2

    :cond_b
    :goto_9
    :try_start_7
    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb23/k;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    :try_start_8
    iget-object v8, v2, Lb23/k;->c:Lb23/e;

    sget-object v9, Lb23/g;->y:Lb23/g;

    iget-object v10, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v9, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_c

    iget-object v8, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Uri: "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v9, v2, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    new-instance v0, Landroid/app/DownloadManager$Request;

    invoke-direct {v0, v1}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0, v7}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    move-result-object v0

    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v0, v1, v7}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    move-result-object v0

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lio/getstream/chat/android/client/cdn/CDNRequest;->getHeaders()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    goto :goto_a

    :cond_d
    invoke-virtual {v3, v0}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_c

    :catch_4
    move-exception p1

    move-object v0, p1

    goto/16 :goto_5

    :goto_b
    invoke-interface {p1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v4, "Downloading attachment failed. Error: "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3, v2, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    new-instance p1, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not download the attachment"

    invoke-direct {v1, v2, v0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p1, v1}, Ln23/f;-><init>(Ln23/e;)V

    :goto_c
    return-object p1
.end method
