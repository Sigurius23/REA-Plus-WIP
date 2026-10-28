.class public final Lef0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lef0/b;",
        "",
        "<init>",
        "()V",
        "Ldf0/b;",
        "domainResult",
        "Lef0/a;",
        "a",
        "(Ldf0/b;)Lef0/a;",
        "advanced-labs_release"
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
.method public final a(Ldf0/b;)Lef0/a;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ldf0/b$b;

    if-nez v0, :cond_4

    instance-of v0, p1, Ldf0/b$c;

    if-nez v0, :cond_4

    instance-of v0, p1, Ldf0/b$a;

    if-nez v0, :cond_4

    instance-of v0, p1, Ldf0/b$g;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ldf0/b$f;

    if-eqz v0, :cond_1

    sget-object p1, Lef0/a$a;->a:Lef0/a$a;

    return-object p1

    :cond_1
    instance-of v0, p1, Ldf0/b$e;

    if-eqz v0, :cond_2

    new-instance v0, Lef0/a$d;

    check-cast p1, Ldf0/b$e;

    invoke-virtual {p1}, Ldf0/b$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lef0/a$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Ldf0/b$d;

    if-eqz v0, :cond_3

    new-instance v0, Lef0/a$c;

    check-cast p1, Ldf0/b$d;

    invoke-virtual {p1}, Ldf0/b$d;->a()Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;

    move-result-object v1

    invoke-virtual {p1}, Ldf0/b$d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lef0/a$c;-><init>(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
