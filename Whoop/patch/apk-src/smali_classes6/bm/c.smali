.class public final Lbm/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lbm/t;


# direct methods
.method public constructor <init>(Lbm/t;ILq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lbm/c;->w:I

    .line 1
    iput-object p1, p0, Lbm/c;->y:Lbm/t;

    iput p2, p0, Lbm/c;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lbm/t;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Lbm/c;->w:I

    iput-object p1, p0, Lbm/c;->y:Lbm/t;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lbm/c;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lbm/c;

    iget-object v0, p0, Lbm/c;->y:Lbm/t;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lbm/c;-><init>(Lbm/t;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lbm/c;

    iget-object v0, p0, Lbm/c;->y:Lbm/t;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lbm/c;-><init>(Lbm/t;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lbm/c;

    iget-object v0, p0, Lbm/c;->y:Lbm/t;

    iget v1, p0, Lbm/c;->x:I

    invoke-direct {p1, v0, v1, p2}, Lbm/c;-><init>(Lbm/t;ILq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbm/c;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lbm/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbm/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbm/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lbm/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbm/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbm/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lbm/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbm/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbm/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbm/c;->w:I

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lbm/c;->y:Lbm/t;

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lbm/c;->x:I

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lbm/d;

    invoke-direct {p1, v3, v5}, Lbm/d;-><init>(Lbm/t;I)V

    invoke-static {p1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v1, Lbm/e;

    invoke-direct {v1, v3, v5}, Lbm/e;-><init>(Lbm/t;I)V

    iput v5, p0, Lbm/c;->x:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object v2, v0

    :cond_2
    :goto_0
    return-object v2

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v6, p0, Lbm/c;->x:I

    if-eqz v6, :cond_4

    if-ne v6, v5, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lbm/d;

    invoke-direct {p1, v3, v4}, Lbm/d;-><init>(Lbm/t;I)V

    invoke-static {p1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lbm/g;

    invoke-direct {v1, p1, v4}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v5}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance v1, Lbm/e;

    invoke-direct {v1, v3, v4}, Lbm/e;-><init>(Lbm/t;I)V

    iput v5, p0, Lbm/c;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/h0;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    move-object v2, v0

    :cond_5
    :goto_1
    return-object v2

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget p1, p0, Lbm/c;->x:I

    sub-int/2addr p1, v5

    invoke-virtual {v3}, Lbm/t;->m()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-gez p1, :cond_6

    goto :goto_2

    :cond_6
    move v4, p1

    :goto_2
    invoke-virtual {v3}, Lbm/t;->m()I

    move-result p1

    if-eq v4, p1, :cond_7

    iget-object p1, v3, Lbm/t;->b:Lp1/k1;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_7
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
