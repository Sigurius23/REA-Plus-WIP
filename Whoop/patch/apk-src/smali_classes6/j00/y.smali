.class public final Lj00/y;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg2/i;

.field public final synthetic y:Lb3/x2;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lg2/i;Lb3/x2;Lp1/c1;Lq83/d;I)V
    .locals 0

    iput p5, p0, Lj00/y;->w:I

    iput-object p1, p0, Lj00/y;->x:Lg2/i;

    iput-object p2, p0, Lj00/y;->y:Lb3/x2;

    iput-object p3, p0, Lj00/y;->z:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    iget p1, p0, Lj00/y;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lj00/y;

    iget-object v3, p0, Lj00/y;->z:Lp1/c1;

    const/4 v5, 0x1

    iget-object v1, p0, Lj00/y;->x:Lg2/i;

    iget-object v2, p0, Lj00/y;->y:Lb3/x2;

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lj00/y;-><init>(Lg2/i;Lb3/x2;Lp1/c1;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v4, p2

    new-instance v1, Lj00/y;

    move-object v5, v4

    iget-object v4, p0, Lj00/y;->z:Lp1/c1;

    const/4 v6, 0x0

    iget-object v2, p0, Lj00/y;->x:Lg2/i;

    iget-object v3, p0, Lj00/y;->y:Lb3/x2;

    invoke-direct/range {v1 .. v6}, Lj00/y;-><init>(Lg2/i;Lb3/x2;Lp1/c1;Lq83/d;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj00/y;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lj00/y;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj00/y;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj00/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lj00/y;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj00/y;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj00/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lj00/y;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lj00/y;->y:Lb3/x2;

    const/4 v3, 0x1

    iget-object v4, p0, Lj00/y;->x:Lg2/i;

    iget-object v5, p0, Lj00/y;->z:Lp1/c1;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj00/k;

    iget-object p1, p1, Lj00/k;->k:Ln00/d;

    sget-object v0, Ln00/d;->w:Ln00/d;

    if-ne p1, v0, :cond_0

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj00/k;

    iget-object p1, p1, Lj00/k;->a:Lj00/i0;

    if-eqz p1, :cond_0

    check-cast v4, Lg2/l;

    invoke-virtual {v4, v3}, Lg2/l;->b(Z)V

    if-eqz v2, :cond_0

    check-cast v2, Lb3/x1;

    invoke-virtual {v2}, Lb3/x1;->a()V

    :cond_0
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj00/k;

    iget-object p1, p1, Lj00/k;->k:Ln00/d;

    sget-object v0, Ln00/d;->w:Ln00/d;

    if-ne p1, v0, :cond_1

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj00/k;

    iget-object p1, p1, Lj00/k;->a:Lj00/i0;

    if-eqz p1, :cond_1

    check-cast v4, Lg2/l;

    invoke-virtual {v4, v3}, Lg2/l;->b(Z)V

    if-eqz v2, :cond_1

    check-cast v2, Lb3/x1;

    invoke-virtual {v2}, Lb3/x1;->a()V

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
