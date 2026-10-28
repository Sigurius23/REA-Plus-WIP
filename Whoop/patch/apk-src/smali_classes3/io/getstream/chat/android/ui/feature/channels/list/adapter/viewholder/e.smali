.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic E:Lkotlin/jvm/internal/b0;

.field public final synthetic F:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

.field public final synthetic w:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;

.field public final synthetic x:Lkotlin/jvm/internal/d0;

.field public final synthetic y:Lkotlin/jvm/internal/d0;

.field public final synthetic z:Lkotlin/jvm/internal/d0;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->w:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->x:Lkotlin/jvm/internal/d0;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->y:Lkotlin/jvm/internal/d0;

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->z:Lkotlin/jvm/internal/d0;

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->E:Lkotlin/jvm/internal/b0;

    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->F:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->E:Lkotlin/jvm/internal/b0;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->F:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->w:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->x:Lkotlin/jvm/internal/d0;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->y:Lkotlin/jvm/internal/d0;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;->z:Lkotlin/jvm/internal/d0;

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->a(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
