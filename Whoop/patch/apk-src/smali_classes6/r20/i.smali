.class public final Lr20/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr20/s;


# instance fields
.field public final E:F

.field public final w:Lw20/b0;

.field public final x:Lec3/r1;

.field public final y:F

.field public final z:F


# direct methods
.method public constructor <init>(Lw20/b0;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr20/i;->w:Lw20/b0;

    new-instance p1, Lr20/b;

    new-instance v0, Lr20/a;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    sget-object v3, Lm83/y;->w:Lm83/y;

    const v4, 0x7f14107c

    invoke-static {v4, v2, v3}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v2

    invoke-direct {v0, v2}, Lr20/a;-><init>(Lzy/b;)V

    const/4 v2, 0x1

    invoke-direct {p1, v2, v0}, Lr20/b;-><init>(ZLr20/a;)V

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lr20/i;->x:Lec3/r1;

    int-to-float p1, v1

    iput p1, p0, Lr20/i;->y:F

    sget p1, Lr20/t;->a:F

    iput p1, p0, Lr20/i;->z:F

    sget p1, Lr20/t;->c:F

    iput p1, p0, Lr20/i;->E:F

    return-void
.end method


# virtual methods
.method public final J(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 1

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, -0x1f1634a3

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    iget-object p2, p0, Lr20/i;->w:Lw20/b0;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Ls2/d;->c(Lw20/b0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final T()Z
    .locals 1

    const/4 v0, 0x0

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

    iget-object v0, p0, Lr20/i;->x:Lec3/r1;

    return-object v0
.end method

.method public final b0(Z)Lec3/f2;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final h()Lr20/h;
    .locals 1

    sget-object v0, Lr20/h;->x:Lr20/h;

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lr20/i;->z:F

    return v0
.end method

.method public final k()Lec3/f2;
    .locals 3

    iget-object v0, p0, Lr20/i;->w:Lw20/b0;

    iget-object v0, v0, Lw20/b0;->d:Ln53/e;

    new-instance v1, Lpf/b;

    const/16 v2, 0x12

    invoke-direct {v1, p0, v2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, Lr20/i;->y:F

    return v0
.end method

.method public final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final x()F
    .locals 1

    iget v0, p0, Lr20/i;->E:F

    return v0
.end method
