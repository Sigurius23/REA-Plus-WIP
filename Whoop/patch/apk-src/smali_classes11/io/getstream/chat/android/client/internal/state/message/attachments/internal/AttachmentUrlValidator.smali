.class public final Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J5\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00080\u000bH\u0000\u00a2\u0006\u0002\u0008\rJ\u001f\u0010\u0006\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0008H\u0000\u00a2\u0006\u0002\u0008\rJ*\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00072\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00072\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0007H\u0002J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\u000c\u0010\u0019\u001a\u00020\u0017*\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;",
        "",
        "attachmentHelper",
        "Lio/getstream/chat/android/client/helpers/AttachmentHelper;",
        "<init>",
        "(Lio/getstream/chat/android/client/helpers/AttachmentHelper;)V",
        "updateValidAttachmentsUrl",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "newMessages",
        "oldMessages",
        "",
        "",
        "updateValidAttachmentsUrl$stream_chat_android_client_release",
        "newMessage",
        "oldMessage",
        "Lio/getstream/chat/android/models/Attachment;",
        "newAttachments",
        "oldAttachments",
        "updateValidAttachmentUrl",
        "newAttachment",
        "oldAttachment",
        "partialEquality",
        "",
        "other",
        "isDefault",
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
.field private final attachmentHelper:Lio/getstream/chat/android/client/helpers/AttachmentHelper;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;-><init>(Lio/getstream/chat/android/client/helpers/AttachmentHelper;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/helpers/AttachmentHelper;)V
    .locals 1

    const-string v0, "attachmentHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->attachmentHelper:Lio/getstream/chat/android/client/helpers/AttachmentHelper;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/helpers/AttachmentHelper;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lio/getstream/chat/android/client/helpers/AttachmentHelper;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p3, p2}, Lio/getstream/chat/android/client/helpers/AttachmentHelper;-><init>(Lio/getstream/chat/android/client/utils/TimeProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;-><init>(Lio/getstream/chat/android/client/helpers/AttachmentHelper;)V

    return-void
.end method

.method private final isDefault(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAuthorName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_3
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_4
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFallback()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    const/4 p1, 0x1

    return p1

    :cond_6
    const/4 p1, 0x0

    return p1
.end method

.method private final partialEquality(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)Z
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAuthorName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getAuthorName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFallback()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getFallback()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->isDefault(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final updateValidAttachmentUrl(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/models/Attachment;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->attachmentHelper:Lio/getstream/chat/android/client/helpers/AttachmentHelper;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/helpers/AttachmentHelper;->hasStreamImageUrl(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->attachmentHelper:Lio/getstream/chat/android/client/helpers/AttachmentHelper;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/helpers/AttachmentHelper;->hasValidImageUrl(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-nez v2, :cond_4

    :goto_0
    return-object p1

    :cond_4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v8

    const v24, 0xfffef

    const/16 v25, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v25}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    return-object v1

    :cond_5
    :goto_1
    return-object p1
.end method

.method private final updateValidAttachmentsUrl(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p0, v4, v1}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->partialEquality(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p0, v1, v3}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentUrl(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 53

    move-object/from16 v1, p1

    const-string v0, "newMessage"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    .line 10
    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v2

    move-object/from16 v3, p0

    .line 11
    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 12
    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    const v51, 0xffff

    const/16 v52, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    const/16 v50, -0x41

    .line 13
    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final updateValidAttachmentsUrl$stream_chat_android_client_release(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    const-string v0, "newMessages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldMessages"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 2
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 5
    check-cast v1, Lio/getstream/chat/android/models/Message;

    .line 6
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p0, v1, v2}, Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;->updateValidAttachmentsUrl$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
