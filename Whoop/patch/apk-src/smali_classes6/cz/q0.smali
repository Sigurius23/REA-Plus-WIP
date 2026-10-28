.class public final Lcz/q0;
.super Lcz/t0;
.source "SourceFile"


# instance fields
.field public final c:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Lcz/t0;-><init>(ZZ)V

    iput-boolean p1, p0, Lcz/q0;->c:Z

    return-void
.end method


# virtual methods
.method public final b(Lc93/a;)Lb30/j3;
    .locals 4

    const-string v0, "onEditIconPressed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lb30/j3;

    iget-boolean v0, p0, Lcz/q0;->c:Z

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-instance v2, Lou1/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lou1/a;-><init>(I)V

    invoke-direct {p1, v0, v1, v1, v2}, Lb30/j3;-><init>(ZZZLc93/a;)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcz/q0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcz/q0;

    iget-boolean v1, p0, Lcz/q0;->c:Z

    iget-boolean p1, p1, Lcz/q0;->c:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-boolean v0, p0, Lcz/q0;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "Loading(isLiveMode="

    const-string v1, ")"

    iget-boolean v2, p0, Lcz/q0;->c:Z

    invoke-static {v0, v1, v2}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
