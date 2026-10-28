.class final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->populateAttachments(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentFragment$populateAttachments$1"
    f = "MediaAttachmentFragment.kt"
    l = {
        0xc6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $allowAddMore:Z

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;",
            "Z",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->$allowAddMore:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->$allowAddMore:Z

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;ZLq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->label:I

    const/4 v2, 0x0

    const-string v3, "progressBar"

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->access$getBinding(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;->progressBar:Landroid/widget/ProgressBar;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p1

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1$filteredAttachments$1;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-direct {v1, v6, v5}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1$filteredAttachments$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;Lq83/d;)V

    iput v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->label:I

    invoke-static {p1, v1, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->access$getBinding(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;->emptyPlaceholderTextView:Landroid/widget/TextView;

    const-string v0, "emptyPlaceholderTextView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->access$getStyle$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    move-result-object v1

    const-string v4, "style"

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getMediaAttachmentNoMediaTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {p1, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->access$getBinding(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;->emptyPlaceholderTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->access$getStyle$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getMediaAttachmentNoMediaText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->access$getBinding(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;->emptyPlaceholderTextView:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_5
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;-><init>(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->$allowAddMore:Z

    if-eqz p1, :cond_7

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$AddMoreItem;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$AddMoreItem;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->access$getMediaAttachmentsAdapter(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;

    move-result-object p1

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->setItems(Ljava/util/List;)V

    :goto_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment$populateAttachments$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->access$getBinding(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentMediaBinding;->progressBar:Landroid/widget/ProgressBar;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
