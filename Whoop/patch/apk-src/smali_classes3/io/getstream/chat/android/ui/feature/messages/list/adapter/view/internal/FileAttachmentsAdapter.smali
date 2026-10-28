.class final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;
.super Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter<",
        "Lio/getstream/chat/android/models/Attachment;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B-\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;",
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;",
        "Lio/getstream/chat/android/models/Attachment;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "attachmentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "attachmentLongClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;",
        "attachmentDownloadClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V",
        "",
        "position",
        "getItemViewType",
        "(I)I",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;",
        "holder",
        "Ll83/a0;",
        "onViewAttachedToWindow",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)V",
        "onViewDetachedFromWindow",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "onDetachedFromRecyclerView",
        "(Landroidx/recyclerview/widget/RecyclerView;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;",
        "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter$Companion;

.field private static final VIEW_TYPE_GENERAL:I = 0x2

.field private static final VIEW_TYPE_RECORDING:I = 0x1


# instance fields
.field private final attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

.field private final attachmentDownloadClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

.field private final attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentDownloadClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->onDetachedFromRecyclerView$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)Ll83/a0;

    return-void
.end method

.method private static final onDetachedFromRecyclerView$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;->clearScope()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final getItemViewType(I)I
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->getItemList()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x2

    return p1
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;
    .locals 8

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p1, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;

    move-result-object v3

    .line 3
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;

    .line 4
    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    .line 5
    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    .line 6
    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentDownloadClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

    .line 7
    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    .line 8
    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/RecordingFileAttachmentViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V

    return-object v2

    .line 9
    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p1, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

    move-result-object v3

    .line 10
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;

    .line 11
    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    .line 12
    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    .line 13
    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->attachmentDownloadClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;

    .line 14
    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    .line 15
    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V

    return-object v2
.end method

.method public final onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    invoke-static {p0, p1, v0}, Lio/getstream/chat/android/ui/common/extensions/internal/RecyclerViewKt;->doForAllViewHolders(Landroidx/recyclerview/widget/i1;Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public final bridge synthetic onViewAttachedToWindow(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->onViewAttachedToWindow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)V

    return-void
.end method

.method public final onViewAttachedToWindow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onViewAttachedToWindow(Landroidx/recyclerview/widget/o2;)V

    .line 3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;->restartJob()V

    return-void
.end method

.method public final bridge synthetic onViewDetachedFromWindow(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->onViewDetachedFromWindow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;->clearScope()V

    .line 3
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onViewDetachedFromWindow(Landroidx/recyclerview/widget/o2;)V

    return-void
.end method
