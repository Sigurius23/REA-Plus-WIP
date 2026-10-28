.class public final Lp6/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp6/g1;

.field public final b:I

.field public final c:Lv6/a;

.field public final d:Lv6/b;


# direct methods
.method public constructor <init>(Lp6/g1;ILv6/a;Lv6/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lp6/s;->a:Lp6/g1;

    .line 3
    iput p2, p0, Lp6/s;->b:I

    .line 4
    iput-object p3, p0, Lp6/s;->c:Lv6/a;

    .line 5
    iput-object p4, p0, Lp6/s;->d:Lv6/b;

    return-void
.end method

.method public synthetic constructor <init>(Lp6/g1;ILv6/a;Lv6/b;I)V
    .locals 2

    and-int/lit8 v0, p5, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p3, v1

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v1

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lp6/s;-><init>(Lp6/g1;ILv6/a;Lv6/b;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp6/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp6/s;

    iget-object v1, p0, Lp6/s;->a:Lp6/g1;

    iget-object v3, p1, Lp6/s;->a:Lp6/g1;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lp6/s;->b:I

    iget v3, p1, Lp6/s;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lp6/s;->c:Lv6/a;

    iget-object v3, p1, Lp6/s;->c:Lv6/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lp6/s;->d:Lv6/b;

    iget-object p1, p1, Lp6/s;->d:Lv6/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lp6/s;->a:Lp6/g1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lp6/s;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lp6/s;->c:Lv6/a;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget v3, v3, Lv6/a;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->hashCode(I)I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lp6/s;->d:Lv6/b;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget v1, v1, Lv6/b;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContainerSelector(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lp6/s;->a:Lp6/g1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", numChildren="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp6/s;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/s;->c:Lv6/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/s;->d:Lv6/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
