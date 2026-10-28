.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OptionViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0008\u0004*\u0001\u0017\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/ViewGroup;",
        "parent",
        "Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;",
        "binding",
        "",
        "optionTextLimit",
        "Lkotlin/Function2;",
        "",
        "Ll83/a0;",
        "onOptionChange",
        "<init>",
        "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;Ljava/lang/Integer;Lc93/m;)V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;",
        "updateErrorState",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V",
        "pollAnswer",
        "bind",
        "Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;",
        "Ljava/lang/Integer;",
        "Lc93/m;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;",
        "io/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1",
        "textWatcher",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;",
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


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

.field private final onOptionChange:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final optionTextLimit:Ljava/lang/Integer;

.field private pollAnswer:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

.field private final textWatcher:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;Ljava/lang/Integer;Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;",
            "Ljava/lang/Integer;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onOptionChange"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->optionTextLimit:Ljava/lang/Integer;

    .line 7
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->onOptionChange:Lc93/m;

    if-eqz p3, :cond_0

    .line 8
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 9
    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->option:Landroidx/appcompat/widget/AppCompatEditText;

    new-instance p3, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {p3, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    filled-new-array {p3}, [Landroid/text/InputFilter$LengthFilter;

    move-result-object p1

    check-cast p1, [Landroid/text/InputFilter;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 10
    :cond_0
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->textWatcher:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;Ljava/lang/Integer;Lc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p5, 0x0

    .line 2
    invoke-static {p2, p1, p5}, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

    move-result-object p2

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;Ljava/lang/Integer;Lc93/m;)V

    return-void
.end method

.method public static final synthetic access$getOnOptionChange$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;)Lc93/m;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->onOptionChange:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$getPollAnswer$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->pollAnswer:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    return-object p0
.end method

.method public static final synthetic access$updateErrorState(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->updateErrorState(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V

    return-void
.end method

.method private final updateErrorState(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->option:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getDuplicateError()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_this_is_already_an_option:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V
    .locals 2

    const-string v0, "pollAnswer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->pollAnswer:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->option:Landroidx/appcompat/widget/AppCompatEditText;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->textWatcher:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->option:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->option:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->updateErrorState(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;->option:Landroidx/appcompat/widget/AppCompatEditText;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->textWatcher:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method
