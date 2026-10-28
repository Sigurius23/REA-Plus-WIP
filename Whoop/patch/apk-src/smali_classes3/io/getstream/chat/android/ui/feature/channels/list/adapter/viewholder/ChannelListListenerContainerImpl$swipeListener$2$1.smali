.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ3\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000bJ3\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;",
        "viewHolder",
        "",
        "adapterPosition",
        "",
        "x",
        "y",
        "Ll83/a0;",
        "onSwipeStarted",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V",
        "dX",
        "totalDeltaX",
        "onSwipeChanged",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;IFF)V",
        "onSwipeCompleted",
        "onSwipeCanceled",
        "onRestoreSwipePosition",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;I)V",
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
.field final synthetic $realListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1;->$realListener:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onRestoreSwipePosition(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;I)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1;->$realListener:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onRestoreSwipePosition(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;I)V

    return-void
.end method

.method public final onSwipeCanceled(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1;->$realListener:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeCanceled(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V

    return-void
.end method

.method public final onSwipeChanged(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;IFF)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1;->$realListener:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeChanged(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;IFF)V

    return-void
.end method

.method public final onSwipeCompleted(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1;->$realListener:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeCompleted(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V

    return-void
.end method

.method public final onSwipeStarted(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl$swipeListener$2$1;->$realListener:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeStarted(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V

    return-void
.end method
