.class public final Ly00/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/p0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ly00/p2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/n0;->a:Ljava/lang/String;

    iput-object p2, p0, Ly00/n0;->b:Ljava/lang/String;

    iput-object p3, p0, Ly00/n0;->c:Ljava/lang/String;

    iput-object p4, p0, Ly00/n0;->d:Ly00/p2;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/n0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/n0;

    iget-object v1, p0, Ly00/n0;->a:Ljava/lang/String;

    iget-object v3, p1, Ly00/n0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/n0;->b:Ljava/lang/String;

    iget-object v3, p1, Ly00/n0;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/n0;->c:Ljava/lang/String;

    iget-object v3, p1, Ly00/n0;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/n0;->d:Ly00/p2;

    iget-object p1, p1, Ly00/n0;->d:Ly00/p2;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Ly00/n0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/n0;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ly00/n0;->c:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ly00/n0;->d:Ly00/p2;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final toMap()Ljava/util/Map;
    .locals 11

    new-instance v0, Ly00/d5;

    sget-object v1, Ly00/f4;->H:Ly00/f4;

    new-instance v6, Ly00/v3;

    const/16 v2, 0xd

    iget-object v3, p0, Ly00/n0;->b:Ljava/lang/String;

    const/4 v10, 0x0

    invoke-direct {v6, v3, v10, v2}, Ly00/v3;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const/4 v8, 0x0

    const v9, 0x1fbffe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Ly00/d5;-><init>(Ly00/f4;Ly00/s4;Ly00/b5;Ly00/w4;Ly00/z4;Ly00/v3;Ly00/r3;Ly00/n;I)V

    new-instance v1, Ll83/k;

    const-string v2, "client_secret"

    iget-object v3, p0, Ly00/n0;->a:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "hosted_surface"

    iget-object v4, p0, Ly00/n0;->c:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v5, "product"

    const-string v6, "instant_debits"

    invoke-direct {v3, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object v6, v4

    new-instance v4, Ll83/k;

    const-string v7, "attach_required"

    invoke-direct {v4, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v6, :cond_1

    iget-object v5, p0, Ly00/n0;->d:Ly00/p2;

    if-eqz v5, :cond_0

    iget-object v10, v5, Ly00/p2;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v10, "LINK_DISABLED"

    :cond_1
    :goto_0
    new-instance v5, Ll83/k;

    const-string v6, "link_mode"

    invoke-direct {v5, v6, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "payment_method_data"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v1 .. v6}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/wire/n;->y(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", customerEmailAddress="

    const-string v1, ", hostedSurface="

    const-string v2, "InstantDebits(clientSecret="

    iget-object v3, p0, Ly00/n0;->a:Ljava/lang/String;

    iget-object v4, p0, Ly00/n0;->b:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ly00/n0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/n0;->d:Ly00/p2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
