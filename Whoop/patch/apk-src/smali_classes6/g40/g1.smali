.class public final Lg40/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/h1;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg40/g1;->a:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Lzy/b;
    .locals 1

    invoke-static {p0}, Lbp/b;->v(Lg40/h1;)Lzy/b;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lg40/g1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lg40/g1;

    iget v0, p0, Lg40/g1;->a:I

    iget p1, p1, Lg40/g1;->a:I

    if-eq v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final getMessage()I
    .locals 1

    iget v0, p0, Lg40/g1;->a:I

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lg40/g1;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "Warning(message="

    const-string v1, ", formatArgs=null)"

    iget v2, p0, Lg40/g1;->a:I

    invoke-static {v2, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
