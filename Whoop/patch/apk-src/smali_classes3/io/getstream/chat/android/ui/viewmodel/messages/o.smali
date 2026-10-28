.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/o;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    return-void
.end method


# virtual methods
.method public final onPollCloseClick(Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/o;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->E(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Poll;)V

    const/4 p1, 0x1

    return p1
.end method
