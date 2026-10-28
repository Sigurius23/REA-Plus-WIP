.class public final Lbd3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lll/a;
.implements Lmd3/e;
.implements Lmd3/c;
.implements Lmd3/d;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IB)V
    .locals 0

    iput p1, p0, Lbd3/v;->w:I

    packed-switch p1, :pswitch_data_0

    .line 12
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    .line 13
    iput p1, p0, Lbd3/v;->x:I

    const/4 p1, 0x0

    .line 14
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    return-void

    .line 15
    :pswitch_1
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    const/16 p1, 0x64

    .line 18
    iput p1, p0, Lbd3/v;->x:I

    return-void

    .line 19
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    return-void

    .line 21
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x100

    .line 22
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    return-void

    .line 23
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0xff

    .line 24
    iput p1, p0, Lbd3/v;->x:I

    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(IC)V
    .locals 0

    .line 1
    iput p1, p0, Lbd3/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    iput p2, p0, Lbd3/v;->w:I

    packed-switch p2, :pswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Lbd3/v;->y:Ljava/lang/Object;

    .line 5
    iput p1, p0, Lbd3/v;->x:I

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput p1, p0, Lbd3/v;->x:I

    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lbd3/v;->w:I

    const/4 p2, 0x0

    iput p2, p0, Lbd3/v;->x:I

    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lbd3/v;->w:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu1/o;I)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lbd3/v;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    iput p2, p0, Lbd3/v;->x:I

    return-void
.end method


