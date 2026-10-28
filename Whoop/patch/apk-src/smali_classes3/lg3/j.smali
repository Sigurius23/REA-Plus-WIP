.class public final Llg3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg3/f;


# static fields
.field public static final y:[Ljava/lang/String;

.field public static final z:Llg3/j;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v7, "+HHMMSS"

    const-string v8, "+HH:MM:SS"

    const-string v0, "+HH"

    const-string v1, "+HHmm"

    const-string v2, "+HH:mm"

    const-string v3, "+HHMM"

    const-string v4, "+HH:MM"

    const-string v5, "+HHMMss"

    const-string v6, "+HH:MM:ss"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Llg3/j;->y:[Ljava/lang/String;

    new-instance v0, Llg3/j;

    const-string v1, "Z"

    const-string v2, "+HH:MM:ss"

    invoke-direct {v0, v1, v2}, Llg3/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Llg3/j;->z:Llg3/j;

    new-instance v0, Llg3/j;

    const-string v1, "0"

    invoke-direct {v0, v1, v2}, Llg3/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg3/j;->w:Ljava/lang/String;

    const/4 p1, 0x0

    :goto_0
    const/16 v0, 0x9

    if-ge p1, v0, :cond_1

    sget-object v0, Llg3/j;->y:[Ljava/lang/String;

    aget-object v0, v0, p1

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput p1, p0, Llg3/j;->x:I

    return-void

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid zone offset pattern: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Llg3/q;Ljava/lang/CharSequence;I)I
    .locals 11

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Llg3/j;->w:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_0

    if-ne p3, v0, :cond_2

    sget-object v2, Lng3/a;->f0:Lng3/a;

    const-wide/16 v3, 0x0

    move v6, p3

    move-object v1, p1

    move v5, p3

    invoke-virtual/range {v1 .. v6}, Llg3/q;->k(Lng3/m;JII)I

    move-result p1

    return p1

    :cond_0
    if-ne p3, v0, :cond_1

    not-int p1, p3

    return p1

    :cond_1
    iget-object v5, p0, Llg3/j;->w:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-virtual/range {v2 .. v7}, Llg3/q;->l(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v1, Lng3/a;->f0:Lng3/a;

    const-wide/16 v2, 0x0

    add-int v5, p3, v7

    move-object v0, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Llg3/q;->k(Lng3/m;JII)I

    move-result p1

    return p1

    :cond_2
    invoke-interface/range {p2 .. p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x2b

    const/16 v2, 0x2d

    if-eq v0, v1, :cond_3

    if-ne v0, v2, :cond_7

    :cond_3
    const/4 v1, 0x1

    if-ne v0, v2, :cond_4

    const/4 v0, -0x1

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_0
    const/4 v2, 0x4

    new-array v2, v2, [I

    add-int/lit8 v4, p3, 0x1

    const/4 v5, 0x0

    aput v4, v2, v5

    invoke-virtual {p0, v2, v1, p2, v1}, Llg3/j;->c([IILjava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_7

    iget v4, p0, Llg3/j;->x:I

    const/4 v6, 0x3

    if-lt v4, v6, :cond_5

    move v4, v1

    goto :goto_1

    :cond_5
    move v4, v5

    :goto_1
    const/4 v8, 0x2

    invoke-virtual {p0, v2, v8, p2, v4}, Llg3/j;->c([IILjava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {p0, v2, v6, p2, v5}, Llg3/j;->c([IILjava/lang/CharSequence;Z)Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_2

    :cond_6
    int-to-long v3, v0

    aget p2, v2, v1

    int-to-long v0, p2

    const-wide/16 v9, 0xe10

    mul-long/2addr v0, v9

    aget p2, v2, v8

    int-to-long v7, p2

    const-wide/16 v9, 0x3c

    mul-long/2addr v7, v9

    add-long/2addr v7, v0

    aget p2, v2, v6

    int-to-long v0, p2

    add-long/2addr v7, v0

    mul-long/2addr v7, v3

    sget-object v1, Lng3/a;->f0:Lng3/a;

    aget v5, v2, v5

    move-object v0, p1

    move v4, p3

    move-wide v2, v7

    invoke-virtual/range {v0 .. v5}, Llg3/q;->k(Lng3/m;JII)I

    move-result p1

    return p1

    :cond_7
    :goto_2
    if-nez v7, :cond_8

    sget-object v1, Lng3/a;->f0:Lng3/a;

    const-wide/16 v2, 0x0

    add-int v5, p3, v7

    move-object v0, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Llg3/q;->k(Lng3/m;JII)I

    move-result p1

    return p1

    :cond_8
    not-int p1, p3

    return p1
.end method

.method public final b(Lab/h0;Ljava/lang/StringBuilder;)Z
    .locals 10

    sget-object v0, Lng3/a;->f0:Lng3/a;

    invoke-virtual {p1, v0}, Lab/h0;->r(Lng3/m;)Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/squareup/wire/n;->b0(J)I

    move-result p1

    const/4 v0, 0x1

    iget-object v1, p0, Llg3/j;->w:Ljava/lang/String;

    if-nez p1, :cond_1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v0

    :cond_1
    div-int/lit16 v2, p1, 0xe10

    rem-int/lit8 v2, v2, 0x64

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    div-int/lit8 v3, p1, 0x3c

    rem-int/lit8 v3, v3, 0x3c

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    rem-int/lit8 v4, p1, 0x3c

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-gez p1, :cond_2

    const-string p1, "-"

    goto :goto_0

    :cond_2
    const-string p1, "+"

    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-int/lit8 p1, v2, 0xa

    add-int/lit8 p1, p1, 0x30

    int-to-char p1, p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 p1, v2, 0xa

    add-int/lit8 p1, p1, 0x30

    int-to-char p1, p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p1, 0x3

    iget v6, p0, Llg3/j;->x:I

    if-ge v6, p1, :cond_3

    if-lt v6, v0, :cond_7

    if-lez v3, :cond_7

    :cond_3
    rem-int/lit8 p1, v6, 0x2

    const-string v7, ""

    const-string v8, ":"

    if-nez p1, :cond_4

    move-object v9, v8

    goto :goto_1

    :cond_4
    move-object v9, v7

    :goto_1
    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-int/lit8 v9, v3, 0xa

    add-int/lit8 v9, v9, 0x30

    int-to-char v9, v9

    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 v9, v3, 0xa

    add-int/lit8 v9, v9, 0x30

    int-to-char v9, v9

    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    const/4 v3, 0x7

    if-ge v6, v3, :cond_5

    const/4 v3, 0x5

    if-lt v6, v3, :cond_7

    if-lez v4, :cond_7

    :cond_5
    if-nez p1, :cond_6

    move-object v7, v8

    :cond_6
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-int/lit8 p1, v4, 0xa

    add-int/lit8 p1, p1, 0x30

    int-to-char p1, p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 p1, v4, 0xa

    add-int/lit8 p1, p1, 0x30

    int-to-char p1, p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v2, v4

    :cond_7
    if-nez v2, :cond_8

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    return v0
.end method

.method public final c([IILjava/lang/CharSequence;Z)Z
    .locals 5

    iget v0, p0, Llg3/j;->x:I

    add-int/lit8 v1, v0, 0x3

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    if-ge v1, p2, :cond_0

    return v2

    :cond_0
    aget v1, p1, v2

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_2

    const/4 v0, 0x1

    if-le p2, v0, :cond_2

    add-int/lit8 v0, v1, 0x1

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-gt v0, v3, :cond_6

    invoke-interface {p3, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v3, 0x3a

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    move v1, v0

    :cond_2
    add-int/lit8 v0, v1, 0x2

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v0, v3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v3, v1, 0x1

    invoke-interface {p3, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-interface {p3, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    const/16 v3, 0x30

    if-lt v1, v3, :cond_6

    const/16 v4, 0x39

    if-gt v1, v4, :cond_6

    if-lt p3, v3, :cond_6

    if-le p3, v4, :cond_4

    goto :goto_0

    :cond_4
    sub-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0xa

    sub-int/2addr p3, v3

    add-int/2addr p3, v1

    if-ltz p3, :cond_6

    const/16 v1, 0x3b

    if-le p3, v1, :cond_5

    goto :goto_0

    :cond_5
    aput p3, p1, p2

    aput v0, p1, v2

    return v2

    :cond_6
    :goto_0
    return p4
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, "\'"

    const-string v1, "\'\'"

    iget-object v2, p0, Llg3/j;->w:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Offset("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Llg3/j;->y:[Ljava/lang/String;

    iget v3, p0, Llg3/j;->x:I

    aget-object v2, v2, v3

    const-string v3, ",\'"

    const-string v4, "\')"

    invoke-static {v1, v2, v3, v0, v4}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
