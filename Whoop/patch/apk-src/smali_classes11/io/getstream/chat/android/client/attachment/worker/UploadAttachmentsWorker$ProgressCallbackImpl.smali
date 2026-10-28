.class final Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/utils/ProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ProgressCallbackImpl"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;",
        "Lio/getstream/chat/android/client/utils/ProgressCallback;",
        "",
        "messageId",
        "uploadId",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "channelStateLogic",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;)V",
        "Lio/getstream/chat/android/models/Attachment$UploadState;",
        "newState",
        "Ll83/a0;",
        "updateAttachmentUploadState",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment$UploadState;)V",
        "url",
        "onSuccess",
        "(Ljava/lang/String;)V",
        "Ln23/e;",
        "error",
        "onError",
        "(Ln23/e;)V",
        "",
        "bytesUploaded",
        "totalBytes",
        "onProgress",
        "(JJ)V",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "lastProgressUpdateTime",
        "J",
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
.field private final channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

.field private lastProgressUpdateTime:J

.field private final messageId:Ljava/lang/String;

.field private final uploadId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelStateLogic"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->messageId:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->uploadId:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    return-void
.end method

.method private final updateAttachmentUploadState(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment$UploadState;)V
    .locals 55

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    invoke-interface {v1}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->channelState()Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMessages()Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p1

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v5}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v6, p2

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const v26, 0xbffff

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, p3

    invoke-static/range {v5 .. v27}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v5

    :cond_2
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v10

    const v53, 0xffff

    const/16 v54, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, -0x41

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    invoke-interface {v2, v1}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final onError(Ln23/e;)V
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    const-string v2, "Chat:UploadWorker"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[Progress.onError] #uploader; error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->messageId:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->uploadId:Ljava/lang/String;

    new-instance v2, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    invoke-direct {v2, p1}, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;-><init>(Ln23/e;)V

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->updateAttachmentUploadState(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment$UploadState;)V

    return-void
.end method

.method public final onProgress(JJ)V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->lastProgressUpdateTime:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0xc8

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    cmp-long v2, p1, p3

    if-gez v2, :cond_0

    return-void

    :cond_0
    iput-wide v0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->lastProgressUpdateTime:J

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->messageId:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->uploadId:Ljava/lang/String;

    new-instance v2, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    invoke-direct {v2, p1, p2, p3, p4}, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;-><init>(JJ)V

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->updateAttachmentUploadState(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment$UploadState;)V

    return-void
.end method

.method public final onSuccess(Ljava/lang/String;)V
    .locals 4

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->z:Lb23/g;

    const-string v2, "Chat:UploadWorker"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    const-string v3, "[Progress.onSuccess] #uploader; url: "

    invoke-static {v3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->messageId:Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->uploadId:Ljava/lang/String;

    sget-object v1, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;->updateAttachmentUploadState(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment$UploadState;)V

    return-void
.end method
