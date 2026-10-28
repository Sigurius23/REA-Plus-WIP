.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm/j;

.field public final synthetic c:Lec/a;


# direct methods
.method public synthetic constructor <init>(Lm/j;Lec/a;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;->b:Lm/j;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;->c:Lec/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;->c:Lec/a;

    check-cast v0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;->b:Lm/j;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;->z(Lm/j;Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Landroid/content/DialogInterface;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;->c:Lec/a;

    check-cast v0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;->b:Lm/j;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;->z(Lm/j;Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Landroid/content/DialogInterface;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
