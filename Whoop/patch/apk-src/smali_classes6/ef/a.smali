.class public final Lef/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcg/o;

.field public final b:Lgf/b;


# direct methods
.method public constructor <init>(Lcg/o;)V
    .locals 1

    .line 1
    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lgf/i;->w:Lgf/i;

    invoke-direct {p0, p1, v0}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    return-void
.end method

.method public constructor <init>(Lcg/o;Lgf/b;)V
    .locals 1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lef/a;->a:Lcg/o;

    .line 5
    iput-object p2, p0, Lef/a;->b:Lgf/b;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lef/a;

    if-eqz v0, :cond_0

    check-cast p1, Lef/a;

    iget-object v0, p1, Lef/a;->a:Lcg/o;

    iget-object v1, p0, Lef/a;->a:Lcg/o;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lef/a;->b:Lgf/b;

    iget-object p1, p1, Lef/a;->b:Lgf/b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lef/a;->a:Lcg/o;

    invoke-virtual {v0}, Lcg/o;->hashCode()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3c1

    iget-object v1, p0, Lef/a;->b:Lgf/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Endpoint(uri="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lef/a;->a:Lcg/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headers=null, attributes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lef/a;->b:Lgf/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
