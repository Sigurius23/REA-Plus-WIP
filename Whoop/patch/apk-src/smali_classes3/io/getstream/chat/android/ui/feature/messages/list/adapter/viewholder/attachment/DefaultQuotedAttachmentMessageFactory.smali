.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/DefaultQuotedAttachmentMessageFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/DefaultQuotedAttachmentMessageFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactory;",
        "<init>",
        "()V",
        "canHandle",
        "",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "generateQuotedAttachmentView",
        "Landroid/view/View;",
        "parent",
        "Landroid/view/ViewGroup;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final canHandle(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isFile(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isGiphy(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final generateQuotedAttachmentView(Lio/getstream/chat/android/models/Message;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v1, "getContext(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->showAttachment(Lio/getstream/chat/android/models/Attachment;)V

    return-object v0
.end method
