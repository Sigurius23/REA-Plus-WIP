.class public final Lwn0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lwn0/d;",
        "",
        "Lcom/whoop/service/network/AuthServiceApiV2;",
        "authServiceApiV2",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;)V",
        "",
        "errorCode",
        "Lwn0/e;",
        "b",
        "(I)Lwn0/e;",
        "",
        "token",
        "newPassword",
        "Lwn0/f;",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
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
    iput-object p1, p0, Lwn0/d;->a:Lcom/whoop/service/network/AuthServiceApiV2;

    .line 3
    iput-object p2, p0, Lwn0/d;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "PasswordResetSubmissionHandler"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lwn0/d;-><init>(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lwn0/d;)Lcom/whoop/service/network/AuthServiceApiV2;
    .locals 0

    iget-object p0, p0, Lwn0/d;->a:Lcom/whoop/service/network/AuthServiceApiV2;

    return-object p0
.end method

.method private final b(I)Lwn0/e;
    .locals 3

    const/16 v0, 0x191

    if-eq p1, v0, :cond_3

    const/16 v0, 0x199

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_2

    const/16 v0, 0x1a6

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1f4

    if-eq p1, v0, :cond_0

    new-instance v0, Lwn0/e$d;

    invoke-direct {v0, p1}, Lwn0/e$d;-><init>(I)V

    return-object v0

    :cond_0
    new-instance p1, Lwn0/e$d;

    invoke-direct {p1, v0}, Lwn0/e$d;-><init>(I)V

    return-object p1

    :cond_1
    new-instance p1, Lwn0/e$c;

    invoke-direct {p1, v2, v1, v2}, Lwn0/e$c;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    new-instance p1, Lwn0/e$b;

    invoke-direct {p1, v2, v1, v2}, Lwn0/e$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_3
    sget-object p1, Lwn0/e$e;->a:Lwn0/e$e;

    return-object p1
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lwn0/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lwn0/d$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lwn0/d$a;

    iget v1, v0, Lwn0/d$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwn0/d$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwn0/d$a;

    invoke-direct {v0, p0, p3}, Lwn0/d$a;-><init>(Lwn0/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lwn0/d$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lwn0/d$a;->E:I

    const/4 v9, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lwn0/d$a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lwn0/d$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lwn0/d;->b:Ltr2/n;

    new-instance v5, Lwn0/d$b;

    const/4 p3, 0x0

    invoke-direct {v5, p0, p1, p2, p3}, Lwn0/d$b;-><init>(Lwn0/d;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p3, v6, Lwn0/d$a;->w:Ljava/lang/Object;

    iput-object p3, v6, Lwn0/d$a;->x:Ljava/lang/Object;

    iput v9, v6, Lwn0/d$a;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_4

    sget-object p1, Lwn0/f$b;->a:Lwn0/f$b;

    return-object p1

    :cond_4
    instance-of p1, p3, Lu02/a$b$b;

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lwn0/d;->b:Ltr2/n;

    const-string p3, "Network error resetting password"

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p1, p3, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lwn0/f$a;

    new-instance p2, Lwn0/e$a;

    invoke-direct {p2, v9}, Lwn0/e$a;-><init>(Z)V

    invoke-direct {p1, p2}, Lwn0/f$a;-><init>(Lwn0/e;)V

    return-object p1

    :cond_5
    instance-of p1, p3, Lu02/a$b$a;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lwn0/d;->b:Ltr2/n;

    check-cast p3, Lu02/a$b$a;

    invoke-virtual {p3}, Lu02/a$b$a;->d()I

    move-result v0

    const-string v1, "Server error resetting password: "

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p1, v0, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lwn0/f$a;

    invoke-virtual {p3}, Lu02/a$b$a;->d()I

    move-result p2

    invoke-direct {p0, p2}, Lwn0/d;->b(I)Lwn0/e;

    move-result-object p2

    invoke-direct {p1, p2}, Lwn0/f$a;-><init>(Lwn0/e;)V

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
