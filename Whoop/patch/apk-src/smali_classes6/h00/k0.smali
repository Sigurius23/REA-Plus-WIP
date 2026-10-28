.class public final Lh00/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Lx1/b;


# direct methods
.method public constructor <init>(IFLx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh00/k0;->w:I

    iput p2, p0, Lh00/k0;->x:F

    iput-object p3, p0, Lh00/k0;->y:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "$this$BoxWithConstraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 p3, p3, 0x13

    const/16 v0, 0x12

    if-ne p3, v0, :cond_3

    move-object p3, p2

    check-cast p3, Lp1/q;

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    iget p3, p0, Lh00/k0;->w:I

    int-to-float p3, p3

    iget v0, p0, Lh00/k0;->x:F

    mul-float/2addr p3, v0

    new-instance v0, Ly3/f;

    invoke-direct {v0, p3}, Ly3/f;-><init>(F)V

    check-cast p1, Landroidx/compose/foundation/layout/c;

    invoke-virtual {p1}, Landroidx/compose/foundation/layout/c;->c()F

    move-result p1

    new-instance p3, Ly3/f;

    invoke-direct {p3, p1}, Ly3/f;-><init>(F)V

    invoke-virtual {v0, p3}, Ly3/f;->compareTo(Ljava/lang/Object;)I

    move-result p1

    if-lez p1, :cond_4

    move-object v0, p3

    :cond_4
    sget-object p1, Lb2/t;->w:Lb2/t;

    const/4 p3, 0x0

    iget v0, v0, Ly3/f;->w:F

    invoke-static {p1, v0, p3, v1}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p3, Lb2/e;->w:Lb2/m;

    const/4 v0, 0x0

    invoke-static {p3, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p3

    invoke-static {p2}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v0

    move-object v1, p2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {p2, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-eqz v4, :cond_5

    invoke-virtual {v1, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_2
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {p2, v3, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {p2, p3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-nez v2, :cond_6

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    invoke-static {v0, v1, v0, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {p2, p3, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    const/4 p3, 0x6

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget-object v0, p0, Lh00/k0;->y:Lx1/b;

    invoke-virtual {v0, p1, p2, p3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Lp1/q;->q(Z)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
