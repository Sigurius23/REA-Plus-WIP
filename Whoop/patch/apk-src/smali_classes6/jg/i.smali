.class public final Ljg/i;
.super Lcom/squareup/wire/n;
.source "SourceFile"


# instance fields
.field public final c:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    const/16 v0, 0x12

    invoke-direct {p0, v0}, Lcom/squareup/wire/n;-><init>(I)V

    iput-boolean p1, p0, Ljg/i;->c:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ljg/i;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ljg/i;

    iget-boolean v0, p0, Ljg/i;->c:Z

    iget-boolean p1, p1, Ljg/i;->c:Z

    if-eq v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-boolean v0, p0, Ljg/i;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bool(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Ljg/i;->c:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
