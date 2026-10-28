.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/v;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    return-void
.end method


# virtual methods
.method public final onAttachmentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/v;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->J0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z

    move-result p1

    return p1
.end method
