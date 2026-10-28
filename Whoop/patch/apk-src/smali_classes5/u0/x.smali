.class public final Lu0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lq3/y;

.field public final synthetic G:Lq3/r;

.field public final synthetic H:Ly3/c;

.field public final synthetic I:I

.field public final synthetic w:Lf1/s1;

.field public final synthetic x:Lu0/s0;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lf1/s1;Lu0/s0;ZZLkotlin/jvm/functions/Function1;Lq3/y;Lq3/r;Ly3/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/x;->w:Lf1/s1;

    iput-object p2, p0, Lu0/x;->x:Lu0/s0;

    iput-boolean p3, p0, Lu0/x;->y:Z

    iput-boolean p4, p0, Lu0/x;->z:Z

    iput-object p5, p0, Lu0/x;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lu0/x;->F:Lq3/y;

    iput-object p7, p0, Lu0/x;->G:Lq3/r;

    iput-object p8, p0, Lu0/x;->H:Ly3/c;

    iput p9, p0, Lu0/x;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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

    if-eqz p2, :cond_6

    new-instance v4, Lu0/w;

    iget-object v9, p0, Lu0/x;->H:Ly3/c;

    iget v10, p0, Lu0/x;->I:I

    iget-object v5, p0, Lu0/x;->x:Lu0/s0;

    iget-object v6, p0, Lu0/x;->E:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lu0/x;->F:Lq3/y;

    iget-object v8, p0, Lu0/x;->G:Lq3/r;

    invoke-direct/range {v4 .. v10}, Lu0/w;-><init>(Lu0/s0;Lkotlin/jvm/functions/Function1;Lq3/y;Lq3/r;Ly3/c;I)V

    iget-wide v0, p1, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result p2

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p1, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {p1, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, p1, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {p2, p1, p2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {p1, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Lu0/s0;->a()Lu0/g0;

    move-result-object p2

    sget-object v0, Lu0/g0;->w:Lu0/g0;

    iget-boolean v1, p0, Lu0/x;->y:Z

    if-eq p2, v0, :cond_4

    invoke-virtual {v5}, Lu0/s0;->c()Ly2/y;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {v5}, Lu0/s0;->c()Ly2/y;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p2}, Ly2/y;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_2
    iget-object p2, p0, Lu0/x;->w:Lf1/s1;

    invoke-static {p2, v2, p1, v3}, Lu0/n0;->f(Lf1/s1;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5}, Lu0/s0;->a()Lu0/g0;

    move-result-object v0

    sget-object v2, Lu0/g0;->y:Lu0/g0;

    if-ne v0, v2, :cond_5

    iget-boolean v0, p0, Lu0/x;->z:Z

    if-nez v0, :cond_5

    if-eqz v1, :cond_5

    const v0, -0x2a98f0d6

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    invoke-static {p2, p1, v3}, Lu0/n0;->g(Lf1/s1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    const p2, -0x2a97c486

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
