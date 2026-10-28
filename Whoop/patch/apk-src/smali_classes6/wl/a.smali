.class public abstract Lwl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lwl/a;->a:[I

    return-void

    :array_0
    .array-data 4
        0x5f5e100
        0x989680
        0xf4240
        0x186a0
        0x2710
        0x3e8
        0x64
        0xa
        0x1
    .end array-data
.end method

.method public static a(Lvl/c;Ljava/lang/String;I)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 v0, p2, 0x1

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/time/format/DateTimeParseException;

    add-int/lit8 p2, p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p2

    const-string v1, "Trailing junk data after position %d: %s"

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1, v0}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0
.end method

.method public static b([CILvl/d;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    sget-object v1, Lvl/d;->c:Lvl/d;

    invoke-virtual {p2, v1}, Lvl/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p2, 0x5a

    aput-char p2, p0, p1

    const/4 p2, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lvl/d;->a()I

    move-result v1

    if-gez v1, :cond_1

    const/16 v1, 0x2d

    goto :goto_0

    :cond_1
    const/16 v1, 0x2b

    :goto_0
    aput-char v1, p0, p1

    iget v1, p2, Lvl/d;->a:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/lit8 v2, p1, 0x1

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, p0}, Lxl/b;->c(III[C)V

    add-int/lit8 v1, p1, 0x3

    const/16 v2, 0x3a

    aput-char v2, p0, v1

    iget p2, p2, Lvl/d;->b:I

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    add-int/lit8 v1, p1, 0x4

    invoke-static {p2, v1, v3, p0}, Lxl/b;->c(III[C)V

    const/4 p2, 0x6

    goto :goto_1

    :cond_2
    move p2, v0

    :goto_1
    new-instance v1, Ljava/lang/String;

    add-int/2addr p1, p2

    invoke-direct {v1, p0, v0, p1}, Ljava/lang/String;-><init>([CII)V

    return-object v1
.end method

.method public static c(Lvl/c;Ljava/lang/String;I)Lvl/d;
    .locals 5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lt p2, v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5a

    if-eq v2, v3, :cond_7

    const/16 v3, 0x7a

    if-ne v2, v3, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2b

    const/16 v4, 0x2d

    if-eq v2, v3, :cond_3

    if-ne v2, v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x4

    new-array p0, p0, [C

    fill-array-data p0, :array_0

    invoke-static {p1, p2, p0}, Lrg/a;->s(Ljava/lang/String;I[C)V

    throw v1

    :cond_3
    :goto_0
    const/4 v1, 0x6

    if-lt v0, v1, :cond_6

    add-int/lit8 v0, p2, 0x1

    add-int/lit8 v1, p2, 0x3

    invoke-static {v0, v1, p1}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v0

    add-int/lit8 v1, p2, 0x4

    add-int/lit8 v3, p2, 0x6

    invoke-static {v1, v3, p1}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v1

    if-ne v2, v4, :cond_5

    neg-int v0, v0

    neg-int v1, v1

    if-nez v0, :cond_5

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/time/format/DateTimeParseException;

    const-string v0, "Unknown \'Local Offset Convention\' date-time not allowed"

    invoke-direct {p0, v0, p1, p2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0

    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x5

    invoke-static {p0, p1, p2}, Lwl/a;->a(Lvl/c;Ljava/lang/String;I)V

    new-instance p0, Lvl/d;

    invoke-direct {p0, v0, v1}, Lvl/d;-><init>(II)V

    return-object p0

    :cond_6
    new-instance p0, Ljava/time/format/DateTimeParseException;

    const-string v0, "Invalid timezone offset: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0

    :cond_7
    :goto_2
    invoke-static {p0, p1, p2}, Lwl/a;->a(Lvl/c;Ljava/lang/String;I)V

    sget-object p0, Lvl/d;->c:Lvl/d;

    return-object p0

    :array_0
    .array-data 2
        0x5as
        0x7as
        0x2bs
        0x2ds
    .end array-data
.end method
