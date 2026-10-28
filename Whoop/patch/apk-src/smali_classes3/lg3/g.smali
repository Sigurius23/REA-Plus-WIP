.class public final Llg3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg3/f;


# instance fields
.field public final w:Lng3/m;

.field public final x:I

.field public final y:Z


# direct methods
.method public constructor <init>(Lng3/m;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "field"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lng3/m;->range()Lng3/s;

    move-result-object v0

    iget-wide v1, v0, Lng3/s;->w:J

    iget-wide v3, v0, Lng3/s;->x:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-wide v1, v0, Lng3/s;->y:J

    iget-wide v3, v0, Lng3/s;->z:J

    cmp-long v0, v1, v3

    if-nez v0, :cond_0

    iput-object p1, p0, Llg3/g;->w:Lng3/m;

    const/16 p1, 0x9

    iput p1, p0, Llg3/g;->x:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Llg3/g;->y:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Field must have a fixed set of values: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Llg3/q;Ljava/lang/CharSequence;I)I
    .locals 10

    iget-boolean v0, p1, Llg3/q;->c:Z

    iget-object v1, p1, Llg3/q;->d:Ljava/lang/Object;

    check-cast v1, Llg3/t;

    const/16 v2, 0x9

    if-eqz v0, :cond_0

    iget v0, p0, Llg3/g;->x:I

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ne p3, v3, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean v4, p0, Llg3/g;->y:Z

    if-eqz v4, :cond_3

    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0x2e

    if-eq v4, v5, :cond_2

    :goto_1
    return p3

    :cond_2
    add-int/lit8 p3, p3, 0x1

    :cond_3
    move v8, p3

    if-le v8, v3, :cond_4

    not-int p1, v8

    return p1

    :cond_4
    add-int/2addr v0, v8

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result p3

    const/4 v0, 0x0

    move v3, v0

    move v9, v8

    :goto_2
    if-ge v9, p3, :cond_7

    add-int/lit8 v4, v9, 0x1

    invoke-interface {p2, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v5, v5, -0x30

    if-ltz v5, :cond_5

    if-gt v5, v2, :cond_5

    goto :goto_3

    :cond_5
    const/4 v5, -0x1

    :goto_3
    if-gez v5, :cond_6

    if-ge v4, v8, :cond_7

    not-int p1, v8

    return p1

    :cond_6
    mul-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v5

    move v9, v4

    goto :goto_2

    :cond_7
    new-instance p2, Ljava/math/BigDecimal;

    invoke-direct {p2, v3}, Ljava/math/BigDecimal;-><init>(I)V

    sub-int p3, v9, v8

    invoke-virtual {p2, p3}, Ljava/math/BigDecimal;->movePointLeft(I)Ljava/math/BigDecimal;

    move-result-object p2

    iget-object p3, p0, Llg3/g;->w:Lng3/m;

    invoke-interface {p3}, Lng3/m;->range()Lng3/s;

    move-result-object p3

    iget-wide v1, p3, Lng3/s;->w:J

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    iget-wide v2, p3, Lng3/s;->z:J

    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p3

    invoke-virtual {p3, v1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p3

    sget-object v2, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    invoke-virtual {p3, v2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p2

    sget-object p3, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    invoke-virtual {p2, v0, p3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p2

    invoke-virtual {p2}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide v6

    iget-object v5, p0, Llg3/g;->w:Lng3/m;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Llg3/q;->k(Lng3/m;JII)I

    move-result p1

    return p1
.end method

.method public final b(Lab/h0;Ljava/lang/StringBuilder;)Z
    .locals 7

    iget-object v0, p0, Llg3/g;->w:Lng3/m;

    invoke-virtual {p1, v0}, Lab/h0;->r(Lng3/m;)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object p1, p1, Lab/h0;->z:Ljava/lang/Object;

    check-cast p1, Llg3/t;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-interface {v0}, Lng3/m;->range()Lng3/s;

    move-result-object v1

    invoke-virtual {v1, v3, v4, v0}, Lng3/s;->b(JLng3/m;)V

    iget-wide v5, v1, Lng3/s;->w:J

    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    iget-wide v5, v1, Lng3/s;->z:J

    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v1

    sget-object v5, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    invoke-virtual {v1, v5}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v3, v4}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    sget-object v3, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    const/16 v4, 0x9

    invoke-virtual {v0, v1, v4, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/math/BigDecimal;->signum()I

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/math/BigDecimal;

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-direct {v1, v0, v2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/math/BigDecimal;->scale()I

    move-result v0

    const/4 v4, 0x1

    if-nez v0, :cond_3

    return v4

    :cond_3
    invoke-virtual {v1}, Ljava/math/BigDecimal;->scale()I

    move-result v0

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Llg3/g;->x:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, v0, v3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p1, p0, Llg3/g;->y:Z

    if-eqz p1, :cond_4

    const/16 p1, 0x2e

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v4
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Llg3/g;->y:Z

    if-eqz v0, :cond_0

    const-string v0, ",DecimalPoint"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fraction("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llg3/g;->w:Lng3/m;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",0,"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Llg3/g;->x:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
