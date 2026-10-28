.class public final Ld0/q0;
.super Lal/a;
.source "SourceFile"


# instance fields
.field public final y:Lp1/k1;

.field public final z:Lp1/k1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lal/a;-><init>(I)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ld0/q0;->y:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/q0;->z:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final B0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ld0/q0;->y:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final C0(Ld0/z1;)V
    .locals 0

    return-void
.end method

.method public final D0()V
    .locals 0

    return-void
.end method

.method public final H0()Z
    .locals 2

    iget-object v0, p0, Ld0/q0;->y:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ld0/q0;->z:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final I0(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Ld0/q0;->z:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final y0()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/q0;->y:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final z0()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/q0;->z:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
