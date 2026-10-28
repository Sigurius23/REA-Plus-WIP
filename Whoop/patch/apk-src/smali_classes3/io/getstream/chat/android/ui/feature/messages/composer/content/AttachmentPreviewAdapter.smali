.class final Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/i1;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010!\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u00020\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000eH\u0017\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010#R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010$R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\t0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;",
        "Landroidx/recyclerview/widget/i1;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;",
        "factoryManager",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "style",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Attachment;",
        "Ll83/a0;",
        "attachmentRemovalListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V",
        "",
        "attachments",
        "setAttachments",
        "(Ljava/util/List;)V",
        "Landroid/view/ViewGroup;",
        "parentView",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;",
        "holder",
        "position",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;I)V",
        "getItemViewType",
        "(I)I",
        "getItemCount",
        "()I",
        "onViewDetachedFromWindow",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;)V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "Lkotlin/jvm/functions/Function1;",
        "",
        "Ljava/util/List;",
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
.field private final attachmentRemovalListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private final factoryManager:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;",
            "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "factoryManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentRemovalListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->factoryManager:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->attachments:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItemViewType(I)I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->factoryManager:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->attachments:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;->getItemViewType(Lio/getstream/chat/android/models/Attachment;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;->bind(Lio/getstream/chat/android/models/Attachment;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;
    .locals 3

    const-string v0, "parentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->factoryManager:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

    .line 3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    .line 4
    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    .line 5
    invoke-virtual {v0, p1, p2, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;->onCreateViewHolder(Landroid/view/ViewGroup;ILkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic onViewDetachedFromWindow(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->onViewDetachedFromWindow(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onViewDetachedFromWindow(Landroidx/recyclerview/widget/o2;)V

    .line 3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;->unbind()V

    return-void
.end method

.method public final setAttachments(Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->attachments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;->attachments:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method
