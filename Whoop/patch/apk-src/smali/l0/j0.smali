.class public final Ll0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/b2;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll0/j0;->a:I

    return-void
.end method


# virtual methods
.method public final a(Ly3/c;Ly3/m;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final b(Ly3/c;Ly3/m;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final c(Ly3/c;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final d(Ly3/c;)I
    .locals 0

    iget p1, p0, Ll0/j0;->a:I

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll0/j0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ll0/j0;

    iget v1, p0, Ll0/j0;->a:I

    iget p1, p1, Ll0/j0;->a:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Ll0/j0;->a:I

    mul-int/lit16 v0, v0, 0x3c1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Insets(left=0, top="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll0/j0;->a:I

    const-string v2, ", right=0, bottom=0)"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
