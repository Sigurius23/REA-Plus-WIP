.class public final Lfa3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lna3/h;

.field public final b:Ljava/util/Collection;

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Lna3/h;Ljava/util/Collection;I)V
    .locals 10

    .line 1
    iget-object v0, p1, Lna3/h;->a:Lna3/g;

    .line 2
    sget-object v1, Lna3/g;->y:Lna3/g;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v7, v2

    goto :goto_0

    :cond_0
    move v7, v3

    :goto_0
    and-int/lit8 v0, p3, 0x8

    if-eqz v0, :cond_1

    move v8, v3

    goto :goto_1

    :cond_1
    move v8, v2

    :goto_1
    and-int/lit8 p3, p3, 0x10

    if-eqz p3, :cond_2

    move v9, v3

    :goto_2
    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    goto :goto_3

    :cond_2
    move v9, v2

    goto :goto_2

    .line 3
    :goto_3
    invoke-direct/range {v4 .. v9}, Lfa3/m;-><init>(Lna3/h;Ljava/util/Collection;ZZZ)V

    return-void
.end method

.method public constructor <init>(Lna3/h;Ljava/util/Collection;ZZZ)V
    .locals 1

    const-string v0, "qualifierApplicabilityTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lfa3/m;->a:Lna3/h;

    .line 6
    iput-object p2, p0, Lfa3/m;->b:Ljava/util/Collection;

    .line 7
    iput-boolean p3, p0, Lfa3/m;->c:Z

    .line 8
    iput-boolean p4, p0, Lfa3/m;->d:Z

    .line 9
    iput-boolean p5, p0, Lfa3/m;->e:Z

    return-void
.end method

.method public static a(Lfa3/m;Lna3/h;)Lfa3/m;
    .locals 6

    iget-object v2, p0, Lfa3/m;->b:Ljava/util/Collection;

    iget-boolean v3, p0, Lfa3/m;->c:Z

    iget-boolean v4, p0, Lfa3/m;->d:Z

    iget-boolean v5, p0, Lfa3/m;->e:Z

    const-string p0, "qualifierApplicabilityTypes"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfa3/m;

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lfa3/m;-><init>(Lna3/h;Ljava/util/Collection;ZZZ)V

    return-object v0
.end method


# virtual methods
.method public final b()Lna3/h;
    .locals 1

    iget-object v0, p0, Lfa3/m;->a:Lna3/h;

    return-object v0
.end method

.method public final c()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lfa3/m;->b:Ljava/util/Collection;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfa3/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfa3/m;

    iget-object v1, p0, Lfa3/m;->a:Lna3/h;

    iget-object v3, p1, Lfa3/m;->a:Lna3/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfa3/m;->b:Ljava/util/Collection;

    iget-object v3, p1, Lfa3/m;->b:Ljava/util/Collection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lfa3/m;->c:Z

    iget-boolean v3, p1, Lfa3/m;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lfa3/m;->d:Z

    iget-boolean v3, p1, Lfa3/m;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lfa3/m;->e:Z

    iget-boolean p1, p1, Lfa3/m;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lfa3/m;->a:Lna3/h;

    invoke-virtual {v0}, Lna3/h;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfa3/m;->b:Ljava/util/Collection;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lfa3/m;->c:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lfa3/m;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lfa3/m;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JavaDefaultQualifiers(nullabilityQualifier="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lfa3/m;->a:Lna3/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", qualifierApplicabilityTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfa3/m;->b:Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", definitelyNotNull="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lfa3/m;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", preferQualifierOverBound="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lfa3/m;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", preferQualifierOverSupertype="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lfa3/m;->e:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
