.class public final Ld30/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lh20/l;

.field public final c:Z

.field public final d:Z

.field public final e:Ll83/p;


# direct methods
.method public constructor <init>(Ljava/util/List;Lh20/l;ZZ)V
    .locals 1

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/x;->a:Ljava/util/List;

    iput-object p2, p0, Ld30/x;->b:Lh20/l;

    iput-boolean p3, p0, Ld30/x;->c:Z

    iput-boolean p4, p0, Ld30/x;->d:Z

    new-instance p1, Ld1/i;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ld30/x;->e:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a()Lzy/b;
    .locals 2

    iget-boolean v0, p0, Ld30/x;->c:Z

    iget-object v1, p0, Ld30/x;->e:Ll83/p;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f141083

    goto :goto_0

    :cond_0
    const v0, 0x7f141085

    :goto_0
    invoke-static {v0}, Ls4/i;->h(I)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f1410cb

    goto :goto_1

    :cond_2
    const v0, 0x7f1410cc

    :goto_1
    invoke-static {v0}, Ls4/i;->h(I)Lzy/b;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ld30/h;)Lb30/j3;
    .locals 6

    iget-boolean v0, p1, Ld30/h;->a:Z

    new-instance v1, Ld1/i;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lb30/j3;

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    iget-boolean v3, p0, Ld30/x;->d:Z

    const/4 v4, 0x0

    if-ne v3, v2, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    iget-boolean v5, p0, Ld30/x;->c:Z

    if-ne v5, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    invoke-direct {p1, v0, v3, v2, v1}, Lb30/j3;-><init>(ZZZLc93/a;)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld30/x;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld30/x;

    iget-object v1, p0, Ld30/x;->a:Ljava/util/List;

    iget-object v3, p1, Ld30/x;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ld30/x;->b:Lh20/l;

    iget-object v3, p1, Ld30/x;->b:Lh20/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ld30/x;->c:Z

    iget-boolean v3, p1, Ld30/x;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Ld30/x;->d:Z

    iget-boolean p1, p1, Ld30/x;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Ld30/x;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ld30/x;->b:Lh20/l;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lh20/l;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ld30/x;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Ld30/x;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State(paymentMethods="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ld30/x;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld30/x;->b:Lh20/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEditing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", canEdit="

    const-string v2, ")"

    iget-boolean v3, p0, Ld30/x;->c:Z

    iget-boolean v4, p0, Ld30/x;->d:Z

    invoke-static {v0, v3, v1, v4, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
