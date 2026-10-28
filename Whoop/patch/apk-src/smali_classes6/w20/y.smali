.class public final Lw20/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Lw20/z;

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLw20/z;Z)V
    .locals 1

    const-string v0, "lastFour"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw20/y;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lw20/y;->b:Z

    iput-object p3, p0, Lw20/y;->c:Lw20/z;

    iput-boolean p4, p0, Lw20/y;->d:Z

    return-void
.end method

.method public static a(Lw20/y;Lw20/z;ZI)Lw20/y;
    .locals 3

    iget-object v0, p0, Lw20/y;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lw20/y;->b:Z

    and-int/lit8 v2, p3, 0x4

    if-eqz v2, :cond_0

    iget-object p1, p0, Lw20/y;->c:Lw20/z;

    :cond_0
    and-int/lit8 p3, p3, 0x8

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lw20/y;->d:Z

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "lastFour"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lw20/y;

    invoke-direct {p0, v0, v1, p1, p2}, Lw20/y;-><init>(Ljava/lang/String;ZLw20/z;Z)V

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lw20/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lw20/y;

    iget-object v1, p0, Lw20/y;->a:Ljava/lang/String;

    iget-object v3, p1, Lw20/y;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lw20/y;->b:Z

    iget-boolean v3, p1, Lw20/y;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lw20/y;->c:Lw20/z;

    iget-object v3, p1, Lw20/y;->c:Lw20/z;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lw20/y;->d:Z

    iget-boolean p1, p1, Lw20/y;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lw20/y;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lw20/y;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lw20/y;->c:Lw20/z;

    invoke-virtual {v2}, Lw20/z;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lw20/y;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", isTestMode="

    const-string v1, ", cvcState="

    const-string v2, "CvcRecollectionViewState(lastFour="

    iget-object v3, p0, Lw20/y;->a:Ljava/lang/String;

    iget-boolean v4, p0, Lw20/y;->b:Z

    invoke-static {v2, v3, v0, v1, v4}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lw20/y;->c:Lw20/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lw20/y;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
