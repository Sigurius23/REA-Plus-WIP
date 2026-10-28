.class final Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->resolveAttachmentFiles(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.helper.internal.AttachmentStorageHelper$resolveAttachmentFiles$2"
    f = "AttachmentStorageHelper.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;


# direct methods
.method public constructor <init>(Ljava/util/List;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->$attachments:Ljava/util/List;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->this$0:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->$attachments:Ljava/util/List;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->this$0:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;-><init>(Ljava/util/List;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;Lq83/d;)V

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
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->label:I

    if-nez v1, :cond_8

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->$attachments:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;->this$0:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v4

    const-string v6, "io.getstream.sourceUri"

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v7, v4, Ljava/lang/String;

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    check-cast v4, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v4, v8

    :goto_1
    if-eqz v4, :cond_6

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    if-eqz v10, :cond_6

    new-instance v9, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v13

    const/16 v16, 0x30

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v4

    int-to-long v11, v4

    invoke-virtual {v9, v11, v12}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSize(J)V

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->access$getStorageHelper$p(Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;)Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    move-result-object v4

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->access$getContext$p(Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;)Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v4, v7, v9}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getCachedFileFromUri(Landroid/content/Context;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/io/File;

    move-result-object v4

    if-nez v4, :cond_4

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->access$getLogger(Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;)Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v6, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    const-string v5, "[resolveAttachmentFiles] Failed to resolve file for URI: "

    invoke-static {v10, v5}, Lr80/c;->m(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v7, v6, v5, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    move-object v5, v8

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getOriginalWidth()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getOriginalHeight()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-static {v2, v4, v5}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->access$resolveLocalDimensions(Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;Ljava/io/File;Lio/getstream/chat/android/models/Attachment;)Ll83/k;

    move-result-object v7

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getOriginalWidth()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getOriginalHeight()Ljava/lang/Integer;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v7, v9

    :goto_2
    iget-object v8, v7, Ll83/k;->w:Ljava/lang/Object;

    move-object/from16 v22, v8

    check-cast v22, Ljava/lang/Integer;

    iget-object v7, v7, Ll83/k;->x:Ljava/lang/Object;

    move-object/from16 v21, v7

    check-cast v21, Ljava/lang/Integer;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v7

    invoke-static {v6, v7}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v25

    const v26, 0x47fff

    const/16 v27, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v4

    invoke-static/range {v5 .. v27}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v5

    :cond_6
    :goto_3
    if-eqz v5, :cond_0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    return-object v3

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
