.class public final Lio/getstream/chat/android/client/attachment/AttachmentUploader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;,
        Lio/getstream/chat/android/client/attachment/AttachmentUploader$WhenMappings;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JP\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JP\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\'\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0016\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J/\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ3\u0010\u001f\u001a\u00020\r*\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010!\u001a\u00020\u0010*\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J:\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0087@\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/AttachmentUploader;",
        "",
        "Lio/getstream/chat/android/client/ChatClient;",
        "client",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;)V",
        "",
        "channelType",
        "channelId",
        "Ljava/io/File;",
        "file",
        "Lio/getstream/chat/android/client/utils/ProgressCallback;",
        "progressCallback",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "mimeType",
        "Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;",
        "attachmentType",
        "Ln23/h;",
        "uploadImage",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;",
        "uploadFile",
        "augmentedAttachment",
        "onSuccessfulUpload",
        "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;",
        "Ln23/f;",
        "result",
        "onFailedUpload",
        "(Lio/getstream/chat/android/models/Attachment;Ln23/f;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;",
        "Lio/getstream/chat/android/models/UploadedFile;",
        "uploadedFile",
        "augmentAttachmentOnSuccess",
        "(Lio/getstream/chat/android/models/Attachment;Ljava/io/File;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lio/getstream/chat/android/models/UploadedFile;)Lio/getstream/chat/android/models/Attachment;",
        "toAttachmentType",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;",
        "uploadAttachment",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "AttachmentType",
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


# instance fields
.field private final client:Lio/getstream/chat/android/client/ChatClient;

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;-><init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 3
    const-string p1, "Chat:Uploader"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;-><init>(Lio/getstream/chat/android/client/ChatClient;)V

    return-void
.end method

