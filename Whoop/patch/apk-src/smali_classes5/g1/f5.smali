.class public final Lg1/f5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/k1;


# instance fields
.field public final a:Lp1/k1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    int-to-float v0, v0

    new-instance v1, Ll0/l1;

    invoke-direct {v1, v0, v0, v0, v0}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lg1/f5;->a:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget-object v0, p0, Lg1/f5;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/k1;

    invoke-interface {v0}, Ll0/k1;->a()F

    move-result v0

    return v0
.end method

.method public final b(Ly3/m;)F
    .locals 1

    iget-object v0, p0, Lg1/f5;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/k1;

    invoke-interface {v0, p1}, Ll0/k1;->b(Ly3/m;)F

    move-result p1

    return p1
.end method

.method public final c(Ly3/m;)F
    .locals 1

    iget-object v0, p0, Lg1/f5;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/k1;

    invoke-interface {v0, p1}, Ll0/k1;->c(Ly3/m;)F

    move-result p1

    return p1
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, Lg1/f5;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/k1;

    invoke-interface {v0}, Ll0/k1;->d()F

    move-result v0

    return v0
.end method
