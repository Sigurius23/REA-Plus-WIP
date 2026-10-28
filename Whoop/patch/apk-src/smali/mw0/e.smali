.class public final Lmw0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lmw0/e;",
        "",
        "<init>",
        "()V",
        "Ljw0/c;",
        "domainState",
        "Lmw0/d;",
        "a",
        "(Ljw0/c;)Lmw0/d;",
        "core-details_release"
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
.method public final a(Ljw0/c;)Lmw0/d;
    .locals 2

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljw0/c$a;

    if-eqz v0, :cond_0

    new-instance v0, Lmw0/d$b;

    check-cast p1, Ljw0/c$a;

    invoke-virtual {p1}, Ljw0/c$a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Ljw0/c$a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lmw0/d$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :cond_0
    sget-object v0, Ljw0/c$b;->a:Ljw0/c$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lmw0/d$g;->a:Lmw0/d$g;

    return-object p1

    :cond_1
    sget-object v0, Ljw0/c$d;->a:Ljw0/c$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lmw0/d$i;->a:Lmw0/d$i;

    return-object p1

    :cond_2
    sget-object v0, Ljw0/c$e;->a:Ljw0/c$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lmw0/d$j;->a:Lmw0/d$j;

    return-object p1

    :cond_3
    instance-of v0, p1, Ljw0/c$f;

    if-eqz v0, :cond_4

    new-instance v0, Lmw0/d$c;

    check-cast p1, Ljw0/c$f;

    invoke-virtual {p1}, Ljw0/c$f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Ljw0/c$f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lmw0/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :cond_4
    sget-object v0, Ljw0/c$g;->a:Ljw0/c$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lmw0/d$h;->a:Lmw0/d$h;

    return-object p1

    :cond_5
    sget-object v0, Ljw0/c$c;->a:Ljw0/c$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lmw0/d$f;->a:Lmw0/d$f;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
