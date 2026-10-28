.class public final Lvn2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lvn2/a;",
        "",
        "<init>",
        "()V",
        "event",
        "",
        "paymentMethodId",
        "Lwn2/e;",
        "a",
        "(Ljava/lang/Object;Ljava/lang/String;)Lwn2/e;",
        "universal-checkout_release"
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
.method public final a(Ljava/lang/Object;Ljava/lang/String;)Lwn2/e;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwn2/e;

    if-eqz v0, :cond_0

    check-cast p1, Lwn2/e;

    return-object p1

    :cond_0
    instance-of v0, p1, Lio2/d;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    new-instance v0, Lwn2/e$f;

    new-instance v1, Lsn2/d;

    check-cast p1, Lio2/d;

    invoke-virtual {p1}, Lio2/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio2/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1, p2}, Lsn2/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lwn2/e$f;-><init>(Lsn2/d;)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
