.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u000c\u0010\t\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\u000c\u0010\t\u001a\u00020\u0002*\u00020\u0008H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\n*\u00020\u000bH\u0002\u001a\u0016\u0010\t\u001a\u00020\u000b*\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;",
        "Lio/getstream/chat/android/models/Attachment;",
        "messageId",
        "",
        "index",
        "",
        "toReplyEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;",
        "toModel",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;",
        "Lio/getstream/chat/android/models/Attachment$UploadState;",
        "uploadFile",
        "Ljava/io/File;",
        "stream-chat-android-client_release"
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
.method public static final toEntity(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;I)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;
    .locals 23

    move-object/from16 v2, p1

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 2
    const-string v3, "extra_data_id_key"

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    .line 3
    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity$Companion;

    move/from16 v5, p2

    invoke-virtual {v4, v2, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity$Companion;->generateId$stream_chat_android_client_release(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/String;

    .line 6
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getAuthorName()Ljava/lang/String;

    move-result-object v3

    move-object v1, v4

    .line 7
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getAuthorLink()Ljava/lang/String;

    move-result-object v5

    .line 9
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v6

    .line 10
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    .line 11
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v8

    .line 12
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getOgUrl()Ljava/lang/String;

    move-result-object v9

    .line 13
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v10

    .line 14
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v11

    .line 15
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v12

    .line 16
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getText()Ljava/lang/String;

    move-result-object v13

    .line 17
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v14

    .line 18
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getImage()Ljava/lang/String;

    move-result-object v15

    .line 19
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v16

    .line 20
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getFallback()Ljava/lang/String;

    move-result-object v17

    .line 21
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v18

    const/16 v19, 0x0

    if-eqz v18, :cond_1

    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v18

    goto :goto_0

    :cond_1
    move-object/from16 v18, v19

    .line 22
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v20

    if-eqz v20, :cond_2

    invoke-static/range {v20 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;->toEntity(Lio/getstream/chat/android/models/Attachment$UploadState;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;

    move-result-object v19

    :cond_2
    move-object/from16 v21, v19

    .line 23
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getOriginalHeight()Ljava/lang/Integer;

    move-result-object v19

    .line 24
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getOriginalWidth()Ljava/lang/Integer;

    move-result-object v20

    move-object/from16 v22, v0

    .line 25
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;

    invoke-direct/range {v0 .. v22}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/util/Map;)V

    return-object v0
.end method

.method private static final toEntity(Lio/getstream/chat/android/models/Attachment$UploadState;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;
    .locals 3

    const/4 v0, 0x2

    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 27
    sget-object v1, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    .line 28
    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    .line 29
    :cond_0
    sget-object v1, Lio/getstream/chat/android/models/Attachment$UploadState$Idle;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Idle;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 30
    new-instance p0, Ll83/k;

    invoke-direct {p0, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    move-object v0, p0

    goto :goto_1

    .line 31
    :cond_1
    instance-of v1, p0, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    if-eqz v1, :cond_2

    .line 32
    new-instance p0, Ll83/k;

    invoke-direct {p0, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 33
    :cond_2
    instance-of v0, p0, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    if-eqz v0, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast p0, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;->getError()Ln23/e;

    move-result-object p0

    invoke-virtual {p0}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p0

    .line 34
    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v1

    .line 35
    :goto_1
    iget-object p0, v0, Ll83/k;->w:Ljava/lang/Object;

    .line 36
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    .line 37
    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    .line 38
    check-cast v0, Ljava/lang/String;

    .line 39
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;

    invoke-direct {v1, p0, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;-><init>(ILjava/lang/String;)V

    return-object v1

    .line 40
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/io/File;)Lio/getstream/chat/android/models/Attachment$UploadState;
    .locals 4

    .line 43
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;->getStatusCode()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 p1, 0x3

    if-ne v0, p1, :cond_1

    .line 44
    new-instance p1, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    new-instance v0, Ln23/a;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;->getErrorMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-direct {v0, p0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;-><init>(Ln23/e;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;->getStatusCode()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Integer value of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " can\'t be mapped to UploadState"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 46
    :cond_2
    new-instance p0, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v2

    goto :goto_0

    :cond_3
    move-wide v2, v0

    :goto_0
    invoke-direct {p0, v0, v1, v2, v3}, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;-><init>(JJ)V

    return-object p0

    .line 47
    :cond_4
    sget-object p0, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    return-object p0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;)Lio/getstream/chat/android/models/Attachment;
    .locals 22

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getAuthorName()Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getTitleLink()Ljava/lang/String;

    move-result-object v4

    .line 3
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getAuthorLink()Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getThumbUrl()Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getAssetUrl()Ljava/lang/String;

    move-result-object v7

    .line 7
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getOgUrl()Ljava/lang/String;

    move-result-object v8

    .line 8
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getMimeType()Ljava/lang/String;

    move-result-object v9

    .line 9
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getFileSize()I

    move-result v10

    .line 10
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getTitle()Ljava/lang/String;

    move-result-object v11

    .line 11
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getText()Ljava/lang/String;

    move-result-object v12

    .line 12
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getType()Ljava/lang/String;

    move-result-object v13

    .line 13
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getImage()Ljava/lang/String;

    move-result-object v14

    .line 14
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getName()Ljava/lang/String;

    move-result-object v15

    .line 15
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getFallback()Ljava/lang/String;

    move-result-object v16

    .line 16
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getUploadFilePath()Ljava/lang/String;

    move-result-object v0

    const/16 v17, 0x0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v19, v1

    goto :goto_0

    :cond_0
    move-object/from16 v19, v17

    .line 17
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getUploadState()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getUploadFilePath()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v18, v2

    if-eqz v1, :cond_1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object/from16 v2, v17

    :goto_1
    invoke-static {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/io/File;)Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v17

    :goto_2
    move-object/from16 v20, v17

    goto :goto_3

    :cond_2
    move-object/from16 v18, v2

    goto :goto_2

    .line 18
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getOriginalHeight()Ljava/lang/Integer;

    move-result-object v17

    move-object/from16 v2, v18

    .line 19
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getOriginalWidth()Ljava/lang/Integer;

    move-result-object v18

    .line 20
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->getExtraData()Ljava/util/Map;

    move-result-object v21

    .line 21
    new-instance v1, Lio/getstream/chat/android/models/Attachment;

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;)Lio/getstream/chat/android/models/Attachment;
    .locals 22

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getAuthorName()Ljava/lang/String;

    move-result-object v2

    .line 23
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getTitleLink()Ljava/lang/String;

    move-result-object v4

    .line 24
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getAuthorLink()Ljava/lang/String;

    move-result-object v3

    .line 25
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getThumbUrl()Ljava/lang/String;

    move-result-object v5

    .line 26
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    .line 27
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getAssetUrl()Ljava/lang/String;

    move-result-object v7

    .line 28
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getOgUrl()Ljava/lang/String;

    move-result-object v8

    .line 29
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getMimeType()Ljava/lang/String;

    move-result-object v9

    .line 30
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getFileSize()I

    move-result v10

    .line 31
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getTitle()Ljava/lang/String;

    move-result-object v11

    .line 32
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getText()Ljava/lang/String;

    move-result-object v12

    .line 33
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getType()Ljava/lang/String;

    move-result-object v13

    .line 34
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getImage()Ljava/lang/String;

    move-result-object v14

    .line 35
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getName()Ljava/lang/String;

    move-result-object v15

    .line 36
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getFallback()Ljava/lang/String;

    move-result-object v16

    .line 37
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getUploadFilePath()Ljava/lang/String;

    move-result-object v0

    const/16 v17, 0x0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v19, v1

    goto :goto_0

    :cond_0
    move-object/from16 v19, v17

    .line 38
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getUploadState()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getUploadFilePath()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v18, v2

    if-eqz v1, :cond_1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object/from16 v2, v17

    :goto_1
    invoke-static {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/io/File;)Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v17

    :goto_2
    move-object/from16 v20, v17

    goto :goto_3

    :cond_2
    move-object/from16 v18, v2

    goto :goto_2

    .line 39
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getOriginalHeight()Ljava/lang/Integer;

    move-result-object v17

    move-object/from16 v2, v18

    .line 40
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getOriginalWidth()Ljava/lang/Integer;

    move-result-object v18

    .line 41
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;->getExtraData()Ljava/util/Map;

    move-result-object v21

    .line 42
    new-instance v1, Lio/getstream/chat/android/models/Attachment;

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;)V

    return-object v1
.end method

.method public static final toReplyEntity(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;I)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;
    .locals 23

    move-object/from16 v2, p1

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    const-string v3, "extra_data_id_key"

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity$Companion;

    move/from16 v5, p2

    invoke-virtual {v4, v2, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity$Companion;->generateId$stream_chat_android_client_release(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getAuthorName()Ljava/lang/String;

    move-result-object v3

    move-object v1, v4

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getAuthorLink()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getOgUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v11

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getText()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getImage()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getFallback()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v18

    const/16 v19, 0x0

    if-eqz v18, :cond_1

    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v18

    goto :goto_0

    :cond_1
    move-object/from16 v18, v19

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v20

    if-eqz v20, :cond_2

    invoke-static/range {v20 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;->toEntity(Lio/getstream/chat/android/models/Attachment$UploadState;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;

    move-result-object v19

    :cond_2
    move-object/from16 v21, v19

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getOriginalHeight()Ljava/lang/Integer;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Attachment;->getOriginalWidth()Ljava/lang/Integer;

    move-result-object v20

    move-object/from16 v22, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;

    invoke-direct/range {v0 .. v22}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/util/Map;)V

    return-object v0
.end method
