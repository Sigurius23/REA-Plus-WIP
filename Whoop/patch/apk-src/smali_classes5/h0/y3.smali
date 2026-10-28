.class public final Lh0/y3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lh0/z3;

.field public final synthetic w:I

.field public x:Lkotlin/jvm/internal/g0;

.field public y:Lkotlin/jvm/internal/g0;

.field public z:I


# direct methods
.method public constructor <init>(Lh0/z3;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/y3;->w:I

    .line 1
    iput-object p1, p0, Lh0/y3;->F:Lh0/z3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/g0;Lh0/z3;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/y3;->w:I

    .line 2
    iput-object p1, p0, Lh0/y3;->y:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lh0/y3;->F:Lh0/z3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lh0/y3;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh0/y3;

    iget-object v1, p0, Lh0/y3;->F:Lh0/z3;

    invoke-direct {v0, v1, p2}, Lh0/y3;-><init>(Lh0/z3;Lq83/d;)V

    iput-object p1, v0, Lh0/y3;->E:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lh0/y3;

    iget-object v1, p0, Lh0/y3;->y:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lh0/y3;->F:Lh0/z3;

    invoke-direct {v0, v1, v2, p2}, Lh0/y3;-><init>(Lkotlin/jvm/internal/g0;Lh0/z3;Lq83/d;)V

    iput-object p1, v0, Lh0/y3;->E:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/y3;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/y3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/y3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/y3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lh0/e0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/y3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/y3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/y3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lh0/y3;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/y3;->z:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lh0/y3;->F:Lh0/z3;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v1, p0, Lh0/y3;->E:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-object p1, v1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh0/y3;->y:Lkotlin/jvm/internal/g0;

    iget-object v6, p0, Lh0/y3;->x:Lkotlin/jvm/internal/g0;

    iget-object v7, p0, Lh0/y3;->E:Ljava/lang/Object;

    check-cast v7, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/y3;->E:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    :goto_0
    invoke-static {p1}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v6, v3, Lh0/z3;->U:Ldc3/h;

    iput-object p1, p0, Lh0/y3;->E:Ljava/lang/Object;

    iput-object v1, p0, Lh0/y3;->x:Lkotlin/jvm/internal/g0;

    iput-object v1, p0, Lh0/y3;->y:Lkotlin/jvm/internal/g0;

    iput v5, p0, Lh0/y3;->z:I

    invoke-virtual {v6, p0}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v7, p1

    move-object p1, v6

    move-object v6, v1

    :goto_1
    iput-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of p1, p1, Lh0/s3;

    if-eqz p1, :cond_5

    :try_start_1
    iget-object p1, v3, Lh0/z3;->Q:Lh0/a4;

    sget-object v1, Lf0/z0;->x:Lf0/z0;

    new-instance v8, Lh0/y3;

    const/4 v9, 0x0

    invoke-direct {v8, v6, v3, v9}, Lh0/y3;-><init>(Lkotlin/jvm/internal/g0;Lh0/z3;Lq83/d;)V

    iput-object v7, p0, Lh0/y3;->E:Ljava/lang/Object;

    iput-object v9, p0, Lh0/y3;->x:Lkotlin/jvm/internal/g0;

    iput-object v9, p0, Lh0/y3;->y:Lkotlin/jvm/internal/g0;

    iput v4, p0, Lh0/y3;->z:I

    check-cast p1, Lh0/f0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lg20/p;

    invoke-direct {v6, p1, v1, v8, v9}, Lg20/p;-><init>(Lh0/f0;Lf0/z0;Lc93/m;Lq83/d;)V

    invoke-static {v6, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v2

    :goto_2
    if-ne p1, v0, :cond_5

    goto :goto_3

    :catch_1
    :cond_5
    move-object p1, v7

    goto :goto_0

    :cond_6
    move-object v0, v2

    :goto_3
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh0/y3;->y:Lkotlin/jvm/internal/g0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lh0/y3;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_8

    if-ne v2, v3, :cond_7

    iget-object v2, p0, Lh0/y3;->x:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Lh0/y3;->E:Ljava/lang/Object;

    check-cast v4, Lh0/e0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/y3;->E:Ljava/lang/Object;

    check-cast p1, Lh0/e0;

    move-object v4, p1

    :goto_4
    iget-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v2, p1, Lh0/t3;

    if-nez v2, :cond_c

    instance-of v2, p1, Lh0/r3;

    if-eqz v2, :cond_9

    check-cast p1, Lh0/r3;

    goto :goto_5

    :cond_9
    const/4 p1, 0x0

    :goto_5
    if-eqz p1, :cond_a

    iget v2, p1, Lh0/r3;->b:F

    iget-wide v5, p1, Lh0/r3;->c:J

    iget p1, p1, Lh0/r3;->d:F

    iget-object v7, v4, Lh0/e0;->a:Lh0/f0;

    iget-object v7, v7, Lh0/f0;->a:Lea2/g;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v8, Lh2/b;

    invoke-direct {v8, v5, v6}, Lh2/b;-><init>(J)V

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v7, v2, v8, p1}, Lea2/g;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    iget-object p1, p0, Lh0/y3;->F:Lh0/z3;

    iget-object p1, p1, Lh0/z3;->U:Ldc3/h;

    iput-object v4, p0, Lh0/y3;->E:Ljava/lang/Object;

    iput-object v0, p0, Lh0/y3;->x:Lkotlin/jvm/internal/g0;

    iput v3, p0, Lh0/y3;->z:I

    invoke-virtual {p1, p0}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_7

    :cond_b
    move-object v2, v0

    :goto_6
    iput-object p1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_4

    :cond_c
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
