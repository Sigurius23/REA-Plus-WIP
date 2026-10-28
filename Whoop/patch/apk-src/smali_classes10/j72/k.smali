.class public abstract Lj72/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lj72/j;",
        "Lcom/whoop/metrics/common/ScreenState;",
        "a",
        "(Lj72/j;)Lcom/whoop/metrics/common/ScreenState;",
        "sage_release"
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
.method public static final a(Lj72/j;)Lcom/whoop/metrics/common/ScreenState;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj72/j$f;->a:Lj72/j$f;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object p0

    :cond_0
    sget-object v0, Lj72/j$a;->a:Lj72/j$a;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    instance-of v0, p0, Lj72/j$i;

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    sget-object v0, Lj72/j$j;->a:Lj72/j$j;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    instance-of v0, p0, Lj72/j$l;

    if-nez v0, :cond_7

    instance-of v0, p0, Lj72/j$e;

    if-nez v0, :cond_7

    instance-of v0, p0, Lj72/j$d;

    if-nez v0, :cond_7

    instance-of v0, p0, Lj72/j$g;

    if-nez v0, :cond_7

    instance-of v0, p0, Lj72/j$c;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    sget-object v0, Lj72/j$k;->a:Lj72/j$k;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    instance-of v0, p0, Lj72/j$m;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, Lj72/j$b;->a:Lj72/j$b;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lj72/j$h;->a:Lj72/j$h;

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
