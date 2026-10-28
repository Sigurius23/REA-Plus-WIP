.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;
.super Lm/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000c\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;",
        "Lm/d0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/app/Dialog;",
        "onCreateDialog",
        "(Landroid/os/Bundle;)Landroid/app/Dialog;",
        "",
        "getPollId",
        "()Ljava/lang/String;",
        "pollId",
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
.field private static final ARG_POLL_ID:Ljava/lang/String; = "arg_poll_id"

.field public static final BUNDLE_KEY_OPTION_TEXT:Ljava/lang/String; = "stream_ui_suggest_poll_option_text"

.field public static final BUNDLE_KEY_POLL_ID:Ljava/lang/String; = "stream_ui_suggest_poll_option_poll_id"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment$Companion;

.field public static final REQUEST_KEY:Ljava/lang/String; = "stream_ui_suggest_poll_option_request"

.field public static final TAG:Ljava/lang/String; = "SuggestPollOptionDialogFragment"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/d0;-><init>()V

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;->onCreateDialog$lambda$1(Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private final getPollId()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "arg_poll_id"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Poll ID not found in arguments"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final onCreateDialog$lambda$1(Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;->optionInput:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p2

    invoke-direct {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;->getPollId()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ll83/k;

    const-string v0, "stream_ui_suggest_poll_option_poll_id"

    invoke-direct {p3, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v0, "stream_ui_suggest_poll_option_text"

    invoke-direct {p1, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p3, p1}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "stream_ui_suggest_poll_option_request"

    invoke-virtual {p2, p0, p1}, Landroidx/fragment/app/o1;->f0(Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private static final onCreateDialog$lambda$3(Lm/j;Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Landroid/content/DialogInterface;)V
    .locals 3

    iget-object p2, p0, Lm/j;->F:Lm/h;

    iget-object p2, p2, Lm/h;->i:Landroid/widget/Button;

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;->optionInput:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {p2, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;->optionInput:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v1, "optionInput"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment$onCreateDialog$lambda$3$$inlined$doAfterTextChanged$1;

    invoke-direct {v1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment$onCreateDialog$lambda$3$$inlined$doAfterTextChanged$1;-><init>(Landroid/widget/Button;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;->optionInput:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p1, 0x5

    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_1
    return-void
.end method

.method public static synthetic z(Lm/j;Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;->onCreateDialog$lambda$3(Lm/j;Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "requireContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;

    move-result-object p1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getOptionTextLimit()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;->optionInput:Landroidx/appcompat/widget/AppCompatEditText;

    new-instance v4, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v4, v1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    filled-new-array {v4}, [Landroid/text/InputFilter$LengthFilter;

    move-result-object v1

    check-cast v1, [Landroid/text/InputFilter;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    :cond_0
    new-instance v1, Lm/i;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lm/i;-><init>(Landroid/content/Context;)V

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_suggest_option_dialog_title:I

    invoke-virtual {v1, v0}, Lm/i;->b(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v1, v0}, Lm/i;->setView(Landroid/view/View;)Lm/i;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_suggest_option_dialog_submit:I

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/h;

    invoke-direct {v3, p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/h;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiDialogSuggestPollOptionBinding;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/SuggestPollOptionDialogFragment;)V

    invoke-virtual {v0, v1, v3}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_suggest_option_dialog_cancel:I

    invoke-virtual {v0, v1, v2}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object v0

    invoke-virtual {v0}, Lm/i;->create()Lm/j;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/b;-><init>(Lm/j;Lec/a;I)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-object v0
.end method
