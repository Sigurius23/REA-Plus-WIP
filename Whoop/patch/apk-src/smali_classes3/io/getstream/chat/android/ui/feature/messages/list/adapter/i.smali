.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;


# instance fields
.field public final synthetic w:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/i;->w:Lc93/a;

    return-void
.end method


# virtual methods
.method public final onAddPollCommentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/i;->w:Lc93/a;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->r(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    move-result p1

    return p1
.end method
