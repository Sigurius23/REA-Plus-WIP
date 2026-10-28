.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00085\u00106\u00a8\u00067"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachments",
        "setAttachments",
        "(Ljava/util/List;)V",
        "onDetachedFromWindow",
        "()V",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "attachmentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "getAttachmentClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "setAttachmentClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "attachmentLongClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "getAttachmentLongClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "setAttachmentLongClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;",
        "attachmentDownloadClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;",
        "getAttachmentDownloadClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;",
        "setAttachmentDownloadClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;",
        "fileAttachmentsAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;",
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
.field private attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

.field private attachmentDownloadClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

.field private attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

.field private fileAttachmentsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;

.field private final logger$delegate:Ll83/h;

.field private style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    const-string p1, "FileAttachmentListView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->logger$delegate:Ll83/h;

    .line 6
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    const/4 p3, 0x1

    .line 7
    invoke-direct {p1, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    .line 9
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/VerticalSpaceItemDecorator;

    const/4 p3, 0x4

    invoke-static {p3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p3

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/VerticalSpaceItemDecorator;-><init>(I)V

    const/4 p3, -0x1

    .line 10
    invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/q1;I)V

    .line 11
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    return-void
.end method


# virtual methods
.method public final getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    return-object v0
.end method

.method public final getAttachmentDownloadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentDownloadClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

    return-object v0
.end method

.method public final getAttachmentLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/i1;->onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_0
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->onDetachedFromWindow()V

    return-void
.end method

.method public final setAttachmentClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    return-void
.end method

.method public final setAttachmentDownloadClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentDownloadClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

    return-void
.end method

.method public final setAttachmentLongClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    return-void
.end method

.method public final setAttachments(Ljava/util/List;)V
    .locals 6
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

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[setAttachments] attachments: "

    invoke-static {v1, p1}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->fileAttachmentsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;

    if-nez v0, :cond_5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    if-eqz v0, :cond_1

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView$setAttachments$2$1;

    invoke-direct {v1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView$setAttachments$2$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    if-eqz v0, :cond_2

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView$setAttachments$3$1;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView$setAttachments$3$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V

    goto :goto_1

    :cond_2
    move-object v2, v4

    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->attachmentDownloadClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

    if-eqz v0, :cond_3

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView$setAttachments$4$1;

    invoke-direct {v3, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView$setAttachments$4$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;)V

    goto :goto_2

    :cond_3
    move-object v3, v4

    :goto_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    if-eqz v0, :cond_4

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;

    invoke-direct {v5, v1, v2, v3, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V

    iput-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->fileAttachmentsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;

    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    goto :goto_3

    :cond_4
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-string v5, "[setAttachments] filteredAttachments.size: "

    invoke-static {v1, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->fileAttachmentsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;

    if-eqz p1, :cond_9

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->setItems(Ljava/util/List;)V

    return-void

    :cond_9
    const-string p1, "fileAttachmentsAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method
