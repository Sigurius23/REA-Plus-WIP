.class public abstract Lq22/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a9\u0010\u0008\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lq22/f;",
        "Lq22/e;",
        "formValidator",
        "",
        "newValue",
        "",
        "reduceValidationRequirements",
        "isCardInputFfEnabled",
        "a",
        "(Lq22/f;Lq22/e;Ljava/lang/String;ZZ)Lq22/f;",
        "payments_release"
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
.method public static final a(Lq22/f;Lq22/e;Ljava/lang/String;ZZ)Lq22/f;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formValidator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-virtual {p1, p2}, Lq22/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, p2

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lq22/f;->e()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lq22/f;->d()Lq22/h;

    move-result-object p2

    invoke-virtual {p0}, Lq22/f;->c()Lq22/i;

    move-result-object v2

    move-object v0, p1

    move v4, p3

    move v5, p4

    move-object v3, v1

    move-object v1, p2

    invoke-virtual/range {v0 .. v5}, Lq22/e;->h(Lq22/h;Lq22/i;Ljava/lang/String;ZZ)Lq22/i;

    move-result-object v2

    move-object v1, v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lq22/f;->b(Lq22/f;Ljava/lang/String;Lq22/i;Lq22/h;ILjava/lang/Object;)Lq22/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lq22/f;Lq22/e;Ljava/lang/String;ZZILjava/lang/Object;)Lq22/f;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lq22/g;->a(Lq22/f;Lq22/e;Ljava/lang/String;ZZ)Lq22/f;

    move-result-object p0

    return-object p0
.end method
