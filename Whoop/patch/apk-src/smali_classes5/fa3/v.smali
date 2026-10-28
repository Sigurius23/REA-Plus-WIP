.class public final Lfa3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lfa3/b0;

.field public final b:Lfa3/b0;

.field public final c:Ljava/util/Map;

.field public final d:Z


# direct methods
.method public constructor <init>(Lfa3/b0;Lfa3/b0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa3/v;->a:Lfa3/b0;

    iput-object p2, p0, Lfa3/v;->b:Lfa3/b0;

    sget-object v0, Lm83/z;->w:Lm83/z;

    iput-object v0, p0, Lfa3/v;->c:Ljava/util/Map;

    new-instance v0, Lfa3/u;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    sget-object v0, Lfa3/b0;->x:Lfa3/b0;

    if-ne p1, v0, :cond_0

    if-ne p2, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lfa3/v;->d:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfa3/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfa3/v;

    iget-object v1, p0, Lfa3/v;->a:Lfa3/b0;

    iget-object v3, p1, Lfa3/v;->a:Lfa3/b0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfa3/v;->b:Lfa3/b0;

    iget-object v3, p1, Lfa3/v;->b:Lfa3/b0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lfa3/v;->c:Ljava/util/Map;

    iget-object p1, p1, Lfa3/v;->c:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lfa3/v;->a:Lfa3/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lfa3/v;->b:Lfa3/b0;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lfa3/v;->c:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Jsr305Settings(globalLevel="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lfa3/v;->a:Lfa3/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", migrationLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfa3/v;->b:Lfa3/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userDefinedLevelForSpecificAnnotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfa3/v;->c:Ljava/util/Map;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lr;->m(Ljava/lang/StringBuilder;Ljava/util/Map;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
