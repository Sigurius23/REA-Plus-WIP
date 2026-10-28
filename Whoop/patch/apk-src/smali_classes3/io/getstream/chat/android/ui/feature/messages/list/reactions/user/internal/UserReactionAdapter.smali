.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;,
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionItemDiffCallback;,
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001c\u001d\u001eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R*\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@GX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;",
        "userReactionClickListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;",
        "holder",
        "position",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;I)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;",
        "value",
        "messageOptionsUserReactionAlignment",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;",
        "getMessageOptionsUserReactionAlignment",
        "()Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;",
        "setMessageOptionsUserReactionAlignment",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V",
        "UserReactionViewHolder",
        "UserReactionItemDiffCallback",
        "UserReactionClickListener",
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
.field private messageOptionsUserReactionAlignment:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

.field private final userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;)V
    .locals 1

    const-string v0, "userReactionClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionItemDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;

    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;->BY_USER:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->messageOptionsUserReactionAlignment:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    return-void
.end method


# virtual methods
.method public final getMessageOptionsUserReactionAlignment()Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->messageOptionsUserReactionAlignment:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    return-object v0
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

    move-result-object p1

    .line 3
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->messageOptionsUserReactionAlignment:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    invoke-direct {p2, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V

    return-object p2
.end method

.method public final setMessageOptionsUserReactionAlignment(Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->messageOptionsUserReactionAlignment:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method
