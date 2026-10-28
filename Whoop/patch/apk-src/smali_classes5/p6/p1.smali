.class public final synthetic Lp6/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc93/m;JLp6/u1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lp6/p1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/p1;->x:Ljava/lang/Object;

    iput-wide p2, p0, Lp6/p1;->y:J

    iput-object p4, p0, Lp6/p1;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lf1/m;Landroidx/compose/ui/Modifier;JI)V
    .locals 0

    .line 2
    const/4 p5, 0x2

    iput p5, p0, Lp6/p1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/p1;->z:Ljava/lang/Object;

    iput-object p2, p0, Lp6/p1;->x:Ljava/lang/Object;

    iput-wide p3, p0, Lp6/p1;->y:J

    return-void
.end method

.method public synthetic constructor <init>(Lp6/u1;JLc93/m;I)V
    .locals 0

    .line 3
    const/4 p5, 0x0

    iput p5, p0, Lp6/p1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/p1;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lp6/p1;->y:J

    iput-object p4, p0, Lp6/p1;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lp6/p1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp6/p1;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf1/m;

    iget-object v0, p0, Lp6/p1;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-wide v3, p0, Lp6/p1;->y:J

    invoke-static/range {v1 .. v6}, Lu0/b;->a(Lf1/m;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp6/p1;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lp6/p1;->z:Ljava/lang/Object;

    check-cast v1, Lp6/u1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v2, 0x2

    if-ne p2, v2, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_1
    :goto_1
    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne p2, v2, :cond_2

    sget-object p2, Lp6/q1;->w:Lp6/q1;

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p2, Lj93/g;

    check-cast p2, Lc93/a;

    const v2, -0x28c122f7

    invoke-virtual {p1, v2}, Lp1/q;->f0(I)V

    const v2, -0x20ad3f64

    invoke-virtual {p1, v2}, Lp1/q;->f0(I)V

    iget-object v2, p1, Lp1/q;->a:Lhb3/a0;

    instance-of v2, v2, Ln6/b;

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lp1/q;->c0()V

    iget-boolean v2, p1, Lp1/q;->S:Z

    if-eqz v2, :cond_3

    invoke-virtual {p1, p2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_2
    new-instance p2, Ly3/h;

    iget-wide v2, p0, Lp6/p1;->y:J

    invoke-direct {p2, v2, v3}, Ly3/h;-><init>(J)V

    new-instance v2, Lp0/w0;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lp0/w0;-><init>(I)V

    invoke-static {p1, v2, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance p2, Lp0/w0;

    const/4 v2, 0x5

    invoke-direct {p2, v2}, Lp0/w0;-><init>(I)V

    invoke-static {p1, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    invoke-static {}, Lp1/x;->w()V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object v0, p0, Lp6/p1;->z:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp6/u1;

    iget-object v0, p0, Lp6/p1;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/m;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v1

    iget-wide v2, p0, Lp6/p1;->y:J

    invoke-static/range {v1 .. v6}, Lcom/squareup/wire/n;->a(IJLandroidx/compose/runtime/Composer;Lc93/m;Lp6/u1;)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
