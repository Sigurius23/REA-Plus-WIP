.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->G(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->F(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
