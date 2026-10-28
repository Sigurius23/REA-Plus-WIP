.class public final Lm1/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lp1/t2;

.field public final synthetic x:J

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:Lc93/m;


# direct methods
.method public constructor <init>(Ld0/v1;JLl3/v0;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/h0;->w:Lp1/t2;

    iput-wide p2, p0, Lm1/h0;->x:J

    iput-object p4, p0, Lm1/h0;->y:Ll3/v0;

    iput-object p5, p0, Lm1/h0;->z:Lc93/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    and-int/2addr p3, v3

    move-object v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p0, Lm1/h0;->w:Lp1/t2;

    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_3

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v0, p3, :cond_4

    :cond_3
    new-instance v0, Lb;

    const/4 p3, 0x7

    invoke-direct {v0, p2, p3}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Lb2/e;->w:Lb2/m;

    invoke-static {p2, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

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

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-eqz v2, :cond_5

    invoke-virtual {v8, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_2
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v8, v1, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v8, p2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    invoke-static {p3, v8, p3, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v8, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v9, 0x0

    iget-wide v4, p0, Lm1/h0;->x:J

    iget-object v6, p0, Lm1/h0;->y:Ll3/v0;

    iget-object v7, p0, Lm1/h0;->z:Lc93/m;

    invoke-static/range {v4 .. v9}, Lm1/l0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
