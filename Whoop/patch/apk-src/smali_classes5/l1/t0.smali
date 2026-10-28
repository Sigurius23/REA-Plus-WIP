.class public final Ll1/t0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ln0/u;

.field public y:I

.field public final synthetic z:I


# direct methods
.method public constructor <init>(ILn0/u;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll1/t0;->w:I

    .line 1
    iput-object p2, p0, Ll1/t0;->x:Ln0/u;

    iput p1, p0, Ll1/t0;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ln0/u;IILq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll1/t0;->w:I

    .line 2
    iput-object p1, p0, Ll1/t0;->x:Ln0/u;

    iput p2, p0, Ll1/t0;->y:I

    iput p3, p0, Ll1/t0;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Ll1/t0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ll1/t0;

    iget v0, p0, Ll1/t0;->y:I

    iget v1, p0, Ll1/t0;->z:I

    iget-object v2, p0, Ll1/t0;->x:Ln0/u;

    invoke-direct {p1, v2, v0, v1, p2}, Ll1/t0;-><init>(Ln0/u;IILq83/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Ll1/t0;

    iget-object v0, p0, Ll1/t0;->x:Ln0/u;

    iget v1, p0, Ll1/t0;->z:I

    invoke-direct {p1, v1, v0, p2}, Ll1/t0;-><init>(ILn0/u;Lq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll1/t0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll1/t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll1/t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ll1/t0;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget v2, p0, Ll1/t0;->z:I

    iget-object v3, p0, Ll1/t0;->x:Ln0/u;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget p1, p0, Ll1/t0;->y:I

    invoke-virtual {v3, p1, v2}, Ln0/u;->k(II)V

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, p0, Ll1/t0;->y:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v3, Ln0/u;->i:Lh0/d0;

    invoke-virtual {p1}, Lh0/d0;->b()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, v3, Ln0/u;->e:Ll2/a;

    iget-object p1, p1, Ll2/a;->b:Ljava/lang/Object;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    if-eq p1, v2, :cond_2

    iput v5, p0, Ll1/t0;->y:I

    const/4 p1, 0x0

    invoke-virtual {v3, v2, p1, p0}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object v1, v0

    :cond_2
    :goto_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
