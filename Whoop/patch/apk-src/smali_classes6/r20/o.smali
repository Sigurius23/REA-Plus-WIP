.class public final Lr20/o;
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

.field public final w:Lb30/q0;

.field public final x:Lr20/n;

.field public final y:Lec3/r1;

.field public final z:F


# direct methods
.method public constructor <init>(Lb30/q0;Lr20/n;)V
    .locals 1

    const-string v0, "cvcRecollectionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr20/o;->w:Lb30/q0;

    iput-object p2, p0, Lr20/o;->x:Lr20/n;

    new-instance p1, Lr20/b;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, Lr20/b;-><init>(ZLr20/a;)V

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lr20/o;->y:Lec3/r1;

    sget p1, Lb30/a5;->e:F

    iput p1, p0, Lr20/o;->z:F

    const/4 p1, 0x0

    int-to-float p1, p1

    iput p1, p0, Lr20/o;->E:F

    sget p1, Lr20/t;->b:F

    iput p1, p0, Lr20/o;->F:F

    sget-object p1, Lr20/h;->w:Lr20/h;

    iput-object p1, p0, Lr20/o;->G:Lr20/h;

    iput-boolean v0, p0, Lr20/o;->H:Z

    return-void
.end method


# virtual methods
.method public final J(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 3

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, -0x113ce139

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    iget-object v0, p0, Lr20/o;->x:Lr20/n;

    const/16 v1, 0x180

    iget-object v2, p0, Lr20/o;->w:Lb30/q0;

    invoke-static {v2, v0, p2, p1, v1}, Lb30/o5;->g(Lb30/q0;Lr20/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a0(ZZ)Lec3/f2;
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const p1, 0x7f1410cd

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lec3/r1;
    .locals 1

    iget-object v0, p0, Lr20/o;->y:Lec3/r1;

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

    iget-object v0, p0, Lr20/o;->w:Lb30/q0;

    iget-object v0, v0, Lb30/q0;->n:Lhc3/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final h()Lr20/h;
    .locals 1

    iget-object v0, p0, Lr20/o;->G:Lr20/h;

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lr20/o;->E:F

    return v0
.end method

.method public final k()Lec3/f2;
    .locals 3

    iget-object v0, p0, Lr20/o;->w:Lb30/q0;

    iget-object v0, v0, Lb30/q0;->q:Lec3/h2;

    new-instance v1, Lpf/b;

    const/16 v2, 0x14

    invoke-direct {v1, p0, v2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, Lr20/o;->z:F

    return v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lr20/o;->H:Z

    return v0
.end method

.method public final x()F
    .locals 1

    iget v0, p0, Lr20/o;->F:F

    return v0
.end method
