.class public final Lr20/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr20/s;


# instance fields
.field public final E:F

.field public final w:Lb30/y0;

.field public final x:Lec3/r1;

.field public final y:F

.field public final z:F


# direct methods
.method public constructor <init>(Lb30/y0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr20/p;->w:Lb30/y0;

    new-instance p1, Lr20/b;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0}, Lr20/b;-><init>(ZLr20/a;)V

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lr20/p;->x:Lec3/r1;

    int-to-float p1, v1

    iput p1, p0, Lr20/p;->y:F

    iput p1, p0, Lr20/p;->z:F

    sget p1, Lr20/t;->c:F

    iput p1, p0, Lr20/p;->E:F

    return-void
.end method


# virtual methods
.method public final J(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 2

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, -0x31094c00

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    iget-object v0, p0, Lr20/p;->w:Lb30/y0;

    const/16 v1, 0x30

    invoke-static {v0, p2, p1, v1}, Luf/c0;->w(Lb30/y0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

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

    iget-object p1, p0, Lr20/p;->w:Lb30/y0;

    iget-object p1, p1, Lb30/y0;->y:Lzy/b;

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lec3/r1;
    .locals 1

    iget-object v0, p0, Lr20/p;->x:Lec3/r1;

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

    iget v0, p0, Lr20/p;->z:F

    return v0
.end method

.method public final k()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lr20/p;->w:Lb30/y0;

    iget-object v0, v0, Lb30/y0;->z:Lb30/j3;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, Lr20/p;->y:F

    return v0
.end method

.method public final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final x()F
    .locals 1

    iget v0, p0, Lr20/p;->E:F

    return v0
.end method
