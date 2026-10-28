.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/r0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/r0;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    return-void
.end method


# virtual methods
.method public final onMessageLongClick(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/r0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/r0;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->F(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    return p1
.end method
