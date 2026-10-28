.class public final Lr20/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr20/s;


# instance fields
.field public final E:F

.field public final F:F

.field public final G:Z

.field public final w:Ld30/u;

.field public final x:Lec3/r1;

.field public final y:Z

.field public final z:F


# direct methods
.method public constructor <init>(Ld30/u;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr20/q;->w:Ld30/u;

    new-instance p1, Lr20/b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v1, v0}, Lr20/b;-><init>(ZLr20/a;)V

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lr20/q;->x:Lec3/r1;

    iput-boolean v1, p0, Lr20/q;->y:Z

    const/4 p1, 0x0

    int-to-float p1, p1

    iput p1, p0, Lr20/q;->z:F

    sget p1, Lr20/t;->a:F

    iput p1, p0, Lr20/q;->E:F

    sget p1, Lr20/t;->c:F

    iput p1, p0, Lr20/q;->F:F

    iput-boolean v1, p0, Lr20/q;->G:Z

    return-void
.end method


# virtual methods
.method public final J(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 2

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, -0x46a3ed91

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v0

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    iget-object v0, p0, Lr20/q;->w:Ld30/u;

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, Ls2/e;->c(Ld30/u;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final T()Z
    .locals 1

    iget-boolean v0, p0, Lr20/q;->y:Z

    return v0
.end method

.method public final a0(ZZ)Lec3/f2;
    .locals 0

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const p1, 0x7f1410cc

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    const p1, 0x7f14107a

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lec3/r1;
    .locals 1

    iget-object v0, p0, Lr20/q;->x:Lec3/r1;

    return-object v0
.end method

.method public final b0(Z)Lec3/f2;
    .locals 0

    iget-object p1, p0, Lr20/q;->w:Ld30/u;

    iget-object p1, p1, Ld30/u;->t:Ln53/e;

    return-object p1
.end method

.method public final h()Lr20/h;
    .locals 1

    sget-object v0, Lr20/h;->x:Lr20/h;

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lr20/q;->E:F

    return v0
.end method

.method public final k()Lec3/f2;
    .locals 5

    iget-object v0, p0, Lr20/q;->w:Ld30/u;

    iget-boolean v0, v0, Ld30/u;->r:Z

    new-instance v1, Lb30/j3;

    xor-int/lit8 v0, v0, 0x1

    const/4 v2, 0x0

    new-instance v3, Lou1/a;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lou1/a;-><init>(I)V

    invoke-direct {v1, v0, v2, v2, v3}, Lb30/j3;-><init>(ZZZLc93/a;)V

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, Lr20/q;->z:F

    return v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lr20/q;->G:Z

    return v0
.end method

.method public final x()F
    .locals 1

    iget v0, p0, Lr20/q;->F:F

    return v0
.end method
