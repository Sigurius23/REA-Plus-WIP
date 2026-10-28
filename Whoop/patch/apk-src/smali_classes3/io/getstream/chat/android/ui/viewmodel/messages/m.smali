.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/m;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    return-void
.end method


# virtual methods
.method public final onUnreadLabelReached()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/m;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->e(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V

    return-void
.end method
