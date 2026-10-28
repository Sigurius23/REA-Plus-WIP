.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;",
        "",
        "canHandle",
        "",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "createViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;",
        "listeners",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
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
.method public static synthetic access$createViewHolder$jd(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;->createViewHolder(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract canHandle(Lio/getstream/chat/android/models/Message;)Z
.end method

.method public createViewHolder(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;
    .locals 0

    const-string p2, "message"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "parent"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder$Companion;

    invoke-virtual {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder$Companion;->stub(Landroid/view/View;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;

    move-result-object p1

    return-object p1
.end method
