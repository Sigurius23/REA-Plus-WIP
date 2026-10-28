.class public final Lzc1/v1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/v1;->b(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p2, v2

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    const p1, -0x45a895dd

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p1, v7, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->o()J

    move-result-wide p1

    sget-object v0, Li2/w0;->a:Li2/v0;

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v10, p1, p2, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    int-to-float p2, v3

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr v0, p2

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr p2, v0

    invoke-static {p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v0, v3, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, v7, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Le11/c;->k()Le11/d;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p1, v0, :cond_4

    sget-object p1, Lzc1/v1$b;->w:Lzc1/v1$b;

    invoke-virtual {v7, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v6, p1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget p1, Le11/d;->f:I

    shl-int/lit8 p1, p1, 0x3

    or-int/lit16 v8, p1, 0x180

    const/4 v9, 0x1

    const/4 v4, 0x0

    invoke-static/range {v4 .. v9}, Le11/c;->e(Landroidx/compose/ui/Modifier;Le11/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {p2, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {v7, p1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Le11/c;->j()Le11/d;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    sget-object p1, Lzc1/v1$c;->w:Lzc1/v1$c;

    invoke-virtual {v7, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, p1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x1

    const/4 v4, 0x0

    invoke-static/range {v4 .. v9}, Le11/c;->e(Landroidx/compose/ui/Modifier;Le11/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_6
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lzc1/v1$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
