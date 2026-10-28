.class public final Lm40/r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lm40/w;Ljava/lang/String;IILq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm40/r;->w:I

    .line 1
    iput-object p1, p0, Lm40/r;->E:Ljava/lang/Object;

    iput-object p2, p0, Lm40/r;->F:Ljava/lang/Object;

    iput p3, p0, Lm40/r;->y:I

    iput p4, p0, Lm40/r;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ln0/u;IILq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm40/r;->w:I

    .line 2
    iput-object p1, p0, Lm40/r;->F:Ljava/lang/Object;

    iput p2, p0, Lm40/r;->y:I

    iput p3, p0, Lm40/r;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10

    iget v0, p0, Lm40/r;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lm40/r;

    iget-object v1, p0, Lm40/r;->F:Ljava/lang/Object;

    check-cast v1, Ln0/u;

    iget v2, p0, Lm40/r;->y:I

    iget v3, p0, Lm40/r;->z:I

    invoke-direct {v0, v1, v2, v3, p2}, Lm40/r;-><init>(Ln0/u;IILq83/d;)V

    iput-object p1, v0, Lm40/r;->E:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v4, Lm40/r;

    iget-object p1, p0, Lm40/r;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lm40/w;

    iget-object p1, p0, Lm40/r;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    iget v7, p0, Lm40/r;->y:I

    iget v8, p0, Lm40/r;->z:I

    move-object v9, p2

    invoke-direct/range {v4 .. v9}, Lm40/r;-><init>(Lm40/w;Ljava/lang/String;IILq83/d;)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lm40/r;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm40/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm40/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm40/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm40/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm40/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm40/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lm40/r;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lm40/r;->x:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lm40/r;->E:Ljava/lang/Object;

    check-cast v0, Lh0/k2;

    iget-object v2, p0, Lm40/r;->F:Ljava/lang/Object;

    check-cast v2, Ln0/u;

    new-instance v3, Ln0/r;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v2, v4}, Ln0/r;-><init>(Lh0/k2;Lh0/x2;I)V

    iget-object v0, v2, Ln0/u;->f:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/n;

    iget-object v4, v0, Ln0/n;->i:Ly3/c;

    iput v1, p0, Lm40/r;->x:I

    iget v1, p0, Lm40/r;->y:I

    iget v2, p0, Lm40/r;->z:I

    move-object v0, v3

    const/16 v3, 0x64

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lp0/r0;->a(Ln0/r;IIILy3/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v6, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v6

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lm40/r;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lm40/r;->E:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lm40/w;

    iget-object v1, p0, Lm40/r;->F:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    new-instance v6, Lm40/q;

    iget v10, p0, Lm40/r;->z:I

    const/4 v11, 0x0

    iget v9, p0, Lm40/r;->y:I

    invoke-direct/range {v6 .. v11}, Lm40/q;-><init>(Lm40/w;Ljava/lang/String;IILq83/d;)V

    iput v2, p0, Lm40/r;->x:I

    invoke-static {v7, v8, v6, p0}, Lm40/w;->e(Lm40/w;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, v1

    :goto_2
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
