.class public final Lg1/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lg1/a3;->w:I

    iput-wide p1, p0, Lg1/a3;->x:J

    iput-object p3, p0, Lg1/a3;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lg1/a3;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iget-wide v4, p0, Lg1/a3;->x:J

    cmp-long p2, v4, v0

    if-eqz p2, :cond_4

    const p2, -0x4a262578

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    iget-object p2, p0, Lg1/a3;->y:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Landroidx/compose/ui/Modifier;

    invoke-static {v4, v5}, Ly3/h;->c(J)F

    move-result v7

    invoke-static {v4, v5}, Ly3/h;->b(J)F

    move-result v8

    const/4 v10, 0x0

    const/16 v11, 0xc

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/d;->n(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Lb2/e;->x:Lb2/m;

    invoke-static {v0, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v4, p1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, p1, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v1, p1, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-static {p2, v3, p1, v2}, Lu0/b;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const p2, -0x4a2083ba

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    iget-object p2, p0, Lg1/a3;->y:Ljava/lang/Object;

    check-cast p2, Landroidx/compose/ui/Modifier;

    invoke-static {p2, v3, p1, v3}, Lu0/b;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_6

    move v0, v2

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p2, Lg1/j1;->a:Lp1/b0;

    iget-wide v0, p0, Lg1/a3;->x:J

    invoke-static {v0, v1}, Li2/x;->e(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v0, Lb30/l4;

    iget-object v1, p0, Lg1/a3;->y:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lb30/l4;-><init>(Lx1/b;I)V

    const v1, -0x3fe9e356

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
