.class public final Ljn0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljn0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ \u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\"\u0010\u0016\u001a\u00020\u0015*\u0008\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0011J!\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001f2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u0006*"
    }
    d2 = {
        "Ljn0/c;",
        "",
        "Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lhn0/a;",
        "analyticsHelper",
        "<init>",
        "(Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;Ltr2/n;Lhn0/a;)V",
        "Ljn0/c$a;",
        "challengeAcc",
        "Ljn0/b;",
        "prevDomainResult",
        "i",
        "(Ljn0/c$a;Ljn0/b;Lq83/d;)Ljava/lang/Object;",
        "m",
        "(Ljn0/b;)Ljn0/b;",
        "Lec3/m;",
        "Ljn0/a$b;",
        "action",
        "Ll83/a0;",
        "h",
        "(Lec3/m;Ljn0/a$b;Lq83/d;)Ljava/lang/Object;",
        "",
        "name",
        "l",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "k",
        "(Ljava/lang/String;Ljn0/b;Lq83/d;)Ljava/lang/Object;",
        "g",
        "Lec3/l;",
        "Ljn0/a;",
        "upstream",
        "j",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lhn0/a;",
        "challenge-details_release"
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
.field private final a:Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;

.field private final b:Ltr2/n;

.field private final c:Lhn0/a;


# direct methods
.method public constructor <init>(Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;Ltr2/n;Lhn0/a;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljn0/c;->a:Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;

    .line 3
    iput-object p2, p0, Ljn0/c;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Ljn0/c;->c:Lhn0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;Ltr2/n;Lhn0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ChallengeDetailsInteractor"

    invoke-virtual {p2, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ljn0/c;-><init>(Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;Ltr2/n;Lhn0/a;)V

    return-void
.end method

.method public static final synthetic a(Ljn0/c;Lec3/m;Ljn0/a$b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ljn0/c;->h(Lec3/m;Ljn0/a$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljn0/c;)Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;
    .locals 0

    iget-object p0, p0, Ljn0/c;->a:Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;

    return-object p0
.end method

.method public static final synthetic c(Ljn0/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ljn0/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Ljn0/c;Ljn0/c$a;Ljn0/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ljn0/c;->i(Ljn0/c$a;Ljn0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ljn0/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ljn0/c;->l(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ljn0/c;Ljn0/b;)Ljn0/b;
    .locals 0

    invoke-direct {p0, p1}, Ljn0/c;->m(Ljn0/b;)Ljn0/b;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljn0/b;)Ljn0/b;
    .locals 2

    instance-of v0, p1, Ljn0/b$c;

    if-eqz v0, :cond_0

    check-cast p1, Ljn0/b$c;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v0, v1}, Ljn0/b$c;->b(Ljn0/b$c;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;Ljn0/d;ILjava/lang/Object;)Ljn0/b$c;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final h(Lec3/m;Ljn0/a$b;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljn0/a$b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Ljn0/c$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ljn0/c$b;

    iget v1, v0, Ljn0/c$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljn0/c$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljn0/c$b;

    invoke-direct {v0, p0, p3}, Ljn0/c$b;-><init>(Ljn0/c;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Ljn0/c$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljn0/c$b;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ljn0/c$b;->x:Ljava/lang/Object;

    check-cast p1, Ljn0/a$b;

    iget-object p1, v0, Ljn0/c$b;->w:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Ljn0/c$b;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljn0/a$b;

    iget-object p1, v0, Ljn0/c$b;->w:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Ljn0/c$a;

    invoke-direct {p3, p2, v4}, Ljn0/c$a;-><init>(Ljn0/a;Z)V

    iput-object p1, v0, Ljn0/c$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Ljn0/c$b;->x:Ljava/lang/Object;

    iput v4, v0, Ljn0/c$b;->E:I

    invoke-interface {p1, p3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    new-instance p3, Ljn0/c$a;

    const/4 v2, 0x0

    invoke-direct {p3, p2, v2}, Ljn0/c$a;-><init>(Ljn0/a;Z)V

    const/4 p2, 0x0

    iput-object p2, v0, Ljn0/c$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Ljn0/c$b;->x:Ljava/lang/Object;

    iput v3, v0, Ljn0/c$b;->E:I

    invoke-interface {p1, p3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final i(Ljn0/c$a;Ljn0/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn0/c$a;",
            "Ljn0/b;",
            "Lq83/d<",
            "-",
            "Ljn0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljn0/c$a;->a()Ljn0/a;

    move-result-object v0

    instance-of v1, v0, Ljn0/a$c;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljn0/c$a;->a()Ljn0/a;

    move-result-object p1

    check-cast p1, Ljn0/a$c;

    invoke-virtual {p1}, Ljn0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Ljn0/c;->l(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, v0, Ljn0/a$b;

    if-eqz v1, :cond_1

    iget-object v0, p0, Ljn0/c;->c:Lhn0/a;

    invoke-virtual {p1}, Ljn0/c$a;->a()Ljn0/a;

    move-result-object v1

    check-cast v1, Ljn0/a$b;

    invoke-virtual {v1}, Ljn0/a$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhn0/a;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljn0/c$a;->a()Ljn0/a;

    move-result-object p1

    check-cast p1, Ljn0/a$b;

    invoke-virtual {p1}, Ljn0/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Ljn0/c;->k(Ljava/lang/String;Ljn0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Ljn0/a$a;

    if-eqz p1, :cond_2

    invoke-direct {p0, p2}, Ljn0/c;->g(Ljn0/b;)Ljn0/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final k(Ljava/lang/String;Ljn0/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljn0/b;",
            "Lq83/d<",
            "-",
            "Ljn0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljn0/c$f;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, p1, v1}, Ljn0/c$f;-><init>(Ljn0/b;Ljn0/c;Ljava/lang/String;Lq83/d;)V

    const-wide/16 p1, 0x3e8

    invoke-static {p1, p2, v0, p3}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final l(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljn0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ljn0/c$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljn0/c$g;

    iget v1, v0, Ljn0/c$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljn0/c$g;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljn0/c$g;

    invoke-direct {v0, p0, p2}, Ljn0/c$g;-><init>(Ljn0/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ljn0/c$g;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ljn0/c$g;->z:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ljn0/c$g;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Ljn0/c;->b:Ltr2/n;

    new-instance v5, Ljn0/c$h;

    invoke-direct {v5, p0, p1, v9}, Ljn0/c$h;-><init>(Ljn0/c;Ljava/lang/String;Lq83/d;)V

    iput-object v9, v6, Ljn0/c$g;->w:Ljava/lang/Object;

    iput p2, v6, Ljn0/c$g;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to load challenge details"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_4

    new-instance p1, Ljn0/b$c;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;

    const/4 v0, 0x2

    invoke-direct {p1, p2, v9, v0, v9}, Ljn0/b$c;-><init>(Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;Ljn0/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Ljn0/b$a;->a:Ljn0/b$a;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final m(Ljn0/b;)Ljn0/b;
    .locals 8

    instance-of v0, p1, Ljn0/b$c;

    if-eqz v0, :cond_0

    check-cast p1, Ljn0/b$c;

    new-instance v0, Ljn0/d;

    invoke-virtual {p1}, Ljn0/b$c;->c()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getSavingText()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Ljn0/b$c;->c()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getSavingSubText()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v5, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;->LOADING:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Ljn0/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Ljn0/b$c;->b(Ljn0/b$c;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;Ljn0/d;ILjava/lang/Object;)Ljn0/b$c;

    move-result-object p1

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final j(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljn0/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ljn0/c$c;-><init>(Lq83/d;Ljn0/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object v0, Ljn0/b$b;->a:Ljn0/b$b;

    new-instance v2, Ljn0/c$e;

    invoke-direct {v2, p0, v1}, Ljn0/c$e;-><init>(Ljn0/c;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
