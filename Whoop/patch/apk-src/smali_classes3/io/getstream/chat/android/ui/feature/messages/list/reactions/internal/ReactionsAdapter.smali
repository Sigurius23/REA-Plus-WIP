.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0019\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;",
        "",
        "itemSize",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;",
        "reactionClickListener",
        "<init>",
        "(ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;",
        "holder",
        "position",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;I)V",
        "I",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;",
        "ReactionViewHolder",
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
.field private final itemSize:I

.field private final reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;


# direct methods
.method public constructor <init>(ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V
    .locals 1

    const-string v0, "reactionClickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItemDiffCallback;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;->itemSize:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

    return-void
.end method


# virtual methods
.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;

    move-result-object p1

    .line 3
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;->itemSize:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

    invoke-direct {p2, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    return-object p2
.end method
