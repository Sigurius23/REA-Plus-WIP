.class public final Lb30/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/g3;


# instance fields
.field public final a:Ly00/i;

.field public final b:Z


# direct methods
.method public constructor <init>(Ly00/i;Z)V
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/q;->a:Ly00/i;

    iput-boolean p2, p0, Lb30/q;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lb30/q;->b:Z

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb30/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb30/q;

    iget-object v1, p0, Lb30/q;->a:Ly00/i;

    iget-object v3, p1, Lb30/q;->a:Ly00/i;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lb30/q;->b:Z

    iget-boolean p1, p1, Lb30/q;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getIcon()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lb30/q;->a:Ly00/i;

    iget v0, v0, Ly00/i;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getLabel()Lzy/c;
    .locals 3

    iget-boolean v0, p0, Lb30/q;->b:Z

    iget-object v1, p0, Lb30/q;->a:Ly00/i;

    if-eqz v0, :cond_0

    iget-object v0, v1, Ly00/i;->x:Ljava/lang/String;

    invoke-static {v0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, v1, Ly00/i;->x:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f140fd6

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lb30/q;->a:Ly00/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lb30/q;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CardBrandChoice(brand="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lb30/q;->a:Ly00/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lb30/q;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
