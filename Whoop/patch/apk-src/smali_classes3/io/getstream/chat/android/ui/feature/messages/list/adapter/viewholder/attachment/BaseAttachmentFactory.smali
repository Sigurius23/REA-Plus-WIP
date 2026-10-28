.class public abstract Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/BaseAttachmentFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/BaseAttachmentFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;",
        "<init>",
        "()V",
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
.method public final createViewHolder(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;->createViewHolder(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;

    move-result-object p1

    return-object p1
.end method
