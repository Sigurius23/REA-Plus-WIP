.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;


# instance fields
.field public final synthetic a:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/q;->a:Lc93/a;

    return-void
.end method


# virtual methods
.method public final onPollOptionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/q;->a:Lc93/a;

    invoke-static {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->h(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Z

    move-result p1

    return p1
.end method
