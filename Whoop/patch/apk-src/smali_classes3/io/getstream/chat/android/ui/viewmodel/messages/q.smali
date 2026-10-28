.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageFlagHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$AttachmentDownloadHandler;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

.field public final synthetic x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachmentDownload(Lc93/a;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->B(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lc93/a;)V

    return-void
.end method

.method public onMessageFlag(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->D(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onScrollToBottom()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/q;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->m(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V

    return-void
.end method
