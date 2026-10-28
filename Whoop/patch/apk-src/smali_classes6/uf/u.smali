.class public final Luf/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldg/a;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldg/a;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luf/u;->a:Ldg/a;

    iput-object p2, p0, Luf/u;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Luf/u;Ljava/lang/Object;)Luf/u;
    .locals 1

    iget-object v0, p0, Luf/u;->a:Ldg/a;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "context"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Luf/u;

    invoke-direct {p0, v0, p1}, Luf/u;-><init>(Ldg/a;Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public final b()Ldg/a;
    .locals 1

    iget-object v0, p0, Luf/u;->a:Ldg/a;

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Luf/u;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Luf/u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Luf/u;

    iget-object v1, p0, Luf/u;->a:Ldg/a;

    iget-object v3, p1, Luf/u;->a:Ldg/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Luf/u;->b:Ljava/lang/Object;

    iget-object p1, p1, Luf/u;->b:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Luf/u;->a:Ldg/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Luf/u;->b:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OperationRequest(context="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luf/u;->a:Ldg/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subject="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luf/u;->b:Ljava/lang/Object;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ld13/a;->l(Ljava/lang/StringBuilder;Ljava/lang/Object;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
