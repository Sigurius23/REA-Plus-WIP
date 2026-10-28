.class final Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;
.super Landroidx/recyclerview/widget/z1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "EndReachedScrollListener"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;",
        "Landroidx/recyclerview/widget/z1;",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;)V",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "newState",
        "Ll83/a0;",
        "onScrollStateChanged",
        "(Landroidx/recyclerview/widget/RecyclerView;I)V",
        "",
        "enabled",
        "setPaginationEnabled",
        "(Z)V",
        "Z",
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
.field private enabled:Z

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;->this$0:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;->this$0:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;->this$0:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->access$requireAdapter(Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/z0;->getItemCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p1, p2, :cond_3

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;->enabled:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;->this$0:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->access$getEndReachedListener$p(Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;->onEndReached()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final setPaginationEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;->enabled:Z

    return-void
.end method
