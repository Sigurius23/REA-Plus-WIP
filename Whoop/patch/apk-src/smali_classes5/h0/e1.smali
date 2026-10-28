.class public final Lh0/e1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lh0/f1;

.field public final synthetic w:I

.field public x:Lkotlin/jvm/internal/g0;

.field public y:Lkotlin/jvm/internal/g0;

.field public z:I


# direct methods
.method public constructor <init>(Lh0/f1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/e1;->w:I

    .line 1
    iput-object p1, p0, Lh0/e1;->F:Lh0/f1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/g0;Lh0/f1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/e1;->w:I

    .line 2
    iput-object p1, p0, Lh0/e1;->y:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lh0/e1;->F:Lh0/f1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lh0/e1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh0/e1;

    iget-object v1, p0, Lh0/e1;->F:Lh0/f1;

    invoke-direct {v0, v1, p2}, Lh0/e1;-><init>(Lh0/f1;Lq83/d;)V

    iput-object p1, v0, Lh0/e1;->E:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lh0/e1;

    iget-object v1, p0, Lh0/e1;->y:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lh0/e1;->F:Lh0/f1;

    invoke-direct {v0, v1, v2, p2}, Lh0/e1;-><init>(Lkotlin/jvm/internal/g0;Lh0/f1;Lq83/d;)V

    iput-object p1, v0, Lh0/e1;->E:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/e1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/e1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/e1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/e1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lkotlin/jvm/functions/Function1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/e1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/e1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/e1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lh0/e1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/e1;->z:I

    const/4 v2, 0x0

    iget-object v3, p0, Lh0/e1;->F:Lh0/f1;

    packed-switch v1, :pswitch_data_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v1, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    :goto_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    :pswitch_2
    iget-object v1, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    goto :goto_0

    :cond_0
    :goto_1
    move-object v5, v1

    goto :goto_2

    :pswitch_3
    iget-object v1, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast v4, Lbc3/c0;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    move-object v5, v4

    goto/16 :goto_6

    :catch_0
    move-object v1, v4

    goto/16 :goto_7

    :pswitch_4
    iget-object v1, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast v4, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_5
    iget-object v1, p0, Lh0/e1;->y:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    iget-object v5, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast v5, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    move-object v5, p1

    :cond_2
    :goto_2
    invoke-static {v5}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object p1, v3, Lh0/f1;->U:Ldc3/h;

    if-eqz p1, :cond_4

    iput-object v5, p0, Lh0/e1;->E:Ljava/lang/Object;

    iput-object v1, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    iput-object v1, p0, Lh0/e1;->y:Lkotlin/jvm/internal/g0;

    const/4 v4, 0x1

    iput v4, p0, Lh0/e1;->z:I

    invoke-virtual {p1, p0}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto/16 :goto_8

    :cond_3
    move-object v4, v1

    :goto_3
    check-cast p1, Lh0/k0;

    goto :goto_4

    :cond_4
    move-object v4, v1

    move-object p1, v2

    :goto_4
    iput-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v1, p1, Lh0/i0;

    if-eqz v1, :cond_2

    check-cast p1, Lh0/i0;

    iput-object v5, p0, Lh0/e1;->E:Ljava/lang/Object;

    iput-object v4, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    iput-object v2, p0, Lh0/e1;->y:Lkotlin/jvm/internal/g0;

    const/4 v1, 0x2

    iput v1, p0, Lh0/e1;->z:I

    invoke-static {v3, p1, p0}, Lh0/f1;->b1(Lh0/f1;Lh0/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_8

    :cond_5
    move-object v1, v4

    move-object v4, v5

    :goto_5
    :try_start_2
    new-instance p1, Lh0/e1;

    invoke-direct {p1, v1, v3, v2}, Lh0/e1;-><init>(Lkotlin/jvm/internal/g0;Lh0/f1;Lq83/d;)V

    iput-object v4, p0, Lh0/e1;->E:Ljava/lang/Object;

    iput-object v1, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    const/4 v5, 0x3

    iput v5, p0, Lh0/e1;->z:I

    invoke-virtual {v3, p1, p0}, Lh0/f1;->e1(Lh0/e1;Lh0/e1;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p1, v0, :cond_1

    goto :goto_8

    :goto_6
    :try_start_3
    iget-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v1, p1, Lh0/j0;

    if-eqz v1, :cond_6

    check-cast p1, Lh0/j0;

    iput-object v5, p0, Lh0/e1;->E:Ljava/lang/Object;

    iput-object v2, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    const/4 v1, 0x4

    iput v1, p0, Lh0/e1;->z:I

    invoke-static {v3, p1, p0}, Lh0/f1;->c1(Lh0/f1;Lh0/j0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_8

    :catch_1
    move-object v1, v5

    goto :goto_7

    :cond_6
    instance-of p1, p1, Lh0/g0;

    if-eqz p1, :cond_2

    iput-object v5, p0, Lh0/e1;->E:Ljava/lang/Object;

    iput-object v2, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x5

    iput p1, p0, Lh0/e1;->z:I

    invoke-static {v3, p0}, Lh0/f1;->a1(Lh0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    if-ne p1, v0, :cond_2

    goto :goto_8

    :catch_2
    :goto_7
    iput-object v1, p0, Lh0/e1;->E:Ljava/lang/Object;

    iput-object v2, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x6

    iput p1, p0, Lh0/e1;->z:I

    invoke-static {v3, p0}, Lh0/f1;->a1(Lh0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    goto :goto_8

    :cond_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v0

    :pswitch_7
    iget-object v0, p0, Lh0/e1;->y:Lkotlin/jvm/internal/g0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lh0/e1;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_9

    if-ne v2, v3, :cond_8

    iget-object v2, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_b

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/e1;->E:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    :goto_9
    iget-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v2, p1, Lh0/j0;

    if-nez v2, :cond_e

    instance-of v2, p1, Lh0/g0;

    if-nez v2, :cond_e

    instance-of v2, p1, Lh0/h0;

    const/4 v5, 0x0

    if-eqz v2, :cond_a

    check-cast p1, Lh0/h0;

    goto :goto_a

    :cond_a
    move-object p1, v5

    :goto_a
    if-eqz p1, :cond_b

    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget-object p1, p0, Lh0/e1;->F:Lh0/f1;

    iget-object p1, p1, Lh0/f1;->U:Ldc3/h;

    if-eqz p1, :cond_d

    iput-object v4, p0, Lh0/e1;->E:Ljava/lang/Object;

    iput-object v0, p0, Lh0/e1;->x:Lkotlin/jvm/internal/g0;

    iput v3, p0, Lh0/e1;->z:I

    invoke-virtual {p1, p0}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    goto :goto_d

    :cond_c
    move-object v2, v0

    :goto_b
    move-object v5, p1

    check-cast v5, Lh0/k0;

    goto :goto_c

    :cond_d
    move-object v2, v0

    :goto_c
    iput-object v5, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_9

    :cond_e
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_d
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
