.class public final Ll1/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:J

.field public final synthetic y:Lx1/b;


# direct methods
.method public constructor <init>(FJLx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll1/t4;->w:F

    iput-wide p2, p0, Ll1/t4;->x:J

    iput-object p4, p0, Ll1/t4;->y:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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

    if-eqz p2, :cond_4

    sget v5, Ll1/u4;->c:F

    sget v6, Ll1/u4;->b:F

    const/4 v8, 0x0

    const/16 v9, 0x8

    sget-object v4, Lb2/t;->w:Lb2/t;

    iget v7, p0, Ll1/t4;->w:F

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/d;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Ll1/u4;->d:Ll0/l1;

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Lb2/e;->w:Lb2/m;

    invoke-static {v0, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v1, p1, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {p1, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p1, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v2, p1, Lp1/q;->S:Z

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v1, p1, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, Lo1/r;->d:Lo1/c0;

    invoke-static {p2, p1}, Ll1/z4;->a(Lo1/c0;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object p2

    sget-object v0, Ll1/s;->a:Lp1/b0;

    new-instance v1, Li2/x;

    iget-wide v4, p0, Ll1/t4;->x:J

    invoke-direct {v1, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v1}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    sget-object v1, Ll1/o4;->a:Lp1/b0;

    invoke-virtual {v1, p2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    filled-new-array {v0, p2}, [Lp1/u1;

    move-result-object p2

    const/16 v0, 0x8

    iget-object v1, p0, Ll1/t4;->y:Lx1/b;

    invoke-static {p2, v1, p1, v0}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
