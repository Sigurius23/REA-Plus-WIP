.class public final Lu10/o;
.super Lu10/p;
.source "SourceFile"


# instance fields
.field public final w:Lb30/y0;


# direct methods
.method public constructor <init>(Lb30/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu10/o;->w:Lb30/y0;

    return-void
.end method


# virtual methods
.method public final b(Lp1/q;)V
    .locals 8

    const v0, 0x57c31cbc

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v3, p1, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-eqz v7, :cond_0

    invoke-virtual {p1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_0
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, p1, Lp1/q;->S:Z

    if-nez v3, :cond_1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    invoke-static {v1, p1, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v0, p0, Lu10/o;->w:Lb30/y0;

    const/16 v1, 0x30

    invoke-static {v0, v4, p1, v1}, Luf/c0;->w(Lb30/y0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/16 v0, 0x10

    int-to-float v0, v0

    const/4 v1, 0x6

    invoke-static {v0, v1, p1, v2}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lu10/o;->w:Lb30/y0;

    iget-object v0, v0, Lb30/y0;->E:Ln53/e;

    iget-object v0, v0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb30/c6;

    iget-object v0, v0, Lb30/c6;->b:Lb30/d6;

    iget-boolean v0, v0, Lb30/d6;->w:Z

    return v0
.end method

.method public final i()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lu10/o;->w:Lb30/y0;

    iget-object v0, v0, Lb30/y0;->y:Lzy/b;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lu10/o;->w:Lb30/y0;

    iget-object v0, v0, Lb30/y0;->z:Lb30/j3;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method
