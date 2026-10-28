.class public abstract Lyl0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\'\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a/\u0010\u001b\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "",
        "decimalPlaces",
        "Ljava/util/Locale;",
        "locale",
        "Ljava/text/NumberFormat;",
        "d",
        "(ILjava/util/Locale;)Ljava/text/NumberFormat;",
        "h",
        "(Ljava/util/Locale;)Ljava/text/NumberFormat;",
        "",
        "text",
        "",
        "f",
        "(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/List;",
        "e",
        "(Ljava/util/Locale;)Ljava/util/Locale;",
        "",
        "value",
        "a",
        "(DILjava/util/Locale;)Ljava/lang/String;",
        "g",
        "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/Double;",
        "",
        "b",
        "(Ljava/lang/String;ILjava/util/Locale;)Z",
        "min",
        "max",
        "c",
        "(Ljava/lang/String;DDLjava/util/Locale;)Z",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(DILjava/util/Locale;)Ljava/lang/String;
    .locals 1

    const-string v0, "locale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lyl0/p;->d(ILjava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Ljava/lang/String;ILjava/util/Locale;)Z
    .locals 3

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0, p2}, Lyl0/p;->f(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/List;

    move-result-object p0

    const/4 p2, 0x0

    if-nez p0, :cond_1

    return p2

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    if-eqz p1, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-le p0, p1, :cond_3

    :cond_2
    return p2

    :cond_3
    return v1
.end method

.method public static final c(Ljava/lang/String;DDLjava/util/Locale;)Z
    .locals 4

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0, p5}, Lyl0/p;->g(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/Double;

    move-result-object p0

    const/4 p5, 0x1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpg-double p0, p1, v2

    if-gtz p0, :cond_1

    cmpg-double p0, v2, p3

    if-gtz p0, :cond_1

    move v1, p5

    :cond_1
    xor-int/lit8 p0, v1, 0x1

    return p0

    :cond_2
    return p5
.end method

.method private static final d(ILjava/util/Locale;)Ljava/text/NumberFormat;
    .locals 1

    invoke-static {p1}, Ljava/text/NumberFormat;->getNumberInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/text/NumberFormat;->setGroupingUsed(Z)V

    invoke-virtual {p1, p0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    invoke-virtual {p1, p0}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    return-object p1
.end method

.method public static final e(Ljava/util/Locale;)Ljava/util/Locale;
    .locals 1

    const-string v0, "locale"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lor2/q0;->b(Ljava/util/Locale;)Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    move-result-object p1

    invoke-virtual {p1}, Ljava/text/DecimalFormatSymbols;->getDecimalSeparator()C

    move-result p1

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v1, 0x0

    aput-char p1, v0, v1

    const/4 p1, 0x6

    invoke-static {p0, v0, v1, p1}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x2

    if-le p1, v0, :cond_0

    goto :goto_1

    :cond_0
    move-object p1, p0

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move v2, v1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-nez v3, :cond_3

    :goto_1
    const/4 p0, 0x0

    return-object p0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-object p0
.end method

.method public static final g(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/Double;
    .locals 6

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lyl0/p;->f(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v4, v5, :cond_2

    invoke-interface {v2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v5

    if-eqz v5, :cond_6

    new-instance v0, Ljava/text/ParsePosition;

    invoke-direct {v0, v3}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-static {p1}, Lyl0/p;->h(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object p1

    invoke-virtual {p1, p0, v0}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/lang/Number;

    move-result-object p1

    if-nez p1, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {v0}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_5

    invoke-virtual {v0}, Ljava/text/ParsePosition;->getIndex()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-eq v0, p0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_1
    return-object v1

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_7
    :goto_2
    return-object v1
.end method

.method private static final h(Ljava/util/Locale;)Ljava/text/NumberFormat;
    .locals 1

    invoke-static {p0}, Ljava/text/NumberFormat;->getNumberInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/text/NumberFormat;->setGroupingUsed(Z)V

    return-object p0
.end method
