.class public final Ld0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/h;


# instance fields
.field public final a:Ld0/k2;

.field public final b:Ld0/f2;

.field public final c:Ljava/lang/Object;

.field public final d:Ld0/r;

.field public final e:Ld0/r;

.field public final f:Ld0/r;

.field public final g:Ljava/lang/Object;

.field public final h:J


# direct methods
.method public constructor <init>(Ld0/x;Ld0/f2;Ljava/lang/Object;Ld0/r;)V
    .locals 6

    new-instance v0, Ld0/k2;

    iget-object p1, p1, Ld0/x;->a:Ld0/e0;

    invoke-direct {v0, p1}, Ld0/k2;-><init>(Ld0/e0;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ld0/w;->a:Ld0/k2;

    iput-object p2, p0, Ld0/w;->b:Ld0/f2;

    iput-object p3, p0, Ld0/w;->c:Ljava/lang/Object;

    iget-object p1, p2, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/r;

    iput-object p1, p0, Ld0/w;->d:Ld0/r;

    invoke-static {p4}, Ld0/f;->l(Ld0/r;)Ld0/r;

    move-result-object p3

    iput-object p3, p0, Ld0/w;->e:Ld0/r;

    iget-object p2, p2, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, p1, p4}, Ld0/k2;->a(Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p3

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Ld0/w;->g:Ljava/lang/Object;

    iget-object p2, v0, Ld0/k2;->c:Ld0/r;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ld0/r;->c()Ld0/r;

    move-result-object p2

    iput-object p2, v0, Ld0/k2;->c:Ld0/r;

    :cond_0
    iget-object p2, v0, Ld0/k2;->c:Ld0/r;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ld0/r;->b()I

    move-result p2

    const/4 p3, 0x0

    const-wide/16 v1, 0x0

    move v3, p3

    :goto_0
    if-ge v3, p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4, v3}, Ld0/r;->a(I)F

    move-result v4

    iget-object v5, v0, Ld0/k2;->a:Ld0/e0;

    invoke-interface {v5, v4}, Ld0/e0;->w(F)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iput-wide v1, p0, Ld0/w;->h:J

    iget-object p1, p0, Ld0/w;->a:Ld0/k2;

    iget-object p2, p0, Ld0/w;->d:Ld0/r;

    invoke-virtual {p1, v1, v2, p2, p4}, Ld0/k2;->b(JLd0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    invoke-static {p1}, Ld0/f;->l(Ld0/r;)Ld0/r;

    move-result-object p1

    iput-object p1, p0, Ld0/w;->f:Ld0/r;

    invoke-virtual {p1}, Ld0/r;->b()I

    move-result p1

    :goto_1
    if-ge p3, p1, :cond_2

    iget-object p2, p0, Ld0/w;->f:Ld0/r;

    invoke-virtual {p2, p3}, Ld0/r;->a(I)F

    move-result p4

    iget-object v0, p0, Ld0/w;->a:Ld0/k2;

    iget v0, v0, Ld0/k2;->e:F

    neg-float v1, v0

    invoke-static {p4, v1, v0}, Le93/b;->m(FFF)F

    move-result p4

    invoke-virtual {p2, p4, p3}, Ld0/r;->e(FI)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    const-string p1, "velocityVector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(J)Ld0/r;
    .locals 3

    invoke-interface {p0, p1, p2}, Ld0/h;->c(J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ld0/w;->d:Ld0/r;

    iget-object v1, p0, Ld0/w;->e:Ld0/r;

    iget-object v2, p0, Ld0/w;->a:Ld0/k2;

    invoke-virtual {v2, p1, p2, v0, v1}, Ld0/k2;->b(JLd0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Ld0/w;->f:Ld0/r;

    return-object p1
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Ld0/w;->h:J

    return-wide v0
.end method

.method public final e()Ld0/f2;
    .locals 1

    iget-object v0, p0, Ld0/w;->b:Ld0/f2;

    return-object v0
.end method

.method public final f(J)Ljava/lang/Object;
    .locals 11

    invoke-interface {p0, p1, p2}, Ld0/h;->c(J)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Ld0/w;->b:Ld0/f2;

    iget-object v0, v0, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld0/w;->a:Ld0/k2;

    iget-object v2, v1, Ld0/k2;->b:Ld0/r;

    iget-object v3, p0, Ld0/w;->d:Ld0/r;

    if-nez v2, :cond_0

    invoke-virtual {v3}, Ld0/r;->c()Ld0/r;

    move-result-object v2

    iput-object v2, v1, Ld0/k2;->b:Ld0/r;

    :cond_0
    iget-object v2, v1, Ld0/k2;->b:Ld0/r;

    const/4 v4, 0x0

    const-string v5, "valueVector"

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ld0/r;->b()I

    move-result v2

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_2

    iget-object v7, v1, Ld0/k2;->b:Ld0/r;

    if-eqz v7, :cond_1

    iget-object v8, v1, Ld0/k2;->a:Ld0/e0;

    invoke-virtual {v3, v6}, Ld0/r;->a(I)F

    move-result v9

    iget-object v10, p0, Ld0/w;->e:Ld0/r;

    invoke-virtual {v10, v6}, Ld0/r;->a(I)F

    move-result v10

    invoke-interface {v8, v9, p1, p2, v10}, Ld0/e0;->u(FJF)F

    move-result v8

    invoke-virtual {v7, v8, v6}, Ld0/r;->e(FI)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_2
    iget-object p1, v1, Ld0/k2;->b:Ld0/r;

    if-eqz p1, :cond_3

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_4
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_5
    iget-object p1, p0, Ld0/w;->g:Ljava/lang/Object;

    return-object p1
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/w;->g:Ljava/lang/Object;

    return-object v0
.end method
