.class public final synthetic Lk80/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lk80/d;->w:I

    iput-object p2, p0, Lk80/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Lk80/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/internal/MainDispatcherFactory;Ljava/util/ArrayList;Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;)V
    .locals 0

    .line 2
    const/4 p3, 0x6

    iput p3, p0, Lk80/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk80/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Lk80/d;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    iget v0, p0, Lk80/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Ly61/a;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lw61/b;->b(Ly61/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lm91/n;

    invoke-static {v0, v1}, Lvn1/p;->e(Lc93/m;Lm91/n;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lui/l;

    invoke-static {v0, v1}, Lv41/p;->b(Ljava/lang/Float;Lui/l;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Lt92/b;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-static {v0, v1}, Lt92/b;->f1(Lt92/b;Ljava/lang/Class;)Lys0/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Ljc/v;

    iget-object v2, v1, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    const-string v3, "getWorkDatabase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh6/l;

    const/4 v4, 0x6

    invoke-direct {v3, v2, v0, v1, v4}, Lh6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroidx/room/z0;->runInTransaction(Ljava/lang/Runnable;)V

    iget-object v0, v1, Ljc/v;->b:Lic/b;

    iget-object v1, v1, Ljc/v;->e:Ljava/util/List;

    invoke-static {v0, v2, v1}, Ljc/k;->b(Lic/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, La0/w0;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/w;

    iget-object v2, v0, La0/w0;->b:[Ljava/lang/Object;

    iget-object v0, v0, La0/w0;->a:[J

    array-length v3, v0

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    aget-wide v6, v0, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_2

    sub-int v8, v5, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v4

    :goto_1
    if-ge v10, v8, :cond_1

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_0

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v2, v11

    invoke-virtual {v1, v11}, Lp1/w;->z(Ljava/lang/Object;)V

    :cond_0
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    if-ne v8, v9, :cond_3

    :cond_2
    if-eq v5, v3, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/MainDispatcherFactory;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    const/4 v2, 0x0

    :try_start_0
    invoke-interface {v0, v1}, Lkotlinx/coroutines/internal/MainDispatcherFactory;->a(Ljava/util/List;)Lbc3/w1;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v1

    instance-of v1, v1, Lhc3/p;

    if-nez v1, :cond_4

    return-object v0

    :cond_4
    :try_start_1
    new-instance v1, Lb3/n;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Lb3/n;-><init>(I)V

    invoke-virtual {v0, v0, v1}, Lbc3/z;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lug/m;->l(Ljava/lang/Throwable;)V

    throw v2

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lug/m;->l(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_6
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Lny0/h;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lny0/d;->b(Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lnm1/i;

    invoke-static {v0, v1}, Lnm1/h;->d(Lkotlin/jvm/functions/Function1;Lnm1/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Lnc/b;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lnc/a;

    iget-object v0, v0, Lnc/b;->a:Leb/o0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Leb/o0;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    iget-object v3, v0, Leb/o0;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Leb/o0;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Leb/o0;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    goto :goto_4

    :cond_5
    :goto_3
    monitor-exit v2

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_4
    monitor-exit v2

    throw v0

    :pswitch_9
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lkotlinx/serialization/internal/ObjectSerializer;

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/ObjectSerializer;->a(Ljava/lang/String;Lkotlinx/serialization/internal/ObjectSerializer;)Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlinx/serialization/internal/EnumSerializer;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumSerializer;->a(Lkotlinx/serialization/internal/EnumSerializer;Ljava/lang/String;)Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lk80/d;->x:Ljava/lang/Object;

    check-cast v0, Leb/u0;

    iget-object v1, p0, Lk80/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/activation/view/ActivationFragment;

    invoke-static {v0, v1}, Lcom/whoop/activation/view/ActivationFragment;->B(Leb/u0;Lcom/whoop/activation/view/ActivationFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
