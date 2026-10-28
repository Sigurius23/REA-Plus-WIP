.class public final Lmc2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lmc2/a;",
        "Lmc2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lmc2/c;",
        "Lod1/g;",
        "Lmc2/a;",
        "Lmc2/b;",
        "Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;",
        "api",
        "Lnm0/e;",
        "cachedApiSource",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;Lnm0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "h",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "i",
        "()Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;",
        "b",
        "Lnm0/e;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "d",
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
.field private final a:Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;

.field private final b:Lnm0/e;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;Lnm0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedApiSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc2/c;->a:Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;

    iput-object p2, p0, Lmc2/c;->b:Lnm0/e;

    iput-object p3, p0, Lmc2/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p4, p0, Lmc2/c;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Lmc2/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lmc2/c;->h(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lmc2/c;)Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;
    .locals 0

    iget-object p0, p0, Lmc2/c;->a:Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuApi;

    return-object p0
.end method

.method public static final synthetic e(Lmc2/c;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lmc2/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic f(Lmc2/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lmc2/c;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic g(Lmc2/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lmc2/c;->i()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lmc2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lmc2/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lmc2/c$a;

    iget v1, v0, Lmc2/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmc2/c$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lmc2/c$a;

    invoke-direct {v0, p0, p1}, Lmc2/c$a;-><init>(Lmc2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lmc2/c$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lmc2/c$a;->y:I

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

    iget-object v2, p0, Lmc2/c;->d:Ltr2/n;

    new-instance v5, Lmc2/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lmc2/c$b;-><init>(Lmc2/c;Lq83/d;)V

    iput p1, v6, Lmc2/c$a;->y:I

    const-string v4, "Error fetching ReferAFriend menu"

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

    sget-object p1, Lmc2/b$a;->a:Lmc2/b$a;

    return-object p1

    :cond_4
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    new-instance v0, Lmc2/b$c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/referafriendmenu/model/ReferAFriendMenuModel;

    invoke-direct {v0, p1}, Lmc2/b$c;-><init>(Lcom/whoop/settings/referafriendmenu/model/ReferAFriendMenuModel;)V

    return-object v0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final i()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuGetRequest;

    invoke-direct {v0}, Lcom/whoop/settings/referafriendmenu/api/ReferAFriendMenuGetRequest;-><init>()V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lmc2/c;->b:Lnm0/e;

    new-instance v3, Lmc2/c$c;

    invoke-direct {v3, v2, v1}, Lmc2/c$c;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lmc2/c$d;

    invoke-direct {v1, v0, p0}, Lmc2/c$d;-><init>(Lec3/l;Lmc2/c;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lmc2/c$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lmc2/c$e;-><init>(Lq83/d;Lmc2/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
