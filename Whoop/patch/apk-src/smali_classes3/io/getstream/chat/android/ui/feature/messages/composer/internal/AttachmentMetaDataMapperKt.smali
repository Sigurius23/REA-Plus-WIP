.class public final Lio/getstream/chat/android/ui/feature/messages/composer/internal/AttachmentMetaDataMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "toAttachment",
        "Lio/getstream/chat/android/models/Attachment;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "context",
        "Landroid/content/Context;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Landroid/content/Context;)Lio/getstream/chat/android/models/Attachment;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    invoke-direct {v2}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;-><init>()V

    invoke-virtual {v2, v1, v0}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getCachedFileFromUri(Landroid/content/Context;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/io/File;

    move-result-object v21

    const/4 v1, 0x0

    if-nez v21, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "io.getstream.sourceUri"

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    :goto_0
    move-object/from16 v23, v2

    goto :goto_1

    :cond_1
    sget-object v2, Lm83/z;->w:Lm83/z;

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getType()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getTitle()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    if-eqz v21, :cond_2

    invoke-virtual/range {v21 .. v21}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_4

    const-string v2, ""

    :cond_3
    move-object/from16 v17, v2

    goto :goto_2

    :cond_4
    move-object/from16 v17, v1

    :goto_2
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getSize()J

    move-result-wide v1

    long-to-int v12, v1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getMimeType()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getTitle()Ljava/lang/String;

    move-result-object v13

    new-instance v3, Lio/getstream/chat/android/models/Attachment;

    const v24, 0x5d47f

    const/16 v25, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v3 .. v25}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method
