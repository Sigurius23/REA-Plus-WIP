.class public abstract Lcom/whoop/archv2/feature/domain/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/c;",
        "Lcom/whoop/archv2/feature/domain/e;",
        "a",
        "(Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/e;",
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
.method public static final a(Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$d;

    if-nez v0, :cond_4

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$n;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$e;

    if-eqz v0, :cond_1

    sget-object p0, Lcom/whoop/archv2/feature/domain/e;->Pagination:Lcom/whoop/archv2/feature/domain/e;

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$j;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$k;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$l;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$m;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$c;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$b;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$a;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$g;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$h;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/c$f;

    if-nez v0, :cond_3

    sget-object v0, Lcom/whoop/archv2/feature/domain/c$i;->a:Lcom/whoop/archv2/feature/domain/c$i;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    sget-object p0, Lcom/whoop/archv2/feature/domain/e;->Action:Lcom/whoop/archv2/feature/domain/e;

    return-object p0

    :cond_4
    :goto_1
    sget-object p0, Lcom/whoop/archv2/feature/domain/e;->Fetch:Lcom/whoop/archv2/feature/domain/e;

    return-object p0
.end method
