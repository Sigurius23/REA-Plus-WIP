.class public final Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;",
        "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;",
        "<init>",
        "()V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;",
        "position",
        "getItemViewType",
        "(I)I",
        "holder",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;I)V",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;",
        "mentionSelectedListener",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;",
        "getMentionSelectedListener",
        "()Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;",
        "setMentionSelectedListener",
        "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "previewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "getPreviewStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "setPreviewStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V",
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
.field private mentionSelectedListener:Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;

.field private previewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    return-void
.end method


# virtual methods
.method public final getItemViewType(I)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final getMentionSelectedListener()Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;->mentionSelectedListener:Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;

    return-object v0
.end method

.method public final getPreviewStyle()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;->previewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-object v0
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;->bind(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;",
            ">;"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 2
    new-instance p2, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemLoadingViewHolder;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p2, p1, v1, v0, v1}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemLoadingViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown MentionList view type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_1
    new-instance v0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;

    .line 5
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;->previewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    .line 6
    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;->mentionSelectedListener:Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    .line 7
    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;-><init>(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final setMentionSelectedListener(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;->mentionSelectedListener:Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;

    return-void
.end method

.method public final setPreviewStyle(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;->previewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-void
.end method
