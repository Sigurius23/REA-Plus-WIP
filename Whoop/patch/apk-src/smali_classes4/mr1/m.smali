.class public final Lmr1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lmr1/m;",
        "",
        "<init>",
        "()V",
        "Lmr1/a;",
        "dialogType",
        "",
        "b",
        "(Lmr1/a;)Ljava/lang/String;",
        "error",
        "a",
        "(Lmr1/a;Ljava/lang/String;)Ljava/lang/String;",
        "Lmr1/c;",
        "domainState",
        "Lmr1/l;",
        "c",
        "(Lmr1/c;)Lmr1/l;",
        "internal-tooling_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lmr1/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lmr1/a$a;->a:Lmr1/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Creating cart..."

    return-object p1

    :cond_0
    sget-object v0, Lmr1/a$b;->a:Lmr1/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Please check your internet connection and try again."

    return-object p1

    :cond_1
    sget-object v0, Lmr1/a$d;->a:Lmr1/a$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p2, :cond_2

    const-string p1, "Request failed. Please try again."

    return-object p1

    :cond_2
    return-object p2

    :cond_3
    sget-object p2, Lmr1/a$c;->a:Lmr1/a$c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, ""

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final b(Lmr1/a;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lmr1/a$a;->a:Lmr1/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Loading"

    return-object p1

    :cond_0
    sget-object v0, Lmr1/a$b;->a:Lmr1/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Network Error"

    return-object p1

    :cond_1
    sget-object v0, Lmr1/a$d;->a:Lmr1/a$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "Request Failed"

    return-object p1

    :cond_2
    sget-object v0, Lmr1/a$c;->a:Lmr1/a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, ""

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final c(Lmr1/c;)Lmr1/l;
    .locals 10

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lmr1/l;

    invoke-virtual {p1}, Lmr1/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lmr1/c;->g()Z

    move-result v3

    invoke-virtual {p1}, Lmr1/c;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lmr1/c;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v5

    :goto_1
    xor-int/2addr v0, v5

    invoke-virtual {p1}, Lmr1/c;->f()Z

    move-result v6

    invoke-virtual {p1}, Lmr1/c;->d()Lmr1/a;

    move-result-object v7

    sget-object v8, Lmr1/a$c;->a:Lmr1/a$c;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v5

    invoke-virtual {p1}, Lmr1/c;->d()Lmr1/a;

    move-result-object v5

    invoke-direct {p0, v5}, Lmr1/m;->b(Lmr1/a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lmr1/c;->d()Lmr1/a;

    move-result-object v5

    invoke-virtual {p1}, Lmr1/c;->e()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v5, p1}, Lmr1/m;->a(Lmr1/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move v5, v0

    invoke-direct/range {v1 .. v9}, Lmr1/l;-><init>(Ljava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
