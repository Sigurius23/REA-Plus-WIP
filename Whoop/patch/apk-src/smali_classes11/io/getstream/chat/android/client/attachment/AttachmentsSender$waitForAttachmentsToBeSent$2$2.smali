.class final Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $allAttachmentsUploaded:Lkotlin/jvm/internal/b0;

.field final synthetic $messageToBeSent:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic $newMessage:Lio/getstream/chat/android/models/Message;

.field final synthetic this$0:Lio/getstream/chat/android/client/attachment/AttachmentsSender;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/client/attachment/AttachmentsSender;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lio/getstream/chat/android/models/Message;",
            "Lkotlin/jvm/internal/b0;",
            "Lio/getstream/chat/android/client/attachment/AttachmentsSender;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->$messageToBeSent:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->$newMessage:Lio/getstream/chat/android/models/Message;

    iput-object p3, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->$allAttachmentsUploaded:Lkotlin/jvm/internal/b0;

    iput-object p4, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->this$0:Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->emit(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final emit(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 2
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .line 3
    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Attachment;

    .line 5
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v5

    sget-object v6, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    if-eqz v2, :cond_2

    .line 6
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_1

    .line 7
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    .line 8
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v2

    instance-of v2, v2, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    if-eqz v2, :cond_3

    .line 9
    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->this$0:Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    invoke-static {v1}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->access$getJobsMap$p(Lio/getstream/chat/android/client/attachment/AttachmentsSender;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->$newMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    if-eqz v1, :cond_5

    .line 10
    invoke-interface {v1, v3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto/16 :goto_1

    .line 11
    :cond_4
    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->$messageToBeSent:Lkotlin/jvm/internal/g0;

    iget-object v4, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->$newMessage:Lio/getstream/chat/android/models/Message;

    move-object/from16 v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    const v54, 0xffff

    const/16 v55, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

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

    const/16 v52, 0x0

    const/16 v53, -0x41

    invoke-static/range {v4 .. v55}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    .line 12
    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->$allAttachmentsUploaded:Lkotlin/jvm/internal/b0;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lkotlin/jvm/internal/b0;->w:Z

    .line 13
    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->this$0:Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    invoke-static {v1}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->access$getJobsMap$p(Lio/getstream/chat/android/client/attachment/AttachmentsSender;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;->$newMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    if-eqz v1, :cond_5

    .line 14
    invoke-interface {v1, v3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 15
    :cond_5
    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