.method public static final synthetic access$uploadFile(Lio/getstream/chat/android/client/attachment/AttachmentUploader;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p8}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->uploadFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$uploadImage(Lio/getstream/chat/android/client/attachment/AttachmentUploader;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p8}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->uploadImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final augmentAttachmentOnSuccess(Lio/getstream/chat/android/models/Attachment;Ljava/io/File;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lio/getstream/chat/android/models/UploadedFile;)Lio/getstream/chat/android/models/Attachment;
    .locals 24

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v10, v0

    sget-object v20, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :cond_1
    if-nez v0, :cond_2

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v11, v0

    invoke-virtual/range {p5 .. p5}, Lio/getstream/chat/android/models/UploadedFile;->getThumbUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual/range {p4 .. p4}, Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_3
    move-object v13, v0

    sget-object v0, Lio/getstream/chat/android/client/attachment/AttachmentUploader$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_4
    invoke-virtual/range {p5 .. p5}, Lio/getstream/chat/android/models/UploadedFile;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-virtual/range {p5 .. p5}, Lio/getstream/chat/android/models/UploadedFile;->getFile()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p5 .. p5}, Lio/getstream/chat/android/models/UploadedFile;->getFile()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p5 .. p5}, Lio/getstream/chat/android/models/UploadedFile;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    const-string v1, "uploadId"

    invoke-static {v1, v0}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v21

    const v22, 0x3d447

    const/16 v23, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    move-object/from16 v9, p3

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final onFailedUpload(Lio/getstream/chat/android/models/Attachment;Ln23/f;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Attachment;",
            "Ln23/f;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p2, Ln23/f;->a:Ln23/e;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[onFailedUpload] #uploader; attachment "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " upload failed: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz p3, :cond_1

    iget-object p1, p2, Ln23/f;->a:Ln23/e;

    invoke-interface {p3, p1}, Lio/getstream/chat/android/client/utils/ProgressCallback;->onError(Ln23/e;)V

    :cond_1
    new-instance p1, Ln23/f;

    iget-object p2, p2, Ln23/f;->a:Ln23/e;

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method

.method private final onSuccessfulUpload(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    move-object/from16 v0, p2

    invoke-direct/range {p0 .. p0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-static/range {p1 .. p1}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "[onSuccessfulUpload] #uploader; attachment "

    const-string v6, " uploaded successfully"

    invoke-static {v5, v2, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/getstream/chat/android/client/utils/ProgressCallback;->onSuccess(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Ln23/g;

    sget-object v20, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    const v22, 0xbffff

    const/16 v23, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    const/16 v21, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final toAttachmentType(Ljava/lang/String;)Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;->FILE:Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;

    return-object p1

    :cond_0
    sget-object v0, Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;->INSTANCE:Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;->isImageMimeTypeSupported(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;->IMAGE:Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;

    return-object p1

    :cond_1
    const-string v0, "video"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;->VIDEO:Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;

    return-object p1

    :cond_2
    sget-object p1, Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;->FILE:Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;

    return-object p1
.end method

.method public static synthetic uploadAttachment$default(Lio/getstream/chat/android/client/attachment/AttachmentUploader;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->uploadAttachment(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final uploadFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    instance-of v9, v8, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;

    if-eqz v9, :cond_0

    move-object v9, v8

    check-cast v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;

    iget v10, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->label:I

    const/high16 v11, -0x80000000

    and-int v12, v10, v11

    if-eqz v12, :cond_0

    sub-int/2addr v10, v11

    iput v10, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;

    invoke-direct {v9, v0, v8}, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;-><init>(Lio/getstream/chat/android/client/attachment/AttachmentUploader;Lq83/d;)V

    :goto_0
    iget-object v8, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->result:Ljava/lang/Object;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v11, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->label:I

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eqz v11, :cond_2

    if-ne v11, v13, :cond_1

    iget-object v1, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$6:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;

    iget-object v2, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$5:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Attachment;

    iget-object v4, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/utils/ProgressCallback;

    iget-object v5, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/io/File;

    iget-object v6, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static {v8}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v5

    move-object v5, v3

    move-object v3, v7

    move-object v7, v1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v8}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v11, v8, Lb23/k;->c:Lb23/e;

    iget-object v14, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v13, "[uploadFile] #uploader; mimeType: "

    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", attachmentType: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ", file: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ", cid: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ":$"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", attachment: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v8, v15, v14, v11, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v8, v0, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v8, v1, v2, v3, v4}, Lio/getstream/chat/android/client/ChatClient;->sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object v1

    iput-object v12, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$0:Ljava/lang/Object;

    iput-object v12, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$1:Ljava/lang/Object;

    iput-object v3, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$2:Ljava/lang/Object;

    iput-object v4, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$3:Ljava/lang/Object;

    iput-object v5, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$4:Ljava/lang/Object;

    iput-object v6, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$5:Ljava/lang/Object;

    iput-object v7, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->L$6:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadFile$1;->label:I

    invoke-interface {v1, v9}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v10, :cond_4

    return-object v10

    :cond_4
    move-object v2, v6

    :goto_1
    check-cast v8, Ln23/h;

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v6, v1, Lb23/k;->c:Lb23/e;

    iget-object v9, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v6, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "[uploadFile] #uploader; result: "

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v10, v9, v6, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    instance-of v1, v8, Ln23/g;

    if-eqz v1, :cond_6

    check-cast v8, Ln23/g;

    iget-object v1, v8, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/UploadedFile;

    move-object/from16 p1, v0

    move-object/from16 p6, v1

    move-object/from16 p4, v2

    move-object/from16 p3, v3

    move-object/from16 p2, v5

    move-object/from16 p5, v7

    invoke-direct/range {p1 .. p6}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->augmentAttachmentOnSuccess(Lio/getstream/chat/android/models/Attachment;Ljava/io/File;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lio/getstream/chat/android/models/UploadedFile;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-direct {v1, v0, v4}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->onSuccessfulUpload(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;

    move-result-object v0

    return-object v0

    :cond_6
    move-object v1, v0

    move-object v3, v5

    instance-of v0, v8, Ln23/f;

    if-eqz v0, :cond_7

    check-cast v8, Ln23/f;

    invoke-direct {v1, v3, v8, v4}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->onFailedUpload(Lio/getstream/chat/android/models/Attachment;Ln23/f;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;

    move-result-object v0

    return-object v0

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final uploadImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    instance-of v9, v8, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;

    if-eqz v9, :cond_0

    move-object v9, v8

    check-cast v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;

    iget v10, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->label:I

    const/high16 v11, -0x80000000

    and-int v12, v10, v11

    if-eqz v12, :cond_0

    sub-int/2addr v10, v11

    iput v10, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;

    invoke-direct {v9, v0, v8}, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;-><init>(Lio/getstream/chat/android/client/attachment/AttachmentUploader;Lq83/d;)V

    :goto_0
    iget-object v8, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->result:Ljava/lang/Object;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v11, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->label:I

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eqz v11, :cond_2

    if-ne v11, v13, :cond_1

    iget-object v1, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$6:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;

    iget-object v2, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$5:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Attachment;

    iget-object v4, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/utils/ProgressCallback;

    iget-object v5, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/io/File;

    iget-object v6, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static {v8}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v5

    move-object v5, v3

    move-object v3, v7

    move-object v7, v1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v8}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v11, v8, Lb23/k;->c:Lb23/e;

    iget-object v14, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v13, "[uploadImage] #uploader; mimeType: "

    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", attachmentType: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ", file: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ", cid: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ":$"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", attachment: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v8, v15, v14, v11, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v8, v0, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v8, v1, v2, v3, v4}, Lio/getstream/chat/android/client/ChatClient;->sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object v1

    iput-object v12, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$0:Ljava/lang/Object;

    iput-object v12, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$1:Ljava/lang/Object;

    iput-object v3, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$2:Ljava/lang/Object;

    iput-object v4, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$3:Ljava/lang/Object;

    iput-object v5, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$4:Ljava/lang/Object;

    iput-object v6, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$5:Ljava/lang/Object;

    iput-object v7, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->L$6:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v9, Lio/getstream/chat/android/client/attachment/AttachmentUploader$uploadImage$1;->label:I

    invoke-interface {v1, v9}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v10, :cond_4

    return-object v10

    :cond_4
    move-object v2, v6

    :goto_1
    check-cast v8, Ln23/h;

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v6, v1, Lb23/k;->c:Lb23/e;

    iget-object v9, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v6, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "[uploadImage] #uploader; result: "

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v10, v9, v6, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    instance-of v1, v8, Ln23/g;

    if-eqz v1, :cond_6

    check-cast v8, Ln23/g;

    iget-object v1, v8, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/UploadedFile;

    move-object/from16 p1, v0

    move-object/from16 p6, v1

    move-object/from16 p4, v2

    move-object/from16 p3, v3

    move-object/from16 p2, v5

    move-object/from16 p5, v7

    invoke-direct/range {p1 .. p6}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->augmentAttachmentOnSuccess(Lio/getstream/chat/android/models/Attachment;Ljava/io/File;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lio/getstream/chat/android/models/UploadedFile;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-direct {v1, v0, v4}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->onSuccessfulUpload(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;

    move-result-object v0

    return-object v0

    :cond_6
    move-object v1, v0

    move-object v3, v5

    instance-of v0, v8, Ln23/f;

    if-eqz v0, :cond_7

    check-cast v8, Ln23/f;

    invoke-direct {v1, v3, v8, v4}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->onFailedUpload(Lio/getstream/chat/android/models/Attachment;Ln23/f;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;

    move-result-object v0

    return-object v0

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final uploadAttachment(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-static {v3}, Lx83/j;->m(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v6, v0

    invoke-direct {p0, v6}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->toAttachmentType(Ljava/lang/String;)Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;

    move-result-object v7

    sget-object v0, Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;->IMAGE:Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;

    const/4 v1, 0x0

    const-string v2, "[uploadAttachment] #uploader; uploading "

    if-ne v7, v0, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-static {p3}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v4

    const-string v9, " as image"

    invoke-static {v2, v4, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v8, v5, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object v4, p4

    move-object v8, p5

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->uploadImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    move-object v4, v1

    move-object v1, p1

    move-object p1, v4

    move-object v4, v2

    move-object v2, p2

    move-object p2, v4

    move-object v5, p3

    move-object v4, p4

    move-object v8, p5

    invoke-direct {p0}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->getLogger()Lb23/k;

    move-result-object p3

    iget-object p4, p3, Lb23/k;->c:Lb23/e;

    iget-object p5, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v0, Lb23/g;->y:Lb23/g;

    invoke-interface {p4, v0, p5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_3

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    invoke-static {v5}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object p4

    const-string v9, " as file"

    invoke-static {p2, p4, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, v0, p5, p2, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->uploadFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "An attachment needs to have a non null attachment.upload value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
