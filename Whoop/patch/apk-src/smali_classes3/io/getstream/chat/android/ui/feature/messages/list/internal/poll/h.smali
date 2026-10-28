.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/h;->w:Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/h;->w:Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/h;->x:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;

    invoke-static {v0, v1, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;->A(Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method
