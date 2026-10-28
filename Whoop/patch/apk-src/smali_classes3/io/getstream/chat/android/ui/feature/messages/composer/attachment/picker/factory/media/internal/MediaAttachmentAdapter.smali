.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;,
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010!\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 /2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u000301/B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\u00072\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0 \u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010\'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\'\u0010&J\r\u0010(\u001a\u00020\u0007\u00a2\u0006\u0004\u0008(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010*R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010+R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010,R\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010.\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;",
        "Landroidx/recyclerview/widget/i1;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "style",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "Ll83/a0;",
        "onAttachmentSelected",
        "Lkotlin/Function0;",
        "onAddMoreClick",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lkotlin/jvm/functions/Function1;Lc93/a;)V",
        "attachment",
        "",
        "isSelected",
        "toggleAttachmentSelection",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V",
        "",
        "position",
        "getItemViewType",
        "(I)I",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;",
        "holder",
        "onBindViewHolder",
        "(Landroidx/recyclerview/widget/o2;I)V",
        "getItemCount",
        "()I",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;",
        "attachments",
        "setItems",
        "(Ljava/util/List;)V",
        "selectAttachment",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V",
        "deselectAttachment",
        "clearAttachments",
        "()V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "Lkotlin/jvm/functions/Function1;",
        "Lc93/a;",
        "",
        "Ljava/util/List;",
        "Companion",
        "AddMoreViewHolder",
        "MediaAttachmentViewHolder",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$Companion;

.field private static final VIEW_TYPE_ADD_MORE:I = 0x0

.field private static final VIEW_TYPE_MEDIA_ATTACHMENT:I = 0x1


# instance fields
.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;",
            ">;"
        }
    .end annotation
.end field

.field private final onAddMoreClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
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
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAttachmentSelected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddMoreClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->onAttachmentSelected:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->onAddMoreClick:Lc93/a;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    return-void
.end method

.method private final toggleAttachmentSelection(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;

    instance-of v4, v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;

    if-eqz v4, :cond_0

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;->getAttachment()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_1
    if-eq v1, v3, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentListItem.MediaAttachmentItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;->getAttachment()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    move-result-object p1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSelected(Z)V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/i1;->notifyItemChanged(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final clearAttachments()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method

.method public final deselectAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->toggleAttachmentSelection(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V

    return-void
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$AddMoreItem;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;

    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;

    if-eqz v0, :cond_0

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;->getAttachment()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->bind(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    :cond_0
    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p1, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->onAttachmentSelected:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-direct {p2, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V

    return-object p2

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p1, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->onAddMoreClick:Lc93/a;

    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;Lc93/a;)V

    return-object p2
.end method

.method public final selectAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->toggleAttachmentSelection(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V

    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;->attachments:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method
