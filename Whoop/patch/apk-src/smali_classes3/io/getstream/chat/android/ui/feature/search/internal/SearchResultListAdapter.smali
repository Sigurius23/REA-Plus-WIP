.class public final Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0008\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J#\u0010\u000c\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;",
        "holder",
        "position",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;I)V",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;",
        "searchResultSelectedListener",
        "setSearchResultSelectedListener",
        "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;)V",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;",
        "MessagePreviewViewHolder",
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
.field private searchResultSelectedListener:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;

.field private final style:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/internal/MessageResultDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/internal/MessageResultDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;->style:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;

    return-void
.end method

.method public static final synthetic access$getSearchResultSelectedListener$p(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;)Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;->searchResultSelectedListener:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/common/model/MessageResult;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->bind$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/common/model/MessageResult;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;
    .locals 1

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    move-result-object p1

    .line 3
    new-instance p2, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;->style:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;

    invoke-direct {p2, p0, p1, v0}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;-><init>(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V

    return-object p2
.end method

.method public final setSearchResultSelectedListener(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;->searchResultSelectedListener:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;

    return-void
.end method
