.class public final Landroidx/lifecycle/y0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/lifecycle/w;

.field public final synthetic F:Ls83/i;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Lq83/d;I)V
    .locals 0

    iput p5, p0, Landroidx/lifecycle/y0;->w:I

    packed-switch p5, :pswitch_data_0

    iput-object p1, p0, Landroidx/lifecycle/y0;->z:Landroidx/lifecycle/x;

    iput-object p2, p0, Landroidx/lifecycle/y0;->E:Landroidx/lifecycle/w;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Landroidx/lifecycle/y0;->F:Ls83/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void

    :pswitch_0
    iput-object p1, p0, Landroidx/lifecycle/y0;->z:Landroidx/lifecycle/x;

    iput-object p2, p0, Landroidx/lifecycle/y0;->E:Landroidx/lifecycle/w;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Landroidx/lifecycle/y0;->F:Ls83/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    iget v0, p0, Landroidx/lifecycle/y0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Landroidx/lifecycle/y0;

    iget-object v4, p0, Landroidx/lifecycle/y0;->F:Ls83/i;

    const/4 v6, 0x1

    iget-object v2, p0, Landroidx/lifecycle/y0;->z:Landroidx/lifecycle/x;

    iget-object v3, p0, Landroidx/lifecycle/y0;->E:Landroidx/lifecycle/w;

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Landroidx/lifecycle/y0;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Lq83/d;I)V

    iput-object p1, v1, Landroidx/lifecycle/y0;->y:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v5, p2

    new-instance v2, Landroidx/lifecycle/y0;

    move-object v6, v5

    iget-object v5, p0, Landroidx/lifecycle/y0;->F:Ls83/i;

    const/4 v7, 0x0

    iget-object v3, p0, Landroidx/lifecycle/y0;->z:Landroidx/lifecycle/x;

    iget-object v4, p0, Landroidx/lifecycle/y0;->E:Landroidx/lifecycle/w;

    invoke-direct/range {v2 .. v7}, Landroidx/lifecycle/y0;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Lq83/d;I)V

    iput-object p1, v2, Landroidx/lifecycle/y0;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/lifecycle/y0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Landroidx/lifecycle/y0;->w:I

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, p0, Landroidx/lifecycle/y0;->x:I

    if-eqz v3, :cond_1

    if-ne v3, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/lifecycle/y0;->y:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lbc3/c0;

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p1

    new-instance v3, Landroidx/lifecycle/g1;

    iget-object v7, p0, Landroidx/lifecycle/y0;->F:Ls83/i;

    const/4 v8, 0x0

    iget-object v4, p0, Landroidx/lifecycle/y0;->z:Landroidx/lifecycle/x;

    iget-object v5, p0, Landroidx/lifecycle/y0;->E:Landroidx/lifecycle/w;

    invoke-direct/range {v3 .. v8}, Landroidx/lifecycle/g1;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lbc3/c0;Lc93/m;Lq83/d;)V

    iput v2, p0, Landroidx/lifecycle/y0;->x:I

    invoke-static {p1, v3, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, p0, Landroidx/lifecycle/y0;->x:I

    if-eqz v3, :cond_4

    if-ne v3, v2, :cond_3

    iget-object v0, p0, Landroidx/lifecycle/y0;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/z;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/lifecycle/y0;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_6

    new-instance v1, Landroidx/lifecycle/x0;

    invoke-direct {v1}, Landroidx/lifecycle/x0;-><init>()V

    new-instance v3, Landroidx/lifecycle/z;

    iget-object v4, p0, Landroidx/lifecycle/y0;->E:Landroidx/lifecycle/w;

    iget-object v5, v1, Landroidx/lifecycle/x0;->w:Landroidx/lifecycle/n;

    iget-object v6, p0, Landroidx/lifecycle/y0;->z:Landroidx/lifecycle/x;

    invoke-direct {v3, v6, v4, v5, p1}, Landroidx/lifecycle/z;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Landroidx/lifecycle/n;Lbc3/k1;)V

    :try_start_1
    iget-object p1, p0, Landroidx/lifecycle/y0;->F:Ls83/i;

    iput-object v3, p0, Landroidx/lifecycle/y0;->y:Ljava/lang/Object;

    iput v2, p0, Landroidx/lifecycle/y0;->x:I

    invoke-static {v1, p1, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    move-object v1, v3

    :goto_2
    invoke-virtual {v1}, Landroidx/lifecycle/z;->a()V

    move-object v0, p1

    :goto_3
    return-object v0

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v1, v3

    :goto_4
    invoke-virtual {v1}, Landroidx/lifecycle/z;->a()V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "when[State] methods should have a parent job"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
