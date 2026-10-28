.class public abstract Lbg2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lbg2/h;",
        "Lbg2/c;",
        "a",
        "(Lbg2/h;)Lbg2/c;",
        "sms_release"
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
.method public static final a(Lbg2/h;)Lbg2/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lbg2/h$b;

    if-eqz v0, :cond_0

    sget-object p0, Lbg2/c$a;->a:Lbg2/c$a;

    return-object p0

    :cond_0
    instance-of v0, p0, Lbg2/h$c;

    if-eqz v0, :cond_1

    sget-object p0, Lbg2/c$e;->a:Lbg2/c$e;

    return-object p0

    :cond_1
    instance-of v0, p0, Lbg2/h$d;

    if-eqz v0, :cond_2

    new-instance v0, Lbg2/c$d;

    check-cast p0, Lbg2/h$d;

    invoke-virtual {p0}, Lbg2/h$d;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lbg2/c$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p0, Lbg2/h$a;

    if-eqz v0, :cond_3

    new-instance v0, Lbg2/c$c;

    check-cast p0, Lbg2/h$a;

    invoke-virtual {p0}, Lbg2/h$a;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lbg2/c$c;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of v0, p0, Lbg2/h$f;

    if-eqz v0, :cond_4

    sget-object p0, Lbg2/c$f;->a:Lbg2/c$f;

    return-object p0

    :cond_4
    instance-of v0, p0, Lbg2/h$e;

    if-eqz v0, :cond_5

    new-instance v0, Lbg2/c$b;

    check-cast p0, Lbg2/h$e;

    invoke-virtual {p0}, Lbg2/h$e;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lbg2/c$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
