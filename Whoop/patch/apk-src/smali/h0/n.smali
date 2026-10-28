.class public final Lh0/n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ll83/e;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh0/p;Ljava/lang/Object;Lc93/n;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/n;->w:I

    .line 1
    iput-object p1, p0, Lh0/n;->y:Ljava/lang/Object;

    iput-object p2, p0, Lh0/n;->z:Ljava/lang/Object;

    iput-object p3, p0, Lh0/n;->E:Ll83/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Llb/n;Landroidx/room/w1;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/n;->w:I

    .line 2
    iput-object p1, p0, Lh0/n;->y:Ljava/lang/Object;

    iput-object p2, p0, Lh0/n;->z:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lh0/n;->E:Ll83/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, Lh0/n;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh0/n;

    iget-object v1, p0, Lh0/n;->y:Ljava/lang/Object;

    check-cast v1, Llb/n;

    iget-object v2, p0, Lh0/n;->z:Ljava/lang/Object;

    check-cast v2, Landroidx/room/w1;

    iget-object v3, p0, Lh0/n;->E:Ll83/e;

    check-cast v3, Ls83/i;

    invoke-direct {v0, v1, v2, v3, p1}, Lh0/n;-><init>(Llb/n;Landroidx/room/w1;Lc93/m;Lq83/d;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lh0/n;

    iget-object v1, p0, Lh0/n;->y:Ljava/lang/Object;

    check-cast v1, Lh0/p;

    iget-object v2, p0, Lh0/n;->E:Ll83/e;

    check-cast v2, Lc93/n;

    iget-object v3, p0, Lh0/n;->z:Ljava/lang/Object;

    invoke-direct {v0, v1, v3, v2, p1}, Lh0/n;-><init>(Lh0/p;Ljava/lang/Object;Lc93/n;Lq83/d;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/n;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lh0/n;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/n;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lh0/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Lh0/n;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/n;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lh0/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lh0/n;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/n;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/n;->y:Ljava/lang/Object;

    check-cast p1, Llb/n;

    iget-object v1, p0, Lh0/n;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/w1;

    iget-object v3, p0, Lh0/n;->E:Ll83/e;

    check-cast v3, Ls83/i;

    iput v2, p0, Lh0/n;->x:I

    invoke-virtual {p1, v1, v3, p0}, Llb/n;->e(Landroidx/room/w1;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lh0/n;->y:Ljava/lang/Object;

    check-cast v0, Lh0/p;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lh0/n;->x:I

    const/4 v3, 0x1

    iget-object v4, p0, Lh0/n;->z:Ljava/lang/Object;

    if-eqz v2, :cond_4

    if-ne v2, v3, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lh0/p;->h:Lp1/k1;

    invoke-virtual {p1, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance p1, Lh0/l;

    const/4 v2, 0x2

    invoke-direct {p1, v0, v2}, Lh0/l;-><init>(Lh0/p;I)V

    new-instance v2, La6/v;

    iget-object v5, p0, Lh0/n;->E:Ll83/e;

    check-cast v5, Lc93/n;

    const/4 v6, 0x0

    const/16 v7, 0xa

    invoke-direct {v2, v5, v0, v6, v7}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, p0, Lh0/n;->x:I

    invoke-static {p1, v2, p0}, Landroidx/compose/foundation/gestures/a;->a(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p1, v0, Lh0/p;->a:Lgm1/b;

    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object p1

    check-cast p1, Lh0/x;

    invoke-virtual {p1, v4}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result p1

    iget-object v1, v0, Lh0/p;->j:Lh0/o;

    iget-object v2, v0, Lh0/p;->g:Lp1/g1;

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v2

    invoke-virtual {v1, p1, v2}, Lh0/o;->b(FF)V

    iget-object p1, v0, Lh0/p;->d:Lp1/k1;

    invoke-virtual {p1, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lh0/p;->g(Ljava/lang/Object;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
