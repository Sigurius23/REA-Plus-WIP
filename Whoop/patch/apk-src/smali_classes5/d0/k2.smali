.class public final Ld0/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld0/e0;

.field public b:Ld0/r;

.field public c:Ld0/r;

.field public d:Ld0/r;

.field public final e:F


# direct methods
.method public constructor <init>(Ld0/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/k2;->a:Ld0/e0;

    invoke-interface {p1}, Ld0/e0;->k()F

    move-result p1

    iput p1, p0, Ld0/k2;->e:F

    return-void
.end method


# virtual methods
.method public final a(Ld0/r;Ld0/r;)Ld0/r;
    .locals 8

    iget-object v0, p0, Ld0/k2;->d:Ld0/r;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ld0/r;->c()Ld0/r;

    move-result-object v0

    iput-object v0, p0, Ld0/k2;->d:Ld0/r;

    :cond_0
    iget-object v0, p0, Ld0/k2;->d:Ld0/r;

    const/4 v1, 0x0

    const-string v2, "targetVector"

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ld0/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, Ld0/k2;->d:Ld0/r;

    if-eqz v4, :cond_1

    invoke-virtual {p1, v3}, Ld0/r;->a(I)F

    move-result v5

    invoke-virtual {p2, v3}, Ld0/r;->a(I)F

    move-result v6

    iget-object v7, p0, Ld0/k2;->a:Ld0/e0;

    invoke-interface {v7, v5, v6}, Ld0/e0;->x(FF)F

    move-result v5

    invoke-virtual {v4, v5, v3}, Ld0/r;->e(FI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object p1, p0, Ld0/k2;->d:Ld0/r;

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final b(JLd0/r;Ld0/r;)Ld0/r;
    .locals 7

    iget-object v0, p0, Ld0/k2;->c:Ld0/r;

    if-nez v0, :cond_0

    invoke-virtual {p3}, Ld0/r;->c()Ld0/r;

    move-result-object v0

    iput-object v0, p0, Ld0/k2;->c:Ld0/r;

    :cond_0
    iget-object v0, p0, Ld0/k2;->c:Ld0/r;

    const/4 v1, 0x0

    const-string v2, "velocityVector"

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ld0/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, Ld0/k2;->c:Ld0/r;

    if-eqz v4, :cond_1

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4, v3}, Ld0/r;->a(I)F

    move-result v5

    iget-object v6, p0, Ld0/k2;->a:Ld0/e0;

    invoke-interface {v6, v5, p1, p2}, Ld0/e0;->d(FJ)F

    move-result v5

    invoke-virtual {v4, v5, v3}, Ld0/r;->e(FI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object p1, p0, Ld0/k2;->c:Ld0/r;

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
