.class public final Ly2/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final a:Ly2/z0;


# direct methods
.method public constructor <init>(Ly2/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/a1;->a:Ly2/z0;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 1

    iget-object p2, p0, Ly2/a1;->a:Ly2/z0;

    invoke-static {p1}, Lio/sentry/config/a;->A(Ly2/r;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3, p4}, Ly2/z0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly2/r;Ljava/util/List;I)I
    .locals 1

    iget-object p2, p0, Ly2/a1;->a:Ly2/z0;

    invoke-static {p1}, Lio/sentry/config/a;->A(Ly2/r;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3}, Ly2/z0;->b(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final c(Ly2/r;Ljava/util/List;I)I
    .locals 1

    iget-object p2, p0, Ly2/a1;->a:Ly2/z0;

    invoke-static {p1}, Lio/sentry/config/a;->A(Ly2/r;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3}, Ly2/z0;->c(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final d(Ly2/r;Ljava/util/List;I)I
    .locals 1

    iget-object p2, p0, Ly2/a1;->a:Ly2/z0;

    invoke-static {p1}, Lio/sentry/config/a;->A(Ly2/r;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3}, Ly2/z0;->d(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final e(Ly2/r;Ljava/util/List;I)I
    .locals 1

    iget-object p2, p0, Ly2/a1;->a:Ly2/z0;

    invoke-static {p1}, Lio/sentry/config/a;->A(Ly2/r;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3}, Ly2/z0;->e(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly2/a1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly2/a1;

    iget-object v1, p0, Ly2/a1;->a:Ly2/z0;

    iget-object p1, p1, Ly2/a1;->a:Ly2/z0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ly2/a1;->a:Ly2/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MultiContentMeasurePolicyImpl(measurePolicy="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly2/a1;->a:Ly2/z0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
