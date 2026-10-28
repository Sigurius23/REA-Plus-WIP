.class public final Lwn0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lwn0/b;",
        "",
        "Lcom/whoop/service/network/AuthServiceApiV2;",
        "authServiceApiV2",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;)V",
        "Lwn0/a;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/service/network/AuthServiceApiV2;",
        "Ltr2/n;",
        "change-password_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/service/network/AuthServiceApiV2;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;)V
    .locals 1

    const-string v0, "authServiceApiV2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwn0/b;->a:Lcom/whoop/service/network/AuthServiceApiV2;

    .line 3
    iput-object p2, p0, Lwn0/b;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "PasswordRequirementsFetcher"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lwn0/b;-><init>(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lwn0/b;)Lcom/whoop/service/network/AuthServiceApiV2;
    .locals 0

    iget-object p0, p0, Lwn0/b;->a:Lcom/whoop/service/network/AuthServiceApiV2;

    return-object p0
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lwn0/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lwn0/b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwn0/b$a;

    iget v1, v0, Lwn0/b$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwn0/b$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwn0/b$a;

    invoke-direct {v0, p0, p1}, Lwn0/b$a;-><init>(Lwn0/b;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lwn0/b$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lwn0/b$a;->y:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v10, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lwn0/b;->b:Ltr2/n;

    new-instance v5, Lwn0/b$b;

    invoke-direct {v5, p0, v9}, Lwn0/b$b;-><init>(Lwn0/b;Lq83/d;)V

    iput v10, v6, Lwn0/b$a;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_7

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/service/network/model/PasswordRequirementsResponse;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/service/network/model/PasswordRequirementsResponse;->getPasswordPolicies()Ljava/util/List;

    move-result-object v9

    :cond_4
    move-object p1, v9

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    new-instance p1, Lwn0/a$b;

    invoke-direct {p1, v9}, Lwn0/a$b;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_6
    :goto_3
    new-instance p1, Lwn0/a$a;

    sget-object v0, Lwn0/c$a;->a:Lwn0/c$a;

    invoke-direct {p1, v0}, Lwn0/a$a;-><init>(Lwn0/c;)V

    return-object p1

    :cond_7
    instance-of v0, p1, Lu02/a$b$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lwn0/b;->b:Ltr2/n;

    check-cast p1, Lu02/a$b$b;

    invoke-virtual {p1}, Lu02/a$b$b;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Network error fetching password requirements: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lwn0/a$a;

    new-instance v1, Lwn0/c$b;

    invoke-virtual {p1}, Lu02/a$b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v10}, Lwn0/c$b;-><init>(Ljava/lang/String;Z)V

    invoke-direct {v0, v1}, Lwn0/a$a;-><init>(Lwn0/c;)V

    return-object v0

    :cond_8
    instance-of v0, p1, Lu02/a$b$a;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lwn0/b;->b:Ltr2/n;

    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result v2

    const-string v3, "Server error fetching password requirements: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lwn0/a$a;

    new-instance v1, Lwn0/c$c;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result p1

    invoke-direct {v1, p1, v9}, Lwn0/c$c;-><init>(ILjava/lang/String;)V

    invoke-direct {v0, v1}, Lwn0/a$a;-><init>(Lwn0/c;)V

    return-object v0

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
