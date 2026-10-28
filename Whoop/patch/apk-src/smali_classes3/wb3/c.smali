.class public final Lwb3/c;
.super Lwb3/a;
.source "SourceFile"

# interfaces
.implements Lob3/d;


# instance fields
.field public final x:Lj93/a0;

.field public final y:Lwb3/d;

.field public final z:Z


# direct methods
.method public constructor <init>(Lj93/a0;Lwb3/d;Z)V
    .locals 1

    const-string v0, "typeConstructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwb3/b;->w:Lwb3/b;

    invoke-direct {p0, v0}, Lwb3/a;-><init>(Lc93/a;)V

    iput-object p1, p0, Lwb3/c;->x:Lj93/a0;

    iput-object p2, p0, Lwb3/c;->y:Lwb3/d;

    iput-boolean p3, p0, Lwb3/c;->z:Z

    return-void
.end method


# virtual methods
.method public final a()Lj93/a0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Lj93/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lwb3/c;

    if-eqz v0, :cond_0

    check-cast p1, Lwb3/c;

    iget-object v0, p1, Lwb3/c;->x:Lj93/a0;

    iget-object v1, p0, Lwb3/c;->x:Lj93/a0;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwb3/c;->y:Lwb3/d;

    iget-object v1, p1, Lwb3/c;->y:Lwb3/d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lwb3/c;->z:Z

    iget-boolean p1, p1, Lwb3/c;->z:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()Lwb3/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getArguments()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getClassifier()Lj93/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h(Z)Lwb3/a;
    .locals 2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Definitely not null captured type is not supported yet: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lwb3/c;->x:Lj93/a0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lwb3/c;->y:Lwb3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lwb3/c;->z:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final i(Z)Lwb3/a;
    .locals 3

    iget-boolean v0, p0, Lwb3/c;->z:Z

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lwb3/c;

    iget-object v1, p0, Lwb3/c;->x:Lj93/a0;

    iget-object v2, p0, Lwb3/c;->y:Lwb3/d;

    invoke-direct {v0, v1, v2, p1}, Lwb3/c;-><init>(Lj93/a0;Lwb3/d;Z)V

    return-object v0
.end method

.method public final isMarkedNullable()Z
    .locals 1

    iget-boolean v0, p0, Lwb3/c;->z:Z

    return v0
.end method

.method public final j()Lwb3/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwb3/c;->y:Lwb3/d;

    invoke-virtual {v0}, Lwb3/d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
