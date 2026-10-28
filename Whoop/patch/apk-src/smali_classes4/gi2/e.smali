.class public final Lgi2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\nJ\u0018\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lgi2/e;",
        "",
        "Lcom/whoop/strava/domain/StravaApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/strava/domain/StravaApi;Ltr2/n;)V",
        "Lgi2/d;",
        "h",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lgi2/b$i;",
        "userSettingsInformation",
        "j",
        "(Lgi2/b$i;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;",
        "authorizeRequest",
        "f",
        "(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;",
        "g",
        "Lgi2/b;",
        "domainAction",
        "i",
        "(Lgi2/b;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/strava/domain/StravaApi;",
        "b",
        "Ltr2/n;",
        "strava_release"
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
.field private final a:Lcom/whoop/strava/domain/StravaApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/strava/domain/StravaApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi2/e;->a:Lcom/whoop/strava/domain/StravaApi;

    iput-object p2, p0, Lgi2/e;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lgi2/e;Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lgi2/e;->f(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lgi2/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lgi2/e;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lgi2/e;)Lcom/whoop/strava/domain/StravaApi;
    .locals 0

    iget-object p0, p0, Lgi2/e;->a:Lcom/whoop/strava/domain/StravaApi;

    return-object p0
.end method

.method public static final synthetic d(Lgi2/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lgi2/e;->h(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lgi2/e;Lgi2/b$i;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lgi2/e;->j(Lgi2/b$i;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;",
            "Lq83/d<",
            "-",
            "Lgi2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lgi2/e$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lgi2/e$a;

    iget v1, v0, Lgi2/e$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgi2/e$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lgi2/e$a;

    invoke-direct {v0, p0, p2}, Lgi2/e$a;-><init>(Lgi2/e;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lgi2/e$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lgi2/e$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lgi2/e$a;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;

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

    iget-object v2, p0, Lgi2/e;->b:Ltr2/n;

    new-instance v5, Lgi2/e$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Lgi2/e$b;-><init>(Lgi2/e;Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)V

    iput-object v3, v6, Lgi2/e$a;->w:Ljava/lang/Object;

    iput p2, v6, Lgi2/e$a;->z:I

    const-string v4, "authorize"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_4

    sget-object p1, Lgi2/d$c;->a:Lgi2/d$c;

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_5

    new-instance p1, Lgi2/d$a;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/strava/domain/models/StravaDefaultResponse;

    invoke-direct {p1, p2}, Lgi2/d$a;-><init>(Lcom/whoop/strava/domain/models/StravaDefaultResponse;)V

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lgi2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lgi2/e$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lgi2/e$c;

    iget v1, v0, Lgi2/e$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgi2/e$c;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lgi2/e$c;

    invoke-direct {v0, p0, p1}, Lgi2/e$c;-><init>(Lgi2/e;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lgi2/e$c;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lgi2/e$c;->y:I

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

    iget-object v2, p0, Lgi2/e;->b:Ltr2/n;

    new-instance v5, Lgi2/e$d;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lgi2/e$d;-><init>(Lgi2/e;Lq83/d;)V

    iput p1, v6, Lgi2/e$c;->y:I

    const-string v4, "deauthorize"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_4

    sget-object p1, Lgi2/d$c;->a:Lgi2/d$c;

    return-object p1

    :cond_4
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    new-instance v0, Lgi2/d$g;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    invoke-direct {v0, p1}, Lgi2/d$g;-><init>(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;)V

    return-object v0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lgi2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lgi2/e$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lgi2/e$e;

    iget v1, v0, Lgi2/e$e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgi2/e$e;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lgi2/e$e;

    invoke-direct {v0, p0, p1}, Lgi2/e$e;-><init>(Lgi2/e;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lgi2/e$e;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lgi2/e$e;->y:I

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

    iget-object v2, p0, Lgi2/e;->b:Ltr2/n;

    new-instance v5, Lgi2/e$f;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lgi2/e$f;-><init>(Lgi2/e;Lq83/d;)V

    iput p1, v6, Lgi2/e$e;->y:I

    const-string v4, "getBffSettings"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_4

    sget-object p1, Lgi2/d$c;->a:Lgi2/d$c;

    return-object p1

    :cond_4
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    new-instance v0, Lgi2/d$g;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    invoke-direct {v0, p1}, Lgi2/d$g;-><init>(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;)V

    return-object v0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final j(Lgi2/b$i;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/b$i;",
            "Lq83/d<",
            "-",
            "Lgi2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lgi2/e$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lgi2/e$g;

    iget v1, v0, Lgi2/e$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgi2/e$g;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lgi2/e$g;

    invoke-direct {v0, p0, p2}, Lgi2/e$g;-><init>(Lgi2/e;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lgi2/e$g;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lgi2/e$g;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lgi2/e$g;->w:Ljava/lang/Object;

    check-cast p1, Lgi2/b$i;

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

    iget-object v2, p0, Lgi2/e;->b:Ltr2/n;

    new-instance v5, Lgi2/e$h;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Lgi2/e$h;-><init>(Lgi2/e;Lgi2/b$i;Lq83/d;)V

    iput-object v3, v6, Lgi2/e$g;->w:Ljava/lang/Object;

    iput p2, v6, Lgi2/e$g;->z:I

    const-string v4, "upsertSettings"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_4

    sget-object p1, Lgi2/d$c;->a:Lgi2/d$c;

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_5

    new-instance p1, Lgi2/d$g;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    invoke-direct {p1, p2}, Lgi2/d$g;-><init>(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;)V

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final i(Lgi2/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/b;",
            "Lq83/d<",
            "-",
            "Lgi2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lgi2/b$b;

    if-eqz v0, :cond_0

    invoke-direct {p0, p2}, Lgi2/e;->h(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lgi2/b$i;

    if-eqz v0, :cond_1

    check-cast p1, Lgi2/b$i;

    invoke-direct {p0, p1, p2}, Lgi2/e;->j(Lgi2/b$i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lgi2/b$a;

    if-eqz v0, :cond_2

    check-cast p1, Lgi2/b$a;

    invoke-virtual {p1}, Lgi2/b$a;->a()Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lgi2/e;->f(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lgi2/b$c;->a:Lgi2/b$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p2}, Lgi2/e;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p2, p1, Lgi2/b$f;

    if-nez p2, :cond_5

    instance-of p2, p1, Lgi2/b$e;

    if-nez p2, :cond_5

    instance-of p2, p1, Lgi2/b$g;

    if-nez p2, :cond_5

    instance-of p2, p1, Lgi2/b$h;

    if-nez p2, :cond_5

    instance-of p1, p1, Lgi2/b$d;

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    sget-object p1, Lgi2/d$c;->a:Lgi2/d$c;

    return-object p1
.end method
