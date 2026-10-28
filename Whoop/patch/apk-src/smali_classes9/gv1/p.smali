.class public abstract Lgv1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lgv1/o;",
        "Lv41/r0;",
        "b",
        "(Lgv1/o;)Lv41/r0;",
        "Lkd1/o;",
        "a",
        "(Lgv1/o;)Lkd1/o;",
        "lottie-tester_release"
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
.method public static final a(Lgv1/o;)Lkd1/o;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lgv1/o$b;

    if-eqz v0, :cond_0

    new-instance v1, Lkd1/o$c;

    check-cast p0, Lgv1/o$b;

    invoke-virtual {p0}, Lgv1/o$b;->a()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p0, Lgv1/o$a;

    if-eqz v0, :cond_1

    new-instance v1, Lkd1/o$c;

    check-cast p0, Lgv1/o$a;

    invoke-virtual {p0}, Lgv1/o$a;->a()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p0, Lgv1/o$d;

    if-nez v0, :cond_3

    instance-of p0, p0, Lgv1/o$c;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Lgv1/o;)Lv41/r0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lgv1/o$d;

    if-eqz v0, :cond_0

    check-cast p0, Lgv1/o$d;

    invoke-virtual {p0}, Lgv1/o$d;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lgv1/o$c;

    if-eqz v0, :cond_1

    check-cast p0, Lgv1/o$c;

    invoke-virtual {p0}, Lgv1/o$c;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lv41/r0$c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lv41/r0$c;->a(Ljava/lang/String;)Lv41/r0$c;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lgv1/o$b;

    if-nez v0, :cond_3

    instance-of p0, p0, Lgv1/o$a;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
