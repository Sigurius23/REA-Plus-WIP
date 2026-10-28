.class public final Ly00/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/p0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ly00/p2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/o0;->a:Ljava/lang/String;

    iput-object p2, p0, Ly00/o0;->b:Ljava/lang/String;

    iput-object p3, p0, Ly00/o0;->c:Ljava/lang/String;

    iput-object p4, p0, Ly00/o0;->d:Ljava/lang/String;

    iput-object p5, p0, Ly00/o0;->e:Ly00/p2;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/o0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/o0;

    iget-object v1, p0, Ly00/o0;->a:Ljava/lang/String;

    iget-object v3, p1, Ly00/o0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/o0;->b:Ljava/lang/String;

    iget-object v3, p1, Ly00/o0;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/o0;->c:Ljava/lang/String;

    iget-object v3, p1, Ly00/o0;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/o0;->d:Ljava/lang/String;

    iget-object v3, p1, Ly00/o0;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/o0;->e:Ly00/p2;

    iget-object p1, p1, Ly00/o0;->e:Ly00/p2;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ly00/o0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ly00/o0;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ly00/o0;->c:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/o0;->d:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Ly00/o0;->e:Ly00/p2;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final toMap()Ljava/util/Map;
    .locals 10

    new-instance v6, Ly00/v3;

    const/16 v0, 0x9

    iget-object v1, p0, Ly00/o0;->c:Ljava/lang/String;

    iget-object v2, p0, Ly00/o0;->b:Ljava/lang/String;

    invoke-direct {v6, v1, v2, v0}, Ly00/v3;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Ly00/f4;->l0:Ly00/f4;

    new-instance v0, Ly00/d5;

    const/4 v8, 0x0

    const v9, 0x1d3ffe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Ly00/d5;-><init>(Ly00/f4;Ly00/s4;Ly00/b5;Ly00/w4;Ly00/z4;Ly00/v3;Ly00/r3;Ly00/n;I)V

    new-instance v1, Ll83/k;

    const-string v2, "client_secret"

    iget-object v3, p0, Ly00/o0;->a:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "hosted_surface"

    iget-object v4, p0, Ly00/o0;->d:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v4, :cond_1

    iget-object v3, p0, Ly00/o0;->e:Ly00/p2;

    if-eqz v3, :cond_0

    iget-object v3, v3, Ly00/p2;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v3, "LINK_DISABLED"

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    new-instance v4, Ll83/k;

    const-string v5, "link_mode"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v5, "payment_method_data"

    invoke-direct {v3, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v4, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/wire/n;->y(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", customerName="

    const-string v1, ", customerEmailAddress="

    const-string v2, "USBankAccount(clientSecret="

    iget-object v3, p0, Ly00/o0;->a:Ljava/lang/String;

    iget-object v4, p0, Ly00/o0;->b:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hostedSurface="

    const-string v2, ", linkMode="

    iget-object v3, p0, Ly00/o0;->c:Ljava/lang/String;

    iget-object v4, p0, Ly00/o0;->d:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ly00/o0;->e:Ly00/p2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
