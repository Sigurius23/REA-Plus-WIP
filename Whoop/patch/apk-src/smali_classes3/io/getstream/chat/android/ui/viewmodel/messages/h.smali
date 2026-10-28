.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/h;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->i(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->A(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->b(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Ljava/util/Set;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->n(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Ljava/util/Set;)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->g(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Channel;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
