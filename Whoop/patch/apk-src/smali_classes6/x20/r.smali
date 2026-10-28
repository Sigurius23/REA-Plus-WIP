.class public final Lx20/r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lx20/w;


# direct methods
.method public synthetic constructor <init>(Lx20/w;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lx20/r;->w:I

    iput-object p1, p0, Lx20/r;->y:Lx20/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lx20/r;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lx20/r;

    iget-object v0, p0, Lx20/r;->y:Lx20/w;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lx20/r;-><init>(Lx20/w;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lx20/r;

    iget-object v0, p0, Lx20/r;->y:Lx20/w;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lx20/r;-><init>(Lx20/w;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx20/r;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lx20/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx20/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx20/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lx20/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx20/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx20/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lx20/r;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx20/r;->x:I

    iget-object v2, p0, Lx20/r;->y:Lx20/w;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lx20/w;->w:Lx20/s;

    iget-wide v4, p1, Lx20/s;->c:J

    iput v3, p0, Lx20/r;->x:I

    invoke-static {v4, v5, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p1, v2, Lx20/w;->x:Lf30/e;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Lf30/e;->d:Lbc3/z;

    new-instance v2, La20/b;

    const/16 v3, 0x14

    const/4 v4, 0x0

    invoke-direct {v2, p1, v4, v3}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x2

    invoke-static {v0, v1, v4, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p1, Lf30/e;->e:Lbc3/c2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx20/r;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lx20/r;->x:I

    iget-object p1, p0, Lx20/r;->y:Lx20/w;

    iget-object v1, p1, Lx20/w;->x:Lf30/e;

    iget-object v1, v1, Lf30/e;->g:Lec3/h2;

    new-instance v2, Lo23/p;

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-direct {v2, p1, v3, v4}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v3, Lay/l;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Lay/l;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lec3/e0;

    const/4 v4, 0x2

    invoke-direct {p1, v4, v3, v2}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lw;

    const/16 v3, 0x17

    invoke-direct {v2, p1, v3}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v1, v2, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_2
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