# virtual methods
.method public a(Lj43/a;Ls83/c;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    instance-of v1, p2, Lnk/j;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lnk/j;

    iget v2, v1, Lnk/j;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lnk/j;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lnk/j;

    invoke-direct {v1, p0, p2}, Lnk/j;-><init>(Lbd3/v;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lnk/j;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lnk/j;->E:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lnk/j;->x:Lj43/a;

    iget-object v0, v1, Lnk/j;->w:Lbd3/v;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    iget v3, p0, Lbd3/v;->x:I

    if-ge p2, v3, :cond_4

    const/16 p2, 0x3e8

    int-to-double v6, p2

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    int-to-double v8, p2

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    mul-double/2addr v8, v6

    double-to-long v6, v8

    iput-object p0, v1, Lnk/j;->w:Lbd3/v;

    iput-object p1, v1, Lnk/j;->x:Lj43/a;

    iput v5, v1, Lnk/j;->E:I

    invoke-static {v6, v7, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_3

    return-object v2

    :cond_3
    move-object v0, p0

    :goto_1
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-object v4

    :cond_4
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4
.end method

.method public b()V
    .locals 1

    const v0, -0xf4240

    iput v0, p0, Lbd3/v;->x:I

    iget-object v0, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Lno/nordicsemi/android/ble/k0;

    iget-object v0, v0, Lno/nordicsemi/android/ble/k0;->c:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    iput p2, p0, Lbd3/v;->x:I

    iget-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast p1, Lno/nordicsemi/android/ble/k0;

    iget-object p1, p1, Lno/nordicsemi/android/ble/k0;->c:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    iget-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast p1, Lno/nordicsemi/android/ble/k0;

    iget-object p1, p1, Lno/nordicsemi/android/ble/k0;->c:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public e()V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lbd3/v;->x:I

    iget-object v1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x1

    if-gt v3, v4, :cond_2

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkh/f;

    if-eqz v2, :cond_1

    iget-object v2, v2, Lkh/f;->b:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v0

    move v5, v4

    :goto_2
    if-ge v4, v3, :cond_4

    sub-int v6, v4, v5

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkh/f;

    iget-object v7, v7, Lkh/f;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_3

    invoke-interface {v2, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_5
    return-void
.end method

.method public f(II)V
    .locals 2

    add-int/2addr p2, p1

    iget-object v0, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, [C

    array-length v1, v0

    if-gt v1, p2, :cond_1

    mul-int/lit8 p1, p1, 0x2

    if-ge p2, p1, :cond_0

    move p2, p1

    :cond_0
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object p1

    const-string p2, "copyOf(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public declared-synchronized g(Lkh/a;)Lkh/b;
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkh/f;

    iget-object v4, v3, Lkh/f;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Bitmap;

    if-eqz v4, :cond_1

    new-instance v5, Lkh/b;

    iget-object v3, v3, Lkh/f;->c:Ljava/util/Map;

    invoke-direct {v5, v4, v3}, Lkh/b;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    move-object v5, v0

    :goto_1
    if-eqz v5, :cond_2

    move-object v0, v5

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    iget p1, p0, Lbd3/v;->x:I

    add-int/lit8 v1, p1, 0x1

    iput v1, p0, Lbd3/v;->x:I

    const/16 v1, 0xa

    if-lt p1, v1, :cond_4

    invoke-virtual {p0}, Lbd3/v;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    monitor-exit p0

    return-object v0

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Ldj/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i(ILne3/d;)V
    .locals 8

    :goto_0
    shr-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_0

    iget-object v1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [Lne3/d;

    aget-object v1, v1, v0

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v2, v1, Lne3/d;->g:J

    iget-wide v4, p2, Lne3/d;->g:J

    const-wide/16 v6, 0x0

    sub-long/2addr v4, v2

    invoke-static {v6, v7, v4, v5}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v2

    if-lez v2, :cond_0

    iput p1, v1, Lne3/d;->f:I

    iget-object v2, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v2, [Lne3/d;

    aput-object v1, v2, p1

    move p1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, [Lne3/d;

    aput-object p2, v0, p1

    iput p1, p2, Lne3/d;->f:I

    return-void
.end method

.method public j(Ljava/util/Map;Lio/sentry/v0;)Ljava/util/HashMap;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p2, v3}, Lbd3/v;->m(Lio/sentry/v0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public k(Lf4/b;)V
    .locals 3

    iget v0, p0, Lbd3/v;->x:I

    iget-object v1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aput-object p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbd3/v;->x:I

    :cond_0
    return-void
.end method

.method public l(Lne3/d;)V
    .locals 9

    iget v0, p1, Lne3/d;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    iget v2, p0, Lbd3/v;->x:I

    iget-object v3, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v3, [Lne3/d;

    aget-object v3, v3, v2

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput v1, p1, Lne3/d;->f:I

    iget-object v1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [Lne3/d;

    const/4 v4, 0x0

    aput-object v4, v1, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lbd3/v;->x:I

    if-ne p1, v3, :cond_0

    return-void

    :cond_0
    iget-wide v1, p1, Lne3/d;->g:J

    iget-wide v4, v3, Lne3/d;->g:J

    sub-long/2addr v4, v1

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v4, v5}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast p1, [Lne3/d;

    aput-object v3, p1, v0

    iput v0, v3, Lne3/d;->f:I

    return-void

    :cond_1
    if-gez p1, :cond_5

    :goto_0
    shl-int/lit8 p1, v0, 0x1

    add-int/lit8 v4, p1, 0x1

    iget v5, p0, Lbd3/v;->x:I

    if-gt v4, v5, :cond_3

    iget-object v5, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v5, [Lne3/d;

    aget-object p1, v5, p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v5, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v5, [Lne3/d;

    aget-object v4, v5, v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v5, p1, Lne3/d;->g:J

    iget-wide v7, v4, Lne3/d;->g:J

    sub-long/2addr v7, v5

    invoke-static {v1, v2, v7, v8}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v5

    if-gez v5, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v4

    goto :goto_1

    :cond_3
    if-gt p1, v5, :cond_4

    iget-object v4, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v4, [Lne3/d;

    aget-object p1, v4, p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_1
    iget-wide v4, v3, Lne3/d;->g:J

    iget-wide v6, p1, Lne3/d;->g:J

    sub-long/2addr v6, v4

    invoke-static {v1, v2, v6, v7}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v4

    if-lez v4, :cond_4

    iget v4, p1, Lne3/d;->f:I

    iput v0, p1, Lne3/d;->f:I

    iget-object v5, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v5, [Lne3/d;

    aput-object p1, v5, v0

    move v0, v4

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast p1, [Lne3/d;

    aput-object v3, p1, v0

    iput v0, v3, Lne3/d;->f:I

    return-void

    :cond_5
    invoke-virtual {p0, v0, v3}, Lbd3/v;->i(ILne3/d;)V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Lio/sentry/v0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez p2, :cond_0

    return-object v1

    :cond_0
    instance-of v2, p2, Ljava/lang/Character;

    if-eqz v2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v2, p2, Ljava/lang/Number;

    if-eqz v2, :cond_2

    return-object p2

    :cond_2
    instance-of v2, p2, Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    return-object p2

    :cond_3
    instance-of v2, p2, Ljava/lang/String;

    if-eqz v2, :cond_4

    return-object p2

    :cond_4
    instance-of v2, p2, Ljava/util/Locale;

    if-eqz v2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of v2, p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget-object p1, Lio/sentry/util/d;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v3, p1, :cond_6

    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    return-object v0

    :cond_7
    instance-of v2, p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v2, :cond_8

    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v2, p2, Ljava/net/URI;

    if-eqz v2, :cond_9

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of v2, p2, Ljava/net/InetAddress;

    if-eqz v2, :cond_a

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of v2, p2, Ljava/util/UUID;

    if-eqz v2, :cond_b

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of v2, p2, Ljava/util/Currency;

    if-eqz v2, :cond_c

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_c
    instance-of v2, p2, Ljava/util/Calendar;

    if-eqz v2, :cond_d

    check-cast p2, Ljava/util/Calendar;

    invoke-static {p2}, Lio/sentry/util/d;->a(Ljava/util/Calendar;)Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_d
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_e
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Cyclic reference detected. Calling toString() on object."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_f
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v2

    iget v4, p0, Lbd3/v;->x:I

    if-le v2, v4, :cond_10

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Max depth exceeded. Calling toString() on object."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_10
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-eqz v2, :cond_11

    move-object v2, p2

    check-cast v2, [Ljava/lang/Object;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    array-length v5, v2

    :goto_1
    if-ge v3, v5, :cond_14

    aget-object v6, v2, v3

    invoke-virtual {p0, p1, v6}, Lbd3/v;->m(Lio/sentry/v0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_0
    move-exception v2

    goto :goto_4

    :cond_11
    instance-of v2, p2, Ljava/util/Collection;

    if-eqz v2, :cond_12

    move-object v2, p2

    check-cast v2, Ljava/util/Collection;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, p1, v3}, Lbd3/v;->m(Lio/sentry/v0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_12
    instance-of v2, p2, Ljava/util/Map;

    if-eqz v2, :cond_13

    move-object v2, p2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {p0, v2, p1}, Lbd3/v;->j(Ljava/util/Map;Lio/sentry/v0;)Ljava/util/HashMap;

    move-result-object v4

    goto :goto_3

    :cond_13
    invoke-virtual {p0, p1, p2}, Lbd3/v;->n(Lio/sentry/v0;Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_14
    :goto_3
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object v4

    :goto_4
    :try_start_1
    sget-object v3, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "Not serializing object due to throwing sub-path."

    invoke-interface {p1, v3, v4, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object v1

    :goto_5
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    throw p1
.end method

.method public n(Lio/sentry/v0;Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 9

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v0, v4

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v6

    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v6

    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    :try_start_0
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, p1, v7}, Lbd3/v;->m(Lio/sentry/v0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    sget-object v5, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v7, "Cannot access field "

    const-string v8, "."

    invoke-static {v7, v6, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v7, v3, [Ljava/lang/Object;

    invoke-interface {p1, v5, v6, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public declared-synchronized o(Lkh/a;Landroid/graphics/Bitmap;Ljava/util/Map;I)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    check-cast v1, Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    new-instance v0, Lkh/f;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v2, p3, p4}, Lkh/f;-><init>(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result p3

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p3, :cond_3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkh/f;

    iget v4, v3, Lkh/f;->d:I

    if-lt p4, v4, :cond_2

    iget p3, v3, Lkh/f;->a:I

    if-ne p3, p1, :cond_1

    iget-object p1, v3, Lkh/f;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_1

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :goto_2
    iget p1, p0, Lbd3/v;->x:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Lbd3/v;->x:I

    const/16 p2, 0xa

    if-lt p1, p2, :cond_4

    invoke-virtual {p0}, Lbd3/v;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    monitor-exit p0

    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public p(Ljava/lang/String;)V
    .locals 5

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lbd3/v;->x:I

    invoke-virtual {p0, v1, v0}, Lbd3/v;->f(II)V

    iget-object v1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [C

    iget v2, p0, Lbd3/v;->x:I

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p1, v3, v4, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    iget p1, p0, Lbd3/v;->x:I

    add-int/2addr p1, v0

    iput p1, p0, Lbd3/v;->x:I

    return-void
.end method

.method public t(Lzk/z;Lwk/h;)Lzk/z;
    .locals 3

    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-interface {p1}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap$CompressFormat;

    iget v2, p0, Lbd3/v;->x:I

    invoke-virtual {v0, v1, v2, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-interface {p1}, Lzk/z;->a()V

    new-instance p1, Lgl/x;

    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    invoke-direct {p1, p2}, Lgl/x;-><init>([B)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lbd3/v;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [C

    const/4 v2, 0x0

    iget v3, p0, Lbd3/v;->x:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
