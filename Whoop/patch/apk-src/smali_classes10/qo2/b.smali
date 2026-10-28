.class public abstract Lqo2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljo2/b;",
        "",
        "stripeConfigurationId",
        "",
        "b",
        "(Ljo2/b;Ljava/lang/Long;)Z",
        "universal-checkout_release"
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
.method public static final synthetic a(Ljo2/b;Ljava/lang/Long;)Z
    .locals 0

    invoke-static {p0, p1}, Lqo2/b;->b(Ljo2/b;Ljava/lang/Long;)Z

    move-result p0

    return p0
.end method

.method private static final b(Ljo2/b;Ljava/lang/Long;)Z
    .locals 2

    invoke-virtual {p0}, Ljo2/b;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljo2/b;->a()Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    cmp-long p0, p0, v0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
