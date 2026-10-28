.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;


# instance fields
.field public final synthetic a:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/n;->a:Lc93/a;

    return-void
.end method


# virtual methods
.method public final onUnreadLabelReached()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/n;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;->onUnreadLabelReached()V

    return-void
.end method
