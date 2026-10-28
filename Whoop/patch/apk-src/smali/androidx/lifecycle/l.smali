.class public final Landroidx/lifecycle/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/e0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/l;->w:I

    const-string v0, "defaultLifecycleObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/lifecycle/l;->x:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Landroidx/lifecycle/l;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/x;Lpb/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/lifecycle/l;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/lifecycle/l;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/l;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 3

    iget v0, p0, Landroidx/lifecycle/l;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/l;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/x;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object p1, p0, Landroidx/lifecycle/l;->y:Ljava/lang/Object;

    check-cast p1, Lpb/d;

    invoke-virtual {p1}, Lpb/d;->d()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/l;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/DefaultLifecycleObserver;

    const-string v1, "source"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "event"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroidx/lifecycle/k;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ON_ANY must not been send by anybody"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    goto :goto_0

    :pswitch_3
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    goto :goto_0

    :pswitch_4
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    goto :goto_0

    :pswitch_5
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    goto :goto_0

    :pswitch_6
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    goto :goto_0

    :pswitch_7
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Landroidx/lifecycle/g0;)V

    :goto_0
    iget-object v0, p0, Landroidx/lifecycle/l;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/e0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/e0;->h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
