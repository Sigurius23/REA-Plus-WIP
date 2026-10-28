.class public final Lr20/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr20/s;
.implements Ljava/io/Closeable;


# instance fields
.field public final E:F

.field public final F:F

.field public final G:F

.field public final H:Z

.field public final w:Ld30/v;

.field public final x:Z

.field public final y:Lec3/r1;

.field public final z:Z


# direct methods
.method public constructor <init>(Ld30/v;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr20/r;->w:Ld30/v;

    iput-boolean p2, p0, Lr20/r;->x:Z

    new-instance p1, Lr20/b;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, Lr20/b;-><init>(ZLr20/a;)V

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lr20/r;->y:Lec3/r1;

    iput-boolean v0, p0, Lr20/r;->z:Z

    const/4 p1, 0x0

    int-to-float p1, p1

    iput p1, p0, Lr20/r;->E:F

    sget p1, Lr20/t;->a:F

    iput p1, p0, Lr20/r;->F:F

    sget p1, Lr20/t;->c:F

    iput p1, p0, Lr20/r;->G:F

    iput-boolean v0, p0, Lr20/r;->H:Z

    return-void
.end method


# virtual methods
.method public final J(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 7

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, 0x54c5c90b

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    const/16 v5, 0x180

    const/4 v6, 0x0

    iget-object v1, p0, Lr20/r;->w:Ld30/v;

    iget-boolean v2, p0, Lr20/r;->x:Z

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lse/g;->m(Ld30/v;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x0

    invoke-virtual {v4, p1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final T()Z
    .locals 1

    iget-boolean v0, p0, Lr20/r;->z:Z

    return v0
.end method

.method public final a0(ZZ)Lec3/f2;
    .locals 0

    const/4 p1, 0x0

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lec3/r1;
    .locals 1

    iget-object v0, p0, Lr20/r;->y:Lec3/r1;

    return-object v0
.end method

.method public final b0(Z)Lec3/f2;
    .locals 0

    iget-boolean p1, p0, Lr20/r;->x:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lr20/r;->w:Ld30/v;

    iget-object v0, v0, Ld30/v;->i:Lbc3/c0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final h()Lr20/h;
    .locals 1

    sget-object v0, Lr20/h;->x:Lr20/h;

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lr20/r;->F:F

    return v0
.end method

.method public final k()Lec3/f2;
    .locals 5

    iget-object v0, p0, Lr20/r;->w:Ld30/v;

    iget-boolean v0, v0, Ld30/v;->h:Z

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

    iget v0, p0, Lr20/r;->E:F

    return v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lr20/r;->H:Z

    return v0
.end method

.method public final x()F
    .locals 1

    iget v0, p0, Lr20/r;->G:F

    return v0
.end method
