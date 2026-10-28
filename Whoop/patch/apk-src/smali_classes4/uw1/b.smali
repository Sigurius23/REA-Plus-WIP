.class public final Luw1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Luw1/b;",
        "",
        "<init>",
        "()V",
        "Lww1/d;",
        "event",
        "Lpw1/a;",
        "a",
        "(Lww1/d;)Lpw1/a;",
        "Lww1/g;",
        "Lqw1/b;",
        "b",
        "(Lww1/g;)Lqw1/b;",
        "membership_release"
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


# virtual methods
.method public final a(Lww1/d;)Lpw1/a;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lww1/d$b;

    if-eqz v0, :cond_0

    sget-object p1, Lpw1/a$b;->a:Lpw1/a$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Lww1/d$d;

    if-eqz v0, :cond_1

    new-instance v0, Lpw1/a$c;

    check-cast p1, Lww1/d$d;

    invoke-virtual {p1}, Lww1/d$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lww1/d$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lpw1/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    sget-object v0, Lww1/d$a;->a:Lww1/d$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lpw1/a$a;->a:Lpw1/a$a;

    return-object p1

    :cond_2
    instance-of v0, p1, Lww1/d$c;

    if-eqz v0, :cond_3

    new-instance v0, Lpw1/a$d;

    check-cast p1, Lww1/d$c;

    invoke-virtual {p1}, Lww1/d$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lww1/d$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lpw1/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(Lww1/g;)Lqw1/b;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lww1/g$c;

    if-eqz v0, :cond_0

    new-instance v0, Lqw1/b$c;

    check-cast p1, Lww1/g$c;

    invoke-virtual {p1}, Lww1/g$c;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lqw1/b$c;-><init>(Z)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lww1/g$b;

    if-eqz v0, :cond_1

    new-instance v0, Lqw1/b$b;

    check-cast p1, Lww1/g$b;

    invoke-virtual {p1}, Lww1/g$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lqw1/b$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lww1/g$d;

    if-eqz v0, :cond_2

    new-instance v0, Lqw1/b$d;

    check-cast p1, Lww1/g$d;

    invoke-virtual {p1}, Lww1/g$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lqw1/b$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    sget-object v0, Lww1/g$a;->a:Lww1/g$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lqw1/b$a;->a:Lqw1/b$a;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
