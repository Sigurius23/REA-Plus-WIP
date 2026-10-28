.class public final synthetic Ld0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Ld0/a;->w:I

    iput-object p1, p0, Ld0/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Ld0/a;->y:Ljava/lang/Object;

    iput-object p3, p0, Ld0/a;->z:Ljava/lang/Object;

    iput-object p4, p0, Ld0/a;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lim1/d0;Lfm1/a;Lfm1/d;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Ld0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/a;->z:Ljava/lang/Object;

    iput-object p2, p0, Ld0/a;->x:Ljava/lang/Object;

    iput-object p3, p0, Ld0/a;->y:Ljava/lang/Object;

    iput-object p4, p0, Ld0/a;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Ld0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld0/a;->x:Ljava/lang/Object;

    check-cast v0, Lvk0/c;

    iget-object v1, p0, Ld0/a;->y:Ljava/lang/Object;

    check-cast v1, Lvk0/a;

    iget-object v2, p0, Ld0/a;->z:Ljava/lang/Object;

    check-cast v2, Lst0/v;

    iget-object v3, p0, Ld0/a;->E:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/f0;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3, p1}, Lvk0/c;->b(Lvk0/c;Lvk0/a;Lst0/v;Lkotlin/jvm/internal/f0;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ld0/a;->x:Ljava/lang/Object;

    check-cast v0, Lld1/c;

    iget-object v1, p0, Ld0/a;->y:Ljava/lang/Object;

    check-cast v1, Lvn1/q;

    iget-object v2, p0, Ld0/a;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Ld0/a;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-static {v0, v1, v2, v3, p1}, Lum1/d;->a(Lld1/c;Lvn1/q;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ld0/a;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld0/a;->x:Ljava/lang/Object;

    check-cast v1, Lim1/d0;

    iget-object v2, p0, Ld0/a;->y:Ljava/lang/Object;

    check-cast v2, Lfm1/a;

    iget-object v3, p0, Ld0/a;->E:Ljava/lang/Object;

    check-cast v3, Lfm1/d;

    invoke-static {v0, v1, v2, v3, p1}, Lim1/j0;->i(Lkotlin/jvm/functions/Function1;Lim1/d0;Lfm1/a;Lfm1/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ld0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/home/view/HomeFragment;

    iget-object v1, p0, Ld0/a;->y:Ljava/lang/Object;

    check-cast v1, Lfm1/g;

    iget-object v2, p0, Ld0/a;->z:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    iget-object v3, p0, Ld0/a;->E:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    check-cast p1, Lil1/s;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/whoop/home/view/HomeFragment;->H(Lcom/whoop/home/view/HomeFragment;Lfm1/g;Lp1/t2;Lbc3/c0;Lil1/s;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ld0/a;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Ld0/a;->y:Ljava/lang/Object;

    check-cast v1, Ld0/l0;

    iget-object v2, p0, Ld0/a;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/d0;

    iget-object v3, p0, Ld0/a;->E:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/t2;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    goto :goto_0

    :cond_0
    move-wide v6, v4

    :goto_0
    iget-wide v8, v1, Ld0/l0;->c:J

    iget-object p1, v1, Ld0/l0;->a:Lr1/c;

    const-wide/high16 v10, -0x8000000000000000L

    cmp-long v0, v8, v10

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v0, :cond_1

    iget v0, v2, Lkotlin/jvm/internal/d0;->w:F

    invoke-interface {v3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v10

    invoke-static {v10}, Ld0/f;->p(Lq83/j;)F

    move-result v10

    cmpg-float v0, v0, v10

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    iput-wide v4, v1, Ld0/l0;->c:J

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget v4, p1, Lr1/c;->y:I

    move v5, v8

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v10, v0, v5

    check-cast v10, Ld0/j0;

    iput-boolean v9, v10, Ld0/j0;->G:Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Ld0/f;->p(Lq83/j;)F

    move-result v0

    iput v0, v2, Lkotlin/jvm/internal/d0;->w:F

    :goto_2
    iget v0, v2, Lkotlin/jvm/internal/d0;->w:F

    const/4 v2, 0x0

    cmpg-float v2, v0, v2

    if-nez v2, :cond_3

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    :goto_3
    if-ge v8, p1, :cond_8

    aget-object v1, v0, v8

    check-cast v1, Ld0/j0;

    iget-object v2, v1, Ld0/j0;->E:Ld0/p1;

    iget-object v2, v2, Ld0/p1;->c:Ljava/lang/Object;

    iget-object v3, v1, Ld0/j0;->z:Lp1/k1;

    invoke-virtual {v3, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iput-boolean v9, v1, Ld0/j0;->G:Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_3
    iget-wide v2, v1, Ld0/l0;->c:J

    sub-long/2addr v6, v2

    long-to-float v2, v6

    div-float/2addr v2, v0

    float-to-long v2, v2

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    move v4, v8

    move v5, v9

    :goto_4
    if-ge v4, p1, :cond_7

    aget-object v6, v0, v4

    check-cast v6, Ld0/j0;

    iget-boolean v7, v6, Ld0/j0;->F:Z

    if-nez v7, :cond_5

    iget-object v7, v6, Ld0/j0;->I:Ld0/l0;

    iget-object v7, v7, Ld0/l0;->b:Lp1/k1;

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v7, v10}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-boolean v7, v6, Ld0/j0;->G:Z

    if-eqz v7, :cond_4

    iput-boolean v8, v6, Ld0/j0;->G:Z

    iput-wide v2, v6, Ld0/j0;->H:J

    :cond_4
    iget-wide v10, v6, Ld0/j0;->H:J

    sub-long v10, v2, v10

    iget-object v7, v6, Ld0/j0;->E:Ld0/p1;

    invoke-virtual {v7, v10, v11}, Ld0/p1;->f(J)Ljava/lang/Object;

    move-result-object v7

    iget-object v12, v6, Ld0/j0;->z:Lp1/k1;

    invoke-virtual {v12, v7}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v7, v6, Ld0/j0;->E:Ld0/p1;

    invoke-interface {v7, v10, v11}, Ld0/h;->c(J)Z

    move-result v7

    iput-boolean v7, v6, Ld0/j0;->F:Z

    :cond_5
    iget-boolean v6, v6, Ld0/j0;->F:Z

    if-nez v6, :cond_6

    move v5, v8

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_7
    xor-int/lit8 p1, v5, 0x1

    iget-object v0, v1, Ld0/l0;->d:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ld0/a;->x:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    iget-object v1, p0, Ld0/a;->y:Ljava/lang/Object;

    check-cast v1, Ld0/m;

    iget-object v2, p0, Ld0/a;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ld0/a;->E:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/b0;

    check-cast p1, Ld0/k;

    iget-object v4, v0, Ld0/e;->c:Ld0/m;

    invoke-static {p1, v4}, Ld0/f;->w(Ld0/k;Ld0/m;)V

    iget-object v5, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v0, v6}, Ld0/e;->a(Ld0/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    iget-object v4, v4, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v4, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v1, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v1, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    if-eqz v2, :cond_9

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {p1}, Ld0/k;->a()V

    const/4 p1, 0x1

    iput-boolean p1, v3, Lkotlin/jvm/internal/b0;->w:Z

    goto :goto_5

    :cond_a
    if-eqz v2, :cond_b

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
