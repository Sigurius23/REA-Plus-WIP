.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/f;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/f;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    check-cast p1, Landroidx/lifecycle/w1;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;->g(Lio/getstream/chat/android/models/Poll;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/f;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;

    check-cast p1, Ln23/h;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->j(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;Ln23/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
