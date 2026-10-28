.class public final Ldm/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lau/f;

.field public final b:Ldm/b;


# direct methods
.method public constructor <init>(Lau/f;Ldm/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldm/a;->a:Lau/f;

    iput-object p2, p0, Ldm/a;->b:Ldm/b;

    return-void
.end method

.method public static a(Lau/f;Ldm/b;)Ldm/a;
    .locals 1

    new-instance v0, Ldm/a;

    invoke-direct {v0, p0, p1}, Ldm/a;-><init>(Lau/f;Ldm/b;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ldm/a;

    if-eqz v0, :cond_1

    check-cast p1, Ldm/a;

    iget-object v0, p1, Ldm/a;->b:Ldm/b;

    iget-object v1, p0, Ldm/a;->a:Lau/f;

    iget-object p1, p1, Ldm/a;->a:Lau/f;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ldm/d;->w:Ldm/d;

    invoke-virtual {p1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ldm/a;->b:Ldm/b;

    invoke-virtual {p1, v0}, Ldm/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const v0, 0xf4243

    mul-int v1, v0, v0

    iget-object v2, p0, Ldm/a;->a:Lau/f;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    mul-int/2addr v1, v0

    sget-object v2, Ldm/d;->w:Ldm/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    mul-int/2addr v1, v0

    iget-object v0, p0, Ldm/a;->b:Ldm/b;

    invoke-virtual {v0}, Ldm/b;->hashCode()I

    move-result v0

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Event{code=null, payload="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldm/a;->a:Lau/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", priority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ldm/d;->w:Ldm/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", productData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldm/a;->b:Ldm/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
