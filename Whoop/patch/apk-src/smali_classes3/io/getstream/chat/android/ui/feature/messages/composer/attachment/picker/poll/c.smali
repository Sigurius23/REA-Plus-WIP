.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->z(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->I(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
