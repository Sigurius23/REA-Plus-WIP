.class final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->setupResultListener()V
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
    c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.FileAttachmentFragment$setupResultListener$1$1"
    f = "FileAttachmentFragment.kt"
    l = {
        0xe5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $uris:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;


# direct methods
.method public constructor <init>(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->$uris:Ljava/util/List;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

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

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->$uris:Ljava/util/List;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;-><init>(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p1

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1$filteredAttachments$1;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->$uris:Ljava/util/List;

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1$filteredAttachments$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/List;Lq83/d;)V

    iput v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->label:I

    invoke-static {p1, v1, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->$uris:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_file_not_supported:I

    invoke-virtual {v1, v2}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->access$getAttachmentsPickerTabListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsChanged(Ljava/util/List;)V

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment$setupResultListener$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->access$getAttachmentsPickerTabListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;->onSelectedAttachmentsSubmitted()V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
