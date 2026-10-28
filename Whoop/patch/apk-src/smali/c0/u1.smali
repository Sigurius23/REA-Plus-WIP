.class public final Lc0/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc0/g1;

.field public final b:Lc0/s1;

.field public final c:Lc0/k0;

.field public final d:Lc0/l1;

.field public final e:Z

.field public final f:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V
    .locals 9

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move-object v6, v1

    goto :goto_3

    :cond_3
    move-object v6, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    :goto_4
    move v7, p1

    goto :goto_5

    :cond_4
    const/4 p1, 0x1

    goto :goto_4

    :goto_5
    and-int/lit8 p1, p6, 0x20

    if-eqz p1, :cond_5

    .line 8
    sget-object p5, Lm83/z;->w:Lm83/z;

    :cond_5
    move-object v2, p0

    move-object v8, p5

    .line 9
    invoke-direct/range {v2 .. v8}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;ZLjava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;ZLjava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc0/u1;->a:Lc0/g1;

    .line 3
    iput-object p2, p0, Lc0/u1;->b:Lc0/s1;

    .line 4
    iput-object p3, p0, Lc0/u1;->c:Lc0/k0;

    .line 5
    iput-object p4, p0, Lc0/u1;->d:Lc0/l1;

    .line 6
    iput-boolean p5, p0, Lc0/u1;->e:Z

    .line 7
    iput-object p6, p0, Lc0/u1;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc0/u1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc0/u1;

    iget-object v1, p0, Lc0/u1;->a:Lc0/g1;

    iget-object v3, p1, Lc0/u1;->a:Lc0/g1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc0/u1;->b:Lc0/s1;

    iget-object v3, p1, Lc0/u1;->b:Lc0/s1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc0/u1;->c:Lc0/k0;

    iget-object v3, p1, Lc0/u1;->c:Lc0/k0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lc0/u1;->d:Lc0/l1;

    iget-object v3, p1, Lc0/u1;->d:Lc0/l1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lc0/u1;->e:Z

    iget-boolean v3, p1, Lc0/u1;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lc0/u1;->f:Ljava/util/Map;

    iget-object p1, p1, Lc0/u1;->f:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lc0/u1;->a:Lc0/g1;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lc0/g1;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Lc0/u1;->b:Lc0/s1;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lc0/s1;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lc0/u1;->c:Lc0/k0;

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lc0/k0;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lc0/u1;->d:Lc0/l1;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lc0/l1;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Lc0/u1;->e:Z

    invoke-static {v1, v2, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lc0/u1;->f:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TransitionData(fade="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lc0/u1;->a:Lc0/g1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", slide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/u1;->b:Lc0/s1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", changeSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/u1;->c:Lc0/k0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/u1;->d:Lc0/l1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lc0/u1;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", effectsMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/u1;->f:Ljava/util/Map;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lr;->m(Ljava/lang/StringBuilder;Ljava/util/Map;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
