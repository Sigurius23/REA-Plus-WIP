.class public final Lpj/v;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic G:Landroid/content/Context;

.field public final synthetic H:Luj/m;

.field public final synthetic I:Lp1/c1;

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Landroid/graphics/Rect;

.field public final synthetic y:Lcom/amplitude/android/engagement/a;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lpj/v;->x:Landroid/graphics/Rect;

    iput-object p2, p0, Lpj/v;->y:Lcom/amplitude/android/engagement/a;

    iput-object p3, p0, Lpj/v;->z:Lp1/c1;

    iput-object p4, p0, Lpj/v;->E:Lp1/c1;

    iput-object p5, p0, Lpj/v;->F:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p6, p0, Lpj/v;->G:Landroid/content/Context;

    iput-object p7, p0, Lpj/v;->H:Luj/m;

    iput-object p8, p0, Lpj/v;->I:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10

    new-instance v0, Lpj/v;

    iget-object v7, p0, Lpj/v;->H:Luj/m;

    iget-object v8, p0, Lpj/v;->I:Lp1/c1;

    iget-object v1, p0, Lpj/v;->x:Landroid/graphics/Rect;

    iget-object v2, p0, Lpj/v;->y:Lcom/amplitude/android/engagement/a;

    iget-object v3, p0, Lpj/v;->z:Lp1/c1;

    iget-object v4, p0, Lpj/v;->E:Lp1/c1;

    iget-object v5, p0, Lpj/v;->F:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v6, p0, Lpj/v;->G:Landroid/content/Context;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lpj/v;-><init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;)V

    iput-object p1, v0, Lpj/v;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpj/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpj/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpj/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lpj/v;->w:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v0, p0, Lpj/v;->x:Landroid/graphics/Rect;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lpj/v;->y:Lcom/amplitude/android/engagement/a;

    iget-object v3, p0, Lpj/v;->E:Lp1/c1;

    const/4 v4, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lpj/v;->z:Lp1/c1;

    invoke-interface {v0, v4}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_0

    invoke-interface {v0, v4}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    new-instance v0, Ln20/j;

    iget-object v5, p0, Lpj/v;->F:Lcom/amplitude/android/engagement/types/Nudge;

    const/16 v6, 0xf

    invoke-direct {v0, v2, v5, v4, v6}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {p1, v4, v4, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    invoke-interface {v3, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_2

    invoke-interface {p1, v4}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    iget-object p1, v2, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    new-instance v2, Lc4/k;

    iget-object v7, p0, Lpj/v;->z:Lp1/c1;

    const/4 v8, 0x3

    iget-object v3, p0, Lpj/v;->G:Landroid/content/Context;

    iget-object v4, p0, Lpj/v;->H:Luj/m;

    iget-object v5, p0, Lpj/v;->x:Landroid/graphics/Rect;

    iget-object v6, p0, Lpj/v;->I:Lp1/c1;

    invoke-direct/range {v2 .. v8}, Lc4/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    iget-object v4, p1, Lij/m;->c:Landroid/os/HandlerThread;

    invoke-virtual {v4}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2, v0}, Lc4/k;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_4
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object p1, p1, Lij/m;->d:Landroid/os/Handler;

    new-instance v4, Landroidx/fragment/app/d;

    const/16 v5, 0xa

    invoke-direct {v4, v2, v0, v3, v5}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Exception;

    if-nez p1, :cond_5

    :goto_0
    return-object v1

    :cond_5
    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    move-object p1, v0

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v2, "Interrupted while waiting for evaluation"

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    return-object v1
.end method
