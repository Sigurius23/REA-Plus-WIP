.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->D(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->B(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
