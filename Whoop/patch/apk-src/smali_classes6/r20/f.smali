.class public final Lr20/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr20/s;
.implements Ljava/io/Closeable;


# instance fields
.field public final E:F

.field public final F:F

.field public final G:Lr20/h;

.field public final H:Z

.field public final w:Lb30/j0;

.field public final x:Lec3/r1;

.field public final y:Z

.field public final z:F


# direct methods
.method public constructor <init>(Lb30/j0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr20/f;->w:Lb30/j0;

    new-instance p1, Lr20/b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v1, v0}, Lr20/b;-><init>(ZLr20/a;)V

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lr20/f;->x:Lec3/r1;

    iput-boolean v1, p0, Lr20/f;->y:Z

    const/4 p1, 0x0

    int-to-float p1, p1

    iput p1, p0, Lr20/f;->z:F

    sget p1, Lr20/t;->a:F

    iput p1, p0, Lr20/f;->E:F

    sget p1, Lr20/t;->b:F

    iput p1, p0, Lr20/f;->F:F

    sget-object p1, Lr20/h;->w:Lr20/h;

    iput-object p1, p0, Lr20/f;->G:Lr20/h;

    iput-boolean v1, p0, Lr20/f;->H:Z

    return-void
.end method


# virtual methods
.method public final J(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 2

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, -0x3b26e127

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    iget-object v0, p0, Lr20/f;->w:Lb30/j0;

    const/16 v1, 0x30

    invoke-static {v0, p2, p1, v1}, Lse/a;->b(Lb30/j0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final T()Z
    .locals 1

    iget-boolean v0, p0, Lr20/f;->y:Z

    return v0
.end method

.method public final a0(ZZ)Lec3/f2;
    .locals 3

    iget-object v0, p0, Lr20/f;->w:Lb30/j0;

    iget-object v0, v0, Lb30/j0;->r:Lec3/h2;

    new-instance v1, Lr20/e;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p2, p1}, Lr20/e;-><init>(IZZ)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lec3/r1;
    .locals 1

    iget-object v0, p0, Lr20/f;->x:Lec3/r1;

    return-object v0
.end method

.method public final b0(Z)Lec3/f2;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lr20/f;->w:Lb30/j0;

    iget-object v0, v0, Lb30/j0;->k:Lhc3/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final h()Lr20/h;
    .locals 1

    iget-object v0, p0, Lr20/f;->G:Lr20/h;

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lr20/f;->E:F

    return v0
.end method

.method public final k()Lec3/f2;
    .locals 5

    iget-object v0, p0, Lr20/f;->w:Lb30/j0;

    iget-boolean v0, v0, Lb30/j0;->n:Z

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

    iget v0, p0, Lr20/f;->z:F

    return v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lr20/f;->H:Z

    return v0
.end method

.method public final x()F
    .locals 1

    iget v0, p0, Lr20/f;->F:F

    return v0
.end method
