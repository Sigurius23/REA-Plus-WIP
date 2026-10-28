.class public abstract Lcp1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcp1/k;",
        "Lcom/whoop/metrics/common/ScreenState;",
        "a",
        "(Lcp1/k;)Lcom/whoop/metrics/common/ScreenState;",
        "hormonal-insights_release"
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
.method public static final a(Lcp1/k;)Lcom/whoop/metrics/common/ScreenState;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcp1/k$i;->a:Lcp1/k$i;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object p0

    :cond_0
    sget-object v0, Lcp1/k$p;->a:Lcp1/k$p;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    instance-of v0, p0, Lcp1/k$d;

    if-nez v0, :cond_8

    instance-of v0, p0, Lcp1/k$o;

    if-nez v0, :cond_8

    instance-of v0, p0, Lcp1/k$b;

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    instance-of v0, p0, Lcp1/k$g;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$t;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$q;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$m;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$k;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$h;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$j;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$f;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$l;

    if-nez v0, :cond_7

    instance-of v0, p0, Lcp1/k$c;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    sget-object v0, Lcp1/k$s;->a:Lcp1/k$s;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcp1/k$r;->a:Lcp1/k$r;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcp1/k$a;->a:Lcp1/k$a;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, Lcp1/k$n;->a:Lcp1/k$n;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcp1/k$e;->a:Lcp1/k$e;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_0
    sget-object p0, Lcom/whoop/metrics/common/ScreenState;->UNKNOWN:Lcom/whoop/metrics/common/ScreenState;

    return-object p0

    :cond_6
    :goto_1
    sget-object p0, Lcom/whoop/metrics/common/ScreenState;->OTHER:Lcom/whoop/metrics/common/ScreenState;

    return-object p0

    :cond_7
    :goto_2
    sget-object p0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object p0

    :cond_8
    :goto_3
    sget-object p0, Lcom/whoop/metrics/common/ScreenState;->ERROR:Lcom/whoop/metrics/common/ScreenState;

    return-object p0
.end method
