.class public final Lg40/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/l3;


# instance fields
.field public final E:Z

.field public final F:Z

.field public final G:Lec3/h2;

.field public final w:Lzy/b;

.field public final x:I

.field public final y:I

.field public final z:Lec3/p1;


# direct methods
.method public constructor <init>(Lzy/b;IILec3/h2;ZI)V
    .locals 3

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x2

    :cond_0
    and-int/lit8 v0, p6, 0x4

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    move p3, v1

    :cond_1
    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_2

    const/4 p4, 0x0

    invoke-static {p4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p4

    :cond_2
    and-int/lit8 v0, p6, 0x10

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    move p5, v2

    :cond_3
    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_4

    goto :goto_0

    :cond_4
    move v1, v2

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/d3;->w:Lzy/b;

    iput p2, p0, Lg40/d3;->x:I

    iput p3, p0, Lg40/d3;->y:I

    iput-object p4, p0, Lg40/d3;->z:Lec3/p1;

    iput-boolean p5, p0, Lg40/d3;->E:Z

    iput-boolean v1, p0, Lg40/d3;->F:Z

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/d3;->G:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/d3;->z:Lec3/p1;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d()Lq3/g0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLabel()Lzy/c;
    .locals 1

    iget-object v0, p0, Lg40/d3;->w:Lzy/b;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLoading()Lec3/h2;
    .locals 1

    iget-object v0, p0, Lg40/d3;->G:Lec3/h2;

    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lg40/d3;->x:I

    return v0
.end method

.method public final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq3/n;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lq3/n;-><init>(I)V

    new-instance v1, Lq3/n;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lq3/n;-><init>(I)V

    filled-new-array {v0, v1}, [Lq3/n;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lq3/n;

    iget v2, p0, Lg40/d3;->y:I

    invoke-direct {v1, v2}, Lq3/n;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_2
    iget-boolean v0, p0, Lg40/d3;->F:Z

    if-nez v0, :cond_3

    sget-object v0, Lg40/b1;->a:Lyb3/p;

    const-string v1, ""

    invoke-virtual {v0, p1, v1}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final k(Ljava/lang/String;)Lg40/s3;
    .locals 2

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg40/q2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lg40/q2;-><init>(Lg40/l3;Ljava/lang/String;I)V

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lg40/d3;->E:Z

    return v0
.end method

.method public final m(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lg40/d3;->y:I

    return v0
.end method

.method public final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
