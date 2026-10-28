.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->B(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel$Factory;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->A(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;)Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
