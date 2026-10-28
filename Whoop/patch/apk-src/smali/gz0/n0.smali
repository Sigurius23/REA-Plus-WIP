.class public abstract Lgz0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0004*\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "",
        "a",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "Lgz0/m0;",
        "default",
        "e",
        "(Ljava/lang/String;Lgz0/m0;)I",
        "b",
        "(Ljava/lang/String;)Lgz0/m0;",
        "c",
        "(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;",
        "design_release"
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
.method public static final a(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Lgz0/m0;
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;
    .locals 1

    const-string v0, "default"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object p0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)Lgz0/m0;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    :cond_0
    invoke-static {p0, p1}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Lgz0/m0;)I
    .locals 1

    const-string v0, "default"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p1}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    return p0
.end method

.method public static synthetic f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    :cond_0
    invoke-static {p0, p1}, Lgz0/n0;->e(Ljava/lang/String;Lgz0/m0;)I

    move-result p0

    return p0
.end method
