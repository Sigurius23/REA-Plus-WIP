.class public final Lkotlin/time/FractionalParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0008H\u0082\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0008H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlin/time/FractionalParser;",
        "",
        "<init>",
        "()V",
        "",
        "",
        "startIndex",
        "maxDigits",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "callback",
        "parseDigits",
        "(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)I",
        "value",
        "",
        "parse",
        "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)J",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lkotlin/time/FractionalParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/time/FractionalParser;

    invoke-direct {v0}, Lkotlin/time/FractionalParser;-><init>()V

    sput-object v0, Lkotlin/time/FractionalParser;->INSTANCE:Lkotlin/time/FractionalParser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final parseDigits(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/jvm/functions/Function1;",
            ")I"
        }
    .end annotation

    add-int v0, p2, p3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    move v2, p2

    move v3, v1

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-gt v5, v4, :cond_0

    const/16 v5, 0x3a

    if-ge v4, v5, :cond_0

    shl-int/lit8 v5, v3, 0x3

    shl-int/lit8 v3, v3, 0x1

    add-int/2addr v5, v3

    add-int/lit8 v4, v4, -0x30

    add-int v3, v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sub-int p1, v2, p2

    sub-int/2addr p3, p1

    :goto_1
    if-ge v1, p3, :cond_1

    shl-int/lit8 p1, v3, 0x3

    shl-int/lit8 p2, v3, 0x1

    add-int v3, p1, p2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v3
.end method


# virtual methods
.method public final parse(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)J
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/jvm/functions/Function1;",
            ")J"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v0, p2, 0x6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    move v2, p2

    move v3, v1

    :goto_0
    const/16 v4, 0x3a

    const/16 v5, 0x30

    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-gt v5, v6, :cond_0

    if-ge v6, v4, :cond_0

    shl-int/lit8 v4, v3, 0x3

    shl-int/lit8 v3, v3, 0x1

    add-int/2addr v4, v3

    add-int/lit8 v6, v6, -0x30

    add-int v3, v6, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sub-int p2, v2, p2

    rsub-int/lit8 p2, p2, 0x6

    move v0, v1

    :goto_1
    if-ge v0, p2, :cond_1

    shl-int/lit8 v6, v3, 0x3

    shl-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, v2, 0x9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    move v6, v1

    move v0, v2

    :goto_2
    if-ge v0, p2, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-gt v5, v7, :cond_2

    if-ge v7, v4, :cond_2

    shl-int/lit8 v8, v6, 0x3

    shl-int/lit8 v6, v6, 0x1

    add-int/2addr v8, v6

    add-int/lit8 v7, v7, -0x30

    add-int v6, v7, v8

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    sub-int p2, v0, v2

    rsub-int/lit8 p2, p2, 0x9

    :goto_3
    if-ge v1, p2, :cond_3

    shl-int/lit8 v2, v6, 0x3

    shl-int/lit8 v6, v6, 0x1

    add-int/2addr v6, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-ge v0, p2, :cond_4

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p2

    if-gt v5, p2, :cond_4

    if-ge p2, v4, :cond_4

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    int-to-long p1, v3

    const p3, 0x3b9aca00

    int-to-long v0, p3

    mul-long/2addr p1, v0

    int-to-long v0, v6

    add-long/2addr p1, v0

    return-wide p1
.end method
