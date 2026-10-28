.class public final Lh0/l1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lh0/l1;->w:I

    .line 1
    iput-wide p1, p0, Lh0/l1;->E:J

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lh0/l1;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lh0/m1;JLq83/d;I)V
    .locals 0

    .line 2
    iput p5, p0, Lh0/l1;->w:I

    iput-object p1, p0, Lh0/l1;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lh0/l1;->E:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11

    iget v0, p0, Lh0/l1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh0/l1;

    iget-object v1, p0, Lh0/l1;->z:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    iget-wide v2, p0, Lh0/l1;->E:J

    invoke-direct {v0, v2, v3, v1, p2}, Lh0/l1;-><init>(JLc93/m;Lq83/d;)V

    iput-object p1, v0, Lh0/l1;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v4, Lh0/l1;

    iget-object v0, p0, Lh0/l1;->z:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lh0/m1;

    iget-wide v6, p0, Lh0/l1;->E:J

    const/4 v9, 0x1

    move-object v8, p2

    invoke-direct/range {v4 .. v9}, Lh0/l1;-><init>(Lh0/m1;JLq83/d;I)V

    iput-object p1, v4, Lh0/l1;->y:Ljava/lang/Object;

    return-object v4

    :pswitch_1
    move-object v8, p2

    new-instance v5, Lh0/l1;

    iget-object p2, p0, Lh0/l1;->z:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lh0/m1;

    move-object v9, v8

    iget-wide v7, p0, Lh0/l1;->E:J

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, Lh0/l1;-><init>(Lh0/m1;JLq83/d;I)V

    iput-object p1, v5, Lh0/l1;->y:Ljava/lang/Object;

    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/l1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lh0/l1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/l1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/l1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh0/l1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/l1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/l1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lh0/l1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/l1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/l1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lh0/l1;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lh0/l1;->z:Ljava/lang/Object;

    iget-wide v3, p0, Lh0/l1;->E:J

    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v7, p0, Lh0/l1;->x:I

    const/4 v8, 0x2

    if-eqz v7, :cond_2

    if-eq v7, v6, :cond_1

    if-ne v7, v8, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v3, p0, Lh0/l1;->y:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/l1;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iput-object p1, p0, Lh0/l1;->y:Ljava/lang/Object;

    iput v6, p0, Lh0/l1;->x:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, p1

    :goto_0
    check-cast v2, Ls83/i;

    const/4 p1, 0x0

    iput-object p1, p0, Lh0/l1;->y:Ljava/lang/Object;

    iput v8, p0, Lh0/l1;->x:I

    invoke-interface {v2, v3, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    move-object v1, v0

    :cond_4
    :goto_2
    return-object v1

    :pswitch_0
    check-cast v2, Lh0/m1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v7, p0, Lh0/l1;->x:I

    if-eqz v7, :cond_6

    if-ne v7, v6, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/l1;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v5, v2, Lh0/m1;->d0:Lkotlin/jvm/functions/Function3;

    iget-boolean v7, v2, Lh0/m1;->e0:Z

    if-eqz v7, :cond_7

    const/high16 v7, -0x40800000    # -1.0f

    :goto_3
    invoke-static {v7, v3, v4}, Ly3/q;->h(FJ)J

    move-result-wide v3

    goto :goto_4

    :cond_7
    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_3

    :goto_4
    iget-object v2, v2, Lh0/m1;->a0:Lh0/d2;

    sget-object v7, Lh0/k1;->a:Lh0/j1;

    sget-object v7, Lh0/d2;->w:Lh0/d2;

    if-ne v2, v7, :cond_8

    invoke-static {v3, v4}, Ly3/q;->e(J)F

    move-result v2

    goto :goto_5

    :cond_8
    invoke-static {v3, v4}, Ly3/q;->d(J)F

    move-result v2

    :goto_5
    new-instance v3, Ljava/lang/Float;

    invoke-direct {v3, v2}, Ljava/lang/Float;-><init>(F)V

    iput v6, p0, Lh0/l1;->x:I

    invoke-interface {v5, p1, v3, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    move-object v1, v0

    :cond_9
    :goto_6
    return-object v1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v7, p0, Lh0/l1;->x:I

    if-eqz v7, :cond_b

    if-ne v7, v6, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/l1;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    check-cast v2, Lh0/m1;

    iget-object v2, v2, Lh0/m1;->c0:Lkotlin/jvm/functions/Function3;

    new-instance v5, Lh2/b;

    invoke-direct {v5, v3, v4}, Lh2/b;-><init>(J)V

    iput v6, p0, Lh0/l1;->x:I

    invoke-interface {v2, p1, v5, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    move-object v1, v0

    :cond_c
    :goto_7
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
