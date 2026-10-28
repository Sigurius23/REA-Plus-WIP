.class public final Lxn0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\nH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lxn0/d;",
        "",
        "Lcom/whoop/service/network/AuthServiceApiV2;",
        "authServiceApiV2",
        "Lco0/a;",
        "jwtTokenParser",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/AuthServiceApiV2;Lco0/a;Ltr2/n;)V",
        "",
        "expiredToken",
        "emailFromArgs",
        "Lxn0/e;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/service/network/AuthServiceApiV2;",
        "Lco0/a;",
        "c",
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

.field private final b:Lco0/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/AuthServiceApiV2;Lco0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "authServiceApiV2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jwtTokenParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxn0/d;->a:Lcom/whoop/service/network/AuthServiceApiV2;

    .line 3
    iput-object p2, p0, Lxn0/d;->b:Lco0/a;

    .line 4
    iput-object p3, p0, Lxn0/d;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/service/network/AuthServiceApiV2;Lco0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    new-instance p2, Lco0/a;

    const/4 p5, 0x1

    const/4 v0, 0x0

    invoke-direct {p2, v0, p5, v0}, Lco0/a;-><init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "SendNewResetLinkHandler"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lxn0/d;-><init>(Lcom/whoop/service/network/AuthServiceApiV2;Lco0/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lxn0/d;)Lcom/whoop/service/network/AuthServiceApiV2;
    .locals 0

    iget-object p0, p0, Lxn0/d;->a:Lcom/whoop/service/network/AuthServiceApiV2;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lxn0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lxn0/d$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lxn0/d$a;

    iget v1, v0, Lxn0/d$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxn0/d$a;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lxn0/d$a;

    invoke-direct {v0, p0, p3}, Lxn0/d$a;-><init>(Lxn0/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lxn0/d$a;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lxn0/d$a;->F:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lxn0/d$a;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v6, Lxn0/d$a;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p2, v6, Lxn0/d$a;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p2, :cond_3

    iget-object p2, p0, Lxn0/d;->b:Lco0/a;

    invoke-virtual {p2, p1}, Lco0/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_3
    if-nez p2, :cond_4

    iget-object p1, p0, Lxn0/d;->c:Ltr2/n;

    const-string p2, "Failed to get email for new reset link"

    new-array p3, v9, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lxn0/e$a;->a:Lxn0/e$a;

    return-object p1

    :cond_4
    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lxn0/d;->c:Ltr2/n;

    new-instance v5, Lxn0/d$b;

    const/4 p3, 0x0

    invoke-direct {v5, p0, p2, p3}, Lxn0/d$b;-><init>(Lxn0/d;Ljava/lang/String;Lq83/d;)V

    iput-object p3, v6, Lxn0/d$a;->w:Ljava/lang/Object;

    iput-object p3, v6, Lxn0/d$a;->x:Ljava/lang/Object;

    iput-object p2, v6, Lxn0/d$a;->y:Ljava/lang/Object;

    iput p1, v6, Lxn0/d$a;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_5

    return-object v0

    :cond_5
    move-object p1, p2

    :goto_2
    check-cast p3, Lu02/a;

    instance-of p2, p3, Lu02/a$c;

    if-eqz p2, :cond_6

    new-instance p2, Lxn0/e$b;

    invoke-direct {p2, p1}, Lxn0/e$b;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_6
    instance-of p1, p3, Lu02/a$b$b;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lxn0/d;->c:Ltr2/n;

    const-string p2, "Network error sending new reset link"

    new-array p3, v9, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lxn0/e$a;->a:Lxn0/e$a;

    return-object p1

    :cond_7
    instance-of p1, p3, Lu02/a$b$a;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lxn0/d;->c:Ltr2/n;

    check-cast p3, Lu02/a$b$a;

    invoke-virtual {p3}, Lu02/a$b$a;->d()I

    move-result p2

    const-string p3, "Server error sending new reset link: "

    invoke-static {p2, p3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array p3, v9, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lxn0/e$a;->a:Lxn0/e$a;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
