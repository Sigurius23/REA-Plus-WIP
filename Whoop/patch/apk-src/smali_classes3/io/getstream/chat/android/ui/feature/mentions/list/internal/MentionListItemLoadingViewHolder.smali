.class public final Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemLoadingViewHolder;
.super Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemLoadingViewHolder;",
        "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;",
        "Landroid/view/ViewGroup;",
        "parentView",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;)V",
        "item",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;)V",
        "Landroid/view/ViewGroup;",
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
.field private final parentView:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;)V
    .locals 1

    const-string v0, "parentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "getRoot(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    .line 6
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemLoadingViewHolder;->parentView:Landroid/view/ViewGroup;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x0

    .line 2
    invoke-static {p2, p1, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;

    move-result-object p2

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemLoadingViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;)V

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;)V
    .locals 1

    .line 1
    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic bind(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;)V
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemLoadingViewHolder;->bind(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;)V

    return-void
.end method
