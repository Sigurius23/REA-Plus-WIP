.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;->w:Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;->y:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;->y:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;->z:Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;->w:Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;->A(Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method
