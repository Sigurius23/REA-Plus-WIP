.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/b;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/b;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    return-void
.end method


# virtual methods
.method public final onMessageClick(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/b;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/b;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->V(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    return p1
.end method
