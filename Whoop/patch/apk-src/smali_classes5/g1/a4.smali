.class public final Lg1/a4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/b2;


# instance fields
.field public final a:Lp1/k1;


# direct methods
.method public constructor <init>(Ll0/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lg1/a4;->a:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Ly3/c;Ly3/m;)I
    .locals 1

    iget-object v0, p0, Lg1/a4;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/b2;

    invoke-interface {v0, p1, p2}, Ll0/b2;->a(Ly3/c;Ly3/m;)I

    move-result p1

    return p1
.end method

.method public final b(Ly3/c;Ly3/m;)I
    .locals 1

    iget-object v0, p0, Lg1/a4;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/b2;

    invoke-interface {v0, p1, p2}, Ll0/b2;->b(Ly3/c;Ly3/m;)I

    move-result p1

    return p1
.end method

.method public final c(Ly3/c;)I
    .locals 1

    iget-object v0, p0, Lg1/a4;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/b2;

    invoke-interface {v0, p1}, Ll0/b2;->c(Ly3/c;)I

    move-result p1

    return p1
.end method

.method public final d(Ly3/c;)I
    .locals 1

    iget-object v0, p0, Lg1/a4;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/b2;

    invoke-interface {v0, p1}, Ll0/b2;->d(Ly3/c;)I

    move-result p1

    return p1
.end method
