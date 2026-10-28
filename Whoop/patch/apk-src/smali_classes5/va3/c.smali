.class public final Lva3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lva3/e;

.field public final b:Lva3/e;

.field public final c:Z


# direct methods
.method public constructor <init>(Lva3/e;Lva3/e;Z)V
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "relativeClassName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lva3/c;->a:Lva3/e;

    iput-object p2, p0, Lva3/c;->b:Lva3/e;

    iput-boolean p3, p0, Lva3/c;->c:Z

    .line 2
    iget-object p1, p2, Lva3/e;->a:Lva3/f;

    .line 3
    invoke-virtual {p1}, Lva3/f;->c()Z

    return-void
.end method

.method public constructor <init>(Lva3/e;Lva3/h;)V
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topLevelName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lva3/e;->c:Lva3/e;

    invoke-static {p2}, Lva3/d;->j(Lva3/h;)Lva3/e;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    return-void
.end method

.method public static final c(Lva3/e;)Ljava/lang/String;
    .locals 2

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    iget-object p0, p0, Lva3/f;->a:Ljava/lang/String;

    const/16 v0, 0x2f

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "`"

    const/16 v1, 0x60

    invoke-static {v1, v0, p0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final a()Lva3/e;
    .locals 4

    iget-object v0, p0, Lva3/c;->a:Lva3/e;

    iget-object v1, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v1

    iget-object v2, p0, Lva3/c;->b:Lva3/e;

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    new-instance v1, Lva3/e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, v2, Lva3/e;->a:Lva3/f;

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lva3/e;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public final b()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lva3/c;->a:Lva3/e;

    iget-object v1, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v1

    iget-object v2, p0, Lva3/c;->b:Lva3/e;

    if-eqz v1, :cond_0

    invoke-static {v2}, Lva3/c;->c(Lva3/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    invoke-static {v0, v3, v4}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lva3/c;->c(Lva3/e;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lva3/h;)Lva3/c;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lva3/c;

    iget-object v1, p0, Lva3/c;->b:Lva3/e;

    invoke-virtual {v1, p1}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object p1

    iget-boolean v1, p0, Lva3/c;->c:Z

    iget-object v2, p0, Lva3/c;->a:Lva3/e;

    invoke-direct {v0, v2, p1, v1}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    return-object v0
.end method

.method public final e()Lva3/c;
    .locals 4

    iget-object v0, p0, Lva3/c;->b:Lva3/e;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v0

    iget-object v1, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lva3/c;

    iget-object v2, p0, Lva3/c;->a:Lva3/e;

    iget-boolean v3, p0, Lva3/c;->c:Z

    invoke-direct {v1, v2, v0, v3}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lva3/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lva3/c;

    iget-object v1, p0, Lva3/c;->a:Lva3/e;

    iget-object v3, p1, Lva3/c;->a:Lva3/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lva3/c;->b:Lva3/e;

    iget-object v3, p1, Lva3/c;->b:Lva3/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lva3/c;->c:Z

    iget-boolean p1, p1, Lva3/c;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Lva3/h;
    .locals 1

    iget-object v0, p0, Lva3/c;->b:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lva3/c;->b:Lva3/e;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v0

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->c()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lva3/c;->a:Lva3/e;

    invoke-virtual {v0}, Lva3/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lva3/c;->b:Lva3/e;

    invoke-virtual {v1}, Lva3/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lva3/c;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lva3/c;->a:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lva3/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lva3/c;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
