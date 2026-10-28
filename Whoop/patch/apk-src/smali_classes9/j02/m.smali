.class public abstract Lj02/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "deeplinkPath",
        "b",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "a",
        "navigation_release"
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
.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "deeplinkPath"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v1, 0x0

    const/16 v2, 0x2f

    aput-char v2, v0, v1

    invoke-static {p0, v0}, Lyb3/r;->P0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    const-string v3, "toLowerCase(...)"

    invoke-static {v0, v1, p0, v0, v3}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x5f

    const/16 v1, 0x2d

    invoke-static {p0, v0, v1}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2, v1}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "deeplinkPath"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lj02/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "deeplink-migration-"

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
