.class public final Lf1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:Z

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lf1/m;


# direct methods
.method public constructor <init>(JZLandroidx/compose/ui/Modifier;Lf1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf1/c;->w:J

    iput-boolean p3, p0, Lf1/c;->x:Z

    iput-object p4, p0, Lf1/c;->y:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lf1/c;->z:Lf1/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

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

    if-eqz p2, :cond_a

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iget-wide v4, p0, Lf1/c;->w:J

    cmp-long p2, v4, v0

    sget-object v0, Lp1/l;->a:Lp1/v0;

    iget-object v1, p0, Lf1/c;->z:Lf1/m;

    iget-boolean v6, p0, Lf1/c;->x:Z

    if-eqz p2, :cond_7

    const p2, 0x34c4c6

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    if-eqz v6, :cond_1

    sget-object p2, Ll0/f;->b:Ll0/e;

    goto :goto_1

    :cond_1
    sget-object p2, Ll0/f;->a:Ll0/e;

    :goto_1
    invoke-static {v4, v5}, Ly3/h;->c(J)F

    move-result v8

    invoke-static {v4, v5}, Ly3/h;->b(J)F

    move-result v9

    const/4 v11, 0x0

    const/16 v12, 0xc

    iget-object v7, p0, Lf1/c;->y:Landroidx/compose/ui/Modifier;

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/d;->n(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {p2, v5, p1, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object p2

    iget-wide v7, p1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {p1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v9, p1, Lp1/q;->S:Z

    if-eqz v9, :cond_2

    invoke-virtual {p1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_2
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {p1, v8, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {p1, p2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-nez v7, :cond_3

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    :cond_3
    invoke-static {v5, p1, v5, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {p1, p2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez p2, :cond_5

    if-ne v4, v0, :cond_6

    :cond_5
    new-instance v4, Lf1/b;

    const/4 p2, 0x0

    invoke-direct {v4, v1, p2}, Lf1/b;-><init>(Lf1/m;I)V

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lc93/a;

    const/4 p2, 0x6

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4, v6, p1, p2}, Lf1/y0;->f(Landroidx/compose/ui/Modifier;Lc93/a;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    const p2, 0x42f938

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_8

    if-ne v2, v0, :cond_9

    :cond_8
    new-instance v2, Lf1/b;

    const/4 p2, 0x1

    invoke-direct {v2, v1, p2}, Lf1/b;-><init>(Lf1/m;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lc93/a;

    iget-object p2, p0, Lf1/c;->y:Landroidx/compose/ui/Modifier;

    invoke-static {p2, v2, v6, p1, v3}, Lf1/y0;->f(Landroidx/compose/ui/Modifier;Lc93/a;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_a
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
