.class public final Lg1/l5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt0/a;

.field public final b:Lt0/i;

.field public final c:Lt0/i;


# direct methods
.method public constructor <init>(Lt0/a;Lt0/i;Lt0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/l5;->a:Lt0/a;

    iput-object p2, p0, Lg1/l5;->b:Lt0/i;

    iput-object p3, p0, Lg1/l5;->c:Lt0/i;

    return-void
.end method

.method public static a(Lg1/l5;Lt0/i;Lt0/i;I)Lg1/l5;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-object p1, p0, Lg1/l5;->a:Lt0/a;

    :cond_0
    iget-object p3, p0, Lg1/l5;->c:Lt0/i;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lg1/l5;

    invoke-direct {p0, p1, p2, p3}, Lg1/l5;-><init>(Lt0/a;Lt0/i;Lt0/i;)V

    return-object p0
.end method


# virtual methods
.method public final b()Lt0/a;
    .locals 1

    iget-object v0, p0, Lg1/l5;->b:Lt0/i;

    return-object v0
.end method

.method public final c()Lt0/a;
    .locals 1

    iget-object v0, p0, Lg1/l5;->a:Lt0/a;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lg1/l5;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lg1/l5;

    iget-object v0, p1, Lg1/l5;->a:Lt0/a;

    iget-object v1, p0, Lg1/l5;->a:Lt0/a;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lg1/l5;->b:Lt0/i;

    iget-object v1, p1, Lg1/l5;->b:Lt0/i;

    invoke-virtual {v0, v1}, Lt0/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lg1/l5;->c:Lt0/i;

    iget-object p1, p1, Lg1/l5;->c:Lt0/i;

    invoke-virtual {v0, p1}, Lt0/i;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lg1/l5;->a:Lt0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg1/l5;->b:Lt0/i;

    invoke-virtual {v1}, Lt0/i;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lg1/l5;->c:Lt0/i;

    invoke-virtual {v0}, Lt0/i;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Shapes(small="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lg1/l5;->a:Lt0/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", medium="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/l5;->b:Lt0/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", large="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/l5;->c:Lt0/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
