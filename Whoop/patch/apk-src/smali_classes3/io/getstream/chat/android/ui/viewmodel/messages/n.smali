.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/n;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    return-void
.end method


# virtual methods
.method public final onPollOptionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/n;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->H(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V

    const/4 p1, 0x1

    return p1
.end method
