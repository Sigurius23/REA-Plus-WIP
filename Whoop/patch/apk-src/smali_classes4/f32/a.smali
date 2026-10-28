.class public final Lf32/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lf32/a;",
        "",
        "<init>",
        "()V",
        "Lb32/e;",
        "Le32/b;",
        "b",
        "(Lb32/e;)Le32/b;",
        "Lb32/c;",
        "domainState",
        "Le32/c;",
        "a",
        "(Lb32/c;)Le32/c;",
        "payments_release"
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

.method private final b(Lb32/e;)Le32/b;
    .locals 2

    instance-of v0, p1, Lb32/e$d;

    if-eqz v0, :cond_0

    sget-object p1, Le32/b$d;->a:Le32/b$d;

    return-object p1

    :cond_0
    instance-of v0, p1, Lb32/e$b;

    if-eqz v0, :cond_1

    new-instance v0, Le32/b$b;

    check-cast p1, Lb32/e$b;

    invoke-virtual {p1}, Lb32/e$b;->a()Lb32/a;

    move-result-object v1

    invoke-virtual {p1}, Lb32/e$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Le32/b$b;-><init>(Lb32/a;Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lb32/e$a;

    if-eqz v0, :cond_2

    sget-object p1, Le32/b$a;->a:Le32/b$a;

    return-object p1

    :cond_2
    instance-of v0, p1, Lb32/e$c;

    if-eqz v0, :cond_3

    new-instance v0, Le32/b$c;

    check-cast p1, Lb32/e$c;

    invoke-virtual {p1}, Lb32/e$c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Le32/b$c;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lb32/e$h;

    if-eqz v0, :cond_4

    sget-object p1, Le32/b$h;->a:Le32/b$h;

    return-object p1

    :cond_4
    instance-of v0, p1, Lb32/e$g;

    if-eqz v0, :cond_5

    new-instance v0, Le32/b$g;

    check-cast p1, Lb32/e$g;

    invoke-virtual {p1}, Lb32/e$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le32/b$g;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    instance-of v0, p1, Lb32/e$f;

    if-eqz v0, :cond_6

    new-instance v0, Le32/b$f;

    check-cast p1, Lb32/e$f;

    invoke-virtual {p1}, Lb32/e$f;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Le32/b$f;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :cond_6
    instance-of p1, p1, Lb32/e$e;

    if-eqz p1, :cond_7

    sget-object p1, Le32/b$e;->a:Le32/b$e;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a(Lb32/c;)Le32/c;
    .locals 2

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le32/c;

    invoke-virtual {p1}, Lb32/c;->g()Lb32/e;

    move-result-object v1

    invoke-direct {p0, v1}, Lf32/a;->b(Lb32/e;)Le32/b;

    move-result-object v1

    invoke-virtual {p1}, Lb32/c;->f()Le32/a;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Le32/c;-><init>(Le32/b;Le32/a;)V

    return-object v0
.end method
