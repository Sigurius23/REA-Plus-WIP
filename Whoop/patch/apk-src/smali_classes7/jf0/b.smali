.class public abstract Ljf0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroid/icu/text/NumberFormat;",
        "",
        "text",
        "",
        "b",
        "(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;",
        "",
        "c",
        "(D)Ljava/lang/String;",
        "",
        "a",
        "(D)Z",
        "advanced-labs_release"
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
.method private static final a(D)Z
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    rem-double/2addr p0, v0

    const-wide/16 v0, 0x0

    cmpg-double p0, p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x2c

    if-ge v1, v3, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0x2e

    if-ge v0, v3, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v5, :cond_2

    add-int/lit8 v1, v1, 0x1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x1

    if-gt v2, v0, :cond_6

    if-gt v1, v0, :cond_6

    if-lez v2, :cond_4

    if-lez v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {p0, p1}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {p1, v5, v4}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {p1, v4, v5}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p0

    return-object p0

    :cond_5
    return-object v0

    :cond_6
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c(D)Ljava/lang/String;
    .locals 1

    invoke-static {p0, p1}, Ljf0/b;->a(D)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Le93/b;->W(D)I

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%.1f"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
