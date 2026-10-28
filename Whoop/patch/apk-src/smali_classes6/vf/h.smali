.class public final Lvf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvf/a;


# instance fields
.field public final a:Lmf/r;

.field public final b:Lcg/o;

.field public final c:Lmf/h;

.field public final d:Lmf/l;

.field public final e:Lmf/b;


# direct methods
.method public constructor <init>(Lmf/r;Lcg/o;Lmf/h;Lmf/l;Lmf/b;)V
    .locals 1

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvf/h;->a:Lmf/r;

    iput-object p2, p0, Lvf/h;->b:Lcg/o;

    iput-object p3, p0, Lvf/h;->c:Lmf/h;

    iput-object p4, p0, Lvf/h;->d:Lmf/l;

    iput-object p5, p0, Lvf/h;->e:Lmf/b;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvf/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvf/h;

    iget-object v1, p0, Lvf/h;->a:Lmf/r;

    iget-object v3, p1, Lvf/h;->a:Lmf/r;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvf/h;->b:Lcg/o;

    iget-object v3, p1, Lvf/h;->b:Lcg/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lvf/h;->c:Lmf/h;

    iget-object v3, p1, Lvf/h;->c:Lmf/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lvf/h;->d:Lmf/l;

    iget-object v3, p1, Lvf/h;->d:Lmf/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lvf/h;->e:Lmf/b;

    iget-object p1, p1, Lvf/h;->e:Lmf/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBody()Lmf/l;
    .locals 1

    iget-object v0, p0, Lvf/h;->d:Lmf/l;

    return-object v0
.end method

.method public final getHeaders()Lmf/h;
    .locals 1

    iget-object v0, p0, Lvf/h;->c:Lmf/h;

    return-object v0
.end method

.method public final getMethod()Lmf/r;
    .locals 1

    iget-object v0, p0, Lvf/h;->a:Lmf/r;

    return-object v0
.end method

.method public final getUrl()Lcg/o;
    .locals 1

    iget-object v0, p0, Lvf/h;->b:Lcg/o;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lvf/h;->a:Lmf/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lvf/h;->b:Lcg/o;

    invoke-virtual {v1}, Lcg/o;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lvf/h;->c:Lmf/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lvf/h;->d:Lmf/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lvf/h;->e:Lmf/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RealHttpRequest(method="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lvf/h;->a:Lmf/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvf/h;->b:Lcg/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvf/h;->c:Lmf/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvf/h;->d:Lmf/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trailingHeaders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvf/h;->e:Lmf/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
