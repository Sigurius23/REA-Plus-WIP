.class public final Lyk0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lyk0/a;",
        "",
        "Lcom/whoop/bot/api/WhoopCoachSettingsApi;",
        "api",
        "Lxk0/a;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/bot/api/WhoopCoachSettingsApi;Lxk0/a;Ltr2/n;)V",
        "",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/bot/api/WhoopCoachSettingsApi;",
        "Lxk0/a;",
        "c",
        "Ltr2/n;",
        "bot_release"
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
.field private final a:Lcom/whoop/bot/api/WhoopCoachSettingsApi;

.field private final b:Lxk0/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/api/WhoopCoachSettingsApi;Lxk0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyk0/a;->a:Lcom/whoop/bot/api/WhoopCoachSettingsApi;

    iput-object p2, p0, Lyk0/a;->b:Lxk0/a;

    iput-object p3, p0, Lyk0/a;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lyk0/a;)Lcom/whoop/bot/api/WhoopCoachSettingsApi;
    .locals 0

    iget-object p0, p0, Lyk0/a;->a:Lcom/whoop/bot/api/WhoopCoachSettingsApi;

    return-object p0
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lyk0/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lyk0/a$a;

    iget v1, v0, Lyk0/a$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyk0/a$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lyk0/a$a;

    invoke-direct {v0, p0, p1}, Lyk0/a$a;-><init>(Lyk0/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lyk0/a$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lyk0/a$a;->y:I

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

    iget-object v2, p0, Lyk0/a;->c:Ltr2/n;

    new-instance v5, Lyk0/a$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lyk0/a$b;-><init>(Lyk0/a;Lq83/d;)V

    iput p1, v6, Lyk0/a$a;->y:I

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

    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lyk0/a;->b:Lxk0/a;

    check-cast p1, Lu02/a$b;

    const-string v1, "get_coach_settings"

    invoke-virtual {v0, p1, v1}, Lxk0/a;->L(Lu02/a$b;Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_3

    :cond_4
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/bot/models/SettingsLandingCoachResponse;

    invoke-virtual {p1}, Lcom/whoop/bot/models/SettingsLandingCoachResponse;->getFeatureEnabled()Z

    move-result p1

    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
