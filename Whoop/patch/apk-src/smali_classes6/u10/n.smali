.class public final Lu10/n;
.super Lu10/p;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Ld30/h;


# direct methods
.method public constructor <init>(Ld30/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu10/n;->w:Ld30/h;

    return-void
.end method


# virtual methods
.method public final b(Lp1/q;)V
    .locals 7

    const v0, -0x4fd06af4

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

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_0

    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_0
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, p1, Lp1/q;->S:Z

    if-nez v3, :cond_1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    invoke-static {v1, p1, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v0, p0, Lu10/n;->w:Ld30/h;

    invoke-static {v0, p1, v2}, Lds/q;->f(Ld30/h;Landroidx/compose/runtime/Composer;I)V

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v1, 0x6

    invoke-static {v0, v1, p1, v2}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lu10/n;->w:Ld30/h;

    iget-object v0, v0, Ld30/h;->h:Ljava/lang/Object;

    check-cast v0, Lhc3/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final i()Lec3/f2;
    .locals 3

    iget-object v0, p0, Lu10/n;->w:Ld30/h;

    iget-object v0, v0, Ld30/h;->j:Ljava/lang/Object;

    check-cast v0, Ln53/e;

    new-instance v1, Lu0/r;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lu0/r;-><init>(I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lec3/f2;
    .locals 3

    iget-object v0, p0, Lu10/n;->w:Ld30/h;

    iget-object v0, v0, Ld30/h;->j:Ljava/lang/Object;

    check-cast v0, Ln53/e;

    new-instance v1, Lrq0/x;

    const/16 v2, 0x1a

    invoke-direct {v1, p0, v2}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method
