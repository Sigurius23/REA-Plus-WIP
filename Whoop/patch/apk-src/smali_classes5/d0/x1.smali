.class public final Ld0/x1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:F

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc33/c;FLd0/l;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld0/x1;->w:I

    .line 1
    iput-object p1, p0, Ld0/x1;->z:Ljava/lang/Object;

    iput p2, p0, Ld0/x1;->y:F

    iput-object p3, p0, Ld0/x1;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ld0/z1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld0/x1;->w:I

    .line 2
    iput-object p1, p0, Ld0/x1;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Ld0/x1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ld0/x1;

    iget-object v0, p0, Ld0/x1;->z:Ljava/lang/Object;

    check-cast v0, Lc33/c;

    iget v1, p0, Ld0/x1;->y:F

    iget-object v2, p0, Ld0/x1;->E:Ljava/lang/Object;

    check-cast v2, Ld0/l;

    invoke-direct {p1, v0, v1, v2, p2}, Ld0/x1;-><init>(Lc33/c;FLd0/l;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance v0, Ld0/x1;

    iget-object v1, p0, Ld0/x1;->E:Ljava/lang/Object;

    check-cast v1, Ld0/z1;

    invoke-direct {v0, v1, p2}, Ld0/x1;-><init>(Ld0/z1;Lq83/d;)V

    iput-object p1, v0, Ld0/x1;->z:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld0/x1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ld0/x1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/x1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0/x1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ld0/x1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/x1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0/x1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Ld0/x1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld0/x1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld0/x1;->z:Ljava/lang/Object;

    check-cast p1, Lc33/c;

    iget-object p1, p1, Lc33/c;->d:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ld0/e;

    iget p1, p0, Ld0/x1;->y:F

    new-instance v4, Ljava/lang/Float;

    invoke-direct {v4, p1}, Ljava/lang/Float;-><init>(F)V

    iget-object p1, p0, Ld0/x1;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ld0/l;

    iput v2, p0, Ld0/x1;->x:I

    const/4 v6, 0x0

    const/16 v8, 0xc

    move-object v7, p0

    invoke-static/range {v3 .. v8}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    move-object v7, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Ld0/x1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    iget v1, v7, Ld0/x1;->y:F

    iget-object v3, v7, Ld0/x1;->z:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v7, Ld0/x1;->z:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v1

    invoke-static {v1}, Ld0/f;->p(Lq83/j;)F

    move-result v1

    move-object v3, p1

    :cond_5
    :goto_2
    invoke-static {v3}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, v7, Ld0/x1;->E:Ljava/lang/Object;

    check-cast p1, Ld0/z1;

    new-instance v4, Ld0/w1;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v1, v5}, Ld0/w1;-><init>(Ljava/lang/Object;FI)V

    iput-object v3, v7, Ld0/x1;->z:Ljava/lang/Object;

    iput v1, v7, Ld0/x1;->y:F

    iput v2, v7, Ld0/x1;->x:I

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object p1

    invoke-interface {p1, v4, p0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
