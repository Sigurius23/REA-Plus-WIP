.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/u0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/u0;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    return-void
.end method


# virtual methods
.method public final onAttachmentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/u0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/u0;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, v1, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->c0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z

    move-result p1

    return p1
.end method
