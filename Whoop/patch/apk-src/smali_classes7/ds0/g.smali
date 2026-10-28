.class public final Lds0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lds0/g;",
        "",
        "",
        "path",
        "Lcom/whoop/communityreactions/api/ReactionsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/communityreactions/api/ReactionsApi;Ltr2/n;)V",
        "Lds0/e;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lds0/e$c;",
        "e",
        "a",
        "Ljava/lang/String;",
        "b",
        "Lcom/whoop/communityreactions/api/ReactionsApi;",
        "Ltr2/n;",
        "",
        "d",
        "()Z",
        "hasPath",
        "community-reactions-arch-mini_release"
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
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/communityreactions/api/ReactionsApi;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/communityreactions/api/ReactionsApi;Ltr2/n;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lds0/g;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lds0/g;->b:Lcom/whoop/communityreactions/api/ReactionsApi;

    .line 4
    iput-object p3, p0, Lds0/g;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/communityreactions/api/ReactionsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ReactionsFetcher"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lds0/g;-><init>(Ljava/lang/String;Lcom/whoop/communityreactions/api/ReactionsApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lds0/g;)Lcom/whoop/communityreactions/api/ReactionsApi;
    .locals 0

    iget-object p0, p0, Lds0/g;->b:Lcom/whoop/communityreactions/api/ReactionsApi;

    return-object p0
.end method

.method public static final synthetic b(Lds0/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lds0/g;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lds0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lds0/g$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lds0/g$a;

    iget v1, v0, Lds0/g$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lds0/g$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lds0/g$a;

    invoke-direct {v0, p0, p1}, Lds0/g$a;-><init>(Lds0/g;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lds0/g$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lds0/g$a;->y:I

    const/4 v2, 0x1

    const/4 v9, 0x0

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

    iget-object v2, p0, Lds0/g;->c:Ltr2/n;

    new-instance v5, Lds0/g$b;

    invoke-direct {v5, p0, v9}, Lds0/g$b;-><init>(Lds0/g;Lq83/d;)V

    iput p1, v6, Lds0/g$a;->y:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch reactions"

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

    new-instance v0, Lds0/e$c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v9, v1, v9}, Lds0/e$c;-><init>(Lcom/whoop/communityreactions/domain/model/ReactionsResponse;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lds0/e$b;->a:Lds0/e$b;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lds0/g;->a:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final e(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lds0/e$c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lds0/g$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lds0/g$c;

    iget v1, v0, Lds0/g$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lds0/g$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lds0/g$c;

    invoke-direct {v0, p0, p1}, Lds0/g$c;-><init>(Lds0/g;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lds0/g$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lds0/g$c;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lds0/g;->d()Z

    move-result p1

    if-nez p1, :cond_3

    return-object v3

    :cond_3
    iput v4, v0, Lds0/g$c;->y:I

    invoke-virtual {p0, v0}, Lds0/g;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    instance-of v0, p1, Lds0/e$c;

    if-eqz v0, :cond_5

    check-cast p1, Lds0/e$c;

    return-object p1

    :cond_5
    return-object v3
.end method
