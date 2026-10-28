.class public abstract Lcom/whoop/archv2/feature/domain/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/navigation/c;",
        "",
        "c",
        "(Lcom/whoop/navigation/c;)Ljava/lang/String;",
        "",
        "d",
        "(Ljava/lang/String;)Ljava/util/Map;",
        "arch-v2_release"
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
.method public static final synthetic a(Lcom/whoop/navigation/c;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/archv2/feature/domain/s;->c(Lcom/whoop/navigation/c;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/lang/String;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/whoop/archv2/feature/domain/s;->d(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/navigation/c;)Ljava/lang/String;
    .locals 4

    instance-of v0, p0, Lcom/whoop/navigation/c$d;

    const-string v1, ")"

    if-eqz v0, :cond_1

    check-cast p0, Lcom/whoop/navigation/c$d;

    invoke-virtual {p0}, Lcom/whoop/navigation/c$d;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/navigation/c$d;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->e()Lj02/v0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lj02/v0;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Resolved(screen="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tab="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/whoop/navigation/c$e;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/whoop/navigation/c$e;

    invoke-virtual {p0}, Lcom/whoop/navigation/c$e;->a()I

    move-result p0

    const-string v0, "ServerError("

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v0, Lcom/whoop/navigation/c$c;->a:Lcom/whoop/navigation/c$c;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "NotMigrated"

    return-object p0

    :cond_3
    sget-object v0, Lcom/whoop/navigation/c$b;->a:Lcom/whoop/navigation/c$b;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p0, "NoRoute"

    return-object p0

    :cond_4
    sget-object v0, Lcom/whoop/navigation/c$f;->a:Lcom/whoop/navigation/c$f;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p0, "Unreachable"

    return-object p0

    :cond_5
    sget-object v0, Lcom/whoop/navigation/c$a;->a:Lcom/whoop/navigation/c$a;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "Invalid"

    return-object p0

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final d(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "?"

    invoke-static {p0, v0}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0xe

    invoke-static {v0, p0}, Lwb3/f;->W(ILjava/lang/String;)Li63/w;

    move-result-object p0

    invoke-static {p0}, Landroidx/room/c1;->r(Lo63/m;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method
