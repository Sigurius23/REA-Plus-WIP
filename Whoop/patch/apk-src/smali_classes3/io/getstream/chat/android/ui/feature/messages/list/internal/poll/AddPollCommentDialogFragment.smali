.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;
.super Lm/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;",
        "Lm/d0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/app/Dialog;",
        "onCreateDialog",
        "(Landroid/os/Bundle;)Landroid/app/Dialog;",
        "Companion",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ARG_INITIAL_TEXT:Ljava/lang/String; = "arg_initial_text"

.field private static final ARG_MESSAGE_ID:Ljava/lang/String; = "arg_message_id"

.field private static final ARG_POLL_ID:Ljava/lang/String; = "arg_poll_id"

.field public static final BUNDLE_KEY_ANSWER:Ljava/lang/String; = "stream_ui_add_poll_comment_answer"

.field public static final BUNDLE_KEY_MESSAGE_ID:Ljava/lang/String; = "stream_ui_add_poll_comment_message_id"

.field public static final BUNDLE_KEY_POLL_ID:Ljava/lang/String; = "stream_ui_add_poll_comment_poll_id"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;

.field public static final REQUEST_KEY:Ljava/lang/String; = "stream_ui_add_poll_comment_request"

.field public static final TAG:Ljava/lang/String; = "AddPollCommentDialogFragment"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/d0;-><init>()V

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;->onCreateDialog$lambda$0(Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private static final onCreateDialog$lambda$0(Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;->answerInput:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-lez p4, :cond_2

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    new-instance p4, Ll83/k;

    const-string p5, "stream_ui_add_poll_comment_message_id"

    invoke-direct {p4, p5, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string p5, "stream_ui_add_poll_comment_poll_id"

    invoke-direct {p2, p5, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p3, Ll83/k;

    const-string p5, "stream_ui_add_poll_comment_answer"

    invoke-direct {p3, p5, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p4, p2, p3}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p0

    const-string p2, "stream_ui_add_poll_comment_request"

    invoke-virtual {p1, p0, p2}, Landroidx/fragment/app/o1;->f0(Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private static final onCreateDialog$lambda$2(Lm/j;Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Landroid/content/DialogInterface;)V
    .locals 2

    iget-object p2, p0, Lm/j;->F:Lm/h;

    iget-object p2, p2, Lm/h;->i:Landroid/widget/Button;

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;->answerInput:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {p2, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;->answerInput:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v1, "answerInput"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$onCreateDialog$lambda$2$$inlined$doAfterTextChanged$1;

    invoke-direct {v1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$onCreateDialog$lambda$2$$inlined$doAfterTextChanged$1;-><init>(Landroid/widget/Button;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;->answerInput:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p1, 0x5

    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_1
    return-void
.end method

.method public static synthetic z(Lm/j;Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;->onCreateDialog$lambda$2(Lm/j;Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 7

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "requireArguments(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "arg_message_id"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "arg_poll_id"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v3, "arg_initial_text"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "requireContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v6, v5}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;

    move-result-object v3

    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, v3, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;->answerInput:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, v3, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;->answerInput:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {p1, v5}, Landroid/widget/EditText;->setSelection(I)V

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    sget p1, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_update_comment_label:I

    goto :goto_2

    :cond_3
    :goto_1
    sget p1, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_add_a_comment_label:I

    :goto_2
    new-instance v0, Lm/i;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v0, v4}, Lm/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lm/i;->b(I)V

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm/i;->setView(Landroid/view/View;)Lm/i;

    move-result-object p1

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_add_comment_dialog_submit:I

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;

    invoke-direct {v4, v3, p0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/a;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiDialogAddPollCommentBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v4}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_add_comment_dialog_cancel:I

    invoke-virtual {p1, v0, v6}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    invoke-virtual {p1}, Lm/i;->create()Lm/j;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;-><init>(Lm/j;Lec/a;I)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Poll ID not found in arguments"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Message ID not found in arguments"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
