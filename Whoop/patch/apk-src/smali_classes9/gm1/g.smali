.class public abstract Lgm1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgm1/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lm91/u;",
        "item",
        "Ljl1/a;",
        "autoPopDomainState",
        "b",
        "(Lm91/u;Ljl1/a;)Lm91/u;",
        "home_release"
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
.method public static final synthetic a(Lm91/u;Ljl1/a;)Lm91/u;
    .locals 0

    invoke-static {p0, p1}, Lgm1/g;->b(Lm91/u;Ljl1/a;)Lm91/u;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lm91/u;Ljl1/a;)Lm91/u;
    .locals 11

    instance-of v0, p0, Lnm1/c;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    move-object v0, p0

    check-cast v0, Lnm1/c;

    invoke-virtual {v0}, Lnm1/c;->e()Lnm1/i;

    move-result-object v1

    invoke-virtual {v1}, Lnm1/i;->g()Lnm1/f;

    move-result-object v2

    sget-object v3, Lgm1/g$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v10, 0x1

    if-eq v2, v10, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_2

    :cond_1
    sget-object v2, Lnm1/f;->WIND_DOWN_REPORT_OPENED:Lnm1/f;

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_2
    sget-object v2, Lnm1/f;->WAKE_UP_REPORT_OPENED:Lnm1/f;

    goto :goto_0

    :goto_1
    sget-object v2, Ljl1/a;->d:Ljl1/a$a;

    invoke-virtual {v1}, Lnm1/i;->c()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljl1/a$a;->e(Ljl1/a;Lcom/whoop/navigation/e;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/16 v8, 0x2f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lnm1/i;->b(Lnm1/i;ZLgz0/m0;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lnm1/f;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lnm1/i;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {v0, p1, p0, v10, p1}, Lnm1/c;->b(Lnm1/c;Lnm1/e;Lnm1/i;ILjava/lang/Object;)Lnm1/c;

    move-result-object p0

    :cond_3
    :goto_2
    return-object p0
.end method
