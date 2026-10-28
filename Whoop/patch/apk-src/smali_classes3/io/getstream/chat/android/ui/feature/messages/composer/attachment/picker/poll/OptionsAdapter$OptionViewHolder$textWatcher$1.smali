.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;Ljava/lang/Integer;Lc93/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ1\u0010\u000c\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1",
        "Landroid/text/TextWatcher;",
        "",
        "s",
        "",
        "start",
        "count",
        "after",
        "Ll83/a0;",
        "beforeTextChanged",
        "(Ljava/lang/CharSequence;III)V",
        "before",
        "onTextChanged",
        "Landroid/text/Editable;",
        "afterTextChanged",
        "(Landroid/text/Editable;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->access$getPollAnswer$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "pollAnswer"

    if-eqz v1, :cond_1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->access$updateErrorState(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->access$getOnOptionChange$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;)Lc93/m;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;

    invoke-static {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->access$getPollAnswer$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
