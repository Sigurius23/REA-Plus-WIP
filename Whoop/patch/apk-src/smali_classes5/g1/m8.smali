.class public final Lg1/m8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Lg1/e8;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(FLg1/e8;ZLc93/m;I)V
    .locals 0

    iput p5, p0, Lg1/m8;->w:I

    iput p1, p0, Lg1/m8;->x:F

    iput-object p2, p0, Lg1/m8;->y:Lg1/e8;

    iput-boolean p3, p0, Lg1/m8;->z:Z

    iput-object p4, p0, Lg1/m8;->E:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lg1/m8;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/Modifier;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string p3, "modifier"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p2, 0x6

    if-nez p3, :cond_1

    move-object p3, v4

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p2, p3

    :cond_1
    and-int/lit8 p2, p2, 0x13

    const/16 p3, 0x12

    if-ne p2, p3, :cond_3

    move-object p2, v4

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    iget p2, p0, Lg1/m8;->x:F

    invoke-static {p2, p1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Lb2/e;->w:Lb2/m;

    const/4 p3, 0x0

    invoke-static {p2, p3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    invoke-static {v4}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v0

    move-object v7, v4

    check-cast v7, Lp1/q;

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v4, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v2, La3/l;->a:La3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-eqz v3, :cond_4

    invoke-virtual {v7, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_2
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v4, v2, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v4, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    invoke-static {v0, v7, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v4, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/m8;->y:Lg1/e8;

    check-cast p1, Lg1/y1;

    const p2, 0xfc885ec

    invoke-virtual {v7, p2}, Lp1/q;->e0(I)V

    iget-boolean p2, p0, Lg1/m8;->z:Z

    if-eqz p2, :cond_7

    iget-wide p1, p1, Lg1/y1;->t:J

    goto :goto_3

    :cond_7
    iget-wide p1, p1, Lg1/y1;->u:J

    :goto_3
    new-instance v0, Li2/x;

    invoke-direct {v0, p1, p2}, Li2/x;-><init>(J)V

    invoke-static {v0, v7}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p1

    invoke-virtual {v7, p3}, Lp1/q;->q(Z)V

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/x;

    iget-wide v0, p1, Li2/x;->a:J

    sget-object p1, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v7, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/h9;

    iget-object v2, p1, Lg1/h9;->g:Ll3/v0;

    const/4 v5, 0x0

    const/4 v6, 0x4

    iget-object v3, p0, Lg1/m8;->E:Lc93/m;

    invoke-static/range {v0 .. v6}, Lvp/c;->k(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x1

    invoke-virtual {v7, p1}, Lp1/q;->q(Z)V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_9

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x4

    goto :goto_5

    :cond_8
    const/4 v0, 0x2

    :goto_5
    or-int/2addr p3, v0

    :cond_9
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_a

    move v0, v2

    goto :goto_6

    :cond_a
    move v0, v3

    :goto_6
    and-int/2addr p3, v2

    move-object v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_f

    iget p2, p0, Lg1/m8;->x:F

    invoke-static {p2, p1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Lb2/e;->w:Lb2/m;

    invoke-static {p2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    iget-wide v0, v8, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result p3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    invoke-static {v8, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v1, La3/l;->a:La3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_b

    invoke-virtual {v8, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_7
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v8, v1, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v8, p2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    invoke-static {p3, v8, p3, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v8, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/m8;->y:Lg1/e8;

    check-cast p1, Lg1/y1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p2, 0xfc885ec

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    iget-boolean p2, p0, Lg1/m8;->z:Z

    if-eqz p2, :cond_e

    iget-wide p1, p1, Lg1/y1;->t:J

    goto :goto_8

    :cond_e
    iget-wide p1, p1, Lg1/y1;->u:J

    :goto_8
    new-instance p3, Li2/x;

    invoke-direct {p3, p1, p2}, Li2/x;-><init>(J)V

    invoke-static {p3, v8}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/x;

    iget-wide v4, p1, Li2/x;->a:J

    sget-object p1, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v8, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/h9;

    iget-object v6, p1, Lg1/h9;->g:Ll3/v0;

    const/4 v9, 0x0

    const/4 v10, 0x4

    iget-object v7, p0, Lg1/m8;->E:Lc93/m;

    invoke-static/range {v4 .. v10}, Lg1/p8;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_f
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
