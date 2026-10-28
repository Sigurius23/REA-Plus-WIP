.class public final Lah/i;
.super Lah/d;
.source "SourceFile"


# instance fields
.field public final c:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(ILjava/math/BigInteger;)V
    .locals 0

    invoke-direct {p0, p1}, Lah/d;-><init>(I)V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lah/i;->c:Ljava/math/BigInteger;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lah/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lah/i;

    invoke-super {p0, p1}, Lah/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lah/i;->c:Ljava/math/BigInteger;

    iget-object v0, v0, Lah/i;->c:Ljava/math/BigInteger;

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    invoke-super {p0}, Lah/d;->hashCode()I

    move-result v0

    iget-object v1, p0, Lah/i;->c:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lah/i;->c:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
