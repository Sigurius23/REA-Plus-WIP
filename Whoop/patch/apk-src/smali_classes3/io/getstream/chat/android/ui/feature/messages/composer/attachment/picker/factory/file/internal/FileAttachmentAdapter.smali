.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00072\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010#R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010$R\u001c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;",
        "Landroidx/recyclerview/widget/i1;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "style",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "Ll83/a0;",
        "onAttachmentSelected",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lkotlin/jvm/functions/Function1;)V",
        "attachment",
        "",
        "isSelected",
        "toggleSelection",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V",
        "holder",
        "",
        "position",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;I)V",
        "getItemCount",
        "()I",
        "selectAttachment",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V",
        "deselectAttachment",
        "",
        "attachments",
        "setAttachments",
        "(Ljava/util/List;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "Lkotlin/jvm/functions/Function1;",
        "Ljava/util/List;",
        "FileAttachmentViewHolder",
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
.field private attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation
.end field

.field private final onAttachmentSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAttachmentSelected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->onAttachmentSelected:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    return-void
.end method

.method private final toggleSelection(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_8

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSelected(Z)V

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p1, 0x0

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSelectedPosition(I)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/i1;->notifyItemChanged(I)V

    return-void

    :cond_4
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getSelectedPosition()I

    move-result p2

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSelectedPosition(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getSelectedPosition()I

    move-result v2

    if-le v2, p2, :cond_5

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getSelectedPosition()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSelectedPosition(I)V

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    :cond_8
    return-void
.end method


# virtual methods
.method public final deselectAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->toggleSelection(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V

    return-void
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;->bind(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentFileBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentFileBinding;

    move-result-object p1

    .line 3
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->onAttachmentSelected:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-direct {p2, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentFileBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V

    return-object p2
.end method

.method public final selectAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->toggleSelection(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V

    return-void
.end method

.method public final setAttachments(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method
