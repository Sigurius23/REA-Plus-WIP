.class public final Lka3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Llb3/b1;

.field public final b:Lka3/b;

.field public final c:Z

.field public final d:Z

.field public final e:Ljava/util/Set;

.field public final f:Llb3/c0;


# direct methods
.method public constructor <init>(Llb3/b1;Lka3/b;ZZLjava/util/Set;Llb3/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lka3/a;->a:Llb3/b1;

    .line 3
    iput-object p2, p0, Lka3/a;->b:Lka3/b;

    .line 4
    iput-boolean p3, p0, Lka3/a;->c:Z

    .line 5
    iput-boolean p4, p0, Lka3/a;->d:Z

    .line 6
    iput-object p5, p0, Lka3/a;->e:Ljava/util/Set;

    .line 7
    iput-object p6, p0, Lka3/a;->f:Llb3/c0;

    return-void
.end method

.method public synthetic constructor <init>(Llb3/b1;ZZLjava/util/Set;I)V
    .locals 7

    .line 8
    sget-object v2, Lka3/b;->w:Lka3/b;

    and-int/lit8 v0, p5, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    and-int/lit8 p2, p5, 0x8

    if-eqz p2, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, p3

    :goto_1
    and-int/lit8 p2, p5, 0x10

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move-object v5, p4

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 9
    invoke-direct/range {v0 .. v6}, Lka3/a;-><init>(Llb3/b1;Lka3/b;ZZLjava/util/Set;Llb3/c0;)V

    return-void
.end method

.method public static a(Lka3/a;Lka3/b;ZLjava/util/Set;Llb3/c0;I)Lka3/a;
    .locals 7

    iget-object v1, p0, Lka3/a;->a:Llb3/b1;

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    iget-object p1, p0, Lka3/a;->b:Lka3/b;

    :cond_0
    move-object v2, p1

    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_1

    iget-boolean p2, p0, Lka3/a;->c:Z

    :cond_1
    move v3, p2

    iget-boolean v4, p0, Lka3/a;->d:Z

    and-int/lit8 p1, p5, 0x10

    if-eqz p1, :cond_2

    iget-object p3, p0, Lka3/a;->e:Ljava/util/Set;

    :cond_2
    move-object v5, p3

    and-int/lit8 p1, p5, 0x20

    if-eqz p1, :cond_3

    iget-object p4, p0, Lka3/a;->f:Llb3/c0;

    :cond_3
    move-object v6, p4

    const-string p0, "howThisTypeIsUsed"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "flexibility"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lka3/a;

    invoke-direct/range {v0 .. v6}, Lka3/a;-><init>(Llb3/b1;Lka3/b;ZZLjava/util/Set;Llb3/c0;)V

    return-object v0
.end method


# virtual methods
.method public final b()Llb3/c0;
    .locals 1

    iget-object v0, p0, Lka3/a;->f:Llb3/c0;

    return-object v0
.end method

.method public final c()Lka3/b;
    .locals 1

    iget-object v0, p0, Lka3/a;->b:Lka3/b;

    return-object v0
.end method

.method public final d()Llb3/b1;
    .locals 1

    iget-object v0, p0, Lka3/a;->a:Llb3/b1;

    return-object v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lka3/a;->e:Ljava/util/Set;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lka3/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lka3/a;

    iget-object v0, p1, Lka3/a;->f:Llb3/c0;

    iget-object v2, p0, Lka3/a;->f:Llb3/c0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lka3/a;->a:Llb3/b1;

    iget-object v2, p0, Lka3/a;->a:Llb3/b1;

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lka3/a;->b:Lka3/b;

    iget-object v2, p0, Lka3/a;->b:Lka3/b;

    if-ne v0, v2, :cond_1

    iget-boolean v0, p1, Lka3/a;->c:Z

    iget-boolean v2, p0, Lka3/a;->c:Z

    if-ne v0, v2, :cond_1

    iget-boolean p1, p1, Lka3/a;->d:Z

    iget-boolean v0, p0, Lka3/a;->d:Z

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lka3/a;->d:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lka3/a;->c:Z

    return v0
.end method

.method public final h(Z)Lka3/a;
    .locals 6

    const/4 v4, 0x0

    const/16 v5, 0x3b

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p1

    invoke-static/range {v0 .. v5}, Lka3/a;->a(Lka3/a;Lka3/b;ZLjava/util/Set;Llb3/c0;I)Lka3/a;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lka3/a;->f:Llb3/c0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llb3/y;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lka3/a;->a:Llb3/b1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lka3/a;->b:Lka3/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lka3/a;->c:Z

    add-int/2addr v0, v2

    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lka3/a;->d:Z

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final i(Lka3/b;)Lka3/a;
    .locals 6

    const/4 v4, 0x0

    const/16 v5, 0x3d

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lka3/a;->a(Lka3/a;Lka3/b;ZLjava/util/Set;Llb3/c0;I)Lka3/a;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lr93/x0;)Lka3/a;
    .locals 6

    iget-object v0, p0, Lka3/a;->e:Ljava/util/Set;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    invoke-static {p1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :goto_1
    const/4 v4, 0x0

    const/16 v5, 0x2f

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lka3/a;->a(Lka3/a;Lka3/b;ZLjava/util/Set;Llb3/c0;I)Lka3/a;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JavaTypeAttributes(howThisTypeIsUsed="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lka3/a;->a:Llb3/b1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", flexibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lka3/a;->b:Lka3/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isRaw="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lka3/a;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isForAnnotationParameter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lka3/a;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", visitedTypeParameters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lka3/a;->e:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lka3/a;->f:Llb3/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
