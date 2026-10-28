.class public final Lf1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf1/t;

.field public final b:Lf1/t;

.field public final c:Z


# direct methods
.method public constructor <init>(Lf1/t;Lf1/t;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/u;->a:Lf1/t;

    iput-object p2, p0, Lf1/u;->b:Lf1/t;

    iput-boolean p3, p0, Lf1/u;->c:Z

    return-void
.end method

.method public static a(Lf1/u;Lf1/t;Lf1/t;ZI)Lf1/u;
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lf1/u;->a:Lf1/t;

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    iget-object p2, p0, Lf1/u;->b:Lf1/t;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lf1/u;->c:Z

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lf1/u;

    invoke-direct {p0, p1, p2, p3}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    return-object p0
.end method


# virtual methods
.method public final b()Lf1/t;
    .locals 1

    iget-object v0, p0, Lf1/u;->b:Lf1/t;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lf1/u;->c:Z

    return v0
.end method

.method public final d()Lf1/t;
    .locals 1

    iget-object v0, p0, Lf1/u;->a:Lf1/t;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lf1/u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lf1/u;

    iget-object v1, p0, Lf1/u;->a:Lf1/t;

    iget-object v3, p1, Lf1/u;->a:Lf1/t;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lf1/u;->b:Lf1/t;

    iget-object v3, p1, Lf1/u;->b:Lf1/t;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lf1/u;->c:Z

    iget-boolean p1, p1, Lf1/u;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lf1/u;->a:Lf1/t;

    invoke-virtual {v0}, Lf1/t;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf1/u;->b:Lf1/t;

    invoke-virtual {v1}, Lf1/t;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lf1/u;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Selection(start="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf1/u;->a:Lf1/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/u;->b:Lf1/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", handlesCrossed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lf1/u;->c:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
