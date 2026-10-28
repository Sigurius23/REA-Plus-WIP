.class public final Lhc2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lhc2/l;",
        "",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "membershipV2Api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;)V",
        "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;",
        "f",
        "Lhc2/b;",
        "d",
        "a",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "b",
        "Ltr2/n;",
        "settings_release"
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
.field private final a:Lcom/whoop/service/network/MembershipV2Api;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;)V
    .locals 1

    const-string v0, "membershipV2Api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhc2/l;->a:Lcom/whoop/service/network/MembershipV2Api;

    .line 3
    iput-object p2, p0, Lhc2/l;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "PauseInfoHelper"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lhc2/l;-><init>(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lhc2/l;)Lcom/whoop/service/network/MembershipV2Api;
    .locals 0

    iget-object p0, p0, Lhc2/l;->a:Lcom/whoop/service/network/MembershipV2Api;

    return-object p0
.end method

.method public static final synthetic b(Lhc2/l;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lhc2/l;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lhc2/l;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lhc2/l;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lhc2/l$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lhc2/l$b;

    iget v1, v0, Lhc2/l$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhc2/l$b;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lhc2/l$b;

    invoke-direct {v0, p0, p1}, Lhc2/l$b;-><init>(Lhc2/l;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lhc2/l$b;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lhc2/l$b;->y:I

    const/4 v9, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

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

    move p1, v2

    iget-object v2, p0, Lhc2/l;->b:Ltr2/n;

    new-instance v5, Lhc2/l$c;

    invoke-direct {v5, p0, v9}, Lhc2/l$c;-><init>(Lhc2/l;Lq83/d;)V

    iput p1, v6, Lhc2/l$b;->y:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch subscription pause info"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;

    return-object p1

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    return-object v9

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lhc2/l$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lhc2/l$d;

    iget v1, v0, Lhc2/l$d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhc2/l$d;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lhc2/l$d;

    invoke-direct {v0, p0, p1}, Lhc2/l$d;-><init>(Lhc2/l;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lhc2/l$d;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lhc2/l$d;->y:I

    const/4 v9, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

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

    move p1, v2

    iget-object v2, p0, Lhc2/l;->b:Ltr2/n;

    new-instance v5, Lhc2/l$e;

    invoke-direct {v5, p0, v9}, Lhc2/l$e;-><init>(Lhc2/l;Lq83/d;)V

    iput p1, v6, Lhc2/l$d;->y:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch subscription pause eligibility info"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;

    return-object p1

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    return-object v9

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lhc2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lhc2/l$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lhc2/l$a;

    iget v1, v0, Lhc2/l$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhc2/l$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhc2/l$a;

    invoke-direct {v0, p0, p1}, Lhc2/l$a;-><init>(Lhc2/l;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lhc2/l$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhc2/l$a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, v0, Lhc2/l$a;->z:I

    invoke-direct {p0, v0}, Lhc2/l;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;->isActive()Z

    move-result p1

    goto :goto_2

    :cond_5
    move p1, v5

    :goto_2
    if-eqz p1, :cond_6

    new-instance p1, Lhc2/b;

    invoke-direct {p1, v5, v5, v4}, Lhc2/b;-><init>(ZZZ)V

    return-object p1

    :cond_6
    iput p1, v0, Lhc2/l$a;->w:I

    iput v3, v0, Lhc2/l$a;->z:I

    invoke-direct {p0, v0}, Lhc2/l;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    check-cast p1, Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;->getEligibleToPause()Z

    move-result p1

    goto :goto_5

    :cond_8
    move p1, v5

    :goto_5
    if-eqz p1, :cond_9

    new-instance p1, Lhc2/b;

    invoke-direct {p1, v5, v4, v5}, Lhc2/b;-><init>(ZZZ)V

    return-object p1

    :cond_9
    new-instance p1, Lhc2/b;

    invoke-direct {p1, v5, v5, v5}, Lhc2/b;-><init>(ZZZ)V

    return-object p1
.end method
