.class public final Landroidx/health/platform/client/proto/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/health/platform/client/proto/u2;


# instance fields
.field public final a:Landroidx/health/platform/client/proto/a;

.field public final b:Landroidx/health/platform/client/proto/d3;

.field public final c:Landroidx/health/platform/client/proto/m0;


# direct methods
.method public constructor <init>(Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/health/platform/client/proto/p1;->b:Landroidx/health/platform/client/proto/d3;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Landroidx/health/platform/client/proto/p1;->c:Landroidx/health/platform/client/proto/m0;

    iput-object p3, p0, Landroidx/health/platform/client/proto/p1;->a:Landroidx/health/platform/client/proto/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/p1;->b:Landroidx/health/platform/client/proto/d3;

    invoke-static {v0, p1, p2}, Landroidx/health/platform/client/proto/v2;->w(Landroidx/health/platform/client/proto/d3;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/p1;->b:Landroidx/health/platform/client/proto/d3;

    check-cast v0, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p1

    check-cast v0, Landroidx/health/platform/client/proto/u0;

    iget-object v0, v0, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/health/platform/client/proto/e3;->e:Z

    iget-object v0, p0, Landroidx/health/platform/client/proto/p1;->c:Landroidx/health/platform/client/proto/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/p1;->c:Landroidx/health/platform/client/proto/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final d()Landroidx/health/platform/client/proto/u0;
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/p1;->a:Landroidx/health/platform/client/proto/a;

    instance-of v1, v0, Landroidx/health/platform/client/proto/u0;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/health/platform/client/proto/u0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->l()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Landroidx/health/platform/client/proto/u0;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/health/platform/client/proto/u0;->e(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/s0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->b()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;[BIILandroidx/health/platform/client/proto/d;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Landroidx/health/platform/client/proto/u0;

    iget-object p3, p2, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    sget-object p4, Landroidx/health/platform/client/proto/e3;->f:Landroidx/health/platform/client/proto/e3;

    if-ne p3, p4, :cond_0

    invoke-static {}, Landroidx/health/platform/client/proto/e3;->c()Landroidx/health/platform/client/proto/e3;

    move-result-object p3

    iput-object p3, p2, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    :cond_0
    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method public final f(Landroidx/health/platform/client/proto/u0;)I
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/p1;->b:Landroidx/health/platform/client/proto/d3;

    check-cast v0, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/e3;->hashCode()I

    move-result p1

    return p1
.end method

.method public final g(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;)Z
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/p1;->b:Landroidx/health/platform/client/proto/d3;

    check-cast v0, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p2, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {p1, p2}, Landroidx/health/platform/client/proto/e3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final h(Ljava/lang/Object;Landroidx/health/platform/client/proto/g1;)V
    .locals 0

    iget-object p2, p0, Landroidx/health/platform/client/proto/p1;->c:Landroidx/health/platform/client/proto/m0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(Landroidx/health/platform/client/proto/u0;)I
    .locals 7

    iget-object v0, p0, Landroidx/health/platform/client/proto/p1;->b:Landroidx/health/platform/client/proto/d3;

    check-cast v0, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    iget v0, p1, Landroidx/health/platform/client/proto/e3;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p1, Landroidx/health/platform/client/proto/e3;->a:I

    if-ge v0, v2, :cond_1

    iget-object v2, p1, Landroidx/health/platform/client/proto/e3;->b:[I

    aget v2, v2, v0

    const/4 v3, 0x3

    ushr-int/2addr v2, v3

    iget-object v4, p1, Landroidx/health/platform/client/proto/e3;->c:[Ljava/lang/Object;

    aget-object v4, v4, v0

    check-cast v4, Landroidx/health/platform/client/proto/h;

    const/4 v5, 0x1

    invoke-static {v5}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    const/4 v6, 0x2

    mul-int/2addr v5, v6

    invoke-static {v6}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v6

    invoke-static {v2}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v2

    add-int/2addr v2, v6

    add-int/2addr v2, v5

    invoke-static {v3, v4}, Landroidx/health/platform/client/proto/k;->v(ILandroidx/health/platform/client/proto/h;)I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iput v1, p1, Landroidx/health/platform/client/proto/e3;->d:I

    return v1
.end method
