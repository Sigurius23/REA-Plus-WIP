.class public Lhc3/u;
.super Lbc3/a;
.source "SourceFile"

# interfaces
.implements Ls83/d;


# instance fields
.field public final z:Lq83/d;


# direct methods
.method public constructor <init>(Lq83/j;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, Lbc3/a;-><init>(Lq83/j;ZZ)V

    iput-object p2, p0, Lhc3/u;->z:Lq83/d;

    return-void
.end method


# virtual methods
.method public final K()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c0()V
    .locals 0

    return-void
.end method

.method public final getCallerFrame()Ls83/d;
    .locals 2

    iget-object v0, p0, Lhc3/u;->z:Lq83/d;

    instance-of v1, v0, Ls83/d;

    if-eqz v1, :cond_0

    check-cast v0, Ls83/d;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public j(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lhc3/u;->z:Lq83/d;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-static {p1}, Lbc3/f0;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lhc3/b;->g(Ljava/lang/Object;Lq83/d;)V

    return-void
.end method

.method public l(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lhc3/u;->z:Lq83/d;

    invoke-static {p1}, Lbc3/f0;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
