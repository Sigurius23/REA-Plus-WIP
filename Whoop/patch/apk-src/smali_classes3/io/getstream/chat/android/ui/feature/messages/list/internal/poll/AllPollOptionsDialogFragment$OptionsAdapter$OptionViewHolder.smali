.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OptionViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;",
        "binding",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Option;",
        "Ll83/a0;",
        "onOptionClick",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;",
        "result",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;",
        "Lkotlin/jvm/functions/Function1;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;

.field private final onOptionClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onOptionClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->onOptionClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->onOptionClick:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final bind$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->onOptionClick:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;-><init>(Landroidx/recyclerview/widget/o2;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;->option:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Option;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;->votes:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->getVotes()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;->check:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;->check:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v1, "check"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->getReadonly()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
