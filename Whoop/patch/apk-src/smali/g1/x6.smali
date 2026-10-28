.class public final Lg1/x6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lf0/t;

.field public final synthetic F:F

.field public final synthetic G:Lc93/m;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Li2/a1;

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Li2/a1;JFLf0/t;FLc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/x6;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/x6;->x:Li2/a1;

    iput-wide p3, p0, Lg1/x6;->y:J

    iput p5, p0, Lg1/x6;->z:F

    iput-object p6, p0, Lg1/x6;->E:Lf0/t;

    iput p7, p0, Lg1/x6;->F:F

    iput-object p8, p0, Lg1/x6;->G:Lc93/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p2, :cond_6

    sget-object p2, Lg1/u2;->a:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg1/s1;

    iget v1, p0, Lg1/x6;->z:F

    iget-wide v4, p0, Lg1/x6;->y:J

    invoke-static {v4, v5, p2, v1, p1}, Lhg3/i;->o(JLg1/s1;FLp1/q;)J

    move-result-wide v8

    iget-object v10, p0, Lg1/x6;->E:Lf0/t;

    iget v11, p0, Lg1/x6;->F:F

    iget-object v6, p0, Lg1/x6;->w:Landroidx/compose/ui/Modifier;

    iget-object v7, p0, Lg1/x6;->x:Li2/a1;

    invoke-static/range {v6 .. v11}, Lhg3/i;->n(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;F)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v1, v4, :cond_1

    new-instance v1, Lf0/q1;

    const/4 v5, 0x7

    invoke-direct {v1, v5}, Lf0/q1;-><init>(I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v2, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_2

    sget-object v1, Lg1/w6;->w:Lg1/w6;

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {p2, v0, v1}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, p1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {p1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p1, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p1, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4, p1, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p1, v1, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object p2, p0, Lg1/x6;->G:Lc93/m;

    invoke-static {v2, p2, p1, v3}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    return-object v0

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    return-object v0
.end method
