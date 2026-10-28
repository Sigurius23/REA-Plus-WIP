.class public final Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u000f\u001a\u00020\u0007H\u0016J\u0008\u0010\u0010\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\t\"\u0004\u0008\u000e\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "verticalScrollEnabled",
        "",
        "getVerticalScrollEnabled",
        "()Z",
        "setVerticalScrollEnabled",
        "(Z)V",
        "horizontalScrollEnabled",
        "getHorizontalScrollEnabled",
        "setHorizontalScrollEnabled",
        "canScrollVertically",
        "canScrollHorizontally",
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
.field private horizontalScrollEnabled:Z

.field private verticalScrollEnabled:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->getOrientation()I

    move-result v0

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    move v0, p1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->verticalScrollEnabled:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->getOrientation()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->horizontalScrollEnabled:Z

    return-void
.end method


# virtual methods
.method public final canScrollHorizontally()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->horizontalScrollEnabled:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->canScrollHorizontally()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final canScrollVertically()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->verticalScrollEnabled:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->canScrollVertically()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getHorizontalScrollEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->horizontalScrollEnabled:Z

    return v0
.end method

.method public final getVerticalScrollEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->verticalScrollEnabled:Z

    return v0
.end method

.method public final setHorizontalScrollEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->horizontalScrollEnabled:Z

    return-void
.end method

.method public final setVerticalScrollEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->verticalScrollEnabled:Z

    return-void
.end method
