.class public final Ld0/z0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ld0/z1;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ld0/f1;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/f1;Ljava/lang/Object;Ld0/z1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld0/z0;->w:I

    .line 1
    iput-object p1, p0, Ld0/z0;->y:Ld0/f1;

    iput-object p2, p0, Ld0/z0;->z:Ljava/lang/Object;

    iput-object p3, p0, Ld0/z0;->E:Ld0/z1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ld0/z1;Ld0/f1;Ljava/lang/Object;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld0/z0;->w:I

    .line 2
    iput-object p1, p0, Ld0/z0;->E:Ld0/z1;

    iput-object p2, p0, Ld0/z0;->y:Ld0/f1;

    iput-object p3, p0, Ld0/z0;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, Ld0/z0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld0/z0;

    iget-object v1, p0, Ld0/z0;->z:Ljava/lang/Object;

    iget-object v2, p0, Ld0/z0;->E:Ld0/z1;

    iget-object v3, p0, Ld0/z0;->y:Ld0/f1;

    invoke-direct {v0, v3, v1, v2, p1}, Ld0/z0;-><init>(Ld0/f1;Ljava/lang/Object;Ld0/z1;Lq83/d;)V

    return-object v0

    :pswitch_0
    new-instance v0, Ld0/z0;

    iget-object v1, p0, Ld0/z0;->y:Ld0/f1;

    iget-object v2, p0, Ld0/z0;->z:Ljava/lang/Object;

    iget-object v3, p0, Ld0/z0;->E:Ld0/z1;

    invoke-direct {v0, v3, v1, v2, p1}, Ld0/z0;-><init>(Ld0/z1;Ld0/f1;Ljava/lang/Object;Lq83/d;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld0/z0;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Ld0/z0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/z0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/z0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Ld0/z0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/z0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/z0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Ld0/z0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld0/z0;->x:I

    const/4 v2, 0x1

    iget-object v3, p0, Ld0/z0;->E:Ld0/z1;

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld0/z0;->y:Ld0/f1;

    invoke-virtual {p1}, Ld0/f1;->M0()V

    iget-object v1, p1, Ld0/f1;->y:Lp1/k1;

    const-wide/high16 v4, -0x8000000000000000L

    iput-wide v4, p1, Ld0/f1;->M:J

    const/4 v4, 0x0

    invoke-virtual {p1, v4}, Ld0/f1;->Q0(F)V

    iget-object v5, p1, Ld0/f1;->z:Lp1/k1;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Ld0/z0;->z:Ljava/lang/Object;

    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/high16 v7, -0x3fc00000    # -3.0f

    if-eqz v5, :cond_2

    const/high16 v5, -0x3f800000    # -4.0f

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/high16 v5, -0x3f600000    # -5.0f

    goto :goto_0

    :cond_3
    move v5, v7

    :goto_0
    invoke-virtual {v3, v6}, Ld0/z1;->p(Ljava/lang/Object;)V

    const-wide/16 v8, 0x0

    invoke-virtual {v3, v8, v9}, Ld0/z1;->n(J)V

    invoke-virtual {v1, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1, v4}, Ld0/f1;->Q0(F)V

    invoke-virtual {p1, v6}, Ld0/f1;->B0(Ljava/lang/Object;)V

    invoke-virtual {v3, v5}, Ld0/z1;->j(F)V

    cmpg-float v1, v5, v7

    if-nez v1, :cond_4

    iput v2, p0, Ld0/z0;->x:I

    invoke-static {p1, p0}, Ld0/f1;->K0(Ld0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {v3}, Ld0/z1;->i()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld0/z0;->x:I

    iget-object v2, p0, Ld0/z0;->E:Ld0/z1;

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcz/d;

    iget-object v1, p0, Ld0/z0;->z:Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Ld0/z0;->y:Ld0/f1;

    invoke-direct {p1, v5, v1, v2, v4}, Lcz/d;-><init>(Ld0/f1;Ljava/lang/Object;Ld0/z1;Lq83/d;)V

    iput v3, p0, Ld0/z0;->x:I

    invoke-static {p1, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    invoke-virtual {v2}, Ld0/z1;->i()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
