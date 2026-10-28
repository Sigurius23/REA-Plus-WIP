.class public abstract Lb62/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "retryInProgress",
        "Lc62/c;",
        "tileViewState",
        "b",
        "(ZLc62/c;)Z",
        "Lcom/whoop/navigation/e;",
        "a",
        "(ZLc62/c;)Lcom/whoop/navigation/e;",
        "recovery-impacts-mini-arch_release"
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
.method public static final a(ZLc62/c;)Lcom/whoop/navigation/e;
    .locals 1

    const-string v0, "tileViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    instance-of p0, p1, Lc62/c$c;

    if-eqz p0, :cond_1

    check-cast p1, Lc62/c$c;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p1}, Lc62/c$c;->a()Lm91/u;

    move-result-object p0

    instance-of p1, p0, Ld62/h;

    if-eqz p1, :cond_3

    check-cast p0, Ld62/h;

    goto :goto_1

    :cond_3
    move-object p0, v0

    :goto_1
    if-nez p0, :cond_4

    return-object v0

    :cond_4
    invoke-virtual {p0}, Ld62/h;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZLc62/c;)Z
    .locals 1

    const-string v0, "tileViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    instance-of p0, p1, Lc62/c$c;

    if-eqz p0, :cond_0

    check-cast p1, Lc62/c$c;

    invoke-virtual {p1}, Lc62/c$c;->a()Lm91/u;

    move-result-object p0

    instance-of p0, p0, Ld62/h;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
