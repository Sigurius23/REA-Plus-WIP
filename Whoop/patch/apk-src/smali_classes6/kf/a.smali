.class public final Lkf/a;
.super Ljava/lang/Number;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    iput-object p1, p0, Lkf/a;->w:Ljava/math/BigInteger;

    .line 2
    invoke-virtual {p1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p1}, Ljava/math/BigInteger;-><init>([B)V

    invoke-direct {p0, v0}, Lkf/a;-><init>(Ljava/math/BigInteger;)V

    return-void
.end method


# virtual methods
.method public final byteValue()B
    .locals 1

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/lang/Number;->byteValue()B

    move-result v0

    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lkf/a;

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    iget-object p1, p1, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    return p1
.end method

.method public final doubleValue()D
    .locals 2

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lkf/a;

    if-eqz v0, :cond_0

    check-cast p1, Lkf/a;

    iget-object p1, p1, Lkf/a;->w:Ljava/math/BigInteger;

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final floatValue()F
    .locals 1

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->floatValue()F

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x11

    return v0
.end method

.method public final intValue()I
    .locals 1

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    return v0
.end method

.method public final longValue()J
    .locals 2

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final shortValue()S
    .locals 1

    iget-object v0, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/lang/Number;->shortValue()S

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xa

    iget-object v1, p0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
