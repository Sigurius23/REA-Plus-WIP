.class public final Lj62/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lj62/a;",
        "Lj62/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00152\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lj62/d;",
        "Lod1/g;",
        "Lj62/a;",
        "Lj62/b;",
        "Lcom/whoop/referafriend/api/ReferAFriendApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lh62/b;",
        "analyticsHelper",
        "<init>",
        "(Lcom/whoop/referafriend/api/ReferAFriendApi;Ltr2/n;Lh62/b;)V",
        "",
        "source",
        "Lcom/whoop/referafriend/domain/models/RafHubResponse;",
        "g",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "screen",
        "Ll83/a0;",
        "h",
        "(Lcom/whoop/referafriend/domain/models/RafHubResponse;Ljava/lang/String;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/referafriend/api/ReferAFriendApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lh62/b;",
        "refer-a-friend_release"
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
.field private final a:Lcom/whoop/referafriend/api/ReferAFriendApi;

.field private final b:Ltr2/n;

.field private final c:Lh62/b;


# direct methods
.method public constructor <init>(Lcom/whoop/referafriend/api/ReferAFriendApi;Ltr2/n;Lh62/b;)V
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
    iput-object p1, p0, Lj62/d;->a:Lcom/whoop/referafriend/api/ReferAFriendApi;

    .line 3
    iput-object p2, p0, Lj62/d;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Lj62/d;->c:Lh62/b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/referafriend/api/ReferAFriendApi;Ltr2/n;Lh62/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ReferAFriendInteractor"

    invoke-virtual {p2, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lj62/d;-><init>(Lcom/whoop/referafriend/api/ReferAFriendApi;Ltr2/n;Lh62/b;)V

    return-void
.end method

.method public static final synthetic c(Lj62/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lj62/d;->g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lj62/d;)Lh62/b;
    .locals 0

    iget-object p0, p0, Lj62/d;->c:Lh62/b;

    return-object p0
.end method

.method public static final synthetic e(Lj62/d;)Lcom/whoop/referafriend/api/ReferAFriendApi;
    .locals 0

    iget-object p0, p0, Lj62/d;->a:Lcom/whoop/referafriend/api/ReferAFriendApi;

    return-object p0
.end method

.method public static final synthetic f(Lj62/d;Lcom/whoop/referafriend/domain/models/RafHubResponse;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj62/d;->h(Lcom/whoop/referafriend/domain/models/RafHubResponse;Ljava/lang/String;)V

    return-void
.end method

.method private final g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/referafriend/domain/models/RafHubResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lj62/d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lj62/d$a;

    iget v1, v0, Lj62/d$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lj62/d$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lj62/d$a;

    invoke-direct {v0, p0, p2}, Lj62/d$a;-><init>(Lj62/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lj62/d$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lj62/d$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lj62/d$a;->w:Ljava/lang/Object;

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

    iget-object v2, p0, Lj62/d;->b:Ltr2/n;

    new-instance v5, Lj62/d$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Lj62/d$b;-><init>(Lj62/d;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Lj62/d$a;->w:Ljava/lang/Object;

    iput p2, v6, Lj62/d$a;->z:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    invoke-static {p2}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final h(Lcom/whoop/referafriend/domain/models/RafHubResponse;Ljava/lang/String;)V
    .locals 10

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/RafHubResponse;->getFull()Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/RafHubType$Full;->getPromotion()Lcom/whoop/referafriend/domain/models/Promotion;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lj62/d;->c:Lh62/b;

    new-instance v1, Lh62/a$f;

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/RafHubResponse;->getFull()Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/referafriend/domain/models/RafHubType$Full;->getPromotion()Lcom/whoop/referafriend/domain/models/Promotion;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/referafriend/domain/models/Promotion;->getComplete()Z

    move-result v5

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/RafHubResponse;->getFull()Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/RafHubType$Full;->getPromotion()Lcom/whoop/referafriend/domain/models/Promotion;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/Promotion;->getCard()Lcom/whoop/referafriend/domain/models/PromotionCard;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/PromotionCard;->getReferralsCompleted()I

    move-result v6

    const/16 v8, 0x27

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh62/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1, p2}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lj62/d;->c:Lh62/b;

    new-instance v0, Lh62/a$k;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lh62/a$k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0, p2}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
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

    new-instance v0, Lj62/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj62/d$c;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lj62/b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lj62/b;-><init>(Lj62/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lj62/d$d;

    invoke-direct {v2, p0, v1}, Lj62/d$d;-><init>(Lj62/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
